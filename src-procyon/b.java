import java.io.*;

class b
{
    String B;
    private o z;
    private int g;
    private int A;
    int d;
    static byte[] v;
    private int e;
    private int m;
    private int E;
    static int c;
    static int[] h;
    boolean k;
    ja f;
    private o j;
    static nb q;
    
    final void a(final int arg0, final boolean arg1) throws IOException {
        if (!arg1) {
            this.a(true);
        }
        if (this.k) {
            this.f.w = 3;
            this.E = 0;
            this.k = false;
            throw new IOException(this.B);
        }
        ++this.e;
        if (arg0 > this.e) {
            return;
        }
        if (this.E > 0) {
            this.e = 0;
            this.a(this.f.F, 0, this.E, (byte)(-67));
        }
        this.f.w = 3;
        this.E = 0;
    }
    
    final void a(final int arg0) throws IOException {
        this.b(21294);
        this.a(0, true);
        if (arg0 != -6924) {
            this.j = null;
        }
    }
    
    int b(final boolean arg0) throws IOException {
        if (!arg0) {
            this.g = 126;
        }
        return 0;
    }
    
    void a(final byte[] arg0, final int arg1, final int arg2, final byte arg3) throws IOException {
        if (arg3 != -67) {
            this.a(81, 91);
        }
    }
    
    final int a(final int arg0, final int arg1) {
        if (arg0 != 507) {
            this.B = null;
        }
        return 0xFF & -this.j.c(arg0 - 635) + arg1;
    }
    
    private final int a(final byte[] arg0, final int arg1) {
        try {
            ++this.g;
            if (this.d > 0 && this.d < this.g) {
                this.k = true;
                this.B = "time-out";
                this.d += this.d;
                return 0;
            }
            if (this.A == arg1) {
                if (this.b((byte)(-124)) >= 2) {
                    this.A = this.b(true);
                    if (this.A >= 160) {
                        this.A = (this.A - 160) * 256 - -this.b(true);
                    }
                }
            }
            if (this.A > 0) {
                if (this.b((byte)(-124)) >= this.A) {
                    if (this.A < 160) {
                        arg0[this.A - 1] = (byte)this.b(true);
                        if (this.A > 1) {
                            this.a(arg0, (byte)126, this.A - 1);
                        }
                    }
                    else {
                        this.a(arg0, (byte)64, this.A);
                    }
                    final int a = this.A;
                    this.g = 0;
                    this.A = 0;
                    return a;
                }
            }
        }
        catch (final IOException ex) {
            this.k = true;
            this.B = ex.getMessage();
        }
        return 0;
    }
    
    int b(final byte arg0) throws IOException {
        return 0;
    }
    
    private final void a(final byte[] arg0, final byte arg1, final int arg2) throws IOException {
        if (arg1 < 51) {
            return;
        }
        this.a(arg0, arg2, 0, -112);
    }
    
    final boolean a(final byte arg0) {
        return this.E > 0;
    }
    
    final void b(final int arg0, final int arg1) {
        if (this.E > 4 * this.m / 5) {
            try {
                this.a(0, true);
            }
            catch (final IOException ex) {
                this.k = true;
                this.B = ex.getMessage();
            }
        }
        this.f.w = this.E + 2;
        if (arg1 != 0) {
            return;
        }
        this.f.c(arg0, 82);
    }
    
    final int a(final int arg0, final ja arg1) {
        arg1.w = arg0;
        return this.a(arg1.F, arg0 ^ 0x0);
    }
    
    void a(final boolean arg0) {
        if (!arg0) {
            this.a(116, null);
        }
    }
    
    final void a(final byte arg0, final int[] arg1) {
        if (arg0 >= -68) {
            this.d = -84;
        }
        this.j = new o(arg1);
        this.z = new o(arg1);
    }
    
    void a(final byte[] arg0, final int arg1, final int arg2, final int arg3) throws IOException {
    }
    
    final void b(final int arg0) {
        if (this.z != null) {
            this.f.F[2 + this.E] = (byte)(this.z.c(-83) + (0xFF & this.f.F[this.E + 2]));
        }
        final int arg = this.f.w + -this.E - 2;
        if (arg >= 160) {
            this.f.F[this.E] = (byte)(160 + arg / 256);
            this.f.F[1 + this.E] = (byte)ib.a(arg, 255);
        }
        else {
            this.f.F[this.E] = (byte)arg;
            final ja f = this.f;
            --f.w;
            this.f.F[1 + this.E] = this.f.F[this.f.w];
        }
        if (this.m <= 10000) {
            final int n = this.f.F[this.E + 2] & 0xFF;
            final int[] d = ia.d;
            final int n2 = n;
            ++d[n2];
            final int[] i = m.i;
            final int n3 = n;
            i[n3] += -this.E + this.f.w;
        }
        if (arg0 != 21294) {
            b.c = -78;
        }
        this.E = this.f.w;
    }
    
    static final String a(final int arg0, final byte arg1, final String arg2) {
        String s = "";
        if (arg1 != -5) {
            a(null, -63, 17);
        }
        for (int i = 0; i < arg0; ++i) {
            if (i < arg2.length()) {
                final char char1 = arg2.charAt(i);
                if (char1 >= 'a' && char1 <= 'z') {
                    s += char1;
                }
                else if (char1 >= 'A' && char1 <= 'Z') {
                    s += char1;
                }
                else if (char1 >= '0' && char1 <= '9') {
                    s += char1;
                }
                else {
                    s += '_';
                }
            }
            else {
                s += " ";
            }
        }
        return s;
    }
    
    static final void a(final tb arg0, final int arg1, final int arg2) {
        if (b.q != null) {
            try {
                b.q.a(0L, arg1 ^ 0xFFFF9785);
                b.q.a(24, -107, arg2, arg0.F);
            }
            catch (final Exception ex) {}
        }
        if (arg1 != 26628) {
            b.v = null;
        }
    }
    
    protected b() {
        super();
        this.d = 0;
        this.B = "";
        this.e = 0;
        this.m = 5000;
        this.k = false;
        this.A = 0;
        this.E = 0;
        this.g = 0;
        this.f = new ja(this.m);
        this.f.w = 3;
    }
    
    static {
        b.q = null;
        b.c = 0;
    }
}
