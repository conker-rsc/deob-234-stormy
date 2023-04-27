import com.ms.directX.*;
import java.awt.*;
import com.ms.awt.*;
import com.ms.win32.*;
import com.ms.com.*;

final class wa implements IEnumModesCallback
{
    private static int[] b;
    private DirectDraw c;
    private static int a;
    
    public final void callbackEnumModes(final DDSurfaceDesc arg0, final IUnknown arg1) {
        if (wa.b == null) {
            wa.a += 4;
        }
        else {
            wa.b[wa.a++] = arg0.width;
            wa.b[wa.a++] = arg0.height;
            wa.b[wa.a++] = arg0.rgbBitCount;
            wa.b[wa.a++] = arg0.refreshRate;
        }
    }
    
    final int[] a(final byte arg0) {
        this.c.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, (IEnumModesCallback)this);
        wa.b = new int[wa.a];
        wa.a = 0;
        this.c.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, (IEnumModesCallback)this);
        final int[] b = wa.b;
        wa.b = null;
        wa.a = 0;
        return b;
    }
    
    final void a(final Frame arg0, final int arg1) {
        if (arg1 != 0) {
            this.a(null, 68, -102, 21, 73, (byte)97);
        }
        this.c.restoreDisplayMode();
        this.c.setCooperativeLevel((Component)arg0, 8);
    }
    
    final void a(final Frame arg0, final int arg1, final int arg2, final int arg3, final int arg4, final byte arg5) {
        if (arg5 != 77) {
            this.c = null;
        }
        arg0.setVisible(true);
        final int hwnd = ((WComponentPeer)arg0.getPeer()).getHwnd();
        User32.SetWindowLong(hwnd, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(hwnd, -20, 8);
        this.c.setCooperativeLevel((Component)arg0, 17);
        this.c.setDisplayMode(arg4, arg3, arg1, arg2, 0);
        arg0.setBounds(0, 0, arg4, arg3);
        arg0.toFront();
        arg0.requestFocus();
    }
    
    public wa() {
        super();
        (this.c = new DirectDraw()).initialize((_Guid)null);
    }
}
