/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class b {
    String B = "";
    private o z;
    private int g = 0;
    private int A = 0;
    int d = 0;
    static byte[] v;
    private int e = 0;
    private int m = 5000;
    private int E = 0;
    static int c;
    static int[] h;
    boolean k = false;
    ja f = new ja(this.m);
    private o j;
    static nb q;

    final void a(int arg0, boolean arg1) throws IOException {
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
            this.a(this.f.F, 0, this.E, (byte)-67);
        }
        this.f.w = 3;
        this.E = 0;
    }

    final void a(int arg0) throws IOException {
        block0: {
            this.b(21294);
            this.a(0, true);
            if (arg0 == -6924) break block0;
            this.j = null;
        }
    }

    int b(boolean arg0) throws IOException {
        if (!arg0) {
            this.g = 126;
        }
        return 0;
    }

    void a(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        block0: {
            if (arg3 == -67) break block0;
            this.a(81, 91);
        }
    }

    final int a(int arg0, int arg1) {
        if (arg0 != 507) {
            this.B = null;
        }
        return 0xFF & -this.j.c(arg0 - 635) + arg1;
    }

    private final int a(byte[] arg0, int arg1) {
        try {
            ++this.g;
            if (this.d > 0 && this.d < this.g) {
                this.k = true;
                this.B = "time-out";
                this.d += this.d;
                return 0;
            }
            if (this.A == arg1 && this.b((byte)-124) >= 2) {
                this.A = this.b(true);
                if (this.A >= 160) {
                    this.A = (this.A - 160) * 256 - -this.b(true);
                }
            }
            if (this.A > 0 && this.b((byte)-124) >= this.A) {
                if (this.A < 160) {
                    arg0[this.A - 1] = (byte)this.b(true);
                    if (this.A > 1) {
                        this.a(arg0, (byte)126, this.A - 1);
                    }
                } else {
                    this.a(arg0, (byte)64, this.A);
                }
                int n2 = this.A;
                this.g = 0;
                this.A = 0;
                return n2;
            }
        }
        catch (IOException iOException) {
            this.k = true;
            this.B = iOException.getMessage();
        }
        return 0;
    }

    int b(byte arg0) throws IOException {
        return 0;
    }

    private final void a(byte[] arg0, byte arg1, int arg2) throws IOException {
        if (arg1 < 51) {
            return;
        }
        this.a(arg0, arg2, 0, -112);
    }

    final boolean a(byte arg0) {
        return this.E > 0;
        {
        }
    }

    final void b(int arg0, int arg1) {
        if (this.E > 4 * this.m / 5) {
            try {
                this.a(0, true);
            }
            catch (IOException iOException) {
                this.k = true;
                this.B = iOException.getMessage();
            }
        }
        this.f.w = this.E + 2;
        if (arg1 != 0) {
            return;
        }
        this.f.c(arg0, 82);
    }

    final int a(int arg0, ja arg1) {
        arg1.w = arg0;
        return this.a(arg1.F, arg0 ^ 0);
    }

    void a(boolean arg0) {
        block0: {
            if (arg0) break block0;
            this.a(116, (ja)null);
        }
    }

    final void a(byte arg0, int[] arg1) {
        if (arg0 >= -68) {
            this.d = -84;
        }
        this.j = new o(arg1);
        this.z = new o(arg1);
    }

    void a(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
    }

    final void b(int arg0) {
        int n2;
        if (this.z != null) {
            n2 = 0xFF & this.f.F[this.E + 2];
            this.f.F[2 + this.E] = (byte)(this.z.c(-83) + n2);
        }
        if ((n2 = this.f.w + -this.E - 2) >= 160) {
            this.f.F[this.E] = (byte)(160 + n2 / 256);
            this.f.F[1 + this.E] = (byte)ib.a(n2, 255);
        } else {
            this.f.F[this.E] = (byte)n2;
            --this.f.w;
            this.f.F[1 + this.E] = this.f.F[this.f.w];
        }
        if (this.m <= 10000) {
            int n3;
            int n4 = n3 = this.f.F[this.E + 2] & 0xFF;
            ia.d[n4] = ia.d[n4] + 1;
            int n5 = n3;
            m.i[n5] = m.i[n5] + (-this.E + this.f.w);
        }
        if (arg0 != 21294) {
            c = -78;
        }
        this.E = this.f.w;
    }

    static final String a(int arg0, byte arg1, String arg2) {
        String string = "";
        if (arg1 != -5) {
            b.a(null, -63, 17);
        }
        for (int i2 = 0; i2 < arg0; ++i2) {
            if (i2 < arg2.length()) {
                char c2 = arg2.charAt(i2);
                if (c2 >= 'a' && c2 <= 'z') {
                    string = string + c2;
                    continue;
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    string = string + c2;
                    continue;
                }
                if (c2 >= '0' && c2 <= '9') {
                    string = string + c2;
                    continue;
                }
                string = string + '_';
                continue;
            }
            string = string + " ";
        }
        return string;
    }

    static final void a(tb arg0, int arg1, int arg2) {
        block3: {
            if (q != null) {
                try {
                    q.a(0L, arg1 ^ 0xFFFF9785);
                    q.a(24, -107, arg2, arg0.F);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (arg1 == 26628) break block3;
            v = null;
        }
    }

    protected b() {
        this.f.w = 3;
    }

    static {
        q = null;
        c = 0;
    }
}

