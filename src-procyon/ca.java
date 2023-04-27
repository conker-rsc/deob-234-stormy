import java.io.*;

final class ca
{
    private int f;
    private int ec;
    private int[] Eb;
    int[] H;
    private int[] jc;
    private int xb;
    static byte[][] tb;
    private boolean c;
    private boolean v;
    int[] Hb;
    int[] Ob;
    private int Ib;
    int[] M;
    byte[] zb;
    boolean cb;
    int[] a;
    private int Bb;
    private int C;
    private int[] Pb;
    private int[] Gb;
    private int sb;
    private int z;
    private int[] Cb;
    int[] bb;
    int[] E;
    private int eb;
    int[] pb;
    private boolean b;
    private int P;
    boolean Kb;
    private int Sb;
    private int[] Lb;
    private int jb;
    private int r;
    private int g;
    int Yb;
    private int Tb;
    private int e;
    int[] qb;
    private int x;
    private int hb;
    private int K;
    int t;
    private int Mb;
    private int[] w;
    private boolean Nb;
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
    boolean dc;
    int[][] o;
    int hc;
    private int U;
    int rb;
    int[] bc;
    private int j;
    private int Vb;
    int Db;
    byte[] Ab;
    private int gc;
    private int Y;
    boolean db;
    private int[] Zb;
    int[] V;
    private int[] fb;
    private int F;
    private int Fb;
    private int[] ob;
    int Jb;
    private int X;
    int[] lb;
    private int[][] fc;
    int[] k;
    
    private final void a(final int arg0) {
        this.x = 999999;
        this.ec = 999999;
        this.gc = -999999;
        this.P = arg0;
        this.j = -999999;
        this.e = -999999;
        this.sb = -999999;
        for (int n = 0; this.t > n; ++n) {
            final int[] array = this.o[n];
            final int i = this.lb[n];
            final int n2 = array[0];
            int gc;
            int ec = gc = this.jc[n2];
            int e;
            int p = e = this.ic[n2];
            int j;
            int x = j = this.Gb[n2];
            for (int n3 = 0; i > n3; ++n3) {
                final int n4 = array[n3];
                if (ec <= this.jc[n4]) {
                    if (gc < this.jc[n4]) {
                        gc = this.jc[n4];
                    }
                }
                else {
                    ec = this.jc[n4];
                }
                if (this.ic[n4] < p) {
                    p = this.ic[n4];
                }
                else if (this.ic[n4] > e) {
                    e = this.ic[n4];
                }
                if (this.Gb[n4] >= x) {
                    if (j < this.Gb[n4]) {
                        j = this.Gb[n4];
                    }
                }
                else {
                    x = this.Gb[n4];
                }
            }
            if (!this.c) {
                this.w[n] = x;
                this.n[n] = j;
                this.Q[n] = p;
                this.Lb[n] = e;
                this.Zb[n] = ec;
                this.Eb[n] = gc;
            }
            if (-x + j > this.sb) {
                this.sb = -x + j;
            }
            if (e + -p > this.sb) {
                this.sb = -p + e;
            }
            if (this.j < j) {
                this.j = j;
            }
            if (this.gc < gc) {
                this.gc = gc;
            }
            if (-ec + gc > this.sb) {
                this.sb = -ec + gc;
            }
            if (e > this.e) {
                this.e = e;
            }
            if (this.x > x) {
                this.x = x;
            }
            if (this.P > p) {
                this.P = p;
            }
            if (this.ec > ec) {
                this.ec = ec;
            }
        }
    }
    
    final void g(final int arg0, final int arg1, final int arg2, final int arg3) {
        this.C = (arg0 & 0xFF);
        if (arg1 != -999999) {
            this.a(115, -103, 21, -85, -116, -56);
        }
        this.F = (arg2 & 0xFF);
        this.X = (arg3 & 0xFF);
        this.b((byte)(-117));
        this.Yb = 1;
    }
    
    private final void a(final int arg0, final ca[] arg1, final boolean arg2, final int arg3) {
        int arg4 = 0;
        int arg5 = 0;
        for (int n = 0; arg3 > n; ++n) {
            arg4 += arg1[n].t;
            arg5 += arg1[n].Db;
        }
        this.a(arg4, arg5, 88);
        if (arg2) {
            this.fc = new int[arg4][];
        }
        for (int i = arg0; i < arg3; ++i) {
            final ca ca = arg1[i];
            ca.a((byte)(-28));
            this.Ib = ca.Ib;
            this.g = ca.g;
            this.Bb = ca.Bb;
            this.Mb = ca.Mb;
            this.Fb = ca.Fb;
            this.Jb = ca.Jb;
            for (int j = 0; j < ca.t; ++j) {
                final int[] arg6 = new int[ca.lb[j]];
                final int[] array = ca.o[j];
                for (int k = 0; k < ca.lb[j]; ++k) {
                    arg6[k] = this.e(ca.a[array[k]], ca.bc[array[k]], ca.ob[array[k]], -122);
                }
                final int a = this.a(ca.lb[j], arg6, ca.V[j], ca.qb[j], false);
                this.Hb[a] = ca.Hb[j];
                this.M[a] = ca.M[j];
                this.k[a] = ca.k[j];
                if (arg2) {
                    if (arg3 <= 1) {
                        this.fc[a] = new int[ca.fc[j].length];
                        for (int n2 = 0; ca.fc[j].length > n2; ++n2) {
                            this.fc[a][n2] = ca.fc[j][n2];
                        }
                    }
                    else {
                        (this.fc[a] = new int[ca.fc[j].length + 1])[0] = i;
                        for (int l = 0; l < ca.fc[j].length; ++l) {
                            this.fc[a][1 + l] = ca.fc[j][l];
                        }
                    }
                }
            }
        }
        this.Yb = 1;
    }
    
    private final void a(final int arg0, final int arg1, final int arg2) {
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
        }
        else {
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
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
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
    
    final ca[] a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final boolean arg7, final int arg8) {
        this.a((byte)(-28));
        final int[] array = new int[arg4];
        final int[] array2 = new int[arg4];
        for (int i = 0; i < arg4; ++i) {
            array2[i] = (array[i] = 0);
        }
        for (int j = 0; j < this.t; ++j) {
            int n = 0;
            int n2 = 0;
            final int n3 = this.lb[j];
            final int[] array3 = this.o[j];
            for (int k = 0; k < n3; ++k) {
                n += this.a[array3[k]];
                n2 += this.bc[array3[k]];
            }
            final int n4 = n / (n3 * arg6) + n2 / (arg2 * n3) * arg1;
            final int[] array4 = array;
            final int n5 = n4;
            array4[n5] += n3;
            final int[] array5 = array2;
            final int n6 = n4;
            ++array5[n6];
        }
        final ca[] array6 = new ca[arg4];
        for (int l = 0; l < arg4; ++l) {
            if (arg5 < array[l]) {
                array[l] = arg5;
            }
            array6[l] = new ca(array[l], array2[l], true, true, true, arg7, true);
            array6[l].Mb = this.Mb;
            array6[l].Jb = this.Jb;
        }
        for (int arg9 = 0; this.t > arg9; ++arg9) {
            int n7 = 0;
            int n8 = 0;
            final int arg10 = this.lb[arg9];
            final int[] arg11 = this.o[arg9];
            for (int n9 = 0; arg10 > n9; ++n9) {
                n7 += this.a[arg11[n9]];
                n8 += this.bc[arg11[n9]];
            }
            this.a(arg11, array6[n7 / (arg10 * arg6) + arg1 * (n8 / (arg2 * arg10))], arg10, arg9, 5916);
        }
        for (int n10 = 0; n10 < arg4; ++n10) {
            array6[n10].c((byte)71);
        }
        return array6;
    }
    
    final int a(final int arg0, final int[] arg1, final int arg2, final int arg3, final boolean arg4) {
        if (arg4) {
            this.f(30, -84, 10, 23);
        }
        if (this.t < this.z) {
            this.lb[this.t] = arg0;
            this.o[this.t] = arg1;
            this.V[this.t] = arg2;
            this.qb[this.t] = arg3;
            this.Yb = 1;
            return this.t++;
        }
        return -1;
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final boolean arg3) {
        this.xb += arg2;
        this.Sb += arg1;
        if (!arg3) {
            this.jc = null;
        }
        this.r += arg0;
        this.b((byte)(-127));
        this.Yb = 1;
    }
    
    private final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final byte arg6) {
        for (int i = 0; i < this.Db; ++i) {
            if (arg2 != 0) {
                final int[] gb = this.Gb;
                final int n = i;
                gb[n] += this.ic[i] * arg2 >> 8;
            }
            if (arg3 != 0) {
                final int[] jc = this.jc;
                final int n2 = i;
                jc[n2] += arg3 * this.ic[i] >> 8;
            }
            if (arg4 != 0) {
                final int[] gb2 = this.Gb;
                final int n3 = i;
                gb2[n3] += arg4 * this.jc[i] >> 8;
            }
            if (arg1 != 0) {
                final int[] ic = this.ic;
                final int n4 = i;
                ic[n4] += arg1 * this.jc[i] >> 8;
            }
            if (arg0 != 0) {
                final int[] jc2 = this.jc;
                final int n5 = i;
                jc2[n5] += arg0 * this.Gb[i] >> 8;
            }
            if (arg5 != 0) {
                final int[] ic2 = this.ic;
                final int n6 = i;
                ic2[n6] += this.Gb[i] * arg5 >> 8;
            }
        }
    }
    
    final void b(final int arg0, final int arg1, final int arg2) {
        this.t -= arg2;
        if (arg1 > -110) {
            a((byte)(-3), (String)null);
        }
        if (this.t < 0) {
            this.t = 0;
        }
        this.Db -= arg0;
        if (this.Db < 0) {
            this.Db = 0;
        }
    }
    
    final void c(final int arg0, final int arg1, final int arg2, final int arg3) {
        this.xb = arg0;
        this.r = arg3;
        this.Sb = arg2;
        if (arg1 > -112) {
            this.a(-96, null, -8, 42, true);
        }
        this.b((byte)(-114));
        this.Yb = 1;
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final byte arg3, final int arg4, final int arg5, final int arg6, final int arg7, final int arg8) {
        this.d(7972);
        if (da.K >= this.ec && m.j <= this.gc && this.x <= oa.b && aa.f <= this.j && this.P <= nb.y && this.e >= aa.b) {
            this.dc = true;
            int n = 0;
            if (arg3 > -105) {
                this.c((byte)(-103));
            }
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (arg6 != 0) {
                n2 = pa.j[1024 + arg6];
                n = pa.j[arg6];
            }
            int n6 = 0;
            if (arg7 != 0) {
                n3 = pa.j[arg7];
                n4 = pa.j[arg7 + 1024];
            }
            if (arg5 != 0) {
                n5 = pa.j[arg5];
                n6 = pa.j[arg5 + 1024];
            }
            for (int n7 = 0; this.Db > n7; ++n7) {
                int n8 = this.Gb[n7] + -arg2;
                int n9 = -arg0 + this.ic[n7];
                if (arg6 != 0) {
                    final int n10 = n9 * n - -(n2 * n8) >> 15;
                    n9 = -(n8 * n) + n9 * n2 >> 15;
                    n8 = n10;
                }
                int n11 = this.jc[n7] - arg4;
                if (arg5 != 0) {
                    final int n12 = n6 * n8 + n11 * n5 >> 15;
                    n11 = -(n8 * n5) + n6 * n11 >> 15;
                    n8 = n12;
                }
                if (arg7 != 0) {
                    final int n13 = n9 * n4 + -(n3 * n11) >> 15;
                    n11 = n3 * n9 - -(n4 * n11) >> 15;
                    n9 = n13;
                }
                if (n11 < arg8) {
                    this.pb[n7] = n8 << arg1;
                }
                else {
                    this.pb[n7] = (n8 << arg1) / n11;
                }
                if (n11 < arg8) {
                    this.Ob[n7] = n9 << arg1;
                }
                else {
                    this.Ob[n7] = (n9 << arg1) / n11;
                }
                this.cc[n7] = n8;
                this.H[n7] = n9;
                this.bb[n7] = n11;
            }
            return;
        }
        this.dc = false;
    }
    
    private final void b(final byte arg0) {
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
        if (this.r == 0 && this.xb == 0 && this.Sb == 0) {
            this.jb = 0;
            return;
        }
        this.jb = 1;
    }
    
    private final void a(final byte arg0) {
        this.d(7972);
        for (int n = 0; this.Db > n; ++n) {
            this.a[n] = this.Gb[n];
            this.ob[n] = this.ic[n];
            this.bc[n] = this.jc[n];
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
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final boolean arg4, final int arg5, final int arg6) {
        this.Mb = (-arg5 + 64) * 16 + 128;
        this.Jb = 256 - arg1 * 4;
        if (this.Nb) {
            return;
        }
        for (int n = 0; this.t > n; ++n) {
            if (arg4) {
                this.Hb[n] = this.Vb;
            }
            else {
                this.Hb[n] = 0;
            }
        }
        this.g = arg3;
        this.Fb = arg0;
        this.Bb = arg2;
        this.Ib = (int)Math.sqrt(arg2 * arg2 + (arg3 * arg3 - -(arg0 * arg0)));
        this.e(-121);
    }
    
    private final void b(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg1 != -27483) {
            this.e(-7, -82, -31, -24);
        }
        for (int i = 0; i < this.Db; ++i) {
            this.Gb[i] = this.Gb[i] * arg0 >> 8;
            this.ic[i] = this.ic[i] * arg3 >> 8;
            this.jc[i] = arg2 * this.jc[i] >> 8;
        }
    }
    
    final int e(final int arg0, final int arg1, final int arg2, final int arg3) {
        for (int i = 0; i < this.Db; ++i) {
            if (this.a[i] == arg0 && arg2 == this.ob[i] && arg1 == this.bc[i]) {
                return i;
            }
        }
        if (this.Db < this.K) {
            this.a[this.Db] = arg0;
            this.ob[this.Db] = arg2;
            this.bc[this.Db] = arg1;
            return this.Db++;
        }
        return -1;
    }
    
    private final void a(final int[] arg0, final ca arg1, final int arg2, final int arg3, final int arg4) {
        final int[] arg5 = new int[arg2];
        for (int n = 0; arg2 > n; ++n) {
            final int[] array = arg5;
            final int n2 = n;
            final int e = arg1.e(this.a[arg0[n]], this.bc[arg0[n]], this.ob[arg0[n]], 107);
            array[n2] = e;
            final int n3 = e;
            arg1.gb[n3] = this.gb[arg0[n]];
            arg1.Ab[n3] = this.Ab[arg0[n]];
        }
        if (arg4 != 5916) {
            this.yb = 77;
        }
        final int a = arg1.a(arg2, arg5, this.V[arg3], this.qb[arg3], false);
        if (!arg1.db) {
            if (!this.db) {
                arg1.E[a] = this.E[arg3];
            }
        }
        arg1.Hb[a] = this.Hb[arg3];
        arg1.M[a] = this.M[arg3];
        arg1.k[a] = this.k[arg3];
    }
    
    final void c(final int arg0) {
        this.t = 0;
        if (arg0 != 1) {
            this.Kb = true;
        }
        this.Db = 0;
    }
    
    private final void a(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg0 >= -14) {
            this.Cb = null;
        }
        for (int n = 0; this.Db > n; ++n) {
            if (arg2 != 0) {
                final int n2 = pa.a[arg2 + 256];
                final int n3 = pa.a[arg2];
                final int n4 = this.Gb[n] * n2 + this.ic[n] * n3 >> 15;
                this.ic[n] = -(n3 * this.Gb[n]) + this.ic[n] * n2 >> 15;
                this.Gb[n] = n4;
            }
            if (arg1 != 0) {
                final int n5 = pa.a[arg1];
                final int n6 = pa.a[256 + arg1];
                final int n7 = -(n5 * this.jc[n]) + n6 * this.ic[n] >> 15;
                this.jc[n] = n5 * this.ic[n] - -(n6 * this.jc[n]) >> 15;
                this.ic[n] = n7;
            }
            if (arg3 != 0) {
                final int n8 = pa.a[arg3];
                final int n9 = pa.a[256 + arg3];
                final int n10 = n8 * this.jc[n] + this.Gb[n] * n9 >> 15;
                this.jc[n] = -(this.Gb[n] * n8) + this.jc[n] * n9 >> 15;
                this.Gb[n] = n10;
            }
        }
    }
    
    private final void e(final int arg0) {
        if (this.Nb) {
            return;
        }
        final int n = this.Mb * this.Ib >> 8;
        for (int n2 = 0; this.t > n2; ++n2) {
            if (this.Hb[n2] != this.Vb) {
                this.Hb[n2] = (this.Cb[n2] * this.Bb + (this.fb[n2] * this.g - -(this.Fb * this.Pb[n2]))) / n;
            }
        }
        final int[] array = new int[this.Db];
        final int[] array2 = new int[this.Db];
        final int[] array3 = new int[this.Db];
        final int[] array4 = new int[this.Db];
        for (int n3 = 0; this.Db > n3; ++n3) {
            array2[n3] = (array[n3] = 0);
            array4[n3] = (array3[n3] = 0);
        }
        for (int i = 0; i < this.t; ++i) {
            if (this.Hb[i] == this.Vb) {
                for (int n4 = 0; this.lb[i] > n4; ++n4) {
                    final int n5 = this.o[i][n4];
                    final int[] array5 = array;
                    final int n6 = n5;
                    array5[n6] += this.fb[i];
                    final int[] array6 = array2;
                    final int n7 = n5;
                    array6[n7] += this.Cb[i];
                    final int[] array7 = array3;
                    final int n8 = n5;
                    array7[n8] += this.Pb[i];
                    final int[] array8 = array4;
                    final int n9 = n5;
                    ++array8[n9];
                }
            }
        }
        for (int n10 = 0; this.Db > n10; ++n10) {
            if (array4[n10] > 0) {
                this.gb[n10] = (array3[n10] * this.Fb + (array[n10] * this.g + array2[n10] * this.Bb)) / (n * array4[n10]);
            }
        }
    }
    
    final ca a(final boolean arg0, final int arg1, final boolean arg2, final boolean arg3, final boolean arg4) {
        final ca ca = new ca(new ca[] { this }, 1, arg3, arg4, arg2, arg0);
        ca.hc = this.hc;
        return ca;
    }
    
    static final int a(final byte arg0, final String arg1) {
        if (!arg1.equalsIgnoreCase("na")) {
            if (arg0 != 91) {
                ca.B = null;
            }
            for (int i = 0; i < ia.b; ++i) {
                if (ub.c[i].equalsIgnoreCase(arg1)) {
                    return i;
                }
            }
            ub.c[ia.b++] = arg1;
            return ia.b - 1;
        }
        return 0;
    }
    
    final void a(final ca arg0, final int arg1) {
        if (arg1 != 6029) {
            this.jb = -128;
        }
        this.xb = arg0.xb;
        this.C = arg0.C;
        this.Sb = arg0.Sb;
        this.r = arg0.r;
        this.X = arg0.X;
        this.F = arg0.F;
        this.b((byte)(-113));
        this.Yb = 1;
    }
    
    final ca b(final int arg0) {
        final ca[] arg = { null };
        if (arg0 != -2) {
            this.b(117, -93, -34, -34);
        }
        arg[0] = this;
        final ca ca = new ca(arg, 1);
        ca.cb = this.cb;
        ca.hc = this.hc;
        return ca;
    }
    
    private final void c(final byte arg0) {
        if (arg0 < 49) {
            this.a(40, 102, 104, 108, -20, -89);
        }
        this.bb = new int[this.Db];
        this.Ob = new int[this.Db];
        this.cc = new int[this.Db];
        this.H = new int[this.Db];
        this.pb = new int[this.Db];
    }
    
    final void a(final int arg0, final int arg1, final byte arg2) {
        if (arg2 != -61) {
            return;
        }
        this.Ab[arg0] = (byte)arg1;
    }
    
    private final void d(final int arg0) {
        if (arg0 != 7972) {
            this.a(120, 20, 57, true);
        }
        if (this.Yb == 2) {
            this.Yb = 0;
            for (int n = 0; this.Db > n; ++n) {
                this.Gb[n] = this.a[n];
                this.ic[n] = this.ob[n];
                this.jc[n] = this.bc[n];
            }
            this.j = 9999999;
            this.e = 9999999;
            this.P = -9999999;
            this.gc = 9999999;
            this.ec = -9999999;
            this.sb = 9999999;
            this.x = -9999999;
        }
        else if (this.Yb == 1) {
            this.Yb = 0;
            for (int i = 0; i < this.Db; ++i) {
                this.Gb[i] = this.a[i];
                this.ic[i] = this.ob[i];
                this.jc[i] = this.bc[i];
            }
            if (this.jb >= 2) {
                this.a(-53, this.F, this.C, this.X);
            }
            if (this.jb >= 3) {
                this.b(this.yb, -27483, this.T, this.i);
            }
            if (this.jb >= 4) {
                this.a(this.U, this.f, this.Tb, this.G, this.Y, this.eb, (byte)(-127));
            }
            if (this.jb >= 1) {
                this.d(arg0 - 7972, this.xb, this.Sb, this.r);
            }
            this.a(999999);
            this.d((byte)14);
        }
    }
    
    final int b(final boolean arg0, final int arg1, final int arg2, final int arg3) {
        if (this.K <= this.Db) {
            return -1;
        }
        this.a[this.Db] = arg2;
        this.ob[this.Db] = arg3;
        this.bc[this.Db] = arg1;
        if (arg0) {
            a((byte)52, (String)null);
        }
        return this.Db++;
    }
    
    private final void d(final byte arg0) {
        if (this.Nb && this.c) {
            return;
        }
        if (arg0 != 14) {
            return;
        }
        for (int n = 0; this.t > n; ++n) {
            final int[] array = this.o[n];
            final int n2 = this.Gb[array[0]];
            final int n3 = this.ic[array[0]];
            final int n4 = this.jc[array[0]];
            final int n5 = -n2 + this.Gb[array[1]];
            final int n6 = this.ic[array[1]] + -n3;
            final int n7 = -n4 + this.jc[array[1]];
            final int n8 = -n2 + this.Gb[array[2]];
            final int n9 = this.ic[array[2]] - n3;
            final int n10 = -n4 + this.jc[array[2]];
            int n11;
            int n12;
            int n13;
            for (n11 = n10 * n6 - n7 * n9, n12 = -(n5 * n10) + n7 * n8, n13 = -(n8 * n6) + n5 * n9; n11 > 8192 || n12 > 8192 || n13 > 8192 || n11 < -8192 || n12 < -8192 || n13 < -8192; n12 >>= 1, n13 >>= 1, n11 >>= 1) {}
            int n14 = (int)(Math.sqrt(n12 * n12 + (n11 * n11 + n13 * n13)) * 256.0);
            if (n14 <= 0) {
                n14 = 1;
            }
            this.fb[n] = n11 * 65536 / n14;
            this.Cb[n] = 65536 * n12 / n14;
            this.Pb[n] = n13 * 65535 / n14;
            this.M[n] = -1;
        }
        this.e(arg0 ^ 0xFFFFFFAB);
    }
    
    final void f(final int arg0, final int arg1, final int arg2, final int arg3) {
        this.F = (arg3 + this.F & 0xFF);
        this.X = (arg2 + this.X & 0xFF);
        if (arg1 != -31616) {
            return;
        }
        this.C = (0xFF & this.C - -arg0);
        this.b((byte)(-105));
        this.Yb = 1;
    }
    
    private final void d(final int arg0, final int arg1, final int arg2, final int arg3) {
        for (int n = arg0; this.Db > n; ++n) {
            final int[] gb = this.Gb;
            final int n2 = n;
            gb[n2] += arg3;
            final int[] ic = this.ic;
            final int n3 = n;
            ic[n3] += arg1;
            final int[] jc = this.jc;
            final int n4 = n;
            jc[n4] += arg2;
        }
    }
    
    private final int a(final byte arg0, final byte[] arg1) {
        if (arg0 != 76) {
            return 108;
        }
        while (arg1[this.hb] == 10 || arg1[this.hb] == 13) {
            ++this.hb;
        }
        int vb = pa.d[0xFF & arg1[this.hb++]] * 64 - 131072 + (4096 * pa.d[0xFF & arg1[this.hb++]] + pa.d[arg1[this.hb++] & 0xFF]);
        if (vb == 123456) {
            vb = this.Vb;
        }
        return vb;
    }
    
    final void a(final boolean arg0, final int arg1, final int arg2, final int arg3) {
        if (arg0) {
            this.Yb = 71;
        }
        if (!this.Nb) {
            this.Fb = arg3;
            this.Bb = arg2;
            this.g = arg1;
            this.Ib = (int)Math.sqrt(arg3 * arg3 + (arg2 * arg2 + arg1 * arg1));
            this.e(52);
        }
    }
    
    ca(final int arg0, final int arg1) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.hc = 0;
        this.a(arg1, arg0, 69);
        this.fc = new int[arg1][1];
        for (int i = 0; i < arg1; ++i) {
            this.fc[i][0] = i;
        }
    }
    
    ca(final int arg0, final int arg1, final boolean arg2, final boolean arg3, final boolean arg4, final boolean arg5, final boolean arg6) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.hc = 0;
        this.c = arg3;
        this.b = arg6;
        this.db = arg5;
        this.v = arg2;
        this.Nb = arg4;
        this.a(arg1, arg0, 69);
    }
    
    ca(final byte[] arg0, int arg1, final boolean arg2) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.hc = 0;
        final int i = d.a(arg1, (byte)7, arg0);
        arg1 += 2;
        final int j = d.a(arg1, (byte)8, arg0);
        arg1 += 2;
        this.a(j, i, 115);
        this.fc = new int[j][1];
        for (int n = 0; i > n; ++n) {
            this.a[n] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        for (int n2 = 0; i > n2; ++n2) {
            this.ob[n2] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        for (int n3 = 0; i > n3; ++n3) {
            this.bc[n3] = w.a(arg0, -1, arg1);
            arg1 += 2;
        }
        this.Db = i;
        for (int n4 = 0; j > n4; ++n4) {
            this.lb[n4] = ib.a(255, arg0[arg1++]);
        }
        for (int n5 = 0; j > n5; ++n5) {
            this.V[n5] = w.a(arg0, -1, arg1);
            if (this.V[n5] == 32767) {
                this.V[n5] = this.Vb;
            }
            arg1 += 2;
        }
        for (int k = 0; k < j; ++k) {
            this.qb[k] = w.a(arg0, -1, arg1);
            arg1 += 2;
            if (this.qb[k] == 32767) {
                this.qb[k] = this.Vb;
            }
        }
        for (int n6 = 0; j > n6; ++n6) {
            if ((0xFF & arg0[arg1++]) != 0x0) {
                this.Hb[n6] = this.Vb;
            }
            else {
                this.Hb[n6] = 0;
            }
        }
        for (int l = 0; l < j; ++l) {
            this.o[l] = new int[this.lb[l]];
            for (int n7 = 0; this.lb[l] > n7; ++n7) {
                if (i < 256) {
                    this.o[l][n7] = ib.a(255, arg0[arg1++]);
                }
                else {
                    this.o[l][n7] = d.a(arg1, (byte)102, arg0);
                    arg1 += 2;
                }
            }
        }
        this.t = j;
        this.Yb = 1;
    }
    
    ca(final String arg0) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.hc = 0;
        byte[] array;
        try {
            final DataInputStream dataInputStream = new DataInputStream(nb.a(true, arg0));
            final byte[] arg = new byte[3];
            int i = 0;
            this.hb = 0;
            while (i < 3) {
                i += dataInputStream.read(arg, i, -i + 3);
            }
            final int a = this.a((byte)76, arg);
            int j = 0;
            this.hb = 0;
            for (array = new byte[a]; j < a; j += dataInputStream.read(array, j, a - j)) {}
            dataInputStream.close();
        }
        catch (final IOException ex) {
            this.t = 0;
            this.Db = 0;
            return;
        }
        final int k = this.a((byte)76, array);
        final int l = this.a((byte)76, array);
        this.a(l, k, 97);
        this.fc = new int[l][];
        for (int n = 0; k > n; ++n) {
            this.e(this.a((byte)76, array), this.a((byte)76, array), this.a((byte)76, array), 52);
        }
        for (int n2 = 0; l > n2; ++n2) {
            final int a2 = this.a((byte)76, array);
            final int a3 = this.a((byte)76, array);
            final int a4 = this.a((byte)76, array);
            final int a5 = this.a((byte)76, array);
            this.Mb = this.a((byte)76, array);
            this.Jb = this.a((byte)76, array);
            final int a6 = this.a((byte)76, array);
            final int[] arg2 = new int[a2];
            for (int n3 = 0; n3 < a2; ++n3) {
                arg2[n3] = this.a((byte)76, array);
            }
            final int[] array2 = new int[a5];
            for (int n4 = 0; n4 < a5; ++n4) {
                array2[n4] = this.a((byte)76, array);
            }
            final int a7 = this.a(a2, arg2, a3, a4, false);
            this.fc[n2] = array2;
            if (a6 == 0) {
                this.Hb[a7] = 0;
            }
            else {
                this.Hb[a7] = this.Vb;
            }
        }
        this.Yb = 1;
    }
    
    private ca(final ca[] arg0, final int arg1, final boolean arg2, final boolean arg3, final boolean arg4, final boolean arg5) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.hc = 0;
        this.Nb = arg4;
        this.c = arg3;
        this.db = arg5;
        this.v = arg2;
        this.a(0, arg0, false, arg1);
    }
    
    private ca(final ca[] arg0, final int arg1) {
        super();
        this.Bb = 155;
        this.c = false;
        this.Yb = 1;
        this.b = false;
        this.Ib = 256;
        this.v = false;
        this.cb = false;
        this.Nb = false;
        this.sb = 12345678;
        this.g = 180;
        this.dc = true;
        this.Vb = 12345678;
        this.Kb = false;
        this.rb = -1;
        this.Mb = 512;
        this.Fb = 95;
        this.db = false;
        this.Jb = 32;
        this.a(this.hc = 0, arg0, true, arg1);
    }
    
    static {
        ca.tb = new byte[50][];
    }
}
