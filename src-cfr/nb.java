/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

final class nb {
    private byte[] n;
    private long h = -1L;
    private long l;
    static int g = 0;
    private byte[] a;
    private long x;
    private d b;
    static int[] d;
    private int t;
    private int i = 0;
    static int y;
    static String[] u;
    static URL s;
    static char[] f;
    private long o;
    private long A;
    private long j = -1L;
    static int q;

    private final void a(int arg0) throws IOException {
        block10: {
            if (this.h != -1L) {
                if ((this.x ^ 0xFFFFFFFFFFFFFFFFL) != (this.h ^ 0xFFFFFFFFFFFFFFFFL)) {
                    this.b.a(0, this.h);
                    this.x = this.h;
                }
                this.b.b(this.a, this.i, 1, 0);
                this.x += (long)this.i;
                if ((this.A ^ 0xFFFFFFFFFFFFFFFFL) > (this.x ^ 0xFFFFFFFFFFFFFFFFL)) {
                    this.A = this.x;
                }
                long l2 = -1L;
                long l3 = -1L;
                if (this.h < this.j || (this.h ^ 0xFFFFFFFFFFFFFFFFL) <= (this.j + (long)this.t ^ 0xFFFFFFFFFFFFFFFFL)) {
                    if ((this.j ^ 0xFFFFFFFFFFFFFFFFL) <= (this.h ^ 0xFFFFFFFFFFFFFFFFL) && this.j < (long)this.i + this.h) {
                        l2 = this.j;
                    }
                } else {
                    l2 = this.h;
                }
                if ((this.j ^ 0xFFFFFFFFFFFFFFFFL) > (this.h + (long)this.i ^ 0xFFFFFFFFFFFFFFFFL) && ((long)this.i + this.h ^ 0xFFFFFFFFFFFFFFFFL) >= (this.j + (long)this.t ^ 0xFFFFFFFFFFFFFFFFL)) {
                    l3 = this.h + (long)this.i;
                } else if ((long)this.t + this.j > this.h && this.j - -((long)this.t) <= (long)this.i + this.h) {
                    l3 = this.j - -((long)this.t);
                }
                if (-1L < l2 && (l2 ^ 0xFFFFFFFFFFFFFFFFL) > (l3 ^ 0xFFFFFFFFFFFFFFFFL)) {
                    int n2 = (int)(l3 + -l2);
                    ab.a(this.a, (int)(l2 + -this.h), this.n, (int)(-this.j + l2), n2);
                }
                this.i = 0;
                this.h = -1L;
            }
            if (arg0 == -14779) break block10;
            this.n = null;
        }
    }

    final void a(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            int n2;
            if (arg1 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 - -arg1 - arg3.length);
            }
            if (this.h != -1L && this.h <= this.l && this.h - -((long)this.i) >= (long)arg1 + this.l) {
                ab.a(this.a, (int)(this.l - this.h), arg3, arg2, arg1);
                this.l += (long)arg1;
                return;
            }
            long l2 = this.l;
            int n3 = arg2;
            int n4 = arg1;
            if ((this.l ^ 0xFFFFFFFFFFFFFFFFL) <= (this.j ^ 0xFFFFFFFFFFFFFFFFL) && (this.j + (long)this.t ^ 0xFFFFFFFFFFFFFFFFL) < (this.l ^ 0xFFFFFFFFFFFFFFFFL)) {
                n2 = (int)(this.j + (-this.l + (long)this.t));
                if (arg1 < n2) {
                    n2 = arg1;
                }
                ab.a(this.n, (int)(this.l - this.j), arg3, arg2, n2);
                arg1 -= n2;
                arg2 += n2;
                this.l += (long)n2;
            }
            if (!arg0) {
                return;
            }
            if (arg1 <= this.n.length) {
                if (arg1 > 0) {
                    this.b((byte)34);
                    n2 = arg1;
                    if (this.t < n2) {
                        n2 = this.t;
                    }
                    ab.a(this.n, 0, arg3, arg2, n2);
                    arg2 += n2;
                    arg1 -= n2;
                    this.l += (long)n2;
                }
            } else {
                this.b.a(0, this.l);
                this.x = this.l;
                while (arg1 > 0 && (n2 = this.b.a(arg3, arg1, arg2, -1)) != -1) {
                    arg2 += n2;
                    arg1 -= n2;
                    this.l += (long)n2;
                    this.x += (long)n2;
                }
            }
            if (this.h != -1L) {
                if ((this.l ^ 0xFFFFFFFFFFFFFFFFL) > (this.h ^ 0xFFFFFFFFFFFFFFFFL) && arg1 > 0) {
                    n2 = (int)(this.h - this.l) + arg2;
                    if (n2 > arg2 - -arg1) {
                        n2 = arg2 - -arg1;
                    }
                    while (n2 > arg2) {
                        arg3[arg2++] = 0;
                        --arg1;
                        ++this.l;
                    }
                }
                long l3 = -1L;
                if ((l2 ^ 0xFFFFFFFFFFFFFFFFL) >= (this.h ^ 0xFFFFFFFFFFFFFFFFL) && (l2 + (long)n4 ^ 0xFFFFFFFFFFFFFFFFL) < (this.h ^ 0xFFFFFFFFFFFFFFFFL)) {
                    l3 = this.h;
                } else if ((l2 ^ 0xFFFFFFFFFFFFFFFFL) <= (this.h ^ 0xFFFFFFFFFFFFFFFFL) && l2 < this.h + (long)this.i) {
                    l3 = l2;
                }
                long l4 = -1L;
                if (l2 >= this.h + (long)this.i || this.h - -((long)this.i) > l2 + (long)n4) {
                    if (l2 - -((long)n4) > this.h && ((long)this.i + this.h ^ 0xFFFFFFFFFFFFFFFFL) <= ((long)n4 + l2 ^ 0xFFFFFFFFFFFFFFFFL)) {
                        l4 = l2 + (long)n4;
                    }
                } else {
                    l4 = this.h + (long)this.i;
                }
                if (l3 > -1L && (l3 ^ 0xFFFFFFFFFFFFFFFFL) > (l4 ^ 0xFFFFFFFFFFFFFFFFL)) {
                    int n5 = (int)(l4 + -l3);
                    ab.a(this.a, (int)(-this.h + l3), arg3, n3 - -((int)(l3 + -l2)), n5);
                    if ((this.l ^ 0xFFFFFFFFFFFFFFFFL) > (l4 ^ 0xFFFFFFFFFFFFFFFFL)) {
                        arg1 = (int)((long)arg1 - (l4 - this.l));
                        this.l = l4;
                    }
                }
            }
        }
        catch (IOException iOException) {
            this.x = -1L;
            throw iOException;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    final void a(byte arg0, byte[] arg1) throws IOException {
        this.a(true, arg1.length, 0, arg1);
    }

    final long a(byte arg0) {
        if (arg0 != -111) {
            d = null;
        }
        return this.o;
    }

    static final int a(int arg0, byte arg1) {
        if (arg0 != 255) {
            nb.a(-35, (byte)126);
        }
        return arg1 & 0xFF;
    }

    static final InputStream a(boolean arg0, String arg1) throws IOException {
        InputStream inputStream;
        if (!arg0) {
            return null;
        }
        if (s != null) {
            URL uRL = new URL(s, arg1);
            inputStream = uRL.openStream();
        } else {
            inputStream = new BufferedInputStream(new FileInputStream(arg1));
        }
        return inputStream;
    }

    final void a(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 > -80) {
            return;
        }
        try {
            if (this.l + (long)arg0 > this.o) {
                this.o = (long)arg0 + this.l;
            }
            if (this.h != -1L && ((this.l ^ 0xFFFFFFFFFFFFFFFFL) > (this.h ^ 0xFFFFFFFFFFFFFFFFL) || (long)this.i + this.h < this.l)) {
                this.a(-14779);
            }
            if (0L != (this.h ^ 0xFFFFFFFFFFFFFFFFL) && (long)arg0 + this.l > (long)this.a.length + this.h) {
                int n2 = (int)(-this.l - -this.h + (long)this.a.length);
                ab.a(arg3, arg2, this.a, (int)(-this.h + this.l), n2);
                arg0 -= n2;
                arg2 += n2;
                this.l += (long)n2;
                this.i = this.a.length;
                this.a(-14779);
            }
            if (arg0 > this.a.length) {
                if ((this.x ^ 0xFFFFFFFFFFFFFFFFL) != (this.l ^ 0xFFFFFFFFFFFFFFFFL)) {
                    this.b.a(0, this.l);
                    this.x = this.l;
                }
                this.b.b(arg3, arg0, 1, arg2);
                this.x += (long)arg0;
                if (this.x > this.A) {
                    this.A = this.x;
                }
                long l2 = -1L;
                long l3 = -1L;
                if (this.j <= this.l && this.l < this.j + (long)this.t) {
                    l2 = this.l;
                } else if (this.l <= this.j && this.l - -((long)arg0) > this.j) {
                    l2 = this.j;
                }
                if (this.j < this.l - -((long)arg0) && (long)this.t + this.j >= this.l - -((long)arg0)) {
                    l3 = this.l + (long)arg0;
                } else if ((this.l ^ 0xFFFFFFFFFFFFFFFFL) > ((long)this.t + this.j ^ 0xFFFFFFFFFFFFFFFFL) && (this.j - -((long)this.t) ^ 0xFFFFFFFFFFFFFFFFL) >= (this.l - -((long)arg0) ^ 0xFFFFFFFFFFFFFFFFL)) {
                    l3 = this.j - -((long)this.t);
                }
                if (0L > (l2 ^ 0xFFFFFFFFFFFFFFFFL) && (l3 ^ 0xFFFFFFFFFFFFFFFFL) < (l2 ^ 0xFFFFFFFFFFFFFFFFL)) {
                    int n3 = (int)(l3 - l2);
                    ab.a(arg3, (int)(-this.l + l2 + (long)arg2), this.n, (int)(-this.j + l2), n3);
                }
                this.l += (long)arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.h == -1L) {
                    this.h = this.l;
                }
                ab.a(arg3, arg2, this.a, (int)(-this.h + this.l), arg0);
                this.l += (long)arg0;
                if (((long)this.i ^ 0xFFFFFFFFFFFFFFFFL) > (this.l + -this.h ^ 0xFFFFFFFFFFFFFFFFL)) {
                    this.i = (int)(this.l + -this.h);
                }
                return;
            }
        }
        catch (IOException iOException) {
            this.x = -1L;
            throw iOException;
        }
    }

    final void a(long arg0, int n2) throws IOException {
        if ((arg0 ^ 0xFFFFFFFFFFFFFFFFL) > -1L) {
            throw new IOException();
        }
        this.l = arg0;
    }

    private final void b(byte arg0) throws IOException {
        block3: {
            this.t = 0;
            if ((this.l ^ 0xFFFFFFFFFFFFFFFFL) != (this.x ^ 0xFFFFFFFFFFFFFFFFL)) {
                this.b.a(0, this.l);
                this.x = this.l;
            }
            this.j = this.l;
            while (this.t < this.n.length) {
                int n2;
                int n3 = -this.t + this.n.length;
                if (n3 > 200000000) {
                    n3 = 200000000;
                }
                if ((n2 = this.b.a(this.n, n3, this.t, -1)) == -1) break;
                this.x += (long)n2;
                this.t += n2;
            }
            if (arg0 > 14) break block3;
            this.b = null;
        }
    }

    nb(d arg0, int arg1, int arg2) throws IOException {
        this.b = arg0;
        this.o = this.A = arg0.a((byte)47);
        this.a = new byte[arg2];
        this.l = 0L;
        this.n = new byte[arg1];
    }

    static {
        s = null;
        u = new String[]{"Type the number of items to sell and press enter"};
        f = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
        q = 0;
    }
}

