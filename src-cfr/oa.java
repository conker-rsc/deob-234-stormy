/*
 * Decompiled with CFR 0.152.
 */
final class oa {
    static int[][] d;
    static String[] c;
    static String[] a;
    static int b;

    static final int a(String arg0, byte arg1, byte[] arg2) {
        int n2;
        int n3 = d.a(0, (byte)48, arg2);
        int n4 = 0;
        arg0 = arg0.toUpperCase();
        for (n2 = 0; arg0.length() > n2; ++n2) {
            n4 = arg0.charAt(n2) - 32 + 61 * n4;
        }
        n2 = 2 + n3 * 10;
        if (arg1 != 68) {
            return 71;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = (arg2[5 + 10 * i2] & 0xFF) + ((0xFF & arg2[4 + 10 * i2]) * 256 + (0xFF & arg2[2 + 10 * i2]) * 0x1000000 + 65536 * (arg2[10 * i2 + 3] & 0xFF));
            int n6 = (arg2[10 * i2 + 11] & 0xFF) + 256 * (arg2[i2 * 10 + 10] & 0xFF) + (0xFF & arg2[9 + 10 * i2]) * 65536;
            if (n4 == n5) {
                return n2;
            }
            n2 += n6;
        }
        return 0;
    }

    static {
        c = new String[]{"Enter number of items to stake and press enter"};
    }
}

