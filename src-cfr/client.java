/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public final class client
extends e {
    static int Pd;
    private int xd;
    private int fc;
    static int[] Jk;
    static long ze;
    private da Jh;
    private ja mg = new ja(5000);
    private static int[] Fj;
    static int ef;
    private String Dh;
    private int Eh;
    private int bc = -1;
    private int[] pf;
    private int Fi;
    private k Hh;
    private int Nc = 0;
    private int tg;
    private boolean Xh = false;
    private int ug = 128;
    private int qd = 9;
    private ta wi;
    private int jk = 0;
    private int Wc = 0;
    private int yg = -1;
    private int bl = -1;
    private int Ug = 128;
    private int De = 0;
    private long[] Zd = new long[100];
    private int Oj = 0;
    private int Sg = -1;
    private int Vg = 0;
    private boolean hj = true;
    private int hc;
    private int qk = 0;
    private int ac = 550;
    private int Rk;
    private int si = 1;
    private boolean Ue = false;
    private int Ok = 2;
    private int kd;
    private int Wd = 512;
    private int Vh = 0;
    private int yj = -1;
    private int Ki = 0;
    private int dc = 0;
    private ta[] We;
    private int If = 0;
    private int Ne;
    private int Cf = 0;
    private int xh = 0;
    private int Si = 0;
    private int nk = 0;
    private int pj = 0;
    private int Ce = 0;
    private int ij;
    private int ui = 0;
    private int Zb = 0;
    private int Fd = 0;
    private int oc = 0;
    private int zg;
    private int Wj;
    private int rc = 0;
    private int[] Kk = new int[8192];
    private int eg = 2;
    private boolean Pg = false;
    private boolean Vc = false;
    private int kg = 0;
    private boolean zf = false;
    private int Oi = 334;
    private int qe = 0;
    private int Yc = 0;
    private int Be = 0;
    private int qg = 0;
    private int[] uj;
    private int Qg;
    private boolean cf = false;
    private int nc = 40;
    private ta[] Zg;
    private int dg;
    private ba li;
    private Graphics Xb;
    private int oj = 0;
    private int sk = 0;
    private int Mg = 0;
    private int sg;
    private ta[] rg;
    private long Wi;
    private int tj = 0;
    private int Ag = 0;
    private int[] Rg;
    private int Jg;
    private lb Ek;
    private String Zj = null;
    private boolean Oh = false;
    private int gc = 0;
    private int Mj;
    private int[] ci;
    private int[] di;
    private int[] ei;
    private int[] Rj;
    private int[] Jf;
    private int Fg = 0;
    private int el = 0;
    private int zi = 0;
    private int Qi;
    private int[][] Tg;
    private int[] Jd;
    private int[] Zf;
    private int[] ae;
    private int[] bg;
    private int Hi;
    private int Qe = 0;
    private int[] oe;
    private boolean ue = false;
    private int Rd = -1;
    private int xk = 0;
    private int[] xj;
    private int[] jd;
    private int Id = 0;
    private int dj = 0;
    private int sh;
    private int[] Oc;
    private int[] zj;
    private int wg = 2;
    private int ek;
    private int bh;
    private boolean Cd = false;
    private boolean Mi = false;
    private int rf;
    private int Zc = -1;
    private int ce = 0;
    private int Re;
    private boolean mh = false;
    private int Sb = 0;
    private int Sh;
    private boolean ff = false;
    private int[] tf;
    private int Pf = 0;
    private wb He;
    private int[] oh;
    private int[] Ng;
    private int Gf;
    private boolean Yh = false;
    private int uc = 0;
    private int Jj;
    private String ve = null;
    private int[] Dg;
    private ra hk;
    private int[] Wh;
    private int Uk;
    private int Ih;
    private int[] Uf;
    private int ud;
    private int Cg;
    private String Qd;
    private int qj = 0;
    private int[] Me;
    private int fl = 0;
    private int Kj;
    private boolean Qk = false;
    private int Sf = 1;
    private int Ui = 0;
    private ca[] kh;
    private int[] Se;
    private qa zk;
    private int ed;
    private int Bc = 0;
    private int ii = 0;
    private int zd = 0;
    private boolean lh = false;
    private qa fe;
    private int hi = 0;
    private boolean Xj = false;
    private qa Af;
    private int fh = -2;
    private int[] cg;
    private qa yd;
    private int be;
    private int fg = 0;
    private int[] Sc;
    private int[] bf;
    private int lc;
    private sa ni;
    private int ld = 2;
    private int[] Xe;
    private int[] sf;
    private boolean uk = false;
    private boolean Yk = true;
    private int Ai;
    private String[] Kc;
    private boolean ke = false;
    private String[] ah;
    private int nh = 0;
    private int ng;
    private int wj = 0;
    private String[] Ej;
    private int Rc;
    private int[] je;
    private int Ze;
    private int[] Vb;
    private int ck;
    private int gh;
    private int Ve = 0;
    private int[] ye;
    private int xg = 0;
    private int[] ti;
    private int Ee = 0;
    private int Wg = 8;
    private int[] jj;
    private int[] Hj;
    private String Lg = "";
    private int[] nf;
    private boolean Ub = false;
    private int af = -1;
    private int pk = 0;
    private String wh = "";
    private int mf = 0;
    private int[] Og;
    private int Xc;
    private String ig = "";
    private int Vf = 0;
    private int ji;
    private int[] th;
    private int[] Ni;
    private boolean fd = false;
    private int id = 0;
    private wb zh;
    private byte[] Uh = null;
    private String re;
    private String[] Te;
    private int Gi = 48;
    private int[] Gj;
    private int Eg;
    private int Ud;
    private int[] pe;
    private String[] Vk;
    private boolean Kd = false;
    private int Hf;
    private boolean Bd = true;
    private ca[] hg;
    private int Lh = 14;
    private int[] Pc;
    private String ec = "";
    private boolean se = false;
    private int Df = 0;
    private boolean[] Ed;
    private int vj = 0;
    private int[] vi;
    private String[] od = null;
    private String Cj = "";
    private int[] ee;
    private int lk;
    private int[] Ak;
    private ca[] rd;
    private int Zh = 0;
    private int[] gi;
    private int Mh = 0;
    private int Dj;
    private int[] Lc;
    private int mc;
    private int hh = 0;
    private boolean Hk = false;
    private ta[] te;
    private int[] xi;
    private int gl = 0;
    private boolean vd = false;
    private int[] uf;
    private int Ef = 0;
    private int[] of;
    private int Lf;
    private boolean[] bk;
    private wb Wf;
    private int td;
    private int cl = 30;
    private qa Mc;
    private int[] gd;
    private int wk = -1;
    private int[] Bi;
    private int Fh;
    private boolean vk = false;
    private String cj = "";
    private int Vd = 0;
    private boolean[] fi;
    private int Di = -1;
    private int le = 0;
    private boolean Kh = true;
    private int[] kf;
    private int de = 0;
    private int[] Qf;
    private int Ti = 0;
    private int[] Le;
    private boolean ne = false;
    private boolean[] Sj;
    private int Vj = 0;
    private int Yb = 0;
    private int Xi;
    private boolean Fe = false;
    private int Lk = 0;
    private boolean Dc = false;
    private int[] Pk;
    private int[] xe;
    private boolean Pj = false;
    private int dk = 1;
    private boolean Wk = false;
    private boolean Ph = false;
    private int[] Fc;
    private int Ji = 0;
    private int hf = 0;
    private int eh = 0;
    private boolean Td = false;
    private int ai = 0;
    private boolean Hc = false;
    private ta[] Ff;
    private int rk = 0;
    private int[] zc;
    private int Ge;
    private int Ah = 0;
    private int Bj = 0;
    private int Of;
    private int Tk = 0;
    private int bj = 0;
    private int kc = 0;
    private boolean Kg = false;
    private int ad;
    private int Cc;
    private boolean Vi = false;
    private boolean md = false;
    private int[] yk;
    private int qc = 0;
    private int pi;
    private int[] vc;
    private qa ge;
    private int Nh = 0;
    private int Bf;
    private boolean ki = false;
    private int Yd = 0;
    private boolean Yi = false;
    private int fj = 0;
    private int Rh;
    private int rh = 0;
    private int Xd = 0;
    private String Xf = "";
    private int nj = -1;
    private int jc = 0;
    private String Uc;
    private String[] Ld;
    private int[] df;
    private int Nj = 0;
    private int[] Aj;
    private int Ke = 0;
    private int Bh = -1;
    private int sd = 0;
    private boolean dd = false;
    private int vg = 0;
    private int[] Dd;
    private int[] ak;
    private int sj = -2;
    private int pg = 0;
    private boolean Je = false;
    private int[] vf;
    private qa yi;
    private ta[] Tb;
    public static boolean vh;

    private final void I(int arg0) {
        boolean bl = false;
        if (arg0 != this.bj) {
            this.d((byte)120);
        } else if (this.Oh) {
            this.j(arg0 - 4853);
        } else if (this.mh) {
            this.l((byte)-115);
        } else if (this.le != 1) {
            if (this.Fe && this.ai == 0) {
                this.r(-122);
            } else if (!this.uk || this.ai != 0) {
                if (!this.Xj) {
                    if (this.Hk) {
                        this.n((byte)8);
                    } else if (this.dd) {
                        this.h(-33);
                    } else if (this.Pj) {
                        this.q(arg0 ^ 0x28);
                    } else if (this.Vf != 1) {
                        if (this.Vf == 2) {
                            this.z(-28949);
                        } else if (this.Bj == 0) {
                            bl = true;
                        } else {
                            this.h((byte)127);
                        }
                    } else {
                        this.d(false);
                    }
                } else {
                    this.N(-54);
                }
            } else {
                this.M(-89);
            }
        } else {
            this.H(120);
        }
        if (this.gc != 0) {
            this.c((byte)-43);
        }
        if (bl) {
            boolean bl2;
            if (this.Ph) {
                this.G(-312);
            }
            if (this.wi.y == 8 || this.wi.y == 9) {
                this.k((byte)114);
            }
            this.D(arg0 ^ 1);
            boolean bl3 = bl2 = !this.Ph && !this.se;
            if (bl2) {
                this.zh.d(0);
            }
            if (this.qc == 0 && bl2) {
                this.s(arg0 ^ 2);
            }
            if (this.qc == 1) {
                this.a(-15252, bl2);
            }
            if (this.qc == 2) {
                this.a(bl2, (byte)125);
            }
            if (this.qc == 3) {
                this.c(bl2, arg0 ^ 0);
            }
            if (this.qc == 4) {
                this.b(bl2, (byte)-74);
            }
            if (this.qc == 5) {
                this.a(bl2, false);
            }
            if (this.qc == 6) {
                this.b(15, bl2);
            }
            if (!this.se && !this.Ph) {
                this.L(-128);
            }
            if (this.se && !this.Ph) {
                this.i((byte)-106);
            }
        }
        this.Cf = 0;
    }

    private final void M(int arg0) {
        block48: {
            int n2;
            int n3;
            block47: {
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                if (this.Cf != 0 && this.gc == 0) {
                    this.Cf = 0;
                    n3 = this.I - 52;
                    n2 = this.xb - 44;
                    if (n3 >= 0 && n2 >= 12 && n3 < 408 && n2 < 246) {
                        n12 = 0;
                        for (n11 = 0; n11 < 5; ++n11) {
                            for (n10 = 0; n10 < 8; ++n10) {
                                n9 = n10 * 49 + 7;
                                n8 = n11 * 34 + 28;
                                if (n3 > n9 && 49 + n9 > n3 && n2 > n8 && n2 < n8 + 34 && this.Rj[n12] != -1) {
                                    this.Di = n12;
                                    this.fh = this.Rj[n12];
                                }
                                ++n12;
                            }
                        }
                        if (this.Di >= 0 && (n11 = this.Rj[this.Di]) != -1) {
                            n10 = this.Jf[this.Di];
                            if (n10 > 0 && n2 >= 204 && n2 <= 215) {
                                n9 = 0;
                                if (n3 > 318 && n3 < 330) {
                                    n9 = 1;
                                }
                                if (n10 >= 5 && n3 > 333 && n3 < 345) {
                                    n9 = 5;
                                }
                                if (n10 >= 10 && n3 > 348 && n3 < 365) {
                                    n9 = 10;
                                }
                                if (n10 >= 50 && n3 > 368 && n3 < 385) {
                                    n9 = 50;
                                }
                                if (n3 > 388 && n3 < 400) {
                                    this.a(fa.a, 12, 5, true);
                                }
                                if (n9 > 0) {
                                    this.Jh.b(236, 0);
                                    this.Jh.f.e(393, this.Rj[this.Di]);
                                    this.Jh.f.e(393, n10);
                                    this.Jh.f.e(393, n9);
                                    this.Jh.b(21294);
                                }
                            }
                            if ((n9 = this.b(102, n11)) > 0 && n2 >= 229 && n2 <= 240) {
                                n8 = 0;
                                if (n3 > 318 && n3 < 330) {
                                    n8 = 1;
                                }
                                if (n9 >= 5 && n3 > 333 && n3 < 345) {
                                    n8 = 5;
                                }
                                if (n9 >= 10 && n3 > 348 && n3 < 365) {
                                    n8 = 10;
                                }
                                if (n3 > 388 && n3 < 400) {
                                    this.a(nb.u, 12, 6, true);
                                }
                                if (n9 >= 50 && n3 > 368 && n3 < 385) {
                                    n8 = 50;
                                }
                                if (n8 > 0) {
                                    this.Jh.b(221, 0);
                                    this.Jh.f.e(393, this.Rj[this.Di]);
                                    this.Jh.f.e(393, n10);
                                    this.Jh.f.e(393, n8);
                                    this.Jh.b(21294);
                                }
                            }
                        }
                    } else {
                        this.Jh.b(166, 0);
                        this.Jh.b(21294);
                        this.uk = false;
                        return;
                    }
                }
                n3 = 52;
                n2 = 44;
                this.li.a(n3, (byte)101, 192, n2, 12, 408);
                n12 = 0x989898;
                this.li.c(160, n3, 17, 0, 12 + n2, 408, n12);
                this.li.c(160, n3, 170, 0, n2 + 29, 8, n12);
                this.li.c(160, n3 + 399, 170, 0, 29 + n2, 9, n12);
                this.li.c(160, n3, 47, 0, 199 + n2, 408, n12);
                this.li.a("Buying and selling items", n3 + 1, n2 + 10, 0xFFFFFF, false, 1);
                n11 = 0xFFFFFF;
                if (320 + n3 < this.I && n2 <= this.xb && n3 + 408 > this.I && n2 + 12 > this.xb) {
                    n11 = 0xFF0000;
                }
                this.li.b(n3 + 406, "Close window", n2 + 10, n11, -92, 1);
                this.li.a("Shops stock in green", 2 + n3, 24 + n2, 65280, false, 1);
                this.li.a("Number you own in blue", n3 + 135, n2 + 24, 65535, false, 1);
                this.li.a("Your money: " + this.b(84, 10) + "gp", 280 + n3, 24 + n2, 0xFFFF00, false, 1);
                n10 = 0xD0D0D0;
                n9 = 0;
                for (n8 = 0; n8 < 5; ++n8) {
                    for (n7 = 0; n7 < 8; ++n7) {
                        n6 = n7 * 49 + (7 + n3);
                        n5 = n2 + 28 + 34 * n8;
                        if (this.Di == n9) {
                            this.li.c(160, n6, 34, 0, n5, 49, 0xFF0000);
                        } else {
                            this.li.c(160, n6, 34, 0, n5, 49, n10);
                        }
                        this.li.e(n6, 50, n5, 27785, 35, 0);
                        if (this.Rj[n9] != -1) {
                            this.li.a(n5, h.c[this.Rj[n9]], 0, false, 0, ua.Bb[this.Rj[n9]] + this.sg, 32, 48, n6, 1);
                            this.li.a("" + this.Jf[n9], 1 + n6, 10 + n5, 65280, false, 1);
                            this.li.b(47 + n6, "" + this.b(85, this.Rj[n9]), 10 + n5, 65535, -80, 1);
                        }
                        ++n9;
                    }
                }
                this.li.b(398, 0, 5 + n3, n2 + 222, (byte)-103);
                if (this.Di == -1) break block47;
                n7 = this.Rj[this.Di];
                if (n7 == -1) break block48;
                n6 = this.Jf[this.Di];
                if (n6 <= 0) {
                    this.li.a(204 + n3, "This item is not currently available to buy", 0xFFFF00, 0, 3, 214 + n2);
                } else {
                    n5 = o.a(kb.b[n7], this.vi[this.Di], this.xk, -30910, true, 1, n6, this.Pf);
                    this.li.a(ac.x[n7] + ": buy for " + n5 + "gp each", 2 + n3, n2 + 214, 0xFFFF00, false, 1);
                    n4 = this.xb >= 204 + n2 && this.xb <= n2 + 215 ? 1 : 0;
                    this.li.a("Buy:", n3 + 285, 214 + n2, 0xFFFFFF, false, 3);
                    n11 = 0xFFFFFF;
                    if (n4 != 0 && this.I > 318 + n3 && n3 + 330 > this.I) {
                        n11 = 0xFF0000;
                    }
                    this.li.a("1", n3 + 320, 214 + n2, n11, false, 3);
                    if (n6 >= 5) {
                        n11 = 0xFFFFFF;
                        if (n4 != 0 && this.I > 333 + n3 && 345 + n3 > this.I) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("5", 335 + n3, 214 + n2, n11, false, 3);
                    }
                    if (n6 >= 10) {
                        n11 = 0xFFFFFF;
                        if (n4 != 0 && 348 + n3 < this.I && this.I < n3 + 365) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("10", 350 + n3, 214 + n2, n11, false, 3);
                    }
                    if (n6 >= 50) {
                        n11 = 0xFFFFFF;
                        if (n4 != 0 && 368 + n3 < this.I && this.I < 385 + n3) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("50", n3 + 370, 214 + n2, n11, false, 3);
                    }
                    n11 = 0xFFFFFF;
                    if (n4 != 0 && n3 + 388 < this.I && 400 + n3 > this.I) {
                        n11 = 0xFF0000;
                    }
                    this.li.a("X", 390 + n3, 214 + n2, n11, false, 3);
                }
                n5 = this.b(88, n7);
                if (n5 <= 0) {
                    this.li.a(n3 + 204, "You do not have any of this item to sell", 0xFFFF00, 0, 3, 239 + n2);
                } else {
                    n4 = o.a(kb.b[n7], this.vi[this.Di], this.Nh, -30910, false, 1, n6, this.Pf);
                    this.li.a(ac.x[n7] + ": sell for " + n4 + "gp each", 2 + n3, n2 + 239, 0xFFFF00, false, 1);
                    boolean bl = this.xb >= n2 + 229 && n2 + 240 >= this.xb;
                    n11 = 0xFFFFFF;
                    this.li.a("Sell:", n3 + 285, n2 + 239, 0xFFFFFF, false, 3);
                    if (bl && this.I > n3 + 318 && this.I < n3 + 330) {
                        n11 = 0xFF0000;
                    }
                    this.li.a("1", n3 + 320, 239 + n2, n11, false, 3);
                    if (n5 >= 5) {
                        n11 = 0xFFFFFF;
                        if (bl && n3 + 333 < this.I && n3 + 345 > this.I) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("5", 335 + n3, 239 + n2, n11, false, 3);
                    }
                    if (n5 >= 10) {
                        n11 = 0xFFFFFF;
                        if (bl && 348 + n3 < this.I && 365 + n3 > this.I) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("10", n3 + 350, 239 + n2, n11, false, 3);
                    }
                    if (n5 >= 50) {
                        n11 = 0xFFFFFF;
                        if (bl && this.I > n3 + 368 && this.I < 385 + n3) {
                            n11 = 0xFF0000;
                        }
                        this.li.a("50", n3 + 370, 239 + n2, n11, false, 3);
                    }
                    n11 = 0xFFFFFF;
                    if (bl && this.I > 388 + n3 && n3 + 400 > this.I) {
                        n11 = 0xFF0000;
                    }
                    this.li.a("X", n3 + 390, n2 + 239, n11, false, 3);
                }
                break block48;
            }
            this.li.a(204 + n3, "Select an object to buy or sell", 0xFFFF00, 0, 3, 214 + n2);
        }
    }

    private final void B(int arg0) {
        if (this.qg == 0) {
            return;
        }
        if (this.ai > 450) {
            this.a(false, null, 0, "You can't logout during combat!", 0, 0, null, "@cya@");
            return;
        }
        if (arg0 < this.ai) {
            this.a(false, null, arg0 ^ 0, "You can't logout for 10 seconds after combat", 0, 0, null, "@cya@");
            return;
        }
        this.Jh.b(102, 0);
        this.Jh.b(21294);
        this.bj = 1000;
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        block0: {
            this.a(arg1, arg4, arg3, arg0, arg2, arg1, false, arg0, 105);
            if (arg5 == 8) break block0;
            this.Wi = -85L;
        }
    }

    private final void O(int arg0) {
        this.yd = new qa(this.li, 10);
        this.Fh = this.yd.a(502, arg0, 5, 20, 269, 1, arg0 ^ 7, true);
        this.bh = this.yd.a(80, 14, false, 7, 1, 324, 14179, 498, true);
        this.ud = this.yd.a(502, 56, 5, 20, 269, 1, 63, true);
        this.mc = this.yd.a(502, 56, 5, 20, 269, 1, 63, true);
        this.yd.d(this.bh, -103);
    }

    private final void j(byte arg0) {
        byte[] byArray = this.a("Textures", 50, 11, 111);
        if (byArray == null) {
            this.Vc = true;
            return;
        }
        byte[] byArray2 = na.a("index.dat", 0, byArray, -122);
        this.Ek.a(0, 11, 7, jb.o);
        for (int i2 = 0; jb.o > i2; ++i2) {
            String string = mb.g[i2];
            byte[] byArray3 = na.a(string + ".dat", 0, byArray, -125);
            this.li.a(this.Eh, 1, byArray3, 88, byArray2);
            this.li.a(0, (byte)-117, 0xFF00FF, 0, 128, 128);
            this.li.b(-1, this.Eh, 0, 0);
            int n2 = this.li.Eb[this.Eh];
            String string2 = p.c[i2];
            if (string2 != null && string2.length() > 0) {
                byArray3 = na.a(string2 + ".dat", 0, byArray, -121);
                this.li.a(this.Eh, 1, byArray3, 109, byArray2);
                this.li.b(-1, this.Eh, 0, 0);
            }
            this.li.d(i2 + this.ij, n2, 113, n2, 0, 0);
            int n3 = n2 * n2;
            for (int i3 = 0; n3 > i3; ++i3) {
                if (this.li.ob[this.ij + i2][i3] != 65280) continue;
                this.li.ob[i2 + this.ij][i3] = 0xFF00FF;
            }
            this.li.a(false, i2 + this.ij);
            this.Ek.a(i2, (byte)74, this.li.Y[this.ij + i2], n2 / 64 - 1, this.li.gb[this.ij - -i2]);
        }
    }

    private final int b(int arg0, int arg1) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.lc; ++i2) {
            if (arg1 != this.vf[i2]) continue;
            if (fa.e[arg1] != 1) {
                n2 += this.xe[i2];
                continue;
            }
            ++n2;
        }
        if (arg0 < 83) {
            this.h((byte)87);
        }
        return n2;
    }

    private final void a(String arg0, int arg1) {
        this.Jh.b(38, 0);
        if (arg1 < 99) {
            this.Gi = 89;
        }
        this.Jh.f.a(arg0, 104);
        this.Jh.b(21294);
    }

    private final void a(int arg0, int arg1, String[] arg2, boolean arg3, String arg4) {
        this.od = arg2;
        this.zi = 400;
        if (arg0 != 3) {
            this.Wf = null;
        }
        for (int i2 = 0; arg2.length > i2; ++i2) {
            int n2 = this.li.a(1, arg0 + 113, arg2[i2]) + 10;
            if (this.zi >= n2) continue;
            this.zi = n2;
        }
        this.gl = 15 + (this.li.a(508305352, 1) + 2) * (1 + arg2.length) + this.li.a(508305352, 4);
        this.gc = arg1;
        this.e = arg4;
        this.vk = false;
        this.Cb = "";
        this.Bd = arg3;
    }

    /*
     * Unable to fully structure code
     */
    private final void r(int arg0) {
        block73: {
            block72: {
                block70: {
                    block71: {
                        var2_2 = 408;
                        var3_3 = 334;
                        if (this.xg > 0 && this.vj <= 48) {
                            this.xg = 0;
                        }
                        if (this.xg > 1 && this.vj <= 96) {
                            this.xg = 1;
                        }
                        if (this.vj <= this.Rd || this.Rd < 0) {
                            this.Rd = -1;
                        }
                        if (this.xg > 2 && this.vj <= 144) {
                            this.xg = 2;
                        }
                        if (this.Rd != -1 && this.sj != this.ae[this.Rd]) {
                            this.Rd = -1;
                            this.sj = -2;
                        }
                        if (this.gc != 0 || this.Cf == 0) break block70;
                        this.Cf = 0;
                        var4_4 = var2_2 / 2 + (this.I - 256);
                        var5_5 = this.xb - (-(var3_3 / 2) + 170);
                        if (var4_4 >= 0 && var5_5 >= 12 && var4_4 < 408 && var5_5 < 280) break block71;
                        if (this.vj > 48 && var4_4 >= 50 && var4_4 <= 115 && var5_5 <= 12) ** GOTO lbl33
                        if (this.vj > 48 && var4_4 >= 115 && var4_4 <= 180 && var5_5 <= 12) {
                            this.xg = 1;
                        } else if (this.vj > 96 && var4_4 >= 180 && var4_4 <= 245 && var5_5 <= 12) {
                            this.xg = 2;
                        } else if (this.vj > 144 && var4_4 >= 245 && var4_4 <= 310 && var5_5 <= 12) {
                            this.xg = 3;
                        } else {
                            this.Jh.b(212, 0);
                            this.Jh.b(21294);
                            this.Fe = false;
                            return;
lbl33:
                            // 1 sources

                            this.xg = 0;
                        }
                        break block70;
                    }
                    var6_6 = this.xg * 48;
                    for (var7_7 = 0; var7_7 < 6; ++var7_7) {
                        for (var8_8 = 0; var8_8 < 8; ++var8_8) {
                            var9_9 = 7 + 49 * var8_8;
                            var10_10 = 34 * var7_7 + 28;
                            if (var9_9 < var4_4 && 49 + var9_9 > var4_4 && var10_10 < var5_5 && var10_10 + 34 > var5_5 && var6_6 < this.vj && this.ae[var6_6] != -1) {
                                this.sj = this.ae[var6_6];
                                this.Rd = var6_6;
                            }
                            ++var6_6;
                        }
                    }
                    var5_5 = -(var3_3 / 2) + 170;
                    var4_4 = 256 - var2_2 / 2;
                    var7_7 = this.Rd >= 0 ? this.ae[this.Rd] : -1;
                    if (var7_7 != -1) {
                        var6_6 = this.di[this.Rd];
                        if (var6_6 >= 1 && 220 + var4_4 <= this.I && 238 + var5_5 <= this.xb && var4_4 + 250 > this.I && this.xb <= 249 + var5_5) {
                            this.Jh.b(22, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 1);
                            this.Jh.f.b(-422797528, 305419896);
                            this.Jh.b(21294);
                        }
                        if (var6_6 >= 5 && 250 + var4_4 <= this.I && var5_5 + 238 <= this.xb && this.I < 280 + var4_4 && this.xb <= var5_5 + 249) {
                            this.Jh.b(22, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 5);
                            this.Jh.f.b(-422797528, 305419896);
                            this.Jh.b(21294);
                        }
                        if (var6_6 >= 10 && this.I >= var4_4 + 280 && 238 + var5_5 <= this.xb && var4_4 + 305 > this.I && this.xb <= 249 + var5_5) {
                            this.Jh.b(22, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 10);
                            this.Jh.f.b(-422797528, 305419896);
                            this.Jh.b(21294);
                        }
                        if (var6_6 >= 50 && this.I >= var4_4 + 305 && this.xb >= var5_5 + 238 && 335 + var4_4 > this.I && var5_5 + 249 >= this.xb) {
                            this.Jh.b(22, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 50);
                            this.Jh.f.b(-422797528, 305419896);
                            this.Jh.b(21294);
                        }
                        if (this.I >= 335 + var4_4 && var5_5 + 238 <= this.xb && this.I < var4_4 + 368 && 249 + var5_5 >= this.xb) {
                            this.a(d.m, 12, 3, true);
                        }
                        if (var4_4 + 370 <= this.I && var5_5 + 238 <= this.xb && this.I < var4_4 + 400 && this.xb <= 249 + var5_5) {
                            this.Jh.b(22, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, var6_6);
                            this.Jh.f.b(-422797528, 305419896);
                            this.Jh.b(21294);
                        }
                        if (this.b(93, var7_7) >= 1 && this.I >= var4_4 + 220 && var5_5 + 263 <= this.xb && var4_4 + 250 > this.I && 274 + var5_5 >= this.xb) {
                            this.Jh.b(23, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 1);
                            this.Jh.f.b(-422797528, -2023406815);
                            this.Jh.b(21294);
                        }
                        if (this.b(90, var7_7) >= 5 && var4_4 + 250 <= this.I && this.xb >= 263 + var5_5 && this.I < var4_4 + 280 && 274 + var5_5 >= this.xb) {
                            this.Jh.b(23, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 5);
                            this.Jh.f.b(-422797528, -2023406815);
                            this.Jh.b(21294);
                        }
                        if (this.b(108, var7_7) >= 10 && var4_4 + 280 <= this.I && this.xb >= var5_5 + 263 && var4_4 + 305 > this.I && this.xb <= var5_5 + 274) {
                            this.Jh.b(23, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 10);
                            this.Jh.f.b(-422797528, -2023406815);
                            this.Jh.b(21294);
                        }
                        if (this.b(109, var7_7) >= 50 && var4_4 + 305 <= this.I && 263 + var5_5 <= this.xb && this.I < var4_4 + 335 && 274 + var5_5 >= this.xb) {
                            this.Jh.b(23, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, 50);
                            this.Jh.f.b(-422797528, -2023406815);
                            this.Jh.b(21294);
                        }
                        if (this.I >= var4_4 + 335 && this.xb >= var5_5 + 263 && var4_4 + 368 > this.I && var5_5 + 274 >= this.xb) {
                            this.a(f.c, 12, 4, true);
                        }
                        if (370 + var4_4 <= this.I && 263 + var5_5 <= this.xb && this.I < 400 + var4_4 && this.xb <= var5_5 + 274) {
                            this.Jh.b(23, 0);
                            this.Jh.f.e(393, var7_7);
                            this.Jh.f.b(-422797528, this.b(85, var7_7));
                            this.Jh.f.b(-422797528, -2023406815);
                            this.Jh.b(21294);
                        }
                    }
                }
                var4_4 = -(var2_2 / 2) + 256;
                var5_5 = 170 - var3_3 / 2;
                this.li.a(var4_4, (byte)-126, 192, var5_5, 12, 408);
                if (arg0 > -118) {
                    this.ud = -77;
                }
                var6_6 = 0x989898;
                this.li.c(160, var4_4, 17, 0, var5_5 + 12, 408, var6_6);
                this.li.c(160, var4_4, 204, 0, var5_5 + 29, 8, var6_6);
                this.li.c(160, var4_4 + 399, 204, 0, var5_5 + 29, 9, var6_6);
                this.li.c(160, var4_4, 47, 0, 233 + var5_5, 408, var6_6);
                this.li.a("Bank", var4_4 + 1, 10 + var5_5, 0xFFFFFF, false, 1);
                var7_7 = 50;
                if (this.vj > 48) {
                    var8_8 = 0xFFFFFF;
                    if (this.xg == 0) {
                        var8_8 = 0xFF0000;
                    } else if (var7_7 + var4_4 < this.I && var5_5 <= this.xb && 65 + (var4_4 + var7_7) > this.I && this.xb < var5_5 + 12) {
                        var8_8 = 0xFFFF00;
                    }
                    this.li.a("<page 1>", var4_4 - -var7_7, 10 + var5_5, var8_8, false, 1);
                    var7_7 += 65;
                    var8_8 = 0xFFFFFF;
                    if (this.xg == 1) {
                        var8_8 = 0xFF0000;
                    } else if (var4_4 - -var7_7 < this.I && this.xb >= var5_5 && this.I < 65 + var7_7 + var4_4 && this.xb < 12 + var5_5) {
                        var8_8 = 0xFFFF00;
                    }
                    this.li.a("<page 2>", var4_4 - -var7_7, var5_5 + 10, var8_8, false, 1);
                    var7_7 += 65;
                }
                if (this.vj > 96) {
                    var8_8 = 0xFFFFFF;
                    if (this.xg != 2) {
                        if (var4_4 - -var7_7 < this.I && var5_5 <= this.xb && 65 + (var7_7 + var4_4) > this.I && var5_5 + 12 > this.xb) {
                            var8_8 = 0xFFFF00;
                        }
                    } else {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("<page 3>", var4_4 - -var7_7, var5_5 + 10, var8_8, false, 1);
                    var7_7 += 65;
                }
                if (this.vj > 144) {
                    var8_8 = 0xFFFFFF;
                    if (this.xg == 3) {
                        var8_8 = 0xFF0000;
                    } else if (var7_7 + var4_4 < this.I && this.xb >= var5_5 && this.I < 65 + (var4_4 + var7_7) && this.xb < var5_5 + 12) {
                        var8_8 = 0xFFFF00;
                    }
                    this.li.a("<page 4>", var7_7 + var4_4, var5_5 + 10, var8_8, false, 1);
                    var7_7 += 65;
                }
                var8_8 = 0xFFFFFF;
                if (this.I > 320 + var4_4 && var5_5 <= this.xb && this.I < 408 + var4_4 && var5_5 + 12 > this.xb) {
                    var8_8 = 0xFF0000;
                }
                this.li.b(406 + var4_4, "Close window", var5_5 + 10, var8_8, -69, 1);
                this.li.a("Number in bank in green", var4_4 + 7, 24 + var5_5, 65280, false, 1);
                this.li.a("Number held in blue", 289 + var4_4, 24 + var5_5, 65535, false, 1);
                var9_9 = 0xD0D0D0;
                var10_10 = this.xg * 48;
                for (var11_11 = 0; var11_11 < 6; ++var11_11) {
                    for (var12_12 = 0; var12_12 < 8; ++var12_12) {
                        var13_13 = var12_12 * 49 + (var4_4 + 7);
                        var14_14 = var11_11 * 34 + var5_5 + 28;
                        if (var10_10 == this.Rd) {
                            this.li.c(160, var13_13, 34, 0, var14_14, 49, 0xFF0000);
                        } else {
                            this.li.c(160, var13_13, 34, 0, var14_14, 49, var9_9);
                        }
                        this.li.e(var13_13, 50, var14_14, 27785, 35, 0);
                        if (var10_10 < this.vj && this.ae[var10_10] != -1) {
                            this.li.a(var14_14, h.c[this.ae[var10_10]], 0, false, 0, ua.Bb[this.ae[var10_10]] + this.sg, 32, 48, var13_13, 1);
                            this.li.a("" + this.di[var10_10], var13_13 + 1, var14_14 + 10, 65280, false, 1);
                            this.li.b(var13_13 + 47, "" + this.b(87, this.ae[var10_10]), 29 + var14_14, 65535, 127, 1);
                        }
                        ++var10_10;
                    }
                }
                this.li.b(398, 0, var4_4 + 5, var5_5 + 256, (byte)-87);
                if (this.Rd == -1) break block72;
                var11_11 = this.Rd < 0 ? -1 : this.ae[this.Rd];
                if (var11_11 == -1) break block73;
                var10_10 = this.di[this.Rd];
                if (fa.e[var11_11] == 1 && var10_10 > 1) {
                    var10_10 = 1;
                }
                if (var10_10 > 0) {
                    var8_8 = 0xFFFFFF;
                    this.li.a("Withdraw " + ac.x[var11_11], var4_4 + 2, 248 + var5_5, 0xFFFFFF, false, 1);
                    if (this.I >= 220 + var4_4 && this.xb >= 238 + var5_5 && var4_4 + 250 > this.I && this.xb <= var5_5 + 249) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("One", 222 + var4_4, 248 + var5_5, var8_8, false, 1);
                    if (var10_10 >= 5) {
                        var8_8 = 0xFFFFFF;
                        if (this.I >= 250 + var4_4 && 238 + var5_5 <= this.xb && var4_4 + 280 > this.I && this.xb <= var5_5 + 249) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("Five", var4_4 + 252, 248 + var5_5, var8_8, false, 1);
                    }
                    if (var10_10 >= 10) {
                        var8_8 = 0xFFFFFF;
                        if (var4_4 + 280 <= this.I && this.xb >= 238 + var5_5 && 305 + var4_4 > this.I && this.xb <= 249 + var5_5) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("10", 282 + var4_4, 248 + var5_5, var8_8, false, 1);
                    }
                    if (var10_10 >= 50) {
                        var8_8 = 0xFFFFFF;
                        if (305 + var4_4 <= this.I && this.xb >= var5_5 + 238 && 335 + var4_4 > this.I && var5_5 + 249 >= this.xb) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("50", 307 + var4_4, var5_5 + 248, var8_8, false, 1);
                    }
                    var8_8 = 0xFFFFFF;
                    if (this.I >= 335 + var4_4 && 238 + var5_5 <= this.xb && var4_4 + 368 > this.I && var5_5 + 249 >= this.xb) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("X", 337 + var4_4, 248 + var5_5, var8_8, false, 1);
                    var8_8 = 0xFFFFFF;
                    if (370 + var4_4 <= this.I && this.xb >= 238 + var5_5 && 400 + var4_4 > this.I && var5_5 + 249 >= this.xb) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("All", 370 + var4_4, 248 + var5_5, var8_8, false, 1);
                }
                if (this.b(126, var11_11) > 0) {
                    this.li.a("Deposit " + ac.x[var11_11], var4_4 + 2, var5_5 + 273, 0xFFFFFF, false, 1);
                    var8_8 = 0xFFFFFF;
                    if (var4_4 + 220 <= this.I && this.xb >= var5_5 + 263 && 250 + var4_4 > this.I && this.xb <= var5_5 + 274) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("One", 222 + var4_4, var5_5 + 273, var8_8, false, 1);
                    if (this.b(88, var11_11) >= 5) {
                        var8_8 = 0xFFFFFF;
                        if (this.I >= var4_4 + 250 && var5_5 + 263 <= this.xb && this.I < var4_4 + 280 && 274 + var5_5 >= this.xb) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("Five", var4_4 + 252, 273 + var5_5, var8_8, false, 1);
                    }
                    if (this.b(93, var11_11) >= 10) {
                        var8_8 = 0xFFFFFF;
                        if (280 + var4_4 <= this.I && var5_5 + 263 <= this.xb && var4_4 + 305 > this.I && 274 + var5_5 >= this.xb) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("10", 282 + var4_4, 273 + var5_5, var8_8, false, 1);
                    }
                    if (this.b(98, var11_11) >= 50) {
                        var8_8 = 0xFFFFFF;
                        if (this.I >= var4_4 + 305 && var5_5 + 263 <= this.xb && 335 + var4_4 > this.I && this.xb <= 274 + var5_5) {
                            var8_8 = 0xFF0000;
                        }
                        this.li.a("50", 307 + var4_4, 273 + var5_5, var8_8, false, 1);
                    }
                    var8_8 = 0xFFFFFF;
                    if (335 + var4_4 <= this.I && var5_5 + 263 <= this.xb && 368 + var4_4 > this.I && 274 + var5_5 >= this.xb) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("X", 337 + var4_4, var5_5 + 273, var8_8, false, 1);
                    var8_8 = 0xFFFFFF;
                    if (this.I >= 370 + var4_4 && 263 + var5_5 <= this.xb && 400 + var4_4 > this.I && var5_5 + 274 >= this.xb) {
                        var8_8 = 0xFF0000;
                    }
                    this.li.a("All", 370 + var4_4, 273 + var5_5, var8_8, false, 1);
                }
                break block73;
            }
            this.li.a(var4_4 + 204, "Select an object to withdraw or deposit", 0xFFFF00, 0, 3, 248 + var5_5);
        }
    }

    private final void a(boolean arg0, boolean arg1) {
        block25: {
            int n2;
            String string;
            int n3;
            int n4;
            int n5 = this.li.u - 199;
            int n6 = 36;
            this.li.b(-1, this.tg + 5, 3, n5 - 49);
            int n7 = 196;
            int n8 = 182;
            if (arg1) {
                this.Be = -88;
            }
            int n9 = n4 = o.a(160, 9570, 160, 160);
            if (this.pk != 0) {
                n4 = o.a(220, 9570, 220, 220);
            } else {
                n9 = o.a(220, 9570, 220, 220);
            }
            this.li.c(128, n5, 24, 0, n6, n7 / 2, n9);
            this.li.c(128, n5 + n7 / 2, 24, 0, n6, n7 / 2, n4);
            this.li.c(128, n5, n8 - 24, 0, 24 + n6, n7, o.a(220, 9570, 220, 220));
            this.li.b(n7, 0, n5, n6 + 24, (byte)95);
            this.li.b(n7 / 2 + n5, 0 + n6, 0, 24, 0);
            this.li.b(n7, 0, n5, n6 - -n8 - 16, (byte)-113);
            this.li.a(n5 - -(n7 / 4), "Friends", 0, 0, 4, 16 + n6);
            this.li.a(n7 / 4 + n5 - -(n7 / 2), "Ignore", 0, 0, 4, n6 + 16);
            this.zk.c((byte)-82, this.Hi);
            if (this.pk == 0) {
                for (n3 = 0; n.g > n3; ++n3) {
                    string = (Fj[n3] & 2) == 0 ? ((Fj[n3] & 4) == 0 ? "@red@" : "@yel@") : "@gre@";
                    String string2 = ua.h[n3];
                    n2 = 0;
                    int n10 = ua.h[n3].length();
                    while (this.li.a(1, 111, string2) > 120) {
                        string2 = ua.h[n3].substring(0, -(++n2) + n10) + "...";
                    }
                    this.zk.a(n3, null, 49, 0, null, string + string2 + "~439~@whi@Remove         WWWWWWWWWW", this.Hi);
                }
            }
            if (this.pk == 1) {
                for (n3 = 0; db.g > n3; ++n3) {
                    string = l.c[n3];
                    int n11 = 0;
                    n2 = l.c[n3].length();
                    while (this.li.a(1, 100, string) > 120) {
                        string = l.c[n3].substring(0, -(++n11) + n2) + "...";
                    }
                    this.zk.a(n3, null, 60, 0, null, "@yel@" + string + "~439~@whi@Remove         WWWWWWWWWW", this.Hi);
                }
            }
            this.zk.a((byte)-43);
            this.nj = -1;
            this.wk = -1;
            if (this.pk == 0) {
                n3 = this.zk.b(this.Hi, 17050);
                if (n3 >= 0 && this.I < 489) {
                    this.wk = this.I > 429 ? -(n3 + 2) : n3;
                }
                this.li.a(n7 / 2 + n5, "Click a name to send a message", 0xFFFFFF, 0, 1, 35 + n6);
                int n12 = this.I > n5 && this.I < n5 - -n7 && this.xb > n8 + (n6 - 16) && this.xb < n8 + n6 ? 0xFFFF00 : 0xFFFFFF;
                this.li.a(n7 / 2 + n5, "Click here to add a friend", n12, 0, 1, n8 + n6 - 3);
            }
            if (this.pk == 1) {
                n3 = this.zk.b(this.Hi, 17050);
                if (n3 >= 0 && this.I < 489) {
                    this.nj = this.I <= 429 ? n3 : -(n3 + 2);
                }
                this.li.a(n5 + n7 / 2, "Blocking messages from:", 0xFFFFFF, 0, 1, 35 + n6);
                int n13 = n5 >= this.I || this.I >= n5 + n7 || n8 + n6 - 16 >= this.xb || this.xb >= n8 + n6 ? 0xFFFFFF : 0xFFFF00;
                this.li.a(n7 / 2 + n5, "Click here to add a name", n13, 0, 1, n6 + (n8 - 3));
            }
            if (!arg0) {
                return;
            }
            n6 = this.xb - 36;
            n5 = -this.li.u + (199 + this.I);
            if (n5 < 0 || n6 < 0 || n5 >= 196 || n6 >= 182) break block25;
            this.zk.b(this.Bb, n6 + 36, -9989, this.Qb, n5 - 199 + this.li.u);
            if (n6 <= 24 && this.Cf == 1) {
                if (n5 < 98 && this.pk == 1) {
                    this.pk = 0;
                    this.zk.e(this.Hi, 14);
                } else if (n5 > 98 && this.pk == 0) {
                    this.pk = 1;
                    this.zk.e(this.Hi, 14);
                }
            }
            if (this.Cf == 1 && this.pk == 0 && (n3 = this.zk.b(this.Hi, 17050)) >= 0 && this.I < 489) {
                if (this.I > 429) {
                    this.b(ua.h[n3], (byte)69);
                } else if ((Fj[n3] & 4) != 0) {
                    this.Bj = 2;
                    this.Qd = ua.h[n3];
                    this.Ob = "";
                    this.x = "";
                }
            }
            if (this.Cf == 1 && this.pk == 1 && (n3 = this.zk.b(this.Hi, 17050)) >= 0 && this.I < 489 && this.I > 429) {
                this.a((byte)-15, ia.a[n3]);
            }
            if (n6 > 166 && this.Cf == 1 && this.pk == 0) {
                this.Cb = "";
                this.e = "";
                this.Bj = 1;
            }
            if (n6 > 166 && this.Cf == 1 && this.pk == 1) {
                this.Cb = "";
                this.Bj = 3;
                this.e = "";
            }
            this.Cf = 0;
        }
    }

    private final void n(int arg0) {
        Container container = this.hj ? (da.gb != null ? da.gb : this) : kb.a;
        if (arg0 > -77) {
            this.Ee = 30;
        }
        this.Rh = container.getSize().width;
        this.Hf = container.getSize().height;
        this.K = 0;
        this.Eb = (-this.Wd + this.Rh) / 2;
        this.p((byte)49);
    }

    private final void n(byte arg0) {
        block64: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = -1;
            if (this.Cf != 0 && this.lh) {
                n9 = this.Wf.b(this.I, this.Gf, this.Bf, (byte)-40, this.xb);
            }
            if (n9 < 0) {
                if (this.gc == 0) {
                    if (this.Cf == 1 && this.Tk == 0) {
                        this.Tk = 1;
                    }
                    n8 = this.I - 22;
                    n7 = this.xb - 36;
                    if (n8 < 0 || n7 < 0 || n8 >= 468 || n7 >= 262) {
                        if (this.Cf != 0) {
                            this.Hk = false;
                            this.Jh.b(230, 0);
                            this.Jh.b(21294);
                        }
                    } else {
                        if (this.Tk > 0) {
                            if (n8 > 216 && n7 > 30 && n8 < 462 && n7 < 235 && (n6 = 5 * ((n7 - 31) / 34) + (n8 - 217) / 49) >= 0 && this.lc > n6) {
                                this.a(-1, (byte)9, n6);
                            }
                            if (n8 > 8 && n7 > 30 && n8 < 205 && n7 < 133 && (n6 = (n7 - 31) / 34 * 4 + (n8 - 9) / 49) >= 0 && n6 < this.mf) {
                                this.c(-1, (byte)125, n6);
                            }
                            if (n8 >= 217 && n7 >= 238 && n8 <= 286 && n7 <= 259) {
                                this.Mi = true;
                                this.Jh.b(55, 0);
                                this.Jh.b(21294);
                            }
                            if (n8 >= 394 && n7 >= 238 && n8 < 463 && n7 < 259) {
                                this.Hk = false;
                                this.Jh.b(230, arg0 - 8);
                                this.Jh.b(21294);
                            }
                            this.Tk = 0;
                            this.Cf = 0;
                        }
                        if (this.Cf == 2) {
                            if (n8 > 216 && n7 > 30 && n8 < 462 && n7 < 235) {
                                n6 = this.zh.b(16256);
                                n5 = this.zh.a(-21224);
                                this.fg = this.xb - 7;
                                this.rh = this.I - n6 / 2;
                                this.se = true;
                                if (this.fg < 0) {
                                    this.fg = 0;
                                }
                                if (this.rh < 0) {
                                    this.rh = 0;
                                }
                                if (this.rh - -n6 > 510) {
                                    this.rh = 510 + -n6;
                                }
                                if (n5 + this.fg > 315) {
                                    this.fg = -n5 + 315;
                                }
                                if ((n4 = (n7 - 31) / 34 * 5 + (n8 - 217) / 49) >= 0 && this.lc > n4) {
                                    n3 = this.vf[n4];
                                    this.lh = true;
                                    this.Wf.d(0);
                                    this.Wf.a(n3, "@lre@" + ac.x[n3], 1, "Offer 1", 1, arg0 + 3288);
                                    this.Wf.a(n3, "@lre@" + ac.x[n3], 1, "Offer 5", 5, 3296);
                                    this.Wf.a(n3, "@lre@" + ac.x[n3], 1, "Offer 10", 10, 3296);
                                    this.Wf.a(n3, "@lre@" + ac.x[n3], 1, "Offer All", -1, 3296);
                                    this.Wf.a(n3, "@lre@" + ac.x[n3], 1, "Offer X", -2, arg0 ^ 0xCE8);
                                    n2 = this.Wf.b(arg0 ^ 0x3F88);
                                    int n10 = this.Wf.a(-21224);
                                    this.Gf = -(n2 / 2) + this.I;
                                    this.Bf = this.xb - 7;
                                    if (this.Gf < 0) {
                                        this.Gf = 0;
                                    }
                                    if (this.Bf < 0) {
                                        this.Bf = 0;
                                    }
                                    if (n10 + this.Bf > 315) {
                                        this.Bf = -n10 + 315;
                                    }
                                    if (this.Gf + n2 > 510) {
                                        this.Gf = -n2 + 510;
                                    }
                                }
                            }
                            if (n8 > 8 && n7 > 30 && n8 < 205 && n7 < 133 && (n6 = (n8 - 9) / 49 + (n7 - 31) / 34 * 4) >= 0 && n6 < this.mf) {
                                n5 = this.Qf[n6];
                                this.lh = true;
                                this.Wf.d(0);
                                this.Wf.a(n5, "@lre@" + ac.x[n5], 2, "Remove 1", 1, 3296);
                                this.Wf.a(n5, "@lre@" + ac.x[n5], 2, "Remove 5", 5, arg0 ^ 0xCE8);
                                this.Wf.a(n5, "@lre@" + ac.x[n5], 2, "Remove 10", 10, 3296);
                                this.Wf.a(n5, "@lre@" + ac.x[n5], 2, "Remove All", -1, 3296);
                                this.Wf.a(n5, "@lre@" + ac.x[n5], 2, "Remove X", -2, arg0 ^ 0xCE8);
                                n4 = this.Wf.b(16256);
                                n3 = this.Wf.a(-21224);
                                this.Gf = -(n4 / 2) + this.I;
                                this.Bf = this.xb - 7;
                                if (this.Gf < 0) {
                                    this.Gf = 0;
                                }
                                if (this.Bf < 0) {
                                    this.Bf = 0;
                                }
                                if (n3 + this.Bf > 315) {
                                    this.Bf = 315 - n3;
                                }
                                if (n4 + this.Gf > 510) {
                                    this.Gf = 510 - n4;
                                }
                            }
                            this.Cf = 0;
                        }
                        if (this.lh) {
                            n6 = this.Wf.b(16256);
                            n5 = this.Wf.a(-21224);
                            if (this.Gf - 10 > this.I || this.xb < this.Bf - 10 || this.Gf - (-n6 - 10) < this.I || this.xb > this.Bf - (-n5 - 10)) {
                                this.lh = false;
                            }
                        }
                    }
                }
            } else {
                this.lh = false;
                this.Cf = 0;
                n8 = this.Wf.a(-91, n9);
                n7 = this.Wf.a(true, n9);
                n6 = -1;
                n5 = 0;
                if (n8 == 1) {
                    for (n4 = 0; n4 < this.lc; ++n4) {
                        if (this.vf[n4] != n7) continue;
                        if (n6 < 0) {
                            n6 = n4;
                        }
                        if (fa.e[n7] == 0) {
                            n5 = this.xe[n4];
                            break;
                        }
                        ++n5;
                    }
                } else {
                    for (n4 = 0; this.mf > n4; ++n4) {
                        if (n7 != this.Qf[n4]) continue;
                        if (n6 < 0) {
                            n6 = n4;
                        }
                        if (fa.e[n7] == 0) {
                            n5 = this.jj[n4];
                            break;
                        }
                        ++n5;
                    }
                }
                if (n6 >= 0) {
                    n4 = this.Wf.a((byte)97, n9);
                    if (n4 == -2) {
                        this.ji = n6;
                        if (n8 == 1) {
                            this.a(s.e, 12, 1, true);
                        } else {
                            this.a(ua.Kb, arg0 ^ 4, 2, true);
                        }
                    } else {
                        if (n4 == -1) {
                            n4 = n5;
                        }
                        if (n8 != 1) {
                            this.c(n4, (byte)124, n6);
                        } else {
                            this.a(n4, (byte)9, n6);
                        }
                    }
                }
            }
            if (!this.Hk) {
                return;
            }
            n8 = 22;
            n7 = 36;
            this.li.a(n8, (byte)117, 192, n7, 12, 468);
            n6 = 0x989898;
            this.li.c(160, n8, 18, arg0 - 8, n7 + 12, 468, n6);
            this.li.c(160, n8, 248, 0, n7 + 30, 8, n6);
            if (arg0 != 8) {
                this.Cf = -41;
            }
            this.li.c(160, n8 + 205, 248, arg0 - 8, n7 + 30, 11, n6);
            this.li.c(160, n8 + 462, 248, arg0 - 8, 30 + n7, 6, n6);
            this.li.c(160, n8 + 8, 22, 0, n7 + 133, 197, n6);
            this.li.c(160, n8 + 8, 20, 0, n7 + 258, 197, n6);
            this.li.c(160, n8 + 216, 43, 0, n7 + 235, 246, n6);
            n5 = 0xD0D0D0;
            this.li.c(160, n8 + 8, 103, arg0 - 8, n7 + 30, 197, n5);
            this.li.c(160, 8 + n8, 103, 0, n7 + 155, 197, n5);
            this.li.c(160, 216 + n8, 205, arg0 - 8, 30 + n7, 246, n5);
            for (n4 = 0; n4 < 4; ++n4) {
                this.li.b(197, 0, 8 + n8, 30 + (n7 + 34 * n4), (byte)-98);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                this.li.b(197, 0, n8 + 8, 34 * n4 + 155 + n7, (byte)-29);
            }
            for (n4 = 0; n4 < 7; ++n4) {
                this.li.b(246, 0, 216 + n8, n7 + 30 + n4 * 34, (byte)60);
            }
            for (n4 = 0; n4 < 6; ++n4) {
                if (n4 < 5) {
                    this.li.b(n8 + 8 - -(n4 * 49), 30 + n7, 0, 103, 0);
                }
                if (n4 < 5) {
                    this.li.b(49 * n4 + (8 + n8), 155 + n7, 0, 103, arg0 ^ 8);
                }
                this.li.b(216 + n8 - -(49 * n4), n7 + 30, 0, 205, 0);
            }
            this.li.a("Trading with: " + this.cj, n8 + 1, 10 + n7, 0xFFFFFF, false, 1);
            this.li.a("Your Offer", n8 + 9, n7 + 27, 0xFFFFFF, false, 4);
            this.li.a("Opponent's Offer", n8 + 9, n7 + 152, 0xFFFFFF, false, 4);
            this.li.a("Your Inventory", n8 + 216, n7 + 27, 0xFFFFFF, false, 4);
            if (!this.Mi) {
                this.li.b(-1, this.tg + 25, n7 + 238, n8 + 217);
            }
            this.li.b(-1, this.tg + 26, n7 + 238, n8 + 394);
            if (this.md) {
                this.li.a(n8 + 341, "Other player", 0xFFFFFF, arg0 ^ 8, 1, 246 + n7);
                this.li.a(n8 + 341, "has accepted", 0xFFFFFF, 0, 1, 256 + n7);
            }
            if (this.Mi) {
                this.li.a(n8 + 217 + 35, "Waiting for", 0xFFFFFF, arg0 - 8, 1, n7 + 246);
                this.li.a(n8 + 252, "other player", 0xFFFFFF, arg0 - 8, 1, 256 + n7);
            }
            for (n4 = 0; this.lc > n4; ++n4) {
                n3 = n8 + 217 + 49 * (n4 % 5);
                n2 = 31 + (n7 - -(n4 / 5 * 34));
                this.li.a(n2, h.c[this.vf[n4]], 0, false, 0, this.sg - -ua.Bb[this.vf[n4]], 32, 48, n3, 1);
                if (fa.e[this.vf[n4]] != 0) continue;
                this.li.a("" + this.xe[n4], 1 + n3, 10 + n2, 0xFFFF00, false, 1);
            }
            for (n4 = 0; this.mf > n4; ++n4) {
                n3 = n4 % 4 * 49 + (9 - -n8);
                n2 = n4 / 4 * 34 + (n7 + 31);
                this.li.a(n2, h.c[this.Qf[n4]], 0, false, 0, ua.Bb[this.Qf[n4]] + this.sg, 32, 48, n3, 1);
                if (fa.e[this.Qf[n4]] == 0) {
                    this.li.a("" + this.jj[n4], n3 + 1, 10 + n2, 0xFFFF00, false, 1);
                }
                if (this.I <= n3 || 48 + n3 <= this.I || n2 >= this.xb || this.xb >= n2 + 32) continue;
                this.li.a(ac.x[this.Qf[n4]] + ": @whi@" + ga.b[this.Qf[n4]], 8 + n8, 273 + n7, 0xFFFF00, false, 1);
            }
            for (n4 = 0; this.Lk > n4; ++n4) {
                n3 = n8 + 9 - -(n4 % 4 * 49);
                n2 = n7 + 156 - -(34 * (n4 / 4));
                this.li.a(n2, h.c[this.zj[n4]], 0, false, 0, ua.Bb[this.zj[n4]] + this.sg, 32, 48, n3, 1);
                if (fa.e[this.zj[n4]] == 0) {
                    this.li.a("" + this.Dd[n4], n3 + 1, 10 + n2, 0xFFFF00, false, 1);
                }
                if (this.I <= n3 || n3 + 48 <= this.I || this.xb <= n2 || this.xb >= n2 + 32) continue;
                this.li.a(ac.x[this.zj[n4]] + ": @whi@" + ga.b[this.zj[n4]], n8 + 8, n7 + 273, 0xFFFF00, false, 1);
            }
            if (!this.lh) break block64;
            this.Wf.a(this.Bf, this.Gf, this.xb, (byte)-12, this.I);
        }
    }

    private static final int a(byte[] arg0, String arg1, int arg2) {
        int n2;
        int n3 = d.a(0, (byte)127, arg0);
        arg1 = arg1.toUpperCase();
        int n4 = 0;
        if (arg2 > -18) {
            return 113;
        }
        for (n2 = 0; n2 < arg1.length(); ++n2) {
            n4 = 61 * n4 - -arg1.charAt(n2) - 32;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            int n5 = (0xFF & arg0[n2 * 10 + 5]) + ((0xFF & arg0[2 + n2 * 10]) * 0x1000000 - -((0xFF & arg0[n2 * 10 + 3]) * 65536)) + (0xFF & arg0[4 + 10 * n2]) * 256;
            int n6 = 65536 * (0xFF & arg0[n2 * 10 + 6]) + 256 * (arg0[7 + 10 * n2] & 0xFF) - -(arg0[8 + n2 * 10] & 0xFF);
            if (n5 != n4) continue;
            return n6;
        }
        return 0;
    }

    private final void a(boolean arg0, int arg1, int arg2, int arg3) {
        block4: {
            if (arg3 == 0) {
                this.a(arg1, true, this.Lf, arg2 - 1, this.sh, arg1, false, arg2, -8);
            } else if (arg3 != 1) {
                this.a(arg1, true, this.Lf, arg2, this.sh, arg1, true, arg2, 118);
            } else {
                this.a(arg1 - 1, true, this.Lf, arg2, this.sh, arg1, false, arg2, 126);
            }
            if (!arg0) break block4;
            this.cl = 61;
        }
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        block45: {
            int n2;
            int n3;
            int n4;
            if (arg2 != 20) {
                this.e((byte)-115);
            }
            ta ta2 = this.rg[arg7];
            if (ta2.A == 255) {
                return;
            }
            int n5 = ta2.y - -((this.ug + 16) / 32) & 7;
            boolean bl = false;
            int n6 = n5;
            if (n6 == 5) {
                bl = true;
                n6 = 3;
            } else if (n6 != 6) {
                if (n6 == 7) {
                    n6 = 1;
                    bl = true;
                }
            } else {
                n6 = 2;
                bl = true;
            }
            int n7 = this.sf[ta2.x / 6 % 4] + 3 * n6;
            if (ta2.y != 8) {
                if (ta2.y == 9) {
                    n5 = 2;
                    n6 = 5;
                    arg4 += 5 * arg3 / 100;
                    bl = true;
                    n7 = this.Og[this.jk / 6 % 8] + n6 * 3;
                }
            } else {
                arg4 -= arg3 * 5 / 100;
                n6 = 5;
                bl = false;
                n5 = 2;
                n7 = this.Pc[this.jk / 5 % 8] + 3 * n6;
            }
            for (n4 = 0; n4 < 12; ++n4) {
                n3 = this.Tg[n5][n4];
                n2 = ta2.m[n3] - 1;
                if (n2 < 0) continue;
                int n8 = 0;
                int n9 = 0;
                int n10 = n7;
                if (bl && n6 >= 1 && n6 <= 3) {
                    if (aa.c[n2] != 1) {
                        if (n3 == 4 && n6 == 1) {
                            n10 = 3 * n6 + this.sf[(ta2.x / 6 + 2) % 4];
                            n9 = -3;
                            n8 = -22;
                        } else if (n3 == 4 && n6 == 2) {
                            n8 = 0;
                            n9 = -8;
                            n10 = this.sf[(ta2.x / 6 + 2) % 4] + 3 * n6;
                        } else if (n3 == 4 && n6 == 3) {
                            n9 = -5;
                            n10 = n6 * 3 - -this.sf[(2 + ta2.x / 6) % 4];
                            n8 = 26;
                        } else if (n3 == 3 && n6 == 1) {
                            n10 = 3 * n6 + this.sf[(2 + ta2.x / 6) % 4];
                            n8 = 22;
                            n9 = 3;
                        } else if (n3 == 3 && n6 == 2) {
                            n9 = 8;
                            n10 = 3 * n6 + this.sf[(ta2.x / 6 + 2) % 4];
                            n8 = 0;
                        } else if (n3 == 3 && n6 == 3) {
                            n8 = -26;
                            n10 = this.sf[(2 - -(ta2.x / 6)) % 4] + n6 * 3;
                            n9 = 5;
                        }
                    } else {
                        n10 += 15;
                    }
                }
                if (n6 == 5 && nb.d[n2] != 1) continue;
                int n11 = w.g[n2] + n10;
                int n12 = this.li.Eb[n11];
                int n13 = this.li.qb[n11];
                int n14 = this.li.Eb[w.g[n2]];
                if (n12 == 0 || n13 == 0 || n14 == 0) continue;
                n9 = n9 * arg6 / n13;
                n8 = n8 * arg1 / n12;
                int n15 = n12 * arg1 / n14;
                n8 -= (-arg1 + n15) / 2;
                int n16 = db.l[n2];
                if (n16 == 1) {
                    n16 = this.Dg[ta2.p];
                } else if (n16 == 2) {
                    n16 = this.ei[ta2.q];
                } else if (n16 == 3) {
                    n16 = this.ei[ta2.A];
                }
                int n17 = this.Wh[ta2.H];
                this.li.a(arg5 + n9, n16, n17, bl, arg0, n11, arg6, n15, n8 + arg4, 1);
            }
            if (ta2.I > 0) {
                this.nf[this.Ef] = this.li.a(1, 97, ta2.n) / 2;
                if (this.nf[this.Ef] > 150) {
                    this.nf[this.Ef] = 150;
                }
                this.uf[this.Ef] = this.li.a(1, 72, ta2.n) / 300 * this.li.a(arg2 + 508305332, 1);
                this.tf[this.Ef] = arg1 / 2 + arg4;
                this.ee[this.Ef] = arg5;
                this.Kc[this.Ef++] = ta2.n;
            }
            if (ta2.E > 0) {
                this.je[this.jc] = arg4 - -(arg1 / 2);
                this.pe[this.jc] = arg5;
                this.jd[this.jc] = arg3;
                this.ak[this.jc++] = ta2.j;
            }
            if (ta2.y == 8 || ta2.y == 9 || ta2.d != 0) {
                if (ta2.d > 0) {
                    n4 = arg4;
                    if (ta2.y != 8) {
                        if (ta2.y == 9) {
                            n4 += arg3 * 20 / 100;
                        }
                    } else {
                        n4 -= 20 * arg3 / 100;
                    }
                    n3 = 30 * ta2.B / ta2.G;
                    this.gd[this.Bc] = arg1 / 2 + n4;
                    this.Pk[this.Bc] = arg5;
                    this.bf[this.Bc++] = n3;
                }
                if (ta2.d > 150) {
                    n4 = arg4;
                    if (ta2.y != 8) {
                        if (ta2.y == 9) {
                            n4 += 10 * arg3 / 100;
                        }
                    } else {
                        n4 -= 10 * arg3 / 100;
                    }
                    this.li.b(-1, this.tg + 11, arg6 / 2 + (arg5 - 12), arg1 / 2 + n4 - 12);
                    this.li.a(arg1 / 2 + (n4 - 1), "" + ta2.u, 0xFFFFFF, 0, 3, arg6 / 2 + arg5 + 5);
                }
            }
            if (ta2.J != 1 || ta2.E != 0) break block45;
            n4 = arg0 + (arg4 + arg1 / 2);
            if (ta2.y == 8) {
                n4 -= arg3 * 20 / 100;
            } else if (ta2.y == 9) {
                n4 += 20 * arg3 / 100;
            }
            n3 = arg3 * 16 / 100;
            n2 = 16 * arg3 / 100;
            this.li.f(-(n3 / 2) + n4, -(arg3 * 10 / 100) + (arg5 + -(n2 / 2)), n2, n3, 5924, 13 + this.tg);
        }
    }

    private final ta b(int arg0, byte arg1) {
        if (arg1 != -123) {
            this.Bf = -116;
        }
        for (int i2 = 0; this.de > i2; ++i2) {
            if (arg0 != this.Tb[i2].b) continue;
            return this.Tb[i2];
        }
        return null;
    }

    private final boolean a(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int n2 = this.Hh.a(this.Rg, arg4, (byte)-97, arg7, this.pf, arg1, arg0, arg5, arg6, arg3);
        if (n2 == -1) {
            return false;
        }
        arg1 = this.Rg[--n2];
        arg0 = this.pf[n2];
        if (!arg8) {
            this.Jh.b(187, 0);
        } else {
            this.Jh.b(16, 0);
        }
        if (arg2 <= 3) {
            this.xi = null;
        }
        this.Jh.f.e(393, this.Qg + arg1);
        this.Jh.f.e(393, this.zg + arg0);
        if (arg8 && --n2 == -1 && (this.Qg + arg1) % 5 == 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 >= 0 && i2 > n2 - 25; --i2) {
            this.Jh.f.c(this.Rg[i2] + -arg1, -127);
            this.Jh.f.c(-arg0 + this.pf[i2], 28);
        }
        this.Jh.b(21294);
        this.tj = this.I;
        this.Fd = this.xb;
        this.xh = -24;
        return true;
    }

    private final void a(int arg0, String arg1) {
        if (this.hk == null) {
            return;
        }
        if (this.ne) {
            return;
        }
        if (arg0 >= -43) {
            return;
        }
        int n2 = oa.a(arg1 + ".pcm", (byte)68, this.Uh);
        int n3 = client.a(this.Uh, arg1 + ".pcm", -125);
        if (n3 == 0) {
            return;
        }
        vb vb2 = new vb(8000, v.a(this.Uh, n3, -98, n2), 0, n3);
        this.hk.a(vb2, 100, 256);
    }

    private final void b(String arg0, int arg1) {
        this.Jh.b(arg1, arg1 ^ 0xD8);
        u.a(99, this.Jh.f, arg0);
        this.Jh.b(21294);
    }

    private final void a(int arg0, byte arg1, int arg2) {
        block12: {
            int n2;
            boolean bl;
            block10: {
                int n3;
                int n4;
                int n5;
                block11: {
                    if (arg1 != 9) {
                        this.p((byte)-38);
                    }
                    bl = false;
                    n5 = 0;
                    n4 = this.vf[arg2];
                    for (n3 = 0; n3 < this.mf; ++n3) {
                        if (n4 != this.Qf[n3]) continue;
                        if (fa.e[n4] == 0) {
                            if (arg0 >= 0) {
                                int n6 = n3;
                                this.jj[n6] = this.jj[n6] + arg0;
                                if (this.jj[n3] > this.xe[arg2]) {
                                    this.jj[n3] = this.xe[arg2];
                                }
                                bl = true;
                                continue;
                            }
                            for (n2 = 0; n2 < this.Tk; ++n2) {
                                bl = true;
                                if (this.jj[n3] >= this.xe[arg2]) continue;
                                int n7 = n3;
                                this.jj[n7] = this.jj[n7] + 1;
                            }
                            continue;
                        }
                        ++n5;
                    }
                    n3 = this.b(99, n4);
                    if (n3 <= n5) {
                        bl = true;
                    }
                    if (kb.c[n4] == 1) {
                        bl = true;
                        this.a(false, null, arg1 ^ 9, "This object cannot be traded with other players", 0, 0, null, null);
                    }
                    if (bl) break block10;
                    if (arg0 >= 0) break block11;
                    if (this.mf >= 12) break block10;
                    this.Qf[this.mf] = n4;
                    this.jj[this.mf] = 1;
                    bl = true;
                    ++this.mf;
                    break block10;
                }
                for (n2 = 0; n2 < arg0 && this.mf < 12 && n3 > n5; ++n2) {
                    this.Qf[this.mf] = n4;
                    this.jj[this.mf] = 1;
                    bl = true;
                    ++n5;
                    ++this.mf;
                    if (n2 != 0 || fa.e[n4] != 0) continue;
                    this.jj[this.mf - 1] = arg0 <= this.xe[arg2] ? arg0 : this.xe[arg2];
                    break;
                }
            }
            if (!bl) break block12;
            this.Jh.b(46, 0);
            this.Jh.f.c(this.mf, -41);
            for (n2 = 0; this.mf > n2; ++n2) {
                this.Jh.f.e(393, this.Qf[n2]);
                this.Jh.f.b(arg1 ^ 0xE6CC9F21, this.jj[n2]);
            }
            this.Jh.b(21294);
            this.md = false;
            this.Mi = false;
        }
    }

    private final void b(boolean arg0, byte arg1) {
        block34: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6 = this.li.u - 199;
            int n7 = 36;
            this.li.b(-1, this.tg + 4, 3, n6 - 49);
            int n8 = 196;
            int n9 = 182;
            int n10 = n5 = o.a(160, 9570, 160, 160);
            if (this.Ji != 0) {
                n5 = o.a(220, 9570, 220, 220);
            } else {
                n10 = o.a(220, 9570, 220, 220);
            }
            this.li.c(128, n6, 24, 0, n7, n8 / 2, n10);
            this.li.c(128, n8 / 2 + n6, 24, 0, n7, n8 / 2, n5);
            this.li.c(128, n6, 90, arg1 ^ 0xFFFFFFB6, n7 + 24, n8, o.a(220, 9570, 220, 220));
            this.li.c(128, n6, n9 - 24 - 90, arg1 + 74, 114 + n7, n8, o.a(160, 9570, 160, 160));
            this.li.b(n8, 0, n6, 24 + n7, (byte)70);
            this.li.b(n6 - -(n8 / 2), 0 + n7, 0, 24, 0);
            this.li.b(n8, 0, n6, n7 + 113, (byte)-92);
            if (arg1 != -74) {
                return;
            }
            this.li.a(n8 / 4 + n6, "Magic", 0, arg1 + 74, 4, 16 + n7);
            this.li.a(n6 + n8 / 4 + n8 / 2, "Prayers", 0, 0, 4, 16 + n7);
            if (this.Ji == 0) {
                int n11;
                this.Mc.c((byte)118, this.Ud);
                n4 = 0;
                for (n3 = 0; n3 < fa.b; ++n3) {
                    String string = "@yel@";
                    for (n2 = 0; n2 < o.p[n3]; ++n2) {
                        n11 = oa.d[n3][n2];
                        if (this.a((byte)-70, da.J[n3][n2], n11)) continue;
                        string = "@whi@";
                        break;
                    }
                    if ((n2 = this.oh[6]) < pa.f[n3]) {
                        string = "@bla@";
                    }
                    this.Mc.a(n4++, null, -116, 0, null, string + "Level " + pa.f[n3] + ": " + ja.L[n3], this.Ud);
                }
                this.Mc.a((byte)-92);
                n3 = this.Mc.b(this.Ud, 17050);
                if (n3 != -1) {
                    this.li.a("Level " + pa.f[n3] + ": " + ja.L[n3], 2 + n6, n7 + 124, 0xFFFF00, false, 1);
                    this.li.a(oa.a[n3], 2 + n6, 136 + n7, 0xFFFFFF, false, 0);
                    for (int i2 = 0; i2 < o.p[n3]; ++i2) {
                        n2 = oa.d[n3][i2];
                        this.li.b(-1, ua.Bb[n2] + this.sg, n7 + 150, 2 + n6 + i2 * 44);
                        n11 = this.b(87, n2);
                        int n12 = da.J[n3][i2];
                        String string = "@red@";
                        if (this.a((byte)-70, n12, n2)) {
                            string = "@gre@";
                        }
                        this.li.a(string + n11 + "/" + n12, 2 + (n6 + i2 * 44), n7 + 150, 0xFFFFFF, false, 1);
                    }
                } else {
                    this.li.a("Point at a spell for a description", n6 + 2, n7 + 124, 0, false, 1);
                }
            }
            if (this.Ji == 1) {
                this.Mc.c((byte)90, this.Ud);
                n4 = 0;
                for (n3 = 0; t.g > n3; ++n3) {
                    String string = "@whi@";
                    if (this.cg[5] < ca.B[n3]) {
                        string = "@bla@";
                    }
                    if (this.bk[n3]) {
                        string = "@gre@";
                    }
                    this.Mc.a(n4++, null, -113, 0, null, string + "Level " + ca.B[n3] + ": " + t.h[n3], this.Ud);
                }
                this.Mc.a((byte)-7);
                n3 = this.Mc.b(this.Ud, arg1 + 17124);
                if (n3 == -1) {
                    this.li.a("Point at a prayer for a description", n6 + 2, n7 + 124, 0, false, 1);
                } else {
                    this.li.a(n6 - -(n8 / 2), "Level " + ca.B[n3] + ": " + t.h[n3], 0xFFFF00, 0, 1, n7 + 130);
                    this.li.a(n6 - -(n8 / 2), h.e[n3], 0xFFFFFF, 0, 0, 145 + n7);
                    this.li.a(n6 - -(n8 / 2), "Drain rate: " + fa.c[n3], 0, 0, 1, 160 + n7);
                }
            }
            if (!arg0) {
                return;
            }
            n6 = -this.li.u + 199 + this.I;
            n7 = this.xb - 36;
            if (n6 < 0 || n7 < 0 || n6 >= 196 || n7 >= 182) break block34;
            this.Mc.b(this.Bb, n7 + 36, -9989, this.Qb, n6 + (this.li.u - 199));
            if (n7 <= 24 && this.Cf == 1) {
                if (n6 >= 98 || this.Ji != 1) {
                    if (n6 > 98 && this.Ji == 0) {
                        this.Ji = 1;
                        this.Mc.e(this.Ud, arg1 + 88);
                    }
                } else {
                    this.Ji = 0;
                    this.Mc.e(this.Ud, arg1 + 88);
                }
            }
            if (this.Cf == 1 && this.Ji == 0 && (n4 = this.Mc.b(this.Ud, arg1 + 17124)) != -1) {
                n3 = this.oh[6];
                if (n3 >= pa.f[n4]) {
                    int n13;
                    for (n13 = 0; o.p[n4] > n13; ++n13) {
                        n2 = oa.d[n4][n13];
                        if (this.a((byte)-70, da.J[n4][n13], n2)) continue;
                        this.a(false, null, 0, "You don't have all the reagents you need for this spell", 0, 0, null, null);
                        n13 = -1;
                        break;
                    }
                    if (n13 == o.p[n4]) {
                        this.af = n4;
                        this.Bh = -1;
                    }
                } else {
                    this.a(false, null, arg1 + 74, "Your magic ability is not high enough for this spell", 0, 0, null, null);
                }
            }
            if (this.Cf == 1 && this.Ji == 1 && (n4 = this.Mc.b(this.Ud, 17050)) != -1) {
                n3 = this.cg[5];
                if (n3 < ca.B[n4]) {
                    this.a(false, null, 0, "Your prayer ability is not high enough for this prayer", 0, 0, null, null);
                } else if (this.oh[5] == 0) {
                    this.a(false, null, 0, "You have run out of prayer points. Return to a church to recharge", 0, 0, null, null);
                } else if (!this.bk[n4]) {
                    this.Jh.b(60, 0);
                    this.Jh.f.c(n4, 57);
                    this.Jh.b(21294);
                    this.bk[n4] = true;
                    this.a(-79, "prayeron");
                } else {
                    this.Jh.b(254, 0);
                    this.Jh.f.c(n4, 37);
                    this.Jh.b(21294);
                    this.bk[n4] = false;
                    this.a(-117, "prayeroff");
                }
            }
            this.Cf = 0;
        }
    }

    private final void a(boolean arg0, byte arg1) {
        block9: {
            ta ta2;
            int n2;
            int n3 = this.li.u - 199;
            int n4 = 156;
            int n5 = 152;
            this.li.b(-1, 2 + this.tg, 3, n3 - 49);
            this.li.a(n3 += 40, (byte)-125, 0, 36, n5, n4);
            this.li.a(n3, n4 + n3, 36 + n5, 36, (byte)76);
            if (arg1 <= 119) {
                this.bf = null;
            }
            int n6 = 192 - -this.sd;
            int n7 = 0xFF & this.ug + this.Df;
            int n8 = n6 * (this.wi.i - 6040) * 3 / 2048;
            int n9 = n6 * ((this.wi.K - 6040) * 3) / 2048;
            int n10 = ba.cc[0x3FF & 1024 - 4 * n7];
            int n11 = ba.cc[(0x3FF & -(4 * n7) + 1024) + 1024];
            int n12 = n8 * n11 + n10 * n9 >> 18;
            n9 = -(n8 * n10) + n9 * n11 >> 18;
            n8 = n12;
            this.li.a(this.tg - 1, 36 - (-(n5 / 2) + -n9), n4 / 2 + n3 - n8, 842218000, n6, 0xFF & 64 + n7);
            for (n2 = 0; n2 < this.eh; ++n2) {
                n9 = n6 * (64 + (this.Ug * this.ye[n2] - this.wi.K)) * 3 / 2048;
                n8 = 3 * ((this.Ug * this.Se[n2] - (-64 - -this.wi.i)) * n6) / 2048;
                n12 = n11 * n8 + n9 * n10 >> 18;
                n9 = n11 * n9 + -(n10 * n8) >> 18;
                n8 = n12;
                this.a(65535, n8 + n3 + n4 / 2, (byte)-61, -n9 + 36 - -(n5 / 2));
            }
            for (n2 = 0; n2 < this.Ah; ++n2) {
                n8 = n6 * ((-this.wi.i + (64 + this.Zf[n2] * this.Ug)) * 3) / 2048;
                n9 = n6 * 3 * (-this.wi.K + (64 + this.Ug * this.Ni[n2])) / 2048;
                n12 = n11 * n8 + n10 * n9 >> 18;
                n9 = n11 * n9 + -(n8 * n10) >> 18;
                n8 = n12;
                this.a(0xFF0000, n3 - (-(n4 / 2) + -n8), (byte)-53, n5 / 2 + 36 - n9);
            }
            for (n2 = 0; n2 < this.de; ++n2) {
                ta2 = this.Tb[n2];
                n9 = n6 * ((ta2.K + -this.wi.K) * 3) / 2048;
                n8 = 3 * ((ta2.i + -this.wi.i) * n6) / 2048;
                n12 = n9 * n10 - -(n8 * n11) >> 18;
                n9 = -(n8 * n10) + n11 * n9 >> 18;
                n8 = n12;
                this.a(0xFFFF00, n4 / 2 + (n3 - -n8), (byte)-93, -n9 + n5 / 2 + 36);
            }
            for (n2 = 0; this.Yc > n2; ++n2) {
                ta2 = this.rg[n2];
                n8 = 3 * ((-this.wi.i + ta2.i) * n6) / 2048;
                n9 = n6 * (ta2.K + -this.wi.K) * 3 / 2048;
                n12 = n8 * n11 + n10 * n9 >> 18;
                n9 = n11 * n9 - n8 * n10 >> 18;
                n8 = n12;
                int n13 = 0xFFFFFF;
                String string = w.a(ta2.C, (byte)82);
                if (string != null) {
                    for (int i2 = 0; i2 < n.g; ++i2) {
                        if (!string.equals(w.a(ua.h[i2], (byte)107)) || (Fj[i2] & 2) == 0) continue;
                        n13 = 65280;
                        break;
                    }
                }
                this.a(n13, n8 + (n3 - -(n4 / 2)), (byte)-67, -n9 + 36 - -(n5 / 2));
            }
            this.li.c(255, -1057205208, 2, n5 / 2 + 36, 0xFFFFFF, n3 - -(n4 / 2));
            this.li.a(this.tg + 24, 55, n3 + 19, 842218000, 128, 0xFF & this.ug + 128);
            this.li.a(0, this.Wd, this.Oi + 12, 0, (byte)119);
            if (!arg0) {
                return;
            }
            n3 = 199 + -this.li.u + this.I;
            n2 = this.xb - 36;
            if (n3 < 40 || n2 < 0 || n3 >= 196 || n2 >= 152) break block9;
            n5 = 152;
            n3 = this.li.u - 199;
            n4 = 156;
            n6 = 192 + this.sd;
            n7 = 0xFF & this.ug + this.Df;
            n9 = 16384 * (this.xb - n5 / 2 - 36) / (n6 * 3);
            n8 = 16384 * (this.I + (-(n4 / 2) + -(n3 += 40))) / (n6 * 3);
            n10 = ba.cc[1024 + -(4 * n7) & 0x3FF];
            n11 = ba.cc[1024 + (0x3FF & 1024 + -(4 * n7))];
            n12 = n9 * n10 - -(n11 * n8) >> 15;
            n9 = n11 * n9 - n10 * n8 >> 15;
            n8 = n12;
            n8 += this.wi.i;
            n9 = this.wi.K - n9;
            if (this.Cf == 1) {
                this.a(n9 / 128, n8 / 128, this.sh, this.Lf, false, 8);
            }
            this.Cf = 0;
        }
    }

    private final void k(int arg0) {
        this.li.i = false;
        this.Dc = false;
        this.li.a(true);
        if (this.Xd == 0 || this.Xd == 1 || this.Xd == 2 || this.Xd == 3) {
            int n2 = 2 * this.jk % 3072;
            if (n2 < 1024) {
                this.li.b(-1, this.dg, 10, 0);
                if (n2 > 768) {
                    this.li.a(1 + this.dg, 0, 0, n2 - 768, 10);
                }
            } else if (n2 < 2048) {
                this.li.b(-1, 1 + this.dg, 10, 0);
                if (n2 > 1792) {
                    this.li.a(this.tg + 10, 0, 0, n2 - 1792, 10);
                }
            } else {
                this.li.b(-1, this.tg + 10, 10, 0);
                if (n2 > 2816) {
                    this.li.a(this.dg, 0, 0, n2 - 2816, 10);
                }
            }
        }
        if (arg0 != 2540) {
            this.of = null;
        }
        if (this.Xd == 0) {
            this.ge.a((byte)-63);
        }
        if (this.Xd == 2) {
            String string = this.yi.g(this.Qi, 4);
            if (string != null && string.length() > 0) {
                this.li.c(100, 0, 30, 0, 185, this.Wd, 0);
            }
            this.yi.a((byte)-52);
        }
        this.li.b(-1, this.tg + 22, this.Oi, 0);
        this.li.a(this.Xb, this.Eb, 256, this.K);
    }

    private final void b(boolean arg0, int arg1) {
        block41: {
            int n2;
            int n3;
            ta ta2;
            int n4 = this.zh.a(-110, arg1);
            int n5 = this.zh.a(true, arg1);
            int n6 = this.zh.a((byte)97, arg1);
            int n7 = this.zh.a(arg1, (byte)22);
            int n8 = this.zh.a(arg1, arg0);
            int n9 = this.zh.b(true, arg1);
            String string = this.zh.c(arg1, -4126);
            if (n4 == 200) {
                this.a((byte)10, this.sh, n6, n5, true, this.Lf);
                this.Jh.b(249, 0);
                this.Jh.f.e(393, n5 + this.Qg);
                this.Jh.f.e(393, n6 + this.zg);
                this.Jh.f.e(393, n7);
                this.Jh.f.e(393, n8);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 210) {
                this.a((byte)10, this.sh, n6, n5, true, this.Lf);
                this.Jh.b(53, 0);
                this.Jh.f.e(393, this.Qg + n5);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.f.e(393, n7);
                this.Jh.f.e(393, n8);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 220) {
                this.a((byte)10, this.sh, n6, n5, true, this.Lf);
                this.Jh.b(247, 0);
                this.Jh.f.e(393, n5 - -this.Qg);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.f.e(393, n7);
                this.Jh.b(21294);
            }
            if (n4 == 3600 || n4 == 3200) {
                this.a(false, null, 0, ga.b[n5], 0, 0, null, null);
            }
            if (n4 == 300) {
                this.a(false, n5, n6, n7);
                this.Jh.b(180, 0);
                this.Jh.f.e(393, this.Qg + n5);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.f.c(n7, 110);
                this.Jh.f.e(393, n8);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 310) {
                this.a(false, n5, n6, n7);
                this.Jh.b(161, 0);
                this.Jh.f.e(393, n5 + this.Qg);
                this.Jh.f.e(393, n6 - -this.zg);
                this.Jh.f.c(n7, -110);
                this.Jh.f.e(393, n8);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 320) {
                this.a(arg0, n5, n6, n7);
                this.Jh.b(14, 0);
                this.Jh.f.e(393, n5 + this.Qg);
                this.Jh.f.e(393, n6 - -this.zg);
                this.Jh.f.c(n7, 54);
                this.Jh.b(21294);
            }
            if (n4 == 2300) {
                this.a(false, n5, n6, n7);
                this.Jh.b(127, 0);
                this.Jh.f.e(393, this.Qg + n5);
                this.Jh.f.e(393, n6 + this.zg);
                this.Jh.f.c(n7, -60);
                this.Jh.b(21294);
            }
            if (n4 == 3300) {
                this.a(false, null, 0, ub.b[n5], 0, 0, null, null);
            }
            if (n4 == 400) {
                this.b(5126, n8, n5, n6, n7);
                this.Jh.b(99, 0);
                this.Jh.f.e(393, n5 - -this.Qg);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.f.e(393, n9);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 410) {
                this.b(5126, n8, n5, n6, n7);
                this.Jh.b(115, 0);
                this.Jh.f.e(393, n5 + this.Qg);
                this.Jh.f.e(393, n6 + this.zg);
                this.Jh.f.e(393, n9);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 420) {
                this.b(5126, n8, n5, n6, n7);
                this.Jh.b(136, 0);
                this.Jh.f.e(393, this.Qg + n5);
                this.Jh.f.e(393, n6 + this.zg);
                this.Jh.b(21294);
            }
            if (n4 == 2400) {
                this.b(5126, n8, n5, n6, n7);
                this.Jh.b(79, 0);
                this.Jh.f.e(393, this.Qg + n5);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.b(21294);
            }
            if (n4 == 3400) {
                this.a(false, null, 0, la.f[n5], 0, 0, null, null);
            }
            if (n4 == 600) {
                this.Jh.b(4, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 610) {
                this.Jh.b(91, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 620) {
                this.Jh.b(170, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 630) {
                this.Jh.b(169, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 640) {
                this.Jh.b(90, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 650) {
                this.Bh = n5;
                this.qc = 0;
                this.ig = ac.x[this.vf[this.Bh]];
            }
            if (n4 == 660) {
                this.Jh.b(246, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
                this.qc = 0;
                this.Bh = -1;
                this.a(false, null, 0, "Dropping " + ac.x[this.vf[n5]], 7, 0, null, null);
            }
            if (n4 == 700) {
                ta2 = this.b(n5, (byte)-123);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(50, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 710) {
                ta2 = this.b(n5, (byte)-123);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(135, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 720) {
                ta2 = this.b(n5, (byte)-123);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(153, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 725) {
                ta2 = this.b(n5, (byte)-123);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(202, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 2715 || n4 == 715) {
                ta2 = this.b(n5, (byte)-123);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(190, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 3700) {
                this.a(false, null, 0, ba.ac[n5], 0, 0, null, null);
            }
            if (n4 == 800) {
                ta2 = this.d(n5, 220);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(229, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 810) {
                ta2 = this.d(n5, 220);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(113, 0);
                this.Jh.f.e(393, n5);
                this.Jh.f.e(393, n6);
                this.Jh.b(21294);
                this.Bh = -1;
            }
            if (n4 == 2805 || n4 == 805) {
                ta2 = this.d(n5, 220);
                n3 = (ta2.i - 64) / this.Ug;
                n2 = (ta2.K - 64) / this.Ug;
                this.a(n2, n3, this.sh, this.Lf, true, 8);
                this.Jh.b(171, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 2806) {
                this.Jh.b(103, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 2810) {
                this.Jh.b(142, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 2820) {
                this.Jh.b(165, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
            }
            if (n4 == 2833) {
                this.Cb = "";
                this.Vf = 1;
                this.e = string;
            }
            if (n4 == 2831) {
                this.b(97, string);
            }
            if (n4 == 2832) {
                this.a(string, (byte)5);
            }
            if (n4 == 2830) {
                this.Qd = string;
                this.x = "";
                this.Bj = 2;
                this.Ob = "";
            }
            if (n4 == 900) {
                this.a(n6, n5, this.sh, this.Lf, true, 8);
                this.Jh.b(158, 0);
                this.Jh.f.e(393, n5 + this.Qg);
                this.Jh.f.e(393, this.zg + n6);
                this.Jh.f.e(393, n7);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 == 920) {
                this.a(n6, n5, this.sh, this.Lf, false, 8);
                if (this.xh == -24) {
                    this.xh = 24;
                }
            }
            if (n4 == 1000) {
                this.Jh.b(137, 0);
                this.Jh.f.e(393, n5);
                this.Jh.b(21294);
                this.af = -1;
            }
            if (n4 != 4000) break block41;
            this.af = -1;
            this.Bh = -1;
        }
    }

    private final void b(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int n2;
        int n3;
        if (arg0 != 5126) {
            this.b(true, (byte)-25);
        }
        if (arg4 == 0 || arg4 == 4) {
            n3 = ub.g[arg1];
            n2 = f.f[arg1];
        } else {
            n2 = ub.g[arg1];
            n3 = f.f[arg1];
        }
        if (mb.a[arg1] != 2 && mb.a[arg1] != 3) {
            this.a(arg2, true, this.Lf, arg3, this.sh, n2 - 1 + arg2, true, arg3 - -n3 - 1, -59);
        } else {
            if (arg4 == 0) {
                ++n2;
                --arg2;
            }
            if (arg4 == 2) {
                ++n3;
            }
            if (arg4 == 6) {
                --arg3;
                ++n3;
            }
            if (arg4 == 4) {
                ++n2;
            }
            this.a(arg2, true, this.Lf, arg3, this.sh, n2 + (arg2 - 1), false, n3 + arg3 - 1, -14);
        }
    }

    private final void y(int arg0) {
        int n2;
        int n3 = 0;
        int n4 = 50;
        int n5 = 50;
        this.Hh.a(48 * n4 + 23, (byte)-90, 48 * n5 + 23, n3);
        this.Hh.a(this.kh, (byte)-113);
        int n6 = 9728;
        int n7 = 1100;
        int n8 = 6400;
        this.Ek.Mb = 4100;
        this.Ek.X = 4100;
        int n9 = 888;
        this.Ek.P = 1;
        this.Ek.G = 4000;
        this.Ek.a(n6, n8, n7 * 2, 912, -12349, n9, -this.Hh.f(n6, n8, 73), 0);
        this.Ek.c(-124);
        if (arg0 >= -48) {
            this.wi = null;
        }
        this.li.b(0xF8F8F9);
        this.li.b(0xF8F8F9);
        this.li.a(0, (byte)65, 0, 0, 6, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, n2, 0, 0xFF7000, 512, 0);
        }
        this.li.a(0, (byte)-104, 0, 194, 20, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, 194 - n2, 0, 0xFF7000, 512, 0);
        }
        this.li.b(-1, this.tg + 10, 15, 15);
        this.li.d(this.dg, 200, 123, 512, 0, 0);
        this.li.a(false, this.dg);
        n8 = 9216;
        n9 = 888;
        n7 = 1100;
        n6 = 9216;
        this.Ek.Mb = 4100;
        this.Ek.P = 1;
        this.Ek.G = 4000;
        this.Ek.X = 4100;
        this.Ek.a(n6, n8, 2 * n7, 912, -12349, n9, -this.Hh.f(n6, n8, 117), 0);
        this.Ek.c(-114);
        this.li.b(0xF8F8F9);
        this.li.b(0xF8F8F9);
        this.li.a(0, (byte)59, 0, 0, 6, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, n2, 0, 0xFF7000, 512, 0);
        }
        this.li.a(0, (byte)-128, 0, 194, 20, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, -n2 + 194, 0, 0xFF7000, 512, 0);
        }
        this.li.b(-1, 10 + this.tg, 15, 15);
        this.li.d(1 + this.dg, 200, 124, 512, 0, 0);
        this.li.a(false, 1 + this.dg);
        n7 = 500;
        n9 = 376;
        n6 = 11136;
        n8 = 10368;
        for (n2 = 0; n2 < 64; ++n2) {
            this.Ek.a(this.Hh.db[0][n2], -1);
            this.Ek.a(this.Hh.g[1][n2], -1);
            this.Ek.a(this.Hh.db[1][n2], -1);
            this.Ek.a(this.Hh.g[2][n2], -1);
            this.Ek.a(this.Hh.db[2][n2], -1);
        }
        this.Ek.Mb = 4100;
        this.Ek.G = 4000;
        this.Ek.P = 1;
        this.Ek.X = 4100;
        this.Ek.a(n6, n8, n7 * 2, 912, -12349, n9, -this.Hh.f(n6, n8, 115), 0);
        this.Ek.c(-111);
        this.li.b(0xF8F8F9);
        this.li.b(0xF8F8F9);
        this.li.a(0, (byte)84, 0, 0, 6, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, n2, 0, 0xFF7000, 512, 0);
        }
        this.li.a(0, (byte)-107, 0, 194, 20, 512);
        for (n2 = 6; n2 >= 1; --n2) {
            this.li.a(8, n2, 194, 0, 0xFF7000, 512, 0);
        }
        this.li.b(-1, 10 + this.tg, 15, 15);
        this.li.d(this.tg + 10, 200, 120, 512, 0, 0);
        this.li.a(false, this.tg + 10);
    }

    private final void d(byte arg0) {
        if (arg0 != 120) {
            this.pj = 99;
        }
        this.li.a(126, (byte)52, 0, 137, 60, 260);
        this.li.e(126, 260, 137, 27785, 60, 0xFFFFFF);
        this.li.a(256, "Logging out...", 0xFFFFFF, 0, 5, 173);
    }

    private final void D(int arg0) {
        block16: {
            if (this.qc == 0 && this.li.u - 35 <= this.I && this.xb >= 3 && this.I < this.li.u - 3 && this.xb < 35) {
                this.qc = 1;
            }
            if (this.qc == 0 && this.li.u - 35 - 33 <= this.I && this.xb >= 3 && this.li.u - 3 - 33 > this.I && this.xb < 35) {
                this.qc = 2;
                this.Df = (int)(13.0 * Math.random()) - 6;
                this.sd = (int)(Math.random() * 23.0) - 11;
            }
            if (this.qc == 0 && this.li.u - 101 <= this.I && this.xb >= 3 && this.I < this.li.u - 3 - 66 && this.xb < 35) {
                this.qc = 3;
            }
            if (this.qc == 0 && this.li.u - 99 - 35 <= this.I && this.xb >= 3 && this.li.u - 3 - 99 > this.I && this.xb < 35) {
                this.qc = 4;
            }
            if (this.qc == 0 && this.li.u - 35 - 132 <= this.I && this.xb >= 3 && this.I < this.li.u - 135 && this.xb < 35) {
                this.qc = 5;
            }
            if (arg0 != 1) {
                this.Lf = -32;
            }
            if (this.qc == 0 && this.I >= this.li.u - 35 - 165 && this.xb >= 3 && this.I < this.li.u - 165 - 3 && this.xb < 35) {
                this.qc = 6;
            }
            if (this.qc != 0 && this.li.u - 35 <= this.I && this.xb >= 3 && this.I < this.li.u - 3 && this.xb < 26) {
                this.qc = 1;
            }
            if (this.qc != 0 && this.qc != 2 && this.I >= this.li.u - 68 && this.xb >= 3 && this.I < this.li.u - 33 - 3 && this.xb < 26) {
                this.qc = 2;
                this.sd = (int)(23.0 * Math.random()) - 11;
                this.Df = (int)(13.0 * Math.random()) - 6;
            }
            if (this.qc != 0 && this.li.u - 66 - 35 <= this.I && this.xb >= 3 && this.li.u - 3 - 66 > this.I && this.xb < 26) {
                this.qc = 3;
            }
            if (this.qc != 0 && this.li.u - 35 - 99 <= this.I && this.xb >= 3 && this.li.u - 102 > this.I && this.xb < 26) {
                this.qc = 4;
            }
            if (this.qc != 0 && this.I >= this.li.u - 167 && this.xb >= 3 && this.li.u - 132 - 3 > this.I && this.xb < 26) {
                this.qc = 5;
            }
            if (this.qc != 0 && this.I >= this.li.u - 35 - 165 && this.xb >= 3 && this.li.u - 168 > this.I && this.xb < 26) {
                this.qc = 6;
            }
            if (this.qc == 1 && (this.I < this.li.u - 248 || this.xb > 36 - -(34 * (this.cl / 5)))) {
                this.qc = 0;
            }
            if (this.qc == 3 && (this.I < this.li.u - 199 || this.xb > 316)) {
                this.qc = 0;
            }
            if (!(this.qc != 2 && this.qc != 4 && this.qc != 5 || this.li.u - 199 <= this.I && this.xb <= 240)) {
                this.qc = 0;
            }
            if (this.qc != 6 || this.li.u - 199 <= this.I && this.xb <= 311) break block16;
            this.qc = 0;
        }
    }

    static final String a(int arg0, tb arg1, int arg2) {
        try {
            int n2 = arg1.b((byte)68);
            if (arg2 < n2) {
                n2 = arg2;
            }
            byte[] byArray = new byte[n2];
            arg1.w += fb.a.a(arg1.F, byArray, arg0, arg1.w, -1, n2);
            String string = ga.a(n2, arg0 ^ 0xFFFFFF84, 0, byArray);
            return string;
        }
        catch (Exception exception) {
            return "Cabbage";
        }
    }

    private final void l(int arg0) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        for (n9 = 0; n9 < this.Ef; ++n9) {
            n8 = this.li.a(508305352, 1);
            n7 = this.tf[n9];
            n6 = this.ee[n9];
            n5 = this.nf[n9];
            n4 = this.uf[n9];
            n3 = 1;
            while (n3 != 0) {
                n3 = 0;
                for (n2 = 0; n9 > n2; ++n2) {
                    if (n6 - -n4 <= this.ee[n2] + -n8 || this.ee[n2] - -this.uf[n2] <= n6 + -n8 || n7 + -n5 >= this.tf[n2] - -this.nf[n2] || n5 + n7 <= this.tf[n2] - this.nf[n2] || n6 <= -n4 + this.ee[n2] - n8) continue;
                    n6 = this.ee[n2] - (n8 - -n4);
                    n3 = 1;
                }
            }
            this.ee[n9] = n6;
            this.li.a(300, this.Kc[n9], n7, 55, 1, n6, false, 0xFFFF00);
        }
        if (arg0 != 2) {
            this.ak = null;
        }
        for (n9 = 0; this.jc > n9; ++n9) {
            n8 = this.je[n9];
            n7 = this.pe[n9];
            n6 = this.jd[n9];
            n5 = this.ak[n9];
            n4 = 39 * n6 / 100;
            n3 = n6 * 27 / 100;
            n2 = n7 - n3;
            this.li.a(this.tg + 9, (byte)-122, n3, -(n4 / 2) + n8, n4, n2, 85);
            int n10 = n6 * 36 / 100;
            int n11 = 24 * n6 / 100;
            this.li.a(n2 - (-(n3 / 2) - -(n11 / 2)), h.c[n5], 0, false, 0, ua.Bb[n5] - -this.sg, n11, n10, n8 + -(n10 / 2), 1);
        }
        for (n9 = 0; this.Bc > n9; ++n9) {
            n8 = this.gd[n9];
            n7 = this.Pk[n9];
            n6 = this.bf[n9];
            this.li.c(192, n8 - 15, 5, 0, n7 - 3, n6, 65280);
            this.li.c(192, n6 - 15 + n8, 5, 0, n7 - 3, 30 + -n6, 0xFF0000);
        }
    }

    private final void m(int arg0) {
        block2: {
            this.Hh.gb = this.a("map", 70, 4, 66);
            if (this.Pg) {
                this.Hh.m = this.a("members map", 75, 5, 76);
            }
            this.Hh.Q = this.a("landscape", 80, 6, 54);
            if (arg0 != 5359) {
                this.a(93, (byte)102, -18);
            }
            if (!this.Pg) break block2;
            this.Hh.I = this.a("members landscape", 85, 7, arg0 ^ 0x14A3);
        }
    }

    private final void q(byte arg0) {
        if ((this.si & 1) == 1 && this.b((byte)90, this.si)) {
            return;
        }
        if ((1 & this.si) == 0 && this.b((byte)113, this.si)) {
            if (!this.b((byte)-127, 1 + this.si & 7)) {
                if (this.b((byte)22, 7 & 7 + this.si)) {
                    this.si = 7 & 7 + this.si;
                }
            } else {
                this.si = 7 & 1 + this.si;
            }
            return;
        }
        int[] nArray = new int[]{1, -1, 2, -2, 3, -3, 4};
        if (arg0 <= 7) {
            return;
        }
        for (int i2 = 0; i2 < 7; ++i2) {
            if (!this.b((byte)51, 7 & 8 + this.si + nArray[i2])) continue;
            this.si = 7 & this.si - -nArray[i2] + 8;
            break;
        }
        if ((1 & this.si) == 0 && this.b((byte)91, this.si)) {
            if (this.b((byte)29, 7 & 1 + this.si)) {
                this.si = 1 + this.si & 7;
            } else if (this.b((byte)-125, 7 + this.si & 7)) {
                this.si = 7 & 7 + this.si;
            }
            return;
        }
    }

    private final void h(int arg0) {
        block20: {
            String string;
            int n2;
            int n3 = 22;
            int n4 = 36;
            this.li.a(n3, (byte)-108, 192, n4, 16, 468);
            int n5 = 0x989898;
            this.li.c(160, n3, 246, 0, n4 + 16, 468, n5);
            this.li.a(n3 + 234, "Please confirm your duel with @yel@" + this.Uc, 0xFFFFFF, 0, 1, n4 + 12);
            this.li.a(n3 + 117, "Your stake:", 0xFFFF00, 0, 1, n4 + 30);
            for (n2 = 0; this.Nj > n2; ++n2) {
                string = ac.x[this.xi[n2]];
                if (fa.e[this.xi[n2]] == 0) {
                    string = string + " x " + mb.a(this.th[n2], 131071);
                }
                this.li.a(n3 + 117, string, 0xFFFFFF, 0, 1, 42 + (n4 - -(12 * n2)));
            }
            if (arg0 > -10) {
                return;
            }
            if (this.Nj == 0) {
                this.li.a(n3 + 117, "Nothing!", 0xFFFFFF, 0, 1, 42 + n4);
            }
            this.li.a(351 + n3, "Your opponent's stake:", 0xFFFF00, 0, 1, 30 + n4);
            for (n2 = 0; n2 < this.Ve; ++n2) {
                string = ac.x[this.xj[n2]];
                if (fa.e[this.xj[n2]] == 0) {
                    string = string + " x " + mb.a(this.kf[n2], 131071);
                }
                this.li.a(n3 + 351, string, 0xFFFFFF, 0, 1, n2 * 12 + 42 + n4);
            }
            if (this.Ve == 0) {
                this.li.a(351 + n3, "Nothing!", 0xFFFFFF, 0, 1, 42 + n4);
            }
            if (this.Sh == 0) {
                this.li.a(n3 + 234, "You can retreat from this duel", 65280, 0, 1, n4 + 180);
            } else {
                this.li.a(234 + n3, "No retreat is possible!", 0xFF0000, 0, 1, 180 + n4);
            }
            if (this.gh == 0) {
                this.li.a(234 + n3, "Magic may be used", 65280, 0, 1, n4 + 192);
            } else {
                this.li.a(n3 + 234, "Magic cannot be used", 0xFF0000, 0, 1, 192 + n4);
            }
            if (this.Cc == 0) {
                this.li.a(n3 + 234, "Prayer may be used", 65280, 0, 1, 204 + n4);
            } else {
                this.li.a(n3 + 234, "Prayer cannot be used", 0xFF0000, 0, 1, n4 + 204);
            }
            if (this.Rc != 0) {
                this.li.a(n3 + 234, "Weapons cannot be used", 0xFF0000, 0, 1, 216 + n4);
            } else {
                this.li.a(n3 + 234, "Weapons may be used", 65280, 0, 1, n4 + 216);
            }
            this.li.a(n3 + 234, "If you are sure click 'Accept' to begin the duel", 0xFFFFFF, 0, 1, n4 + 230);
            if (!this.Cd) {
                this.li.b(-1, this.tg + 25, 238 + n4, 83 + n3);
                this.li.b(-1, 26 + this.tg, n4 + 238, n3 - 35 + 352);
            } else {
                this.li.a(n3 + 234, "Waiting for other player...", 0xFFFF00, 0, 1, n4 + 250);
            }
            if (this.Cf != 1) break block20;
            if (this.I < n3 || n4 > this.xb || this.I > n3 + 468 || 262 + n4 < this.xb) {
                this.dd = false;
                this.Jh.b(230, 0);
                this.Jh.b(21294);
            }
            if (118 + n3 - 35 <= this.I && n3 + 118 + 70 >= this.I && this.xb >= n4 + 238 && this.xb <= 238 + n4 + 21) {
                this.Cd = true;
                this.Jh.b(77, 0);
                this.Jh.b(21294);
            }
            if (352 + (n3 - 35) <= this.I && this.I <= 353 + n3 + 70 && this.xb >= n4 + 238 && 259 + n4 >= this.xb) {
                this.dd = false;
                this.Jh.b(197, 0);
                this.Jh.b(21294);
            }
            this.Cf = 0;
        }
    }

    private final void G(int arg0) {
        if (this.Cf != 0) {
            for (int i2 = 0; this.Id > i2; ++i2) {
                if (this.I >= this.li.a(1, 89, this.ah[i2]) || this.xb <= 12 * i2 || this.xb >= 12 - -(12 * i2)) continue;
                this.Jh.b(116, 0);
                this.Jh.f.c(i2, 115);
                this.Jh.b(21294);
                break;
            }
            this.Ph = false;
            this.Cf = 0;
            return;
        }
        int n2 = 0;
        if (arg0 != -312) {
            this.a(9, 21);
        }
        while (n2 < this.Id) {
            int n3 = 65535;
            if (this.I < this.li.a(1, 125, this.ah[n2]) && this.xb > 12 * n2 && this.xb < n2 * 12 + 12) {
                n3 = 0xFF0000;
            }
            this.li.a(this.ah[n2], 6, n2 * 12 + 12, n3, false, 1);
            ++n2;
        }
    }

    private final void F(int arg0) {
        block16: {
            this.Af.b(this.Bb, this.xb, -9989, this.Qb, this.I);
            if (this.Af.a((byte)-120, this.Dj)) {
                do {
                    this.Vd = (na.e + (this.Vd - 1)) % na.e;
                } while ((3 & n.m[this.Vd]) != 1 || (n.m[this.Vd] & 4 * this.Sf) == 0);
            }
            if (this.Af.a((byte)-118, this.pi)) {
                do {
                    this.Vd = (1 + this.Vd) % na.e;
                } while ((3 & n.m[this.Vd]) != 1 || (n.m[this.Vd] & 4 * this.Sf) == 0);
            }
            if (this.Af.a((byte)-111, this.Kj)) {
                this.ld = (this.Dg.length + (this.ld - 1)) % this.Dg.length;
            }
            if (this.Af.a((byte)-109, this.ed)) {
                this.ld = (1 + this.ld) % this.Dg.length;
            }
            if (this.Af.a((byte)-118, this.Ge) || this.Af.a((byte)-117, this.Of)) {
                this.Sf = -this.Sf + 3;
                while ((3 & n.m[this.Vd]) != 1 || (n.m[this.Vd] & 4 * this.Sf) == 0) {
                    this.Vd = (1 + this.Vd) % na.e;
                }
                while ((3 & n.m[this.dk]) != 2 || (this.Sf * 4 & n.m[this.dk]) == 0) {
                    this.dk = (this.dk + 1) % na.e;
                }
            }
            if (arg0 < 68) {
                this.c(113, -28);
            }
            if (this.Af.a((byte)-123, this.Xc)) {
                this.Wg = (this.Wg - 1 + this.ei.length) % this.ei.length;
            }
            if (this.Af.a((byte)-102, this.ek)) {
                this.Wg = (this.Wg + 1) % this.ei.length;
            }
            if (this.Af.a((byte)-127, this.Ze)) {
                this.hh = (this.Wh.length + (this.hh - 1)) % this.Wh.length;
            }
            if (this.Af.a((byte)-102, this.Mj)) {
                this.hh = (1 + this.hh) % this.Wh.length;
            }
            if (this.Af.a((byte)-101, this.Re)) {
                this.Lh = (this.ei.length + this.Lh - 1) % this.ei.length;
            }
            if (this.Af.a((byte)-122, this.Ai)) {
                this.Lh = (1 + this.Lh) % this.ei.length;
            }
            if (!this.Af.a((byte)-118, this.Eg)) break block16;
            this.Jh.b(235, 0);
            this.Jh.f.c(this.Sf, -41);
            this.Jh.f.c(this.Vd, -82);
            this.Jh.f.c(this.dk, -109);
            this.Jh.f.c(this.wg, -123);
            this.Jh.f.c(this.ld, 36);
            this.Jh.f.c(this.Wg, 63);
            this.Jh.f.c(this.Lh, -113);
            this.Jh.f.c(this.hh, -63);
            this.Jh.b(21294);
            this.li.a(true);
            this.Kg = false;
        }
    }

    private final boolean a(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        int n2 = this.Hh.a(this.Rg, arg0, (byte)-69, arg7, this.pf, arg2, arg4, arg5, arg3, arg6);
        if (n2 == -1) {
            if (!arg1) {
                return false;
            }
            n2 = 1;
            this.Rg[0] = arg0;
            this.pf[0] = arg3;
        }
        arg4 = this.pf[--n2];
        arg2 = this.Rg[n2];
        --n2;
        if (!arg1) {
            this.Jh.b(187, 0);
        } else {
            this.Jh.b(16, 0);
        }
        this.Jh.f.e(393, this.Qg + arg2);
        this.Jh.f.e(393, arg4 - -this.zg);
        if (arg1 && n2 == -1 && (arg2 + this.Qg) % 5 == 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 >= 0 && n2 - 25 < i2; --i2) {
            this.Jh.f.c(-arg2 + this.Rg[i2], -75);
            this.Jh.f.c(-arg4 + this.pf[i2], 112);
        }
        this.Jh.b(21294);
        this.Fd = this.xb;
        this.tj = this.I;
        this.xh = -24;
        return true;
    }

    @Override
    final void a(int arg0, Runnable arg1) {
        pa.k.a(true, arg1, arg0);
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        block2: {
            int n2;
            if (arg6 != 2) {
                this.Dc = true;
            }
            int n3 = this.Oc[arg4];
            int n4 = this.oe[arg4];
            if (n3 == 0) {
                n2 = 255 - -(n4 * 1280);
                this.li.c(-(5 * n4) + 255, -1057205208, 20 + n4 * 2, arg3 / 2 + arg2, n2, arg1 - -(arg5 / 2));
            }
            if (n3 != 1) break block2;
            n2 = 0xFF0000 + 1280 * n4;
            this.li.c(255 + -(5 * n4), -1057205208, n4 + 10, arg2 - -(arg3 / 2), n2, arg1 + arg5 / 2);
        }
    }

    private final void a(int arg0, int arg1, byte arg2) {
        int n2;
        int n3;
        int n4 = this.Uf[arg0];
        int n5 = n3 = arg1 >= 0 ? arg1 : this.Tk;
        if (fa.e[n4] == 0) {
            int n6 = arg0;
            this.df[n6] = this.df[n6] - n3;
            if (this.df[arg0] <= 0) {
                --this.Ke;
                for (n2 = arg0; this.Ke > n2; ++n2) {
                    this.Uf[n2] = this.Uf[n2 + 1];
                    this.df[n2] = this.df[n2 + 1];
                }
            }
        } else {
            n2 = 0;
            for (int i2 = 0; this.Ke > i2 && n3 > n2; ++i2) {
                if (this.Uf[i2] != n4) continue;
                --this.Ke;
                ++n2;
                for (int i3 = i2; this.Ke > i3; ++i3) {
                    this.Uf[i3] = this.Uf[1 + i3];
                    this.df[i3] = this.df[1 + i3];
                }
                --i2;
            }
        }
        if (arg2 != -78) {
            return;
        }
        this.Jh.b(33, 0);
        this.Jh.f.c(this.Ke, -79);
        for (n2 = 0; this.Ke > n2; ++n2) {
            this.Jh.f.e(arg2 ^ 0xFFFFFE3B, this.Uf[n2]);
            this.Jh.f.b(-422797528, this.df[n2]);
        }
        this.Jh.b(arg2 + 21372);
        this.ke = false;
        this.ki = false;
    }

    private final ca a(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n2 = arg3;
        int n3 = arg1;
        int n4 = arg3;
        int n5 = arg1;
        int n6 = v.a[arg2];
        int n7 = Jk[arg2];
        int n8 = ib.d[arg2];
        ca ca2 = new ca(4, 1);
        if (arg4 == 1) {
            n5 = 1 + arg1;
        }
        if (arg4 == 0) {
            n4 = arg3 + 1;
        }
        if (arg4 == 2) {
            n5 = 1 + arg1;
            n2 = 1 + arg3;
        }
        n2 *= this.Ug;
        if (arg4 == 3) {
            n5 = 1 + arg1;
            n4 = arg3 + 1;
        }
        n4 *= this.Ug;
        n5 *= this.Ug;
        int n9 = ca2.e(n2, n3 *= this.Ug, -this.Hh.f(n2, n3, -35), -126);
        int n10 = ca2.e(n2, n3, -this.Hh.f(n2, n3, -103) - n8, -126);
        if (!arg0) {
            this.a(119, 67, 26, 106, false, -100);
        }
        int n11 = ca2.e(n4, n5, -n8 + -this.Hh.f(n4, n5, -77), -112);
        int n12 = ca2.e(n4, n5, -this.Hh.f(n4, n5, 96), 117);
        int[] nArray = new int[]{n9, n10, n11, n12};
        ca2.a(4, nArray, n6, n7, false);
        ca2.a(-50, 60, -10, -50, false, 24, -95);
        if (arg3 >= 0 && arg1 >= 0 && arg3 < 96 && arg1 < 96) {
            this.Ek.a(ca2, (byte)118);
        }
        ca2.rb = arg5 + 10000;
        return ca2;
    }

    private final void o(byte arg0) {
        this.x = "";
        if (arg0 != -49) {
            this.Nc = 13;
        }
        this.Ob = "";
    }

    @Override
    final void a(int arg0, int arg1, int arg2, int arg3) {
        this.Kk[this.nk] = arg0;
        this.uj[this.nk] = arg3;
        this.nk = this.nk + 1 & 0x1FFF;
        if (arg1 <= 87) {
            this.oh = null;
        }
        block0: for (int i2 = 10; i2 < 4000; ++i2) {
            int n2 = 0x1FFF & this.nk - i2;
            if (this.Kk[n2] != arg0 || this.uj[n2] != arg3) continue;
            boolean bl = false;
            for (int i3 = 1; i3 < i2; ++i3) {
                int n3 = -i3 + this.nk & 0x1FFF;
                int n4 = 0x1FFF & -i3 + n2;
                if (arg0 != this.Kk[n4] || this.uj[n4] != arg3) {
                    bl = true;
                }
                if (this.Kk[n3] != this.Kk[n4] || this.uj[n3] != this.uj[n4]) continue block0;
                if (i2 - 1 != i3 || !bl || this.ai != 0 || this.bj != 0) continue;
                this.B(0);
                return;
            }
        }
    }

    private final void z(int arg0) {
        int n2;
        this.Yb = 0;
        boolean bl = true;
        if (this.I >= 36 && this.I < 176) {
            this.Yb = 1;
        } else if (this.I >= 186 && this.I < 326) {
            this.Yb = 7;
        } else if (this.I < 336 || this.I >= 476) {
            bl = false;
        } else {
            this.Yb = 12;
        }
        int n3 = 156;
        if (bl) {
            bl = false;
            for (n2 = 0; n2 < 6; ++n2) {
                int n4;
                int n5 = n4 = n2 == 0 ? 30 : 18;
                if (this.xb > n3 - 12 && n4 + n3 - 12 > this.xb) {
                    if (this.Yb == 1) {
                        bl = true;
                        this.Yb += n2;
                        break;
                    }
                    if (this.Yb == 7) {
                        if (n2 >= 5) break;
                        bl = true;
                        this.Yb += n2;
                        break;
                    }
                    if (this.Yb == 12) {
                        if (n2 >= 3) break;
                        bl = true;
                        this.Yb += n2;
                        break;
                    }
                }
                n3 += 2 + n4;
            }
        }
        if (!bl) {
            this.Yb = 0;
        }
        if (this.Cf != 0 && this.Yb != 0) {
            this.Jh.b(206, arg0 + 28949);
            this.Jh.f.a(this.ec, 113);
            this.Jh.f.c(this.Yb, 74);
            this.Jh.f.c(this.ue ? 1 : 0, -68);
            this.Jh.b(arg0 ^ 0xFFFFDDC5);
            this.Vf = 0;
            this.Cb = "";
            this.e = "";
            this.Cf = 0;
            return;
        }
        n3 += 15;
        if (this.Cf != 0) {
            this.Cf = 0;
            if (this.I < 31 || this.xb < 35 || this.I > 481 || this.xb > 310) {
                this.Vf = 0;
                return;
            }
            if (this.I > 66 && this.I < 446 && n3 - 15 <= this.xb && this.xb < n3 + 5) {
                this.Vf = 0;
                return;
            }
        }
        this.li.a(31, (byte)-110, 0, 35, 275, 450);
        this.li.e(31, 450, 35, 27785, 275, 0xFFFFFF);
        n3 = 50;
        this.li.a(256, "This form is for reporting players who are breaking our rules", 0xFFFFFF, 0, 1, n3);
        this.li.a(256, "Using it sends a snapshot of the last 60 seconds of activity to us", 0xFFFFFF, arg0 + 28949, 1, n3 += 15);
        this.li.a(256, "If you misuse this form, you will be banned.", 0xFF8000, 0, 1, n3 += 15);
        n3 += 15;
        this.li.a(256, "Click on the most suitable option from the Rules of RuneScape.", 0xFFFF00, 0, 1, n3 += 10);
        this.li.a(256, "This will send a report to our Player Support team for investigation.", 0xFFFF00, 0, 1, n3 += 15);
        this.li.a(106, "Honour", 0xFF0000, 0, 4, n3 += 18);
        this.li.a(256, "Respect", 0xFF0000, 0, 4, n3);
        this.li.a(406, "Security", 0xFF0000, arg0 ^ 0xFFFF8EEB, 4, n3);
        n3 += 18;
        if (this.Yb == 1) {
            this.li.a(36, (byte)32, 0x303030, n3 - 12, 30, 140);
        }
        this.li.e(36, 140, n3 - 12, arg0 ^ 0xFFFFE262, 30, 0x404040);
        if (this.Yb == 7) {
            this.li.a(186, (byte)-106, 0x303030, n3 - 12, 30, 140);
        }
        this.li.e(186, 140, n3 - 12, 27785, 30, 0x404040);
        if (this.Yb == 12) {
            this.li.a(336, (byte)-99, 0x303030, n3 - 12, 30, 140);
        }
        this.li.e(336, 140, n3 - 12, 27785, 30, 0x404040);
        n2 = this.Yb == 1 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(106, "Buying or", n2, 0, 0, n3);
        n2 = this.Yb == 7 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(256, "Seriously offensive", n2, arg0 ^ arg0, 0, n3);
        n2 = this.Yb != 12 ? 0xFFFFFF : 0xFF8000;
        this.li.a(406, "Asking for or providing", n2, 0, 0, n3);
        n2 = this.Yb != 1 ? 0xFFFFFF : 0xFF8000;
        this.li.a(106, "selling an account", n2, 0, 0, n3 += 12);
        n2 = this.Yb != 7 ? 0xFFFFFF : 0xFF8000;
        this.li.a(256, "language", n2, arg0 ^ 0xFFFF8EEB, 0, n3);
        n2 = this.Yb != 12 ? 0xFFFFFF : 0xFF8000;
        this.li.a(406, "contact information", n2, 0, 0, n3);
        n3 += 20;
        if (this.Yb == 2) {
            this.li.a(36, (byte)-111, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(36, 140, n3 - 12, arg0 + 56734, 18, 0x404040);
        if (this.Yb == 8) {
            this.li.a(186, (byte)-107, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(186, 140, n3 - 12, 27785, 18, 0x404040);
        if (this.Yb == 13) {
            this.li.a(336, (byte)-119, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(336, 140, n3 - 12, 27785, 18, 0x404040);
        n2 = this.Yb == 2 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(106, "Encouraging rule-breaking", n2, 0, 0, n3);
        n2 = this.Yb == 8 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(256, "Solicitation", n2, 0, 0, n3);
        n2 = this.Yb != 13 ? 0xFFFFFF : 0xFF8000;
        this.li.a(406, "Breaking real-world laws", n2, 0, 0, n3);
        n3 += 20;
        if (this.Yb == 3) {
            this.li.a(36, (byte)-114, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(36, 140, n3 - 12, 27785, 18, 0x404040);
        if (this.Yb == 9) {
            this.li.a(186, (byte)-127, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(186, 140, n3 - 12, 27785, 18, 0x404040);
        if (this.Yb == 14) {
            this.li.a(336, (byte)-117, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(336, 140, n3 - 12, 27785, 18, 0x404040);
        n2 = this.Yb == 3 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(106, "Staff impersonation", n2, 0, 0, n3);
        n2 = this.Yb != 9 ? 0xFFFFFF : 0xFF8000;
        this.li.a(256, "Disruptive behaviour", n2, arg0 + 28949, 0, n3);
        n2 = this.Yb != 14 ? 0xFFFFFF : 0xFF8000;
        this.li.a(406, "Advertising websites", n2, arg0 + 28949, 0, n3);
        n3 += 20;
        if (this.Yb == 4) {
            this.li.a(36, (byte)118, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(36, 140, n3 - 12, 27785, 18, 0x404040);
        if (this.Yb == 10) {
            this.li.a(186, (byte)-104, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(186, 140, n3 - 12, 27785, 18, 0x404040);
        n2 = this.Yb != 4 ? 0xFFFFFF : 0xFF8000;
        this.li.a(106, "Macroing or use of bots", n2, 0, 0, n3);
        n2 = this.Yb == 10 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(256, "Offensive account name", n2, 0, 0, n3);
        n3 += 20;
        if (this.Yb == 5) {
            this.li.a(36, (byte)31, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(36, 140, n3 - 12, 27785, 18, 0x404040);
        if (this.Yb == 11) {
            this.li.a(186, (byte)62, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(186, 140, n3 - 12, arg0 ^ 0xFFFFE262, 18, 0x404040);
        n2 = this.Yb == 5 ? 0xFF8000 : 0xFFFFFF;
        this.li.a(106, "Scamming", n2, 0, 0, n3);
        n2 = this.Yb != 11 ? 0xFFFFFF : 0xFF8000;
        this.li.a(256, "Real-life threats", n2, 0, 0, n3);
        n3 += 20;
        if (this.Yb == 6) {
            this.li.a(36, (byte)82, 0x303030, n3 - 12, 18, 140);
        }
        this.li.e(36, 140, n3 - 12, arg0 + 56734, 18, 0x404040);
        n2 = this.Yb != 6 ? 0xFFFFFF : 0xFF8000;
        this.li.a(106, "Exploiting a bug", n2, 0, 0, n3);
        n3 += 18;
        n2 = 0xFFFFFF;
        if (this.I > 196 && this.I < 316 && this.xb > (n3 += 15) - 15 && 5 + n3 > this.xb) {
            n2 = 0xFFFF00;
        }
        this.li.a(256, "Click here to cancel", n2, arg0 + 28949, 1, n3);
    }

    private final void H(int arg0) {
        block4: {
            this.li.a(86, (byte)-115, 0, 77, 180, 340);
            int n2 = 97;
            if (arg0 <= 90) {
                this.f(true);
            }
            this.li.e(86, 340, 77, 27785, 180, 0xFFFFFF);
            this.li.a(256, "Warning! Proceed with caution", 0xFF0000, 0, 4, n2);
            this.li.a(256, "If you go much further north you will enter the", 0xFFFFFF, 0, 1, n2 += 26);
            this.li.a(256, "wilderness. This a very dangerous area where", 0xFFFFFF, 0, 1, n2 += 13);
            this.li.a(256, "other players can attack you!", 0xFFFFFF, 0, 1, n2 += 13);
            this.li.a(256, "The further north you go the more dangerous it", 0xFFFFFF, 0, 1, n2 += 22);
            this.li.a(256, "becomes, but the more treasure you will find.", 0xFFFFFF, 0, 1, n2 += 13);
            this.li.a(256, "In the wilderness an indicator at the bottom-right", 0xFFFFFF, 0, 1, n2 += 22);
            this.li.a(256, "of the screen will show the current level of danger", 0xFFFFFF, 0, 1, n2 += 13);
            int n3 = 0xFFFFFF;
            if (this.xb > (n2 += 22) - 12 && this.xb <= n2 && this.I > 181 && this.I < 331) {
                n3 = 0xFF0000;
            }
            this.li.a(256, "Click here to close window", n3, 0, 1, n2);
            if (this.Cf == 0) break block4;
            if (this.xb > n2 - 12 && n2 >= this.xb && this.I > 181 && this.I < 331) {
                this.le = 2;
            }
            this.Cf = 0;
            if (this.I < 86 || this.I > 426 || this.xb < 77 || this.xb > 257) {
                this.le = 2;
            }
        }
    }

    @Override
    final void e(int arg0) {
        if (this.Xh) {
            return;
        }
        if (this.Ue) {
            return;
        }
        if (arg0 < 64) {
            this.Oc = null;
        }
        if (this.Vc) {
            return;
        }
        if (this.ni != null) {
            this.ni.a();
        }
        try {
            ++this.jk;
            if (this.qg == 0) {
                this.sb = 0;
                this.x(2);
            }
            if (this.qg == 1) {
                ++this.sb;
                this.J(0);
            }
            this.Qb = 0;
            ++this.oj;
            if (this.oj > 500) {
                this.oj = 0;
                int n2 = (int)(4.0 * Math.random());
                if ((2 & n2) == 2) {
                    this.oc += this.Ok;
                }
                if ((n2 & 1) == 1) {
                    this.Be += this.eg;
                }
            }
            if (this.Be < -50) {
                this.eg = 2;
            }
            if (this.oc < -50) {
                this.Ok = 2;
            }
            if (this.Be > 50) {
                this.eg = -2;
            }
            if (this.Mh > 0) {
                --this.Mh;
            }
            if (this.Vj > 0) {
                --this.Vj;
            }
            if (this.Ee > 0) {
                --this.Ee;
            }
            if (this.Qe > 0) {
                --this.Qe;
            }
            if (this.oc > 50) {
                this.Ok = -2;
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.Ue = true;
        }
    }

    private final void f(int arg0) {
        int n2;
        int n3;
        int n4;
        int n5;
        ta ta2;
        int n6;
        if (arg0 != 13) {
            return;
        }
        if (this.rk != 0) {
            this.li.b(0xF8F8F9);
            this.li.a(this.Wd / 2, "Oh dear! You are dead...", 0xFF0000, 0, 7, this.Oi / 2);
            this.A(arg0 - 8);
            this.li.a(this.Xb, this.Eb, 256, this.K);
            return;
        }
        if (this.Kg) {
            this.w(-13759);
            return;
        }
        if (this.Qk) {
            this.li.b(0xF8F8F9);
            if (Math.random() < 0.15) {
                this.li.a((int)(Math.random() * 80.0), "ZZZ", (int)(1.6777215E7 * Math.random()), 0, 5, (int)(334.0 * Math.random()));
            }
            if (0.15 > Math.random()) {
                this.li.a(-((int)(80.0 * Math.random())) + 512, "ZZZ", (int)(Math.random() * 1.6777215E7), arg0 ^ 0xD, 5, (int)(334.0 * Math.random()));
            }
            this.li.a(this.Wd / 2 - 100, (byte)-103, 0, 160, 40, 200);
            this.li.a(this.Wd / 2, "You are sleeping", 0xFFFF00, arg0 - 13, 7, 50);
            this.li.a(this.Wd / 2, "Fatigue: " + 100 * this.pg / 750 + "%", 0xFFFF00, arg0 - 13, 7, 90);
            this.li.a(this.Wd / 2, "When you want to wake up just use your", 0xFFFFFF, 0, 5, 140);
            this.li.a(this.Wd / 2, "keyboard to type the word in the box below", 0xFFFFFF, arg0 ^ 0xD, 5, 160);
            this.li.a(this.Wd / 2, this.e + "*", 65535, arg0 - 13, 5, 180);
            if (this.Zj != null) {
                this.li.a(this.Wd / 2, this.Zj, 0xFF0000, 0, 5, 260);
            } else {
                this.li.b(-1, 1 + this.Eh, 230, this.Wd / 2 - 127);
            }
            this.li.e(this.Wd / 2 - 128, 257, 229, 27785, 42, 0xFFFFFF);
            this.A(5);
            this.li.a(this.Wd / 2, "If you can't read the word", 0xFFFFFF, arg0 - 13, 1, 290);
            this.li.a(this.Wd / 2, "@yel@click here@whi@ to get a different one", 0xFFFFFF, arg0 ^ 0xD, 1, 305);
            this.li.a(this.Xb, this.Eb, 256, this.K);
            return;
        }
        if (!this.Hh.Z) {
            return;
        }
        for (n6 = 0; n6 < 64; ++n6) {
            this.Ek.a(this.Hh.db[this.yj][n6], -1);
            if (this.yj == 0) {
                this.Ek.a(this.Hh.g[1][n6], -1);
                this.Ek.a(this.Hh.db[1][n6], arg0 - 14);
                this.Ek.a(this.Hh.g[2][n6], arg0 ^ 0xFFFFFFF2);
                this.Ek.a(this.Hh.db[2][n6], -1);
            }
            this.zf = true;
            if (this.yj != 0 || (this.Hh.bb[this.wi.i / 128][this.wi.K / 128] & 0x80) != 0) continue;
            this.Ek.a(this.Hh.db[this.yj][n6], (byte)118);
            if (this.yj == 0) {
                this.Ek.a(this.Hh.g[1][n6], (byte)118);
                this.Ek.a(this.Hh.db[1][n6], (byte)118);
                this.Ek.a(this.Hh.g[2][n6], (byte)118);
                this.Ek.a(this.Hh.db[2][n6], (byte)118);
            }
            this.zf = false;
        }
        if (this.bl != this.Mg) {
            this.bl = this.Mg;
            for (n6 = 0; n6 < this.eh; ++n6) {
                if (this.vc[n6] == 97) {
                    this.a((byte)48, n6, "firea" + (this.Mg + 1));
                }
                if (this.vc[n6] == 274) {
                    this.a((byte)58, n6, "fireplacea" + (this.Mg + 1));
                }
                if (this.vc[n6] == 1031) {
                    this.a((byte)103, n6, "lightning" + (1 + this.Mg));
                }
                if (this.vc[n6] == 1036) {
                    this.a((byte)89, n6, "firespell" + (this.Mg + 1));
                }
                if (this.vc[n6] != 1147) continue;
                this.a((byte)18, n6, "spellcharge" + (1 + this.Mg));
            }
        }
        if (this.yg != this.Nc) {
            this.yg = this.Nc;
            for (n6 = 0; this.eh > n6; ++n6) {
                if (this.vc[n6] == 51) {
                    this.a((byte)23, n6, "torcha" + (1 + this.Nc));
                }
                if (this.vc[n6] != 143) continue;
                this.a((byte)100, n6, "skulltorcha" + (1 + this.Nc));
            }
        }
        if (this.Sg != this.pj) {
            this.Sg = this.pj;
            for (n6 = 0; this.eh > n6; ++n6) {
                if (this.vc[n6] != 1142) continue;
                this.a((byte)89, n6, "clawspell" + (1 + this.pj));
            }
        }
        this.Ek.a((byte)67, this.qe);
        this.qe = 0;
        for (n6 = 0; n6 < this.Yc; ++n6) {
            ta2 = this.rg[n6];
            if (ta2.A == 255) continue;
            int n7 = ta2.i;
            n5 = ta2.K;
            n4 = -this.Hh.f(n7, n5, 125);
            n3 = this.Ek.a(n6 + 5000, n5, n6 + 10000, n7, n4, 145, 220, (byte)109);
            ++this.qe;
            if (this.wi == ta2) {
                this.Ek.c(32768, n3);
            }
            if (ta2.y == 8) {
                this.Ek.b(arg0 + 24, n3, -30);
            }
            if (ta2.y != 9) continue;
            this.Ek.b(arg0 ^ 0x2D, n3, 30);
        }
        for (n6 = 0; n6 < this.Yc; ++n6) {
            ta2 = this.rg[n6];
            if (ta2.w <= 0) continue;
            ta ta3 = null;
            if (ta2.h == -1) {
                if (ta2.z != -1) {
                    ta3 = this.We[ta2.z];
                }
            } else {
                ta3 = this.te[ta2.h];
            }
            if (ta3 == null) continue;
            n5 = ta2.i;
            n4 = ta2.K;
            n3 = -this.Hh.f(n5, n4, arg0 ^ 0x69) - 110;
            int n8 = ta3.i;
            int n9 = ta3.K;
            int n10 = -this.Hh.f(n8, n9, -22) + -(b.h[ta3.t] / 2);
            int n11 = (n8 * (-ta2.w + this.nc) + n5 * ta2.w) / this.nc;
            int n12 = (n3 * ta2.w + n10 * (this.nc - ta2.w)) / this.nc;
            int n13 = ((-ta2.w + this.nc) * n9 + n4 * ta2.w) / this.nc;
            this.Ek.a(ta2.a + this.kd, n13, 0, n11, n12, 32, 32, (byte)109);
            ++this.qe;
        }
        for (n6 = 0; n6 < this.de; ++n6) {
            ta2 = this.Tb[n6];
            int n14 = ta2.i;
            n5 = ta2.K;
            n4 = -this.Hh.f(n14, n5, -69);
            n3 = this.Ek.a(20000 - -n6, n5, n6 + 30000, n14, n4, fb.c[ta2.t], b.h[ta2.t], (byte)109);
            ++this.qe;
            if (ta2.y == 8) {
                this.Ek.b(86, n3, -30);
            }
            if (ta2.y != 9) continue;
            this.Ek.b(arg0 ^ 0x63, n3, 30);
        }
        for (n6 = 0; n6 < this.Ah; ++n6) {
            int n15 = this.Zf[n6] * this.Ug + 64;
            int n16 = this.Ug * this.Ni[n6] + 64;
            this.Ek.a(40000 + this.Gj[n6], n16, n6 + 20000, n15, -this.Hh.f(n15, n16, 100) - this.Le[n6], 96, 64, (byte)109);
            ++this.qe;
        }
        for (n6 = 0; n6 < this.el; ++n6) {
            int n17 = 64 + this.Ug * this.Sc[n6];
            int n18 = this.gi[n6] * this.Ug + 64;
            n5 = this.Oc[n6];
            if (n5 == 0) {
                this.Ek.a(50000 - -n6, n18, n6 + 50000, n17, -this.Hh.f(n17, n18, 98), 128, 256, (byte)109);
                ++this.qe;
            }
            if (n5 != 1) continue;
            this.Ek.a(n6 + 50000, n18, n6 + 50000, n17, -this.Hh.f(n17, n18, arg0 + 58), 128, 64, (byte)109);
            ++this.qe;
        }
        this.li.i = false;
        this.li.a(true);
        this.li.i = this.U;
        if (this.yj == 3) {
            n6 = 40 + (int)(3.0 * Math.random());
            int n19 = (int)(7.0 * Math.random()) + 40;
            this.Ek.a(-50, n19, 0, -50, n6, -10);
        }
        this.jc = 0;
        this.Bc = 0;
        this.Ef = 0;
        if (this.Td) {
            if (this.Kh && !this.zf) {
                n6 = this.si;
                this.q((byte)22);
                if (this.si != n6) {
                    this.Si = this.wi.K;
                    this.kg = this.wi.i;
                }
            }
            this.ug = 32 * this.si;
            this.Ek.Mb = 3000;
            this.Ek.X = 3000;
            this.Ek.P = 1;
            this.Ek.G = 2800;
            n6 = this.kg - -this.Be;
            n2 = this.Si - -this.oc;
            this.Ek.a(n6, n2, 2000, 912, arg0 - 12362, 4 * this.ug, -this.Hh.f(n6, n2, -88), 0);
        } else {
            if (this.Kh && !this.zf) {
                this.q((byte)94);
            }
            if (!this.U) {
                this.Ek.P = 1;
                this.Ek.Mb = 2400;
                this.Ek.G = 2300;
                this.Ek.X = 2400;
            } else {
                this.Ek.P = 1;
                this.Ek.Mb = 2200;
                this.Ek.X = 2200;
                this.Ek.G = 2100;
            }
            n6 = this.kg + this.Be;
            n2 = this.Si - -this.oc;
            this.Ek.a(n6, n2, 2 * this.ac, 912, -12349, this.ug * 4, -this.Hh.f(n6, n2, 105), 0);
        }
        this.Ek.c(-113);
        this.l(arg0 - 11);
        if (this.xh > 0) {
            this.li.b(-1, 14 + (this.tg + (24 + -this.xh) / 6), this.Fd - 8, this.tj - 8);
        }
        if (this.xh < 0) {
            this.li.b(-1, 18 + (this.tg - -((this.xh + 24) / 6)), this.Fd - 8, this.tj - 8);
        }
        if (this.kc != 0) {
            n6 = this.kc / 50;
            n2 = n6 / 60;
            if ((n6 %= 60) < 10) {
                this.li.a(256, "System update in: " + n2 + ":0" + n6, 0xFFFF00, 0, 1, this.Oi - 7);
            } else {
                this.li.a(256, "System update in: " + n2 + ":" + n6, 0xFFFF00, 0, 1, this.Oi - 7);
            }
        }
        if (!this.Ub) {
            n6 = -this.sh + -this.sk - (this.zg - 2203);
            if (this.Ki + (this.Lf + this.Qg) >= 2640) {
                n6 = -50;
            }
            if (n6 > 0) {
                n2 = n6 / 6 + 1;
                this.li.b(-1, 13 + this.tg, this.Oi - 56, 453);
                this.li.a(465, "Wilderness", 0xFFFF00, 0, 1, this.Oi - 20);
                this.li.a(465, "Level: " + n2, 0xFFFF00, 0, 1, this.Oi - 7);
                if (this.le == 0) {
                    this.le = 2;
                }
            }
            if (this.le == 0 && n6 > -10 && n6 <= 0) {
                this.le = 1;
            }
        }
        if (this.Zh == 0) {
            for (n6 = 0; n6 < 100; ++n6) {
                if (pa.g[n6] <= 0) continue;
                String string = ub.a[n6] + mb.a(aa.k[n6], k.G[n6], true, n.j[n6]);
                this.li.a(ja.N[n6], this.Oi + -(12 * n6) - 18, string, 7, 0xFFFF00, (byte)26, 1);
            }
        }
        this.yd.b((byte)56, this.Fh);
        this.yd.b((byte)80, this.ud);
        this.yd.b((byte)48, this.mc);
        if (this.Zh == 1) {
            this.yd.c(this.Fh, 115);
        } else if (this.Zh != 2) {
            if (this.Zh == 3) {
                this.yd.c(this.mc, 127);
            }
        } else {
            this.yd.c(this.ud, 119);
        }
        ia.i = 2;
        this.yd.a((byte)-35);
        ia.i = 0;
        this.li.a(this.tg, 0, this.li.u - 200, 128, 3);
        this.I(0);
        this.li.xb = false;
        this.A(arg0 - 8);
        this.li.a(this.Xb, this.Eb, 256, this.K);
    }

    private final void b(int arg0, int arg1, int arg2) {
        block13: {
            int n2;
            boolean bl;
            block11: {
                int n3;
                int n4;
                int n5;
                block12: {
                    bl = false;
                    n5 = 0;
                    n4 = this.vf[arg2];
                    for (n3 = 0; n3 < this.Ke; ++n3) {
                        if (n4 != this.Uf[n3]) continue;
                        if (fa.e[n4] == 0) {
                            if (arg1 < 0) {
                                for (n2 = 0; this.Tk > n2; ++n2) {
                                    if (this.df[n3] < this.xe[arg2]) {
                                        int n6 = n3;
                                        this.df[n6] = this.df[n6] + 1;
                                    }
                                    bl = true;
                                }
                                continue;
                            }
                            int n7 = n3;
                            this.df[n7] = this.df[n7] + arg1;
                            if (this.xe[arg2] < this.df[n3]) {
                                this.df[n3] = this.xe[arg2];
                            }
                            bl = true;
                            continue;
                        }
                        ++n5;
                    }
                    if (arg0 < 2) {
                        this.b((String)null, (byte)-34);
                    }
                    if (n5 >= (n3 = this.b(103, n4))) {
                        bl = true;
                    }
                    if (kb.c[n4] == 1) {
                        bl = true;
                        this.a(false, null, 0, "This object cannot be added to a duel offer", 0, 0, null, null);
                    }
                    if (bl) break block11;
                    if (arg1 >= 0) break block12;
                    if (this.Ke >= 8) break block11;
                    this.Uf[this.Ke] = n4;
                    this.df[this.Ke] = 1;
                    ++this.Ke;
                    bl = true;
                    break block11;
                }
                for (n2 = 0; arg1 > n2 && this.Ke < 8 && n3 > n5; ++n2) {
                    this.Uf[this.Ke] = n4;
                    this.df[this.Ke] = 1;
                    ++n5;
                    ++this.Ke;
                    bl = true;
                    if (n2 != 0 || fa.e[n4] != 0) continue;
                    this.df[this.Ke - 1] = this.xe[arg2] < arg1 ? this.xe[arg2] : arg1;
                    break;
                }
            }
            if (!bl) break block13;
            this.Jh.b(33, 0);
            this.Jh.f.c(this.Ke, -120);
            for (n2 = 0; n2 < this.Ke; ++n2) {
                this.Jh.f.e(393, this.Uf[n2]);
                this.Jh.f.b(-422797528, this.df[n2]);
            }
            this.Jh.b(21294);
            this.ki = false;
            this.ke = false;
        }
    }

    private final String c(int arg0, int arg1) {
        if (arg0 >= -7) {
            this.Si = 126;
        }
        g g2 = pa.k.a(arg1, (byte)-121);
        while (g2.b == 0) {
            mb.a(11200, 50L);
        }
        if (g2.b == 1 && g2.d != null) {
            return (String)g2.d;
        }
        return ba.e(114, arg1);
    }

    private final void E(int arg0) {
        if (arg0 > -55) {
            return;
        }
        try {
            this.Uh = this.a("Sound effects", 90, 10, 66);
            sa.a(22050, false, 1);
            Container container = kb.a == null ? (da.gb != null ? da.gb : this) : kb.a;
            this.ni = sa.a(pa.k, container, 0, 22050);
            this.hk = new ra();
            this.ni.a(this.hk);
        }
        catch (Throwable throwable) {
            System.out.println("Unable to init sounds:" + throwable);
        }
    }

    @Override
    final void a(boolean arg0) {
        block1: {
            if (arg0) {
                ze = -103L;
            }
            this.a(true, 31);
            if (this.ni == null) break block1;
            this.ni.d();
        }
    }

    private final void k(byte arg0) {
        int n2 = 7;
        int n3 = 15;
        int n4 = 175;
        if (this.Cf != 0) {
            for (int i2 = 0; i2 < 5; ++i2) {
                if (i2 <= 0 || n2 >= this.I || this.I >= n4 + n2 || i2 * 20 + n3 >= this.xb || 20 * i2 + n3 + 20 <= this.xb) continue;
                this.Cf = 0;
                this.Fg = i2 - 1;
                this.Jh.b(29, 0);
                this.Jh.f.c(this.Fg, -80);
                this.Jh.b(21294);
                break;
            }
        }
        for (int i3 = 0; i3 < 5; ++i3) {
            if (i3 == 1 + this.Fg) {
                this.li.c(128, n2, 20, 0, n3 + i3 * 20, n4, o.a(255, 9570, 0, 0));
            } else {
                this.li.c(128, n2, 20, 0, n3 - -(20 * i3), n4, o.a(190, 9570, 190, 190));
            }
            this.li.b(n4, 0, n2, n3 + i3 * 20, (byte)82);
            this.li.b(n4, 0, n2, 20 + n3 - -(i3 * 20), (byte)-127);
        }
        this.li.a(n4 / 2 + n2, "Select combat style", 0xFFFFFF, 0, 3, 16 + n3);
        this.li.a(n4 / 2 + n2, "Controlled (+1 of each)", 0, 0, 3, n3 + 36);
        this.li.a(n4 / 2 + n2, "Aggressive (+3 strength)", 0, 0, 3, 56 + n3);
        this.li.a(n4 / 2 + n2, "Accurate   (+3 attack)", 0, 0, 3, n3 + 76);
        this.li.a(n4 / 2 + n2, "Defensive  (+3 defense)", 0, 0, 3, n3 + 96);
    }

    private final void a(int arg0, String arg1, String arg2, boolean arg3) {
        block67: {
            if (this.Zb > 0) {
                this.b((byte)-76, "Please wait...", "Connecting to server");
                try {
                    mb.a(11200, 2000L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.b((byte)-18, "Sorry! The server is currently full.", "Please try again later");
                return;
            }
            while (this.Vh > 0) {
                try {
                    int n2;
                    Object object;
                    this.wh = arg2;
                    this.Xf = arg1;
                    String string = b.a(20, (byte)-5, arg1);
                    if (this.wh.trim().length() == 0) {
                        this.b((byte)-119, "You must enter both a username", "and a password - Please try again");
                        return;
                    }
                    if (!arg3) {
                        this.b((byte)-23, "Please wait...", "Connecting to server");
                    } else {
                        this.a("Attempting to re-establish", (byte)-64, "Connection lost! Please wait...");
                    }
                    int n3 = this.Vh <= 1 ? this.xd : this.fc;
                    this.Jh = new da(this.a(arg0 + 0, n3, this.Dh), this);
                    this.Jh.d = d.l;
                    int n4 = 0;
                    try {
                        if (kb.a == null && (object = (Object)this.getParameter("limit30")).equals("1")) {
                            n4 = 1;
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    object = new int[]{(int)(9.9999999E7 * Math.random()), (int)(9.9999999E7 * Math.random()), (int)(9.9999999E7 * Math.random()), (int)(9.9999999E7 * Math.random())};
                    this.Jh.b(0, arg0 ^ 0xFFFFFFF4);
                    if (arg3) {
                        this.Jh.f.c(1, -77);
                    } else {
                        this.Jh.f.c(0, -93);
                    }
                    this.Jh.f.b(-422797528, fa.d);
                    tb tb2 = new tb(500);
                    tb2.c(10, -117);
                    tb2.b(-422797528, (int)object[0]);
                    tb2.b(-422797528, (int)object[1]);
                    tb2.b(-422797528, (int)object[2]);
                    tb2.b(-422797528, (int)object[3]);
                    tb2.a((byte)-39, string);
                    for (n2 = 0; n2 < 5; ++n2) {
                        tb2.b(-422797528, (int)(Math.random() * 9.9999999E7));
                    }
                    tb2.a((int)(9.9999999E7 * Math.random()), (byte)-13);
                    tb2.a(ja.K, -118, s.c);
                    this.Jh.f.a(0, -123, tb2.w, tb2.F);
                    this.Jh.f.e(393, 0);
                    n2 = this.Jh.f.w;
                    this.Jh.f.c(n4, arg0 + 50);
                    f.a(22607, this.Jh.f);
                    this.Jh.f.a((byte)-39, this.wh);
                    this.Jh.f.a((byte)87, n2, (int[])object, this.Jh.f.w);
                    this.Jh.f.d(-n2 + this.Jh.f.w, 1);
                    this.Jh.a(-6924);
                    this.Jh.a((byte)-119, (int[])object);
                    int n5 = this.Jh.b(true);
                    System.out.println("login response:" + n5);
                    if ((n5 & 0x40) != 0) {
                        this.Ce = n5 & 3;
                        this.Vh = 0;
                        this.Oj = (n5 & 0x3F) >> 2;
                        this.i(-109);
                        return;
                    }
                    if (n5 == 1) {
                        this.Vh = 0;
                        this.g(-16433);
                        return;
                    }
                    if (!arg3) {
                        if (n5 != -1) {
                            if (n5 != 3) {
                                if (n5 == 4) {
                                    this.b((byte)-51, "That username is already logged in.", "Wait 60 seconds then retry");
                                } else if (n5 != 5) {
                                    if (n5 != 6) {
                                        if (n5 != 7) {
                                            if (n5 != 8) {
                                                if (n5 != 9) {
                                                    if (n5 != 10) {
                                                        if (n5 != 11) {
                                                            if (n5 != 12) {
                                                                if (n5 == 14) {
                                                                    this.b((byte)-116, "Sorry! This world is currently full.", "Please try a different world");
                                                                    this.Zb = 1500;
                                                                } else if (n5 != 15) {
                                                                    if (n5 == 16) {
                                                                        this.b((byte)-52, "Error - no reply from loginserver.", "Please try again");
                                                                    } else if (n5 != 17) {
                                                                        if (n5 == 18) {
                                                                            this.b((byte)-120, "Account suspected stolen.", "Press 'recover a locked account' on front page.");
                                                                        } else if (n5 != 20) {
                                                                            if (n5 != 21) {
                                                                                if (n5 == 22) {
                                                                                    this.b((byte)-109, "Password suspected stolen.", "Press 'change your password' on front page.");
                                                                                } else if (n5 != 23) {
                                                                                    if (n5 == 24) {
                                                                                        this.b((byte)-34, "This world does not accept new players.", "Please see the launch page for help");
                                                                                    } else if (n5 != 25) {
                                                                                        this.b((byte)-56, "Error unable to login.", "Unrecognised response code");
                                                                                    } else {
                                                                                        this.b((byte)-33, "None of your characters can log in.", "Contact customer support");
                                                                                    }
                                                                                } else {
                                                                                    this.b((byte)-70, "You need to set your display name.", "Please go to the Account Management page to do this.");
                                                                                }
                                                                            } else {
                                                                                this.b((byte)-28, "That is not a veteran RS-Classic account.", "Please try a non-veterans world.");
                                                                            }
                                                                        } else {
                                                                            this.b((byte)-54, "Error - loginserver mismatch", "Please try a different world");
                                                                        }
                                                                    } else {
                                                                        this.b((byte)-87, "Error - failed to decode profile.", "Contact customer support");
                                                                    }
                                                                } else {
                                                                    this.b((byte)-41, "You need a members account", "to login to this world");
                                                                }
                                                            } else {
                                                                this.b((byte)-63, "Account permanently disabled.", "Check your message inbox for details");
                                                            }
                                                        } else {
                                                            this.b((byte)-41, "Account temporarily disabled.", "Check your message inbox for details");
                                                        }
                                                    } else {
                                                        this.b((byte)-48, "That username is already in use.", "Wait 60 seconds then retry");
                                                    }
                                                } else {
                                                    this.b((byte)-14, "Error unable to login.", "Under 13 accounts cannot access RuneScape Classic");
                                                }
                                            } else {
                                                this.b((byte)-37, "Error unable to login.", "Server rejected session");
                                            }
                                        } else {
                                            this.b((byte)-125, "Login attempts exceeded!", "Please try again in 5 minutes");
                                        }
                                    } else {
                                        this.b((byte)-42, "You may only use 1 character at once.", "Your ip-address is already in use");
                                    }
                                } else {
                                    this.b((byte)-57, "The client has been updated.", "Please reload this page");
                                }
                            } else {
                                this.b((byte)-49, "Invalid username or password.", "Try again, or create a new account");
                            }
                        } else {
                            this.b((byte)-15, "Error unable to login.", "Server timed out");
                        }
                    } else {
                        string = "";
                        this.wh = "";
                        this.o(-2);
                    }
                    return;
                }
                catch (Exception exception) {
                    System.out.println("" + exception);
                    if (this.Vh > 0) {
                        try {
                            mb.a(11200, 5000L);
                        }
                        catch (Exception exception2) {
                            // empty catch block
                        }
                        --this.Vh;
                        continue;
                    }
                    if (arg3) {
                        this.Xf = "";
                        this.wh = "";
                        this.o(-2);
                        continue;
                    }
                    mb.a(0x1FFFFF, exception, "Error while connecting");
                    this.b((byte)-27, "Sorry! Unable to connect.", "Check internet settings or try another world");
                }
            }
            if (arg0 == -12) break block67;
            this.c((byte)-97);
        }
    }

    private final void b(int arg0, String arg1) {
        int n2;
        if ((!this.Pg ? 100 : 200) <= n.g) {
            this.a(false, null, 0, "Friend list is full", 0, 0, null, null);
            return;
        }
        String string = w.a(arg1, (byte)75);
        if (string == null) {
            return;
        }
        for (n2 = 0; n2 < n.g; ++n2) {
            if (string.equals(w.a(ua.h[n2], (byte)88))) {
                this.a(false, null, 0, arg1 + " is already on your friend list.", 0, 0, null, null);
                return;
            }
            if (cb.c[n2] == null || !string.equals(w.a(cb.c[n2], (byte)54))) continue;
            this.a(false, null, 0, arg1 + " is already on your friend list.", 0, 0, null, null);
            return;
        }
        for (n2 = 0; db.g > n2; ++n2) {
            if (string.equals(w.a(l.c[n2], (byte)58))) {
                this.a(false, null, 0, "Please remove " + arg1 + " from your ignore list first.", 0, 0, null, null);
                return;
            }
            if (ia.g[n2] == null || !string.equals(w.a(ia.g[n2], (byte)79))) continue;
            this.a(false, null, 0, "Please remove " + arg1 + " from your ignore list first.", 0, 0, null, null);
            return;
        }
        if (string.equals(w.a(this.wi.C, (byte)60))) {
            this.a(false, null, 0, "You can't add yourself to your own friend list.", 0, 0, null, null);
            return;
        }
        this.Jh.b(195, 0);
        this.Jh.f.a(arg1, -23);
        this.Jh.b(21294);
    }

    @Override
    final void b(boolean arg0) {
        if (this.N) {
            this.n(-108);
            this.N = false;
        }
        if (this.Vc) {
            Graphics graphics = this.getGraphics();
            if (graphics == null) {
                return;
            }
            graphics.translate(this.Eb, this.K);
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, 512, 356);
            graphics.setFont(new Font("Helvetica", 1, 16));
            graphics.setColor(Color.yellow);
            int n2 = 35;
            graphics.drawString("Sorry, an error has occured whilst loading RuneScape", 30, n2);
            graphics.setColor(Color.white);
            graphics.drawString("To fix this try the following (in order):", 30, n2 += 50);
            graphics.setColor(Color.white);
            graphics.setFont(new Font("Helvetica", 1, 12));
            graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, n2 += 50);
            graphics.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, n2 += 30);
            graphics.drawString("3: Try using a different game-world", 30, n2 += 30);
            graphics.drawString("4: Try rebooting your computer", 30, n2 += 30);
            graphics.drawString("5: Try selecting a different version of Java from the play-game menu", 30, n2 += 30);
            this.a(1, (byte)126);
            return;
        }
        if (this.Xh) {
            Graphics graphics = this.getGraphics();
            if (graphics == null) {
                return;
            }
            graphics.translate(this.Eb, this.K);
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, 512, 356);
            graphics.setFont(new Font("Helvetica", 1, 20));
            graphics.setColor(Color.white);
            graphics.drawString("Error - unable to load game!", 50, 50);
            graphics.drawString("To play RuneScape make sure you play from", 50, 100);
            graphics.drawString("http://www.runescape.com", 50, 150);
            this.a(1, (byte)111);
            return;
        }
        if (this.Ue) {
            Graphics graphics = this.getGraphics();
            if (graphics == null) {
                return;
            }
            graphics.translate(this.Eb, this.K);
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, 512, 356);
            graphics.setFont(new Font("Helvetica", 1, 20));
            graphics.setColor(Color.white);
            graphics.drawString("Error - out of memory!", 50, 50);
            graphics.drawString("Close ALL unnecessary programs", 50, 100);
            graphics.drawString("and windows before loading the game", 50, 150);
            graphics.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
            this.a(1, (byte)106);
            return;
        }
        try {
            if (arg0) {
                this.Xh = false;
            }
            if (this.li == null) {
                return;
            }
            if (this.qg == 0) {
                this.li.xb = false;
                this.k(2540);
            }
            if (this.qg == 1) {
                this.li.xb = true;
                this.f(13);
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.Ue = true;
        }
    }

    private final boolean f(byte arg0) {
        return true;
    }

    private final void J(int arg0) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        ta ta2;
        int n8;
        if (this.kc > 1) {
            --this.kc;
        }
        this.K(arg0 - 26345);
        if (this.bj > 0) {
            --this.bj;
        }
        if (this.sb > 15000 && this.ai == 0 && this.bj == 0) {
            this.sb -= 15000;
            this.B(arg0 ^ 0);
            return;
        }
        if (this.wi.y == 8 || this.wi.y == 9) {
            this.ai = 500;
        }
        if (this.ai > 0) {
            --this.ai;
        }
        if (this.Kg) {
            this.F(86);
            return;
        }
        for (n8 = 0; this.Yc > n8; ++n8) {
            ta2 = this.rg[n8];
            n7 = (1 + ta2.o) % 10;
            if (n7 == ta2.e) {
                ta2.y = ta2.D;
            } else {
                n6 = -1;
                n5 = ta2.e;
                n4 = n5 < n7 ? n7 - n5 : -n5 + (10 - -n7);
                n3 = 4;
                if (n4 > 2) {
                    n3 = n4 * 4 - 4;
                }
                if (3 * this.Ug < ta2.k[n5] + -ta2.i || this.Ug * 3 < -ta2.K + ta2.F[n5] || -this.Ug * 3 > -ta2.i + ta2.k[n5] || ta2.F[n5] + -ta2.K < -this.Ug * 3 || n4 > 8) {
                    ta2.i = ta2.k[n5];
                    ta2.K = ta2.F[n5];
                } else {
                    if (ta2.k[n5] > ta2.i) {
                        n6 = 2;
                        ta2.i += n3;
                        ++ta2.x;
                    } else if (ta2.i > ta2.k[n5]) {
                        ++ta2.x;
                        n6 = 6;
                        ta2.i -= n3;
                    }
                    if (ta2.i - ta2.k[n5] < n3 && -n3 < ta2.i + -ta2.k[n5]) {
                        ta2.i = ta2.k[n5];
                    }
                    if (ta2.K < ta2.F[n5]) {
                        n6 = n6 != -1 ? (n6 == 2 ? 3 : 5) : 4;
                        ta2.K += n3;
                        ++ta2.x;
                    } else if (ta2.F[n5] < ta2.K) {
                        ++ta2.x;
                        ta2.K -= n3;
                        n6 = n6 != -1 ? (n6 == 2 ? 1 : 7) : 0;
                    }
                    if (n3 > -ta2.F[n5] + ta2.K && -ta2.F[n5] + ta2.K > -n3) {
                        ta2.K = ta2.F[n5];
                    }
                }
                if (n6 != -1) {
                    ta2.y = n6;
                }
                if (ta2.i == ta2.k[n5] && ta2.K == ta2.F[n5]) {
                    ta2.e = (1 + n5) % 10;
                }
            }
            if (ta2.E > 0) {
                --ta2.E;
            }
            if (ta2.d > 0) {
                --ta2.d;
            }
            if (ta2.I > 0) {
                --ta2.I;
            }
            if (this.rk <= 0) continue;
            --this.rk;
            if (this.rk == 0) {
                this.a(false, null, 0, "You have been granted another life. Be more careful this time!", 0, 0, null, null);
            }
            if (this.rk != 0) continue;
            this.a(false, null, 0, "You retain your skills. Your objects land where you died", 0, 0, null, null);
        }
        for (n8 = 0; this.de > n8; ++n8) {
            ta2 = this.Tb[n8];
            n7 = (ta2.o + 1) % 10;
            if (n7 == ta2.e) {
                if (ta2.t == 43) {
                    ++ta2.x;
                }
                ta2.y = ta2.D;
            } else {
                n6 = -1;
                n5 = ta2.e;
                n4 = n5 >= n7 ? n7 + (10 - n5) : -n5 + n7;
                n3 = 4;
                if (n4 > 2) {
                    n3 = (n4 - 1) * 4;
                }
                if (this.Ug * 3 < -ta2.i + ta2.k[n5] || this.Ug * 3 < ta2.F[n5] + -ta2.K || ta2.k[n5] + -ta2.i < 3 * -this.Ug || ta2.F[n5] - ta2.K < -this.Ug * 3 || n4 > 8) {
                    ta2.i = ta2.k[n5];
                    ta2.K = ta2.F[n5];
                } else {
                    if (ta2.i < ta2.k[n5]) {
                        ++ta2.x;
                        ta2.i += n3;
                        n6 = 2;
                    } else if (ta2.i > ta2.k[n5]) {
                        n6 = 6;
                        ++ta2.x;
                        ta2.i -= n3;
                    }
                    if (n3 > -ta2.k[n5] + ta2.i && -n3 < -ta2.k[n5] + ta2.i) {
                        ta2.i = ta2.k[n5];
                    }
                    if (ta2.F[n5] <= ta2.K) {
                        if (ta2.F[n5] < ta2.K) {
                            n6 = n6 == -1 ? 0 : (n6 != 2 ? 7 : 1);
                            ta2.K -= n3;
                            ++ta2.x;
                        }
                    } else {
                        ++ta2.x;
                        n6 = n6 == -1 ? 4 : (n6 != 2 ? 5 : 3);
                        ta2.K += n3;
                    }
                    if (n3 > ta2.K + -ta2.F[n5] && -n3 < -ta2.F[n5] + ta2.K) {
                        ta2.K = ta2.F[n5];
                    }
                }
                if (n6 != -1) {
                    ta2.y = n6;
                }
                if (ta2.k[n5] == ta2.i && ta2.F[n5] == ta2.K) {
                    ta2.e = (1 + n5) % 10;
                }
            }
            if (ta2.d > 0) {
                --ta2.d;
            }
            if (ta2.E > 0) {
                --ta2.E;
            }
            if (ta2.I <= 0) continue;
            --ta2.I;
        }
        if (this.qc != 2) {
            if (nb.g > 0) {
                ++this.fl;
            }
            if (da.M > 0) {
                this.fl = 0;
            }
            nb.g = 0;
            da.M = 0;
        }
        for (n8 = 0; this.Yc > n8; ++n8) {
            ta2 = this.rg[n8];
            if (ta2.w <= 0) continue;
            --ta2.w;
        }
        if (this.fl > 20) {
            this.fl = 0;
            this.Yk = false;
        }
        if (!this.Td) {
            if (this.kg - this.wi.i < -500 || this.kg + -this.wi.i > 500 || this.Si - this.wi.K < -500 || -this.wi.K + this.Si > 500) {
                this.kg = this.wi.i;
                this.Si = this.wi.K;
            }
            if (this.Kh) {
                n8 = 32 * this.si;
                int n9 = n8 - this.ug;
                n7 = 1;
                if (n9 != 0) {
                    ++this.Wc;
                    if (n9 <= 128) {
                        if (n9 <= 0) {
                            if (n9 >= -128) {
                                if (n9 < 0) {
                                    n7 = -1;
                                    n9 = -n9;
                                }
                            } else {
                                n9 = 256 - -n9;
                                n7 = 1;
                            }
                        } else {
                            n7 = 1;
                        }
                    } else {
                        n7 = -1;
                        n9 = -n9 + 256;
                    }
                    this.ug += (n9 * this.Wc + 255) / 256 * n7;
                    this.ug &= 0xFF;
                } else {
                    this.Wc = 0;
                }
            }
            if (this.wi.K != this.Si) {
                this.Si += (this.wi.K - this.Si) / ((this.ac - 500) / 15 + 16);
            }
            if (this.wi.i != this.kg) {
                this.kg += (this.wi.i + -this.kg) / ((this.ac - 500) / 15 + 16);
            }
        } else if (-this.wi.i + this.kg < -500 || -this.wi.i + this.kg > 500 || -this.wi.K + this.Si < -500 || this.Si + -this.wi.K > 500) {
            this.kg = this.wi.i;
            this.Si = this.wi.K;
        }
        if (this.Qk) {
            if (this.Cb.length() > 0) {
                if (this.Cb.equalsIgnoreCase("::lostcon") && !this.hj) {
                    this.Jh.a(true);
                } else if (!this.Cb.equalsIgnoreCase("::closecon") || this.hj) {
                    this.Jh.b(45, 0);
                    if (this.Yk) {
                        this.Jh.f.c(1, -75);
                    } else {
                        this.Jh.f.c(0, -100);
                        this.Yk = true;
                    }
                    this.Jh.f.a(this.Cb, 116);
                    this.Jh.b(21294);
                    this.e = "";
                    this.Zj = "Please wait...";
                    this.Cb = "";
                } else {
                    this.a(true, arg0 + 31);
                }
            }
            if (this.Qb == 1 && this.xb > 275 && this.xb < 310 && this.I > 56 && this.I < 456) {
                this.Jh.b(45, 0);
                if (!this.Yk) {
                    this.Jh.f.c(0, 35);
                    this.Yk = true;
                } else {
                    this.Jh.f.c(1, 123);
                }
                this.Jh.f.a("-null-", arg0 ^ 0xFFFFFFB6);
                this.Jh.b(21294);
                this.Zj = "Please wait...";
                this.Cb = "";
                this.e = "";
            }
            this.Qb = 0;
            return;
        }
        if (this.xb > this.Oi - 4) {
            if (this.I > 15 && this.I < 96 && this.Qb == 1) {
                this.Zh = 0;
            }
            if (this.I > 110 && this.I < 194 && this.Qb == 1) {
                this.Zh = 1;
                this.yd.j[this.Fh] = 999999;
            }
            if (this.I > 215 && this.I < 295 && this.Qb == 1) {
                this.Zh = 2;
                this.yd.j[this.ud] = 999999;
            }
            if (this.I > 315 && this.I < 395 && this.Qb == 1) {
                this.Zh = 3;
                this.yd.j[this.mc] = 999999;
            }
            if (this.I > 417 && this.I < 497 && this.Qb == 1) {
                this.Cb = "";
                this.Vf = 1;
                this.e = "";
            }
            this.Bb = 0;
            this.Qb = 0;
        }
        this.yd.b(this.Bb, this.xb, arg0 - 9989, this.Qb, this.I);
        if (this.Zh > 0 && this.I >= 494 && this.xb >= this.Oi - 66) {
            this.Qb = 0;
        }
        if (this.yd.a((byte)-128, this.bh)) {
            String string = this.yd.g(this.bh, 4);
            this.yd.a(this.bh, "", 27642);
            if (string.startsWith("::")) {
                if (!string.equalsIgnoreCase("::closecon") || this.hj) {
                    if (string.equalsIgnoreCase("::logout") && !this.hj) {
                        this.a(true, arg0 ^ 0x1F);
                    } else if (!string.equalsIgnoreCase("::lostcon") || this.hj) {
                        this.a(string.substring(2), 120);
                    } else {
                        this.u(116);
                    }
                } else {
                    this.Jh.a(true);
                }
            } else {
                this.b(string, arg0 + 216);
            }
        }
        for (n2 = 0; n2 < 100; ++n2) {
            if (pa.g[n2] <= 0) continue;
            int n10 = n2;
            pa.g[n10] = pa.g[n10] - 1;
        }
        if (this.rk != 0) {
            this.Qb = 0;
        }
        if (!this.Hk && !this.Pj) {
            this.Ti = 0;
            this.Tk = 0;
        } else {
            this.Ti = this.Bb == 0 ? 0 : ++this.Ti;
            if (this.Ti <= 600) {
                if (this.Ti > 450) {
                    this.Tk += 500;
                } else if (this.Ti > 300) {
                    this.Tk += 50;
                } else if (this.Ti <= 150) {
                    if (this.Ti <= 50) {
                        if (this.Ti > 20 && (this.Ti & 5) == 0) {
                            ++this.Tk;
                        }
                    } else {
                        ++this.Tk;
                    }
                } else {
                    this.Tk += 5;
                }
            } else {
                this.Tk += 5000;
            }
        }
        if (this.Qb == 1) {
            this.Cf = 1;
        } else if (this.Qb == 2) {
            this.Cf = 2;
        }
        this.Ek.a(0, this.I, this.xb);
        this.Qb = 0;
        if (this.Kh) {
            if (this.Wc == 0 || this.Td) {
                if (this.Z) {
                    this.Z = false;
                    this.si = this.si + 1 & 7;
                    if (!this.zf) {
                        if ((1 & this.si) == 0) {
                            this.si = 7 & 1 + this.si;
                        }
                        for (n2 = 0; n2 < 8 && !this.b((byte)-125, this.si); ++n2) {
                            this.si = 1 + this.si & 7;
                        }
                    }
                }
                if (this.E) {
                    this.E = false;
                    this.si = 7 + this.si & 7;
                    if (!this.zf) {
                        if ((1 & this.si) == 0) {
                            this.si = this.si + 7 & 7;
                        }
                        for (n2 = 0; n2 < 8 && !this.b((byte)-116, this.si); ++n2) {
                            this.si = this.si + 7 & 7;
                        }
                    }
                }
            }
        } else if (this.Z) {
            this.ug = 0xFF & this.ug + 2;
        } else if (this.E) {
            this.ug = 0xFF & this.ug - 2;
        }
        if (this.xh > 0) {
            --this.xh;
        } else if (this.xh < 0) {
            ++this.xh;
        }
        if (!this.zf || this.ac <= 550) {
            if (!this.zf && this.ac < 750) {
                this.ac += 4;
            }
        } else {
            this.ac -= 4;
        }
        this.Ek.d(25013, 17);
        ++this.qk;
        if (this.qk > 5) {
            this.qk = 0;
            this.Nc = (1 + this.Nc) % 4;
            this.Mg = (1 + this.Mg) % 3;
            this.pj = (1 + this.pj) % 5;
        }
        for (n2 = 0; this.eh > n2; ++n2) {
            int n11 = this.Se[n2];
            n7 = this.ye[n2];
            if (n11 < 0 || n7 < 0 || n11 >= 96 || n7 >= 96 || this.vc[n2] != 74) continue;
            this.hg[n2].f(0, -31616, 0, 1);
        }
        for (n2 = arg0; n2 < this.el; ++n2) {
            int n12 = n2;
            this.oe[n12] = this.oe[n12] + 1;
            if (this.oe[n2] <= 50) continue;
            --this.el;
            for (int i2 = n2; i2 < this.el; ++i2) {
                this.Sc[i2] = this.Sc[i2 + 1];
                this.gi[i2] = this.gi[1 + i2];
                this.oe[i2] = this.oe[1 + i2];
                this.Oc[i2] = this.Oc[1 + i2];
            }
        }
    }

    private final void j(int arg0) {
        int n2 = 65;
        if (this.Sb != 201) {
            n2 += 60;
        }
        if (this.id > 0) {
            n2 += 30;
        }
        if (this.ce != 0) {
            n2 += 45;
        }
        this.li.a(56, (byte)77, 0, -(n2 / 2) + 167, n2, 400);
        int n3 = -(n2 / 2) + 167;
        this.li.e(56, 400, -(n2 / 2) + 167, 27785, n2, 0xFFFFFF);
        this.li.a(256, "Welcome to RuneScape " + this.wi.C, 0xFFFF00, 0, 4, n3 += 20);
        n3 += 30;
        String string = this.hi == 0 ? "earlier today" : (this.hi != 1 ? this.hi + " days ago" : "yesterday");
        if (this.ce != 0) {
            this.li.a(256, "You last logged in " + string, 0xFFFFFF, 0, 1, n3);
            n3 += 15;
            if (this.ve == null) {
                this.ve = this.c(arg0 ^ 0x128B, this.ce);
            }
            this.li.a(256, "from: " + this.ve, 0xFFFFFF, arg0 ^ 0xFFFFED0B, 1, n3);
            n3 += 15;
            n3 += 15;
        }
        if (this.id > 0) {
            if (this.id == 1) {
                this.li.a(256, "You have @yel@0@whi@ unread messages in your message-centre", 0xFFFFFF, 0, 1, n3);
            } else {
                this.li.a(256, "You have @gre@" + (this.id - 1) + " unread messages @whi@in your message-centre", 0xFFFFFF, arg0 + 4853, 1, n3);
            }
            n3 += 15;
            n3 += 15;
        }
        if (this.Sb != 201) {
            if (this.Sb == 200) {
                this.li.a(256, "You have not yet set any password recovery questions.", 0xFF8000, 0, 1, n3);
                this.li.a(256, "We strongly recommend you do so now to secure your account.", 0xFF8000, arg0 ^ 0xFFFFED0B, 1, n3 += 15);
                this.li.a(256, "Do this from the 'account management' area on our front webpage", 0xFF8000, 0, 1, n3 += 15);
                n3 += 15;
            } else {
                string = this.Sb == 0 ? "Earlier today" : (this.Sb == 1 ? "Yesterday" : this.Sb + " days ago");
                this.li.a(256, string + " you changed your recovery questions", 0xFF8000, 0, 1, n3);
                this.li.a(256, "If you do not remember making this change then cancel it immediately", 0xFF8000, 0, 1, n3 += 15);
                this.li.a(256, "Do this from the 'account management' area on our front webpage", 0xFF8000, arg0 + 4853, 1, n3 += 15);
                n3 += 15;
            }
            n3 += 15;
        }
        int n4 = 0xFFFFFF;
        if (this.xb > n3 - 12 && this.xb <= n3 && this.I > 106 && this.I < 406) {
            n4 = 0xFF0000;
        }
        this.li.a(256, "Click here to close window", n4, arg0 ^ arg0, 1, n3);
        if (this.Cf == 1) {
            if (n4 == 0xFF0000) {
                this.Oh = false;
            }
            if (!(this.I >= 86 && this.I <= 426 || this.xb >= -(n2 / 2) + 167 && this.xb <= n2 / 2 + 167)) {
                this.Oh = false;
            }
        }
        this.Cf = 0;
    }

    @Override
    public final void init() {
        aa.l = Integer.parseInt(this.getParameter("nodeid"));
        e.i = ub.a(Integer.parseInt(this.getParameter("modewhere")), (byte)24);
        if (e.i == null) {
            e.i = ua.E;
        }
        db.f = u.a(false, Integer.parseInt(this.getParameter("modewhat")));
        if (db.f == null) {
            db.f = eb.e;
        }
        super.a(this.Oi + 12, fa.d, db.f.a + 32, 2, this.Wd);
    }

    private final boolean a(String arg0, int arg1, String arg2) {
        int n2;
        String string = w.a(arg0, (byte)92);
        if (string == null) {
            return false;
        }
        if (arg1 <= 126) {
            return true;
        }
        if (string.equals(w.a(this.wi.C, (byte)93))) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (n2 = 0; n.g > n2; ++n2) {
            if (!string.equals(w.a(ua.h[n2], (byte)52))) continue;
            bl = true;
            if ((4 & Fj[n2]) == 0) break;
            bl2 = true;
            break;
        }
        if (bl) {
            if (bl2) {
                this.zh.a("Message", "@whi@" + arg2, arg2, 2830, arg0, (byte)-50);
            }
        } else {
            n2 = 0;
            for (int i2 = 0; db.g > i2; ++i2) {
                if (!string.equals(w.a(ia.a[i2], (byte)51))) continue;
                n2 = 1;
                break;
            }
            if (n2 == 0) {
                this.zh.a("Add friend", "@whi@" + arg2, arg2, 2831, arg0, (byte)80);
                this.zh.a("Add ignore", "@whi@" + arg2, arg2, 2832, arg0, (byte)-37);
            }
        }
        this.zh.a("Report abuse", "@whi@" + arg2, arg2, 2833, arg0, (byte)110);
        return true;
    }

    private final void a(String arg0, byte arg1) {
        int n2;
        if (db.g >= 100) {
            this.a(false, null, 0, "Ignore list full", 0, 0, null, null);
            return;
        }
        String string = w.a(arg0, (byte)122);
        if (string == null) {
            return;
        }
        if (arg1 != 5) {
            this.ye = null;
        }
        for (n2 = 0; n2 < db.g; ++n2) {
            if (string.equals(w.a(l.c[n2], (byte)93))) {
                this.a(false, null, 0, arg0 + " is already on your ignore list", 0, 0, null, null);
                return;
            }
            if (ia.g[n2] == null || !string.equals(w.a(ia.g[n2], (byte)62))) continue;
            this.a(false, null, arg1 ^ 5, arg0 + " is already on your ignore list", 0, 0, null, null);
            return;
        }
        for (n2 = 0; n2 < n.g; ++n2) {
            if (string.equals(w.a(ua.h[n2], (byte)124))) {
                this.a(false, null, 0, "Please remove " + arg0 + " from your friends list first", 0, 0, null, null);
                return;
            }
            if (cb.c[n2] == null || !string.equals(w.a(cb.c[n2], (byte)115))) continue;
            this.a(false, null, 0, "Please remove " + arg0 + " from your friends list first", 0, 0, null, null);
            return;
        }
        if (string.equals(w.a(this.wi.C, (byte)127))) {
            this.a(false, null, arg1 - 5, "You can't add yourself to your ignore list", 0, 0, null, null);
            return;
        }
        this.Jh.b(132, arg1 - 5);
        this.Jh.f.a(arg0, arg1 ^ 0x72);
        this.Jh.b(21294);
    }

    private final void v(int arg0) {
        if (arg0 < 14) {
            this.a(-44, 54, 119, 125, true, 30);
        }
        boolean bl = true;
        while (bl) {
            bl = false;
            for (int i2 = 0; i2 < n.g - 1; ++i2) {
                if (!((Fj[i2] & 2) == 0 && (Fj[i2 + 1] & 2) != 0 || (4 & Fj[i2]) == 0 && (Fj[1 + i2] & 4) != 0)) continue;
                String string = ac.z[i2];
                ac.z[i2] = ac.z[i2 + 1];
                ac.z[i2 + 1] = string;
                String string2 = ua.h[i2];
                ua.h[i2] = ua.h[1 + i2];
                ua.h[i2 + 1] = string2;
                string2 = cb.c[i2];
                cb.c[i2] = cb.c[i2 + 1];
                cb.c[i2 + 1] = string2;
                int n2 = Fj[i2];
                client.Fj[i2] = Fj[i2 + 1];
                bl = true;
                client.Fj[i2 + 1] = n2;
            }
        }
    }

    private final void a(int arg0, int arg1, byte arg2, int arg3) {
        this.li.a(arg3, arg1, 76, arg0);
        this.li.a(arg3, arg1 - 1, 111, arg0);
        if (arg2 > -32) {
            return;
        }
        this.li.a(arg3, 1 + arg1, 111, arg0);
        this.li.a(arg3 - 1, arg1, 60, arg0);
        this.li.a(arg3 + 1, arg1, 112, arg0);
    }

    private final void c(byte arg0) {
        block47: {
            int n2;
            int n3;
            int n4;
            if (this.Cb.length() <= 0 && !this.vk) {
                if (this.gc >= 1 && this.gc <= 8) {
                    String string = "";
                    for (n4 = 0; this.e.length() > n4; ++n4) {
                        n3 = this.e.charAt(n4);
                        if (!Character.isDigit((char)n3)) continue;
                        string = string + (char)n3;
                    }
                    this.e = string;
                }
            } else {
                String string = this.Cb.trim();
                this.e = "";
                this.Cb = "";
                if (this.gc == 1) {
                    try {
                        this.a(Integer.parseInt(string), (byte)9, this.ji);
                    }
                    catch (NumberFormatException numberFormatException) {}
                } else if (this.gc == 2) {
                    try {
                        this.c(Integer.parseInt(string), (byte)124, this.ji);
                    }
                    catch (NumberFormatException numberFormatException) {}
                } else if (this.gc != 3) {
                    if (this.gc == 4) {
                        try {
                            int n5 = this.Rd < 0 ? -1 : this.ae[this.Rd];
                            int n6 = Integer.parseInt(string);
                            this.Jh.b(23, 0);
                            this.Jh.f.e(arg0 + 436, n5);
                            this.Jh.f.b(-422797528, n6);
                            this.Jh.f.b(arg0 - 422797485, -2023406815);
                            this.Jh.b(21294);
                        }
                        catch (NumberFormatException numberFormatException) {}
                    } else if (this.gc != 5) {
                        if (this.gc == 6) {
                            try {
                                int n7 = this.Rj[this.Di];
                                if (n7 != -1) {
                                    int n8 = Integer.parseInt(string);
                                    this.Jh.b(221, 0);
                                    this.Jh.f.e(393, this.Rj[this.Di]);
                                    this.Jh.f.e(393, this.Jf[this.Di]);
                                    this.Jh.f.e(arg0 + 436, n8);
                                    this.Jh.b(21294);
                                }
                            }
                            catch (NumberFormatException numberFormatException) {}
                        } else if (this.gc == 7) {
                            try {
                                this.b(109, Integer.parseInt(string), this.ck);
                            }
                            catch (NumberFormatException numberFormatException) {}
                        } else if (this.gc == 8) {
                            try {
                                this.a(this.ck, Integer.parseInt(string), (byte)-78);
                            }
                            catch (NumberFormatException numberFormatException) {}
                        } else if (this.gc == 9) {
                            this.Jh.b(84, 0);
                            this.Jh.b(21294);
                        }
                    } else {
                        try {
                            int n9 = this.Rj[this.Di];
                            if (n9 != -1) {
                                int n10 = Integer.parseInt(string);
                                this.Jh.b(236, 0);
                                this.Jh.f.e(arg0 ^ 0xFFFFFE5C, n9);
                                this.Jh.f.e(393, this.Jf[this.Di]);
                                this.Jh.f.e(393, n10);
                                this.Jh.b(arg0 + 21337);
                            }
                        }
                        catch (NumberFormatException numberFormatException) {}
                    }
                } else {
                    try {
                        int n11 = this.Rd >= 0 ? this.ae[this.Rd] : -1;
                        int n12 = Integer.parseInt(string);
                        this.Jh.b(22, 0);
                        this.Jh.f.e(393, n11);
                        this.Jh.f.b(-422797528, n12);
                        this.Jh.f.b(-422797528, 305419896);
                        this.Jh.b(21294);
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                }
                this.gc = 0;
                return;
            }
            int n13 = -(this.zi / 2) + 256;
            n4 = -(this.gl / 2) + 180;
            this.li.a(n13, (byte)-103, 0, n4, this.gl, this.zi);
            this.li.e(n13, this.zi, n4, arg0 ^ 0xFFFF935C, this.gl, 0xFFFFFF);
            n3 = this.li.a(arg0 + 508305395, 1);
            int n14 = this.li.a(508305352, 4);
            int n15 = n3 + 2;
            for (n2 = 0; n2 < this.od.length; ++n2) {
                this.li.a(256, this.od[n2], 0xFFFF00, arg0 ^ 0xFFFFFFD5, 1, n15 * n2 + (5 + n4) - -n3);
            }
            if (this.Bd) {
                this.li.a(256, this.e + "*", 0xFFFFFF, arg0 ^ 0xFFFFFFD5, 4, n4 + (5 + n15 * this.od.length) - (-n14 - 3));
            }
            n2 = 0xFFFFFF;
            if (arg0 != -43) {
                return;
            }
            int n16 = n3 + (8 + n4) - (-(this.od.length * n15) + (-n14 - 2));
            if (this.I > 230 && this.I < 248 && n16 + -n3 < this.xb && n16 > this.xb) {
                n2 = 0xFFFF00;
                if (this.Cf != 0) {
                    this.vk = true;
                    this.Cf = 0;
                    this.Cb = this.e;
                }
            }
            this.li.a("OK", 230, n16, n2, false, 1);
            n2 = 0xFFFFFF;
            if (this.I > 264 && this.I < 304 && n16 + -n3 < this.xb && n16 > this.xb) {
                n2 = 0xFFFF00;
                if (this.Cf != 0) {
                    this.Cf = 0;
                    this.gc = 0;
                }
            }
            this.li.a("Cancel", 264, n16, n2, false, 1);
            if (this.Cf != 1 || n13 <= this.I && this.I <= this.zi + n13 && this.xb >= n4 && this.xb <= this.gl + n4) break block47;
            this.gc = 0;
            this.Cf = 0;
        }
    }

    private final void f(boolean arg0) {
        byte[] byArray;
        if (arg0) {
            this.a((byte)77, (String)null);
        }
        if ((byArray = this.a("Configuration", 10, 0, 78)) == null) {
            this.Vc = true;
            return;
        }
        m.a(byArray, (byte)100, this.Pg);
    }

    private final void a(int arg0, int arg1, int arg2) {
        block41: {
            if ((arg2 = this.Jh.a(507, arg2)) == 131) {
                int n2 = this.mg.a((byte)104);
                int n3 = this.mg.a((byte)104);
                String string = this.mg.c((byte)-44);
                String string2 = null;
                String string3 = null;
                String string4 = null;
                if ((n3 & 1) != 0) {
                    string2 = this.mg.c((byte)-44);
                }
                if ((1 & n3) != 0) {
                    string3 = this.mg.c((byte)-44);
                }
                if ((n3 & 2) != 0) {
                    string4 = this.mg.c((byte)-44);
                }
                this.a(false, string2, 0, string, n2, 0, string3, string4);
            } else if (arg2 != 4) {
                if (arg2 == 183) {
                    this.g((byte)-65);
                } else if (arg2 != 189) {
                    if (arg2 != 165) {
                        if (arg2 != 149) {
                            if (arg2 == 237) {
                                String string = this.mg.c((byte)-44);
                                String string5 = this.mg.c((byte)-44);
                                if (string5.length() == 0) {
                                    string5 = string;
                                }
                                String string6 = this.mg.c((byte)-44);
                                String string7 = this.mg.c((byte)-44);
                                if (string7.length() == 0) {
                                    string7 = string;
                                }
                                boolean bl = this.mg.a((byte)104) == 1;
                                for (int i2 = 0; i2 < db.g; ++i2) {
                                    if (bl) {
                                        if (!ia.a[i2].equals(string7)) continue;
                                        l.c[i2] = string;
                                        ia.a[i2] = string5;
                                        ia.g[i2] = string6;
                                        ua.wb[i2] = string7;
                                        return;
                                    }
                                    if (!ia.a[i2].equals(string5)) continue;
                                    return;
                                }
                                if (bl) {
                                    System.out.println("Error: ignore display name change packet received, but old name '" + string7 + "' is not on ignore list");
                                    return;
                                }
                                l.c[db.g] = string;
                                ia.a[db.g] = string5;
                                ia.g[db.g] = string6;
                                ua.wb[db.g] = string7;
                                ++db.g;
                            } else if (arg2 == 109) {
                                db.g = this.mg.a((byte)104);
                                for (int i3 = 0; db.g > i3; ++i3) {
                                    l.c[i3] = this.mg.c((byte)-44);
                                    ia.a[i3] = this.mg.c((byte)-44);
                                    ia.g[i3] = this.mg.c((byte)-44);
                                    ua.wb[i3] = this.mg.c((byte)-44);
                                }
                            } else if (arg2 != 51) {
                                if (arg2 == 120) {
                                    String string = this.mg.c((byte)-44);
                                    String string8 = this.mg.c((byte)-44);
                                    int n4 = this.mg.a((byte)104);
                                    long l2 = this.mg.g(0);
                                    String string9 = ia.a(this.mg, false);
                                    for (int i4 = 0; i4 < 100; ++i4) {
                                        if ((l2 ^ 0xFFFFFFFFFFFFFFFFL) != (this.Zd[i4] ^ 0xFFFFFFFFFFFFFFFFL)) continue;
                                        return;
                                    }
                                    this.Zd[this.Ag] = l2;
                                    this.Ag = (this.Ag + 1) % 100;
                                    this.a(n4 == 2, string, 0, string9, 1, n4, string8, null);
                                } else if (arg2 != 87) {
                                    this.b(arg2, (byte)41, arg1);
                                } else {
                                    String string = this.mg.c((byte)-44);
                                    String string10 = ia.a(this.mg, false);
                                    this.a(false, string, 0, string10, 2, 0, string, null);
                                }
                            } else {
                                this.De = this.mg.a((byte)104);
                                this.dc = this.mg.a((byte)104);
                                this.Vg = this.mg.a((byte)104);
                                this.ui = this.mg.a((byte)104);
                            }
                        } else {
                            String string = this.mg.c((byte)-44);
                            String string11 = this.mg.c((byte)-44);
                            int n5 = this.mg.a((byte)104);
                            boolean bl = (n5 & 1) != 0;
                            boolean bl2 = (4 & n5) != 0;
                            String string12 = null;
                            if (bl2) {
                                string12 = this.mg.c((byte)-44);
                            }
                            for (int i5 = 0; n.g > i5; ++i5) {
                                if (!bl) {
                                    if (!ua.h[i5].equals(string)) continue;
                                    if (ac.z[i5] == null && bl2) {
                                        this.a(false, null, 0, string + " has logged in", 5, 0, null, null);
                                    }
                                    if (ac.z[i5] != null && !bl2) {
                                        this.a(false, null, arg0 ^ 0x57, string + " has logged out", 5, 0, null, null);
                                    }
                                    cb.c[i5] = string11;
                                    ac.z[i5] = string12;
                                    client.Fj[i5] = n5;
                                    arg1 = 0;
                                    this.v(51);
                                    return;
                                }
                                if (!ua.h[i5].equals(string11)) continue;
                                if (ac.z[i5] == null && bl2) {
                                    this.a(false, null, 0, string + " has logged in", 5, 0, null, null);
                                }
                                if (ac.z[i5] != null && !bl2) {
                                    this.a(false, null, 0, string + " has logged out", 5, 0, null, null);
                                }
                                ua.h[i5] = string;
                                cb.c[i5] = string11;
                                ac.z[i5] = string12;
                                client.Fj[i5] = n5;
                                arg1 = 0;
                                this.v(50);
                                return;
                            }
                            if (bl) {
                                System.out.println("Error: friend display name change packet received, but old name '" + string11 + "' is not on friend list");
                                return;
                            }
                            ua.h[n.g] = string;
                            cb.c[n.g] = string11;
                            ac.z[n.g] = string12;
                            client.Fj[n.g] = n5;
                            ++n.g;
                            this.v(66);
                        }
                    } else {
                        this.a(false, 31);
                    }
                } else {
                    this.mg.w += 28;
                    if (this.mg.e(-422797528)) {
                        b.a(this.mg, 26628, this.mg.w - 28);
                    }
                }
            } else {
                this.a(true, arg0 - 56);
            }
            if (arg0 == 87) break block41;
            this.B(56);
        }
    }

    private final void g(int arg0) {
        block0: {
            if (arg0 == -16433) break block0;
            this.eg = 77;
        }
    }

    private final void s(int arg0) {
        block43: {
            int n2;
            block44: {
                String string;
                int n3;
                Object object;
                Object object2;
                int n4;
                if ((this.Zh == 1 && this.yd.a((byte)-107, this.Fh) || this.Zh == 3 && this.yd.a((byte)-116, this.mc)) && ((n4 = this.yd.f(14458, (int)(object2 = this.Zh == 1 ? this.Fh : this.mc))) >> 16 == 2 || this.Yh && n4 >> 16 == 1) && this.a((String)(object = this.yd.b(n3 = 0xFFFF & n4, 19680, (int)object2)), arg0 ^ 0x7D, string = this.yd.a(n3, arg0 ^ 0xFFFFFF86, (int)object2))) {
                    return;
                }
                if (this.Zh == 0) {
                    for (object2 = 0; object2 < 100; ++object2) {
                        if (pa.g[object2] <= 0 || n.j[object2] != 4 && n.j[object2] != 1 && n.j[object2] != 5 && n.j[object2] != 6) continue;
                        String string2 = ub.a[object2] + mb.a(aa.k[object2], k.G[object2], true, n.j[object2]);
                        if (this.I <= 7 || this.I >= this.li.a(1, arg0 ^ 0x72, string2) + 7 || this.xb <= -(object2 * 12) - 30 + this.Oi || -(12 * object2) + this.Oi - 18 <= this.xb || this.Cf != 2 && (!this.Yh || this.Cf != 1) || !this.a(ba.Yb[object2], 127, k.G[object2])) continue;
                        return;
                    }
                }
                this.Hc = false;
                for (n4 = 0; n4 < this.eh; ++n4) {
                    this.Ed[n4] = false;
                }
                object2 = -1;
                for (n4 = 0; this.hf > n4; ++n4) {
                    this.Sj[n4] = false;
                }
                n4 = this.Ek.b(0);
                ca[] caArray = this.Ek.b((byte)124);
                object = this.Ek.a((byte)104);
                if (arg0 != 2) {
                    this.nk = -82;
                }
                for (n2 = 0; n4 > n2 && this.zh.c(arg0 ^ 0xFFFF95ED) <= 200; ++n2) {
                    int n5;
                    int n6;
                    Object object3 = object[n2];
                    ca ca2 = caArray[n2];
                    if (ca2.E[object3] > 65535 && (ca2.E[object3] < 200000 || ca2.E[object3] > 300000)) continue;
                    if (this.Ek.T != ca2) {
                        if (ca2 == null || ca2.rb < 10000) {
                            if (ca2 != null && ca2.rb >= 0) {
                                n6 = ca2.rb;
                                n5 = this.vc[n6];
                                if (this.Ed[n6]) continue;
                                if (this.af < 0) {
                                    if (this.Bh >= 0) {
                                        this.zh.a(this.ye[n6], "Use " + this.ig + " with", -104, this.Bh, this.vc[n6], 410, this.bg[n6], "@cya@" + l.a[n5], this.Se[n6]);
                                    } else {
                                        if (!s.f[n5].equalsIgnoreCase("WalkTo")) {
                                            this.zh.a(420, this.ye[n6], this.bg[n6], this.Se[n6], arg0 ^ 0x6B, this.vc[n6], "@cya@" + l.a[n5], s.f[n5]);
                                        }
                                        if (!p.a[n5].equalsIgnoreCase("Examine")) {
                                            this.zh.a(2400, this.ye[n6], this.bg[n6], this.Se[n6], arg0 ^ 0x7F, this.vc[n6], "@cya@" + l.a[n5], p.a[n5]);
                                        }
                                        this.zh.a(n5, 3400, false, "Examine", "@cya@" + l.a[n5]);
                                    }
                                } else if (qb.e[this.af] == 5) {
                                    this.zh.a(this.ye[n6], "Cast " + ja.L[this.af] + " on", arg0 + 65, this.af, this.vc[n6], 400, this.bg[n6], "@cya@" + l.a[n5], this.Se[n6]);
                                }
                                this.Ed[n6] = true;
                                continue;
                            }
                            if (object3 >= false) {
                                object3 = ca2.E[object3] - 200000;
                            }
                            if (object3 < 0) continue;
                            object2 = object3;
                            continue;
                        }
                        n6 = ca2.rb - 10000;
                        n5 = this.Ng[n6];
                        if (this.Sj[n6]) continue;
                        if (this.af >= 0) {
                            if (qb.e[this.af] == 4) {
                                this.zh.a(300, this.yk[n6], this.Hj[n6], this.Jd[n6], 60, this.af, "@cya@" + ta.r[n5], "Cast " + ja.L[this.af] + " on");
                            }
                        } else if (this.Bh >= 0) {
                            this.zh.a(310, this.yk[n6], this.Hj[n6], this.Jd[n6], arg0 ^ 0x42, this.Bh, "@cya@" + ta.r[n5], "Use " + this.ig + " with");
                        } else {
                            if (!u.b[n5].equalsIgnoreCase("WalkTo")) {
                                this.zh.a(this.Jd[n6], (byte)22, 320, u.b[n5], "@cya@" + ta.r[n5], this.Hj[n6], this.yk[n6]);
                            }
                            if (!f.e[n5].equalsIgnoreCase("Examine")) {
                                this.zh.a(this.Jd[n6], (byte)22, 2300, f.e[n5], "@cya@" + ta.r[n5], this.Hj[n6], this.yk[n6]);
                            }
                            this.zh.a(n5, 3300, false, "Examine", "@cya@" + ta.r[n5]);
                        }
                        this.Sj[n6] = true;
                        continue;
                    }
                    n6 = ca2.E[object3] % 10000;
                    n5 = ca2.E[object3] / 10000;
                    if (n5 != 1) {
                        if (n5 == 2) {
                            if (this.af >= 0) {
                                if (qb.e[this.af] != 3) continue;
                                this.zh.a(200, this.Ni[n6], this.Gj[n6], this.Zf[n6], arg0 ^ 0x46, this.af, "@lre@" + ac.x[this.Gj[n6]], "Cast " + ja.L[this.af] + " on");
                                continue;
                            }
                            if (this.Bh < 0) {
                                this.zh.a(this.Zf[n6], (byte)22, 220, "Take", "@lre@" + ac.x[this.Gj[n6]], this.Gj[n6], this.Ni[n6]);
                                this.zh.a(this.Gj[n6], 3200, false, "Examine", "@lre@" + ac.x[this.Gj[n6]]);
                                continue;
                            }
                            this.zh.a(210, this.Ni[n6], this.Gj[n6], this.Zf[n6], 68, this.Bh, "@lre@" + ac.x[this.Gj[n6]], "Use " + this.ig + " with");
                            continue;
                        }
                        if (n5 != 3) continue;
                        String string3 = "";
                        int n7 = -1;
                        int n8 = this.Tb[n6].t;
                        if (o.a[n8] > 0) {
                            int n9 = (eb.b[n8] + (la.a[n8] + jb.k[n8]) - -fb.d[n8]) / 4;
                            int n10 = (this.cg[3] + this.cg[2] + this.cg[1] + this.cg[0] + 27) / 4;
                            string3 = "@yel@";
                            n7 = -n9 + n10;
                            if (n7 < 0) {
                                string3 = "@or1@";
                            }
                            if (n7 < -3) {
                                string3 = "@or2@";
                            }
                            if (n7 < -6) {
                                string3 = "@or3@";
                            }
                            if (n7 < -9) {
                                string3 = "@red@";
                            }
                            if (n7 > 0) {
                                string3 = "@gr1@";
                            }
                            if (n7 > 3) {
                                string3 = "@gr2@";
                            }
                            if (n7 > 6) {
                                string3 = "@gr3@";
                            }
                            if (n7 > 9) {
                                string3 = "@gre@";
                            }
                            string3 = " " + string3 + "(level-" + n9 + ")";
                        }
                        if (this.af >= 0) {
                            if (qb.e[this.af] != 2) continue;
                            this.zh.a(this.Tb[n6].b, "@yel@" + e.Mb[this.Tb[n6].t], 700, "Cast " + ja.L[this.af] + " on", this.af, 3296);
                            continue;
                        }
                        if (this.Bh < 0) {
                            if (o.a[n8] > 0) {
                                this.zh.a(this.Tb[n6].b, n7 >= 0 ? 715 : 2715, false, "Attack", "@yel@" + e.Mb[this.Tb[n6].t] + string3);
                            }
                            this.zh.a(this.Tb[n6].b, 720, false, "Talk-to", "@yel@" + e.Mb[this.Tb[n6].t]);
                            if (!p.e[n8].equals("")) {
                                this.zh.a(this.Tb[n6].b, 725, false, p.e[n8], "@yel@" + e.Mb[this.Tb[n6].t]);
                            }
                            this.zh.a(this.Tb[n6].t, 3700, false, "Examine", "@yel@" + e.Mb[this.Tb[n6].t]);
                            continue;
                        }
                        this.zh.a(this.Tb[n6].b, "@yel@" + e.Mb[this.Tb[n6].t], 710, "Use " + this.ig + " with", this.Bh, arg0 ^ 0xCE2);
                        continue;
                    }
                    this.a(n6, -12);
                }
                if (this.af >= 0 && qb.e[this.af] <= 1) {
                    this.zh.a(this.af, 1000, false, "Cast " + ja.L[this.af] + " on self", "");
                }
                if (object2 == -1) break block43;
                this.Hc = true;
                n2 = object2;
                this.rf = this.Qg + this.Hh.q[n2];
                this.Cg = this.zg + this.Hh.E[n2];
                if (this.af < 0) break block44;
                if (qb.e[this.af] != 6) break block43;
                this.zh.a(this.Hh.q[n2], (byte)22, 900, "Cast " + ja.L[this.af] + " on ground", "", this.af, this.Hh.E[n2]);
                break block43;
            }
            if (this.Bh >= 0) break block43;
            this.zh.a(this.Hh.q[n2], "", 920, "Walk here", this.Hh.E[n2], 3296);
        }
    }

    private final void L(int arg0) {
        block32: {
            block33: {
                int n2;
                int n3;
                if (this.af >= 0 || this.Bh >= 0) {
                    this.zh.a(4000, "", "Cancel", 30192);
                }
                this.zh.a((byte)16);
                int n4 = this.zh.c(-27153);
                if (arg0 >= -120) {
                    return;
                }
                for (n3 = n4; n3 > 20; --n3) {
                    this.zh.b(102, n3 - 1);
                }
                if (this.qc == 5) {
                    String string = null;
                    if (this.pk == 0 && this.wk != -1) {
                        if (this.wk >= 0) {
                            String string2 = "";
                            n2 = this.wk;
                            if ((4 & Fj[n2]) == 0) {
                                string = ua.h[n2];
                                string2 = " is offline";
                            } else {
                                string = "Click to message " + ua.h[n2];
                                if (ac.z[n2] != null) {
                                    string2 = " on " + ac.z[n2];
                                }
                            }
                            string = cb.c[n2] != null && cb.c[n2].length() > 0 ? string + " (formerly " + cb.c[n2] + ")" + string2 : string + string2;
                        } else {
                            int n5 = -(2 + this.wk);
                            string = "Click to remove " + ua.h[n5];
                            if (cb.c[n5] != null && cb.c[n5].length() > 0) {
                                string = string + " (formerly " + cb.c[n5] + ")";
                            }
                        }
                    }
                    if (this.pk == 1 && this.nj != -1) {
                        if (this.nj >= 0) {
                            int n6 = this.nj;
                            string = "Ignoring " + l.c[n6];
                            if (ia.g[n6] != null && ia.g[n6].length() > 0) {
                                string = string + " (formerly " + ia.g[n6] + ")";
                            }
                        } else {
                            int n7 = -(2 + this.nj);
                            string = "Click to remove " + l.c[n7];
                            if (ia.g[n7] != null && ia.g[n7].length() > 0) {
                                string = string + " (formerly " + ia.g[n7] + ")";
                            }
                        }
                    }
                    if (string != null) {
                        this.li.a(string, 6, 14, 0xFFFF00, false, 1);
                    }
                }
                if ((n3 = this.zh.c(-27153)) <= 0) break block32;
                int n8 = -1;
                for (n2 = 0; n3 > n2; ++n2) {
                    String string = this.zh.b((byte)74, n2);
                    if (string == null || string.length() <= 0) continue;
                    n8 = n2;
                    break;
                }
                String string = null;
                if (this.Bh < 0 && this.af < 0 || n3 != 1) {
                    if (this.Bh < 0 && this.af < 0 || n3 <= 1) {
                        if (n8 != -1) {
                            string = this.zh.b((byte)54, n8) + ": @whi@" + this.zh.b(0, (byte)53);
                        }
                    } else {
                        string = "@whi@" + this.zh.b(0, (byte)53) + " " + this.zh.b((byte)75, 0);
                    }
                } else {
                    string = "Choose a target";
                }
                if (n3 == 2 && string != null) {
                    string = string + "@whi@ / 1 more option";
                }
                if (n3 > 2 && string != null) {
                    string = string + "@whi@ / " + (n3 - 1) + " more options";
                }
                if (string != null) {
                    this.li.a(string, 6, 14, 0xFFFF00, false, 1);
                }
                if (!this.Yh && this.Cf == 1 || this.Yh && this.Cf == 1 && n3 == 1) break block33;
                if ((this.Yh || this.Cf != 2) && (!this.Yh || this.Cf != 1)) break block32;
                int n9 = this.zh.b(16256);
                int n10 = this.zh.a(-21224);
                this.rh = -(n9 / 2) + this.I;
                this.se = true;
                this.fg = this.xb - 7;
                if (this.rh < 0) {
                    this.rh = 0;
                }
                if (this.fg < 0) {
                    this.fg = 0;
                }
                this.Cf = 0;
                if (this.fg - -n10 > 315) {
                    this.fg = -n10 + 315;
                }
                if (n9 + this.rh > 510) {
                    this.rh = -n9 + 510;
                }
                break block32;
            }
            if (this.bb && this.gb && this.Hc) {
                this.Jh.b(59, 0);
                this.Jh.f.e(393, this.rf);
                this.Jh.f.e(393, this.Cg);
                this.Jh.b(21294);
            } else {
                this.b(false, 0);
            }
            this.Cf = 0;
        }
    }

    @Override
    final void a(byte arg0) {
        String string;
        int n2;
        String string2;
        if (this.hj && !(string2 = this.getDocumentBase().getHost().toLowerCase()).equals("runescape.com") && !string2.endsWith(".runescape.com")) {
            this.Xh = true;
            return;
        }
        this.n(-113);
        if (!this.d(2)) {
            this.Vc = true;
            return;
        }
        cb.a(wb.p, (byte)-72);
        try {
            if (pa.k.s != null) {
                b.q = new nb(pa.k.s, 24, 0);
                pa.k.s = null;
            }
        }
        catch (IOException iOException) {
            b.q = null;
        }
        int n3 = 0;
        for (int i2 = 0; i2 < 99; ++i2) {
            n2 = 1 + i2;
            int n4 = (int)(300.0 * Math.pow(2.0, (double)n2 / 7.0) + (double)n2);
            this.ti[i2] = ib.a(n3 += n4, 0xFFFFFFC);
        }
        try {
            string = this.getParameter("referid");
            this.Yd = Integer.parseInt(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            string = this.getParameter("servertype");
            if (arg0 != -92) {
                this.Oi = -6;
            }
            if ((2 & (n2 = Integer.parseInt(string))) != 0) {
                this.cf = true;
            }
            if ((n2 & 1) != 0) {
                this.Pg = true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (ua.E != e.i) {
            if (!ia.a(e.i, (byte)-117)) {
                if (la.b == e.i) {
                    this.xd = aa.l + 50000;
                    this.fc = 40000 - -aa.l;
                    this.Dh = "local.runescape.com";
                }
            } else {
                this.Dh = this.getCodeBase().getHost();
                this.fc = 40000 - -aa.l;
                this.xd = aa.l + 50000;
            }
        } else {
            this.Dh = this.getCodeBase().getHost();
            this.fc = 43594;
            this.xd = 443;
        }
        d.l = 1000;
        this.f(false);
        if (this.Vc) {
            return;
        }
        this.tg = 2000;
        this.hc = this.tg + 100;
        this.sg = 50 + this.hc;
        this.dg = 1000 + this.sg;
        this.kd = 10 + this.dg;
        this.Eh = 50 + this.kd;
        this.Wj = this.Eh + 10;
        this.ij = 5 + this.Wj;
        this.Xb = this.getGraphics();
        this.a(50, (byte)107);
        this.li = new ba(this.Wd, this.Oi + 12, 4000, this);
        this.li.dc = this;
        this.li.a(0, this.Wd, this.Oi + 12, 0, (byte)54);
        this.zh = new wb(this.li, 1, "Choose option");
        this.Wf = new wb(this.li, 1);
        this.He = new wb(this.li, 1);
        p.d = false;
        u.g = this.hc;
        this.Mc = new qa(this.li, 5);
        int n5 = this.li.u - 199;
        n2 = 36;
        this.Ud = this.Mc.a(n5, 196, 90, true, arg0 ^ 0xFFFFFFF4, 500, 24 + n2, 1);
        this.zk = new qa(this.li, 5);
        this.Hi = this.zk.a(n5, 196, 126, true, arg0 + 197, 500, n2 + 40, 1);
        this.fe = new qa(this.li, 5);
        this.lk = this.fe.a(n5, 196, 251, true, 106, 500, 24 + n2, 1);
        this.m((byte)-49);
        if (this.Vc) {
            return;
        }
        this.c(true);
        if (this.Vc) {
            return;
        }
        this.Ek = new lb(this.li, 15000, 15000, 1000);
        this.Ek.a(this.Oi / 2, true, this.Wd, this.Wd / 2, this.Oi / 2, this.qd, this.Wd / 2);
        this.Ek.Mb = 2400;
        this.Ek.X = 2400;
        this.Ek.G = 2300;
        this.Ek.P = 1;
        this.Ek.a(-50, -10, true, -50);
        this.Hh = new k(this.Ek, this.li);
        this.Hh.x = this.tg;
        this.j((byte)91);
        if (this.Vc) {
            return;
        }
        this.e(true);
        if (this.Vc) {
            return;
        }
        this.m(5359);
        if (this.Vc) {
            return;
        }
        if (this.Pg) {
            this.E(-90);
        }
        if (this.Vc) {
            return;
        }
        this.a(100, (byte)-99, "Starting game...");
        this.O(56);
        this.p(3845);
        this.t(arg0 ^ 0x6049);
        this.e((byte)-88);
        this.a(-77);
        this.y(-116);
    }

    private final void u(int arg0) {
        this.kc = 0;
        if (arg0 <= 59) {
            this.G(-85);
        }
        if (this.bj != 0) {
            this.o(-2);
            return;
        }
        System.out.println("Lost connection");
        this.Vh = 10;
        this.a(-12, this.Xf, this.wh, true);
    }

    private final void a(boolean arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6, String arg7) {
        block21: {
            int n2;
            String string;
            if (!(arg4 != 1 && arg4 != 4 && arg4 != 6 || arg6 == null || arg0)) {
                string = w.a(arg6, (byte)93);
                if (string == null) {
                    return;
                }
                for (n2 = 0; n2 < db.g; ++n2) {
                    if (!string.equals(w.a(ia.a[n2], (byte)78))) continue;
                    return;
                }
            }
            string = na.d[arg4];
            if (this.Zh != 0) {
                if ((arg4 == 5 || arg4 == 1 || arg4 == 2) && this.Zh != 3) {
                    this.Mh = 200;
                }
                if (arg4 == 4 && this.Zh != 1) {
                    this.Qe = 200;
                }
                if (arg4 == 3 && this.Zh != 2) {
                    this.Vj = 200;
                }
                if (arg4 == 0 || arg4 == 7) {
                    this.Ee = 200;
                }
                if (arg4 == 0 && this.Zh != 0) {
                    this.Zh = 0;
                }
                if ((arg4 == 5 || arg4 == 1 || arg4 == 2) && this.Zh != 3 && this.Zh != 0) {
                    this.Zh = 0;
                }
            }
            if (arg7 != null) {
                string = arg7;
            }
            for (n2 = 99; n2 > 0; --n2) {
                n.j[n2] = n.j[n2 - 1];
                pa.g[n2] = pa.g[n2 - 1];
                ja.N[n2] = ja.N[n2 - 1];
                k.G[n2] = k.G[n2 - 1];
                ba.Yb[n2] = ba.Yb[n2 - 1];
                aa.k[n2] = aa.k[n2 - 1];
                ub.a[n2] = ub.a[n2 - 1];
            }
            n.j[0] = arg4;
            pa.g[0] = 300;
            k.G[0] = arg1;
            ja.N[0] = arg5;
            ba.Yb[0] = arg6;
            aa.k[arg2] = arg3;
            ub.a[0] = string;
            String string2 = string + mb.a(arg3, arg1, true, arg4);
            if (arg4 == 4) {
                if (this.yd.j[this.Fh] != this.yd.pb[this.Fh] - 4) {
                    this.yd.a(string2, false, arg5, arg1, arg6, (byte)-100, this.Fh);
                } else {
                    this.yd.a(string2, true, arg5, arg1, arg6, (byte)-69, this.Fh);
                }
            }
            if (arg4 == 3) {
                if (this.yd.pb[this.ud] - 4 != this.yd.j[this.ud]) {
                    this.yd.a(string2, false, 0, null, null, (byte)-95, this.ud);
                } else {
                    this.yd.a(string2, true, 0, null, null, (byte)-64, this.ud);
                }
            }
            if (arg4 != 1 && arg4 != 2) break block21;
            int n3 = arg5;
            if (arg4 != 1) {
                n3 = 0;
            }
            if (this.yd.pb[this.mc] - 4 != this.yd.j[this.mc]) {
                this.yd.a(string2, false, n3, arg1, arg6, (byte)-98, this.mc);
            } else {
                this.yd.a(string2, true, n3, arg1, arg6, (byte)-87, this.mc);
            }
        }
    }

    private final void a(int arg0, int arg1) {
        block17: {
            int n2;
            String string;
            int n3;
            String string2;
            ta ta2;
            block16: {
                if (arg1 != -12) {
                    this.o(-32);
                }
                ta2 = this.rg[arg0];
                string2 = ta2.c;
                n3 = -this.zg - this.sh + -this.sk + 2203;
                if (this.Qg + this.Lf - -this.Ki >= 2640) {
                    n3 = -50;
                }
                string = "";
                n2 = 0;
                if (this.wi.s > 0 && ta2.s > 0) {
                    n2 = -ta2.s + this.wi.s;
                }
                if (n2 < 0) {
                    string = "@or1@";
                }
                if (n2 < -3) {
                    string = "@or2@";
                }
                if (n2 < -6) {
                    string = "@or3@";
                }
                if (n2 < -9) {
                    string = "@red@";
                }
                if (n2 > 0) {
                    string = "@gr1@";
                }
                if (n2 > 3) {
                    string = "@gr2@";
                }
                if (n2 > 6) {
                    string = "@gr3@";
                }
                if (n2 > 9) {
                    string = "@gre@";
                }
                string = " " + string + "(level-" + ta2.s + ")";
                if (this.af < 0) break block16;
                if (qb.e[this.af] != 1 && qb.e[this.af] != 2) break block17;
                this.zh.a(ta2.b, "@whi@" + string2 + string, 800, "Cast " + ja.L[this.af] + " on", this.af, 3296);
                break block17;
            }
            if (this.Bh >= 0) {
                this.zh.a(ta2.b, "@whi@" + string2 + string, 810, "Use " + this.ig + " with", this.Bh, 3296);
            } else {
                if (n3 > 0 && (ta2.K - 64) / this.Ug - (-this.sk + -this.zg) < 2203) {
                    this.zh.a(ta2.b, n2 < 0 || n2 >= 5 ? 2805 : 805, false, "Attack", "@whi@" + string2 + string);
                } else if (this.Pg) {
                    this.zh.a(ta2.b, 2806, false, "Duel with", "@whi@" + string2 + string);
                }
                this.zh.a(ta2.b, 2810, false, "Trade with", "@whi@" + string2 + string);
                this.zh.a(ta2.b, 2820, false, "Follow", "@whi@" + string2 + string);
                this.zh.a("Report abuse", "@whi@" + string2 + string, ta2.c, 2833, ta2.C, (byte)103);
            }
        }
    }

    public static final void main(String[] arg0) {
        try {
            e.i = la.b;
            aa.l = Integer.parseInt(arg0[0]);
            if (!arg0[1].equals("live")) {
                if (!arg0[1].equals("rc")) {
                    if (arg0[1].equals("wip")) {
                        db.f = f.b;
                    }
                } else {
                    db.f = fb.h;
                }
            } else {
                db.f = eb.e;
            }
            client client2 = new client();
            client2.hj = false;
            for (int i2 = 2; arg0.length > i2; ++i2) {
                if (arg0[i2].equals("members")) {
                    client2.Pg = true;
                }
                if (!arg0[i2].equals("veterans")) continue;
                client2.cf = true;
            }
            client2.a(false, "RuneScape Classic", 32 + db.f.a, "classic", aa.l + 7000, (byte)112, fa.d, client2.Wd, client2.Oi + 12);
            client2.Q = 10;
        }
        catch (Exception exception) {
            mb.a(0x1FFFFF, exception, null);
        }
        ++Pd;
    }

    private final void b(String arg0, byte arg1) {
        String string;
        if (arg1 != 69) {
            this.b(false);
        }
        if ((string = w.a(arg0, (byte)94)) == null) {
            return;
        }
        for (int i2 = 0; i2 < n.g; ++i2) {
            if (!string.equals(w.a(ua.h[i2], (byte)126))) continue;
            --n.g;
            for (int i3 = i2; n.g > i3; ++i3) {
                ua.h[i3] = ua.h[1 + i3];
                cb.c[i3] = cb.c[1 + i3];
                ac.z[i3] = ac.z[1 + i3];
                client.Fj[i3] = Fj[i3 + 1];
            }
            this.Jh.b(167, 0);
            this.Jh.f.a(arg0, 110);
            this.Jh.b(arg1 + 21225);
            break;
        }
    }

    private final void x(int arg0) {
        block6: {
            block5: {
                if (arg0 != 2) {
                    this.Ph = true;
                }
                if (this.Zb > 0) {
                    --this.Zb;
                }
                if (this.Xd == 0) break block5;
                if (this.Xd != 2) break block6;
                this.yi.b(this.Bb, this.xb, -9989, this.Qb, this.I);
                if (this.yi.a((byte)-104, this.Xi)) {
                    this.Xd = 0;
                }
                if (this.yi.a((byte)-100, this.ng)) {
                    this.yi.d(this.Ih, -88);
                }
                if (this.yi.a((byte)-114, this.Ih) || this.yi.a((byte)-105, this.be)) {
                    this.wh = this.yi.g(this.ng, arg0 + 2);
                    this.Xf = this.yi.g(this.Ih, 4);
                    this.Vh = 2;
                    this.a(-12, this.Xf, this.wh, false);
                }
                break block6;
            }
            this.ge.b(this.Bb, this.xb, -9989, this.Qb, this.I);
            if (!this.ge.a((byte)-98, this.Jj)) break block6;
            this.Xd = 2;
            this.yi.a(this.Qi, "", arg0 ^ 0x6BF8);
            this.yi.a(this.td, "Please enter your username and password", arg0 + 27640);
            this.yi.a(this.ng, "", arg0 ^ 0x6BF8);
            this.yi.a(this.Ih, "", 27642);
            this.yi.d(this.ng, arg0 ^ 0xFFFFFFA4);
        }
    }

    private final boolean a(int arg0, int arg1, boolean arg2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.rk != 0) {
            this.Hh.Z = false;
            return false;
        }
        this.Ub = arg2;
        if (this.yj == this.bc && this.Jg < (arg1 += this.Ki) && this.Rk > arg1 && this.Fi < (arg0 += this.sk) && arg0 < this.Ne) {
            this.Hh.Z = true;
            return false;
        }
        this.li.a(256, "Loading... Please wait", 0xFFFFFF, 0, 1, 192);
        this.A(5);
        this.li.a(this.Xb, this.Eb, 256, this.K);
        int n6 = this.Qg;
        int n7 = this.zg;
        int n8 = (arg1 + 24) / 48;
        this.Qg = n8 * 48 - 48;
        int n9 = (24 + arg0) / 48;
        this.yj = this.bc;
        this.Ne = n9 * 48 + 32;
        this.Rk = 48 * n8 + 32;
        this.Fi = 48 * n9 - 32;
        this.zg = n9 * 48 - 48;
        this.Jg = n8 * 48 - 32;
        this.Hh.a(arg1, (byte)-90, arg0, this.yj);
        this.zg -= this.sk;
        this.Qg -= this.Ki;
        int n10 = -n6 + this.Qg;
        int n11 = -n7 + this.zg;
        for (n5 = 0; this.eh > n5; ++n5) {
            int n12 = n5;
            this.Se[n12] = this.Se[n12] - n10;
            int n13 = n5;
            this.ye[n13] = this.ye[n13] - n11;
            n4 = this.Se[n5];
            n3 = this.ye[n5];
            n2 = this.vc[n5];
            ca ca2 = this.hg[n5];
            try {
                int n14;
                int n15;
                int n16 = this.bg[n5];
                if (n16 != 0 && n16 != 4) {
                    n15 = f.f[n2];
                    n14 = ub.g[n2];
                } else {
                    n15 = ub.g[n2];
                    n14 = f.f[n2];
                }
                int n17 = (n4 + (n4 - -n14)) * this.Ug / 2;
                int n18 = this.Ug * (n3 + n3 - -n15) / 2;
                if (n4 < 0 || n3 < 0 || n4 >= 96 || n3 >= 96) continue;
                this.Ek.a(ca2, (byte)118);
                ca2.c(-this.Hh.f(n17, n18, 89), -123, n18, n17);
                this.Hh.a(n4, n2, arg2, n3);
                if (n2 != 74) continue;
                ca2.a(0, 0, -480, true);
                continue;
            }
            catch (RuntimeException runtimeException) {
                System.out.println("Loc Error: " + runtimeException.getMessage());
                System.out.println("i:" + n5 + " obj:" + ca2);
                runtimeException.printStackTrace();
            }
        }
        for (n5 = 0; this.hf > n5; ++n5) {
            int n19 = n5;
            this.Jd[n19] = this.Jd[n19] - n10;
            int n20 = n5;
            this.yk[n20] = this.yk[n20] - n11;
            n4 = this.Jd[n5];
            n3 = this.yk[n5];
            n2 = this.Ng[n5];
            int n21 = this.Hj[n5];
            try {
                ca ca3;
                this.Hh.a(n3, n2, n21, n4, 11715);
                this.rd[n5] = ca3 = this.a(!arg2, n3, n2, n4, n21, n5);
                continue;
            }
            catch (RuntimeException runtimeException) {
                System.out.println("Bound Error: " + runtimeException.getMessage());
                runtimeException.printStackTrace();
            }
        }
        n5 = 0;
        while (this.Ah > n5) {
            int n22 = n5;
            this.Zf[n22] = this.Zf[n22] - n10;
            int n23 = n5++;
            this.Ni[n23] = this.Ni[n23] - n11;
        }
        for (n5 = 0; this.Yc > n5; ++n5) {
            ta ta2 = this.rg[n5];
            ta2.i -= this.Ug * n10;
            ta2.K -= n11 * this.Ug;
            n3 = 0;
            while (ta2.o >= n3) {
                int n24 = n3;
                ta2.k[n24] = ta2.k[n24] - this.Ug * n10;
                int n25 = n3++;
                ta2.F[n25] = ta2.F[n25] - n11 * this.Ug;
            }
        }
        for (n5 = 0; this.de > n5; ++n5) {
            ta ta3 = this.Tb[n5];
            ta3.K -= this.Ug * n11;
            ta3.i -= this.Ug * n10;
            n3 = 0;
            while (ta3.o >= n3) {
                int n26 = n3;
                ta3.k[n26] = ta3.k[n26] - this.Ug * n10;
                int n27 = n3++;
                ta3.F[n27] = ta3.F[n27] - n11 * this.Ug;
            }
        }
        this.Hh.Z = true;
        return true;
    }

    private final ta d(int arg0, int arg1) {
        for (int i2 = 0; i2 < this.Yc; ++i2) {
            if (arg0 != this.rg[i2].b) continue;
            return this.rg[i2];
        }
        if (arg1 != 220) {
            this.wi = null;
        }
        return null;
    }

    private final Socket a(int arg0, int arg1, String arg2) throws IOException {
        Socket socket;
        if (arg0 != -12) {
            this.a(true, -15, -28, 56, -43, 71);
        }
        if (kb.a == null && da.gb != null) {
            g g2 = pa.k.a(arg2, arg1, -75);
            while (g2.b == 0) {
                mb.a(arg0 ^ 0xFFFFD434, 50L);
            }
            if (g2.b != 1) {
                throw new IOException();
            }
            socket = (Socket)g2.d;
            if (socket == null) {
                throw new IOException();
            }
        } else {
            socket = kb.a == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg1) : new Socket(InetAddress.getByName(arg2), arg1);
        }
        socket.setSoTimeout(30000);
        socket.setTcpNoDelay(true);
        return socket;
    }

    private final void i(byte arg0) {
        if (this.Cf != 0) {
            int n2 = this.zh.b(this.I, this.rh, this.fg, (byte)-40, this.xb);
            if (n2 >= 0) {
                this.b(false, n2);
            }
            this.se = false;
            this.Cf = 0;
            return;
        }
        if (arg0 != -106) {
            this.tj = -11;
        }
        int n3 = this.zh.b(16256);
        int n4 = this.zh.a(-21224);
        if (this.I < this.rh - 10 || this.fg - 10 > this.xb || this.I > n3 + (this.rh + 10) || 10 + this.fg - -n4 < this.xb) {
            this.se = false;
            return;
        }
        this.zh.a(this.fg, this.rh, this.xb, (byte)-12, this.I);
    }

    private final void a(String arg0, byte arg1, String arg2) {
        if (arg1 != -64) {
            return;
        }
        Graphics graphics = this.getGraphics();
        if (graphics == null) {
            return;
        }
        graphics.translate(this.Eb, this.K);
        Font font = new Font("Helvetica", 1, 15);
        int n2 = 512;
        graphics.setColor(Color.black);
        int n3 = 344;
        graphics.fillRect(n2 / 2 - 140, n3 / 2 - 25, 280, 50);
        graphics.setColor(Color.white);
        graphics.drawRect(n2 / 2 - 140, n3 / 2 - 25, 280, 50);
        this.a(font, arg2, n3 / 2 - 10, true, n2 / 2, graphics);
        this.a(font, arg0, 10 + n3 / 2, true, n2 / 2, graphics);
    }

    private final void i(int arg0) {
        int n2;
        this.kc = 0;
        this.Xd = 0;
        this.bj = 0;
        this.qg = 1;
        this.Fg = 0;
        this.o((byte)-49);
        this.li.a(true);
        this.li.a(this.Xb, this.Eb, 256, this.K);
        for (n2 = 0; n2 < this.eh; ++n2) {
            this.Ek.a(this.hg[n2], -1);
            this.Hh.a(this.vc[n2], this.Se[n2], this.ye[n2], 4081);
        }
        for (n2 = 0; n2 < this.hf; ++n2) {
            this.Ek.a(this.rd[n2], -1);
            this.Hh.a(true, this.Hj[n2], this.yk[n2], this.Jd[n2], this.Ng[n2]);
        }
        this.Ah = 0;
        this.eh = 0;
        this.hf = 0;
        this.Yc = 0;
        for (n2 = 0; n2 < 4000; ++n2) {
            this.We[n2] = null;
        }
        for (n2 = 0; n2 < 500; ++n2) {
            this.rg[n2] = null;
        }
        this.de = 0;
        for (n2 = 0; n2 < 5000; ++n2) {
            this.te[n2] = null;
        }
        for (n2 = 0; n2 < 500; ++n2) {
            this.Tb[n2] = null;
        }
        for (n2 = 0; n2 < 50; ++n2) {
            this.bk[n2] = false;
        }
        this.uk = false;
        this.Bb = 0;
        this.Qb = 0;
        this.Cf = 0;
        this.Qk = false;
        this.Fe = false;
        n.g = 0;
        this.Vf = 0;
        for (int i2 = 0; i2 < 100; ++i2) {
            aa.k[i2] = null;
            pa.g[i2] = 0;
            k.G[i2] = null;
            ja.N[i2] = 0;
            ba.Yb[i2] = null;
            ub.a[i2] = null;
            n.j[i2] = 0;
        }
        this.yd.c((byte)-33, this.Fh);
        this.yd.c((byte)-33, this.ud);
        this.yd.c((byte)-76, this.mc);
    }

    private final void b(byte arg0, String arg1, String arg2) {
        if (this.Xd == 2) {
            if (arg2 == null || arg2.length() < 1) {
                this.yi.a(this.td, arg1, 27642);
            } else {
                this.yi.a(this.Qi, arg1, 27642);
                this.yi.a(this.td, arg2, 27642);
            }
        }
        if (arg0 >= -11) {
            return;
        }
        this.k(2540);
        this.c(-28492);
    }

    private final void m(byte arg0) {
        int n2;
        byte[] byArray = this.a("2d graphics", 20, 8, 76);
        if (byArray == null) {
            this.Vc = true;
            return;
        }
        byte[] byArray2 = na.a("index.dat", 0, byArray, -128);
        this.li.a(this.tg, 1, na.a("inv1.dat", 0, byArray, -118), 120, byArray2);
        this.li.a(this.tg + 1, 6, na.a("inv2.dat", 0, byArray, -119), 52, byArray2);
        this.li.a(9 + this.tg, 1, na.a("bubble.dat", 0, byArray, -121), 101, byArray2);
        this.li.a(10 + this.tg, 1, na.a("runescape.dat", 0, byArray, -127), 86, byArray2);
        this.li.a(this.tg + 11, 3, na.a("splat.dat", 0, byArray, -122), 84, byArray2);
        this.li.a(this.tg + 14, 8, na.a("icon.dat", 0, byArray, -120), 111, byArray2);
        this.li.a(this.tg + 22, 1, na.a("hbar.dat", 0, byArray, -124), 112, byArray2);
        this.li.a(23 + this.tg, 1, na.a("hbar2.dat", 0, byArray, -121), 104, byArray2);
        this.li.a(this.tg + 24, 1, na.a("compass.dat", 0, byArray, -128), 73, byArray2);
        this.li.a(25 + this.tg, 2, na.a("buttons.dat", 0, byArray, -127), 100, byArray2);
        this.li.a(this.hc, 2, na.a("scrollbar.dat", 0, byArray, -127), 125, byArray2);
        this.li.a(2 + this.hc, 4, na.a("corners.dat", 0, byArray, -125), 68, byArray2);
        if (arg0 > -1) {
            this.Oi = 24;
        }
        this.li.a(this.hc + 6, 2, na.a("arrows.dat", 0, byArray, -118), 74, byArray2);
        this.li.a(this.kd, n.c, na.a("projectile.dat", 0, byArray, -124), 83, byArray2);
        this.li.a(this.Wj, 2, na.a("crowns.dat", 0, byArray, -123), 116, byArray2);
        this.li.d(-123, this.Wj);
        int n3 = mb.l;
        int n4 = 1;
        while (n3 > 0) {
            n2 = n3;
            if (n2 > 30) {
                n2 = 30;
            }
            n3 -= 30;
            this.li.a(this.sg - -(30 * (n4 - 1)), n2, na.a("objects" + n4 + ".dat", 0, byArray, -122), 109, byArray2);
            ++n4;
        }
        this.li.b(this.tg, -342059728);
        this.li.b(9 + this.tg, -342059728);
        for (n2 = 11; n2 <= 26; ++n2) {
            this.li.b(this.tg - -n2, -342059728);
        }
        for (n2 = 0; n.c > n2; ++n2) {
            this.li.b(n2 + this.kd, -342059728);
        }
        for (n2 = 0; n2 < mb.l; ++n2) {
            this.li.b(n2 + this.sg, -342059728);
        }
    }

    private final void w(int arg0) {
        block0: {
            this.li.i = false;
            this.li.a(true);
            this.Af.a((byte)-13);
            int n2 = 140;
            int n3 = 50;
            this.li.a((n2 += 116) - 87, this.ei[this.Lh], w.g[this.wg], n3 -= 25, 102, (byte)105, 64);
            this.li.a(n3, this.ei[this.Wg], this.Wh[this.hh], false, 0, w.g[this.dk], 102, 64, n2 - 32 - 55, 1);
            this.li.a(n3, this.Dg[this.ld], this.Wh[this.hh], false, 0, w.g[this.Vd], 102, 64, n2 - 32 - 55, arg0 + 13760);
            this.li.a(n2 - 32, this.ei[this.Lh], 6 + w.g[this.wg], n3, 102, (byte)105, 64);
            this.li.a(n3, this.ei[this.Wg], this.Wh[this.hh], false, 0, w.g[this.dk] + 6, 102, 64, n2 - 32, 1);
            this.li.a(n3, this.Dg[this.ld], this.Wh[this.hh], false, 0, 6 + w.g[this.Vd], 102, 64, n2 - 32, 1);
            this.li.a(n2 + 55 - 32, this.ei[this.Lh], 12 + w.g[this.wg], n3, 102, (byte)110, 64);
            this.li.a(n3, this.ei[this.Wg], this.Wh[this.hh], false, 0, w.g[this.dk] + 12, 102, 64, 55 + (n2 - 32), arg0 + 13760);
            this.li.a(n3, this.Dg[this.ld], this.Wh[this.hh], false, 0, w.g[this.Vd] + 12, 102, 64, n2 + 55 - 32, 1);
            this.li.b(-1, 22 + this.tg, this.Oi, 0);
            this.li.a(this.Xb, this.Eb, 256, this.K);
            if (arg0 == -13759) break block0;
            this.l(70);
        }
    }

    private final boolean e(int arg0, int arg1) {
        for (int i2 = 0; i2 < this.lc; ++i2) {
            if (this.vf[i2] != arg0 || this.Aj[i2] != 1) continue;
            return true;
        }
        return arg1 != 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a(byte arg0, int arg1, int arg2) {
        if (arg0 != -70) {
            return true;
        }
        if (arg2 == 31 && (this.e(197, 1) || this.e(615, arg0 ^ 0xFFFFFFBB) || this.e(682, arg0 + 71))) return true;
        if (arg2 == 32 && (this.e(102, 1) || this.e(616, 1) || this.e(683, 1))) return true;
        if (arg2 == 33 && (this.e(101, 1) || this.e(617, 1) || this.e(684, 1))) return true;
        if (arg2 != 34 || !this.e(103, 1) && !this.e(618, arg0 + 71) && !this.e(685, 1)) return this.b(94, arg2) >= arg1;
        return true;
    }

    private final void c(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.Jh.b(64, 0);
        if (arg3 < 62) {
            return;
        }
        this.Jh.f.c(arg2, -89);
        this.Jh.f.c(arg1, 84);
        this.Jh.f.c(arg0, -55);
        this.Jh.f.c(arg4, 59);
        this.Jh.b(21294);
    }

    private final void e(byte arg0) {
        this.de = 0;
        this.Yc = 0;
        this.Xd = 0;
        if (arg0 != -88) {
            this.Oc = null;
        }
        this.Xf = "";
        this.qg = 0;
        this.wh = "";
    }

    private final void e(boolean arg0) {
        ca.a((byte)91, "torcha2");
        ca.a((byte)91, "torcha3");
        ca.a((byte)91, "torcha4");
        ca.a((byte)91, "skulltorcha2");
        ca.a((byte)91, "skulltorcha3");
        ca.a((byte)91, "skulltorcha4");
        ca.a((byte)91, "firea2");
        ca.a((byte)91, "firea3");
        ca.a((byte)91, "fireplacea2");
        ca.a((byte)91, "fireplacea3");
        ca.a((byte)91, "firespell2");
        if (!arg0) {
            return;
        }
        ca.a((byte)91, "firespell3");
        ca.a((byte)91, "lightning2");
        ca.a((byte)91, "lightning3");
        ca.a((byte)91, "clawspell2");
        ca.a((byte)91, "clawspell3");
        ca.a((byte)91, "clawspell4");
        ca.a((byte)91, "clawspell5");
        ca.a((byte)91, "spellcharge2");
        ca.a((byte)91, "spellcharge3");
        if (kb.a == null) {
            byte[] byArray = this.a("3d models", 60, 9, 84);
            if (byArray == null) {
                this.Vc = true;
                return;
            }
            for (int i2 = 0; ia.b > i2; ++i2) {
                int n2 = oa.a(ub.c[i2] + ".ob3", (byte)68, byArray);
                this.kh[i2] = n2 == 0 ? new ca(1, 1) : new ca(byArray, n2, true);
                if (!ub.c[i2].equals("giantcrystal")) continue;
                this.kh[i2].cb = true;
            }
        } else {
            this.a(70, (byte)-98, "Loading 3d models");
            for (int i3 = 0; ia.b > i3; ++i3) {
                this.kh[i3] = new ca("../content/src/models/" + ub.c[i3] + ".ob2");
                if (!ub.c[i3].equals("giantcrystal")) continue;
                this.kh[i3].cb = true;
            }
        }
    }

    private final void c(boolean arg0, int arg1) {
        block16: {
            block17: {
                int n2;
                int n3;
                int n4 = this.li.u - 199;
                int n5 = 36;
                this.li.b(-1, this.tg + 3, 3, n4 - 49);
                int n6 = 196;
                int n7 = 275;
                int n8 = n3 = o.a(160, 9570, 160, 160);
                if (this.zd != 0) {
                    n3 = o.a(220, arg1 ^ 0x2562, 220, 220);
                } else {
                    n8 = o.a(220, 9570, 220, 220);
                }
                this.li.c(128, n4, 24, 0, n5, n6 / 2, n8);
                this.li.c(128, n4 - -(n6 / 2), 24, 0, n5, n6 / 2, n3);
                this.li.c(128, n4, n7 - 24, 0, 24 + n5, n6, o.a(220, 9570, 220, 220));
                this.li.b(n6, 0, n4, n5 + 24, (byte)-61);
                this.li.b(n4 - -(n6 / 2), 0 + n5, 0, 24, arg1);
                this.li.a(n6 / 4 + n4, "Stats", 0, 0, 4, n5 + 16);
                this.li.a(n4 + (n6 / 4 - -(n6 / 2)), "Quests", 0, 0, 4, n5 + 16);
                if (this.zd == 0) {
                    int n9;
                    int n10;
                    n2 = 72;
                    this.li.a("Skills", n4 + 5, n2, 0xFFFF00, false, 3);
                    int n11 = -1;
                    n2 += 13;
                    for (n10 = 0; n10 < 9; ++n10) {
                        n9 = 0xFFFFFF;
                        if (this.I > 3 + n4 && n2 - 11 <= this.xb && 2 + n2 > this.xb && 90 + n4 > this.I) {
                            n9 = 0xFF0000;
                            n11 = n10;
                        }
                        this.li.a(this.Vk[n10] + ":@yel@" + this.oh[n10] + "/" + this.cg[n10], n4 + 5, n2, n9, false, 1);
                        n9 = 0xFFFFFF;
                        if (this.I >= n4 + 90 && this.xb >= n2 - 11 - 13 && n2 - 13 + 2 > this.xb && this.I < n4 + 196) {
                            n9 = 0xFF0000;
                            n11 = 9 + n10;
                        }
                        this.li.a(this.Vk[9 + n10] + ":@yel@" + this.oh[9 + n10] + "/" + this.cg[9 + n10], n6 / 2 - 5 + n4, n2 - 13, n9, false, 1);
                        n2 += 13;
                    }
                    this.li.a("Quest Points:@yel@" + this.ii, n4 - 5 - -(n6 / 2), n2 - 13, 0xFFFFFF, false, 1);
                    this.li.a("Fatigue: @yel@" + this.vg * 100 / 750 + "%", 5 + n4, (n2 += 12) - 13, 0xFFFFFF, false, 1);
                    this.li.a("Equipment Status", 5 + n4, n2 += 8, 0xFFFF00, false, 3);
                    n2 += 12;
                    for (n10 = 0; n10 < 3; ++n10) {
                        this.li.a(this.Ld[n10] + ":@yel@" + this.Fc[n10], 5 + n4, n2, 0xFFFFFF, false, 1);
                        if (n10 < 2) {
                            this.li.a(this.Ld[n10 + 3] + ":@yel@" + this.Fc[3 + n10], n6 / 2 + (n4 + 25), n2, 0xFFFFFF, false, 1);
                        }
                        n2 += 13;
                    }
                    this.li.b(n6, 0, n4, (n2 += 6) - 15, (byte)124);
                    if (n11 == -1) {
                        this.li.a("Overall levels", n4 + 5, n2, 0xFFFF00, false, 1);
                        n2 += 12;
                        n10 = 0;
                        for (n9 = 0; n9 < 18; ++n9) {
                            n10 += this.cg[n9];
                        }
                        this.li.a("Skill total: " + n10, 5 + n4, n2, 0xFFFFFF, false, 1);
                        this.li.a("Combat level: " + this.wi.s, 5 + n4, n2 += 12, 0xFFFFFF, false, 1);
                        n2 += 12;
                    } else {
                        this.li.a(this.Ej[n11] + " skill", 5 + n4, n2, 0xFFFF00, false, 1);
                        n2 += 12;
                        n10 = this.ti[0];
                        for (n9 = 0; n9 < 98; ++n9) {
                            if (this.ti[n9] > this.Ak[n11]) continue;
                            n10 = this.ti[n9 + 1];
                        }
                        this.li.a("Total xp: " + this.Ak[n11] / 4, 5 + n4, n2, 0xFFFFFF, false, 1);
                        this.li.a("Next level at: " + n10 / 4, 5 + n4, n2 += 12, 0xFFFFFF, false, 1);
                    }
                }
                if (this.zd == 1) {
                    this.fe.c((byte)89, this.lk);
                    this.fe.a(0, null, -121, 0, null, "@whi@Quest-list (green=completed)", this.lk);
                    for (n2 = 0; n2 < 50; ++n2) {
                        this.fe.a(1 + n2, null, arg1 - 82, 0, null, (this.fi[n2] ? "@gre@" : "@red@") + this.Te[n2], this.lk);
                    }
                    this.fe.a((byte)-18);
                }
                if (!arg0) {
                    return;
                }
                n5 = this.xb - 36;
                n4 = -this.li.u - (-199 - this.I);
                if (n4 < 0 || n5 < 0 || n6 <= n4 || n5 >= n7) break block16;
                if (this.zd == 1) {
                    this.fe.b(this.Bb, 36 + n5, -9989, this.Qb, n4 - -this.li.u - 199);
                }
                if (n5 > 24 || this.Cf != 1) break block16;
                if (n4 < 98) break block17;
                if (n4 <= 98) break block16;
                this.zd = 1;
                break block16;
            }
            this.zd = 0;
        }
    }

    private final void a(byte arg0, String arg1) {
        String string = w.a(arg1, (byte)93);
        if (arg0 >= -7) {
            return;
        }
        if (string == null) {
            return;
        }
        for (int i2 = 0; i2 < db.g; ++i2) {
            if (!string.equals(w.a(ia.a[i2], (byte)57))) continue;
            --db.g;
            for (int i3 = i2; i3 < db.g; ++i3) {
                l.c[i3] = l.c[i3 + 1];
                ia.a[i3] = ia.a[1 + i3];
                ia.g[i3] = ia.g[i3 + 1];
                ua.wb[i3] = ua.wb[i3];
            }
            this.Jh.b(241, 0);
            this.Jh.f.a(arg1, -78);
            this.Jh.b(21294);
            break;
        }
    }

    private final void a(byte arg0, int arg1, String arg2) {
        block1: {
            int n2 = this.Se[arg1];
            int n3 = this.ye[arg1];
            int n4 = n2 + -(this.wi.i / 128);
            int n5 = -(this.wi.K / 128) + n3;
            int n6 = 7;
            if (arg0 <= 2) {
                return;
            }
            if (n2 < 0 || n3 < 0 || n2 >= 96 || n3 >= 96 || n4 <= -n6 || n6 <= n4 || -n6 >= n5 || n5 >= n6) break block1;
            this.Ek.a(this.hg[arg1], -1);
            int n7 = ca.a((byte)91, arg2);
            ca ca2 = this.kh[n7].b(-2);
            this.Ek.a(ca2, (byte)118);
            ca2.a(-50, 48, -10, -50, true, 48, -74);
            ca2.a(this.hg[arg1], 6029);
            ca2.rb = arg1;
            this.hg[arg1] = ca2;
        }
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -109) {
            this.tj = 50;
        }
        int n2 = ua.Bb[arg3] + this.sg;
        int n3 = h.c[arg3];
        this.li.a(arg6, n3, 0, false, 0, n2, arg0, arg4, arg2, 1);
    }

    private final void a(int arg0, boolean arg1) {
        block13: {
            int n2;
            int n3;
            block14: {
                int n4;
                if (arg0 != -15252) {
                    this.b(-79, (byte)75, -83);
                }
                int n5 = this.li.u - 248;
                this.li.b(-1, this.tg + 1, 3, n5);
                for (n4 = 0; this.cl > n4; ++n4) {
                    n3 = n5 + 49 * (n4 % 5);
                    n2 = n4 / 5 * 34 + 36;
                    if (this.lc > n4 && this.Aj[n4] == 1) {
                        this.li.c(128, n3, 34, 0, n2, 49, 0xFF0000);
                    } else {
                        this.li.c(128, n3, 34, 0, n2, 49, o.a(181, arg0 ^ 0xFFFFE10E, 181, 181));
                    }
                    if (n4 >= this.lc) continue;
                    this.li.a(n2, h.c[this.vf[n4]], 0, false, 0, this.sg + ua.Bb[this.vf[n4]], 32, 48, n3, arg0 ^ 0xFFFFC46D);
                    if (fa.e[this.vf[n4]] != 0) continue;
                    this.li.a("" + this.xe[n4], 1 + n3, n2 + 10, 0xFFFF00, false, 1);
                }
                for (n4 = 1; n4 <= 4; ++n4) {
                    this.li.b(n5 - -(49 * n4), 36, 0, this.cl / 5 * 34, 0);
                }
                for (n4 = 1; this.cl / 5 - 1 >= n4; ++n4) {
                    this.li.b(245, 0, n5, 36 + 34 * n4, (byte)76);
                }
                if (!arg1) {
                    return;
                }
                n5 = 248 + (-this.li.u + this.I);
                n4 = this.xb - 36;
                if (n5 < 0 || n4 < 0 || n5 >= 248 || this.cl / 5 * 34 <= n4 || this.lc <= (n3 = n4 / 34 * 5 + n5 / 49)) break block13;
                n2 = this.vf[n3];
                if (this.af < 0) break block14;
                if (qb.e[this.af] != 3) break block13;
                this.zh.a(n3, "@lre@" + ac.x[n2], 600, "Cast " + ja.L[this.af] + " on", this.af, 3296);
                break block13;
            }
            if (this.Bh < 0) {
                if (this.Aj[n3] == 1) {
                    this.zh.a(n3, 620, false, "Remove", "@lre@" + ac.x[n2]);
                } else if (mb.k[n2] != 0) {
                    String string = (0x18 & mb.k[n2]) == 0 ? "Wear" : "Wield";
                    this.zh.a(n3, 630, false, string, "@lre@" + ac.x[n2]);
                }
                if (!lb.ac[n2].equals("")) {
                    this.zh.a(n3, 640, false, lb.ac[n2], "@lre@" + ac.x[n2]);
                }
                this.zh.a(n3, 650, false, "Use", "@lre@" + ac.x[n2]);
                this.zh.a(n3, 660, false, "Drop", "@lre@" + ac.x[n2]);
                this.zh.a(n2, 3600, false, "Examine", "@lre@" + ac.x[n2]);
            } else {
                this.zh.a(n3, "@lre@" + ac.x[n2], 610, "Use " + this.ig + " with", this.Bh, arg0 ^ 0xFFFFC88C);
            }
        }
    }

    private final void C(int arg0) {
        int n2;
        this.vj = this.fj;
        for (n2 = 0; n2 < this.fj; ++n2) {
            this.ae[n2] = this.ci[n2];
            this.di[n2] = this.Xe[n2];
        }
        for (n2 = 0; this.lc > n2 && this.Gi > this.vj; ++n2) {
            int n3 = this.vf[n2];
            boolean bl = false;
            for (int i2 = 0; i2 < this.vj; ++i2) {
                if (n3 != this.ae[i2]) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            this.ae[this.vj] = n3;
            this.di[this.vj] = 0;
            ++this.vj;
        }
    }

    private final void h(byte arg0) {
        block14: {
            String string;
            String string2;
            if (this.Cf != 0) {
                this.Cf = 0;
                if (this.Bj == 1 && (this.I < 106 || this.xb < 145 || this.I > 406 || this.xb > 215)) {
                    this.Bj = 0;
                    return;
                }
                if (this.Bj == 2 && (this.I < 6 || this.xb < 145 || this.I > 506 || this.xb > 215)) {
                    this.Bj = 0;
                    return;
                }
                if (this.Bj == 3 && (this.I < 106 || this.xb < 145 || this.I > 406 || this.xb > 215)) {
                    this.Bj = 0;
                    return;
                }
                if (this.I > 236 && this.I < 276 && this.xb > 193 && this.xb < 213) {
                    this.Bj = 0;
                    return;
                }
            }
            int n2 = 145;
            if (this.Bj == 1) {
                this.li.a(106, (byte)26, 0, n2, 70, 300);
                this.li.e(106, 300, n2, 27785, 70, 0xFFFFFF);
                this.li.a(256, "Enter name to add to friends list", 0xFFFFFF, 0, 4, n2 += 20);
                this.li.a(256, this.e + "*", 0xFFFFFF, 0, 4, n2 += 20);
                string2 = w.a(this.wi.C, (byte)50);
                if (string2 != null && this.Cb.length() > 0) {
                    string = this.Cb.trim();
                    this.Bj = 0;
                    this.e = "";
                    this.Cb = "";
                    if (string.length() > 0 && !string2.equals(w.a(string, (byte)100))) {
                        this.b(114, string);
                    }
                }
            }
            if (this.Bj == 2) {
                this.li.a(6, (byte)110, 0, n2, 70, 500);
                this.li.e(6, 500, n2, 27785, 70, 0xFFFFFF);
                this.li.a(256, "Enter message to send to " + this.Qd, 0xFFFFFF, 0, 4, n2 += 20);
                this.li.a(256, this.x + "*", 0xFFFFFF, 0, 4, n2 += 20);
                if (this.Ob.length() > 0) {
                    string2 = this.Ob;
                    this.x = "";
                    this.Bj = 0;
                    this.Ob = "";
                    this.a((byte)-76, this.Qd, string2);
                }
            }
            if (this.Bj == 3) {
                this.li.a(106, (byte)-115, 0, n2, 70, 300);
                this.li.e(106, 300, n2, 27785, 70, 0xFFFFFF);
                this.li.a(256, "Enter name to add to ignore list", 0xFFFFFF, 0, 4, n2 += 20);
                this.li.a(256, this.e + "*", 0xFFFFFF, 0, 4, n2 += 20);
                string2 = w.a(this.wi.C, (byte)59);
                if (string2 != null && this.Cb.length() > 0) {
                    string = this.Cb.trim();
                    this.e = "";
                    this.Bj = 0;
                    this.Cb = "";
                    if (string.length() > 0 && !string2.equals(w.a(string, (byte)105))) {
                        this.a(string, (byte)5);
                    }
                }
            }
            int n3 = 0xFFFFFF;
            if (this.I > 236 && this.I < 276 && this.xb > 193 && this.xb < 213) {
                n3 = 0xFFFF00;
            }
            this.li.a(256, "Cancel", n3, 0, 1, 208);
            if (arg0 > 77) break block14;
            this.pj = -42;
        }
    }

    private final void l(byte arg0) {
        int n2 = 400;
        if (arg0 != -115) {
            this.qd = 64;
        }
        int n3 = 100;
        if (this.Wk) {
            n3 = 450;
            n3 = 300;
        }
        this.li.a(-(n2 / 2) + 256, (byte)122, 0, 167 - n3 / 2, n3, n2);
        this.li.e(-(n2 / 2) + 256, n2, -(n3 / 2) + 167, 27785, n3, 0xFFFFFF);
        this.li.a(n2 - 40, this.Cj, 256, 92, 1, 167 - (n3 / 2 - 20), true, 0xFFFFFF);
        int n4 = 157 - -(n3 / 2);
        int n5 = 0xFFFFFF;
        if (this.xb > n4 - 12 && this.xb <= n4 && this.I > 106 && this.I < 406) {
            n5 = 0xFF0000;
        }
        this.li.a(256, "Click here to close window", n5, 0, 1, n4);
        if (this.Cf == 1) {
            if (n5 == 0xFF0000) {
                this.mh = false;
            }
            if (!(this.I >= 256 + -(n2 / 2) && this.I <= n2 / 2 + 256 || 167 + -(n3 / 2) <= this.xb && 167 - -(n3 / 2) >= this.xb)) {
                this.mh = false;
            }
        }
        this.Cf = 0;
    }

    private final ta a(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int n2;
        if (this.te[arg5] == null) {
            this.te[arg5] = new ta();
            this.te[arg5].b = arg5;
        }
        ta ta2 = this.te[arg5];
        boolean bl = false;
        for (n2 = 0; n2 < this.qj; ++n2) {
            if (this.Ff[n2].b != arg5) continue;
            bl = true;
            break;
        }
        if (arg3 != 127) {
            this.a((byte)-81, -15, (String)null);
        }
        if (bl) {
            ta2.D = arg0;
            ta2.t = arg1;
            n2 = ta2.o;
            if (ta2.k[n2] != arg2 || arg4 != ta2.F[n2]) {
                ta2.o = n2 = (1 + n2) % 10;
                ta2.k[n2] = arg2;
                ta2.F[n2] = arg4;
            }
        } else {
            ta2.b = arg5;
            ta2.o = 0;
            ta2.e = 0;
            ta2.k[0] = ta2.i = arg2;
            ta2.D = ta2.y = arg0;
            ta2.x = 0;
            ta2.t = arg1;
            ta2.F[0] = ta2.K = arg4;
        }
        this.Tb[this.de++] = ta2;
        return ta2;
    }

    private final void o(int arg0) {
        this.bj = 0;
        this.Xd = 0;
        this.qg = 0;
        if (arg0 != -2) {
            return;
        }
        this.kc = 0;
    }

    private final void N(int arg0) {
        block12: {
            String string;
            int n2;
            int n3 = 22;
            int n4 = 36;
            this.li.a(n3, (byte)-117, 192, n4, 16, 468);
            int n5 = 0x989898;
            this.li.c(160, n3, 246, 0, n4 + 16, 468, n5);
            this.li.a(234 + n3, "Please confirm your trade with @yel@" + this.re, 0xFFFFFF, 0, 1, n4 + 12);
            this.li.a(n3 + 117, "You are about to give:", 0xFFFF00, 0, 1, 30 + n4);
            for (n2 = 0; n2 < this.Ui; ++n2) {
                string = ac.x[this.Vb[n2]];
                if (fa.e[this.Vb[n2]] == 0) {
                    string = string + " x " + mb.a(this.Me[n2], 131071);
                }
                this.li.a(n3 + 117, string, 0xFFFFFF, 0, 1, n2 * 12 + 42 + n4);
            }
            if (this.Ui == 0) {
                this.li.a(n3 + 117, "Nothing!", 0xFFFFFF, 0, 1, 42 + n4);
            }
            this.li.a(351 + n3, "In return you will receive:", 0xFFFF00, 0, 1, 30 + n4);
            for (n2 = 0; n2 < this.nh; ++n2) {
                string = ac.x[this.Lc[n2]];
                if (fa.e[this.Lc[n2]] == 0) {
                    string = string + " x " + mb.a(this.Bi[n2], 131071);
                }
                this.li.a(351 + n3, string, 0xFFFFFF, 0, 1, 42 + n4 + 12 * n2);
            }
            if (this.nh == 0) {
                this.li.a(351 + n3, "Nothing!", 0xFFFFFF, 0, 1, n4 + 42);
            }
            if (arg0 >= -6) {
                this.b(true);
            }
            this.li.a(n3 + 234, "Are you sure you want to do this?", 65535, 0, 4, 200 + n4);
            this.li.a(n3 + 234, "There is NO WAY to reverse a trade if you change your mind.", 0xFFFFFF, 0, 1, n4 + 215);
            this.li.a(234 + n3, "Remember that not all players are trustworthy", 0xFFFFFF, 0, 1, n4 + 230);
            if (this.Vi) {
                this.li.a(234 + n3, "Waiting for other player...", 0xFFFF00, 0, 1, 250 + n4);
            } else {
                this.li.b(-1, this.tg + 25, 238 + n4, n3 - 35 + 118);
                this.li.b(-1, 26 + this.tg, n4 + 238, n3 + 352 - 35);
            }
            if (this.Cf != 1) break block12;
            if (n3 > this.I || this.xb < n4 || 468 + n3 < this.I || n4 + 262 < this.xb) {
                this.Xj = false;
                this.Jh.b(230, 0);
                this.Jh.b(21294);
            }
            if (this.I >= n3 + 118 - 35 && this.I <= n3 + 118 + 70 && this.xb >= n4 + 238 && 238 + n4 + 21 >= this.xb) {
                this.Vi = true;
                this.Jh.b(104, 0);
                this.Jh.b(21294);
            }
            if (this.I >= 352 + n3 - 35 && n3 + 423 >= this.I && n4 + 238 <= this.xb && 238 + n4 + 21 >= this.xb) {
                this.Xj = false;
                this.Jh.b(230, 0);
                this.Jh.b(21294);
            }
            this.Cf = 0;
        }
    }

    private final ta d(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int n2;
        if (this.We[arg1] == null) {
            this.We[arg1] = new ta();
            this.We[arg1].b = arg1;
        }
        ta ta2 = this.We[arg1];
        boolean bl = false;
        for (n2 = 0; this.If > n2; ++n2) {
            if (arg1 != this.Zg[n2].b) continue;
            bl = true;
            break;
        }
        if (bl) {
            ta2.D = arg4;
            n2 = ta2.o;
            if (ta2.k[n2] != arg2 || arg0 != ta2.F[n2]) {
                ta2.o = n2 = (1 + n2) % 10;
                ta2.k[n2] = arg2;
                ta2.F[n2] = arg0;
            }
        } else {
            ta2.b = arg1;
            ta2.k[0] = ta2.i = arg2;
            ta2.o = 0;
            ta2.e = 0;
            ta2.x = 0;
            ta2.D = ta2.y = arg4;
            ta2.F[0] = ta2.K = arg0;
        }
        this.rg[this.Yc++] = ta2;
        return ta2;
    }

    private final void p(byte arg0) {
        block7: {
            int n2 = this.Eb;
            int n3 = this.K;
            int n4 = -this.Wd + (this.Rh + -n2);
            int n5 = -n3 + -this.Oi - 12 + this.Hf;
            if (n2 <= 0 && n4 <= 0 && n3 <= 0 && n5 <= 0) break block7;
            try {
                Container container = this.hj ? (da.gb == null ? this : da.gb) : kb.a;
                Graphics graphics = ((Component)container).getGraphics();
                if (graphics == null) {
                    return;
                }
                graphics.setColor(Color.black);
                if (n2 > 0) {
                    graphics.fillRect(0, 0, n2, this.Hf);
                }
                if (n3 > 0) {
                    graphics.fillRect(0, 0, this.Rh, n3);
                }
                if (n4 > 0) {
                    graphics.fillRect(-n4 + this.Rh, 0, n4, this.Hf);
                }
                if (n5 > 0) {
                    graphics.fillRect(0, -n5 + this.Hf, this.Rh, n5);
                }
            }
            catch (Exception exception) {}
        }
    }

    private final void g(byte arg0) {
        if (arg0 >= -19) {
            this.i((byte)-111);
        }
        this.bj = 0;
        this.a(false, null, 0, "Sorry, you can't logout at the moment", 0, 0, null, "@cya@");
    }

    private final void a(String[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 12) {
            this.e((byte)31);
        }
        this.a(arg1 - 9, arg2, arg0, arg3, "");
    }

    private final void a(boolean arg0, int arg1) {
        if (arg0 && this.Jh != null) {
            try {
                this.Jh.b(31, arg1 - 31);
                this.Jh.a(-6924);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (arg1 != 31) {
            this.sf = null;
        }
        this.wh = "";
        this.Xf = "";
        this.o(arg1 ^ 0xFFFFFFE1);
    }

    private final void c(boolean arg0) {
        byte[] byArray = null;
        if (!arg0) {
            return;
        }
        byte[] byArray2 = null;
        byArray = this.a("people and monsters", 30, 1, 88);
        if (byArray == null) {
            this.Vc = true;
            return;
        }
        byArray2 = na.a("index.dat", 0, byArray, -120);
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (this.Pg) {
            byArray3 = this.a("member graphics", 45, 2, 68);
            if (byArray3 == null) {
                this.Vc = true;
                return;
            }
            byArray4 = na.a("index.dat", 0, byArray3, -121);
        }
        this.dj = 0;
        int n2 = 0;
        this.uc = this.dj;
        block0: for (int i2 = 0; na.e > i2; ++i2) {
            String string = cb.e[i2];
            for (int i3 = 0; i3 < i2; ++i3) {
                if (!cb.e[i3].equalsIgnoreCase(string)) continue;
                w.g[i2] = w.g[i3];
                continue block0;
            }
            byte[] byArray5 = na.a(string + ".dat", 0, byArray, -124);
            byte[] byArray6 = byArray2;
            if (byArray5 == null && this.Pg) {
                byArray6 = byArray4;
                byArray5 = na.a(string + ".dat", 0, byArray3, -127);
            }
            if (byArray5 != null) {
                byte[] byArray7;
                n2 += 15;
                this.li.a(this.uc, 15, byArray5, 83, byArray6);
                if (nb.d[i2] == 1) {
                    byArray6 = byArray2;
                    byArray7 = na.a(string + "a.dat", 0, byArray, -124);
                    if (byArray7 == null && this.Pg) {
                        byArray6 = byArray4;
                        byArray7 = na.a(string + "a.dat", 0, byArray3, -121);
                    }
                    n2 += 3;
                    this.li.a(15 + this.uc, 3, byArray7, 89, byArray6);
                }
                if (aa.c[i2] == 1) {
                    byArray7 = na.a(string + "f.dat", 0, byArray, -123);
                    byArray6 = byArray2;
                    if (byArray7 == null && this.Pg) {
                        byArray7 = na.a(string + "f.dat", 0, byArray3, -118);
                        byArray6 = byArray4;
                    }
                    this.li.a(this.uc + 18, 9, byArray7, 76, byArray6);
                    n2 += 9;
                }
                if (n.m[i2] != 0) {
                    for (int i4 = this.uc; this.uc + 27 > i4; ++i4) {
                        this.li.b(i4, -342059728);
                    }
                }
            }
            w.g[i2] = this.uc;
            this.uc += 27;
        }
        System.out.println("Loaded: " + n2 + " frames of animation");
    }

    private final void a(byte arg0, String arg1, String arg2) {
        this.Jh.b(218, 0);
        this.Jh.f.a(arg1, 124);
        u.a(103, this.Jh.f, arg2);
        if (arg0 >= -26) {
            this.a(5, 122, -108, 125);
        }
        this.Jh.b(21294);
    }

    private final void b(int arg0, byte arg1, int arg2) {
        try {
            if (arg0 == 191) {
                int n2;
                int n3;
                int n4;
                this.If = this.Yc;
                for (n4 = 0; this.If > n4; ++n4) {
                    this.Zg[n4] = this.rg[n4];
                }
                this.mg.i(-2231);
                this.Lf = this.mg.f(-106, 11);
                this.sh = this.mg.f(-106, 13);
                n4 = this.mg.f(-82, 4);
                boolean bl = this.a(this.sh, this.Lf, false);
                this.Lf -= this.Qg;
                this.sh -= this.zg;
                int n5 = 64 + this.Lf * this.Ug;
                int n6 = this.sh * this.Ug + 64;
                this.Yc = 0;
                if (bl) {
                    this.wi.e = 0;
                    this.wi.o = 0;
                    this.wi.i = this.wi.k[0] = n5;
                    this.wi.K = this.wi.F[0] = n6;
                }
                this.wi = this.d(n6, this.Zc, n5, -56, n4);
                int n7 = this.mg.f(-69, 8);
                for (n3 = 0; n7 > n3; ++n3) {
                    ta ta2 = this.Zg[n3 + 1];
                    n2 = this.mg.f(-112, 1);
                    if (n2 != 0) {
                        int n8;
                        int n9 = this.mg.f(-95, 1);
                        if (n9 != 0) {
                            n8 = this.mg.f(-69, 2);
                            if (n8 == 3) continue;
                            ta2.D = (n8 << 2) - -this.mg.f(-98, 2);
                        } else {
                            n8 = this.mg.f(-87, 3);
                            int n10 = ta2.o;
                            int n11 = ta2.k[n10];
                            int n12 = ta2.F[n10];
                            if (n8 == 2 || n8 == 1 || n8 == 3) {
                                n11 += this.Ug;
                            }
                            if (n8 == 6 || n8 == 5 || n8 == 7) {
                                n11 -= this.Ug;
                            }
                            if (n8 == 4 || n8 == 3 || n8 == 5) {
                                n12 += this.Ug;
                            }
                            ta2.o = n10 = (1 + n10) % 10;
                            ta2.D = n8;
                            if (n8 == 0 || n8 == 1 || n8 == 7) {
                                n12 -= this.Ug;
                            }
                            ta2.k[n10] = n11;
                            ta2.F[n10] = n12;
                        }
                    }
                    this.rg[this.Yc++] = ta2;
                }
                while (24 + this.mg.k(-31874) < arg2 * 8) {
                    n3 = this.mg.f(-120, 11);
                    int n13 = this.mg.f(-96, 5);
                    if (n13 > 15) {
                        n13 -= 32;
                    }
                    if ((n2 = this.mg.f(-90, 5)) > 15) {
                        n2 -= 32;
                    }
                    n4 = this.mg.f(-97, 4);
                    n6 = 64 + (n2 + this.sh) * this.Ug;
                    n5 = (this.Lf - -n13) * this.Ug + 64;
                    this.d(n6, n3, n5, -112, n4);
                }
                this.mg.j(25505);
                return;
            }
            if (arg0 == 99) {
                while (this.mg.w < arg2) {
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    if (this.mg.a((byte)104) != 255) {
                        --this.mg.w;
                        n18 = this.mg.f(255);
                        n17 = this.Lf + this.mg.h(20869);
                        n16 = this.sh + this.mg.h(20869);
                        if ((n18 & 0x8000) != 0) {
                            n18 &= Short.MAX_VALUE;
                            n15 = 0;
                            for (n14 = 0; this.Ah > n14; ++n14) {
                                if (this.Zf[n14] == n17 && this.Ni[n14] == n16 && this.Gj[n14] == n18) {
                                    n18 = -123;
                                    continue;
                                }
                                if (n15 != n14) {
                                    this.Zf[n15] = this.Zf[n14];
                                    this.Ni[n15] = this.Ni[n14];
                                    this.Gj[n15] = this.Gj[n14];
                                    this.Le[n15] = this.Le[n14];
                                }
                                ++n15;
                            }
                            this.Ah = n15;
                            continue;
                        }
                        this.Zf[this.Ah] = n17;
                        this.Ni[this.Ah] = n16;
                        this.Gj[this.Ah] = n18;
                        this.Le[this.Ah] = 0;
                        for (n15 = 0; n15 < this.eh; ++n15) {
                            if (n17 != this.Se[n15] || this.ye[n15] != n16) continue;
                            this.Le[this.Ah] = h.b[this.vc[n15]];
                            break;
                        }
                        ++this.Ah;
                        continue;
                    }
                    n18 = 0;
                    n17 = this.Lf + this.mg.h(20869) >> 3;
                    n16 = this.sh - -this.mg.h(20869) >> 3;
                    for (n15 = 0; n15 < this.Ah; ++n15) {
                        n14 = -n17 + (this.Zf[n15] >> 3);
                        int n19 = (this.Ni[n15] >> 3) + -n16;
                        if (n14 == 0 && n19 == 0) continue;
                        if (n15 != n18) {
                            this.Zf[n18] = this.Zf[n15];
                            this.Ni[n18] = this.Ni[n15];
                            this.Gj[n18] = this.Gj[n15];
                            this.Le[n18] = this.Le[n15];
                        }
                        ++n18;
                    }
                    this.Ah = n18;
                }
                return;
            }
            if (arg0 == 48) {
                while (this.mg.w < arg2) {
                    int n20;
                    int n21;
                    int n22;
                    int n23;
                    int n24;
                    int n25;
                    if (this.mg.a((byte)104) != 255) {
                        int n26;
                        --this.mg.w;
                        n25 = this.mg.f(255);
                        n24 = this.Lf - -this.mg.h(20869);
                        n23 = this.sh + this.mg.h(20869);
                        n22 = 0;
                        for (n21 = 0; this.eh > n21; ++n21) {
                            if (n24 != this.Se[n21] || this.ye[n21] != n23) {
                                if (n21 != n22) {
                                    this.hg[n22] = this.hg[n21];
                                    this.hg[n22].rb = n22;
                                    this.Se[n22] = this.Se[n21];
                                    this.ye[n22] = this.ye[n21];
                                    this.vc[n22] = this.vc[n21];
                                    this.bg[n22] = this.bg[n21];
                                }
                                ++n22;
                                continue;
                            }
                            this.Ek.a(this.hg[n21], -1);
                            this.Hh.a(this.vc[n21], this.Se[n21], this.ye[n21], 4081);
                        }
                        this.eh = n22;
                        if (n25 == 60000) continue;
                        n21 = this.Hh.b(n24, n23, -75);
                        if (n21 != 0 && n21 != 4) {
                            n20 = ub.g[n25];
                            n26 = f.f[n25];
                        } else {
                            n26 = ub.g[n25];
                            n20 = f.f[n25];
                        }
                        int n27 = this.Ug * (n24 + (n24 - -n20)) / 2;
                        int n28 = (n23 - (-n23 - n26)) * this.Ug / 2;
                        int n29 = fb.f[n25];
                        ca ca2 = this.kh[n29].b(-2);
                        this.Ek.a(ca2, (byte)118);
                        ca2.rb = this.eh;
                        ca2.f(0, -31616, n21 * 32, 0);
                        ca2.a(n27, n28, -this.Hh.f(n27, n28, -102), true);
                        ca2.a(-50, 48, -10, -50, true, 48, 117);
                        this.Hh.a(n24, n25, false, n23);
                        if (n25 == 74) {
                            ca2.a(0, 0, -480, true);
                        }
                        this.Se[this.eh] = n24;
                        this.ye[this.eh] = n23;
                        this.vc[this.eh] = n25;
                        this.bg[this.eh] = n21;
                        this.hg[this.eh++] = ca2;
                        continue;
                    }
                    n25 = 0;
                    n24 = this.Lf - -this.mg.h(20869) >> 3;
                    n23 = this.sh + this.mg.h(20869) >> 3;
                    for (n22 = 0; n22 < this.eh; ++n22) {
                        n21 = (this.Se[n22] >> 3) + -n24;
                        n20 = (this.ye[n22] >> 3) + -n23;
                        if (n21 == 0 && n20 == 0) {
                            this.Ek.a(this.hg[n22], -1);
                            this.Hh.a(this.vc[n22], this.Se[n22], this.ye[n22], 4081);
                            continue;
                        }
                        if (n22 != n25) {
                            this.hg[n25] = this.hg[n22];
                            this.hg[n25].rb = n25;
                            this.Se[n25] = this.Se[n22];
                            this.ye[n25] = this.ye[n22];
                            this.vc[n25] = this.vc[n22];
                            this.bg[n25] = this.bg[n22];
                        }
                        ++n25;
                    }
                    this.eh = n25;
                }
                return;
            }
            if (arg0 == 111) {
                this.Kd = this.mg.a((byte)104) != 0;
                return;
            }
            if (arg0 == 53) {
                this.lc = this.mg.a((byte)104);
                for (int i2 = 0; i2 < this.lc; ++i2) {
                    int n30 = this.mg.f(255);
                    this.vf[i2] = ib.a(n30, Short.MAX_VALUE);
                    this.Aj[i2] = n30 / 32768;
                    this.xe[i2] = fa.e[Short.MAX_VALUE & n30] == 0 ? this.mg.c(103) : 1;
                }
                return;
            }
            if (arg0 == 234) {
                int n31 = this.mg.f(255);
                for (int i3 = 0; n31 > i3; ++i3) {
                    int n32 = this.mg.f(255);
                    ta ta3 = this.We[n32];
                    byte by = this.mg.h(20869);
                    if (by != 0) {
                        int n33;
                        if (by == 1) {
                            if (ta3 == null) continue;
                            int n34 = this.mg.a((byte)104);
                            String string = ia.a(this.mg, false);
                            n33 = 0;
                            String string2 = w.a(ta3.C, (byte)109);
                            if (string2 != null) {
                                for (int i4 = 0; i4 < db.g; ++i4) {
                                    if (!string2.equals(w.a(ia.a[i4], (byte)100))) continue;
                                    n33 = 1;
                                    break;
                                }
                            }
                            if (n33 != 0) continue;
                            ta3.I = 150;
                            ta3.n = string;
                            this.a(n34 == 2, ta3.c, 0, ta3.n, 4, n34, ta3.C, null);
                            continue;
                        }
                        if (by != 2) {
                            if (by == 3) {
                                int n35 = this.mg.f(255);
                                int n36 = this.mg.f(255);
                                if (ta3 == null) continue;
                                ta3.h = n36;
                                ta3.w = this.nc;
                                ta3.z = -1;
                                ta3.a = n35;
                                continue;
                            }
                            if (by != 4) {
                                String string;
                                if (by == 5) {
                                    int n37;
                                    if (ta3 == null) {
                                        this.mg.f(255);
                                        this.mg.c((byte)-44);
                                        this.mg.c((byte)-44);
                                        int n38 = this.mg.a((byte)104);
                                        this.mg.w += 6 + n38;
                                        continue;
                                    }
                                    this.mg.f(255);
                                    ta3.c = this.mg.c((byte)-44);
                                    ta3.C = this.mg.c((byte)-44);
                                    int n39 = this.mg.a((byte)104);
                                    for (n37 = 0; n37 < n39; ++n37) {
                                        ta3.m[n37] = this.mg.a((byte)104);
                                    }
                                    for (n37 = n39; n37 < 12; ++n37) {
                                        ta3.m[n37] = 0;
                                    }
                                    ta3.p = this.mg.a((byte)104);
                                    ta3.q = this.mg.a((byte)104);
                                    ta3.A = this.mg.a((byte)104);
                                    ta3.H = this.mg.a((byte)104);
                                    ta3.s = this.mg.a((byte)104);
                                    ta3.J = this.mg.a((byte)104);
                                    continue;
                                }
                                if (by != 6 || ta3 == null) continue;
                                ta3.n = string = ia.a(this.mg, false);
                                ta3.I = 150;
                                if (this.wi != ta3) continue;
                                this.a(false, ta3.c, 0, ta3.n, 3, 0, ta3.C, null);
                                continue;
                            }
                            int n40 = this.mg.f(255);
                            int n41 = this.mg.f(255);
                            if (ta3 == null) continue;
                            ta3.w = this.nc;
                            ta3.h = -1;
                            ta3.z = n41;
                            ta3.a = n40;
                            continue;
                        }
                        int n42 = this.mg.a((byte)104);
                        int n43 = this.mg.a((byte)104);
                        n33 = this.mg.a((byte)104);
                        if (ta3 == null) continue;
                        ta3.G = n33;
                        ta3.B = n43;
                        ta3.u = n42;
                        if (this.wi == ta3) {
                            this.oh[3] = n43;
                            this.cg[3] = n33;
                            this.mh = false;
                            this.Oh = false;
                        }
                        ta3.d = 200;
                        continue;
                    }
                    int n44 = this.mg.f(255);
                    if (ta3 == null) continue;
                    ta3.E = 150;
                    ta3.j = n44;
                }
                return;
            }
            if (arg0 == 91) {
                while (arg2 > this.mg.w) {
                    ca ca3;
                    int n45;
                    int n46;
                    int n47;
                    int n48;
                    int n49;
                    if (this.mg.a((byte)104) == 255) {
                        n49 = 0;
                        n48 = this.Lf - -this.mg.h(20869) >> 3;
                        n47 = this.sh + this.mg.h(20869) >> 3;
                        for (n46 = 0; this.hf > n46; ++n46) {
                            n45 = -n48 + (this.Jd[n46] >> 3);
                            int n50 = (this.yk[n46] >> 3) - n47;
                            if (n45 != 0 || n50 != 0) {
                                if (n49 != n46) {
                                    this.rd[n49] = this.rd[n46];
                                    this.rd[n49].rb = n49 + 10000;
                                    this.Jd[n49] = this.Jd[n46];
                                    this.yk[n49] = this.yk[n46];
                                    this.Hj[n49] = this.Hj[n46];
                                    this.Ng[n49] = this.Ng[n46];
                                }
                                ++n49;
                                continue;
                            }
                            this.Ek.a(this.rd[n46], -1);
                            this.Hh.a(true, this.Hj[n46], this.yk[n46], this.Jd[n46], this.Ng[n46]);
                        }
                        this.hf = n49;
                        continue;
                    }
                    --this.mg.w;
                    n49 = this.mg.f(255);
                    n48 = this.Lf - -this.mg.h(20869);
                    n47 = this.sh + this.mg.h(20869);
                    n46 = this.mg.h(20869);
                    n45 = 0;
                    for (int i5 = 0; i5 < this.hf; ++i5) {
                        if (this.Jd[i5] != n48 || n47 != this.yk[i5] || n46 != this.Hj[i5]) {
                            if (n45 != i5) {
                                this.rd[n45] = this.rd[i5];
                                this.rd[n45].rb = n45 + 10000;
                                this.Jd[n45] = this.Jd[i5];
                                this.yk[n45] = this.yk[i5];
                                this.Hj[n45] = this.Hj[i5];
                                this.Ng[n45] = this.Ng[i5];
                            }
                            ++n45;
                            continue;
                        }
                        this.Ek.a(this.rd[i5], -1);
                        this.Hh.a(true, this.Hj[i5], this.yk[i5], this.Jd[i5], this.Ng[i5]);
                    }
                    this.hf = n45;
                    if (n49 == 65535) continue;
                    this.Hh.a(n47, n49, n46, n48, 11715);
                    this.rd[this.hf] = ca3 = this.a(true, n47, n49, n48, n46, this.hf);
                    this.Jd[this.hf] = n48;
                    this.yk[this.hf] = n47;
                    this.Ng[this.hf] = n49;
                    this.Hj[this.hf++] = n46;
                }
                return;
            }
            if (arg0 == 79) {
                int n51;
                int n52;
                int n53;
                int n54;
                int n55;
                int n56;
                int n57;
                this.qj = this.de;
                this.de = 0;
                for (n57 = 0; this.qj > n57; ++n57) {
                    this.Ff[n57] = this.Tb[n57];
                }
                this.mg.i(-2231);
                n57 = this.mg.f(-87, 8);
                for (n56 = 0; n56 < n57; ++n56) {
                    ta ta4 = this.Ff[n56];
                    n55 = this.mg.f(-127, 1);
                    if (n55 != 0) {
                        n54 = this.mg.f(-72, 1);
                        if (n54 == 0) {
                            n53 = this.mg.f(-114, 3);
                            n52 = ta4.o;
                            n51 = ta4.k[n52];
                            int n58 = ta4.F[n52];
                            if (n53 == 2 || n53 == 1 || n53 == 3) {
                                n51 += this.Ug;
                            }
                            if (n53 == 6 || n53 == 5 || n53 == 7) {
                                n51 -= this.Ug;
                            }
                            if (n53 == 4 || n53 == 3 || n53 == 5) {
                                n58 += this.Ug;
                            }
                            ta4.D = n53;
                            ta4.o = n52 = (n52 + 1) % 10;
                            if (n53 == 0 || n53 == 1 || n53 == 7) {
                                n58 -= this.Ug;
                            }
                            ta4.k[n52] = n51;
                            ta4.F[n52] = n58;
                        } else {
                            n53 = this.mg.f(-109, 2);
                            if (n53 == 3) continue;
                            ta4.D = this.mg.f(-127, 2) + (n53 << 2);
                        }
                    }
                    this.Tb[this.de++] = ta4;
                }
                while (this.mg.k(-31874) + 34 < 8 * arg2) {
                    n56 = this.mg.f(-104, 12);
                    int n59 = this.mg.f(-68, 5);
                    if (n59 > 15) {
                        n59 -= 32;
                    }
                    if ((n55 = this.mg.f(-111, 5)) > 15) {
                        n55 -= 32;
                    }
                    n54 = this.mg.f(-74, 4);
                    n53 = 64 + (n59 + this.Lf) * this.Ug;
                    n52 = 64 + this.Ug * (this.sh - -n55);
                    n51 = this.mg.f(-108, 10);
                    if (la.d <= n51) {
                        n51 = 24;
                    }
                    this.a(n54, n51, n53, (byte)127, n52, n56);
                }
                this.mg.j(25505);
                return;
            }
            if (arg0 == 104) {
                int n60 = this.mg.f(255);
                for (int i6 = 0; n60 > i6; ++i6) {
                    int n61;
                    int n62 = this.mg.f(255);
                    ta ta5 = this.te[n62];
                    int n63 = this.mg.a((byte)104);
                    if (n63 != 1) {
                        if (n63 != 2) continue;
                        n61 = this.mg.a((byte)104);
                        int n64 = this.mg.a((byte)104);
                        int n65 = this.mg.a((byte)104);
                        if (ta5 == null) continue;
                        ta5.u = n61;
                        ta5.G = n65;
                        ta5.d = 200;
                        ta5.B = n64;
                        continue;
                    }
                    n61 = this.mg.f(255);
                    if (ta5 == null) continue;
                    String string = ia.a(this.mg, false);
                    ta5.I = 150;
                    ta5.n = string;
                    if (this.wi.b != n61) continue;
                    this.a(false, null, 0, e.Mb[ta5.t] + ": " + ta5.n, 3, 0, null, "@yel@");
                }
                return;
            }
            if (arg0 == 245) {
                int n66;
                this.Ph = true;
                this.Id = n66 = this.mg.a((byte)104);
                for (int i7 = 0; i7 < n66; ++i7) {
                    this.ah[i7] = this.mg.c((byte)-44);
                }
                return;
            }
            if (arg0 == 252) {
                this.Ph = false;
                return;
            }
            if (arg0 == 25) {
                this.Ub = true;
                this.Zc = this.mg.f(255);
                this.Ki = this.mg.f(255);
                this.sk = this.mg.f(255);
                this.bc = this.mg.f(255);
                this.rc = this.mg.f(255);
                this.sk -= this.bc * this.rc;
                return;
            }
            if (arg0 == 156) {
                int n67;
                for (n67 = 0; n67 < 18; ++n67) {
                    this.oh[n67] = this.mg.a((byte)104);
                }
                for (n67 = 0; n67 < 18; ++n67) {
                    this.cg[n67] = this.mg.a((byte)104);
                }
                for (n67 = 0; n67 < 18; ++n67) {
                    this.Ak[n67] = this.mg.b(-129);
                }
                this.ii = this.mg.a((byte)104);
                return;
            }
            if (arg0 == 153) {
                for (int i8 = 0; i8 < 5; ++i8) {
                    this.Fc[i8] = this.mg.a((byte)104);
                }
                return;
            }
            if (arg0 == 83) {
                this.rk = 250;
                return;
            }
            if (arg0 == 211) {
                int n68 = (arg2 - 1) / 4;
                for (int i9 = 0; n68 > i9; ++i9) {
                    int n69;
                    int n70;
                    int n71;
                    int n72 = this.Lf - -this.mg.a(false) >> 3;
                    int n73 = this.sh - -this.mg.a(false) >> 3;
                    int n74 = 0;
                    for (n71 = 0; n71 < this.Ah; ++n71) {
                        n70 = -n72 + (this.Zf[n71] >> 3);
                        n69 = -n73 + (this.Ni[n71] >> 3);
                        if (n70 == 0 && n69 == 0) continue;
                        if (n74 != n71) {
                            this.Zf[n74] = this.Zf[n71];
                            this.Ni[n74] = this.Ni[n71];
                            this.Gj[n74] = this.Gj[n71];
                            this.Le[n74] = this.Le[n71];
                        }
                        ++n74;
                    }
                    this.Ah = n74;
                    n74 = 0;
                    for (n71 = 0; n71 < this.eh; ++n71) {
                        n70 = -n72 + (this.Se[n71] >> 3);
                        n69 = (this.ye[n71] >> 3) - n73;
                        if (n70 != 0 || n69 != 0) {
                            if (n74 != n71) {
                                this.hg[n74] = this.hg[n71];
                                this.hg[n74].rb = n74;
                                this.Se[n74] = this.Se[n71];
                                this.ye[n74] = this.ye[n71];
                                this.vc[n74] = this.vc[n71];
                                this.bg[n74] = this.bg[n71];
                            }
                            ++n74;
                            continue;
                        }
                        this.Ek.a(this.hg[n71], -1);
                        this.Hh.a(this.vc[n71], this.Se[n71], this.ye[n71], 4081);
                    }
                    this.eh = n74;
                    n74 = 0;
                    for (n71 = 0; this.hf > n71; ++n71) {
                        n70 = (this.Jd[n71] >> 3) + -n72;
                        n69 = (this.yk[n71] >> 3) - n73;
                        if (n70 == 0 && n69 == 0) {
                            this.Ek.a(this.rd[n71], -1);
                            this.Hh.a(true, this.Hj[n71], this.yk[n71], this.Jd[n71], this.Ng[n71]);
                            continue;
                        }
                        if (n74 != n71) {
                            this.rd[n74] = this.rd[n71];
                            this.rd[n74].rb = n74 + 10000;
                            this.Jd[n74] = this.Jd[n71];
                            this.yk[n74] = this.yk[n71];
                            this.Hj[n74] = this.Hj[n71];
                            this.Ng[n74] = this.Ng[n71];
                        }
                        ++n74;
                    }
                    this.hf = n74;
                }
                return;
            }
            if (arg0 == 59) {
                this.Kg = true;
                return;
            }
            if (arg0 == 92) {
                int n75 = this.mg.f(255);
                if (this.We[n75] != null) {
                    this.cj = this.We[n75].c;
                }
                this.Hk = true;
                this.Lk = 0;
                this.mf = 0;
                this.Mi = false;
                this.md = false;
                return;
            }
            if (arg0 == 128) {
                this.Xj = false;
                this.Hk = false;
                return;
            }
            if (arg0 == 97) {
                this.Lk = this.mg.a((byte)104);
                for (int i10 = 0; this.Lk > i10; ++i10) {
                    this.zj[i10] = this.mg.f(255);
                    this.Dd[i10] = this.mg.b(-129);
                }
                this.md = false;
                this.Mi = false;
                return;
            }
            if (arg0 == 162) {
                int n76 = this.mg.a((byte)104);
                this.md = n76 == 1;
                return;
            }
            if (arg0 == 101) {
                int n77;
                this.uk = true;
                int n78 = this.mg.a((byte)104);
                byte by = this.mg.h(20869);
                this.Nh = this.mg.a((byte)104);
                this.xk = this.mg.a((byte)104);
                this.Pf = this.mg.a((byte)104);
                for (n77 = 0; n77 < 40; ++n77) {
                    this.Rj[n77] = -1;
                }
                for (n77 = 0; n78 > n77; ++n77) {
                    this.Rj[n77] = this.mg.f(255);
                    this.Jf[n77] = this.mg.f(255);
                    this.vi[n77] = this.mg.f(255);
                }
                if (by == 1) {
                    n77 = 39;
                    for (int i11 = 0; i11 < this.lc && n77 >= n78; ++i11) {
                        boolean bl = false;
                        for (int i12 = 0; i12 < 40; ++i12) {
                            if (this.vf[i11] != this.Rj[i12]) continue;
                            bl = true;
                            break;
                        }
                        if (this.vf[i11] == 10) {
                            bl = true;
                        }
                        if (bl) continue;
                        this.Rj[n77] = ib.a(Short.MAX_VALUE, this.vf[i11]);
                        this.Jf[n77] = 0;
                        this.vi[n77] = 0;
                        --n77;
                    }
                }
                if (this.Di >= 0 && this.Di < 40 && this.fh != this.Rj[this.Di]) {
                    this.Di = -1;
                    this.fh = -2;
                }
                return;
            }
            if (arg0 == 137) {
                this.uk = false;
                return;
            }
            if (arg0 == 15) {
                byte by = this.mg.h(20869);
                this.Mi = by == 1;
                return;
            }
            if (arg0 == 240) {
                this.Kh = this.mg.a((byte)104) == 1;
                this.Yh = this.mg.a((byte)104) == 1;
                this.ne = this.mg.a((byte)104) == 1;
                return;
            }
            if (arg0 == 206) {
                for (int i13 = 0; arg2 - 1 > i13; ++i13) {
                    boolean bl;
                    boolean bl2 = bl = this.mg.h(20869) == 1;
                    if (!this.bk[i13] && bl) {
                        this.a(-127, "prayeron");
                    }
                    if (this.bk[i13] && !bl) {
                        this.a(-66, "prayeroff");
                    }
                    this.bk[i13] = bl;
                }
                return;
            }
            if (arg0 == 5) {
                for (int i14 = 0; i14 < 50; ++i14) {
                    this.fi[i14] = this.mg.h(20869) == 1;
                }
                return;
            }
            if (arg0 == 42) {
                this.Fe = true;
                this.fj = this.mg.a((byte)104);
                this.Gi = this.mg.a((byte)104);
                for (int i15 = 0; this.fj > i15; ++i15) {
                    this.ci[i15] = this.mg.f(255);
                    this.Xe[i15] = this.mg.c(103);
                }
                this.C(108);
                return;
            }
            if (arg0 == 203) {
                this.Fe = false;
                return;
            }
            if (arg0 == 33) {
                int n79 = this.mg.a((byte)104);
                this.Ak[n79] = this.mg.b(-129);
                return;
            }
            if (arg0 == 176) {
                int n80 = this.mg.f(255);
                if (this.We[n80] != null) {
                    this.Lg = this.We[n80].c;
                }
                this.ke = false;
                this.vd = false;
                this.ki = false;
                this.ff = false;
                this.fd = false;
                this.Pj = true;
                this.Yi = false;
                this.wj = 0;
                this.Ke = 0;
                return;
            }
            if (arg0 == 225) {
                this.Pj = false;
                this.dd = false;
                return;
            }
            if (arg0 == 20) {
                int n81;
                this.Hk = false;
                this.Xj = true;
                this.Vi = false;
                this.re = this.mg.c((byte)-44);
                this.nh = this.mg.a((byte)104);
                for (n81 = 0; this.nh > n81; ++n81) {
                    this.Lc[n81] = this.mg.f(255);
                    this.Bi[n81] = this.mg.b(-129);
                }
                this.Ui = this.mg.a((byte)104);
                for (n81 = 0; this.Ui > n81; ++n81) {
                    this.Vb[n81] = this.mg.f(255);
                    this.Me[n81] = this.mg.b(-129);
                }
                return;
            }
            if (arg0 == 6) {
                this.wj = this.mg.a((byte)104);
                for (int i16 = 0; i16 < this.wj; ++i16) {
                    this.zc[i16] = this.mg.f(255);
                    this.of[i16] = this.mg.b(-129);
                }
                this.ke = false;
                this.ki = false;
                return;
            }
            if (arg0 == 30) {
                this.fd = this.mg.a((byte)104) == 1;
                this.Yi = this.mg.a((byte)104) == 1;
                this.vd = this.mg.a((byte)104) == 1;
                this.ff = this.mg.a((byte)104) == 1;
                this.ke = false;
                this.ki = false;
                return;
            }
            if (arg0 == 249) {
                int n82 = this.mg.a((byte)104);
                int n83 = this.mg.f(255);
                int n84 = this.mg.c(103);
                if (n84 == 0) {
                    --this.fj;
                    for (int i17 = n82; i17 < this.fj; ++i17) {
                        this.ci[i17] = this.ci[1 + i17];
                        this.Xe[i17] = this.Xe[i17 + 1];
                    }
                } else {
                    this.ci[n82] = n83;
                    this.Xe[n82] = n84;
                    if (n82 >= this.fj) {
                        this.fj = n82 + 1;
                    }
                }
                this.C(-103);
                return;
            }
            if (arg0 == 90) {
                int n85 = 1;
                int n86 = this.mg.a((byte)104);
                int n87 = this.mg.f(255);
                if (fa.e[n87 & Short.MAX_VALUE] == 0) {
                    n85 = this.mg.c(103);
                }
                this.vf[n86] = ib.a(n87, Short.MAX_VALUE);
                this.Aj[n86] = n87 / 32768;
                this.xe[n86] = n85;
                if (n86 >= this.lc) {
                    this.lc = 1 + n86;
                }
                return;
            }
            if (arg0 == 123) {
                int n88 = this.mg.a((byte)104);
                --this.lc;
                for (int i18 = n88; this.lc > i18; ++i18) {
                    this.vf[i18] = this.vf[i18 + 1];
                    this.xe[i18] = this.xe[i18 + 1];
                    this.Aj[i18] = this.Aj[i18 + 1];
                }
                return;
            }
            if (arg0 == 159) {
                int n89 = this.mg.a((byte)104);
                this.oh[n89] = this.mg.a((byte)104);
                this.cg[n89] = this.mg.a((byte)104);
                this.Ak[n89] = this.mg.b(-129);
                return;
            }
            if (arg0 == 253) {
                byte by = this.mg.h(20869);
                this.ki = by == 1;
                return;
            }
            if (arg0 == 210) {
                byte by = this.mg.h(20869);
                this.ke = by == 1;
                return;
            }
            if (arg0 == 172) {
                int n90;
                this.Cd = false;
                this.dd = true;
                this.Pj = false;
                this.Uc = this.mg.c((byte)-44);
                this.Ve = this.mg.a((byte)104);
                for (n90 = 0; n90 < this.Ve; ++n90) {
                    this.xj[n90] = this.mg.f(255);
                    this.kf[n90] = this.mg.b(-129);
                }
                this.Nj = this.mg.a((byte)104);
                for (n90 = 0; n90 < this.Nj; ++n90) {
                    this.xi[n90] = this.mg.f(255);
                    this.th[n90] = this.mg.b(-129);
                }
                this.Sh = this.mg.a((byte)104);
                this.gh = this.mg.a((byte)104);
                this.Cc = this.mg.a((byte)104);
                this.Rc = this.mg.a((byte)104);
                return;
            }
            if (arg0 == 204) {
                String string = this.mg.c((byte)-44);
                this.a(-73, string);
                return;
            }
            if (arg0 == 36) {
                if (this.el < 50) {
                    int n91 = this.mg.a((byte)104);
                    int n92 = this.mg.h(20869) - -this.Lf;
                    int n93 = this.mg.h(20869) + this.sh;
                    this.Oc[this.el] = n91;
                    this.oe[this.el] = 0;
                    this.Sc[this.el] = n92;
                    this.gi[this.el] = n93;
                    ++this.el;
                }
                return;
            }
            if (arg0 == 182) {
                if (!this.Dc) {
                    this.ce = this.mg.b(-129);
                    this.hi = this.mg.f(255);
                    this.Sb = this.mg.a((byte)104);
                    this.id = this.mg.f(255);
                    this.Oh = true;
                    this.ve = null;
                    this.Dc = true;
                }
                return;
            }
            if (arg0 == 89) {
                this.Cj = this.mg.c((byte)-44);
                this.mh = true;
                this.Wk = false;
                return;
            }
            if (arg0 == 222) {
                this.Cj = this.mg.c((byte)-44);
                this.mh = true;
                this.Wk = true;
                return;
            }
            if (arg0 == 114) {
                this.vg = this.mg.f(255);
                return;
            }
            if (arg0 == 117) {
                if (!this.Qk) {
                    this.pg = this.vg;
                }
                this.e = "";
                this.Qk = true;
                this.Cb = "";
                this.li.a((byte)-118, this.mg.F, this.Eh + 1);
                this.Zj = null;
                return;
            }
            if (arg0 == 244) {
                this.pg = this.mg.f(255);
                return;
            }
            if (arg0 == 84) {
                this.Qk = false;
                return;
            }
            if (arg0 == 194) {
                this.Zj = "Incorrect - Please wait...";
                return;
            }
            if (arg0 == 52) {
                this.kc = this.mg.f(255) * 32;
                return;
            }
            if (arg0 == 213) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            String string = "T2 - " + arg0 + " - " + arg2 + " rx:" + this.Lf + " ry:" + this.sh + " num3l:" + this.eh + " - ";
            for (int i19 = 0; arg2 > i19 && i19 < 50; ++i19) {
                string = string + this.mg.F[i19] + ",";
            }
            mb.a(0x1FFFFF, runtimeException, string);
            this.a(true, 31);
            return;
        }
        mb.a(0x1FFFFF, null, "T1 - " + arg0 + " - " + arg2);
        this.a(true, 31);
    }

    private final void p(int arg0) {
        this.ge = new qa(this.li, 50);
        int n2 = 40;
        this.ge.a(true, (byte)-79, 4, 256, "Welcome to RuneScape Classic", 200 - -n2);
        String string = null;
        if (this.Pg) {
            string = this.cf ? "You need a veteran Classic members account to use this server" : "You need a members account to use this server";
        } else if (this.cf) {
            string = "You need a veteran Classic account to use this server";
        }
        if (string != null) {
            this.ge.a(true, (byte)-109, 4, 256, string, 215 + n2);
        }
        this.ge.c(arg0 - 3917, 200, 35, 256, n2 + 250);
        this.ge.a(false, (byte)-96, 5, 256, "Click here to login", n2 + 250);
        this.Jj = this.ge.d(256, 200, 250 + n2, 91, 35);
        this.yi = new qa(this.li, 50);
        n2 = 230;
        this.Qi = this.yi.a(true, (byte)-107, 4, 256, "", n2 - 30);
        this.td = this.yi.a(true, (byte)-125, 4, 256, "Please enter your username and password", n2 - 10);
        this.yi.c(-87, 200, 40, 140, n2 += 28);
        this.yi.a(false, (byte)-126, 4, 140, "Username:", n2 - 10);
        if (arg0 != 3845) {
            this.a(-15, 108, 22, 26, -63, 51, -96, 106);
        }
        this.ng = this.yi.a(arg0 - 3845, 320, 200, false, 10 + n2, 4, 40, false, 140);
        this.yi.c(-120, 200, 40, 190, n2 += 47);
        this.yi.a(false, (byte)-93, 4, 190, "Password:", n2 - 10);
        this.Ih = this.yi.a(arg0 - 3845, 20, 200, false, 10 + n2, 4, 40, true, 190);
        this.yi.c(-90, 120, 25, 410, n2 -= 55);
        this.yi.a(false, (byte)-127, 4, 410, "Ok", n2);
        this.be = this.yi.d(410, 120, n2, -94, 25);
        this.yi.c(arg0 - 3952, 120, 25, 410, n2 += 30);
        this.yi.a(false, (byte)-89, 4, 410, "Cancel", n2);
        this.Xi = this.yi.d(410, 120, n2, -120, 25);
        this.yi.d(this.ng, -105);
        n2 += 30;
    }

    @Override
    final void a(byte arg0, int arg1) {
        block6: {
            if (this.qg == 0) {
                if (this.Xd == 0 && this.ge != null) {
                    this.ge.a(-12, arg1);
                }
                if (this.Xd == 2 && this.yi != null) {
                    this.yi.a(-12, arg1);
                }
            }
            if (arg0 <= 105) {
                return;
            }
            if (this.qg != 1) break block6;
            if (this.Kg) {
                this.Af.a(-12, arg1);
                return;
            }
            if (this.Bj == 0 && this.Vf == 0 && !this.Qk && this.gc == 0) {
                this.yd.a(-12, arg1);
            }
        }
    }

    private final void a(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        block1: {
            if (this.a(arg1, arg5, (byte)14, false, arg3, arg3, arg2, arg2, arg4)) {
                return;
            }
            this.a(arg3, arg4, arg5, arg2, arg1, arg3, true, arg2, arg0 + 107);
            if (arg0 == 10) break block1;
            this.a(99, 113, -126, -87, true, 125);
        }
    }

    private final void q(int arg0) {
        block72: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = -1;
            if (this.Cf != 0 && this.Je) {
                n9 = this.He.b(this.I, this.ad, this.Uk, (byte)-40, this.xb);
            }
            if (n9 >= 0) {
                this.Cf = 0;
                this.Je = false;
                n8 = this.He.a(-26, n9);
                n7 = this.He.a(true, n9);
                n6 = -1;
                n5 = 0;
                if (n8 != 3) {
                    for (n4 = 0; n4 < this.Ke; ++n4) {
                        if (this.Uf[n4] != n7) continue;
                        if (n6 < 0) {
                            n6 = n4;
                        }
                        if (fa.e[n7] == 0) {
                            n5 = this.df[n4];
                            break;
                        }
                        ++n5;
                    }
                } else {
                    for (n4 = 0; this.lc > n4; ++n4) {
                        if (this.vf[n4] != n7) continue;
                        if (n6 < 0) {
                            n6 = n4;
                        }
                        if (fa.e[n7] != 0) {
                            ++n5;
                            continue;
                        }
                        n5 = this.xe[n4];
                        break;
                    }
                }
                if (n6 >= 0) {
                    n4 = this.He.a((byte)97, n9);
                    if (n4 != -2) {
                        if (n4 == -1) {
                            n4 = n5;
                        }
                        if (n8 == 3) {
                            this.b(arg0 ^ 0x36, n4, n6);
                        } else {
                            this.a(n6, n4, (byte)-78);
                        }
                    } else {
                        this.ck = n6;
                        if (n8 == 3) {
                            this.a(oa.c, 12, 7, true);
                        } else {
                            this.a(n.f, 12, 8, true);
                        }
                    }
                }
            } else if (this.gc == 0) {
                if (this.Cf == 1 && this.Tk == 0) {
                    this.Tk = 1;
                }
                n8 = this.I - 22;
                n7 = this.xb - 36;
                if (n8 >= 0 && n7 >= 0 && n8 < 468 && n7 < 262) {
                    if (this.Tk > 0) {
                        if (n8 > 216 && n7 > 30 && n8 < 462 && n7 < 235 && (n6 = (n8 - 217) / 49 + 5 * ((n7 - 31) / 34)) >= 0 && n6 < this.lc) {
                            this.b(109, -1, n6);
                        }
                        if (n8 > 8 && n7 > 30 && n8 < 205 && n7 < 129 && (n6 = (n8 - 9) / 49 + (n7 - 31) / 34 * 4) >= 0 && n6 < this.Ke) {
                            this.a(n6, -1, (byte)-78);
                        }
                        n6 = 0;
                        if (n8 >= 93 && n7 >= 221 && n8 <= 104 && n7 <= 232) {
                            n6 = 1;
                            boolean bl = this.fd = !this.fd;
                        }
                        if (n8 >= 93 && n7 >= 240 && n8 <= 104 && n7 <= 251) {
                            this.Yi = !this.Yi;
                            n6 = 1;
                        }
                        if (n8 >= 191 && n7 >= 221 && n8 <= 202 && n7 <= 232) {
                            this.vd = !this.vd;
                            n6 = 1;
                        }
                        if (n8 >= 191 && n7 >= 240 && n8 <= 202 && n7 <= 251) {
                            n6 = 1;
                            boolean bl = this.ff = !this.ff;
                        }
                        if (n6 != 0) {
                            this.Jh.b(8, 0);
                            this.Jh.f.c(!this.fd ? 0 : 1, 68);
                            this.Jh.f.c(this.Yi ? 1 : 0, -100);
                            this.Jh.f.c(!this.vd ? 0 : 1, -96);
                            this.Jh.f.c(!this.ff ? 0 : 1, -107);
                            this.Jh.b(arg0 ^ 0x5306);
                            this.ki = false;
                            this.ke = false;
                        }
                        if (n8 >= 217 && n7 >= 238 && n8 <= 286 && n7 <= 259) {
                            this.ke = true;
                            this.Jh.b(176, arg0 - 40);
                            this.Jh.b(arg0 + 21254);
                        }
                        if (n8 >= 394 && n7 >= 238 && n8 < 463 && n7 < 259) {
                            this.Pj = false;
                            this.Jh.b(197, 0);
                            this.Jh.b(21294);
                        }
                        this.Tk = 0;
                        this.Cf = 0;
                    }
                    if (this.Cf == 2) {
                        if (n8 > 216 && n7 > 30 && n8 < 462 && n7 < 235) {
                            n6 = this.zh.b(16256);
                            n5 = this.zh.a(arg0 - 21264);
                            this.rh = this.I + -(n6 / 2);
                            this.fg = this.xb - 7;
                            this.se = true;
                            if (this.fg < 0) {
                                this.fg = 0;
                            }
                            if (this.rh < 0) {
                                this.rh = 0;
                            }
                            if (n6 + this.rh > 510) {
                                this.rh = -n6 + 510;
                            }
                            if (n5 + this.fg > 315) {
                                this.fg = 315 - n5;
                            }
                            n4 = (n8 - 217) / 49 - -(5 * ((n7 - 31) / 34));
                            if (n4 >= 0 && this.lc > n4) {
                                n3 = this.vf[n4];
                                this.Je = true;
                                this.He.d(0);
                                this.He.a(n3, "@lre@" + ac.x[n3], 3, "Stake 1", 1, arg0 + 3256);
                                this.He.a(n3, "@lre@" + ac.x[n3], 3, "Stake 5", 5, arg0 ^ 0xCC8);
                                this.He.a(n3, "@lre@" + ac.x[n3], 3, "Stake 10", 10, 3296);
                                this.He.a(n3, "@lre@" + ac.x[n3], 3, "Stake All", -1, 3296);
                                this.He.a(n3, "@lre@" + ac.x[n3], 3, "Stake X", -2, 3296);
                                n2 = this.He.b(16256);
                                int n10 = this.He.a(-21224);
                                this.Uk = this.xb - 7;
                                this.ad = -(n2 / 2) + this.I;
                                if (this.ad < 0) {
                                    this.ad = 0;
                                }
                                if (this.Uk < 0) {
                                    this.Uk = 0;
                                }
                                if (this.ad + n2 > 510) {
                                    this.ad = -n2 + 510;
                                }
                                if (this.Uk + n10 > 315) {
                                    this.Uk = 315 + -n10;
                                }
                            }
                        }
                        if (n8 > 8 && n7 > 30 && n8 < 205 && n7 < 133 && (n6 = (n8 - 9) / 49 + 4 * ((n7 - 31) / 34)) >= 0 && n6 < this.Ke) {
                            n5 = this.Uf[n6];
                            this.Je = true;
                            this.He.d(0);
                            this.He.a(n5, "@lre@" + ac.x[n5], 4, "Remove 1", 1, arg0 ^ 0xCC8);
                            this.He.a(n5, "@lre@" + ac.x[n5], 4, "Remove 5", 5, 3296);
                            this.He.a(n5, "@lre@" + ac.x[n5], 4, "Remove 10", 10, 3296);
                            this.He.a(n5, "@lre@" + ac.x[n5], 4, "Remove All", -1, 3296);
                            this.He.a(n5, "@lre@" + ac.x[n5], 4, "Remove X", -2, arg0 + 3256);
                            n4 = this.He.b(16256);
                            n3 = this.He.a(-21224);
                            this.Uk = this.xb - 7;
                            this.ad = this.I - n4 / 2;
                            if (this.ad < 0) {
                                this.ad = 0;
                            }
                            if (this.Uk < 0) {
                                this.Uk = 0;
                            }
                            if (this.ad + n4 > 510) {
                                this.ad = 510 + -n4;
                            }
                            if (n3 + this.Uk > 315) {
                                this.Uk = 315 + -n3;
                            }
                        }
                        this.Cf = 0;
                    }
                    if (this.Je) {
                        n6 = this.He.b(16256);
                        n5 = this.He.a(-21224);
                        if (this.ad - 10 > this.I || this.Uk - 10 > this.xb || this.ad + n6 + 10 < this.I || 10 + n5 + this.Uk < this.xb) {
                            this.Je = false;
                        }
                    }
                } else if (this.Cf != 0) {
                    this.Pj = false;
                    this.Jh.b(197, 0);
                    this.Jh.b(21294);
                }
            }
            if (!this.Pj) {
                return;
            }
            n8 = 22;
            n7 = 36;
            this.li.a(n8, (byte)112, 13175581, n7, 12, 468);
            n6 = 0x989898;
            this.li.c(160, n8, 18, 0, 12 + n7, 468, n6);
            this.li.c(160, n8, 248, 0, 30 + n7, 8, n6);
            this.li.c(160, n8 + 205, 248, 0, 30 + n7, 11, n6);
            this.li.c(160, n8 + 462, 248, 0, 30 + n7, 6, n6);
            this.li.c(160, n8 + 8, 24, arg0 ^ 0x28, n7 + 99, 197, n6);
            this.li.c(160, 8 + n8, 23, 0, 192 + n7, 197, n6);
            this.li.c(160, n8 + 8, 20, 0, n7 + 258, 197, n6);
            this.li.c(160, n8 + 216, 43, 0, n7 + 235, 246, n6);
            n5 = 0xD0D0D0;
            this.li.c(160, 8 + n8, 69, 0, n7 + 30, 197, n5);
            this.li.c(160, n8 + 8, 69, arg0 ^ arg0, 123 + n7, 197, n5);
            this.li.c(160, 8 + n8, 43, arg0 - 40, n7 + 215, 197, n5);
            this.li.c(160, 216 + n8, 205, 0, n7 + 30, 246, n5);
            for (n4 = 0; n4 < 3; ++n4) {
                this.li.b(197, 0, n8 + 8, n7 - (-(34 * n4) - 30), (byte)58);
            }
            for (n4 = 0; n4 < 3; ++n4) {
                this.li.b(197, 0, 8 + n8, n4 * 34 + n7 + 123, (byte)-88);
            }
            for (n4 = 0; n4 < 7; ++n4) {
                this.li.b(246, 0, 216 + n8, n4 * 34 + (n7 + 30), (byte)-40);
            }
            for (n4 = 0; n4 < 6; ++n4) {
                if (n4 < 5) {
                    this.li.b(49 * n4 + (8 + n8), n7 + 30, 0, 69, 0);
                }
                if (n4 < 5) {
                    this.li.b(49 * n4 + n8 + 8, n7 + 123, 0, 69, 0);
                }
                this.li.b(n4 * 49 + (n8 + 216), n7 + 30, 0, 205, 0);
            }
            this.li.b(197, 0, n8 + 8, 215 + n7, (byte)97);
            this.li.b(197, 0, n8 + 8, n7 + 257, (byte)99);
            this.li.b(8 + n8, n7 + 215, 0, 43, 0);
            this.li.b(n8 + 204, n7 + 215, 0, 43, 0);
            this.li.a("Preparing to duel with: " + this.Lg, 1 + n8, n7 + 10, 0xFFFFFF, false, 1);
            this.li.a("Your Stake", n8 + 9, 27 + n7, 0xFFFFFF, false, 4);
            this.li.a("Opponent's Stake", 9 + n8, 120 + n7, 0xFFFFFF, false, 4);
            this.li.a("Duel Options", n8 + 9, n7 + 212, 0xFFFFFF, false, 4);
            this.li.a("Your Inventory", n8 + 216, n7 + 27, 0xFFFFFF, false, 4);
            this.li.a("No retreating", 1 + (8 + n8), 215 + (n7 + 16), 0xFFFF00, false, 3);
            this.li.a("No magic", 1 + (8 + n8), 250 + n7, 0xFFFF00, false, 3);
            this.li.a("No prayer", 8 + n8 + 102, n7 + 231, 0xFFFF00, false, 3);
            this.li.a("No weapons", 102 + (8 + n8), 35 + (n7 + 215), 0xFFFF00, false, 3);
            this.li.e(n8 + 93, 11, 215 + (n7 + 6), arg0 + 27745, 11, 0xFFFF00);
            if (this.fd) {
                this.li.a(n8 + 95, (byte)-109, 0xFFFF00, 8 + (215 + n7), 7, 7);
            }
            this.li.e(93 + n8, 11, 25 + (n7 + 215), 27785, 11, 0xFFFF00);
            if (this.Yi) {
                this.li.a(n8 + 95, (byte)-127, 0xFFFF00, 215 + n7 + 27, 7, 7);
            }
            this.li.e(191 + n8, 11, 6 + (215 + n7), 27785, 11, 0xFFFF00);
            if (this.vd) {
                this.li.a(n8 + 193, (byte)-106, 0xFFFF00, 8 + (n7 + 215), 7, 7);
            }
            this.li.e(n8 + 191, 11, n7 + 215 + 25, arg0 + 27745, 11, 0xFFFF00);
            if (this.ff) {
                this.li.a(193 + n8, (byte)59, 0xFFFF00, 215 + n7 + 27, 7, 7);
            }
            if (!this.ke) {
                this.li.b(-1, 25 + this.tg, n7 + 238, 217 + n8);
            }
            this.li.b(-1, 26 + this.tg, n7 + 238, n8 + 394);
            if (this.ki) {
                this.li.a(n8 + 341, "Other player", 0xFFFFFF, 0, 1, 246 + n7);
                this.li.a(341 + n8, "has accepted", 0xFFFFFF, 0, 1, 256 + n7);
            }
            if (this.ke) {
                this.li.a(35 + (217 + n8), "Waiting for", 0xFFFFFF, 0, 1, n7 + 246);
                this.li.a(252 + n8, "other player", 0xFFFFFF, 0, 1, 256 + n7);
            }
            for (n4 = 0; n4 < this.lc; ++n4) {
                n3 = 217 - (-n8 - n4 % 5 * 49);
                n2 = n7 + 31 - -(34 * (n4 / 5));
                this.li.a(n2, h.c[this.vf[n4]], 0, false, 0, this.sg + ua.Bb[this.vf[n4]], 32, 48, n3, 1);
                if (fa.e[this.vf[n4]] != 0) continue;
                this.li.a("" + this.xe[n4], n3 + 1, 10 + n2, 0xFFFF00, false, 1);
            }
            for (n4 = 0; n4 < this.Ke; ++n4) {
                n3 = n8 + (9 + n4 % 4 * 49);
                n2 = n7 + 31 + n4 / 4 * 34;
                this.li.a(n2, h.c[this.Uf[n4]], 0, false, 0, this.sg - -ua.Bb[this.Uf[n4]], 32, 48, n3, arg0 - 39);
                if (fa.e[this.Uf[n4]] == 0) {
                    this.li.a("" + this.df[n4], 1 + n3, 10 + n2, 0xFFFF00, false, 1);
                }
                if (n3 >= this.I || 48 + n3 <= this.I || this.xb <= n2 || 32 + n2 <= this.xb) continue;
                this.li.a(ac.x[this.Uf[n4]] + ": @whi@" + ga.b[this.Uf[n4]], 8 + n8, n7 + 273, 0xFFFF00, false, 1);
            }
            for (n4 = 0; n4 < this.wj; ++n4) {
                n3 = n4 % 4 * 49 + (9 + n8);
                n2 = n4 / 4 * 34 + 124 + n7;
                this.li.a(n2, h.c[this.zc[n4]], 0, false, 0, ua.Bb[this.zc[n4]] + this.sg, 32, 48, n3, arg0 ^ 0x29);
                if (fa.e[this.zc[n4]] == 0) {
                    this.li.a("" + this.of[n4], 1 + n3, 10 + n2, 0xFFFF00, false, 1);
                }
                if (n3 >= this.I || 48 + n3 <= this.I || this.xb <= n2 || n2 + 32 <= this.xb) continue;
                this.li.a(ac.x[this.zc[n4]] + ": @whi@" + ga.b[this.zc[n4]], n8 + 8, 273 + n7, 0xFFFF00, false, 1);
            }
            if (!this.Je) break block72;
            this.He.a(this.Uk, this.ad, this.xb, (byte)-12, this.I);
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        block25: {
            int n2;
            int n3;
            ta ta2 = this.Tb[arg5];
            int n4 = 7 & ta2.y - -((this.ug + 16) / 32);
            boolean bl = false;
            int n5 = n4;
            if (n5 != 5) {
                if (n5 != 6) {
                    if (n5 == 7) {
                        bl = true;
                        n5 = 1;
                    }
                } else {
                    bl = true;
                    n5 = 2;
                }
            } else {
                bl = true;
                n5 = 3;
            }
            int n6 = this.sf[ta2.x / ob.h[ta2.t] % 4] + n5 * 3;
            if (ta2.y == 8) {
                bl = false;
                n5 = 5;
                arg7 -= arg4 * db.j[ta2.t] / 100;
                n4 = 2;
                n6 = 3 * n5 + this.Pc[this.jk / (na.a[ta2.t] - 1) % 8];
            } else if (ta2.y == 9) {
                n5 = 5;
                n4 = 2;
                bl = true;
                arg7 += db.j[ta2.t] * arg4 / 100;
                n6 = this.Og[this.jk / na.a[ta2.t] % 8] + 3 * n5;
            }
            for (n3 = 0; n3 < 12; ++n3) {
                n2 = this.Tg[n4][n3];
                int n7 = qb.d[ta2.t][n2];
                if (n7 < 0) continue;
                int n8 = 0;
                int n9 = 0;
                int n10 = n6;
                if (bl && n5 >= 1 && n5 <= 3 && aa.c[n7] == 1) {
                    n10 += 15;
                }
                if (n5 == 5 && nb.d[n7] != 1) continue;
                int n11 = n10 - -w.g[n7];
                int n12 = this.li.Eb[n11];
                int n13 = this.li.qb[n11];
                int n14 = this.li.Eb[w.g[n7]];
                if (n12 == 0 || n13 == 0 || n14 == 0) continue;
                n9 = arg3 * n9 / n13;
                n8 = n8 * arg6 / n12;
                int n15 = arg6 * this.li.Eb[n11] / n14;
                n8 -= (-arg6 + n15) / 2;
                int n16 = db.l[n7];
                int n17 = 0;
                if (n16 == 1) {
                    n17 = v.e[ta2.t];
                    n16 = da.T[ta2.t];
                } else if (n16 != 2) {
                    if (n16 == 3) {
                        n17 = v.e[ta2.t];
                        n16 = ua.Ab[ta2.t];
                    }
                } else {
                    n16 = m.g[ta2.t];
                    n17 = v.e[ta2.t];
                }
                this.li.a(n9 + arg0, n16, n17, bl, arg1, n11, arg3, n15, n8 + arg7, 1);
            }
            if (ta2.I > 0) {
                this.nf[this.Ef] = this.li.a(1, 120, ta2.n) / 2;
                if (this.nf[this.Ef] > 150) {
                    this.nf[this.Ef] = 150;
                }
                this.uf[this.Ef] = this.li.a(1, 102, ta2.n) / 300 * this.li.a(508305352, 1);
                this.tf[this.Ef] = arg6 / 2 + arg7;
                this.ee[this.Ef] = arg0;
                this.Kc[this.Ef++] = ta2.n;
            }
            if (ta2.y != 8 && ta2.y != 9 && ta2.d == 0) break block25;
            if (ta2.d > 0) {
                n3 = arg7;
                if (ta2.y != 8) {
                    if (ta2.y == 9) {
                        n3 += arg4 * 20 / 100;
                    }
                } else {
                    n3 -= arg4 * 20 / 100;
                }
                n2 = ta2.B * 30 / ta2.G;
                this.gd[this.Bc] = arg6 / 2 + n3;
                this.Pk[this.Bc] = arg0;
                this.bf[this.Bc++] = n2;
            }
            if (ta2.d > 150) {
                n3 = arg7;
                if (ta2.y != 8) {
                    if (ta2.y == 9) {
                        n3 += arg4 * 10 / 100;
                    }
                } else {
                    n3 -= arg4 * 10 / 100;
                }
                this.li.b(-1, this.tg + 12, arg0 + arg3 / 2 - 12, n3 - (-(arg6 / 2) + 12));
                this.li.a(arg6 / 2 - 1 + n3, "" + ta2.u, 0xFFFFFF, 0, 3, 5 + arg0 + arg3 / 2);
            }
        }
    }

    private final void t(int arg0) {
        this.Af = new qa(this.li, 100);
        this.Af.a(true, (byte)-125, 4, 256, "Please design Your Character", 10);
        int n2 = 140;
        int n3 = 34;
        this.Af.a(true, (byte)-104, 3, (n2 += 116) - 55, "Front", (n3 -= 10) + 110);
        this.Af.a(true, (byte)-91, 3, n2, "Side", n3 + 110);
        this.Af.a(true, (byte)-117, 3, n2 + 55, "Back", 110 + n3);
        int n4 = 54;
        this.Af.a(41, -n4 + n2, 53, 26531, n3 += 145);
        this.Af.a(true, (byte)-81, 1, -n4 + n2, "Head", n3 - 8);
        this.Af.a(true, (byte)-125, 1, -n4 + n2, "Type", n3 + 8);
        this.Af.c(u.g + 7, n3, -n4 + n2 - 40, -114);
        this.Dj = this.Af.d(-n4 - 40 + n2, 20, n3, arg0 + 24525, 20);
        this.Af.c(6 + u.g, n3, n2 + -n4 + 40, -59);
        this.pi = this.Af.d(n2 + (-n4 + 40), 20, n3, arg0 ^ 0x6049, 20);
        this.Af.a(41, n2 - -n4, 53, 26531, n3);
        this.Af.a(true, (byte)-85, 1, n2 - -n4, "Hair", n3 - 8);
        this.Af.a(true, (byte)-102, 1, n4 + n2, "Color", 8 + n3);
        this.Af.c(7 + u.g, n3, n4 + (n2 - 40), -57);
        this.Kj = this.Af.d(n2 - -n4 - 40, 20, n3, 64, 20);
        this.Af.c(6 + u.g, n3, 40 + n4 + n2, -127);
        this.ed = this.Af.d(40 + n4 + n2, 20, n3, arg0 ^ 0xFFFF9FB6, 20);
        this.Af.a(41, -n4 + n2, 53, 26531, n3 += 50);
        this.Af.a(true, (byte)-102, 1, -n4 + n2, "Gender", n3);
        this.Af.c(u.g + 7, n3, n2 + -n4 - 40, arg0 + 24525);
        this.Ge = this.Af.d(-n4 + (n2 - 40), 20, n3, -81, 20);
        this.Af.c(u.g + 6, n3, 40 + -n4 + n2, arg0 + 24521);
        this.Of = this.Af.d(40 + (-n4 + n2), 20, n3, 54, 20);
        this.Af.a(41, n4 + n2, 53, arg0 ^ 0xFFFFF84E, n3);
        this.Af.a(true, (byte)-102, 1, n4 + n2, "Top", n3 - 8);
        this.Af.a(true, (byte)-79, 1, n4 + n2, "Color", 8 + n3);
        this.Af.c(7 + u.g, n3, n2 + (n4 - 40), -104);
        this.Xc = this.Af.d(n4 + (n2 - 40), 20, n3, arg0 + 24504, 20);
        this.Af.c(6 + u.g, n3, 40 + n4 + n2, -105);
        this.ek = this.Af.d(n2 - (-n4 - 40), 20, n3, -91, 20);
        n3 += 50;
        if (arg0 != -24595) {
            this.y(-127);
        }
        this.Af.a(41, -n4 + n2, 53, arg0 ^ 0xFFFFF84E, n3);
        this.Af.a(true, (byte)-81, 1, -n4 + n2, "Skin", n3 - 8);
        this.Af.a(true, (byte)-109, 1, n2 - n4, "Color", n3 + 8);
        this.Af.c(7 + u.g, n3, n2 - 40 - n4, -59);
        this.Ze = this.Af.d(n2 + -n4 - 40, 20, n3, arg0 + 24468, 20);
        this.Af.c(u.g + 6, n3, -n4 + n2 + 40, -95);
        this.Mj = this.Af.d(n2 + (-n4 + 40), 20, n3, arg0 + 24637, 20);
        this.Af.a(41, n4 + n2, 53, 26531, n3);
        this.Af.a(true, (byte)-108, 1, n4 + n2, "Bottom", n3 - 8);
        this.Af.a(true, (byte)-108, 1, n4 + n2, "Color", n3 + 8);
        this.Af.c(u.g + 7, n3, n4 - 40 + n2, -90);
        this.Re = this.Af.d(n2 - (-n4 + 40), 20, n3, 69, 20);
        this.Af.c(6 + u.g, n3, n2 + (n4 + 40), arg0 + 24537);
        this.Ai = this.Af.d(40 + (n4 + n2), 20, n3, -119, 20);
        n3 += 82;
        this.Af.c(arg0 ^ 0x6055, 200, 30, n2, n3 -= 35);
        this.Af.a(false, (byte)-74, 4, n2, "Accept", n3);
        this.Eg = this.Af.d(n2, 200, n3, arg0 ^ 0xFFFF9FC9, 30);
    }

    private final void K(int arg0) {
        block6: {
            int n2;
            long l2 = p.a(0);
            if (this.Jh.a((byte)34)) {
                this.Wi = l2;
            }
            if (-5001L > (l2 + -this.Wi ^ 0xFFFFFFFFFFFFFFFFL)) {
                this.Wi = l2;
                this.Jh.b(67, 0);
                this.Jh.b(21294);
            }
            try {
                this.Jh.a(20, true);
            }
            catch (IOException iOException) {
                this.u(123);
                return;
            }
            if (!this.f((byte)-125)) {
                return;
            }
            if (arg0 != -26345) {
                this.a(-91, 67, (byte)-90);
            }
            if ((n2 = this.Jh.a(arg0 + 26345, this.mg)) <= 0) break block6;
            this.a(arg0 ^ 0xFFFF9940, n2, this.mg.a((byte)104));
        }
    }

    private final void c(int arg0, byte arg1, int arg2) {
        int n2;
        int n3;
        int n4 = this.Qf[arg2];
        int n5 = n3 = arg0 < 0 ? this.Tk : arg0;
        if (fa.e[n4] != 0) {
            n2 = 0;
            for (int i2 = 0; i2 < this.mf && n2 < n3; ++i2) {
                if (this.Qf[i2] != n4) continue;
                ++n2;
                --this.mf;
                for (int i3 = i2; i3 < this.mf; ++i3) {
                    this.Qf[i3] = this.Qf[i3 + 1];
                    this.jj[i3] = this.jj[i3 + 1];
                }
                --i2;
            }
        } else {
            int n6 = arg2;
            this.jj[n6] = this.jj[n6] - n3;
            if (this.jj[arg2] <= 0) {
                --this.mf;
                for (n2 = arg2; this.mf > n2; ++n2) {
                    this.Qf[n2] = this.Qf[1 + n2];
                    this.jj[n2] = this.jj[n2 + 1];
                }
            }
        }
        this.Jh.b(46, 0);
        if (arg1 <= 120) {
            return;
        }
        this.Jh.f.c(this.mf, 39);
        for (n2 = 0; n2 < this.mf; ++n2) {
            this.Jh.f.e(393, this.Qf[n2]);
            this.Jh.f.b(-422797528, this.jj[n2]);
        }
        this.Jh.b(21294);
        this.Mi = false;
        this.md = false;
    }

    private final void A(int arg0) {
        this.li.b(-1, this.tg + 23, this.Oi - 4, 0);
        if (arg0 != 5) {
            return;
        }
        int n2 = o.a(200, 9570, 255, 200);
        if (this.Zh == 0) {
            n2 = o.a(255, 9570, 50, 200);
        }
        if (this.Ee % 30 > 15) {
            n2 = o.a(255, 9570, 50, 50);
        }
        this.li.a(54, "All messages", n2, 0, 0, 6 + this.Oi);
        n2 = o.a(200, 9570, 255, 200);
        if (this.Zh == 1) {
            n2 = o.a(255, arg0 + 9565, 50, 200);
        }
        if (this.Qe % 30 > 15) {
            n2 = o.a(255, arg0 ^ 0x2567, 50, 50);
        }
        this.li.a(155, "Chat history", n2, 0, 0, this.Oi + 6);
        n2 = o.a(200, 9570, 255, 200);
        if (this.Zh == 2) {
            n2 = o.a(255, 9570, 50, 200);
        }
        if (this.Vj % 30 > 15) {
            n2 = o.a(255, arg0 + 9565, 50, 50);
        }
        this.li.a(255, "Quest history", n2, 0, 0, 6 + this.Oi);
        n2 = o.a(200, 9570, 255, 200);
        if (this.Zh == 3) {
            n2 = o.a(255, 9570, 50, 200);
        }
        if (this.Mh % 30 > 15) {
            n2 = o.a(255, arg0 ^ 0x2567, 50, 50);
        }
        this.li.a(355, "Private history", n2, 0, 0, this.Oi + 6);
        this.li.a(457, "Report abuse", 0xFFFFFF, 0, 0, 6 + this.Oi);
    }

    private final boolean b(byte arg0, int arg1) {
        int n2 = this.wi.i / 128;
        int n3 = this.wi.K / 128;
        for (int i2 = 2; i2 >= 1; --i2) {
            if (arg1 == 1 && ((0x80 & this.Hh.bb[n2][-i2 + n3]) == 128 || (0x80 & this.Hh.bb[n2 + -i2][n3]) == 128 || (this.Hh.bb[-i2 + n2][n3 - i2] & 0x80) == 128)) {
                return false;
            }
            if (arg1 == 3 && ((0x80 & this.Hh.bb[n2][i2 + n3]) == 128 || (this.Hh.bb[n2 + -i2][n3] & 0x80) == 128 || (0x80 & this.Hh.bb[-i2 + n2][i2 + n3]) == 128)) {
                return false;
            }
            if (arg1 == 5 && ((this.Hh.bb[n2][n3 + i2] & 0x80) == 128 || (this.Hh.bb[i2 + n2][n3] & 0x80) == 128 || (this.Hh.bb[n2 + i2][n3 + i2] & 0x80) == 128)) {
                return false;
            }
            if (arg1 == 7 && ((this.Hh.bb[n2][n3 + -i2] & 0x80) == 128 || (0x80 & this.Hh.bb[i2 + n2][n3]) == 128 || (0x80 & this.Hh.bb[i2 + n2][-i2 + n3]) == 128)) {
                return false;
            }
            if (arg1 == 0 && (this.Hh.bb[n2][n3 + -i2] & 0x80) == 128) {
                return false;
            }
            if (arg1 == 2 && (this.Hh.bb[n2 + -i2][n3] & 0x80) == 128) {
                return false;
            }
            if (arg1 == 4 && (0x80 & this.Hh.bb[n2][i2 + n3]) == 128) {
                return false;
            }
            if (arg1 != 6 || (this.Hh.bb[n2 + i2][n3] & 0x80) != 128) continue;
            return false;
        }
        return true;
    }

    private final void b(int arg0, boolean arg1) {
        block35: {
            int n2;
            int n3 = this.li.u - 199;
            this.li.b(-1, this.tg + 6, 3, n3 - 49);
            int n4 = 36;
            int n5 = 196;
            this.li.c(160, n3, 65, arg0 ^ 0xF, 36, n5, o.a(181, arg0 + 9555, 181, 181));
            this.li.c(160, n3, 65, 0, 101, n5, o.a(201, arg0 ^ 0x256D, 201, 201));
            this.li.c(160, n3, 95, 0, 166, n5, o.a(181, 9570, 181, 181));
            this.li.c(160, n3, this.Kd ? 55 : 40, 0, 261, n5, o.a(201, 9570, 201, 201));
            int n6 = 3 + n3;
            int n7 = n4 + 15;
            this.li.a("Game options - click to toggle", n6, n7, 0, false, 1);
            n7 += 15;
            if (this.Kh) {
                this.li.a("Camera angle mode - @gre@Auto", n6, n7, 0xFFFFFF, false, 1);
            } else {
                this.li.a("Camera angle mode - @red@Manual", n6, n7, 0xFFFFFF, false, 1);
            }
            n7 += 15;
            if (this.Yh) {
                this.li.a("Mouse buttons - @red@One", n6, n7, 0xFFFFFF, false, 1);
            } else {
                this.li.a("Mouse buttons - @gre@Two", n6, n7, 0xFFFFFF, false, 1);
            }
            n7 += 15;
            if (this.Pg) {
                if (this.ne) {
                    this.li.a("Sound effects - @red@off", n6, n7, 0xFFFFFF, false, 1);
                } else {
                    this.li.a("Sound effects - @gre@on", n6, n7, 0xFFFFFF, false, 1);
                }
            }
            this.li.a("To change your contact details,", n6, n7 += arg0, 0xFFFFFF, false, 0);
            this.li.a("password, recovery questions, etc..", n6, n7 += 15, 0xFFFFFF, false, 0);
            this.li.a("please select 'account management'", n6, n7 += 15, 0xFFFFFF, false, 0);
            n7 += 15;
            if (this.Yd != 0) {
                if (this.Yd != 1) {
                    this.li.a("from the runescape front webpage", n6, n7, 0xFFFFFF, false, 0);
                } else {
                    this.li.a("from the link below the gamewindow", n6, n7, 0xFFFFFF, false, 0);
                }
            } else {
                this.li.a("from the runescape.com front page", n6, n7, 0xFFFFFF, false, 0);
            }
            n7 += 15;
            this.li.a("Privacy settings. Will be applied to", 3 + n3, n7 += 5, 0, false, 1);
            this.li.a("all people not on your friends list", n3 + 3, n7 += 15, 0, false, 1);
            n7 += 15;
            if (this.De != 0) {
                this.li.a("Block chat messages: @gre@<on>", 3 + n3, n7, 0xFFFFFF, false, 1);
            } else {
                this.li.a("Block chat messages: @red@<off>", 3 + n3, n7, 0xFFFFFF, false, 1);
            }
            n7 += 15;
            if (this.dc == 0) {
                this.li.a("Block private messages: @red@<off>", 3 + n3, n7, 0xFFFFFF, false, 1);
            } else {
                this.li.a("Block private messages: @gre@<on>", n3 + 3, n7, 0xFFFFFF, false, 1);
            }
            n7 += 15;
            if (this.Vg != 0) {
                this.li.a("Block trade requests: @gre@<on>", n3 + 3, n7, 0xFFFFFF, false, 1);
            } else {
                this.li.a("Block trade requests: @red@<off>", 3 + n3, n7, 0xFFFFFF, false, 1);
            }
            n7 += 15;
            if (this.Pg) {
                if (this.ui != 0) {
                    this.li.a("Block duel requests: @gre@<on>", n3 + 3, n7, 0xFFFFFF, false, 1);
                } else {
                    this.li.a("Block duel requests: @red@<off>", 3 + n3, n7, 0xFFFFFF, false, 1);
                }
            }
            n7 += 15;
            if (this.Kd) {
                n2 = 0xFFFFFF;
                if (this.I > n6 && n6 - -n5 > this.I && this.xb > (n7 += 5) - 12 && this.xb < 4 + n7) {
                    n2 = 0xFFFF00;
                }
                this.li.a("Skip the tutorial", n6, n7, n2, false, 1);
                n7 += 15;
            }
            this.li.a("Always logout when you finish", n6, n7 += 5, 0, false, 1);
            n2 = 0xFFFFFF;
            if (this.I > n6 && this.I < n6 - -n5 && this.xb > (n7 += 15) - 12 && 4 + n7 > this.xb) {
                n2 = 0xFFFF00;
            }
            this.li.a("Click here to logout", n3 + 3, n7, n2, false, 1);
            if (!arg1) {
                return;
            }
            n3 = 199 - this.li.u + this.I;
            n4 = this.xb - 36;
            if (n3 < 0 || n4 < 0 || n3 >= 196 || n4 >= 265) break block35;
            int n8 = this.li.u - 199;
            n6 = n8 + 3;
            int n9 = 36;
            n5 = 196;
            n7 = 30 + n9;
            if (n6 < this.I && this.I < n6 - -n5 && this.xb > n7 - 12 && n7 + 4 > this.xb && this.Cf == 1) {
                this.Kh = !this.Kh;
                this.Jh.b(111, 0);
                this.Jh.f.c(0, 41);
                this.Jh.f.c(this.Kh ? 1 : 0, -107);
                this.Jh.b(21294);
            }
            if (n6 < this.I && n6 - -n5 > this.I && this.xb > (n7 += 15) - 12 && 4 + n7 > this.xb && this.Cf == 1) {
                this.Yh = !this.Yh;
                this.Jh.b(111, arg0 - 15);
                this.Jh.f.c(2, arg0 ^ 0x55);
                this.Jh.f.c(this.Yh ? 1 : 0, -82);
                this.Jh.b(arg0 ^ 0x5321);
            }
            if (this.Pg && n6 < this.I && this.I < n6 - -n5 && (n7 += 15) - 12 < this.xb && this.xb < n7 + 4 && this.Cf == 1) {
                this.ne = !this.ne;
                this.Jh.b(111, 0);
                this.Jh.f.c(3, arg0 - 136);
                this.Jh.f.c(this.ne ? 1 : 0, -42);
                this.Jh.b(21294);
            }
            n7 += 15;
            n7 += 15;
            n7 += 15;
            n7 += 15;
            n7 += 15;
            boolean bl = false;
            if (this.I > n6 && n5 + n6 > this.I && (n7 += 35) - 12 < this.xb && this.xb < 4 + n7 && this.Cf == 1) {
                this.De = -this.De + 1;
                bl = true;
            }
            if (n6 < this.I && n5 + n6 > this.I && (n7 += 15) - 12 < this.xb && this.xb < n7 + 4 && this.Cf == 1) {
                this.dc = 1 - this.dc;
                bl = true;
            }
            if (n6 < this.I && n6 + n5 > this.I && this.xb > (n7 += 15) - 12 && this.xb < 4 + n7 && this.Cf == 1) {
                this.Vg = 1 - this.Vg;
                bl = true;
            }
            if (this.Pg && n6 < this.I && n6 - -n5 > this.I && this.xb > (n7 += 15) - 12 && n7 + 4 > this.xb && this.Cf == 1) {
                bl = true;
                this.ui = -this.ui + 1;
            }
            n7 += 15;
            if (bl) {
                this.c(this.Vg, this.dc, this.De, arg0 + 64, this.ui);
            }
            if (this.Kd) {
                if (n6 < this.I && this.I < n5 + n6 && this.xb > (n7 += 5) - 12 && this.xb < n7 + 4 && this.Cf == 1) {
                    this.a(o.g, arg0 - 3, 9, false);
                    this.qc = 0;
                }
                n7 += 15;
            }
            if (this.I > n6 && this.I < n5 + n6 && (n7 += 20) - 12 < this.xb && n7 + 4 > this.xb && this.Cf == 1) {
                this.B(0);
            }
            this.Cf = 0;
        }
    }

    private final void d(boolean arg0) {
        block11: {
            if (this.Cb.length() > 0) {
                this.ec = this.Cb.trim();
                this.Yb = 0;
                this.Vf = 2;
                return;
            }
            int n2 = 0;
            if (this.Ce < 2 && this.Oj < 7) {
                if (this.Oj >= 5) {
                    n2 = 1;
                }
            } else {
                n2 = 2;
            }
            int n3 = this.li.a(508305352, 1);
            int n4 = this.li.a(508305352, 4);
            int n5 = 400;
            int n6 = (n2 > 0 ? 5 + n3 : 0) + 70;
            int n7 = 256 - n5 / 2;
            int n8 = 180 - n6 / 2;
            this.li.a(n7, (byte)88, 0, n8, n6, n5);
            this.li.e(n7, n5, n8, 27785, n6, 0xFFFFFF);
            this.li.a(256, "Enter the name of the player you wish to report:", 0xFFFF00, 0, 1, 5 + n8 + n3);
            int n9 = n3 + 2;
            this.li.a(256, this.e + "*", 0xFFFFFF, 0, 4, n4 + (n8 + 5) + (n9 + 3));
            int n10 = n3 + n4 + (8 + n8 - -n9 + 2);
            int n11 = 0xFFFFFF;
            if (n2 > 0) {
                String string = this.ue ? "[X]" : "[ ]";
                string = n2 > 1 ? string + " Mute player" : string + " Suggest mute";
                int n12 = this.li.a(1, 72, string);
                if (this.I > 256 - n12 / 2 && n12 / 2 + 256 > this.I && n10 + -n3 < this.xb && this.xb < n10) {
                    if (this.Cf != 0) {
                        this.ue = !this.ue;
                        this.Cf = 0;
                    }
                    n11 = 0xFFFF00;
                }
                this.li.a(256, string, n11, 0, 1, n10);
                n10 += 10 + n3;
            }
            n11 = 0xFFFFFF;
            if (this.I > 210 && this.I < 228 && this.xb > -n3 + n10 && this.xb < n10) {
                if (this.Cf != 0) {
                    this.Cb = this.e;
                    this.Cf = 0;
                }
                n11 = 0xFFFF00;
            }
            this.li.a("OK", 210, n10, n11, arg0, 1);
            n11 = 0xFFFFFF;
            if (this.I > 264 && this.I < 304 && this.xb > n10 + -n3 && n10 > this.xb) {
                n11 = 0xFFFF00;
                if (this.Cf != 0) {
                    this.Cf = 0;
                    this.Vf = 0;
                }
            }
            this.li.a("Cancel", 264, n10, n11, arg0, 1);
            if (this.Cf != 1 || n7 <= this.I && n7 + n5 >= this.I && n8 <= this.xb && n8 + n6 >= this.xb) break block11;
            this.Vf = 0;
            this.Cf = 0;
        }
    }

    public client() {
        this.pf = new int[8000];
        this.uj = new int[8192];
        this.Zg = new ta[500];
        this.rg = new ta[500];
        this.We = new ta[4000];
        this.Rg = new int[8000];
        this.wi = new ta();
        this.bg = new int[1500];
        this.ci = new int[256];
        this.Rj = new int[256];
        this.ei = new int[]{0xFF0000, 0xFF8000, 0xFFE000, 0xA0E000, 57344, 32768, 41088, 45311, 33023, 12528, 0xE000E0, 0x303030, 0x604000, 0x805000, 0xFFFFFF};
        this.Zf = new int[5000];
        this.oe = new int[50];
        this.Uf = new int[8];
        this.ae = new int[256];
        this.zj = new int[14];
        this.tf = new int[50];
        this.Dg = new int[]{16760880, 16752704, 8409136, 6307872, 0x303030, 16736288, 0xFF4000, 0xFFFFFF, 65280, 65535};
        this.oh = new int[18];
        this.Wh = new int[]{15523536, 13415270, 11766848, 10056486, 9461792};
        this.kh = new ca[1000];
        this.Xe = new int[256];
        this.Og = new int[]{0, 0, 0, 0, 0, 1, 2, 1};
        this.Vb = new int[14];
        this.Tg = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
        this.jd = new int[50];
        this.ti = new int[99];
        this.Ng = new int[500];
        this.Me = new int[14];
        this.nf = new int[50];
        this.th = new int[8];
        this.Vk = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
        this.bf = new int[50];
        this.Sc = new int[50];
        this.cg = new int[18];
        this.ee = new int[50];
        this.gi = new int[50];
        this.te = new ta[5000];
        this.Pc = new int[]{0, 1, 2, 1, 0, 0, 0, 0};
        this.hg = new ca[1500];
        this.sf = new int[]{0, 1, 2, 1};
        this.Ej = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
        this.vi = new int[256];
        this.di = new int[256];
        this.rd = new ca[500];
        this.pe = new int[50];
        this.Ni = new int[5000];
        this.Le = new int[5000];
        this.Fc = new int[5];
        this.xi = new int[8];
        this.Gj = new int[5000];
        this.je = new int[50];
        this.Qf = new int[14];
        this.Jf = new int[256];
        this.ye = new int[1500];
        this.Oc = new int[50];
        this.Sj = new boolean[500];
        this.Ff = new ta[500];
        this.Ed = new boolean[1500];
        this.bk = new boolean[50];
        this.Te = new String[]{"Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)", "Lost city (members)", "Hero's quest (members)", "Druidic ritual (members)", "Merlin's crystal (members)", "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)", "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)", "Clock tower (members)", "The Holy Grail (members)", "Fight Arena (members)", "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)", "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)", "Jungle potion (members)", "Grand tree (members)", "Shilo village (members)", "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)", "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)", "Gertrude's Cat (members)", "Legend's Quest (members)"};
        this.zc = new int[8];
        this.Bi = new int[14];
        this.Ak = new int[18];
        this.fi = new boolean[50];
        this.uf = new int[50];
        this.Jd = new int[500];
        this.xj = new int[8];
        this.yk = new int[500];
        this.Kc = new String[50];
        this.Hj = new int[500];
        this.gd = new int[50];
        this.xe = new int[35];
        this.Lc = new int[14];
        this.Ld = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
        this.of = new int[8];
        this.df = new int[8];
        this.Pk = new int[50];
        this.jj = new int[14];
        this.kf = new int[8];
        this.Aj = new int[35];
        this.vc = new int[1500];
        this.Se = new int[1500];
        this.Dd = new int[14];
        this.vf = new int[35];
        this.ak = new int[50];
        this.ah = new String[5];
        this.Tb = new ta[500];
    }

    static {
        Fj = new int[200];
        ef = 0;
    }
}

