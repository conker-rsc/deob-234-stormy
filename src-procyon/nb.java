import java.net.*;
import java.io.*;

final class nb
{
    private byte[] n;
    private long h;
    private long l;
    static int g;
    private byte[] a;
    private long x;
    private d b;
    static int[] d;
    private int t;
    private int i;
    static int y;
    static String[] u;
    static URL s;
    static char[] f;
    private long o;
    private long A;
    private long j;
    static int q;
    
    private final void a(final int arg0) throws IOException {
        if (this.h != -1L) {
            if (~this.x != ~this.h) {
                this.b.a(0, this.h);
                this.x = this.h;
            }
            this.b.b(this.a, this.i, 1, 0);
            this.x += this.i;
            if (~this.A > ~this.x) {
                this.A = this.x;
            }
            long n = -1L;
            long n2 = -1L;
            if (this.h < this.j || ~this.h <= ~(this.j + this.t)) {
                if (~this.j <= ~this.h && this.j < this.i + this.h) {
                    n = this.j;
                }
            }
            else {
                n = this.h;
            }
            if (~this.j > ~(this.h + this.i) && ~(this.i + this.h) >= ~(this.j + this.t)) {
                n2 = this.h + this.i;
            }
            else if (this.t + this.j > this.h && this.j - -this.t <= this.i + this.h) {
                n2 = this.j - -this.t;
            }
            if (-1L < n && ~n > ~n2) {
                ab.a(this.a, (int)(n + -this.h), this.n, (int)(-this.j + n), (int)(n2 + -n));
            }
            this.i = 0;
            this.h = -1L;
        }
        if (arg0 != -14779) {
            this.n = null;
        }
    }
    
    final void a(final boolean arg0, int arg1, int arg2, final byte[] arg3) throws IOException {
        try {
            if (arg1 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 - -arg1 - arg3.length);
            }
            if (this.h != -1L && this.h <= this.l && this.h - -this.i >= arg1 + this.l) {
                ab.a(this.a, (int)(this.l - this.h), arg3, arg2, arg1);
                this.l += arg1;
                return;
            }
            final long l = this.l;
            final int n = arg2;
            final int n2 = arg1;
            if (~this.l <= ~this.j && ~(this.j + this.t) < ~this.l) {
                int arg4 = (int)(this.j + (-this.l + this.t));
                if (arg1 < arg4) {
                    arg4 = arg1;
                }
                ab.a(this.n, (int)(this.l - this.j), arg3, arg2, arg4);
                arg1 -= arg4;
                arg2 += arg4;
                this.l += arg4;
            }
            if (!arg0) {
                return;
            }
            if (arg1 <= this.n.length) {
                if (arg1 > 0) {
                    this.b((byte)34);
                    int t = arg1;
                    if (this.t < t) {
                        t = this.t;
                    }
                    ab.a(this.n, 0, arg3, arg2, t);
                    arg2 += t;
                    arg1 -= t;
                    this.l += t;
                }
            }
            else {
                this.b.a(0, this.l);
                this.x = this.l;
                while (arg1 > 0) {
                    final int a = this.b.a(arg3, arg1, arg2, -1);
                    if (a == -1) {
                        break;
                    }
                    arg2 += a;
                    arg1 -= a;
                    this.l += a;
                    this.x += a;
                }
            }
            if (this.h != -1L) {
                if (~this.l > ~this.h) {
                    if (arg1 > 0) {
                        int i = (int)(this.h - this.l) + arg2;
                        if (i > arg2 - -arg1) {
                            i = arg2 - -arg1;
                        }
                        while (i > arg2) {
                            arg3[arg2++] = 0;
                            --arg1;
                            ++this.l;
                        }
                    }
                }
                long h = -1L;
                if (~l >= ~this.h && ~(l + n2) < ~this.h) {
                    h = this.h;
                }
                else if (~l <= ~this.h && l < this.h + this.i) {
                    h = l;
                }
                long j = -1L;
                if (l >= this.h + this.i || this.h - -this.i > l + n2) {
                    if (l - -n2 > this.h && ~(this.i + this.h) <= ~(n2 + l)) {
                        j = l + n2;
                    }
                }
                else {
                    j = this.h + this.i;
                }
                if (h > -1L && ~h > ~j) {
                    ab.a(this.a, (int)(-this.h + h), arg3, n - -(int)(h + -l), (int)(j + -h));
                    if (~this.l > ~j) {
                        arg1 -= (int)(j - this.l);
                        this.l = j;
                    }
                }
            }
        }
        catch (final IOException ex) {
            this.x = -1L;
            throw ex;
        }
        if (arg1 <= 0) {
            return;
        }
        throw new EOFException();
    }
    
    final void a(final byte arg0, final byte[] arg1) throws IOException {
        this.a(true, arg1.length, 0, arg1);
    }
    
    final long a(final byte arg0) {
        if (arg0 != -111) {
            nb.d = null;
        }
        return this.o;
    }
    
    static final int a(final int arg0, final byte arg1) {
        if (arg0 != 255) {
            a(-35, (byte)126);
        }
        return arg1 & 0xFF;
    }
    
    static final InputStream a(final boolean arg0, final String arg1) throws IOException {
        if (!arg0) {
            return null;
        }
        InputStream openStream;
        if (nb.s != null) {
            openStream = new URL(nb.s, arg1).openStream();
        }
        else {
            openStream = new BufferedInputStream(new FileInputStream(arg1));
        }
        return openStream;
    }
    
    final void a(int arg0, final int arg1, int arg2, final byte[] arg3) throws IOException {
        if (arg1 > -80) {
            return;
        }
        try {
            if (this.l + arg0 > this.o) {
                this.o = arg0 + this.l;
            }
            if (this.h != -1L) {
                if (~this.l > ~this.h || this.i + this.h < this.l) {
                    this.a(-14779);
                }
            }
            if (0x0L != ~this.h && arg0 + this.l > this.a.length + this.h) {
                final int arg4 = (int)(-this.l - -this.h + this.a.length);
                ab.a(arg3, arg2, this.a, (int)(-this.h + this.l), arg4);
                arg0 -= arg4;
                arg2 += arg4;
                this.l += arg4;
                this.i = this.a.length;
                this.a(-14779);
            }
            if (arg0 > this.a.length) {
                if (~this.x != ~this.l) {
                    this.b.a(0, this.l);
                    this.x = this.l;
                }
                this.b.b(arg3, arg0, 1, arg2);
                this.x += arg0;
                if (this.x > this.A) {
                    this.A = this.x;
                }
                long n = -1L;
                long n2 = -1L;
                if (this.j <= this.l && this.l < this.j + this.t) {
                    n = this.l;
                }
                else if (this.l <= this.j) {
                    if (this.l - -arg0 > this.j) {
                        n = this.j;
                    }
                }
                if (this.j < this.l - -arg0 && this.t + this.j >= this.l - -arg0) {
                    n2 = this.l + arg0;
                }
                else if (~this.l > ~(this.t + this.j)) {
                    if (~(this.j - -this.t) >= ~(this.l - -arg0)) {
                        n2 = this.j - -this.t;
                    }
                }
                if (0L > ~n && ~n2 < ~n) {
                    ab.a(arg3, (int)(-this.l + n + arg2), this.n, (int)(-this.j + n), (int)(n2 - n));
                }
                this.l += arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.h == -1L) {
                    this.h = this.l;
                }
                ab.a(arg3, arg2, this.a, (int)(-this.h + this.l), arg0);
                this.l += arg0;
                if (~(long)this.i > ~(this.l + -this.h)) {
                    this.i = (int)(this.l + -this.h);
                }
            }
        }
        catch (final IOException ex) {
            this.x = -1L;
            throw ex;
        }
    }
    
    final void a(final long arg0, final int n) throws IOException {
        if (~arg0 > -1L) {
            throw new IOException();
        }
        this.l = arg0;
    }
    
    private final void b(final byte arg0) throws IOException {
        this.t = 0;
        if (~this.l != ~this.x) {
            this.b.a(0, this.l);
            this.x = this.l;
        }
        this.j = this.l;
        while (this.t < this.n.length) {
            int arg = -this.t + this.n.length;
            if (arg > 200000000) {
                arg = 200000000;
            }
            final int a = this.b.a(this.n, arg, this.t, -1);
            if (a == -1) {
                break;
            }
            this.x += a;
            this.t += a;
        }
        if (arg0 <= 14) {
            this.b = null;
        }
    }
    
    nb(final d arg0, final int arg1, final int arg2) throws IOException {
        super();
        this.h = -1L;
        this.i = 0;
        this.j = -1L;
        this.b = arg0;
        final long a = arg0.a((byte)47);
        this.A = a;
        this.o = a;
        this.a = new byte[arg2];
        this.l = 0L;
        this.n = new byte[arg1];
    }
    
    static {
        nb.g = 0;
        nb.s = null;
        nb.u = new String[] { "Type the number of items to sell and press enter" };
        nb.f = new char[] { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
        nb.q = 0;
    }
}
