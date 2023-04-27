final class i
{
    int a;
    static int[] g;
    private static long[] h;
    static String f;
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final int a(final int arg0, final int arg1, final int arg2, final CharSequence arg3, final byte arg4, final byte[] arg5) {
        final int n = arg0 + -arg2;
        if (arg4 >= -78) {
            a(null, null);
        }
        for (int i = 0; i < n; ++i) {
            final char char1 = arg3.charAt(arg2 + i);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == '\u20ac') {
                    arg5[i + arg1] = -128;
                }
                else if (char1 != '\u201a') {
                    if (char1 != '\u0192') {
                        if (char1 == '\u201e') {
                            arg5[arg1 - -i] = -124;
                        }
                        else if (char1 != '\u2026') {
                            if (char1 == '\u2020') {
                                arg5[arg1 - -i] = -122;
                            }
                            else if (char1 == '\u2021') {
                                arg5[i + arg1] = -121;
                            }
                            else if (char1 != '\u02c6') {
                                if (char1 == '\u2030') {
                                    arg5[i + arg1] = -119;
                                }
                                else if (char1 != '\u0160') {
                                    if (char1 != '\u2039') {
                                        if (char1 != '\u0152') {
                                            if (char1 != '\u017d') {
                                                if (char1 != '\u2018') {
                                                    if (char1 != '\u2019') {
                                                        if (char1 == '\u201c') {
                                                            arg5[arg1 - -i] = -109;
                                                        }
                                                        else if (char1 == '\u201d') {
                                                            arg5[i + arg1] = -108;
                                                        }
                                                        else if (char1 == '\u2022') {
                                                            arg5[arg1 - -i] = -107;
                                                        }
                                                        else if (char1 != '\u2013') {
                                                            if (char1 != '\u2014') {
                                                                if (char1 != '\u02dc') {
                                                                    if (char1 == '\u2122') {
                                                                        arg5[i + arg1] = -103;
                                                                    }
                                                                    else if (char1 == '\u0161') {
                                                                        arg5[arg1 - -i] = -102;
                                                                    }
                                                                    else if (char1 != '\u203a') {
                                                                        if (char1 == '\u0153') {
                                                                            arg5[arg1 + i] = -100;
                                                                        }
                                                                        else if (char1 != '\u017e') {
                                                                            if (char1 != '\u0178') {
                                                                                arg5[i + arg1] = 63;
                                                                            }
                                                                            else {
                                                                                arg5[arg1 - -i] = -97;
                                                                            }
                                                                        }
                                                                        else {
                                                                            arg5[arg1 - -i] = -98;
                                                                        }
                                                                    }
                                                                    else {
                                                                        arg5[i + arg1] = -101;
                                                                    }
                                                                }
                                                                else {
                                                                    arg5[i + arg1] = -104;
                                                                }
                                                            }
                                                            else {
                                                                arg5[arg1 + i] = -105;
                                                            }
                                                        }
                                                        else {
                                                            arg5[arg1 + i] = -106;
                                                        }
                                                    }
                                                    else {
                                                        arg5[i + arg1] = -110;
                                                    }
                                                }
                                                else {
                                                    arg5[i + arg1] = -111;
                                                }
                                            }
                                            else {
                                                arg5[i + arg1] = -114;
                                            }
                                        }
                                        else {
                                            arg5[i + arg1] = -116;
                                        }
                                    }
                                    else {
                                        arg5[i + arg1] = -117;
                                    }
                                }
                                else {
                                    arg5[i + arg1] = -118;
                                }
                            }
                            else {
                                arg5[arg1 + i] = -120;
                            }
                        }
                        else {
                            arg5[i + arg1] = -123;
                        }
                    }
                    else {
                        arg5[arg1 + i] = -125;
                    }
                }
                else {
                    arg5[i + arg1] = -126;
                }
            }
            else {
                arg5[i + arg1] = (byte)char1;
            }
        }
        return n;
    }
    
    i(final String arg0, final int arg1) {
        super();
        this.a = arg1;
    }
    
    static final la a(final Throwable arg0, final String arg1) {
        la la;
        if (arg0 instanceof la) {
            la = (la)arg0;
            final StringBuilder sb = new StringBuilder();
            final la la2 = la;
            la2.h = sb.append(la2.h).append(' ').append(arg1).toString();
        }
        else {
            la = new la(arg0, arg1);
        }
        return la;
    }
    
    static final v[] a(final int arg0) {
        if (arg0 != -711) {
            a(null, null);
        }
        return new v[] { ua.E, da.O, ga.c, ta.f, la.b, eb.d, gb.n };
    }
    
    static {
        i.h = new long[256];
        for (int i = 0; i < 256; ++i) {
            long n = i;
            for (int j = 0; j < 8; ++j) {
                if (~(0x1L & n) == 0xFFFFFFFFFFFFFFFEL) {
                    n = (n >>> 1 ^ 0xC96C5795D7870F42L);
                }
                else {
                    n >>>= 1;
                }
            }
            i.h[i] = n;
        }
        i.f = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
