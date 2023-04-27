import java.net.*;
import java.io.*;

final class cb
{
    static String[] c;
    static String[] e;
    
    static final void a(final URL arg0, final e arg1, final int arg2) throws IOException {
        d.h = arg1;
        ib.c = arg0;
        final URL arg3 = new URL(ib.c, "contentcrcs" + Long.toHexString(p.a(0)));
        o.l = "Checking for new content";
        final tb tb = new tb(da.a(arg3, true, true));
        for (int i = 0; i < 12; ++i) {
            tb.l[i] = tb.b(-129);
        }
        tb.b(-129);
        if (!tb.e(-422797528)) {
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
        catch (final IOException ex) {
            s.a = null;
            n.h = null;
        }
    }
    
    static final void a(final int arg0, int arg1, int arg2, final byte arg3, int arg4, final int arg5, final int arg6, int arg7, final int[] arg8, final int[] arg9, int arg10, int arg11, int arg12, final int arg13, int arg14, int arg15) {
        if (arg0 <= 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        if (arg1 != 0) {
            n = arg11 / arg1 << 6;
            n2 = arg15 / arg1 << 6;
        }
        arg7 <<= 2;
        if (n >= 0) {
            if (n > 4032) {
                n = 4032;
            }
        }
        else {
            n = 0;
        }
        if (arg3 != 25) {
            return;
        }
        for (int i = arg0; i > 0; i -= 16) {
            arg4 = n2;
            arg12 = n;
            arg11 += arg5;
            arg1 += arg6;
            arg15 += arg13;
            if (arg1 != 0) {
                n2 = arg15 / arg1 << 6;
                n = arg11 / arg1 << 6;
            }
            if (n < 0) {
                n = 0;
            }
            else if (n > 4032) {
                n = 4032;
            }
            final int n3 = n2 + -arg4 >> 4;
            final int n4 = -arg12 + n >> 4;
            arg12 += (0xC0000 & arg14);
            int n5 = arg14 >> 20;
            arg14 += arg7;
            if (i >= 16) {
                if (0 != (arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n5)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg4 += n3;
                arg12 += n4;
                if (-1 != ~(arg2 = arg8[(arg12 >> 6) + (arg4 & 0xFC0)] >>> n5)) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                ++arg10;
                arg12 += n4;
                if (0 != (arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n5)) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                ++arg10;
                arg12 += n4;
                if (0 != (arg2 = arg8[(0xFC0 & arg4) + (arg12 >> 6)] >>> n5)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                final int n6 = arg14 >> 20;
                arg12 = (0xC0000 & arg14) + (0xFFF & arg12);
                arg14 += arg7;
                if (-1 != ~(arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n6)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                if ((arg2 = arg8[(arg4 & 0xFC0) + (arg12 >> 6)] >>> n6) != 0) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                if (-1 != ~(arg2 = arg8[(arg4 & 0xFC0) + (arg12 >> 6)] >>> n6)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                if (0 != (arg2 = arg8[(arg4 & 0xFC0) + (arg12 >> 6)] >>> n6)) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                ++arg10;
                arg12 += n4;
                arg12 = (arg12 & 0xFFF) + (arg14 & 0xC0000);
                final int n7 = arg14 >> 20;
                if ((arg2 = arg8[(arg12 >> 6) + (arg4 & 0xFC0)] >>> n7) != 0) {
                    arg9[arg10] = arg2;
                }
                arg14 += arg7;
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                if (0 != (arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n7)) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                arg12 += n4;
                ++arg10;
                if (~(arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n7) != -1) {
                    arg9[arg10] = arg2;
                }
                arg12 += n4;
                arg4 += n3;
                ++arg10;
                if (~(arg2 = arg8[(arg4 & 0xFC0) + (arg12 >> 6)] >>> n7) != -1) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                final int n8 = arg14 >> 20;
                arg12 = (arg14 & 0xC0000) + (arg12 & 0xFFF);
                arg14 += arg7;
                if (~(arg2 = arg8[(arg4 & 0xFC0) - -(arg12 >> 6)] >>> n8) != -1) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                arg12 += n4;
                ++arg10;
                if (0 != (arg2 = arg8[(arg4 & 0xFC0) - -(arg12 >> 6)] >>> n8)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
                arg12 += n4;
                arg4 += n3;
                if (-1 != ~(arg2 = arg8[(arg4 & 0xFC0) + (arg12 >> 6)] >>> n8)) {
                    arg9[arg10] = arg2;
                }
                arg4 += n3;
                ++arg10;
                arg12 += n4;
                if (-1 != ~(arg2 = arg8[(0xFC0 & arg4) - -(arg12 >> 6)] >>> n8)) {
                    arg9[arg10] = arg2;
                }
                ++arg10;
            }
            else {
                for (int n9 = 0; i > n9; ++n9) {
                    if (-1 != ~(arg2 = arg8[(arg12 >> 6) + (0xFC0 & arg4)] >>> n5)) {
                        arg9[arg10] = arg2;
                    }
                    ++arg10;
                    arg12 += n4;
                    arg4 += n3;
                    if ((0x3 & n9) == 0x3) {
                        n5 = arg14 >> 20;
                        arg12 = (0xFFF & arg12) + (arg14 & 0xC0000);
                        arg14 += arg7;
                    }
                }
            }
        }
    }
    
    static final void a(final aa arg0, final byte arg1) {
        fb.a = arg0;
    }
    
    static final void a(int arg0, int arg1, int arg2, int arg3, int arg4, final int arg5, int arg6, int arg7, final int arg8, final int arg9, final int[] arg10, final int arg11, final int arg12, final int[] arg13, final byte arg14) {
        if (arg11 <= 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        if (arg14 <= 97) {
            a(-65, -47, -42, (byte)(-16), 62, 50, -59, -91, null, null, 71, -91, -16, -29, 110, 81);
        }
        int n3 = 0;
        if (arg7 != 0) {
            arg3 = arg1 / arg7 << 7;
            arg6 = arg2 / arg7 << 7;
        }
        arg7 += arg12;
        if (arg6 >= 0) {
            if (arg6 > 16256) {
                arg6 = 16256;
            }
        }
        else {
            arg6 = 0;
        }
        arg1 += arg5;
        arg2 += arg8;
        if (arg7 != 0) {
            n = arg2 / arg7 << 7;
            n2 = arg1 / arg7 << 7;
        }
        if (n >= 0) {
            if (n > 16256) {
                n = 16256;
            }
        }
        else {
            n = 0;
        }
        int n4 = n + -arg6 >> 4;
        int n5 = -arg3 + n2 >> 4;
        for (int i = arg11 >> 4; i > 0; --i) {
            final int n6 = arg4 >> 23;
            arg6 += (arg4 & 0x600000);
            arg4 += arg9;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[(arg6 >> 7) + ib.a(arg3, 16256)] >>> n6);
            arg3 += n5;
            arg6 += n4;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[(arg6 >> 7) + ib.a(16256, arg3)] >>> n6);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = (arg10[ib.a(16256, arg3) - -(arg6 >> 7)] >>> n6) - -(ib.a(16711422, arg13[arg0]) >> 1);
            arg3 += n5;
            arg6 += n4;
            arg13[arg0++] = (ib.a(16711422, arg13[arg0]) >> 1) + (arg10[ib.a(arg3, 16256) + (arg6 >> 7)] >>> n6);
            arg3 += n5;
            arg6 += n4;
            final int n7 = arg4 >> 23;
            arg6 = (arg6 & 0x3FFF) + (arg4 & 0x600000);
            arg4 += arg9;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[ib.a(16256, arg3) - -(arg6 >> 7)] >>> n7);
            arg3 += n5;
            arg6 += n4;
            arg13[arg0++] = (arg10[(arg6 >> 7) + ib.a(arg3, 16256)] >>> n7) - -ib.a(arg13[arg0] >> 1, 8355711);
            arg3 += n5;
            arg6 += n4;
            arg13[arg0++] = (ib.a(arg13[arg0], 16711423) >> 1) + (arg10[ib.a(arg3, 16256) - -(arg6 >> 7)] >>> n7);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = (arg10[(arg6 >> 7) + ib.a(16256, arg3)] >>> n7) - -(ib.a(arg13[arg0], 16711423) >> 1);
            arg6 += n4;
            arg3 += n5;
            arg6 = (0x3FFF & arg6) + (arg4 & 0x600000);
            final int n8 = arg4 >> 23;
            arg13[arg0++] = (ib.a(16711423, arg13[arg0]) >> 1) + (arg10[(arg6 >> 7) + ib.a(arg3, 16256)] >>> n8);
            arg4 += arg9;
            arg3 += n5;
            arg6 += n4;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[(arg6 >> 7) + ib.a(16256, arg3)] >>> n8);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = (arg10[ib.a(arg3, 16256) - -(arg6 >> 7)] >>> n8) + ib.a(8355711, arg13[arg0] >> 1);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = (ib.a(16711423, arg13[arg0]) >> 1) + (arg10[ib.a(16256, arg3) - -(arg6 >> 7)] >>> n8);
            arg3 += n5;
            arg6 += n4;
            arg6 = (arg6 & 0x3FFF) + (arg4 & 0x600000);
            n3 = arg4 >> 23;
            arg13[arg0++] = ib.a(8355711, arg13[arg0] >> 1) + (arg10[(arg6 >> 7) + ib.a(arg3, 16256)] >>> n3);
            arg4 += arg9;
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[(arg6 >> 7) + ib.a(16256, arg3)] >>> n3);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = (arg10[ib.a(arg3, 16256) - -(arg6 >> 7)] >>> n3) + ib.a(arg13[arg0] >> 1, 8355711);
            arg6 += n4;
            arg3 += n5;
            arg13[arg0++] = ib.a(arg13[arg0] >> 1, 8355711) + (arg10[(arg6 >> 7) + ib.a(16256, arg3)] >>> n3);
            arg7 += arg12;
            arg1 += arg5;
            arg2 += arg8;
            arg3 = n2;
            arg6 = n;
            if (arg7 != 0) {
                n2 = arg1 / arg7 << 7;
                n = arg2 / arg7 << 7;
            }
            if (n >= 0) {
                if (n > 16256) {
                    n = 16256;
                }
            }
            else {
                n = 0;
            }
            n5 = n2 - arg3 >> 4;
            n4 = -arg6 + n >> 4;
        }
        for (int j = 0; j < (arg11 & 0xF); ++j) {
            if ((j & 0x3) == 0x0) {
                arg6 = (arg4 & 0x600000) + (arg6 & 0x3FFF);
                n3 = arg4 >> 23;
                arg4 += arg9;
            }
            arg13[arg0++] = (arg10[ib.a(arg3, 16256) - -(arg6 >> 7)] >>> n3) + (ib.a(arg13[arg0], 16711422) >> 1);
            arg6 += n4;
            arg3 += n5;
        }
    }
    
    static final void a(final byte arg0, final Object[] arg1, final int[] arg2) {
        if (arg0 != -70) {
            return;
        }
        ub.a(arg2, (byte)(-128), 0, arg2.length - 1, arg1);
    }
    
    static {
        cb.c = new String[200];
    }
}
