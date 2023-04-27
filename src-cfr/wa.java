/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ms.awt.WComponentPeer
 *  com.ms.com.IUnknown
 *  com.ms.directX.DDSurfaceDesc
 *  com.ms.directX.DirectDraw
 *  com.ms.directX.IEnumModesCallback
 *  com.ms.win32.User32
 */
import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Component;
import java.awt.Frame;

final class wa
implements IEnumModesCallback {
    private static int[] b;
    private DirectDraw c = new DirectDraw();
    private static int a;

    public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
        if (b == null) {
            a += 4;
        } else {
            wa.b[wa.a++] = arg0.width;
            wa.b[wa.a++] = arg0.height;
            wa.b[wa.a++] = arg0.rgbBitCount;
            wa.b[wa.a++] = arg0.refreshRate;
        }
    }

    final int[] a(byte arg0) {
        this.c.enumDisplayModes(0, null, null, (IEnumModesCallback)this);
        b = new int[a];
        a = 0;
        this.c.enumDisplayModes(0, null, null, (IEnumModesCallback)this);
        int[] nArray = b;
        b = null;
        a = 0;
        return nArray;
    }

    final void a(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.a(null, 68, -102, 21, 73, (byte)97);
        }
        this.c.restoreDisplayMode();
        this.c.setCooperativeLevel((Component)arg0, 8);
    }

    final void a(Frame arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 77) {
            this.c = null;
        }
        arg0.setVisible(true);
        WComponentPeer wComponentPeer = (WComponentPeer)arg0.getPeer();
        int n2 = wComponentPeer.getHwnd();
        User32.SetWindowLong((int)n2, (int)-16, (int)Integer.MIN_VALUE);
        User32.SetWindowLong((int)n2, (int)-20, (int)8);
        this.c.setCooperativeLevel((Component)arg0, 17);
        this.c.setDisplayMode(arg4, arg3, arg1, arg2, 0);
        arg0.setBounds(0, 0, arg4, arg3);
        arg0.toFront();
        arg0.requestFocus();
    }

    public wa() {
        this.c.initialize(null);
    }
}

