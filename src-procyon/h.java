final class h
{
    static int[] c;
    static int[] b;
    static int a;
    static String[] e;
    
    static final byte[] a(final CharSequence arg0, final byte arg1) {
        final int i = arg0.length();
        final byte[] array = new byte[i];
        for (int n = 0; i > n; ++n) {
            final char char1 = arg0.charAt(n);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 != '\u20ac') {
                    if (char1 == '\u201a') {
                        array[n] = -126;
                    }
                    else if (char1 != '\u0192') {
                        if (char1 != '\u201e') {
                            if (char1 == '\u2026') {
                                array[n] = -123;
                            }
                            else if (char1 != '\u2020') {
                                if (char1 != '\u2021') {
                                    if (char1 != '\u02c6') {
                                        if (char1 == '\u2030') {
                                            array[n] = -119;
                                        }
                                        else if (char1 != '\u0160') {
                                            if (char1 == '\u2039') {
                                                array[n] = -117;
                                            }
                                            else if (char1 == '\u0152') {
                                                array[n] = -116;
                                            }
                                            else if (char1 != '\u017d') {
                                                if (char1 != '\u2018') {
                                                    if (char1 != '\u2019') {
                                                        if (char1 == '\u201c') {
                                                            array[n] = -109;
                                                        }
                                                        else if (char1 == '\u201d') {
                                                            array[n] = -108;
                                                        }
                                                        else if (char1 == '\u2022') {
                                                            array[n] = -107;
                                                        }
                                                        else if (char1 == '\u2013') {
                                                            array[n] = -106;
                                                        }
                                                        else if (char1 == '\u2014') {
                                                            array[n] = -105;
                                                        }
                                                        else if (char1 != '\u02dc') {
                                                            if (char1 != '\u2122') {
                                                                if (char1 != '\u0161') {
                                                                    if (char1 != '\u203a') {
                                                                        if (char1 != '\u0153') {
                                                                            if (char1 != '\u017e') {
                                                                                if (char1 == '\u0178') {
                                                                                    array[n] = -97;
                                                                                }
                                                                                else {
                                                                                    array[n] = 63;
                                                                                }
                                                                            }
                                                                            else {
                                                                                array[n] = -98;
                                                                            }
                                                                        }
                                                                        else {
                                                                            array[n] = -100;
                                                                        }
                                                                    }
                                                                    else {
                                                                        array[n] = -101;
                                                                    }
                                                                }
                                                                else {
                                                                    array[n] = -102;
                                                                }
                                                            }
                                                            else {
                                                                array[n] = -103;
                                                            }
                                                        }
                                                        else {
                                                            array[n] = -104;
                                                        }
                                                    }
                                                    else {
                                                        array[n] = -110;
                                                    }
                                                }
                                                else {
                                                    array[n] = -111;
                                                }
                                            }
                                            else {
                                                array[n] = -114;
                                            }
                                        }
                                        else {
                                            array[n] = -118;
                                        }
                                    }
                                    else {
                                        array[n] = -120;
                                    }
                                }
                                else {
                                    array[n] = -121;
                                }
                            }
                            else {
                                array[n] = -122;
                            }
                        }
                        else {
                            array[n] = -124;
                        }
                    }
                    else {
                        array[n] = -125;
                    }
                }
                else {
                    array[n] = -128;
                }
            }
            else {
                array[n] = (byte)char1;
            }
        }
        return array;
    }
}
