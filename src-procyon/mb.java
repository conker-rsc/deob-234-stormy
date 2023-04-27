import java.net.*;
import java.io.*;

final class mb
{
    private static int b;
    static int[] i;
    static int[] a;
    static int[] k;
    static int l;
    static String[] g;
    
    static final synchronized byte[] a(final int arg0, final byte arg1) {
        if (arg0 == 100 && n.b > 0) {
            final byte[] array = ob.j[--n.b];
            ob.j[n.b] = null;
            return array;
        }
        if (arg0 == 5000 && s.d > 0) {
            final byte[] array2 = e.kb[--s.d];
            e.kb[s.d] = null;
            return array2;
        }
        if (arg1 > -97) {
            return null;
        }
        if (arg0 == 30000 && mb.b > 0) {
            final byte[] array3 = ca.tb[--mb.b];
            ca.tb[mb.b] = null;
            return array3;
        }
        if (t.n != null) {
            for (int n = 0; e.wb.length > n; ++n) {
                if (e.wb[n] == arg0 && v.g[n] > 0) {
                    final byte[][] array4 = t.n[n];
                    final int[] g = v.g;
                    final int n2 = n;
                    final int n3 = g[n2] - 1;
                    g[n2] = n3;
                    final byte[] array5 = array4[n3];
                    t.n[n][v.g[n]] = null;
                    return array5;
                }
            }
        }
        return new byte[arg0];
    }
    
    static final void a(final int arg0, final long arg1) {
        if (arg0 != 11200) {
            mb.g = null;
        }
        if (0L < arg1) {
            if (arg1 % 10L == 0L) {
                u.a(arg0 - 11200, -1L + arg1);
                u.a(0, 1L);
            }
            else {
                u.a(0, arg1);
            }
        }
    }
    
    static final String a(final int arg0, final int arg1) {
        String s = "" + arg0;
        for (int i = s.length() - 3; i > 0; i -= 3) {
            s = s.substring(0, i) + "," + s.substring(i);
        }
        if (arg1 != 131071) {
            a(null, -74, 53);
        }
        if (s.length() > 8) {
            s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
        }
        else if (s.length() > 4) {
            s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
        }
        return s;
    }
    
    static final String a(final String arg0, final String arg1, final boolean arg2, final int arg3) {
        if (!arg2) {
            mb.l = 90;
        }
        if (arg3 == 0) {
            if (arg1 != null && arg1.length() != 0) {
                return arg1 + ": " + arg0;
            }
            return arg0;
        }
        else if (arg3 != 1) {
            if (arg3 == 2) {
                if (arg1 != null && arg1.length() != 0) {
                    return "You tell " + arg1 + ": " + arg0;
                }
                return arg0;
            }
            else if (arg3 == 3) {
                if (arg1 != null && arg1.length() != 0) {
                    return arg1 + ": " + arg0;
                }
                return arg0;
            }
            else if (arg3 == 4) {
                if (arg1 == null || arg1.length() == 0) {
                    return arg0;
                }
                return arg1 + ": " + arg0;
            }
            else {
                if (arg3 == 5) {
                    return arg0;
                }
                if (arg3 == 6) {
                    return arg1 + " wishes to trade with you.";
                }
                if (arg3 != 7) {
                    return "";
                }
                if (arg1 == null || arg1.length() == 0) {
                    return arg0;
                }
                return arg1 + ": " + arg0;
            }
        }
        else {
            if (arg1 == null || arg1.length() == 0) {
                return arg0;
            }
            return arg1 + " tells you: " + arg0;
        }
    }
    
    static final void a(final int arg0, final Throwable arg1, final String arg2) {
        try {
            String s = "";
            if (arg0 != 2097151) {
                a(null, null, true, 27);
            }
            if (arg1 != null) {
                s = gb.a(false, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    s += " | ";
                }
                s += arg2;
            }
            n.a((byte)(-93), s);
            final String a = jb.a(true, "%23", "#", jb.a(true, "%26", "&", jb.a(true, "%40", "@", jb.a(true, "%3a", ":", s))));
            if (l.b == null) {
                return;
            }
            final g a2 = pa.b.a((byte)74, new URL(l.b.getCodeBase(), "clienterror.ws?c=" + db.d + "&u=" + ((ka.a != null) ? ka.a : ("" + pa.h)) + "&v1=" + c.q + "&v2=" + c.k + "&e=" + a));
            while (a2.b == 0) {
                a(11200, 1L);
            }
            if (a2.b == 1) {
                final DataInputStream dataInputStream = (DataInputStream)a2.d;
                dataInputStream.read();
                dataInputStream.close();
            }
        }
        catch (final Exception ex) {}
    }
    
    static final int a(final byte[] arg0, final int arg1, final int arg2) {
        if (arg2 != 0) {
            return 6;
        }
        return w.a(arg1, -49, arg0, 0);
    }
    
    static {
        mb.i = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        mb.b = 0;
        mb.l = 0;
    }
}
