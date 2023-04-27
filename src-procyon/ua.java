import java.util.*;
import java.awt.*;
import java.awt.image.*;

class ua implements ImageProducer, ImageObserver
{
    private int[] G;
    private int[] tb;
    private int[] Sb;
    boolean xb;
    int[] qb;
    boolean i;
    private int[] Xb;
    static v E;
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
    
    final void e(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        this.b(arg1, arg5, arg0, arg2, (byte)115);
        if (arg3 != 27785) {
            return;
        }
        this.b(arg1, arg5, arg0, arg4 - 1 + arg2, (byte)(-117));
        this.b(arg0, arg2, arg5, arg4, 0);
        this.b(arg1 + arg0 - 1, arg2, arg5, arg4, 0);
    }
    
    final void b(int arg0, final int arg1, int arg2, final int arg3, int arg4, int arg5, final int arg6) {
        if (this.hb > arg0) {
            arg2 -= -arg0 + this.hb;
            arg0 = this.hb;
        }
        if (this.lb < arg2 + arg0) {
            arg2 = -arg0 + this.lb;
        }
        final int n = (arg3 & 0xFF8DC6) >> 16;
        final int n2 = arg3 >> 8 & 0xFF;
        final int n3 = arg3 & 0xFF;
        final int n4 = (arg1 & 0xFFDB64) >> 16;
        final int n5 = arg1 >> 8 & 0xFF;
        final int n6 = arg1 & 0xFF;
        int n7 = -arg2 + this.u;
        int n8 = 1;
        if (!(!this.i)) {
            n7 += this.u;
            n8 = 2;
            if ((arg5 & 0x1) != 0x0) {
                ++arg5;
                --arg4;
            }
        }
        if (arg6 != 19020) {
            this.a(-124, 53, -53, -76, (byte)(-44));
        }
        int n9 = arg0 - -(this.u * arg5);
        for (int n10 = 0; arg4 > n10; n10 += n8) {
            if (n10 + arg5 >= this.A && arg5 + n10 < this.Rb) {
                final int n11 = ((n2 * n10 + n5 * (-n10 + arg4)) / arg4 << 8) + ((n4 * (-n10 + arg4) + n * n10) / arg4 << 16) + (n10 * n3 - -(n6 * (-n10 + arg4))) / arg4;
                for (int i = -arg2; i < 0; ++i) {
                    this.rb[n9++] = n11;
                }
                n9 += n7;
            }
            else {
                n9 += this.u;
            }
        }
    }
    
    private final void a(final int[] arg0, final int arg1, final int arg2, int arg3, int arg4, final int[] arg5, final byte arg6, final int arg7, final int arg8, int arg9, final int arg10, final int arg11, final int arg12, int arg13) {
        try {
            final int n = arg9;
            for (int i = -arg8; i < 0; i += arg1) {
                final int n2 = (arg4 >> 16) * arg12;
                arg4 += arg7;
                for (int j = -arg11; j < 0; ++j) {
                    arg3 = arg0[(arg9 >> 16) - -n2];
                    arg9 += arg2;
                    if (arg3 != 0) {
                        arg5[arg13++] = arg3;
                    }
                    else {
                        ++arg13;
                    }
                }
                arg13 += arg10;
                arg9 = n;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in plot_scale");
        }
    }
    
    private final void a(int arg0, final int arg1, int arg2, final int[] arg3, int arg4, final int arg5, final int arg6, final int[] arg7, final int arg8, final int arg9, final int arg10, final int arg11) {
        final int n = 256 - arg5;
        if (arg8 > -54) {
            return;
        }
        for (int i = -arg1; i < 0; i += arg6) {
            for (int j = -arg11; j < 0; ++j) {
                arg4 = arg3[arg0++];
                if (arg4 == 0) {
                    ++arg2;
                }
                else {
                    final int n2 = arg7[arg2];
                    arg7[arg2++] = ib.a(16711680, arg5 * ib.a(arg4, 65280) + n * ib.a(65280, n2)) + ib.a(n * ib.a(n2, 16711935) + ib.a(arg4, 16711935) * arg5, -16711936) >> 8;
                }
            }
            arg0 += arg9;
            arg2 += arg10;
        }
    }
    
    final void b(final int arg0, final String arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        this.a(arg0, arg2, arg1, arg3, -12200, arg5, 0);
    }
    
    static final void a(int arg0, final int[] arg1, final int arg2, final int[] arg3, int arg4, int arg5, int arg6, final int arg7) {
        if (arg2 >= 0) {
            return;
        }
        arg4 = arg1[(0xFFA7 & arg0) >> 8];
        arg5 <<= 2;
        arg0 += arg5;
        for (int i = arg2 / 16; i < 0; ++i) {
            arg3[arg6++] = arg4 - -ib.a(8355711, arg3[arg6] >> 1);
            arg3[arg6++] = arg4 + ib.a(8355711, arg3[arg6] >> 1);
            arg3[arg6++] = arg4 + (ib.a(arg3[arg6], 16711423) >> 1);
            arg3[arg6++] = (ib.a(16711423, arg3[arg6]) >> 1) + arg4;
            arg4 = arg1[0xFF & arg0 >> 8];
            arg0 += arg5;
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 8355711) + arg4;
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 8355711) + arg4;
            arg3[arg6++] = (ib.a(16711423, arg3[arg6]) >> 1) + arg4;
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 8355711) + arg4;
            arg4 = arg1[arg0 >> 8 & 0xFF];
            arg3[arg6++] = (ib.a(arg3[arg6], 16711422) >> 1) + arg4;
            arg0 += arg5;
            arg3[arg6++] = (ib.a(16711423, arg3[arg6]) >> 1) + arg4;
            arg3[arg6++] = arg4 - -ib.a(arg3[arg6] >> 1, 8355711);
            arg3[arg6++] = arg4 + ib.a(8355711, arg3[arg6] >> 1);
            arg4 = arg1[(0xFF16 & arg0) >> 8];
            arg0 += arg5;
            arg3[arg6++] = (ib.a(arg3[arg6], 16711423) >> 1) + arg4;
            arg3[arg6++] = arg4 + ib.a(arg3[arg6] >> 1, 8355711);
            arg3[arg6++] = arg4 - -(ib.a(arg3[arg6], 16711423) >> 1);
            arg3[arg6++] = arg4 + (ib.a(16711423, arg3[arg6]) >> 1);
            arg4 = arg1[arg0 >> 8 & 0xFF];
            arg0 += arg5;
        }
        for (int n = -(arg2 % 16), j = arg7; j < n; ++j) {
            arg3[arg6++] = ib.a(arg3[arg6] >> 1, 8355711) + arg4;
            if ((0x3 & j) == 0x3) {
                arg4 = arg1[(arg0 & 0xFF38) >> 8];
                arg0 += arg5;
                arg0 += arg5;
            }
        }
    }
    
    @Override
    public final synchronized void addConsumer(final ImageConsumer arg0) {
        (this.fb = arg0).setDimensions(this.u, this.k);
        arg0.setProperties(null);
        arg0.setColorModel(this.nb);
        arg0.setHints(14);
    }
    
    final void b(final int arg0, final int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            this.a(41, 58, 102, 22, (byte)102);
        }
        if (this.Qb[arg1]) {
            arg3 += this.Sb[arg1];
            arg2 += this.G[arg1];
        }
        int n = arg2 * this.u + arg3;
        int n2 = 0;
        int n3 = this.R[arg1];
        int n4 = this.kb[arg1];
        int n5 = -n4 + this.u;
        int n6 = 0;
        if (arg2 < this.A) {
            final int n7 = this.A - arg2;
            n3 -= n7;
            arg2 = this.A;
            n += this.u * n7;
            n2 += n7 * n4;
        }
        if (this.Rb <= arg2 - -n3) {
            n3 -= 1 + (n3 + arg2 - this.Rb);
        }
        if (this.hb > arg3) {
            final int n8 = -arg3 + this.hb;
            n2 += n8;
            n5 += n8;
            n4 -= n8;
            n6 += n8;
            arg3 = this.hb;
            n += n8;
        }
        if (arg3 - -n4 >= this.lb) {
            final int n9 = arg3 - -n4 + -this.lb + 1;
            n4 -= n9;
            n6 += n9;
            n5 += n9;
        }
        if (n4 <= 0 || n3 <= 0) {
            return;
        }
        int n10 = 1;
        if (this.i) {
            n5 += this.u;
            if ((0x1 & arg2) != 0x0) {
                n += this.u;
                --n3;
            }
            n10 = 2;
            n6 += this.kb[arg1];
        }
        if (this.ob[arg1] != null) {
            this.a(n4, this.rb, n10, n3, 0, n2, (byte)123, n, this.ob[arg1], n5, n6);
        }
        else {
            this.a(n, this.Y[arg1], n2, n6, this.rb, n10, n3, true, this.gb[arg1], n4, n5);
        }
    }
    
    @Override
    public final void requestTopDownLeftRightResend(final ImageConsumer arg0) {
        System.out.println("TDLR");
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6) {
        for (int n = arg3; arg3 + arg5 > n; ++n) {
            for (int i = arg2; i < arg2 + arg0; ++i) {
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                for (int n6 = -arg6 + n; arg6 + n >= n6; ++n6) {
                    if (n6 >= 0) {
                        if (this.u > n6) {
                            for (int j = i - arg1; j <= i + arg1; ++j) {
                                if (j >= 0) {
                                    if (j < this.k) {
                                        final int n7 = this.rb[this.u * j + n6];
                                        n4 += (0xFF & n7);
                                        ++n5;
                                        n3 += (n7 & 0xFF81) >> 8;
                                        n2 += (n7 & 0xFF64A6) >> 16;
                                    }
                                }
                            }
                        }
                    }
                }
                this.rb[n + i * this.u] = n4 / n5 + ((n2 / n5 << 16) + (n3 / n5 << 8));
            }
        }
        if (arg4 != 16740352) {
            this.a(-18, (byte)79, -10, 106, -42, 27);
        }
    }
    
    final void a(int arg0, final int arg1, final int arg2, int arg3, int arg4, final byte arg5, int arg6) {
        try {
            final int arg7 = this.kb[arg2];
            final int n = this.R[arg2];
            int arg8 = 0;
            int arg9 = 0;
            int arg10 = (arg7 << 16) / arg6;
            int arg11 = (n << 16) / arg4;
            if (this.Qb[arg2]) {
                final int n2 = this.Eb[arg2];
                final int n3 = this.qb[arg2];
                if (n2 == 0 || n3 == 0) {
                    return;
                }
                if (this.Sb[arg2] * arg6 % n2 != 0) {
                    arg8 = (-(this.Sb[arg2] * arg6 % n2) + n2 << 16) / arg6;
                }
                arg0 += (arg6 * this.Sb[arg2] - -n2 - 1) / n2;
                arg10 = (n2 << 16) / arg6;
                arg3 += (n3 + arg4 * this.G[arg2] - 1) / n3;
                arg11 = (n3 << 16) / arg4;
                if (this.G[arg2] * arg4 % n3 != 0) {
                    arg9 = (-(arg4 * this.G[arg2] % n3) + n3 << 16) / arg4;
                }
                arg4 = arg4 * (-(arg9 >> 16) + this.R[arg2]) / n3;
                arg6 = (-(arg8 >> 16) + this.kb[arg2]) * arg6 / n2;
            }
            if (arg5 <= 102) {
                this.Y = null;
            }
            int arg12 = arg0 + arg3 * this.u;
            int arg13 = this.u - arg6;
            if (arg3 < this.A) {
                final int n4 = this.A + -arg3;
                arg3 = 0;
                arg4 -= n4;
                arg12 += n4 * this.u;
                arg9 += n4 * arg11;
            }
            if (arg0 < this.hb) {
                final int n5 = this.hb - arg0;
                arg6 -= n5;
                arg13 += n5;
                arg8 += n5 * arg10;
                arg12 += n5;
                arg0 = 0;
            }
            if (arg3 - -arg4 >= this.Rb) {
                arg4 -= arg3 - -arg4 - (this.Rb - 1);
            }
            if (arg0 + arg6 >= this.lb) {
                final int n6 = arg0 - -arg6 + (-this.lb + 1);
                arg6 -= n6;
                arg13 += n6;
            }
            int arg14 = 1;
            if (this.i) {
                arg11 += arg11;
                if ((0x1 & arg3) != 0x0) {
                    --arg4;
                    arg12 += this.u;
                }
                arg14 = 2;
                arg13 += this.u;
            }
            this.a(arg9, arg10, arg6, arg8, arg13, this.ob[arg2], arg12, this.rb, 0, arg7, false, arg11, arg4, arg1, arg14);
        }
        catch (final Exception ex) {
            System.out.println("error in sprite clipping routine");
        }
    }
    
    final void b(final int arg0) {
        final int i = this.k * this.u;
        if (arg0 != 16316665) {
            ua.wb = null;
        }
        for (int n = 0; i > n; ++n) {
            final int n2 = 0xFFFFFF & this.rb[n];
            this.rb[n] = ib.a(n2 >>> 4, 986895) + ((ib.a(n2, 16316665) >>> 3) + (ib.a(16711423, n2) >>> 1) - -ib.a(-2143338689, n2 >>> 2));
        }
    }
    
    private final void a(final int arg0, final int arg1, int arg2, final int[] arg3, final int arg4, int arg5, int arg6, final int[] arg7, final int arg8, int arg9, final boolean arg10) {
        for (arg2 = arg0; arg2 < 0; ++arg2) {
            this.rb[arg9++] = arg7[(arg5 >> 17) * arg1 + (arg6 >> 17)];
            arg6 += arg4;
            arg5 += arg8;
        }
        if (!arg10) {
            this.a(-59, -116, -115, true, 1, 118, 33, -46, -78, -30);
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (this.hb > arg1 || arg0 < this.A || arg1 >= this.lb || arg0 >= this.Rb) {
            return;
        }
        if (arg2 <= 44) {
            return;
        }
        this.rb[arg1 - -(this.u * arg0)] = arg3;
    }
    
    final void c(final int arg0, int arg1, int arg2, final int arg3, int arg4, int arg5, final int arg6) {
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
        final int n = 256 - arg0;
        final int n2 = arg0 * (arg6 >> 16 & 0xFF);
        final int n3 = ((arg6 & 0xFFC4) >> 8) * arg0;
        final int n4 = arg0 * (arg6 & 0xFF);
        int n5 = this.u - arg5;
        int n6 = 1;
        if (!(!this.i)) {
            if ((arg4 & 0x1) != 0x0) {
                --arg2;
                ++arg4;
            }
            n5 += this.u;
            n6 = 2;
        }
        int n7 = arg1 - -(this.u * arg4);
        for (int n8 = arg3; arg2 > n8; n8 += n6) {
            for (int i = -arg5; i < 0; ++i) {
                this.rb[n7++] = (n * (this.rb[n7] & 0xFF) + n4 >> 8) + (n * ((0xFF7A & this.rb[n7]) >> 8) + n3 >> 8 << 8) + (n2 + n * ((0xFF8835 & this.rb[n7]) >> 16) >> 8 << 16);
            }
            n7 += n5;
        }
    }
    
    final int a(final int arg0, final int arg1, final String arg2) {
        int n = 0;
        if (arg1 <= 67) {
            this.Rb = 74;
        }
        final byte[] array = m.b[arg0];
        for (int i = 0; i < arg2.length(); ++i) {
            if (arg2.charAt(i) == '@' && 4 + i < arg2.length() && arg2.charAt(i + 4) == '@') {
                i += 4;
            }
            else if (arg2.charAt(i) != '~' || i + 4 >= arg2.length() || arg2.charAt(i + 4) != '~') {
                int char1 = arg2.charAt(i);
                if (char1 < 0 || n.a.length <= char1) {
                    char1 = 32;
                }
                n += array[n.a[char1] + 7];
            }
            else {
                i += 4;
            }
        }
        return n;
    }
    
    @Override
    public final boolean imageUpdate(final Image arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        return true;
    }
    
    private final void a(final int arg0, final int arg1, int arg2, final int[] arg3, final int[] arg4, int arg5, int arg6, final int arg7, final int arg8, int arg9, final byte arg10) {
        int i = arg1;
        if (arg10 != 102) {
            return;
        }
        while (i < 0) {
            arg9 = arg3[(arg5 >> 17) * arg7 + (arg2 >> 17)];
            arg2 += arg8;
            if (arg9 == 0) {
                ++arg6;
            }
            else {
                this.rb[arg6++] = arg9;
            }
            arg5 += arg0;
            ++i;
        }
    }
    
    private final void a(int arg0, final int arg1, final byte[] arg2, final int arg3, final boolean arg4, final int arg5, final int arg6, final int arg7, final int arg8, final int[] arg9, final int[] arg10, int arg11) {
        final int n = -arg7 + 256;
        if (arg4) {
            return;
        }
        for (int i = -arg5; i < 0; i += arg3) {
            for (int j = -arg8; j < 0; ++j) {
                final byte b = arg2[arg0++];
                if (b == 0) {
                    ++arg11;
                }
                else {
                    final int n2 = arg10[0xFF & b];
                    final int n3 = arg9[arg11];
                    arg9[arg11++] = ib.a(n * ib.a(n3, 16711935) + ib.a(16711935, n2) * arg7, -16711936) + ib.a(16711680, arg7 * ib.a(65280, n2) + n * ib.a(65280, n3)) >> 8;
                }
            }
            arg11 += arg1;
            arg0 += arg6;
        }
    }
    
    private final int c(final int arg0, final int arg1) {
        if (arg1 != 0) {
            if (arg0 < 49) {
                this.a(-22, 77, 112, -35, -44, null, -45, null, -39, -33, false, 50, 61, 37, -7);
            }
            return m.b[arg1][8] - 1;
        }
        return m.b[arg1][8] - 2;
    }
    
    final void b(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        this.kb[arg4] = arg5;
        this.R[arg4] = arg0;
        this.Qb[arg4] = false;
        this.Sb[arg4] = 0;
        this.G[arg4] = 0;
        this.Eb[arg4] = arg5;
        this.qb[arg4] = arg0;
        final int n = arg0 * arg5;
        int n2 = 0;
        this.ob[arg4] = new int[n];
        for (int n3 = arg1; arg1 + arg5 > n3; ++n3) {
            for (int n4 = arg2; arg0 + arg2 > n4; ++n4) {
                this.ob[arg4][n2++] = this.rb[n3 + this.u * n4];
            }
        }
        if (arg3 != -27966) {
            this.a(73, -62, -30, (byte)(-113), 44, -64, -91, 100, -79, null, 117, 11, 127, -109, null);
        }
    }
    
    void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final byte arg6, final int arg7) {
        this.f(arg3, arg4, arg2, arg5, 5924, arg1);
        if (arg6 != 29) {
            return;
        }
    }
    
    final void c(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        final int n = -arg0 + 256;
        final int n2 = arg0 * (0xFF & arg4 >> 16);
        final int n3 = (0xFF & arg4 >> 8) * arg0;
        final int n4 = arg0 * (arg4 & 0xFF);
        if (arg1 != -1057205208) {
            return;
        }
        int n5 = -arg2 + arg3;
        if (n5 < 0) {
            n5 = 0;
        }
        int i = arg3 - -arg2;
        if (this.k <= i) {
            i = this.k - 1;
        }
        int n6 = 1;
        if (this.i) {
            if ((0x1 & n5) != 0x0) {
                ++n5;
            }
            n6 = 2;
        }
        for (int n7 = n5; i >= n7; n7 += n6) {
            final int n8 = n7 + -arg3;
            final int n9 = (int)Math.sqrt(-(n8 * n8) + arg2 * arg2);
            int n10 = arg5 + -n9;
            if (n10 < 0) {
                n10 = 0;
            }
            int j = arg5 - -n9;
            if (this.u <= j) {
                j = this.u - 1;
            }
            int n11 = n10 + this.u * n7;
            for (int n12 = n10; j >= n12; ++n12) {
                this.rb[n11++] = ((this.rb[n11] & 0xFF) * n + n4 >> 8) + ((n3 - -(n * ((0xFFD5 & this.rb[n11]) >> 8)) >> 8 << 8) + (n2 - -(n * ((this.rb[n11] & 0xFF18B9) >> 16)) >> 8 << 16));
            }
        }
    }
    
    private final void a(final int[] arg0, final int[] arg1, final int arg2, final int arg3, int arg4, final int arg5, int arg6, final int arg7, final int arg8, final int arg9, int arg10, int arg11, int arg12, final int arg13, final int arg14, final int arg15, int arg16) {
        final int n = arg14 >> 16 & 0xFF;
        final int n2 = arg14 >> 8 & 0xFF;
        final int n3 = arg14 & 0xFF;
        final int n4 = arg7 >> 16 & 0xFF;
        if (arg5 != 1603920392) {
            this.Rb = 29;
        }
        final int n5 = arg7 >> 8 & 0xFF;
        final int n6 = 0xFF & arg7;
        try {
            final int n7 = arg10;
            for (int i = -arg15; i < 0; ++i) {
                final int n8 = (arg12 >> 16) * arg13;
                int hb = arg4 >> 16;
                int n9 = arg2;
                if (hb < this.hb) {
                    final int n10 = this.hb + -hb;
                    n9 -= n10;
                    arg10 += n10 * arg9;
                    hb = this.hb;
                }
                if (this.lb <= hb - -n9) {
                    n9 -= -this.lb + hb - -n9;
                }
                arg11 = 1 - arg11;
                if (arg11 != 0) {
                    for (int n11 = hb; hb + n9 > n11; ++n11) {
                        arg6 = arg1[n8 + (arg10 >> 16)];
                        if (arg6 != 0) {
                            final int n12 = 0xFF & arg6 >> 16;
                            final int n13 = 0xFF & arg6 >> 8;
                            final int n14 = arg6 & 0xFF;
                            if (n12 == n13 && n14 == n13) {
                                arg0[n11 - -arg16] = (n14 * n3 >> 8) + ((n2 * n13 >> 8 << 8) + (n12 * n >> 8 << 16));
                            }
                            else if (n12 != 255 || n14 != n13) {
                                arg0[n11 + arg16] = arg6;
                            }
                            else {
                                arg0[n11 - -arg16] = (n6 * n14 >> 8) + (n12 * n4 >> 8 << 16) - -(n13 * n5 >> 8 << 8);
                            }
                        }
                        arg10 += arg9;
                    }
                }
                arg12 += arg8;
                arg10 = n7;
                arg16 += this.u;
                arg4 += arg3;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }
    
    private final void a(final int arg0, final int[] arg1, final int arg2, final int arg3, int arg4, final int arg5, int arg6, int arg7, final byte[] arg8, int arg9, final byte arg10, int arg11, final int arg12, int arg13, final int arg14, final int arg15, final int[] arg16, final int arg17) {
        final int n = arg17 >> 16 & 0xFF;
        if (arg10 <= 8) {
            return;
        }
        final int n2 = (arg17 & 0xFF65) >> 8;
        final int n3 = arg17 & 0xFF;
        final int n4 = arg12 >> 16 & 0xFF;
        final int n5 = 0xFF & arg12 >> 8;
        final int n6 = 0xFF & arg12;
        try {
            final int n7 = arg11;
            for (int i = -arg0; i < 0; ++i) {
                final int n8 = arg2 * (arg7 >> 16);
                int hb = arg13 >> 16;
                int n9 = arg15;
                if (hb < this.hb) {
                    final int n10 = this.hb + -hb;
                    arg11 += n10 * arg14;
                    n9 -= n10;
                    hb = this.hb;
                }
                arg9 = -arg9 + 1;
                if (n9 + hb >= this.lb) {
                    n9 -= hb + (n9 - this.lb);
                }
                if (arg9 != 0) {
                    for (int j = hb; j < n9 + hb; ++j) {
                        arg4 = (0xFF & arg8[(arg11 >> 16) - -n8]);
                        if (arg4 != 0) {
                            arg4 = arg1[arg4];
                            final int n11 = arg4 & 0xFF;
                            final int n12 = 0xFF & arg4 >> 8;
                            final int n13 = 0xFF & arg4 >> 16;
                            if (n12 != n13 || n12 != n11) {
                                if (n13 == 255 && n12 == n11) {
                                    arg16[arg6 + j] = (n4 * n13 >> 8 << 16) + (n12 * n5 >> 8 << 8) + (n6 * n11 >> 8);
                                }
                                else {
                                    arg16[j + arg6] = arg4;
                                }
                            }
                            else {
                                arg16[j + arg6] = (n3 * n11 >> 8) + (n13 * n >> 8 << 16) + (n2 * n12 >> 8 << 8);
                            }
                        }
                        arg11 += arg14;
                    }
                }
                arg7 += arg3;
                arg13 += arg5;
                arg11 = n7;
                arg6 += this.u;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }
    
    private final void a(final byte arg0, final boolean arg1, final byte[] arg2, final int arg3, final int arg4, final int arg5, final int arg6) {
        int hb = arg3 - -arg2[5 + arg5];
        if (arg0 < 24) {
            return;
        }
        int a = arg6 + -arg2[6 + arg5];
        int n = arg2[arg5 + 3];
        int n2 = arg2[4 + arg5];
        int n3 = 16384 * arg2[arg5] + arg2[arg5 + 1] * 128 + arg2[arg5 + 2];
        int n4 = hb - -(a * this.u);
        int n5 = this.u + -n;
        if (this.A > a) {
            final int n6 = this.A - a;
            n3 += n6 * n;
            n4 += this.u * n6;
            n2 -= n6;
            a = this.A;
        }
        int n7 = 0;
        if (this.Rb <= a + n2) {
            n2 -= 1 + (a + n2) + -this.Rb;
        }
        if (hb < this.hb) {
            final int n8 = -hb + this.hb;
            n7 += n8;
            n -= n8;
            n3 += n8;
            hb = this.hb;
            n5 += n8;
            n4 += n8;
        }
        if (n + hb >= this.lb) {
            final int n9 = -this.lb + (n + hb) + 1;
            n5 += n9;
            n7 += n9;
            n -= n9;
        }
        if (n > 0) {
            if (n2 > 0) {
                if (arg1) {
                    this.a(arg2, arg4, n, n4, n2, n7, 1504725224, n5, this.rb, n3);
                }
                else {
                    this.a(arg4, this.rb, n4, (byte)37, n5, n2, n, n3, arg2, n7);
                }
            }
        }
    }
    
    final void f(int arg0, int arg1, int arg2, int arg3, final int arg4, final int arg5) {
        try {
            final int arg6 = this.kb[arg5];
            final int n = this.R[arg5];
            int arg7 = 0;
            int arg8 = 0;
            int arg9 = (arg6 << 16) / arg3;
            int arg10 = (n << 16) / arg2;
            if (this.Qb[arg5]) {
                final int n2 = this.Eb[arg5];
                final int n3 = this.qb[arg5];
                if (n2 == 0 || n3 == 0) {
                    return;
                }
                if (this.G[arg5] * arg2 % n3 != 0) {
                    arg8 = (n3 - arg2 * this.G[arg5] % n3 << 16) / arg2;
                }
                arg9 = (n2 << 16) / arg3;
                if (this.Sb[arg5] * arg3 % n2 != 0) {
                    arg7 = (n2 - this.Sb[arg5] * arg3 % n2 << 16) / arg3;
                }
                arg0 += (arg3 * this.Sb[arg5] - -n2 - 1) / n2;
                arg10 = (n3 << 16) / arg2;
                arg1 += (n3 + arg2 * this.G[arg5] - 1) / n3;
                arg2 = (this.R[arg5] - (arg8 >> 16)) * arg2 / n3;
                arg3 = arg3 * (this.kb[arg5] - (arg7 >> 16)) / n2;
            }
            int arg11 = arg0 + this.u * arg1;
            if (this.A > arg1) {
                final int n4 = this.A - arg1;
                arg8 += arg10 * n4;
                arg2 -= n4;
                arg11 += this.u * n4;
                arg1 = 0;
            }
            int arg12 = this.u + -arg3;
            if (this.Rb <= arg1 - -arg2) {
                arg2 -= -this.Rb + arg1 - -arg2 + 1;
            }
            if (arg0 < this.hb) {
                final int n5 = -arg0 + this.hb;
                arg3 -= n5;
                arg12 += n5;
                arg11 += n5;
                arg0 = 0;
                arg7 += arg9 * n5;
            }
            if (this.lb <= arg0 + arg3) {
                final int n6 = 1 + (arg0 + (arg3 - this.lb));
                arg12 += n6;
                arg3 -= n6;
            }
            int arg13 = 1;
            if (!(!this.i)) {
                if ((arg1 & 0x1) != 0x0) {
                    --arg2;
                    arg11 += this.u;
                }
                arg12 += this.u;
                arg13 = 2;
                arg10 += arg10;
            }
            this.a(this.ob[arg5], arg13, arg9, 0, arg8, this.rb, (byte)78, arg10, arg2, arg7, arg12, arg3, arg6, arg11);
        }
        catch (final Exception ex) {
            System.out.println("error in sprite clipping routine");
        }
        if (arg4 != 5924) {
            this.u = -15;
        }
    }
    
    final void b(int arg0, final int arg1, int arg2, final int arg3, final byte arg4) {
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
        if (arg0 > 0) {
            final int n = arg2 - -(this.u * arg3);
            for (int n2 = 0; arg0 > n2; ++n2) {
                this.rb[n - -n2] = arg1;
            }
        }
    }
    
    final void a(final int arg0, final int arg1, final String arg2, int arg3, int arg4, final byte arg5, final int arg6) {
        try {
            if (arg0 > 0) {
                final int arg7 = arg0 + this.D - 1;
                if (this.gb[arg7] != null) {
                    this.b(-1, arg7, -this.R[arg7] + arg1, arg3);
                    arg3 += this.kb[arg7] + 5;
                }
            }
            final byte[] arg8 = m.b[arg6];
            for (int n = 0; arg2.length() > n; ++n) {
                if (arg2.charAt(n) == '@' && arg2.length() > n + 4 && arg2.charAt(n + 4) == '@') {
                    if (!arg2.substring(n + 1, n + 4).equalsIgnoreCase("red")) {
                        if (arg2.substring(n + 1, n + 4).equalsIgnoreCase("lre")) {
                            arg4 = 16748608;
                        }
                        else if (!arg2.substring(n + 1, 4 + n).equalsIgnoreCase("yel")) {
                            if (!arg2.substring(1 + n, n + 4).equalsIgnoreCase("gre")) {
                                if (!arg2.substring(n + 1, 4 + n).equalsIgnoreCase("blu")) {
                                    if (arg2.substring(1 + n, 4 + n).equalsIgnoreCase("cya")) {
                                        arg4 = 65535;
                                    }
                                    else if (arg2.substring(1 + n, n + 4).equalsIgnoreCase("mag")) {
                                        arg4 = 16711935;
                                    }
                                    else if (!arg2.substring(n + 1, 4 + n).equalsIgnoreCase("whi")) {
                                        if (!arg2.substring(n + 1, n + 4).equalsIgnoreCase("bla")) {
                                            if (arg2.substring(1 + n, n + 4).equalsIgnoreCase("dre")) {
                                                arg4 = 12582912;
                                            }
                                            else if (!arg2.substring(1 + n, 4 + n).equalsIgnoreCase("ora")) {
                                                if (!arg2.substring(n + 1, 4 + n).equalsIgnoreCase("ran")) {
                                                    if (arg2.substring(1 + n, 4 + n).equalsIgnoreCase("or1")) {
                                                        arg4 = 16756736;
                                                    }
                                                    else if (!arg2.substring(n + 1, 4 + n).equalsIgnoreCase("or2")) {
                                                        if (!arg2.substring(n + 1, n + 4).equalsIgnoreCase("or3")) {
                                                            if (arg2.substring(n + 1, 4 + n).equalsIgnoreCase("gr1")) {
                                                                arg4 = 12648192;
                                                            }
                                                            else if (arg2.substring(1 + n, 4 + n).equalsIgnoreCase("gr2")) {
                                                                arg4 = 8453888;
                                                            }
                                                            else if (arg2.substring(n + 1, 4 + n).equalsIgnoreCase("gr3")) {
                                                                arg4 = 4259584;
                                                            }
                                                        }
                                                        else {
                                                            arg4 = 16723968;
                                                        }
                                                    }
                                                    else {
                                                        arg4 = 16740352;
                                                    }
                                                }
                                                else {
                                                    arg4 = (int)(1.6777215E7 * Math.random());
                                                }
                                            }
                                            else {
                                                arg4 = 16748608;
                                            }
                                        }
                                        else {
                                            arg4 = 0;
                                        }
                                    }
                                    else {
                                        arg4 = 16777215;
                                    }
                                }
                                else {
                                    arg4 = 255;
                                }
                            }
                            else {
                                arg4 = 65280;
                            }
                        }
                        else {
                            arg4 = 16776960;
                        }
                    }
                    else {
                        arg4 = 16711680;
                    }
                    n += 4;
                }
                else if (arg2.charAt(n) == '~' && arg2.length() > 4 + n && arg2.charAt(4 + n) == '~') {
                    final char char1 = arg2.charAt(1 + n);
                    final char char2 = arg2.charAt(2 + n);
                    final char char3 = arg2.charAt(n + 3);
                    if (char1 >= '0' && char1 <= '9' && char2 >= '0' && char2 <= '9' && char3 >= '0' && char3 <= '9') {
                        arg3 = Integer.parseInt(arg2.substring(n + 1, n + 4));
                    }
                    n += 4;
                }
                else {
                    int char4 = arg2.charAt(n);
                    if (char4 == 160) {
                        char4 = 32;
                    }
                    if (char4 < 0 || n.a.length <= char4) {
                        char4 = 32;
                    }
                    final int arg9 = n.a[char4];
                    if (this.xb && !fb.k[arg6] && arg4 != 0) {
                        this.a((byte)53, fb.k[arg6], arg8, 1 + arg3, 0, arg9, arg1);
                    }
                    if (this.xb && !fb.k[arg6] && arg4 != 0) {
                        this.a((byte)101, fb.k[arg6], arg8, arg3, 0, arg9, arg1 + 1);
                    }
                    this.a((byte)73, fb.k[arg6], arg8, arg3, arg4, arg9, arg1);
                    arg3 += arg8[arg9 + 7];
                }
            }
        }
        catch (final Exception ex) {
            System.out.println("drawstring: " + ex);
            ex.printStackTrace();
        }
        ++ua.w;
    }
    
    @Override
    public final synchronized void removeConsumer(final ImageConsumer arg0) {
        if (this.fb == arg0) {
            this.fb = null;
        }
    }
    
    private final synchronized void b(final boolean arg0) {
        if (this.fb == null) {
            return;
        }
        this.fb.setPixels(0, 0, this.u, this.k, this.nb, this.rb, 0, this.u);
        this.fb.imageComplete(2);
        if (!arg0) {
            this.startProduction(null);
        }
    }
    
    final void b(final int arg0, int arg1, final int arg2, int arg3, final int arg4) {
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
        final int n = arg0 - -(this.u * arg1);
        for (int i = 0; i < arg3; ++i) {
            this.rb[n - -(this.u * i)] = arg2;
        }
    }
    
    final void a(final int arg0, final int arg1, int arg2, final int arg3, int arg4) {
        if (this.Qb[arg0]) {
            arg2 += this.Sb[arg0];
            arg4 += this.G[arg0];
        }
        int n = this.u * arg4 + arg2;
        int n2 = arg1;
        int n3 = this.R[arg0];
        int n4 = this.kb[arg0];
        int n5 = this.u - n4;
        int n6 = 0;
        if (this.A > arg4) {
            final int n7 = -arg4 + this.A;
            arg4 = this.A;
            n3 -= n7;
            n2 += n7 * n4;
            n += n7 * this.u;
        }
        if (this.Rb <= n3 + arg4) {
            n3 -= 1 + (n3 + (arg4 + -this.Rb));
        }
        if (arg2 < this.hb) {
            final int n8 = this.hb + -arg2;
            n5 += n8;
            n6 += n8;
            n += n8;
            n2 += n8;
            arg2 = this.hb;
            n4 -= n8;
        }
        if (this.lb <= arg2 + n4) {
            final int n9 = -this.lb + (arg2 - (-n4 - 1));
            n5 += n9;
            n4 -= n9;
            n6 += n9;
        }
        if (n4 > 0 && n3 > 0) {
            int n10 = 1;
            if (!(!this.i)) {
                n6 += this.kb[arg0];
                n10 = 2;
                if ((0x1 & arg4) != 0x0) {
                    --n3;
                    n += this.u;
                }
                n5 += this.u;
            }
            if (this.ob[arg0] == null) {
                this.a(n2, n5, this.gb[arg0], n10, false, n3, n6, arg3, n4, this.rb, this.Y[arg0], n);
            }
            else {
                this.a(n2, n3, n, this.ob[arg0], 0, arg3, n10, this.rb, -107, n6, n5, n4);
            }
        }
    }
    
    final void a(final Graphics arg0, final int arg1, final int arg2, final int arg3) {
        this.b(true);
        arg0.drawImage(this.Gb, arg1, arg3, this);
        if (arg2 != 256) {
            ua.Kb = null;
        }
    }
    
    final void a(final int arg0, final byte arg1, int arg2, int arg3, int arg4, int arg5, final int arg6) {
        try {
            final int arg7 = this.kb[arg0];
            final int n = this.R[arg0];
            int arg8 = 0;
            int arg9 = 0;
            int arg10 = (arg7 << 16) / arg4;
            int arg11 = (n << 16) / arg2;
            if (this.Qb[arg0]) {
                final int n2 = this.Eb[arg0];
                final int n3 = this.qb[arg0];
                if (n2 == 0 || n3 == 0) {
                    return;
                }
                arg11 = (n3 << 16) / arg2;
                arg5 += (n3 + arg2 * this.G[arg0] - 1) / n3;
                arg3 += (n2 + this.Sb[arg0] * arg4 - 1) / n2;
                arg10 = (n2 << 16) / arg4;
                if (arg4 * this.Sb[arg0] % n2 != 0) {
                    arg8 = (-(this.Sb[arg0] * arg4 % n2) + n2 << 16) / arg4;
                }
                if (this.G[arg0] * arg2 % n3 != 0) {
                    arg9 = (n3 + -(this.G[arg0] * arg2 % n3) << 16) / arg2;
                }
                arg4 = arg4 * (this.kb[arg0] - (arg8 >> 16)) / n2;
                arg2 = (-(arg9 >> 16) + this.R[arg0]) * arg2 / n3;
            }
            int arg12 = arg5 * this.u + arg3;
            if (arg1 > -121) {
                return;
            }
            if (arg5 < this.A) {
                final int n4 = -arg5 + this.A;
                arg2 -= n4;
                arg5 = 0;
                arg12 += this.u * n4;
                arg9 += arg11 * n4;
            }
            int arg13 = this.u + -arg4;
            if (this.hb > arg3) {
                final int n5 = -arg3 + this.hb;
                arg3 = 0;
                arg8 += n5 * arg10;
                arg12 += n5;
                arg4 -= n5;
                arg13 += n5;
            }
            if (this.Rb <= arg5 + arg2) {
                arg2 -= 1 + arg2 + (arg5 + -this.Rb);
            }
            if (this.lb <= arg3 + arg4) {
                final int n6 = 1 + arg3 + (arg4 - this.lb);
                arg13 += n6;
                arg4 -= n6;
            }
            int arg14 = 1;
            if (!(!this.i)) {
                arg11 += arg11;
                arg13 += this.u;
                if ((arg5 & 0x1) != 0x0) {
                    arg12 += this.u;
                    --arg2;
                }
                arg14 = 2;
            }
            this.a(arg14, arg9, arg4, (byte)(-61), arg11, arg7, arg10, arg2, arg12, this.ob[arg0], 0, arg8, arg13, arg6, this.rb);
        }
        catch (final Exception ex) {
            System.out.println("error in sprite clipping routine");
        }
    }
    
    private final void a(final int arg0, final int[] arg1, int arg2, final byte arg3, final int arg4, final int arg5, int arg6, int arg7, final byte[] arg8, final int arg9) {
        try {
            final int n = -(arg6 >> 2);
            arg6 = -(arg6 & 0x3);
            for (int i = -arg5; i < 0; ++i) {
                for (int j = n; j < 0; ++j) {
                    if (arg8[arg7++] != 0) {
                        arg1[arg2++] = arg0;
                    }
                    else {
                        ++arg2;
                    }
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                    }
                    else {
                        arg1[arg2++] = arg0;
                    }
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                    }
                    else {
                        arg1[arg2++] = arg0;
                    }
                    if (arg8[arg7++] != 0) {
                        arg1[arg2++] = arg0;
                    }
                    else {
                        ++arg2;
                    }
                }
                for (int k = arg6; k < 0; ++k) {
                    if (arg8[arg7++] == 0) {
                        ++arg2;
                    }
                    else {
                        arg1[arg2++] = arg0;
                    }
                }
                arg7 += arg9;
                arg2 += arg4;
            }
        }
        catch (final Exception ex) {
            System.out.println("plotletter: " + ex);
            ex.printStackTrace();
        }
    }
    
    private final void a(int arg0, final int[] arg1, int arg2, final int arg3, final int[] arg4, final int arg5, final int arg6, final boolean arg7, final byte[] arg8, int arg9, final int arg10) {
        if (!arg7) {
            this.i = true;
        }
        final int n = -(arg9 >> 2);
        arg9 = -(0x3 & arg9);
        for (int i = -arg6; i < 0; i += arg5) {
            for (int j = n; j < 0; ++j) {
                final byte arg11 = arg8[arg2++];
                if (arg11 == 0) {
                    ++arg0;
                }
                else {
                    arg4[arg0++] = arg1[ib.a(arg11, 255)];
                }
                final byte arg12 = arg8[arg2++];
                if (arg12 == 0) {
                    ++arg0;
                }
                else {
                    arg4[arg0++] = arg1[ib.a(arg12, 255)];
                }
                final byte arg13 = arg8[arg2++];
                if (arg13 != 0) {
                    arg4[arg0++] = arg1[ib.a(255, arg13)];
                }
                else {
                    ++arg0;
                }
                final byte arg14 = arg8[arg2++];
                if (arg14 != 0) {
                    arg4[arg0++] = arg1[ib.a(arg14, 255)];
                }
                else {
                    ++arg0;
                }
            }
            for (int k = arg9; k < 0; ++k) {
                final byte arg15 = arg8[arg2++];
                if (arg15 != 0) {
                    arg4[arg0++] = arg1[ib.a(arg15, 255)];
                }
                else {
                    ++arg0;
                }
            }
            arg0 += arg10;
            arg2 += arg3;
        }
    }
    
    final void b(final int arg0, final int arg1) {
        if (this.gb[arg0] == null) {
            return;
        }
        final int n = this.kb[arg0] * this.R[arg0];
        final byte[] array = this.gb[arg0];
        final int[] array2 = this.Y[arg0];
        final int[] array3 = new int[n];
        for (int i = 0; i < n; ++i) {
            int n2 = array2[0xFF & array[i]];
            if (n2 == 0) {
                n2 = 1;
            }
            else if (n2 == 16711935) {
                n2 = 0;
            }
            array3[i] = n2;
        }
        if (arg1 != -342059728) {
            this.Eb = null;
        }
        this.ob[arg0] = array3;
        this.gb[arg0] = null;
        this.Y[arg0] = null;
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, int arg5) {
        final int u = this.u;
        final int k = this.k;
        if (this.Hb == null) {
            this.Hb = new int[512];
            for (int i = 0; i < 256; ++i) {
                this.Hb[i] = (int)(Math.sin(i * 0.02454369) * 32768.0);
                this.Hb[256 + i] = (int)(Math.cos(i * 0.02454369) * 32768.0);
            }
        }
        int n = -this.Eb[arg0] / 2;
        int n2 = -this.qb[arg0] / 2;
        if (this.Qb[arg0]) {
            n += this.Sb[arg0];
            n2 += this.G[arg0];
        }
        final int n3 = this.kb[arg0] + n;
        final int n4 = this.R[arg0] + n2;
        final int n5 = n3;
        final int n6 = n2;
        final int n7 = n;
        arg5 &= 0xFF;
        final int n8 = n4;
        final int n9 = this.Hb[arg5] * arg4;
        final int n10 = this.Hb[arg5 + 256] * arg4;
        final int n11 = arg2 + (n10 * n + n2 * n9 >> 22);
        final int n12 = arg1 - -(-(n * n9) + n2 * n10 >> 22);
        final int n13 = (n5 * n10 + n6 * n9 >> 22) + arg2;
        final int n14 = arg1 + (n10 * n6 - n5 * n9 >> 22);
        final int n15 = (n9 * n4 + n10 * n3 >> 22) + arg2;
        final int n16 = (-(n9 * n3) + n10 * n4 >> 22) + arg1;
        final int n17 = (n7 * n10 + n9 * n8 >> 22) + arg2;
        final int n18 = arg1 - -(n8 * n10 - n7 * n9 >> 22);
        if (arg4 != 192 || (0x3F & client.ef) != (0x3F & arg5)) {
            if (arg4 == 128) {
                client.ef = arg5;
            }
            else {
                ++da.M;
            }
        }
        else {
            ++nb.g;
        }
        int a = n12;
        int j = n12;
        if (a > n14) {
            a = n14;
        }
        else if (j < n14) {
            j = n14;
        }
        if (n16 < a) {
            a = n16;
        }
        else if (n16 > j) {
            j = n16;
        }
        if (n18 < a) {
            a = n18;
        }
        else if (j < n18) {
            j = n18;
        }
        if (a < this.A) {
            a = this.A;
        }
        if (this.Xb == null || this.Xb.length != k + 1) {
            this.tb = new int[k + 1];
            this.M = new int[1 + k];
            this.t = new int[k + 1];
            this.Tb = new int[1 + k];
            this.Wb = new int[1 + k];
            this.Xb = new int[k + 1];
        }
        if (this.Rb < j) {
            j = this.Rb;
        }
        for (int n19 = a; j >= n19; ++n19) {
            this.Xb[n19] = 99999999;
            this.t[n19] = -99999999;
        }
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        final int n23 = this.kb[arg0];
        final int n24 = n23 - 1;
        final int n25 = this.R[arg0];
        final int n26 = n23 - 1;
        final int n27 = 0;
        final int n28 = 0;
        final int n29 = 0;
        final int n30 = 0;
        final int n31 = n25 - 1;
        final int n32 = n25 - 1;
        int n33;
        int n34;
        int n35;
        int n36;
        if (n12 > n18) {
            n33 = n12;
            n34 = n32 << 8;
            n35 = n18;
            n36 = n17 << 8;
        }
        else {
            n33 = n18;
            n35 = n12;
            n34 = n28 << 8;
            n36 = n11 << 8;
        }
        if (n18 != n12) {
            n22 = (-n28 + n32 << 8) / (n18 + -n12);
            n20 = (-n11 + n17 << 8) / (n18 - n12);
        }
        if (n35 < 0) {
            n36 -= n20 * n35;
            n34 -= n35 * n22;
            n35 = 0;
        }
        if (n33 > k - 1) {
            n33 = k - 1;
        }
        if (arg3 != 842218000) {
            return;
        }
        for (int l = n35; l <= n33; ++l) {
            this.Xb[l] = (this.t[l] = n36);
            n36 += n20;
            this.M[l] = (this.Tb[l] = 0);
            this.tb[l] = (this.Wb[l] = n34);
            n34 += n22;
        }
        if (n12 != n14) {
            n20 = (n13 + -n11 << 8) / (-n12 + n14);
            n21 = (-n27 + n26 << 8) / (-n12 + n14);
        }
        int n37;
        int n38;
        int n39;
        int n40;
        if (n14 < n12) {
            n37 = n26 << 8;
            n38 = n12;
            n39 = n14;
            n40 = n13 << 8;
        }
        else {
            n40 = n11 << 8;
            n39 = n12;
            n37 = n27 << 8;
            n38 = n14;
        }
        if (k - 1 < n38) {
            n38 = k - 1;
        }
        if (n39 < 0) {
            n37 -= n21 * n39;
            n40 -= n20 * n39;
            n39 = 0;
        }
        for (int n41 = n39; n38 >= n41; ++n41) {
            if (n40 < this.Xb[n41]) {
                this.Xb[n41] = n40;
                this.M[n41] = n37;
                this.tb[n41] = 0;
            }
            if (this.t[n41] < n40) {
                this.t[n41] = n40;
                this.Tb[n41] = n37;
                this.Wb[n41] = 0;
            }
            n40 += n20;
            n37 += n21;
        }
        int n42;
        int n43;
        int n44;
        int n45;
        int n46;
        if (n14 <= n16) {
            n42 = n26 << 8;
            n43 = n29 << 8;
            n44 = n14;
            n45 = n13 << 8;
            n46 = n16;
        }
        else {
            n42 = n24 << 8;
            n46 = n14;
            n43 = n31 << 8;
            n45 = n15 << 8;
            n44 = n16;
        }
        if (n14 != n16) {
            n22 = (-n29 + n31 << 8) / (-n14 + n16);
            n20 = (-n13 + n15 << 8) / (n16 + -n14);
        }
        if (n46 > k - 1) {
            n46 = k - 1;
        }
        if (n44 < 0) {
            n45 -= n20 * n44;
            n43 -= n22 * n44;
            n44 = 0;
        }
        for (int n47 = n44; n46 >= n47; ++n47) {
            if (n45 < this.Xb[n47]) {
                this.Xb[n47] = n45;
                this.M[n47] = n42;
                this.tb[n47] = n43;
            }
            if (n45 > this.t[n47]) {
                this.t[n47] = n45;
                this.Tb[n47] = n42;
                this.Wb[n47] = n43;
            }
            n45 += n20;
            n43 += n22;
        }
        if (n16 != n18) {
            n20 = (n17 + -n15 << 8) / (n18 + -n16);
            n21 = (n30 + -n24 << 8) / (-n16 + n18);
        }
        int n48;
        int n49;
        int n50;
        int n51;
        int n52;
        if (n16 > n18) {
            n48 = n30 << 8;
            n49 = n16;
            n50 = n18;
            n51 = n32 << 8;
            n52 = n17 << 8;
        }
        else {
            n50 = n16;
            n51 = n31 << 8;
            n52 = n15 << 8;
            n48 = n24 << 8;
            n49 = n18;
        }
        if (n50 < 0) {
            n52 -= n50 * n20;
            n48 -= n50 * n21;
            n50 = 0;
        }
        if (k - 1 < n49) {
            n49 = k - 1;
        }
        for (int n53 = n50; n49 >= n53; ++n53) {
            if (this.Xb[n53] > n52) {
                this.Xb[n53] = n52;
                this.M[n53] = n48;
                this.tb[n53] = n51;
            }
            if (this.t[n53] < n52) {
                this.t[n53] = n52;
                this.Tb[n53] = n48;
                this.Wb[n53] = n51;
            }
            n52 += n20;
            n48 += n21;
        }
        int n54 = a * u;
        final int[] array = this.ob[arg0];
        for (int n55 = a; j > n55; ++n55) {
            int hb = this.Xb[n55] >> 8;
            int lb = this.t[n55] >> 8;
            if (lb + -hb > 0) {
                int n56 = this.M[n55] << 9;
                final int n57 = ((this.Tb[n55] << 9) - n56) / (lb - hb);
                int n58 = this.tb[n55] << 9;
                final int n59 = (-n58 + (this.Wb[n55] << 9)) / (-hb + lb);
                if (this.lb < lb) {
                    lb = this.lb;
                }
                if (hb < this.hb) {
                    n58 += (-hb + this.hb) * n59;
                    n56 += (this.hb + -hb) * n57;
                    hb = this.hb;
                }
                if (!this.i || (n55 & 0x1) == 0x0) {
                    if (this.Qb[arg0]) {
                        this.a(n59, -lb + hb, n56, array, this.rb, n58, hb + n54, n23, n57, 0, (byte)102);
                    }
                    else {
                        this.a(-lb + hb, n23, 0, this.rb, n57, n58, n56, array, n59, hb + n54, true);
                    }
                }
                n54 += u;
            }
            else {
                n54 += u;
            }
        }
        if (e.Ab != 0) {
            client.vh = true;
        }
    }
    
    final void d(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
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
        this.ob[arg0] = new int[arg3 * arg1];
        int n = 0;
        for (int n2 = arg4; arg1 + arg4 > n2; ++n2) {
            for (int i = arg5; i < arg3 + arg5; ++i) {
                this.ob[arg0][n++] = this.rb[this.u * n2 + i];
            }
        }
    }
    
    private final void a(int arg0, final int arg1, final int arg2, int arg3, final int arg4, final int[] arg5, int arg6, final int[] arg7, int arg8, final int arg9, final boolean arg10, final int arg11, final int arg12, final int arg13, final int arg14) {
        final int n = (arg13 & 0xFF5F75) >> 16;
        final int n2 = 0xFF & arg13 >> 8;
        final int n3 = 0xFF & arg13;
        try {
            final int n4 = arg3;
            if (arg10) {
                this.Tb = null;
            }
            for (int i = -arg12; i < 0; i += arg14) {
                final int n5 = (arg0 >> 16) * arg9;
                for (int j = -arg2; j < 0; ++j) {
                    arg8 = arg5[n5 + (arg3 >> 16)];
                    if (arg8 != 0) {
                        final int n6 = arg8 >> 16 & 0xFF;
                        final int n7 = (0xFF60 & arg8) >> 8;
                        final int n8 = 0xFF & arg8;
                        if (n7 != n6 || n7 != n8) {
                            arg7[arg6++] = arg8;
                        }
                        else {
                            arg7[arg6++] = (n6 * n >> 8 << 16) + ((n2 * n7 >> 8 << 8) + (n8 * n3 >> 8));
                        }
                    }
                    else {
                        ++arg6;
                    }
                    arg3 += arg1;
                }
                arg0 += arg11;
                arg6 += arg4;
                arg3 = n4;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in plot_scale");
        }
    }
    
    final void d(final int arg0, final int arg1) {
        this.D = arg1;
    }
    
    private final void a(final int arg0, final int arg1, final int arg2, final int arg3, final String arg4, final int arg5, final int arg6) {
        if (arg0 != 11815) {
            return;
        }
        this.a(arg3, arg6, arg4, arg5 - this.a(arg2, 92, arg4) / 2, arg1, (byte)(-124), arg2);
    }
    
    private final void a(final int arg0, int arg1, final int arg2, final byte arg3, final int arg4, final int arg5, final int arg6, final int arg7, int arg8, final int[] arg9, int arg10, int arg11, final int arg12, final int arg13, final int[] arg14) {
        final int n = 256 - arg13;
        try {
            final int n2 = arg11;
            if (arg3 != -61) {
                return;
            }
            for (int i = -arg7; i < 0; i += arg0) {
                final int n3 = arg5 * (arg1 >> 16);
                arg1 += arg4;
                for (int j = -arg2; j < 0; ++j) {
                    arg10 = arg9[n3 + (arg11 >> 16)];
                    arg11 += arg6;
                    if (arg10 == 0) {
                        ++arg8;
                    }
                    else {
                        final int n4 = arg14[arg8];
                        arg14[arg8++] = ib.a(ib.a(65280, n4) * n + ib.a(65280, arg10) * arg13, 16711680) + ib.a(ib.a(arg10, 16711935) * arg13 + n * ib.a(16711935, n4), -16711936) >> 8;
                    }
                }
                arg8 += arg12;
                arg11 = n2;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in tran_scale");
        }
    }
    
    private final void a(final int arg0, final int[] arg1, final int arg2, int arg3, int arg4, int arg5, final int arg6, final int[] arg7, final int arg8, final int arg9, int arg10, final int arg11, int arg12, final int arg13, int arg14, final int arg15) {
        final int n = (0xFF1712 & arg15) >> 16;
        final int n2 = (arg15 & 0xFFEE) >> 8;
        final int n3 = 0xFF & arg15;
        try {
            final int n4 = arg5;
            for (int i = -arg8; i < 0; ++i) {
                final int n5 = (arg4 >> 16) * arg13;
                int hb = arg12 >> 16;
                int n6 = arg6;
                if (hb < this.hb) {
                    final int n7 = this.hb + -hb;
                    hb = this.hb;
                    n6 -= n7;
                    arg5 += arg11 * n7;
                }
                arg14 = -arg14 + 1;
                if (this.lb <= hb - -n6) {
                    n6 -= n6 + hb + -this.lb;
                }
                if (arg14 != 0) {
                    for (int j = hb; j < n6 + hb; ++j) {
                        arg3 = arg1[n5 + (arg5 >> 16)];
                        if (arg3 != 0) {
                            final int n8 = arg3 & 0xFF;
                            final int n9 = (arg3 & 0xFFE317) >> 16;
                            final int n10 = 0xFF & arg3 >> 8;
                            if (n10 == n9 && n8 == n10) {
                                arg7[arg10 + j] = (n8 * n3 >> 8) + (n2 * n10 >> 8 << 8) + (n * n9 >> 8 << 16);
                            }
                            else {
                                arg7[j + arg10] = arg3;
                            }
                        }
                        arg5 += arg11;
                    }
                }
                arg4 += arg2;
                arg5 = n4;
                arg12 += arg9;
                arg10 += this.u;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in transparent sprite plot routine");
        }
        if (arg0 < 20) {
            this.t = null;
        }
    }
    
    final int a(final int arg0, final int arg1) {
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
        if (arg1 != 7) {
            return this.c(60, arg1);
        }
        return 29;
    }
    
    private final void a(final byte[] arg0, final int arg1, int arg2, final int arg3, final int[] arg4, final int arg5, int arg6, final int arg7, int arg8, final int arg9, final int[] arg10, int arg11, final int arg12, int arg13, int arg14, final int arg15, final int arg16) {
        final int n = (0xFF262A & arg1) >> 16;
        final int n2 = (0xFF9D & arg1) >> 8;
        final int n3 = arg1 & 0xFF;
        try {
            final int n4 = arg13;
            for (int i = -arg16; i < 0; ++i) {
                final int n5 = (arg6 >> 16) * arg5;
                int hb = arg8 >> 16;
                int n6 = arg15;
                if (this.hb > hb) {
                    final int n7 = this.hb + -hb;
                    hb = this.hb;
                    n6 -= n7;
                    arg13 += n7 * arg9;
                }
                if (this.lb <= n6 + hb) {
                    n6 -= hb + (n6 - this.lb);
                }
                arg11 = 1 + -arg11;
                arg6 += arg7;
                if (arg11 != 0) {
                    for (int n8 = hb; n6 + hb > n8; ++n8) {
                        arg2 = (arg0[(arg13 >> 16) - -n5] & 0xFF);
                        if (arg2 != 0) {
                            arg2 = arg4[arg2];
                            final int n9 = arg2 & 0xFF;
                            final int n10 = arg2 >> 16 & 0xFF;
                            final int n11 = arg2 >> 8 & 0xFF;
                            if (n11 != n10 || n11 != n9) {
                                arg10[arg14 + n8] = arg2;
                            }
                            else {
                                arg10[n8 - -arg14] = (n2 * n11 >> 8 << 8) + (n * n10 >> 8 << 16) - -(n3 * n9 >> 8);
                            }
                        }
                        arg13 += arg9;
                    }
                }
                arg8 += arg3;
                arg14 += this.u;
                arg13 = n4;
            }
        }
        catch (final Exception ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }
    
    private final void a(final int arg0, final int arg1, final String arg2, final int arg3, final int arg4, final int arg5, final int arg6) {
        this.a(arg6, arg1, arg2, arg0 - this.a(arg5, 114, arg2), arg3, (byte)123, arg5);
        if (arg4 != -12200) {
            this.b(75, -128, -127, 3, 49, -124);
        }
    }
    
    private final void a(final byte[] arg0, final int arg1, final int arg2, int arg3, final int arg4, final int arg5, final int arg6, final int arg7, final int[] arg8, int arg9) {
        if (arg6 != 1504725224) {
            this.rb = null;
        }
        for (int i = -arg4; i < 0; ++i) {
            for (int j = -arg2; j < 0; ++j) {
                final int n = 0xFF & arg0[arg9++];
                if (n <= 30) {
                    ++arg3;
                }
                else if (n < 230) {
                    final int n2 = arg8[arg3];
                    arg8[arg3++] = ib.a(-16711936, ib.a(16711935, arg1) * n - -(ib.a(n2, 16711935) * (-n + 256))) - -ib.a((256 - n) * ib.a(65280, n2) + n * ib.a(65280, arg1), 16711680) >> 8;
                }
                else {
                    arg8[arg3++] = arg1;
                }
            }
            arg9 += arg5;
            arg3 += arg7;
        }
    }
    
    final void a(final int arg0, final String arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        this.a(11815, arg2, arg4, arg3, arg1, arg0, arg5);
    }
    
    final void a(final byte arg0, final byte[] arg1, final int arg2) {
        final int[][] ob = this.ob;
        final int[] array = new int[10200];
        ob[arg2] = array;
        final int[] array2 = array;
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
        int n = 0;
        int n2 = 1;
        int i = 0;
        while (i < 255) {
            for (int j = 0xFF & arg1[n2++], n3 = 0; j > n3; ++n3) {
                array2[i++] = n;
            }
            n = -n + 16777215;
        }
        for (int k = 1; k < 40; ++k) {
            int l = 0;
            while (l < 255) {
                for (int n4 = arg1[n2++] & 0xFF, n5 = 0; n5 < n4; ++n5) {
                    array2[i] = array2[i - 255];
                    ++i;
                    ++l;
                }
                if (l >= 255) {
                    continue;
                }
                array2[i] = 16777215 - array2[i - 255];
                ++i;
                ++l;
            }
        }
    }
    
    final void a(final boolean arg0, final int arg1) {
        final int i = this.R[arg1] * this.kb[arg1];
        final int[] array = this.ob[arg1];
        final int[] array2 = new int[32768];
        if (arg0) {
            this.a(-63, 58, -7, -36, -99);
        }
        for (final int n : array) {
            final int[] array3 = array2;
            final int n2 = (0x1F & n >> 3) + ((n >> 9 & 0x7C00) + ((n & 0xF800) >> 6));
            ++array3[n2];
        }
        final int[] array4 = new int[256];
        array4[0] = 16711935;
        final int[] array5 = new int[256];
        for (int k = 0; k < 32768; ++k) {
            final int n3 = array2[k];
            if (array5[255] < n3) {
                for (int l = 1; l < 256; ++l) {
                    if (array5[l] < n3) {
                        for (int n4 = 255; l < n4; --n4) {
                            array4[n4] = array4[n4 - 1];
                            array5[n4] = array5[n4 - 1];
                        }
                        array4[l] = 263172 + ((ib.a(31, k) << 3) + ib.a(63488, k << 6) + ib.a(16252928, k << 9));
                        array5[l] = n3;
                        break;
                    }
                }
            }
            array2[k] = -1;
        }
        final byte[] array6 = new byte[i];
        for (int n5 = 0; i > n5; ++n5) {
            final int n6 = array[n5];
            final int n7 = (n6 >> 3 & 0x1F) + ((n6 & 0xF800) >> 6) + ((0xF80000 & n6) >> 9);
            int n8 = array2[n7];
            if (n8 == -1) {
                int n9 = 999999999;
                final int n10 = 0xFF & n6 >> 16;
                final int n11 = 0xFF & n6 >> 8;
                final int n12 = n6 & 0xFF;
                for (int n13 = 0; n13 < 256; ++n13) {
                    final int n14 = array4[n13];
                    final int n15 = (0xFF1E98 & n14) >> 16;
                    final int n16 = n14 >> 8 & 0xFF;
                    final int n17 = 0xFF & n14;
                    final int n18 = (-n17 + n12) * (-n17 + n12) + ((n10 - n15) * (n10 - n15) - -((-n16 + n11) * (-n16 + n11)));
                    if (n18 < n9) {
                        n8 = n13;
                        n9 = n18;
                    }
                }
                array2[n7] = n8;
            }
            array6[n5] = (byte)n8;
        }
        this.gb[arg1] = array6;
        this.Y[arg1] = array4;
        this.ob[arg1] = null;
    }
    
    final void a(final int arg0, final String arg1, final int arg2, final int arg3, final int arg4, int arg5, final boolean arg6, final int arg7) {
        try {
            int n = 0;
            final byte[] array = m.b[arg4];
            if (arg3 < 44) {
                return;
            }
            int n2 = 0;
            int n3 = 0;
            for (int n4 = 0; arg1.length() > n4; ++n4) {
                if (arg1.charAt(n4) != '@' || arg1.length() <= 4 + n4 || arg1.charAt(n4 + 4) != '@') {
                    if (arg1.charAt(n4) != '~' || arg1.length() <= 4 + n4 || arg1.charAt(4 + n4) != '~') {
                        int char1 = arg1.charAt(n4);
                        if (char1 < 0 || char1 >= n.a.length) {
                            char1 = 32;
                        }
                        n += array[7 + n.a[char1]];
                    }
                    else {
                        n4 += 4;
                    }
                }
                else {
                    n4 += 4;
                }
                if (arg1.charAt(n4) == ' ') {
                    n3 = n4;
                }
                if (arg1.charAt(n4) == '%') {
                    if (arg6) {
                        n = 1000;
                        n3 = n4;
                    }
                }
                if (n > arg0) {
                    if (n3 <= n2) {
                        n3 = n4;
                    }
                    n = 0;
                    this.a(11815, arg7, arg4, 0, arg1.substring(n2, n3), arg2, arg5);
                    n4 = (n2 = 1 + n3);
                    arg5 += this.a(508305352, arg4);
                }
            }
            if (n > 0) {
                this.a(11815, arg7, arg4, 0, arg1.substring(n2), arg2, arg5);
            }
        }
        catch (final Exception ex) {
            System.out.println("centrepara: " + ex);
            ex.printStackTrace();
        }
    }
    
    final void a(int arg0, int arg1, int arg2, final boolean arg3, final int arg4, final int arg5, int arg6, int arg7, int arg8, final int arg9) {
        try {
            if (arg2 == 0) {
                arg2 = 16777215;
            }
            if (arg1 == 0) {
                arg1 = 16777215;
            }
            final int n = this.kb[arg5];
            final int n2 = this.R[arg5];
            int n3 = 0;
            int n4 = 0;
            int n5 = arg4 << 16;
            int n6 = (n << 16) / arg7;
            int n7 = (n2 << 16) / arg6;
            final int n8 = -(arg4 << 16) / arg6;
            if (this.Qb[arg5]) {
                final int n9 = this.Eb[arg5];
                final int n10 = this.qb[arg5];
                if (n9 == 0 || n10 == 0) {
                    return;
                }
                n6 = (n9 << 16) / arg7;
                n7 = (n10 << 16) / arg6;
                int n11 = this.Sb[arg5];
                if (arg3) {
                    n11 = n9 + -this.kb[arg5] - n11;
                }
                final int n12 = this.G[arg5];
                arg8 += (n9 + n11 * arg7 - 1) / n9;
                final int n13 = (n12 * arg6 + n10 - 1) / n10;
                if (n11 * arg7 % n9 != 0) {
                    n3 = (-(arg7 * n11 % n9) + n9 << 16) / arg7;
                }
                arg0 += n13;
                n5 += n13 * n8;
                if (n12 * arg6 % n10 != 0) {
                    n4 = (n10 - arg6 * n12 % n10 << 16) / arg6;
                }
                arg7 = (n6 + ((this.kb[arg5] << 16) - (n3 + 1))) / n6;
                arg6 = ((this.R[arg5] << 16) + -n4 - (-n7 + 1)) / n7;
            }
            int n14 = this.u * arg0;
            int n15 = n5 + (arg8 << 16);
            if (arg0 < this.A) {
                final int n16 = this.A + -arg0;
                n15 += n8 * n16;
                arg6 -= n16;
                n4 += n16 * n7;
                n14 += this.u * n16;
                arg0 = this.A;
            }
            if (arg0 - -arg6 >= this.Rb) {
                arg6 -= 1 + (arg0 + arg6) - this.Rb;
            }
            int n17 = n14 / this.u & arg9;
            if (!this.i) {
                n17 = 2;
            }
            if (arg2 == 16777215) {
                if (this.ob[arg5] != null) {
                    if (arg3) {
                        this.a(arg9 ^ 0x4A, this.ob[arg5], n7, 0, n4, (this.kb[arg5] << 16) + (-n3 - 1), arg7, this.rb, arg6, n8, n14, -n6, n15, n, n17, arg1);
                    }
                    else {
                        this.a(arg9 + 89, this.ob[arg5], n7, 0, n4, n3, arg7, this.rb, arg6, n8, n14, n6, n15, n, n17, arg1);
                    }
                }
                else if (!arg3) {
                    this.a(this.gb[arg5], arg1, 0, n8, this.Y[arg5], n, n4, n7, n15, n6, this.rb, n17, -110, n3, n14, arg7, arg6);
                }
                else {
                    this.a(this.gb[arg5], arg1, 0, n8, this.Y[arg5], n, n4, n7, n15, -n6, this.rb, n17, arg9 ^ 0xFFFFFF84, -n3 + (this.kb[arg5] << 16) - 1, n14, arg7, arg6);
                }
            }
            else if (this.ob[arg5] == null) {
                if (arg3) {
                    this.a(arg6, this.Y[arg5], n, n7, 0, n8, n14, n4, this.gb[arg5], n17, (byte)76, -n3 + ((this.kb[arg5] << 16) - 1), arg2, n15, -n6, arg7, this.rb, arg1);
                }
                else {
                    this.a(arg6, this.Y[arg5], n, n7, 0, n8, n14, n4, this.gb[arg5], n17, (byte)78, n3, arg2, n15, n6, arg7, this.rb, arg1);
                }
            }
            else if (arg3) {
                this.a(this.rb, this.ob[arg5], arg7, n8, n15, arg9 + 1603920391, 0, arg2, n7, -n6, -n3 + (this.kb[arg5] << 16) - 1, n17, n4, n, arg1, arg6, n14);
            }
            else {
                this.a(this.rb, this.ob[arg5], arg7, n8, n15, 1603920392, 0, arg2, n7, n6, n3, n17, n4, n, arg1, arg6, n14);
            }
        }
        catch (final Exception ex) {
            System.out.println("error in sprite clipping routine");
        }
    }
    
    @Override
    public final void startProduction(final ImageConsumer arg0) {
        this.addConsumer(arg0);
    }
    
    @Override
    public final synchronized boolean isConsumer(final ImageConsumer arg0) {
        return this.fb == arg0;
    }
    
    private final void a(int arg0, final int[] arg1, final int arg2, final int arg3, int arg4, int arg5, final byte arg6, int arg7, final int[] arg8, final int arg9, final int arg10) {
        if (arg6 <= 122) {
            this.e(121, 54, -117, -34, 67, -103);
        }
        final int n = -(arg0 >> 2);
        arg0 = -(0x3 & arg0);
        for (int i = -arg3; i < 0; i += arg2) {
            for (int j = n; j < 0; ++j) {
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                }
                else {
                    arg1[arg7++] = arg4;
                }
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                }
                else {
                    arg1[arg7++] = arg4;
                }
                arg4 = arg8[arg5++];
                if (arg4 != 0) {
                    arg1[arg7++] = arg4;
                }
                else {
                    ++arg7;
                }
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                }
                else {
                    arg1[arg7++] = arg4;
                }
            }
            for (int k = arg0; k < 0; ++k) {
                arg4 = arg8[arg5++];
                if (arg4 == 0) {
                    ++arg7;
                }
                else {
                    arg1[arg7++] = arg4;
                }
            }
            arg5 += arg10;
            arg7 += arg9;
        }
    }
    
    final void a(int arg0, int arg1, int arg2, int arg3, final byte arg4) {
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
            ua.C = 109;
        }
        this.A = arg3;
        this.Rb = arg2;
        this.lb = arg1;
        this.hb = arg0;
    }
    
    final void a(final boolean arg0) {
        final int i = this.k * this.u;
        if (arg0 == !this.i) {
            for (int n = 0; i > n; ++n) {
                this.rb[n] = 0;
            }
        }
        else {
            int n2 = 0;
            for (int j = -this.k; j < 0; j += 2) {
                for (int k = -this.u; k < 0; ++k) {
                    this.rb[n2++] = 0;
                }
                n2 += this.u;
            }
        }
    }
    
    final void a(int arg0, final byte arg1, final int arg2, int arg3, int arg4, int arg5) {
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
        int n = this.u + -arg5;
        int n2 = 1;
        if (this.i) {
            n += this.u;
            if ((arg3 & 0x1) != 0x0) {
                --arg4;
                ++arg3;
            }
            n2 = 2;
        }
        int n3 = arg0 - -(this.u * arg3);
        for (int i = -arg4; i < 0; i += n2) {
            for (int j = -arg5; j < 0; ++j) {
                this.rb[n3++] = arg2;
            }
            n3 += n;
        }
    }
    
    final void a(final String arg0, final int arg1, final int arg2, final int arg3, final boolean arg4, final int arg5) {
        this.a(0, arg2, arg0, arg1, arg3, (byte)124, arg5);
        if (arg4) {
            this.a(-43, 36, -60, -88, 93, null, 114, null, -53, 59, true, 66, 34, 34, 70);
        }
    }
    
    final void a(final int arg0) {
        this.lb = this.u;
        if (arg0 != -1) {
            this.Sb = null;
        }
        this.hb = 0;
        this.A = 0;
        this.Rb = this.k;
    }
    
    final void a(final int arg0, final int arg1, final byte[] arg2, final int arg3, final byte[] arg4) {
        int a = d.a(0, (byte)41, arg2);
        final int a2 = d.a(a, (byte)48, arg4);
        a += 2;
        if (arg3 < 49) {
            this.b(-97, -40, 4, -57, 24, 50, 82);
        }
        final int a3 = d.a(a, (byte)15, arg4);
        a += 2;
        final int n = arg4[a++] & 0xFF;
        final int[] array = new int[n];
        array[0] = 16711935;
        for (int n2 = 0; n - 1 > n2; ++n2) {
            array[n2 + 1] = (ib.a(255, arg4[a]) << 16) - -ib.a(65280, arg4[a + 1] << 8) + ib.a(arg4[a + 2], 255);
            a += 3;
        }
        int n3 = 2;
        for (int i = arg0; i < arg0 + arg1; ++i) {
            this.Sb[i] = ib.a(arg4[a++], 255);
            this.G[i] = ib.a(arg4[a++], 255);
            this.kb[i] = d.a(a, (byte)32, arg4);
            a += 2;
            this.R[i] = d.a(a, (byte)83, arg4);
            a += 2;
            final int n4 = arg4[a++] & 0xFF;
            final int j = this.R[i] * this.kb[i];
            this.gb[i] = new byte[j];
            this.Y[i] = array;
            this.Eb[i] = a2;
            this.qb[i] = a3;
            this.ob[i] = null;
            this.Qb[i] = false;
            if (this.Sb[i] != 0 || this.G[i] != 0) {
                this.Qb[i] = true;
            }
            if (n4 != 0) {
                if (n4 == 1) {
                    for (int n5 = 0; this.kb[i] > n5; ++n5) {
                        for (int n6 = 0; this.R[i] > n6; ++n6) {
                            this.gb[i][n6 * this.kb[i] + n5] = arg2[n3++];
                            if (this.gb[i][n5 + n6 * this.kb[i]] == 0) {
                                this.Qb[i] = true;
                            }
                        }
                    }
                }
            }
            else {
                for (int n7 = 0; j > n7; ++n7) {
                    this.gb[i][n7] = arg2[n3++];
                    if (this.gb[i][n7] == 0) {
                        this.Qb[i] = true;
                    }
                }
            }
        }
    }
    
    ua(final int arg0, final int arg1, final int arg2, final Component arg3) {
        super();
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
        if (arg0 > 1 && arg1 > 1 && arg3 != null) {
            this.nb = new DirectColorModel(32, 16711680, 65280, 255);
            for (int n = this.k * this.u, i = 0; i < n; ++i) {
                this.rb[i] = 0;
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
        ua.E = new v("LIVE", "", "", 0);
        ua.C = 114;
        ua.wb = new String[100];
        ua.Kb = new String[] { "Enter number of items to remove and press enter" };
        ua.h = new String[200];
    }
}
