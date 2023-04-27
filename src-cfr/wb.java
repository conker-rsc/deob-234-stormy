/*
 * Decompiled with CFR 0.152.
 */
final class wb {
    private int I = 0;
    private ba t;
    static long w;
    private int n = 0;
    static aa p;
    private int D = 0;
    private int i;
    private String m;
    private t[] b;
    static int[] q;

    final int a(int arg0) {
        if (arg0 != -21224) {
            this.b(false, 0);
        }
        return this.I;
    }

    final int a(boolean arg0, int arg1) {
        if (!arg0) {
            this.b((byte)30, 75);
        }
        return this.b[arg1].e;
    }

    final String b(byte arg0, int arg1) {
        if (arg0 <= 13) {
            return null;
        }
        return this.b[arg1].o;
    }

    final void b(int arg0, int arg1) {
        if (arg1 < 0 || arg1 >= this.n) {
            return;
        }
        t t2 = this.b[arg1];
        for (int i2 = arg1; this.n - 1 > i2; ++i2) {
            this.b[i2] = this.b[1 + i2];
        }
        this.b[--this.n] = t2;
        this.a(true);
    }

    final int c(int arg0) {
        if (arg0 != -27153) {
            this.a(false);
        }
        return this.n;
    }

    final int b(boolean arg0, int arg1) {
        if (!arg0) {
            this.b(-33, (byte)91);
        }
        return this.b[arg1].l;
    }

    final void a(String arg0, String arg1, String arg2, int arg3, String arg4, byte arg5) {
        this.a(0, arg0, 0, 0, arg1, 0, null, arg3, 0, 125, arg2, arg4);
    }

    final void a(int arg0, int arg1, boolean arg2, String arg3, String arg4) {
        block0: {
            this.a(0, arg3, 0, 0, arg4, arg0, null, arg1, 0, 125, null, null);
            if (!arg2) break block0;
            this.a(61);
        }
    }

    final String c(int arg0, int arg1) {
        if (arg1 != -4126) {
            return null;
        }
        return this.b[arg0].b;
    }

    final int a(int arg0, int arg1) {
        if (arg0 >= -14) {
            return -114;
        }
        return this.b[arg1].d;
    }

    final int a(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -12) {
            this.i = -77;
        }
        return this.a(arg2, arg4, arg0, arg1, -66, true);
    }

    private final int a(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.D == 0 || this.I == 0) {
            return -1;
        }
        if (arg5) {
            this.t.c(160, arg3, this.I, 0, arg2, this.D, 0xD0D0D0);
        }
        int n2 = 1 + this.t.a(508305352, this.i);
        int n3 = n2 + arg2 - 3;
        int n4 = -1;
        if (this.m != null) {
            if (arg3 < arg1 && arg0 > n3 + (3 + -n2) && arg0 < n3 + 3 && arg1 < arg3 + this.D) {
                if (!arg5) {
                    return -2;
                }
                n4 = -2;
            }
            if (arg5) {
                this.t.a(this.m, 2 + arg3, n3, 65535, false, this.i);
            }
            n3 += n2;
        }
        if (arg4 >= -1) {
            this.m = null;
        }
        for (int i2 = 0; i2 < this.n; ++i2) {
            int n5 = 0xFFFFFF;
            if (arg1 > arg3 && -n2 + (3 + n3) < arg0 && 3 + n3 > arg0 && arg1 < arg3 + this.D) {
                n5 = 0xFFFF00;
                if (!arg5) {
                    return i2;
                }
                n4 = i2;
            }
            if (arg5) {
                this.t.a(this.b[i2].p + " " + this.b[i2].o, arg3 + 2, n3, n5, false, this.i);
            }
            n3 += n2;
        }
        return n4;
    }

    final void a(byte arg0) {
        int n2;
        if (this.n == 0) {
            return;
        }
        int[] nArray = new int[this.n];
        Object[] objectArray = new Object[this.n];
        for (n2 = 0; n2 < this.n; ++n2) {
            t t2 = this.b[n2];
            nArray[n2] = t2.d;
            objectArray[n2] = t2;
        }
        cb.a((byte)-70, objectArray, nArray);
        n2 = 0;
        if (arg0 != 16) {
            this.I = -103;
        }
        while (this.n > n2) {
            this.b[n2] = (t)objectArray[n2];
            ++n2;
        }
    }

    final int a(int arg0, byte arg1) {
        if (arg1 != 22) {
            this.D = 4;
        }
        return this.b[arg0].j;
    }

    final void a(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 != 30192) {
            this.a(true, 125);
        }
        this.a(0, arg2, 0, 0, arg1, 0, null, arg0, 0, arg3 ^ 0x758D, null, null);
    }

    final String b(int arg0, byte arg1) {
        if (arg1 != 53) {
            return null;
        }
        return this.b[arg0].p;
    }

    wb(ba arg0, int arg1) {
        this(arg0, arg1, null);
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7) {
        if (arg4 <= 44) {
            return;
        }
        this.a(arg1, arg7, arg2, 0, arg6, arg3, null, arg0, arg5, 125, null, null);
    }

    final int a(byte arg0, int arg1) {
        if (arg0 != 97) {
            return 2;
        }
        return this.b[arg1].m;
    }

    final void a(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int arg8) {
        this.a(arg0, arg1, arg6, arg3, arg7, arg8, null, arg5, arg4, 126, null, null);
    }

    private final void a(boolean arg0) {
        int n2 = this.t.a(508305352, this.i) + 1;
        if (this.m == null) {
            this.I = 0;
            this.D = 0;
        } else {
            this.I = n2;
            this.D = 5 + this.t.a(this.i, 76, this.m);
        }
        if (!arg0) {
            this.b(true, 124);
        }
        for (int i2 = 0; this.n > i2; ++i2) {
            this.I += n2;
            int n3 = 5 + this.t.a(this.i, 105, this.b[i2].p + " " + this.b[i2].o);
            if (n3 <= this.D) continue;
            this.D = n3;
        }
    }

    static final void a(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int arg15) {
        if (arg15 <= 0) {
            return;
        }
        if (arg1 != 10) {
            wb.a(-30, -28, 22, 0, null, -78, 109, 44, -120, 67, 27, 2, 107, -113, null, 56);
        }
        int n2 = 0;
        int n3 = 0;
        arg11 <<= 2;
        if (arg5 != 0) {
            n3 = arg8 / arg5 << 7;
            n2 = arg7 / arg5 << 7;
        }
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 > 16256) {
            n2 = 16256;
        }
        for (int i2 = arg15; i2 > 0; i2 -= 16) {
            arg7 += arg13;
            arg3 = n3;
            arg2 = n2;
            arg8 += arg0;
            if ((arg5 += arg10) != 0) {
                n2 = arg7 / arg5 << 7;
                n3 = arg8 / arg5 << 7;
            }
            if (n2 >= 0) {
                if (n2 > 16256) {
                    n2 = 16256;
                }
            } else {
                n2 = 0;
            }
            int n4 = -arg2 + n2 >> 4;
            int n5 = -arg3 + n3 >> 4;
            int n6 = arg6 >> 23;
            arg2 += 0x600000 & arg6;
            arg6 += arg11;
            if (i2 < 16) {
                for (int i3 = 0; i2 > i3; ++i3) {
                    arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n6;
                    if (-1 != ~arg12) {
                        arg4[arg9] = arg12;
                    }
                    ++arg9;
                    arg2 += n4;
                    arg3 += n5;
                    if ((i3 & 3) != 3) continue;
                    arg2 = (arg6 & 0x600000) + (0x3FFF & arg2);
                    n6 = arg6 >> 23;
                    arg6 += arg11;
                }
                continue;
            }
            arg12 = arg14[(arg3 & 0x3F80) + (arg2 >> 7)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + (0x3F80 & (arg3 += n5))] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + (0x3F80 & (arg3 += n5))] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (0 != arg12) {
                arg4[arg9] = arg12;
            }
            arg2 += n4;
            ++arg9;
            n6 = arg6 >> 23;
            arg2 = (arg6 & 0x600000) + (0x3FFF & arg2);
            arg6 += arg11;
            arg12 = arg14[((arg3 += n5) & 0x3F80) + (arg2 >> 7)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[(0x3F80 & (arg3 += n5)) - -((arg2 += n4) >> 7)] >>> n6;
            if (~arg12 != -1) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + (0x3F80 & (arg3 += n5))] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg2 += n4;
            n6 = arg6 >> 23;
            arg2 = (arg2 & 0x3FFF) - -(0x600000 & arg6);
            arg12 = arg14[(arg2 >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (~arg12 != -1) {
                arg4[arg9] = arg12;
            }
            arg6 += arg11;
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[(0x3F80 & (arg3 += n5)) - -((arg2 += n4) >> 7)] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            arg2 += n4;
            ++arg9;
            n6 = arg6 >> 23;
            arg12 = arg14[((arg3 += n5) & 0x3F80) + ((arg2 = (arg2 & 0x3FFF) - -(arg6 & 0x600000)) >> 7)] >>> n6;
            if (~arg12 != -1) {
                arg4[arg9] = arg12;
            }
            arg6 += arg11;
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[((arg2 += n4) >> 7) + ((arg3 += n5) & 0x3F80)] >>> n6;
            if (arg12 != 0) {
                arg4[arg9] = arg12;
            }
            ++arg9;
            arg12 = arg14[(0x3F80 & (arg3 += n5)) - -((arg2 += n4) >> 7)] >>> n6;
            if (-1 != ~arg12) {
                arg4[arg9] = arg12;
            }
            ++arg9;
        }
    }

    final void a(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg5 != 3296) {
            w = -93L;
        }
        this.a(arg4, arg3, 0, 0, arg1, arg0, null, arg2, 0, arg5 - 3170, null, null);
    }

    final void d(int arg0) {
        this.n = arg0;
        this.a(true);
    }

    final int b(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -40) {
            this.a((byte)-62);
        }
        return this.a(arg4, arg0, arg2, arg1, -3, false);
    }

    final int a(int arg0, boolean arg1) {
        if (arg1) {
            this.i = 119;
        }
        return this.b[arg0].i;
    }

    private final void a(int arg0, String arg1, int arg2, int arg3, String arg4, int arg5, String arg6, int arg7, int arg8, int arg9, String arg10, String arg11) {
        if (this.n == this.b.length) {
            t[] tArray = this.b;
            this.b = new t[10 + this.n];
            for (int i2 = 0; this.b.length > i2; ++i2) {
                this.b[i2] = this.n > i2 ? tArray[i2] : new t();
            }
        }
        if (arg9 <= 124) {
            return;
        }
        this.b[this.n++].a(arg1, arg3, arg5, arg0, arg8, arg6, 100, arg7, arg4, arg10, arg2, arg11);
        this.a(true);
    }

    final int b(int arg0) {
        if (arg0 != 16256) {
            this.a((byte)-39);
        }
        return this.D;
    }

    final void a(int arg0, byte arg1, int arg2, String arg3, String arg4, int arg5, int arg6) {
        if (arg1 != 22) {
            this.a(33, false);
        }
        this.a(arg6, arg3, arg5, 0, arg4, arg0, null, arg2, 0, 127, null, null);
    }

    wb(ba arg0, int arg1, String arg2) {
        this.i = arg1;
        this.b = new t[10];
        this.t = arg0;
        this.m = arg2;
        for (int i2 = 0; i2 < 10; ++i2) {
            this.b[i2] = new t();
        }
        this.a(true);
    }

    static {
        p = new aa(new byte[]{22, 22, 22, 22, 22, 22, 21, 22, 22, 20, 22, 22, 22, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 3, 8, 22, 16, 22, 16, 17, 7, 13, 13, 13, 16, 7, 10, 6, 16, 10, 11, 12, 12, 12, 12, 13, 13, 14, 14, 11, 14, 19, 15, 17, 8, 11, 9, 10, 10, 10, 10, 11, 10, 9, 7, 12, 11, 10, 10, 9, 10, 10, 12, 10, 9, 8, 12, 12, 9, 14, 8, 12, 17, 16, 17, 22, 13, 21, 4, 7, 6, 5, 3, 6, 6, 5, 4, 10, 7, 5, 6, 4, 4, 6, 10, 5, 4, 4, 5, 7, 6, 10, 6, 10, 22, 19, 22, 14, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 21, 22, 21, 22, 22, 22, 21, 22, 22});
        q = new int[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                if ((1 & n2) == 1) {
                    n2 = n2 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n2 >>>= 1;
            }
            wb.q[i2] = n2;
        }
    }
}

