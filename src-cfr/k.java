/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class k {
    private boolean H = false;
    byte[] Q;
    private lb c;
    private boolean nb = true;
    private int[][] ab = new int[96][96];
    private int[] w;
    private byte[][] L;
    boolean Z = false;
    private int[][] s;
    private byte[][] R;
    int[][] bb;
    private byte[][] f;
    private byte[][] P;
    private byte[][] mb = new byte[4][2304];
    private ca kb;
    private ca[] F;
    private ua U;
    byte[] m;
    private int[][] B;
    int x = 750;
    ca[][] g;
    int[] E;
    static String[] G = new String[100];
    byte[] gb;
    private byte[][] A;
    static int o;
    static long e;
    byte[] I;
    private byte[][] eb;
    ca[][] db;
    int[] q;

    private final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 2) {
            this.Q = null;
        }
        ca ca2 = this.F[arg4 - -(arg2 * 8)];
        for (int i2 = 0; ca2.Db > i2; ++i2) {
            if (128 * arg5 != ca2.a[i2] || ca2.bc[i2] != arg0 * 128) continue;
            ca2.a(i2, arg1, (byte)-61);
            return;
        }
    }

    private final void a(int arg0) {
        for (int i2 = arg0; i2 < 96; ++i2) {
            for (int i3 = 0; i3 < 96; ++i3) {
                if (this.b(0, i2, arg0 ^ 4, i3) != 250) continue;
                if (i2 != 47 || this.b(0, i2 + 1, arg0 + 4, i3) == 250 || this.b(0, 1 + i2, 4, i3) == 2) {
                    if (i3 == 47 && this.b(0, i2, 4, i3 + 1) != 250 && this.b(0, i2, arg0 ^ 4, 1 + i3) != 2) {
                        this.e(9, i3, 107, i2);
                        continue;
                    }
                    this.e(2, i3, 110, i2);
                    continue;
                }
                this.e(9, i3, arg0 + 111, i2);
            }
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3) {
        block10: {
            int n2;
            int n3;
            if (arg3 != 4081) {
                this.a(-98, 25, -8, -1, (byte)-83, 45);
            }
            if (arg1 < 0 || arg2 < 0 || arg1 >= 95 || arg2 >= 95) {
                return;
            }
            if (mb.a[arg0] != 1 && mb.a[arg0] != 2) break block10;
            int n4 = this.b(arg1, arg2, -79);
            if (n4 == 0 || n4 == 4) {
                n3 = ub.g[arg0];
                n2 = f.f[arg0];
            } else {
                n3 = f.f[arg0];
                n2 = ub.g[arg0];
            }
            for (int i2 = arg1; i2 < arg1 - -n2; ++i2) {
                for (int i3 = arg2; n3 + arg2 > i3; ++i3) {
                    if (mb.a[arg0] != 1) {
                        if (n4 == 0) {
                            this.bb[i2][i3] = ib.a(this.bb[i2][i3], 65533);
                            if (i2 <= 0) continue;
                            this.c(i3, arg3 + 61454, i2 - 1, 8);
                            continue;
                        }
                        if (n4 != 2) {
                            if (n4 != 4) {
                                if (n4 != 6) continue;
                                this.bb[i2][i3] = ib.a(this.bb[i2][i3], 65534);
                                if (i3 <= 0) continue;
                                this.c(i3 - 1, arg3 ^ 0xF00E, i2, 4);
                                continue;
                            }
                            this.bb[i2][i3] = ib.a(this.bb[i2][i3], 65527);
                            if (i2 >= 95) continue;
                            this.c(i3, arg3 + 61454, 1 + i2, 2);
                            continue;
                        }
                        this.bb[i2][i3] = ib.a(this.bb[i2][i3], 65531);
                        if (i3 >= 95) continue;
                        this.c(i3 + 1, arg3 + 61454, i2, 1);
                        continue;
                    }
                    this.bb[i2][i3] = ib.a(this.bb[i2][i3], 65471);
                }
            }
            this.c(n2, n3, -82, arg1, arg2);
        }
    }

    private final void e(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 0 || arg3 >= 96 || arg1 < 0 || arg1 >= 96) {
            return;
        }
        int n2 = 0;
        if (arg3 < 48 || arg1 >= 48) {
            if (arg3 < 48 && arg1 >= 48) {
                n2 = 2;
                arg1 -= 48;
            } else if (arg3 >= 48 && arg1 >= 48) {
                arg3 -= 48;
                arg1 -= 48;
                n2 = 3;
            }
        } else {
            n2 = 1;
            arg3 -= 48;
        }
        this.R[n2][arg1 + 48 * arg3] = (byte)arg0;
    }

    final void a(int arg0, int arg1, boolean arg2, int arg3) {
        block10: {
            int n2;
            int n3;
            if (arg2) {
                return;
            }
            if (arg0 < 0 || arg3 < 0 || arg0 >= 95 || arg3 >= 95) {
                return;
            }
            if (mb.a[arg1] != 1 && mb.a[arg1] != 2) break block10;
            int n4 = this.b(arg0, arg3, -107);
            if (n4 == 0 || n4 == 4) {
                n3 = f.f[arg1];
                n2 = ub.g[arg1];
            } else {
                n2 = f.f[arg1];
                n3 = ub.g[arg1];
            }
            for (int i2 = arg0; i2 < n3 + arg0; ++i2) {
                for (int i3 = arg3; arg3 + n2 > i3; ++i3) {
                    if (mb.a[arg1] == 1) {
                        this.bb[i2][i3] = d.a(this.bb[i2][i3], 64);
                        continue;
                    }
                    if (n4 != 0) {
                        if (n4 == 2) {
                            this.bb[i2][i3] = d.a(this.bb[i2][i3], 4);
                            if (i3 >= 95) continue;
                            this.a(1, 1 + i3, (byte)-112, i2);
                            continue;
                        }
                        if (n4 != 4) {
                            if (n4 != 6) continue;
                            this.bb[i2][i3] = d.a(this.bb[i2][i3], 1);
                            if (i3 <= 0) continue;
                            this.a(4, i3 - 1, (byte)-112, i2);
                            continue;
                        }
                        this.bb[i2][i3] = d.a(this.bb[i2][i3], 8);
                        if (i2 >= 95) continue;
                        this.a(2, i3, (byte)-56, i2 + 1);
                        continue;
                    }
                    this.bb[i2][i3] = d.a(this.bb[i2][i3], 2);
                    if (i2 <= 0) continue;
                    this.a(8, i3, (byte)-109, i2 - 1);
                }
            }
            this.c(n3, n2, 94, arg0, arg3);
        }
    }

    static final byte[] a(int arg0, boolean arg1, byte[] arg2) {
        int n2;
        int n3;
        if (arg0 != 128) {
            o = 104;
        }
        if ((n3 = ((arg2[1] & 0xFF) << 8) + ((0xFF0000 & arg2[0] << 16) - -(0xFF & arg2[2]))) == (n2 = ((0xFF & arg2[4]) << 8) + (0xFF0000 & arg2[3] << 16) + (0xFF & arg2[5]))) {
            byte[] byArray = new byte[arg2.length - 6];
            ab.a(arg2, 6, byArray, 0, byArray.length);
            return byArray;
        }
        if (arg1) {
            da.a("Unpacking ", 0, 0);
        }
        byte[] byArray = new byte[n3];
        ea.a(byArray, n3, arg2, n2, 6);
        return byArray;
    }

    private final void b(int arg0) {
        if (arg0 != -10185) {
            return;
        }
        if (this.nb) {
            this.c.a(false);
        }
        for (int i2 = 0; i2 < 64; ++i2) {
            int n2;
            this.F[i2] = null;
            for (n2 = 0; n2 < 4; ++n2) {
                this.g[n2][i2] = null;
            }
            for (n2 = 0; n2 < 4; ++n2) {
                this.db[n2][i2] = null;
            }
        }
        System.gc();
    }

    private final void a(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15 = (24 + arg0) / 48;
            int n16 = (24 + arg4) / 48;
            this.b(arg3, 0, n15 - 1, 0, n16 - 1);
            this.b(arg3, 1, n15, 0, n16 - 1);
            if (arg1 < 66) {
                return;
            }
            this.b(arg3, 2, n15 - 1, 0, n16);
            this.b(arg3, 3, n15, 0, n16);
            this.a(0);
            if (this.kb == null) {
                this.kb = new ca(18688, 18688, true, true, false, false, true);
            }
            if (arg2) {
                this.U.a(true);
                for (int i2 = 0; i2 < 96; ++i2) {
                    for (n14 = 0; n14 < 96; ++n14) {
                        this.bb[i2][n14] = 0;
                    }
                }
                ca ca2 = this.kb;
                ca2.c(1);
                for (n14 = 0; n14 < 96; ++n14) {
                    for (n13 = 0; n13 < 96; ++n13) {
                        n12 = -this.g(2, n13, n14);
                        if (this.b(arg3, n14, 4, n13) > 0 && da.N[this.b(arg3, n14, 4, n13) - 1] == 4) {
                            n12 = 0;
                        }
                        if (this.b(arg3, n14 - 1, 4, n13) > 0 && da.N[this.b(arg3, n14 - 1, 4, n13) - 1] == 4) {
                            n12 = 0;
                        }
                        if (this.b(arg3, n14, 4, n13 - 1) > 0 && da.N[this.b(arg3, n14, 4, n13 - 1) - 1] == 4) {
                            n12 = 0;
                        }
                        if (this.b(arg3, n14 - 1, 4, n13 - 1) > 0 && da.N[this.b(arg3, n14 - 1, 4, n13 - 1) - 1] == 4) {
                            n12 = 0;
                        }
                        n11 = ca2.e(n14 * 128, 128 * n13, n12, 107);
                        n10 = (int)(Math.random() * 10.0) - 5;
                        ca2.a(n11, n10, (byte)-61);
                    }
                }
                for (n14 = 0; n14 < 95; ++n14) {
                    for (n13 = 0; n13 < 95; ++n13) {
                        int n17;
                        n12 = this.a((byte)104, n14, n13);
                        n10 = n11 = this.w[n12];
                        n9 = n11;
                        if (arg3 == 1 || arg3 == 2) {
                            n10 = 12345678;
                            n11 = 12345678;
                            n9 = 12345678;
                        }
                        n8 = 0;
                        if (this.b(arg3, n14, 4, n13) > 0) {
                            n17 = this.b(arg3, n14, 4, n13);
                            n12 = da.N[n17 - 1];
                            int n18 = this.d(arg3, n13, 15282, n14);
                            n11 = n10 = qa.K[n17 - 1];
                            if (n12 == 4) {
                                n11 = 1;
                                n10 = 1;
                                if (n17 == 12) {
                                    n11 = 31;
                                    n10 = 31;
                                }
                            }
                            if (n12 == 5) {
                                if (this.c(n14, n13, -49) > 0 && this.c(n14, n13, -49) < 24000) {
                                    if (this.d(-8509, n14 - 1, n9, arg3, n13) != 12345678 && this.d(-8509, n14, n9, arg3, n13 - 1) != 12345678) {
                                        n8 = 0;
                                        n11 = this.d(-8509, n14 - 1, n9, arg3, n13);
                                    } else if (this.d(-8509, 1 + n14, n9, arg3, n13) != 12345678 && this.d(-8509, n14, n9, arg3, 1 + n13) != 12345678) {
                                        n10 = this.d(-8509, n14 + 1, n9, arg3, n13);
                                        n8 = 0;
                                    } else if (this.d(-8509, 1 + n14, n9, arg3, n13) == 12345678 || this.d(-8509, n14, n9, arg3, n13 - 1) == 12345678) {
                                        if (this.d(-8509, n14 - 1, n9, arg3, n13) != 12345678 && this.d(-8509, n14, n9, arg3, n13 + 1) != 12345678) {
                                            n8 = 1;
                                            n11 = this.d(-8509, n14 - 1, n9, arg3, n13);
                                        }
                                    } else {
                                        n10 = this.d(-8509, n14 + 1, n9, arg3, n13);
                                        n8 = 1;
                                    }
                                }
                            } else if (n12 != 2 || this.c(n14, n13, -49) > 0 && this.c(n14, n13, -49) < 24000) {
                                if (n18 != this.d(arg3, n13, 15282, n14 - 1) && this.d(arg3, n13 - 1, 15282, n14) != n18) {
                                    n11 = n9;
                                    n8 = 0;
                                } else if (n18 != this.d(arg3, n13, 15282, n14 + 1) && n18 != this.d(arg3, n13 + 1, 15282, n14)) {
                                    n8 = 0;
                                    n10 = n9;
                                } else if (n18 == this.d(arg3, n13, 15282, 1 + n14) || n18 == this.d(arg3, n13 - 1, 15282, n14)) {
                                    if (n18 != this.d(arg3, n13, 15282, n14 - 1) && n18 != this.d(arg3, 1 + n13, 15282, n14)) {
                                        n11 = n9;
                                        n8 = 1;
                                    }
                                } else {
                                    n10 = n9;
                                    n8 = 1;
                                }
                            }
                            if (ac.l[n17 - 1] != 0) {
                                this.bb[n14][n13] = d.a(this.bb[n14][n13], 64);
                            }
                            if (da.N[n17 - 1] == 2) {
                                this.bb[n14][n13] = d.a(this.bb[n14][n13], 128);
                            }
                        }
                        this.a(n8, (byte)-122, n10, n14, n13, n11);
                        n17 = this.g(2, 1 + n13, n14 + 1) + (-this.g(2, n13, n14 + 1) - -this.g(2, n13 + 1, n14)) - this.g(2, n13, n14);
                        if (n10 != n11 || n17 != 0) {
                            int[] nArray = new int[3];
                            int[] nArray2 = new int[3];
                            if (n8 == 0) {
                                if (n11 != 12345678) {
                                    nArray[1] = n14 * 96 + n13;
                                    nArray[0] = 96 + n13 + 96 * n14;
                                    nArray[2] = 1 + (n13 + 96 * n14);
                                    n7 = ca2.a(3, nArray, 12345678, n11, false);
                                    this.q[n7] = n14;
                                    this.E[n7] = n13;
                                    ca2.E[n7] = n7 + 200000;
                                }
                                if (n10 == 12345678) continue;
                                nArray2[2] = n13 + (96 * n14 + 96);
                                nArray2[1] = 97 + (96 * n14 + n13);
                                nArray2[0] = 1 + n14 * 96 + n13;
                                n7 = ca2.a(3, nArray2, 12345678, n10, false);
                                this.q[n7] = n14;
                                this.E[n7] = n13;
                                ca2.E[n7] = n7 + 200000;
                                continue;
                            }
                            if (n11 != 12345678) {
                                nArray[2] = n13 - -(96 * n14);
                                nArray[1] = 96 + (96 * n14 + (n13 + 1));
                                nArray[0] = 1 + (96 * n14 + n13);
                                n7 = ca2.a(3, nArray, 12345678, n11, false);
                                this.q[n7] = n14;
                                this.E[n7] = n13;
                                ca2.E[n7] = 200000 - -n7;
                            }
                            if (n10 == 12345678) continue;
                            nArray2[1] = n13 - -(96 * n14);
                            nArray2[2] = n13 - (-(n14 * 96) - 97);
                            nArray2[0] = 96 * n14 + n13 + 96;
                            n7 = ca2.a(3, nArray2, 12345678, n10, false);
                            this.q[n7] = n14;
                            this.E[n7] = n13;
                            ca2.E[n7] = n7 + 200000;
                            continue;
                        }
                        if (n11 == 12345678) continue;
                        int[] nArray = new int[4];
                        nArray[3] = n13 - (-(n14 * 96) - 96) + 1;
                        nArray[2] = 1 + n14 * 96 + n13;
                        nArray[0] = n13 - (-(n14 * 96) - 96);
                        nArray[1] = n13 - -(n14 * 96);
                        int n19 = ca2.a(4, nArray, 12345678, n11, false);
                        this.q[n19] = n14;
                        this.E[n19] = n13;
                        ca2.E[n19] = n19 + 200000;
                    }
                }
                for (n14 = 1; n14 < 95; ++n14) {
                    for (n13 = 1; n13 < 95; ++n13) {
                        int n20;
                        int[] nArray;
                        if (this.b(arg3, n14, 4, n13) > 0 && da.N[this.b(arg3, n14, 4, n13) - 1] == 4) {
                            n12 = qa.K[this.b(arg3, n14, 4, n13) - 1];
                            n11 = ca2.e(n14 * 128, 128 * n13, -this.g(2, n13, n14), 13);
                            n10 = ca2.e(128 * (n14 + 1), n13 * 128, -this.g(2, n13, 1 + n14), 107);
                            n9 = ca2.e((1 + n14) * 128, (n13 + 1) * 128, -this.g(2, n13 + 1, n14 + 1), -116);
                            n8 = ca2.e(n14 * 128, 128 + 128 * n13, -this.g(2, 1 + n13, n14), -124);
                            nArray = new int[]{n11, n10, n9, n8};
                            n20 = ca2.a(4, nArray, n12, 12345678, false);
                            this.q[n20] = n14;
                            this.E[n20] = n13;
                            ca2.E[n20] = n20 + 200000;
                            this.a(0, (byte)-121, n12, n14, n13, n12);
                            continue;
                        }
                        if (this.b(arg3, n14, 4, n13) != 0 && da.N[this.b(arg3, n14, 4, n13) - 1] == 3) continue;
                        if (this.b(arg3, n14, 4, n13 + 1) > 0 && da.N[this.b(arg3, n14, 4, 1 + n13) - 1] == 4) {
                            n12 = qa.K[this.b(arg3, n14, 4, n13 + 1) - 1];
                            n11 = ca2.e(128 * n14, 128 * n13, -this.g(2, n13, n14), -124);
                            n10 = ca2.e(128 * (n14 + 1), 128 * n13, -this.g(2, n13, 1 + n14), -118);
                            n9 = ca2.e(128 + n14 * 128, 128 * (n13 + 1), -this.g(2, n13 + 1, 1 + n14), -124);
                            n8 = ca2.e(128 * n14, 128 * n13 + 128, -this.g(2, 1 + n13, n14), -116);
                            nArray = new int[]{n11, n10, n9, n8};
                            n20 = ca2.a(4, nArray, n12, 12345678, false);
                            this.q[n20] = n14;
                            this.E[n20] = n13;
                            ca2.E[n20] = n20 + 200000;
                            this.a(0, (byte)34, n12, n14, n13, n12);
                        }
                        if (this.b(arg3, n14, 4, n13 - 1) > 0 && da.N[this.b(arg3, n14, 4, n13 - 1) - 1] == 4) {
                            n12 = qa.K[this.b(arg3, n14, 4, n13 - 1) - 1];
                            n11 = ca2.e(n14 * 128, n13 * 128, -this.g(2, n13, n14), -122);
                            n10 = ca2.e(128 * (1 + n14), n13 * 128, -this.g(2, n13, n14 + 1), 123);
                            n9 = ca2.e(128 * (1 + n14), 128 * (n13 + 1), -this.g(2, n13 + 1, n14 + 1), -104);
                            n8 = ca2.e(128 * n14, 128 + 128 * n13, -this.g(2, n13 + 1, n14), -127);
                            nArray = new int[]{n11, n10, n9, n8};
                            n20 = ca2.a(4, nArray, n12, 12345678, false);
                            this.q[n20] = n14;
                            this.E[n20] = n13;
                            ca2.E[n20] = 200000 + n20;
                            this.a(0, (byte)17, n12, n14, n13, n12);
                        }
                        if (this.b(arg3, n14 + 1, 4, n13) > 0 && da.N[this.b(arg3, n14 + 1, 4, n13) - 1] == 4) {
                            n12 = qa.K[this.b(arg3, 1 + n14, 4, n13) - 1];
                            n11 = ca2.e(128 * n14, n13 * 128, -this.g(2, n13, n14), -113);
                            n10 = ca2.e(128 + n14 * 128, n13 * 128, -this.g(2, n13, 1 + n14), 89);
                            n9 = ca2.e(128 * (1 + n14), 128 * n13 + 128, -this.g(2, 1 + n13, 1 + n14), 124);
                            n8 = ca2.e(n14 * 128, (1 + n13) * 128, -this.g(2, n13 + 1, n14), -112);
                            nArray = new int[]{n11, n10, n9, n8};
                            n20 = ca2.a(4, nArray, n12, 12345678, false);
                            this.q[n20] = n14;
                            this.E[n20] = n13;
                            ca2.E[n20] = n20 + 200000;
                            this.a(0, (byte)-124, n12, n14, n13, n12);
                        }
                        if (this.b(arg3, n14 - 1, 4, n13) <= 0 || da.N[this.b(arg3, n14 - 1, 4, n13) - 1] != 4) continue;
                        n12 = qa.K[this.b(arg3, n14 - 1, 4, n13) - 1];
                        n11 = ca2.e(n14 * 128, 128 * n13, -this.g(2, n13, n14), -123);
                        n10 = ca2.e((n14 + 1) * 128, 128 * n13, -this.g(2, n13, 1 + n14), 106);
                        n9 = ca2.e(128 + 128 * n14, n13 * 128 + 128, -this.g(2, 1 + n13, 1 + n14), 56);
                        n8 = ca2.e(n14 * 128, 128 * (1 + n13), -this.g(2, n13 + 1, n14), 119);
                        nArray = new int[]{n11, n10, n9, n8};
                        n20 = ca2.a(4, nArray, n12, 12345678, false);
                        this.q[n20] = n14;
                        this.E[n20] = n13;
                        ca2.E[n20] = n20 + 200000;
                        this.a(0, (byte)-127, n12, n14, n13, n12);
                    }
                }
                ca2.a(-50, 40, -10, -50, true, 48, 105);
                this.F = this.kb.a(0, 8, 1536, 112, 64, 233, 1536, false, 0);
                for (n14 = 0; n14 < 64; ++n14) {
                    this.c.a(this.F[n14], (byte)118);
                }
                for (n14 = 0; n14 < 96; ++n14) {
                    for (n13 = 0; n13 < 96; ++n13) {
                        this.ab[n14][n13] = this.g(2, n13, n14);
                    }
                }
            }
            this.kb.c(1);
            int n21 = 0x606060;
            for (n14 = 0; n14 < 95; ++n14) {
                for (n13 = 0; n13 < 95; ++n13) {
                    n12 = this.a(n14, (byte)-124, n13);
                    if (n12 > 0 && (lb.Tb[n12 - 1] == 0 || this.H)) {
                        this.a(n12 - 1, this.kb, 1 + n14, n13, n14, -14584, n13);
                        if (arg2 && u.a[n12 - 1] != 0) {
                            this.bb[n14][n13] = d.a(this.bb[n14][n13], 1);
                            if (n13 > 0) {
                                this.a(4, n13 - 1, (byte)-125, n14);
                            }
                        }
                        if (arg2) {
                            this.U.b(3, n21, n14 * 3, n13 * 3, (byte)-109);
                        }
                    }
                    if ((n12 = this.e(95, n14, n13)) > 0 && (lb.Tb[n12 - 1] == 0 || this.H)) {
                        this.a(n12 - 1, this.kb, n14, n13, n14, -14584, 1 + n13);
                        if (arg2 && u.a[n12 - 1] != 0) {
                            this.bb[n14][n13] = d.a(this.bb[n14][n13], 2);
                            if (n14 > 0) {
                                this.a(8, n13, (byte)-72, n14 - 1);
                            }
                        }
                        if (arg2) {
                            this.U.b(n14 * 3, 3 * n13, n21, 3, 0);
                        }
                    }
                    if ((n12 = this.c(n14, n13, -49)) > 0 && n12 < 12000 && (lb.Tb[n12 - 1] == 0 || this.H)) {
                        this.a(n12 - 1, this.kb, n14 + 1, n13, n14, -14584, 1 + n13);
                        if (arg2 && u.a[n12 - 1] != 0) {
                            this.bb[n14][n13] = d.a(this.bb[n14][n13], 32);
                        }
                        if (arg2) {
                            this.U.a(3 * n13, n14 * 3, 82, n21);
                            this.U.a(1 + 3 * n13, 1 + n14 * 3, 69, n21);
                            this.U.a(2 + 3 * n13, n14 * 3 + 2, 65, n21);
                        }
                    }
                    if (n12 <= 12000 || n12 >= 24000 || lb.Tb[n12 - 12001] != 0 && !this.H) continue;
                    this.a(n12 - 12001, this.kb, n14, n13, n14 + 1, -14584, 1 + n13);
                    if (arg2 && u.a[n12 - 12001] != 0) {
                        this.bb[n14][n13] = d.a(this.bb[n14][n13], 16);
                    }
                    if (!arg2) continue;
                    this.U.a(3 * n13, 2 + 3 * n14, 116, n21);
                    this.U.a(n13 * 3 + 1, n14 * 3 + 1, 99, n21);
                    this.U.a(2 + 3 * n13, n14 * 3, 90, n21);
                }
            }
            if (arg2) {
                this.U.b(285, 0, 0, -27966, this.x - 1, 285);
            }
            this.kb.a(-50, 60, -10, -50, false, 24, 122);
            this.g[arg3] = this.kb.a(0, 8, 1536, -120, 64, 338, 1536, true, 0);
            for (n14 = 0; n14 < 64; ++n14) {
                this.c.a(this.g[arg3][n14], (byte)118);
            }
            for (n14 = 0; n14 < 95; ++n14) {
                for (n13 = 0; n13 < 95; ++n13) {
                    n12 = this.a(n14, (byte)-111, n13);
                    if (n12 > 0) {
                        this.a(n12 - 1, n14 + 1, n13, n13, (byte)-50, n14);
                    }
                    if ((n12 = this.e(61, n14, n13)) > 0) {
                        this.a(n12 - 1, n14, n13, n13 + 1, (byte)-65, n14);
                    }
                    if ((n12 = this.c(n14, n13, -49)) > 0 && n12 < 12000) {
                        this.a(n12 - 1, n14 + 1, n13, n13 + 1, (byte)-118, n14);
                    }
                    if (n12 <= 12000 || n12 >= 24000) continue;
                    this.a(n12 - 12001, n14, n13, n13 + 1, (byte)82, n14 + 1);
                }
            }
            for (n14 = 1; n14 < 95; ++n14) {
                for (n13 = 1; n13 < 95; ++n13) {
                    n12 = this.d(n13, n14, 115);
                    if (n12 <= 0) continue;
                    n11 = n14;
                    n10 = n13;
                    n9 = n14 + 1;
                    n8 = n13;
                    int n22 = 1 + n14;
                    int n23 = n13 + 1;
                    int n24 = n14;
                    n7 = 1 + n13;
                    n6 = 0;
                    n5 = this.ab[n11][n10];
                    n4 = this.ab[n9][n8];
                    n3 = this.ab[n22][n23];
                    if (n4 > 80000) {
                        n4 -= 80000;
                    }
                    if (n5 > 80000) {
                        n5 -= 80000;
                    }
                    n2 = this.ab[n24][n7];
                    if (n3 > 80000) {
                        n3 -= 80000;
                    }
                    if (n2 > 80000) {
                        n2 -= 80000;
                    }
                    if (n5 > n6) {
                        n6 = n5;
                    }
                    if (n4 > n6) {
                        n6 = n4;
                    }
                    if (n3 > n6) {
                        n6 = n3;
                    }
                    if (n2 > n6) {
                        n6 = n2;
                    }
                    if (n6 >= 80000) {
                        n6 -= 80000;
                    }
                    if (n5 < 80000) {
                        this.ab[n11][n10] = n6;
                    } else {
                        int[] nArray = this.ab[n11];
                        int n25 = n10;
                        nArray[n25] = nArray[n25] - 80000;
                    }
                    if (n4 < 80000) {
                        this.ab[n9][n8] = n6;
                    } else {
                        int[] nArray = this.ab[n9];
                        int n26 = n8;
                        nArray[n26] = nArray[n26] - 80000;
                    }
                    if (n3 < 80000) {
                        this.ab[n22][n23] = n6;
                    } else {
                        int[] nArray = this.ab[n22];
                        int n27 = n23;
                        nArray[n27] = nArray[n27] - 80000;
                    }
                    if (n2 < 80000) {
                        this.ab[n24][n7] = n6;
                        continue;
                    }
                    int[] nArray = this.ab[n24];
                    int n28 = n7;
                    nArray[n28] = nArray[n28] - 80000;
                }
            }
            this.kb.c(1);
            for (n14 = 1; n14 < 95; ++n14) {
                for (n13 = 1; n13 < 95; ++n13) {
                    int[] nArray;
                    n12 = this.d(n13, n14, 126);
                    if (n12 <= 0) continue;
                    n11 = n14;
                    n10 = n13;
                    n9 = n14 + 1;
                    n8 = n13;
                    int n29 = n14 + 1;
                    int n30 = 1 + n13;
                    int n31 = n14;
                    n7 = n13 + 1;
                    n6 = 128 * n14;
                    n5 = n13 * 128;
                    n4 = 128 + n6;
                    n3 = 128 + n5;
                    n2 = n6;
                    int n32 = n5;
                    int n33 = n4;
                    int n34 = n3;
                    int n35 = this.ab[n11][n10];
                    int n36 = this.ab[n9][n8];
                    int n37 = this.ab[n29][n30];
                    int n38 = this.ab[n31][n7];
                    int n39 = i.g[n12 - 1];
                    if (this.a(false, n11, n10) && n35 < 80000) {
                        this.ab[n11][n10] = n35 += n39 + 80000;
                    }
                    if (this.a(false, n9, n8) && n36 < 80000) {
                        this.ab[n9][n8] = n36 += n39 + 80000;
                    }
                    if (this.a(false, n29, n30) && n37 < 80000) {
                        this.ab[n29][n30] = n37 += 80000 + n39;
                    }
                    if (n36 >= 80000) {
                        n36 -= 80000;
                    }
                    if (n37 >= 80000) {
                        n37 -= 80000;
                    }
                    if (this.a(false, n31, n7) && n38 < 80000) {
                        this.ab[n31][n7] = n38 += n39 + 80000;
                    }
                    if (n35 >= 80000) {
                        n35 -= 80000;
                    }
                    if (n38 >= 80000) {
                        n38 -= 80000;
                    }
                    int n40 = 16;
                    if (!this.a(n11 - 1, 26431, n10)) {
                        n6 -= n40;
                    }
                    if (!this.a(n11 + 1, 26431, n10)) {
                        n6 += n40;
                    }
                    if (!this.a(n11, 26431, n10 - 1)) {
                        n5 -= n40;
                    }
                    if (!this.a(n11, 26431, 1 + n10)) {
                        n5 += n40;
                    }
                    if (!this.a(n9 - 1, 26431, n8)) {
                        n4 -= n40;
                    }
                    if (!this.a(n9 + 1, 26431, n8)) {
                        n4 += n40;
                    }
                    if (!this.a(n9, 26431, n8 - 1)) {
                        n32 -= n40;
                    }
                    if (!this.a(n9, 26431, n8 + 1)) {
                        n32 += n40;
                    }
                    if (!this.a(n29 - 1, 26431, n30)) {
                        n33 -= n40;
                    }
                    if (!this.a(1 + n29, 26431, n30)) {
                        n33 += n40;
                    }
                    if (!this.a(n29, 26431, n30 - 1)) {
                        n3 -= n40;
                    }
                    if (!this.a(n29, 26431, 1 + n30)) {
                        n3 += n40;
                    }
                    if (!this.a(n31 - 1, 26431, n7)) {
                        n2 -= n40;
                    }
                    if (!this.a(n31 + 1, 26431, n7)) {
                        n2 += n40;
                    }
                    if (!this.a(n31, 26431, n7 - 1)) {
                        n34 -= n40;
                    }
                    if (!this.a(n31, 26431, n7 + 1)) {
                        n34 += n40;
                    }
                    n36 = -n36;
                    n12 = d.g[n12 - 1];
                    n38 = -n38;
                    n37 = -n37;
                    n35 = -n35;
                    if (this.c(n14, n13, -49) <= 12000 || this.c(n14, n13, -49) >= 24000 || this.d(n13 - 1, n14 - 1, 120) != 0) {
                        if (this.c(n14, n13, -49) > 12000 && this.c(n14, n13, -49) < 24000 && this.d(n13 + 1, 1 + n14, 115) == 0) {
                            nArray = new int[]{this.kb.e(n6, n5, n35, -128), this.kb.e(n4, n32, n36, -122), this.kb.e(n2, n34, n38, 12)};
                            this.kb.a(3, nArray, n12, 12345678, false);
                            continue;
                        }
                        if (this.c(n14, n13, -49) <= 0 || this.c(n14, n13, -49) >= 12000 || this.d(n13 - 1, n14 + 1, 111) != 0) {
                            if (this.c(n14, n13, -49) <= 0 || this.c(n14, n13, -49) >= 12000 || this.d(1 + n13, n14 - 1, 103) != 0) {
                                if (n35 != n36 || n38 != n37) {
                                    if (n35 != n38 || n37 != n36) {
                                        int[] nArray3;
                                        int[] nArray4;
                                        boolean bl = true;
                                        if (this.d(n13 - 1, n14 - 1, 117) > 0) {
                                            bl = false;
                                        }
                                        if (this.d(n13 + 1, n14 + 1, 110) > 0) {
                                            bl = false;
                                        }
                                        if (!bl) {
                                            nArray4 = new int[]{this.kb.e(n4, n32, n36, -114), this.kb.e(n33, n3, n37, 101), this.kb.e(n6, n5, n35, -126)};
                                            this.kb.a(3, nArray4, n12, 12345678, false);
                                            nArray3 = new int[]{this.kb.e(n2, n34, n38, -107), this.kb.e(n6, n5, n35, 63), this.kb.e(n33, n3, n37, 44)};
                                            this.kb.a(3, nArray3, n12, 12345678, false);
                                            continue;
                                        }
                                        nArray4 = new int[]{this.kb.e(n6, n5, n35, -112), this.kb.e(n4, n32, n36, -118), this.kb.e(n2, n34, n38, 103)};
                                        this.kb.a(3, nArray4, n12, 12345678, false);
                                        nArray3 = new int[]{this.kb.e(n33, n3, n37, -128), this.kb.e(n2, n34, n38, -119), this.kb.e(n4, n32, n36, 52)};
                                        this.kb.a(3, nArray3, n12, 12345678, false);
                                        continue;
                                    }
                                    nArray = new int[]{this.kb.e(n2, n34, n38, -104), this.kb.e(n6, n5, n35, 23), this.kb.e(n4, n32, n36, 91), this.kb.e(n33, n3, n37, 13)};
                                    this.kb.a(4, nArray, n12, 12345678, false);
                                    continue;
                                }
                                nArray = new int[]{this.kb.e(n6, n5, n35, 78), this.kb.e(n4, n32, n36, 46), this.kb.e(n33, n3, n37, -113), this.kb.e(n2, n34, n38, -125)};
                                this.kb.a(4, nArray, n12, 12345678, false);
                                continue;
                            }
                            nArray = new int[]{this.kb.e(n4, n32, n36, 121), this.kb.e(n33, n3, n37, 39), this.kb.e(n6, n5, n35, 73)};
                            this.kb.a(3, nArray, n12, 12345678, false);
                            continue;
                        }
                        nArray = new int[]{this.kb.e(n2, n34, n38, -107), this.kb.e(n6, n5, n35, -122), this.kb.e(n33, n3, n37, 35)};
                        this.kb.a(3, nArray, n12, 12345678, false);
                        continue;
                    }
                    nArray = new int[]{this.kb.e(n33, n3, n37, -120), this.kb.e(n2, n34, n38, -116), this.kb.e(n4, n32, n36, 117)};
                    this.kb.a(3, nArray, n12, 12345678, false);
                }
            }
            this.kb.a(-50, 50, -10, -50, true, 50, -98);
            this.db[arg3] = this.kb.a(0, 8, 1536, -112, 64, 169, 1536, true, 0);
            for (n14 = 0; n14 < 64; ++n14) {
                this.c.a(this.db[arg3][n14], (byte)118);
            }
            if (this.db[arg3][0] == null) {
                throw new RuntimeException("null roof!");
            }
            for (n14 = 0; n14 < 96; ++n14) {
                for (n13 = 0; n13 < 96; ++n13) {
                    if (this.ab[n14][n13] < 80000) continue;
                    int[] nArray = this.ab[n14];
                    int n41 = n13;
                    nArray[n41] = nArray[n41] - 80000;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            throw i.a(runtimeException, "k.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    private final int d(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= 96 || arg0 < 0 || arg0 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg2 < 99) {
            this.E = null;
        }
        if (arg1 >= 48 && arg0 < 48) {
            n2 = 1;
            arg1 -= 48;
        } else if (arg1 < 48 && arg0 >= 48) {
            n2 = 2;
            arg0 -= 48;
        } else if (arg1 >= 48 && arg0 >= 48) {
            n2 = 3;
            arg1 -= 48;
            arg0 -= 48;
        }
        return this.A[n2][arg0 + arg1 * 48];
    }

    private final void b(int arg0, byte arg1, int arg2, int arg3) {
        block3: {
            int n2 = arg2 / 12;
            int n3 = arg3 / 12;
            int n4 = (arg2 - 1) / 12;
            int n5 = (arg3 - 1) / 12;
            this.a(arg3, arg0, n3, 2, n2, arg2);
            if (n4 != n2) {
                this.a(arg3, arg0, n3, 2, n4, arg2);
            }
            if (n5 != n3) {
                this.a(arg3, arg0, n5, 2, n2, arg2);
            }
            if (n4 != n2 && n5 != n3) {
                this.a(arg3, arg0, n5, 2, n4, arg2);
            }
            if (arg1 > 23) break block3;
            this.c(122, -121, -56, -127, -62);
        }
    }

    private final int d(int arg0, int arg1, int arg2, int arg3) {
        int n2;
        if (arg2 != 15282) {
            this.m = null;
        }
        if ((n2 = this.b(arg0, arg3, arg2 - 15278, arg1)) == 0) {
            return -1;
        }
        int n3 = da.N[n2 - 1];
        if (n3 != 2) {
            return 0;
        }
        return 1;
    }

    private final void c(int arg0, int arg1, int arg2, int arg3) {
        this.bb[arg2][arg0] = ib.a(this.bb[arg2][arg0], arg1 - arg3);
    }

    private final void a(int arg0, int arg1, byte arg2, int arg3) {
        block0: {
            this.bb[arg3][arg1] = d.a(this.bb[arg3][arg1], arg0);
            if (arg2 < -47) break block0;
            this.eb = null;
        }
    }

    final void a(ca[] arg0, byte arg1) {
        block11: {
            for (int i2 = 0; i2 < 94; ++i2) {
                for (int i3 = 0; i3 < 94; ++i3) {
                    int n2;
                    int n3;
                    if (this.c(i2, i3, -49) <= 48000 || this.c(i2, i3, -49) >= 60000) continue;
                    int n4 = this.c(i2, i3, -49) - 48001;
                    int n5 = this.b(i2, i3, -91);
                    if (n5 != 0 && n5 != 4) {
                        n3 = ub.g[n4];
                        n2 = f.f[n4];
                    } else {
                        n2 = ub.g[n4];
                        n3 = f.f[n4];
                    }
                    this.a(i2, n4, false, i3);
                    ca ca2 = arg0[fb.f[n4]].a(false, -120, false, false, true);
                    int n6 = 128 * (n3 + i2 + i2) / 2;
                    int n7 = (n2 + i3 + i3) * 128 / 2;
                    ca2.a(n6, n7, -this.f(n6, n7, 74), true);
                    ca2.g(0, -999999, 0, this.b(i2, i3, -78) * 32);
                    this.c.a(ca2, (byte)118);
                    ca2.a(48, 48, -10, arg1 ^ 9, -50, -50);
                    if (n3 <= 1 && n2 <= 1) continue;
                    for (int i4 = i2; i2 + n3 > i4; ++i4) {
                        for (int i5 = i3; n2 + i3 > i5; ++i5) {
                            if (i2 >= i4 && i5 <= i3 || n4 != this.c(i4, i5, arg1 + 64) - 48001) continue;
                            n7 = i5;
                            n6 = i4;
                            int n8 = 0;
                            if (n6 < 48 || n7 >= 48) {
                                if (n6 >= 48 || n7 < 48) {
                                    if (n6 >= 48 && n7 >= 48) {
                                        n8 = 3;
                                        n7 -= 48;
                                        n6 -= 48;
                                    }
                                } else {
                                    n8 = 2;
                                    n7 -= 48;
                                }
                            } else {
                                n6 -= 48;
                                n8 = 1;
                            }
                            this.s[n8][n6 * 48 + n7] = 0;
                        }
                    }
                }
            }
            if (arg1 == -113) break block11;
            this.b(-116, 16, 84);
        }
    }

    private final int g(int arg0, int arg1, int arg2) {
        if (arg2 < 0 || arg2 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg0 != 2) {
            return 79;
        }
        if (arg2 >= 48 && arg1 < 48) {
            n2 = 1;
            arg2 -= 48;
        } else if (arg2 < 48 && arg1 >= 48) {
            arg1 -= 48;
            n2 = 2;
        } else if (arg2 >= 48 && arg1 >= 48) {
            n2 = 3;
            arg1 -= 48;
            arg2 -= 48;
        }
        return (0xFF & this.L[n2][48 * arg2 - -arg1]) * 3;
    }

    final void a(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        block11: {
            if (arg3 < 0 || arg2 < 0 || arg3 >= 95 || arg2 >= 95) {
                return;
            }
            if (u.a[arg4] == 1) {
                if (arg1 == 0) {
                    this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65534);
                    if (arg2 > 0) {
                        this.c(arg2 - 1, 65535, arg3, 4);
                    }
                } else if (arg1 == 1) {
                    this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65533);
                    if (arg3 > 0) {
                        this.c(arg2, 65535, arg3 - 1, 8);
                    }
                } else if (arg1 == 2) {
                    this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65519);
                } else if (arg1 == 3) {
                    this.bb[arg3][arg2] = ib.a(this.bb[arg3][arg2], 65503);
                }
                this.c(1, 1, -59, arg3, arg2);
            }
            if (arg0) break block11;
            this.U = null;
        }
    }

    final void a(int arg0, byte arg1, int arg2, int arg3) {
        block1: {
            this.b(arg1 ^ 0x2791);
            int n2 = (24 + arg0) / 48;
            if (arg1 != -90) {
                this.c(58, -126, -4);
            }
            this.a(arg0, 122, true, arg3, arg2);
            int n3 = (24 + arg2) / 48;
            if (arg3 != 0) break block1;
            this.a(arg0, 112, false, 1, arg2);
            this.a(arg0, arg1 ^ 0xFFFFFFE3, false, 2, arg2);
            this.b(arg3, 0, n2 - 1, 0, n3 - 1);
            this.b(arg3, 1, n2, arg1 + 90, n3 - 1);
            this.b(arg3, 2, n2 - 1, 0, n3);
            this.b(arg3, 3, n2, arg1 + 90, n3);
            this.a(0);
        }
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        block1: {
            int n2 = ib.d[arg0];
            if (this.ab[arg5][arg2] < 80000) {
                int[] nArray = this.ab[arg5];
                int n3 = arg2;
                nArray[n3] = nArray[n3] + (n2 + 80000);
            }
            if (this.ab[arg1][arg3] >= 80000) break block1;
            int[] nArray = this.ab[arg1];
            int n4 = arg3;
            nArray[n4] = nArray[n4] + (n2 + 80000);
        }
    }

    final int a(int[] arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int n2;
        int n3;
        int n4;
        for (n4 = 0; n4 < 96; ++n4) {
            for (n3 = 0; n3 < 96; ++n3) {
                this.B[n4][n3] = 0;
            }
        }
        n4 = 0;
        n3 = 0;
        int n5 = arg5;
        int n6 = arg6;
        this.B[arg5][arg6] = 99;
        arg0[n4] = arg5;
        arg4[n4++] = arg6;
        int n7 = arg0.length;
        boolean bl = false;
        while (n4 != n3) {
            n5 = arg0[n3];
            n6 = arg4[n3];
            n3 = (1 + n3) % n7;
            if (arg1 <= n5 && arg7 >= n5 && arg8 <= n6 && n6 <= arg3) {
                bl = true;
                break;
            }
            if (arg9) {
                if (n5 > 0 && arg1 <= n5 - 1 && n5 - 1 <= arg7 && arg8 <= n6 && arg3 >= n6 && (this.bb[n5 - 1][n6] & 8) == 0) {
                    bl = true;
                    break;
                }
                if (n5 < 95 && arg1 <= 1 + n5 && n5 + 1 <= arg7 && arg8 <= n6 && n6 <= arg3 && (2 & this.bb[n5 + 1][n6]) == 0) {
                    bl = true;
                    break;
                }
                if (n6 > 0 && n5 >= arg1 && arg7 >= n5 && arg8 <= n6 - 1 && n6 - 1 <= arg3 && (4 & this.bb[n5][n6 - 1]) == 0) {
                    bl = true;
                    break;
                }
                if (n6 < 95 && n5 >= arg1 && n5 <= arg7 && n6 + 1 >= arg8 && n6 + 1 <= arg3 && (1 & this.bb[n5][n6 + 1]) == 0) {
                    bl = true;
                    break;
                }
            }
            if (n5 > 0 && this.B[n5 - 1][n6] == 0 && (this.bb[n5 - 1][n6] & 0x78) == 0) {
                arg0[n4] = n5 - 1;
                arg4[n4] = n6;
                this.B[n5 - 1][n6] = 2;
                n4 = (n4 + 1) % n7;
            }
            if (n5 < 95 && this.B[1 + n5][n6] == 0 && (this.bb[1 + n5][n6] & 0x72) == 0) {
                arg0[n4] = 1 + n5;
                arg4[n4] = n6;
                this.B[n5 + 1][n6] = 8;
                n4 = (1 + n4) % n7;
            }
            if (n6 > 0 && this.B[n5][n6 - 1] == 0 && (0x74 & this.bb[n5][n6 - 1]) == 0) {
                arg0[n4] = n5;
                arg4[n4] = n6 - 1;
                this.B[n5][n6 - 1] = 1;
                n4 = (n4 + 1) % n7;
            }
            if (n6 < 95 && this.B[n5][1 + n6] == 0 && (0x71 & this.bb[n5][1 + n6]) == 0) {
                arg0[n4] = n5;
                arg4[n4] = n6 + 1;
                this.B[n5][n6 + 1] = 4;
                n4 = (n4 + 1) % n7;
            }
            if (n5 > 0 && n6 > 0 && (0x74 & this.bb[n5][n6 - 1]) == 0 && (0x78 & this.bb[n5 - 1][n6]) == 0 && (0x7C & this.bb[n5 - 1][n6 - 1]) == 0 && this.B[n5 - 1][n6 - 1] == 0) {
                arg0[n4] = n5 - 1;
                arg4[n4] = n6 - 1;
                this.B[n5 - 1][n6 - 1] = 3;
                n4 = (1 + n4) % n7;
            }
            if (n5 < 95 && n6 > 0 && (this.bb[n5][n6 - 1] & 0x74) == 0 && (this.bb[1 + n5][n6] & 0x72) == 0 && (this.bb[n5 + 1][n6 - 1] & 0x76) == 0 && this.B[1 + n5][n6 - 1] == 0) {
                arg0[n4] = 1 + n5;
                arg4[n4] = n6 - 1;
                this.B[n5 + 1][n6 - 1] = 9;
                n4 = (1 + n4) % n7;
            }
            if (n5 > 0 && n6 < 95 && (this.bb[n5][1 + n6] & 0x71) == 0 && (this.bb[n5 - 1][n6] & 0x78) == 0 && (this.bb[n5 - 1][1 + n6] & 0x79) == 0 && this.B[n5 - 1][1 + n6] == 0) {
                arg0[n4] = n5 - 1;
                arg4[n4] = 1 + n6;
                n4 = (1 + n4) % n7;
                this.B[n5 - 1][n6 + 1] = 6;
            }
            if (n5 >= 95 || n6 >= 95 || (0x71 & this.bb[n5][1 + n6]) != 0 || (this.bb[n5 + 1][n6] & 0x72) != 0 || (0x73 & this.bb[n5 + 1][1 + n6]) != 0 || this.B[n5 + 1][1 + n6] != 0) continue;
            arg0[n4] = 1 + n5;
            arg4[n4] = 1 + n6;
            this.B[1 + n5][1 + n6] = 12;
            n4 = (n4 + 1) % n7;
        }
        if (arg2 > -48) {
            return -42;
        }
        if (!bl) {
            return -1;
        }
        n3 = 0;
        arg0[n3] = n5;
        arg4[n3++] = n6;
        int n8 = n2 = this.B[n5][n6];
        while (arg5 != n5 || arg6 != n6) {
            if (n2 != n8) {
                n2 = n8;
                arg0[n3] = n5;
                arg4[n3++] = n6;
            }
            if ((n8 & 1) == 0) {
                if ((4 & n8) != 0) {
                    --n6;
                }
            } else {
                ++n6;
            }
            if ((2 & n8) == 0) {
                if ((n8 & 8) != 0) {
                    --n5;
                }
            } else {
                ++n5;
            }
            n8 = this.B[n5][n6];
        }
        return n3;
    }

    final int f(int arg0, int arg1, int arg2) {
        int n2;
        int n3;
        int n4;
        int n5 = arg0 >> 7;
        int n6 = arg1 >> 7;
        int n7 = 0x7F & arg0;
        int n8 = 0x7F & arg1;
        if (n5 < 0 || n6 < 0 || n5 >= 95 || n6 >= 95) {
            return 0;
        }
        if (n7 <= 128 + -n8) {
            n4 = this.g(2, n6, n5);
            n3 = this.g(2, n6, 1 + n5) + -n4;
            n2 = -n4 + this.g(2, 1 + n6, n5);
        } else {
            n4 = this.g(2, n6 + 1, 1 + n5);
            n3 = -n4 + this.g(2, n6 + 1, n5);
            n2 = -n4 + this.g(2, n6, 1 + n5);
            n7 = -n7 + 128;
            n8 = 128 + -n8;
        }
        int n9 = n2 * n8 / 128 + (n4 - -(n3 * n7 / 128));
        return n9;
    }

    private final void c(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 1 || arg4 < 1 || arg0 + arg3 >= 96 || arg1 + arg4 >= 96) {
            return;
        }
        for (int i2 = arg3; i2 <= arg0 + arg3; ++i2) {
            for (int i3 = arg4; i3 <= arg4 - -arg1; ++i3) {
                if ((0x63 & this.b((byte)-38, i3, i2)) == 0 && (0x59 & this.b((byte)-38, i3, i2 - 1)) == 0 && (this.b((byte)-38, i3 - 1, i2) & 0x56) == 0 && (this.b((byte)-38, i3 - 1, i2 - 1) & 0x6C) == 0) {
                    this.b(0, (byte)118, i2, i3);
                    continue;
                }
                this.b(35, (byte)50, i2, i3);
            }
        }
    }

    private final int a(byte arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= 96 || arg2 < 0 || arg2 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg0 != 104) {
            return -59;
        }
        if (arg1 >= 48 && arg2 < 48) {
            arg1 -= 48;
            n2 = 1;
        } else if (arg1 < 48 && arg2 >= 48) {
            n2 = 2;
            arg2 -= 48;
        } else if (arg1 >= 48 && arg2 >= 48) {
            arg1 -= 48;
            n2 = 3;
            arg2 -= 48;
        }
        return this.eb[n2][arg2 + 48 * arg1] & 0xFF;
    }

    private final boolean a(int arg0, int arg1, int arg2) {
        if (arg1 != 26431) {
            return false;
        }
        return this.d(arg2, arg0, 119) > 0 || this.d(arg2, arg0 - 1, 110) > 0 || this.d(arg2 - 1, arg0 - 1, 109) > 0 || this.d(arg2 - 1, arg0, arg1 - 26318) > 0;
        {
        }
    }

    private final int d(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -8509) {
            return 58;
        }
        int n2 = this.b(arg3, arg1, arg0 + 8513, arg4);
        if (n2 == 0) {
            return arg2;
        }
        return qa.K[n2 - 1];
    }

    private final int c(int arg0, int arg1, int arg2) {
        if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (~arg0 > arg2 || arg1 >= 48) {
            if (arg0 >= 48 || arg1 < 48) {
                if (arg0 >= 48 && arg1 >= 48) {
                    arg1 -= 48;
                    n2 = 3;
                    arg0 -= 48;
                }
            } else {
                n2 = 2;
                arg1 -= 48;
            }
        } else {
            arg0 -= 48;
            n2 = 1;
        }
        return this.s[n2][arg0 * 48 + arg1];
    }

    private final void b(int arg0, int arg1, int arg2, int arg3, int arg4) {
        block46: {
            if (arg3 != 0) {
                return;
            }
            String string = "m" + arg0 + arg2 / 10 + arg2 % 10 + arg4 / 10 + arg4 % 10;
            try {
                int n2;
                if (this.Q != null) {
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    byte[] byArray = na.a(string + ".hei", 0, this.Q, -126);
                    if (byArray == null && this.I != null) {
                        byArray = na.a(string + ".hei", 0, this.I, -125);
                    }
                    if (byArray != null && byArray.length > 0) {
                        n7 = 0;
                        n6 = 0;
                        n5 = 0;
                        while (n5 < 2304) {
                            if ((n4 = byArray[n7++] & 0xFF) < 128) {
                                n6 = n4;
                                this.L[arg1][n5++] = (byte)n4;
                            }
                            if (n4 < 128) continue;
                            for (n3 = 0; n4 - 128 > n3; ++n3) {
                                this.L[arg1][n5++] = (byte)n6;
                            }
                        }
                        n6 = 64;
                        for (n5 = 0; n5 < 48; ++n5) {
                            for (n4 = 0; n4 < 48; ++n4) {
                                n6 = 0x7F & n6 + this.L[arg1][n4 * 48 - -n5];
                                this.L[arg1][n5 + n4 * 48] = (byte)(n6 * 2);
                            }
                        }
                        n6 = 0;
                        n5 = 0;
                        while (n5 < 2304) {
                            if ((n4 = 0xFF & byArray[n7++]) < 128) {
                                n6 = n4;
                                this.eb[arg1][n5++] = (byte)n4;
                            }
                            if (n4 < 128) continue;
                            for (n3 = 0; n3 < n4 - 128; ++n3) {
                                this.eb[arg1][n5++] = (byte)n6;
                            }
                        }
                        n6 = 35;
                        for (n5 = 0; n5 < 48; ++n5) {
                            for (n4 = 0; n4 < 48; ++n4) {
                                n6 = 0x7F & n6 + this.eb[arg1][n5 + 48 * n4];
                                this.eb[arg1][n5 + 48 * n4] = (byte)(2 * n6);
                            }
                        }
                    } else {
                        for (n7 = 0; n7 < 2304; ++n7) {
                            this.L[arg1][n7] = 0;
                            this.eb[arg1][n7] = 0;
                        }
                    }
                    if ((byArray = na.a(string + ".dat", 0, this.gb, -125)) == null && this.m != null) {
                        byArray = na.a(string + ".dat", 0, this.m, arg3 ^ 0xFFFFFF83);
                    }
                    if (byArray == null || byArray.length == 0) {
                        throw new IOException();
                    }
                    n7 = 0;
                    for (n6 = 0; n6 < 2304; ++n6) {
                        this.f[arg1][n6] = byArray[n7++];
                    }
                    for (n6 = 0; n6 < 2304; ++n6) {
                        this.P[arg1][n6] = byArray[n7++];
                    }
                    for (n6 = 0; n6 < 2304; ++n6) {
                        this.s[arg1][n6] = ib.a(255, byArray[n7++]);
                    }
                    for (n6 = 0; n6 < 2304; ++n6) {
                        if ((n5 = 0xFF & byArray[n7++]) <= 0) continue;
                        this.s[arg1][n6] = n5 + 12000;
                    }
                    n6 = 0;
                    while (n6 < 2304) {
                        if ((n5 = byArray[n7++] & 0xFF) < 128) {
                            this.A[arg1][n6++] = (byte)n5;
                            continue;
                        }
                        for (n4 = 0; n5 - 128 > n4; ++n4) {
                            this.A[arg1][n6++] = 0;
                        }
                    }
                    n6 = 0;
                    n5 = 0;
                    while (n5 < 2304) {
                        if ((n4 = byArray[n7++] & 0xFF) < 128) {
                            this.R[arg1][n5++] = (byte)n4;
                            n6 = n4;
                            continue;
                        }
                        for (n3 = 0; n4 - 128 > n3; ++n3) {
                            this.R[arg1][n5++] = (byte)n6;
                        }
                    }
                    n5 = 0;
                    while (n5 < 2304) {
                        if ((n4 = 0xFF & byArray[n7++]) < 128) {
                            this.mb[arg1][n5++] = (byte)n4;
                            continue;
                        }
                        for (n3 = 0; n3 < n4 - 128; ++n3) {
                            this.mb[arg1][n5++] = 0;
                        }
                    }
                    byArray = na.a(string + ".loc", 0, this.gb, -127);
                    if (byArray == null || byArray.length <= 0) break block46;
                    n7 = 0;
                    n5 = 0;
                    while (n5 < 2304) {
                        if ((n4 = byArray[n7++] & 0xFF) < 128) {
                            this.s[arg1][n5++] = 48000 + n4;
                            continue;
                        }
                        n5 += n4 - 128;
                    }
                    break block46;
                }
                byte[] byArray = new byte[20736];
                ta.a("../gamedata/maps/" + string + ".jm", arg3 ^ 0xFFFFB325, byArray, 20736);
                int n8 = 0;
                int n9 = 0;
                for (n2 = 0; n2 < 2304; ++n2) {
                    n8 = 0xFF & n8 - -byArray[n9++];
                    this.L[arg1][n2] = (byte)n8;
                }
                n8 = 0;
                for (n2 = 0; n2 < 2304; ++n2) {
                    n8 = 0xFF & n8 + byArray[n9++];
                    this.eb[arg1][n2] = (byte)n8;
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.f[arg1][n2] = byArray[n9++];
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.P[arg1][n2] = byArray[n9++];
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.s[arg1][n2] = ib.a(255, byArray[1 + n9]) + ib.a(byArray[n9], 255) * 256;
                    n9 += 2;
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.A[arg1][n2] = byArray[n9++];
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.R[arg1][n2] = byArray[n9++];
                }
                for (n2 = 0; n2 < 2304; ++n2) {
                    this.mb[arg1][n2] = byArray[n9++];
                }
            }
            catch (IOException iOException) {
                for (int i2 = 0; i2 < 2304; ++i2) {
                    this.L[arg1][i2] = 0;
                    this.eb[arg1][i2] = 0;
                    this.f[arg1][i2] = 0;
                    this.P[arg1][i2] = 0;
                    this.s[arg1][i2] = 0;
                    this.A[arg1][i2] = 0;
                    this.R[arg1][i2] = 0;
                    if (arg0 == 0) {
                        this.R[arg1][i2] = -6;
                    }
                    if (arg0 == 3) {
                        this.R[arg1][i2] = 8;
                    }
                    this.mb[arg1][i2] = 0;
                }
            }
        }
    }

    final int b(int arg0, int arg1, int arg2) {
        if (arg0 < 0 || arg0 >= 96 || arg1 < 0 || arg1 >= 96) {
            return 0;
        }
        if (arg2 > -68) {
            return -68;
        }
        int n2 = 0;
        if (arg0 < 48 || arg1 >= 48) {
            if (arg0 >= 48 || arg1 < 48) {
                if (arg0 >= 48 && arg1 >= 48) {
                    arg0 -= 48;
                    arg1 -= 48;
                    n2 = 3;
                }
            } else {
                arg1 -= 48;
                n2 = 2;
            }
        } else {
            arg0 -= 48;
            n2 = 1;
        }
        return this.mb[n2][arg1 + arg0 * 48];
    }

    private final void a(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        block1: {
            int n2;
            int n3;
            int n4;
            int n5;
            block0: {
                n5 = arg3 * 3;
                n4 = arg4 * 3;
                n3 = this.c.a(arg5, true);
                n3 = n3 >> 1 & 0x7F7F7F;
                n2 = this.c.a(arg2, true);
                n2 = (0xFEFEFF & n2) >> 1;
                if (arg0 != 0) break block0;
                this.U.b(3, n3, n5, n4, (byte)109);
                this.U.b(2, n3, n5, 1 + n4, (byte)-65);
                this.U.b(1, n3, n5, n4 + 2, (byte)99);
                this.U.b(1, n2, 2 + n5, n4 + 1, (byte)73);
                this.U.b(2, n2, n5 + 1, n4 + 2, (byte)113);
                break block1;
            }
            if (arg0 != 1) break block1;
            this.U.b(3, n2, n5, n4, (byte)55);
            this.U.b(2, n2, 1 + n5, 1 + n4, (byte)62);
            this.U.b(1, n2, n5 + 2, n4 + 2, (byte)56);
            this.U.b(1, n3, n5, n4 + 1, (byte)70);
            this.U.b(2, n3, n5, 2 + n4, (byte)-85);
        }
    }

    private final int b(byte arg0, int arg1, int arg2) {
        if (arg0 != -38) {
            this.B = null;
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= 96 || arg1 >= 96) {
            return 0;
        }
        return this.bb[arg2][arg1];
    }

    private final int b(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 || arg1 >= 96 || arg3 < 0 || arg3 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg1 < 48 || arg3 >= 48) {
            if (arg1 < 48 && arg3 >= 48) {
                arg3 -= 48;
                n2 = 2;
            } else if (arg1 >= 48 && arg3 >= 48) {
                arg3 -= 48;
                arg1 -= 48;
                n2 = 3;
            }
        } else {
            arg1 -= 48;
            n2 = 1;
        }
        if (arg2 != 4) {
            return -4;
        }
        return 0xFF & this.R[n2][48 * arg1 + arg3];
    }

    private final int a(int arg0, byte arg1, int arg2) {
        if (arg0 < 0 || arg0 >= 96 || arg2 < 0 || arg2 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg0 >= 48 && arg2 < 48) {
            arg0 -= 48;
            n2 = 1;
        } else if (arg0 < 48 && arg2 >= 48) {
            arg2 -= 48;
            n2 = 2;
        } else if (arg0 >= 48 && arg2 >= 48) {
            arg2 -= 48;
            arg0 -= 48;
            n2 = 3;
        }
        return 0xFF & this.P[n2][arg0 * 48 - -arg2];
    }

    private final void a(int arg0, ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.b(40, (byte)50, arg4, arg3);
        this.b(40, (byte)109, arg2, arg6);
        int n2 = ib.d[arg0];
        int n3 = v.a[arg0];
        if (arg5 != -14584) {
            this.a((byte)-62, 104, -113);
        }
        int n4 = client.Jk[arg0];
        int n5 = 128 * arg4;
        int n6 = 128 * arg3;
        int n7 = 128 * arg2;
        int n8 = arg6 * 128;
        int n9 = arg1.e(n5, n6, -this.ab[arg4][arg3], -111);
        int n10 = arg1.e(n5, n6, -this.ab[arg4][arg3] + -n2, -115);
        int n11 = arg1.e(n7, n8, -n2 + -this.ab[arg2][arg6], -125);
        int n12 = arg1.e(n7, n8, -this.ab[arg2][arg6], arg5 ^ 0xFFFFC757);
        int[] nArray = new int[]{n9, n10, n11, n12};
        int n13 = arg1.a(4, nArray, n3, n4, false);
        arg1.E[n13] = lb.Tb[arg0] == 5 ? 30000 + arg0 : 0;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4) {
        block11: {
            if (arg3 < 0 || arg0 < 0 || arg3 >= 95 || arg0 >= 95) {
                return;
            }
            if (arg4 != 11715) {
                this.s = null;
            }
            if (u.a[arg1] != 1) break block11;
            if (arg2 == 0) {
                this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 1);
                if (arg0 > 0) {
                    this.a(4, arg0 - 1, (byte)-96, arg3);
                }
            } else if (arg2 == 1) {
                this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 2);
                if (arg3 > 0) {
                    this.a(8, arg0, (byte)-89, arg3 - 1);
                }
            } else if (arg2 != 2) {
                if (arg2 == 3) {
                    this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 32);
                }
            } else {
                this.bb[arg3][arg0] = d.a(this.bb[arg3][arg0], 16);
            }
            this.c(1, 1, 62, arg3, arg0);
        }
    }

    private final boolean a(boolean arg0, int arg1, int arg2) {
        if (this.d(arg2, arg1, 114) > 0 && this.d(arg2, arg1 - 1, 122) > 0 && this.d(arg2 - 1, arg1 - 1, 117) > 0 && this.d(arg2 - 1, arg1, 122) > 0) {
            return true;
        }
        return arg0;
    }

    private final int e(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= 96 || arg2 < 0 || arg2 >= 96) {
            return 0;
        }
        int n2 = 0;
        if (arg1 < 48 || arg2 >= 48) {
            if (arg1 >= 48 || arg2 < 48) {
                if (arg1 >= 48 && arg2 >= 48) {
                    arg2 -= 48;
                    arg1 -= 48;
                    n2 = 3;
                }
            } else {
                n2 = 2;
                arg2 -= 48;
            }
        } else {
            arg1 -= 48;
            n2 = 1;
        }
        return 0xFF & this.f[n2][arg1 * 48 + arg2];
    }

    k(lb arg0, ua arg1) {
        int n2;
        this.P = new byte[4][2304];
        this.R = new byte[4][2304];
        this.w = new int[256];
        this.B = new int[96][96];
        this.f = new byte[4][2304];
        this.E = new int[18432];
        this.g = new ca[4][64];
        this.L = new byte[4][2304];
        this.F = new ca[64];
        this.s = new int[4][2304];
        this.A = new byte[4][2304];
        this.bb = new int[96][96];
        this.db = new ca[4][64];
        this.eb = new byte[4][2304];
        this.q = new int[18432];
        this.U = arg1;
        this.c = arg0;
        for (n2 = 0; n2 < 64; ++n2) {
            this.w[n2] = da.a(255 + -(n2 * 4), (byte)-66, -(4 * n2) + 255, 255 - (int)((double)n2 * 1.75));
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.w[64 + n2] = da.a(0, (byte)-66, 3 * n2, 144);
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.w[128 + n2] = da.a(0, (byte)-66, 192 - (int)((double)n2 * 1.5), -((int)((double)n2 * 1.5)) + 144);
        }
        for (n2 = 0; n2 < 64; ++n2) {
            this.w[192 + n2] = da.a(0, (byte)-66, 96 - (int)((double)n2 * 1.5), (int)((double)n2 * 1.5) + 48);
        }
    }

    static {
        e = 0L;
    }
}

