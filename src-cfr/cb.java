/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.URL;

final class cb {
    static String[] c = new String[200];
    static String[] e;

    static final void a(URL arg0, e arg1, int arg2) throws IOException {
        d.h = arg1;
        ib.c = arg0;
        URL uRL = new URL(ib.c, "contentcrcs" + Long.toHexString(p.a(0)));
        o.l = "Checking for new content";
        byte[] byArray = da.a(uRL, true, true);
        tb tb2 = new tb(byArray);
        for (int i2 = 0; i2 < 12; ++i2) {
            tb.l[i2] = tb2.b(-129);
        }
        tb2.b(-129);
        if (!tb2.e(-422797528)) {
            throw new IOException("Invalid CRC in CRC check file");
        }
        try {
            if (pa.k.f != null) {
                s.a = new nb(pa.k.f, 5200, 0);
                n.h = new nb(pa.k.v, 6000, 0);
                m.e = new ob(0, s.a, n.h, 1000000);
                pa.k.f = null;
                pa.k.v = null;
            }
        }
        catch (IOException iOException) {
            s.a = null;
            n.h = null;
        }
    }

    static final void a(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg0 <= 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        if (arg1 != 0) {
            n2 = arg11 / arg1 << 6;
            n3 = arg15 / arg1 << 6;
        }
        arg7 <<= 2;
        if (n2 >= 0) {
            if (n2 > 4032) {
                n2 = 4032;
            }
        } else {
            n2 = 0;
        }
        if (arg3 != 25) {
            return;
        }
        for (int i2 = arg0; i2 > 0; i2 -= 16) {
            arg4 = n3;
            arg12 = n2;
            arg11 += arg5;
            arg15 += arg13;
            if ((arg1 += arg6) != 0) {
                n3 = arg15 / arg1 << 6;
                n2 = arg11 / arg1 << 6;
            }
            if (n2 < 0) {
                n2 = 0;
            } else if (n2 > 4032) {
                n2 = 4032;
            }
            int n4 = n3 + -arg4 >> 4;
            int n5 = -arg12 + n2 >> 4;
            arg12 += 0xC0000 & arg14;
            int n6 = arg14 >> 20;
            arg14 += arg7;
            if (i2 >= 16) {
                arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg12 += n5) >> 6) + ((arg4 += n4) & 0xFC0)] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg12 += n5) >> 6) + (0xFC0 & (arg4 += n4))] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[(0xFC0 & (arg4 += n4)) + ((arg12 += n5) >> 6)] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n5;
                n6 = arg14 >> 20;
                arg12 = (0xC0000 & arg14) + (0xFFF & arg12);
                arg14 += arg7;
                arg2 = arg8[(arg12 >> 6) + (0xFC0 & (arg4 += n4))] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) + ((arg12 += n5) >> 6)] >>> n6;
                if (arg2 != 0) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) + ((arg12 += n5) >> 6)] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) + ((arg12 += n5) >> 6)] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n5;
                arg12 = (arg12 & 0xFFF) + (arg14 & 0xC0000);
                n6 = arg14 >> 20;
                arg2 = arg8[(arg12 >> 6) + ((arg4 += n4) & 0xFC0)] >>> n6;
                if (arg2 != 0) {
                    arg9[arg10] = arg2;
                }
                arg14 += arg7;
                ++arg10;
                arg2 = arg8[((arg12 += n5) >> 6) + (0xFC0 & (arg4 += n4))] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg12 += n5) >> 6) + (0xFC0 & (arg4 += n4))] >>> n6;
                if (~arg2 != -1) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) + ((arg12 += n5) >> 6)] >>> n6;
                if (~arg2 != -1) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n5;
                n6 = arg14 >> 20;
                arg12 = (arg14 & 0xC0000) + (arg12 & 0xFFF);
                arg14 += arg7;
                arg2 = arg8[((arg4 += n4) & 0xFC0) - -(arg12 >> 6)] >>> n6;
                if (~arg2 != -1) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) - -((arg12 += n5) >> 6)] >>> n6;
                if (0 != arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[((arg4 += n4) & 0xFC0) + ((arg12 += n5) >> 6)] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg2 = arg8[(0xFC0 & (arg4 += n4)) - -((arg12 += n5) >> 6)] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                continue;
            }
            for (int i3 = 0; i2 > i3; ++i3) {
                arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n6;
                if (-1 != ~arg2) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n5;
                arg4 += n4;
                if ((3 & i3) != 3) continue;
                n6 = arg14 >> 20;
                arg12 = (0xFFF & arg12) + (arg14 & 0xC0000);
                arg14 += arg7;
            }
        }
    }

    static final void a(aa arg0, byte arg1) {
        fb.a = arg0;
    }

    static final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int[] arg13, byte arg14) {
        int n2;
        if (arg11 <= 0) {
            return;
        }
        int n3 = 0;
        int n4 = 0;
        if (arg14 <= 97) {
            cb.a(-65, -47, -42, (byte)-16, 62, 50, -59, -91, null, null, 71, -91, -16, -29, 110, 81);
        }
        int n5 = 0;
        if (arg7 != 0) {
            arg3 = arg1 / arg7 << 7;
            arg6 = arg2 / arg7 << 7;
        }
        arg7 += arg12;
        if (arg6 >= 0) {
            if (arg6 > 16256) {
                arg6 = 16256;
            }
        } else {
            arg6 = 0;
        }
        arg1 += arg5;
        arg2 += arg8;
        if (arg7 != 0) {
            n3 = arg2 / arg7 << 7;
            n4 = arg1 / arg7 << 7;
        }
        if (n3 >= 0) {
            if (n3 > 16256) {
                n3 = 16256;
            }
        } else {
            n3 = 0;
        }
        int n6 = n3 + -arg6 >> 4;
        int n7 = -arg3 + n4 >> 4;
        for (n2 = arg11 >> 4; n2 > 0; --n2) {
            n5 = arg4 >> 23;
            arg6 += arg4 & 0x600000;
            arg4 += arg9;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[(arg6 >> 7) + ib.a(arg3, 16256)] >>> n5);
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[((arg6 += n6) >> 7) + ib.a(16256, arg3 += n7)] >>> n5);
            arg13[arg0++] = (arg10[ib.a(16256, arg3 += n7) - -((arg6 += n6) >> 7)] >>> n5) - -(ib.a(0xFEFEFE, arg13[arg0]) >> 1);
            arg13[arg0++] = (ib.a(0xFEFEFE, arg13[arg0]) >> 1) + (arg10[ib.a(arg3 += n7, 16256) + ((arg6 += n6) >> 7)] >>> n5);
            arg6 += n6;
            n5 = arg4 >> 23;
            arg6 = (arg6 & 0x3FFF) + (arg4 & 0x600000);
            arg4 += arg9;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[ib.a(16256, arg3 += n7) - -(arg6 >> 7)] >>> n5);
            arg13[arg0++] = (arg10[((arg6 += n6) >> 7) + ib.a(arg3 += n7, 16256)] >>> n5) - -ib.a(arg13[arg0] >> 1, 0x7F7F7F);
            arg13[arg0++] = (ib.a(arg13[arg0], 0xFEFEFF) >> 1) + (arg10[ib.a(arg3 += n7, 16256) - -((arg6 += n6) >> 7)] >>> n5);
            arg13[arg0++] = (arg10[((arg6 += n6) >> 7) + ib.a(16256, arg3 += n7)] >>> n5) - -(ib.a(arg13[arg0], 0xFEFEFF) >> 1);
            arg6 += n6;
            arg6 = (0x3FFF & arg6) + (arg4 & 0x600000);
            n5 = arg4 >> 23;
            arg13[arg0++] = (ib.a(0xFEFEFF, arg13[arg0]) >> 1) + (arg10[(arg6 >> 7) + ib.a(arg3 += n7, 16256)] >>> n5);
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[((arg6 += n6) >> 7) + ib.a(16256, arg3 += n7)] >>> n5);
            arg13[arg0++] = (arg10[ib.a(arg3 += n7, 16256) - -((arg6 += n6) >> 7)] >>> n5) + ib.a(0x7F7F7F, arg13[arg0] >> 1);
            arg13[arg0++] = (ib.a(0xFEFEFF, arg13[arg0]) >> 1) + (arg10[ib.a(16256, arg3 += n7) - -((arg6 += n6) >> 7)] >>> n5);
            arg6 += n6;
            arg6 = (arg6 & 0x3FFF) + ((arg4 += arg9) & 0x600000);
            n5 = arg4 >> 23;
            arg13[arg0++] = ib.a(0x7F7F7F, arg13[arg0] >> 1) + (arg10[(arg6 >> 7) + ib.a(arg3 += n7, 16256)] >>> n5);
            arg4 += arg9;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[((arg6 += n6) >> 7) + ib.a(16256, arg3 += n7)] >>> n5);
            arg13[arg0++] = (arg10[ib.a(arg3 += n7, 16256) - -((arg6 += n6) >> 7)] >>> n5) + ib.a(arg13[arg0] >> 1, 0x7F7F7F);
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 0x7F7F7F) + (arg10[((arg6 += n6) >> 7) + ib.a(16256, arg3 += n7)] >>> n5);
            arg1 += arg5;
            arg2 += arg8;
            arg3 = n4;
            arg6 = n3;
            if ((arg7 += arg12) != 0) {
                n4 = arg1 / arg7 << 7;
                n3 = arg2 / arg7 << 7;
            }
            if (n3 >= 0) {
                if (n3 > 16256) {
                    n3 = 16256;
                }
            } else {
                n3 = 0;
            }
            n7 = n4 - arg3 >> 4;
            n6 = -arg6 + n3 >> 4;
        }
        for (n2 = 0; n2 < (arg11 & 0xF); ++n2) {
            if ((n2 & 3) == 0) {
                arg6 = (arg4 & 0x600000) + (arg6 & 0x3FFF);
                n5 = arg4 >> 23;
                arg4 += arg9;
            }
            arg13[arg0++] = (arg10[ib.a(arg3, 16256) - -(arg6 >> 7)] >>> n5) + (ib.a(arg13[arg0], 0xFEFEFE) >> 1);
            arg6 += n6;
            arg3 += n7;
        }
    }

    static final void a(byte arg0, Object[] arg1, int[] arg2) {
        if (arg0 != -70) {
            return;
        }
        ub.a(arg2, (byte)-128, 0, arg2.length - 1, arg1);
    }
}

