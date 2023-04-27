/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class c
implements Runnable {
    private boolean e = false;
    private q t;
    private Thread r;
    private Object x;
    private static String m;
    private static String p;
    private boolean j = false;
    private Object i;
    EventQueue n;
    static Method u;
    private static int b;
    private g a = null;
    private boolean c = false;
    private wa w;
    private static String g;
    static Method y;
    d f = null;
    d s = null;
    private static String h;
    d v = null;
    static String q;
    private d[] l;
    private static volatile long d;
    private g o = null;
    static String k;

    final g a(String arg0, int arg1, int arg2) {
        if (arg2 > -66) {
            return null;
        }
        return this.a(arg1, (byte)81, arg0, false);
    }

    final g a(boolean arg0, Runnable arg1, int arg2) {
        if (!arg0) {
            this.a(-34, 71, (byte)60, 103, null);
        }
        return this.a(2, 0, (byte)-21, arg2, arg1);
    }

    private static final d a(int arg0, String arg1, boolean arg2, String arg3) {
        String string = arg0 != 33 ? (arg0 == 34 ? "jagex_" + arg1 + "_preferences" + arg3 + "_wip.dat" : "jagex_" + arg1 + "_preferences" + arg3 + ".dat") : "jagex_" + arg1 + "_preferences" + arg3 + "_rc.dat";
        if (arg2) {
            return null;
        }
        String[] stringArray = new String[]{"c:/rscache/", "/rscache/", m, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (string2.length() > 0 && !new File(string2).exists()) continue;
            try {
                d d2 = new d(new File(string2, string), "rw", 10000L);
                return d2;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        while (true) {
            g g2;
            Object object = this;
            synchronized (object) {
                while (true) {
                    if (this.e) {
                        return;
                    }
                    if (this.a != null) {
                        g2 = this.a;
                        this.a = this.a.a;
                        if (this.a != null) break;
                        this.o = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                int n2 = g2.g;
                if (n2 == 1) {
                    if (p.a(0) < d) {
                        throw new IOException();
                    }
                    g2.d = new Socket(InetAddress.getByName((String)g2.f), g2.e);
                } else if (n2 != 22) {
                    if (n2 == 2) {
                        Thread thread = new Thread((Runnable)g2.f);
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(g2.e);
                        g2.d = thread;
                    } else if (n2 != 4) {
                        if (n2 == 8) {
                            Object[] objectArray = (Object[])g2.f;
                            if (this.j && ((Class)objectArray[0]).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            g2.d = ((Class)objectArray[0]).getDeclaredMethod((String)objectArray[1], (Class[])objectArray[2]);
                        } else if (n2 == 9) {
                            Object[] objectArray = (Object[])g2.f;
                            if (this.j && ((Class)objectArray[0]).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            g2.d = ((Class)objectArray[0]).getDeclaredField((String)objectArray[1]);
                        } else if (n2 != 18) {
                            if (n2 != 19) {
                                if (!this.j) throw new Exception("");
                                if (n2 == 3) {
                                    if (d > p.a(0)) {
                                        throw new IOException();
                                    }
                                    String string = (0xFF & g2.e >> 24) + "." + (0xFF & g2.e >> 16) + "." + ((0xFFC0 & g2.e) >> 8) + "." + (0xFF & g2.e);
                                    g2.d = InetAddress.getByName(string).getHostName();
                                } else if (n2 != 21) {
                                    if (n2 != 5) {
                                        if (n2 != 6) {
                                            if (n2 == 7) {
                                                if (!this.c) {
                                                    Class.forName("ha").getMethod("exit", new Class[0]).invoke(this.i, new Object[0]);
                                                } else {
                                                    this.w.a((Frame)g2.f, 0);
                                                }
                                            } else if (n2 != 12) {
                                                if (n2 == 13) {
                                                    d d2 = c.a(b, "", false, (String)g2.f);
                                                    g2.d = d2;
                                                } else if (!this.j || n2 != 14) {
                                                    if (!this.j || n2 != 15) {
                                                        if (!this.c && n2 == 17) {
                                                            Object[] objectArray = (Object[])g2.f;
                                                            Class.forName("j").getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this.x, objectArray[0], objectArray[1], new Integer(g2.e), new Integer(g2.c), objectArray[2]);
                                                        } else {
                                                            if (n2 != 16) {
                                                                throw new Exception("");
                                                            }
                                                            try {
                                                                if (!g.startsWith("win")) {
                                                                    throw new Exception();
                                                                }
                                                                String string = (String)g2.f;
                                                                if (!string.startsWith("http://") && !string.startsWith("https://")) {
                                                                    throw new Exception();
                                                                }
                                                                String string2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                                for (int i2 = 0; i2 < string.length(); ++i2) {
                                                                    if (string2.indexOf(string.charAt(i2)) != -1) continue;
                                                                    throw new Exception();
                                                                }
                                                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                                                g2.d = null;
                                                            }
                                                            catch (Exception exception) {
                                                                g2.d = exception;
                                                                throw exception;
                                                            }
                                                        }
                                                    } else {
                                                        boolean bl = g2.e != 0;
                                                        Component component = (Component)g2.f;
                                                        if (this.c) {
                                                            this.t.a(-4, component, bl);
                                                        } else {
                                                            Class.forName("j").getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this.x, component, new Boolean(bl));
                                                        }
                                                    }
                                                } else {
                                                    int n3 = g2.e;
                                                    int n4 = g2.c;
                                                    if (this.c) {
                                                        this.t.a(23529, n4, n3);
                                                    } else {
                                                        Class.forName("j").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.x, new Integer(n3), new Integer(n4));
                                                    }
                                                }
                                            } else {
                                                d d3 = c.a(b, p, false, (String)g2.f);
                                                g2.d = d3;
                                            }
                                        } else {
                                            Frame frame = new Frame("Jagex Full Screen");
                                            g2.d = frame;
                                            frame.setResizable(false);
                                            if (this.c) {
                                                this.w.a(frame, g2.c >> 16, g2.c & 0xFFFF, g2.e & 0xFFFF, g2.e >>> 16, (byte)77);
                                            } else {
                                                Class.forName("ha").getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.i, frame, new Integer(g2.e >>> 16), new Integer(0xFFFF & g2.e), new Integer(g2.c >> 16), new Integer(g2.c & 0xFFFF));
                                            }
                                        }
                                    } else {
                                        g2.d = this.c ? (Object)this.w.a((byte)-100) : Class.forName("ha").getMethod("listmodes", new Class[0]).invoke(this.i, new Object[0]);
                                    }
                                } else {
                                    if (p.a(0) < d) {
                                        throw new IOException();
                                    }
                                    g2.d = InetAddress.getByName((String)g2.f).getAddress();
                                }
                            } else {
                                Transferable transferable = (Transferable)g2.f;
                                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                clipboard.setContents(transferable, null);
                            }
                        } else {
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                            g2.d = clipboard.getContents(null);
                        }
                    } else {
                        if ((p.a(0) ^ 0xFFFFFFFFFFFFFFFFL) > (d ^ 0xFFFFFFFFFFFFFFFFL)) {
                            throw new IOException();
                        }
                        g2.d = new DataInputStream(((URL)g2.f).openStream());
                    }
                } else {
                    if ((d ^ 0xFFFFFFFFFFFFFFFFL) < (p.a(0) ^ 0xFFFFFFFFFFFFFFFFL)) {
                        throw new IOException();
                    }
                    try {
                        g2.d = na.a(4718, g2.e, (String)g2.f).a((byte)50);
                    }
                    catch (fa fa2) {
                        g2.d = fa2.getMessage();
                        throw fa2;
                    }
                }
                g2.b = 1;
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
            catch (Throwable throwable) {
                g2.b = 2;
            }
            object = g2;
            synchronized (object) {
                g2.notify();
            }
        }
    }

    private final g a(int arg0, byte arg1, String arg2, boolean arg3) {
        if (arg1 != 81) {
            this.a(3, (byte)-100, null, true);
        }
        return this.a(arg3 ? 22 : 1, 0, (byte)-21, arg0, arg2);
    }

    final g a(byte arg0, URL arg1) {
        if (arg0 != 74) {
            d = -110L;
        }
        return this.a(4, 0, (byte)-21, 0, arg1);
    }

    final g a(int arg0, byte arg1) {
        return this.a(3, 0, (byte)-21, arg0, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final g a(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        g g2 = new g();
        g2.e = arg3;
        g2.g = arg0;
        g2.c = arg1;
        g2.f = arg4;
        c c2 = this;
        synchronized (c2) {
            if (this.o == null) {
                this.o = this.a = g2;
            } else {
                this.o.a = g2;
                this.o = g2;
            }
            this.notify();
        }
        if (arg2 != -21) {
            k = null;
        }
        return g2;
    }

    c(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        k = "1.1";
        b = arg0;
        q = "Unknown";
        p = arg1;
        this.j = arg3;
        try {
            q = System.getProperty("java.vendor");
            k = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (q.toLowerCase().indexOf("microsoft") != -1) {
            this.c = true;
        }
        try {
            h = System.getProperty("os.name");
        }
        catch (Exception exception) {
            h = "Unknown";
        }
        g = h.toLowerCase();
        try {
            System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            System.getProperty("os.version").toLowerCase();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            m = System.getProperty("user.home");
            if (m != null) {
                m = m + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (m == null) {
            m = "~/";
        }
        try {
            this.n = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (!this.c) {
            try {
                u = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                y = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        r.a(b, (byte)101, p);
        if (this.j) {
            this.s = new d(r.a(b, null, "random.dat", 0), "rw", 25L);
            this.f = new d(r.a(2, "main_file_cache.dat2"), "rw", 314572800L);
            this.v = new d(r.a(2, "main_file_cache.idx255"), "rw", 0x100000L);
            this.l = new d[arg2];
            for (int i2 = 0; arg2 > i2; ++i2) {
                this.l[i2] = new d(r.a(2, "main_file_cache.idx" + i2), "rw", 0x100000L);
            }
            if (this.c) {
                try {
                    Class.forName("rb").newInstance();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            try {
                if (this.c) {
                    this.w = new wa();
                } else {
                    this.i = Class.forName("ha").newInstance();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (!this.c) {
                    this.x = Class.forName("j").newInstance();
                } else {
                    this.t = new q();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this.e = false;
        this.r = new Thread(this);
        this.r.setPriority(10);
        this.r.setDaemon(true);
        this.r.start();
    }

    static {
        d = 0L;
    }
}

