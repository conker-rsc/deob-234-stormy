/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;

final class ob {
    private int c;
    static byte[][] j = new byte[1000][];
    private int a = 65000;
    private nb b = null;
    private nb f = null;
    static int[] h;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final boolean a(int arg0, int arg1, int arg2, byte[] arg3) {
        nb nb2 = this.f;
        synchronized (nb2) {
            if (arg1 < 0 || this.a < arg1) {
                throw new IllegalArgumentException();
            }
            boolean bl = this.a(arg0, arg3, true, arg1, 4);
            if (!bl) {
                bl = this.a(arg0, arg3, false, arg1, 4);
            }
            return bl;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final byte[] a(int arg0, int arg1) {
        nb nb2 = this.f;
        synchronized (nb2) {
            try {
                if ((this.b.a((byte)-111) ^ 0xFFFFFFFFFFFFFFFFL) > ((long)(6 + arg1 * 6) ^ 0xFFFFFFFFFFFFFFFFL)) {
                    return null;
                }
                this.b.a(6 * arg1, 12);
                this.b.a(true, 6, 0, la.c);
                int n2 = (0xFF00 & la.c[1] << 8) + (((0xFF & la.c[0]) << 16) + (0xFF & la.c[2]));
                int n3 = (la.c[4] << 8 & 0xFF00) + ((la.c[3] & 0xFF) << 16) - -(0xFF & la.c[5]);
                if (n2 < 0 || n2 > this.a) {
                    return null;
                }
                if (n3 <= 0 || (this.f.a((byte)-111) / 520L ^ 0xFFFFFFFFFFFFFFFFL) > ((long)n3 ^ 0xFFFFFFFFFFFFFFFFL)) {
                    return null;
                }
                if (arg0 != 9395) {
                    return null;
                }
                byte[] byArray = new byte[n2];
                int n4 = 0;
                int n5 = 0;
                while (n2 > n4) {
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    if (n3 == 0) {
                        return null;
                    }
                    this.f.a(n3 * 520, 107);
                    int n11 = -n4 + n2;
                    if (arg1 > 65535) {
                        if (n11 > 510) {
                            n11 = 510;
                        }
                        n10 = 10;
                        this.f.a(true, n11 + n10, 0, la.c);
                        n9 = (la.c[3] & 0xFF) + ((la.c[0] << 24 & 0xFF000000) - -(0xFF0000 & la.c[1] << 16) + (0xFF00 & la.c[2] << 8));
                        n8 = la.c[9] & 0xFF;
                        n7 = (la.c[5] & 0xFF) + ((0xFF & la.c[4]) << 8);
                        n6 = (la.c[8] & 0xFF) + (0xFF0000 & la.c[6] << 16) + (la.c[7] << 8 & 0xFF00);
                    } else {
                        if (n11 > 512) {
                            n11 = 512;
                        }
                        n10 = 8;
                        this.f.a(true, n10 + n11, 0, la.c);
                        n8 = la.c[7] & 0xFF;
                        n9 = (la.c[0] << 8 & 0xFF00) + (0xFF & la.c[1]);
                        n7 = (la.c[2] << 8 & 0xFF00) + (la.c[3] & 0xFF);
                        n6 = ((0xFF & la.c[4]) << 16) - -((la.c[5] & 0xFF) << 8) - -(0xFF & la.c[6]);
                    }
                    if (arg1 != n9 || n5 != n7 || n8 != this.c) {
                        return null;
                    }
                    if (n6 < 0 || (this.f.a((byte)-111) / 520L ^ 0xFFFFFFFFFFFFFFFFL) > ((long)n6 ^ 0xFFFFFFFFFFFFFFFFL)) {
                        return null;
                    }
                    int n12 = n10 - -n11;
                    n3 = n6;
                    for (int i2 = n10; n12 > i2; ++i2) {
                        byArray[n4++] = la.c[i2];
                    }
                    ++n5;
                }
                return byArray;
            }
            catch (IOException iOException) {
                return null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final boolean a(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        nb nb2 = this.f;
        synchronized (nb2) {
            try {
                int n2;
                if (arg2) {
                    if (((long)(6 + 6 * arg0) ^ 0xFFFFFFFFFFFFFFFFL) < (this.b.a((byte)-111) ^ 0xFFFFFFFFFFFFFFFFL)) {
                        return false;
                    }
                    this.b.a(arg0 * 6, -124);
                    this.b.a(true, 6, 0, la.c);
                    n2 = (0xFF & la.c[5]) + (la.c[3] << 16 & 0xFF0000) - -((la.c[4] & 0xFF) << 8);
                    if (n2 <= 0 || this.f.a((byte)-111) / 520L < (long)n2) {
                        return false;
                    }
                } else {
                    n2 = (int)((this.f.a((byte)-111) - -519L) / 520L);
                    if (n2 == 0) {
                        n2 = 1;
                    }
                }
                la.c[0] = (byte)(arg3 >> 16);
                la.c[2] = (byte)arg3;
                la.c[3] = (byte)(n2 >> 16);
                la.c[arg4] = (byte)(n2 >> 8);
                la.c[1] = (byte)(arg3 >> 8);
                la.c[5] = (byte)n2;
                this.b.a(6 * arg0, 31);
                this.b.a(6, -102, 0, la.c);
                int n3 = 0;
                int n4 = 0;
                while (n3 < arg3) {
                    int n5;
                    int n6 = 0;
                    if (arg2) {
                        int n7;
                        int n8;
                        this.f.a(520 * n2, arg4 ^ 0x11);
                        if (arg0 <= 65535) {
                            try {
                                this.f.a(true, 8, 0, la.c);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n5 = (0xFF00 & la.c[0] << 8) - -(la.c[1] & 0xFF);
                            n6 = (la.c[6] & 0xFF) + (0xFF0000 & la.c[4] << 16) - -((0xFF & la.c[5]) << 8);
                            n8 = 0xFF & la.c[7];
                            n7 = (la.c[3] & 0xFF) + (la.c[2] << 8 & 0xFF00);
                        } else {
                            try {
                                this.f.a(true, 10, 0, la.c);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n7 = (0xFF & la.c[5]) + (la.c[4] << 8 & 0xFF00);
                            n6 = (la.c[6] << 16 & 0xFF0000) - -((la.c[7] & 0xFF) << 8) + (la.c[8] & 0xFF);
                            n5 = (la.c[0] << 24 & 0xFF000000) + ((la.c[1] << 16 & 0xFF0000) - -((0xFF & la.c[2]) << 8)) - -(0xFF & la.c[3]);
                            n8 = 0xFF & la.c[9];
                        }
                        if (arg0 != n5 || n7 != n4 || n8 != this.c) {
                            return false;
                        }
                        if (n6 < 0 || ((long)n6 ^ 0xFFFFFFFFFFFFFFFFL) < (this.f.a((byte)-111) / 520L ^ 0xFFFFFFFFFFFFFFFFL)) {
                            return false;
                        }
                    }
                    if (n6 == 0) {
                        arg2 = false;
                        n6 = (int)((this.f.a((byte)-111) - -519L) / 520L);
                        if (n6 == 0) {
                            ++n6;
                        }
                        if (n6 == n2) {
                            ++n6;
                        }
                    }
                    if (arg3 - n3 <= 512) {
                        n6 = 0;
                    }
                    if (arg0 > 65535) {
                        la.c[0] = (byte)(arg0 >> 24);
                        la.c[5] = (byte)n4;
                        la.c[2] = (byte)(arg0 >> 8);
                        la.c[4] = (byte)(n4 >> 8);
                        la.c[7] = (byte)(n6 >> 8);
                        la.c[1] = (byte)(arg0 >> 16);
                        la.c[8] = (byte)n6;
                        la.c[9] = (byte)this.c;
                        la.c[3] = (byte)arg0;
                        la.c[6] = (byte)(n6 >> 16);
                        this.f.a(520 * n2, arg4 ^ 0x21);
                        this.f.a(10, -111, 0, la.c);
                        n5 = arg3 + -n3;
                        if (n5 > 510) {
                            n5 = 510;
                        }
                        this.f.a(n5, arg4 - 119, n3, arg1);
                        n3 += n5;
                    } else {
                        la.c[4] = (byte)(n6 >> 16);
                        la.c[0] = (byte)(arg0 >> 8);
                        la.c[7] = (byte)this.c;
                        la.c[6] = (byte)n6;
                        la.c[3] = (byte)n4;
                        la.c[1] = (byte)arg0;
                        la.c[2] = (byte)(n4 >> 8);
                        la.c[5] = (byte)(n6 >> 8);
                        this.f.a(n2 * 520, arg4 ^ 0x7F);
                        this.f.a(8, -107, 0, la.c);
                        n5 = arg3 - n3;
                        if (n5 > 512) {
                            n5 = 512;
                        }
                        this.f.a(n5, arg4 - 125, n3, arg1);
                        n3 += n5;
                    }
                    n2 = n6;
                    ++n4;
                }
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
    }

    public final String toString() {
        return "" + this.c;
    }

    ob(int arg0, nb arg1, nb arg2, int arg3) {
        this.a = arg3;
        this.c = arg0;
        this.b = arg2;
        this.f = arg1;
    }
}

