import java.math.*;

class tb extends ib
{
    byte[] F;
    int w;
    static int[] l;
    
    final void a(final String arg0, final int arg1) {
        if (arg0.indexOf(0) < 0) {
            this.F[this.w++] = 0;
            this.w += i.a(arg0.length(), this.w, 0, arg0, (byte)(-118), this.F);
            this.F[this.w++] = 0;
            return;
        }
        throw new IllegalArgumentException("");
    }
    
    final void a(final int arg0, final byte arg1) {
        this.F[this.w++] = (byte)(arg0 >> 16);
        this.F[this.w++] = (byte)(arg0 >> 8);
        if (arg1 != -13) {
            return;
        }
        this.F[this.w++] = (byte)arg0;
    }
    
    final boolean e(final int arg0) {
        this.w -= 4;
        return arg0 == -422797528 && this.b(-129) == w.a(this.w, 107, this.F, 0);
    }
    
    private final void a(final boolean arg0, final int arg1, final int arg2, final byte[] arg3) {
        for (int n = arg1; arg2 + arg1 > n; ++n) {
            arg3[n] = this.F[this.w++];
        }
        if (arg0) {
            this.a(null, -94, null);
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final byte[] arg3) {
        for (int n = arg0; arg2 + arg0 > n; ++n) {
            this.F[this.w++] = arg3[n];
        }
        if (arg1 >= -120) {
            tb.l = null;
        }
    }
    
    final void c(final int arg0, final int arg1) {
        this.F[this.w++] = (byte)arg0;
    }
    
    final void a(final byte arg0, final String arg1) {
        if (arg1.indexOf(0) < 0) {
            this.w += i.a(arg1.length(), this.w, 0, arg1, (byte)(-112), this.F);
            this.F[this.w++] = 0;
            if (arg0 != -39) {
                this.h(-74);
            }
            return;
        }
        throw new IllegalArgumentException("");
    }
    
    final void e(final int arg0, final int arg1) {
        this.F[this.w++] = (byte)(arg1 >> 8);
        if (arg0 != 393) {
            return;
        }
        this.F[this.w++] = (byte)arg1;
    }
    
    final byte h(final int arg0) {
        if (arg0 != 20869) {
            return 113;
        }
        return this.F[this.w++];
    }
    
    final int a(final byte arg0) {
        if (arg0 != 104) {
            this.b(111, (byte)(-26));
        }
        return this.F[this.w++] & 0xFF;
    }
    
    final void a(final byte arg0, final int arg1, final int[] arg2, final int arg3) {
        final int w = this.w;
        if (arg0 != 87) {
            return;
        }
        this.w = arg1;
        for (int n = (-arg1 + arg3) / 8, i = 0; i < n; ++i) {
            int b = this.b(-129);
            int b2 = this.b(-129);
            int n2 = 0;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                b += ((b2 << 4 ^ b2 >>> 5) + b2 ^ n2 + arg2[n2 & 0x3]);
                n2 += n3;
                b2 += (b + (b >>> 5 ^ b << 4) ^ n2 - -arg2[(0x1BE9 & n2) >>> 11]);
            }
            this.w -= 8;
            this.b(-422797528, b);
            this.b(-422797528, b2);
        }
        this.w = w;
    }
    
    final void d(final int arg0, final int arg1) {
        this.F[-arg0 + this.w - 2] = (byte)(arg0 >> 8);
        this.F[this.w + (-arg0 - 1)] = (byte)arg0;
        if (arg1 != 1) {
            this.a(null, 53);
        }
    }
    
    final int b(final byte arg0) {
        if (arg0 != 68) {
            return 53;
        }
        if ((0xFF & this.F[this.w]) < 128) {
            return this.a((byte)104);
        }
        return this.f(255) - 32768;
    }
    
    final int a(final boolean arg0) {
        this.w += 2;
        if (arg0) {
            return -8;
        }
        int n = (0xFF & this.F[this.w - 1]) + (this.F[this.w - 2] << 8 & 0xFF00);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    final int c(final int arg0) {
        if (arg0 != 103) {
            return 72;
        }
        if (this.F[this.w] < 0) {
            return Integer.MAX_VALUE & this.b(-129);
        }
        return this.f(arg0 + 152);
    }
    
    final String c(final byte arg0) {
        if (arg0 != -44) {
            this.d(-84);
        }
        if (this.F[this.w++] != 0) {
            throw new IllegalStateException("");
        }
        final int w = this.w;
        while (this.F[this.w++] != 0) {}
        final int arg = this.w - w - 1;
        if (arg == 0) {
            return "";
        }
        return ga.a(arg, arg0 - 68, w, this.F);
    }
    
    final void b(final int arg0, final byte arg1) {
        if (arg1 > -62) {
            return;
        }
        if (arg0 >= 0 && arg0 < 128) {
            this.c(arg0, 43);
            return;
        }
        if (arg0 >= 0 && arg0 < 32768) {
            this.e(393, 32768 - -arg0);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    final void b(final int arg0, final int arg1) {
        this.F[this.w++] = (byte)(arg1 >> 24);
        if (arg0 != -422797528) {
            this.c(-62, 1);
        }
        this.F[this.w++] = (byte)(arg1 >> 16);
        this.F[this.w++] = (byte)(arg1 >> 8);
        this.F[this.w++] = (byte)arg1;
    }
    
    final int f(final int arg0) {
        if (arg0 != 255) {
            this.a(null, 71, null);
        }
        this.w += 2;
        return ((this.F[this.w - 2] & 0xFF) << 8) - -(0xFF & this.F[this.w - 1]);
    }
    
    final int b(final int arg0) {
        this.w += 4;
        if (arg0 != -129) {
            return 124;
        }
        return (this.F[this.w - 3] << 16 & 0xFF0000) + (this.F[this.w - 4] << 24 & 0xFF000000) - (-(0xFF00 & this.F[this.w - 2] << 8) - (this.F[this.w - 1] & 0xFF));
    }
    
    final long g(final int arg0) {
        if (arg0 != 0) {
            return -13L;
        }
        return (((long)this.b(-129) & 0xFFFFFFFFL) << 32) - -((long)this.b(-129) & 0xFFFFFFFFL);
    }
    
    tb(final int arg0) {
        super();
        this.F = mb.a(arg0, (byte)(-104));
        this.w = 0;
    }
    
    final byte[] d(final int arg0) {
        final byte[] array = new byte[this.w];
        for (int i = arg0; i < this.w; ++i) {
            array[i] = this.F[i];
        }
        return array;
    }
    
    tb(final byte[] arg0) {
        super();
        this.F = arg0;
        this.w = 0;
    }
    
    final void a(final BigInteger arg0, final int arg1, final BigInteger arg2) {
        final int w = this.w;
        this.w = 0;
        final byte[] arg3 = new byte[w];
        this.a(false, 0, w, arg3);
        final byte[] byteArray = new BigInteger(arg3).modPow(arg2, arg0).toByteArray();
        this.w = 0;
        this.e(393, byteArray.length);
        this.a(0, -127, byteArray.length, byteArray);
    }
    
    static {
        tb.l = new int[12];
    }
}
