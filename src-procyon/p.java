final class p
{
    static boolean d;
    static String[] e;
    static String[] c;
    static String[] a;
    
    static final synchronized long a(final int arg0) {
        if (arg0 != 0) {
            return -57L;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (~client.ze < ~currentTimeMillis) {
            wb.w += client.ze + -currentTimeMillis;
        }
        client.ze = currentTimeMillis;
        return wb.w + currentTimeMillis;
    }
    
    static final void a(int arg0, final int arg1, final int arg2, int arg3, final int arg4, final int[] arg5, int arg6, int arg7, int arg8, int arg9, final int[] arg10, int arg11, int arg12, final int arg13, final int arg14) {
        if (arg14 <= 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        if (arg12 != 0) {
            n2 = arg3 / arg12 << 6;
            n = arg8 / arg12 << 6;
        }
        arg0 <<= 2;
        if (n >= 0) {
            if (n > 4032) {
                n = 4032;
            }
        }
        else {
            n = 0;
        }
        if (arg1 != 1121159302) {
            a(-69, 127, -20, -29, -78, null, 16, 2, -77, -5, null, 113, -57, 68, -87);
        }
        for (int i = arg14; i > 0; i -= 16) {
            arg12 += arg13;
            arg8 += arg4;
            arg3 += arg2;
            arg9 = n;
            arg7 = n2;
            if (arg12 != 0) {
                n = arg8 / arg12 << 6;
                n2 = arg3 / arg12 << 6;
            }
            if (n < 0) {
                n = 0;
            }
            else if (n > 4032) {
                n = 4032;
            }
            final int n3 = n2 + -arg7 >> 4;
            final int n4 = -arg9 + n >> 4;
            int n5 = arg6 >> 20;
            arg9 += (0xC0000 & arg6);
            arg6 += arg0;
            if (i >= 16) {
                arg10[arg11++] = arg5[ib.a(arg7, 4032) - -(arg9 >> 6)] >>> n5;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(arg7, 4032)] >>> n5;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(4032, arg7)] >>> n5;
                arg9 += n4;
                arg7 += n3;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(4032, arg7)] >>> n5;
                arg9 += n4;
                arg7 += n3;
                final int n6 = arg6 >> 20;
                arg9 = (arg6 & 0xC0000) + (0xFFF & arg9);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(4032, arg7) + (arg9 >> 6)] >>> n6;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[ib.a(arg7, 4032) - -(arg9 >> 6)] >>> n6;
                arg9 += n4;
                arg7 += n3;
                arg10[arg11++] = arg5[ib.a(arg7, 4032) + (arg9 >> 6)] >>> n6;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(4032, arg7)] >>> n6;
                arg9 += n4;
                arg7 += n3;
                final int n7 = arg6 >> 20;
                arg9 = (0xC0000 & arg6) + (0xFFF & arg9);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(arg7, 4032) - -(arg9 >> 6)] >>> n7;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(arg7, 4032)] >>> n7;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[ib.a(arg7, 4032) - -(arg9 >> 6)] >>> n7;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[ib.a(4032, arg7) + (arg9 >> 6)] >>> n7;
                arg7 += n3;
                arg9 += n4;
                final int n8 = arg6 >> 20;
                arg9 = (0xFFF & arg9) - -(arg6 & 0xC0000);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(arg7, 4032) + (arg9 >> 6)] >>> n8;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(arg7, 4032)] >>> n8;
                arg7 += n3;
                arg9 += n4;
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(arg7, 4032)] >>> n8;
                arg9 += n4;
                arg7 += n3;
                arg10[arg11++] = arg5[ib.a(4032, arg7) - -(arg9 >> 6)] >>> n8;
            }
            else {
                for (int j = 0; j < i; ++j) {
                    arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(4032, arg7)] >>> n5;
                    arg7 += n3;
                    arg9 += n4;
                    if ((0x3 & j) == 0x3) {
                        n5 = arg6 >> 20;
                        arg9 = (arg6 & 0xC0000) + (0xFFF & arg9);
                        arg6 += arg0;
                    }
                }
            }
        }
    }
    
    static {
        p.d = true;
    }
}
