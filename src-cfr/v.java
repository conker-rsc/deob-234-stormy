/*
 * Decompiled with CFR 0.152.
 */
final class v {
    int i;
    static int[] a;
    static int h;
    static int[] g;
    static int[] e;

    static final byte[] a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -98) {
            a = null;
        }
        byte[] byArray = new byte[arg1];
        for (int i2 = 0; i2 < arg1; ++i2) {
            byArray[i2] = qa.l[ib.a(arg0[arg3 + i2], 255)];
        }
        return byArray;
    }

    static final int a(int arg0) {
        int n2 = b.v[ka.b] & 0xFF;
        ++ka.b;
        if (arg0 != -30504) {
            v.a(113);
        }
        return n2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static final boolean a(char arg0, int arg1) {
        if (arg1 <= 111) {
            v.a(null, 51, 127, 27);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    v(String arg0, String arg1, String arg2, int arg3) {
        this.i = arg3;
    }
}

