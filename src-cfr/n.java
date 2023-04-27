/*
 * Decompiled with CFR 0.152.
 */
final class n {
    int e;
    static int[] a;
    int k;
    static nb h;
    static String[] f;
    int d;
    int l;
    static int[] j;
    static int g;
    static int[] m;
    static int c;
    static int b;

    static final void a(byte arg0, String arg1) {
        if (arg0 != -93) {
            f = null;
        }
        System.out.println("Error: " + jb.a(true, "\n", "%0a", arg1));
    }

    n() {
    }

    static {
        h = null;
        f = new String[]{"Enter number of items to remove and press enter"};
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        a = new int[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2 = string.indexOf(i2);
            if (n2 == -1) {
                n2 = 74;
            }
            n.a[i2] = 9 * n2;
        }
        g = 0;
        j = new int[100];
        c = 0;
        b = 0;
    }
}

