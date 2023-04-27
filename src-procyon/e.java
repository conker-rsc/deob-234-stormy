import java.awt.image.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.applet.*;
import java.lang.reflect.*;
import javax.accessibility.*;
import java.awt.*;

public class e extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener
{
    int K;
    private int n;
    long[] F;
    static byte[][] kb;
    String p;
    static String[] Mb;
    Thread z;
    private int Ib;
    Font tb;
    private boolean hb;
    String B;
    private int a;
    boolean N;
    static int[] nb;
    int Eb;
    static v i;
    int sb;
    private int m;
    private int S;
    private int b;
    private int vb;
    private int V;
    static int[] wb;
    Font X;
    Font Jb;
    Graphics u;
    Image C;
    int I;
    String e;
    private boolean Kb;
    int xb;
    String x;
    boolean U;
    int Bb;
    boolean gb;
    String Cb;
    boolean E;
    int Q;
    boolean bb;
    boolean Z;
    int Qb;
    String Ob;
    public static int Ab;
    public static boolean T;
    public static boolean H;
    public static int zb;
    public static int v;
    public static boolean ib;
    public static int lb;
    
    @Override
    public final String getParameter(final String arg0) {
        if (kb.a != null) {
            return null;
        }
        if (da.gb == null) {
            return super.getParameter(arg0);
        }
        return da.gb.getParameter(arg0);
    }
    
    private final void b(final int arg0) {
        this.vb = -2;
        System.out.println("Closing program");
        this.a(false);
        mb.a(11200, 1000L);
        if (arg0 != 100) {
            this.e(27);
        }
        if (kb.a != null) {
            kb.a.dispose();
            System.exit(0);
        }
    }
    
    @Override
    public final void run() {
        try {
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
                this.a((byte)(-92));
                this.n = 0;
            }
            if (kb.a != null) {
                kb.a.addMouseListener(this);
                kb.a.addMouseMotionListener(this);
                kb.a.addKeyListener(this);
            }
            else if (da.gb == null) {
                this.addMouseListener(this);
                this.addMouseMotionListener(this);
                this.addKeyListener(this);
            }
            else {
                da.gb.addMouseListener(this);
                da.gb.addMouseMotionListener(this);
                da.gb.addKeyListener(this);
            }
            int n = 0;
            int n2 = 256;
            int q = 1;
            int i = 0;
            for (int j = 0; j < 10; ++j) {
                this.F[j] = p.a(0);
            }
            p.a(0);
            while (this.vb >= 0) {
                if (this.vb > 0) {
                    --this.vb;
                    if (this.vb == 0) {
                        this.b(100);
                        this.z = null;
                        return;
                    }
                }
                final int n3 = n2;
                n2 = 300;
                final int n4 = q;
                q = 1;
                final long a = p.a(0);
                if (~this.F[n] == -1L) {
                    q = n4;
                    n2 = n3;
                }
                else if (~a < ~this.F[n]) {
                    n2 = (int)(this.Ib * 2560 / (a + -this.F[n]));
                }
                if (n2 < 25) {
                    n2 = 25;
                }
                if (n2 > 256) {
                    n2 = 256;
                    q = (int)(-((-this.F[n] + a) / 10L) + this.Ib);
                    if (q < this.Q) {
                        q = this.Q;
                    }
                }
                mb.a(11200, (long)q);
                this.F[n] = a;
                if (q > 1) {
                    for (int k = 0; k < 10; ++k) {
                        if (-1L != ~this.F[k]) {
                            final long[] f = this.F;
                            final int n5 = k;
                            f[n5] += q;
                        }
                    }
                }
                n = (1 + n) % 10;
                int n6 = 0;
                while (i < 256) {
                    this.e(119);
                    i += n2;
                    ++n6;
                    if (this.S < n6) {
                        i = 0;
                        this.b += 6;
                        if (this.b <= 25) {
                            break;
                        }
                        this.b = 0;
                        this.U = true;
                        break;
                    }
                }
                --this.b;
                i &= 0xFF;
                this.b(false);
            }
            if (this.vb == -1) {
                this.b(100);
            }
            this.z = null;
        }
        catch (final Exception arg1) {
            mb.a(2097151, arg1, null);
            this.a("crash", true);
        }
    }
    
    @Override
    public final synchronized void keyReleased(final KeyEvent arg0) {
        this.a(arg0, (byte)(-128));
        final char keyChar = arg0.getKeyChar();
        final int keyCode = arg0.getKeyCode();
        if (keyChar != ' ') {}
        if (keyCode == 40) {}
        if (keyChar == 'N' || keyChar != 'M') {}
        if (keyCode == 39) {
            this.E = false;
        }
        if (keyChar == 'n' || keyChar != 'm') {}
        if (keyChar != '{') {}
        if (keyCode == 37) {
            this.Z = false;
        }
        if (keyCode == 38) {}
        if (keyChar == '}') {}
    }
    
    synchronized void b(final boolean arg0) {
        if (arg0) {
            return;
        }
    }
    
    synchronized void e(final int arg0) {
        if (arg0 < 64) {
            return;
        }
    }
    
    @Override
    public final void paint(final Graphics arg0) {
        this.N = true;
        if (this.n != 2 || this.C == null) {
            if (this.n == 0) {
                this.a(-89);
            }
        }
        else {
            this.a(this.B, this.V, 126);
        }
    }
    
    private final void a(final String arg0, final int arg1, final int arg2) {
        try {
            int n = (this.m - 281) / 2;
            int n2 = (this.a - 148) / 2;
            this.u.setColor(Color.black);
            this.u.fillRect(0, 0, this.m, this.a);
            if (!this.hb) {
                this.u.drawImage(this.C, n, n2, this);
            }
            n += 2;
            this.V = arg1;
            n2 += 90;
            this.B = arg0;
            if (arg2 <= 97) {
                this.mouseReleased(null);
            }
            this.u.setColor(new Color(132, 132, 132));
            if (this.hb) {
                this.u.setColor(new Color(220, 0, 0));
            }
            this.u.drawRect(n - 2, n2 - 2, 280, 23);
            this.u.fillRect(n, n2, 277 * arg1 / 100, 20);
            this.u.setColor(new Color(198, 198, 198));
            if (this.hb) {
                this.u.setColor(new Color(255, 255, 255));
            }
            this.a(this.tb, arg0, 10 + n2, true, 138 + n, this.u);
            if (!this.hb) {
                this.a(this.X, "Created by JAGeX - visit www.jagex.com", 30 + n2, true, n + 138, this.u);
                this.a(this.X, "© 2001-2015 Jagex Ltd", n2 + 44, true, n + 138, this.u);
            }
            else {
                this.u.setColor(new Color(132, 132, 152));
                this.a(this.Jb, "© 2001-2015 Jagex Ltd", this.a - 20, true, 138 + n, this.u);
            }
            if (this.p != null) {
                this.u.setColor(Color.white);
                this.a(this.X, this.p, n2 - 120, true, n + 138, this.u);
            }
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public final synchronized void mouseReleased(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
        this.I = arg0.getX() + -this.Eb;
        this.xb = arg0.getY() + -this.K;
        this.Bb = 0;
    }
    
    final void a(final int arg0, final byte arg1, final String arg2) {
        try {
            int n = (this.m - 281) / 2;
            n += 2;
            int n2 = (this.a - 148) / 2;
            this.B = arg2;
            this.V = arg0;
            n2 += 90;
            final int n3 = 277 * arg0 / 100;
            this.u.setColor(new Color(132, 132, 132));
            if (this.hb) {
                this.u.setColor(new Color(220, 0, 0));
            }
            this.u.fillRect(n, n2, n3, 20);
            this.u.setColor(Color.black);
            this.u.fillRect(n3 + n, n2, -n3 + 277, 20);
            this.u.setColor(new Color(198, 198, 198));
            if (this.hb) {
                this.u.setColor(new Color(255, 255, 255));
            }
            this.a(this.tb, arg2, 10 + n2, true, 138 + n, this.u);
        }
        catch (final Exception ex) {}
        if (arg1 > -96) {
            this.x = null;
        }
    }
    
    private final Image a(final byte[] arg0, final byte arg1) {
        if (arg1 != -54) {
            this.Ob = null;
        }
        return pa.a(79, this, arg0);
    }
    
    public static final void provideLoaderApplet(final Applet arg0) {
        da.gb = arg0;
    }
    
    final void a(final int arg0) {
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
    
    final void a(final boolean arg0, final String arg1, final int arg2, final String arg3, final int arg4, final byte arg5, final int arg6, final int arg7, final int arg8) {
        try {
            System.out.println("Started application");
            this.m = arg7;
            this.a = arg8;
            kb.a = new qb(this, 800, 600, arg1, arg0, false);
            try {
                kb.a.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE).invoke(kb.a, Boolean.FALSE);
            }
            catch (final Exception ex) {}
            db.d = arg6;
            this.n = 1;
            pa.b = (pa.k = new c(arg2, arg3, 0, true));
            try {
                if (arg5 <= 20) {
                    return;
                }
                cb.a(new URL("http", "127.0.0.1", arg4, ""), this, -91);
            }
            catch (final IOException arg9) {
                mb.a(2097151, arg9, null);
            }
            (this.z = new Thread(this)).start();
            this.z.setPriority(1);
        }
        catch (final Exception arg10) {
            mb.a(2097151, arg10, null);
        }
    }
    
    private final boolean b(final byte arg0) {
        final byte[] a = this.a("Jagex library", 0, 3, 85);
        if (a != null) {
            if (arg0 != 118) {
                this.B = null;
            }
            this.C = this.a(na.a("logo.tga", 0, a, -120), (byte)(-54));
            return qa.a(this, "h11p", 0, arg0 - 118) && qa.a(this, "h12b", 1, 0) && qa.a(this, "h12p", 2, 0) && qa.a(this, "h13b", 3, 0) && qa.a(this, "h14b", 4, arg0 - 118) && qa.a(this, "h16b", 5, 0) && qa.a(this, "h20b", 6, arg0 ^ 0x76) && qa.a(this, "h24b", 7, arg0 - 118);
        }
        return false;
    }
    
    void a(final boolean arg0) {
        if (arg0) {
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
    
    void a(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (arg1 < 87) {
            this.z = null;
        }
    }
    
    private final void a(final String arg0, final boolean arg1) {
        if (!this.Kb) {
            this.Kb = arg1;
            System.out.println("error_game_" + arg0);
            try {
                if (da.gb != null) {
                    a.a("loggedout", (byte)82, da.gb);
                }
                else {
                    a.a("loggedout", (byte)(-73), this);
                }
            }
            catch (final Throwable t) {}
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            }
            catch (final Exception ex) {}
        }
    }
    
    @Override
    public final synchronized void mouseDragged(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() - this.K;
        if (arg0.isMetaDown()) {
            this.Bb = 2;
        }
        else {
            this.Bb = 1;
        }
    }
    
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        try {
            System.out.println("Started applet");
            this.n = 1;
            this.m = arg4;
            this.a = arg0;
            nb.s = this.getCodeBase();
            db.d = arg1;
            if (pa.k == null) {
                pa.b = (pa.k = new c(arg2, null, 0, da.gb != null));
            }
            if (arg3 != 2) {
                return;
            }
            if (da.gb != null) {
                final Method y = c.y;
                if (y != null) {
                    try {
                        y.invoke(da.gb, Boolean.TRUE);
                    }
                    catch (final Throwable t) {}
                }
                final Method u = c.u;
                if (u != null) {
                    try {
                        u.invoke(da.gb, Boolean.FALSE);
                    }
                    catch (final Throwable t2) {}
                }
            }
            try {
                cb.a(this.getCodeBase(), this, arg3 - 110);
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
            this.a(arg3 - 1, this);
        }
        catch (final Exception arg5) {
            mb.a(arg3 ^ 0x1FFFFD, arg5, null);
            this.a("crash", true);
        }
    }
    
    @Override
    public final void mouseEntered(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
    }
    
    final boolean d(final int arg0) {
        final Graphics graphics = this.getGraphics();
        if (graphics != null) {
            if (arg0 != 2) {
                this.sb = -7;
            }
            (this.u = graphics.create()).translate(this.Eb, this.K);
            this.u.setColor(Color.black);
            this.u.fillRect(0, 0, this.m, this.a);
            this.a("Loading...", 0, arg0 ^ 0x67);
            return true;
        }
        return false;
    }
    
    private final void a(final InputEvent arg0, final byte arg1) {
        if (arg1 > -127) {
            return;
        }
        final int modifiers = arg0.getModifiers();
        this.bb = ((modifiers & 0x2) != 0x0);
        this.gb = ((modifiers & 0x1) != 0x0);
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
    public final void mouseClicked(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
    }
    
    @Override
    public final Image createImage(final int arg0, final int arg1) {
        if (kb.a != null) {
            return kb.a.createImage(arg0, arg1);
        }
        if (da.gb != null) {
            return da.gb.createImage(arg0, arg1);
        }
        return super.createImage(arg0, arg1);
    }
    
    final void a(final Font arg0, final String arg1, final int arg2, final boolean arg3, final int arg4, final Graphics arg5) {
        Accessible a;
        if (kb.a == null) {
            a = this;
        }
        else {
            a = kb.a;
        }
        final FontMetrics fontMetrics = ((Component)a).getFontMetrics(arg0);
        fontMetrics.stringWidth(arg1);
        if (!arg3) {
            this.c(68);
        }
        arg5.setFont(arg0);
        arg5.drawString(arg1, arg4 + -(fontMetrics.stringWidth(arg1) / 2), arg2 - -(fontMetrics.getHeight() / 4));
    }
    
    @Override
    public final void destroy() {
        this.vb = -1;
        mb.a(11200, 5000L);
        if (this.vb == -1) {
            System.out.println("5 seconds expired, forcing kill");
            this.b(100);
            if (this.z != null) {
                this.z.stop();
                this.z = null;
            }
        }
    }
    
    void a(final byte arg0, final int arg1) {
        if (arg0 <= 105) {
            this.a((InputEvent)null, (byte)83);
        }
    }
    
    @Override
    public final synchronized void mouseMoved(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() + -this.K;
        this.sb = 0;
        this.Bb = 0;
    }
    
    final void c(final int arg0) {
        if (arg0 != -28492) {
            return;
        }
        for (int i = 0; i < 10; ++i) {
            this.F[i] = 0L;
        }
    }
    
    final byte[] a(final String arg0, final int arg1, final int arg2, final int arg3) {
        if (arg3 <= 53) {
            this.c(15);
        }
        try {
            return ib.a(-101, arg0, arg1, arg2);
        }
        catch (final IOException arg4) {
            mb.a(2097151, arg4, "Unable to load content pack " + arg2);
            return null;
        }
    }
    
    @Override
    public final void keyTyped(final KeyEvent arg0) {
        this.a(arg0, (byte)(-128));
    }
    
    @Override
    public final void start() {
        if (this.vb >= 0) {
            this.vb = 0;
        }
    }
    
    @Override
    public final void mouseExited(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
    }
    
    @Override
    public final synchronized void mousePressed(final MouseEvent arg0) {
        this.a(arg0, (byte)(-128));
        this.I = arg0.getX() - this.Eb;
        this.xb = arg0.getY() + -this.K;
        if (!arg0.isMetaDown()) {
            this.Bb = 1;
        }
        else {
            this.Bb = 2;
        }
        this.Qb = this.Bb;
        this.sb = 0;
        this.a(this.I, 94, this.Bb, this.xb);
    }
    
    void a(final byte arg0) {
        if (arg0 != -92) {
            provideLoaderApplet(null);
        }
    }
    
    @Override
    public final synchronized void keyPressed(final KeyEvent arg0) {
        this.a(arg0, (byte)(-128));
        final char keyChar = arg0.getKeyChar();
        final int keyCode = arg0.getKeyCode();
        this.a((byte)126, keyChar);
        if (keyCode == 112) {
            this.U = !this.U;
        }
        if (keyChar == 'N' || keyChar != 'M') {}
        if (keyChar == ' ') {}
        if (keyChar != '{') {}
        this.sb = 0;
        if (keyChar == 'n' || keyChar != 'm') {}
        if (keyCode != 40) {}
        if (keyCode == 39) {
            this.E = true;
        }
        if (keyChar == '}') {}
        if (keyCode == 38) {}
        if (keyCode == 37) {
            this.Z = true;
        }
        boolean b = false;
        for (int i = 0; i < i.f.length(); ++i) {
            if (keyChar == i.f.charAt(i)) {
                b = true;
                break;
            }
        }
        if (b && this.e.length() < 20) {
            this.e += keyChar;
        }
        if (b) {
            if (this.x.length() < 80) {
                this.x += keyChar;
            }
        }
        if (keyChar == '\b' && this.e.length() > 0) {
            this.e = this.e.substring(0, this.e.length() - 1);
        }
        if (keyChar == '\b' && this.x.length() > 0) {
            this.x = this.x.substring(0, this.x.length() - 1);
        }
        if (keyChar == '\n' || keyChar == '\r') {
            this.Cb = this.e;
            this.Ob = this.x;
        }
    }
    
    final void a(final int arg0, final byte arg1) {
        this.Ib = 1000 / arg0;
        if (arg1 <= 104) {
            this.Eb = 113;
        }
    }
    
    @Override
    public final void stop() {
        if (this.vb >= 0) {
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
    public final void update(final Graphics arg0) {
        this.paint(arg0);
    }
    
    void a(final int arg0, final Runnable arg1) {
        final Thread thread = new Thread(arg1);
        if (arg0 != 1) {
            return;
        }
        thread.setDaemon(true);
        thread.start();
    }
    
    protected e() {
        super();
        this.p = null;
        this.F = new long[10];
        this.n = 1;
        this.hb = false;
        this.B = "Loading";
        this.S = 1000;
        this.z = null;
        this.vb = 0;
        this.a = 384;
        this.Ib = 20;
        this.b = 0;
        this.m = 512;
        this.N = false;
        this.sb = 0;
        this.V = 0;
        this.tb = new Font("TimesRoman", 0, 15);
        this.X = new Font("Helvetica", 1, 13);
        this.Jb = new Font("Helvetica", 0, 12);
        this.x = "";
        this.U = false;
        this.I = 0;
        this.e = "";
        this.bb = false;
        this.Q = 1;
        this.Qb = 0;
        this.Z = false;
        this.Bb = 0;
        this.xb = 0;
        this.gb = false;
        this.Kb = false;
        this.Cb = "";
        this.E = false;
        this.Ob = "";
    }
    
    static {
        e.kb = new byte[250][];
        e.nb = new int[512];
    }
}
