final class sb extends va
{
    private int t;
    private int x;
    private int o;
    private int p;
    private int n;
    private int r;
    private int y;
    private int s;
    private int v;
    private int l;
    private int m;
    private int w;
    private int k;
    private int q;
    private boolean u;
    
    @Override
    final int c() {
        final int n = this.w * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.l == 0) {
            n2 -= n2 * this.v / (((vb)this.h).l.length << 8);
        }
        else if (this.l >= 0) {
            n2 -= n2 * this.x / ((vb)this.h).l.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    private static final int b(final byte[] arg0, final int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, final int arg7, int arg8, final sb arg9) {
        arg2 >>= 8;
        arg8 >>= 8;
        arg4 <<= 2;
        arg5 <<= 2;
        if ((arg6 = arg3 + arg2 - (arg8 - 1)) > arg7) {
            arg6 = arg7;
        }
        arg9.k += arg9.p * (arg6 - arg3);
        arg9.m += arg9.o * (arg6 - arg3);
        int n;
        int n2;
        int n3;
        int n4;
        for (arg6 -= 3; arg3 < arg6; n = arg3++, arg1[n] += arg0[arg2--] * arg4, arg4 += arg5, n2 = arg3++, arg1[n2] += arg0[arg2--] * arg4, arg4 += arg5, n3 = arg3++, arg1[n3] += arg0[arg2--] * arg4, arg4 += arg5, n4 = arg3++, arg1[n4] += arg0[arg2--] * arg4, arg4 += arg5) {}
        int n5;
        for (arg6 += 3; arg3 < arg6; n5 = arg3++, arg1[n5] += arg0[arg2--] * arg4, arg4 += arg5) {}
        arg9.w = arg4 >> 2;
        arg9.v = arg2 << 8;
        return arg3;
    }
    
    @Override
    final synchronized void b(final int[] arg0, final int arg1, int arg2) {
        if (this.r == 0 && this.y == 0) {
            this.b(arg2);
            return;
        }
        final vb vb = (vb)this.h;
        final int n = this.x << 8;
        final int n2 = this.t << 8;
        final int n3 = vb.l.length << 8;
        final int n4 = n2 - n;
        if (n4 <= 0) {
            this.l = 0;
        }
        int arg3 = arg1;
        arg2 += arg1;
        if (this.v < 0) {
            if (this.n <= 0) {
                this.g();
                this.a(-27331);
                return;
            }
            this.v = 0;
        }
        if (this.v >= n3) {
            if (this.n >= 0) {
                this.g();
                this.a(-27331);
                return;
            }
            this.v = n3 - 1;
        }
        if (this.l >= 0) {
            Label_0935: {
                if (this.l > 0) {
                    if (this.u) {
                        if (this.n < 0) {
                            arg3 = this.b(arg0, arg3, n, arg2, vb.l[this.x]);
                            if (this.v >= n) {
                                return;
                            }
                            this.v = n + n - 1 - this.v;
                            this.n = -this.n;
                            if (--this.l == 0) {
                                break Label_0935;
                            }
                        }
                        do {
                            arg3 = this.a(arg0, arg3, n2, arg2, vb.l[this.t - 1]);
                            if (this.v < n2) {
                                return;
                            }
                            this.v = n2 + n2 - 1 - this.v;
                            this.n = -this.n;
                            if (--this.l == 0) {
                                break;
                            }
                            arg3 = this.b(arg0, arg3, n, arg2, vb.l[this.x]);
                            if (this.v >= n) {
                                return;
                            }
                            this.v = n + n - 1 - this.v;
                            this.n = -this.n;
                        } while (--this.l != 0);
                    }
                    else if (this.n < 0) {
                        while (true) {
                            arg3 = this.b(arg0, arg3, n, arg2, vb.l[this.t - 1]);
                            if (this.v >= n) {
                                return;
                            }
                            final int n5 = (n2 - 1 - this.v) / n4;
                            if (n5 >= this.l) {
                                this.v += n4 * this.l;
                                this.l = 0;
                                break;
                            }
                            this.v += n4 * n5;
                            this.l -= n5;
                        }
                    }
                    else {
                        while (true) {
                            arg3 = this.a(arg0, arg3, n2, arg2, vb.l[this.x]);
                            if (this.v < n2) {
                                return;
                            }
                            final int n6 = (this.v - n) / n4;
                            if (n6 >= this.l) {
                                this.v -= n4 * this.l;
                                this.l = 0;
                                break;
                            }
                            this.v -= n4 * n6;
                            this.l -= n6;
                        }
                    }
                }
            }
            if (this.n < 0) {
                this.b(arg0, arg3, 0, arg2, 0);
                if (this.v < 0) {
                    this.v = -1;
                    this.g();
                    this.a(-27331);
                }
            }
            else {
                this.a(arg0, arg3, n3, arg2, 0);
                if (this.v >= n3) {
                    this.v = n3;
                    this.g();
                    this.a(-27331);
                }
            }
            return;
        }
        if (this.u) {
            if (this.n < 0) {
                arg3 = this.b(arg0, arg3, n, arg2, vb.l[this.x]);
                if (this.v >= n) {
                    return;
                }
                this.v = n + n - 1 - this.v;
                this.n = -this.n;
            }
            while (true) {
                final int a = this.a(arg0, arg3, n2, arg2, vb.l[this.t - 1]);
                if (this.v < n2) {
                    return;
                }
                this.v = n2 + n2 - 1 - this.v;
                this.n = -this.n;
                arg3 = this.b(arg0, a, n, arg2, vb.l[this.x]);
                if (this.v >= n) {
                    return;
                }
                this.v = n + n - 1 - this.v;
                this.n = -this.n;
            }
        }
        else {
            if (this.n < 0) {
                while (true) {
                    arg3 = this.b(arg0, arg3, n, arg2, vb.l[this.t - 1]);
                    if (this.v >= n) {
                        break;
                    }
                    this.v = n2 - 1 - (n2 - 1 - this.v) % n4;
                }
                return;
            }
            while (true) {
                arg3 = this.a(arg0, arg3, n2, arg2, vb.l[this.x]);
                if (this.v < n2) {
                    break;
                }
                this.v = n + (this.v - n) % n4;
            }
        }
    }
    
    static final sb a(final vb arg0, final int arg1, final int arg2) {
        if (arg0.l == null || arg0.l.length == 0) {
            return null;
        }
        return new sb(arg0, (int)(arg0.i * 256L * arg1 / (100 * sa.t)), arg2 << 6);
    }
    
    private static final int a(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, final int arg6, final int arg7, int arg8, final int arg9, final int arg10, final sb arg11, final int arg12, final int arg13) {
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
            arg8 = arg9;
        }
        int n;
        int n2;
        for (arg5 <<= 1, arg8 <<= 1; arg5 < arg8; n = arg5++, arg3[n] += arg0 * arg6 >> 6, n2 = arg5++, arg3[n2] += arg0 * arg7 >> 6, arg4 += arg12) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF);
        }
        if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg8 <<= 1;
        arg1 = arg13;
        while (arg5 < arg8) {
            arg0 = arg2[arg4 >> 8];
            arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF);
            final int n3 = arg5++;
            arg3[n3] += arg0 * arg6 >> 6;
            final int n4 = arg5++;
            arg3[n4] += arg0 * arg7 >> 6;
            arg4 += arg12;
        }
        arg11.v = arg4;
        return arg5 >> 1;
    }
    
    private final boolean f() {
        int r = this.r;
        int c;
        int b;
        if (r == Integer.MIN_VALUE) {
            c = 0;
            b = 0;
            r = 0;
        }
        else {
            b = b(r, this.q);
            c = c(r, this.q);
        }
        if (this.w != r || this.k != b || this.m != c) {
            if (this.w < r) {
                this.s = 1;
                this.y = r - this.w;
            }
            else if (this.w > r) {
                this.s = -1;
                this.y = this.w - r;
            }
            else {
                this.s = 0;
            }
            if (this.k < b) {
                this.p = 1;
                if (this.y == 0 || this.y > b - this.k) {
                    this.y = b - this.k;
                }
            }
            else if (this.k > b) {
                this.p = -1;
                if (this.y == 0 || this.y > this.k - b) {
                    this.y = this.k - b;
                }
            }
            else {
                this.p = 0;
            }
            if (this.m < c) {
                this.o = 1;
                if (this.y == 0 || this.y > c - this.m) {
                    this.y = c - this.m;
                }
            }
            else if (this.m > c) {
                this.o = -1;
                if (this.y == 0 || this.y > this.m - c) {
                    this.y = this.m - c;
                }
            }
            else {
                this.o = 0;
            }
            return false;
        }
        if (this.r == Integer.MIN_VALUE) {
            this.r = 0;
            this.m = 0;
            this.k = 0;
            this.w = 0;
            this.a(-27331);
            return true;
        }
        this.e();
        return false;
    }
    
    private static final int a(int arg0, final byte[] arg1, final int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, final int arg8, int arg9, final sb arg10) {
        arg3 >>= 8;
        arg9 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        if ((arg7 = arg4 + arg9 - arg3) > arg8) {
            arg7 = arg8;
        }
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (arg4 <<= 1, arg7 <<= 1, arg7 -= 6; arg4 < arg7; n = arg4++, arg2[n] += arg0 * arg5, n2 = arg4++, arg2[n2] += arg0 * arg6, arg0 = arg1[arg3++], n3 = arg4++, arg2[n3] += arg0 * arg5, n4 = arg4++, arg2[n4] += arg0 * arg6, arg0 = arg1[arg3++], n5 = arg4++, arg2[n5] += arg0 * arg5, n6 = arg4++, arg2[n6] += arg0 * arg6, arg0 = arg1[arg3++], n7 = arg4++, arg2[n7] += arg0 * arg5, n8 = arg4++, arg2[n8] += arg0 * arg6) {
            arg0 = arg1[arg3++];
        }
        int n9;
        int n10;
        for (arg7 += 6; arg4 < arg7; n9 = arg4++, arg2[n9] += arg0 * arg5, n10 = arg4++, arg2[n10] += arg0 * arg6) {
            arg0 = arg1[arg3++];
        }
        arg10.v = arg3 << 8;
        return arg4 >> 1;
    }
    
    private final int b(final int[] arg0, int arg1, final int arg2, final int arg3, final int arg4) {
        while (this.y > 0) {
            int n = arg1 + this.y;
            if (n > arg3) {
                n = arg3;
            }
            this.y += arg1;
            if (this.n == -256 && (this.v & 0xFF) == 0x0) {
                if (sa.i) {
                    arg1 = b(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n, arg2, this);
                }
                else {
                    arg1 = b(((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n, arg2, this);
                }
            }
            else if (sa.i) {
                arg1 = b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n, arg2, this, this.n, arg4);
            }
            else {
                arg1 = c(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n, arg2, this, this.n, arg4);
            }
            this.y -= arg1;
            if (this.y != 0) {
                return arg1;
            }
            if (this.f()) {
                return arg3;
            }
        }
        if (this.n == -256 && (this.v & 0xFF) == 0x0) {
            if (sa.i) {
                return b(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this);
            }
            return a(((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this);
        }
        else {
            if (sa.i) {
                return d(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this, this.n, arg4);
            }
            return b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this, this.n, arg4);
        }
    }
    
    private static final int c(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, int arg6, final int arg7, int arg8, final int arg9, final int arg10, final sb arg11, final int arg12, final int arg13) {
        arg11.k -= arg11.p * arg5;
        arg11.m -= arg11.o * arg5;
        if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            final int n = arg5++;
            arg3[n] += ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        int n2;
        for (arg0 = arg13, arg1 = arg12; arg5 < arg8; n2 = arg5++, arg3[n2] += ((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xFF)) * arg6 >> 6, arg6 += arg7, arg4 += arg1) {}
        arg11.k += arg11.p * arg5;
        arg11.m += arg11.o * arg5;
        arg11.w = arg6;
        arg11.v = arg4;
        return arg5;
    }
    
    private static final int d(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, final int arg6, final int arg7, int arg8, final int arg9, final int arg10, final sb arg11, final int arg12, final int arg13) {
        if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        int n;
        int n2;
        for (arg5 <<= 1, arg8 <<= 1; arg5 < arg8; n = arg5++, arg3[n] += arg0 * arg6 >> 6, n2 = arg5++, arg3[n2] += arg0 * arg7 >> 6, arg4 += arg12) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF);
        }
        if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg8 <<= 1;
        arg1 = arg13;
        while (arg5 < arg8) {
            arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xFF);
            final int n3 = arg5++;
            arg3[n3] += arg0 * arg6 >> 6;
            final int n4 = arg5++;
            arg3[n4] += arg0 * arg7 >> 6;
            arg4 += arg12;
        }
        arg11.v = arg4;
        return arg5 >> 1;
    }
    
    private final void e() {
        this.w = this.r;
        this.k = b(this.r, this.q);
        this.m = c(this.r, this.q);
    }
    
    private static final int a(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, int arg6, int arg7, final int arg8, final int arg9, int arg10, final int arg11, final int arg12, final sb arg13, final int arg14, final int arg15) {
        arg13.w -= arg13.s * arg5;
        if (arg14 == 0 || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11) {
            arg10 = arg11;
        }
        int n;
        int n2;
        for (arg5 <<= 1, arg10 <<= 1; arg5 < arg10; n = arg5++, arg3[n] += arg0 * arg6 >> 6, arg6 += arg8, n2 = arg5++, arg3[n2] += arg0 * arg7 >> 6, arg7 += arg9, arg4 += arg14) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF);
        }
        if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg10 <<= 1;
        arg1 = arg15;
        while (arg5 < arg10) {
            arg0 = arg2[arg4 >> 8];
            arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF);
            final int n3 = arg5++;
            arg3[n3] += arg0 * arg6 >> 6;
            arg6 += arg8;
            final int n4 = arg5++;
            arg3[n4] += arg0 * arg7 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg5 >>= 1;
        arg13.w += arg13.s * arg5;
        arg13.k = arg6;
        arg13.m = arg7;
        arg13.v = arg4;
        return arg5;
    }
    
    @Override
    final va b() {
        return null;
    }
    
    private static final int a(final byte[] arg0, final int[] arg1, int arg2, int arg3, int arg4, int arg5, final int arg6, int arg7, final sb arg8) {
        arg2 >>= 8;
        arg7 >>= 8;
        arg4 <<= 2;
        if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6) {
            arg5 = arg6;
        }
        int n;
        int n2;
        int n3;
        int n4;
        for (arg5 -= 3; arg3 < arg5; n = arg3++, arg1[n] += arg0[arg2--] * arg4, n2 = arg3++, arg1[n2] += arg0[arg2--] * arg4, n3 = arg3++, arg1[n3] += arg0[arg2--] * arg4, n4 = arg3++, arg1[n4] += arg0[arg2--] * arg4) {}
        int n5;
        for (arg5 += 3; arg3 < arg5; n5 = arg3++, arg1[n5] += arg0[arg2--] * arg4) {}
        arg8.v = arg2 << 8;
        return arg3;
    }
    
    private static final int a(int arg0, final byte[] arg1, final int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, final int arg10, int arg11, final sb arg12) {
        arg3 >>= 8;
        arg11 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        if ((arg9 = arg4 + arg11 - arg3) > arg10) {
            arg9 = arg10;
        }
        arg12.w += arg12.s * (arg9 - arg4);
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (arg4 <<= 1, arg9 <<= 1, arg9 -= 6; arg4 < arg9; n = arg4++, arg2[n] += arg0 * arg5, arg5 += arg7, n2 = arg4++, arg2[n2] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3++], n3 = arg4++, arg2[n3] += arg0 * arg5, arg5 += arg7, n4 = arg4++, arg2[n4] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3++], n5 = arg4++, arg2[n5] += arg0 * arg5, arg5 += arg7, n6 = arg4++, arg2[n6] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3++], n7 = arg4++, arg2[n7] += arg0 * arg5, arg5 += arg7, n8 = arg4++, arg2[n8] += arg0 * arg6, arg6 += arg8) {
            arg0 = arg1[arg3++];
        }
        int n9;
        int n10;
        for (arg9 += 6; arg4 < arg9; n9 = arg4++, arg2[n9] += arg0 * arg5, arg5 += arg7, n10 = arg4++, arg2[n10] += arg0 * arg6, arg6 += arg8) {
            arg0 = arg1[arg3++];
        }
        arg12.k = arg5 >> 2;
        arg12.m = arg6 >> 2;
        arg12.v = arg3 << 8;
        return arg4 >> 1;
    }
    
    private static final int b(int arg0, final byte[] arg1, final int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, final int arg8, int arg9, final sb arg10) {
        arg3 >>= 8;
        arg9 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        if ((arg7 = arg4 + arg3 - (arg9 - 1)) > arg8) {
            arg7 = arg8;
        }
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (arg4 <<= 1, arg7 <<= 1, arg7 -= 6; arg4 < arg7; n = arg4++, arg2[n] += arg0 * arg5, n2 = arg4++, arg2[n2] += arg0 * arg6, arg0 = arg1[arg3--], n3 = arg4++, arg2[n3] += arg0 * arg5, n4 = arg4++, arg2[n4] += arg0 * arg6, arg0 = arg1[arg3--], n5 = arg4++, arg2[n5] += arg0 * arg5, n6 = arg4++, arg2[n6] += arg0 * arg6, arg0 = arg1[arg3--], n7 = arg4++, arg2[n7] += arg0 * arg5, n8 = arg4++, arg2[n8] += arg0 * arg6) {
            arg0 = arg1[arg3--];
        }
        int n9;
        int n10;
        for (arg7 += 6; arg4 < arg7; n9 = arg4++, arg2[n9] += arg0 * arg5, n10 = arg4++, arg2[n10] += arg0 * arg6) {
            arg0 = arg1[arg3--];
        }
        arg10.v = arg3 << 8;
        return arg4 >> 1;
    }
    
    private static final int b(final byte[] arg0, final int[] arg1, int arg2, int arg3, int arg4, int arg5, final int arg6, int arg7, final sb arg8) {
        arg2 >>= 8;
        arg7 >>= 8;
        arg4 <<= 2;
        if ((arg5 = arg3 + arg7 - arg2) > arg6) {
            arg5 = arg6;
        }
        int n;
        int n2;
        int n3;
        int n4;
        for (arg5 -= 3; arg3 < arg5; n = arg3++, arg1[n] += arg0[arg2++] * arg4, n2 = arg3++, arg1[n2] += arg0[arg2++] * arg4, n3 = arg3++, arg1[n3] += arg0[arg2++] * arg4, n4 = arg3++, arg1[n4] += arg0[arg2++] * arg4) {}
        int n5;
        for (arg5 += 3; arg3 < arg5; n5 = arg3++, arg1[n5] += arg0[arg2++] * arg4) {}
        arg8.v = arg2 << 8;
        return arg3;
    }
    
    private static final int b(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, int arg6, int arg7, final int arg8, final int arg9, int arg10, final int arg11, final int arg12, final sb arg13, final int arg14, final int arg15) {
        arg13.w -= arg13.s * arg5;
        if (arg14 == 0 || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11) {
            arg10 = arg11;
        }
        int n;
        int n2;
        for (arg5 <<= 1, arg10 <<= 1; arg5 < arg10; n = arg5++, arg3[n] += arg0 * arg6 >> 6, arg6 += arg8, n2 = arg5++, arg3[n2] += arg0 * arg7 >> 6, arg7 += arg9, arg4 += arg14) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF);
        }
        if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg10 <<= 1;
        arg1 = arg15;
        while (arg5 < arg10) {
            arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xFF);
            final int n3 = arg5++;
            arg3[n3] += arg0 * arg6 >> 6;
            arg6 += arg8;
            final int n4 = arg5++;
            arg3[n4] += arg0 * arg7 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg5 >>= 1;
        arg13.w += arg13.s * arg5;
        arg13.k = arg6;
        arg13.m = arg7;
        arg13.v = arg4;
        return arg5;
    }
    
    private static final int b(int arg0, final byte[] arg1, final int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, final int arg10, int arg11, final sb arg12) {
        arg3 >>= 8;
        arg11 >>= 8;
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        if ((arg9 = arg4 + arg3 - (arg11 - 1)) > arg10) {
            arg9 = arg10;
        }
        arg12.w += arg12.s * (arg9 - arg4);
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (arg4 <<= 1, arg9 <<= 1, arg9 -= 6; arg4 < arg9; n = arg4++, arg2[n] += arg0 * arg5, arg5 += arg7, n2 = arg4++, arg2[n2] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3--], n3 = arg4++, arg2[n3] += arg0 * arg5, arg5 += arg7, n4 = arg4++, arg2[n4] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3--], n5 = arg4++, arg2[n5] += arg0 * arg5, arg5 += arg7, n6 = arg4++, arg2[n6] += arg0 * arg6, arg6 += arg8, arg0 = arg1[arg3--], n7 = arg4++, arg2[n7] += arg0 * arg5, arg5 += arg7, n8 = arg4++, arg2[n8] += arg0 * arg6, arg6 += arg8) {
            arg0 = arg1[arg3--];
        }
        int n9;
        int n10;
        for (arg9 += 6; arg4 < arg9; n9 = arg4++, arg2[n9] += arg0 * arg5, arg5 += arg7, n10 = arg4++, arg2[n10] += arg0 * arg6, arg6 += arg8) {
            arg0 = arg1[arg3--];
        }
        arg12.k = arg5 >> 2;
        arg12.m = arg6 >> 2;
        arg12.v = arg3 << 8;
        return arg4 >> 1;
    }
    
    private final void g() {
        if (this.y != 0) {
            if (this.r == Integer.MIN_VALUE) {
                this.r = 0;
            }
            this.y = 0;
            this.e();
        }
    }
    
    private static final int b(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, final int arg6, int arg7, final int arg8, final int arg9, final sb arg10, final int arg11, final int arg12) {
        if (arg11 == 0 || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8) {
            arg7 = arg8;
        }
        while (arg5 < arg7) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            final int n = arg5++;
            arg3[n] += ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6;
            arg4 += arg11;
        }
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8) {
            arg7 = arg8;
        }
        int n2;
        for (arg0 = arg12, arg1 = arg11; arg5 < arg7; n2 = arg5++, arg3[n2] += ((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xFF)) * arg6 >> 6, arg4 += arg1) {}
        arg10.v = arg4;
        return arg5;
    }
    
    private static final int c(final int arg0, final int arg1) {
        return (arg1 < 0) ? (-arg0) : ((int)(arg0 * Math.sqrt(arg1 * 1.220703125E-4) + 0.5));
    }
    
    private static final int a(final byte[] arg0, final int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, final int arg7, int arg8, final sb arg9) {
        arg2 >>= 8;
        arg8 >>= 8;
        arg4 <<= 2;
        arg5 <<= 2;
        if ((arg6 = arg3 + arg8 - arg2) > arg7) {
            arg6 = arg7;
        }
        arg9.k += arg9.p * (arg6 - arg3);
        arg9.m += arg9.o * (arg6 - arg3);
        int n;
        int n2;
        int n3;
        int n4;
        for (arg6 -= 3; arg3 < arg6; n = arg3++, arg1[n] += arg0[arg2++] * arg4, arg4 += arg5, n2 = arg3++, arg1[n2] += arg0[arg2++] * arg4, arg4 += arg5, n3 = arg3++, arg1[n3] += arg0[arg2++] * arg4, arg4 += arg5, n4 = arg3++, arg1[n4] += arg0[arg2++] * arg4, arg4 += arg5) {}
        int n5;
        for (arg6 += 3; arg3 < arg6; n5 = arg3++, arg1[n5] += arg0[arg2++] * arg4, arg4 += arg5) {}
        arg9.w = arg4 >> 2;
        arg9.v = arg2 << 8;
        return arg3;
    }
    
    private static final int a(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, final int arg6, int arg7, final int arg8, final int arg9, final sb arg10, final int arg11, final int arg12) {
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8) {
            arg7 = arg8;
        }
        while (arg5 < arg7) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            final int n = arg5++;
            arg3[n] += ((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6;
            arg4 += arg11;
        }
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8) {
            arg7 = arg8;
        }
        int n2;
        for (arg1 = arg12; arg5 < arg7; n2 = arg5++, arg3[n2] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF)) * arg6 >> 6, arg4 += arg11) {
            arg0 = arg2[arg4 >> 8];
        }
        arg10.v = arg4;
        return arg5;
    }
    
    @Override
    final va a() {
        return null;
    }
    
    @Override
    final synchronized void b(int arg0) {
        if (this.y > 0) {
            if (arg0 >= this.y) {
                if (this.r == Integer.MIN_VALUE) {
                    this.r = 0;
                    this.m = 0;
                    this.k = 0;
                    this.w = 0;
                    this.a(-27331);
                    arg0 = this.y;
                }
                this.y = 0;
                this.e();
            }
            else {
                this.w += this.s * arg0;
                this.k += this.p * arg0;
                this.m += this.o * arg0;
                this.y -= arg0;
            }
        }
        final vb vb = (vb)this.h;
        final int n = this.x << 8;
        final int n2 = this.t << 8;
        final int v = vb.l.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.l = 0;
        }
        if (this.v < 0) {
            if (this.n <= 0) {
                this.g();
                this.a(-27331);
                return;
            }
            this.v = 0;
        }
        if (this.v >= v) {
            if (this.n >= 0) {
                this.g();
                this.a(-27331);
                return;
            }
            this.v = v - 1;
        }
        this.v += this.n * arg0;
        if (this.l >= 0) {
            Label_0793: {
                if (this.l > 0) {
                    if (this.u) {
                        if (this.n < 0) {
                            if (this.v >= n) {
                                return;
                            }
                            this.v = n + n - 1 - this.v;
                            this.n = -this.n;
                            if (--this.l == 0) {
                                break Label_0793;
                            }
                        }
                        while (this.v >= n2) {
                            this.v = n2 + n2 - 1 - this.v;
                            this.n = -this.n;
                            if (--this.l == 0) {
                                break Label_0793;
                            }
                            if (this.v >= n) {
                                return;
                            }
                            this.v = n + n - 1 - this.v;
                            this.n = -this.n;
                            if (--this.l == 0) {
                                break Label_0793;
                            }
                        }
                        return;
                    }
                    if (this.n < 0) {
                        if (this.v >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.v) / n3;
                        if (n4 >= this.l) {
                            this.v += n3 * this.l;
                            this.l = 0;
                            break Label_0793;
                        }
                        this.v += n3 * n4;
                        this.l -= n4;
                    }
                    else {
                        if (this.v < n2) {
                            return;
                        }
                        final int n5 = (this.v - n) / n3;
                        if (n5 >= this.l) {
                            this.v -= n3 * this.l;
                            this.l = 0;
                            break Label_0793;
                        }
                        this.v -= n3 * n5;
                        this.l -= n5;
                    }
                    return;
                }
            }
            if (this.n < 0) {
                if (this.v < 0) {
                    this.v = -1;
                    this.g();
                    this.a(-27331);
                }
            }
            else if (this.v >= v) {
                this.v = v;
                this.g();
                this.a(-27331);
            }
            return;
        }
        if (this.u) {
            if (this.n < 0) {
                if (this.v >= n) {
                    return;
                }
                this.v = n + n - 1 - this.v;
                this.n = -this.n;
            }
            while (this.v >= n2) {
                this.v = n2 + n2 - 1 - this.v;
                this.n = -this.n;
                if (this.v >= n) {
                    return;
                }
                this.v = n + n - 1 - this.v;
                this.n = -this.n;
            }
            return;
        }
        if (this.n < 0) {
            if (this.v >= n) {
                return;
            }
            this.v = n2 - 1 - (n2 - 1 - this.v) % n3;
        }
        else {
            if (this.v < n2) {
                return;
            }
            this.v = n + (this.v - n) % n3;
        }
    }
    
    private static final int b(final int arg0, final int arg1) {
        return (arg1 < 0) ? arg0 : ((int)(arg0 * Math.sqrt((16384 - arg1) * 1.220703125E-4) + 0.5));
    }
    
    private final int a(final int[] arg0, int arg1, final int arg2, final int arg3, final int arg4) {
        while (this.y > 0) {
            int n = arg1 + this.y;
            if (n > arg3) {
                n = arg3;
            }
            this.y += arg1;
            if (this.n == 256 && (this.v & 0xFF) == 0x0) {
                if (sa.i) {
                    arg1 = a(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n, arg2, this);
                }
                else {
                    arg1 = a(((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n, arg2, this);
                }
            }
            else if (sa.i) {
                arg1 = a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n, arg2, this, this.n, arg4);
            }
            else {
                arg1 = b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n, arg2, this, this.n, arg4);
            }
            this.y -= arg1;
            if (this.y != 0) {
                return arg1;
            }
            if (this.f()) {
                return arg3;
            }
        }
        if (this.n == 256 && (this.v & 0xFF) == 0x0) {
            if (sa.i) {
                return a(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this);
            }
            return b(((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this);
        }
        else {
            if (sa.i) {
                return a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this, this.n, arg4);
            }
            return a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this, this.n, arg4);
        }
    }
    
    @Override
    final int d() {
        if (this.r == 0 && this.y == 0) {
            return 0;
        }
        return 1;
    }
    
    private sb(final vb arg0, final int arg1, final int arg2) {
        super();
        this.h = arg0;
        this.x = arg0.h;
        this.t = arg0.k;
        this.u = arg0.j;
        this.n = arg1;
        this.r = arg2;
        this.q = 8192;
        this.v = 0;
        this.e();
    }
    
    private static final int b(int arg0, int arg1, final byte[] arg2, final int[] arg3, int arg4, int arg5, int arg6, final int arg7, int arg8, final int arg9, final int arg10, final sb arg11, final int arg12, final int arg13) {
        arg11.k -= arg11.p * arg5;
        arg11.m -= arg11.o * arg5;
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
            arg8 = arg9;
        }
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            final int n = arg5++;
            arg3[n] += ((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            arg8 = arg9;
        }
        int n2;
        for (arg1 = arg13; arg5 < arg8; n2 = arg5++, arg3[n2] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF)) * arg6 >> 6, arg6 += arg7, arg4 += arg12) {
            arg0 = arg2[arg4 >> 8];
        }
        arg11.k += arg11.p * arg5;
        arg11.m += arg11.o * arg5;
        arg11.w = arg6;
        arg11.v = arg4;
        return arg5;
    }
}
