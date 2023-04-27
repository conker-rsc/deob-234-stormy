final class w
{
    int l;
    int r;
    int m;
    int p;
    int b;
    int j;
    boolean c;
    int q;
    int i;
    int e;
    int k;
    int t;
    int s;
    static int[] g;
    int f;
    int h;
    int u;
    ca o;
    
    static final String a(final CharSequence arg0, final byte arg1) {
        if (arg1 <= 47) {
            return null;
        }
        if (arg0 == null) {
            return null;
        }
        int n;
        int i;
        for (n = 0, i = arg0.length(); n < i && db.a(32, arg0.charAt(n)); ++n) {}
        while (i > n && db.a(32, arg0.charAt(i - 1))) {
            --i;
        }
        final int n2 = i - n;
        if (n2 < 1 || n2 > 12) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(n2);
        for (int n3 = n; i > n3; ++n3) {
            final char char1 = arg0.charAt(n3);
            if (f.a(char1, 0)) {
                final char a = ac.a(char1, -194);
                if (a != '\0') {
                    sb.append(a);
                }
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }
    
    static final int a(final int arg0, final int arg1, final byte[] arg2, final int arg3) {
        int n = -1;
        for (int n2 = arg3; arg0 > n2; ++n2) {
            n = (wb.q[(arg2[n2] ^ n) & 0xFF] ^ n >>> 8);
        }
        return ~n;
    }
    
    static final int a(final byte[] arg0, final int arg1, final int arg2) {
        if (arg1 != -1) {
            return 71;
        }
        int n = 256 * nb.a(255, arg0[arg2]) + nb.a(255, arg0[1 + arg2]);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    w() {
        super();
        this.c = false;
        this.p = -1;
        this.f = 0;
    }
}
