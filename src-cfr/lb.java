/*
 * Decompiled with CFR 0.152.
 */
final class lb {
    static String[] ac;
    private int wb = 192;
    private int Wb;
    private int Xb;
    private int[] H;
    private int[] J;
    private int nb = 5;
    private int[] Qb;
    private int ab = 0;
    private n[] x;
    private int[] Vb = new int[40];
    private int Zb = 256;
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
    private int ib = 50;
    private int u;
    private int[] pb;
    private int I;
    private int[] ob;
    int G = 10;
    private int zb;
    private boolean f = false;
    private int[] yb;
    private int[] B;
    private int Kb;
    int Mb = 1000;
    ca T;
    private int[] a;
    private int j;
    private byte[][] g;
    static int[] Tb;
    private int[] Hb;
    private int[][] Ib;
    private int cc = 0;
    private int[] qb;
    private int[][] kb;
    private ca[] Z;
    private boolean K = false;
    private int[][] L;
    private int vb = 512;
    int P = 20;
    private int[][] ec;
    private int[] r;
    private boolean[] S;
    private int[] gb;
    private int[] Ob;
    private int b;
    private int[] Fb;
    private int Nb = 256;
    private int cb = 0;
    private boolean Ub = false;
    private int h = 4;
    private int eb;
    private int A = 256;
    private int Cb;
    int X = 1000;
    private int R = 8;
    private int[] Eb;
    private int[] v;
    private long[] D;
    private int n = 0;
    private int db = 100;

    private final int a(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            this.a(-74, 87, -109, true);
        }
        if (arg3 == arg0) {
            return arg5;
        }
        return (-arg5 + arg4) * (-arg0 + arg2) / (-arg0 + arg3) + arg5;
    }

    private final void a(int arg0, int arg1, w[] arg2, int arg3) {
        block4: {
            if (arg3 > arg0) {
                int n2 = arg0 - 1;
                int n3 = arg3 + 1;
                int n4 = (arg3 + arg0) / 2;
                w w2 = arg2[n4];
                arg2[n4] = arg2[arg0];
                arg2[arg0] = w2;
                int n5 = w2.t;
                while (n3 > n2) {
                    while (arg2[++n2].t > n5) {
                    }
                    while (n5 > arg2[--n3].t) {
                    }
                    if (n3 <= n2) continue;
                    w w3 = arg2[n2];
                    arg2[n2] = arg2[n3];
                    arg2[n3] = w3;
                }
                this.a(arg0, -1, arg2, n3);
                this.a(n3 + 1, -1, arg2, arg3);
            }
            if (arg1 == -1) break block4;
            this.Qb = null;
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 == 0 && arg5 == 0 && arg0 == 0) {
            arg3 = 32;
        }
        for (int i2 = arg2; i2 < this.ab; ++i2) {
            this.Z[i2].a(arg1, arg4, arg5, -115, arg3, arg0);
        }
    }

    private final boolean a(byte arg0, w arg1, w arg2) {
        int[] nArray;
        int[] nArray2;
        int n2;
        int n3;
        int[] nArray3;
        int[] nArray4;
        int n4;
        int n5;
        int n6;
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
        ca ca2 = arg2.o;
        ca ca3 = arg1.o;
        int n7 = arg2.i;
        int n8 = arg1.i;
        int[] nArray5 = ca2.o[n7];
        int[] nArray6 = ca3.o[n8];
        int n9 = ca2.lb[n7];
        int n10 = ca3.lb[n8];
        int n11 = ca3.cc[nArray6[0]];
        int n12 = ca3.H[nArray6[0]];
        int n13 = ca3.bb[nArray6[0]];
        int n14 = arg1.r;
        int n15 = arg1.l;
        int n16 = arg1.k;
        int n17 = ca3.k[n8];
        int n18 = arg1.s;
        boolean bl = false;
        for (n6 = 0; n6 < n9; ++n6) {
            n5 = nArray5[n6];
            n4 = (-ca2.bb[n5] + n13) * n16 + ((n12 + -ca2.H[n5]) * n15 + n14 * (-ca2.cc[n5] + n11));
            if (!(-n17 > n4 && n18 < 0 || n17 < n4 && n18 > 0)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return true;
        }
        bl = false;
        n18 = arg2.s;
        n12 = ca2.H[nArray5[0]];
        n11 = ca2.cc[nArray5[0]];
        n17 = ca2.k[n7];
        n13 = ca2.bb[nArray5[0]];
        n15 = arg2.l;
        n16 = arg2.k;
        n14 = arg2.r;
        for (n6 = 0; n10 > n6; ++n6) {
            n5 = nArray6[n6];
            n4 = (-ca3.bb[n5] + n13) * n16 + ((n11 - ca3.cc[n5]) * n14 + (n12 - ca3.H[n5]) * n15);
            if (!(-n17 > n4 && n18 > 0 || n4 > n17 && n18 < 0)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return true;
        }
        if (n9 != 2) {
            nArray4 = new int[n9];
            nArray3 = new int[n9];
            for (n3 = 0; n3 < n9; ++n3) {
                n2 = nArray5[n3];
                nArray4[n3] = ca2.pb[n2];
                nArray3[n3] = ca2.Ob[n2];
            }
        } else {
            nArray4 = new int[4];
            nArray3 = new int[4];
            n5 = nArray5[1];
            n3 = nArray5[0];
            nArray4[0] = ca2.pb[n3] - 20;
            nArray4[1] = ca2.pb[n5] - 20;
            nArray4[2] = 20 + ca2.pb[n5];
            nArray4[3] = ca2.pb[n3] + 20;
            nArray3[0] = nArray3[3] = ca2.Ob[n3];
            nArray3[1] = nArray3[2] = ca2.Ob[n5];
        }
        if (n10 != 2) {
            nArray2 = new int[n10];
            nArray = new int[n10];
            for (n3 = 0; n10 > n3; ++n3) {
                n2 = nArray6[n3];
                nArray2[n3] = ca3.pb[n2];
                nArray[n3] = ca3.Ob[n2];
            }
        } else {
            nArray = new int[4];
            nArray2 = new int[4];
            n3 = nArray6[0];
            n5 = nArray6[1];
            nArray2[0] = ca3.pb[n3] - 20;
            nArray2[1] = ca3.pb[n5] - 20;
            nArray2[2] = ca3.pb[n5] + 20;
            nArray2[3] = ca3.pb[n3] + 20;
            nArray[0] = nArray[3] = ca3.Ob[n3];
            nArray[1] = nArray[2] = ca3.Ob[n5];
        }
        return !this.a(nArray2, nArray3, nArray4, nArray, 1);
    }

    private final void b(int arg0, int arg1) {
        int n2;
        int n3;
        w w2 = this.y[arg1];
        ca ca2 = w2.o;
        int n4 = w2.i;
        int[] nArray = ca2.o[n4];
        int n5 = 0;
        int n6 = 0;
        int n7 = 1;
        int n8 = ca2.cc[nArray[0]];
        int n9 = ca2.H[nArray[0]];
        int n10 = ca2.bb[nArray[0]];
        ca2.k[n4] = 1;
        ca2.M[n4] = 0;
        w2.l = n6;
        w2.r = n5;
        w2.k = n7;
        w2.s = n10 * n7 + (n8 * n5 + n9 * n6);
        int n11 = n3 = ca2.bb[nArray[0]];
        int n12 = n2 = ca2.pb[nArray[0]];
        if (n2 <= ca2.pb[nArray[1]]) {
            n12 = ca2.pb[nArray[1]];
        } else {
            n2 = ca2.pb[nArray[1]];
        }
        int n13 = ca2.Ob[nArray[1]];
        int n14 = ca2.Ob[nArray[0]];
        int n15 = ca2.bb[nArray[1]];
        if (n11 >= n15) {
            if (n3 > n15) {
                n3 = n15;
            }
        } else {
            n11 = n15;
        }
        if (n12 >= (n15 = ca2.pb[nArray[1]])) {
            if (n2 > n15) {
                n2 = n15;
            }
        } else {
            n12 = n15;
        }
        n15 = ca2.Ob[nArray[1]];
        w2.m = n12 + 20;
        w2.e = n2 - 20;
        if (n14 < n15) {
            n14 = n15;
        } else if (n13 > n15) {
            n13 = n15;
        }
        w2.q = n11;
        w2.u = n3;
        w2.j = n14;
        w2.h = n13;
    }

    final int[] a(byte arg0) {
        return this.qb;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int n2;
        int n3;
        int n4;
        arg7 = 0x3FF & arg7;
        arg3 = 0x3FF & arg3;
        arg5 = 0x3FF & arg5;
        this.b = 0x3FF & 1024 - arg7;
        this.Kb = 0x3FF & -arg3 + 1024;
        this.xb = 0x3FF & -arg5 + 1024;
        int n5 = 0;
        if (arg4 != -12349) {
            return;
        }
        int n6 = 0;
        int n7 = arg2;
        if (arg3 != 0) {
            n4 = ba.cc[arg3];
            n3 = ba.cc[arg3 + 1024];
            n2 = n3 * n6 + -(n4 * n7) >> 15;
            n7 = n4 * n6 + n7 * n3 >> 15;
            n6 = n2;
        }
        if (arg5 != 0) {
            n4 = ba.cc[arg5];
            n3 = ba.cc[arg5 + 1024];
            n2 = n5 * n3 + n7 * n4 >> 15;
            n7 = n3 * n7 - n4 * n5 >> 15;
            n5 = n2;
        }
        if (arg7 != 0) {
            n3 = ba.cc[arg7 + 1024];
            n4 = ba.cc[arg7];
            n2 = n5 * n3 + n4 * n6 >> 15;
            n6 = -(n4 * n5) + n6 * n3 >> 15;
            n5 = n2;
        }
        this.I = -n7 + arg1;
        this.o = arg6 + -n6;
        this.bc = arg0 + -n5;
    }

    final int a(int arg0, boolean arg1) {
        if (arg0 == 12345678) {
            return 0;
        }
        this.b(arg0, arg1);
        if (arg0 >= 0) {
            return this.kb[arg0][0];
        }
        if (arg0 < 0) {
            arg0 = -(arg0 + 1);
            int n2 = (arg0 & 0x7D29) >> 10;
            int n3 = (0x3F4 & arg0) >> 5;
            int n4 = 0x1F & arg0;
            return (n4 << 3) + ((n3 << 11) + (n2 << 19));
        }
        return 0;
    }

    private final boolean a(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -71) {
            return false;
        }
        if (arg1 && arg0 >= arg2 || arg2 < arg0) {
            if (arg0 < arg4) {
                return true;
            }
            return !arg1;
        }
        if (arg0 > arg4) {
            return true;
        }
        return arg1;
    }

    final void a(ca arg0, byte arg1) {
        block2: {
            if (arg1 != 118) {
                this.a(false, (w)null, (w)null);
            }
            if (arg0 == null) {
                System.out.println("Warning tried to add null object!");
            }
            if (this.u <= this.ab) break block2;
            this.jb[this.ab] = 0;
            this.Z[this.ab++] = arg0;
        }
    }

    private final boolean a(boolean arg0, w arg1, w arg2) {
        int n2;
        int n3;
        int n4;
        ca ca2 = arg1.o;
        ca ca3 = arg2.o;
        int n5 = arg1.i;
        int n6 = arg2.i;
        int[] nArray = ca2.o[n5];
        int[] nArray2 = ca3.o[n6];
        int n7 = ca2.lb[n5];
        int n8 = ca3.lb[n6];
        int n9 = ca3.cc[nArray2[0]];
        int n10 = ca3.H[nArray2[0]];
        int n11 = ca3.bb[nArray2[0]];
        int n12 = arg2.r;
        int n13 = arg2.l;
        int n14 = arg2.k;
        int n15 = ca3.k[n6];
        boolean bl = false;
        int n16 = arg2.s;
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = nArray[n4];
            n2 = n13 * (-ca2.H[n3] + n10) + (-ca2.cc[n3] + n9) * n12 - -((-ca2.bb[n3] + n11) * n14);
            if (!(n2 < -n15 && n16 < 0 || n2 > n15 && n16 > 0)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return true;
        }
        n9 = ca2.cc[nArray[0]];
        n14 = arg1.k;
        if (arg0) {
            this.y = null;
        }
        n15 = ca2.k[n5];
        n11 = ca2.bb[nArray[0]];
        n10 = ca2.H[nArray[0]];
        bl = false;
        n12 = arg1.r;
        n13 = arg1.l;
        n16 = arg1.s;
        for (n4 = 0; n8 > n4; ++n4) {
            n3 = nArray2[n4];
            n2 = n12 * (n9 - ca3.cc[n3]) - (-(n13 * (-ca3.H[n3] + n10)) + -((-ca3.bb[n3] + n11) * n14));
            if ((n2 >= -n15 || n16 <= 0) && (n15 >= n2 || n16 >= 0)) continue;
            bl = true;
            break;
        }
        return !bl;
    }

    private final void a(int arg0, byte arg1) {
        int n2;
        int n3;
        int n4 = this.Hb[arg0] != 0 ? 128 : 64;
        int[] nArray = this.kb[arg0];
        int n5 = 0;
        if (arg1 != 118) {
            return;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            for (n2 = 0; n2 < n4; ++n2) {
                int n6 = this.L[arg0][this.g[arg0][n2 + n3 * n4] & 0xFF];
                if ((n6 &= 0xF8F8FF) != 0) {
                    if (n6 == 0xF800FF) {
                        this.S[arg0] = true;
                        n6 = 0;
                    }
                } else {
                    n6 = 1;
                }
                nArray[n5++] = n6;
            }
        }
        for (n3 = 0; n5 > n3; ++n3) {
            n2 = nArray[n3];
            nArray[n5 - -n3] = ib.a(-(n2 >>> 3) + n2, 0xF8F8FF);
            nArray[n3 + 2 * n5] = ib.a(-(n2 >>> 2) + n2, 0xF8F8FF);
            nArray[n3 + n5 * 3] = ib.a(-(n2 >>> 3) + n2 + -(n2 >>> 2), 0xF8F8FF);
        }
    }

    final int a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
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
        int n2 = this.T.b(false, arg1, arg3, arg4);
        int n3 = this.T.b(false, arg1, arg3, -arg6 + arg4);
        int[] nArray = new int[]{n2, n3};
        this.T.a(2, nArray, 0, 0, false);
        this.T.E[this.n] = arg2;
        this.T.zb[this.n++] = 0;
        return this.n - 1;
    }

    /*
     * Unable to fully structure code
     */
    private final void a(int arg0, int arg1, int arg2, w[] arg3) {
        if (arg2 >= -50) {
            this.a((byte)-98, 32);
        }
        for (var5_5 = 0; var5_5 <= arg0; ++var5_5) {
            arg3[var5_5].c = false;
            arg3[var5_5].f = var5_5;
            arg3[var5_5].p = -1;
        }
        var5_5 = 0;
        block1: while (true) {
            if (arg3[var5_5].c) {
                ++var5_5;
                continue;
            }
            if (arg0 == var5_5) {
                return;
            }
            var6_6 = arg3[var5_5];
            var6_6.c = true;
            var7_7 = var5_5;
            var8_8 = var5_5 - -arg1;
            if (var8_8 >= arg0) {
                var8_8 = arg0 - 1;
            }
            var9_9 = var8_8;
            while (true) {
                if (1 + var7_7 <= var9_9) ** break;
                continue block1;
                var10_10 = arg3[var9_9];
                if (var6_6.e < var10_10.m && var6_6.m > var10_10.e && var10_10.j > var6_6.h && var6_6.j > var10_10.h && var10_10.p != var6_6.f && !this.a((byte)-84, var10_10, var6_6) && this.a(false, var10_10, var6_6)) {
                    this.a(var7_7, arg3, var9_9, (byte)34);
                    var7_7 = this.e;
                    if (arg3[var9_9] != var10_10) {
                        ++var9_9;
                    }
                    var10_10.p = var6_6.f;
                }
                --var9_9;
            }
            break;
        }
    }

    final void d(int arg0, int arg1) {
        int n2;
        int n3;
        int n4;
        if (this.kb[arg1] == null) {
            return;
        }
        int[] nArray = this.kb[arg1];
        for (n4 = 0; n4 < 64; ++n4) {
            n3 = 4032 + n4;
            n2 = nArray[n3];
            for (int i2 = 0; i2 < 63; ++i2) {
                nArray[n3] = nArray[n3 - 64];
                n3 -= 64;
            }
            this.kb[arg1][n3] = n2;
        }
        if (arg0 != 25013) {
            this.b = 60;
        }
        n4 = 4096;
        for (n3 = 0; n4 > n3; ++n3) {
            n2 = nArray[n3];
            nArray[n4 - -n3] = ib.a(n2 - (n2 >>> 3), 0xF8F8FF);
            nArray[n3 + n4 * 2] = ib.a(0xF8F8FF, n2 - (n2 >>> 2));
            nArray[n3 + n4 * 3] = ib.a(0xF8F8FF, -(n2 >>> 3) + n2 - (n2 >>> 2));
        }
    }

    final int b(int arg0) {
        if (arg0 != 0) {
            this.S = null;
        }
        return this.cc;
    }

    final void a(byte arg0, int arg1) {
        block1: {
            if (arg0 != 67) {
                this.cb = 31;
            }
            this.n -= arg1;
            this.T.b(2 * arg1, -113, arg1);
            if (this.n >= 0) break block1;
            this.n = 0;
        }
    }

    final void b(int arg0, int arg1, int arg2) {
        if (arg0 <= 15) {
            this.kb = null;
        }
        this.Q[arg1] = arg2;
    }

    private final boolean a(int arg0, w[] arg1, int arg2, byte arg3) {
        while (true) {
            w w2;
            w w3;
            w w4 = arg1[arg0];
            for (int i2 = arg0 + 1; arg2 >= i2 && this.a((byte)-114, w4, w3 = arg1[i2]); ++i2) {
                arg1[arg0] = w3;
                arg0 = i2;
                arg1[i2] = w4;
                if (arg0 != arg2) continue;
                this.eb = arg0 - 1;
                this.e = arg0;
                return true;
            }
            w w5 = arg1[arg2];
            int n2 = arg2 - 1;
            while (arg0 <= n2 && this.a((byte)-46, w2 = arg1[n2], w5)) {
                arg1[arg2] = w2;
                arg1[n2] = w5;
                if (arg0 != (arg2 = n2--)) continue;
                this.eb = arg2;
                this.e = arg2 + 1;
                return true;
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

    final void a(int arg0, int arg1, int arg2, int arg3) {
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

    private final void a(int arg0, int arg1, int arg2, boolean arg3) {
        block9: {
            int n2;
            int n3;
            int n4;
            int n5 = 1024 + -this.Kb & 0x3FF;
            int n6 = 0x3FF & 1024 + -this.xb;
            int n7 = 1024 + -this.b & 0x3FF;
            if (!arg3) {
                this.Zb = 25;
            }
            if (n7 != 0) {
                n4 = ba.cc[n7];
                n3 = ba.cc[1024 + n7];
                n2 = n3 * arg1 + n4 * arg2 >> 15;
                arg2 = -(n4 * arg1) + arg2 * n3 >> 15;
                arg1 = n2;
            }
            if (n5 != 0) {
                n3 = ba.cc[1024 + n5];
                n4 = ba.cc[n5];
                n2 = -(n4 * arg0) + arg2 * n3 >> 15;
                arg0 = n3 * arg0 + n4 * arg2 >> 15;
                arg2 = n2;
            }
            if (n6 != 0) {
                n4 = ba.cc[n6];
                n3 = ba.cc[1024 + n6];
                n2 = n4 * arg0 + arg1 * n3 >> 15;
                arg0 = n3 * arg0 - n4 * arg1 >> 15;
                arg1 = n2;
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
            if (arg1 >= aa.f) break block9;
            aa.f = arg1;
        }
    }

    final void c(int arg0, int arg1) {
        block0: {
            this.T.zb[arg1] = 1;
            if (arg0 == 32768) break block0;
            this.Cb = 32;
        }
    }

    final void c(int arg0) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        ca ca2;
        int n7;
        int n8;
        this.f = this.dc.i;
        int n9 = this.A * this.Mb >> this.R;
        aa.b = 0;
        nb.y = 0;
        m.j = 0;
        da.K = 0;
        int n10 = this.Mb * this.wb >> this.R;
        oa.b = 0;
        aa.f = 0;
        this.a(this.Mb, -n9, -n10, true);
        this.a(this.Mb, -n9, n10, true);
        this.a(this.Mb, n9, -n10, true);
        this.a(this.Mb, n9, n10, true);
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
        for (n8 = 0; n8 < this.ab; ++n8) {
            this.Z[n8].a(this.o, this.R, this.bc, (byte)-122, this.I, this.xb, this.b, this.Kb, this.nb);
        }
        this.Z[this.ab].a(this.o, this.R, this.bc, (byte)-114, this.I, this.xb, this.b, this.Kb, this.nb);
        this.zb = 0;
        for (n7 = 0; this.ab > n7; ++n7) {
            ca2 = this.Z[n7];
            if (!ca2.dc) continue;
            for (n8 = 0; ca2.t > n8; ++n8) {
                int n11;
                int n12;
                n6 = ca2.lb[n8];
                int[] nArray = ca2.o[n8];
                int n13 = 0;
                for (n12 = 0; n12 < n6; ++n12) {
                    n11 = ca2.bb[nArray[n12]];
                    if (this.nb >= n11 || n11 >= this.Mb) continue;
                    n13 = 1;
                    break;
                }
                if (n13 == false) continue;
                n13 = 0;
                for (n12 = 0; n12 < n6; ++n12) {
                    n11 = ca2.pb[nArray[n12]];
                    if (n11 > -this.A) {
                        n13 |= 1;
                    }
                    if (n11 < this.A) {
                        n13 |= 2;
                    }
                    if (n13 == 3) break;
                }
                if (n13 != 3) continue;
                n13 = 0;
                for (n12 = 0; n12 < n6; ++n12) {
                    n11 = ca2.Ob[nArray[n12]];
                    if (-this.wb < n11) {
                        n13 |= 1;
                    }
                    if (n11 < this.wb) {
                        n13 |= 2;
                    }
                    if (n13 == 3) break;
                }
                if (n13 != 3) continue;
                w w2 = this.y[this.zb];
                w2.o = ca2;
                w2.i = n8;
                this.a(this.zb, -21875);
                n5 = w2.s < 0 ? ca2.V[n8] : ca2.qb[n8];
                if (n5 == 12345678) continue;
                n4 = 0;
                for (n3 = 0; n6 > n3; ++n3) {
                    n4 += ca2.bb[nArray[n3]];
                }
                w2.t = ca2.hc + n4 / n6;
                ++this.zb;
                w2.b = n5;
            }
        }
        if (arg0 > -99) {
            this.H = null;
        }
        ca2 = this.T;
        if (ca2.dc) {
            for (n8 = 0; ca2.t > n8; ++n8) {
                int[] nArray = ca2.o[n8];
                n6 = nArray[0];
                int n14 = ca2.pb[n6];
                int n15 = ca2.Ob[n6];
                n5 = ca2.bb[n6];
                if (this.nb >= n5 || this.X <= n5) continue;
                n3 = (this.ob[n8] << this.R) / n5;
                n2 = (this.Eb[n8] << this.R) / n5;
                if (this.A < -(n3 / 2) + n14 || n14 + n3 / 2 < -this.A || n15 + -n2 > this.wb || -this.wb > n15) continue;
                w w3 = this.y[this.zb];
                w3.i = n8;
                w3.o = ca2;
                this.b(-103, this.zb);
                w3.t = (ca2.bb[nArray[1]] + n5) / 2;
                ++this.zb;
            }
        }
        if (this.zb == 0) {
            return;
        }
        this.a(0, -1, this.y, this.zb - 1);
        this.a(this.zb, 100, -53, this.y);
        for (n7 = 0; n7 < this.zb; ++n7) {
            int n16;
            int n17;
            int n18;
            int n19;
            w w4 = this.y[n7];
            n8 = w4.i;
            ca2 = w4.o;
            if (ca2 != this.T) {
                n3 = 0;
                n19 = 0;
                n18 = ca2.lb[n8];
                if (ca2.Hb[n8] != 12345678) {
                    n19 = w4.s < 0 ? ca2.Jb + -ca2.Hb[n8] : ca2.Jb - -ca2.Hb[n8];
                }
                int[] nArray = ca2.o[n8];
                for (n17 = 0; n17 < n18; ++n17) {
                    int n20;
                    n4 = nArray[n17];
                    this.Qb[n17] = ca2.cc[n4];
                    this.Vb[n17] = ca2.H[n4];
                    this.J[n17] = ca2.bb[n4];
                    if (ca2.Hb[n8] == 12345678) {
                        n19 = w4.s < 0 ? -ca2.gb[n4] + (ca2.Jb - -ca2.Ab[n4]) : ca2.Ab[n4] + (ca2.Jb - -ca2.gb[n4]);
                    }
                    if (ca2.bb[n4] >= this.nb) {
                        this.yb[n3] = ca2.pb[n4];
                        this.B[n3] = ca2.Ob[n4];
                        this.r[n3] = n19;
                        if (ca2.bb[n4] > this.G) {
                            int n21 = n3;
                            this.r[n21] = this.r[n21] + (-this.G + ca2.bb[n4]) / this.P;
                        }
                        ++n3;
                        continue;
                    }
                    n2 = n17 != 0 ? nArray[n17 - 1] : nArray[n18 - 1];
                    if (this.nb <= ca2.bb[n2]) {
                        n5 = ca2.bb[n4] - ca2.bb[n2];
                        n16 = ca2.H[n4] - (ca2.bb[n4] + -this.nb) * (-ca2.H[n2] + ca2.H[n4]) / n5;
                        n20 = -((-ca2.cc[n2] + ca2.cc[n4]) * (ca2.bb[n4] + -this.nb) / n5) + ca2.cc[n4];
                        this.yb[n3] = (n20 << this.R) / this.nb;
                        this.B[n3] = (n16 << this.R) / this.nb;
                        this.r[n3] = n19;
                        ++n3;
                    }
                    n2 = n17 == n18 - 1 ? nArray[0] : nArray[n17 + 1];
                    if (this.nb > ca2.bb[n2]) continue;
                    n5 = -ca2.bb[n2] + ca2.bb[n4];
                    n16 = ca2.H[n4] + -((-this.nb + ca2.bb[n4]) * (ca2.H[n4] - ca2.H[n2]) / n5);
                    n20 = -((ca2.cc[n4] + -ca2.cc[n2]) * (-this.nb + ca2.bb[n4]) / n5) + ca2.cc[n4];
                    this.yb[n3] = (n20 << this.R) / this.nb;
                    this.B[n3] = (n16 << this.R) / this.nb;
                    this.r[n3] = n19;
                    ++n3;
                }
                for (n17 = 0; n17 < n18; ++n17) {
                    if (this.r[n17] >= 0) {
                        if (this.r[n17] > 255) {
                            this.r[n17] = 255;
                        }
                    } else {
                        this.r[n17] = 0;
                    }
                    if (w4.b < 0) continue;
                    if (this.Hb[w4.b] != 1) {
                        int n22 = n17;
                        this.r[n22] = this.r[n22] << 6;
                        continue;
                    }
                    int n23 = n17;
                    this.r[n23] = this.r[n23] << 9;
                }
                this.a(0, n8, this.B, 0, 0, ca2, this.yb, this.r, 0, 5960, n3);
                if (this.Cb <= this.Xb) continue;
                this.a(this.Vb, ca2, 1, n18, w4.b, this.J, this.Qb, 0, 0);
                continue;
            }
            int[] nArray = ca2.o[n8];
            n16 = nArray[0];
            n5 = ca2.pb[n16];
            n3 = ca2.Ob[n16];
            n2 = ca2.bb[n16];
            n19 = (this.ob[n8] << this.R) / n2;
            n18 = (this.Eb[n8] << this.R) / n2;
            int n24 = n3 - ca2.Ob[nArray[1]];
            n17 = n24 * (ca2.pb[nArray[1]] - n5) / n18;
            n17 = ca2.pb[nArray[1]] - n5;
            int n25 = n5 - n19 / 2;
            int n26 = this.Nb - (-n3 - -n18);
            this.dc.a((256 << this.R) / n2, this.gb[n8], n18, n25 - -this.Zb, n26, n19, (byte)29, n17);
            if (!this.K || this.cc >= this.db || n26 > this.Wb || this.Wb > n26 + n18 || this.j < (n25 += (this.Q[n8] << this.R) / n2) || n25 - -n19 < this.j || ca2.db || ca2.zb[n8] != 0) continue;
            this.Ab[this.cc] = ca2;
            this.qb[this.cc] = n8;
            ++this.cc;
        }
        this.K = false;
    }

    private final void b(int arg0, boolean arg1) {
        if (!arg1) {
            this.K = false;
        }
        if (arg0 < 0) {
            return;
        }
        ++k.e;
        if (this.kb[arg0] != null) {
            return;
        }
        if (this.Hb[arg0] != 0) {
            for (int i2 = 0; i2 < this.ec.length; ++i2) {
                if (this.ec[i2] != null) continue;
                this.ec[i2] = new int[65536];
                this.kb[arg0] = this.ec[i2];
                this.a(arg0, (byte)118);
                return;
            }
            long l2 = 0x40000000L;
            int n2 = 0;
            for (int i3 = 0; i3 < this.cb; ++i3) {
                if (arg0 == i3 || this.Hb[i3] != 1 || this.kb[i3] == null || this.D[i3] >= l2) continue;
                l2 = this.D[i3];
                n2 = i3;
            }
            this.kb[arg0] = this.kb[n2];
            this.kb[n2] = null;
            this.a(arg0, (byte)118);
        } else {
            for (int i4 = 0; i4 < this.i.length; ++i4) {
                if (this.i[i4] != null) continue;
                this.i[i4] = new int[16384];
                this.kb[arg0] = this.i[i4];
                this.a(arg0, (byte)118);
                return;
            }
            long l3 = 0x40000000L;
            int n3 = 0;
            for (int i5 = 0; this.cb > i5; ++i5) {
                if (arg0 == i5 || this.Hb[i5] != 0 || this.kb[i5] == null || (l3 ^ 0xFFFFFFFFFFFFFFFFL) >= (this.D[i5] ^ 0xFFFFFFFFFFFFFFFFL)) continue;
                l3 = this.D[i5];
                n3 = i5;
            }
            this.kb[arg0] = this.kb[n3];
            this.kb[n3] = null;
            this.a(arg0, (byte)118);
        }
    }

    private final void a(int[] arg0, ca arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
        block63: {
            if (arg4 == -2) {
                return;
            }
            if (arg4 >= 0) {
                if (arg4 >= this.cb) {
                    arg4 = 0;
                }
                this.b(arg4, true);
                int n2 = arg6[0];
                int n3 = arg0[0];
                int n4 = arg5[0];
                int n5 = n2 - arg6[1];
                int n6 = -arg0[1] + n3;
                int n7 = n4 + -arg5[1];
                int n8 = arg6[--arg3] + -n2;
                int n9 = -n3 + arg0[arg3];
                int n10 = arg5[arg3] - n4;
                if (this.Hb[arg4] == 1) {
                    int n11 = -(n9 * n2) + n3 * n8 << 12;
                    int n12 = n9 * n4 + -(n10 * n3) << 4 + -this.R + 5 + 7;
                    int n13 = n10 * n2 + -(n8 * n4) << 7 + -this.R + 5;
                    int n14 = n3 * n5 - n2 * n6 << 12;
                    int n15 = n6 * n4 - n7 * n3 << -this.R + 5 + 11;
                    int n16 = -(n4 * n5) + n2 * n7 << 7 + (5 - this.R);
                    int n17 = n8 * n6 + -(n9 * n5) << 5;
                    int n18 = n7 * n9 - n6 * n10 << 4 + (-this.R + 5);
                    int n19 = n5 * n10 + -(n7 * n8) >> this.R - 5;
                    int n20 = n12 >> 4;
                    int n21 = n15 >> 4;
                    int n22 = n18 >> 4;
                    int n23 = -this.Nb + this.Xb;
                    int n24 = this.vb;
                    int n25 = n24 * this.Xb + this.Zb;
                    n14 += n23 * n16;
                    int n26 = 1;
                    n17 += n19 * n23;
                    n11 += n13 * n23;
                    if (this.f) {
                        if ((this.Xb & 1) == 1) {
                            n14 += n16;
                            n25 += n24;
                            n11 += n13;
                            n17 += n19;
                            ++this.Xb;
                        }
                        n19 <<= 1;
                        n16 <<= 1;
                        n26 = 2;
                        n13 <<= 1;
                        n24 <<= 1;
                    }
                    if (!arg1.Kb) {
                        if (!(!this.S[arg4])) {
                            for (arg8 = this.Xb; this.Cb > arg8; arg8 += n26) {
                                n n27 = this.x[arg8];
                                arg7 = n27.d >> 8;
                                int n28 = n27.k >> 8;
                                int n29 = -arg7 + n28;
                                if (n29 <= 0) {
                                    n14 += n16;
                                    n11 += n13;
                                    n25 += n24;
                                    n17 += n19;
                                    continue;
                                }
                                int n30 = n27.e;
                                int n31 = (-n30 + n27.l) / n29;
                                if (-this.A > arg7) {
                                    n30 += (-arg7 + -this.A) * n31;
                                    arg7 = -this.A;
                                    n29 = n28 - arg7;
                                }
                                if (this.A < n28) {
                                    n28 = this.A;
                                    n29 = -arg7 + n28;
                                }
                                wb.a(n15, 10, 0, 0, this.pb, n17 + arg7 * n22, n30, arg7 * n20 + n11, n14 - -(arg7 * n21), arg7 + n25, n18, n31, 0, n12, this.kb[arg4], n29);
                                n25 += n24;
                                n14 += n16;
                                n17 += n19;
                                n11 += n13;
                            }
                        } else {
                            for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n26) {
                                n n32 = this.x[arg8];
                                int n33 = n32.k >> 8;
                                arg7 = n32.d >> 8;
                                int n34 = n33 + -arg7;
                                if (n34 <= 0) {
                                    n17 += n19;
                                    n11 += n13;
                                    n25 += n24;
                                    n14 += n16;
                                    continue;
                                }
                                int n35 = n32.e;
                                int n36 = (n32.l + -n35) / n34;
                                if (arg7 < -this.A) {
                                    n35 += (-this.A - arg7) * n36;
                                    arg7 = -this.A;
                                    n34 = -arg7 + n33;
                                }
                                if (this.A < n33) {
                                    n33 = this.A;
                                    n34 = n33 + -arg7;
                                }
                                gb.a(n14 - -(n21 * arg7), n12, (byte)50, n17 + arg7 * n22, n35, n36 << 2, this.kb[arg4], arg7 + n25, arg7 * n20 + n11, n18, 0, 0, this.pb, n15, n34);
                                n11 += n13;
                                n17 += n19;
                                n25 += n24;
                                n14 += n16;
                            }
                        }
                    } else {
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n26) {
                            n n37 = this.x[arg8];
                            arg7 = n37.d >> 8;
                            int n38 = n37.k >> 8;
                            int n39 = -arg7 + n38;
                            if (n39 <= 0) {
                                n25 += n24;
                                n17 += n19;
                                n11 += n13;
                                n14 += n16;
                                continue;
                            }
                            int n40 = n37.e;
                            int n41 = (-n40 + n37.l) / n39;
                            if (arg7 < -this.A) {
                                n40 += n41 * (-arg7 + -this.A);
                                arg7 = -this.A;
                                n39 = n38 - arg7;
                            }
                            if (this.A < n38) {
                                n38 = this.A;
                                n39 = -arg7 + n38;
                            }
                            cb.a(n25 + arg7, n14 + arg7 * n21, n11 + arg7 * n20, 0, n40, n15, 0, n17 - -(arg7 * n22), n12, n41 << 2, this.kb[arg4], n39, n18, this.pb, (byte)119);
                            n25 += n24;
                            n14 += n16;
                            n11 += n13;
                            n17 += n19;
                        }
                    }
                } else {
                    int n42 = n8 * n3 + -(n2 * n9) << 11;
                    int n43 = n4 * n9 + -(n10 * n3) << 4 + (6 + (-this.R + 5));
                    int n44 = n10 * n2 + -(n8 * n4) << 11 - this.R;
                    int n45 = n3 * n5 + -(n6 * n2) << 11;
                    int n46 = n4 * n6 + -(n3 * n7) << 4 + -this.R + 11;
                    int n47 = n7 * n2 - n4 * n5 << 11 + -this.R;
                    int n48 = -(n9 * n5) + n8 * n6 << 5;
                    int n49 = n9 * n7 - n6 * n10 << 4 + (-this.R + 5);
                    int n50 = n10 * n5 + -(n8 * n7) >> this.R - 5;
                    int n51 = n43 >> 4;
                    int n52 = n46 >> 4;
                    int n53 = n49 >> 4;
                    int n54 = this.Xb + -this.Nb;
                    int n55 = this.vb;
                    int n56 = n55 * this.Xb + this.Zb;
                    n45 += n54 * n47;
                    int n57 = 1;
                    n42 += n54 * n44;
                    n48 += n50 * n54;
                    if (!(!this.f)) {
                        if ((1 & this.Xb) == 1) {
                            n45 += n47;
                            n48 += n50;
                            n42 += n44;
                            ++this.Xb;
                            n56 += n55;
                        }
                        n44 <<= 1;
                        n55 <<= 1;
                        n50 <<= 1;
                        n57 = 2;
                        n47 <<= 1;
                    }
                    if (arg1.Kb) {
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n57) {
                            n n58 = this.x[arg8];
                            int n59 = n58.k >> 8;
                            arg7 = n58.d >> 8;
                            int n60 = n59 + -arg7;
                            if (n60 <= 0) {
                                n45 += n47;
                                n48 += n50;
                                n56 += n55;
                                n42 += n44;
                                continue;
                            }
                            int n61 = n58.e;
                            int n62 = (-n61 + n58.l) / n60;
                            if (-this.A > arg7) {
                                n61 += n62 * (-this.A + -arg7);
                                arg7 = -this.A;
                                n60 = n59 - arg7;
                            }
                            if (this.A < n59) {
                                n59 = this.A;
                                n60 = n59 - arg7;
                            }
                            jb.a(this.pb, n46, n49, arg7 * n53 + n48, n62, n61, arg7 + n56, n60, n51 * arg7 + n42, 0, this.kb[arg4], false, n43, arg7 * n52 + n45, 0);
                            n56 += n55;
                            n48 += n50;
                            n42 += n44;
                            n45 += n47;
                        }
                    } else if (!this.S[arg4]) {
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n57) {
                            n n63 = this.x[arg8];
                            int n64 = n63.k >> 8;
                            arg7 = n63.d >> 8;
                            int n65 = n64 - arg7;
                            if (n65 <= 0) {
                                n56 += n55;
                                n48 += n50;
                                n45 += n47;
                                n42 += n44;
                                continue;
                            }
                            int n66 = n63.e;
                            int n67 = (n63.l + -n66) / n65;
                            if (arg7 < -this.A) {
                                n66 += (-this.A + -arg7) * n67;
                                arg7 = -this.A;
                                n65 = -arg7 + n64;
                            }
                            if (this.A < n64) {
                                n64 = this.A;
                                n65 = n64 + -arg7;
                            }
                            p.a(n67, 1121159302, n46, arg7 * n52 + n45, n43, this.kb[arg4], n66, 0, n42 + n51 * arg7, 0, this.pb, n56 + arg7, n48 - -(arg7 * n53), n49, n65);
                            n56 += n55;
                            n45 += n47;
                            n42 += n44;
                            n48 += n50;
                        }
                    } else {
                        for (arg8 = this.Xb; this.Cb > arg8; arg8 += n57) {
                            n n68 = this.x[arg8];
                            arg7 = n68.d >> 8;
                            int n69 = n68.k >> 8;
                            int n70 = -arg7 + n69;
                            if (n70 <= 0) {
                                n48 += n50;
                                n56 += n55;
                                n42 += n44;
                                n45 += n47;
                                continue;
                            }
                            int n71 = n68.e;
                            int n72 = (-n71 + n68.l) / n70;
                            if (arg7 < -this.A) {
                                n71 += n72 * (-this.A + -arg7);
                                arg7 = -this.A;
                                n70 = -arg7 + n69;
                            }
                            if (n69 > this.A) {
                                n69 = this.A;
                                n70 = -arg7 + n69;
                            }
                            cb.a(n70, n53 * arg7 + n48, 0, (byte)25, 0, n43, n49, n72, this.kb[arg4], this.pb, arg7 + n56, arg7 * n51 + n42, 0, n46, n71, n52 * arg7 + n45);
                            n48 += n50;
                            n45 += n47;
                            n56 += n55;
                            n42 += n44;
                        }
                    }
                }
            } else {
                int n73;
                int n74;
                int n75;
                int n76;
                int n77;
                int n78;
                int n79;
                for (n79 = 0; n79 < this.ib; ++n79) {
                    if (this.v[n79] == arg4) {
                        this.H = this.Ib[n79];
                        break;
                    }
                    if (n79 != this.ib - 1) continue;
                    n78 = (int)(Math.random() * (double)this.ib);
                    this.v[n78] = arg4;
                    arg4 = -arg4 - 1;
                    n77 = ((0x7D19 & arg4) >> 10) * 8;
                    int n80 = 8 * ((0x3FB & arg4) >> 5);
                    n76 = (0x1F & arg4) * 8;
                    for (n75 = 0; n75 < 256; ++n75) {
                        n74 = n75 * n75;
                        n73 = n77 * n74 / 65536;
                        int n81 = n74 * n80 / 65536;
                        int n82 = n76 * n74 / 65536;
                        this.Ib[n78][255 + -n75] = n82 + (n81 << 8) + (n73 << 16);
                    }
                    this.H = this.Ib[n78];
                }
                n79 = this.vb;
                n78 = this.Xb * n79 + this.Zb;
                n77 = 1;
                if (this.f) {
                    if ((this.Xb & 1) == 1) {
                        ++this.Xb;
                        n78 += n79;
                    }
                    n79 <<= 1;
                    n77 = 2;
                }
                if (arg1.cb) {
                    for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n77) {
                        n n83 = this.x[arg8];
                        n76 = n83.k >> 8;
                        arg7 = n83.d >> 8;
                        n75 = n76 + -arg7;
                        if (n75 <= 0) {
                            n78 += n79;
                            continue;
                        }
                        n74 = n83.e;
                        n73 = (n83.l + -n74) / n75;
                        if (arg7 < -this.A) {
                            n74 += n73 * (-this.A + -arg7);
                            arg7 = -this.A;
                            n75 = n76 + -arg7;
                        }
                        if (n76 > this.A) {
                            n76 = this.A;
                            n75 = -arg7 + n76;
                        }
                        ua.a(n74, this.H, -n75, this.pb, 0, n73, arg7 + n78, arg2 - 1);
                        n78 += n79;
                    }
                } else if (!this.Ub) {
                    for (arg8 = this.Xb; this.Cb > arg8; arg8 += n77) {
                        n n84 = this.x[arg8];
                        n76 = n84.k >> 8;
                        arg7 = n84.d >> 8;
                        n75 = n76 + -arg7;
                        if (n75 <= 0) {
                            n78 += n79;
                            continue;
                        }
                        n74 = n84.e;
                        n73 = (n84.l - n74) / n75;
                        if (arg7 < -this.A) {
                            n74 += (-arg7 + -this.A) * n73;
                            arg7 = -this.A;
                            n75 = -arg7 + n76;
                        }
                        if (n76 > this.A) {
                            n76 = this.A;
                            n75 = -arg7 + n76;
                        }
                        t.a(0, n73, -n75, this.pb, this.H, n74, n78 + arg7, 418609192);
                        n78 += n79;
                    }
                } else {
                    for (arg8 = this.Xb; arg8 < this.Cb; arg8 += n77) {
                        n n85 = this.x[arg8];
                        n76 = n85.k >> 8;
                        arg7 = n85.d >> 8;
                        n75 = n76 + -arg7;
                        if (n75 <= 0) {
                            n78 += n79;
                            continue;
                        }
                        n74 = n85.e;
                        n73 = (n85.l - n74) / n75;
                        if (arg7 < -this.A) {
                            n74 += (-this.A + -arg7) * n73;
                            arg7 = -this.A;
                            n75 = n76 + -arg7;
                        }
                        if (n76 > this.A) {
                            n76 = this.A;
                            n75 = n76 + -arg7;
                        }
                        ia.a(n73, 0, this.H, n74, arg7 + n78, this.pb, -n75, (byte)82);
                        n78 += n79;
                    }
                }
            }
            if (arg2 == 1) break block63;
            this.a((byte)-48, (w)null, (w)null);
        }
    }

    private final void a(int arg0, int arg1, int[] arg2, int arg3, int arg4, ca arg5, int[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        block102: {
            int n2;
            if (arg10 == 3) {
                n2 = this.Nb + arg2[0];
                int n3 = arg2[1] - -this.Nb;
                int n4 = this.Nb + arg2[2];
                int n5 = arg6[0];
                int n6 = arg6[1];
                int n7 = arg6[2];
                int n8 = arg7[0];
                int n9 = arg7[1];
                int n10 = arg7[2];
                int n11 = this.wb + (this.Nb - 1);
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                int n15 = 0;
                int n16 = 12345678;
                int n17 = -12345678;
                if (n2 != n4) {
                    if (n4 <= n2) {
                        n14 = n10 << 8;
                        n16 = n4;
                        n17 = n2;
                        n12 = n7 << 8;
                    } else {
                        n16 = n2;
                        n17 = n4;
                        n12 = n5 << 8;
                        n14 = n8 << 8;
                    }
                    n15 = (-n8 + n10 << 8) / (-n2 + n4);
                    n13 = (n7 - n5 << 8) / (n4 + -n2);
                    if (n16 < 0) {
                        n12 -= n16 * n13;
                        n14 -= n15 * n16;
                        n16 = 0;
                    }
                    if (n17 > n11) {
                        n17 = n11;
                    }
                }
                int n18 = 0;
                int n19 = 0;
                int n20 = 0;
                int n21 = 0;
                int n22 = 12345678;
                int n23 = -12345678;
                if (n2 != n3) {
                    n19 = (n6 + -n5 << 8) / (-n2 + n3);
                    n21 = (-n8 + n9 << 8) / (-n2 + n3);
                    if (n3 > n2) {
                        n20 = n8 << 8;
                        n23 = n3;
                        n18 = n5 << 8;
                        n22 = n2;
                    } else {
                        n20 = n9 << 8;
                        n22 = n3;
                        n18 = n6 << 8;
                        n23 = n2;
                    }
                    if (n23 > n11) {
                        n23 = n11;
                    }
                    if (n22 < 0) {
                        n20 -= n21 * n22;
                        n18 -= n22 * n19;
                        n22 = 0;
                    }
                }
                int n24 = 0;
                int n25 = 0;
                int n26 = 0;
                int n27 = 0;
                int n28 = 12345678;
                int n29 = -12345678;
                if (n3 != n4) {
                    if (n4 > n3) {
                        n24 = n6 << 8;
                        n28 = n3;
                        n26 = n9 << 8;
                        n29 = n4;
                    } else {
                        n28 = n4;
                        n26 = n10 << 8;
                        n29 = n3;
                        n24 = n7 << 8;
                    }
                    n27 = (n10 - n9 << 8) / (n4 + -n3);
                    n25 = (n7 + -n6 << 8) / (n4 - n3);
                    if (n28 < 0) {
                        n26 -= n28 * n27;
                        n24 -= n25 * n28;
                        n28 = 0;
                    }
                    if (n11 < n29) {
                        n29 = n11;
                    }
                }
                this.Xb = n16;
                if (n22 < this.Xb) {
                    this.Xb = n22;
                }
                if (n28 < this.Xb) {
                    this.Xb = n28;
                }
                this.Cb = n17;
                if (n23 > this.Cb) {
                    this.Cb = n23;
                }
                if (n29 > this.Cb) {
                    this.Cb = n29;
                }
                int n30 = 0;
                for (arg3 = this.Xb; this.Cb > arg3; ++arg3) {
                    if (n16 > arg3 || n17 <= arg3) {
                        arg0 = 655360;
                        arg4 = -655360;
                    } else {
                        arg0 = arg4 = n12;
                        arg8 = n30 = n14;
                        n12 += n13;
                        n14 += n15;
                    }
                    if (n22 <= arg3 && arg3 < n23) {
                        if (n18 > arg4) {
                            arg4 = n18;
                            n30 = n20;
                        }
                        if (n18 < arg0) {
                            arg0 = n18;
                            arg8 = n20;
                        }
                        n20 += n21;
                        n18 += n19;
                    }
                    if (arg3 >= n28 && n29 > arg3) {
                        if (arg4 < n24) {
                            n30 = n26;
                            arg4 = n24;
                        }
                        if (n24 < arg0) {
                            arg0 = n24;
                            arg8 = n26;
                        }
                        n26 += n27;
                        n24 += n25;
                    }
                    n n31 = this.x[arg3];
                    n31.e = arg8;
                    n31.l = n30;
                    n31.d = arg0;
                    n31.k = arg4;
                }
                if (-this.wb + this.Nb > this.Xb) {
                    this.Xb = this.Nb + -this.wb;
                }
            } else if (arg10 != 4) {
                n n32;
                int n33;
                int n34;
                int n35;
                int n36;
                this.Xb = arg2[0] = arg2[0] + this.Nb;
                this.Cb = arg2[0];
                for (arg3 = 1; arg3 < arg10; ++arg3) {
                    int n37 = arg3;
                    int n38 = arg2[n37] + this.Nb;
                    arg2[n37] = n38;
                    int n39 = n38;
                    if (n38 >= this.Xb) {
                        if (this.Cb >= n39) continue;
                        this.Cb = n39;
                        continue;
                    }
                    this.Xb = n39;
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
                for (arg3 = this.Xb; arg3 < this.Cb; ++arg3) {
                    n n40 = this.x[arg3];
                    n40.k = -655360;
                    n40.d = 655360;
                }
                int n41 = arg2[0];
                n2 = arg10 - 1;
                int n42 = arg2[n2];
                if (n41 >= n42) {
                    if (n42 < n41) {
                        n36 = arg6[n2] << 8;
                        n35 = (-arg6[n2] + arg6[0] << 8) / (-n42 + n41);
                        n34 = arg7[n2] << 8;
                        n33 = (arg7[0] - arg7[n2] << 8) / (n41 + -n42);
                        if (this.Cb < n41) {
                            n41 = this.Cb;
                        }
                        if (n42 < 0) {
                            n34 -= n33 * n42;
                            n36 -= n35 * n42;
                            n42 = 0;
                        }
                        for (arg3 = n42; arg3 <= n41; ++arg3) {
                            n32 = this.x[arg3];
                            n32.d = n32.k = n36;
                            n32.e = n32.l = n34;
                            n36 += n35;
                            n34 += n33;
                        }
                    }
                } else {
                    n36 = arg6[0] << 8;
                    n35 = (arg6[n2] + -arg6[0] << 8) / (n42 + -n41);
                    n34 = arg7[0] << 8;
                    n33 = (-arg7[0] + arg7[n2] << 8) / (n42 - n41);
                    if (n41 < 0) {
                        n36 -= n41 * n35;
                        n34 -= n41 * n33;
                        n41 = 0;
                    }
                    if (n42 > this.Cb) {
                        n42 = this.Cb;
                    }
                    for (arg3 = n41; arg3 <= n42; ++arg3) {
                        n32 = this.x[arg3];
                        n32.e = n32.l = n34;
                        n32.d = n32.k = n36;
                        n36 += n35;
                        n34 += n33;
                    }
                }
                for (arg3 = 0; n2 > arg3; ++arg3) {
                    n n43;
                    int n44;
                    int n45;
                    n41 = arg2[arg3];
                    n36 = arg3 + 1;
                    n42 = arg2[n36];
                    if (n41 >= n42) {
                        if (n41 <= n42) continue;
                        n35 = arg6[n36] << 8;
                        n34 = (arg6[arg3] - arg6[n36] << 8) / (-n42 + n41);
                        n33 = arg7[n36] << 8;
                        n45 = (-arg7[n36] + arg7[arg3] << 8) / (-n42 + n41);
                        if (n42 < 0) {
                            n35 -= n34 * n42;
                            n33 -= n42 * n45;
                            n42 = 0;
                        }
                        if (this.Cb < n41) {
                            n41 = this.Cb;
                        }
                        for (n44 = n42; n41 >= n44; ++n44) {
                            n43 = this.x[n44];
                            if (n35 < n43.d) {
                                n43.e = n33;
                                n43.d = n35;
                            }
                            if (n35 > n43.k) {
                                n43.l = n33;
                                n43.k = n35;
                            }
                            n33 += n45;
                            n35 += n34;
                        }
                        continue;
                    }
                    n35 = arg6[arg3] << 8;
                    n34 = (arg6[n36] - arg6[arg3] << 8) / (-n41 + n42);
                    n33 = arg7[arg3] << 8;
                    n45 = (arg7[n36] + -arg7[arg3] << 8) / (-n41 + n42);
                    if (n42 > this.Cb) {
                        n42 = this.Cb;
                    }
                    if (n41 < 0) {
                        n35 -= n41 * n34;
                        n33 -= n41 * n45;
                        n41 = 0;
                    }
                    for (n44 = n41; n44 <= n42; ++n44) {
                        n43 = this.x[n44];
                        if (n35 > n43.k) {
                            n43.k = n35;
                            n43.l = n33;
                        }
                        if (n35 < n43.d) {
                            n43.d = n35;
                            n43.e = n33;
                        }
                        n33 += n45;
                        n35 += n34;
                    }
                }
                if (-this.wb + this.Nb > this.Xb) {
                    this.Xb = -this.wb + this.Nb;
                }
            } else {
                n2 = arg2[0] - -this.Nb;
                int n46 = this.Nb + arg2[1];
                int n47 = this.Nb + arg2[2];
                int n48 = this.Nb + arg2[3];
                int n49 = arg6[0];
                int n50 = arg6[1];
                int n51 = arg6[2];
                int n52 = arg6[3];
                int n53 = arg7[0];
                int n54 = arg7[1];
                int n55 = arg7[2];
                int n56 = arg7[3];
                int n57 = this.wb + this.Nb - 1;
                int n58 = 0;
                int n59 = 0;
                int n60 = 0;
                int n61 = 0;
                int n62 = 12345678;
                int n63 = -12345678;
                if (n2 != n48) {
                    n59 = (-n49 + n52 << 8) / (n48 + -n2);
                    n61 = (n56 + -n53 << 8) / (n48 + -n2);
                    if (n48 <= n2) {
                        n62 = n48;
                        n58 = n52 << 8;
                        n60 = n56 << 8;
                        n63 = n2;
                    } else {
                        n63 = n48;
                        n58 = n49 << 8;
                        n62 = n2;
                        n60 = n53 << 8;
                    }
                    if (n62 < 0) {
                        n60 -= n61 * n62;
                        n58 -= n62 * n59;
                        n62 = 0;
                    }
                    if (n57 < n63) {
                        n63 = n57;
                    }
                }
                int n64 = 0;
                int n65 = 0;
                int n66 = 0;
                int n67 = 0;
                int n68 = 12345678;
                int n69 = -12345678;
                if (n46 != n2) {
                    n67 = (n54 - n53 << 8) / (n46 - n2);
                    if (n2 >= n46) {
                        n68 = n46;
                        n66 = n54 << 8;
                        n69 = n2;
                        n64 = n50 << 8;
                    } else {
                        n68 = n2;
                        n69 = n46;
                        n64 = n49 << 8;
                        n66 = n53 << 8;
                    }
                    n65 = (-n49 + n50 << 8) / (-n2 + n46);
                    if (n57 < n69) {
                        n69 = n57;
                    }
                    if (n68 < 0) {
                        n64 -= n68 * n65;
                        n66 -= n67 * n68;
                        n68 = 0;
                    }
                }
                int n70 = 0;
                int n71 = 0;
                int n72 = 0;
                int n73 = 0;
                int n74 = 12345678;
                int n75 = -12345678;
                if (n47 != n46) {
                    n73 = (-n54 + n55 << 8) / (-n46 + n47);
                    if (n46 >= n47) {
                        n74 = n47;
                        n72 = n55 << 8;
                        n70 = n51 << 8;
                        n75 = n46;
                    } else {
                        n74 = n46;
                        n72 = n54 << 8;
                        n75 = n47;
                        n70 = n50 << 8;
                    }
                    n71 = (-n50 + n51 << 8) / (n47 - n46);
                    if (n74 < 0) {
                        n72 -= n74 * n73;
                        n70 -= n71 * n74;
                        n74 = 0;
                    }
                    if (n75 > n57) {
                        n75 = n57;
                    }
                }
                int n76 = 0;
                int n77 = 0;
                int n78 = 0;
                int n79 = 0;
                int n80 = 12345678;
                int n81 = -12345678;
                if (n47 != n48) {
                    n79 = (-n55 + n56 << 8) / (-n47 + n48);
                    if (n48 <= n47) {
                        n81 = n47;
                        n78 = n56 << 8;
                        n76 = n52 << 8;
                        n80 = n48;
                    } else {
                        n78 = n55 << 8;
                        n81 = n48;
                        n80 = n47;
                        n76 = n51 << 8;
                    }
                    n77 = (-n51 + n52 << 8) / (n48 + -n47);
                    if (n80 < 0) {
                        n76 -= n80 * n77;
                        n78 -= n80 * n79;
                        n80 = 0;
                    }
                    if (n81 > n57) {
                        n81 = n57;
                    }
                }
                this.Xb = n62;
                if (this.Xb > n68) {
                    this.Xb = n68;
                }
                if (this.Xb > n74) {
                    this.Xb = n74;
                }
                this.Cb = n63;
                if (n80 < this.Xb) {
                    this.Xb = n80;
                }
                if (n69 > this.Cb) {
                    this.Cb = n69;
                }
                if (n75 > this.Cb) {
                    this.Cb = n75;
                }
                if (n81 > this.Cb) {
                    this.Cb = n81;
                }
                int n82 = 0;
                for (arg3 = this.Xb; this.Cb > arg3; ++arg3) {
                    if (n62 > arg3 || n63 <= arg3) {
                        arg4 = -655360;
                        arg0 = 655360;
                    } else {
                        arg8 = n82 = n60;
                        arg0 = arg4 = n58;
                        n60 += n61;
                        n58 += n59;
                    }
                    if (n68 <= arg3 && arg3 < n69) {
                        if (arg0 > n64) {
                            arg8 = n66;
                            arg0 = n64;
                        }
                        if (arg4 < n64) {
                            n82 = n66;
                            arg4 = n64;
                        }
                        n64 += n65;
                        n66 += n67;
                    }
                    if (arg3 >= n74 && n75 > arg3) {
                        if (n70 > arg4) {
                            arg4 = n70;
                            n82 = n72;
                        }
                        if (arg0 > n70) {
                            arg0 = n70;
                            arg8 = n72;
                        }
                        n70 += n71;
                        n72 += n73;
                    }
                    if (n80 <= arg3 && arg3 < n81) {
                        if (n76 > arg4) {
                            n82 = n78;
                            arg4 = n76;
                        }
                        if (arg0 > n76) {
                            arg0 = n76;
                            arg8 = n78;
                        }
                        n78 += n79;
                        n76 += n77;
                    }
                    n n83 = this.x[arg3];
                    n83.e = arg8;
                    n83.d = arg0;
                    n83.k = arg4;
                    n83.l = n82;
                }
                if (-this.wb + this.Nb > this.Xb) {
                    this.Xb = this.Nb + -this.wb;
                }
            }
            if (arg9 != 5960) {
                return;
            }
            if (!this.K || this.db <= this.cc || this.Xb > this.Wb || this.Wb >= this.Cb) break block102;
            n n84 = this.x[this.Wb];
            if (this.j >= n84.d >> 8 && this.j <= n84.k >> 8 && n84.d <= n84.k && !arg5.db && arg5.zb[arg1] == 0) {
                this.Ab[this.cc] = arg5;
                this.qb[this.cc] = arg1;
                ++this.cc;
            }
        }
    }

    final void a(ca arg0, int arg1) {
        if (arg1 != -1) {
            this.jb = null;
        }
        for (int i2 = 0; i2 < this.ab; ++i2) {
            if (this.Z[i2] != arg0) continue;
            --this.ab;
            for (int i3 = i2; this.ab > i3; ++i3) {
                this.Z[i3] = this.Z[i3 + 1];
                this.jb[i3] = this.jb[1 + i3];
            }
        }
    }

    private final void a(int arg0, int arg1) {
        int n2;
        int n3;
        int n4;
        int n5;
        w w2 = this.y[arg0];
        ca ca2 = w2.o;
        int n6 = w2.i;
        int[] nArray = ca2.o[n6];
        int n7 = ca2.lb[n6];
        int n8 = ca2.M[n6];
        int n9 = ca2.cc[nArray[0]];
        int n10 = ca2.H[nArray[0]];
        int n11 = ca2.bb[nArray[0]];
        int n12 = -n9 + ca2.cc[nArray[1]];
        int n13 = -n10 + ca2.H[nArray[1]];
        int n14 = -n11 + ca2.bb[nArray[1]];
        int n15 = -n9 + ca2.cc[nArray[2]];
        int n16 = ca2.H[nArray[2]] + -n10;
        int n17 = -n11 + ca2.bb[nArray[2]];
        int n18 = -(n14 * n16) + n17 * n13;
        int n19 = -(n12 * n17) + n15 * n14;
        if (n8 != -1) {
            n5 >>= n8;
            n18 >>= n8;
            n19 >>= n8;
        } else {
            n8 = 0;
            for (n5 = -(n15 * n13) + n12 * n16; n18 > 25000 || n19 > 25000 || n5 > 25000 || n18 < -25000 || n19 < -25000 || n5 < -25000; n5 >>= 1) {
                n18 >>= 1;
                n19 >>= 1;
                ++n8;
            }
            ca2.M[n6] = n8;
            ca2.k[n6] = (int)((double)this.h * Math.sqrt(n5 * n5 + n19 * n19 + n18 * n18));
        }
        w2.k = n5;
        if (arg1 != -21875) {
            this.Eb = null;
        }
        w2.r = n18;
        w2.l = n19;
        w2.s = n18 * n9 - (-(n10 * n19) + -(n5 * n11));
        int n20 = n4 = ca2.bb[nArray[0]];
        int n21 = n3 = ca2.pb[nArray[0]];
        int n22 = n2 = ca2.Ob[nArray[0]];
        for (int i2 = 1; n7 > i2; ++i2) {
            int n23 = ca2.bb[nArray[i2]];
            if (n23 <= n20) {
                if (n4 > n23) {
                    n4 = n23;
                }
            } else {
                n20 = n23;
            }
            if ((n23 = ca2.pb[nArray[i2]]) > n21) {
                n21 = n23;
            } else if (n3 > n23) {
                n3 = n23;
            }
            n23 = ca2.Ob[nArray[i2]];
            if (n23 > n22) {
                n22 = n23;
                continue;
            }
            if (n2 <= n23) continue;
            n2 = n23;
        }
        w2.e = n3;
        w2.m = n21;
        w2.j = n22;
        w2.q = n20;
        w2.h = n2;
        w2.u = n4;
    }

    static final void a(boolean arg0, byte[] arg1) {
        if (!arg0) {
            return;
        }
        if (u.d == null) {
            return;
        }
        u.d.setPixels(0, 0, k.o, da.bb, m.d, arg1, 0, k.o);
        u.d.imageComplete(3);
    }

    final void a(int arg0, byte arg1, int[] arg2, int arg3, byte[] arg4) {
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

    final void a(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        block1: {
            this.R = arg5;
            this.Zb = arg6;
            this.vb = arg2;
            this.Nb = arg4;
            this.x = new n[arg0 + arg4];
            this.wb = arg0;
            this.A = arg3;
            for (int i2 = 0; i2 < arg4 + arg0; ++i2) {
                this.x[i2] = new n();
            }
            if (arg1) break block1;
            this.f = false;
        }
    }

    final void a(int arg0, int arg1, int arg2) {
        this.K = true;
        this.j = -this.Zb + arg1;
        this.Wb = arg2;
        this.cc = arg0;
    }

    final ca[] b(byte arg0) {
        if (arg0 < 95) {
            return null;
        }
        return this.Ab;
    }

    final void a(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 == 0 && arg1 == 0 && arg0 == 0) {
            arg3 = 32;
        }
        if (!arg2) {
            this.c(-89);
        }
        for (int i2 = 0; this.ab > i2; ++i2) {
            this.Z[i2].a(false, arg3, arg1, arg0);
        }
    }

    final void a(boolean arg0) {
        this.a(-118);
        if (arg0) {
            this.Xb = -11;
        }
        for (int i2 = 0; i2 < this.ab; ++i2) {
            this.Z[i2] = null;
        }
        this.ab = 0;
    }

    private final boolean a(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -86) {
            this.jb = null;
        }
        if (arg1 && arg5 >= arg4 || arg4 < arg5) {
            if (arg4 > arg3) {
                return true;
            }
            if (arg2 > arg5) {
                return true;
            }
            if (arg2 > arg3) {
                return true;
            }
            return !arg1;
        }
        if (arg4 < arg3) {
            return true;
        }
        if (arg2 < arg5) {
            return true;
        }
        if (arg3 > arg2) {
            return true;
        }
        return arg1;
    }

    private final void a(int arg0) {
        if (arg0 > -115) {
            return;
        }
        this.n = 0;
        this.T.c(1);
    }

    private final boolean a(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        int n2;
        int n3;
        boolean bl;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = arg2.length;
        int n12 = arg0.length;
        int n13 = 0;
        int n14 = 0;
        int n15 = n10 = arg1[0];
        int n16 = 0;
        for (n9 = 1; n11 > n9; ++n9) {
            if (n10 <= arg1[n9]) {
                if (arg1[n9] <= n15) continue;
                n15 = arg1[n9];
                continue;
            }
            n14 = n9;
            n10 = arg1[n9];
        }
        int n17 = n8 = arg3[0];
        for (n9 = arg4; n12 > n9; ++n9) {
            if (arg3[n9] >= n8) {
                if (n17 >= arg3[n9]) continue;
                n17 = arg3[n9];
                continue;
            }
            n8 = arg3[n9];
            n16 = n9;
        }
        if (n15 <= n8) {
            return false;
        }
        if (n10 >= n17) {
            return false;
        }
        if (arg1[n14] < arg3[n16]) {
            n7 = n14;
            while (arg3[n16] > arg1[n14]) {
                n14 = (n14 - (1 + -n11)) % n11;
            }
            while (arg1[n7] < arg3[n16]) {
                n7 = (1 + n7) % n11;
            }
            n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
            bl = n6 < (n5 = arg0[n16]) | n5 > (n4 = this.a(arg1[(n11 + (n7 - 1)) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n11 - 1 + n7) % n11]));
            if (this.a(n5, bl, n6, (byte)-71, n4)) {
                return true;
            }
            n3 = (n16 + 1) % n12;
            n16 = (n16 + n12 - 1) % n12;
            if (n14 == n7) {
                n13 = 1;
            }
        } else {
            n3 = n16;
            while (arg1[n14] > arg3[n16]) {
                n16 = (n16 - -n12 - 1) % n12;
            }
            n6 = arg2[n14];
            while (arg1[n14] > arg3[n3]) {
                n3 = (n3 + 1) % n12;
            }
            n5 = this.a(arg3[(n16 + 1) % n12], false, arg1[n14], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]);
            bl = n6 < n5 | (n2 = this.a(arg3[(n12 + (n3 - 1)) % n12], false, arg1[n14], arg3[n3], arg0[n3], arg0[(n3 - 1 + n12) % n12])) > n6;
            if (this.a(n6, !bl, n5, (byte)-71, n2)) {
                return true;
            }
            n7 = (1 + n14) % n11;
            n14 = (n11 + (n14 - 1)) % n11;
            if (n3 == n16) {
                n13 = 2;
            }
        }
        while (n13 == 0) {
            if (arg1[n7] <= arg1[n14]) {
                if (arg3[n16] <= arg1[n7]) {
                    if (arg3[n16] >= arg3[n3]) {
                        n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                        n4 = this.a(arg1[(n7 - 1 + n11) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n11 + (n7 - 1)) % n11]);
                        if (this.a((byte)-96, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(1 + n16) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]))) {
                            return true;
                        }
                        if ((n3 = (1 + n3) % n12) != n16) continue;
                        n13 = 2;
                        continue;
                    }
                    n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                    n4 = this.a(arg1[(n7 - -n11 - 1) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n11 - 1 + n7) % n11]);
                    n5 = arg0[n16];
                    n2 = this.a(arg3[(n12 + (n3 - 1)) % n12], false, arg3[n16], arg3[n3], arg0[n3], arg0[(n3 - 1 + n12) % n12]);
                    if (this.a((byte)-123, bl, n4, n2, n6, n5)) {
                        return true;
                    }
                    n16 = (n16 - 1 + n12) % n12;
                    if (n16 != n3) continue;
                    n13 = 2;
                    continue;
                }
                if (arg3[n3] > arg1[n7]) {
                    n6 = this.a(arg1[(n14 + 1) % n11], false, arg1[n7], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                    n4 = arg2[n7];
                    n5 = this.a(arg3[(n16 + 1) % n12], false, arg1[n7], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]);
                    n2 = this.a(arg3[(n3 - 1 - -n12) % n12], false, arg1[n7], arg3[n3], arg0[n3], arg0[(n3 - (1 + -n12)) % n12]);
                    if (this.a((byte)-105, bl, n4, n2, n6, n5)) {
                        return true;
                    }
                    if ((n7 = (n7 + 1) % n11) != n14) continue;
                    n13 = 1;
                    continue;
                }
                n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(n14 + 1) % n11]);
                n4 = this.a(arg1[(n11 + n7 - 1) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n11 - 1 + n7) % n11]);
                if (this.a((byte)-106, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(n16 + 1) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]))) {
                    return true;
                }
                if ((n3 = (n3 + 1) % n12) != n16) continue;
                n13 = 2;
                continue;
            }
            if (arg1[n14] < arg3[n16]) {
                if (arg1[n14] >= arg3[n3]) {
                    n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                    n4 = this.a(arg1[(n11 + (n7 - 1)) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n11 + (n7 - 1)) % n11]);
                    if (this.a((byte)-113, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(n16 + 1) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]))) {
                        return true;
                    }
                    if ((n3 = (1 + n3) % n12) != n16) continue;
                    n13 = 2;
                    continue;
                }
                n6 = arg2[n14];
                n4 = this.a(arg1[(n7 + (-1 - -n11)) % n11], false, arg1[n14], arg1[n7], arg2[n7], arg2[(n7 + n11 - 1) % n11]);
                n5 = this.a(arg3[(1 + n16) % n12], false, arg1[n14], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]);
                n2 = this.a(arg3[(n12 - 1 + n3) % n12], false, arg1[n14], arg3[n3], arg0[n3], arg0[(n12 + (n3 - 1)) % n12]);
                if (this.a((byte)-127, bl, n4, n2, n6, n5)) {
                    return true;
                }
                if ((n14 = (n11 + (n14 - 1)) % n11) != n7) continue;
                n13 = 1;
                continue;
            }
            if (arg3[n3] > arg3[n16]) {
                n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                n4 = this.a(arg1[(n11 + (n7 - 1)) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n11 - 1 + n7) % n11]);
                n5 = arg0[n16];
                n2 = this.a(arg3[(n12 + (n3 - 1)) % n12], false, arg3[n16], arg3[n3], arg0[n3], arg0[(n12 + n3 - 1) % n12]);
                if (this.a((byte)-88, bl, n4, n2, n6, n5)) {
                    return true;
                }
                if (n3 != (n16 = (n12 + n16 - 1) % n12)) continue;
                n13 = 2;
                continue;
            }
            n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(n14 + 1) % n11]);
            n4 = this.a(arg1[(n7 + n11 - 1) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n11 + (n7 - 1)) % n11]);
            if (this.a((byte)-123, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(n16 + 1) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]))) {
                return true;
            }
            n3 = (n3 + 1) % n12;
            if (n16 != n3) continue;
            n13 = 2;
        }
        while (n13 == 1) {
            if (arg1[n14] >= arg3[n16]) {
                if (arg3[n3] > arg3[n16]) {
                    n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(n14 + 1) % n11]);
                    n4 = this.a(arg1[(n7 - 1 - -n11) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n7 - 1 + n11) % n11]);
                    n5 = arg0[n16];
                    n2 = this.a(arg3[(n3 - 1 + n12) % n12], false, arg3[n16], arg3[n3], arg0[n3], arg0[(n3 + (-1 - -n12)) % n12]);
                    if (this.a((byte)-116, bl, n4, n2, n6, n5)) {
                        return true;
                    }
                    if (n3 != (n16 = (n16 + (-1 - -n12)) % n12)) continue;
                    n13 = 0;
                    continue;
                }
                n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                n4 = this.a(arg1[(n11 + n7 - 1) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n7 + (n11 - 1)) % n11]);
                if (this.a((byte)-98, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(n16 + 1) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]))) {
                    return true;
                }
                if ((n3 = (1 + n3) % n12) != n16) continue;
                n13 = 0;
                continue;
            }
            if (arg1[n14] >= arg3[n3]) {
                n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n3], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                n4 = this.a(arg1[(n7 - -n11 - 1) % n11], false, arg3[n3], arg1[n7], arg2[n7], arg2[(n7 - -n11 - 1) % n11]);
                if (this.a((byte)-118, bl, n4, n2 = arg0[n3], n6, n5 = this.a(arg3[(1 + n16) % n12], false, arg3[n3], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]))) {
                    return true;
                }
                n3 = (1 + n3) % n12;
                if (n16 != n3) continue;
                n13 = 0;
                continue;
            }
            n6 = arg2[n14];
            return this.a(n6, !bl, n5 = this.a(arg3[(n16 + 1) % n12], false, arg1[n14], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]), (byte)-71, n2 = this.a(arg3[(n3 - 1 + n12) % n12], false, arg1[n14], arg3[n3], arg0[n3], arg0[(n12 + (n3 - 1)) % n12]));
            {
            }
        }
        while (n13 == 2) {
            if (arg3[n16] < arg1[n14]) {
                if (arg1[n7] > arg3[n16]) {
                    n5 = arg0[n16];
                    n6 = this.a(arg1[(n14 + 1) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(n14 + 1) % n11]);
                    return this.a(n5, bl, n6, (byte)-71, n4 = this.a(arg1[(n7 - 1 + n11) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n11 - 1 + n7) % n11]));
                    {
                    }
                }
                n6 = this.a(arg1[(1 + n14) % n11], false, arg1[n7], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                n4 = arg2[n7];
                n5 = this.a(arg3[(1 + n16) % n12], false, arg1[n7], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]);
                n2 = this.a(arg3[(n3 - 1 + n12) % n12], false, arg1[n7], arg3[n3], arg0[n3], arg0[(n3 + n12 - 1) % n12]);
                if (this.a((byte)-128, bl, n4, n2, n6, n5)) {
                    return true;
                }
                n7 = (1 + n7) % n11;
                if (n14 != n7) continue;
                n13 = 0;
                continue;
            }
            if (arg1[n7] <= arg1[n14]) {
                n6 = this.a(arg1[(n14 + 1) % n11], false, arg1[n7], arg1[n14], arg2[n14], arg2[(1 + n14) % n11]);
                n4 = arg2[n7];
                n5 = this.a(arg3[(1 + n16) % n12], false, arg1[n7], arg3[n16], arg0[n16], arg0[(1 + n16) % n12]);
                n2 = this.a(arg3[(n3 - (1 + -n12)) % n12], false, arg1[n7], arg3[n3], arg0[n3], arg0[(n3 + n12 - 1) % n12]);
                if (this.a((byte)-102, bl, n4, n2, n6, n5)) {
                    return true;
                }
                if ((n7 = (1 + n7) % n11) != n14) continue;
                n13 = 0;
                continue;
            }
            n6 = arg2[n14];
            n4 = this.a(arg1[(n7 + n11 - 1) % n11], false, arg1[n14], arg1[n7], arg2[n7], arg2[(n11 + n7 - 1) % n11]);
            n5 = this.a(arg3[(n16 + 1) % n12], false, arg1[n14], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]);
            n2 = this.a(arg3[(n3 + (-1 - -n12)) % n12], false, arg1[n14], arg3[n3], arg0[n3], arg0[(n12 + n3 - 1) % n12]);
            if (this.a((byte)-101, bl, n4, n2, n6, n5)) {
                return true;
            }
            if ((n14 = (n11 + n14 - 1) % n11) != n7) continue;
            n13 = 0;
        }
        if (arg1[n14] >= arg3[n16]) {
            n5 = arg0[n16];
            n6 = this.a(arg1[(1 + n14) % n11], false, arg3[n16], arg1[n14], arg2[n14], arg2[(n14 + 1) % n11]);
            return this.a(n5, bl, n6, (byte)-71, n4 = this.a(arg1[(n7 - 1 - -n11) % n11], false, arg3[n16], arg1[n7], arg2[n7], arg2[(n11 + (n7 - 1)) % n11]));
            {
            }
        }
        n6 = arg2[n14];
        return this.a(n6, !bl, n5 = this.a(arg3[(1 + n16) % n12], false, arg1[n14], arg3[n16], arg0[n16], arg0[(n16 + 1) % n12]), (byte)-71, n2 = this.a(arg3[(n12 + (n3 - 1)) % n12], false, arg1[n14], arg3[n3], arg0[n3], arg0[(n12 - 1 + n3) % n12]));
    }

    lb(ua arg0, int arg1, int arg2, int arg3) {
        int n2;
        this.J = new int[40];
        this.B = new int[40];
        this.Qb = new int[40];
        this.Ib = new int[this.ib][256];
        this.r = new int[40];
        this.v = new int[this.ib];
        this.yb = new int[40];
        this.Ab = new ca[this.db];
        this.qb = new int[this.db];
        this.pb = arg0.rb;
        this.dc = arg0;
        this.A = arg0.u / 2;
        this.u = arg1;
        this.wb = arg0.k / 2;
        this.Z = new ca[this.u];
        this.zb = 0;
        this.jb = new int[this.u];
        this.y = new w[arg2];
        for (n2 = 0; arg2 > n2; ++n2) {
            this.y[n2] = new w();
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
        for (n2 = 0; n2 < 256; ++n2) {
            e.nb[n2] = (int)(Math.sin(0.02454369 * (double)n2) * 32768.0);
            e.nb[256 + n2] = (int)(Math.cos((double)n2 * 0.02454369) * 32768.0);
        }
        for (n2 = 0; n2 < 1024; ++n2) {
            ba.cc[n2] = (int)(Math.sin((double)n2 * 0.00613592315) * 32768.0);
            ba.cc[1024 + n2] = (int)(Math.cos((double)n2 * 0.00613592315) * 32768.0);
        }
    }
}

