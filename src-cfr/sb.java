/*
 * Decompiled with CFR 0.152.
 */
final class sb
extends va {
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
        int n2 = this.w * 3 >> 6;
        n2 = (n2 ^ n2 >> 31) + (n2 >>> 31);
        if (this.l == 0) {
            n2 -= n2 * this.v / (((vb)this.h).l.length << 8);
        } else if (this.l >= 0) {
            n2 -= n2 * this.x / ((vb)this.h).l.length;
        }
        return n2 > 255 ? 255 : n2;
    }

    private static final int b(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, sb arg9) {
        arg4 <<= 2;
        arg5 <<= 2;
        arg6 = arg3 + (arg2 >>= 8) - ((arg8 >>= 8) - 1);
        if (arg6 > arg7) {
            arg6 = arg7;
        }
        arg9.k += arg9.p * (arg6 - arg3);
        arg9.m += arg9.o * (arg6 - arg3);
        arg6 -= 3;
        while (arg3 < arg6) {
            int n2 = arg3++;
            arg1[n2] = arg1[n2] + arg0[arg2--] * arg4;
            int n3 = arg3++;
            arg1[n3] = arg1[n3] + arg0[arg2--] * (arg4 += arg5);
            int n4 = arg3++;
            arg1[n4] = arg1[n4] + arg0[arg2--] * (arg4 += arg5);
            int n5 = arg3++;
            arg1[n5] = arg1[n5] + arg0[arg2--] * (arg4 += arg5);
            arg4 += arg5;
        }
        arg6 += 3;
        while (arg3 < arg6) {
            int n6 = arg3++;
            arg1[n6] = arg1[n6] + arg0[arg2--] * arg4;
            arg4 += arg5;
        }
        arg9.w = arg4 >> 2;
        arg9.v = arg2 << 8;
        return arg3;
    }

    /*
     * Exception decompiling
     */
    @Override
    final synchronized void b(int[] arg0, int arg1, int arg2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 33[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    static final sb a(vb arg0, int arg1, int arg2) {
        if (arg0.l == null || arg0.l.length == 0) {
            return null;
        }
        return new sb(arg0, (int)((long)arg0.i * 256L * (long)arg1 / (long)(100 * sa.t)), arg2 << 6);
    }

    private static final int a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, sb arg11, int arg12, int arg13) {
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg5 <<= 1;
        arg8 <<= 1;
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF);
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (arg0 * arg6 >> 6);
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (arg0 * arg7 >> 6);
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg8 <<= 1;
        arg1 = arg13;
        while (arg5 < arg8) {
            arg0 = arg2[arg4 >> 8];
            arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF);
            int n4 = arg5++;
            arg3[n4] = arg3[n4] + (arg0 * arg6 >> 6);
            int n5 = arg5++;
            arg3[n5] = arg3[n5] + (arg0 * arg7 >> 6);
            arg4 += arg12;
        }
        arg11.v = arg4;
        return arg5 >> 1;
    }

    private final boolean f() {
        int n2;
        int n3;
        int n4 = this.r;
        if (n4 == Integer.MIN_VALUE) {
            n3 = 0;
            n2 = 0;
            n4 = 0;
        } else {
            n2 = sb.b(n4, this.q);
            n3 = sb.c(n4, this.q);
        }
        if (this.w != n4 || this.k != n2 || this.m != n3) {
            if (this.w < n4) {
                this.s = 1;
                this.y = n4 - this.w;
            } else if (this.w > n4) {
                this.s = -1;
                this.y = this.w - n4;
            } else {
                this.s = 0;
            }
            if (this.k < n2) {
                this.p = 1;
                if (this.y == 0 || this.y > n2 - this.k) {
                    this.y = n2 - this.k;
                }
            } else if (this.k > n2) {
                this.p = -1;
                if (this.y == 0 || this.y > this.k - n2) {
                    this.y = this.k - n2;
                }
            } else {
                this.p = 0;
            }
            if (this.m < n3) {
                this.o = 1;
                if (this.y == 0 || this.y > n3 - this.m) {
                    this.y = n3 - this.m;
                }
            } else if (this.m > n3) {
                this.o = -1;
                if (this.y == 0 || this.y > this.m - n3) {
                    this.y = this.m - n3;
                }
            } else {
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

    private static final int a(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, sb arg10) {
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + (arg9 >>= 8) - (arg3 >>= 8);
        if (arg7 > arg8) {
            arg7 = arg8;
        }
        arg4 <<= 1;
        arg7 <<= 1;
        arg7 -= 6;
        while (arg4 < arg7) {
            arg0 = arg1[arg3++];
            int n2 = arg4++;
            arg2[n2] = arg2[n2] + arg0 * arg5;
            int n3 = arg4++;
            arg2[n3] = arg2[n3] + arg0 * arg6;
            arg0 = arg1[arg3++];
            int n4 = arg4++;
            arg2[n4] = arg2[n4] + arg0 * arg5;
            int n5 = arg4++;
            arg2[n5] = arg2[n5] + arg0 * arg6;
            arg0 = arg1[arg3++];
            int n6 = arg4++;
            arg2[n6] = arg2[n6] + arg0 * arg5;
            int n7 = arg4++;
            arg2[n7] = arg2[n7] + arg0 * arg6;
            arg0 = arg1[arg3++];
            int n8 = arg4++;
            arg2[n8] = arg2[n8] + arg0 * arg5;
            int n9 = arg4++;
            arg2[n9] = arg2[n9] + arg0 * arg6;
        }
        arg7 += 6;
        while (arg4 < arg7) {
            arg0 = arg1[arg3++];
            int n10 = arg4++;
            arg2[n10] = arg2[n10] + arg0 * arg5;
            int n11 = arg4++;
            arg2[n11] = arg2[n11] + arg0 * arg6;
        }
        arg10.v = arg3 << 8;
        return arg4 >> 1;
    }

    private final int b(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (this.y > 0) {
            int n2 = arg1 + this.y;
            if (n2 > arg3) {
                n2 = arg3;
            }
            this.y += arg1;
            arg1 = this.n == -256 && (this.v & 0xFF) == 0 ? (sa.i ? sb.b(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n2, arg2, this) : sb.b(((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n2, arg2, this)) : (sa.i ? sb.b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n2, arg2, this, this.n, arg4) : sb.c(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n2, arg2, this, this.n, arg4));
            this.y -= arg1;
            if (this.y != 0) {
                return arg1;
            }
            if (!this.f()) continue;
            return arg3;
        }
        if (this.n == -256 && (this.v & 0xFF) == 0) {
            if (sa.i) {
                return sb.b(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this);
            }
            return sb.a(((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this);
        }
        if (sa.i) {
            return sb.d(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this, this.n, arg4);
        }
        return sb.b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this, this.n, arg4);
    }

    private static final int c(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, sb arg11, int arg12, int arg13) {
        arg11.k -= arg11.p * arg5;
        arg11.m -= arg11.o * arg5;
        if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg6 += arg7;
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg0 = arg13;
        arg1 = arg12;
        while (arg5 < arg8) {
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg6 += arg7;
            arg4 += arg1;
        }
        arg11.k += arg11.p * arg5;
        arg11.m += arg11.o * arg5;
        arg11.w = arg6;
        arg11.v = arg4;
        return arg5;
    }

    private static final int d(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, sb arg11, int arg12, int arg13) {
        if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg5 <<= 1;
        arg8 <<= 1;
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF);
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (arg0 * arg6 >> 6);
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (arg0 * arg7 >> 6);
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg8 <<= 1;
        arg1 = arg13;
        while (arg5 < arg8) {
            arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xFF);
            int n4 = arg5++;
            arg3[n4] = arg3[n4] + (arg0 * arg6 >> 6);
            int n5 = arg5++;
            arg3[n5] = arg3[n5] + (arg0 * arg7 >> 6);
            arg4 += arg12;
        }
        arg11.v = arg4;
        return arg5 >> 1;
    }

    private final void e() {
        this.w = this.r;
        this.k = sb.b(this.r, this.q);
        this.m = sb.c(this.r, this.q);
    }

    private static final int a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, sb arg13, int arg14, int arg15) {
        arg13.w -= arg13.s * arg5;
        if (arg14 == 0 || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg5 <<= 1;
        arg10 <<= 1;
        while (arg5 < arg10) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF);
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (arg0 * arg6 >> 6);
            arg6 += arg8;
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (arg0 * arg7 >> 6);
            arg7 += arg9;
            arg4 += arg14;
        }
        if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg10 <<= 1;
        arg1 = arg15;
        while (arg5 < arg10) {
            arg0 = arg2[arg4 >> 8];
            arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF);
            int n4 = arg5++;
            arg3[n4] = arg3[n4] + (arg0 * arg6 >> 6);
            arg6 += arg8;
            int n5 = arg5++;
            arg3[n5] = arg3[n5] + (arg0 * arg7 >> 6);
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.w += arg13.s * (arg5 >>= 1);
        arg13.k = arg6;
        arg13.m = arg7;
        arg13.v = arg4;
        return arg5;
    }

    @Override
    final va b() {
        return null;
    }

    private static final int a(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, sb arg8) {
        arg4 <<= 2;
        arg5 = arg3 + (arg2 >>= 8) - ((arg7 >>= 8) - 1);
        if (arg5 > arg6) {
            arg5 = arg6;
        }
        arg5 -= 3;
        while (arg3 < arg5) {
            int n2 = arg3++;
            arg1[n2] = arg1[n2] + arg0[arg2--] * arg4;
            int n3 = arg3++;
            arg1[n3] = arg1[n3] + arg0[arg2--] * arg4;
            int n4 = arg3++;
            arg1[n4] = arg1[n4] + arg0[arg2--] * arg4;
            int n5 = arg3++;
            arg1[n5] = arg1[n5] + arg0[arg2--] * arg4;
        }
        arg5 += 3;
        while (arg3 < arg5) {
            int n6 = arg3++;
            arg1[n6] = arg1[n6] + arg0[arg2--] * arg4;
        }
        arg8.v = arg2 << 8;
        return arg3;
    }

    private static final int a(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, sb arg12) {
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 = arg4 + (arg11 >>= 8) - (arg3 >>= 8);
        if (arg9 > arg10) {
            arg9 = arg10;
        }
        arg12.w += arg12.s * (arg9 - arg4);
        arg4 <<= 1;
        arg9 <<= 1;
        arg9 -= 6;
        while (arg4 < arg9) {
            arg0 = arg1[arg3++];
            int n2 = arg4++;
            arg2[n2] = arg2[n2] + arg0 * arg5;
            arg5 += arg7;
            int n3 = arg4++;
            arg2[n3] = arg2[n3] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3++];
            int n4 = arg4++;
            arg2[n4] = arg2[n4] + arg0 * arg5;
            arg5 += arg7;
            int n5 = arg4++;
            arg2[n5] = arg2[n5] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3++];
            int n6 = arg4++;
            arg2[n6] = arg2[n6] + arg0 * arg5;
            arg5 += arg7;
            int n7 = arg4++;
            arg2[n7] = arg2[n7] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3++];
            int n8 = arg4++;
            arg2[n8] = arg2[n8] + arg0 * arg5;
            arg5 += arg7;
            int n9 = arg4++;
            arg2[n9] = arg2[n9] + arg0 * arg6;
            arg6 += arg8;
        }
        arg9 += 6;
        while (arg4 < arg9) {
            arg0 = arg1[arg3++];
            int n10 = arg4++;
            arg2[n10] = arg2[n10] + arg0 * arg5;
            arg5 += arg7;
            int n11 = arg4++;
            arg2[n11] = arg2[n11] + arg0 * arg6;
            arg6 += arg8;
        }
        arg12.k = arg5 >> 2;
        arg12.m = arg6 >> 2;
        arg12.v = arg3 << 8;
        return arg4 >> 1;
    }

    private static final int b(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, sb arg10) {
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 = arg4 + (arg3 >>= 8) - ((arg9 >>= 8) - 1);
        if (arg7 > arg8) {
            arg7 = arg8;
        }
        arg4 <<= 1;
        arg7 <<= 1;
        arg7 -= 6;
        while (arg4 < arg7) {
            arg0 = arg1[arg3--];
            int n2 = arg4++;
            arg2[n2] = arg2[n2] + arg0 * arg5;
            int n3 = arg4++;
            arg2[n3] = arg2[n3] + arg0 * arg6;
            arg0 = arg1[arg3--];
            int n4 = arg4++;
            arg2[n4] = arg2[n4] + arg0 * arg5;
            int n5 = arg4++;
            arg2[n5] = arg2[n5] + arg0 * arg6;
            arg0 = arg1[arg3--];
            int n6 = arg4++;
            arg2[n6] = arg2[n6] + arg0 * arg5;
            int n7 = arg4++;
            arg2[n7] = arg2[n7] + arg0 * arg6;
            arg0 = arg1[arg3--];
            int n8 = arg4++;
            arg2[n8] = arg2[n8] + arg0 * arg5;
            int n9 = arg4++;
            arg2[n9] = arg2[n9] + arg0 * arg6;
        }
        arg7 += 6;
        while (arg4 < arg7) {
            arg0 = arg1[arg3--];
            int n10 = arg4++;
            arg2[n10] = arg2[n10] + arg0 * arg5;
            int n11 = arg4++;
            arg2[n11] = arg2[n11] + arg0 * arg6;
        }
        arg10.v = arg3 << 8;
        return arg4 >> 1;
    }

    private static final int b(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, sb arg8) {
        arg4 <<= 2;
        arg5 = arg3 + (arg7 >>= 8) - (arg2 >>= 8);
        if (arg5 > arg6) {
            arg5 = arg6;
        }
        arg5 -= 3;
        while (arg3 < arg5) {
            int n2 = arg3++;
            arg1[n2] = arg1[n2] + arg0[arg2++] * arg4;
            int n3 = arg3++;
            arg1[n3] = arg1[n3] + arg0[arg2++] * arg4;
            int n4 = arg3++;
            arg1[n4] = arg1[n4] + arg0[arg2++] * arg4;
            int n5 = arg3++;
            arg1[n5] = arg1[n5] + arg0[arg2++] * arg4;
        }
        arg5 += 3;
        while (arg3 < arg5) {
            int n6 = arg3++;
            arg1[n6] = arg1[n6] + arg0[arg2++] * arg4;
        }
        arg8.v = arg2 << 8;
        return arg3;
    }

    private static final int b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, sb arg13, int arg14, int arg15) {
        arg13.w -= arg13.s * arg5;
        if (arg14 == 0 || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg5 <<= 1;
        arg10 <<= 1;
        while (arg5 < arg10) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF);
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (arg0 * arg6 >> 6);
            arg6 += arg8;
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (arg0 * arg7 >> 6);
            arg7 += arg9;
            arg4 += arg14;
        }
        if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            arg10 = arg11;
        }
        arg10 <<= 1;
        arg1 = arg15;
        while (arg5 < arg10) {
            arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xFF);
            int n4 = arg5++;
            arg3[n4] = arg3[n4] + (arg0 * arg6 >> 6);
            arg6 += arg8;
            int n5 = arg5++;
            arg3[n5] = arg3[n5] + (arg0 * arg7 >> 6);
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.w += arg13.s * (arg5 >>= 1);
        arg13.k = arg6;
        arg13.m = arg7;
        arg13.v = arg4;
        return arg5;
    }

    private static final int b(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, sb arg12) {
        arg5 <<= 2;
        arg6 <<= 2;
        arg7 <<= 2;
        arg8 <<= 2;
        arg9 = arg4 + (arg3 >>= 8) - ((arg11 >>= 8) - 1);
        if (arg9 > arg10) {
            arg9 = arg10;
        }
        arg12.w += arg12.s * (arg9 - arg4);
        arg4 <<= 1;
        arg9 <<= 1;
        arg9 -= 6;
        while (arg4 < arg9) {
            arg0 = arg1[arg3--];
            int n2 = arg4++;
            arg2[n2] = arg2[n2] + arg0 * arg5;
            arg5 += arg7;
            int n3 = arg4++;
            arg2[n3] = arg2[n3] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3--];
            int n4 = arg4++;
            arg2[n4] = arg2[n4] + arg0 * arg5;
            arg5 += arg7;
            int n5 = arg4++;
            arg2[n5] = arg2[n5] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3--];
            int n6 = arg4++;
            arg2[n6] = arg2[n6] + arg0 * arg5;
            arg5 += arg7;
            int n7 = arg4++;
            arg2[n7] = arg2[n7] + arg0 * arg6;
            arg6 += arg8;
            arg0 = arg1[arg3--];
            int n8 = arg4++;
            arg2[n8] = arg2[n8] + arg0 * arg5;
            arg5 += arg7;
            int n9 = arg4++;
            arg2[n9] = arg2[n9] + arg0 * arg6;
            arg6 += arg8;
        }
        arg9 += 6;
        while (arg4 < arg9) {
            arg0 = arg1[arg3--];
            int n10 = arg4++;
            arg2[n10] = arg2[n10] + arg0 * arg5;
            arg5 += arg7;
            int n11 = arg4++;
            arg2[n11] = arg2[n11] + arg0 * arg6;
            arg6 += arg8;
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

    private static final int b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, sb arg10, int arg11, int arg12) {
        if (arg11 == 0 || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8) {
            arg7 = arg8;
        }
        while (arg5 < arg7) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1 - 1];
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg4 += arg11;
        }
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8) {
            arg7 = arg8;
        }
        arg0 = arg12;
        arg1 = arg11;
        while (arg5 < arg7) {
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg4 += arg1;
        }
        arg10.v = arg4;
        return arg5;
    }

    private static final int c(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4) + 0.5);
    }

    private static final int a(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, sb arg9) {
        arg4 <<= 2;
        arg5 <<= 2;
        arg6 = arg3 + (arg8 >>= 8) - (arg2 >>= 8);
        if (arg6 > arg7) {
            arg6 = arg7;
        }
        arg9.k += arg9.p * (arg6 - arg3);
        arg9.m += arg9.o * (arg6 - arg3);
        arg6 -= 3;
        while (arg3 < arg6) {
            int n2 = arg3++;
            arg1[n2] = arg1[n2] + arg0[arg2++] * arg4;
            int n3 = arg3++;
            arg1[n3] = arg1[n3] + arg0[arg2++] * (arg4 += arg5);
            int n4 = arg3++;
            arg1[n4] = arg1[n4] + arg0[arg2++] * (arg4 += arg5);
            int n5 = arg3++;
            arg1[n5] = arg1[n5] + arg0[arg2++] * (arg4 += arg5);
            arg4 += arg5;
        }
        arg6 += 3;
        while (arg3 < arg6) {
            int n6 = arg3++;
            arg1[n6] = arg1[n6] + arg0[arg2++] * arg4;
            arg4 += arg5;
        }
        arg9.w = arg4 >> 2;
        arg9.v = arg2 << 8;
        return arg3;
    }

    private static final int a(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, sb arg10, int arg11, int arg12) {
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8) {
            arg7 = arg8;
        }
        while (arg5 < arg7) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg4 += arg11;
        }
        if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8) {
            arg7 = arg8;
        }
        arg1 = arg12;
        while (arg5 < arg7) {
            arg0 = arg2[arg4 >> 8];
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg4 += arg11;
        }
        arg10.v = arg4;
        return arg5;
    }

    @Override
    final va a() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    final synchronized void b(int arg0) {
        int n2;
        block32: {
            int n3;
            int n4;
            block34: {
                block31: {
                    int n5;
                    block33: {
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
                            } else {
                                this.w += this.s * arg0;
                                this.k += this.p * arg0;
                                this.m += this.o * arg0;
                                this.y -= arg0;
                            }
                        }
                        vb vb2 = (vb)this.h;
                        n4 = this.x << 8;
                        n3 = this.t << 8;
                        n2 = vb2.l.length << 8;
                        n5 = n3 - n4;
                        if (n5 <= 0) {
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
                        if (this.v >= n2) {
                            if (this.n >= 0) {
                                this.g();
                                this.a(-27331);
                                return;
                            }
                            this.v = n2 - 1;
                        }
                        this.v += this.n * arg0;
                        if (this.l < 0) {
                            if (this.u) {
                                if (this.n < 0) {
                                    if (this.v >= n4) {
                                        return;
                                    }
                                    this.v = n4 + n4 - 1 - this.v;
                                    this.n = -this.n;
                                }
                                break block31;
                            } else {
                                if (this.n < 0) {
                                    if (this.v >= n4) {
                                        return;
                                    }
                                    this.v = n3 - 1 - (n3 - 1 - this.v) % n5;
                                    return;
                                }
                                if (this.v < n3) {
                                    return;
                                }
                                this.v = n4 + (this.v - n4) % n5;
                                return;
                            }
                        }
                        if (this.l <= 0) break block32;
                        if (!this.u) break block33;
                        if (this.n >= 0) break block34;
                        if (this.v >= n4) {
                            return;
                        }
                        this.v = n4 + n4 - 1 - this.v;
                        this.n = -this.n;
                        if (--this.l != 0) break block34;
                        break block32;
                    }
                    if (this.n < 0) {
                        if (this.v >= n4) {
                            return;
                        }
                        int n6 = (n3 - 1 - this.v) / n5;
                        if (n6 < this.l) {
                            this.v += n5 * n6;
                            this.l -= n6;
                            return;
                        }
                        this.v += n5 * this.l;
                        this.l = 0;
                        break block32;
                    } else {
                        if (this.v < n3) {
                            return;
                        }
                        int n7 = (this.v - n4) / n5;
                        if (n7 < this.l) {
                            this.v -= n5 * n7;
                            this.l -= n7;
                            return;
                        }
                        this.v -= n5 * this.l;
                        this.l = 0;
                    }
                    break block32;
                }
                while (true) {
                    if (this.v < n3) {
                        return;
                    }
                    this.v = n3 + n3 - 1 - this.v;
                    this.n = -this.n;
                    if (this.v >= n4) {
                        return;
                    }
                    this.v = n4 + n4 - 1 - this.v;
                    this.n = -this.n;
                }
            }
            do {
                if (this.v < n3) {
                    return;
                }
                this.v = n3 + n3 - 1 - this.v;
                this.n = -this.n;
                if (--this.l == 0) break;
                if (this.v >= n4) {
                    return;
                }
                this.v = n4 + n4 - 1 - this.v;
                this.n = -this.n;
            } while (--this.l != 0);
        }
        if (this.n < 0) {
            if (this.v >= 0) return;
            this.v = -1;
            this.g();
            this.a(-27331);
            return;
        }
        if (this.v < n2) return;
        this.v = n2;
        this.g();
        this.a(-27331);
    }

    private static final int b(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4) + 0.5);
    }

    private final int a(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (this.y > 0) {
            int n2 = arg1 + this.y;
            if (n2 > arg3) {
                n2 = arg3;
            }
            this.y += arg1;
            arg1 = this.n == 256 && (this.v & 0xFF) == 0 ? (sa.i ? sb.a(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n2, arg2, this) : sb.a(((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n2, arg2, this)) : (sa.i ? sb.a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, this.p, this.o, 0, n2, arg2, this, this.n, arg4) : sb.b(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, this.s, 0, n2, arg2, this, this.n, arg4));
            this.y -= arg1;
            if (this.y != 0) {
                return arg1;
            }
            if (!this.f()) continue;
            return arg3;
        }
        if (this.n == 256 && (this.v & 0xFF) == 0) {
            if (sa.i) {
                return sb.a(0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this);
            }
            return sb.b(((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this);
        }
        if (sa.i) {
            return sb.a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.k, this.m, 0, arg3, arg2, this, this.n, arg4);
        }
        return sb.a(0, 0, ((vb)this.h).l, arg0, this.v, arg1, this.w, 0, arg3, arg2, this, this.n, arg4);
    }

    @Override
    final int d() {
        if (this.r == 0 && this.y == 0) {
            return 0;
        }
        return 1;
    }

    private sb(vb arg0, int arg1, int arg2) {
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

    private static final int b(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, sb arg11, int arg12, int arg13) {
        arg11.k -= arg11.p * arg5;
        arg11.m -= arg11.o * arg5;
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
            arg8 = arg9;
        }
        while (arg5 < arg8) {
            arg1 = arg4 >> 8;
            arg0 = arg2[arg1];
            int n2 = arg5++;
            arg3[n2] = arg3[n2] + (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg6 += arg7;
            arg4 += arg12;
        }
        if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            arg8 = arg9;
        }
        arg1 = arg13;
        while (arg5 < arg8) {
            arg0 = arg2[arg4 >> 8];
            int n3 = arg5++;
            arg3[n3] = arg3[n3] + (((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xFF)) * arg6 >> 6);
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.k += arg11.p * arg5;
        arg11.m += arg11.o * arg5;
        arg11.w = arg6;
        arg11.v = arg4;
        return arg5;
    }
}

