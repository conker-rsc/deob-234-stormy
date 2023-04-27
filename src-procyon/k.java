import java.io.*;

final class k
{
    private boolean H;
    byte[] Q;
    private lb c;
    private boolean nb;
    private int[][] ab;
    private int[] w;
    private byte[][] L;
    boolean Z;
    private int[][] s;
    private byte[][] R;
    int[][] bb;
    private byte[][] f;
    private byte[][] P;
    private byte[][] mb;
    private ca kb;
    private ca[] F;
    private ua U;
    byte[] m;
    private int[][] B;
    int x;
    ca[][] g;
    int[] E;
    static String[] G;
    byte[] gb;
    private byte[][] A;
    static int o;
    static long e;
    byte[] I;
    private byte[][] eb;
    ca[][] db;
    int[] q;
    
    private final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        if (arg3 != 2) {
            this.Q = null;
        }
        final ca ca = this.F[arg4 - -(arg2 * 8)];
        for (int arg6 = 0; ca.Db > arg6; ++arg6) {
            if (128 * arg5 == ca.a[arg6] && ca.bc[arg6] == arg0 * 128) {
                ca.a(arg6, arg1, (byte)(-61));
                return;
            }
        }
    }
    
    private final void a(final int arg0) {
        for (int i = arg0; i < 96; ++i) {
            for (int j = 0; j < 96; ++j) {
                if (this.b(0, i, arg0 ^ 0x4, j) == 250) {
                    if (i != 47 || this.b(0, i + 1, arg0 + 4, j) == 250 || this.b(0, 1 + i, 4, j) == 2) {
                        if (j == 47 && this.b(0, i, 4, j + 1) != 250 && this.b(0, i, arg0 ^ 0x4, 1 + j) != 2) {
                            this.e(9, j, 107, i);
                        }
                        else {
                            this.e(2, j, 110, i);
                        }
                    }
                    else {
                        this.e(9, j, arg0 + 111, i);
                    }
                }
            }
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg3 != 4081) {
            this.a(-98, 25, -8, -1, (byte)(-83), 45);
        }
        if (arg1 >= 0 && arg2 >= 0 && arg1 < 95 && arg2 < 95) {
            if (mb.a[arg0] == 1 || mb.a[arg0] == 2) {
                final int b = this.b(arg1, arg2, -79);
                int arg4;
                int arg5;
                if (b == 0 || b == 4) {
                    arg4 = ub.g[arg0];
                    arg5 = f.f[arg0];
                }
                else {
                    arg4 = f.f[arg0];
                    arg5 = ub.g[arg0];
                }
                for (int i = arg1; i < arg1 - -arg5; ++i) {
                    for (int n = arg2; arg4 + arg2 > n; ++n) {
                        if (mb.a[arg0] != 1) {
                            if (b == 0) {
                                this.bb[i][n] = ib.a(this.bb[i][n], 65533);
                                if (i > 0) {
                                    this.c(n, arg3 + 61454, i - 1, 8);
                                }
                            }
                            else if (b != 2) {
                                if (b != 4) {
                                    if (b == 6) {
                                        this.bb[i][n] = ib.a(this.bb[i][n], 65534);
                                        if (n > 0) {
                                            this.c(n - 1, arg3 ^ 0xF00E, i, 4);
                                        }
                                    }
                                }
                                else {
                                    this.bb[i][n] = ib.a(this.bb[i][n], 65527);
                                    if (i < 95) {
                                        this.c(n, arg3 + 61454, 1 + i, 2);
                                    }
                                }
                            }
                            else {
                                this.bb[i][n] = ib.a(this.bb[i][n], 65531);
                                if (n < 95) {
                                    this.c(n + 1, arg3 + 61454, i, 1);
                                }
                            }
                        }
                        else {
                            this.bb[i][n] = ib.a(this.bb[i][n], 65471);
                        }
                    }
                }
                this.c(arg5, arg4, -82, arg1, arg2);
            }
        }
    }
    
    private final void e(final int arg0, int arg1, final int arg2, int arg3) {
        if (arg3 < 0 || arg3 >= 96 || arg1 < 0 || arg1 >= 96) {
            return;
        }
        int n = 0;
        if (arg3 < 48 || arg1 >= 48) {
            if (arg3 < 48 && arg1 >= 48) {
                n = 2;
                arg1 -= 48;
            }
            else if (arg3 >= 48 && arg1 >= 48) {
                arg3 -= 48;
                arg1 -= 48;
                n = 3;
            }
        }
        else {
            n = 1;
            arg3 -= 48;
        }
        this.R[n][arg1 + 48 * arg3] = (byte)arg0;
    }
    
    final void a(final int arg0, final int arg1, final boolean arg2, final int arg3) {
        if (arg2) {
            return;
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= 95 || arg3 >= 95) {
            return;
        }
        if (mb.a[arg1] == 1 || mb.a[arg1] == 2) {
            final int b = this.b(arg0, arg3, -107);
            int arg4;
            int arg5;
            if (b == 0 || b == 4) {
                arg4 = f.f[arg1];
                arg5 = ub.g[arg1];
            }
            else {
                arg5 = f.f[arg1];
                arg4 = ub.g[arg1];
            }
            for (int i = arg0; i < arg4 + arg0; ++i) {
                for (int n = arg3; arg3 + arg5 > n; ++n) {
                    if (mb.a[arg1] == 1) {
                        this.bb[i][n] = d.a(this.bb[i][n], 64);
                    }
                    else if (b != 0) {
                        if (b == 2) {
                            this.bb[i][n] = d.a(this.bb[i][n], 4);
                            if (n < 95) {
                                this.a(1, 1 + n, (byte)(-112), i);
                            }
                        }
                        else if (b != 4) {
                            if (b == 6) {
                                this.bb[i][n] = d.a(this.bb[i][n], 1);
                                if (n > 0) {
                                    this.a(4, n - 1, (byte)(-112), i);
                                }
                            }
                        }
                        else {
                            this.bb[i][n] = d.a(this.bb[i][n], 8);
                            if (i < 95) {
                                this.a(2, n, (byte)(-56), i + 1);
                            }
                        }
                    }
                    else {
                        this.bb[i][n] = d.a(this.bb[i][n], 2);
                        if (i > 0) {
                            this.a(8, n, (byte)(-109), i - 1);
                        }
                    }
                }
            }
            this.c(arg4, arg5, 94, arg0, arg3);
        }
    }
    
    static final byte[] a(final int arg0, final boolean arg1, final byte[] arg2) {
        if (arg0 != 128) {
            k.o = 104;
        }
        final int arg3 = ((arg2[1] & 0xFF) << 8) + ((0xFF0000 & arg2[0] << 16) - -(0xFF & arg2[2]));
        final int arg4 = ((0xFF & arg2[4]) << 8) + (0xFF0000 & arg2[3] << 16) + (0xFF & arg2[5]);
        if (arg3 == arg4) {
            final byte[] arg5 = new byte[arg2.length - 6];
            ab.a(arg2, 6, arg5, 0, arg5.length);
            return arg5;
        }
        if (arg1) {
            da.a("Unpacking ", 0, 0);
        }
        final byte[] arg6 = new byte[arg3];
        ea.a(arg6, arg3, arg2, arg4, 6);
        return arg6;
    }
    
    private final void b(final int arg0) {
        if (arg0 != -10185) {
            return;
        }
        if (this.nb) {
            this.c.a(false);
        }
        for (int i = 0; i < 64; ++i) {
            this.F[i] = null;
            for (int j = 0; j < 4; ++j) {
                this.g[j][i] = null;
            }
            for (int k = 0; k < 4; ++k) {
                this.db[k][i] = null;
            }
        }
        System.gc();
    }
    
    private final void a(final int arg0, final int arg1, final boolean arg2, final int arg3, final int arg4) {
        try {
            final int n = (24 + arg0) / 48;
            final int n2 = (24 + arg4) / 48;
            this.b(arg3, 0, n - 1, 0, n2 - 1);
            this.b(arg3, 1, n, 0, n2 - 1);
            if (arg1 < 66) {
                return;
            }
            this.b(arg3, 2, n - 1, 0, n2);
            this.b(arg3, 3, n, 0, n2);
            this.a(0);
            if (this.kb == null) {
                this.kb = new ca(18688, 18688, true, true, false, false, true);
            }
            if (arg2) {
                this.U.a(true);
                for (int i = 0; i < 96; ++i) {
                    for (int j = 0; j < 96; ++j) {
                        this.bb[i][j] = 0;
                    }
                }
                final ca kb = this.kb;
                kb.c(1);
                for (int k = 0; k < 96; ++k) {
                    for (int l = 0; l < 96; ++l) {
                        int arg5 = -this.g(2, l, k);
                        if (this.b(arg3, k, 4, l) > 0 && da.N[this.b(arg3, k, 4, l) - 1] == 4) {
                            arg5 = 0;
                        }
                        if (this.b(arg3, k - 1, 4, l) > 0) {
                            if (da.N[this.b(arg3, k - 1, 4, l) - 1] == 4) {
                                arg5 = 0;
                            }
                        }
                        if (this.b(arg3, k, 4, l - 1) > 0) {
                            if (da.N[this.b(arg3, k, 4, l - 1) - 1] == 4) {
                                arg5 = 0;
                            }
                        }
                        if (this.b(arg3, k - 1, 4, l - 1) > 0) {
                            if (da.N[this.b(arg3, k - 1, 4, l - 1) - 1] == 4) {
                                arg5 = 0;
                            }
                        }
                        kb.a(kb.e(k * 128, 128 * l, arg5, 107), (int)(Math.random() * 10.0) - 5, (byte)(-61));
                    }
                }
                for (int arg6 = 0; arg6 < 95; ++arg6) {
                    for (int arg7 = 0; arg7 < 95; ++arg7) {
                        int arg8;
                        int n4;
                        int n3 = n4 = (arg8 = this.w[this.a((byte)104, arg6, arg7)]);
                        if (arg3 == 1 || arg3 == 2) {
                            arg8 = 12345678;
                            n3 = 12345678;
                            n4 = 12345678;
                        }
                        int arg9 = 0;
                        if (this.b(arg3, arg6, 4, arg7) > 0) {
                            final int b = this.b(arg3, arg6, 4, arg7);
                            final int n5 = da.N[b - 1];
                            final int d = this.d(arg3, arg7, 15282, arg6);
                            arg8 = (n3 = qa.K[b - 1]);
                            if (n5 == 4) {
                                n3 = 1;
                                arg8 = 1;
                                if (b == 12) {
                                    n3 = 31;
                                    arg8 = 31;
                                }
                            }
                            if (n5 == 5) {
                                if (this.c(arg6, arg7, -49) > 0) {
                                    if (this.c(arg6, arg7, -49) < 24000) {
                                        if (this.d(-8509, arg6 - 1, n4, arg3, arg7) != 12345678 && this.d(-8509, arg6, n4, arg3, arg7 - 1) != 12345678) {
                                            arg9 = 0;
                                            n3 = this.d(-8509, arg6 - 1, n4, arg3, arg7);
                                        }
                                        else if (this.d(-8509, 1 + arg6, n4, arg3, arg7) != 12345678 && this.d(-8509, arg6, n4, arg3, 1 + arg7) != 12345678) {
                                            arg8 = this.d(-8509, arg6 + 1, n4, arg3, arg7);
                                            arg9 = 0;
                                        }
                                        else if (this.d(-8509, 1 + arg6, n4, arg3, arg7) == 12345678 || this.d(-8509, arg6, n4, arg3, arg7 - 1) == 12345678) {
                                            if (this.d(-8509, arg6 - 1, n4, arg3, arg7) != 12345678) {
                                                if (this.d(-8509, arg6, n4, arg3, arg7 + 1) != 12345678) {
                                                    arg9 = 1;
                                                    n3 = this.d(-8509, arg6 - 1, n4, arg3, arg7);
                                                }
                                            }
                                        }
                                        else {
                                            arg8 = this.d(-8509, arg6 + 1, n4, arg3, arg7);
                                            arg9 = 1;
                                        }
                                    }
                                }
                            }
                            else if (n5 != 2 || (this.c(arg6, arg7, -49) > 0 && this.c(arg6, arg7, -49) < 24000)) {
                                if (d != this.d(arg3, arg7, 15282, arg6 - 1) && this.d(arg3, arg7 - 1, 15282, arg6) != d) {
                                    n3 = n4;
                                    arg9 = 0;
                                }
                                else if (d != this.d(arg3, arg7, 15282, arg6 + 1) && d != this.d(arg3, arg7 + 1, 15282, arg6)) {
                                    arg9 = 0;
                                    arg8 = n4;
                                }
                                else if (d == this.d(arg3, arg7, 15282, 1 + arg6) || d == this.d(arg3, arg7 - 1, 15282, arg6)) {
                                    if (d != this.d(arg3, arg7, 15282, arg6 - 1)) {
                                        if (d != this.d(arg3, 1 + arg7, 15282, arg6)) {
                                            n3 = n4;
                                            arg9 = 1;
                                        }
                                    }
                                }
                                else {
                                    arg8 = n4;
                                    arg9 = 1;
                                }
                            }
                            if (ac.l[b - 1] != 0) {
                                this.bb[arg6][arg7] = d.a(this.bb[arg6][arg7], 64);
                            }
                            if (da.N[b - 1] == 2) {
                                this.bb[arg6][arg7] = d.a(this.bb[arg6][arg7], 128);
                            }
                        }
                        this.a(arg9, (byte)(-122), arg8, arg6, arg7, n3);
                        final int n6 = this.g(2, 1 + arg7, arg6 + 1) + (-this.g(2, arg7, arg6 + 1) - -this.g(2, arg7 + 1, arg6)) - this.g(2, arg7, arg6);
                        if (arg8 != n3 || n6 != 0) {
                            final int[] array = new int[3];
                            final int[] array2 = new int[3];
                            if (arg9 == 0) {
                                if (n3 != 12345678) {
                                    array[1] = arg6 * 96 + arg7;
                                    array[0] = 96 + arg7 + 96 * arg6;
                                    array[2] = 1 + (arg7 + 96 * arg6);
                                    final int a = kb.a(3, array, 12345678, n3, false);
                                    this.q[a] = arg6;
                                    this.E[a] = arg7;
                                    kb.E[a] = a + 200000;
                                }
                                if (arg8 != 12345678) {
                                    array2[2] = arg7 + (96 * arg6 + 96);
                                    array2[1] = 97 + (96 * arg6 + arg7);
                                    array2[0] = 1 + arg6 * 96 + arg7;
                                    final int a2 = kb.a(3, array2, 12345678, arg8, false);
                                    this.q[a2] = arg6;
                                    this.E[a2] = arg7;
                                    kb.E[a2] = a2 + 200000;
                                }
                            }
                            else {
                                if (n3 != 12345678) {
                                    array[2] = arg7 - -(96 * arg6);
                                    array[1] = 96 + (96 * arg6 + (arg7 + 1));
                                    array[0] = 1 + (96 * arg6 + arg7);
                                    final int a3 = kb.a(3, array, 12345678, n3, false);
                                    this.q[a3] = arg6;
                                    this.E[a3] = arg7;
                                    kb.E[a3] = 200000 - -a3;
                                }
                                if (arg8 != 12345678) {
                                    array2[1] = arg7 - -(96 * arg6);
                                    array2[2] = arg7 - (-(arg6 * 96) - 97);
                                    array2[0] = 96 * arg6 + arg7 + 96;
                                    final int a4 = kb.a(3, array2, 12345678, arg8, false);
                                    this.q[a4] = arg6;
                                    this.E[a4] = arg7;
                                    kb.E[a4] = a4 + 200000;
                                }
                            }
                        }
                        else if (n3 != 12345678) {
                            final int a5 = kb.a(4, new int[] { arg7 - (-(arg6 * 96) - 96), arg7 - -(arg6 * 96), 1 + arg6 * 96 + arg7, arg7 - (-(arg6 * 96) - 96) + 1 }, 12345678, n3, false);
                            this.q[a5] = arg6;
                            this.E[a5] = arg7;
                            kb.E[a5] = a5 + 200000;
                        }
                    }
                }
                for (int n7 = 1; n7 < 95; ++n7) {
                    for (int n8 = 1; n8 < 95; ++n8) {
                        if (this.b(arg3, n7, 4, n8) > 0 && da.N[this.b(arg3, n7, 4, n8) - 1] == 4) {
                            final int n9 = qa.K[this.b(arg3, n7, 4, n8) - 1];
                            final int a6 = kb.a(4, new int[] { kb.e(n7 * 128, 128 * n8, -this.g(2, n8, n7), 13), kb.e(128 * (n7 + 1), n8 * 128, -this.g(2, n8, 1 + n7), 107), kb.e((1 + n7) * 128, (n8 + 1) * 128, -this.g(2, n8 + 1, n7 + 1), -116), kb.e(n7 * 128, 128 + 128 * n8, -this.g(2, 1 + n8, n7), -124) }, n9, 12345678, false);
                            this.q[a6] = n7;
                            this.E[a6] = n8;
                            kb.E[a6] = a6 + 200000;
                            this.a(0, (byte)(-121), n9, n7, n8, n9);
                        }
                        else if (this.b(arg3, n7, 4, n8) == 0 || da.N[this.b(arg3, n7, 4, n8) - 1] != 3) {
                            if (this.b(arg3, n7, 4, n8 + 1) > 0 && da.N[this.b(arg3, n7, 4, 1 + n8) - 1] == 4) {
                                final int n10 = qa.K[this.b(arg3, n7, 4, n8 + 1) - 1];
                                final int a7 = kb.a(4, new int[] { kb.e(128 * n7, 128 * n8, -this.g(2, n8, n7), -124), kb.e(128 * (n7 + 1), 128 * n8, -this.g(2, n8, 1 + n7), -118), kb.e(128 + n7 * 128, 128 * (n8 + 1), -this.g(2, n8 + 1, 1 + n7), -124), kb.e(128 * n7, 128 * n8 + 128, -this.g(2, 1 + n8, n7), -116) }, n10, 12345678, false);
                                this.q[a7] = n7;
                                this.E[a7] = n8;
                                kb.E[a7] = a7 + 200000;
                                this.a(0, (byte)34, n10, n7, n8, n10);
                            }
                            if (this.b(arg3, n7, 4, n8 - 1) > 0) {
                                if (da.N[this.b(arg3, n7, 4, n8 - 1) - 1] == 4) {
                                    final int n11 = qa.K[this.b(arg3, n7, 4, n8 - 1) - 1];
                                    final int a8 = kb.a(4, new int[] { kb.e(n7 * 128, n8 * 128, -this.g(2, n8, n7), -122), kb.e(128 * (1 + n7), n8 * 128, -this.g(2, n8, n7 + 1), 123), kb.e(128 * (1 + n7), 128 * (n8 + 1), -this.g(2, n8 + 1, n7 + 1), -104), kb.e(128 * n7, 128 + 128 * n8, -this.g(2, n8 + 1, n7), -127) }, n11, 12345678, false);
                                    this.q[a8] = n7;
                                    this.E[a8] = n8;
                                    kb.E[a8] = 200000 + a8;
                                    this.a(0, (byte)17, n11, n7, n8, n11);
                                }
                            }
                            if (this.b(arg3, n7 + 1, 4, n8) > 0) {
                                if (da.N[this.b(arg3, n7 + 1, 4, n8) - 1] == 4) {
                                    final int n12 = qa.K[this.b(arg3, 1 + n7, 4, n8) - 1];
                                    final int a9 = kb.a(4, new int[] { kb.e(128 * n7, n8 * 128, -this.g(2, n8, n7), -113), kb.e(128 + n7 * 128, n8 * 128, -this.g(2, n8, 1 + n7), 89), kb.e(128 * (1 + n7), 128 * n8 + 128, -this.g(2, 1 + n8, 1 + n7), 124), kb.e(n7 * 128, (1 + n8) * 128, -this.g(2, n8 + 1, n7), -112) }, n12, 12345678, false);
                                    this.q[a9] = n7;
                                    this.E[a9] = n8;
                                    kb.E[a9] = a9 + 200000;
                                    this.a(0, (byte)(-124), n12, n7, n8, n12);
                                }
                            }
                            if (this.b(arg3, n7 - 1, 4, n8) > 0 && da.N[this.b(arg3, n7 - 1, 4, n8) - 1] == 4) {
                                final int n13 = qa.K[this.b(arg3, n7 - 1, 4, n8) - 1];
                                final int a10 = kb.a(4, new int[] { kb.e(n7 * 128, 128 * n8, -this.g(2, n8, n7), -123), kb.e((n7 + 1) * 128, 128 * n8, -this.g(2, n8, 1 + n7), 106), kb.e(128 + 128 * n7, n8 * 128 + 128, -this.g(2, 1 + n8, 1 + n7), 56), kb.e(n7 * 128, 128 * (1 + n8), -this.g(2, n8 + 1, n7), 119) }, n13, 12345678, false);
                                this.q[a10] = n7;
                                this.E[a10] = n8;
                                kb.E[a10] = a10 + 200000;
                                this.a(0, (byte)(-127), n13, n7, n8, n13);
                            }
                        }
                    }
                }
                kb.a(-50, 40, -10, -50, true, 48, 105);
                this.F = this.kb.a(0, 8, 1536, 112, 64, 233, 1536, false, 0);
                for (int n14 = 0; n14 < 64; ++n14) {
                    this.c.a(this.F[n14], (byte)118);
                }
                for (int arg10 = 0; arg10 < 96; ++arg10) {
                    for (int arg11 = 0; arg11 < 96; ++arg11) {
                        this.ab[arg10][arg11] = this.g(2, arg11, arg10);
                    }
                }
            }
            this.kb.c(1);
            final int n15 = 6316128;
            for (int arg12 = 0; arg12 < 95; ++arg12) {
                for (int n16 = 0; n16 < 95; ++n16) {
                    final int a11 = this.a(arg12, (byte)(-124), n16);
                    if (a11 > 0) {
                        if (lb.Tb[a11 - 1] == 0 || this.H) {
                            this.a(a11 - 1, this.kb, 1 + arg12, n16, arg12, -14584, n16);
                            if (arg2) {
                                if (u.a[a11 - 1] != 0) {
                                    this.bb[arg12][n16] = d.a(this.bb[arg12][n16], 1);
                                    if (n16 > 0) {
                                        this.a(4, n16 - 1, (byte)(-125), arg12);
                                    }
                                }
                            }
                            if (arg2) {
                                this.U.b(3, n15, arg12 * 3, n16 * 3, (byte)(-109));
                            }
                        }
                    }
                    final int e = this.e(95, arg12, n16);
                    if (e > 0) {
                        if (lb.Tb[e - 1] == 0 || this.H) {
                            this.a(e - 1, this.kb, arg12, n16, arg12, -14584, 1 + n16);
                            if (arg2 && u.a[e - 1] != 0) {
                                this.bb[arg12][n16] = d.a(this.bb[arg12][n16], 2);
                                if (arg12 > 0) {
                                    this.a(8, n16, (byte)(-72), arg12 - 1);
                                }
                            }
                            if (arg2) {
                                this.U.b(arg12 * 3, 3 * n16, n15, 3, 0);
                            }
                        }
                    }
                    final int c = this.c(arg12, n16, -49);
                    if (c > 0 && c < 12000) {
                        if (lb.Tb[c - 1] == 0 || this.H) {
                            this.a(c - 1, this.kb, arg12 + 1, n16, arg12, -14584, 1 + n16);
                            if (arg2 && u.a[c - 1] != 0) {
                                this.bb[arg12][n16] = d.a(this.bb[arg12][n16], 32);
                            }
                            if (arg2) {
                                this.U.a(3 * n16, arg12 * 3, 82, n15);
                                this.U.a(1 + 3 * n16, 1 + arg12 * 3, 69, n15);
                                this.U.a(2 + 3 * n16, arg12 * 3 + 2, 65, n15);
                            }
                        }
                    }
                    if (c > 12000 && c < 24000 && (lb.Tb[c - 12001] == 0 || this.H)) {
                        this.a(c - 12001, this.kb, arg12, n16, arg12 + 1, -14584, 1 + n16);
                        if (arg2 && u.a[c - 12001] != 0) {
                            this.bb[arg12][n16] = d.a(this.bb[arg12][n16], 16);
                        }
                        if (arg2) {
                            this.U.a(3 * n16, 2 + 3 * arg12, 116, n15);
                            this.U.a(n16 * 3 + 1, arg12 * 3 + 1, 99, n15);
                            this.U.a(2 + 3 * n16, arg12 * 3, 90, n15);
                        }
                    }
                }
            }
            if (arg2) {
                this.U.b(285, 0, 0, -27966, this.x - 1, 285);
            }
            this.kb.a(-50, 60, -10, -50, false, 24, 122);
            this.g[arg3] = this.kb.a(0, 8, 1536, -120, 64, 338, 1536, true, 0);
            for (int n17 = 0; n17 < 64; ++n17) {
                this.c.a(this.g[arg3][n17], (byte)118);
            }
            for (int arg13 = 0; arg13 < 95; ++arg13) {
                for (int arg14 = 0; arg14 < 95; ++arg14) {
                    final int a12 = this.a(arg13, (byte)(-111), arg14);
                    if (a12 > 0) {
                        this.a(a12 - 1, arg13 + 1, arg14, arg14, (byte)(-50), arg13);
                    }
                    final int e2 = this.e(61, arg13, arg14);
                    if (e2 > 0) {
                        this.a(e2 - 1, arg13, arg14, arg14 + 1, (byte)(-65), arg13);
                    }
                    final int c2 = this.c(arg13, arg14, -49);
                    if (c2 > 0 && c2 < 12000) {
                        this.a(c2 - 1, arg13 + 1, arg14, arg14 + 1, (byte)(-118), arg13);
                    }
                    if (c2 > 12000 && c2 < 24000) {
                        this.a(c2 - 12001, arg13, arg14, arg14 + 1, (byte)82, arg13 + 1);
                    }
                }
            }
            for (int arg15 = 1; arg15 < 95; ++arg15) {
                for (int arg16 = 1; arg16 < 95; ++arg16) {
                    if (this.d(arg16, arg15, 115) > 0) {
                        final int n18 = arg15;
                        final int n19 = arg16;
                        final int n20 = arg15 + 1;
                        final int n21 = arg16;
                        final int n22 = 1 + arg15;
                        final int n23 = arg16 + 1;
                        final int n24 = arg15;
                        final int n25 = 1 + arg16;
                        int n26 = 0;
                        int n27 = this.ab[n18][n19];
                        int n28 = this.ab[n20][n21];
                        int n29 = this.ab[n22][n23];
                        if (n28 > 80000) {
                            n28 -= 80000;
                        }
                        if (n27 > 80000) {
                            n27 -= 80000;
                        }
                        int n30 = this.ab[n24][n25];
                        if (n29 > 80000) {
                            n29 -= 80000;
                        }
                        if (n30 > 80000) {
                            n30 -= 80000;
                        }
                        if (n27 > n26) {
                            n26 = n27;
                        }
                        if (n28 > n26) {
                            n26 = n28;
                        }
                        if (n29 > n26) {
                            n26 = n29;
                        }
                        if (n30 > n26) {
                            n26 = n30;
                        }
                        if (n26 >= 80000) {
                            n26 -= 80000;
                        }
                        if (n27 < 80000) {
                            this.ab[n18][n19] = n26;
                        }
                        else {
                            final int[] array3 = this.ab[n18];
                            final int n31 = n19;
                            array3[n31] -= 80000;
                        }
                        if (n28 < 80000) {
                            this.ab[n20][n21] = n26;
                        }
                        else {
                            final int[] array4 = this.ab[n20];
                            final int n32 = n21;
                            array4[n32] -= 80000;
                        }
                        if (n29 < 80000) {
                            this.ab[n22][n23] = n26;
                        }
                        else {
                            final int[] array5 = this.ab[n22];
                            final int n33 = n23;
                            array5[n33] -= 80000;
                        }
                        if (n30 < 80000) {
                            this.ab[n24][n25] = n26;
                        }
                        else {
                            final int[] array6 = this.ab[n24];
                            final int n34 = n25;
                            array6[n34] -= 80000;
                        }
                    }
                }
            }
            this.kb.c(1);
            for (int arg17 = 1; arg17 < 95; ++arg17) {
                for (int arg18 = 1; arg18 < 95; ++arg18) {
                    final int d2 = this.d(arg18, arg17, 126);
                    if (d2 > 0) {
                        final int arg19 = arg17;
                        final int arg20 = arg18;
                        final int arg21 = arg17 + 1;
                        final int arg22 = arg18;
                        final int arg23 = arg17 + 1;
                        final int arg24 = 1 + arg18;
                        final int arg25 = arg17;
                        final int arg26 = arg18 + 1;
                        int n35 = 128 * arg17;
                        int n36 = arg18 * 128;
                        int n37 = 128 + n35;
                        int n38 = 128 + n36;
                        int n39 = n35;
                        int n40 = n36;
                        int n41 = n37;
                        int n42 = n38;
                        int n43 = this.ab[arg19][arg20];
                        int n44 = this.ab[arg21][arg22];
                        int n45 = this.ab[arg23][arg24];
                        int n46 = this.ab[arg25][arg26];
                        final int n47 = i.g[d2 - 1];
                        if (this.a(false, arg19, arg20)) {
                            if (n43 < 80000) {
                                n43 += n47 + 80000;
                                this.ab[arg19][arg20] = n43;
                            }
                        }
                        if (this.a(false, arg21, arg22) && n44 < 80000) {
                            n44 += n47 + 80000;
                            this.ab[arg21][arg22] = n44;
                        }
                        if (this.a(false, arg23, arg24)) {
                            if (n45 < 80000) {
                                n45 += 80000 + n47;
                                this.ab[arg23][arg24] = n45;
                            }
                        }
                        if (n44 >= 80000) {
                            n44 -= 80000;
                        }
                        if (n45 >= 80000) {
                            n45 -= 80000;
                        }
                        if (this.a(false, arg25, arg26) && n46 < 80000) {
                            n46 += n47 + 80000;
                            this.ab[arg25][arg26] = n46;
                        }
                        if (n43 >= 80000) {
                            n43 -= 80000;
                        }
                        if (n46 >= 80000) {
                            n46 -= 80000;
                        }
                        final int n48 = 16;
                        if (!this.a(arg19 - 1, 26431, arg20)) {
                            n35 -= n48;
                        }
                        if (!this.a(arg19 + 1, 26431, arg20)) {
                            n35 += n48;
                        }
                        if (!this.a(arg19, 26431, arg20 - 1)) {
                            n36 -= n48;
                        }
                        if (!this.a(arg19, 26431, 1 + arg20)) {
                            n36 += n48;
                        }
                        if (!this.a(arg21 - 1, 26431, arg22)) {
                            n37 -= n48;
                        }
                        if (!this.a(arg21 + 1, 26431, arg22)) {
                            n37 += n48;
                        }
                        if (!this.a(arg21, 26431, arg22 - 1)) {
                            n40 -= n48;
                        }
                        if (!this.a(arg21, 26431, arg22 + 1)) {
                            n40 += n48;
                        }
                        if (!this.a(arg23 - 1, 26431, arg24)) {
                            n41 -= n48;
                        }
                        if (!this.a(1 + arg23, 26431, arg24)) {
                            n41 += n48;
                        }
                        if (!this.a(arg23, 26431, arg24 - 1)) {
                            n38 -= n48;
                        }
                        if (!this.a(arg23, 26431, 1 + arg24)) {
                            n38 += n48;
                        }
                        if (!this.a(arg25 - 1, 26431, arg26)) {
                            n39 -= n48;
                        }
                        if (!this.a(arg25 + 1, 26431, arg26)) {
                            n39 += n48;
                        }
                        if (!this.a(arg25, 26431, arg26 - 1)) {
                            n42 -= n48;
                        }
                        if (!this.a(arg25, 26431, arg26 + 1)) {
                            n42 += n48;
                        }
                        final int n49 = -n44;
                        final int n50 = d.g[d2 - 1];
                        final int n51 = -n46;
                        final int n52 = -n45;
                        final int n53 = -n43;
                        if (this.c(arg17, arg18, -49) <= 12000 || this.c(arg17, arg18, -49) >= 24000 || this.d(arg18 - 1, arg17 - 1, 120) != 0) {
                            if (this.c(arg17, arg18, -49) > 12000 && this.c(arg17, arg18, -49) < 24000 && this.d(arg18 + 1, 1 + arg17, 115) == 0) {
                                this.kb.a(3, new int[] { this.kb.e(n35, n36, n53, -128), this.kb.e(n37, n40, n49, -122), this.kb.e(n39, n42, n51, 12) }, n50, 12345678, false);
                            }
                            else if (this.c(arg17, arg18, -49) <= 0 || this.c(arg17, arg18, -49) >= 12000 || this.d(arg18 - 1, arg17 + 1, 111) != 0) {
                                if (this.c(arg17, arg18, -49) <= 0 || this.c(arg17, arg18, -49) >= 12000 || this.d(1 + arg18, arg17 - 1, 103) != 0) {
                                    if (n53 != n49 || n51 != n52) {
                                        if (n53 != n51 || n52 != n49) {
                                            boolean b2 = true;
                                            if (this.d(arg18 - 1, arg17 - 1, 117) > 0) {
                                                b2 = false;
                                            }
                                            if (this.d(arg18 + 1, arg17 + 1, 110) > 0) {
                                                b2 = false;
                                            }
                                            if (!b2) {
                                                this.kb.a(3, new int[] { this.kb.e(n37, n40, n49, -114), this.kb.e(n41, n38, n52, 101), this.kb.e(n35, n36, n53, -126) }, n50, 12345678, false);
                                                this.kb.a(3, new int[] { this.kb.e(n39, n42, n51, -107), this.kb.e(n35, n36, n53, 63), this.kb.e(n41, n38, n52, 44) }, n50, 12345678, false);
                                            }
                                            else {
                                                this.kb.a(3, new int[] { this.kb.e(n35, n36, n53, -112), this.kb.e(n37, n40, n49, -118), this.kb.e(n39, n42, n51, 103) }, n50, 12345678, false);
                                                this.kb.a(3, new int[] { this.kb.e(n41, n38, n52, -128), this.kb.e(n39, n42, n51, -119), this.kb.e(n37, n40, n49, 52) }, n50, 12345678, false);
                                            }
                                        }
                                        else {
                                            this.kb.a(4, new int[] { this.kb.e(n39, n42, n51, -104), this.kb.e(n35, n36, n53, 23), this.kb.e(n37, n40, n49, 91), this.kb.e(n41, n38, n52, 13) }, n50, 12345678, false);
                                        }
                                    }
                                    else {
                                        this.kb.a(4, new int[] { this.kb.e(n35, n36, n53, 78), this.kb.e(n37, n40, n49, 46), this.kb.e(n41, n38, n52, -113), this.kb.e(n39, n42, n51, -125) }, n50, 12345678, false);
                                    }
                                }
                                else {
                                    this.kb.a(3, new int[] { this.kb.e(n37, n40, n49, 121), this.kb.e(n41, n38, n52, 39), this.kb.e(n35, n36, n53, 73) }, n50, 12345678, false);
                                }
                            }
                            else {
                                this.kb.a(3, new int[] { this.kb.e(n39, n42, n51, -107), this.kb.e(n35, n36, n53, -122), this.kb.e(n41, n38, n52, 35) }, n50, 12345678, false);
                            }
                        }
                        else {
                            this.kb.a(3, new int[] { this.kb.e(n41, n38, n52, -120), this.kb.e(n39, n42, n51, -116), this.kb.e(n37, n40, n49, 117) }, n50, 12345678, false);
                        }
                    }
                }
            }
            this.kb.a(-50, 50, -10, -50, true, 50, -98);
            this.db[arg3] = this.kb.a(0, 8, 1536, -112, 64, 169, 1536, true, 0);
            for (int n54 = 0; n54 < 64; ++n54) {
                this.c.a(this.db[arg3][n54], (byte)118);
            }
            if (this.db[arg3][0] == null) {
                throw new RuntimeException("null roof!");
            }
            for (int n55 = 0; n55 < 96; ++n55) {
                for (int n56 = 0; n56 < 96; ++n56) {
                    if (this.ab[n55][n56] >= 80000) {
                        final int[] array7 = this.ab[n55];
                        final int n57 = n56;
                        array7[n57] -= 80000;
                    }
                }
            }
        }
        catch (final RuntimeException arg27) {
            throw i.a(arg27, "k.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }
    
    private final int d(int arg0, int arg1, final int arg2) {
        if (arg1 < 0 || arg1 >= 96 || arg0 < 0 || arg0 >= 96) {
            return 0;
        }
        int n = 0;
        if (arg2 < 99) {
            this.E = null;
        }
        if (arg1 >= 48 && arg0 < 48) {
            n = 1;
            arg1 -= 48;
        }
        else if (arg1 < 48 && arg0 >= 48) {
            n = 2;
            arg0 -= 48;
        }
        else if (arg1 >= 48 && arg0 >= 48) {
            n = 3;
            arg1 -= 48;
            arg0 -= 48;
        }
        return this.A[n][arg0 + arg1 * 48];
    }
    
    private final void b(final int arg0, final byte arg1, final int arg2, final int arg3) {
        final int n = arg2 / 12;
        final int n2 = arg3 / 12;
        final int n3 = (arg2 - 1) / 12;
        final int n4 = (arg3 - 1) / 12;
        this.a(arg3, arg0, n2, 2, n, arg2);
        if (n3 != n) {
            this.a(arg3, arg0, n2, 2, n3, arg2);
        }
        if (n4 != n2) {
            this.a(arg3, arg0, n4, 2, n, arg2);
        }
        if (n3 != n && n4 != n2) {
            this.a(arg3, arg0, n4, 2, n3, arg2);
        }
        if (arg1 <= 23) {
            this.c(122, -121, -56, -127, -62);
        }
    }
    
    private final int d(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg2 != 15282) {
            this.m = null;
        }
        final int b = this.b(arg0, arg3, arg2 - 15278, arg1);
        if (b == 0) {
            return -1;
        }
        if (da.N[b - 1] != 2) {
            return 0;
        }
        return 1;
    }
    
    private final void c(final int arg0, final int arg1, final int arg2, final int arg3) {
        this.bb[arg2][arg0] = ib.a(this.bb[arg2][arg0], arg1 - arg3);
    }
    
    private final void a(final int arg0, final int arg1, final byte arg2, final int arg3) {
        this.bb[arg3][arg1] = d.a(this.bb[arg3][arg1], arg0);
        if (arg2 >= -47) {
            this.eb = null;
        }
    }
    
    final void a(final ca[] arg0, final byte arg1) {
        for (int i = 0; i < 94; ++i) {
            for (int j = 0; j < 94; ++j) {
                if (this.c(i, j, -49) > 48000) {
                    if (this.c(i, j, -49) < 60000) {
                        final int arg2 = this.c(i, j, -49) - 48001;
                        final int b = this.b(i, j, -91);
                        int n;
                        int n2;
                        if (b != 0 && b != 4) {
                            n = ub.g[arg2];
                            n2 = f.f[arg2];
                        }
                        else {
                            n2 = ub.g[arg2];
                            n = f.f[arg2];
                        }
                        this.a(i, arg2, false, j);
                        final ca a = arg0[fb.f[arg2]].a(false, -120, false, false, true);
                        final int n3 = 128 * (n + i + i) / 2;
                        final int n4 = (n2 + j + j) * 128 / 2;
                        a.a(n3, n4, -this.f(n3, n4, 74), true);
                        a.g(0, -999999, 0, this.b(i, j, -78) * 32);
                        this.c.a(a, (byte)118);
                        a.a(48, 48, -10, arg1 ^ 0x9, -50, -50);
                        if (n > 1 || n2 > 1) {
                            for (int arg3 = i; i + n > arg3; ++arg3) {
                                for (int arg4 = j; n2 + j > arg4; ++arg4) {
                                    if (i < arg3 || arg4 > j) {
                                        if (arg2 == this.c(arg3, arg4, arg1 + 64) - 48001) {
                                            int n5 = arg4;
                                            int n6 = arg3;
                                            int n7 = 0;
                                            if (n6 < 48 || n5 >= 48) {
                                                if (n6 >= 48 || n5 < 48) {
                                                    if (n6 >= 48) {
                                                        if (n5 >= 48) {
                                                            n7 = 3;
                                                            n5 -= 48;
                                                            n6 -= 48;
                                                        }
                                                    }
                                                }
                                                else {
                                                    n7 = 2;
                                                    n5 -= 48;
                                                }
                                            }
                                            else {
                                                n6 -= 48;
                                                n7 = 1;
                                            }
                                            this.s[n7][n6 * 48 + n5] = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -113) {
            this.b(-116, 16, 84);
        }
    }
    
    private final int g(final int arg0, int arg1, int arg2) {
        if (arg2 < 0 || arg2 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        int n = 0;
        if (arg0 != 2) {
            return 79;
        }
        if (arg2 >= 48 && arg1 < 48) {
            n = 1;
            arg2 -= 48;
        }
        else if (arg2 < 48 && arg1 >= 48) {
            arg1 -= 48;
            n = 2;
        }
        else if (arg2 >= 48 && arg1 >= 48) {
            n = 3;
            arg1 -= 48;
            arg2 -= 48;
        }
        return (0xFF & this.L[n][48 * arg2 - -arg1]) * 3;
    }
    
    final void a(final boolean arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        if (arg3 < 0 || arg2 < 0 || arg3 >= 95 || arg2 >= 95) {
            return;
        }
        if (u.a[arg4] == 1) {
            if (arg1 == 0) {
                this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65534);
                if (arg2 > 0) {
                    this.c(arg2 - 1, 65535, arg3, 4);
                }
            }
            else if (arg1 == 1) {
                this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65533);
                if (arg3 > 0) {
                    this.c(arg2, 65535, arg3 - 1, 8);
                }
            }
            else if (arg1 == 2) {
                this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65519);
            }
            else if (arg1 == 3) {
                this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65503);
            }
            this.c(1, 1, -59, arg3, arg2);
        }
        if (!arg0) {
            this.U = null;
        }
    }
    
    final void a(final int arg0, final byte arg1, final int arg2, final int arg3) {
        this.b(arg1 ^ 0x2791);
        final int n = (24 + arg0) / 48;
        if (arg1 != -90) {
            this.c(58, -126, -4);
        }
        this.a(arg0, 122, true, arg3, arg2);
        final int n2 = (24 + arg2) / 48;
        if (arg3 == 0) {
            this.a(arg0, 112, false, 1, arg2);
            this.a(arg0, arg1 ^ 0xFFFFFFE3, false, 2, arg2);
            this.b(arg3, 0, n - 1, 0, n2 - 1);
            this.b(arg3, 1, n, arg1 + 90, n2 - 1);
            this.b(arg3, 2, n - 1, 0, n2);
            this.b(arg3, 3, n, arg1 + 90, n2);
            this.a(0);
        }
    }
    
    private final void a(final int arg0, final int arg1, final int arg2, final int arg3, final byte arg4, final int arg5) {
        final int n = ib.d[arg0];
        if (this.ab[arg5][arg2] < 80000) {
            final int[] array = this.ab[arg5];
            array[arg2] += n + 80000;
        }
        if (this.ab[arg1][arg3] < 80000) {
            final int[] array2 = this.ab[arg1];
            array2[arg3] += n + 80000;
        }
    }
    
    final int a(final int[] arg0, final int arg1, final byte arg2, final int arg3, final int[] arg4, final int arg5, final int arg6, final int arg7, final int arg8, final boolean arg9) {
        for (int i = 0; i < 96; ++i) {
            for (int j = 0; j < 96; ++j) {
                this.B[i][j] = 0;
            }
        }
        int k = 0;
        int n = 0;
        int n2 = arg5;
        int n3 = arg6;
        this.B[arg5][arg6] = 99;
        arg0[k] = arg5;
        arg4[k++] = arg6;
        final int length = arg0.length;
        boolean b = false;
        while (k != n) {
            n2 = arg0[n];
            n3 = arg4[n];
            n = (1 + n) % length;
            if (arg1 <= n2 && arg7 >= n2 && arg8 <= n3 && n3 <= arg3) {
                b = true;
                break;
            }
            if (arg9) {
                if (n2 > 0 && arg1 <= n2 - 1 && n2 - 1 <= arg7 && arg8 <= n3 && arg3 >= n3 && (this.bb[n2 - 1][n3] & 0x8) == 0x0) {
                    b = true;
                    break;
                }
                if (n2 < 95 && arg1 <= 1 + n2 && n2 + 1 <= arg7 && arg8 <= n3 && n3 <= arg3 && (0x2 & this.bb[n2 + 1][n3]) == 0x0) {
                    b = true;
                    break;
                }
                if (n3 > 0 && n2 >= arg1 && arg7 >= n2 && arg8 <= n3 - 1 && n3 - 1 <= arg3 && (0x4 & this.bb[n2][n3 - 1]) == 0x0) {
                    b = true;
                    break;
                }
                if (n3 < 95 && n2 >= arg1 && n2 <= arg7 && n3 + 1 >= arg8 && n3 + 1 <= arg3 && (0x1 & this.bb[n2][n3 + 1]) == 0x0) {
                    b = true;
                    break;
                }
            }
            if (n2 > 0 && this.B[n2 - 1][n3] == 0 && (this.bb[n2 - 1][n3] & 0x78) == 0x0) {
                arg0[k] = n2 - 1;
                arg4[k] = n3;
                this.B[n2 - 1][n3] = 2;
                k = (k + 1) % length;
            }
            if (n2 < 95 && this.B[1 + n2][n3] == 0) {
                if ((this.bb[1 + n2][n3] & 0x72) == 0x0) {
                    arg0[k] = 1 + n2;
                    arg4[k] = n3;
                    this.B[n2 + 1][n3] = 8;
                    k = (1 + k) % length;
                }
            }
            if (n3 > 0 && this.B[n2][n3 - 1] == 0) {
                if ((0x74 & this.bb[n2][n3 - 1]) == 0x0) {
                    arg0[k] = n2;
                    arg4[k] = n3 - 1;
                    this.B[n2][n3 - 1] = 1;
                    k = (k + 1) % length;
                }
            }
            if (n3 < 95 && this.B[n2][1 + n3] == 0 && (0x71 & this.bb[n2][1 + n3]) == 0x0) {
                arg0[k] = n2;
                arg4[k] = n3 + 1;
                this.B[n2][n3 + 1] = 4;
                k = (k + 1) % length;
            }
            if (n2 > 0 && n3 > 0 && (0x74 & this.bb[n2][n3 - 1]) == 0x0 && (0x78 & this.bb[n2 - 1][n3]) == 0x0 && (0x7C & this.bb[n2 - 1][n3 - 1]) == 0x0) {
                if (this.B[n2 - 1][n3 - 1] == 0) {
                    arg0[k] = n2 - 1;
                    arg4[k] = n3 - 1;
                    this.B[n2 - 1][n3 - 1] = 3;
                    k = (1 + k) % length;
                }
            }
            if (n2 < 95 && n3 > 0 && (this.bb[n2][n3 - 1] & 0x74) == 0x0 && (this.bb[1 + n2][n3] & 0x72) == 0x0 && (this.bb[n2 + 1][n3 - 1] & 0x76) == 0x0) {
                if (this.B[1 + n2][n3 - 1] == 0) {
                    arg0[k] = 1 + n2;
                    arg4[k] = n3 - 1;
                    this.B[n2 + 1][n3 - 1] = 9;
                    k = (1 + k) % length;
                }
            }
            if (n2 > 0 && n3 < 95 && (this.bb[n2][1 + n3] & 0x71) == 0x0 && (this.bb[n2 - 1][n3] & 0x78) == 0x0 && (this.bb[n2 - 1][1 + n3] & 0x79) == 0x0 && this.B[n2 - 1][1 + n3] == 0) {
                arg0[k] = n2 - 1;
                arg4[k] = 1 + n3;
                k = (1 + k) % length;
                this.B[n2 - 1][n3 + 1] = 6;
            }
            if (n2 >= 95 || n3 >= 95 || (0x71 & this.bb[n2][1 + n3]) != 0x0 || (this.bb[n2 + 1][n3] & 0x72) != 0x0 || (0x73 & this.bb[n2 + 1][1 + n3]) != 0x0 || this.B[n2 + 1][1 + n3] != 0) {
                continue;
            }
            arg0[k] = 1 + n2;
            arg4[k] = 1 + n3;
            this.B[1 + n2][1 + n3] = 12;
            k = (k + 1) % length;
        }
        if (arg2 > -48) {
            return -42;
        }
        if (b) {
            int n4 = 0;
            arg0[n4] = n2;
            arg4[n4++] = n3;
            int n6;
            int n5 = n6 = this.B[n2][n3];
            while (arg5 != n2 || arg6 != n3) {
                if (n5 != n6) {
                    n5 = n6;
                    arg0[n4] = n2;
                    arg4[n4++] = n3;
                }
                if ((n6 & 0x1) == 0x0) {
                    if ((0x4 & n6) != 0x0) {
                        --n3;
                    }
                }
                else {
                    ++n3;
                }
                if ((0x2 & n6) == 0x0) {
                    if ((n6 & 0x8) != 0x0) {
                        --n2;
                    }
                }
                else {
                    ++n2;
                }
                n6 = this.B[n2][n3];
            }
            return n4;
        }
        return -1;
    }
    
    final int f(final int arg0, final int arg1, final int arg2) {
        final int arg3 = arg0 >> 7;
        final int arg4 = arg1 >> 7;
        int n = 0x7F & arg0;
        int n2 = 0x7F & arg1;
        if (arg3 < 0 || arg4 < 0 || arg3 >= 95 || arg4 >= 95) {
            return 0;
        }
        int n3;
        int n4;
        int n5;
        if (n <= 128 + -n2) {
            n3 = this.g(2, arg4, arg3);
            n4 = this.g(2, arg4, 1 + arg3) + -n3;
            n5 = -n3 + this.g(2, 1 + arg4, arg3);
        }
        else {
            n3 = this.g(2, arg4 + 1, 1 + arg3);
            n4 = -n3 + this.g(2, arg4 + 1, arg3);
            n5 = -n3 + this.g(2, arg4, 1 + arg3);
            n = -n + 128;
            n2 = 128 + -n2;
        }
        return n5 * n2 / 128 + (n3 - -(n4 * n / 128));
    }
    
    private final void c(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        if (arg3 >= 1 && arg4 >= 1 && arg0 + arg3 < 96 && arg1 + arg4 < 96) {
            for (int i = arg3; i <= arg0 + arg3; ++i) {
                for (int j = arg4; j <= arg4 - -arg1; ++j) {
                    if ((0x63 & this.b((byte)(-38), j, i)) == 0x0 && (0x59 & this.b((byte)(-38), j, i - 1)) == 0x0 && (this.b((byte)(-38), j - 1, i) & 0x56) == 0x0 && (this.b((byte)(-38), j - 1, i - 1) & 0x6C) == 0x0) {
                        this.b(0, (byte)118, i, j);
                    }
                    else {
                        this.b(35, (byte)50, i, j);
                    }
                }
            }
        }
    }
    
    private final int a(final byte arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= 96 || arg2 < 0 || arg2 >= 96) {
            return 0;
        }
        int n = 0;
        if (arg0 != 104) {
            return -59;
        }
        if (arg1 >= 48 && arg2 < 48) {
            arg1 -= 48;
            n = 1;
        }
        else if (arg1 < 48 && arg2 >= 48) {
            n = 2;
            arg2 -= 48;
        }
        else if (arg1 >= 48 && arg2 >= 48) {
            arg1 -= 48;
            n = 3;
            arg2 -= 48;
        }
        return this.eb[n][arg2 + 48 * arg1] & 0xFF;
    }
    
    private final boolean a(final int arg0, final int arg1, final int arg2) {
        return arg1 == 26431 && (this.d(arg2, arg0, 119) > 0 || this.d(arg2, arg0 - 1, 110) > 0 || this.d(arg2 - 1, arg0 - 1, 109) > 0 || this.d(arg2 - 1, arg0, arg1 - 26318) > 0);
    }
    
    private final int d(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        if (arg0 != -8509) {
            return 58;
        }
        final int b = this.b(arg3, arg1, arg0 + 8513, arg4);
        if (b != 0) {
            return qa.K[b - 1];
        }
        return arg2;
    }
    
    private final int c(int arg0, int arg1, final int arg2) {
        if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        int n = 0;
        if (~arg0 > arg2 || arg1 >= 48) {
            if (arg0 >= 48 || arg1 < 48) {
                if (arg0 >= 48 && arg1 >= 48) {
                    arg1 -= 48;
                    n = 3;
                    arg0 -= 48;
                }
            }
            else {
                n = 2;
                arg1 -= 48;
            }
        }
        else {
            arg0 -= 48;
            n = 1;
        }
        return this.s[n][arg0 * 48 + arg1];
    }
    
    private final void b(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        if (arg3 != 0) {
            return;
        }
        final String string = "m" + arg0 + arg2 / 10 + arg2 % 10 + arg4 / 10 + arg4 % 10;
        try {
            if (this.Q != null) {
                byte[] array = na.a(string + ".hei", 0, this.Q, -126);
                if (array == null) {
                    if (this.I != null) {
                        array = na.a(string + ".hei", 0, this.I, -125);
                    }
                }
                if (array != null && array.length > 0) {
                    int n = 0;
                    int n2 = 0;
                    int i = 0;
                    while (i < 2304) {
                        final int n3 = array[n++] & 0xFF;
                        if (n3 < 128) {
                            n2 = n3;
                            this.L[arg1][i++] = (byte)n3;
                        }
                        if (n3 < 128) {
                            continue;
                        }
                        for (int n4 = 0; n3 - 128 > n4; ++n4) {
                            this.L[arg1][i++] = (byte)n2;
                        }
                    }
                    int n5 = 64;
                    for (int j = 0; j < 48; ++j) {
                        for (int k = 0; k < 48; ++k) {
                            n5 = (0x7F & n5 + this.L[arg1][k * 48 - -j]);
                            this.L[arg1][j + k * 48] = (byte)(n5 * 2);
                        }
                    }
                    int n6 = 0;
                    int l = 0;
                    while (l < 2304) {
                        final int n7 = 0xFF & array[n++];
                        if (n7 < 128) {
                            n6 = n7;
                            this.eb[arg1][l++] = (byte)n7;
                        }
                        if (n7 < 128) {
                            continue;
                        }
                        for (int n8 = 0; n8 < n7 - 128; ++n8) {
                            this.eb[arg1][l++] = (byte)n6;
                        }
                    }
                    int n9 = 35;
                    for (int n10 = 0; n10 < 48; ++n10) {
                        for (int n11 = 0; n11 < 48; ++n11) {
                            n9 = (0x7F & n9 + this.eb[arg1][n10 + 48 * n11]);
                            this.eb[arg1][n10 + 48 * n11] = (byte)(2 * n9);
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < 2304; ++n12) {
                        this.L[arg1][n12] = 0;
                        this.eb[arg1][n12] = 0;
                    }
                }
                byte[] array2 = na.a(string + ".dat", 0, this.gb, -125);
                if (array2 == null && this.m != null) {
                    array2 = na.a(string + ".dat", 0, this.m, arg3 ^ 0xFFFFFF83);
                }
                if (array2 == null || array2.length == 0) {
                    throw new IOException();
                }
                int n13 = 0;
                for (int n14 = 0; n14 < 2304; ++n14) {
                    this.f[arg1][n14] = array2[n13++];
                }
                for (int n15 = 0; n15 < 2304; ++n15) {
                    this.P[arg1][n15] = array2[n13++];
                }
                for (int n16 = 0; n16 < 2304; ++n16) {
                    this.s[arg1][n16] = ib.a(255, array2[n13++]);
                }
                for (int n17 = 0; n17 < 2304; ++n17) {
                    final int n18 = 0xFF & array2[n13++];
                    if (n18 > 0) {
                        this.s[arg1][n17] = n18 + 12000;
                    }
                }
                int n20;
                for (int n19 = 0; n19 < 2304; this.A[arg1][n19++] = (byte)n20) {
                    n20 = (array2[n13++] & 0xFF);
                    if (n20 >= 128) {
                        for (int n21 = 0; n20 - 128 > n21; ++n21) {
                            this.A[arg1][n19++] = 0;
                        }
                    }
                }
                int n22 = 0;
                int n24;
                for (int n23 = 0; n23 < 2304; this.R[arg1][n23++] = (byte)n24, n22 = n24) {
                    n24 = (array2[n13++] & 0xFF);
                    if (n24 >= 128) {
                        for (int n25 = 0; n24 - 128 > n25; ++n25) {
                            this.R[arg1][n23++] = (byte)n22;
                        }
                    }
                }
                int n27;
                for (int n26 = 0; n26 < 2304; this.mb[arg1][n26++] = (byte)n27) {
                    n27 = (0xFF & array2[n13++]);
                    if (n27 >= 128) {
                        for (int n28 = 0; n28 < n27 - 128; ++n28) {
                            this.mb[arg1][n26++] = 0;
                        }
                    }
                }
                final byte[] a = na.a(string + ".loc", 0, this.gb, -127);
                if (a != null) {
                    if (a.length > 0) {
                        int n29 = 0;
                        int n30 = 0;
                        while (n30 < 2304) {
                            final int n31 = a[n29++] & 0xFF;
                            if (n31 < 128) {
                                this.s[arg1][n30++] = 48000 + n31;
                            }
                            else {
                                n30 += n31 - 128;
                            }
                        }
                    }
                }
            }
            else {
                final byte[] arg5 = new byte[20736];
                ta.a("../gamedata/maps/" + string + ".jm", arg3 ^ 0xFFFFB325, arg5, 20736);
                int n32 = 0;
                int n33 = 0;
                for (int n34 = 0; n34 < 2304; ++n34) {
                    n32 = (0xFF & n32 - -arg5[n33++]);
                    this.L[arg1][n34] = (byte)n32;
                }
                int n35 = 0;
                for (int n36 = 0; n36 < 2304; ++n36) {
                    n35 = (0xFF & n35 + arg5[n33++]);
                    this.eb[arg1][n36] = (byte)n35;
                }
                for (int n37 = 0; n37 < 2304; ++n37) {
                    this.f[arg1][n37] = arg5[n33++];
                }
                for (int n38 = 0; n38 < 2304; ++n38) {
                    this.P[arg1][n38] = arg5[n33++];
                }
                for (int n39 = 0; n39 < 2304; ++n39) {
                    this.s[arg1][n39] = ib.a(255, arg5[1 + n33]) + ib.a(arg5[n33], 255) * 256;
                    n33 += 2;
                }
                for (int n40 = 0; n40 < 2304; ++n40) {
                    this.A[arg1][n40] = arg5[n33++];
                }
                for (int n41 = 0; n41 < 2304; ++n41) {
                    this.R[arg1][n41] = arg5[n33++];
                }
                for (int n42 = 0; n42 < 2304; ++n42) {
                    this.mb[arg1][n42] = arg5[n33++];
                }
            }
        }
        catch (final IOException ex) {
            for (int n43 = 0; n43 < 2304; ++n43) {
                this.L[arg1][n43] = 0;
                this.eb[arg1][n43] = 0;
                this.f[arg1][n43] = 0;
                this.P[arg1][n43] = 0;
                this.s[arg1][n43] = 0;
                this.A[arg1][n43] = 0;
                this.R[arg1][n43] = 0;
                if (arg0 == 0) {
                    this.R[arg1][n43] = -6;
                }
                if (arg0 == 3) {
                    this.R[arg1][n43] = 8;
                }
                this.mb[arg1][n43] = 0;
            }
        }
    }
    
    final int b(int arg0, int arg1, final int arg2) {
        if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        if (arg2 > -68) {
            return -68;
        }
        int n = 0;
        if (arg0 < 48 || arg1 >= 48) {
            if (arg0 >= 48 || arg1 < 48) {
                if (arg0 >= 48 && arg1 >= 48) {
                    arg0 -= 48;
                    arg1 -= 48;
                    n = 3;
                }
            }
            else {
                arg1 -= 48;
                n = 2;
            }
        }
        else {
            arg0 -= 48;
            n = 1;
        }
        return this.mb[n][arg1 + arg0 * 48];
    }
    
    private final void a(final int arg0, final byte arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        final int n = arg3 * 3;
        final int n2 = arg4 * 3;
        final int arg6 = this.c.a(arg5, true) >> 1 & 0x7F7F7F;
        final int arg7 = (0xFEFEFF & this.c.a(arg2, true)) >> 1;
        if (arg0 == 0) {
            this.U.b(3, arg6, n, n2, (byte)109);
            this.U.b(2, arg6, n, 1 + n2, (byte)(-65));
            this.U.b(1, arg6, n, n2 + 2, (byte)99);
            this.U.b(1, arg7, 2 + n, n2 + 1, (byte)73);
            this.U.b(2, arg7, n + 1, n2 + 2, (byte)113);
        }
        else if (arg0 == 1) {
            this.U.b(3, arg7, n, n2, (byte)55);
            this.U.b(2, arg7, 1 + n, 1 + n2, (byte)62);
            this.U.b(1, arg7, n + 2, n2 + 2, (byte)56);
            this.U.b(1, arg6, n, n2 + 1, (byte)70);
            this.U.b(2, arg6, n, 2 + n2, (byte)(-85));
        }
    }
    
    private final int b(final byte arg0, final int arg1, final int arg2) {
        if (arg0 != -38) {
            this.B = null;
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= 96 || arg1 >= 96) {
            return 0;
        }
        return this.bb[arg2][arg1];
    }
    
    private final int b(final int arg0, int arg1, final int arg2, int arg3) {
        if (arg1 < 0 || arg1 >= 96 || arg3 < 0 || arg3 >= 96) {
            return 0;
        }
        int n = 0;
        if (arg1 < 48 || arg3 >= 48) {
            if (arg1 < 48 && arg3 >= 48) {
                arg3 -= 48;
                n = 2;
            }
            else if (arg1 >= 48) {
                if (arg3 >= 48) {
                    arg3 -= 48;
                    arg1 -= 48;
                    n = 3;
                }
            }
        }
        else {
            arg1 -= 48;
            n = 1;
        }
        if (arg2 != 4) {
            return -4;
        }
        return 0xFF & this.R[n][48 * arg1 + arg3];
    }
    
    private final int a(int arg0, final byte arg1, int arg2) {
        if (arg0 >= 0 && arg0 < 96 && arg2 >= 0 && arg2 < 96) {
            int n = 0;
            if (arg0 >= 48 && arg2 < 48) {
                arg0 -= 48;
                n = 1;
            }
            else if (arg0 < 48 && arg2 >= 48) {
                arg2 -= 48;
                n = 2;
            }
            else if (arg0 >= 48 && arg2 >= 48) {
                arg2 -= 48;
                arg0 -= 48;
                n = 3;
            }
            return 0xFF & this.P[n][arg0 * 48 - -arg2];
        }
        return 0;
    }
    
    private final void a(final int arg0, final ca arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6) {
        this.b(40, (byte)50, arg4, arg3);
        this.b(40, (byte)109, arg2, arg6);
        final int n = ib.d[arg0];
        final int arg7 = v.a[arg0];
        if (arg5 != -14584) {
            this.a((byte)(-62), 104, -113);
        }
        final int arg8 = client.Jk[arg0];
        final int n2 = 128 * arg4;
        final int n3 = 128 * arg3;
        final int n4 = 128 * arg2;
        final int n5 = arg6 * 128;
        final int a = arg1.a(4, new int[] { arg1.e(n2, n3, -this.ab[arg4][arg3], -111), arg1.e(n2, n3, -this.ab[arg4][arg3] + -n, -115), arg1.e(n4, n5, -n + -this.ab[arg2][arg6], -125), arg1.e(n4, n5, -this.ab[arg2][arg6], arg5 ^ 0xFFFFC757) }, arg7, arg8, false);
        if (lb.Tb[arg0] == 5) {
            arg1.E[a] = 30000 + arg0;
        }
        else {
            arg1.E[a] = 0;
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        if (arg3 >= 0 && arg0 >= 0 && arg3 < 95 && arg0 < 95) {
            if (arg4 != 11715) {
                this.s = null;
            }
            if (u.a[arg1] == 1) {
                if (arg2 == 0) {
                    this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 1);
                    if (arg0 > 0) {
                        this.a(4, arg0 - 1, (byte)(-96), arg3);
                    }
                }
                else if (arg2 == 1) {
                    this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 2);
                    if (arg3 > 0) {
                        this.a(8, arg0, (byte)(-89), arg3 - 1);
                    }
                }
                else if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 32);
                    }
                }
                else {
                    this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 16);
                }
                this.c(1, 1, 62, arg3, arg0);
            }
        }
    }
    
    private final boolean a(final boolean arg0, final int arg1, final int arg2) {
        return (this.d(arg2, arg1, 114) > 0 && this.d(arg2, arg1 - 1, 122) > 0 && this.d(arg2 - 1, arg1 - 1, 117) > 0 && this.d(arg2 - 1, arg1, 122) > 0) || arg0;
    }
    
    private final int e(final int arg0, int arg1, int arg2) {
        if (arg1 >= 0 && arg1 < 96 && arg2 >= 0 && arg2 < 96) {
            int n = 0;
            if (arg1 < 48 || arg2 >= 48) {
                if (arg1 >= 48 || arg2 < 48) {
                    if (arg1 >= 48) {
                        if (arg2 >= 48) {
                            arg2 -= 48;
                            arg1 -= 48;
                            n = 3;
                        }
                    }
                }
                else {
                    n = 2;
                    arg2 -= 48;
                }
            }
            else {
                arg1 -= 48;
                n = 1;
            }
            return 0xFF & this.f[n][arg1 * 48 + arg2];
        }
        return 0;
    }
    
    k(final lb arg0, final ua arg1) {
        super();
        this.H = false;
        this.ab = new int[96][96];
        this.mb = new byte[4][2304];
        this.P = new byte[4][2304];
        this.R = new byte[4][2304];
        this.w = new int[256];
        this.B = new int[96][96];
        this.f = new byte[4][2304];
        this.E = new int[18432];
        this.nb = true;
        this.x = 750;
        this.g = new ca[4][64];
        this.L = new byte[4][2304];
        this.F = new ca[64];
        this.s = new int[4][2304];
        this.A = new byte[4][2304];
        this.Z = false;
        this.bb = new int[96][96];
        this.db = new ca[4][64];
        this.eb = new byte[4][2304];
        this.q = new int[18432];
        this.U = arg1;
        this.c = arg0;
        for (int i = 0; i < 64; ++i) {
            this.w[i] = da.a(255 + -(i * 4), (byte)(-66), -(4 * i) + 255, 255 - (int)(i * 1.75));
        }
        for (int j = 0; j < 64; ++j) {
            this.w[64 + j] = da.a(0, (byte)(-66), 3 * j, 144);
        }
        for (int k = 0; k < 64; ++k) {
            this.w[128 + k] = da.a(0, (byte)(-66), 192 - (int)(k * 1.5), -(int)(k * 1.5) + 144);
        }
        for (int l = 0; l < 64; ++l) {
            this.w[192 + l] = da.a(0, (byte)(-66), 96 - (int)(l * 1.5), (int)(l * 1.5) + 48);
        }
    }
    
    static {
        k.G = new String[100];
        k.e = 0L;
    }
}
