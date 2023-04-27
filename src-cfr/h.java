/*
 * Decompiled with CFR 0.152.
 */
final class h {
    static int[] c;
    static int[] b;
    static int a;
    static String[] e;

    static final byte[] a(CharSequence arg0, byte arg1) {
        int n2 = arg0.length();
        byte[] byArray = new byte[n2];
        for (int i2 = 0; n2 > i2; ++i2) {
            char c2 = arg0.charAt(i2);
            if (!(c2 > '\u0000' && c2 < '\u0080' || c2 >= '\u00a0' && c2 <= '\u00ff')) {
                if (c2 != '\u20ac') {
                    if (c2 == '\u201a') {
                        byArray[i2] = -126;
                        continue;
                    }
                    if (c2 != '\u0192') {
                        if (c2 != '\u201e') {
                            if (c2 == '\u2026') {
                                byArray[i2] = -123;
                                continue;
                            }
                            if (c2 != '\u2020') {
                                if (c2 != '\u2021') {
                                    if (c2 != '\u02c6') {
                                        if (c2 == '\u2030') {
                                            byArray[i2] = -119;
                                            continue;
                                        }
                                        if (c2 != '\u0160') {
                                            if (c2 == '\u2039') {
                                                byArray[i2] = -117;
                                                continue;
                                            }
                                            if (c2 == '\u0152') {
                                                byArray[i2] = -116;
                                                continue;
                                            }
                                            if (c2 != '\u017d') {
                                                if (c2 != '\u2018') {
                                                    if (c2 != '\u2019') {
                                                        if (c2 == '\u201c') {
                                                            byArray[i2] = -109;
                                                            continue;
                                                        }
                                                        if (c2 == '\u201d') {
                                                            byArray[i2] = -108;
                                                            continue;
                                                        }
                                                        if (c2 == '\u2022') {
                                                            byArray[i2] = -107;
                                                            continue;
                                                        }
                                                        if (c2 == '\u2013') {
                                                            byArray[i2] = -106;
                                                            continue;
                                                        }
                                                        if (c2 == '\u2014') {
                                                            byArray[i2] = -105;
                                                            continue;
                                                        }
                                                        if (c2 != '\u02dc') {
                                                            if (c2 != '\u2122') {
                                                                if (c2 != '\u0161') {
                                                                    if (c2 != '\u203a') {
                                                                        if (c2 != '\u0153') {
                                                                            if (c2 != '\u017e') {
                                                                                if (c2 == '\u0178') {
                                                                                    byArray[i2] = -97;
                                                                                    continue;
                                                                                }
                                                                                byArray[i2] = 63;
                                                                                continue;
                                                                            }
                                                                            byArray[i2] = -98;
                                                                            continue;
                                                                        }
                                                                        byArray[i2] = -100;
                                                                        continue;
                                                                    }
                                                                    byArray[i2] = -101;
                                                                    continue;
                                                                }
                                                                byArray[i2] = -102;
                                                                continue;
                                                            }
                                                            byArray[i2] = -103;
                                                            continue;
                                                        }
                                                        byArray[i2] = -104;
                                                        continue;
                                                    }
                                                    byArray[i2] = -110;
                                                    continue;
                                                }
                                                byArray[i2] = -111;
                                                continue;
                                            }
                                            byArray[i2] = -114;
                                            continue;
                                        }
                                        byArray[i2] = -118;
                                        continue;
                                    }
                                    byArray[i2] = -120;
                                    continue;
                                }
                                byArray[i2] = -121;
                                continue;
                            }
                            byArray[i2] = -122;
                            continue;
                        }
                        byArray[i2] = -124;
                        continue;
                    }
                    byArray[i2] = -125;
                    continue;
                }
                byArray[i2] = -128;
                continue;
            }
            byArray[i2] = (byte)c2;
        }
        return byArray;
    }
}

