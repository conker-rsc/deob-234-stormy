/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;

final class ja
extends tb {
    static BigInteger K;
    static int[] N;
    static String[] L;
    private int M;

    final int k(int arg0) {
        if (arg0 != -31874) {
            return 40;
        }
        return this.M;
    }

    final void i(int arg0) {
        block0: {
            this.M = 8 * this.w;
            if (arg0 == -2231) break block0;
            this.k(-48);
        }
    }

    final int f(int arg0, int arg1) {
        int n2 = this.M >> 3;
        int n3 = -(this.M & 7) + 8;
        if (arg0 >= -67) {
            K = null;
        }
        int n4 = 0;
        this.M += arg1;
        while (n3 < arg1) {
            n4 += (mb.i[n3] & this.F[n2++]) << -n3 + arg1;
            arg1 -= n3;
            n3 = 8;
        }
        n4 = n3 != arg1 ? (n4 += this.F[n2] >> -arg1 + n3 & mb.i[arg1]) : (n4 += this.F[n2] & mb.i[n3]);
        return n4;
    }

    ja(int arg0) {
        super(arg0);
    }

    final void j(int arg0) {
        if (arg0 != 25505) {
            this.f(12, -68);
        }
        this.w = (7 + this.M) / 8;
    }

    static {
        N = new int[100];
        K = new BigInteger("ca950472ae9765185bf290ff54a823b1d29b46dc3cf676203bb871efa278d9c49e16defc53ff479305123454505082f4700b0da381047f51b872f9bbeea653f21fd248a10ff5239b30234add35913cb6068d316edd418611334ae047fcd9acb7b0c13b30393a26204dc85183e0a95555c01bee800440e974bb9b441f464f4057", 16);
    }
}

