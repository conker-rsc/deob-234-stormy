/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

public class e
extends Applet
implements Runnable,
MouseListener,
MouseMotionListener,
KeyListener {
    int K;
    private int n = 1;
    long[] F = new long[10];
    static byte[][] kb = new byte[250][];
    String p = null;
    static String[] Mb;
    Thread z = null;
    private int Ib = 20;
    Font tb = new Font("TimesRoman", 0, 15);
    private boolean hb = false;
    String B = "Loading";
    private int a = 384;
    boolean N = false;
    static int[] nb;
    int Eb;
    static v i;
    int sb = 0;
    private int m = 512;
    private int S = 1000;
    private int b = 0;
    private int vb = 0;
    private int V = 0;
    static int[] wb;
    Font X = new Font("Helvetica", 1, 13);
    Font Jb = new Font("Helvetica", 0, 12);
    Graphics u;
    Image C;
    int I = 0;
    String e = "";
    private boolean Kb = false;
    int xb = 0;
    String x = "";
    boolean U = false;
    int Bb = 0;
    boolean gb = false;
    String Cb = "";
    boolean E = false;
    int Q = 1;
    boolean bb = false;
    boolean Z = false;
    int Qb = 0;
    String Ob = "";
    public static int Ab;
    public static boolean T;
    public static boolean H;
    public static int zb;
    public static int v;
    public static boolean ib;
    public static int lb;

    @Override
    public final String getParameter(String arg0) {
        if (kb.a != null) {
            return null;
        }
        if (da.gb != null) {
            return da.gb.getParameter(arg0);
        }
        return super.getParameter(arg0);
    }

    private final void b(int arg0) {
        block1: {
            this.vb = -2;
            System.out.println("Closing program");
            this.a(false);
            mb.a(11200, 1000L);
            if (arg0 != 100) {
                this.e(27);
            }
            if (kb.a == null) break block1;
            kb.a.dispose();
            System.exit(0);
        }
    }

    @Override
    public final void run() {
        try {
            int n2;
            if (this.n == 1) {
                this.n = 2;
                while (!this.isDisplayable() && this.vb >= 0) {
                    if (this.vb > 0) {
                        --this.vb;
                        if (this.vb == 0) {
                            this.b(100);
                            this.z = null;
                            return;
                        }
                    }
                    mb.a(11200, (long)this.Ib);
                }
                if (this.vb < 0) {
                    if (this.vb == -1) {
                        this.b(100);
                    }
                    this.z = null;
                    return;
                }
                if (!this.b((byte)118)) {
                    if (this.vb != -2) {
                        this.b(100);
                    }
                    this.z = null;
                    return;
                }
                this.a((byte)-92);
                this.n = 0;
            }
            if (kb.a != null) {
                kb.a.addMouseListener(this);
                kb.a.addMouseMotionListener(this);
                kb.a.addKeyListener(this);
            } else if (da.gb == null) {
                this.addMouseListener(this);
                this.addMouseMotionListener(this);
                this.addKeyListener(this);
            } else {
                da.gb.addMouseListener(this);
                da.gb.addMouseMotionListener(this);
                da.gb.addKeyListener(this);
            }
            int n3 = 0;
            int n4 = 256;
            int n5 = 1;
            int n6 = 0;
            for (n2 = 0; n2 < 10; ++n2) {
                this.F[n2] = p.a(0);
            }
            long l2 = p.a(0);
            while (this.vb >= 0) {
                int n7;
                if (this.vb > 0) {
                    --this.vb;
                    if (this.vb == 0) {
                        this.b(100);
                        this.z = null;
                        return;
                    }
                }
                n2 = n4;
                n4 = 300;
                int n8 = n5;
                n5 = 1;
                l2 = p.a(0);
                if ((this.F[n3] ^ 0xFFFFFFFFFFFFFFFFL) == -1L) {
                    n5 = n8;
                    n4 = n2;
                } else if ((l2 ^ 0xFFFFFFFFFFFFFFFFL) < (this.F[n3] ^ 0xFFFFFFFFFFFFFFFFL)) {
                    n4 = (int)((long)(this.Ib * 2560) / (l2 + -this.F[n3]));
                }
                if (n4 < 25) {
                    n4 = 25;
                }
                if (n4 > 256) {
                    n4 = 256;
                    n5 = (int)(-((-this.F[n3] + l2) / 10L) + (long)this.Ib);
                    if (n5 < this.Q) {
                        n5 = this.Q;
                    }
                }
                mb.a(11200, (long)n5);
                this.F[n3] = l2;
                if (n5 > 1) {
                    for (n7 = 0; n7 < 10; ++n7) {
                        if (-1L == (this.F[n7] ^ 0xFFFFFFFFFFFFFFFFL)) continue;
                        int n9 = n7;
                        this.F[n9] = this.F[n9] + (long)n5;
                    }
                }
                n3 = (1 + n3) % 10;
                n7 = 0;
                while (n6 < 256) {
                    this.e(119);
                    n6 += n4;
                    if (this.S >= ++n7) continue;
                    n6 = 0;
                    this.b += 6;
                    if (this.b <= 25) break;
                    this.b = 0;
                    this.U = true;
                    break;
                }
                --this.b;
                n6 &= 0xFF;
                this.b(false);
            }
            if (this.vb == -1) {
                this.b(100);
            }
            this.z = null;
        }
        catch (Exception exception) {
            mb.a(0x1FFFFF, exception, null);
            this.a("crash", true);
        }
    }

    @Override
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.a(arg0, (byte)-128);
        char c2 = arg0.getKeyChar();
        int n2 = arg0.getKeyCode();
        if ((char)c2 != ' ') {
            // empty if block
        }
        if (n2 == 40) {
            // empty if block
        }
        if ((char)c2 == 'N' || (char)c2 != 'M') {
            // empty if block
        }
        if (n2 == 39) {
            this.E = false;
        }
        if ((char)c2 == 'n' || (char)c2 != 'm') {
            // empty if block
        }
        if ((char)c2 != '{') {
            // empty if block
        }
        if (n2 == 37) {
            this.Z = false;
        }
        if (n2 == 38) {
            // empty if block
        }
        if ((char)c2 == '}') {
            // empty if block
        }
    }

    synchronized void b(boolean arg0) {
        if (arg0) {
            return;
        }
    }

    synchronized void e(int arg0) {
        if (arg0 < 64) {
            return;
        }
    }

    @Override
    public final void paint(Graphics arg0) {
        block1: {
            block0: {
                this.N = true;
                if (this.n == 2 && this.C != null) break block0;
                if (this.n != 0) break block1;
                this.a(-89);
                break block1;
            }
            this.a(this.B, this.V, 126);
        }
    }

    private final void a(String arg0, int arg1, int arg2) {
        try {
            int n2 = (this.m - 281) / 2;
            int n3 = (this.a - 148) / 2;
            this.u.setColor(Color.black);
            this.u.fillRect(0, 0, this.m, this.a);
            if (!this.hb) {
                this.u.drawImage(this.C, n2, n3, this);
            }
            n2 += 2;
            this.V = arg1;
            n3 += 90;
            this.B = arg0;
            if (arg2 <= 97) {
                this.mouseReleased(null);
            }
            this.u.setColor(new Color(132, 132, 132));
            if (this.hb) {
                this.u.setColor(new Color(220, 0, 0));
            }
            this.u.drawRect(n2 - 2, n3 - 2, 280, 23);
            this.u.fillRect(n2, n3, 277 * arg1 / 100, 20);
            this.u.setColor(new Color(198, 198, 198));
            if (this.hb) {
                this.u.setColor(new Color(255, 255, 255));
            }
            this.a(this.tb, arg0, 10 + n3, true, 138 + n2, this.u);
            if (!this.hb) {
                this.a(this.X, "Created by JAGeX - visit www.jagex.com", 30 + n3, true, n2 + 138, this.u);
                this.a(this.X, "\u00a9 2001-2015 Jagex Ltd", n3 + 44, true, n2 + 138, this.u);
            } else {
                this.u.setColor(new Color(132, 132, 152));
                this.a(this.Jb, "\u00a9 2001-2015 Jagex Ltd", this.a - 20, true, 138 + n2, this.u);
            }
            if (this.p != null) {
                this.u.setColor(Color.white);
                this.a(this.X, this.p, n3 - 120, true, n2 + 138, this.u);
            }
        }
        catch (Exception exception) {}
    }

    @Override
    public final synchronized void mouseReleased(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
        this.I = arg0.getX() + -this.Eb;
        this.xb = arg0.getY() + -this.K;
        this.Bb = 0;
    }

    final void a(int arg0, byte arg1, String arg2) {
        block4: {
            try {
                int n2 = (this.m - 281) / 2;
                n2 += 2;
                int n3 = (this.a - 148) / 2;
                this.B = arg2;
                this.V = arg0;
                n3 += 90;
                int n4 = 277 * arg0 / 100;
                this.u.setColor(new Color(132, 132, 132));
                if (this.hb) {
                    this.u.setColor(new Color(220, 0, 0));
                }
                this.u.fillRect(n2, n3, n4, 20);
                this.u.setColor(Color.black);
                this.u.fillRect(n4 + n2, n3, -n4 + 277, 20);
                this.u.setColor(new Color(198, 198, 198));
                if (this.hb) {
                    this.u.setColor(new Color(255, 255, 255));
                }
                this.a(this.tb, arg2, 10 + n3, true, 138 + n2, this.u);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (arg1 <= -96) break block4;
            this.x = null;
        }
    }

    private final Image a(byte[] arg0, byte arg1) {
        if (arg1 != -54) {
            this.Ob = null;
        }
        return pa.a(79, this, arg0);
    }

    public static final void provideLoaderApplet(Applet arg0) {
        da.gb = arg0;
    }

    final void a(int arg0) {
        if (arg0 >= -54) {
            return;
        }
    }

    @Override
    public final URL getDocumentBase() {
        if (kb.a != null) {
            return null;
        }
        if (da.gb != null) {
            return da.gb.getDocumentBase();
        }
        return super.getDocumentBase();
    }

    final void a(boolean arg0, String arg1, int arg2, String arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        try {
            System.out.println("Started application");
            this.m = arg7;
            this.a = arg8;
            kb.a = new qb(this, 800, 600, arg1, arg0, false);
            try {
                kb.a.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE).invoke(kb.a, Boolean.FALSE);
            }
            catch (Exception exception) {
                // empty catch block
            }
            db.d = arg6;
            this.n = 1;
            pa.b = pa.k = new c(arg2, arg3, 0, true);
            try {
                if (arg5 <= 20) {
                    return;
                }
                cb.a(new URL("http", "127.0.0.1", arg4, ""), this, -91);
            }
            catch (IOException iOException) {
                mb.a(0x1FFFFF, iOException, null);
            }
            this.z = new Thread(this);
            this.z.start();
            this.z.setPriority(1);
        }
        catch (Exception exception) {
            mb.a(0x1FFFFF, exception, null);
        }
    }

    private final boolean b(byte arg0) {
        byte[] byArray = this.a("Jagex library", 0, 3, 85);
        if (byArray == null) {
            return false;
        }
        if (arg0 != 118) {
            this.B = null;
        }
        byte[] byArray2 = na.a("logo.tga", 0, byArray, -120);
        this.C = this.a(byArray2, (byte)-54);
        if (!qa.a(this, "h11p", 0, arg0 - 118)) {
            return false;
        }
        if (!qa.a(this, "h12b", 1, 0)) {
            return false;
        }
        if (!qa.a(this, "h12p", 2, 0)) {
            return false;
        }
        if (!qa.a(this, "h13b", 3, 0)) {
            return false;
        }
        if (!qa.a(this, "h14b", 4, arg0 - 118)) {
            return false;
        }
        if (!qa.a(this, "h16b", 5, 0)) {
            return false;
        }
        if (!qa.a(this, "h20b", 6, arg0 ^ 0x76)) {
            return false;
        }
        return qa.a(this, "h24b", 7, arg0 - 118);
    }

    void a(boolean arg0) {
        block0: {
            if (!arg0) break block0;
            this.vb = 85;
        }
    }

    @Override
    public final AppletContext getAppletContext() {
        if (kb.a != null) {
            return null;
        }
        if (da.gb != null) {
            return da.gb.getAppletContext();
        }
        return super.getAppletContext();
    }

    void a(int arg0, int arg1, int arg2, int arg3) {
        block0: {
            if (arg1 >= 87) break block0;
            this.z = null;
        }
    }

    private final void a(String arg0, boolean arg1) {
        if (this.Kb) {
            return;
        }
        this.Kb = arg1;
        System.out.println("error_game_" + arg0);
        try {
            if (da.gb != null) {
                a.a("loggedout", (byte)82, da.gb);
            } else {
                a.a("loggedout", (byte)-73, this);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        }
        catch (Exception exception) {}
    }

    @Override
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() - this.K;
        this.Bb = arg0.isMetaDown() ? 2 : 1;
    }

    final void a(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            System.out.println("Started applet");
            this.n = 1;
            this.m = arg4;
            this.a = arg0;
            nb.s = this.getCodeBase();
            db.d = arg1;
            if (pa.k == null) {
                pa.b = pa.k = new c(arg2, null, 0, da.gb != null);
            }
            if (arg3 != 2) {
                return;
            }
            if (da.gb != null) {
                Method method;
                Method method2 = c.y;
                if (method2 != null) {
                    try {
                        method2.invoke(da.gb, Boolean.TRUE);
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if ((method = c.u) != null) {
                    try {
                        method.invoke(da.gb, Boolean.FALSE);
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
            }
            try {
                cb.a(this.getCodeBase(), this, arg3 - 110);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.a(arg3 - 1, this);
        }
        catch (Exception exception) {
            mb.a(arg3 ^ 0x1FFFFD, exception, null);
            this.a("crash", true);
        }
    }

    @Override
    public final void mouseEntered(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
    }

    final boolean d(int arg0) {
        Graphics graphics = this.getGraphics();
        if (graphics == null) {
            return false;
        }
        if (arg0 != 2) {
            this.sb = -7;
        }
        this.u = graphics.create();
        this.u.translate(this.Eb, this.K);
        this.u.setColor(Color.black);
        this.u.fillRect(0, 0, this.m, this.a);
        this.a("Loading...", 0, arg0 ^ 0x67);
        return true;
    }

    private final void a(InputEvent arg0, byte arg1) {
        if (arg1 > -127) {
            return;
        }
        int n2 = arg0.getModifiers();
        this.bb = (n2 & 2) != 0;
        this.gb = (n2 & 1) != 0;
    }

    @Override
    public final Dimension getSize() {
        if (kb.a != null) {
            return kb.a.getSize();
        }
        if (da.gb != null) {
            return da.gb.getSize();
        }
        return super.getSize();
    }

    @Override
    public final Graphics getGraphics() {
        if (kb.a != null) {
            return kb.a.getGraphics();
        }
        if (da.gb != null) {
            return da.gb.getGraphics();
        }
        return super.getGraphics();
    }

    @Override
    public final URL getCodeBase() {
        if (kb.a != null) {
            return null;
        }
        if (da.gb != null) {
            return da.gb.getCodeBase();
        }
        return super.getCodeBase();
    }

    @Override
    public final void mouseClicked(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
    }

    @Override
    public final Image createImage(int arg0, int arg1) {
        if (kb.a != null) {
            return kb.a.createImage(arg0, arg1);
        }
        if (da.gb != null) {
            return da.gb.createImage(arg0, arg1);
        }
        return super.createImage(arg0, arg1);
    }

    final void a(Font arg0, String arg1, int arg2, boolean arg3, int arg4, Graphics arg5) {
        Container container = kb.a == null ? this : kb.a;
        FontMetrics fontMetrics = container.getFontMetrics(arg0);
        fontMetrics.stringWidth(arg1);
        if (!arg3) {
            this.c(68);
        }
        arg5.setFont(arg0);
        arg5.drawString(arg1, arg4 + -(fontMetrics.stringWidth(arg1) / 2), arg2 - -(fontMetrics.getHeight() / 4));
    }

    @Override
    public final void destroy() {
        block1: {
            this.vb = -1;
            mb.a(11200, 5000L);
            if (this.vb != -1) break block1;
            System.out.println("5 seconds expired, forcing kill");
            this.b(100);
            if (this.z != null) {
                this.z.stop();
                this.z = null;
            }
        }
    }

    void a(byte arg0, int arg1) {
        block0: {
            if (arg0 > 105) break block0;
            this.a((InputEvent)null, (byte)83);
        }
    }

    @Override
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() + -this.K;
        this.sb = 0;
        this.Bb = 0;
    }

    final void c(int arg0) {
        if (arg0 != -28492) {
            return;
        }
        for (int i2 = 0; i2 < 10; ++i2) {
            this.F[i2] = 0L;
        }
    }

    final byte[] a(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 53) {
            this.c(15);
        }
        try {
            return ib.a(-101, arg0, arg1, arg2);
        }
        catch (IOException iOException) {
            mb.a(0x1FFFFF, iOException, "Unable to load content pack " + arg2);
            return null;
        }
    }

    @Override
    public final void keyTyped(KeyEvent arg0) {
        this.a(arg0, (byte)-128);
    }

    @Override
    public final void start() {
        block0: {
            if (this.vb < 0) break block0;
            this.vb = 0;
        }
    }

    @Override
    public final void mouseExited(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
    }

    @Override
    public final synchronized void mousePressed(MouseEvent arg0) {
        this.a(arg0, (byte)-128);
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() + -this.K;
        this.Bb = !arg0.isMetaDown() ? 1 : 2;
        this.Qb = this.Bb;
        this.sb = 0;
        this.a(this.I, 94, this.Bb, this.xb);
    }

    void a(byte arg0) {
        block0: {
            if (arg0 == -92) break block0;
            e.provideLoaderApplet(null);
        }
    }

    @Override
    public final synchronized void keyPressed(KeyEvent arg0) {
        block15: {
            this.a(arg0, (byte)-128);
            char c2 = arg0.getKeyChar();
            int n2 = arg0.getKeyCode();
            this.a((byte)126, c2);
            if (n2 == 112) {
                boolean bl = this.U = !this.U;
            }
            if ((char)c2 == 'N' || (char)c2 != 'M') {
                // empty if block
            }
            if ((char)c2 == ' ') {
                // empty if block
            }
            if ((char)c2 != '{') {
                // empty if block
            }
            this.sb = 0;
            if ((char)c2 == 'n' || (char)c2 != 'm') {
                // empty if block
            }
            if (n2 != 40) {
                // empty if block
            }
            if (n2 == 39) {
                this.E = true;
            }
            if ((char)c2 == '}') {
                // empty if block
            }
            if (n2 == 38) {
                // empty if block
            }
            if (n2 == 37) {
                this.Z = true;
            }
            boolean bl = false;
            for (int i2 = 0; i2 < i.f.length(); ++i2) {
                if (c2 != i.f.charAt(i2)) continue;
                bl = true;
                break;
            }
            if (bl && this.e.length() < 20) {
                this.e = this.e + (char)c2;
            }
            if (bl && this.x.length() < 80) {
                this.x = this.x + (char)c2;
            }
            if (c2 == '\b' && this.e.length() > 0) {
                this.e = this.e.substring(0, this.e.length() - 1);
            }
            if (c2 == '\b' && this.x.length() > 0) {
                this.x = this.x.substring(0, this.x.length() - 1);
            }
            if (c2 != '\n' && c2 != '\r') break block15;
            this.Cb = this.e;
            this.Ob = this.x;
        }
    }

    final void a(int arg0, byte arg1) {
        block0: {
            this.Ib = 1000 / arg0;
            if (arg1 > 104) break block0;
            this.Eb = 113;
        }
    }

    @Override
    public final void stop() {
        block0: {
            if (this.vb < 0) break block0;
            this.vb = 4000 / this.Ib;
        }
    }

    @Override
    public final boolean isDisplayable() {
        if (kb.a != null) {
            return kb.a.getPeer() != null;
        }
        if (da.gb != null) {
            return da.gb.getPeer() != null;
        }
        return super.getPeer() != null;
    }

    @Override
    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    void a(int arg0, Runnable arg1) {
        Thread thread = new Thread(arg1);
        if (arg0 != 1) {
            return;
        }
        thread.setDaemon(true);
        thread.start();
    }

    protected e() {
    }

    static {
        nb = new int[512];
    }
}

