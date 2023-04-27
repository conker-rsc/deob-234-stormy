import java.awt.*;

class sa
{
    static int t;
    private static eb n;
    private long u;
    int[] j;
    private static int o;
    static boolean i;
    private boolean b;
    private int r;
    private va a;
    private int g;
    private int q;
    private int c;
    private int k;
    private va[] s;
    private long e;
    private int p;
    private int m;
    private va[] d;
    private long f;
    private int h;
    private boolean l;
    
    int b() throws Exception {
        return this.k;
    }
    
    void b(final int arg0) throws Exception {
    }
    
    void c() throws Exception {
    }
    
    final synchronized void d() {
        if (sa.n != null) {
            boolean b = true;
            for (int i = 0; i < 2; ++i) {
                if (sa.n.f[i] == this) {
                    sa.n.f[i] = null;
                }
                if (sa.n.f[i] != null) {
                    b = false;
                }
            }
            if (b) {
                sa.n.a = true;
                while (sa.n.i) {
                    mb.a(11200, 50L);
                }
                sa.n = null;
            }
        }
        this.e();
        this.j = null;
        this.b = true;
    }
    
    void e() {
    }
    
    private final void a(final va arg0, final int arg1) {
        final int n = arg1 >> 5;
        final va va = this.s[n];
        if (va == null) {
            this.d[n] = arg0;
        }
        else {
            va.j = arg0;
        }
        this.s[n] = arg0;
        arg0.i = arg1;
    }
    
    static final sa a(final c arg0, final Component arg1, final int arg2, int arg3) {
        if (sa.t == 0) {
            throw new IllegalStateException();
        }
        if (arg2 < 0 || arg2 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg3 < 256) {
            arg3 = 256;
        }
        try {
            final pb pb = new pb();
            pb.j = new int[256 * (sa.i ? 2 : 1)];
            pb.q = arg3;
            pb.a(arg1);
            pb.k = (arg3 & 0xFFFFFC00) + 1024;
            if (pb.k > 16384) {
                pb.k = 16384;
            }
            pb.b(pb.k);
            if (sa.o > 0 && sa.n == null) {
                sa.n = new eb();
                (sa.n.g = arg0).a(true, sa.n, sa.o);
            }
            if (sa.n != null) {
                if (sa.n.f[arg2] != null) {
                    throw new IllegalArgumentException();
                }
                sa.n.f[arg2] = pb;
            }
            return pb;
        }
        catch (final Throwable t) {
            return new sa();
        }
    }
    
    final synchronized void a() {
        if (this.b) {
            return;
        }
        long u = p.a(0);
        try {
            if (u > this.u + 6000L) {
                this.u = u - 6000L;
            }
            while (u > this.u + 5000L) {
                this.a(256);
                this.u += 256000 / sa.t;
                u = p.a(0);
            }
        }
        catch (final Exception ex) {
            this.u = u;
        }
        if (this.j == null) {
            return;
        }
        try {
            if (this.e != 0L) {
                if (u < this.e) {
                    return;
                }
                this.b(this.k);
                this.e = 0L;
                this.l = true;
            }
            int i = this.b();
            if (this.h - i > this.m) {
                this.m = this.h - i;
            }
            int n = this.q + this.g;
            if (n + 256 > 16384) {
                n = 16128;
            }
            if (n + 256 > this.k) {
                this.k += 1024;
                if (this.k > 16384) {
                    this.k = 16384;
                }
                this.e();
                this.b(this.k);
                i = 0;
                this.l = true;
                if (n + 256 > this.k) {
                    n = this.k - 256;
                    this.g = n - this.q;
                }
            }
            while (i < n) {
                this.a(this.j, 256);
                this.c();
                i += 256;
            }
            if (u > this.f) {
                if (!this.l) {
                    if (this.m == 0 && this.c == 0) {
                        this.e();
                        this.e = u + 2000L;
                        return;
                    }
                    this.g = Math.min(this.c, this.m);
                    this.c = this.m;
                }
                else {
                    this.l = false;
                }
                this.m = 0;
                this.f = u + 2000L;
            }
            this.h = i;
        }
        catch (final Exception ex2) {
            this.e();
            this.e = u + 2000L;
        }
    }
    
    final synchronized void a(final va arg0) {
        this.a = arg0;
    }
    
    static final void a(final int arg0, final boolean arg1, final int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        sa.t = arg0;
        sa.i = arg1;
        sa.o = arg2;
    }
    
    private final void a(final int[] arg0, final int arg1) {
        int arg2 = arg1;
        if (sa.i) {
            arg2 <<= 1;
        }
        ab.a(arg0, 0, arg2);
        this.p -= arg1;
        if (this.a != null && this.p <= 0) {
            this.p += sa.t >> 4;
            b(this.a);
            this.a(this.a, this.a.c());
            int n = 0;
            int i = 255;
            int n2 = 7;
        Label_0403:
            while (i != 0) {
                int n3;
                int n4;
                if (n2 < 0) {
                    n3 = (n2 & 0x3);
                    n4 = -(n2 >> 2);
                }
                else {
                    n3 = n2;
                    n4 = 0;
                }
                for (int j = i >>> n3 & 0x11111111; j != 0; j >>>= 4) {
                    if ((j & 0x1) != 0x0) {
                        i &= ~(1 << n3);
                        va va = null;
                        va k = this.d[n3];
                        while (k != null) {
                            final bb h = k.h;
                            if (h != null && h.g > n4) {
                                i |= 1 << n3;
                                va = k;
                                k = k.j;
                            }
                            else {
                                k.g = true;
                                final int d = k.d();
                                n += d;
                                if (h != null) {
                                    final bb bb = h;
                                    bb.g += d;
                                }
                                if (n >= this.r) {
                                    break Label_0403;
                                }
                                va arg3 = k.b();
                                if (arg3 != null) {
                                    final int l = k.i;
                                    while (arg3 != null) {
                                        this.a(arg3, l * arg3.c() >> 8);
                                        arg3 = k.a();
                                    }
                                }
                                final va m = k.j;
                                k.j = null;
                                if (va == null) {
                                    this.d[n3] = m;
                                }
                                else {
                                    va.j = m;
                                }
                                if (m == null) {
                                    this.s[n3] = va;
                                }
                                k = m;
                            }
                        }
                    }
                    n3 += 4;
                    ++n4;
                }
                --n2;
            }
            for (int n5 = 0; n5 < 8; ++n5) {
                va va2 = this.d[n5];
                this.d[n5] = (this.s[n5] = null);
                while (va2 != null) {
                    final va j2 = va2.j;
                    va2.j = null;
                    va2 = j2;
                }
            }
        }
        if (this.p < 0) {
            this.p = 0;
        }
        if (this.a != null) {
            this.a.b(arg0, 0, arg1);
        }
        this.u = p.a(0);
    }
    
    private final void a(final int arg0) {
        this.p -= arg0;
        if (this.p < 0) {
            this.p = 0;
        }
        if (this.a != null) {
            this.a.b(arg0);
        }
    }
    
    private static final void b(final va arg0) {
        arg0.g = false;
        if (arg0.h != null) {
            arg0.h.g = 0;
        }
        for (va arg = arg0.b(); arg != null; arg = arg0.a()) {
            b(arg);
        }
    }
    
    void a(final Component arg0) throws Exception {
    }
    
    sa() {
        super();
        this.b = false;
        this.r = 32;
        this.u = p.a(0);
        this.s = new va[8];
        this.c = 0;
        this.m = 0;
        this.e = 0L;
        this.p = 0;
        this.d = new va[8];
        this.f = 0L;
        this.h = 0;
        this.l = true;
    }
}
