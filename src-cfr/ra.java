/*
 * Decompiled with CFR 0.152.
 */
final class ra
extends va {
    private db n = new db();
    private db l = new db();
    private int m = 0;
    private int k = -1;

    @Override
    final va b() {
        return (va)this.n.a((byte)35);
    }

    final void a(vb arg0, int arg1, int arg2) {
        this.a(sb.a(arg0, arg1, arg2));
    }

    private final void e() {
        if (this.m > 0) {
            hb hb2 = (hb)this.l.a((byte)-87);
            while (hb2 != null) {
                hb2.g -= this.m;
                hb2 = (hb)this.l.b((byte)111);
            }
            this.k -= this.m;
            this.m = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    final synchronized void b(int[] arg0, int arg1, int arg2) {
        do {
            hb hb2;
            if (this.k < 0) {
                this.c(arg0, arg1, arg2);
                return;
            }
            if (this.m + arg2 < this.k) {
                this.m += arg2;
                this.c(arg0, arg1, arg2);
                return;
            }
            int n2 = this.k - this.m;
            this.c(arg0, arg1, n2);
            arg1 += n2;
            arg2 -= n2;
            this.m += n2;
            this.e();
            hb hb3 = hb2 = (hb)this.l.a((byte)106);
            synchronized (hb3) {
                int n3 = hb2.a(this);
                if (n3 < 0) {
                    hb2.g = 0;
                    this.a(hb2);
                } else {
                    hb2.g = n3;
                    this.a(hb2.a, hb2);
                }
            }
        } while (arg2 != 0);
    }

    private final void a(ib arg0, hb arg1) {
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    final synchronized void b(int arg0) {
        do {
            hb hb2;
            if (this.k < 0) {
                this.c(arg0);
                return;
            }
            if (this.m + arg0 < this.k) {
                this.m += arg0;
                this.c(arg0);
                return;
            }
            int n2 = this.k - this.m;
            this.c(n2);
            arg0 -= n2;
            this.m += n2;
            this.e();
            hb hb3 = hb2 = (hb)this.l.a((byte)-80);
            synchronized (hb3) {
                int n3 = hb2.a(this);
                if (n3 < 0) {
                    hb2.g = 0;
                    this.a(hb2);
                } else {
                    hb2.g = n3;
                    this.a(hb2.a, hb2);
                }
            }
        } while (arg0 != 0);
    }

    private final void c(int[] arg0, int arg1, int arg2) {
        va va2 = (va)this.n.a((byte)-88);
        while (va2 != null) {
            va2.a(arg0, arg1, arg2);
            va2 = (va)this.n.b((byte)122);
        }
    }

    @Override
    final va a() {
        return (va)this.n.b((byte)115);
    }

    private final synchronized void a(va arg0) {
        this.n.a(arg0, false);
    }

    private final void a(hb arg0) {
        arg0.a(-27331);
        arg0.a();
        ib ib2 = this.l.k.a;
        this.k = ib2 == this.l.k ? -1 : ((hb)ib2).g;
    }

    private final void c(int arg0) {
        va va2 = (va)this.n.a((byte)-123);
        while (va2 != null) {
            va2.b(arg0);
            va2 = (va)this.n.b((byte)80);
        }
    }
}

