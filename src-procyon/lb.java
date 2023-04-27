final class lb
{
    static String[] ac;
    private int wb;
    private int Wb;
    private int Xb;
    private int[] H;
    private int[] J;
    private int nb;
    private int[] Qb;
    private int ab;
    private n[] x;
    private int[] Vb;
    private int Zb;
    private int xb;
    private int[][] i;
    private ua dc;
    private int[] jb;
    private int bc;
    private int[] Q;
    private int o;
    private int e;
    private w[] y;
    private ca[] Ab;
    private int ib;
    private int u;
    private int[] pb;
    private int I;
    private int[] ob;
    int G;
    private int zb;
    private boolean f;
    private int[] yb;
    private int[] B;
    private int Kb;
    int Mb;
    ca T;
    private int[] a;
    private int j;
    private byte[][] g;
    static int[] Tb;
    private int[] Hb;
    private int[][] Ib;
    private int cc;
    private int[] qb;
    private int[][] kb;
    private ca[] Z;
    private boolean K;
    private int[][] L;
    private int vb;
    int P;
    private int[][] ec;
    private int[] r;
    private boolean[] S;
    private int[] gb;
    private int[] Ob;
    private int b;
    private int[] Fb;
    private int Nb;
    private int cb;
    private boolean Ub;
    private int h;
    private int eb;
    private int A;
    private int Cb;
    int X;
    private int R;
    private int[] Eb;
    private int[] v;
    private long[] D;
    private int n;
    private int db;
    
    private final int a(final int arg0, final boolean arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        if (arg1) {
            this.a(-74, 87, -109, true);
        }
        if (arg3 == arg0) {
            return arg5;
        }
        return (-arg5 + arg4) * (-arg0 + arg2) / (-arg0 + arg3) + arg5;
    }
    
    private final void a(final int arg0, final int arg1, final w[] arg2, final int arg3) {
        if (arg3 > arg0) {
            int n = arg0 - 1;
            int i = arg3 + 1;
            final int n2 = (arg3 + arg0) / 2;
            final w w = arg2[n2];
            arg2[n2] = arg2[arg0];
            arg2[arg0] = w;
            final int j = w.t;
            while (i > n) {
                do {
                    ++n;
                } while (arg2[n].t > j);
                do {
                    --i;
                } while (j > arg2[i].t);
                if (i <= n) {
                    continue;
                }
                final w w2 = arg2[n];
                arg2[n] = arg2[i];
                arg2[i] = w2;
            }
            this.a(arg0, -1, arg2, i);
            this.a(i + 1, -1, arg2, arg3);
        }
        if (arg1 != -1) {
            this.Qb = null;
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, int arg3, final int arg4, final int arg5) {
        if (arg3 == 0 && arg5 == 0 && arg0 == 0) {
            arg3 = 32;
        }
        for (int i = arg2; i < this.ab; ++i) {
            this.Z[i].a(arg1, arg4, arg5, -115, arg3, arg0);
        }
    }
    
    private final boolean a(final byte arg0, final w arg1, final w arg2) {
        if (arg2.e >= arg1.m) {
            return true;
        }
        if (arg0 > -42) {
            this.c(95, -1);
        }
        if (arg1.e >= arg2.m) {
            return true;
        }
        if (arg2.h >= arg1.j) {
            return true;
        }
        if (arg1.h >= arg2.j) {
            return true;
        }
        if (arg1.q <= arg2.u) {
            return true;
        }
        if (arg2.q < arg1.u) {
            return false;
        }
        final ca o = arg2.o;
        final ca o2 = arg1.o;
        final int i = arg2.i;
        final int j = arg1.i;
        final int[] array = o.o[i];
        final int[] array2 = o2.o[j];
        final int n = o.lb[i];
        final int k = o2.lb[j];
        final int n2 = o2.cc[array2[0]];
        final int n3 = o2.H[array2[0]];
        final int n4 = o2.bb[array2[0]];
        final int r = arg1.r;
        final int l = arg1.l;
        final int m = arg1.k;
        final int n5 = o2.k[j];
        final int s = arg1.s;
        boolean b = false;
        for (final int n7 : array) {
            final int n8 = (-o.bb[n7] + n4) * m + ((n3 + -o.H[n7]) * l + r * (-o.cc[n7] + n2));
            if ((-n5 > n8 && s < 0) || (n5 < n8 && s > 0)) {
                b = true;
                break;
            }
        }
        if (!b) {
            return true;
        }
        boolean b2 = false;
        final int s2 = arg2.s;
        final int n9 = o.H[array[0]];
        final int n10 = o.cc[array[0]];
        final int n11 = o.k[i];
        final int n12 = o.bb[array[0]];
        final int l2 = arg2.l;
        final int k2 = arg2.k;
        final int r2 = arg2.r;
        for (int n13 = 0; k > n13; ++n13) {
            final int n14 = array2[n13];
            final int n15 = (-o2.bb[n14] + n12) * k2 + ((n10 - o2.cc[n14]) * r2 + (n9 - o2.H[n14]) * l2);
            if ((-n11 > n15 && s2 > 0) || (n15 > n11 && s2 < 0)) {
                b2 = true;
                break;
            }
        }
        if (b2) {
            int[] arg3;
            int[] arg4;
            if (n != 2) {
                arg3 = new int[n];
                arg4 = new int[n];
                for (int n16 = 0; n16 < n; ++n16) {
                    final int n17 = array[n16];
                    arg3[n16] = o.pb[n17];
                    arg4[n16] = o.Ob[n17];
                }
            }
            else {
                arg3 = new int[4];
                arg4 = new int[4];
                final int n18 = array[1];
                final int n19 = array[0];
                arg3[0] = o.pb[n19] - 20;
                arg3[1] = o.pb[n18] - 20;
                arg3[2] = 20 + o.pb[n18];
                arg3[3] = o.pb[n19] + 20;
                arg4[0] = (arg4[3] = o.Ob[n19]);
                arg4[1] = (arg4[2] = o.Ob[n18]);
            }
            int[] arg5;
            int[] arg6;
            if (k != 2) {
                arg5 = new int[k];
                arg6 = new int[k];
                for (int n20 = 0; k > n20; ++n20) {
                    final int n21 = array2[n20];
                    arg5[n20] = o2.pb[n21];
                    arg6[n20] = o2.Ob[n21];
                }
            }
            else {
                arg6 = new int[4];
                arg5 = new int[4];
                final int n22 = array2[0];
                final int n23 = array2[1];
                arg5[0] = o2.pb[n22] - 20;
                arg5[1] = o2.pb[n23] - 20;
                arg5[2] = o2.pb[n23] + 20;
                arg5[3] = o2.pb[n22] + 20;
                arg6[0] = (arg6[3] = o2.Ob[n22]);
                arg6[1] = (arg6[2] = o2.Ob[n23]);
            }
            return !this.a(arg5, arg4, arg3, arg6, 1);
        }
        return true;
    }
    
    private final void b(final int arg0, final int arg1) {
        final w w = this.y[arg1];
        final ca o = w.o;
        final int i = w.i;
        final int[] array = o.o[i];
        final int r = 0;
        final int l = 0;
        final int k = 1;
        final int n = o.cc[array[0]];
        final int n2 = o.H[array[0]];
        final int n3 = o.bb[array[0]];
        o.k[i] = 1;
        o.M[i] = 0;
        w.l = l;
        w.r = r;
        w.k = k;
        w.s = n3 * k + (n * r + n2 * l);
        int q;
        int u = q = o.bb[array[0]];
        int n5;
        int n4 = n5 = o.pb[array[0]];
        if (n4 <= o.pb[array[1]]) {
            n5 = o.pb[array[1]];
        }
        else {
            n4 = o.pb[array[1]];
        }
        int h = o.Ob[array[1]];
        int j = o.Ob[array[0]];
        final int n6 = o.bb[array[1]];
        if (q >= n6) {
            if (u > n6) {
                u = n6;
            }
        }
        else {
            q = n6;
        }
        final int n7 = o.pb[array[1]];
        if (n5 >= n7) {
            if (n4 > n7) {
                n4 = n7;
            }
        }
        else {
            n5 = n7;
        }
        final int n8 = o.Ob[array[1]];
        w.m = n5 + 20;
        w.e = n4 - 20;
        if (j < n8) {
            j = n8;
        }
        else if (h > n8) {
            h = n8;
        }
        w.q = q;
        w.u = u;
        w.j = j;
        w.h = h;
    }
    
    final int[] a(final byte arg0) {
        return this.qb;
    }
    
    final void a(final int arg0, final int arg1, final int arg2, int arg3, final int arg4, int arg5, final int arg6, int arg7) {
        arg7 &= 0x3FF;
        arg3 &= 0x3FF;
        arg5 &= 0x3FF;
        this.b = (0x3FF & 1024 - arg7);
        this.Kb = (0x3FF & -arg3 + 1024);
        this.xb = (0x3FF & -arg5 + 1024);
        int n = 0;
        if (arg4 != -12349) {
            return;
        }
        int n2 = 0;
        int n3 = arg2;
        if (arg3 != 0) {
            final int n4 = ba.cc[arg3];
            final int n5 = ba.cc[arg3 + 1024];
            final int n6 = n5 * n2 + -(n4 * n3) >> 15;
            n3 = n4 * n2 + n3 * n5 >> 15;
            n2 = n6;
        }
        if (arg5 != 0) {
            final int n7 = ba.cc[arg5];
            final int n8 = ba.cc[arg5 + 1024];
            final int n9 = n * n8 + n3 * n7 >> 15;
            n3 = n8 * n3 - n7 * n >> 15;
            n = n9;
        }
        if (arg7 != 0) {
            final int n10 = ba.cc[arg7 + 1024];
            final int n11 = ba.cc[arg7];
            final int n12 = n * n10 + n11 * n2 >> 15;
            n2 = -(n11 * n) + n2 * n10 >> 15;
            n = n12;
        }
        this.I = -n3 + arg1;
        this.o = arg6 + -n2;
        this.bc = arg0 + -n;
    }
    
    final int a(int arg0, final boolean arg1) {
        if (arg0 == 12345678) {
            return 0;
        }
        this.b(arg0, arg1);
        if (arg0 >= 0) {
            return this.kb[arg0][0];
        }
        if (arg0 < 0) {
            arg0 = -(arg0 + 1);
            return ((0x1F & arg0) << 3) + (((0x3F4 & arg0) >> 5 << 11) + ((arg0 & 0x7D29) >> 10 << 19));
        }
        return 0;
    }
    
    private final boolean a(final int arg0, final boolean arg1, final int arg2, final byte arg3, final int arg4) {
        if (arg3 != -71) {
            return false;
        }
        if ((arg1 && arg0 >= arg2) || arg2 < arg0) {
            return arg0 < arg4 || !arg1;
        }
        return arg0 > arg4 || arg1;
    }
    
    final void a(final ca arg0, final byte arg1) {
        if (arg1 != 118) {
            this.a(false, null, null);
        }
        if (arg0 == null) {
            System.out.println("Warning tried to add null object!");
        }
        if (this.u > this.ab) {
            this.jb[this.ab] = 0;
            this.Z[this.ab++] = arg0;
        }
    }
    
    private final boolean a(final boolean arg0, final w arg1, final w arg2) {
        final ca o = arg1.o;
        final ca o2 = arg2.o;
        final int i = arg1.i;
        final int j = arg2.i;
        final int[] array = o.o[i];
        final int[] array2 = o2.o[j];
        final int n = o.lb[i];
        final int k = o2.lb[j];
        final int n2 = o2.cc[array2[0]];
        final int n3 = o2.H[array2[0]];
        final int n4 = o2.bb[array2[0]];
        final int r = arg2.r;
        final int l = arg2.l;
        final int m = arg2.k;
        final int n5 = o2.k[j];
        boolean b = false;
        final int s = arg2.s;
        for (final int n7 : array) {
            final int n8 = l * (-o.H[n7] + n3) + (-o.cc[n7] + n2) * r - -((-o.bb[n7] + n4) * m);
            if ((n8 < -n5 && s < 0) || (n8 > n5 && s > 0)) {
                b = true;
                break;
            }
        }
        if (b) {
            final int n9 = o.cc[array[0]];
            final int k2 = arg1.k;
            if (arg0) {
                this.y = null;
            }
            final int n10 = o.k[i];
            final int n11 = o.bb[array[0]];
            final int n12 = o.H[array[0]];
            boolean b2 = false;
            final int r2 = arg1.r;
            final int l2 = arg1.l;
            final int s2 = arg1.s;
            for (int n13 = 0; k > n13; ++n13) {
                final int n14 = array2[n13];
                final int n15 = r2 * (n9 - o2.cc[n14]) - (-(l2 * (-o2.H[n14] + n12)) + -((-o2.bb[n14] + n11) * k2));
                if ((n15 < -n10 && s2 > 0) || (n10 < n15 && s2 < 0)) {
                    b2 = true;
                    break;
                }
            }
            return !b2;
        }
        return true;
    }
    
    private final void a(final int arg0, final byte arg1) {
        int n;
        if (this.Hb[arg0] != 0) {
            n = 128;
        }
        else {
            n = 64;
        }
        final int[] array = this.kb[arg0];
        int i = 0;
        if (arg1 != 118) {
            return;
        }
        for (int j = 0; j < n; ++j) {
            for (int k = 0; k < n; ++k) {
                int n2 = this.L[arg0][this.g[arg0][k + j * n] & 0xFF] & 0xF8F8FF;
                if (n2 != 0) {
                    if (n2 == 16253183) {
                        this.S[arg0] = true;
                        n2 = 0;
                    }
                }
                else {
                    n2 = 1;
                }
                array[i++] = n2;
            }
        }
        for (int n3 = 0; i > n3; ++n3) {
            final int n4 = array[n3];
            array[i - -n3] = ib.a(-(n4 >>> 3) + n4, 16316671);
            array[n3 + 2 * i] = ib.a(-(n4 >>> 2) + n4, 16316671);
            array[n3 + i * 3] = ib.a(-(n4 >>> 3) + n4 + -(n4 >>> 2), 16316671);
        }
    }
    
    final int a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final byte arg7) {
        this.gb[this.n] = arg0;
        this.Fb[this.n] = arg3;
        this.a[this.n] = arg4;
        this.Ob[this.n] = arg1;
        this.ob[this.n] = arg5;
        this.Eb[this.n] = arg6;
        this.Q[this.n] = 0;
        if (arg7 != 109) {
            return -125;
        }
        this.T.a(2, new int[] { this.T.b(false, arg1, arg3, arg4), this.T.b(false, arg1, arg3, -arg6 + arg4) }, 0, 0, false);
        this.T.E[this.n] = arg2;
        this.T.zb[this.n++] = 0;
        return this.n - 1;
    }
    
    private final void a(final int arg0, final int arg1, final int arg2, final w[] arg3) {
        if (arg2 >= -50) {
            this.a((byte)(-98), 32);
        }
        for (int i = 0; i <= arg0; ++i) {
            arg3[i].c = false;
            arg3[i].f = i;
            arg3[i].p = -1;
        }
        int n = 0;
        while (true) {
            if (arg3[n].c) {
                ++n;
            }
            else {
                if (arg0 == n) {
                    break;
                }
                final w w = arg3[n];
                w.c = true;
                int e = n;
                int n2 = n - -arg1;
                if (n2 >= arg0) {
                    n2 = arg0 - 1;
                }
                for (int arg4 = n2; 1 + e <= arg4; --arg4) {
                    final w w2 = arg3[arg4];
                    if (w.e < w2.m && w.m > w2.e && w2.j > w.h && w.j > w2.h && w2.p != w.f && !this.a((byte)(-84), w2, w)) {
                        if (this.a(false, w2, w)) {
                            this.a(e, arg3, arg4, (byte)34);
                            e = this.e;
                            if (arg3[arg4] != w2) {
                                ++arg4;
                            }
                            w2.p = w.f;
                        }
                    }
                }
            }
        }
    }
    
    final void d(final int arg0, final int arg1) {
        if (this.kb[arg1] == null) {
            return;
        }
        final int[] array = this.kb[arg1];
        for (int i = 0; i < 64; ++i) {
            int n = 4032 + i;
            final int n2 = array[n];
            for (int j = 0; j < 63; ++j) {
                array[n] = array[n - 64];
                n -= 64;
            }
            this.kb[arg1][n] = n2;
        }
        if (arg0 != 25013) {
            this.b = 60;
        }
        for (int k = 4096, n3 = 0; k > n3; ++n3) {
            final int n4 = array[n3];
            array[k - -n3] = ib.a(n4 - (n4 >>> 3), 16316671);
            array[n3 + k * 2] = ib.a(16316671, n4 - (n4 >>> 2));
            array[n3 + k * 3] = ib.a(16316671, -(n4 >>> 3) + n4 - (n4 >>> 2));
        }
    }
    
    final int b(final int arg0) {
        if (arg0 != 0) {
            this.S = null;
        }
        return this.cc;
    }
    
    final void a(final byte arg0, final int arg1) {
        if (arg0 != 67) {
            this.cb = 31;
        }
        this.n -= arg1;
        this.T.b(2 * arg1, -113, arg1);
        if (this.n < 0) {
            this.n = 0;
        }
    }
    
    final void b(final int arg0, final int arg1, final int arg2) {
        if (arg0 <= 15) {
            this.kb = null;
        }
        this.Q[arg1] = arg2;
    }
    
    private final boolean a(int arg0, final w[] arg1, int arg2, final byte arg3) {
        while (true) {
            final w arg4 = arg1[arg0];
            for (int n = arg0 + 1; arg2 >= n; ++n) {
                final w arg5 = arg1[n];
                if (!this.a((byte)(-114), arg4, arg5)) {
                    break;
                }
                arg1[arg0] = arg5;
                arg0 = n;
                arg1[n] = arg4;
                if (arg0 == arg2) {
                    this.eb = arg0 - 1;
                    this.e = arg0;
                    return true;
                }
            }
            final w arg6 = arg1[arg2];
            for (int n2 = arg2 - 1; arg0 <= n2; --n2) {
                final w arg7 = arg1[n2];
                if (!this.a((byte)(-46), arg7, arg6)) {
                    break;
                }
                arg1[arg2] = arg7;
                arg1[n2] = arg6;
                arg2 = n2;
                if (arg0 == arg2) {
                    this.eb = arg2;
                    this.e = arg2 + 1;
                    return true;
                }
            }
            if (arg2 <= arg0 + 1) {
                this.eb = arg2;
                this.e = arg0;
                return false;
            }
            if (!this.a(arg0 + 1, arg1, arg2, (byte)70)) {
                this.e = arg0;
                return false;
            }
            arg2 = this.eb;
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3) {
        this.L = new int[arg3][];
        this.g = new byte[arg3][];
        this.kb = new int[arg3][];
        this.i = new int[arg2][];
        this.S = new boolean[arg3];
        k.e = arg0;
        this.cb = arg3;
        this.Hb = new int[arg3];
        this.ec = new int[arg1][];
        this.D = new long[arg3];
    }
    
    private final void a(int arg0, int arg1, int arg2, final boolean arg3) {
        final int n = 1024 + -this.Kb & 0x3FF;
        final int n2 = 0x3FF & 1024 + -this.xb;
        final int n3 = 1024 + -this.b & 0x3FF;
        if (!arg3) {
            this.Zb = 25;
        }
        if (n3 != 0) {
            final int n4 = ba.cc[n3];
            final int n5 = ba.cc[1024 + n3];
            final int n6 = n5 * arg1 + n4 * arg2 >> 15;
            arg2 = -(n4 * arg1) + arg2 * n5 >> 15;
            arg1 = n6;
        }
        if (n != 0) {
            final int n7 = ba.cc[1024 + n];
            final int n8 = ba.cc[n];
            final int n9 = -(n8 * arg0) + arg2 * n7 >> 15;
            arg0 = n7 * arg0 + n8 * arg2 >> 15;
            arg2 = n9;
        }
        if (n2 != 0) {
            final int n10 = ba.cc[n2];
            final int n11 = ba.cc[1024 + n2];
            final int n12 = n10 * arg0 + arg1 * n11 >> 15;
            arg0 = n11 * arg0 - n10 * arg1 >> 15;
            arg1 = n12;
        }
        if (da.K < arg0) {
            da.K = arg0;
        }
        if (arg2 < aa.b) {
            aa.b = arg2;
        }
        if (oa.b < arg1) {
            oa.b = arg1;
        }
        if (nb.y < arg2) {
            nb.y = arg2;
        }
        if (arg0 < m.j) {
            m.j = arg0;
        }
        if (arg1 < aa.f) {
            aa.f = arg1;
        }
    }
    
    final void c(final int arg0, final int arg1) {
        this.T.zb[arg1] = 1;
        if (arg0 != 32768) {
            this.Cb = 32;
        }
    }
    
    final void c(final int arg0) {
        this.f = this.dc.i;
        final int n = this.A * this.Mb >> this.R;
        aa.b = 0;
        nb.y = 0;
        m.j = 0;
        da.K = 0;
        final int n2 = this.Mb * this.wb >> this.R;
        oa.b = 0;
        aa.f = 0;
        this.a(this.Mb, -n, -n2, true);
        this.a(this.Mb, -n, n2, true);
        this.a(this.Mb, n, -n2, true);
        this.a(this.Mb, n, n2, true);
        this.a(0, -this.A, -this.wb, true);
        this.a(0, -this.A, this.wb, true);
        this.a(0, this.A, -this.wb, true);
        this.a(0, this.A, this.wb, true);
        nb.y += this.o;
        da.K += this.I;
        aa.b += this.o;
        aa.f += this.bc;
        m.j += this.I;
        oa.b += this.bc;
        this.Z[this.ab] = this.T;
        this.T.Yb = 2;
        for (int i = 0; i < this.ab; ++i) {
            this.Z[i].a(this.o, this.R, this.bc, (byte)(-122), this.I, this.xb, this.b, this.Kb, this.nb);
        }
        this.Z[this.ab].a(this.o, this.R, this.bc, (byte)(-114), this.I, this.xb, this.b, this.Kb, this.nb);
        this.zb = 0;
        for (int n3 = 0; this.ab > n3; ++n3) {
            final ca o = this.Z[n3];
            if (o.dc) {
                for (int j = 0; o.t > j; ++j) {
                    final int k = o.lb[j];
                    final int[] array = o.o[j];
                    boolean b = false;
                    for (int l = 0; l < k; ++l) {
                        final int n4 = o.bb[array[l]];
                        if (this.nb < n4 && n4 < this.Mb) {
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        int n5 = 0;
                        for (int n6 = 0; n6 < k; ++n6) {
                            final int n7 = o.pb[array[n6]];
                            if (n7 > -this.A) {
                                n5 |= 0x1;
                            }
                            if (n7 < this.A) {
                                n5 |= 0x2;
                            }
                            if (n5 == 3) {
                                break;
                            }
                        }
                        if (n5 == 3) {
                            int n8 = 0;
                            for (int n9 = 0; n9 < k; ++n9) {
                                final int n10 = o.Ob[array[n9]];
                                if (-this.wb < n10) {
                                    n8 |= 0x1;
                                }
                                if (n10 < this.wb) {
                                    n8 |= 0x2;
                                }
                                if (n8 == 3) {
                                    break;
                                }
                            }
                            if (n8 == 3) {
                                final w w = this.y[this.zb];
                                w.o = o;
                                w.i = j;
                                this.a(this.zb, -21875);
                                int b2;
                                if (w.s < 0) {
                                    b2 = o.V[j];
                                }
                                else {
                                    b2 = o.qb[j];
                                }
                                if (b2 != 12345678) {
                                    int n11 = 0;
                                    for (int n12 = 0; k > n12; ++n12) {
                                        n11 += o.bb[array[n12]];
                                    }
                                    w.t = o.hc + n11 / k;
                                    ++this.zb;
                                    w.b = b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > -99) {
            this.H = null;
        }
        final ca t = this.T;
        if (t.dc) {
            for (int m = 0; t.t > m; ++m) {
                final int[] array2 = t.o[m];
                final int n13 = array2[0];
                final int n14 = t.pb[n13];
                final int n15 = t.Ob[n13];
                final int n16 = t.bb[n13];
                if (this.nb < n16 && this.X > n16) {
                    final int n17 = (this.ob[m] << this.R) / n16;
                    final int n18 = (this.Eb[m] << this.R) / n16;
                    if (this.A >= -(n17 / 2) + n14) {
                        if (n14 + n17 / 2 >= -this.A) {
                            if (n15 + -n18 <= this.wb && -this.wb <= n15) {
                                final w w2 = this.y[this.zb];
                                w2.i = m;
                                w2.o = t;
                                this.b(-103, this.zb);
                                w2.t = (t.bb[array2[1]] + n16) / 2;
                                ++this.zb;
                            }
                        }
                    }
                }
            }
        }
        if (this.zb != 0) {
            this.a(0, -1, this.y, this.zb - 1);
            this.a(this.zb, 100, -53, this.y);
            for (int n19 = 0; n19 < this.zb; ++n19) {
                final w w3 = this.y[n19];
                final int i2 = w3.i;
                final ca o2 = w3.o;
                if (o2 != this.T) {
                    int arg = 0;
                    int n20 = 0;
                    final int arg2 = o2.lb[i2];
                    if (o2.Hb[i2] != 12345678) {
                        if (w3.s < 0) {
                            n20 = o2.Jb + -o2.Hb[i2];
                        }
                        else {
                            n20 = o2.Jb - -o2.Hb[i2];
                        }
                    }
                    final int[] array3 = o2.o[i2];
                    for (int n21 = 0; n21 < arg2; ++n21) {
                        final int n22 = array3[n21];
                        this.Qb[n21] = o2.cc[n22];
                        this.Vb[n21] = o2.H[n22];
                        this.J[n21] = o2.bb[n22];
                        if (o2.Hb[i2] == 12345678) {
                            if (w3.s < 0) {
                                n20 = -o2.gb[n22] + (o2.Jb - -o2.Ab[n22]);
                            }
                            else {
                                n20 = o2.Ab[n22] + (o2.Jb - -o2.gb[n22]);
                            }
                        }
                        if (o2.bb[n22] >= this.nb) {
                            this.yb[arg] = o2.pb[n22];
                            this.B[arg] = o2.Ob[n22];
                            this.r[arg] = n20;
                            if (o2.bb[n22] > this.G) {
                                final int[] r = this.r;
                                final int n23 = arg;
                                r[n23] += (-this.G + o2.bb[n22]) / this.P;
                            }
                            ++arg;
                        }
                        else {
                            int n24;
                            if (n21 != 0) {
                                n24 = array3[n21 - 1];
                            }
                            else {
                                n24 = array3[arg2 - 1];
                            }
                            if (this.nb <= o2.bb[n24]) {
                                final int n25 = o2.bb[n22] - o2.bb[n24];
                                final int n26 = o2.H[n22] - (o2.bb[n22] + -this.nb) * (-o2.H[n24] + o2.H[n22]) / n25;
                                this.yb[arg] = (-((-o2.cc[n24] + o2.cc[n22]) * (o2.bb[n22] + -this.nb) / n25) + o2.cc[n22] << this.R) / this.nb;
                                this.B[arg] = (n26 << this.R) / this.nb;
                                this.r[arg] = n20;
                                ++arg;
                            }
                            int n27;
                            if (n21 == arg2 - 1) {
                                n27 = array3[0];
                            }
                            else {
                                n27 = array3[n21 + 1];
                            }
                            if (this.nb <= o2.bb[n27]) {
                                final int n28 = -o2.bb[n27] + o2.bb[n22];
                                final int n29 = o2.H[n22] + -((-this.nb + o2.bb[n22]) * (o2.H[n22] - o2.H[n27]) / n28);
                                this.yb[arg] = (-((o2.cc[n22] + -o2.cc[n27]) * (-this.nb + o2.bb[n22]) / n28) + o2.cc[n22] << this.R) / this.nb;
                                this.B[arg] = (n29 << this.R) / this.nb;
                                this.r[arg] = n20;
                                ++arg;
                            }
                        }
                    }
                    for (int n30 = 0; n30 < arg2; ++n30) {
                        if (this.r[n30] >= 0) {
                            if (this.r[n30] > 255) {
                                this.r[n30] = 255;
                            }
                        }
                        else {
                            this.r[n30] = 0;
                        }
                        if (w3.b >= 0) {
                            if (this.Hb[w3.b] != 1) {
                                final int[] r2 = this.r;
                                final int n31 = n30;
                                r2[n31] <<= 6;
                            }
                            else {
                                final int[] r3 = this.r;
                                final int n32 = n30;
                                r3[n32] <<= 9;
                            }
                        }
                    }
                    this.a(0, i2, this.B, 0, 0, o2, this.yb, this.r, 0, 5960, arg);
                    if (this.Cb > this.Xb) {
                        this.a(this.Vb, o2, 1, arg2, w3.b, this.J, this.Qb, 0, 0);
                    }
                }
                else {
                    final int[] array4 = o2.o[i2];
                    final int n33 = array4[0];
                    final int n34 = o2.pb[n33];
                    final int n35 = o2.Ob[n33];
                    final int n36 = o2.bb[n33];
                    final int arg3 = (this.ob[i2] << this.R) / n36;
                    final int arg4 = (this.Eb[i2] << this.R) / n36;
                    final int n37 = (n35 - o2.Ob[array4[1]]) * (o2.pb[array4[1]] - n34) / arg4;
                    final int arg5 = o2.pb[array4[1]] - n34;
                    final int n38 = n34 - arg3 / 2;
                    final int arg6 = this.Nb - (-n35 - -arg4);
                    this.dc.a((256 << this.R) / n36, this.gb[i2], arg4, n38 - -this.Zb, arg6, arg3, (byte)29, arg5);
                    if (this.K && this.cc < this.db) {
                        final int n39 = n38 + (this.Q[i2] << this.R) / n36;
                        if (arg6 <= this.Wb && this.Wb <= arg6 + arg4 && this.j >= n39) {
                            if (n39 - -arg3 >= this.j) {
                                if (!o2.db) {
                                    if (o2.zb[i2] == 0) {
                                        this.Ab[this.cc] = o2;
                                        this.qb[this.cc] = i2;
                                        ++this.cc;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.K = false;
        }
    }
    
    private final void b(final int arg0, final boolean arg1) {
        if (!arg1) {
            this.K = false;
        }
        if (arg0 < 0) {
            return;
        }
        this.D[arg0] = k.e++;
        if (this.kb[arg0] == null) {
            if (this.Hb[arg0] != 0) {
                for (int i = 0; i < this.ec.length; ++i) {
                    if (this.ec[i] == null) {
                        this.ec[i] = new int[65536];
                        this.kb[arg0] = this.ec[i];
                        this.a(arg0, (byte)118);
                        return;
                    }
                }
                long n = 1073741824L;
                int n2 = 0;
                for (int j = 0; j < this.cb; ++j) {
                    if (arg0 != j && this.Hb[j] == 1 && this.kb[j] != null && this.D[j] < n) {
                        n = this.D[j];
                        n2 = j;
                    }
                }
                this.kb[arg0] = this.kb[n2];
                this.kb[n2] = null;
                this.a(arg0, (byte)118);
            }
            else {
                for (int k = 0; k < this.i.length; ++k) {
                    if (this.i[k] == null) {
                        this.i[k] = new int[16384];
                        this.kb[arg0] = this.i[k];
                        this.a(arg0, (byte)118);
                        return;
                    }
                }
                long n3 = 1073741824L;
                int n4 = 0;
                for (int n5 = 0; this.cb > n5; ++n5) {
                    if (arg0 != n5 && this.Hb[n5] == 0 && this.kb[n5] != null) {
                        if (~n3 < ~this.D[n5]) {
                            n3 = this.D[n5];
                            n4 = n5;
                        }
                    }
                }
                this.kb[arg0] = this.kb[n4];
                this.kb[n4] = null;
                this.a(arg0, (byte)118);
            }
        }
    }
    
    private final void a(final int[] arg0, final ca arg1, final int arg2, int arg3, int arg4, final int[] arg5, final int[] arg6, int arg7, int arg8) {
        if (arg4 != -2) {
            if (arg4 >= 0) {
                if (arg4 >= this.cb) {
                    arg4 = 0;
                }
                this.b(arg4, true);
                final int n = arg6[0];
                final int n2 = arg0[0];
                final int n3 = arg5[0];
                final int n4 = n - arg6[1];
                final int n5 = -arg0[1] + n2;
                --arg3;
                final int n6 = n3 + -arg5[1];
                final int n7 = arg6[arg3] + -n;
                final int n8 = -n2 + arg0[arg3];
                final int n9 = arg5[arg3] - n3;
                if (this.Hb[arg4] == 1) {
                    final int n10 = -(n8 * n) + n2 * n7 << 12;
                    final int arg9 = n8 * n3 + -(n9 * n2) << 4 + -this.R + 5 + 7;
                    int n11 = n9 * n + -(n7 * n3) << 7 + -this.R + 5;
                    final int n12 = n2 * n4 - n * n5 << 12;
                    final int arg10 = n5 * n3 - n6 * n2 << -this.R + 5 + 11;
                    int n13 = -(n3 * n4) + n * n6 << 7 + (5 - this.R);
                    final int n14 = n7 * n5 + -(n8 * n4) << 5;
                    final int arg11 = n6 * n8 - n5 * n9 << 4 + (-this.R + 5);
                    int n15 = n4 * n9 + -(n6 * n7) >> this.R - 5;
                    final int n16 = arg9 >> 4;
                    final int n17 = arg10 >> 4;
                    final int n18 = arg11 >> 4;
                    final int n19 = -this.Nb + this.Xb;
                    int vb = this.vb;
                    int n20 = vb * this.Xb + this.Zb;
                    int n21 = n12 + n19 * n13;
                    int n22 = 1;
                    int n23 = n14 + n15 * n19;
                    int n24 = n10 + n11 * n19;
                    if (this.f) {
                        if ((this.Xb & 0x1) == 0x1) {
                            n21 += n13;
                            n20 += vb;
                            n24 += n11;
                            n23 += n15;
                            ++this.Xb;
                        }
                        n15 <<= 1;
                        n13 <<= 1;
                        n22 = 2;
                        n11 <<= 1;
                        vb <<= 1;
                    }
                    if (!arg1.Kb) {
                        if (!(!this.S[arg4])) {
                            n n25;
                            int n26;
                            int arg12;
                            int e;
                            int arg13;
                            for (arg8 = this.Xb; this.Cb > arg8; arg8 += n22) {
                                n25 = this.x[arg8];
                                arg7 = n25.d >> 8;
                                n26 = n25.k >> 8;
                                arg12 = -arg7 + n26;
                                if (arg12 <= 0) {
                                    n21 += n13;
                                    n24 += n11;
                                    n20 += vb;
                                    n23 += n15;
                                }
                                else {
                                    e = n25.e;
                                    arg13 = (-e + n25.l) / arg12;
                                    if (-this.A > arg7) {
                                        e += (-arg7 + -this.A) * arg13;
                                        arg7 = -this.A;
                                        arg12 = n26 - arg7;
                                    }
                                    if (this.A < n26) {
                                        arg12 = -arg7 + this.A;
                                    }
                                    wb.a(arg10, 10, 0, 0, this.pb, n23 + arg7 * n18, e, arg7 * n16 + n24, n21 - -(arg7 * n17), arg7 + n20, arg11, arg13, 0, arg9, this.kb[arg4], arg12);
                                    n20 += vb;
                                    n21 += n13;
                                    n23 += n15;
                                    n24 += n11;
                                }
                            }
                        }
                        else {
                            n n27;
                            int n28;
                            int arg14;
                            int e2;
                            int n29;
                            for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n22) {
                                n27 = this.x[arg8];
                                arg7 = n27.d >> 8;
                                n28 = n27.k >> 8;
                                arg14 = n28 + -arg7;
                                if (arg14 <= 0) {
                                    n23 += n15;
                                    n24 += n11;
                                    n20 += vb;
                                    n21 += n13;
                                }
                                else {
                                    e2 = n27.e;
                                    n29 = (n27.l + -e2) / arg14;
                                    if (arg7 < -this.A) {
                                        e2 += (-this.A - arg7) * n29;
                                        arg7 = -this.A;
                                        arg14 = -arg7 + n28;
                                    }
                                    if (this.A < n28) {
                                        arg14 = this.A + -arg7;
                                    }
                                    gb.a(n21 - -(n17 * arg7), arg9, (byte)50, n23 + arg7 * n18, e2, n29 << 2, this.kb[arg4], arg7 + n20, arg7 * n16 + n24, arg11, 0, 0, this.pb, arg10, arg14);
                                    n24 += n11;
                                    n23 += n15;
                                    n20 += vb;
                                    n21 += n13;
                                }
                            }
                        }
                    }
                    else {
                        n n30;
                        int n31;
                        int arg15;
                        int e3;
                        int n32;
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n22) {
                            n30 = this.x[arg8];
                            arg7 = n30.d >> 8;
                            n31 = n30.k >> 8;
                            arg15 = -arg7 + n31;
                            if (arg15 > 0) {
                                e3 = n30.e;
                                n32 = (-e3 + n30.l) / arg15;
                                if (arg7 < -this.A) {
                                    e3 += n32 * (-arg7 + -this.A);
                                    arg7 = -this.A;
                                    arg15 = n31 - arg7;
                                }
                                if (this.A < n31) {
                                    arg15 = -arg7 + this.A;
                                }
                                cb.a(n20 + arg7, n21 + arg7 * n17, n24 + arg7 * n16, 0, e3, arg10, 0, n23 - -(arg7 * n18), arg9, n32 << 2, this.kb[arg4], arg15, arg11, this.pb, (byte)119);
                                n20 += vb;
                                n21 += n13;
                                n24 += n11;
                                n23 += n15;
                            }
                            else {
                                n20 += vb;
                                n23 += n15;
                                n24 += n11;
                                n21 += n13;
                            }
                        }
                    }
                }
                else {
                    final int n33 = n7 * n2 + -(n * n8) << 11;
                    final int arg16 = n3 * n8 + -(n9 * n2) << 4 + (6 + (-this.R + 5));
                    int n34 = n9 * n + -(n7 * n3) << 11 - this.R;
                    final int n35 = n2 * n4 + -(n5 * n) << 11;
                    final int arg17 = n3 * n5 + -(n2 * n6) << 4 + -this.R + 11;
                    int n36 = n6 * n - n3 * n4 << 11 + -this.R;
                    final int n37 = -(n8 * n4) + n7 * n5 << 5;
                    final int arg18 = n8 * n6 - n5 * n9 << 4 + (-this.R + 5);
                    int n38 = n9 * n4 + -(n7 * n6) >> this.R - 5;
                    final int n39 = arg16 >> 4;
                    final int n40 = arg17 >> 4;
                    final int n41 = arg18 >> 4;
                    final int n42 = this.Xb + -this.Nb;
                    int vb2 = this.vb;
                    int n43 = vb2 * this.Xb + this.Zb;
                    int n44 = n35 + n42 * n36;
                    int n45 = 1;
                    int n46 = n33 + n42 * n34;
                    int n47 = n37 + n38 * n42;
                    if (this.f) {
                        if ((0x1 & this.Xb) == 0x1) {
                            n44 += n36;
                            n47 += n38;
                            n46 += n34;
                            ++this.Xb;
                            n43 += vb2;
                        }
                        n34 <<= 1;
                        vb2 <<= 1;
                        n38 <<= 1;
                        n45 = 2;
                        n36 <<= 1;
                    }
                    if (arg1.Kb) {
                        n n48;
                        int n49;
                        int arg19;
                        int e4;
                        int arg20;
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n45) {
                            n48 = this.x[arg8];
                            arg7 = n48.d >> 8;
                            n49 = n48.k >> 8;
                            arg19 = n49 + -arg7;
                            if (arg19 <= 0) {
                                n44 += n36;
                                n47 += n38;
                                n43 += vb2;
                                n46 += n34;
                            }
                            else {
                                e4 = n48.e;
                                arg20 = (-e4 + n48.l) / arg19;
                                if (-this.A > arg7) {
                                    e4 += arg20 * (-this.A + -arg7);
                                    arg7 = -this.A;
                                    arg19 = n49 - arg7;
                                }
                                if (this.A < n49) {
                                    arg19 = this.A - arg7;
                                }
                                jb.a(this.pb, arg17, arg18, arg7 * n41 + n47, arg20, e4, arg7 + n43, arg19, n39 * arg7 + n46, 0, this.kb[arg4], false, arg16, arg7 * n40 + n44, 0);
                                n43 += vb2;
                                n47 += n38;
                                n46 += n34;
                                n44 += n36;
                            }
                        }
                    }
                    else if (!this.S[arg4]) {
                        n n50;
                        int n51;
                        int arg21;
                        int e5;
                        int arg22;
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n45) {
                            n50 = this.x[arg8];
                            arg7 = n50.d >> 8;
                            n51 = n50.k >> 8;
                            arg21 = n51 - arg7;
                            if (arg21 > 0) {
                                e5 = n50.e;
                                arg22 = (n50.l + -e5) / arg21;
                                if (arg7 < -this.A) {
                                    e5 += (-this.A + -arg7) * arg22;
                                    arg7 = -this.A;
                                    arg21 = -arg7 + n51;
                                }
                                if (this.A < n51) {
                                    arg21 = this.A + -arg7;
                                }
                                p.a(arg22, 1121159302, arg17, arg7 * n40 + n44, arg16, this.kb[arg4], e5, 0, n46 + n39 * arg7, 0, this.pb, n43 + arg7, n47 - -(arg7 * n41), arg18, arg21);
                                n43 += vb2;
                                n44 += n36;
                                n46 += n34;
                                n47 += n38;
                            }
                            else {
                                n43 += vb2;
                                n47 += n38;
                                n44 += n36;
                                n46 += n34;
                            }
                        }
                    }
                    else {
                        n n52;
                        int n53;
                        int arg23;
                        int e6;
                        int arg24;
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n45) {
                            n52 = this.x[arg8];
                            arg7 = n52.d >> 8;
                            n53 = n52.k >> 8;
                            arg23 = -arg7 + n53;
                            if (arg23 <= 0) {
                                n47 += n38;
                                n43 += vb2;
                                n46 += n34;
                                n44 += n36;
                            }
                            else {
                                e6 = n52.e;
                                arg24 = (-e6 + n52.l) / arg23;
                                if (arg7 < -this.A) {
                                    e6 += arg24 * (-this.A + -arg7);
                                    arg7 = -this.A;
                                    arg23 = -arg7 + n53;
                                }
                                if (n53 > this.A) {
                                    arg23 = -arg7 + this.A;
                                }
                                cb.a(arg23, n41 * arg7 + n47, 0, (byte)25, 0, arg16, arg18, arg24, this.kb[arg4], this.pb, arg7 + n43, arg7 * n39 + n46, 0, arg17, e6, n40 * arg7 + n44);
                                n47 += n38;
                                n44 += n36;
                                n43 += vb2;
                                n46 += n34;
                            }
                        }
                    }
                }
            }
            else {
                for (int i = 0; i < this.ib; ++i) {
                    if (this.v[i] == arg4) {
                        this.H = this.Ib[i];
                        break;
                    }
                    if (i == this.ib - 1) {
                        final int n54 = (int)(Math.random() * this.ib);
                        this.v[n54] = arg4;
                        arg4 = -arg4 - 1;
                        final int n55 = ((0x7D19 & arg4) >> 10) * 8;
                        final int n56 = 8 * ((0x3FB & arg4) >> 5);
                        final int n57 = (0x1F & arg4) * 8;
                        for (int j = 0; j < 256; ++j) {
                            final int n58 = j * j;
                            this.Ib[n54][255 + -j] = n57 * n58 / 65536 + (n58 * n56 / 65536 << 8) + (n55 * n58 / 65536 << 16);
                        }
                        this.H = this.Ib[n54];
                    }
                }
                int vb3 = this.vb;
                int n59 = this.Xb * vb3 + this.Zb;
                int n60 = 1;
                if (this.f) {
                    if ((this.Xb & 0x1) == 0x1) {
                        ++this.Xb;
                        n59 += vb3;
                    }
                    vb3 <<= 1;
                    n60 = 2;
                }
                if (arg1.cb) {
                    n n61;
                    int n62;
                    int n63;
                    int e7;
                    int arg25;
                    for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n60) {
                        n61 = this.x[arg8];
                        arg7 = n61.d >> 8;
                        n62 = n61.k >> 8;
                        n63 = n62 + -arg7;
                        if (n63 > 0) {
                            e7 = n61.e;
                            arg25 = (n61.l + -e7) / n63;
                            if (arg7 < -this.A) {
                                e7 += arg25 * (-this.A + -arg7);
                                arg7 = -this.A;
                                n63 = n62 + -arg7;
                            }
                            if (n62 > this.A) {
                                n63 = -arg7 + this.A;
                            }
                            ua.a(e7, this.H, -n63, this.pb, 0, arg25, arg7 + n59, arg2 - 1);
                            n59 += vb3;
                        }
                        else {
                            n59 += vb3;
                        }
                    }
                }
                else if (!this.Ub) {
                    n n64;
                    int n65;
                    int n66;
                    int e8;
                    int arg26;
                    for (arg8 = this.Xb; this.Cb > arg8; arg8 += n60) {
                        n64 = this.x[arg8];
                        arg7 = n64.d >> 8;
                        n65 = n64.k >> 8;
                        n66 = n65 + -arg7;
                        if (n66 > 0) {
                            e8 = n64.e;
                            arg26 = (n64.l - e8) / n66;
                            if (arg7 < -this.A) {
                                e8 += (-arg7 + -this.A) * arg26;
                                arg7 = -this.A;
                                n66 = -arg7 + n65;
                            }
                            if (n65 > this.A) {
                                n66 = -arg7 + this.A;
                            }
                            t.a(0, arg26, -n66, this.pb, this.H, e8, n59 + arg7, 418609192);
                            n59 += vb3;
                        }
                        else {
                            n59 += vb3;
                        }
                    }
                }
                else {
                    n n67;
                    int n68;
                    int n69;
                    int e9;
                    int arg27;
                    for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n60) {
                        n67 = this.x[arg8];
                        arg7 = n67.d >> 8;
                        n68 = n67.k >> 8;
                        n69 = n68 + -arg7;
                        if (n69 > 0) {
                            e9 = n67.e;
                            arg27 = (n67.l - e9) / n69;
                            if (arg7 < -this.A) {
                                e9 += (-this.A + -arg7) * arg27;
                                arg7 = -this.A;
                                n69 = n68 + -arg7;
                            }
                            if (n68 > this.A) {
                                n69 = this.A + -arg7;
                            }
                            ia.a(arg27, 0, this.H, e9, arg7 + n59, this.pb, -n69, (byte)82);
                            n59 += vb3;
                        }
                        else {
                            n59 += vb3;
                        }
                    }
                }
            }
            if (arg2 != 1) {
                this.a((byte)(-48), null, null);
            }
        }
    }
    
    private final void a(int arg0, final int arg1, final int[] arg2, int arg3, int arg4, final ca arg5, final int[] arg6, final int[] arg7, int arg8, final int arg9, final int arg10) {
        if (arg10 == 3) {
            final int n = this.Nb + arg2[0];
            final int n2 = arg2[1] - -this.Nb;
            final int n3 = this.Nb + arg2[2];
            final int n4 = arg6[0];
            final int n5 = arg6[1];
            final int n6 = arg6[2];
            final int n7 = arg7[0];
            final int n8 = arg7[1];
            final int n9 = arg7[2];
            final int n10 = this.wb + (this.Nb - 1);
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            int xb = 12345678;
            int cb = -12345678;
            if (n != n3) {
                if (n3 <= n) {
                    n13 = n9 << 8;
                    xb = n3;
                    cb = n;
                    n11 = n6 << 8;
                }
                else {
                    xb = n;
                    cb = n3;
                    n11 = n4 << 8;
                    n13 = n7 << 8;
                }
                n14 = (-n7 + n9 << 8) / (-n + n3);
                n12 = (n6 - n4 << 8) / (n3 + -n);
                if (xb < 0) {
                    n11 -= xb * n12;
                    n13 -= n14 * xb;
                    xb = 0;
                }
                if (cb > n10) {
                    cb = n10;
                }
            }
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            int n18 = 0;
            int xb2 = 12345678;
            int cb2 = -12345678;
            if (n != n2) {
                n16 = (n5 + -n4 << 8) / (-n + n2);
                n18 = (-n7 + n8 << 8) / (-n + n2);
                if (n2 > n) {
                    n17 = n7 << 8;
                    cb2 = n2;
                    n15 = n4 << 8;
                    xb2 = n;
                }
                else {
                    n17 = n8 << 8;
                    xb2 = n2;
                    n15 = n5 << 8;
                    cb2 = n;
                }
                if (cb2 > n10) {
                    cb2 = n10;
                }
                if (xb2 < 0) {
                    n17 -= n18 * xb2;
                    n15 -= xb2 * n16;
                    xb2 = 0;
                }
            }
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int xb3 = 12345678;
            int cb3 = -12345678;
            if (n2 != n3) {
                if (n3 > n2) {
                    n19 = n5 << 8;
                    xb3 = n2;
                    n21 = n8 << 8;
                    cb3 = n3;
                }
                else {
                    xb3 = n3;
                    n21 = n9 << 8;
                    cb3 = n2;
                    n19 = n6 << 8;
                }
                n22 = (n9 - n8 << 8) / (n3 + -n2);
                n20 = (n6 + -n5 << 8) / (n3 - n2);
                if (xb3 < 0) {
                    n21 -= xb3 * n22;
                    n19 -= n20 * xb3;
                    xb3 = 0;
                }
                if (n10 < cb3) {
                    cb3 = n10;
                }
            }
            this.Xb = xb;
            if (xb2 < this.Xb) {
                this.Xb = xb2;
            }
            if (xb3 < this.Xb) {
                this.Xb = xb3;
            }
            this.Cb = cb;
            if (cb2 > this.Cb) {
                this.Cb = cb2;
            }
            if (cb3 > this.Cb) {
                this.Cb = cb3;
            }
            int l = 0;
            n n23;
            for (arg3 = this.Xb; this.Cb > arg3; ++arg3) {
                if (xb > arg3 || cb <= arg3) {
                    arg0 = 655360;
                    arg4 = -655360;
                }
                else {
                    arg4 = (arg0 = n11);
                    l = (arg8 = n13);
                    n11 += n12;
                    n13 += n14;
                }
                if (xb2 <= arg3 && arg3 < cb2) {
                    if (n15 > arg4) {
                        arg4 = n15;
                        l = n17;
                    }
                    if (n15 < arg0) {
                        arg0 = n15;
                        arg8 = n17;
                    }
                    n17 += n18;
                    n15 += n16;
                }
                if (arg3 >= xb3 && cb3 > arg3) {
                    if (arg4 < n19) {
                        l = n21;
                        arg4 = n19;
                    }
                    if (n19 < arg0) {
                        arg0 = n19;
                        arg8 = n21;
                    }
                    n21 += n22;
                    n19 += n20;
                }
                n23 = this.x[arg3];
                n23.e = arg8;
                n23.l = l;
                n23.d = arg0;
                n23.k = arg4;
            }
            if (-this.wb + this.Nb > this.Xb) {
                this.Xb = this.Nb + -this.wb;
            }
        }
        else if (arg10 != 4) {
            final int n24 = 0;
            final int n25 = arg2[n24] + this.Nb;
            arg2[n24] = n25;
            this.Xb = n25;
            this.Cb = n25;
            int n26;
            int n27;
            int n28;
            for (arg3 = 1; arg3 < arg10; ++arg3) {
                n26 = arg3;
                n27 = arg2[n26] + this.Nb;
                arg2[n26] = n27;
                if ((n28 = n27) >= this.Xb) {
                    if (this.Cb < n28) {
                        this.Cb = n28;
                    }
                }
                else {
                    this.Xb = n28;
                }
            }
            if (this.Nb + this.wb <= this.Cb) {
                this.Cb = this.Nb - 1 - -this.wb;
            }
            if (this.Nb + -this.wb > this.Xb) {
                this.Xb = -this.wb + this.Nb;
            }
            if (this.Xb >= this.Cb) {
                return;
            }
            n n29;
            for (arg3 = this.Xb; arg3 < this.Cb; ++arg3) {
                n29 = this.x[arg3];
                n29.k = -655360;
                n29.d = 655360;
            }
            final int i = arg10 - 1;
            int cb4 = arg2[0];
            int cb5 = arg2[i];
            if (cb4 >= cb5) {
                if (cb5 < cb4) {
                    int n30 = arg6[i] << 8;
                    final int n31 = (-arg6[i] + arg6[0] << 8) / (-cb5 + cb4);
                    int n32 = arg7[i] << 8;
                    final int n33 = (arg7[0] - arg7[i] << 8) / (cb4 + -cb5);
                    if (this.Cb < cb4) {
                        cb4 = this.Cb;
                    }
                    if (cb5 < 0) {
                        n32 -= n33 * cb5;
                        n30 -= n31 * cb5;
                        cb5 = 0;
                    }
                    n n36;
                    n n35;
                    n n34;
                    int n37;
                    n n38;
                    n n39;
                    int n40;
                    for (arg3 = cb5; arg3 <= cb4; ++arg3) {
                        n34 = (n35 = (n36 = this.x[arg3]));
                        n37 = n30;
                        n35.k = n37;
                        n36.d = n37;
                        n38 = n34;
                        n39 = n34;
                        n40 = n32;
                        n39.l = n40;
                        n38.e = n40;
                        n30 += n31;
                        n32 += n33;
                    }
                }
            }
            else {
                int n41 = arg6[0] << 8;
                final int n42 = (arg6[i] + -arg6[0] << 8) / (cb5 + -cb4);
                int n43 = arg7[0] << 8;
                final int n44 = (-arg7[0] + arg7[i] << 8) / (cb5 - cb4);
                if (cb4 < 0) {
                    n41 -= cb4 * n42;
                    n43 -= cb4 * n44;
                    cb4 = 0;
                }
                if (cb5 > this.Cb) {
                    cb5 = this.Cb;
                }
                n n47;
                n n46;
                n n45;
                int n48;
                n n49;
                n n50;
                int n51;
                for (arg3 = cb4; arg3 <= cb5; ++arg3) {
                    n45 = (n46 = (n47 = this.x[arg3]));
                    n48 = n43;
                    n46.l = n48;
                    n47.e = n48;
                    n49 = n45;
                    n50 = n45;
                    n51 = n41;
                    n50.k = n51;
                    n49.d = n51;
                    n41 += n42;
                    n43 += n44;
                }
            }
            int j;
            int n52;
            int cb6;
            int n53;
            int n54;
            int n55;
            int n56;
            int n57;
            n n58;
            int n59;
            int n60;
            int n61;
            int n62;
            int k;
            n n63;
            for (arg3 = 0; i > arg3; ++arg3) {
                j = arg2[arg3];
                n52 = arg3 + 1;
                cb6 = arg2[n52];
                if (j >= cb6) {
                    if (j > cb6) {
                        n53 = arg6[n52] << 8;
                        n54 = (arg6[arg3] - arg6[n52] << 8) / (-cb6 + j);
                        n55 = arg7[n52] << 8;
                        n56 = (-arg7[n52] + arg7[arg3] << 8) / (-cb6 + j);
                        if (cb6 < 0) {
                            n53 -= n54 * cb6;
                            n55 -= cb6 * n56;
                            cb6 = 0;
                        }
                        if (this.Cb < j) {
                            j = this.Cb;
                        }
                        for (n57 = cb6; j >= n57; ++n57) {
                            n58 = this.x[n57];
                            if (n53 < n58.d) {
                                n58.e = n55;
                                n58.d = n53;
                            }
                            if (n53 > n58.k) {
                                n58.l = n55;
                                n58.k = n53;
                            }
                            n55 += n56;
                            n53 += n54;
                        }
                    }
                }
                else {
                    n59 = arg6[arg3] << 8;
                    n60 = (arg6[n52] - arg6[arg3] << 8) / (-j + cb6);
                    n61 = arg7[arg3] << 8;
                    n62 = (arg7[n52] + -arg7[arg3] << 8) / (-j + cb6);
                    if (cb6 > this.Cb) {
                        cb6 = this.Cb;
                    }
                    if (j < 0) {
                        n59 -= j * n60;
                        n61 -= j * n62;
                        j = 0;
                    }
                    for (k = j; k <= cb6; ++k) {
                        n63 = this.x[k];
                        if (n59 > n63.k) {
                            n63.k = n59;
                            n63.l = n61;
                        }
                        if (n59 < n63.d) {
                            n63.d = n59;
                            n63.e = n61;
                        }
                        n61 += n62;
                        n59 += n60;
                    }
                }
            }
            if (-this.wb + this.Nb > this.Xb) {
                this.Xb = -this.wb + this.Nb;
            }
        }
        else {
            final int n64 = arg2[0] - -this.Nb;
            final int n65 = this.Nb + arg2[1];
            final int n66 = this.Nb + arg2[2];
            final int n67 = this.Nb + arg2[3];
            final int n68 = arg6[0];
            final int n69 = arg6[1];
            final int n70 = arg6[2];
            final int n71 = arg6[3];
            final int n72 = arg7[0];
            final int n73 = arg7[1];
            final int n74 = arg7[2];
            final int n75 = arg7[3];
            final int n76 = this.wb + this.Nb - 1;
            int n77 = 0;
            int n78 = 0;
            int n79 = 0;
            int n80 = 0;
            int xb4 = 12345678;
            int cb7 = -12345678;
            if (n64 != n67) {
                n78 = (-n68 + n71 << 8) / (n67 + -n64);
                n80 = (n75 + -n72 << 8) / (n67 + -n64);
                if (n67 <= n64) {
                    xb4 = n67;
                    n77 = n71 << 8;
                    n79 = n75 << 8;
                    cb7 = n64;
                }
                else {
                    cb7 = n67;
                    n77 = n68 << 8;
                    xb4 = n64;
                    n79 = n72 << 8;
                }
                if (xb4 < 0) {
                    n79 -= n80 * xb4;
                    n77 -= xb4 * n78;
                    xb4 = 0;
                }
                if (n76 < cb7) {
                    cb7 = n76;
                }
            }
            int n81 = 0;
            int n82 = 0;
            int n83 = 0;
            int n84 = 0;
            int xb5 = 12345678;
            int cb8 = -12345678;
            if (n65 != n64) {
                n84 = (n73 - n72 << 8) / (n65 - n64);
                if (n64 >= n65) {
                    xb5 = n65;
                    n83 = n73 << 8;
                    cb8 = n64;
                    n81 = n69 << 8;
                }
                else {
                    xb5 = n64;
                    cb8 = n65;
                    n81 = n68 << 8;
                    n83 = n72 << 8;
                }
                n82 = (-n68 + n69 << 8) / (-n64 + n65);
                if (n76 < cb8) {
                    cb8 = n76;
                }
                if (xb5 < 0) {
                    n81 -= xb5 * n82;
                    n83 -= n84 * xb5;
                    xb5 = 0;
                }
            }
            int n85 = 0;
            int n86 = 0;
            int n87 = 0;
            int n88 = 0;
            int xb6 = 12345678;
            int cb9 = -12345678;
            if (n66 != n65) {
                n88 = (-n73 + n74 << 8) / (-n65 + n66);
                if (n65 >= n66) {
                    xb6 = n66;
                    n87 = n74 << 8;
                    n85 = n70 << 8;
                    cb9 = n65;
                }
                else {
                    xb6 = n65;
                    n87 = n73 << 8;
                    cb9 = n66;
                    n85 = n69 << 8;
                }
                n86 = (-n69 + n70 << 8) / (n66 - n65);
                if (xb6 < 0) {
                    n87 -= xb6 * n88;
                    n85 -= n86 * xb6;
                    xb6 = 0;
                }
                if (cb9 > n76) {
                    cb9 = n76;
                }
            }
            int n89 = 0;
            int n90 = 0;
            int n91 = 0;
            int n92 = 0;
            int xb7 = 12345678;
            int cb10 = -12345678;
            if (n66 != n67) {
                n92 = (-n74 + n75 << 8) / (-n66 + n67);
                if (n67 <= n66) {
                    cb10 = n66;
                    n91 = n75 << 8;
                    n89 = n71 << 8;
                    xb7 = n67;
                }
                else {
                    n91 = n74 << 8;
                    cb10 = n67;
                    xb7 = n66;
                    n89 = n70 << 8;
                }
                n90 = (-n70 + n71 << 8) / (n67 + -n66);
                if (xb7 < 0) {
                    n89 -= xb7 * n90;
                    n91 -= xb7 * n92;
                    xb7 = 0;
                }
                if (cb10 > n76) {
                    cb10 = n76;
                }
            }
            this.Xb = xb4;
            if (this.Xb > xb5) {
                this.Xb = xb5;
            }
            if (this.Xb > xb6) {
                this.Xb = xb6;
            }
            this.Cb = cb7;
            if (xb7 < this.Xb) {
                this.Xb = xb7;
            }
            if (cb8 > this.Cb) {
                this.Cb = cb8;
            }
            if (cb9 > this.Cb) {
                this.Cb = cb9;
            }
            if (cb10 > this.Cb) {
                this.Cb = cb10;
            }
            int m = 0;
            n n93;
            for (arg3 = this.Xb; this.Cb > arg3; ++arg3) {
                if (xb4 > arg3 || cb7 <= arg3) {
                    arg4 = -655360;
                    arg0 = 655360;
                }
                else {
                    m = (arg8 = n79);
                    arg4 = (arg0 = n77);
                    n79 += n80;
                    n77 += n78;
                }
                if (xb5 <= arg3 && arg3 < cb8) {
                    if (arg0 > n81) {
                        arg8 = n83;
                        arg0 = n81;
                    }
                    if (arg4 < n81) {
                        m = n83;
                        arg4 = n81;
                    }
                    n81 += n82;
                    n83 += n84;
                }
                if (arg3 >= xb6) {
                    if (cb9 > arg3) {
                        if (n85 > arg4) {
                            arg4 = n85;
                            m = n87;
                        }
                        if (arg0 > n85) {
                            arg0 = n85;
                            arg8 = n87;
                        }
                        n85 += n86;
                        n87 += n88;
                    }
                }
                if (xb7 <= arg3) {
                    if (arg3 < cb10) {
                        if (n89 > arg4) {
                            m = n91;
                            arg4 = n89;
                        }
                        if (arg0 > n89) {
                            arg0 = n89;
                            arg8 = n91;
                        }
                        n91 += n92;
                        n89 += n90;
                    }
                }
                n93 = this.x[arg3];
                n93.e = arg8;
                n93.d = arg0;
                n93.k = arg4;
                n93.l = m;
            }
            if (-this.wb + this.Nb > this.Xb) {
                this.Xb = this.Nb + -this.wb;
            }
        }
        if (arg9 != 5960) {
            return;
        }
        if (this.K && this.db > this.cc && this.Xb <= this.Wb && this.Wb < this.Cb) {
            final n n94 = this.x[this.Wb];
            if (this.j >= n94.d >> 8 && this.j <= n94.k >> 8) {
                if (n94.d <= n94.k) {
                    if (!arg5.db) {
                        if (arg5.zb[arg1] == 0) {
                            this.Ab[this.cc] = arg5;
                            this.qb[this.cc] = arg1;
                            ++this.cc;
                        }
                    }
                }
            }
        }
    }
    
    final void a(final ca arg0, final int arg1) {
        if (arg1 != -1) {
            this.jb = null;
        }
        for (int i = 0; i < this.ab; ++i) {
            if (this.Z[i] == arg0) {
                --this.ab;
                for (int n = i; this.ab > n; ++n) {
                    this.Z[n] = this.Z[n + 1];
                    this.jb[n] = this.jb[1 + n];
                }
            }
        }
    }
    
    private final void a(final int arg0, final int arg1) {
        final w w = this.y[arg0];
        final ca o = w.o;
        final int i = w.i;
        final int[] array = o.o[i];
        final int j = o.lb[i];
        final int n = o.M[i];
        final int n2 = o.cc[array[0]];
        final int n3 = o.H[array[0]];
        final int n4 = o.bb[array[0]];
        final int n5 = -n2 + o.cc[array[1]];
        final int n6 = -n3 + o.H[array[1]];
        final int n7 = -n4 + o.bb[array[1]];
        final int n8 = -n2 + o.cc[array[2]];
        final int n9 = o.H[array[2]] + -n3;
        final int n10 = -n4 + o.bb[array[2]];
        int r = -(n7 * n9) + n10 * n6;
        int l = -(n5 * n10) + n8 * n7;
        int k = -(n8 * n6) + n5 * n9;
        if (n != -1) {
            k >>= n;
            r >>= n;
            l >>= n;
        }
        else {
            int n11;
            for (n11 = 0; r > 25000 || l > 25000 || k > 25000 || r < -25000 || l < -25000 || k < -25000; r >>= 1, l >>= 1, ++n11, k >>= 1) {}
            o.M[i] = n11;
            o.k[i] = (int)(this.h * Math.sqrt(k * k + l * l + r * r));
        }
        w.k = k;
        if (arg1 != -21875) {
            this.Eb = null;
        }
        w.r = r;
        w.l = l;
        w.s = r * n2 - (-(n3 * l) + -(k * n4));
        int q;
        int u = q = o.bb[array[0]];
        int m;
        int e = m = o.pb[array[0]];
        int j2;
        int h = j2 = o.Ob[array[0]];
        for (int n12 = 1; j > n12; ++n12) {
            final int n13 = o.bb[array[n12]];
            if (n13 <= q) {
                if (u > n13) {
                    u = n13;
                }
            }
            else {
                q = n13;
            }
            final int n14 = o.pb[array[n12]];
            if (n14 > m) {
                m = n14;
            }
            else if (e > n14) {
                e = n14;
            }
            final int n15 = o.Ob[array[n12]];
            if (n15 > j2) {
                j2 = n15;
            }
            else if (h > n15) {
                h = n15;
            }
        }
        w.e = e;
        w.m = m;
        w.j = j2;
        w.q = q;
        w.h = h;
        w.u = u;
    }
    
    static final void a(final boolean arg0, final byte[] arg1) {
        if (!arg0) {
            return;
        }
        if (u.d == null) {
            return;
        }
        u.d.setPixels(0, 0, k.o, da.bb, m.d, arg1, 0, k.o);
        u.d.imageComplete(3);
    }
    
    final void a(final int arg0, final byte arg1, final int[] arg2, final int arg3, final byte[] arg4) {
        this.g[arg0] = arg4;
        if (arg1 <= 29) {
            this.b(-108);
        }
        this.L[arg0] = arg2;
        this.Hb[arg0] = arg3;
        this.D[arg0] = 0L;
        this.S[arg0] = false;
        this.kb[arg0] = null;
        this.b(arg0, true);
    }
    
    final void a(final int arg0, final boolean arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6) {
        this.R = arg5;
        this.Zb = arg6;
        this.vb = arg2;
        this.Nb = arg4;
        this.x = new n[arg0 + arg4];
        this.wb = arg0;
        this.A = arg3;
        for (int i = 0; i < arg4 + arg0; ++i) {
            this.x[i] = new n();
        }
        if (!arg1) {
            this.f = false;
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2) {
        this.K = true;
        this.j = -this.Zb + arg1;
        this.Wb = arg2;
        this.cc = arg0;
    }
    
    final ca[] b(final byte arg0) {
        if (arg0 < 95) {
            return null;
        }
        return this.Ab;
    }
    
    final void a(final int arg0, final int arg1, final boolean arg2, int arg3) {
        if (arg3 == 0 && arg1 == 0) {
            if (arg0 == 0) {
                arg3 = 32;
            }
        }
        if (!arg2) {
            this.c(-89);
        }
        for (int n = 0; this.ab > n; ++n) {
            this.Z[n].a(false, arg3, arg1, arg0);
        }
    }
    
    final void a(final boolean arg0) {
        this.a(-118);
        if (arg0) {
            this.Xb = -11;
        }
        for (int i = 0; i < this.ab; ++i) {
            this.Z[i] = null;
        }
        this.ab = 0;
    }
    
    private final boolean a(final byte arg0, final boolean arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        if (arg0 >= -86) {
            this.jb = null;
        }
        if ((!arg1 || arg5 < arg4) && arg4 >= arg5) {
            return arg4 < arg3 || arg2 < arg5 || arg3 > arg2 || arg1;
        }
        return arg4 > arg3 || arg2 > arg5 || arg2 > arg3 || !arg1;
    }
    
    private final void a(final int arg0) {
        if (arg0 > -115) {
            return;
        }
        this.n = 0;
        this.T.c(1);
    }
    
    private final boolean a(final int[] arg0, final int[] arg1, final int[] arg2, final int[] arg3, final int arg4) {
        final int i = arg2.length;
        final int j = arg0.length;
        int k = 0;
        int n = 0;
        int n3;
        int n2 = n3 = arg1[0];
        int n4 = 0;
        for (int n5 = 1; i > n5; ++n5) {
            if (n2 <= arg1[n5]) {
                if (arg1[n5] > n3) {
                    n3 = arg1[n5];
                }
            }
            else {
                n = n5;
                n2 = arg1[n5];
            }
        }
        int n7;
        int n6 = n7 = arg3[0];
        for (int n8 = arg4; j > n8; ++n8) {
            if (arg3[n8] >= n6) {
                if (n7 < arg3[n8]) {
                    n7 = arg3[n8];
                }
            }
            else {
                n6 = arg3[n8];
                n4 = n8;
            }
        }
        if (n3 <= n6) {
            return false;
        }
        if (n2 >= n7) {
            return false;
        }
        int n9;
        boolean arg6;
        int n10;
        if (arg1[n] < arg3[n4]) {
            n9 = n;
            while (arg3[n4] > arg1[n]) {
                n = (n - (1 + -i)) % i;
            }
            while (arg1[n9] < arg3[n4]) {
                n9 = (1 + n9) % i;
            }
            final int a = this.a(arg1[(n + 1) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(1 + n) % i]);
            final int a2 = this.a(arg1[(i + (n9 - 1)) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(i - 1 + n9) % i]);
            final int arg5 = arg0[n4];
            arg6 = (a < arg5 | arg5 > a2);
            if (this.a(arg5, arg6, a, (byte)(-71), a2)) {
                return true;
            }
            n10 = (n4 + 1) % j;
            n4 = (n4 + j - 1) % j;
            if (n == n9) {
                k = 1;
            }
        }
        else {
            n10 = n4;
            while (arg1[n] > arg3[n4]) {
                n4 = (n4 - -j - 1) % j;
            }
            final int arg7 = arg2[n];
            while (arg1[n] > arg3[n10]) {
                n10 = (n10 + 1) % j;
            }
            final int a3 = this.a(arg3[(n4 + 1) % j], false, arg1[n], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]);
            final int a4 = this.a(arg3[(j + (n10 - 1)) % j], false, arg1[n], arg3[n10], arg0[n10], arg0[(n10 - 1 + j) % j]);
            arg6 = (arg7 < a3 | a4 > arg7);
            if (this.a(arg7, !arg6, a3, (byte)(-71), a4)) {
                return true;
            }
            n9 = (1 + n) % i;
            n = (i + (n - 1)) % i;
            if (n10 == n4) {
                k = 2;
            }
        }
        while (k == 0) {
            if (arg1[n9] <= arg1[n]) {
                if (arg3[n4] <= arg1[n9]) {
                    if (arg3[n4] >= arg3[n10]) {
                        if (this.a((byte)(-96), arg6, this.a(arg1[(n9 - 1 + i) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(i + (n9 - 1)) % i]), arg0[n10], this.a(arg1[(n + 1) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(1 + n4) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]))) {
                            return true;
                        }
                        n10 = (1 + n10) % j;
                        if (n10 != n4) {
                            continue;
                        }
                        k = 2;
                    }
                    else {
                        if (this.a((byte)(-123), arg6, this.a(arg1[(n9 - -i - 1) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(i - 1 + n9) % i]), this.a(arg3[(j + (n10 - 1)) % j], false, arg3[n4], arg3[n10], arg0[n10], arg0[(n10 - 1 + j) % j]), this.a(arg1[(n + 1) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(1 + n) % i]), arg0[n4])) {
                            return true;
                        }
                        n4 = (n4 - 1 + j) % j;
                        if (n4 != n10) {
                            continue;
                        }
                        k = 2;
                    }
                }
                else if (arg3[n10] > arg1[n9]) {
                    if (this.a((byte)(-105), arg6, arg2[n9], this.a(arg3[(n10 - 1 - -j) % j], false, arg1[n9], arg3[n10], arg0[n10], arg0[(n10 - (1 + -j)) % j]), this.a(arg1[(n + 1) % i], false, arg1[n9], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(n4 + 1) % j], false, arg1[n9], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                        return true;
                    }
                    n9 = (n9 + 1) % i;
                    if (n9 != n) {
                        continue;
                    }
                    k = 1;
                }
                else {
                    if (this.a((byte)(-106), arg6, this.a(arg1[(i + n9 - 1) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(i - 1 + n9) % i]), arg0[n10], this.a(arg1[(n + 1) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(n + 1) % i]), this.a(arg3[(n4 + 1) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]))) {
                        return true;
                    }
                    n10 = (n10 + 1) % j;
                    if (n10 != n4) {
                        continue;
                    }
                    k = 2;
                }
            }
            else if (arg1[n] < arg3[n4]) {
                if (arg1[n] >= arg3[n10]) {
                    if (this.a((byte)(-113), arg6, this.a(arg1[(i + (n9 - 1)) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(i + (n9 - 1)) % i]), arg0[n10], this.a(arg1[(1 + n) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(n4 + 1) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                        return true;
                    }
                    n10 = (1 + n10) % j;
                    if (n10 != n4) {
                        continue;
                    }
                    k = 2;
                }
                else {
                    if (this.a((byte)(-127), arg6, this.a(arg1[(n9 + (-1 - -i)) % i], false, arg1[n], arg1[n9], arg2[n9], arg2[(n9 + i - 1) % i]), this.a(arg3[(j - 1 + n10) % j], false, arg1[n], arg3[n10], arg0[n10], arg0[(j + (n10 - 1)) % j]), arg2[n], this.a(arg3[(1 + n4) % j], false, arg1[n], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                        return true;
                    }
                    n = (i + (n - 1)) % i;
                    if (n != n9) {
                        continue;
                    }
                    k = 1;
                }
            }
            else if (arg3[n10] > arg3[n4]) {
                if (this.a((byte)(-88), arg6, this.a(arg1[(i + (n9 - 1)) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(i - 1 + n9) % i]), this.a(arg3[(j + (n10 - 1)) % j], false, arg3[n4], arg3[n10], arg0[n10], arg0[(j + n10 - 1) % j]), this.a(arg1[(1 + n) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(1 + n) % i]), arg0[n4])) {
                    return true;
                }
                n4 = (j + n4 - 1) % j;
                if (n10 != n4) {
                    continue;
                }
                k = 2;
            }
            else {
                if (this.a((byte)(-123), arg6, this.a(arg1[(n9 + i - 1) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(i + (n9 - 1)) % i]), arg0[n10], this.a(arg1[(n + 1) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(n + 1) % i]), this.a(arg3[(n4 + 1) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                    return true;
                }
                n10 = (n10 + 1) % j;
                if (n4 != n10) {
                    continue;
                }
                k = 2;
            }
        }
        while (k == 1) {
            if (arg1[n] >= arg3[n4]) {
                if (arg3[n10] > arg3[n4]) {
                    if (this.a((byte)(-116), arg6, this.a(arg1[(n9 - 1 - -i) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(n9 - 1 + i) % i]), this.a(arg3[(n10 - 1 + j) % j], false, arg3[n4], arg3[n10], arg0[n10], arg0[(n10 + (-1 - -j)) % j]), this.a(arg1[(1 + n) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(n + 1) % i]), arg0[n4])) {
                        return true;
                    }
                    n4 = (n4 + (-1 - -j)) % j;
                    if (n10 != n4) {
                        continue;
                    }
                    k = 0;
                }
                else {
                    if (this.a((byte)(-98), arg6, this.a(arg1[(i + n9 - 1) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(n9 + (i - 1)) % i]), arg0[n10], this.a(arg1[(1 + n) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(n4 + 1) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                        return true;
                    }
                    n10 = (1 + n10) % j;
                    if (n10 != n4) {
                        continue;
                    }
                    k = 0;
                }
            }
            else {
                if (arg1[n] < arg3[n10]) {
                    return this.a(arg2[n], !arg6, this.a(arg3[(n4 + 1) % j], false, arg1[n], arg3[n4], arg0[n4], arg0[(1 + n4) % j]), (byte)(-71), this.a(arg3[(n10 - 1 + j) % j], false, arg1[n], arg3[n10], arg0[n10], arg0[(j + (n10 - 1)) % j]));
                }
                if (this.a((byte)(-118), arg6, this.a(arg1[(n9 - -i - 1) % i], false, arg3[n10], arg1[n9], arg2[n9], arg2[(n9 - -i - 1) % i]), arg0[n10], this.a(arg1[(1 + n) % i], false, arg3[n10], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(1 + n4) % j], false, arg3[n10], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                    return true;
                }
                n10 = (1 + n10) % j;
                if (n4 != n10) {
                    continue;
                }
                k = 0;
            }
        }
        while (k == 2) {
            if (arg3[n4] < arg1[n]) {
                if (arg1[n9] > arg3[n4]) {
                    return this.a(arg0[n4], arg6, this.a(arg1[(n + 1) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(n + 1) % i]), (byte)(-71), this.a(arg1[(n9 - 1 + i) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(i - 1 + n9) % i]));
                }
                if (this.a((byte)(-128), arg6, arg2[n9], this.a(arg3[(n10 - 1 + j) % j], false, arg1[n9], arg3[n10], arg0[n10], arg0[(n10 + j - 1) % j]), this.a(arg1[(1 + n) % i], false, arg1[n9], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(1 + n4) % j], false, arg1[n9], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]))) {
                    return true;
                }
                n9 = (1 + n9) % i;
                if (n != n9) {
                    continue;
                }
                k = 0;
            }
            else if (arg1[n9] <= arg1[n]) {
                if (this.a((byte)(-102), arg6, arg2[n9], this.a(arg3[(n10 - (1 + -j)) % j], false, arg1[n9], arg3[n10], arg0[n10], arg0[(n10 + j - 1) % j]), this.a(arg1[(n + 1) % i], false, arg1[n9], arg1[n], arg2[n], arg2[(1 + n) % i]), this.a(arg3[(1 + n4) % j], false, arg1[n9], arg3[n4], arg0[n4], arg0[(1 + n4) % j]))) {
                    return true;
                }
                n9 = (1 + n9) % i;
                if (n9 != n) {
                    continue;
                }
                k = 0;
            }
            else {
                if (this.a((byte)(-101), arg6, this.a(arg1[(n9 + i - 1) % i], false, arg1[n], arg1[n9], arg2[n9], arg2[(i + n9 - 1) % i]), this.a(arg3[(n10 + (-1 - -j)) % j], false, arg1[n], arg3[n10], arg0[n10], arg0[(j + n10 - 1) % j]), arg2[n], this.a(arg3[(n4 + 1) % j], false, arg1[n], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]))) {
                    return true;
                }
                n = (i + n - 1) % i;
                if (n != n9) {
                    continue;
                }
                k = 0;
            }
        }
        if (arg1[n] >= arg3[n4]) {
            return this.a(arg0[n4], arg6, this.a(arg1[(1 + n) % i], false, arg3[n4], arg1[n], arg2[n], arg2[(n + 1) % i]), (byte)(-71), this.a(arg1[(n9 - 1 - -i) % i], false, arg3[n4], arg1[n9], arg2[n9], arg2[(i + (n9 - 1)) % i]));
        }
        return this.a(arg2[n], !arg6, this.a(arg3[(1 + n4) % j], false, arg1[n], arg3[n4], arg0[n4], arg0[(n4 + 1) % j]), (byte)(-71), this.a(arg3[(j + (n10 - 1)) % j], false, arg1[n], arg3[n10], arg0[n10], arg0[(j - 1 + n10) % j]));
    }
    
    lb(final ua arg0, final int arg1, final int arg2, final int arg3) {
        super();
        this.nb = 5;
        this.Vb = new int[40];
        this.J = new int[40];
        this.ib = 50;
        this.f = false;
        this.G = 10;
        this.B = new int[40];
        this.cc = 0;
        this.wb = 192;
        this.Zb = 256;
        this.P = 20;
        this.Qb = new int[40];
        this.Ib = new int[this.ib][256];
        this.Nb = 256;
        this.Mb = 1000;
        this.vb = 512;
        this.r = new int[40];
        this.K = false;
        this.A = 256;
        this.cb = 0;
        this.h = 4;
        this.Ub = false;
        this.v = new int[this.ib];
        this.n = 0;
        this.yb = new int[40];
        this.X = 1000;
        this.db = 100;
        this.R = 8;
        this.Ab = new ca[this.db];
        this.qb = new int[this.db];
        this.ab = 0;
        this.pb = arg0.rb;
        this.dc = arg0;
        this.A = arg0.u / 2;
        this.u = arg1;
        this.wb = arg0.k / 2;
        this.Z = new ca[this.u];
        this.zb = 0;
        this.jb = new int[this.u];
        this.y = new w[arg2];
        for (int n = 0; arg2 > n; ++n) {
            this.y[n] = new w();
        }
        this.n = 0;
        this.T = new ca(2 * arg3, arg3);
        this.ob = new int[arg3];
        this.Eb = new int[arg3];
        if (db.i == null) {
            db.i = new byte[17691];
        }
        this.Fb = new int[arg3];
        this.o = 0;
        this.b = 0;
        this.Ob = new int[arg3];
        this.xb = 0;
        this.I = 0;
        this.bc = 0;
        this.Kb = 0;
        this.Q = new int[arg3];
        this.gb = new int[arg3];
        this.a = new int[arg3];
        for (int i = 0; i < 256; ++i) {
            e.nb[i] = (int)(Math.sin(0.02454369 * i) * 32768.0);
            e.nb[256 + i] = (int)(Math.cos(i * 0.02454369) * 32768.0);
        }
        for (int j = 0; j < 1024; ++j) {
            ba.cc[j] = (int)(Math.sin(j * 0.00613592315) * 32768.0);
            ba.cc[1024 + j] = (int)(Math.cos(j * 0.00613592315) * 32768.0);
        }
    }
}
