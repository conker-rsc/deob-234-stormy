/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.awt.FontMetrics;

final class qa {
    private String[][] Ab;
    private int[] N;
    int[] j;
    private int hb = 0;
    private String[] yb;
    private String[][] p;
    private String[][] Fb;
    private int R;
    private int gb = -1;
    static int[] K;
    private int i;
    private int tb;
    private int[] O;
    private int G = 0;
    private int[] kb;
    private ua w;
    private int eb = 0;
    private boolean[] D;
    static byte[] l;
    private int Eb;
    private int[] ob;
    private int ib;
    private int[] B;
    private int F;
    private int[] sb;
    private boolean[] Y;
    private boolean t = true;
    private int f;
    private int zb = 0;
    private int E;
    private int bb = 0;
    private int Hb = 0;
    private int[] k;
    private int C;
    private int[] vb;
    private boolean[] d;
    private boolean[] cb;
    private int J;
    private boolean[] g;
    private int fb;
    private int[] U;
    int[] pb;
    private int[][] m;
    private int qb;

    final void c(byte arg0, int arg1) {
        this.pb[arg1] = 0;
    }

    final int a(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.U[this.eb] = 5;
        this.g[this.eb] = true;
        this.cb[this.eb] = arg2;
        if (arg6 != 14179) {
            return 2;
        }
        this.D[this.eb] = false;
        this.k[this.eb] = arg4;
        this.Y[this.eb] = arg8;
        this.kb[this.eb] = arg3;
        this.B[this.eb] = arg5;
        this.ob[this.eb] = arg7;
        this.O[this.eb] = arg1;
        this.sb[this.eb] = arg0;
        this.yb[this.eb] = "";
        return this.eb++;
    }

    private final int a(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -70) {
            this.kb = null;
        }
        return o.a(ua.C * arg2 / 114, 9570, ta.g * arg0 / 176, arg1 * aa.d / 114);
    }

    final int d(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.U[this.eb] = 10;
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.kb[this.eb] = -(arg1 / 2) + arg0;
        this.B[this.eb] = -(arg4 / 2) + arg2;
        this.ob[this.eb] = arg1;
        this.O[this.eb] = arg4;
        return this.eb++;
    }

    final void a(byte arg0) {
        if (arg0 > 0) {
            this.R = -121;
        }
        for (int i2 = 0; i2 < this.eb; ++i2) {
            if (!this.g[i2]) continue;
            if (this.U[i2] != 0) {
                if (this.U[i2] == 1) {
                    this.a(this.yb[i2], this.B[i2], (byte)117, this.k[i2], this.kb[i2] - this.w.a(this.k[i2], 108, this.yb[i2]) / 2, i2, 0);
                    continue;
                }
                if (this.U[i2] == 2) {
                    this.a(this.ob[i2], (byte)69, this.O[i2], this.kb[i2], this.B[i2]);
                    continue;
                }
                if (this.U[i2] != 3) {
                    if (this.U[i2] != 4) {
                        if (this.U[i2] == 5 || this.U[i2] == 6) {
                            this.a(this.k[i2], this.yb[i2], this.ob[i2], this.O[i2], true, this.kb[i2], this.B[i2], i2);
                            continue;
                        }
                        if (this.U[i2] != 7) {
                            if (this.U[i2] == 8) {
                                this.a(this.Ab[i2], i2, -121, this.k[i2], this.kb[i2], this.B[i2]);
                                continue;
                            }
                            if (this.U[i2] == 9) {
                                this.a(this.O[i2], this.kb[i2], i2, this.Ab[i2], this.pb[i2], this.k[i2], this.B[i2], this.m[i2], 0, this.j[i2], this.ob[i2]);
                                continue;
                            }
                            if (this.U[i2] != 11) {
                                if (this.U[i2] != 12) {
                                    if (this.U[i2] != 14) continue;
                                    this.a((byte)52, this.kb[i2], this.O[i2], this.B[i2], this.ob[i2], i2);
                                    continue;
                                }
                                this.b(-82, this.B[i2], this.kb[i2], this.k[i2]);
                                continue;
                            }
                            this.a(this.B[i2], this.ob[i2], true, this.kb[i2], this.O[i2]);
                            continue;
                        }
                        this.a(this.kb[i2], this.k[i2], (byte)-73, this.Ab[i2], i2, this.B[i2]);
                        continue;
                    }
                    this.a(this.m[i2], this.j[i2], i2, this.kb[i2], this.B[i2], this.ob[i2], this.O[i2], this.pb[i2], this.Ab[i2], this.k[i2], false);
                    continue;
                }
                this.a(this.B[i2], 0, this.kb[i2], this.ob[i2]);
                continue;
            }
            this.a(this.yb[i2], this.B[i2], (byte)-65, this.k[i2], this.kb[i2], i2, 0);
        }
        this.zb = 0;
    }

    final int a(boolean arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        this.U[this.eb] = 1;
        if (arg1 >= -71) {
            this.a(-106, null, 31, 96, (String)null, null, 36);
        }
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.k[this.eb] = arg2;
        this.Y[this.eb] = arg0;
        this.kb[this.eb] = arg3;
        this.B[this.eb] = arg5;
        this.yb[this.eb] = arg4;
        return this.eb++;
    }

    final int a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.U[this.eb] = 4;
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.kb[this.eb] = arg2;
        this.B[this.eb] = arg4;
        this.ob[this.eb] = arg0;
        this.O[this.eb] = arg1;
        this.Y[this.eb] = arg7;
        this.k[this.eb] = arg5;
        this.sb[this.eb] = arg3;
        this.pb[this.eb] = 0;
        this.j[this.eb] = 0;
        this.Ab[this.eb] = new String[arg3];
        if (arg6 != 63) {
            this.a(39, 117, 98, -16);
        }
        this.m[this.eb] = new int[arg3];
        this.Fb[this.eb] = new String[arg3];
        this.p[this.eb] = new String[arg3];
        return this.eb++;
    }

    final String a(int arg0, int arg1, int arg2) {
        if (arg1 >= -90) {
            this.d = null;
        }
        return this.p[arg2][arg0];
    }

    final void e(int arg0, int arg1) {
        if (arg1 != 14) {
            this.d(-43, 43, 111, -105, -59);
        }
        this.j[arg0] = 0;
        this.N[arg0] = -1;
    }

    private final void a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String[] arg8, int arg9, boolean arg10) {
        int n2;
        int n3;
        int n4;
        int n5 = arg6 / this.w.a(508305352, arg9);
        if (arg1 > -n5 + arg7) {
            arg1 = arg7 - n5;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg10) {
            this.a(null, -61, -120, -114, 65, -8);
        }
        this.j[arg2] = arg1;
        if (arg7 > n5) {
            n4 = arg5 - 12 + arg3;
            n3 = n5 * (arg6 - 27) / arg7;
            if (n3 < 6) {
                n3 = 6;
            }
            n2 = (-n3 - 27 + arg6) * arg1 / (-n5 + arg7);
            if (this.Hb == 1 && this.bb >= n4 && 12 + n4 >= this.bb) {
                if (this.hb > arg4 && this.hb < arg4 + 12 && arg1 > 0) {
                    --arg1;
                }
                if (arg6 + arg4 - 12 >= this.hb || this.hb >= arg6 + arg4 || arg1 < arg7 - n5) {
                    // empty if block
                }
                this.j[arg2] = ++arg1;
            }
            if (!(this.Hb == 1 && (n4 <= this.bb && n4 + 12 >= this.bb || this.bb >= n4 - 12 && this.bb <= 24 + n4 && this.d[arg2]))) {
                this.d[arg2] = false;
            } else if (this.hb > 12 + arg4 && arg4 - -arg6 - 12 > this.hb) {
                this.d[arg2] = true;
                int n6 = -(n3 / 2) + this.hb - arg4 - 12;
                arg1 = n6 * arg7 / (arg6 - 24);
                if (-n5 + arg7 < arg1) {
                    arg1 = arg7 + -n5;
                }
                if (arg1 < 0) {
                    arg1 = 0;
                }
                this.j[arg2] = arg1;
            }
            n2 = arg1 * (-n3 + (arg6 - 27)) / (arg7 + -n5);
            this.a(n3, n2, arg3, arg5, arg6, arg4, (byte)113);
        }
        n4 = -(this.w.a(508305352, arg9) * n5) + arg6;
        n3 = arg4 + (5 * this.w.a(508305352, arg9) / 6 + n4 / 2);
        for (n2 = arg1; arg7 > n2; ++n2) {
            if (this.zb != 0 && 2 + arg3 <= this.bb && this.bb <= this.w.a(arg9, 97, arg8[n2]) + arg3 + 2 && n3 >= this.hb - 2 && this.hb - 2 > -this.w.a(508305352, arg9) + n3) {
                this.D[arg2] = true;
                this.vb[arg2] = d.a(this.zb << 16, n2);
            }
            this.a(arg9, arg2, true, arg0[n2], 2 + arg3, n3, arg8[n2]);
            if ((n3 += this.w.a(508305352, arg9) + -ia.i) >= arg4 - -arg6) break;
        }
    }

    private final void a(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6) {
        if (!arg2) {
            this.a(-3, 44, (byte)37, null, -78, 86);
        }
        int n2 = !this.Y[arg1] ? 0 : 0xFFFFFF;
        this.w.a(arg3, arg5, arg6, arg4, n2, (byte)-54, arg0);
    }

    final void a(int arg0, String arg1, int arg2) {
        if (arg2 != 27642) {
            return;
        }
        this.yb[arg0] = arg1;
    }

    private final void a(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.w.a(arg1, (byte)100, 0xFFFFFF, arg3, arg2, arg4);
        if (arg0 != 52) {
            return;
        }
        this.w.b(arg4, this.tb, arg1, arg3, (byte)-116);
        this.w.b(arg1, arg3, this.tb, arg2, 0);
        this.w.b(arg4, this.J, arg1, arg2 + arg3 - 1, (byte)-124);
        this.w.b(arg4 + arg1 - 1, arg3, this.J, arg2, arg0 ^ 0x34);
        if (this.vb[arg5] == 1) {
            for (int i2 = 0; arg2 > i2; ++i2) {
                this.w.b(1, 0, i2 + arg1, arg3 + i2, (byte)88);
                this.w.b(1, 0, arg4 + arg1 + (-1 - i2), i2 + arg3, (byte)106);
            }
        }
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4) {
        block6: {
            int n2;
            this.hb = arg1;
            this.bb = arg4;
            if (arg3 != 0) {
                this.zb = arg3;
            }
            this.Hb = arg0;
            if (arg3 == 1) {
                for (n2 = 0; this.eb > n2; ++n2) {
                    if (this.g[n2] && this.U[n2] == 10 && this.kb[n2] <= this.bb && this.hb >= this.B[n2] && this.ob[n2] + this.kb[n2] >= this.bb && this.hb <= this.O[n2] + this.B[n2]) {
                        this.D[n2] = true;
                    }
                    if (!this.g[n2] || this.U[n2] != 14 || this.bb < this.kb[n2] || this.hb < this.B[n2] || this.ob[n2] + this.kb[n2] < this.bb || this.O[n2] + this.B[n2] < this.hb) continue;
                    this.vb[n2] = 1 - this.vb[n2];
                }
            }
            if (arg2 != -9989) {
                this.a(-43, 104);
            }
            this.G = arg0 == 1 ? ++this.G : 0;
            if (arg3 != 1 && this.G <= 20) break block6;
            for (n2 = 0; this.eb > n2; ++n2) {
                if (!this.g[n2] || this.U[n2] != 15 || this.kb[n2] > this.bb || this.hb < this.B[n2] || this.ob[n2] + this.kb[n2] < this.bb || this.B[n2] + this.O[n2] < this.hb) continue;
                this.D[n2] = true;
            }
            this.G -= 5;
        }
    }

    final int a(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.U[this.eb] = 11;
        if (arg3 != 26531) {
            return 59;
        }
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.kb[this.eb] = -(arg2 / 2) + arg1;
        this.B[this.eb] = -(arg0 / 2) + arg4;
        this.ob[this.eb] = arg2;
        this.O[this.eb] = arg0;
        return this.eb++;
    }

    private final void a(int arg0, int arg1, int arg2, String[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        if (arg8 != 0) {
            this.a(56, -19);
        }
        if ((n6 = arg0 / this.w.a(arg8 + 508305352, arg5)) >= arg4) {
            arg9 = 0;
            this.j[arg2] = 0;
        } else {
            n5 = arg10 - 12 + arg1;
            n4 = n6 * (arg0 - 27) / arg4;
            if (n4 < 6) {
                n4 = 6;
            }
            n3 = (-n4 + (arg0 - 27)) * arg9 / (arg4 - n6);
            if (this.Hb == 1 && this.bb >= n5 && this.bb <= 12 + n5) {
                if (arg6 < this.hb && 12 + arg6 > this.hb && arg9 > 0) {
                    --arg9;
                }
                if (this.hb <= arg0 - 12 + arg6 || arg6 + arg0 <= this.hb || -n6 + arg4 > arg9) {
                    // empty if block
                }
                this.j[arg2] = ++arg9;
            }
            if (this.Hb == 1 && (n5 <= this.bb && this.bb <= 12 + n5 || n5 - 12 <= this.bb && this.bb <= n5 + 24 && this.d[arg2])) {
                if (12 + arg6 < this.hb && arg6 - (-arg0 + 12) > this.hb) {
                    this.d[arg2] = true;
                    n2 = this.hb - 12 + (-arg6 - n4 / 2);
                    arg9 = arg4 * n2 / (arg0 - 24);
                    if (arg9 < 0) {
                        arg9 = 0;
                    }
                    if (arg9 > arg4 - n6) {
                        arg9 = arg4 + -n6;
                    }
                    this.j[arg2] = arg9;
                }
            } else {
                this.d[arg2] = false;
            }
            n3 = (arg0 - n4 - 27) * arg9 / (-n6 + arg4);
            this.a(n4, n3, arg1, arg10, arg0, arg6, (byte)-25);
        }
        this.N[arg2] = -1;
        n5 = arg0 + -(this.w.a(508305352, arg5) * n6);
        n4 = 5 * this.w.a(508305352, arg5) / 6 + (arg6 - -(n5 / 2));
        for (n3 = arg9; n3 < arg4; ++n3) {
            n2 = this.Y[arg2] ? 0xFFFFFF : 0;
            if (this.bb >= 2 + arg1 && this.bb <= this.w.a(arg5, 95, arg3[n3]) + (2 + arg1) && this.hb - 2 <= n4 && this.hb - 2 > -this.w.a(508305352, arg5) + n4) {
                n2 = this.Y[arg2] ? 0x808080 : 0xFFFFFF;
                this.N[arg2] = n3;
                if (this.zb == 1) {
                    this.vb[arg2] = n3;
                    this.D[arg2] = true;
                }
            }
            if (this.vb[arg2] == n3 && this.t) {
                n2 = 0xFF0000;
            }
            this.w.a(arg7[n3], n4, arg3[n3], arg1 + 2, n2, (byte)-9, arg5);
            if ((n4 += this.w.a(508305352, arg5)) >= arg0 + arg6) break;
        }
    }

    private final void a(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int n2;
        if (!(!this.cb[arg7])) {
            n2 = arg1.length();
            arg1 = "";
            for (int i2 = 0; n2 > i2; ++i2) {
                arg1 = arg1 + "X";
            }
        }
        if (this.U[arg7] == 5) {
            if (this.zb == 1 && arg5 <= this.bb && this.hb >= -(arg3 / 2) + arg6 && this.bb <= arg5 - -arg2 && this.hb <= arg3 / 2 + arg6) {
                this.gb = arg7;
            }
        } else if (this.U[arg7] == 6) {
            if (this.zb == 1 && this.bb >= -(arg2 / 2) + arg5 && -(arg3 / 2) + arg6 <= this.hb && arg2 / 2 + arg5 >= this.bb && arg6 + arg3 / 2 >= this.hb) {
                this.gb = arg7;
            }
            arg5 -= this.w.a(arg0, 76, arg1) / 2;
        }
        if (this.gb == arg7) {
            arg1 = arg1 + "*";
        }
        if (!arg4) {
            this.a(28, (byte)94, -2, 23, 126);
        }
        n2 = this.w.a(508305352, arg0) / 3 + arg6;
        this.a(arg0, arg7, arg4, 0, arg5, n2, arg1);
    }

    final boolean a(byte arg0, int arg1) {
        if (arg0 > -95) {
            return true;
        }
        if (this.g[arg1] && this.D[arg1]) {
            this.D[arg1] = false;
            return true;
        }
        return false;
    }

    static final boolean a(e arg0, String arg1, int arg2, int arg3) {
        int n2;
        boolean bl = false;
        arg1 = arg1.toLowerCase();
        boolean bl2 = false;
        if (arg1.startsWith("helvetica")) {
            arg1 = arg1.substring(9);
        }
        if (arg1.startsWith("h")) {
            arg1 = arg1.substring(1);
        }
        if (arg1.startsWith("f")) {
            arg1 = arg1.substring(1);
            bl = true;
        }
        if (arg1.startsWith("d")) {
            arg1 = arg1.substring(1);
            bl2 = true;
        }
        if (arg1.endsWith(".jf")) {
            arg1 = arg1.substring(0, arg1.length() - 3);
        }
        int n3 = 0;
        if (arg1.endsWith("b")) {
            n3 = 1;
            arg1 = arg1.substring(0, arg1.length() - 1);
        }
        if (arg1.endsWith("p")) {
            arg1 = arg1.substring(0, arg1.length() - 1);
        }
        int n4 = Integer.parseInt(arg1);
        Font font = new Font("Helvetica", n3, n4);
        FontMetrics fontMetrics = arg0.getFontMetrics(font);
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        b.c = 855;
        for (n2 = 0; n2 < 95; ++n2) {
            if (s.a(arg2, font, n2, -95, arg0, string.charAt(n2), fontMetrics, bl2)) continue;
            return false;
        }
        m.b[arg2] = new byte[b.c];
        for (n2 = arg3; n2 < b.c; ++n2) {
            m.b[arg2][n2] = qb.k[n2];
        }
        if (n3 == 1 && fb.k[arg2]) {
            fb.k[arg2] = false;
            if (!qa.a(arg0, "f" + n4 + "p", arg2, 0)) {
                return false;
            }
        }
        if (bl && !fb.k[arg2]) {
            fb.k[arg2] = false;
            if (!qa.a(arg0, "d" + n4 + "p", arg2, arg3 ^ 0)) {
                return false;
            }
        }
        return true;
    }

    private final void a(int arg0, int arg1, byte arg2, String[] arg3, int arg4, int arg5) {
        int n2;
        int n3 = 0;
        int n4 = arg3.length;
        if (arg2 != -73) {
            return;
        }
        for (n2 = 0; n4 > n2; ++n2) {
            n3 += this.w.a(arg1, 106, arg3[n2]);
            if (n4 - 1 <= n2) continue;
            n3 += this.w.a(arg1, 92, "  ");
        }
        n2 = arg0 + -(n3 / 2);
        int n5 = this.w.a(arg2 + 508305425, arg1) / 3 + arg5;
        for (int i2 = 0; n4 > i2; ++i2) {
            int n6 = !this.Y[arg4] ? 0 : 0xFFFFFF;
            if (n2 <= this.bb && this.bb <= n2 + this.w.a(arg1, 73, arg3[i2]) && this.hb <= n5 && this.hb > n5 + -this.w.a(508305352, arg1)) {
                n6 = this.Y[arg4] ? 0x808080 : 0xFFFFFF;
                if (this.zb == 1) {
                    this.vb[arg4] = i2;
                    this.D[arg4] = true;
                }
            }
            if (this.vb[arg4] == i2) {
                n6 = this.Y[arg4] ? 0xFF0000 : 0xC00000;
            }
            this.w.a(0, n5, arg3[i2], n2, n6, (byte)-53, arg1);
            n2 += this.w.a(arg1, 127, arg3[i2] + "  ");
        }
    }

    final void d(int arg0, int arg1) {
        block0: {
            this.gb = arg0;
            if (arg1 <= -70) break block0;
            this.b(33, -60, -29);
        }
    }

    private final void a(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int n2 = arg1 - -(this.w.a(508305352, arg3) / 3);
        this.a(arg3, arg5, true, arg6, arg4, n2, arg0);
    }

    final int c(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.U[this.eb] = 2;
        if (arg0 > -56) {
            this.a(127, 127);
        }
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.kb[this.eb] = arg3 - arg1 / 2;
        this.B[this.eb] = arg4 + -(arg2 / 2);
        this.ob[this.eb] = arg1;
        this.O[this.eb] = arg2;
        return this.eb++;
    }

    private final void a(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.w.a(arg3, arg3 - -arg0, arg4 + arg2, arg4, (byte)30);
        this.w.b(arg3, this.J, arg0, this.tb, arg2, arg4, 19020);
        if (p.d) {
            for (int i2 = -(arg4 & 0x3F) + arg3; i2 < arg0 + arg3; i2 += 128) {
                for (int i3 = -(0x1F & arg4) + arg4; arg4 - -arg2 > i3; i3 += 128) {
                    this.w.a(6 - -u.g, 0, i2, 128, i3);
                }
            }
        }
        this.w.b(arg0, this.tb, arg3, arg4, (byte)111);
        if (arg1 != 69) {
            l = null;
        }
        this.w.b(arg0 - 2, this.tb, 1 + arg3, arg4 + 1, (byte)-124);
        this.w.b(arg0 - 4, this.F, 2 + arg3, 2 + arg4, (byte)-99);
        this.w.b(arg3, arg4, this.tb, arg2, 0);
        this.w.b(1 + arg3, arg4 + 1, this.tb, arg2 - 2, 0);
        this.w.b(arg3 + 2, arg4 + 2, this.F, arg2 - 4, arg1 ^ 0x45);
        this.w.b(arg0, this.J, arg3, arg4 + (arg2 - 1), (byte)100);
        this.w.b(arg0 - 2, this.J, arg3 + 1, arg4 + (arg2 - 2), (byte)103);
        this.w.b(arg0 - 4, this.Eb, 2 + arg3, arg4 - -arg2 - 3, (byte)73);
        this.w.b(arg0 + arg3 - 1, arg4, this.J, arg2, 0);
        this.w.b(arg0 + arg3 - 2, arg4 + 1, this.J, arg2 - 2, 0);
        this.w.b(arg3 + (arg0 - 3), arg4 + 2, this.Eb, arg2 - 4, 0);
        this.w.a(-1);
    }

    private final void b(int arg0, int arg1, int arg2, int arg3) {
        this.w.b(-1, arg3, arg1, arg2);
    }

    final void c(int arg0, int arg1) {
        block0: {
            this.g[arg0] = true;
            if (arg1 >= 114) break block0;
            this.a(7, -8, false, -58, -39, 47, null);
        }
    }

    final int a(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg0 != 0) {
            this.B = null;
        }
        this.U[this.eb] = 6;
        this.g[this.eb] = true;
        this.cb[this.eb] = arg7;
        this.D[this.eb] = false;
        this.k[this.eb] = arg5;
        this.Y[this.eb] = arg3;
        this.kb[this.eb] = arg8;
        this.B[this.eb] = arg4;
        this.ob[this.eb] = arg2;
        this.O[this.eb] = arg6;
        this.sb[this.eb] = arg1;
        this.yb[this.eb] = "";
        return this.eb++;
    }

    final int a(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        this.U[this.eb] = 9;
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.k[this.eb] = arg7;
        this.Y[this.eb] = arg3;
        this.kb[this.eb] = arg0;
        if (arg4 < 40) {
            return 21;
        }
        this.B[this.eb] = arg6;
        this.ob[this.eb] = arg1;
        this.O[this.eb] = arg2;
        this.sb[this.eb] = arg5;
        this.Ab[this.eb] = new String[arg5];
        this.m[this.eb] = new int[arg5];
        this.Fb[this.eb] = new String[arg5];
        this.p[this.eb] = new String[arg5];
        this.pb[this.eb] = 0;
        this.j[this.eb] = 0;
        this.vb[this.eb] = -1;
        this.N[this.eb] = -1;
        return this.eb++;
    }

    private final void a(int arg0, int arg1, int arg2, int arg3) {
        this.w.b(arg3, arg1, arg2, arg0, (byte)-119);
    }

    final void b(byte arg0, int arg1) {
        block0: {
            this.g[arg1] = false;
            if (arg0 > 33) break block0;
            this.R = -86;
        }
    }

    final String g(int arg0, int arg1) {
        if (arg1 != 4) {
            return null;
        }
        if (this.yb[arg0] == null) {
            return "null";
        }
        return this.yb[arg0];
    }

    final void a(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5, int arg6) {
        block0: {
            this.Ab[arg6][arg0] = arg5;
            this.m[arg6][arg0] = arg3;
            this.Fb[arg6][arg0] = arg4;
            this.p[arg6][arg0] = arg1;
            if (arg0 + 1 <= this.pb[arg6]) break block0;
            this.pb[arg6] = arg0 + 1;
        }
    }

    final int f(int arg0, int arg1) {
        if (arg0 != 14458) {
            this.t = true;
        }
        return this.vb[arg1];
    }

    final void a(int arg0, int arg1) {
        block8: {
            if (arg0 != -12) {
                this.d(-17, 7);
            }
            if (arg1 == 0) {
                return;
            }
            if (this.gb == -1 || this.yb[this.gb] == null || !this.g[this.gb]) break block8;
            int n2 = this.yb[this.gb].length();
            if (arg1 == 8 && n2 > 0) {
                this.yb[this.gb] = this.yb[this.gb].substring(0, n2 - 1);
            }
            if ((arg1 == 10 || arg1 == 13) && n2 > 0) {
                this.D[this.gb] = true;
            }
            String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
            if (n2 < this.sb[this.gb]) {
                for (int i2 = 0; string.length() > i2; ++i2) {
                    if (string.charAt(i2) != arg1) continue;
                    int n3 = this.gb;
                    this.yb[n3] = this.yb[n3] + (char)arg1;
                }
            }
            if (arg1 == 9) {
                do {
                    this.gb = (1 + this.gb) % this.eb;
                } while (this.U[this.gb] != 5 && this.U[this.gb] != 6);
            }
        }
    }

    private final void a(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.w.a(arg3, (byte)-127, 0, arg0, arg4, arg1);
        this.w.e(arg3, arg1, arg0, 27785, arg4, this.fb);
        if (!arg2) {
            return;
        }
        this.w.e(1 + arg3, arg1 - 2, 1 + arg0, 27785, arg4 - 2, this.E);
        this.w.e(arg3 + 2, arg1 - 4, 2 + arg0, 27785, arg4 - 4, this.f);
        this.w.b(-1, u.g + 2, arg0, arg3);
        this.w.b(-1, 3 - -u.g, arg0, arg1 + arg3 - 7);
        this.w.b(-1, 4 + u.g, arg0 - (-arg4 + 7), arg3);
        this.w.b(-1, 5 + u.g, arg4 - 7 + arg0, arg3 - -arg1 - 7);
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int n2 = arg2 - -arg3 - 12;
        this.w.e(n2, 12, arg5, 27785, arg4, 0);
        this.w.b(-1, 0 + u.g, arg5 + 1, 1 + n2);
        this.w.b(-1, u.g + 1, arg4 - 12 + arg5, 1 + n2);
        this.w.b(12, 0, n2, 13 + arg5, (byte)-49);
        this.w.b(12, 0, n2, arg5 - 13 - -arg4, (byte)-119);
        this.w.b(1 + n2, this.R, 11, this.qb, arg4 - 27, 14 + arg5, 19020);
        this.w.a(n2 + 3, (byte)-105, this.i, 14 + arg5 + arg1, arg0, 7);
        this.w.b(n2 + 2, arg5 + arg1 + 14, this.C, arg0, 0);
        this.w.b(n2 + 10, 14 + arg1 - -arg5, this.ib, arg0, 0);
    }

    final int b(int arg0, int arg1) {
        if (arg1 != 17050) {
            this.E = 56;
        }
        int n2 = this.N[arg0];
        return n2;
    }

    final int c(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -52) {
            this.d = null;
        }
        int n2 = this.w.kb[arg0];
        int n3 = this.w.R[arg0];
        this.U[this.eb] = 12;
        this.g[this.eb] = true;
        this.D[this.eb] = false;
        this.kb[this.eb] = arg2 + -(n2 / 2);
        this.B[this.eb] = -(n3 / 2) + arg1;
        this.ob[this.eb] = n2;
        this.O[this.eb] = n3;
        this.k[this.eb] = arg0;
        return this.eb++;
    }

    final void a(String arg0, boolean arg1, int arg2, String arg3, String arg4, byte arg5, int arg6) {
        block3: {
            int n2 = arg6;
            int n3 = this.pb[n2];
            this.pb[n2] = n3 + 1;
            int n4 = n3;
            if (this.sb[arg6] <= n4) {
                int n5 = arg6;
                this.pb[n5] = this.pb[n5] - 1;
                --n4;
                for (int i2 = 0; n4 > i2; ++i2) {
                    this.Ab[arg6][i2] = this.Ab[arg6][1 + i2];
                    this.m[arg6][i2] = this.m[arg6][i2 + 1];
                    this.Fb[arg6][i2] = this.Fb[arg6][i2 + 1];
                    this.p[arg6][i2] = this.p[arg6][i2 + 1];
                }
            }
            this.Ab[arg6][n4] = arg0;
            this.m[arg6][n4] = arg2;
            if (arg5 > -39) {
                this.pb = null;
            }
            this.Fb[arg6][n4] = arg4;
            this.p[arg6][n4] = arg3;
            if (!arg1) break block3;
            this.j[arg6] = 999999;
        }
    }

    private final void a(String[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n2 = arg0.length;
        int n3 = -((n2 - 1) * this.w.a(508305352, arg3) / 2) + arg5;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = this.Y[arg1] ? 0xFFFFFF : 0;
            int n5 = this.w.a(arg3, 112, arg0[i2]);
            if (-(n5 / 2) + arg4 <= this.bb && this.bb <= arg4 - -(n5 / 2) && n3 >= this.hb - 2 && this.hb - 2 > -this.w.a(508305352, arg3) + n3) {
                n4 = this.Y[arg1] ? 0x808080 : 0xFFFFFF;
                if (this.zb == 1) {
                    this.vb[arg1] = i2;
                    this.D[arg1] = true;
                }
            }
            if (this.vb[arg1] == i2) {
                n4 = !this.Y[arg1] ? 0xC00000 : 0xFF0000;
            }
            this.w.a(0, n3, arg0[i2], -(n5 / 2) + arg4, n4, (byte)-126, arg3);
            n3 += this.w.a(508305352, arg3);
        }
    }

    final String b(int arg0, int arg1, int arg2) {
        if (arg1 != 19680) {
            this.a(38, -6, -46, -34, -108, -42, (byte)-17);
        }
        return this.Fb[arg2][arg0];
    }

    qa(ua arg0, int arg1) {
        this.Fb = new String[arg1][];
        this.Y = new boolean[arg1];
        this.B = new int[arg1];
        this.cb = new boolean[arg1];
        this.k = new int[arg1];
        this.pb = new int[arg1];
        this.ob = new int[arg1];
        this.g = new boolean[arg1];
        this.w = arg0;
        this.N = new int[arg1];
        this.vb = new int[arg1];
        this.U = new int[arg1];
        this.m = new int[arg1][];
        this.yb = new String[arg1];
        this.d = new boolean[arg1];
        this.j = new int[arg1];
        this.Ab = new String[arg1][];
        this.O = new int[arg1];
        this.D = new boolean[arg1];
        this.p = new String[arg1][];
        this.kb = new int[arg1];
        this.sb = new int[arg1];
        this.R = this.a(176, 114, 114, (byte)-98);
        this.qb = this.a(62, 14, 14, (byte)-75);
        this.C = this.a(232, 208, 200, (byte)-88);
        this.i = this.a(184, 129, 96, (byte)-79);
        this.ib = this.a(115, 95, 53, (byte)-92);
        this.fb = this.a(171, 142, 117, (byte)-124);
        this.E = this.a(158, 122, 98, (byte)-117);
        this.f = this.a(136, 100, 86, (byte)-113);
        this.tb = this.a(179, 146, 135, (byte)-89);
        this.F = this.a(151, 112, 97, (byte)-122);
        this.Eb = this.a(136, 102, 88, (byte)-124);
        this.J = this.a(120, 93, 84, (byte)-92);
    }

    static {
        l = pa.a(-126);
    }
}

