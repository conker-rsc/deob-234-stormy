final class v
{
    int i;
    static int[] a;
    static int h;
    static int[] g;
    static int[] e;
    
    static final byte[] a(final byte[] arg0, final int arg1, final int arg2, final int arg3) {
        if (arg2 != -98) {
            v.a = null;
        }
        final byte[] array = new byte[arg1];
        for (int i = 0; i < arg1; ++i) {
            array[i] = qa.l[ib.a(arg0[arg3 + i], 255)];
        }
        return array;
    }
    
    static final int a(final int arg0) {
        final int n = b.v[ka.b] & 0xFF;
        ++ka.b;
        if (arg0 != -30504) {
            a(113);
        }
        return n;
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final boolean a(final char arg0, final int arg1) {
        if (arg1 <= 111) {
            a(null, 51, 127, 27);
        }
        return (arg0 >= '0' && arg0 <= '9') || (arg0 >= 'A' && arg0 <= 'Z') || (arg0 >= 'a' && arg0 <= 'z');
    }
    
    v(final String arg0, final String arg1, final String arg2, final int arg3) {
        super();
        this.i = arg3;
    }
}
