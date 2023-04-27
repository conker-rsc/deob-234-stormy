/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

class ua
implements ImageProducer,
ImageObserver {
    private int[] G;
    private int[] tb;
    private int[] Sb;
    boolean xb;
    int[] qb;
    boolean i;
    private int[] Xb;
    static v E = new v("LIVE", "", "", 0);
    private int[] t;
    int[] Eb;
    private int[] Tb;
    private int[] Wb;
    int[] rb;
    private ColorModel nb;
    int[] R;
    byte[][] gb;
    int[] kb;
    int u;
    int[][] ob;
    private int A;
    static int w;
    private int hb;
    private int D;
    int[][] Y;
    int k;
    private boolean[] Qb;
    static String[] wb;
    private int lb;
    private ImageConsumer fb;
    static int[] Bb;
    static int Db;
    static int C;
    private Image Gb;
    private int[] M;
    static int[] Ab;
    private int Rb;
    static String[] Kb;
    private int[] Hb;
    static String[] h;
    static int[] Mb;

    final void e(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.b(arg1, arg5, arg0, arg2, (byte)115);
        if (arg3 != 27785) {
            return;
        }
        this.b(arg1, arg5, arg0, arg4 - 1 + arg2, (byte)-117);
        this.b(arg0, arg2, arg5, arg4, 0);
        this.b(arg1 + arg0 - 1, arg2, arg5, arg4, 0);
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.hb > arg0) {
            arg2 -= -arg0 + this.hb;
            arg0 = this.hb;
        }
        if (this.lb < arg2 + arg0) {
            arg2 = -arg0 + this.lb;
        }
        int n2 = (arg3 & 0xFF8DC6) >> 16;
        int n3 = arg3 >> 8 & 0xFF;
        int n4 = arg3 & 0xFF;
        int n5 = (arg1 & 0xFFDB64) >> 16;
        int n6 = arg1 >> 8 & 0xFF;
        int n7 = arg1 & 0xFF;
        int n8 = -arg2 + this.u;
        int n9 = 1;
        if (!(!this.i)) {
            n8 += this.u;
            n9 = 2;
            if ((arg5 & 1) != 0) {
                ++arg5;
                --arg4;
            }
        }
        if (arg6 != 19020) {
            this.a(-124, 53, -53, -76, (byte)-44);
        }
        int n10 = arg0 - -(this.u * arg5);
        for (int i2 = 0; arg4 > i2; i2 += n9) {
            if (i2 + arg5 >= this.A && arg5 + i2 < this.Rb) {
                int n11 = ((n3 * i2 + n6 * (-i2 + arg4)) / arg4 << 8) + ((n5 * (-i2 + arg4) + n2 * i2) / arg4 << 16) + (i2 * n4 - -(n7 * (-i2 + arg4))) / arg4;
                for (int i3 = -arg2; i3 < 0; ++i3) {
                    this.rb[n10++] = n11;
                }
                n10 += n8;
                continue;
            }
            n10 += this.u;
        }
    }

    private final void a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            int n2 = arg9;
            for (int i2 = -arg8; i2 < 0; i2 += arg1) {
                int n3 = (arg4 >> 16) * arg12;
                arg4 += arg7;
                for (int i3 = -arg11; i3 < 0; ++i3) {
                    arg3 = arg0[(arg9 >> 16) - -n3];
                    arg9 += arg2;
                    if (arg3 != 0) {
                        arg5[arg13++] = arg3;
                        continue;
                    }
                    ++arg13;
                }
                arg13 += arg10;
                arg9 = n2;
            }
        }
        catch (Exception exception) {
            System.out.println("error in plot_scale");
        }
    }

    private final void a(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11) {
        int n2 = 256 - arg5;
        if (arg8 > -54) {
            return;
        }
        for (int i2 = -arg1; i2 < 0; i2 += arg6) {
            for (int i3 = -arg11; i3 < 0; ++i3) {
                if ((arg4 = arg3[arg0++]) == 0) {
                    ++arg2;
                    continue;
                }
                int n3 = arg7[arg2];
                arg7[arg2++] = ib.a(0xFF0000, arg5 * ib.a(arg4, 65280) + n2 * ib.a(65280, n3)) + ib.a(n2 * ib.a(n3, 0xFF00FF) + ib.a(arg4, 0xFF00FF) * arg5, -16711936) >> 8;
            }
            arg0 += arg9;
            arg2 += arg10;
        }
    }

    final void b(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        this.a(arg0, arg2, arg1, arg3, -12200, arg5, 0);
    }

    static final void a(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int n2;
        int n3;
        if (arg2 >= 0) {
            return;
        }
        arg4 = arg1[(0xFFA7 & arg0) >> 8];
        arg0 += (arg5 <<= 2);
        for (n3 = n2 = arg2 / 16; n3 < 0; ++n3) {
            arg3[arg6++] = arg4 - -ib.a(0x7F7F7F, arg3[arg6] >> 1);
            arg3[arg6++] = arg4 + ib.a(0x7F7F7F, arg3[arg6] >> 1);
            arg3[arg6++] = arg4 + (ib.a(arg3[arg6], 0xFEFEFF) >> 1);
            arg3[arg6++] = (ib.a(0xFEFEFF, arg3[arg6]) >> 1) + arg4;
            arg4 = arg1[0xFF & arg0 >> 8];
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 0x7F7F7F) + arg4;
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 0x7F7F7F) + arg4;
            arg3[arg6++] = (ib.a(0xFEFEFF, arg3[arg6]) >> 1) + arg4;
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 0x7F7F7F) + arg4;
            arg4 = arg1[(arg0 += arg5) >> 8 & 0xFF];
            arg3[arg6++] = (ib.a(arg3[arg6], 0xFEFEFE) >> 1) + arg4;
            arg3[arg6++] = (ib.a(0xFEFEFF, arg3[arg6]) >> 1) + arg4;
            arg3[arg6++] = arg4 - -ib.a(arg3[arg6] >> 1, 0x7F7F7F);
            arg3[arg6++] = arg4 + ib.a(0x7F7F7F, arg3[arg6] >> 1);
            arg4 = arg1[(0xFF16 & (arg0 += arg5)) >> 8];
            arg3[arg6++] = (ib.a(arg3[arg6], 0xFEFEFF) >> 1) + arg4;
            arg3[arg6++] = arg4 + ib.a(arg3[arg6] >> 1, 0x7F7F7F);
            arg3[arg6++] = arg4 - -(ib.a(arg3[arg6], 0xFEFEFF) >> 1);
            arg3[arg6++] = arg4 + (ib.a(0xFEFEFF, arg3[arg6]) >> 1);
            arg4 = arg1[(arg0 += arg5) >> 8 & 0xFF];
            arg0 += arg5;
        }
        n2 = -(arg2 % 16);
        for (n3 = arg7; n3 < n2; ++n3) {
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 0x7F7F7F) + arg4;
            if ((3 & n3) != 3) continue;
            arg4 = arg1[(arg0 & 0xFF38) >> 8];
            arg0 += arg5;
            arg0 += arg5;
        }
    }

    @Override
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.fb = arg0;
        arg0.setDimensions(this.u, this.k);
        arg0.setProperties(null);
        arg0.setColorModel(this.nb);
        arg0.setHints(14);
    }

    final void b(int arg0, int arg1, int arg2, int arg3) {
        int n2;
        if (arg0 != -1) {
            this.a(41, 58, 102, 22, (byte)102);
        }
        if (this.Qb[arg1]) {
            arg3 += this.Sb[arg1];
            arg2 += this.G[arg1];
        }
        int n3 = arg2 * this.u + arg3;
        int n4 = 0;
        int n5 = this.R[arg1];
        int n6 = this.kb[arg1];
        int n7 = -n6 + this.u;
        int n8 = 0;
        if (arg2 < this.A) {
            n2 = this.A - arg2;
            n5 -= n2;
            arg2 = this.A;
            n3 += this.u * n2;
            n4 += n2 * n6;
        }
        if (this.Rb <= arg2 - -n5) {
            n5 -= 1 + (n5 + arg2 - this.Rb);
        }
        if (this.hb > arg3) {
            n2 = -arg3 + this.hb;
            n4 += n2;
            n7 += n2;
            n6 -= n2;
            n8 += n2;
            arg3 = this.hb;
            n3 += n2;
        }
        if (arg3 - -n6 >= this.lb) {
            n2 = arg3 - -n6 + -this.lb + 1;
            n6 -= n2;
            n8 += n2;
            n7 += n2;
        }
        if (n6 <= 0 || n5 <= 0) {
            return;
        }
        n2 = 1;
        if (!(!this.i)) {
            n7 += this.u;
            if ((1 & arg2) != 0) {
                n3 += this.u;
                --n5;
            }
            n2 = 2;
            n8 += this.kb[arg1];
        }
        if (this.ob[arg1] != null) {
            this.a(n6, this.rb, n2, n5, 0, n4, (byte)123, n3, this.ob[arg1], n7, n8);
        } else {
            this.a(n3, this.Y[arg1], n4, n8, this.rb, n2, n5, true, this.gb[arg1], n6, n7);
        }
    }

    @Override
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        block4: {
            for (int i2 = arg3; arg3 + arg5 > i2; ++i2) {
                for (int i3 = arg2; i3 < arg2 + arg0; ++i3) {
                    int n2 = 0;
                    int n3 = 0;
                    int n4 = 0;
                    int n5 = 0;
                    for (int i4 = -arg6 + i2; arg6 + i2 >= i4; ++i4) {
                        if (i4 < 0 || this.u <= i4) continue;
                        for (int i5 = i3 - arg1; i5 <= i3 + arg1; ++i5) {
                            if (i5 < 0 || i5 >= this.k) continue;
                            int n6 = this.rb[this.u * i5 + i4];
                            n4 += 0xFF & n6;
                            ++n5;
                            n3 += (n6 & 0xFF81) >> 8;
                            n2 += (n6 & 0xFF64A6) >> 16;
                        }
                    }
                    this.rb[i2 + i3 * this.u] = n4 / n5 + ((n2 / n5 << 16) + (n3 / n5 << 8));
                }
            }
            if (arg4 == 0xFF7000) break block4;
            this.a(-18, (byte)79, -10, 106, -42, 27);
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            int n2;
            int n3;
            int n4;
            int n5 = this.kb[arg2];
            int n6 = this.R[arg2];
            int n7 = 0;
            int n8 = 0;
            int n9 = (n5 << 16) / arg6;
            int n10 = (n6 << 16) / arg4;
            if (this.Qb[arg2]) {
                n4 = this.Eb[arg2];
                n3 = this.qb[arg2];
                if (n4 == 0 || n3 == 0) {
                    return;
                }
                if (this.Sb[arg2] * arg6 % n4 != 0) {
                    n7 = (-(this.Sb[arg2] * arg6 % n4) + n4 << 16) / arg6;
                }
                arg0 += (arg6 * this.Sb[arg2] - -n4 - 1) / n4;
                n9 = (n4 << 16) / arg6;
                arg3 += (n3 + arg4 * this.G[arg2] - 1) / n3;
                n10 = (n3 << 16) / arg4;
                if (this.G[arg2] * arg4 % n3 != 0) {
                    n8 = (-(arg4 * this.G[arg2] % n3) + n3 << 16) / arg4;
                }
                arg4 = arg4 * (-(n8 >> 16) + this.R[arg2]) / n3;
                arg6 = (-(n7 >> 16) + this.kb[arg2]) * arg6 / n4;
            }
            if (arg5 <= 102) {
                this.Y = null;
            }
            n4 = arg0 + arg3 * this.u;
            n3 = this.u - arg6;
            if (arg3 < this.A) {
                n2 = this.A + -arg3;
                arg3 = 0;
                arg4 -= n2;
                n4 += n2 * this.u;
                n8 += n2 * n10;
            }
            if (arg0 < this.hb) {
                n2 = this.hb - arg0;
                arg6 -= n2;
                n3 += n2;
                n7 += n2 * n9;
                n4 += n2;
                arg0 = 0;
            }
            if (arg3 - -arg4 >= this.Rb) {
                arg4 -= arg3 - -arg4 - (this.Rb - 1);
            }
            if (arg0 + arg6 >= this.lb) {
                n2 = arg0 - -arg6 + (-this.lb + 1);
                arg6 -= n2;
                n3 += n2;
            }
            n2 = 1;
            if (!(!this.i)) {
                n10 += n10;
                if ((1 & arg3) != 0) {
                    --arg4;
                    n4 += this.u;
                }
                n2 = 2;
                n3 += this.u;
            }
            this.a(n8, n9, arg6, n7, n3, this.ob[arg2], n4, this.rb, 0, n5, false, n10, arg4, arg1, n2);
        }
        catch (Exception exception) {
            System.out.println("error in sprite clipping routine");
        }
    }

    final void b(int arg0) {
        int n2 = this.k * this.u;
        if (arg0 != 0xF8F8F9) {
            wb = null;
        }
        for (int i2 = 0; n2 > i2; ++i2) {
            int n3 = 0xFFFFFF & this.rb[i2];
            this.rb[i2] = ib.a(n3 >>> 4, 986895) + ((ib.a(n3, 0xF8F8F9) >>> 3) + (ib.a(0xFEFEFF, n3) >>> 1) - -ib.a(-2143338689, n3 >>> 2));
        }
    }

    private final void a(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, boolean arg10) {
        block1: {
            for (arg2 = arg0; arg2 < 0; ++arg2) {
                this.rb[arg9++] = arg7[(arg5 >> 17) * arg1 + (arg6 >> 17)];
                arg6 += arg4;
                arg5 += arg8;
            }
            if (arg10) break block1;
            this.a(-59, -116, -115, true, 1, 118, 33, -46, -78, -30);
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3) {
        if (this.hb > arg1 || arg0 < this.A || arg1 >= this.lb || arg0 >= this.Rb) {
            return;
        }
        if (arg2 <= 44) {
            return;
        }
        this.rb[arg1 - -(this.u * arg0)] = arg3;
    }

    final void c(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < this.A) {
            arg2 -= this.A - arg4;
            arg4 = this.A;
        }
        if (arg1 < this.hb) {
            arg5 -= this.hb - arg1;
            arg1 = this.hb;
        }
        if (this.lb < arg1 - -arg5) {
            arg5 = this.lb - arg1;
        }
        if (this.Rb < arg2 + arg4) {
            arg2 = -arg4 + this.Rb;
        }
        int n2 = 256 - arg0;
        int n3 = arg0 * (arg6 >> 16 & 0xFF);
        int n4 = ((arg6 & 0xFFC4) >> 8) * arg0;
        int n5 = arg0 * (arg6 & 0xFF);
        int n6 = this.u - arg5;
        int n7 = 1;
        if (!(!this.i)) {
            if ((arg4 & 1) != 0) {
                --arg2;
                ++arg4;
            }
            n6 += this.u;
            n7 = 2;
        }
        int n8 = arg1 - -(this.u * arg4);
        for (int i2 = arg3; arg2 > i2; i2 += n7) {
            for (int i3 = -arg5; i3 < 0; ++i3) {
                int n9 = n2 * (this.rb[n8] & 0xFF);
                int n10 = n2 * ((0xFF8835 & this.rb[n8]) >> 16);
                int n11 = n2 * ((0xFF7A & this.rb[n8]) >> 8);
                int n12 = (n9 + n5 >> 8) + (n11 + n4 >> 8 << 8) + (n3 + n10 >> 8 << 16);
                this.rb[n8++] = n12;
            }
            n8 += n6;
        }
    }

    final int a(int arg0, int arg1, String arg2) {
        int n2 = 0;
        if (arg1 <= 67) {
            this.Rb = 74;
        }
        byte[] byArray = m.b[arg0];
        for (int i2 = 0; i2 < arg2.length(); ++i2) {
            if (arg2.charAt(i2) == '@' && 4 + i2 < arg2.length() && arg2.charAt(i2 + 4) == '@') {
                i2 += 4;
                continue;
            }
            if (arg2.charAt(i2) != '~' || i2 + 4 >= arg2.length() || arg2.charAt(i2 + 4) != '~') {
                int n3 = arg2.charAt(i2);
                if (n3 < 0 || n.a.length <= n3) {
                    n3 = 32;
                }
                n2 += byArray[n.a[n3] + 7];
                continue;
            }
            i2 += 4;
        }
        return n2;
    }

    @Override
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    private final void a(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (arg10 != 102) {
            return;
        }
        for (int i2 = arg1; i2 < 0; ++i2) {
            arg9 = arg3[(arg5 >> 17) * arg7 + (arg2 >> 17)];
            arg2 += arg8;
            if (arg9 == 0) {
                ++arg6;
            } else {
                this.rb[arg6++] = arg9;
            }
            arg5 += arg0;
        }
    }

    private final void a(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10, int arg11) {
        int n2 = -arg7 + 256;
        if (arg4) {
            return;
        }
        for (int i2 = -arg5; i2 < 0; i2 += arg3) {
            for (int i3 = -arg8; i3 < 0; ++i3) {
                int n3;
                if ((n3 = arg2[arg0++]) == 0) {
                    ++arg11;
                    continue;
                }
                n3 = arg10[0xFF & n3];
                int n4 = arg9[arg11];
                arg9[arg11++] = ib.a(n2 * ib.a(n4, 0xFF00FF) + ib.a(0xFF00FF, n3) * arg7, -16711936) + ib.a(0xFF0000, arg7 * ib.a(65280, n3) + n2 * ib.a(65280, n4)) >> 8;
            }
            arg11 += arg1;
            arg0 += arg6;
        }
    }

    private final int c(int arg0, int arg1) {
        if (arg1 == 0) {
            return m.b[arg1][8] - 2;
        }
        if (arg0 < 49) {
            this.a(-22, 77, 112, -35, -44, null, -45, null, -39, -33, false, 50, 61, 37, -7);
        }
        return m.b[arg1][8] - 1;
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        block2: {
            this.kb[arg4] = arg5;
            this.R[arg4] = arg0;
            this.Qb[arg4] = false;
            this.Sb[arg4] = 0;
            this.G[arg4] = 0;
            this.Eb[arg4] = arg5;
            this.qb[arg4] = arg0;
            int n2 = arg0 * arg5;
            int n3 = 0;
            this.ob[arg4] = new int[n2];
            for (int i2 = arg1; arg1 + arg5 > i2; ++i2) {
                for (int i3 = arg2; arg0 + arg2 > i3; ++i3) {
                    this.ob[arg4][n3++] = this.rb[i2 + this.u * i3];
                }
            }
            if (arg3 == -27966) break block2;
            this.a(73, -62, -30, (byte)-113, 44, -64, -91, 100, -79, null, 117, 11, 127, -109, null);
        }
    }

    void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        this.f(arg3, arg4, arg2, arg5, 5924, arg1);
        if (arg6 != 29) {
            return;
        }
    }

    final void c(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n2 = -arg0 + 256;
        int n3 = arg0 * (0xFF & arg4 >> 16);
        int n4 = (0xFF & arg4 >> 8) * arg0;
        int n5 = arg0 * (arg4 & 0xFF);
        if (arg1 != -1057205208) {
            return;
        }
        int n6 = -arg2 + arg3;
        if (n6 < 0) {
            n6 = 0;
        }
        int n7 = arg3 - -arg2;
        if (this.k <= n7) {
            n7 = this.k - 1;
        }
        int n8 = 1;
        if (!(!this.i)) {
            if ((1 & n6) != 0) {
                ++n6;
            }
            n8 = 2;
        }
        for (int i2 = n6; n7 >= i2; i2 += n8) {
            int n9 = i2 + -arg3;
            int n10 = (int)Math.sqrt(-(n9 * n9) + arg2 * arg2);
            int n11 = arg5 + -n10;
            if (n11 < 0) {
                n11 = 0;
            }
            int n12 = arg5 - -n10;
            if (this.u <= n12) {
                n12 = this.u - 1;
            }
            int n13 = n11 + this.u * i2;
            for (int i3 = n11; n12 >= i3; ++i3) {
                int n14 = (this.rb[n13] & 0xFF) * n2;
                int n15 = n2 * ((0xFFD5 & this.rb[n13]) >> 8);
                int n16 = n2 * ((this.rb[n13] & 0xFF18B9) >> 16);
                int n17 = (n14 + n5 >> 8) + ((n4 - -n15 >> 8 << 8) + (n3 - -n16 >> 8 << 16));
                this.rb[n13++] = n17;
            }
        }
    }

    private final void a(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        int n2 = arg14 >> 16 & 0xFF;
        int n3 = arg14 >> 8 & 0xFF;
        int n4 = arg14 & 0xFF;
        int n5 = arg7 >> 16 & 0xFF;
        if (arg5 != 1603920392) {
            this.Rb = 29;
        }
        int n6 = arg7 >> 8 & 0xFF;
        int n7 = 0xFF & arg7;
        try {
            int n8 = arg10;
            for (int i2 = -arg15; i2 < 0; ++i2) {
                int n9;
                int n10 = (arg12 >> 16) * arg13;
                int n11 = arg4 >> 16;
                int n12 = arg2;
                if (n11 < this.hb) {
                    n9 = this.hb + -n11;
                    n12 -= n9;
                    arg10 += n9 * arg9;
                    n11 = this.hb;
                }
                if (this.lb <= n11 - -n12) {
                    n9 = -this.lb + n11 - -n12;
                    n12 -= n9;
                }
                arg11 = 1 - arg11;
                if (arg11 != 0) {
                    for (n9 = n11; n11 + n12 > n9; ++n9) {
                        arg6 = arg1[n10 + (arg10 >> 16)];
                        if (arg6 != 0) {
                            int n13 = 0xFF & arg6 >> 16;
                            int n14 = 0xFF & arg6 >> 8;
                            int n15 = arg6 & 0xFF;
                            if (n13 == n14 && n15 == n14) {
                                arg0[n9 - -arg16] = (n15 * n4 >> 8) + ((n3 * n14 >> 8 << 8) + (n13 * n2 >> 8 << 16));
                            } else if (n13 != 255 || n15 != n14) {
                                arg0[n9 + arg16] = arg6;
                            } else {
                                arg0[n9 - -arg16] = (n7 * n15 >> 8) + (n13 * n5 >> 8 << 16) - -(n14 * n6 >> 8 << 8);
                            }
                        }
                        arg10 += arg9;
                    }
                }
                arg12 += arg8;
                arg10 = n8;
                arg16 += this.u;
                arg4 += arg3;
            }
        }
        catch (Exception exception) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private final void a(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, byte arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int[] arg16, int arg17) {
        int n2 = arg17 >> 16 & 0xFF;
        if (arg10 <= 8) {
            return;
        }
        int n3 = (arg17 & 0xFF65) >> 8;
        int n4 = arg17 & 0xFF;
        int n5 = arg12 >> 16 & 0xFF;
        int n6 = 0xFF & arg12 >> 8;
        int n7 = 0xFF & arg12;
        try {
            int n8 = arg11;
            for (int i2 = -arg0; i2 < 0; ++i2) {
                int n9;
                int n10 = arg2 * (arg7 >> 16);
                int n11 = arg13 >> 16;
                int n12 = arg15;
                if (n11 < this.hb) {
                    n9 = this.hb + -n11;
                    arg11 += n9 * arg14;
                    n12 -= n9;
                    n11 = this.hb;
                }
                arg9 = -arg9 + 1;
                if (n12 + n11 >= this.lb) {
                    n9 = n11 + (n12 - this.lb);
                    n12 -= n9;
                }
                if (arg9 != 0) {
                    for (n9 = n11; n9 < n12 + n11; ++n9) {
                        arg4 = 0xFF & arg8[(arg11 >> 16) - -n10];
                        if (arg4 != 0) {
                            arg4 = arg1[arg4];
                            int n13 = arg4 & 0xFF;
                            int n14 = 0xFF & arg4 >> 8;
                            int n15 = 0xFF & arg4 >> 16;
                            if (n14 != n15 || n14 != n13) {
                                if (n15 == 255 && n14 == n13) {
                                    arg16[arg6 + n9] = (n5 * n15 >> 8 << 16) + (n14 * n6 >> 8 << 8) + (n7 * n13 >> 8);
                                } else {
                                    arg16[n9 + arg6] = arg4;
                                }
                            } else {
                                arg16[n9 + arg6] = (n4 * n13 >> 8) + (n15 * n2 >> 8 << 16) + (n3 * n14 >> 8 << 8);
                            }
                        }
                        arg11 += arg14;
                    }
                }
                arg7 += arg3;
                arg13 += arg5;
                arg11 = n8;
                arg6 += this.u;
            }
        }
        catch (Exception exception) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private final void a(byte arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        block7: {
            int n2;
            int n3 = arg3 - -arg2[5 + arg5];
            if (arg0 < 24) {
                return;
            }
            int n4 = arg6 + -arg2[6 + arg5];
            int n5 = arg2[arg5 + 3];
            int n6 = arg2[4 + arg5];
            int n7 = 16384 * arg2[arg5] + arg2[arg5 + 1] * 128 + arg2[arg5 + 2];
            int n8 = n3 - -(n4 * this.u);
            int n9 = this.u + -n5;
            if (this.A > n4) {
                n2 = this.A - n4;
                n7 += n2 * n5;
                n8 += this.u * n2;
                n6 -= n2;
                n4 = this.A;
            }
            int n10 = 0;
            if (this.Rb <= n4 + n6) {
                n6 -= 1 + (n4 + n6) + -this.Rb;
            }
            if (n3 < this.hb) {
                n2 = -n3 + this.hb;
                n10 += n2;
                n5 -= n2;
                n7 += n2;
                n3 = this.hb;
                n9 += n2;
                n8 += n2;
            }
            if (n5 + n3 >= this.lb) {
                n2 = -this.lb + (n5 + n3) + 1;
                n9 += n2;
                n10 += n2;
                n5 -= n2;
            }
            if (n5 <= 0 || n6 <= 0) break block7;
            if (arg1) {
                this.a(arg2, arg4, n5, n8, n6, n10, 1504725224, n9, this.rb, n7);
            } else {
                this.a(arg4, this.rb, n8, (byte)37, n9, n6, n5, n7, arg2, n10);
            }
        }
    }

    final void f(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        block12: {
            try {
                int n2;
                int n3;
                int n4;
                int n5 = this.kb[arg5];
                int n6 = this.R[arg5];
                int n7 = 0;
                int n8 = 0;
                int n9 = (n5 << 16) / arg3;
                int n10 = (n6 << 16) / arg2;
                if (this.Qb[arg5]) {
                    n4 = this.Eb[arg5];
                    n3 = this.qb[arg5];
                    if (n4 == 0 || n3 == 0) {
                        return;
                    }
                    if (this.G[arg5] * arg2 % n3 != 0) {
                        n8 = (n3 - arg2 * this.G[arg5] % n3 << 16) / arg2;
                    }
                    n9 = (n4 << 16) / arg3;
                    if (this.Sb[arg5] * arg3 % n4 != 0) {
                        n7 = (n4 - this.Sb[arg5] * arg3 % n4 << 16) / arg3;
                    }
                    arg0 += (arg3 * this.Sb[arg5] - -n4 - 1) / n4;
                    n10 = (n3 << 16) / arg2;
                    arg1 += (n3 + arg2 * this.G[arg5] - 1) / n3;
                    arg2 = (this.R[arg5] - (n8 >> 16)) * arg2 / n3;
                    arg3 = arg3 * (this.kb[arg5] - (n7 >> 16)) / n4;
                }
                n4 = arg0 + this.u * arg1;
                if (this.A > arg1) {
                    n2 = this.A - arg1;
                    n8 += n10 * n2;
                    arg2 -= n2;
                    n4 += this.u * n2;
                    arg1 = 0;
                }
                n3 = this.u + -arg3;
                if (this.Rb <= arg1 - -arg2) {
                    arg2 -= -this.Rb + arg1 - -arg2 + 1;
                }
                if (arg0 < this.hb) {
                    n2 = -arg0 + this.hb;
                    arg3 -= n2;
                    n3 += n2;
                    n4 += n2;
                    arg0 = 0;
                    n7 += n9 * n2;
                }
                if (this.lb <= arg0 + arg3) {
                    n2 = 1 + (arg0 + (arg3 - this.lb));
                    n3 += n2;
                    arg3 -= n2;
                }
                n2 = 1;
                if (!(!this.i)) {
                    if ((arg1 & 1) != 0) {
                        --arg2;
                        n4 += this.u;
                    }
                    n3 += this.u;
                    n2 = 2;
                    n10 += n10;
                }
                this.a(this.ob[arg5], n2, n9, 0, n8, this.rb, (byte)78, n10, arg2, n7, n3, arg3, n5, n4);
            }
            catch (Exception exception) {
                System.out.println("error in sprite clipping routine");
            }
            if (arg4 == 5924) break block12;
            this.u = -15;
        }
    }

    final void b(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (this.A > arg3 || arg3 >= this.Rb) {
            return;
        }
        if (arg2 < this.hb) {
            arg0 -= -arg2 + this.hb;
            arg2 = this.hb;
        }
        if (this.lb < arg2 - -arg0) {
            arg0 = -arg2 + this.lb;
        }
        if (arg0 <= 0) {
            return;
        }
        int n2 = arg2 - -(this.u * arg3);
        for (int i2 = 0; arg0 > i2; ++i2) {
            this.rb[n2 - -i2] = arg1;
        }
    }

    final void a(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            int n2;
            if (arg0 > 0 && this.gb[n2 = arg0 + this.D - 1] != null) {
                this.b(-1, n2, -this.R[n2] + arg1, arg3);
                arg3 += this.kb[n2] + 5;
            }
            byte[] byArray = m.b[arg6];
            for (int i2 = 0; arg2.length() > i2; ++i2) {
                int n3;
                int n4;
                if (arg2.charAt(i2) == '@' && arg2.length() > i2 + 4 && arg2.charAt(i2 + 4) == '@') {
                    if (!arg2.substring(i2 + 1, i2 + 4).equalsIgnoreCase("red")) {
                        if (arg2.substring(i2 + 1, i2 + 4).equalsIgnoreCase("lre")) {
                            arg4 = 16748608;
                        } else if (!arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("yel")) {
                            if (!arg2.substring(1 + i2, i2 + 4).equalsIgnoreCase("gre")) {
                                if (!arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("blu")) {
                                    if (arg2.substring(1 + i2, 4 + i2).equalsIgnoreCase("cya")) {
                                        arg4 = 65535;
                                    } else if (arg2.substring(1 + i2, i2 + 4).equalsIgnoreCase("mag")) {
                                        arg4 = 0xFF00FF;
                                    } else if (!arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("whi")) {
                                        if (!arg2.substring(i2 + 1, i2 + 4).equalsIgnoreCase("bla")) {
                                            if (arg2.substring(1 + i2, i2 + 4).equalsIgnoreCase("dre")) {
                                                arg4 = 0xC00000;
                                            } else if (!arg2.substring(1 + i2, 4 + i2).equalsIgnoreCase("ora")) {
                                                if (!arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("ran")) {
                                                    if (arg2.substring(1 + i2, 4 + i2).equalsIgnoreCase("or1")) {
                                                        arg4 = 0xFFB000;
                                                    } else if (!arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("or2")) {
                                                        if (!arg2.substring(i2 + 1, i2 + 4).equalsIgnoreCase("or3")) {
                                                            if (arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("gr1")) {
                                                                arg4 = 0xC0FF00;
                                                            } else if (arg2.substring(1 + i2, 4 + i2).equalsIgnoreCase("gr2")) {
                                                                arg4 = 0x80FF00;
                                                            } else if (arg2.substring(i2 + 1, 4 + i2).equalsIgnoreCase("gr3")) {
                                                                arg4 = 0x40FF00;
                                                            }
                                                        } else {
                                                            arg4 = 0xFF3000;
                                                        }
                                                    } else {
                                                        arg4 = 0xFF7000;
                                                    }
                                                } else {
                                                    arg4 = (int)(1.6777215E7 * Math.random());
                                                }
                                            } else {
                                                arg4 = 16748608;
                                            }
                                        } else {
                                            arg4 = 0;
                                        }
                                    } else {
                                        arg4 = 0xFFFFFF;
                                    }
                                } else {
                                    arg4 = 255;
                                }
                            } else {
                                arg4 = 65280;
                            }
                        } else {
                            arg4 = 0xFFFF00;
                        }
                    } else {
                        arg4 = 0xFF0000;
                    }
                    i2 += 4;
                    continue;
                }
                if (arg2.charAt(i2) == '~' && arg2.length() > 4 + i2 && arg2.charAt(4 + i2) == '~') {
                    n4 = arg2.charAt(1 + i2);
                    n3 = arg2.charAt(2 + i2);
                    char c2 = arg2.charAt(i2 + 3);
                    if (n4 >= 48 && n4 <= 57 && n3 >= 48 && n3 <= 57 && c2 >= '0' && c2 <= '9') {
                        arg3 = Integer.parseInt(arg2.substring(i2 + 1, i2 + 4));
                    }
                    i2 += 4;
                    continue;
                }
                n4 = arg2.charAt(i2);
                if (n4 == 160) {
                    n4 = 32;
                }
                if (n4 < 0 || n.a.length <= n4) {
                    n4 = 32;
                }
                n3 = n.a[n4];
                if (this.xb && !fb.k[arg6] && arg4 != 0) {
                    this.a((byte)53, fb.k[arg6], byArray, 1 + arg3, 0, n3, arg1);
                }
                if (this.xb && !fb.k[arg6] && arg4 != 0) {
                    this.a((byte)101, fb.k[arg6], byArray, arg3, 0, n3, arg1 + 1);
                }
                this.a((byte)73, fb.k[arg6], byArray, arg3, arg4, n3, arg1);
                arg3 += byArray[n3 + 7];
            }
        }
        catch (Exception exception) {
            System.out.println("drawstring: " + exception);
            exception.printStackTrace();
        }
        ++w;
    }

    @Override
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        block0: {
            if (this.fb != arg0) break block0;
            this.fb = null;
        }
    }

    private final synchronized void b(boolean arg0) {
        block1: {
            if (this.fb == null) {
                return;
            }
            this.fb.setPixels(0, 0, this.u, this.k, this.nb, this.rb, 0, this.u);
            this.fb.imageComplete(2);
            if (arg0) break block1;
            this.startProduction(null);
        }
    }

    final void b(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < this.hb || this.lb <= arg0) {
            return;
        }
        if (this.A > arg1) {
            arg3 -= this.A + -arg1;
            arg1 = this.A;
        }
        if (this.Rb < arg1 + arg3) {
            arg3 = -arg1 + this.Rb;
        }
        if (arg3 <= arg4) {
            return;
        }
        int n2 = arg0 - -(this.u * arg1);
        for (int i2 = 0; i2 < arg3; ++i2) {
            this.rb[n2 - -(this.u * i2)] = arg2;
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int n2;
        if (this.Qb[arg0]) {
            arg2 += this.Sb[arg0];
            arg4 += this.G[arg0];
        }
        int n3 = this.u * arg4 + arg2;
        int n4 = arg1;
        int n5 = this.R[arg0];
        int n6 = this.kb[arg0];
        int n7 = this.u - n6;
        int n8 = 0;
        if (this.A > arg4) {
            n2 = -arg4 + this.A;
            arg4 = this.A;
            n5 -= n2;
            n4 += n2 * n6;
            n3 += n2 * this.u;
        }
        if (this.Rb <= n5 + arg4) {
            n5 -= 1 + (n5 + (arg4 + -this.Rb));
        }
        if (arg2 < this.hb) {
            n2 = this.hb + -arg2;
            n7 += n2;
            n8 += n2;
            n3 += n2;
            n4 += n2;
            arg2 = this.hb;
            n6 -= n2;
        }
        if (this.lb <= arg2 + n6) {
            n2 = -this.lb + (arg2 - (-n6 - 1));
            n7 += n2;
            n6 -= n2;
            n8 += n2;
        }
        if (n6 <= 0 || n5 <= 0) {
            return;
        }
        n2 = 1;
        if (!(!this.i)) {
            n8 += this.kb[arg0];
            n2 = 2;
            if ((1 & arg4) != 0) {
                --n5;
                n3 += this.u;
            }
            n7 += this.u;
        }
        if (this.ob[arg0] == null) {
            this.a(n4, n7, this.gb[arg0], n2, false, n5, n8, arg3, n6, this.rb, this.Y[arg0], n3);
        } else {
            this.a(n4, n5, n3, this.ob[arg0], 0, arg3, n2, this.rb, -107, n8, n7, n6);
        }
    }

    final void a(Graphics arg0, int arg1, int arg2, int arg3) {
        block0: {
            this.b(true);
            arg0.drawImage(this.Gb, arg1, arg3, this);
            if (arg2 == 256) break block0;
            Kb = null;
        }
    }

    final void a(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int n2;
            int n3;
            int n4;
            int n5 = this.kb[arg0];
            int n6 = this.R[arg0];
            int n7 = 0;
            int n8 = 0;
            int n9 = (n5 << 16) / arg4;
            int n10 = (n6 << 16) / arg2;
            if (this.Qb[arg0]) {
                n4 = this.Eb[arg0];
                n3 = this.qb[arg0];
                if (n4 == 0 || n3 == 0) {
                    return;
                }
                n10 = (n3 << 16) / arg2;
                arg5 += (n3 + arg2 * this.G[arg0] - 1) / n3;
                arg3 += (n4 + this.Sb[arg0] * arg4 - 1) / n4;
                n9 = (n4 << 16) / arg4;
                if (arg4 * this.Sb[arg0] % n4 != 0) {
                    n7 = (-(this.Sb[arg0] * arg4 % n4) + n4 << 16) / arg4;
                }
                if (this.G[arg0] * arg2 % n3 != 0) {
                    n8 = (n3 + -(this.G[arg0] * arg2 % n3) << 16) / arg2;
                }
                arg4 = arg4 * (this.kb[arg0] - (n7 >> 16)) / n4;
                arg2 = (-(n8 >> 16) + this.R[arg0]) * arg2 / n3;
            }
            n4 = arg5 * this.u + arg3;
            if (arg1 > -121) {
                return;
            }
            if (arg5 < this.A) {
                n2 = -arg5 + this.A;
                arg2 -= n2;
                arg5 = 0;
                n4 += this.u * n2;
                n8 += n10 * n2;
            }
            n3 = this.u + -arg4;
            if (this.hb > arg3) {
                n2 = -arg3 + this.hb;
                arg3 = 0;
                n7 += n2 * n9;
                n4 += n2;
                arg4 -= n2;
                n3 += n2;
            }
            if (this.Rb <= arg5 + arg2) {
                arg2 -= 1 + arg2 + (arg5 + -this.Rb);
            }
            if (this.lb <= arg3 + arg4) {
                n2 = 1 + arg3 + (arg4 - this.lb);
                n3 += n2;
                arg4 -= n2;
            }
            n2 = 1;
            if (!(!this.i)) {
                n10 += n10;
                n3 += this.u;
                if ((arg5 & 1) != 0) {
                    n4 += this.u;
                    --arg2;
                }
                n2 = 2;
            }
            this.a(n2, n8, arg4, (byte)-61, n10, n5, n9, arg2, n4, this.ob[arg0], 0, n7, n3, arg6, this.rb);
        }
        catch (Exception exception) {
            System.out.println("error in sprite clipping routine");
        }
    }

    private final void a(int arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        try {
            int n2 = -(arg6 >> 2);
            arg6 = -(arg6 & 3);
            for (int i2 = -arg5; i2 < 0; ++i2) {
                int n3;
                for (n3 = n2; n3 < 0; ++n3) {
                    if (arg8[arg7++] != 0) {
                        arg1[arg2++] = arg0;
                    } else {
                        ++arg2;
                    }
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                    } else {
                        arg1[arg2++] = arg0;
                    }
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                    } else {
                        arg1[arg2++] = arg0;
                    }
                    if (arg8[arg7++] != 0) {
                        arg1[arg2++] = arg0;
                        continue;
                    }
                    ++arg2;
                }
                for (n3 = arg6; n3 < 0; ++n3) {
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                        continue;
                    }
                    arg1[arg2++] = arg0;
                }
                arg7 += arg9;
                arg2 += arg4;
            }
        }
        catch (Exception exception) {
            System.out.println("plotletter: " + exception);
            exception.printStackTrace();
        }
    }

    private final void a(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        if (!arg7) {
            this.i = true;
        }
        int n2 = -(arg9 >> 2);
        arg9 = -(3 & arg9);
        for (int i2 = -arg6; i2 < 0; i2 += arg5) {
            byte by;
            int n3;
            for (n3 = n2; n3 < 0; ++n3) {
                if ((by = arg8[arg2++]) == 0) {
                    ++arg0;
                } else {
                    arg4[arg0++] = arg1[ib.a(by, 255)];
                }
                by = arg8[arg2++];
                if (by == 0) {
                    ++arg0;
                } else {
                    arg4[arg0++] = arg1[ib.a(by, 255)];
                }
                by = arg8[arg2++];
                if (by != 0) {
                    arg4[arg0++] = arg1[ib.a(255, by)];
                } else {
                    ++arg0;
                }
                by = arg8[arg2++];
                if (by != 0) {
                    arg4[arg0++] = arg1[ib.a(by, 255)];
                    continue;
                }
                ++arg0;
            }
            for (n3 = arg9; n3 < 0; ++n3) {
                if ((by = arg8[arg2++]) != 0) {
                    arg4[arg0++] = arg1[ib.a(by, 255)];
                    continue;
                }
                ++arg0;
            }
            arg0 += arg10;
            arg2 += arg3;
        }
    }

    final void b(int arg0, int arg1) {
        if (this.gb[arg0] == null) {
            return;
        }
        int n2 = this.kb[arg0] * this.R[arg0];
        byte[] byArray = this.gb[arg0];
        int[] nArray = this.Y[arg0];
        int[] nArray2 = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = nArray[0xFF & byArray[i2]];
            if (n3 == 0) {
                n3 = 1;
            } else if (n3 == 0xFF00FF) {
                n3 = 0;
            }
            nArray2[i2] = n3;
        }
        if (arg1 != -342059728) {
            this.Eb = null;
        }
        this.ob[arg0] = nArray2;
        this.gb[arg0] = null;
        this.Y[arg0] = null;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n2;
        int n3;
        int[] nArray;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = this.u;
        int n11 = this.k;
        if (this.Hb == null) {
            this.Hb = new int[512];
            for (n9 = 0; n9 < 256; ++n9) {
                this.Hb[n9] = (int)(Math.sin((double)n9 * 0.02454369) * 32768.0);
                this.Hb[256 + n9] = (int)(Math.cos((double)n9 * 0.02454369) * 32768.0);
            }
        }
        n9 = -this.Eb[arg0] / 2;
        int n12 = -this.qb[arg0] / 2;
        if (this.Qb[arg0]) {
            n9 += this.Sb[arg0];
            n12 += this.G[arg0];
        }
        int n13 = this.kb[arg0] + n9;
        int n14 = this.R[arg0] + n12;
        int n15 = n13;
        int n16 = n12;
        int n17 = n9;
        int n18 = n14;
        int n19 = this.Hb[arg5 &= 0xFF] * arg4;
        int n20 = this.Hb[arg5 + 256] * arg4;
        int n21 = arg2 + (n20 * n9 + n12 * n19 >> 22);
        int n22 = arg1 - -(-(n9 * n19) + n12 * n20 >> 22);
        int n23 = (n15 * n20 + n16 * n19 >> 22) + arg2;
        int n24 = arg1 + (n20 * n16 - n15 * n19 >> 22);
        int n25 = (n19 * n14 + n20 * n13 >> 22) + arg2;
        int n26 = (-(n19 * n13) + n20 * n14 >> 22) + arg1;
        int n27 = (n17 * n20 + n19 * n18 >> 22) + arg2;
        int n28 = arg1 - -(n18 * n20 - n17 * n19 >> 22);
        if (arg4 != 192 || (0x3F & client.ef) != (0x3F & arg5)) {
            if (arg4 == 128) {
                client.ef = arg5;
            } else {
                ++da.M;
            }
        } else {
            ++nb.g;
        }
        int n29 = n22;
        int n30 = n22;
        if (n29 > n24) {
            n29 = n24;
        } else if (n30 < n24) {
            n30 = n24;
        }
        if (n26 < n29) {
            n29 = n26;
        } else if (n26 > n30) {
            n30 = n26;
        }
        if (n28 < n29) {
            n29 = n28;
        } else if (n30 < n28) {
            n30 = n28;
        }
        if (n29 < this.A) {
            n29 = this.A;
        }
        if (this.Xb == null || this.Xb.length != n11 + 1) {
            this.tb = new int[n11 + 1];
            this.M = new int[1 + n11];
            this.t = new int[n11 + 1];
            this.Tb = new int[1 + n11];
            this.Wb = new int[1 + n11];
            this.Xb = new int[n11 + 1];
        }
        if (this.Rb < n30) {
            n30 = this.Rb;
        }
        for (n8 = n29; n30 >= n8; ++n8) {
            this.Xb[n8] = 99999999;
            this.t[n8] = -99999999;
        }
        int n31 = 0;
        int n32 = 0;
        int n33 = 0;
        int n34 = this.kb[arg0];
        n13 = n34 - 1;
        int n35 = this.R[arg0];
        n15 = n34 - 1;
        n9 = 0;
        n12 = 0;
        n16 = 0;
        n17 = 0;
        n14 = n35 - 1;
        n18 = n35 - 1;
        if (n22 > n28) {
            n7 = n22;
            n6 = n18 << 8;
            n8 = n28;
            n5 = n27 << 8;
        } else {
            n7 = n28;
            n8 = n22;
            n6 = n12 << 8;
            n5 = n21 << 8;
        }
        if (n28 != n22) {
            n33 = (-n12 + n18 << 8) / (n28 + -n22);
            n31 = (-n21 + n27 << 8) / (n28 - n22);
        }
        if (n8 < 0) {
            n5 -= n31 * n8;
            n6 -= n8 * n33;
            n8 = 0;
        }
        if (n7 > n11 - 1) {
            n7 = n11 - 1;
        }
        if (arg3 != 842218000) {
            return;
        }
        for (n4 = n8; n4 <= n7; ++n4) {
            this.Xb[n4] = this.t[n4] = n5;
            n5 += n31;
            nArray = this.M;
            this.Tb[n4] = 0;
            n3 = n4;
            nArray[n3] = 0;
            this.tb[n4] = this.Wb[n4] = n6;
            n6 += n33;
        }
        if (n22 != n24) {
            n31 = (n23 + -n21 << 8) / (-n22 + n24);
            n32 = (-n9 + n15 << 8) / (-n22 + n24);
        }
        if (n24 < n22) {
            n2 = n15 << 8;
            n7 = n22;
            n8 = n24;
            n5 = n23 << 8;
        } else {
            n5 = n21 << 8;
            n8 = n22;
            n2 = n9 << 8;
            n7 = n24;
        }
        if (n11 - 1 < n7) {
            n7 = n11 - 1;
        }
        if (n8 < 0) {
            n2 -= n32 * n8;
            n5 -= n31 * n8;
            n8 = 0;
        }
        for (n4 = n8; n7 >= n4; ++n4) {
            if (n5 < this.Xb[n4]) {
                this.Xb[n4] = n5;
                this.M[n4] = n2;
                this.tb[n4] = 0;
            }
            if (this.t[n4] < n5) {
                this.t[n4] = n5;
                this.Tb[n4] = n2;
                this.Wb[n4] = 0;
            }
            n5 += n31;
            n2 += n32;
        }
        if (n24 <= n26) {
            n2 = n15 << 8;
            n6 = n16 << 8;
            n8 = n24;
            n5 = n23 << 8;
            n7 = n26;
        } else {
            n2 = n13 << 8;
            n7 = n24;
            n6 = n14 << 8;
            n5 = n25 << 8;
            n8 = n26;
        }
        if (n24 != n26) {
            n33 = (-n16 + n14 << 8) / (-n24 + n26);
            n31 = (-n23 + n25 << 8) / (n26 + -n24);
        }
        if (n7 > n11 - 1) {
            n7 = n11 - 1;
        }
        if (n8 < 0) {
            n5 -= n31 * n8;
            n6 -= n33 * n8;
            n8 = 0;
        }
        for (n4 = n8; n7 >= n4; ++n4) {
            if (n5 < this.Xb[n4]) {
                this.Xb[n4] = n5;
                this.M[n4] = n2;
                this.tb[n4] = n6;
            }
            if (n5 > this.t[n4]) {
                this.t[n4] = n5;
                this.Tb[n4] = n2;
                this.Wb[n4] = n6;
            }
            n5 += n31;
            n6 += n33;
        }
        if (n26 != n28) {
            n31 = (n27 + -n25 << 8) / (n28 + -n26);
            n32 = (n17 + -n13 << 8) / (-n26 + n28);
        }
        if (n26 > n28) {
            n2 = n17 << 8;
            n7 = n26;
            n8 = n28;
            n6 = n18 << 8;
            n5 = n27 << 8;
        } else {
            n8 = n26;
            n6 = n14 << 8;
            n5 = n25 << 8;
            n2 = n13 << 8;
            n7 = n28;
        }
        if (n8 < 0) {
            n5 -= n8 * n31;
            n2 -= n8 * n32;
            n8 = 0;
        }
        if (n11 - 1 < n7) {
            n7 = n11 - 1;
        }
        for (n4 = n8; n7 >= n4; ++n4) {
            if (this.Xb[n4] > n5) {
                this.Xb[n4] = n5;
                this.M[n4] = n2;
                this.tb[n4] = n6;
            }
            if (this.t[n4] < n5) {
                this.t[n4] = n5;
                this.Tb[n4] = n2;
                this.Wb[n4] = n6;
            }
            n5 += n31;
            n2 += n32;
        }
        n4 = n29 * n10;
        nArray = this.ob[arg0];
        for (n3 = n29; n30 > n3; ++n3) {
            int n36 = this.t[n3] >> 8;
            int n37 = this.Xb[n3] >> 8;
            if (n36 + -n37 <= 0) {
                n4 += n10;
                continue;
            }
            int n38 = this.M[n3] << 9;
            int n39 = ((this.Tb[n3] << 9) - n38) / (n36 - n37);
            int n40 = this.tb[n3] << 9;
            int n41 = (-n40 + (this.Wb[n3] << 9)) / (-n37 + n36);
            if (this.lb < n36) {
                n36 = this.lb;
            }
            if (n37 < this.hb) {
                n40 += (-n37 + this.hb) * n41;
                n38 += (this.hb + -n37) * n39;
                n37 = this.hb;
            }
            if (!this.i || (n3 & 1) == 0) {
                if (this.Qb[arg0]) {
                    this.a(n41, -n36 + n37, n38, nArray, this.rb, n40, n37 + n4, n34, n39, 0, (byte)102);
                } else {
                    this.a(-n36 + n37, n34, 0, this.rb, n39, n40, n38, nArray, n41, n37 + n4, true);
                }
            }
            n4 += n10;
        }
        if (e.Ab != 0) {
            client.vh = true;
        }
    }

    final void d(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.kb[arg0] = arg3;
        this.R[arg0] = arg1;
        if (arg2 <= 108) {
            return;
        }
        this.Qb[arg0] = false;
        this.Sb[arg0] = 0;
        this.G[arg0] = 0;
        this.Eb[arg0] = arg3;
        this.qb[arg0] = arg1;
        int n2 = arg3 * arg1;
        this.ob[arg0] = new int[n2];
        int n3 = 0;
        for (int i2 = arg4; arg1 + arg4 > i2; ++i2) {
            for (int i3 = arg5; i3 < arg3 + arg5; ++i3) {
                this.ob[arg0][n3++] = this.rb[this.u * i2 + i3];
            }
        }
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13, int arg14) {
        int n2 = (arg13 & 0xFF5F75) >> 16;
        int n3 = 0xFF & arg13 >> 8;
        int n4 = 0xFF & arg13;
        try {
            int n5 = arg3;
            if (arg10) {
                this.Tb = null;
            }
            for (int i2 = -arg12; i2 < 0; i2 += arg14) {
                int n6 = (arg0 >> 16) * arg9;
                for (int i3 = -arg2; i3 < 0; ++i3) {
                    arg8 = arg5[n6 + (arg3 >> 16)];
                    if (arg8 != 0) {
                        int n7 = arg8 >> 16 & 0xFF;
                        int n8 = (0xFF60 & arg8) >> 8;
                        int n9 = 0xFF & arg8;
                        arg7[arg6++] = n8 != n7 || n8 != n9 ? arg8 : (n7 * n2 >> 8 << 16) + ((n3 * n8 >> 8 << 8) + (n9 * n4 >> 8));
                    } else {
                        ++arg6;
                    }
                    arg3 += arg1;
                }
                arg0 += arg11;
                arg6 += arg4;
                arg3 = n5;
            }
        }
        catch (Exception exception) {
            System.out.println("error in plot_scale");
        }
    }

    final void d(int arg0, int arg1) {
        this.D = arg1;
    }

    private final void a(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        if (arg0 != 11815) {
            return;
        }
        this.a(arg3, arg6, arg4, arg5 - this.a(arg2, 92, arg4) / 2, arg1, (byte)-124, arg2);
    }

    private final void a(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        int n2 = 256 - arg13;
        try {
            int n3 = arg11;
            if (arg3 != -61) {
                return;
            }
            for (int i2 = -arg7; i2 < 0; i2 += arg0) {
                int n4 = arg5 * (arg1 >> 16);
                arg1 += arg4;
                for (int i3 = -arg2; i3 < 0; ++i3) {
                    arg10 = arg9[n4 + (arg11 >> 16)];
                    arg11 += arg6;
                    if (arg10 == 0) {
                        ++arg8;
                        continue;
                    }
                    int n5 = arg14[arg8];
                    arg14[arg8++] = ib.a(ib.a(65280, n5) * n2 + ib.a(65280, arg10) * arg13, 0xFF0000) + ib.a(ib.a(arg10, 0xFF00FF) * arg13 + n2 * ib.a(0xFF00FF, n5), -16711936) >> 8;
                }
                arg8 += arg12;
                arg11 = n3;
            }
        }
        catch (Exception exception) {
            System.out.println("error in tran_scale");
        }
    }

    private final void a(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        block10: {
            int n2 = (0xFF1712 & arg15) >> 16;
            int n3 = (arg15 & 0xFFEE) >> 8;
            int n4 = 0xFF & arg15;
            try {
                int n5 = arg5;
                for (int i2 = -arg8; i2 < 0; ++i2) {
                    int n6;
                    int n7 = (arg4 >> 16) * arg13;
                    int n8 = arg12 >> 16;
                    int n9 = arg6;
                    if (n8 < this.hb) {
                        n6 = this.hb + -n8;
                        n8 = this.hb;
                        n9 -= n6;
                        arg5 += arg11 * n6;
                    }
                    arg14 = -arg14 + 1;
                    if (this.lb <= n8 - -n9) {
                        n6 = n9 + n8 + -this.lb;
                        n9 -= n6;
                    }
                    if (arg14 != 0) {
                        for (n6 = n8; n6 < n9 + n8; ++n6) {
                            arg3 = arg1[n7 + (arg5 >> 16)];
                            if (arg3 != 0) {
                                int n10 = arg3 & 0xFF;
                                int n11 = 0xFF & arg3 >> 8;
                                int n12 = (arg3 & 0xFFE317) >> 16;
                                if (n11 == n12 && n10 == n11) {
                                    arg7[arg10 + n6] = (n10 * n4 >> 8) + (n3 * n11 >> 8 << 8) + (n2 * n12 >> 8 << 16);
                                } else {
                                    arg7[n6 + arg10] = arg3;
                                }
                            }
                            arg5 += arg11;
                        }
                    }
                    arg4 += arg2;
                    arg5 = n5;
                    arg12 += arg9;
                    arg10 += this.u;
                }
            }
            catch (Exception exception) {
                System.out.println("error in transparent sprite plot routine");
            }
            if (arg0 >= 20) break block10;
            this.t = null;
        }
    }

    final int a(int arg0, int arg1) {
        if (arg0 != 508305352) {
            this.G = null;
        }
        if (arg1 == 0) {
            return 12;
        }
        if (arg1 == 1) {
            return 14;
        }
        if (arg1 == 2) {
            return 14;
        }
        if (arg1 == 3) {
            return 15;
        }
        if (arg1 == 4) {
            return 15;
        }
        if (arg1 == 5) {
            return 19;
        }
        if (arg1 == 6) {
            return 24;
        }
        if (arg1 == 7) {
            return 29;
        }
        return this.c(60, arg1);
    }

    private final void a(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        int n2 = (0xFF262A & arg1) >> 16;
        int n3 = (0xFF9D & arg1) >> 8;
        int n4 = arg1 & 0xFF;
        try {
            int n5 = arg13;
            for (int i2 = -arg16; i2 < 0; ++i2) {
                int n6;
                int n7 = (arg6 >> 16) * arg5;
                int n8 = arg8 >> 16;
                int n9 = arg15;
                if (this.hb > n8) {
                    n6 = this.hb + -n8;
                    n8 = this.hb;
                    n9 -= n6;
                    arg13 += n6 * arg9;
                }
                if (this.lb <= n9 + n8) {
                    n6 = n8 + (n9 - this.lb);
                    n9 -= n6;
                }
                arg11 = 1 + -arg11;
                arg6 += arg7;
                if (arg11 != 0) {
                    for (n6 = n8; n9 + n8 > n6; ++n6) {
                        arg2 = arg0[(arg13 >> 16) - -n7] & 0xFF;
                        if (arg2 != 0) {
                            arg2 = arg4[arg2];
                            int n10 = arg2 & 0xFF;
                            int n11 = arg2 >> 8 & 0xFF;
                            int n12 = arg2 >> 16 & 0xFF;
                            if (n11 != n12 || n11 != n10) {
                                arg10[arg14 + n6] = arg2;
                            } else {
                                arg10[n6 - -arg14] = (n3 * n11 >> 8 << 8) + (n2 * n12 >> 8 << 16) - -(n4 * n10 >> 8);
                            }
                        }
                        arg13 += arg9;
                    }
                }
                arg8 += arg3;
                arg14 += this.u;
                arg13 = n5;
            }
        }
        catch (Exception exception) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private final void a(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        block0: {
            this.a(arg6, arg1, arg2, arg0 - this.a(arg5, 114, arg2), arg3, (byte)123, arg5);
            if (arg4 == -12200) break block0;
            this.b(75, -128, -127, 3, 49, -124);
        }
    }

    private final void a(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg6 != 1504725224) {
            this.rb = null;
        }
        for (int i2 = -arg4; i2 < 0; ++i2) {
            for (int i3 = -arg2; i3 < 0; ++i3) {
                int n2;
                if ((n2 = 0xFF & arg0[arg9++]) <= 30) {
                    ++arg3;
                    continue;
                }
                if (n2 < 230) {
                    int n3 = arg8[arg3];
                    arg8[arg3++] = ib.a(-16711936, ib.a(0xFF00FF, arg1) * n2 - -(ib.a(n3, 0xFF00FF) * (-n2 + 256))) - -ib.a((256 - n2) * ib.a(65280, n3) + n2 * ib.a(65280, arg1), 0xFF0000) >> 8;
                    continue;
                }
                arg8[arg3++] = arg1;
            }
            arg9 += arg5;
            arg3 += arg7;
        }
    }

    final void a(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        this.a(11815, arg2, arg4, arg3, arg1, arg0, arg5);
    }

    final void a(byte arg0, byte[] arg1, int arg2) {
        int n2;
        int n3;
        this.ob[arg2] = new int[10200];
        int[] nArray = this.ob[arg2];
        this.kb[arg2] = 255;
        this.R[arg2] = 40;
        this.Sb[arg2] = 0;
        this.G[arg2] = 0;
        if (arg0 != -118) {
            this.a(82, -105, -7, 8, 9);
        }
        this.Eb[arg2] = 255;
        this.qb[arg2] = 40;
        this.Qb[arg2] = false;
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        while (n6 < 255) {
            n3 = 0xFF & arg1[n5++];
            for (n2 = 0; n3 > n2; ++n2) {
                nArray[n6++] = n4;
            }
            n4 = -n4 + 0xFFFFFF;
        }
        for (n3 = 1; n3 < 40; ++n3) {
            n2 = 0;
            while (n2 < 255) {
                int n7 = arg1[n5++] & 0xFF;
                for (int i2 = 0; i2 < n7; ++i2) {
                    nArray[n6] = nArray[n6 - 255];
                    ++n6;
                    ++n2;
                }
                if (n2 >= 255) continue;
                nArray[n6] = 0xFFFFFF - nArray[n6 - 255];
                ++n6;
                ++n2;
            }
        }
    }

    final void a(boolean arg0, int arg1) {
        int n2;
        int n3;
        int n4;
        int n5 = this.R[arg1] * this.kb[arg1];
        int[] nArray = this.ob[arg1];
        int[] nArray2 = new int[32768];
        if (arg0) {
            this.a(-63, 58, -7, -36, -99);
        }
        for (int i2 = 0; i2 < n5; ++i2) {
            int n6 = nArray[i2];
            int n7 = (0x1F & n6 >> 3) + ((n6 >> 9 & 0x7C00) + ((n6 & 0xF800) >> 6));
            nArray2[n7] = nArray2[n7] + 1;
        }
        int[] nArray3 = new int[256];
        nArray3[0] = 0xFF00FF;
        int[] nArray4 = new int[256];
        for (int i3 = 0; i3 < 32768; ++i3) {
            n4 = nArray2[i3];
            if (nArray4[255] < n4) {
                for (n3 = 1; n3 < 256; ++n3) {
                    if (nArray4[n3] >= n4) continue;
                    for (n2 = 255; n3 < n2; --n2) {
                        nArray3[n2] = nArray3[n2 - 1];
                        nArray4[n2] = nArray4[n2 - 1];
                    }
                    nArray3[n3] = 263172 + ((ib.a(31, i3) << 3) + ib.a(63488, i3 << 6) + ib.a(0xF80000, i3 << 9));
                    nArray4[n3] = n4;
                    break;
                }
            }
            nArray2[i3] = -1;
        }
        byte[] byArray = new byte[n5];
        for (n4 = 0; n5 > n4; ++n4) {
            n3 = nArray[n4];
            n2 = (n3 >> 3 & 0x1F) + ((n3 & 0xF800) >> 6) + ((0xF80000 & n3) >> 9);
            int n8 = nArray2[n2];
            if (n8 == -1) {
                int n9 = 999999999;
                int n10 = 0xFF & n3 >> 16;
                int n11 = 0xFF & n3 >> 8;
                int n12 = n3 & 0xFF;
                for (int i4 = 0; i4 < 256; ++i4) {
                    int n13 = nArray3[i4];
                    int n14 = 0xFF & n13;
                    int n15 = (0xFF1E98 & n13) >> 16;
                    int n16 = n13 >> 8 & 0xFF;
                    int n17 = (-n14 + n12) * (-n14 + n12) + ((n10 - n15) * (n10 - n15) - -((-n16 + n11) * (-n16 + n11)));
                    if (n17 >= n9) continue;
                    n8 = i4;
                    n9 = n17;
                }
                nArray2[n2] = n8;
            }
            byArray[n4] = (byte)n8;
        }
        this.gb[arg1] = byArray;
        this.Y[arg1] = nArray3;
        this.ob[arg1] = null;
    }

    final void a(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            int n2 = 0;
            byte[] byArray = m.b[arg4];
            if (arg3 < 44) {
                return;
            }
            int n3 = 0;
            int n4 = 0;
            for (int i2 = 0; arg1.length() > i2; ++i2) {
                if (arg1.charAt(i2) != '@' || arg1.length() <= 4 + i2 || arg1.charAt(i2 + 4) != '@') {
                    if (arg1.charAt(i2) != '~' || arg1.length() <= 4 + i2 || arg1.charAt(4 + i2) != '~') {
                        int n5 = arg1.charAt(i2);
                        if (n5 < 0 || n5 >= n.a.length) {
                            n5 = 32;
                        }
                        n2 += byArray[7 + n.a[n5]];
                    } else {
                        i2 += 4;
                    }
                } else {
                    i2 += 4;
                }
                if (arg1.charAt(i2) == ' ') {
                    n4 = i2;
                }
                if (arg1.charAt(i2) == '%' && arg6) {
                    n2 = 1000;
                    n4 = i2;
                }
                if (n2 <= arg0) continue;
                if (n4 <= n3) {
                    n4 = i2;
                }
                n2 = 0;
                this.a(11815, arg7, arg4, 0, arg1.substring(n3, n4), arg2, arg5);
                n3 = i2 = 1 + n4;
                arg5 += this.a(508305352, arg4);
            }
            if (n2 > 0) {
                this.a(11815, arg7, arg4, 0, arg1.substring(n3), arg2, arg5);
            }
        }
        catch (Exception exception) {
            System.out.println("centrepara: " + exception);
            exception.printStackTrace();
        }
    }

    final void a(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        block23: {
            try {
                int n2;
                int n3;
                if (arg2 == 0) {
                    arg2 = 0xFFFFFF;
                }
                if (arg1 == 0) {
                    arg1 = 0xFFFFFF;
                }
                int n4 = this.kb[arg5];
                int n5 = this.R[arg5];
                int n6 = 0;
                int n7 = 0;
                int n8 = arg4 << 16;
                int n9 = (n4 << 16) / arg7;
                int n10 = (n5 << 16) / arg6;
                int n11 = -(arg4 << 16) / arg6;
                if (this.Qb[arg5]) {
                    n3 = this.Eb[arg5];
                    n2 = this.qb[arg5];
                    if (n3 == 0 || n2 == 0) {
                        return;
                    }
                    n9 = (n3 << 16) / arg7;
                    n10 = (n2 << 16) / arg6;
                    int n12 = this.Sb[arg5];
                    if (arg3) {
                        n12 = n3 + -this.kb[arg5] - n12;
                    }
                    int n13 = this.G[arg5];
                    arg8 += (n3 + n12 * arg7 - 1) / n3;
                    int n14 = (n13 * arg6 + n2 - 1) / n2;
                    if (n12 * arg7 % n3 != 0) {
                        n6 = (-(arg7 * n12 % n3) + n3 << 16) / arg7;
                    }
                    arg0 += n14;
                    n8 += n14 * n11;
                    if (n13 * arg6 % n2 != 0) {
                        n7 = (n2 - arg6 * n13 % n2 << 16) / arg6;
                    }
                    arg7 = (n9 + ((this.kb[arg5] << 16) - (n6 + 1))) / n9;
                    arg6 = ((this.R[arg5] << 16) + -n7 - (-n10 + 1)) / n10;
                }
                n3 = this.u * arg0;
                n8 += arg8 << 16;
                if (arg0 < this.A) {
                    n2 = this.A + -arg0;
                    n8 += n11 * n2;
                    arg6 -= n2;
                    n7 += n2 * n10;
                    n3 += this.u * n2;
                    arg0 = this.A;
                }
                if (arg0 - -arg6 >= this.Rb) {
                    arg6 -= 1 + (arg0 + arg6) - this.Rb;
                }
                n2 = n3 / this.u & arg9;
                if (!this.i) {
                    n2 = 2;
                }
                if (arg2 == 0xFFFFFF) {
                    if (this.ob[arg5] != null) {
                        if (arg3) {
                            this.a(arg9 ^ 0x4A, this.ob[arg5], n10, 0, n7, (this.kb[arg5] << 16) + (-n6 - 1), arg7, this.rb, arg6, n11, n3, -n9, n8, n4, n2, arg1);
                        } else {
                            this.a(arg9 + 89, this.ob[arg5], n10, 0, n7, n6, arg7, this.rb, arg6, n11, n3, n9, n8, n4, n2, arg1);
                        }
                    } else if (!arg3) {
                        this.a(this.gb[arg5], arg1, 0, n11, this.Y[arg5], n4, n7, n10, n8, n9, this.rb, n2, -110, n6, n3, arg7, arg6);
                    } else {
                        this.a(this.gb[arg5], arg1, 0, n11, this.Y[arg5], n4, n7, n10, n8, -n9, this.rb, n2, arg9 ^ 0xFFFFFF84, -n6 + (this.kb[arg5] << 16) - 1, n3, arg7, arg6);
                    }
                    break block23;
                }
                if (this.ob[arg5] == null) {
                    if (arg3) {
                        this.a(arg6, this.Y[arg5], n4, n10, 0, n11, n3, n7, this.gb[arg5], n2, (byte)76, -n6 + ((this.kb[arg5] << 16) - 1), arg2, n8, -n9, arg7, this.rb, arg1);
                    } else {
                        this.a(arg6, this.Y[arg5], n4, n10, 0, n11, n3, n7, this.gb[arg5], n2, (byte)78, n6, arg2, n8, n9, arg7, this.rb, arg1);
                    }
                    break block23;
                }
                if (arg3) {
                    this.a(this.rb, this.ob[arg5], arg7, n11, n8, arg9 + 1603920391, 0, arg2, n10, -n9, -n6 + (this.kb[arg5] << 16) - 1, n2, n7, n4, arg1, arg6, n3);
                    break block23;
                }
                this.a(this.rb, this.ob[arg5], arg7, n11, n8, 1603920392, 0, arg2, n10, n9, n6, n2, n7, n4, arg1, arg6, n3);
            }
            catch (Exception exception) {
                System.out.println("error in sprite clipping routine");
            }
        }
    }

    @Override
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @Override
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.fb == arg0;
    }

    private final void a(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg6 <= 122) {
            this.e(121, 54, -117, -34, 67, -103);
        }
        int n2 = -(arg0 >> 2);
        arg0 = -(3 & arg0);
        for (int i2 = -arg3; i2 < 0; i2 += arg2) {
            int n3;
            for (n3 = n2; n3 < 0; ++n3) {
                if ((arg4 = arg8[arg5++]) == 0) {
                    ++arg7;
                } else {
                    arg1[arg7++] = arg4;
                }
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                } else {
                    arg1[arg7++] = arg4;
                }
                arg4 = arg8[arg5++];
                if (arg4 != 0) {
                    arg1[arg7++] = arg4;
                } else {
                    ++arg7;
                }
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                    continue;
                }
                arg1[arg7++] = arg4;
            }
            for (n3 = arg0; n3 < 0; ++n3) {
                if ((arg4 = arg8[arg5++]) == 0) {
                    ++arg7;
                    continue;
                }
                arg1[arg7++] = arg4;
            }
            arg5 += arg10;
            arg7 += arg9;
        }
    }

    final void a(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (this.k < arg2) {
            arg2 = this.k;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (this.u < arg1) {
            arg1 = this.u;
        }
        if (arg4 <= 15) {
            C = 109;
        }
        this.A = arg3;
        this.Rb = arg2;
        this.lb = arg1;
        this.hb = arg0;
    }

    final void a(boolean arg0) {
        int n2 = this.k * this.u;
        if (arg0 == !this.i) {
            for (int i2 = 0; n2 > i2; ++i2) {
                this.rb[i2] = 0;
            }
        } else {
            int n3 = 0;
            for (int i3 = -this.k; i3 < 0; i3 += 2) {
                for (int i4 = -this.u; i4 < 0; ++i4) {
                    this.rb[n3++] = 0;
                }
                n3 += this.u;
            }
        }
    }

    final void a(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.hb) {
            arg5 -= this.hb + -arg0;
            arg0 = this.hb;
        }
        if (this.A > arg3) {
            arg4 -= -arg3 + this.A;
            arg3 = this.A;
        }
        if (arg3 + arg4 > this.Rb) {
            arg4 = -arg3 + this.Rb;
        }
        if (arg5 + arg0 > this.lb) {
            arg5 = -arg0 + this.lb;
        }
        int n2 = this.u + -arg5;
        int n3 = 1;
        if (this.i) {
            n2 += this.u;
            if ((arg3 & 1) != 0) {
                --arg4;
                ++arg3;
            }
            n3 = 2;
        }
        int n4 = arg0 - -(this.u * arg3);
        for (int i2 = -arg4; i2 < 0; i2 += n3) {
            for (int i3 = -arg5; i3 < 0; ++i3) {
                this.rb[n4++] = arg2;
            }
            n4 += n2;
        }
    }

    final void a(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        block0: {
            this.a(0, arg2, arg0, arg1, arg3, (byte)124, arg5);
            if (!arg4) break block0;
            this.a(-43, 36, -60, -88, 93, null, 114, null, -53, 59, true, 66, 34, 34, 70);
        }
    }

    final void a(int arg0) {
        this.lb = this.u;
        if (arg0 != -1) {
            this.Sb = null;
        }
        this.hb = 0;
        this.A = 0;
        this.Rb = this.k;
    }

    final void a(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4) {
        int n2;
        int n3 = d.a(0, (byte)41, arg2);
        int n4 = d.a(n3, (byte)48, arg4);
        n3 += 2;
        if (arg3 < 49) {
            this.b(-97, -40, 4, -57, 24, 50, 82);
        }
        int n5 = d.a(n3, (byte)15, arg4);
        n3 += 2;
        int n6 = arg4[n3++] & 0xFF;
        int[] nArray = new int[n6];
        nArray[0] = 0xFF00FF;
        for (n2 = 0; n6 - 1 > n2; ++n2) {
            nArray[n2 + 1] = (ib.a(255, arg4[n3]) << 16) - -ib.a(65280, arg4[n3 + 1] << 8) + ib.a(arg4[n3 + 2], 255);
            n3 += 3;
        }
        n2 = 2;
        for (int i2 = arg0; i2 < arg0 + arg1; ++i2) {
            int n7;
            this.Sb[i2] = ib.a(arg4[n3++], 255);
            this.G[i2] = ib.a(arg4[n3++], 255);
            this.kb[i2] = d.a(n3, (byte)32, arg4);
            this.R[i2] = d.a(n3 += 2, (byte)83, arg4);
            n3 += 2;
            int n8 = arg4[n3++] & 0xFF;
            int n9 = this.R[i2] * this.kb[i2];
            this.gb[i2] = new byte[n9];
            this.Y[i2] = nArray;
            this.Eb[i2] = n4;
            this.qb[i2] = n5;
            this.ob[i2] = null;
            this.Qb[i2] = false;
            if (this.Sb[i2] != 0 || this.G[i2] != 0) {
                this.Qb[i2] = true;
            }
            if (n8 != 0) {
                if (n8 != 1) continue;
                for (n7 = 0; this.kb[i2] > n7; ++n7) {
                    for (int i3 = 0; this.R[i2] > i3; ++i3) {
                        this.gb[i2][i3 * this.kb[i2] + n7] = arg2[n2++];
                        if (this.gb[i2][n7 + i3 * this.kb[i2]] != 0) continue;
                        this.Qb[i2] = true;
                    }
                }
                continue;
            }
            for (n7 = 0; n9 > n7; ++n7) {
                this.gb[i2][n7] = arg2[n2++];
                if (this.gb[i2][n7] != 0) continue;
                this.Qb[i2] = true;
            }
        }
    }

    ua(int arg0, int arg1, int arg2, Component arg3) {
        block1: {
            this.xb = false;
            this.A = 0;
            this.i = false;
            this.hb = 0;
            this.lb = 0;
            this.Rb = 0;
            this.Y = new int[arg2][];
            this.ob = new int[arg2][];
            this.Rb = arg1;
            this.gb = new byte[arg2][];
            this.Qb = new boolean[arg2];
            this.lb = arg0;
            this.Eb = new int[arg2];
            this.rb = new int[arg0 * arg1];
            this.Sb = new int[arg2];
            this.G = new int[arg2];
            this.qb = new int[arg2];
            this.R = new int[arg2];
            this.kb = new int[arg2];
            this.k = arg1;
            this.u = arg0;
            if (arg0 <= 1 || arg1 <= 1 || arg3 == null) break block1;
            this.nb = new DirectColorModel(32, 0xFF0000, 65280, 255);
            int n2 = this.k * this.u;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.rb[i2] = 0;
            }
            this.Gb = arg3.createImage(this);
            this.b(true);
            arg3.prepareImage(this.Gb, arg3);
            this.b(true);
            arg3.prepareImage(this.Gb, arg3);
            this.b(true);
            arg3.prepareImage(this.Gb, arg3);
        }
    }

    static {
        C = 114;
        wb = new String[100];
        Kb = new String[]{"Enter number of items to remove and press enter"};
        h = new String[200];
    }
}

