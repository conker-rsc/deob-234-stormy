/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.ImageConsumer;

final class u {
    static int[] a;
    static ImageConsumer d;
    static String[] b;
    static int g;

    static final int a(int arg0, tb arg1, String arg2) {
        if (arg0 <= 10) {
            a = null;
        }
        int n2 = arg1.w;
        byte[] byArray = h.a(arg2, (byte)30);
        arg1.b(byArray.length, (byte)-88);
        arg1.w += fb.a.a(byArray.length, arg1.F, arg1.w, byArray, 0, 119);
        return arg1.w - n2;
    }

    static final i a(boolean arg0, int arg1) {
        i[] iArray = gb.a(69);
        for (int i2 = 0; iArray.length > i2; ++i2) {
            i i3 = iArray[i2];
            if (i3.a != arg1) continue;
            return i3;
        }
        if (arg0) {
            g = -2;
        }
        return null;
    }

    static final void a(int arg0, long arg1) {
        try {
            if (arg0 != 0) {
                return;
            }
            Thread.sleep(arg1);
        }
        catch (InterruptedException interruptedException) {}
    }

    static {
        g = 0;
    }
}

