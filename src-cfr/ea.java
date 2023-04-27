/*
 * Decompiled with CFR 0.152.
 */
final class ea {
    private static ac a = new ac();

    private static final void b(ac arg0) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        byte by = 0;
        byte by2 = 0;
        int n18 = 0;
        int[] nArray = null;
        int[] nArray2 = null;
        int[] nArray3 = null;
        arg0.f = 1;
        if (ua.Mb == null) {
            ua.Mb = new int[arg0.f * 100000];
        }
        boolean bl = true;
        while (bl) {
            int n19;
            int n20;
            int n21;
            byte by3 = ea.c(arg0);
            if (by3 == 23) {
                return;
            }
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.c(arg0);
            by3 = ea.d(arg0);
            if (by3 != 0) {
                // empty if block
            }
            arg0.E = 0;
            by3 = ea.c(arg0);
            arg0.E = arg0.E << 8 | by3 & 0xFF;
            by3 = ea.c(arg0);
            arg0.E = arg0.E << 8 | by3 & 0xFF;
            by3 = ea.c(arg0);
            arg0.E = arg0.E << 8 | by3 & 0xFF;
            for (n2 = 0; n2 < 16; ++n2) {
                by3 = ea.d(arg0);
                arg0.v[n2] = by3 == 1;
            }
            for (n2 = 0; n2 < 256; ++n2) {
                arg0.n[n2] = false;
            }
            for (n2 = 0; n2 < 16; ++n2) {
                if (!arg0.v[n2]) continue;
                for (n3 = 0; n3 < 16; ++n3) {
                    by3 = ea.d(arg0);
                    if (by3 != 1) continue;
                    arg0.n[n2 * 16 + n3] = true;
                }
            }
            ea.a(arg0);
            n5 = arg0.K + 2;
            n6 = ea.a(3, arg0);
            n7 = ea.a(15, arg0);
            for (n2 = 0; n2 < n7; ++n2) {
                n3 = 0;
                while ((by3 = ea.d(arg0)) != 0) {
                    ++n3;
                }
                arg0.s[n2] = (byte)n3;
            }
            byte[] byArray = new byte[6];
            for (n21 = 0; n21 < n6; n21 = (int)((byte)(n21 + 1))) {
                byArray[n21] = n21;
            }
            for (n2 = 0; n2 < n7; ++n2) {
                n20 = byArray[n21];
                for (n21 = arg0.s[n2]; n21 > 0; n21 = (int)((byte)(n21 - 1))) {
                    byArray[n21] = byArray[n21 - 1];
                }
                byArray[0] = n20;
                arg0.j[n2] = n20;
            }
            for (n4 = 0; n4 < n6; ++n4) {
                n15 = ea.a(5, arg0);
                for (n2 = 0; n2 < n5; ++n2) {
                    while ((by3 = ea.d(arg0)) != 0) {
                        by3 = ea.d(arg0);
                        if (by3 == 0) {
                            ++n15;
                            continue;
                        }
                        --n15;
                    }
                    arg0.B[n4][n2] = (byte)n15;
                }
            }
            for (n4 = 0; n4 < n6; ++n4) {
                int n22 = 32;
                byte by4 = 0;
                for (n2 = 0; n2 < n5; ++n2) {
                    if (arg0.B[n4][n2] > by4) {
                        by4 = arg0.B[n4][n2];
                    }
                    if (arg0.B[n4][n2] >= n22) continue;
                    n22 = arg0.B[n4][n2];
                }
                ea.a(arg0.u[n4], arg0.t[n4], arg0.J[n4], arg0.B[n4], n22, by4, n5);
                arg0.D[n4] = n22;
            }
            n8 = arg0.K + 1;
            n9 = -1;
            n10 = 0;
            for (n2 = 0; n2 <= 255; ++n2) {
                arg0.m[n2] = 0;
            }
            n21 = 4095;
            for (n19 = 15; n19 >= 0; --n19) {
                for (n20 = 15; n20 >= 0; --n20) {
                    arg0.A[n21] = (byte)(n19 * 16 + n20);
                    --n21;
                }
                arg0.r[n19] = n21 + 1;
            }
            n12 = 0;
            if (n10 == 0) {
                n10 = 50;
                by2 = arg0.j[++n9];
                n18 = arg0.D[by2];
                nArray = arg0.u[by2];
                nArray3 = arg0.J[by2];
                nArray2 = arg0.t[by2];
            }
            --n10;
            n16 = n18;
            n17 = ea.a(n16, arg0);
            while (n17 > nArray[n16]) {
                ++n16;
                by = ea.d(arg0);
                n17 = n17 << 1 | by;
            }
            n11 = nArray3[n17 - nArray2[n16]];
            while (n11 != n8) {
                int n23;
                if (n11 == 0 || n11 == 1) {
                    n13 = -1;
                    n14 = 1;
                    do {
                        if (n11 == 0) {
                            n13 += 1 * n14;
                        } else if (n11 == 1) {
                            n13 += 2 * n14;
                        }
                        n14 *= 2;
                        if (n10 == 0) {
                            n10 = 50;
                            by2 = arg0.j[++n9];
                            n18 = arg0.D[by2];
                            nArray = arg0.u[by2];
                            nArray3 = arg0.J[by2];
                            nArray2 = arg0.t[by2];
                        }
                        --n10;
                        n16 = n18;
                        n17 = ea.a(n16, arg0);
                        while (n17 > nArray[n16]) {
                            ++n16;
                            by = ea.d(arg0);
                            n17 = n17 << 1 | by;
                        }
                    } while ((n11 = nArray3[n17 - nArray2[n16]]) == 0 || n11 == 1);
                    by3 = arg0.d[arg0.A[arg0.r[0]] & 0xFF];
                    int n24 = by3 & 0xFF;
                    arg0.m[n24] = arg0.m[n24] + ++n13;
                    while (n13 > 0) {
                        ua.Mb[n12] = by3 & 0xFF;
                        ++n12;
                        --n13;
                    }
                    continue;
                }
                int n25 = n11 - 1;
                if (n25 < 16) {
                    n23 = arg0.r[0];
                    by3 = arg0.A[n23 + n25];
                    while (n25 > 3) {
                        int n26 = n23 + n25;
                        arg0.A[n26] = arg0.A[n26 - 1];
                        arg0.A[n26 - 1] = arg0.A[n26 - 2];
                        arg0.A[n26 - 2] = arg0.A[n26 - 3];
                        arg0.A[n26 - 3] = arg0.A[n26 - 4];
                        n25 -= 4;
                    }
                    while (n25 > 0) {
                        arg0.A[n23 + n25] = arg0.A[n23 + n25 - 1];
                        --n25;
                    }
                    arg0.A[n23] = by3;
                } else {
                    int n27 = n25 / 16;
                    int n28 = n25 % 16;
                    by3 = arg0.A[n23];
                    for (n23 = arg0.r[n27] + n28; n23 > arg0.r[n27]; --n23) {
                        arg0.A[n23] = arg0.A[n23 - 1];
                    }
                    int n29 = n27;
                    arg0.r[n29] = arg0.r[n29] + 1;
                    while (n27 > 0) {
                        int n30 = n27;
                        arg0.r[n30] = arg0.r[n30] - 1;
                        arg0.A[arg0.r[n27]] = arg0.A[arg0.r[n27 - 1] + 16 - 1];
                        --n27;
                    }
                    arg0.r[0] = arg0.r[0] - 1;
                    arg0.A[arg0.r[0]] = by3;
                    if (arg0.r[0] == 0) {
                        n21 = 4095;
                        for (n19 = 15; n19 >= 0; --n19) {
                            for (n20 = 15; n20 >= 0; --n20) {
                                arg0.A[n21] = arg0.A[arg0.r[n19] + n20];
                                --n21;
                            }
                            arg0.r[n19] = n21 + 1;
                        }
                    }
                }
                int n31 = arg0.d[by3 & 0xFF] & 0xFF;
                arg0.m[n31] = arg0.m[n31] + 1;
                ua.Mb[n12] = arg0.d[by3 & 0xFF] & 0xFF;
                ++n12;
                if (n10 == 0) {
                    n10 = 50;
                    by2 = arg0.j[++n9];
                    n18 = arg0.D[by2];
                    nArray = arg0.u[by2];
                    nArray3 = arg0.J[by2];
                    nArray2 = arg0.t[by2];
                }
                --n10;
                n16 = n18;
                n17 = ea.a(n16, arg0);
                while (n17 > nArray[n16]) {
                    ++n16;
                    by = ea.d(arg0);
                    n17 = n17 << 1 | by;
                }
                n11 = nArray3[n17 - nArray2[n16]];
            }
            arg0.F = 0;
            arg0.g = 0;
            arg0.w[0] = 0;
            for (n2 = 1; n2 <= 256; ++n2) {
                arg0.w[n2] = arg0.m[n2 - 1];
            }
            for (n2 = 1; n2 <= 256; ++n2) {
                int n32 = n2;
                arg0.w[n32] = arg0.w[n32] + arg0.w[n2 - 1];
            }
            for (n2 = 0; n2 < n12; ++n2) {
                by3 = (byte)(ua.Mb[n2] & 0xFF);
                int n33 = arg0.w[by3 & 0xFF];
                ua.Mb[n33] = ua.Mb[n33] | n2 << 8;
                int n34 = by3 & 0xFF;
                arg0.w[n34] = arg0.w[n34] + 1;
            }
            arg0.H = ua.Mb[arg0.E] >> 8;
            arg0.L = 0;
            arg0.H = ua.Mb[arg0.H];
            arg0.h = (byte)(arg0.H & 0xFF);
            arg0.H >>= 8;
            ++arg0.L;
            arg0.b = n12;
            ea.e(arg0);
            if (arg0.L == arg0.b + 1 && arg0.F == 0) {
                bl = true;
                continue;
            }
            bl = false;
        }
    }

    private static final byte c(ac arg0) {
        return (byte)ea.a(8, arg0);
    }

    private static final byte d(ac arg0) {
        return (byte)ea.a(1, arg0);
    }

    private static final void a(ac arg0) {
        arg0.K = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!arg0.n[i2]) continue;
            arg0.d[arg0.K] = (byte)i2;
            ++arg0.K;
        }
    }

    private static final void a(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int n2;
        int n3 = 0;
        for (n2 = arg4; n2 <= arg5; ++n2) {
            for (int i2 = 0; i2 < arg6; ++i2) {
                if (arg3[i2] != n2) continue;
                arg2[n3] = i2;
                ++n3;
            }
        }
        for (n2 = 0; n2 < 23; ++n2) {
            arg1[n2] = 0;
        }
        for (n2 = 0; n2 < arg6; ++n2) {
            int n4 = arg3[n2] + 1;
            arg1[n4] = arg1[n4] + 1;
        }
        for (n2 = 1; n2 < 23; ++n2) {
            int n5 = n2;
            arg1[n5] = arg1[n5] + arg1[n2 - 1];
        }
        for (n2 = 0; n2 < 23; ++n2) {
            arg0[n2] = 0;
        }
        int n6 = 0;
        for (n2 = arg4; n2 <= arg5; ++n2) {
            arg0[n2] = (n6 += arg1[n2 + 1] - arg1[n2]) - 1;
            n6 <<= 1;
        }
        for (n2 = arg4 + 1; n2 <= arg5; ++n2) {
            arg1[n2] = (arg0[n2 - 1] + 1 << 1) - arg1[n2];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static final int a(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        ac ac2 = a;
        synchronized (ac2) {
            ea.a.q = arg2;
            ea.a.a = arg4;
            ea.a.i = arg0;
            ea.a.o = 0;
            ea.a.y = arg1;
            ea.a.p = 0;
            ea.a.e = 0;
            ea.a.c = 0;
            ea.a.G = 0;
            ea.b(a);
            ea.a.q = null;
            ea.a.i = null;
            return arg1 -= ea.a.y;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static final void e(ac arg0) {
        var2_1 = arg0.g;
        var3_2 = arg0.F;
        var4_3 = arg0.L;
        var5_4 = arg0.h;
        var6_5 = ua.Mb;
        var7_6 = arg0.H;
        var8_7 = arg0.i;
        var9_8 = arg0.o;
        var11_10 = var10_9 = arg0.y;
        var12_11 = arg0.b + 1;
        block0: while (true) {
            if (var3_2 <= 0) ** GOTO lbl26
            while (var10_9 != 0) {
                if (var3_2 != 1) {
                    var8_7[var9_8] = var2_1;
                    --var3_2;
                    ++var9_8;
                    --var10_9;
                    continue;
                }
                if (var10_9 == 0) {
                    var3_2 = 1;
                    break block0;
                }
                var8_7[var9_8] = var2_1;
                ++var9_8;
                --var10_9;
lbl26:
                // 2 sources

                while (true) {
                    if (var4_3 == var12_11) {
                        var3_2 = 0;
                        break block0;
                    }
                    var2_1 = (byte)var5_4;
                    var7_6 = var6_5[var7_6];
                    var1_12 = (byte)var7_6;
                    var7_6 >>= 8;
                    ++var4_3;
                    if (var1_12 != var5_4) {
                        var5_4 = var1_12;
                        if (var10_9 == 0) {
                            var3_2 = 1;
                            break block0;
                        }
                        var8_7[var9_8] = var2_1;
                        ++var9_8;
                        --var10_9;
                        continue;
                    }
                    if (var4_3 != var12_11) break;
                    if (var10_9 == 0) {
                        var3_2 = 1;
                        break block0;
                    }
                    var8_7[var9_8] = var2_1;
                    ++var9_8;
                    --var10_9;
                }
                var3_2 = 2;
                var7_6 = var6_5[var7_6];
                var1_12 = (byte)var7_6;
                var7_6 >>= 8;
                if (++var4_3 == var12_11) continue block0;
                if (var1_12 != var5_4) {
                    var5_4 = var1_12;
                    continue block0;
                }
                var3_2 = 3;
                var7_6 = var6_5[var7_6];
                var1_12 = (byte)var7_6;
                var7_6 >>= 8;
                if (++var4_3 == var12_11) continue block0;
                if (var1_12 != var5_4) {
                    var5_4 = var1_12;
                    continue block0;
                }
                var7_6 = var6_5[var7_6];
                var1_12 = (byte)var7_6;
                var7_6 >>= 8;
                ++var4_3;
                var3_2 = (var1_12 & 255) + 4;
                var7_6 = var6_5[var7_6];
                var5_4 = (byte)var7_6;
                var7_6 >>= 8;
                ++var4_3;
                continue block0;
            }
            break;
        }
        var13_13 = arg0.G;
        arg0.G += var11_10 - var10_9;
        if (arg0.G < var13_13) {
            // empty if block
        }
        arg0.g = var2_1;
        arg0.F = var3_2;
        arg0.L = var4_3;
        arg0.h = var5_4;
        ua.Mb = var6_5;
        arg0.H = var7_6;
        arg0.i = var8_7;
        arg0.o = var9_8;
        arg0.y = var10_9;
    }

    private static final int a(int arg0, ac arg1) {
        while (true) {
            if (arg1.p >= arg0) {
                int n2 = arg1.e >> arg1.p - arg0 & (1 << arg0) - 1;
                arg1.p -= arg0;
                return n2;
            }
            arg1.e = arg1.e << 8 | arg1.q[arg1.a] & 0xFF;
            arg1.p += 8;
            ++arg1.a;
            ++arg1.c;
            if (arg1.c != 0) continue;
        }
    }
}

