/*
 * Decompiled with CFR 0.152.
 */
final class w {
    int l;
    int r;
    int m;
    int p = -1;
    int b;
    int j;
    boolean c = false;
    int q;
    int i;
    int e;
    int k;
    int t;
    int s;
    static int[] g;
    int f = 0;
    int h;
    int u;
    ca o;

    static final String a(CharSequence arg0, byte arg1) {
        int n2;
        if (arg1 <= 47) {
            return null;
        }
        if (arg0 == null) {
            return null;
        }
        int n3 = arg0.length();
        for (n2 = 0; n2 < n3 && db.a(32, arg0.charAt(n2)); ++n2) {
        }
        while (n3 > n2 && db.a(32, arg0.charAt(n3 - 1))) {
            --n3;
        }
        int n4 = n3 - n2;
        if (n4 < 1 || n4 > 12) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(n4);
        for (int i2 = n2; n3 > i2; ++i2) {
            char c2;
            char c3 = arg0.charAt(i2);
            if (!f.a(c3, 0) || (c2 = ac.a(c3, -194)) == '\u0000') continue;
            stringBuilder.append(c2);
        }
        if (stringBuilder.length() == 0) {
            return null;
        }
        return stringBuilder.toString();
    }

    static final int a(int arg0, int arg1, byte[] arg2, int arg3) {
        int n2 = -1;
        for (int i2 = arg3; arg0 > i2; ++i2) {
            n2 = wb.q[(arg2[i2] ^ n2) & 0xFF] ^ n2 >>> 8;
        }
        return n2 ^= 0xFFFFFFFF;
    }

    static final int a(byte[] arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return 71;
        }
        int n2 = 256 * nb.a(255, arg0[arg2]) + nb.a(255, arg0[1 + arg2]);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    w() {
    }
}

