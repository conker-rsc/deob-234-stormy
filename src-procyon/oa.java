final class oa
{
    static int[][] d;
    static String[] c;
    static String[] a;
    static int b;
    
    static final int a(String arg0, final byte arg1, final byte[] arg2) {
        final int a = d.a(0, (byte)48, arg2);
        int n = 0;
        arg0 = arg0.toUpperCase();
        for (int n2 = 0; arg0.length() > n2; ++n2) {
            n = arg0.charAt(n2) - ' ' + 61 * n;
        }
        int n3 = 2 + a * 10;
        if (arg1 != 68) {
            return 71;
        }
        for (int i = 0; i < a; ++i) {
            final int n4 = (arg2[5 + 10 * i] & 0xFF) + ((0xFF & arg2[4 + 10 * i]) * 256 + (0xFF & arg2[2 + 10 * i]) * 16777216 + 65536 * (arg2[10 * i + 3] & 0xFF));
            final int n5 = (arg2[10 * i + 11] & 0xFF) + 256 * (arg2[i * 10 + 10] & 0xFF) + (0xFF & arg2[9 + 10 * i]) * 65536;
            if (n == n4) {
                return n3;
            }
            n3 += n5;
        }
        return 0;
    }
    
    static {
        oa.c = new String[] { "Enter number of items to stake and press enter" };
    }
}
