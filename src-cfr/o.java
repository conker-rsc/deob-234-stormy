/*
 * Decompiled with CFR 0.152.
 */
final class o {
    private int i;
    static int[] a;
    private int d;
    static String[] g;
    private int[] n;
    private int[] k = new int[256];
    static int[] p;
    private int m;
    private int f;
    static String l;

    final int c(int arg0) {
        if (-1 == ~this.i--) {
            this.b(-110);
            this.i = 255;
        }
        if (arg0 > -67) {
            this.d = 32;
        }
        return this.k[this.i];
    }

    private final void b(int arg0) {
        this.d += ++this.f;
        if (arg0 > -100) {
            g = null;
        }
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2;
            int n3 = this.n[i2];
            int n4 = i2 & 3;
            if (n4 == 0) {
                this.m ^= this.m << 13;
            } else if (n4 != 1) {
                if (n4 == 2) {
                    this.m ^= this.m << 2;
                } else if (n4 == 3) {
                    this.m ^= this.m >>> 16;
                }
            } else {
                this.m ^= this.m >>> 6;
            }
            this.m += this.n[0xFF & 128 + i2];
            this.n[i2] = n2 = this.m + this.n[ib.a(1020, n3) >> 2] - -this.d;
            this.k[i2] = this.d = this.n[ib.a(255, n2 >> 8 >> 2)] + n3;
        }
    }

    private final void a(int arg0) {
        int n2;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        int n6 = -1640531527;
        int n7 = -1640531527;
        if (arg0 != -2) {
            this.a(-15);
        }
        int n8 = -1640531527;
        int n9 = -1640531527;
        int n10 = -1640531527;
        for (n2 = 0; n2 < 4; ++n2) {
            n10 += (n4 ^= n8 << 11);
            n8 += n3;
            n7 += (n8 ^= n3 >>> 2);
            n3 += n10;
            n3 ^= n10 << 8;
            n10 += n7;
            n10 ^= n7 >>> 16;
            n7 += (n9 += n3);
            n5 += (n7 ^= n9 << 10);
            n9 += (n6 += n10);
            n9 ^= n6 >>> 4;
            n6 += n5;
            n6 ^= n5 << 8;
            n5 += (n4 += n9);
            n5 ^= n4 >>> 9;
            n4 += (n8 += n6);
            n3 += n5;
        }
        for (n2 = 0; n2 < 256; n2 += 8) {
            n4 += this.k[n2];
            n7 += this.k[4 + n2];
            n5 += this.k[n2 + 7];
            n9 += this.k[n2 + 5];
            n10 += this.k[3 + n2];
            n6 += this.k[6 + n2];
            n8 += (n3 += this.k[2 + n2]);
            n8 ^= n3 >>> 2;
            n3 += (n10 += (n4 ^= (n8 += this.k[n2 + 1]) << 11));
            n3 ^= n10 << 8;
            n10 += (n7 += n8);
            n6 += (n10 ^= n7 >>> 16);
            n7 += (n9 += n3);
            n5 += (n7 ^= n9 << 10);
            n9 += n6;
            n4 += (n9 ^= n6 >>> 4);
            n6 += n5;
            n8 += (n6 ^= n5 << 8);
            n5 += n4;
            n3 += (n5 ^= n4 >>> 9);
            this.n[n2] = n4 += n8;
            this.n[n2 + 1] = n8;
            this.n[2 + n2] = n3;
            this.n[3 + n2] = n10;
            this.n[4 + n2] = n7;
            this.n[n2 + 5] = n9;
            this.n[n2 + 6] = n6;
            this.n[n2 + 7] = n5;
        }
        for (n2 = 0; n2 < 256; n2 += 8) {
            n6 += this.n[6 + n2];
            n8 += this.n[n2 + 1];
            n5 += this.n[7 + n2];
            n7 += this.n[4 + n2];
            n9 += this.n[5 + n2];
            n10 += this.n[n2 + 3];
            n4 += this.n[n2];
            n4 ^= n8 << 11;
            n8 += (n3 += this.n[n2 + 2]);
            n8 ^= n3 >>> 2;
            n3 += (n10 += n4);
            n9 += (n3 ^= n10 << 8);
            n10 += (n7 += n8);
            n10 ^= n7 >>> 16;
            n7 += n9;
            n7 ^= n9 << 10;
            n9 += (n6 += n10);
            n9 ^= n6 >>> 4;
            n6 += (n5 += n7);
            n6 ^= n5 << 8;
            n5 += (n4 += n9);
            n5 ^= n4 >>> 9;
            this.n[n2] = n4 += (n8 += n6);
            this.n[n2 + 1] = n8;
            this.n[n2 + 2] = n3 += n5;
            this.n[3 + n2] = n10;
            this.n[n2 + 4] = n7;
            this.n[n2 + 5] = n9;
            this.n[n2 + 6] = n6;
            this.n[7 + n2] = n5;
        }
        this.b(-105);
        this.i = 256;
    }

    static final int a(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 9570) {
            o.a((byte)56);
        }
        return (arg0 << 16) + ((arg3 << 8) - -arg2);
    }

    static final String a(byte arg0) {
        if (arg0 != 38) {
            o.a(67, 106, -48, 111);
        }
        String string = "";
        while (kb.d[jb.p] != 0) {
            string = string + (char)kb.d[jb.p++];
        }
        ++jb.p;
        return string;
    }

    static final int a(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int n2 = 0;
        for (int i2 = 0; i2 < arg5; ++i2) {
            int n3;
            int n4 = arg7 * (arg1 + ((!arg4 ? -i2 : i2) - arg6));
            if (n4 >= -100) {
                if (n4 > 100) {
                    n4 = 100;
                }
            } else {
                n4 = -100;
            }
            if ((n3 = arg2 - -n4) < 10) {
                n3 = 10;
            }
            n2 += arg0 * n3 / 100;
        }
        if (arg3 != -30910) {
            o.a((byte)106);
        }
        return n2;
    }

    o(int[] arg0) {
        this.n = new int[256];
        for (int i2 = 0; arg0.length > i2; ++i2) {
            this.k[i2] = arg0[i2];
        }
        this.a(-2);
    }

    static {
        g = new String[]{"Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?"};
        l = "";
    }
}

