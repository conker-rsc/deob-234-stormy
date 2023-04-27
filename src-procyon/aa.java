final class aa
{
    static int[] c;
    static int b;
    static int d;
    private int[] j;
    private byte[] i;
    static int l;
    private int[] g;
    static int f;
    static String[] k;
    
    final int a(int arg0, final byte[] arg1, final int arg2, final byte[] arg3, int arg4, final int arg5) {
        try {
            if (arg5 < 99) {
                this.a(-58, null, 69, null, -39, 22);
            }
            int a = 0;
            arg0 += arg4;
            int n = arg2 << 3;
            while (arg4 < arg0) {
                final int n2 = arg3[arg4] & 0xFF;
                final int n3 = this.g[n2];
                final byte b = this.i[n2];
                if (b == 0) {
                    throw new RuntimeException("" + n2);
                }
                int n4 = n >> 3;
                int n5 = n & 0x7;
                final int arg6 = a & -n5 >> 31;
                final int n6 = n4 + (b + n5 - 1 >> 3);
                n += b;
                n5 += 24;
                arg1[n4] = (byte)(a = d.a(arg6, n3 >>> n5));
                if (n6 > n4) {
                    ++n4;
                    n5 -= 8;
                    arg1[n4] = (byte)(a = n3 >>> n5);
                    if (n4 < n6) {
                        ++n4;
                        n5 -= 8;
                        arg1[n4] = (byte)(a = n3 >>> n5);
                        if (n4 < n6) {
                            ++n4;
                            n5 -= 8;
                            arg1[n4] = (byte)(a = n3 >>> n5);
                            if (n4 < n6) {
                                ++n4;
                                n5 -= 8;
                                arg1[n4] = (byte)(a = n3 << -n5);
                            }
                        }
                    }
                }
                ++arg4;
            }
            return -arg2 + (n + 7 >> 3);
        }
        catch (final RuntimeException arg7) {
            throw i.a(arg7, "aa.B(" + arg0 + ',' + ((arg1 != null) ? "{...}" : "null") + ',' + arg2 + ',' + ((arg3 != null) ? "{...}" : "null") + ',' + arg4 + ',' + arg5 + ')');
        }
    }
    
    final int a(final byte[] arg0, final byte[] arg1, int arg2, final int arg3, final int arg4, int arg5) {
        if (arg5 == 0) {
            return 0;
        }
        int n = 0;
        arg5 += arg2;
        if (arg4 != -1) {
            this.a(105, null, 82, null, 125, -45);
        }
        int n2 = arg3;
        while (true) {
            final byte b = arg0[n2];
            if (b >= 0) {
                ++n;
            }
            else {
                n = this.j[n];
            }
            final int n3;
            if (0 > (n3 = this.j[n])) {
                arg1[arg2++] = (byte)~n3;
                if (arg2 >= arg5) {
                    break;
                }
                n = 0;
            }
            if ((0x40 & b) != 0x0) {
                n = this.j[n];
            }
            else {
                ++n;
            }
            final int n4;
            if ((n4 = this.j[n]) < 0) {
                arg1[arg2++] = (byte)~n4;
                if (arg5 <= arg2) {
                    break;
                }
                n = 0;
            }
            if ((b & 0x20) == 0x0) {
                ++n;
            }
            else {
                n = this.j[n];
            }
            final int n5;
            if (~(n5 = this.j[n]) > -1) {
                arg1[arg2++] = (byte)~n5;
                if (arg2 >= arg5) {
                    break;
                }
                n = 0;
            }
            if ((0x10 & b) != 0x0) {
                n = this.j[n];
            }
            else {
                ++n;
            }
            final int n6;
            if (~(n6 = this.j[n]) > -1) {
                arg1[arg2++] = (byte)~n6;
                if (arg2 >= arg5) {
                    break;
                }
                n = 0;
            }
            if ((b & 0x8) != 0x0) {
                n = this.j[n];
            }
            else {
                ++n;
            }
            final int n7;
            if (-1 < ~(n7 = this.j[n])) {
                arg1[arg2++] = (byte)~n7;
                if (arg2 >= arg5) {
                    break;
                }
                n = 0;
            }
            if ((0x4 & b) != 0x0) {
                n = this.j[n];
            }
            else {
                ++n;
            }
            final int n8;
            if (0 > (n8 = this.j[n])) {
                arg1[arg2++] = (byte)~n8;
                if (arg5 <= arg2) {
                    break;
                }
                n = 0;
            }
            if ((0x2 & b) == 0x0) {
                ++n;
            }
            else {
                n = this.j[n];
            }
            final int n9;
            if (~(n9 = this.j[n]) > -1) {
                arg1[arg2++] = (byte)~n9;
                if (arg5 <= arg2) {
                    break;
                }
                n = 0;
            }
            if ((0x1 & b) != 0x0) {
                n = this.j[n];
            }
            else {
                ++n;
            }
            final int n10;
            if (~(n10 = this.j[n]) > -1) {
                arg1[arg2++] = (byte)~n10;
                if (arg5 <= arg2) {
                    break;
                }
                n = 0;
            }
            ++n2;
        }
        return -arg3 + 1 + n2;
    }
    
    static final int a(int arg0, final boolean arg1) {
        arg0 = (--arg0 | arg0 >>> 1);
        arg0 |= arg0 >>> 2;
        arg0 |= arg0 >>> 4;
        if (arg1) {
            aa.b = -4;
        }
        arg0 |= arg0 >>> 8;
        arg0 |= arg0 >>> 16;
        return arg0 + 1;
    }
    
    aa(final byte[] arg0) {
        super();
        final int length = arg0.length;
        this.g = new int[length];
        this.i = arg0;
        this.j = new int[8];
        final int[] array = new int[33];
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final byte b = arg0[i];
            if (b != 0) {
                final int n2 = 1 << -b + 32;
                final int n3 = array[b];
                this.g[i] = n3;
                int n4;
                if ((n2 & n3) != 0x0) {
                    n4 = array[b - 1];
                }
                else {
                    for (int j = b - 1; j >= 1; --j) {
                        final int arg = array[j];
                        if (n3 != arg) {
                            break;
                        }
                        final int arg2 = 1 << 32 - j;
                        if ((arg & arg2) != 0x0) {
                            array[j] = array[j - 1];
                            break;
                        }
                        array[j] = d.a(arg2, arg);
                    }
                    n4 = (n3 | n2);
                }
                array[b] = n4;
                for (int k = b + 1; k <= 32; ++k) {
                    if (n3 == array[k]) {
                        array[k] = n4;
                    }
                }
                int n5 = 0;
                for (byte b2 = 0; b > b2; ++b2) {
                    if ((Integer.MIN_VALUE >>> b2 & n3) == 0x0) {
                        ++n5;
                    }
                    else {
                        if (this.j[n5] == 0) {
                            this.j[n5] = n;
                        }
                        n5 = this.j[n5];
                    }
                    if (this.j.length <= n5) {
                        final int[] l = new int[this.j.length * 2];
                        for (int n6 = 0; this.j.length > n6; ++n6) {
                            l[n6] = this.j[n6];
                        }
                        this.j = l;
                    }
                }
                if (n <= n5) {
                    n = n5 + 1;
                }
                this.j[n5] = ~i;
            }
        }
    }
    
    static {
        aa.d = 114;
        aa.k = new String[100];
    }
}
