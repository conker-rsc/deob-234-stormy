import java.awt.image.*;

final class u
{
    static int[] a;
    static ImageConsumer d;
    static String[] b;
    static int g;
    
    static final int a(final int arg0, final tb arg1, final String arg2) {
        if (arg0 <= 10) {
            u.a = null;
        }
        final int w = arg1.w;
        final byte[] a = h.a(arg2, (byte)30);
        arg1.b(a.length, (byte)(-88));
        arg1.w += fb.a.a(a.length, arg1.F, arg1.w, a, 0, 119);
        return arg1.w - w;
    }
    
    static final i a(final boolean arg0, final int arg1) {
        final i[] a = gb.a(69);
        for (int n = 0; a.length > n; ++n) {
            final i i = a[n];
            if (i.a == arg1) {
                return i;
            }
        }
        if (arg0) {
            u.g = -2;
        }
        return null;
    }
    
    static final void a(final int arg0, final long arg1) {
        try {
            if (arg0 != 0) {
                return;
            }
            Thread.sleep(arg1);
        }
        catch (final InterruptedException ex) {}
    }
    
    static {
        u.g = 0;
    }
}
