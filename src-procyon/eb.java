final class eb implements Runnable
{
    volatile boolean a;
    volatile sa[] f;
    c g;
    volatile boolean i;
    static i e;
    static v d;
    static int[] b;
    private static char[] c;
    
    @Override
    public final void run() {
        this.i = true;
        try {
            while (!this.a) {
                for (int i = 0; i < 2; ++i) {
                    final sa sa = this.f[i];
                    if (sa != null) {
                        sa.a();
                    }
                }
                mb.a(11200, 10L);
                ba.a(null, 1, this.g);
            }
        }
        catch (final Exception arg1) {
            mb.a(2097151, arg1, null);
        }
        finally {
            this.i = false;
        }
    }
    
    eb() {
        super();
        this.f = new sa[2];
        this.a = false;
        this.i = false;
    }
    
    static {
        eb.e = new i("LIVE", 0);
        eb.d = new v("WTI", "office", "_wti", 5);
        eb.c = new char[256];
        for (int i = 0; i < 256; ++i) {
            eb.c[i] = (char)i;
        }
        eb.c[45] = '-';
        eb.c[59] = ';';
        eb.c[42] = '*';
        eb.c[124] = '|';
        eb.c[43] = '+';
        eb.c[33] = '!';
        eb.c[34] = '\"';
        eb.c[47] = '/';
        eb.c[46] = '.';
        eb.c[61] = '=';
        eb.c[92] = '\\';
        eb.c[44] = ',';
    }
}
