/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;

class tb
extends ib {
    byte[] F;
    int w;
    static int[] l = new int[12];

    final void a(String arg0, int arg1) {
        int n2 = arg0.indexOf(0);
        if (n2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.F[this.w++] = 0;
        this.w += i.a(arg0.length(), this.w, 0, arg0, (byte)-118, this.F);
        this.F[this.w++] = 0;
    }

    final void a(int arg0, byte arg1) {
        this.F[this.w++] = (byte)(arg0 >> 16);
        this.F[this.w++] = (byte)(arg0 >> 8);
        if (arg1 != -13) {
            return;
        }
        this.F[this.w++] = (byte)arg0;
    }

    final boolean e(int arg0) {
        this.w -= 4;
        if (arg0 != -422797528) {
            return false;
        }
        int n2 = w.a(this.w, 107, this.F, 0);
        int n3 = this.b(-129);
        return n3 == n2;
    }

    private final void a(boolean arg0, int arg1, int arg2, byte[] arg3) {
        block1: {
            for (int i2 = arg1; arg2 + arg1 > i2; ++i2) {
                arg3[i2] = this.F[this.w++];
            }
            if (!arg0) break block1;
            this.a(null, -94, null);
        }
    }

    final void a(int arg0, int arg1, int arg2, byte[] arg3) {
        block1: {
            for (int i2 = arg0; arg2 + arg0 > i2; ++i2) {
                this.F[this.w++] = arg3[i2];
            }
            if (arg1 < -120) break block1;
            l = null;
        }
    }

    final void c(int arg0, int arg1) {
        this.F[this.w++] = (byte)arg0;
    }

    final void a(byte arg0, String arg1) {
        block1: {
            int n2 = arg1.indexOf(0);
            if (n2 >= 0) {
                throw new IllegalArgumentException("");
            }
            this.w += i.a(arg1.length(), this.w, 0, arg1, (byte)-112, this.F);
            this.F[this.w++] = 0;
            if (arg0 == -39) break block1;
            this.h(-74);
        }
    }

    final void e(int arg0, int arg1) {
        this.F[this.w++] = (byte)(arg1 >> 8);
        if (arg0 != 393) {
            return;
        }
        this.F[this.w++] = (byte)arg1;
    }

    final byte h(int arg0) {
        if (arg0 != 20869) {
            return 113;
        }
        return this.F[this.w++];
    }

    final int a(byte arg0) {
        if (arg0 != 104) {
            this.b(111, (byte)-26);
        }
        return this.F[this.w++] & 0xFF;
    }

    final void a(byte arg0, int arg1, int[] arg2, int arg3) {
        int n2 = this.w;
        if (arg0 != 87) {
            return;
        }
        this.w = arg1;
        int n3 = (-arg1 + arg3) / 8;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.b(-129);
            int n5 = this.b(-129);
            int n6 = 0;
            int n7 = -1640531527;
            int n8 = 32;
            while (n8-- > 0) {
                n5 += (n4 += (n5 << 4 ^ n5 >>> 5) + n5 ^ n6 + arg2[n6 & 3]) + (n4 >>> 5 ^ n4 << 4) ^ (n6 += n7) - -arg2[(0x1BE9 & n6) >>> 11];
            }
            this.w -= 8;
            this.b(-422797528, n4);
            this.b(-422797528, n5);
        }
        this.w = n2;
    }

    final void d(int arg0, int arg1) {
        block0: {
            this.F[-arg0 + this.w - 2] = (byte)(arg0 >> 8);
            this.F[this.w + (-arg0 - 1)] = (byte)arg0;
            if (arg1 == 1) break block0;
            this.a(null, 53);
        }
    }

    final int b(byte arg0) {
        if (arg0 != 68) {
            return 53;
        }
        int n2 = 0xFF & this.F[this.w];
        if (n2 < 128) {
            return this.a((byte)104);
        }
        return this.f(255) - 32768;
    }

    final int a(boolean arg0) {
        this.w += 2;
        if (arg0) {
            return -8;
        }
        int n2 = (0xFF & this.F[this.w - 1]) + (this.F[this.w - 2] << 8 & 0xFF00);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    final int c(int arg0) {
        if (arg0 != 103) {
            return 72;
        }
        if (this.F[this.w] < 0) {
            return Integer.MAX_VALUE & this.b(-129);
        }
        return this.f(arg0 + 152);
    }

    final String c(byte arg0) {
        byte by;
        if (arg0 != -44) {
            this.d(-84);
        }
        if ((by = this.F[this.w++]) != 0) {
            throw new IllegalStateException("");
        }
        int n2 = this.w;
        while (this.F[this.w++] != 0) {
        }
        int n3 = this.w - n2 - 1;
        if (n3 == 0) {
            return "";
        }
        return ga.a(n3, arg0 - 68, n2, this.F);
    }

    final void b(int arg0, byte arg1) {
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

    final void b(int arg0, int arg1) {
        this.F[this.w++] = (byte)(arg1 >> 24);
        if (arg0 != -422797528) {
            this.c(-62, 1);
        }
        this.F[this.w++] = (byte)(arg1 >> 16);
        this.F[this.w++] = (byte)(arg1 >> 8);
        this.F[this.w++] = (byte)arg1;
    }

    final int f(int arg0) {
        if (arg0 != 255) {
            this.a(null, 71, null);
        }
        this.w += 2;
        return ((this.F[this.w - 2] & 0xFF) << 8) - -(0xFF & this.F[this.w - 1]);
    }

    final int b(int arg0) {
        this.w += 4;
        if (arg0 != -129) {
            return 124;
        }
        return (this.F[this.w - 3] << 16 & 0xFF0000) + (this.F[this.w - 4] << 24 & 0xFF000000) - (-(0xFF00 & this.F[this.w - 2] << 8) - (this.F[this.w - 1] & 0xFF));
    }

    final long g(int arg0) {
        if (arg0 != 0) {
            return -13L;
        }
        long l2 = (long)this.b(-129) & 0xFFFFFFFFL;
        long l3 = (long)this.b(-129) & 0xFFFFFFFFL;
        return (l2 << 32) - -l3;
    }

    tb(int arg0) {
        this.F = mb.a(arg0, (byte)-104);
        this.w = 0;
    }

    final byte[] d(int arg0) {
        byte[] byArray = new byte[this.w];
        for (int i2 = arg0; i2 < this.w; ++i2) {
            byArray[i2] = this.F[i2];
        }
        return byArray;
    }

    tb(byte[] arg0) {
        this.F = arg0;
        this.w = 0;
    }

    final void a(BigInteger arg0, int arg1, BigInteger arg2) {
        int n2 = this.w;
        this.w = 0;
        byte[] byArray = new byte[n2];
        this.a(false, 0, n2, byArray);
        BigInteger bigInteger = new BigInteger(byArray);
        BigInteger bigInteger2 = bigInteger.modPow(arg2, arg0);
        byte[] byArray2 = bigInteger2.toByteArray();
        this.w = 0;
        this.e(393, byArray2.length);
        this.a(0, -127, byArray2.length, byArray2);
    }
}

