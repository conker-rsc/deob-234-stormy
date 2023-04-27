final class o
{
    private int i;
    static int[] a;
    private int d;
    static String[] g;
    private int[] n;
    private int[] k;
    static int[] p;
    private int m;
    private int f;
    static String l;
    
    final int c(final int arg0) {
        if (-1 == ~(this.i--)) {
            this.b(-110);
            this.i = 255;
        }
        if (arg0 > -67) {
            this.d = 32;
        }
        return this.k[this.i];
    }
    
    private final void b(final int arg0) {
        this.d += ++this.f;
        if (arg0 > -100) {
            o.g = null;
        }
        for (int i = 0; i < 256; ++i) {
            final int arg = this.n[i];
            final int n = i & 0x3;
            if (n == 0) {
                this.m ^= this.m << 13;
            }
            else if (n != 1) {
                if (n == 2) {
                    this.m ^= this.m << 2;
                }
                else if (n == 3) {
                    this.m ^= this.m >>> 16;
                }
            }
            else {
                this.m ^= this.m >>> 6;
            }
            this.m += this.n[0xFF & 128 + i];
            this.k[i] = (this.d = this.n[ib.a(255, (this.n[i] = this.m + this.n[ib.a(1020, arg) >> 2] - -this.d) >> 8 >> 2)] + arg);
        }
    }
    
    private final void a(final int arg0) {
        int n = -1640531527;
        int n2 = -1640531527;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        if (arg0 != -2) {
            this.a(-15);
        }
        int n6 = -1640531527;
        int n7 = -1640531527;
        int n8 = -1640531527;
        for (int i = 0; i < 4; ++i) {
            final int n9 = n2 ^ n6 << 11;
            final int n10 = n8 + n9;
            final int n11 = n6 + n ^ n >>> 2;
            final int n12 = n5 + n11;
            final int n13 = n + n10 ^ n10 << 8;
            final int n14 = n10 + n12;
            final int n15 = n7 + n13;
            n8 = (n14 ^ n12 >>> 16);
            final int n16 = n12 + n15;
            final int n17 = n4 + n8;
            n5 = (n16 ^ n15 << 10);
            final int n18 = n3 + n5;
            n7 = (n15 + n17 ^ n17 >>> 4);
            final int n19 = n17 + n18;
            final int n20 = n9 + n7;
            n4 = (n19 ^ n18 << 8);
            final int n21 = n18 + n20;
            n6 = n11 + n4;
            n3 = (n21 ^ n20 >>> 9);
            n2 = n20 + n6;
            n = n13 + n3;
        }
        for (int j = 0; j < 256; j += 8) {
            final int n22 = n2 + this.k[j];
            final int n23 = n5 + this.k[4 + j];
            final int n24 = n + this.k[2 + j];
            final int n25 = n3 + this.k[j + 7];
            final int n26 = n7 + this.k[j + 5];
            final int n27 = n8 + this.k[3 + j];
            final int n28 = n4 + this.k[6 + j];
            final int n29 = n6 + this.k[j + 1];
            final int n30 = n22 ^ n29 << 11;
            final int n31 = n27 + n30;
            final int n32 = n29 + n24 ^ n24 >>> 2;
            final int n33 = n24 + n31;
            final int n34 = n23 + n32;
            final int n35 = n33 ^ n31 << 8;
            final int n36 = n31 + n34;
            final int n37 = n26 + n35;
            n8 = (n36 ^ n34 >>> 16);
            final int n38 = n28 + n8;
            n5 = (n34 + n37 ^ n37 << 10);
            final int n39 = n25 + n5;
            n7 = (n37 + n38 ^ n38 >>> 4);
            final int n40 = n30 + n7;
            n4 = (n38 + n39 ^ n39 << 8);
            n6 = n32 + n4;
            n3 = (n39 + n40 ^ n40 >>> 9);
            n = n35 + n3;
            n2 = n40 + n6;
            this.n[j] = n2;
            this.n[j + 1] = n6;
            this.n[2 + j] = n;
            this.n[3 + j] = n8;
            this.n[4 + j] = n5;
            this.n[j + 5] = n7;
            this.n[j + 6] = n4;
            this.n[j + 7] = n3;
        }
        for (int k = 0; k < 256; k += 8) {
            final int n41 = n4 + this.n[6 + k];
            final int n42 = n6 + this.n[k + 1];
            final int n43 = n3 + this.n[7 + k];
            final int n44 = n5 + this.n[4 + k];
            final int n45 = n7 + this.n[5 + k];
            final int n46 = n + this.n[k + 2];
            final int n47 = n8 + this.n[k + 3];
            final int n48 = n2 + this.n[k] ^ n42 << 11;
            final int n49 = n42 + n46;
            final int n50 = n47 + n48;
            final int n51 = n49 ^ n46 >>> 2;
            final int n52 = n46 + n50;
            final int n53 = n44 + n51;
            final int n54 = n52 ^ n50 << 8;
            final int n55 = n45 + n54;
            n8 = (n50 + n53 ^ n53 >>> 16);
            final int n56 = n53 + n55;
            final int n57 = n41 + n8;
            n5 = (n56 ^ n55 << 10);
            final int n58 = n55 + n57;
            final int n59 = n43 + n5;
            n7 = (n58 ^ n57 >>> 4);
            final int n60 = n57 + n59;
            final int n61 = n48 + n7;
            n4 = (n60 ^ n59 << 8);
            final int n62 = n59 + n61;
            n6 = n51 + n4;
            n3 = (n62 ^ n61 >>> 9);
            n2 = n61 + n6;
            n = n54 + n3;
            this.n[k] = n2;
            this.n[k + 1] = n6;
            this.n[k + 2] = n;
            this.n[3 + k] = n8;
            this.n[k + 4] = n5;
            this.n[k + 5] = n7;
            this.n[k + 6] = n4;
            this.n[7 + k] = n3;
        }
        this.b(-105);
        this.i = 256;
    }
    
    static final int a(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg1 != 9570) {
            a((byte)56);
        }
        return (arg0 << 16) + ((arg3 << 8) - -arg2);
    }
    
    static final String a(final byte arg0) {
        if (arg0 != 38) {
            a(67, 106, -48, 111);
        }
        String string = "";
        while (kb.d[jb.p] != 0) {
            string += (char)kb.d[jb.p++];
        }
        ++jb.p;
        return string;
    }
    
    static final int a(final int arg0, final int arg1, final int arg2, final int arg3, final boolean arg4, final int arg5, final int arg6, final int arg7) {
        int n = 0;
        for (int i = 0; i < arg5; ++i) {
            int n2 = arg7 * (arg1 + ((arg4 ? i : (-i)) - arg6));
            if (n2 >= -100) {
                if (n2 > 100) {
                    n2 = 100;
                }
            }
            else {
                n2 = -100;
            }
            int n3 = arg2 - -n2;
            if (n3 < 10) {
                n3 = 10;
            }
            n += arg0 * n3 / 100;
        }
        if (arg3 != -30910) {
            a((byte)106);
        }
        return n;
    }
    
    o(final int[] arg0) {
        super();
        this.k = new int[256];
        this.n = new int[256];
        for (int n = 0; arg0.length > n; ++n) {
            this.k[n] = arg0[n];
        }
        this.a(-2);
    }
    
    static {
        o.g = new String[] { "Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?" };
        o.l = "";
    }
}
