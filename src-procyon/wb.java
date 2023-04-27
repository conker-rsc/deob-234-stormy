final class wb
{
    private int I;
    private ba t;
    static long w;
    private int n;
    static aa p;
    private int D;
    private int i;
    private String m;
    private t[] b;
    static int[] q;
    
    final int a(final int arg0) {
        if (arg0 != -21224) {
            this.b(false, 0);
        }
        return this.I;
    }
    
    final int a(final boolean arg0, final int arg1) {
        if (!arg0) {
            this.b((byte)30, 75);
        }
        return this.b[arg1].e;
    }
    
    final String b(final byte arg0, final int arg1) {
        if (arg0 <= 13) {
            return null;
        }
        return this.b[arg1].o;
    }
    
    final void b(final int arg0, final int arg1) {
        if (arg1 >= 0 && arg1 < this.n) {
            final t t = this.b[arg1];
            for (int n = arg1; this.n - 1 > n; ++n) {
                this.b[n] = this.b[1 + n];
            }
            this.b[--this.n] = t;
            this.a(true);
        }
    }
    
    final int c(final int arg0) {
        if (arg0 != -27153) {
            this.a(false);
        }
        return this.n;
    }
    
    final int b(final boolean arg0, final int arg1) {
        if (!arg0) {
            this.b(-33, (byte)91);
        }
        return this.b[arg1].l;
    }
    
    final void a(final String arg0, final String arg1, final String arg2, final int arg3, final String arg4, final byte arg5) {
        this.a(0, arg0, 0, 0, arg1, 0, null, arg3, 0, 125, arg2, arg4);
    }
    
    final void a(final int arg0, final int arg1, final boolean arg2, final String arg3, final String arg4) {
        this.a(0, arg3, 0, 0, arg4, arg0, null, arg1, 0, 125, null, null);
        if (arg2) {
            this.a(61);
        }
    }
    
    final String c(final int arg0, final int arg1) {
        if (arg1 != -4126) {
            return null;
        }
        return this.b[arg0].b;
    }
    
    final int a(final int arg0, final int arg1) {
        if (arg0 >= -14) {
            return -114;
        }
        return this.b[arg1].d;
    }
    
    final int a(final int arg0, final int arg1, final int arg2, final byte arg3, final int arg4) {
        if (arg3 != -12) {
            this.i = -77;
        }
        return this.a(arg2, arg4, arg0, arg1, -66, true);
    }
    
    private final int a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final boolean arg5) {
        if (this.D != 0 && this.I != 0) {
            if (arg5) {
                this.t.c(160, arg3, this.I, 0, arg2, this.D, 13684944);
            }
            final int n = 1 + this.t.a(508305352, this.i);
            int n2 = n + arg2 - 3;
            int n3 = -1;
            if (this.m != null) {
                if (arg3 < arg1 && arg0 > n2 + (3 + -n) && arg0 < n2 + 3 && arg1 < arg3 + this.D) {
                    if (!arg5) {
                        return -2;
                    }
                    n3 = -2;
                }
                if (arg5) {
                    this.t.a(this.m, 2 + arg3, n2, 65535, false, this.i);
                }
                n2 += n;
            }
            if (arg4 >= -1) {
                this.m = null;
            }
            for (int i = 0; i < this.n; ++i) {
                int arg6 = 16777215;
                if (arg1 > arg3 && -n + (3 + n2) < arg0 && 3 + n2 > arg0) {
                    if (arg1 < arg3 + this.D) {
                        arg6 = 16776960;
                        if (!arg5) {
                            return i;
                        }
                        n3 = i;
                    }
                }
                if (arg5) {
                    this.t.a(this.b[i].p + " " + this.b[i].o, arg3 + 2, n2, arg6, false, this.i);
                }
                n2 += n;
            }
            return n3;
        }
        return -1;
    }
    
    final void a(final byte arg0) {
        if (this.n == 0) {
            return;
        }
        final int[] arg = new int[this.n];
        final Object[] arg2 = new Object[this.n];
        for (int i = 0; i < this.n; ++i) {
            final t t = this.b[i];
            arg[i] = t.d;
            arg2[i] = t;
        }
        cb.a((byte)(-70), arg2, arg);
        int n = 0;
        if (arg0 != 16) {
            this.I = -103;
        }
        while (this.n > n) {
            this.b[n] = (t)arg2[n];
            ++n;
        }
    }
    
    final int a(final int arg0, final byte arg1) {
        if (arg1 != 22) {
            this.D = 4;
        }
        return this.b[arg0].j;
    }
    
    final void a(final int arg0, final String arg1, final String arg2, final int arg3) {
        if (arg3 != 30192) {
            this.a(true, 125);
        }
        this.a(0, arg2, 0, 0, arg1, 0, null, arg0, 0, arg3 ^ 0x758D, null, null);
    }
    
    final String b(final int arg0, final byte arg1) {
        if (arg1 != 53) {
            return null;
        }
        return this.b[arg0].p;
    }
    
    wb(final ba arg0, final int arg1) {
        this(arg0, arg1, null);
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final String arg6, final String arg7) {
        if (arg4 <= 44) {
            return;
        }
        this.a(arg1, arg7, arg2, 0, arg6, arg3, null, arg0, arg5, 125, null, null);
    }
    
    final int a(final byte arg0, final int arg1) {
        if (arg0 != 97) {
            return 2;
        }
        return this.b[arg1].m;
    }
    
    final void a(final int arg0, final String arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final String arg7, final int arg8) {
        this.a(arg0, arg1, arg6, arg3, arg7, arg8, null, arg5, arg4, 126, null, null);
    }
    
    private final void a(final boolean arg0) {
        final int i = this.t.a(508305352, this.i) + 1;
        if (this.m == null) {
            this.I = 0;
            this.D = 0;
        }
        else {
            this.I = i;
            this.D = 5 + this.t.a(this.i, 76, this.m);
        }
        if (!arg0) {
            this.b(true, 124);
        }
        for (int n = 0; this.n > n; ++n) {
            this.I += i;
            final int d = 5 + this.t.a(this.i, 105, this.b[n].p + " " + this.b[n].o);
            if (d > this.D) {
                this.D = d;
            }
        }
    }
    
    static final void a(final int arg0, final int arg1, int arg2, int arg3, final int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, final int arg10, int arg11, int arg12, final int arg13, final int[] arg14, final int arg15) {
        if (arg15 > 0) {
            if (arg1 != 10) {
                a(-30, -28, 22, 0, null, -78, 109, 44, -120, 67, 27, 2, 107, -113, null, 56);
            }
            int n = 0;
            int n2 = 0;
            arg11 <<= 2;
            if (arg5 != 0) {
                n2 = arg8 / arg5 << 7;
                n = arg7 / arg5 << 7;
            }
            if (n < 0) {
                n = 0;
            }
            else if (n > 16256) {
                n = 16256;
            }
            for (int i = arg15; i > 0; i -= 16) {
                arg7 += arg13;
                arg3 = n2;
                arg5 += arg10;
                arg2 = n;
                arg8 += arg0;
                if (arg5 != 0) {
                    n = arg7 / arg5 << 7;
                    n2 = arg8 / arg5 << 7;
                }
                if (n >= 0) {
                    if (n > 16256) {
                        n = 16256;
                    }
                }
                else {
                    n = 0;
                }
                final int n3 = -arg2 + n >> 4;
                final int n4 = -arg3 + n2 >> 4;
                int n5 = arg6 >> 23;
                arg2 += (0x600000 & arg6);
                arg6 += arg11;
                if (i < 16) {
                    for (int n6 = 0; i > n6; ++n6) {
                        if (-1 != ~(arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n5)) {
                            arg4[arg9] = arg12;
                        }
                        ++arg9;
                        arg2 += n3;
                        arg3 += n4;
                        if ((n6 & 0x3) == 0x3) {
                            arg2 = (arg6 & 0x600000) + (0x3FFF & arg2);
                            n5 = arg6 >> 23;
                            arg6 += arg11;
                        }
                    }
                }
                else {
                    if (-1 != ~(arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n5)) {
                        arg4[arg9] = arg12;
                    }
                    arg2 += n3;
                    ++arg9;
                    arg3 += n4;
                    if ((arg12 = arg14[(arg2 >> 7) + (0x3F80 & arg3)] >>> n5) != 0) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                    arg3 += n4;
                    arg2 += n3;
                    if ((arg12 = arg14[(arg2 >> 7) + (0x3F80 & arg3)] >>> n5) != 0) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                    arg3 += n4;
                    arg2 += n3;
                    if (0 != (arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n5)) {
                        arg4[arg9] = arg12;
                    }
                    arg2 += n3;
                    arg3 += n4;
                    ++arg9;
                    final int n7 = arg6 >> 23;
                    arg2 = (arg6 & 0x600000) + (0x3FFF & arg2);
                    arg6 += arg11;
                    if (-1 != ~(arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n7)) {
                        arg4[arg9] = arg12;
                    }
                    arg2 += n3;
                    ++arg9;
                    arg3 += n4;
                    if (~(arg12 = arg14[(0x3F80 & arg3) - -(arg2 >> 7)] >>> n7) != -1) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                    arg2 += n3;
                    arg3 += n4;
                    if ((arg12 = arg14[(arg2 >> 7) + (0x3F80 & arg3)] >>> n7) != 0) {
                        arg4[arg9] = arg12;
                    }
                    arg2 += n3;
                    arg3 += n4;
                    ++arg9;
                    if (-1 != ~(arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n7)) {
                        arg4[arg9] = arg12;
                    }
                    arg3 += n4;
                    ++arg9;
                    arg2 += n3;
                    final int n8 = arg6 >> 23;
                    arg2 = (arg2 & 0x3FFF) - -(0x600000 & arg6);
                    if (~(arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n8) != -1) {
                        arg4[arg9] = arg12;
                    }
                    arg6 += arg11;
                    ++arg9;
                    arg2 += n3;
                    arg3 += n4;
                    if (-1 != ~(arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n8)) {
                        arg4[arg9] = arg12;
                    }
                    arg3 += n4;
                    ++arg9;
                    arg2 += n3;
                    if ((arg12 = arg14[(0x3F80 & arg3) - -(arg2 >> 7)] >>> n8) != 0) {
                        arg4[arg9] = arg12;
                    }
                    arg3 += n4;
                    arg2 += n3;
                    ++arg9;
                    if ((arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n8) != 0) {
                        arg4[arg9] = arg12;
                    }
                    arg2 += n3;
                    arg3 += n4;
                    ++arg9;
                    arg2 = (arg2 & 0x3FFF) - -(arg6 & 0x600000);
                    final int n9 = arg6 >> 23;
                    if (~(arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n9) != -1) {
                        arg4[arg9] = arg12;
                    }
                    arg6 += arg11;
                    arg3 += n4;
                    ++arg9;
                    arg2 += n3;
                    if (-1 != ~(arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n9)) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                    arg2 += n3;
                    arg3 += n4;
                    if ((arg12 = arg14[(arg2 >> 7) + (arg3 & 0x3F80)] >>> n9) != 0) {
                        arg4[arg9] = arg12;
                    }
                    arg3 += n4;
                    arg2 += n3;
                    ++arg9;
                    if (-1 != ~(arg12 = arg14[(0x3F80 & arg3) - -(arg2 >> 7)] >>> n9)) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                }
            }
        }
    }
    
    final void a(final int arg0, final String arg1, final int arg2, final String arg3, final int arg4, final int arg5) {
        if (arg5 != 3296) {
            wb.w = -93L;
        }
        this.a(arg4, arg3, 0, 0, arg1, arg0, null, arg2, 0, arg5 - 3170, null, null);
    }
    
    final void d(final int arg0) {
        this.n = arg0;
        this.a(true);
    }
    
    final int b(final int arg0, final int arg1, final int arg2, final byte arg3, final int arg4) {
        if (arg3 != -40) {
            this.a((byte)(-62));
        }
        return this.a(arg4, arg0, arg2, arg1, -3, false);
    }
    
    final int a(final int arg0, final boolean arg1) {
        if (arg1) {
            this.i = 119;
        }
        return this.b[arg0].i;
    }
    
    private final void a(final int arg0, final String arg1, final int arg2, final int arg3, final String arg4, final int arg5, final String arg6, final int arg7, final int arg8, final int arg9, final String arg10, final String arg11) {
        if (this.n == this.b.length) {
            final t[] b = this.b;
            this.b = new t[10 + this.n];
            for (int n = 0; this.b.length > n; ++n) {
                if (this.n > n) {
                    this.b[n] = b[n];
                }
                else {
                    this.b[n] = new t();
                }
            }
        }
        if (arg9 <= 124) {
            return;
        }
        this.b[this.n++].a(arg1, arg3, arg5, arg0, arg8, arg6, 100, arg7, arg4, arg10, arg2, arg11);
        this.a(true);
    }
    
    final int b(final int arg0) {
        if (arg0 != 16256) {
            this.a((byte)(-39));
        }
        return this.D;
    }
    
    final void a(final int arg0, final byte arg1, final int arg2, final String arg3, final String arg4, final int arg5, final int arg6) {
        if (arg1 != 22) {
            this.a(33, false);
        }
        this.a(arg6, arg3, arg5, 0, arg4, arg0, null, arg2, 0, 127, null, null);
    }
    
    wb(final ba arg0, final int arg1, final String arg2) {
        super();
        this.I = 0;
        this.n = 0;
        this.D = 0;
        this.i = arg1;
        this.b = new t[10];
        this.t = arg0;
        this.m = arg2;
        for (int i = 0; i < 10; ++i) {
            this.b[i] = new t();
        }
        this.a(true);
    }
    
    static {
        wb.p = new aa(new byte[] { 22, 22, 22, 22, 22, 22, 21, 22, 22, 20, 22, 22, 22, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 3, 8, 22, 16, 22, 16, 17, 7, 13, 13, 13, 16, 7, 10, 6, 16, 10, 11, 12, 12, 12, 12, 13, 13, 14, 14, 11, 14, 19, 15, 17, 8, 11, 9, 10, 10, 10, 10, 11, 10, 9, 7, 12, 11, 10, 10, 9, 10, 10, 12, 10, 9, 8, 12, 12, 9, 14, 8, 12, 17, 16, 17, 22, 13, 21, 4, 7, 6, 5, 3, 6, 6, 5, 4, 10, 7, 5, 6, 4, 4, 6, 10, 5, 4, 4, 5, 7, 6, 10, 6, 10, 22, 19, 22, 14, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 21, 22, 21, 22, 22, 22, 21, 22, 22 });
        wb.q = new int[256];
        for (int i = 0; i < 256; ++i) {
            int n = i;
            for (int j = 0; j < 8; ++j) {
                if ((0x1 & n) != 0x0) {
                    n = (n >>> 1 ^ 0xEDB88320);
                }
                else {
                    n >>>= 1;
                }
            }
            wb.q[i] = n;
        }
    }
}
