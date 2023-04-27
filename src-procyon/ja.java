import java.math.*;

final class ja extends tb
{
    static BigInteger K;
    static int[] N;
    static String[] L;
    private int M;
    
    final int k(final int arg0) {
        if (arg0 != -31874) {
            return 40;
        }
        return this.M;
    }
    
    final void i(final int arg0) {
        this.M = 8 * this.w;
        if (arg0 != -2231) {
            this.k(-48);
        }
    }
    
    final int f(final int arg0, int arg1) {
        int n = this.M >> 3;
        int i = -(this.M & 0x7) + 8;
        if (arg0 >= -67) {
            ja.K = null;
        }
        int n2 = 0;
        this.M += arg1;
        while (i < arg1) {
            n2 += (mb.i[i] & this.F[n++]) << -i + arg1;
            arg1 -= i;
            i = 8;
        }
        int n3;
        if (i != arg1) {
            n3 = n2 + (this.F[n] >> -arg1 + i & mb.i[arg1]);
        }
        else {
            n3 = n2 + (this.F[n] & mb.i[i]);
        }
        return n3;
    }
    
    ja(final int arg0) {
        super(arg0);
    }
    
    final void j(final int arg0) {
        if (arg0 != 25505) {
            this.f(12, -68);
        }
        this.w = (7 + this.M) / 8;
    }
    
    static {
        ja.N = new int[100];
        ja.K = new BigInteger("ca950472ae9765185bf290ff54a823b1d29b46dc3cf676203bb871efa278d9c49e16defc53ff479305123454505082f4700b0da381047f51b872f9bbeea653f21fd248a10ff5239b30234add35913cb6068d316edd418611334ae047fcd9acb7b0c13b30393a26204dc85183e0a95555c01bee800440e974bb9b441f464f4057", 16);
    }
}
