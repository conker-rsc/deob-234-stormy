import java.lang.reflect.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.net.*;
import java.io.*;

final class c implements Runnable
{
    private boolean e;
    private q t;
    private Thread r;
    private Object x;
    private static String m;
    private static String p;
    private boolean j;
    private Object i;
    EventQueue n;
    static Method u;
    private static int b;
    private g a;
    private boolean c;
    private wa w;
    private static String g;
    static Method y;
    d f;
    d s;
    private static String h;
    d v;
    static String q;
    private d[] l;
    private static volatile long d;
    private g o;
    static String k;
    
    final g a(final String arg0, final int arg1, final int arg2) {
        if (arg2 > -66) {
            return null;
        }
        return this.a(arg1, (byte)81, arg0, false);
    }
    
    final g a(final boolean arg0, final Runnable arg1, final int arg2) {
        if (!arg0) {
            this.a(-34, 71, (byte)60, 103, null);
        }
        return this.a(2, 0, (byte)(-21), arg2, arg1);
    }
    
    private static final d a(final int arg0, final String arg1, final boolean arg2, final String arg3) {
        String s;
        if (arg0 != 33) {
            if (arg0 == 34) {
                s = "jagex_" + arg1 + "_preferences" + arg3 + "_wip.dat";
            }
            else {
                s = "jagex_" + arg1 + "_preferences" + arg3 + ".dat";
            }
        }
        else {
            s = "jagex_" + arg1 + "_preferences" + arg3 + "_rc.dat";
        }
        if (arg2) {
            return null;
        }
        final String[] array = { "c:/rscache/", "/rscache/", c.m, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (s2.length() <= 0 || new File(s2).exists()) {
                try {
                    return new d(new File(s2, s), "rw", 10000L);
                }
                catch (final Exception ex) {}
            }
        }
        return null;
    }
    
    @Override
    public final void run() {
        while (true) {
            g a = null;
            Label_0080: {
                synchronized (this) {
                    while (!this.e) {
                        if (this.a != null) {
                            a = this.a;
                            this.a = this.a.a;
                            if (this.a == null) {
                                this.o = null;
                            }
                            break Label_0080;
                        }
                        try {
                            this.wait();
                        }
                        catch (final InterruptedException ex) {}
                    }
                    return;
                }
                try {
                    final int g = a.g;
                    Label_1628: {
                        if (g == 1) {
                            if (p.a(0) < c.d) {
                                throw new IOException();
                            }
                            a.d = new Socket(InetAddress.getByName((String)a.f), a.e);
                        }
                        else if (g != 22) {
                            if (g == 2) {
                                final Thread d = new Thread((Runnable)a.f);
                                d.setDaemon(true);
                                d.start();
                                d.setPriority(a.e);
                                a.d = d;
                            }
                            else if (g != 4) {
                                if (g == 8) {
                                    final Object[] array = (Object[])a.f;
                                    if (this.j) {
                                        if (((Class)array[0]).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                    }
                                    a.d = ((Class)array[0]).getDeclaredMethod((String)array[1], (Class[])array[2]);
                                }
                                else if (g == 9) {
                                    final Object[] array2 = (Object[])a.f;
                                    if (this.j) {
                                        if (((Class)array2[0]).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                    }
                                    a.d = ((Class)array2[0]).getDeclaredField((String)array2[1]);
                                }
                                else if (g != 18) {
                                    if (g != 19) {
                                        if (!this.j) {
                                            throw new Exception("");
                                        }
                                        if (g == 3) {
                                            if (c.d > p.a(0)) {
                                                throw new IOException();
                                            }
                                            a.d = InetAddress.getByName((0xFF & a.e >> 24) + "." + (0xFF & a.e >> 16) + "." + ((0xFFC0 & a.e) >> 8) + "." + (0xFF & a.e)).getHostName();
                                        }
                                        else if (g != 21) {
                                            if (g != 5) {
                                                if (g != 6) {
                                                    if (g == 7) {
                                                        if (!this.c) {
                                                            Class.forName("ha").getMethod("exit", (Class<?>[])new Class[0]).invoke(this.i, new Object[0]);
                                                        }
                                                        else {
                                                            this.w.a((Frame)a.f, 0);
                                                        }
                                                    }
                                                    else if (g != 12) {
                                                        if (g == 13) {
                                                            a.d = a(c.b, "", false, (String)a.f);
                                                        }
                                                        else if (!this.j || g != 14) {
                                                            if (!this.j || g != 15) {
                                                                if (!this.c && g == 17) {
                                                                    final Object[] array3 = (Object[])a.f;
                                                                    Class.forName("j").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.x, array3[0], array3[1], new Integer(a.e), new Integer(a.c), array3[2]);
                                                                    break Label_1628;
                                                                }
                                                                if (g != 16) {
                                                                    throw new Exception("");
                                                                }
                                                                try {
                                                                    if (!c.g.startsWith("win")) {
                                                                        throw new Exception();
                                                                    }
                                                                    final String s = (String)a.f;
                                                                    if (!s.startsWith("http://") && !s.startsWith("https://")) {
                                                                        throw new Exception();
                                                                    }
                                                                    final String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                                    for (int i = 0; i < s.length(); ++i) {
                                                                        if (s2.indexOf(s.charAt(i)) == -1) {
                                                                            throw new Exception();
                                                                        }
                                                                    }
                                                                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
                                                                    a.d = null;
                                                                    break Label_1628;
                                                                }
                                                                catch (final Exception d2) {
                                                                    throw a.d = d2;
                                                                }
                                                            }
                                                            final boolean arg2 = a.e != 0;
                                                            final Component arg3 = (Component)a.f;
                                                            if (this.c) {
                                                                this.t.a(-4, arg3, arg2);
                                                            }
                                                            else {
                                                                Class.forName("j").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.x, arg3, new Boolean(arg2));
                                                            }
                                                        }
                                                        else {
                                                            final int e = a.e;
                                                            final int c = a.c;
                                                            if (this.c) {
                                                                this.t.a(23529, c, e);
                                                            }
                                                            else {
                                                                Class.forName("j").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.x, new Integer(e), new Integer(c));
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        a.d = a(c.b, c.p, false, (String)a.f);
                                                    }
                                                }
                                                else {
                                                    final Frame frame = new Frame("Jagex Full Screen");
                                                    ((Frame)(a.d = frame)).setResizable(false);
                                                    if (this.c) {
                                                        this.w.a(frame, a.c >> 16, a.c & 0xFFFF, a.e & 0xFFFF, a.e >>> 16, (byte)77);
                                                    }
                                                    else {
                                                        Class.forName("ha").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.i, frame, new Integer(a.e >>> 16), new Integer(0xFFFF & a.e), new Integer(a.c >> 16), new Integer(a.c & 0xFFFF));
                                                    }
                                                }
                                            }
                                            else if (this.c) {
                                                a.d = this.w.a((byte)(-100));
                                            }
                                            else {
                                                a.d = Class.forName("ha").getMethod("listmodes", (Class<?>[])new Class[0]).invoke(this.i, new Object[0]);
                                            }
                                        }
                                        else {
                                            if (p.a(0) < c.d) {
                                                throw new IOException();
                                            }
                                            a.d = InetAddress.getByName((String)a.f).getAddress();
                                        }
                                    }
                                    else {
                                        Toolkit.getDefaultToolkit().getSystemClipboard().setContents((Transferable)a.f, null);
                                    }
                                }
                                else {
                                    a.d = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                                }
                            }
                            else {
                                if (~p.a(0) > ~c.d) {
                                    throw new IOException();
                                }
                                a.d = new DataInputStream(((URL)a.f).openStream());
                            }
                        }
                        else {
                            if (~c.d < ~p.a(0)) {
                                throw new IOException();
                            }
                            try {
                                a.d = na.a(4718, a.e, (String)a.f).a((byte)50);
                            }
                            catch (final fa fa) {
                                a.d = fa.getMessage();
                                throw fa;
                            }
                        }
                    }
                    a.b = 1;
                }
                catch (final ThreadDeath threadDeath) {
                    throw threadDeath;
                }
                catch (final Throwable t) {
                    a.b = 2;
                }
            }
            synchronized (a) {
                a.notify();
            }
        }
    }
    
    private final g a(final int arg0, final byte arg1, final String arg2, final boolean arg3) {
        if (arg1 != 81) {
            this.a(3, (byte)(-100), null, true);
        }
        return this.a(arg3 ? 22 : 1, 0, (byte)(-21), arg0, arg2);
    }
    
    final g a(final byte arg0, final URL arg1) {
        if (arg0 != 74) {
            c.d = -110L;
        }
        return this.a(4, 0, (byte)(-21), 0, arg1);
    }
    
    final g a(final int arg0, final byte arg1) {
        return this.a(3, 0, (byte)(-21), arg0, null);
    }
    
    private final g a(final int arg0, final int arg1, final byte arg2, final int arg3, final Object arg4) {
        final g g = new g();
        g.e = arg3;
        g.g = arg0;
        g.c = arg1;
        g.f = arg4;
        synchronized (this) {
            if (this.o == null) {
                final g g2 = g;
                this.a = g2;
                this.o = g2;
            }
            else {
                this.o.a = g;
                this.o = g;
            }
            this.notify();
        }
        if (arg2 != -21) {
            c.k = null;
        }
        return g;
    }
    
    c(final int arg0, final String arg1, final int arg2, final boolean arg3) throws Exception {
        super();
        this.j = false;
        this.a = null;
        this.f = null;
        this.s = null;
        this.e = false;
        this.c = false;
        this.v = null;
        this.o = null;
        c.k = "1.1";
        c.b = arg0;
        c.q = "Unknown";
        c.p = arg1;
        this.j = arg3;
        try {
            c.q = System.getProperty("java.vendor");
            c.k = System.getProperty("java.version");
        }
        catch (final Exception ex) {}
        if (c.q.toLowerCase().indexOf("microsoft") != -1) {
            this.c = true;
        }
        try {
            c.h = System.getProperty("os.name");
        }
        catch (final Exception ex2) {
            c.h = "Unknown";
        }
        c.g = c.h.toLowerCase();
        try {
            System.getProperty("os.arch").toLowerCase();
        }
        catch (final Exception ex3) {}
        try {
            System.getProperty("os.version").toLowerCase();
        }
        catch (final Exception ex4) {}
        try {
            c.m = System.getProperty("user.home");
            if (c.m != null) {
                c.m += "/";
            }
        }
        catch (final Exception ex5) {}
        if (c.m == null) {
            c.m = "~/";
        }
        try {
            this.n = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (final Throwable t) {}
        if (!this.c) {
            try {
                c.u = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
            catch (final Exception ex6) {}
            try {
                c.y = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            }
            catch (final Exception ex7) {}
        }
        r.a(c.b, (byte)101, c.p);
        if (this.j) {
            this.s = new d(r.a(c.b, null, "random.dat", 0), "rw", 25L);
            this.f = new d(r.a(2, "main_file_cache.dat2"), "rw", 314572800L);
            this.v = new d(r.a(2, "main_file_cache.idx255"), "rw", 1048576L);
            this.l = new d[arg2];
            for (int n = 0; arg2 > n; ++n) {
                this.l[n] = new d(r.a(2, "main_file_cache.idx" + n), "rw", 1048576L);
            }
            if (this.c) {
                try {
                    Class.forName("rb").newInstance();
                }
                catch (final Throwable t2) {}
            }
            try {
                if (this.c) {
                    this.w = new wa();
                }
                else {
                    this.i = Class.forName("ha").newInstance();
                }
            }
            catch (final Throwable t3) {}
            try {
                if (!this.c) {
                    this.x = Class.forName("j").newInstance();
                }
                else {
                    this.t = new q();
                }
            }
            catch (final Throwable t4) {}
        }
        this.e = false;
        (this.r = new Thread(this)).setPriority(10);
        this.r.setDaemon(true);
        this.r.start();
    }
    
    static {
        c.d = 0L;
    }
}
