/*
 * Decompiled with CFR 0.152.
 */
final class i {
    int a;
    static int[] g;
    private static long[] h;
    static String f;

    public final String toString() {
        throw new IllegalStateException();
    }

    static final int a(int arg0, int arg1, int arg2, CharSequence arg3, byte arg4, byte[] arg5) {
        int n2 = arg0 + -arg2;
        if (arg4 >= -78) {
            i.a(null, null);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = arg3.charAt(arg2 + i2);
            if (!(c2 > '\u0000' && c2 < '\u0080' || c2 >= '\u00a0' && c2 <= '\u00ff')) {
                if (c2 == '\u20ac') {
                    arg5[i2 + arg1] = -128;
                    continue;
                }
                if (c2 != '\u201a') {
                    if (c2 != '\u0192') {
                        if (c2 == '\u201e') {
                            arg5[arg1 - -i2] = -124;
                            continue;
                        }
                        if (c2 != '\u2026') {
                            if (c2 == '\u2020') {
                                arg5[arg1 - -i2] = -122;
                                continue;
                            }
                            if (c2 == '\u2021') {
                                arg5[i2 + arg1] = -121;
                                continue;
                            }
                            if (c2 != '\u02c6') {
                                if (c2 == '\u2030') {
                                    arg5[i2 + arg1] = -119;
                                    continue;
                                }
                                if (c2 != '\u0160') {
                                    if (c2 != '\u2039') {
                                        if (c2 != '\u0152') {
                                            if (c2 != '\u017d') {
                                                if (c2 != '\u2018') {
                                                    if (c2 != '\u2019') {
                                                        if (c2 == '\u201c') {
                                                            arg5[arg1 - -i2] = -109;
                                                            continue;
                                                        }
                                                        if (c2 == '\u201d') {
                                                            arg5[i2 + arg1] = -108;
                                                            continue;
                                                        }
                                                        if (c2 == '\u2022') {
                                                            arg5[arg1 - -i2] = -107;
                                                            continue;
                                                        }
                                                        if (c2 != '\u2013') {
                                                            if (c2 != '\u2014') {
                                                                if (c2 != '\u02dc') {
                                                                    if (c2 == '\u2122') {
                                                                        arg5[i2 + arg1] = -103;
                                                                        continue;
                                                                    }
                                                                    if (c2 == '\u0161') {
                                                                        arg5[arg1 - -i2] = -102;
                                                                        continue;
                                                                    }
                                                                    if (c2 != '\u203a') {
                                                                        if (c2 == '\u0153') {
                                                                            arg5[arg1 + i2] = -100;
                                                                            continue;
                                                                        }
                                                                        if (c2 != '\u017e') {
                                                                            if (c2 != '\u0178') {
                                                                                arg5[i2 + arg1] = 63;
                                                                                continue;
                                                                            }
                                                                            arg5[arg1 - -i2] = -97;
                                                                            continue;
                                                                        }
                                                                        arg5[arg1 - -i2] = -98;
                                                                        continue;
                                                                    }
                                                                    arg5[i2 + arg1] = -101;
                                                                    continue;
                                                                }
                                                                arg5[i2 + arg1] = -104;
                                                                continue;
                                                            }
                                                            arg5[arg1 + i2] = -105;
                                                            continue;
                                                        }
                                                        arg5[arg1 + i2] = -106;
                                                        continue;
                                                    }
                                                    arg5[i2 + arg1] = -110;
                                                    continue;
                                                }
                                                arg5[i2 + arg1] = -111;
                                                continue;
                                            }
                                            arg5[i2 + arg1] = -114;
                                            continue;
                                        }
                                        arg5[i2 + arg1] = -116;
                                        continue;
                                    }
                                    arg5[i2 + arg1] = -117;
                                    continue;
                                }
                                arg5[i2 + arg1] = -118;
                                continue;
                            }
                            arg5[arg1 + i2] = -120;
                            continue;
                        }
                        arg5[i2 + arg1] = -123;
                        continue;
                    }
                    arg5[arg1 + i2] = -125;
                    continue;
                }
                arg5[i2 + arg1] = -126;
                continue;
            }
            arg5[i2 + arg1] = (byte)c2;
        }
        return n2;
    }

    i(String arg0, int arg1) {
        this.a = arg1;
    }

    static final la a(Throwable arg0, String arg1) {
        la la2;
        if (arg0 instanceof la) {
            la2 = (la)arg0;
            la2.h = la2.h + ' ' + arg1;
        } else {
            la2 = new la(arg0, arg1);
        }
        return la2;
    }

    static final v[] a(int arg0) {
        if (arg0 != -711) {
            i.a(null, null);
        }
        return new v[]{ua.E, da.O, ga.c, ta.f, la.b, eb.d, gb.n};
    }

    static {
        h = new long[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            long l2 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                if ((1L & l2 ^ 0xFFFFFFFFFFFFFFFFL) == -2L) {
                    l2 = l2 >>> 1 ^ 0xC96C5795D7870F42L;
                    continue;
                }
                l2 >>>= 1;
            }
            i.h[i2] = l2;
        }
        f = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}

