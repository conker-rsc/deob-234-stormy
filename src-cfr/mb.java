/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.net.URL;

final class mb {
    private static int b;
    static int[] i;
    static int[] a;
    static int[] k;
    static int l;
    static String[] g;

    static final synchronized byte[] a(int arg0, byte arg1) {
        if (arg0 == 100 && n.b > 0) {
            byte[] byArray = ob.j[--n.b];
            ob.j[n.b] = null;
            return byArray;
        }
        if (arg0 == 5000 && s.d > 0) {
            byte[] byArray = e.kb[--s.d];
            e.kb[s.d] = null;
            return byArray;
        }
        if (arg1 > -97) {
            return null;
        }
        if (arg0 == 30000 && b > 0) {
            byte[] byArray = ca.tb[--b];
            ca.tb[mb.b] = null;
            return byArray;
        }
        if (t.n != null) {
            for (int i2 = 0; e.wb.length > i2; ++i2) {
                if (e.wb[i2] != arg0 || v.g[i2] <= 0) continue;
                int n2 = i2;
                int n3 = v.g[n2] - 1;
                v.g[n2] = n3;
                byte[] byArray = t.n[i2][n3];
                t.n[i2][v.g[i2]] = null;
                return byArray;
            }
        }
        return new byte[arg0];
    }

    static final void a(int arg0, long arg1) {
        if (arg0 != 11200) {
            g = null;
        }
        if (0L >= arg1) {
            return;
        }
        if (arg1 % 10L == 0L) {
            u.a(arg0 - 11200, -1L + arg1);
            u.a(0, 1L);
        } else {
            u.a(0, arg1);
        }
    }

    static final String a(int arg0, int arg1) {
        String string = "" + arg0;
        for (int i2 = string.length() - 3; i2 > 0; i2 -= 3) {
            string = string.substring(0, i2) + "," + string.substring(i2);
        }
        if (arg1 != 131071) {
            mb.a(null, -74, 53);
        }
        if (string.length() > 8) {
            string = "@gre@" + string.substring(0, string.length() - 8) + " million @whi@(" + string + ")";
        } else if (string.length() > 4) {
            string = "@cya@" + string.substring(0, string.length() - 4) + "K @whi@(" + string + ")";
        }
        return string;
    }

    static final String a(String arg0, String arg1, boolean arg2, int arg3) {
        block14: {
            block15: {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                block9: {
                                    block8: {
                                        block7: {
                                            int n2;
                                            if (!arg2) {
                                                l = 90;
                                            }
                                            if ((n2 = arg3) == 0) break block7;
                                            if (n2 == 1) break block8;
                                            if (n2 == 2) break block9;
                                            if (n2 == 3) break block10;
                                            if (n2 == 4) break block11;
                                            if (n2 == 5) break block12;
                                            if (n2 == 6) break block13;
                                            if (n2 != 7) break block14;
                                            break block15;
                                        }
                                        if (arg1 != null && arg1.length() != 0) {
                                            return arg1 + ": " + arg0;
                                        }
                                        return arg0;
                                    }
                                    if (arg1 == null || arg1.length() == 0) {
                                        return arg0;
                                    }
                                    return arg1 + " tells you: " + arg0;
                                }
                                if (arg1 == null || arg1.length() == 0) {
                                    return arg0;
                                }
                                return "You tell " + arg1 + ": " + arg0;
                            }
                            if (arg1 != null && arg1.length() != 0) {
                                return arg1 + ": " + arg0;
                            }
                            return arg0;
                        }
                        if (arg1 == null || arg1.length() == 0) {
                            return arg0;
                        }
                        return arg1 + ": " + arg0;
                    }
                    return arg0;
                }
                return arg1 + " wishes to trade with you.";
            }
            if (arg1 == null || arg1.length() == 0) {
                return arg0;
            }
            return arg1 + ": " + arg0;
        }
        return "";
    }

    static final void a(int arg0, Throwable arg1, String arg2) {
        try {
            String string = "";
            if (arg0 != 0x1FFFFF) {
                mb.a(null, null, true, 27);
            }
            if (arg1 != null) {
                string = gb.a(false, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    string = string + " | ";
                }
                string = string + arg2;
            }
            n.a((byte)-93, string);
            string = jb.a(true, "%3a", ":", string);
            string = jb.a(true, "%40", "@", string);
            string = jb.a(true, "%26", "&", string);
            string = jb.a(true, "%23", "#", string);
            if (l.b == null) {
                return;
            }
            g g2 = pa.b.a((byte)74, new URL(l.b.getCodeBase(), "clienterror.ws?c=" + db.d + "&u=" + (ka.a != null ? ka.a : "" + pa.h) + "&v1=" + c.q + "&v2=" + c.k + "&e=" + string));
            while (g2.b == 0) {
                mb.a(11200, 1L);
            }
            if (g2.b == 1) {
                DataInputStream dataInputStream = (DataInputStream)g2.d;
                dataInputStream.read();
                dataInputStream.close();
            }
        }
        catch (Exception exception) {}
    }

    static final int a(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return 6;
        }
        return w.a(arg1, -49, arg0, 0);
    }

    static {
        i = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
        b = 0;
        l = 0;
    }
}

