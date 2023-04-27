/*
 * Decompiled with CFR 0.152.
 */
final class aa {
    static int[] c;
    static int b;
    static int d;
    private int[] j;
    private byte[] i;
    static int l;
    private int[] g;
    static int f;
    static String[] k;

    final int a(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        try {
            if (arg5 < 99) {
                this.a(-58, (byte[])null, 69, null, -39, 22);
            }
            int n2 = 0;
            arg0 += arg4;
            int n3 = arg2 << 3;
            while (arg4 < arg0) {
                int n4 = arg3[arg4] & 0xFF;
                int n5 = this.g[n4];
                byte by = this.i[n4];
                if (by == 0) {
                    throw new RuntimeException("" + n4);
                }
                int n6 = n3 >> 3;
                int n7 = n3 & 7;
                n2 &= -n7 >> 31;
                int n8 = n6 + (by + n7 - 1 >> 3);
                n3 += by;
                n2 = d.a(n2, n5 >>> (n7 += 24));
                arg1[n6] = (byte)n2;
                if (n8 > n6) {
                    n2 = n5 >>> (n7 -= 8);
                    arg1[++n6] = (byte)n2;
                    if (n6 < n8) {
                        n2 = n5 >>> (n7 -= 8);
                        arg1[++n6] = (byte)n2;
                        if (n6 < n8) {
                            n2 = n5 >>> (n7 -= 8);
                            arg1[++n6] = (byte)n2;
                            if (n6 < n8) {
                                n2 = n5 << -(n7 -= 8);
                                arg1[++n6] = (byte)n2;
                            }
                        }
                    }
                }
                ++arg4;
            }
            return -arg2 + (n3 + 7 >> 3);
        }
        catch (RuntimeException runtimeException) {
            throw i.a(runtimeException, "aa.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    final int a(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return 0;
        }
        int n2 = 0;
        arg5 += arg2;
        if (arg4 != -1) {
            this.a(105, (byte[])null, 82, null, 125, -45);
        }
        int n3 = arg3;
        while (true) {
            byte by;
            n2 = (by = arg0[n3]) >= 0 ? ++n2 : this.j[n2];
            int n4 = this.j[n2];
            if (0 > n4) {
                arg1[arg2++] = (byte)(~n4);
                if (arg2 >= arg5) break;
                n2 = 0;
            }
            n2 = (0x40 & by) != 0 ? this.j[n2] : ++n2;
            n4 = this.j[n2];
            if (n4 < 0) {
                arg1[arg2++] = (byte)(~n4);
                if (arg5 <= arg2) break;
                n2 = 0;
            }
            n2 = (by & 0x20) == 0 ? ++n2 : this.j[n2];
            n4 = this.j[n2];
            if (~n4 > -1) {
                arg1[arg2++] = (byte)(~n4);
                if (arg2 >= arg5) break;
                n2 = 0;
            }
            n2 = (0x10 & by) != 0 ? this.j[n2] : ++n2;
            n4 = this.j[n2];
            if (~n4 > -1) {
                arg1[arg2++] = (byte)(~n4);
                if (arg2 >= arg5) break;
                n2 = 0;
            }
            n2 = (by & 8) != 0 ? this.j[n2] : ++n2;
            n4 = this.j[n2];
            if (-1 < ~n4) {
                arg1[arg2++] = (byte)(~n4);
                if (arg2 >= arg5) break;
                n2 = 0;
            }
            n2 = (4 & by) != 0 ? this.j[n2] : ++n2;
            n4 = this.j[n2];
            if (0 > n4) {
                arg1[arg2++] = (byte)(~n4);
                if (arg5 <= arg2) break;
                n2 = 0;
            }
            n2 = (2 & by) == 0 ? ++n2 : this.j[n2];
            n4 = this.j[n2];
            if (~n4 > -1) {
                arg1[arg2++] = (byte)(~n4);
                if (arg5 <= arg2) break;
                n2 = 0;
            }
            n2 = (1 & by) != 0 ? this.j[n2] : ++n2;
            n4 = this.j[n2];
            if (~n4 > -1) {
                arg1[arg2++] = (byte)(~n4);
                if (arg5 <= arg2) break;
                n2 = 0;
            }
            ++n3;
        }
        return -arg3 + 1 + n3;
    }

    static final int a(int arg0, boolean arg1) {
        --arg0;
        arg0 |= arg0 >>> 1;
        arg0 |= arg0 >>> 2;
        arg0 |= arg0 >>> 4;
        if (arg1) {
            b = -4;
        }
        arg0 |= arg0 >>> 8;
        arg0 |= arg0 >>> 16;
        return arg0 + 1;
    }

    aa(byte[] arg0) {
        int n2 = arg0.length;
        this.g = new int[n2];
        this.i = arg0;
        this.j = new int[8];
        int[] nArray = new int[33];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            byte by = arg0[i2];
            if (by == 0) continue;
            int n9 = 1 << -by + 32;
            this.g[i2] = n8 = nArray[by];
            if ((n9 & n8) != 0) {
                n7 = nArray[by - 1];
            } else {
                for (n6 = by - 1; n6 >= 1 && n8 == (n5 = nArray[n6]); --n6) {
                    n4 = 1 << 32 - n6;
                    if ((n5 & n4) != 0) {
                        nArray[n6] = nArray[n6 - 1];
                        break;
                    }
                    nArray[n6] = d.a(n4, n5);
                }
                n7 = n8 | n9;
            }
            nArray[by] = n7;
            for (n6 = by + 1; n6 <= 32; ++n6) {
                if (n8 != nArray[n6]) continue;
                nArray[n6] = n7;
            }
            n6 = 0;
            for (n5 = 0; by > n5; ++n5) {
                n4 = Integer.MIN_VALUE >>> n5;
                if ((n4 & n8) == 0) {
                    ++n6;
                } else {
                    if (this.j[n6] == 0) {
                        this.j[n6] = n3;
                    }
                    n6 = this.j[n6];
                }
                if (this.j.length <= n6) {
                    int[] nArray2 = new int[this.j.length * 2];
                    for (int i3 = 0; this.j.length > i3; ++i3) {
                        nArray2[i3] = this.j[i3];
                    }
                    this.j = nArray2;
                }
                n4 >>>= 1;
            }
            if (n3 <= n6) {
                n3 = n6 + 1;
            }
            this.j[n6] = ~i2;
        }
    }

    static {
        d = 114;
        k = new String[100];
    }
}

