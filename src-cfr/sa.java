/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;

class sa {
    static int t;
    private static eb n;
    private long u = p.a(0);
    int[] j;
    private static int o;
    static boolean i;
    private boolean b = false;
    private int r = 32;
    private va a;
    private int g;
    private int q;
    private int c = 0;
    private int k;
    private va[] s = new va[8];
    private long e = 0L;
    private int p = 0;
    private int m = 0;
    private va[] d = new va[8];
    private long f = 0L;
    private int h = 0;
    private boolean l = true;

    int b() throws Exception {
        return this.k;
    }

    void b(int arg0) throws Exception {
    }

    void c() throws Exception {
    }

    final synchronized void d() {
        if (n != null) {
            boolean bl = true;
            for (int i2 = 0; i2 < 2; ++i2) {
                if (sa.n.f[i2] == this) {
                    sa.n.f[i2] = null;
                }
                if (sa.n.f[i2] == null) continue;
                bl = false;
            }
            if (bl) {
                sa.n.a = true;
                while (sa.n.i) {
                    mb.a(11200, 50L);
                }
                n = null;
            }
        }
        this.e();
        this.j = null;
        this.b = true;
    }

    void e() {
    }

    private final void a(va arg0, int arg1) {
        int n2 = arg1 >> 5;
        va va2 = this.s[n2];
        if (va2 == null) {
            this.d[n2] = arg0;
        } else {
            va2.j = arg0;
        }
        this.s[n2] = arg0;
        arg0.i = arg1;
    }

    static final sa a(c arg0, Component arg1, int arg2, int arg3) {
        if (t == 0) {
            throw new IllegalStateException();
        }
        if (arg2 < 0 || arg2 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg3 < 256) {
            arg3 = 256;
        }
        try {
            pb pb2 = new pb();
            pb2.j = new int[256 * (i ? 2 : 1)];
            pb2.q = arg3;
            ((sa)pb2).a(arg1);
            pb2.k = (arg3 & 0xFFFFFC00) + 1024;
            if (pb2.k > 16384) {
                pb2.k = 16384;
            }
            ((sa)pb2).b(pb2.k);
            if (o > 0 && n == null) {
                n = new eb();
                sa.n.g = arg0;
                arg0.a(true, n, o);
            }
            if (n != null) {
                if (sa.n.f[arg2] != null) {
                    throw new IllegalArgumentException();
                }
                sa.n.f[arg2] = pb2;
            }
            return pb2;
        }
        catch (Throwable throwable) {
            return new sa();
        }
    }

    final synchronized void a() {
        if (this.b) {
            return;
        }
        long l2 = p.a(0);
        try {
            if (l2 > this.u + 6000L) {
                this.u = l2 - 6000L;
            }
            while (l2 > this.u + 5000L) {
                this.a(256);
                this.u += (long)(256000 / t);
                l2 = p.a(0);
            }
        }
        catch (Exception exception) {
            this.u = l2;
        }
        if (this.j == null) {
            return;
        }
        try {
            int n2;
            int n3;
            if (this.e != 0L) {
                if (l2 < this.e) {
                    return;
                }
                this.b(this.k);
                this.e = 0L;
                this.l = true;
            }
            if (this.h - (n3 = this.b()) > this.m) {
                this.m = this.h - n3;
            }
            if ((n2 = this.q + this.g) + 256 > 16384) {
                n2 = 16128;
            }
            if (n2 + 256 > this.k) {
                this.k += 1024;
                if (this.k > 16384) {
                    this.k = 16384;
                }
                this.e();
                this.b(this.k);
                n3 = 0;
                this.l = true;
                if (n2 + 256 > this.k) {
                    n2 = this.k - 256;
                    this.g = n2 - this.q;
                }
            }
            while (n3 < n2) {
                this.a(this.j, 256);
                this.c();
                n3 += 256;
            }
            if (l2 > this.f) {
                if (!this.l) {
                    if (this.m == 0 && this.c == 0) {
                        this.e();
                        this.e = l2 + 2000L;
                        return;
                    }
                    this.g = Math.min(this.c, this.m);
                    this.c = this.m;
                } else {
                    this.l = false;
                }
                this.m = 0;
                this.f = l2 + 2000L;
            }
            this.h = n3;
        }
        catch (Exception exception) {
            this.e();
            this.e = l2 + 2000L;
        }
    }

    final synchronized void a(va arg0) {
        this.a = arg0;
    }

    static final void a(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        t = arg0;
        i = arg1;
        o = arg2;
    }

    private final void a(int[] arg0, int arg1) {
        int n2 = arg1;
        if (i) {
            n2 <<= 1;
        }
        ab.a(arg0, 0, n2);
        this.p -= arg1;
        if (this.a != null && this.p <= 0) {
            va va2;
            int n3;
            this.p += t >> 4;
            sa.b(this.a);
            this.a(this.a, this.a.c());
            int n4 = 0;
            int n5 = 255;
            int n6 = 7;
            block0: while (n5 != 0) {
                int n7;
                int n8;
                if (n6 < 0) {
                    n8 = n6 & 3;
                    n7 = -(n6 >> 2);
                } else {
                    n8 = n6;
                    n7 = 0;
                }
                for (n3 = n5 >>> n8 & 0x11111111; n3 != 0; n3 >>>= 4) {
                    if ((n3 & 1) != 0) {
                        n5 &= ~(1 << n8);
                        va2 = null;
                        va va3 = this.d[n8];
                        while (va3 != null) {
                            bb bb2 = va3.h;
                            if (bb2 != null && bb2.g > n7) {
                                n5 |= 1 << n8;
                                va2 = va3;
                                va3 = va3.j;
                                continue;
                            }
                            va3.g = true;
                            int n9 = va3.d();
                            n4 += n9;
                            if (bb2 != null) {
                                bb2.g += n9;
                            }
                            if (n4 >= this.r) break block0;
                            va va4 = va3.b();
                            if (va4 != null) {
                                int n10 = va3.i;
                                while (va4 != null) {
                                    this.a(va4, n10 * va4.c() >> 8);
                                    va4 = va3.a();
                                }
                            }
                            va va5 = va3.j;
                            va3.j = null;
                            if (va2 == null) {
                                this.d[n8] = va5;
                            } else {
                                va2.j = va5;
                            }
                            if (va5 == null) {
                                this.s[n8] = va2;
                            }
                            va3 = va5;
                        }
                    }
                    n8 += 4;
                    ++n7;
                }
                --n6;
            }
            for (n6 = 0; n6 < 8; ++n6) {
                va va6 = this.d[n6];
                va[] vaArray = this.d;
                n3 = n6;
                this.s[n6] = null;
                vaArray[n3] = null;
                while (va6 != null) {
                    va2 = va6.j;
                    va6.j = null;
                    va6 = va2;
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

    private final void a(int arg0) {
        this.p -= arg0;
        if (this.p < 0) {
            this.p = 0;
        }
        if (this.a != null) {
            this.a.b(arg0);
        }
    }

    private static final void b(va arg0) {
        arg0.g = false;
        if (arg0.h != null) {
            arg0.h.g = 0;
        }
        va va2 = arg0.b();
        while (va2 != null) {
            sa.b(va2);
            va2 = arg0.a();
        }
    }

    void a(Component arg0) throws Exception {
    }

    sa() {
    }
}

