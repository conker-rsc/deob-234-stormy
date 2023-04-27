/*
 * Decompiled with CFR 0.152.
 */
final class t {
    int e;
    int i;
    int j;
    int l;
    int m;
    String b;
    String p = null;
    String o = null;
    int d;
    static int g;
    static String[] h;
    static byte[][][] n;

    static final void a(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7) {
        int n2;
        int n3;
        if (arg2 >= 0) {
            return;
        }
        arg0 = arg4[0xFF & arg5 >> 8];
        arg5 += (arg1 <<= 2);
        for (n3 = n2 = arg2 / 16; n3 < 0; ++n3) {
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(arg5 & 0xFFF5) >> 8];
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(0xFFBD & (arg5 += arg1)) >> 8];
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[0xFF & (arg5 += arg1) >> 8];
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg3[arg6++] = arg0;
            arg0 = arg4[(0xFF32 & (arg5 += arg1)) >> 8];
            arg5 += arg1;
        }
        n2 = -(arg2 % 16);
        if (arg7 != 418609192) {
            t.a(76, -63, -59, null, null, 124, -66, -99);
        }
        for (n3 = 0; n2 > n3; ++n3) {
            arg3[arg6++] = arg0;
            if ((3 & n3) != 3) continue;
            arg0 = arg4[0xFF & arg5 >> 8];
            arg5 += arg1;
        }
    }

    static final byte[] a(byte[] arg0, int arg1, int arg2, String arg3, byte[] arg4) {
        int n2;
        int n3 = (0xFF & arg0[1]) + (arg0[0] & 0xFF) * 256;
        arg3 = arg3.toUpperCase();
        int n4 = 0;
        for (n2 = 0; arg3.length() > n2; ++n2) {
            n4 = 61 * n4 + (arg3.charAt(n2) - 32);
        }
        int n5 = 74 % ((arg1 + 74) / 49);
        n2 = 2 + 10 * n3;
        for (n5 = 0; n5 < n3; ++n5) {
            int n6 = (0xFF & arg0[5 + n5 * 10]) + ((0xFF & arg0[n5 * 10 + 4]) * 256 + (arg0[3 + 10 * n5] & 0xFF) * 65536 + (0xFF & arg0[2 + 10 * n5]) * 0x1000000);
            int n7 = (arg0[10 * n5 + 7] & 0xFF) * 256 + ((arg0[n5 * 10 + 6] & 0xFF) * 65536 + (0xFF & arg0[n5 * 10 + 8]));
            int n8 = (arg0[10 + 10 * n5] & 0xFF) * 256 + 65536 * (0xFF & arg0[n5 * 10 + 9]) + (arg0[10 * n5 + 11] & 0xFF);
            if (n6 == n4) {
                if (arg4 == null) {
                    arg4 = new byte[arg2 + n7];
                }
                if (n8 != n7) {
                    ea.a(arg4, n7, arg0, n8, n2);
                } else {
                    for (int i2 = 0; i2 < n7; ++i2) {
                        arg4[i2] = arg0[i2 + n2];
                    }
                }
                return arg4;
            }
            n2 += n8;
        }
        return null;
    }

    static final int a(int arg0) {
        if (arg0 != 65525) {
            h = null;
        }
        int n2 = d.a(ka.b, (byte)100, b.v);
        ka.b += 2;
        return n2;
    }

    final void a(String arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7, String arg8, String arg9, int arg10, String arg11) {
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
    }
}

