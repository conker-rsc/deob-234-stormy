final class ga
{
    static v c;
    static char[] a;
    static String[] b;
    
    static final String a(final int arg0, final int arg1, final int arg2, final byte[] arg3) {
        final char[] array = new char[arg0];
        int n = 0;
        for (int n2 = 0; arg0 > n2; ++n2) {
            int n3 = 0xFF & arg3[arg2 - -n2];
            if (n3 != 0) {
                if (n3 >= 128) {
                    if (n3 < 160) {
                        int n4 = nb.f[n3 - 128];
                        if (n4 == 0) {
                            n4 = 63;
                        }
                        n3 = n4;
                    }
                }
                array[n++] = (char)n3;
            }
        }
        return new String(array, 0, n);
    }
    
    static {
        ga.c = new v("WTQA", "office", "_qa", 2);
        ga.a = new char[] { ' ', ' ', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
    }
}
