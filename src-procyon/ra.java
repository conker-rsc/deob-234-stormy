final class ra extends va
{
    private db n;
    private db l;
    private int m;
    private int k;
    
    @Override
    final va b() {
        return (va)this.n.a((byte)35);
    }
    
    final void a(final vb arg0, final int arg1, final int arg2) {
        this.a(sb.a(arg0, arg1, arg2));
    }
    
    private final void e() {
        if (this.m > 0) {
            for (hb hb = (hb)this.l.a((byte)(-87)); hb != null; hb = (hb)this.l.b((byte)111)) {
                final hb hb2 = hb;
                hb2.g -= this.m;
            }
            this.k -= this.m;
            this.m = 0;
        }
    }
    
    @Override
    final synchronized void b(final int[] arg0, int arg1, int arg2) {
        while (this.k >= 0) {
            if (this.m + arg2 < this.k) {
                this.m += arg2;
                this.c(arg0, arg1, arg2);
                return;
            }
            final int arg3 = this.k - this.m;
            this.c(arg0, arg1, arg3);
            arg1 += arg3;
            arg2 -= arg3;
            this.m += arg3;
            this.e();
            final hb hb = (hb)this.l.a((byte)106);
            synchronized (hb) {
                final int a = hb.a(this);
                if (a < 0) {
                    hb.g = 0;
                    this.a(hb);
                }
                else {
                    hb.g = a;
                    this.a(hb.a, hb);
                }
            }
            if (arg2 == 0) {
                return;
            }
        }
        this.c(arg0, arg1, arg2);
    }
    
    private final void a(ib arg0, final hb arg1) {
        while (arg0 != this.l.k && ((hb)arg0).g <= arg1.g) {
            arg0 = arg0.a;
        }
        ac.a(arg1, (byte)34, arg0);
        this.k = ((hb)this.l.k.a).g;
    }
    
    @Override
    final int d() {
        return 0;
    }
    
    @Override
    final synchronized void b(int arg0) {
        while (this.k >= 0) {
            if (this.m + arg0 < this.k) {
                this.m += arg0;
                this.c(arg0);
                return;
            }
            final int arg = this.k - this.m;
            this.c(arg);
            arg0 -= arg;
            this.m += arg;
            this.e();
            final hb hb = (hb)this.l.a((byte)(-80));
            synchronized (hb) {
                final int a = hb.a(this);
                if (a < 0) {
                    hb.g = 0;
                    this.a(hb);
                }
                else {
                    hb.g = a;
                    this.a(hb.a, hb);
                }
            }
            if (arg0 == 0) {
                return;
            }
        }
        this.c(arg0);
    }
    
    private final void c(final int[] arg0, final int arg1, final int arg2) {
        for (va va = (va)this.n.a((byte)(-88)); va != null; va = (va)this.n.b((byte)122)) {
            va.a(arg0, arg1, arg2);
        }
    }
    
    @Override
    final va a() {
        return (va)this.n.b((byte)115);
    }
    
    private final synchronized void a(final va arg0) {
        this.n.a(arg0, false);
    }
    
    private final void a(final hb arg0) {
        arg0.a(-27331);
        arg0.a();
        final ib a = this.l.k.a;
        if (a == this.l.k) {
            this.k = -1;
        }
        else {
            this.k = ((hb)a).g;
        }
    }
    
    private final void c(final int arg0) {
        for (va va = (va)this.n.a((byte)(-123)); va != null; va = (va)this.n.b((byte)80)) {
            va.b(arg0);
        }
    }
    
    public ra() {
        super();
        this.n = new db();
        this.l = new db();
        this.m = 0;
        this.k = -1;
    }
}
