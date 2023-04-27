/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ca {
    private int f;
    private int ec;
    private int[] Eb;
    int[] H;
    private int[] jc;
    private int xb;
    static byte[][] tb = new byte[50][];
    private boolean c = false;
    private boolean v = false;
    int[] Hb;
    int[] Ob;
    private int Ib = 256;
    int[] M;
    byte[] zb;
    boolean cb = false;
    int[] a;
    private int Bb = 155;
    private int C;
    private int[] Pb;
    private int[] Gb;
    private int sb = 12345678;
    private int z;
    private int[] Cb;
    int[] bb;
    int[] E;
    private int eb;
    int[] pb;
    private boolean b = false;
    private int P;
    boolean Kb = false;
    private int Sb;
    private int[] Lb;
    private int jb;
    private int r;
    private int g = 180;
    int Yb = 1;
    private int Tb;
    private int e;
    int[] qb;
    private int x;
    private int hb;
    private int K;
    int t;
    private int Mb = 512;
    private int[] w;
    private boolean Nb = false;
    private int T;
    private int[] n;
    private int[] Q;
    private int i;
    private int G;
    private int[] ic;
    int[] gb;
    private int yb;
    static int[] B;
    int[] cc;
    boolean dc = true;
    int[][] o;
    int hc = 0;
    private int U;
    int rb = -1;
    int[] bc;
    private int j;
    private int Vb = 12345678;
    int Db;
    byte[] Ab;
    private int gc;
    private int Y;
    boolean db = false;
    private int[] Zb;
    int[] V;
    private int[] fb;
    private int F;
    private int Fb = 95;
    private int[] ob;
    int Jb = 32;
    private int X;
    int[] lb;
    private int[][] fc;
    int[] k;

    private final void a(int arg0) {
        this.x = 999999;
        this.ec = 999999;
        this.gc = -999999;
        this.P = arg0;
        this.j = -999999;
        this.e = -999999;
        this.sb = -999999;
        for (int i2 = 0; this.t > i2; ++i2) {
            int n2;
            int n3;
            int n4;
            int[] nArray = this.o[i2];
            int n5 = this.lb[i2];
            int n6 = nArray[0];
            int n7 = n4 = this.jc[n6];
            int n8 = n3 = this.ic[n6];
            int n9 = n2 = this.Gb[n6];
            for (int i3 = 0; n5 > i3; ++i3) {
                n6 = nArray[i3];
                if (n4 <= this.jc[n6]) {
                    if (n7 < this.jc[n6]) {
                        n7 = this.jc[n6];
                    }
                } else {
                    n4 = this.jc[n6];
                }
                if (this.ic[n6] < n3) {
                    n3 = this.ic[n6];
                } else if (this.ic[n6] > n8) {
                    n8 = this.ic[n6];
                }
                if (this.Gb[n6] >= n2) {
                    if (n9 >= this.Gb[n6]) continue;
                    n9 = this.Gb[n6];
                    continue;
                }
                n2 = this.Gb[n6];
            }
            if (!this.c) {
                this.w[i2] = n2;
                this.n[i2] = n9;
                this.Q[i2] = n3;
                this.Lb[i2] = n8;
                this.Zb[i2] = n4;
                this.Eb[i2] = n7;
            }
            if (-n2 + n9 > this.sb) {
                this.sb = -n2 + n9;
            }
            if (n8 + -n3 > this.sb) {
                this.sb = -n3 + n8;
            }
            if (this.j < n9) {
                this.j = n9;
            }
            if (this.gc < n7) {
                this.gc = n7;
            }
            if (-n4 + n7 > this.sb) {
                this.sb = -n4 + n7;
            }
            if (n8 > this.e) {
                this.e = n8;
            }
            if (this.x > n2) {
                this.x = n2;
            }
            if (this.P > n3) {
                this.P = n3;
            }
            if (this.ec <= n4) continue;
            this.ec = n4;
        }
    }

    final void g(int arg0, int arg1, int arg2, int arg3) {
        this.C = arg0 & 0xFF;
        if (arg1 != -999999) {
            this.a(115, -103, 21, -85, -116, -56);
        }
        this.F = arg2 & 0xFF;
        this.X = arg3 & 0xFF;
        this.b((byte)-117);
        this.Yb = 1;
    }

    private final void a(int arg0, ca[] arg1, boolean arg2, int arg3) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; arg3 > n2; ++n2) {
            n3 += arg1[n2].t;
            n4 += arg1[n2].Db;
        }
        this.a(n3, n4, 88);
        if (arg2) {
            this.fc = new int[n3][];
        }
        for (n2 = arg0; n2 < arg3; ++n2) {
            ca ca2 = arg1[n2];
            ca2.a((byte)-28);
            this.Ib = ca2.Ib;
            this.g = ca2.g;
            this.Bb = ca2.Bb;
            this.Mb = ca2.Mb;
            this.Fb = ca2.Fb;
            this.Jb = ca2.Jb;
            for (int i2 = 0; i2 < ca2.t; ++i2) {
                int n5;
                int n6;
                int[] nArray = new int[ca2.lb[i2]];
                int[] nArray2 = ca2.o[i2];
                for (n6 = 0; n6 < ca2.lb[i2]; ++n6) {
                    nArray[n6] = this.e(ca2.a[nArray2[n6]], ca2.bc[nArray2[n6]], ca2.ob[nArray2[n6]], -122);
                }
                n6 = this.a(ca2.lb[i2], nArray, ca2.V[i2], ca2.qb[i2], false);
                this.Hb[n6] = ca2.Hb[i2];
                this.M[n6] = ca2.M[i2];
                this.k[n6] = ca2.k[i2];
                if (!arg2) continue;
                if (arg3 <= 1) {
                    this.fc[n6] = new int[ca2.fc[i2].length];
                    for (n5 = 0; ca2.fc[i2].length > n5; ++n5) {
                        this.fc[n6][n5] = ca2.fc[i2][n5];
                    }
                    continue;
                }
                this.fc[n6] = new int[ca2.fc[i2].length + 1];
                this.fc[n6][0] = n2;
                for (n5 = 0; n5 < ca2.fc[i2].length; ++n5) {
                    this.fc[n6][1 + n5] = ca2.fc[i2][n5];
                }
            }
        }
        this.Yb = 1;
    }

    private final void a(int arg0, int arg1, int arg2) {
        if (!this.db) {
            this.zb = new byte[arg0];
            this.E = new int[arg0];
        }
        this.k = new int[arg0];
        this.ob = new int[arg1];
        this.Ab = new byte[arg1];
        this.a = new int[arg1];
        this.M = new int[arg0];
        this.bc = new int[arg1];
        this.qb = new int[arg0];
        this.gb = new int[arg1];
        this.V = new int[arg0];
        this.o = new int[arg0][];
        this.lb = new int[arg0];
        if (!this.b) {
            this.Ob = new int[arg1];
            this.H = new int[arg1];
            this.cc = new int[arg1];
            this.bb = new int[arg1];
            this.pb = new int[arg1];
        }
        this.Hb = new int[arg0];
        this.Y = 256;
        this.X = 0;
        this.U = 256;
        this.Tb = 256;
        this.T = 256;
        if (!this.c) {
            this.n = new int[arg0];
            this.Q = new int[arg0];
            this.Zb = new int[arg0];
            this.Lb = new int[arg0];
            this.Eb = new int[arg0];
            this.w = new int[arg0];
        }
        if (!this.Nb || !this.c) {
            this.Cb = new int[arg0];
            this.Pb = new int[arg0];
            this.fb = new int[arg0];
        }
        this.G = 256;
        this.t = 0;
        this.F = 0;
        this.Sb = 0;
        this.yb = 256;
        if (!this.v) {
            this.Gb = new int[arg1];
            this.jc = new int[arg1];
            this.ic = new int[arg1];
        } else {
            this.Gb = this.a;
            this.jc = this.bc;
            this.ic = this.ob;
        }
        this.r = 0;
        this.K = arg1;
        this.eb = 256;
        this.f = 256;
        this.xb = 0;
        this.jb = 0;
        this.Db = 0;
        this.i = 256;
        if (arg2 <= 68) {
            this.lb = null;
        }
        this.z = arg0;
        this.C = 0;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.Jb = -(4 * arg1) + 256;
        this.Mb = (64 - arg0) * 16 + 128;
        if (arg3 > -110) {
            this.Bb = -67;
        }
        if (this.Nb) {
            return;
        }
        this.g = arg4;
        this.Fb = arg5;
        this.Bb = arg2;
        this.Ib = (int)Math.sqrt(arg5 * arg5 + (arg2 * arg2 + arg4 * arg4));
        this.e(-102);
    }

    final ca[] a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int n2;
        int n3;
        int n4;
        int n5;
        this.a((byte)-28);
        int[] nArray = new int[arg4];
        int[] nArray2 = new int[arg4];
        for (n5 = 0; n5 < arg4; ++n5) {
            nArray[n5] = 0;
            nArray2[n5] = 0;
        }
        for (n5 = 0; n5 < this.t; ++n5) {
            int n6;
            n4 = 0;
            n3 = 0;
            n2 = this.lb[n5];
            int[] nArray3 = this.o[n5];
            for (n6 = 0; n6 < n2; ++n6) {
                n4 += this.a[nArray3[n6]];
                n3 += this.bc[nArray3[n6]];
            }
            int n7 = n6 = n4 / (n2 * arg6) + n3 / (arg2 * n2) * arg1;
            nArray[n7] = nArray[n7] + n2;
            int n8 = n6;
            nArray2[n8] = nArray2[n8] + 1;
        }
        ca[] caArray = new ca[arg4];
        for (n4 = 0; n4 < arg4; ++n4) {
            if (arg5 < nArray[n4]) {
                nArray[n4] = arg5;
            }
            caArray[n4] = new ca(nArray[n4], nArray2[n4], true, true, true, arg7, true);
            caArray[n4].Mb = this.Mb;
            caArray[n4].Jb = this.Jb;
        }
        for (n4 = 0; this.t > n4; ++n4) {
            int n9;
            n3 = 0;
            n2 = 0;
            int n10 = this.lb[n4];
            int[] nArray4 = this.o[n4];
            for (n9 = 0; n10 > n9; ++n9) {
                n3 += this.a[nArray4[n9]];
                n2 += this.bc[nArray4[n9]];
            }
            n9 = n3 / (n10 * arg6) + arg1 * (n2 / (arg2 * n10));
            this.a(nArray4, caArray[n9], n10, n4, 5916);
        }
        for (n4 = 0; n4 < arg4; ++n4) {
            caArray[n4].c((byte)71);
        }
        return caArray;
    }

    final int a(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.f(30, -84, 10, 23);
        }
        if (this.t >= this.z) {
            return -1;
        }
        this.lb[this.t] = arg0;
        this.o[this.t] = arg1;
        this.V[this.t] = arg2;
        this.qb[this.t] = arg3;
        this.Yb = 1;
        return this.t++;
    }

    final void a(int arg0, int arg1, int arg2, boolean arg3) {
        this.xb += arg2;
        this.Sb += arg1;
        if (!arg3) {
            this.jc = null;
        }
        this.r += arg0;
        this.b((byte)-127);
        this.Yb = 1;
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        for (int i2 = 0; i2 < this.Db; ++i2) {
            if (arg2 != 0) {
                int n2 = i2;
                this.Gb[n2] = this.Gb[n2] + (this.ic[i2] * arg2 >> 8);
            }
            if (arg3 != 0) {
                int n3 = i2;
                this.jc[n3] = this.jc[n3] + (arg3 * this.ic[i2] >> 8);
            }
            if (arg4 != 0) {
                int n4 = i2;
                this.Gb[n4] = this.Gb[n4] + (arg4 * this.jc[i2] >> 8);
            }
            if (arg1 != 0) {
                int n5 = i2;
                this.ic[n5] = this.ic[n5] + (arg1 * this.jc[i2] >> 8);
            }
            if (arg0 != 0) {
                int n6 = i2;
                this.jc[n6] = this.jc[n6] + (arg0 * this.Gb[i2] >> 8);
            }
            if (arg5 == 0) continue;
            int n7 = i2;
            this.ic[n7] = this.ic[n7] + (this.Gb[i2] * arg5 >> 8);
        }
    }

    final void b(int arg0, int arg1, int arg2) {
        block2: {
            this.t -= arg2;
            if (arg1 > -110) {
                ca.a((byte)-3, null);
            }
            if (this.t < 0) {
                this.t = 0;
            }
            this.Db -= arg0;
            if (this.Db >= 0) break block2;
            this.Db = 0;
        }
    }

    final void c(int arg0, int arg1, int arg2, int arg3) {
        this.xb = arg0;
        this.r = arg3;
        this.Sb = arg2;
        if (arg1 > -112) {
            this.a(-96, (int[])null, -8, 42, true);
        }
        this.b((byte)-114);
        this.Yb = 1;
    }

    final void a(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.d(7972);
        if (da.K < this.ec || m.j > this.gc || this.x > oa.b || aa.f > this.j || this.P > nb.y || this.e < aa.b) {
            this.dc = false;
            return;
        }
        this.dc = true;
        int n2 = 0;
        if (arg3 > -105) {
            this.c((byte)-103);
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (arg6 != 0) {
            n3 = pa.j[1024 + arg6];
            n2 = pa.j[arg6];
        }
        int n7 = 0;
        if (arg7 != 0) {
            n4 = pa.j[arg7];
            n5 = pa.j[arg7 + 1024];
        }
        if (arg5 != 0) {
            n6 = pa.j[arg5];
            n7 = pa.j[arg5 + 1024];
        }
        for (int i2 = 0; this.Db > i2; ++i2) {
            int n8;
            int n9 = this.Gb[i2] + -arg2;
            int n10 = -arg0 + this.ic[i2];
            if (arg6 != 0) {
                n8 = n10 * n2 - -(n3 * n9) >> 15;
                n10 = -(n9 * n2) + n10 * n3 >> 15;
                n9 = n8;
            }
            int n11 = this.jc[i2] - arg4;
            if (arg5 != 0) {
                n8 = n7 * n9 + n11 * n6 >> 15;
                n11 = -(n9 * n6) + n7 * n11 >> 15;
                n9 = n8;
            }
            if (arg7 != 0) {
                n8 = n10 * n5 + -(n4 * n11) >> 15;
                n11 = n4 * n10 - -(n5 * n11) >> 15;
                n10 = n8;
            }
            this.pb[i2] = n11 < arg8 ? n9 << arg1 : (n9 << arg1) / n11;
            this.Ob[i2] = n11 < arg8 ? n10 << arg1 : (n10 << arg1) / n11;
            this.cc[i2] = n9;
            this.H[i2] = n10;
            this.bb[i2] = n11;
        }
    }

    private final void b(byte arg0) {
        if (arg0 >= -103) {
            this.a(true, -115, true, true, false);
        }
        if (this.Tb != 256 || this.G != 256 || this.Y != 256 || this.f != 256 || this.U != 256 || this.eb != 256) {
            this.jb = 4;
            return;
        }
        if (this.yb != 256 || this.i != 256 || this.T != 256) {
            this.jb = 3;
            return;
        }
        if (this.F != 0 || this.X != 0 || this.C != 0) {
            this.jb = 2;
            return;
        }
        if (this.r != 0 || this.xb != 0 || this.Sb != 0) {
            this.jb = 1;
            return;
        }
        this.jb = 0;
    }

    private final void a(byte arg0) {
        this.d(7972);
        for (int i2 = 0; this.Db > i2; ++i2) {
            this.a[i2] = this.Gb[i2];
            this.ob[i2] = this.ic[i2];
            this.bc[i2] = this.jc[i2];
        }
        if (arg0 != -28) {
            this.d(4);
        }
        this.C = 0;
        this.F = 0;
        this.U = 256;
        this.f = 256;
        this.xb = 0;
        this.X = 0;
        this.eb = 256;
        this.Y = 256;
        this.yb = 256;
        this.jb = 0;
        this.r = 0;
        this.i = 256;
        this.Tb = 256;
        this.T = 256;
        this.Sb = 0;
        this.G = 256;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        this.Mb = (-arg5 + 64) * 16 + 128;
        this.Jb = 256 - arg1 * 4;
        if (this.Nb) {
            return;
        }
        for (int i2 = 0; this.t > i2; ++i2) {
            this.Hb[i2] = arg4 ? this.Vb : 0;
        }
        this.g = arg3;
        this.Fb = arg0;
        this.Bb = arg2;
        this.Ib = (int)Math.sqrt(arg2 * arg2 + (arg3 * arg3 - -(arg0 * arg0)));
        this.e(-121);
    }

    private final void b(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -27483) {
            this.e(-7, -82, -31, -24);
        }
        for (int i2 = 0; i2 < this.Db; ++i2) {
            this.Gb[i2] = this.Gb[i2] * arg0 >> 8;
            this.ic[i2] = this.ic[i2] * arg3 >> 8;
            this.jc[i2] = arg2 * this.jc[i2] >> 8;
        }
    }

    final int e(int arg0, int arg1, int arg2, int arg3) {
        for (int i2 = 0; i2 < this.Db; ++i2) {
            if (this.a[i2] != arg0 || arg2 != this.ob[i2] || arg1 != this.bc[i2]) continue;
            return i2;
        }
        if (this.Db >= this.K) {
            return -1;
        }
        this.a[this.Db] = arg0;
        this.ob[this.Db] = arg2;
        this.bc[this.Db] = arg1;
        return this.Db++;
    }

    private final void a(int[] arg0, ca arg1, int arg2, int arg3, int arg4) {
        int n2;
        int[] nArray = new int[arg2];
        for (n2 = 0; arg2 > n2; ++n2) {
            int n3 = nArray[n2] = arg1.e(this.a[arg0[n2]], this.bc[arg0[n2]], this.ob[arg0[n2]], 107);
            arg1.gb[n3] = this.gb[arg0[n2]];
            arg1.Ab[n3] = this.Ab[arg0[n2]];
        }
        if (arg4 != 5916) {
            this.yb = 77;
        }
        n2 = arg1.a(arg2, nArray, this.V[arg3], this.qb[arg3], false);
        if (!arg1.db && !this.db) {
            arg1.E[n2] = this.E[arg3];
        }
        arg1.Hb[n2] = this.Hb[arg3];
        arg1.M[n2] = this.M[arg3];
        arg1.k[n2] = this.k[arg3];
    }

    final void c(int arg0) {
        this.t = 0;
        if (arg0 != 1) {
            this.Kb = true;
        }
        this.Db = 0;
    }

    private final void a(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -14) {
            this.Cb = null;
        }
        for (int i2 = 0; this.Db > i2; ++i2) {
            int n2;
            int n3;
            int n4;
            if (arg2 != 0) {
                n4 = pa.a[arg2 + 256];
                n3 = pa.a[arg2];
                n2 = this.Gb[i2] * n4 + this.ic[i2] * n3 >> 15;
                this.ic[i2] = -(n3 * this.Gb[i2]) + this.ic[i2] * n4 >> 15;
                this.Gb[i2] = n2;
            }
            if (arg1 != 0) {
                n3 = pa.a[arg1];
                n4 = pa.a[256 + arg1];
                n2 = -(n3 * this.jc[i2]) + n4 * this.ic[i2] >> 15;
                this.jc[i2] = n3 * this.ic[i2] - -(n4 * this.jc[i2]) >> 15;
                this.ic[i2] = n2;
            }
            if (arg3 == 0) continue;
            n3 = pa.a[arg3];
            n4 = pa.a[256 + arg3];
            n2 = n3 * this.jc[i2] + this.Gb[i2] * n4 >> 15;
            this.jc[i2] = -(this.Gb[i2] * n3) + this.jc[i2] * n4 >> 15;
            this.Gb[i2] = n2;
        }
    }

    private final void e(int arg0) {
        int n2;
        if (this.Nb) {
            return;
        }
        int n3 = this.Mb * this.Ib >> 8;
        for (int i2 = 0; this.t > i2; ++i2) {
            if (this.Hb[i2] == this.Vb) continue;
            this.Hb[i2] = (this.Cb[i2] * this.Bb + (this.fb[i2] * this.g - -(this.Fb * this.Pb[i2]))) / n3;
        }
        int[] nArray = new int[this.Db];
        int[] nArray2 = new int[this.Db];
        int[] nArray3 = new int[this.Db];
        int[] nArray4 = new int[this.Db];
        for (int i3 = 0; this.Db > i3; ++i3) {
            nArray[i3] = 0;
            nArray2[i3] = 0;
            nArray3[i3] = 0;
            nArray4[i3] = 0;
        }
        for (n2 = 0; n2 < this.t; ++n2) {
            if (this.Hb[n2] != this.Vb) continue;
            for (int i4 = 0; this.lb[n2] > i4; ++i4) {
                int n4;
                int n5 = n4 = this.o[n2][i4];
                nArray[n5] = nArray[n5] + this.fb[n2];
                int n6 = n4;
                nArray2[n6] = nArray2[n6] + this.Cb[n2];
                int n7 = n4;
                nArray3[n7] = nArray3[n7] + this.Pb[n2];
                int n8 = n4;
                nArray4[n8] = nArray4[n8] + 1;
            }
        }
        for (n2 = 0; this.Db > n2; ++n2) {
            if (nArray4[n2] <= 0) continue;
            this.gb[n2] = (nArray3[n2] * this.Fb + (nArray[n2] * this.g + nArray2[n2] * this.Bb)) / (n3 * nArray4[n2]);
        }
    }

    final ca a(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        ca[] caArray = new ca[]{this};
        ca ca2 = new ca(caArray, 1, arg3, arg4, arg2, arg0);
        ca2.hc = this.hc;
        return ca2;
    }

    static final int a(byte arg0, String arg1) {
        if (arg1.equalsIgnoreCase("na")) {
            return 0;
        }
        if (arg0 != 91) {
            B = null;
        }
        for (int i2 = 0; i2 < ia.b; ++i2) {
            if (!ub.c[i2].equalsIgnoreCase(arg1)) continue;
            return i2;
        }
        ub.c[ia.b++] = arg1;
        return ia.b - 1;
    }

    final void a(ca arg0, int arg1) {
        if (arg1 != 6029) {
            this.jb = -128;
        }
        this.xb = arg0.xb;
        this.C = arg0.C;
        this.Sb = arg0.Sb;
        this.r = arg0.r;
        this.X = arg0.X;
        this.F = arg0.F;
        this.b((byte)-113);
        this.Yb = 1;
    }

    final ca b(int arg0) {
        ca[] caArray = new ca[1];
        if (arg0 != -2) {
            this.b(117, -93, -34, -34);
        }
        caArray[0] = this;
        ca ca2 = new ca(caArray, 1);
        ca2.cb = this.cb;
        ca2.hc = this.hc;
        return ca2;
    }

    private final void c(byte arg0) {
        if (arg0 < 49) {
            this.a(40, 102, 104, 108, -20, -89);
        }
        this.bb = new int[this.Db];
        this.Ob = new int[this.Db];
        this.cc = new int[this.Db];
        this.H = new int[this.Db];
        this.pb = new int[this.Db];
    }

    final void a(int arg0, int arg1, byte arg2) {
        if (arg2 != -61) {
            return;
        }
        this.Ab[arg0] = (byte)arg1;
    }

    private final void d(int arg0) {
        block8: {
            block7: {
                if (arg0 != 7972) {
                    this.a(120, 20, 57, true);
                }
                if (this.Yb != 2) break block7;
                this.Yb = 0;
                for (int i2 = 0; this.Db > i2; ++i2) {
                    this.Gb[i2] = this.a[i2];
                    this.ic[i2] = this.ob[i2];
                    this.jc[i2] = this.bc[i2];
                }
                this.j = 9999999;
                this.e = 9999999;
                this.P = -9999999;
                this.gc = 9999999;
                this.ec = -9999999;
                this.sb = 9999999;
                this.x = -9999999;
                break block8;
            }
            if (this.Yb != 1) break block8;
            this.Yb = 0;
            for (int i3 = 0; i3 < this.Db; ++i3) {
                this.Gb[i3] = this.a[i3];
                this.ic[i3] = this.ob[i3];
                this.jc[i3] = this.bc[i3];
            }
            if (this.jb >= 2) {
                this.a(-53, this.F, this.C, this.X);
            }
            if (this.jb >= 3) {
                this.b(this.yb, -27483, this.T, this.i);
            }
            if (this.jb >= 4) {
                this.a(this.U, this.f, this.Tb, this.G, this.Y, this.eb, (byte)-127);
            }
            if (this.jb >= 1) {
                this.d(arg0 - 7972, this.xb, this.Sb, this.r);
            }
            this.a(999999);
            this.d((byte)14);
        }
    }

    final int b(boolean arg0, int arg1, int arg2, int arg3) {
        if (this.K <= this.Db) {
            return -1;
        }
        this.a[this.Db] = arg2;
        this.ob[this.Db] = arg3;
        this.bc[this.Db] = arg1;
        if (arg0) {
            ca.a((byte)52, null);
        }
        return this.Db++;
    }

    private final void d(byte arg0) {
        if (this.Nb && this.c) {
            return;
        }
        if (arg0 != 14) {
            return;
        }
        for (int i2 = 0; this.t > i2; ++i2) {
            int n2;
            int[] nArray = this.o[i2];
            int n3 = this.Gb[nArray[0]];
            int n4 = this.ic[nArray[0]];
            int n5 = this.jc[nArray[0]];
            int n6 = -n3 + this.Gb[nArray[1]];
            int n7 = this.ic[nArray[1]] + -n4;
            int n8 = -n5 + this.jc[nArray[1]];
            int n9 = -n3 + this.Gb[nArray[2]];
            int n10 = this.ic[nArray[2]] - n4;
            int n11 = -n5 + this.jc[nArray[2]];
            int n12 = n11 * n7 - n8 * n10;
            int n13 = -(n6 * n11) + n8 * n9;
            for (n2 = -(n9 * n7) + n6 * n10; n12 > 8192 || n13 > 8192 || n2 > 8192 || n12 < -8192 || n13 < -8192 || n2 < -8192; n13 >>= 1, n2 >>= 1, n12 >>= 1) {
            }
            int n14 = (int)(Math.sqrt(n13 * n13 + (n12 * n12 + n2 * n2)) * 256.0);
            if (n14 <= 0) {
                n14 = 1;
            }
            this.fb[i2] = n12 * 65536 / n14;
            this.Cb[i2] = 65536 * n13 / n14;
            this.Pb[i2] = n2 * 65535 / n14;
            this.M[i2] = -1;
        }
        this.e(arg0 ^ 0xFFFFFFAB);
    }

    final void f(int arg0, int arg1, int arg2, int arg3) {
        this.F = arg3 + this.F & 0xFF;
        this.X = arg2 + this.X & 0xFF;
        if (arg1 != -31616) {
            return;
        }
        this.C = 0xFF & this.C - -arg0;
        this.b((byte)-105);
        this.Yb = 1;
    }

    private final void d(int arg0, int arg1, int arg2, int arg3) {
        int n2 = arg0;
        while (this.Db > n2) {
            int n3 = n2;
            this.Gb[n3] = this.Gb[n3] + arg3;
            int n4 = n2;
            this.ic[n4] = this.ic[n4] + arg1;
            int n5 = n2++;
            this.jc[n5] = this.jc[n5] + arg2;
        }
    }

    private final int a(byte arg0, byte[] arg1) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (arg0 != 76) {
            return 108;
        }
        while (arg1[this.hb] == 10 || arg1[this.hb] == 13) {
            ++this.hb;
        }
        if ((n5 = (n4 = pa.d[0xFF & arg1[this.hb++]]) * 64 - 131072 + (4096 * (n3 = pa.d[0xFF & arg1[this.hb++]]) + (n2 = pa.d[arg1[this.hb++] & 0xFF]))) == 123456) {
            n5 = this.Vb;
        }
        return n5;
    }

    final void a(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.Yb = 71;
        }
        if (this.Nb) {
            return;
        }
        this.Fb = arg3;
        this.Bb = arg2;
        this.g = arg1;
        this.Ib = (int)Math.sqrt(arg3 * arg3 + (arg2 * arg2 + arg1 * arg1));
        this.e(52);
    }

    ca(int arg0, int arg1) {
        this.a(arg1, arg0, 69);
        this.fc = new int[arg1][1];
        for (int i2 = 0; i2 < arg1; ++i2) {
            this.fc[i2][0] = i2;
        }
    }

    ca(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        this.c = arg3;
        this.b = arg6;
        this.db = arg5;
        this.v = arg2;
        this.Nb = arg4;
        this.a(arg1, arg0, 69);
    }

    ca(byte[] arg0, int arg1, boolean arg2) {
        int n2;
        int n3;
        int n4 = d.a(arg1, (byte)7, arg0);
        int n5 = d.a(arg1 += 2, (byte)8, arg0);
        arg1 += 2;
        this.a(n5, n4, 115);
        this.fc = new int[n5][1];
        for (n3 = 0; n4 > n3; ++n3) {
            this.a[n3] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        for (n3 = 0; n4 > n3; ++n3) {
            this.ob[n3] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        for (n3 = 0; n4 > n3; ++n3) {
            this.bc[n3] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        this.Db = n4;
        for (n3 = 0; n5 > n3; ++n3) {
            this.lb[n3] = ib.a(255, arg0[arg1++]);
        }
        for (n3 = 0; n5 > n3; ++n3) {
            this.V[n3] = w.a(arg0, -1, arg1);
            if (this.V[n3] == Short.MAX_VALUE) {
                this.V[n3] = this.Vb;
            }
            arg1 += 2;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            this.qb[n3] = w.a(arg0, -1, arg1);
            arg1 += 2;
            if (this.qb[n3] != Short.MAX_VALUE) continue;
            this.qb[n3] = this.Vb;
        }
        for (n3 = 0; n5 > n3; ++n3) {
            this.Hb[n3] = (n2 = 0xFF & arg0[arg1++]) != 0 ? this.Vb : 0;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            this.o[n3] = new int[this.lb[n3]];
            for (n2 = 0; this.lb[n3] > n2; ++n2) {
                if (n4 < 256) {
                    this.o[n3][n2] = ib.a(255, arg0[arg1++]);
                    continue;
                }
                this.o[n3][n2] = d.a(arg1, (byte)102, arg0);
                arg1 += 2;
            }
        }
        this.t = n5;
        this.Yb = 1;
    }

    ca(String arg0) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        byte[] byArray = null;
        try {
            InputStream inputStream = nb.a(true, arg0);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byArray = new byte[3];
            this.hb = 0;
            for (n3 = 0; n3 < 3; n3 += dataInputStream.read(byArray, n3, -n3 + 3)) {
            }
            n4 = this.a((byte)76, byArray);
            this.hb = 0;
            byArray = new byte[n4];
            for (n3 = 0; n3 < n4; n3 += dataInputStream.read(byArray, n3, n4 - n3)) {
            }
            dataInputStream.close();
        }
        catch (IOException iOException) {
            this.t = 0;
            this.Db = 0;
            return;
        }
        int n5 = this.a((byte)76, byArray);
        int n6 = this.a((byte)76, byArray);
        int n7 = 0;
        this.a(n6, n5, 97);
        this.fc = new int[n6][];
        for (n2 = 0; n5 > n2; ++n2) {
            int n8 = this.a((byte)76, byArray);
            int n9 = this.a((byte)76, byArray);
            int n10 = this.a((byte)76, byArray);
            this.e(n8, n10, n9, 52);
        }
        for (n2 = 0; n6 > n2; ++n2) {
            int n11;
            int n12 = this.a((byte)76, byArray);
            int n13 = this.a((byte)76, byArray);
            int n14 = this.a((byte)76, byArray);
            int n15 = this.a((byte)76, byArray);
            this.Mb = this.a((byte)76, byArray);
            this.Jb = this.a((byte)76, byArray);
            n7 = this.a((byte)76, byArray);
            int[] nArray = new int[n12];
            for (int i2 = 0; i2 < n12; ++i2) {
                nArray[i2] = this.a((byte)76, byArray);
            }
            int[] nArray2 = new int[n15];
            for (n11 = 0; n11 < n15; ++n11) {
                nArray2[n11] = this.a((byte)76, byArray);
            }
            n11 = this.a(n12, nArray, n13, n14, false);
            this.fc[n2] = nArray2;
            this.Hb[n11] = n7 == 0 ? 0 : this.Vb;
        }
        this.Yb = 1;
    }

    private ca(ca[] arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        this.Nb = arg4;
        this.c = arg3;
        this.db = arg5;
        this.v = arg2;
        this.a(0, arg0, false, arg1);
    }

    private ca(ca[] arg0, int arg1) {
        this.a(0, arg0, true, arg1);
    }
}

