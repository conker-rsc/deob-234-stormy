final class t
{
    int e;
    int i;
    int j;
    int l;
    int m;
    String b;
    String p;
    String o;
    int d;
    static int g;
    static String[] h;
    static byte[][][] n;
    
    static final void a(int arg0, int arg1, final int arg2, final int[] arg3, final int[] arg4, int arg5, int arg6, final int arg7) {
        if (arg2 >= 0) {
            return;
        }
        arg0 = arg4[0xFF & arg5 >> 8];
        arg1 <<= 2;
        arg5 += arg1;
        for (int i = arg2 / 16; i < 0; ++i) {
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(arg5 & 0xFFF5) >> 8];
            arg5 += arg1;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(0xFFBD & arg5) >> 8];
            arg3[arg6++] = arg0;
            arg5 += arg1;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[0xFF & arg5 >> 8];
            arg5 += arg1;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(0xFF32 & arg5) >> 8];
            arg5 += arg1;
        }
        final int j = -(arg2 % 16);
        if (arg7 != 418609192) {
            a(76, -63, -59, null, null, 124, -66, -99);
        }
        for (int n = 0; j > n; ++n) {
            arg3[arg6++] = arg0;
            if ((0x3 & n) == 0x3) {
                arg0 = arg4[0xFF & arg5 >> 8];
                arg5 += arg1;
            }
        }
    }
    
    static final byte[] a(final byte[] arg0, final int arg1, final int arg2, String arg3, byte[] arg4) {
        final int n = (0xFF & arg0[1]) + (arg0[0] & 0xFF) * 256;
        arg3 = arg3.toUpperCase();
        int n2 = 0;
        for (int n3 = 0; arg3.length() > n3; ++n3) {
            n2 = 61 * n2 + (arg3.charAt(n3) - ' ');
        }
        final int n4 = 74 % ((arg1 + 74) / 49);
        int arg5 = 2 + 10 * n;
        for (int i = 0; i < n; ++i) {
            final int n5 = (0xFF & arg0[5 + i * 10]) + ((0xFF & arg0[i * 10 + 4]) * 256 + (arg0[3 + 10 * i] & 0xFF) * 65536 + (0xFF & arg0[2 + 10 * i]) * 16777216);
            final int arg6 = (arg0[10 * i + 7] & 0xFF) * 256 + ((arg0[i * 10 + 6] & 0xFF) * 65536 + (0xFF & arg0[i * 10 + 8]));
            final int arg7 = (arg0[10 + 10 * i] & 0xFF) * 256 + 65536 * (0xFF & arg0[i * 10 + 9]) + (arg0[10 * i + 11] & 0xFF);
            if (n5 == n2) {
                if (arg4 == null) {
                    arg4 = new byte[arg2 + arg6];
                }
                if (arg7 != arg6) {
                    ea.a(arg4, arg6, arg0, arg7, arg5);
                }
                else {
                    for (int j = 0; j < arg6; ++j) {
                        arg4[j] = arg0[j + arg5];
                    }
                }
                return arg4;
            }
            arg5 += arg7;
        }
        return null;
    }
    
    static final int a(final int arg0) {
        if (arg0 != 65525) {
            t.h = null;
        }
        final int a = d.a(ka.b, (byte)100, b.v);
        ka.b += 2;
        return a;
    }
    
    final void a(final String arg0, final int arg1, final int arg2, final int arg3, final int arg4, final String arg5, final int arg6, final int arg7, final String arg8, final String arg9, final int arg10, final String arg11) {
        this.p = arg0;
        this.l = arg1;
        this.m = arg3;
        if (arg6 <= 69) {
            return;
        }
        this.d = arg7;
        this.e = arg2;
        this.o = arg8;
        this.i = arg4;
        this.j = arg10;
        this.b = arg11;
    }
    
    t() {
        super();
        this.o = null;
        this.p = null;
    }
}
