/*
 * Decompiled with CFR 0.152.
 */
final class p {
    static boolean d = true;
    static String[] e;
    static String[] c;
    static String[] a;

    static final synchronized long a(int arg0) {
        if (arg0 != 0) {
            return -57L;
        }
        long l2 = System.currentTimeMillis();
        if ((client.ze ^ 0xFFFFFFFFFFFFFFFFL) < (l2 ^ 0xFFFFFFFFFFFFFFFFL)) {
            wb.w += client.ze + -l2;
        }
        client.ze = l2;
        return wb.w + l2;
    }

    static final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg14 <= 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        if (arg12 != 0) {
            n3 = arg3 / arg12 << 6;
            n2 = arg8 / arg12 << 6;
        }
        arg0 <<= 2;
        if (n2 >= 0) {
            if (n2 > 4032) {
                n2 = 4032;
            }
        } else {
            n2 = 0;
        }
        if (arg1 != 1121159302) {
            p.a(-69, 127, -20, -29, -78, null, 16, 2, -77, -5, null, 113, -57, 68, -87);
        }
        for (int i2 = arg14; i2 > 0; i2 -= 16) {
            arg8 += arg4;
            arg3 += arg2;
            arg9 = n2;
            arg7 = n3;
            if ((arg12 += arg13) != 0) {
                n2 = arg8 / arg12 << 6;
                n3 = arg3 / arg12 << 6;
            }
            if (n2 < 0) {
                n2 = 0;
            } else if (n2 > 4032) {
                n2 = 4032;
            }
            int n4 = n3 + -arg7 >> 4;
            int n5 = -arg9 + n2 >> 4;
            int n6 = arg6 >> 20;
            arg9 += 0xC0000 & arg6;
            arg6 += arg0;
            if (i2 >= 16) {
                arg10[arg11++] = arg5[ib.a(arg7, 4032) - -(arg9 >> 6)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(arg7 += n4, 4032)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(4032, arg7 += n4)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(4032, arg7 += n4)] >>> n6;
                arg9 += n5;
                n6 = arg6 >> 20;
                arg9 = (arg6 & 0xC0000) + (0xFFF & arg9);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(4032, arg7 += n4) + (arg9 >> 6)] >>> n6;
                arg10[arg11++] = arg5[ib.a(arg7 += n4, 4032) - -((arg9 += n5) >> 6)] >>> n6;
                arg10[arg11++] = arg5[ib.a(arg7 += n4, 4032) + ((arg9 += n5) >> 6)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(4032, arg7 += n4)] >>> n6;
                arg9 += n5;
                n6 = arg6 >> 20;
                arg9 = (0xC0000 & arg6) + (0xFFF & arg9);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(arg7 += n4, 4032) - -(arg9 >> 6)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(arg7 += n4, 4032)] >>> n6;
                arg10[arg11++] = arg5[ib.a(arg7 += n4, 4032) - -((arg9 += n5) >> 6)] >>> n6;
                arg10[arg11++] = arg5[ib.a(4032, arg7 += n4) + ((arg9 += n5) >> 6)] >>> n6;
                arg9 += n5;
                n6 = arg6 >> 20;
                arg9 = (0xFFF & arg9) - -(arg6 & 0xC0000);
                arg6 += arg0;
                arg10[arg11++] = arg5[ib.a(arg7 += n4, 4032) + (arg9 >> 6)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(arg7 += n4, 4032)] >>> n6;
                arg10[arg11++] = arg5[((arg9 += n5) >> 6) + ib.a(arg7 += n4, 4032)] >>> n6;
                arg10[arg11++] = arg5[ib.a(4032, arg7 += n4) - -((arg9 += n5) >> 6)] >>> n6;
                continue;
            }
            for (int i3 = 0; i3 < i2; ++i3) {
                arg10[arg11++] = arg5[(arg9 >> 6) + ib.a(4032, arg7)] >>> n6;
                arg7 += n4;
                arg9 += n5;
                if ((3 & i3) != 3) continue;
                n6 = arg6 >> 20;
                arg9 = (arg6 & 0xC0000) + (0xFFF & arg9);
                arg6 += arg0;
            }
        }
    }
}

