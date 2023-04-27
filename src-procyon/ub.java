final class ub
{
    static String[] c;
    static String[] b;
    static int e;
    static int[] g;
    static String[] a;
    
    static final void a(final int[] arg0, final byte arg1, final int arg2, final int arg3, final Object[] arg4) {
        if (arg1 > -82) {
            return;
        }
        if (arg2 < arg3) {
            final int n = (arg3 + arg2) / 2;
            int n2 = arg2;
            final int n3 = arg0[n];
            arg0[n] = arg0[arg3];
            arg0[arg3] = n3;
            final Object o = arg4[n];
            arg4[n] = arg4[arg3];
            arg4[arg3] = o;
            final boolean b = n3 != Integer.MAX_VALUE;
            for (int i = arg2; i < arg3; ++i) {
                if ((i & (b ? 1 : 0)) + n3 > arg0[i]) {
                    final int n4 = arg0[i];
                    arg0[i] = arg0[n2];
                    arg0[n2] = n4;
                    final Object o2 = arg4[i];
                    arg4[i] = arg4[n2];
                    arg4[n2++] = o2;
                }
            }
            arg0[arg3] = arg0[n2];
            arg0[n2] = n3;
            arg4[arg3] = arg4[n2];
            arg4[n2] = o;
            a(arg0, (byte)(-124), arg2, n2 - 1, arg4);
            a(arg0, (byte)(-123), 1 + n2, arg3, arg4);
        }
        ++ub.e;
    }
    
    static final v a(final int arg0, final byte arg1) {
        if (arg1 != 24) {
            ub.c = null;
        }
        final v[] a = i.a(arg1 - 735);
        for (int n = 0; a.length > n; ++n) {
            final v v = a[n];
            if (arg0 == v.i) {
                return v;
            }
        }
        return null;
    }
    
    static final int a(final byte arg0) {
        int a = m.a(true, ka.b, b.v);
        if (a > 99999999) {
            a = -a + 99999999;
        }
        if (arg0 != -105) {
            ub.g = null;
        }
        ka.b += 4;
        return a;
    }
    
    static {
        ub.c = new String[5000];
        ub.a = new String[100];
    }
}
