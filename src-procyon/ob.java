import java.io.*;

final class ob
{
    private int c;
    static byte[][] j;
    private int a;
    private nb b;
    private nb f;
    static int[] h;
    
    final boolean a(final int arg0, final int arg1, final int arg2, final byte[] arg3) {
        synchronized (this.f) {
            if (arg1 < 0 || this.a < arg1) {
                throw new IllegalArgumentException();
            }
            boolean b = this.a(arg0, arg3, true, arg1, 4);
            if (!b) {
                b = this.a(arg0, arg3, false, arg1, 4);
            }
            return b;
        }
    }
    
    final byte[] a(final int arg0, final int arg1) {
        synchronized (this.f) {
            try {
                if (~this.b.a((byte)(-111)) > ~(long)(6 + arg1 * 6)) {
                    return null;
                }
                this.b.a(6 * arg1, 12);
                this.b.a(true, 6, 0, la.c);
                final int i = (0xFF00 & la.c[1] << 8) + (((0xFF & la.c[0]) << 16) + (0xFF & la.c[2]));
                int n = (la.c[4] << 8 & 0xFF00) + ((la.c[3] & 0xFF) << 16) - -(0xFF & la.c[5]);
                if (i < 0 || i > this.a) {
                    return null;
                }
                if (n <= 0 || ~(this.f.a((byte)(-111)) / 520L) > ~(long)n) {
                    return null;
                }
                if (arg0 != 9395) {
                    return null;
                }
                final byte[] array = new byte[i];
                int n2 = 0;
                int n3 = 0;
                while (i > n2) {
                    if (n == 0) {
                        return null;
                    }
                    this.f.a(n * 520, 107);
                    int n4 = -n2 + i;
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    if (arg1 > 65535) {
                        if (n4 > 510) {
                            n4 = 510;
                        }
                        n5 = 10;
                        this.f.a(true, n4 + n5, 0, la.c);
                        n6 = (la.c[3] & 0xFF) + ((la.c[0] << 24 & 0xFF000000) - -(0xFF0000 & la.c[1] << 16) + (0xFF00 & la.c[2] << 8));
                        n7 = (la.c[9] & 0xFF);
                        n8 = (la.c[5] & 0xFF) + ((0xFF & la.c[4]) << 8);
                        n9 = (la.c[8] & 0xFF) + (0xFF0000 & la.c[6] << 16) + (la.c[7] << 8 & 0xFF00);
                    }
                    else {
                        if (n4 > 512) {
                            n4 = 512;
                        }
                        n5 = 8;
                        this.f.a(true, n5 + n4, 0, la.c);
                        n7 = (la.c[7] & 0xFF);
                        n6 = (la.c[0] << 8 & 0xFF00) + (0xFF & la.c[1]);
                        n8 = (la.c[2] << 8 & 0xFF00) + (la.c[3] & 0xFF);
                        n9 = ((0xFF & la.c[4]) << 16) - -((la.c[5] & 0xFF) << 8) - -(0xFF & la.c[6]);
                    }
                    if (arg1 != n6 || n3 != n8 || n7 != this.c) {
                        return null;
                    }
                    if (n9 < 0 || ~(this.f.a((byte)(-111)) / 520L) > ~(long)n9) {
                        return null;
                    }
                    final int j = n5 - -n4;
                    n = n9;
                    for (int n10 = n5; j > n10; ++n10) {
                        array[n2++] = la.c[n10];
                    }
                    ++n3;
                }
                return array;
            }
            catch (final IOException ex) {
                return null;
            }
        }
    }
    
    private final boolean a(final int arg0, final byte[] arg1, boolean arg2, final int arg3, final int arg4) {
        synchronized (this.f) {
            try {
                int n;
                if (arg2) {
                    if (~(long)(6 + 6 * arg0) < ~this.b.a((byte)(-111))) {
                        return false;
                    }
                    this.b.a(arg0 * 6, -124);
                    this.b.a(true, 6, 0, la.c);
                    n = (0xFF & la.c[5]) + (la.c[3] << 16 & 0xFF0000) - -((la.c[4] & 0xFF) << 8);
                    if (n <= 0 || this.f.a((byte)(-111)) / 520L < n) {
                        return false;
                    }
                }
                else {
                    n = (int)((this.f.a((byte)(-111)) + 519L) / 520L);
                    if (n == 0) {
                        n = 1;
                    }
                }
                la.c[0] = (byte)(arg3 >> 16);
                la.c[2] = (byte)arg3;
                la.c[3] = (byte)(n >> 16);
                la.c[arg4] = (byte)(n >> 8);
                la.c[1] = (byte)(arg3 >> 8);
                la.c[5] = (byte)n;
                this.b.a(6 * arg0, 31);
                this.b.a(6, -102, 0, la.c);
                int i = 0;
                int n2 = 0;
                while (i < arg3) {
                    int n3 = 0;
                    if (arg2) {
                        this.f.a(520 * n, arg4 ^ 0x11);
                        int n4;
                        int n5;
                        int n6;
                        if (arg0 <= 65535) {
                            try {
                                this.f.a(true, 8, 0, la.c);
                            }
                            catch (final EOFException ex) {
                                break;
                            }
                            n4 = (0xFF00 & la.c[0] << 8) - -(la.c[1] & 0xFF);
                            n3 = (la.c[6] & 0xFF) + (0xFF0000 & la.c[4] << 16) - -((0xFF & la.c[5]) << 8);
                            n5 = (0xFF & la.c[7]);
                            n6 = (la.c[3] & 0xFF) + (la.c[2] << 8 & 0xFF00);
                        }
                        else {
                            try {
                                this.f.a(true, 10, 0, la.c);
                            }
                            catch (final EOFException ex2) {
                                break;
                            }
                            n6 = (0xFF & la.c[5]) + (la.c[4] << 8 & 0xFF00);
                            n3 = (la.c[6] << 16 & 0xFF0000) - -((la.c[7] & 0xFF) << 8) + (la.c[8] & 0xFF);
                            n4 = (la.c[0] << 24 & 0xFF000000) + ((la.c[1] << 16 & 0xFF0000) - -((0xFF & la.c[2]) << 8)) - -(0xFF & la.c[3]);
                            n5 = (0xFF & la.c[9]);
                        }
                        if (arg0 != n4 || n6 != n2 || n5 != this.c) {
                            return false;
                        }
                        if (n3 < 0 || ~(long)n3 < ~(this.f.a((byte)(-111)) / 520L)) {
                            return false;
                        }
                    }
                    if (n3 == 0) {
                        arg2 = false;
                        n3 = (int)((this.f.a((byte)(-111)) + 519L) / 520L);
                        if (n3 == 0) {
                            ++n3;
                        }
                        if (n3 == n) {
                            ++n3;
                        }
                    }
                    if (arg3 - i <= 512) {
                        n3 = 0;
                    }
                    if (arg0 > 65535) {
                        la.c[0] = (byte)(arg0 >> 24);
                        la.c[5] = (byte)n2;
                        la.c[2] = (byte)(arg0 >> 8);
                        la.c[4] = (byte)(n2 >> 8);
                        la.c[7] = (byte)(n3 >> 8);
                        la.c[1] = (byte)(arg0 >> 16);
                        la.c[8] = (byte)n3;
                        la.c[9] = (byte)this.c;
                        la.c[3] = (byte)arg0;
                        la.c[6] = (byte)(n3 >> 16);
                        this.f.a(520 * n, arg4 ^ 0x21);
                        this.f.a(10, -111, 0, la.c);
                        int arg5 = arg3 + -i;
                        if (arg5 > 510) {
                            arg5 = 510;
                        }
                        this.f.a(arg5, arg4 - 119, i, arg1);
                        i += arg5;
                    }
                    else {
                        la.c[4] = (byte)(n3 >> 16);
                        la.c[0] = (byte)(arg0 >> 8);
                        la.c[7] = (byte)this.c;
                        la.c[6] = (byte)n3;
                        la.c[3] = (byte)n2;
                        la.c[1] = (byte)arg0;
                        la.c[2] = (byte)(n2 >> 8);
                        la.c[5] = (byte)(n3 >> 8);
                        this.f.a(n * 520, arg4 ^ 0x7F);
                        this.f.a(8, -107, 0, la.c);
                        int arg6 = arg3 - i;
                        if (arg6 > 512) {
                            arg6 = 512;
                        }
                        this.f.a(arg6, arg4 - 125, i, arg1);
                        i += arg6;
                    }
                    n = n3;
                    ++n2;
                }
                return true;
            }
            catch (final IOException ex3) {
                return false;
            }
        }
    }
    
    @Override
    public final String toString() {
        return "" + this.c;
    }
    
    ob(final int arg0, final nb arg1, final nb arg2, final int arg3) {
        super();
        this.a = 65000;
        this.f = null;
        this.b = null;
        this.a = arg3;
        this.c = arg0;
        this.b = arg2;
        this.f = arg1;
    }
    
    static {
        ob.j = new byte[1000][];
    }
}
