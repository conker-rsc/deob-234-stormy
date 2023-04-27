import java.io.*;

final class f
{
    static int[] f;
    static String[] e;
    static String[] c;
    static i b;
    
    static final boolean a(final char arg0, final int arg1) {
        if (Character.isISOControl(arg0)) {
            return false;
        }
        if (!v.a(arg0, 115)) {
            final char[] a = ga.a;
            for (int i = arg1; i < a.length; ++i) {
                if (arg0 == a[i]) {
                    return true;
                }
            }
            final char[] j = ac.I;
            for (int n = 0; j.length > n; ++n) {
                if (j[n] == arg0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    static final void a(final int arg0, final tb arg1) {
        final byte[] array = new byte[24];
        if (b.q != null) {
            try {
                b.q.a(0L, arg0 - 22592);
                b.q.a((byte)(-123), array);
                int n;
                for (n = 0; n < 24 && array[n] == 0; ++n) {}
                if (n >= 24) {
                    throw new IOException();
                }
            }
            catch (final Exception ex) {
                for (int i = 0; i < 24; ++i) {
                    array[i] = -1;
                }
            }
        }
        if (arg0 != 22607) {
            return;
        }
        arg1.a(0, -126, 24, array);
    }
    
    static {
        f.c = new String[] { "Please enter the number of items to deposit", "and press enter" };
        f.b = new i("WIP", 2);
    }
}
