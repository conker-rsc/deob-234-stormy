final class db
{
    static int[] j;
    static int d;
    static int[] l;
    static byte[] i;
    static i f;
    ib k;
    static int g;
    private ib b;
    
    final void a(final ib arg0, final boolean arg1) {
        if (arg0.e != null) {
            arg0.a(-27331);
        }
        arg0.e = this.k;
        arg0.a = this.k.a;
        arg0.e.a = arg0;
        arg0.a.e = arg0;
        if (arg1) {
            this.b((byte)78);
        }
    }
    
    final ib a(final byte arg0) {
        final ib a = this.k.a;
        if (this.k == a) {
            return this.b = null;
        }
        this.b = a.a;
        return a;
    }
    
    final ib b(final byte arg0) {
        final ib b = this.b;
        if (this.k != b) {
            this.b = b.a;
            return b;
        }
        return this.b = null;
    }
    
    public db() {
        super();
        this.k = new ib();
        this.k.e = this.k;
        this.k.a = this.k;
    }
    
    static final boolean a(final int arg0, final char arg1) {
        return arg0 == 32 && (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-');
    }
    
    static {
        db.g = 0;
    }
}
