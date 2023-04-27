final class ea
{
    private static ac a;
    
    private static final void b(final ac arg0) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        arg0.f = 1;
        if (ua.Mb == null) {
            ua.Mb = new int[arg0.f * 100000];
        }
        int i = 1;
        while (i != 0) {
            if (c(arg0) == 23) {
                return;
            }
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            c(arg0);
            if (d(arg0) != 0) {}
            arg0.E = 0;
            arg0.E = (arg0.E << 8 | (c(arg0) & 0xFF));
            arg0.E = (arg0.E << 8 | (c(arg0) & 0xFF));
            arg0.E = (arg0.E << 8 | (c(arg0) & 0xFF));
            for (int j = 0; j < 16; ++j) {
                if (d(arg0) == 1) {
                    arg0.v[j] = true;
                }
                else {
                    arg0.v[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                arg0.n[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (arg0.v[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (d(arg0) == 1) {
                            arg0.n[l * 16 + n2] = true;
                        }
                    }
                }
            }
            a(arg0);
            final int arg = arg0.K + 2;
            final int a = a(3, arg0);
            final int a2 = a(15, arg0);
            for (int n3 = 0; n3 < a2; ++n3) {
                int n4 = 0;
                while (d(arg0) != 0) {
                    ++n4;
                }
                arg0.s[n3] = (byte)n4;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < a; ++b) {
                array4[b] = b;
            }
            for (int n5 = 0; n5 < a2; ++n5) {
                byte b2 = arg0.s[n5];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                arg0.j[n5] = b3;
            }
            for (byte b4 = 0; b4 < a; ++b4) {
                int a3 = a(5, arg0);
                for (int n6 = 0; n6 < arg; ++n6) {
                    while (d(arg0) != 0) {
                        if (d(arg0) == 0) {
                            ++a3;
                        }
                        else {
                            --a3;
                        }
                    }
                    arg0.B[b4][n6] = (byte)a3;
                }
            }
            for (byte b5 = 0; b5 < a; ++b5) {
                byte arg2 = 32;
                byte arg3 = 0;
                for (int n7 = 0; n7 < arg; ++n7) {
                    if (arg0.B[b5][n7] > arg3) {
                        arg3 = arg0.B[b5][n7];
                    }
                    if (arg0.B[b5][n7] < arg2) {
                        arg2 = arg0.B[b5][n7];
                    }
                }
                a(arg0.u[b5], arg0.t[b5], arg0.J[b5], arg0.B[b5], arg2, arg3, arg);
                arg0.D[b5] = arg2;
            }
            final int n8 = arg0.K + 1;
            int n9 = -1;
            int n10 = 0;
            for (int n11 = 0; n11 <= 255; ++n11) {
                arg0.m[n11] = 0;
            }
            int n12 = 4095;
            for (int n13 = 15; n13 >= 0; --n13) {
                for (int n14 = 15; n14 >= 0; --n14) {
                    arg0.A[n12] = (byte)(n13 * 16 + n14);
                    --n12;
                }
                arg0.r[n13] = n12 + 1;
            }
            int b6 = 0;
            if (n10 == 0) {
                ++n9;
                n10 = 50;
                final byte b7 = arg0.j[n9];
                n = arg0.D[b7];
                array = arg0.u[b7];
                array3 = arg0.J[b7];
                array2 = arg0.t[b7];
            }
            --n10;
            int arg4;
            int a4;
            for (arg4 = n, a4 = a(arg4, arg0); a4 > array[arg4]; ++arg4, a4 = (a4 << 1 | d(arg0))) {}
            int arg6;
            int a6;
            for (int n15 = array3[a4 - array2[arg4]]; n15 != n8; n15 = array3[a6 - array2[arg6]]) {
                if (n15 == 0 || n15 == 1) {
                    int n16 = -1;
                    int n17 = 1;
                    do {
                        if (n15 == 0) {
                            n16 += 1 * n17;
                        }
                        else if (n15 == 1) {
                            n16 += 2 * n17;
                        }
                        n17 *= 2;
                        if (n10 == 0) {
                            ++n9;
                            n10 = 50;
                            final byte b8 = arg0.j[n9];
                            n = arg0.D[b8];
                            array = arg0.u[b8];
                            array3 = arg0.J[b8];
                            array2 = arg0.t[b8];
                        }
                        --n10;
                        int arg5;
                        int a5;
                        for (arg5 = n, a5 = a(arg5, arg0); a5 > array[arg5]; ++arg5, a5 = (a5 << 1 | d(arg0))) {}
                        n15 = array3[a5 - array2[arg5]];
                    } while (n15 == 0 || n15 == 1);
                    ++n16;
                    final byte b9 = arg0.d[arg0.A[arg0.r[0]] & 0xFF];
                    final int[] m = arg0.m;
                    final int n18 = b9 & 0xFF;
                    m[n18] += n16;
                    while (n16 > 0) {
                        ua.Mb[b6] = (b9 & 0xFF);
                        ++b6;
                        --n16;
                    }
                }
                else {
                    int n19 = n15 - 1;
                    byte b10;
                    if (n19 < 16) {
                        final int n20 = arg0.r[0];
                        b10 = arg0.A[n20 + n19];
                        while (n19 > 3) {
                            final int n21 = n20 + n19;
                            arg0.A[n21] = arg0.A[n21 - 1];
                            arg0.A[n21 - 1] = arg0.A[n21 - 2];
                            arg0.A[n21 - 2] = arg0.A[n21 - 3];
                            arg0.A[n21 - 3] = arg0.A[n21 - 4];
                            n19 -= 4;
                        }
                        while (n19 > 0) {
                            arg0.A[n20 + n19] = arg0.A[n20 + n19 - 1];
                            --n19;
                        }
                        arg0.A[n20] = b10;
                    }
                    else {
                        int n22 = n19 / 16;
                        int n23 = arg0.r[n22] + n19 % 16;
                        b10 = arg0.A[n23];
                        while (n23 > arg0.r[n22]) {
                            arg0.A[n23] = arg0.A[n23 - 1];
                            --n23;
                        }
                        final int[] r = arg0.r;
                        final int n24 = n22;
                        ++r[n24];
                        while (n22 > 0) {
                            final int[] r2 = arg0.r;
                            final int n25 = n22;
                            --r2[n25];
                            arg0.A[arg0.r[n22]] = arg0.A[arg0.r[n22 - 1] + 16 - 1];
                            --n22;
                        }
                        final int[] r3 = arg0.r;
                        final int n26 = 0;
                        --r3[n26];
                        arg0.A[arg0.r[0]] = b10;
                        if (arg0.r[0] == 0) {
                            int n27 = 4095;
                            for (int n28 = 15; n28 >= 0; --n28) {
                                for (int n29 = 15; n29 >= 0; --n29) {
                                    arg0.A[n27] = arg0.A[arg0.r[n28] + n29];
                                    --n27;
                                }
                                arg0.r[n28] = n27 + 1;
                            }
                        }
                    }
                    final int[] m2 = arg0.m;
                    final int n30 = arg0.d[b10 & 0xFF] & 0xFF;
                    ++m2[n30];
                    ua.Mb[b6] = (arg0.d[b10 & 0xFF] & 0xFF);
                    ++b6;
                    if (n10 == 0) {
                        ++n9;
                        n10 = 50;
                        final byte b11 = arg0.j[n9];
                        n = arg0.D[b11];
                        array = arg0.u[b11];
                        array3 = arg0.J[b11];
                        array2 = arg0.t[b11];
                    }
                    --n10;
                    for (arg6 = n, a6 = a(arg6, arg0); a6 > array[arg6]; ++arg6, a6 = (a6 << 1 | d(arg0))) {}
                }
            }
            arg0.F = 0;
            arg0.g = 0;
            arg0.w[0] = 0;
            for (int n31 = 1; n31 <= 256; ++n31) {
                arg0.w[n31] = arg0.m[n31 - 1];
            }
            for (int n32 = 1; n32 <= 256; ++n32) {
                final int[] w = arg0.w;
                final int n33 = n32;
                w[n33] += arg0.w[n32 - 1];
            }
            for (int n34 = 0; n34 < b6; ++n34) {
                final byte b12 = (byte)(ua.Mb[n34] & 0xFF);
                final int[] mb = ua.Mb;
                final int n35 = arg0.w[b12 & 0xFF];
                mb[n35] |= n34 << 8;
                final int[] w2 = arg0.w;
                final int n36 = b12 & 0xFF;
                ++w2[n36];
            }
            arg0.H = ua.Mb[arg0.E] >> 8;
            arg0.L = 0;
            arg0.H = ua.Mb[arg0.H];
            arg0.h = (byte)(arg0.H & 0xFF);
            arg0.H >>= 8;
            ++arg0.L;
            arg0.b = b6;
            e(arg0);
            if (arg0.L == arg0.b + 1 && arg0.F == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    private static final byte c(final ac arg0) {
        return (byte)a(8, arg0);
    }
    
    private static final byte d(final ac arg0) {
        return (byte)a(1, arg0);
    }
    
    private static final void a(final ac arg0) {
        arg0.K = 0;
        for (int i = 0; i < 256; ++i) {
            if (arg0.n[i]) {
                arg0.d[arg0.K] = (byte)i;
                ++arg0.K;
            }
        }
    }
    
    private static final void a(final int[] arg0, final int[] arg1, final int[] arg2, final byte[] arg3, final int arg4, final int arg5, final int arg6) {
        int n = 0;
        for (int i = arg4; i <= arg5; ++i) {
            for (int j = 0; j < arg6; ++j) {
                if (arg3[j] == i) {
                    arg2[n] = j;
                    ++n;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            arg1[k] = 0;
        }
        for (int l = 0; l < arg6; ++l) {
            final int n2 = arg3[l] + 1;
            ++arg1[n2];
        }
        for (int n3 = 1; n3 < 23; ++n3) {
            final int n4 = n3;
            arg1[n4] += arg1[n3 - 1];
        }
        for (int n5 = 0; n5 < 23; ++n5) {
            arg0[n5] = 0;
        }
        int n6 = 0;
        for (int n7 = arg4; n7 <= arg5; ++n7) {
            final int n8 = n6 + (arg1[n7 + 1] - arg1[n7]);
            arg0[n7] = n8 - 1;
            n6 = n8 << 1;
        }
        for (int n9 = arg4 + 1; n9 <= arg5; ++n9) {
            arg1[n9] = (arg0[n9 - 1] + 1 << 1) - arg1[n9];
        }
    }
    
    static final int a(final byte[] arg0, int arg1, final byte[] arg2, final int arg3, final int arg4) {
        synchronized (ea.a) {
            ea.a.q = arg2;
            ea.a.a = arg4;
            ea.a.i = arg0;
            ea.a.o = 0;
            ea.a.y = arg1;
            ea.a.p = 0;
            ea.a.e = 0;
            ea.a.c = 0;
            ea.a.G = 0;
            b(ea.a);
            arg1 -= ea.a.y;
            ea.a.q = null;
            ea.a.i = null;
            return arg1;
        }
    }
    
    private static final void e(final ac arg0) {
        byte g = arg0.g;
        int f = arg0.F;
        int i = arg0.L;
        int h = arg0.h;
        final int[] mb = ua.Mb;
        int h2 = arg0.H;
        final byte[] j = arg0.i;
        int o = arg0.o;
        final int y;
        int k = y = arg0.y;
        final int n = arg0.b + 1;
    Label_0370:
        while (true) {
            Label_0123: {
                if (f > 0) {
                    while (k != 0) {
                        if (f == 1) {
                            if (k == 0) {
                                f = 1;
                                break;
                            }
                            j[o] = g;
                            ++o;
                            --k;
                            break Label_0123;
                        }
                        else {
                            j[o] = g;
                            --f;
                            ++o;
                            --k;
                        }
                    }
                    break;
                }
            }
            while (i != n) {
                g = (byte)h;
                final int n2 = mb[h2];
                final byte b = (byte)n2;
                h2 = n2 >> 8;
                ++i;
                if (b != h) {
                    h = b;
                    if (k == 0) {
                        f = 1;
                        break Label_0370;
                    }
                    j[o] = g;
                    ++o;
                    --k;
                }
                else if (i == n) {
                    if (k == 0) {
                        f = 1;
                        break Label_0370;
                    }
                    j[o] = g;
                    ++o;
                    --k;
                }
                else {
                    f = 2;
                    final int n3 = mb[h2];
                    final byte b2 = (byte)n3;
                    h2 = n3 >> 8;
                    if (++i == n) {
                        continue Label_0370;
                    }
                    if (b2 != h) {
                        h = b2;
                        continue Label_0370;
                    }
                    f = 3;
                    final int n4 = mb[h2];
                    final byte b3 = (byte)n4;
                    h2 = n4 >> 8;
                    if (++i == n) {
                        continue Label_0370;
                    }
                    if (b3 != h) {
                        h = b3;
                        continue Label_0370;
                    }
                    final int n5 = mb[h2];
                    final byte b4 = (byte)n5;
                    final int n6 = n5 >> 8;
                    ++i;
                    f = (b4 & 0xFF) + 4;
                    final int n7 = mb[n6];
                    h = (byte)n7;
                    h2 = n7 >> 8;
                    ++i;
                    continue Label_0370;
                }
            }
            f = 0;
            break;
        }
        final int g2 = arg0.G;
        arg0.G += y - k;
        if (arg0.G < g2) {}
        arg0.g = g;
        arg0.F = f;
        arg0.L = i;
        arg0.h = h;
        ua.Mb = mb;
        arg0.H = h2;
        arg0.i = j;
        arg0.o = o;
        arg0.y = k;
    }
    
    private static final int a(final int arg0, final ac arg1) {
        while (arg1.p < arg0) {
            arg1.e = (arg1.e << 8 | (arg1.q[arg1.a] & 0xFF));
            arg1.p += 8;
            ++arg1.a;
            ++arg1.c;
            if (arg1.c == 0) {
                continue;
            }
        }
        final int n = arg1.e >> arg1.p - arg0 & (1 << arg0) - 1;
        arg1.p -= arg0;
        return n;
    }
    
    static {
        ea.a = new ac();
    }
}
