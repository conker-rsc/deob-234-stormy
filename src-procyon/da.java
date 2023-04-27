import java.applet.*;
import java.io.*;
import java.net.*;

final class da extends b implements Runnable
{
    static int[][] J;
    private byte[] Z;
    static fb db;
    private int W;
    private boolean fb;
    private int G;
    static int[] T;
    private OutputStream Q;
    static Applet gb;
    private InputStream U;
    static int M;
    private Socket ab;
    private boolean X;
    static v O;
    private byte[] Y;
    static int[] N;
    static int bb;
    static int K;
    
    @Override
    public final void run() {
        while (!this.X) {
            int n;
            final int w;
            synchronized (this) {
                if (this.G == this.W) {
                    try {
                        this.wait();
                    }
                    catch (final InterruptedException ex) {}
                }
                if (this.X) {
                    return;
                }
                if (this.W > this.G) {
                    n = 5000 - this.W;
                }
                else {
                    n = this.G + -this.W;
                }
                w = this.W;
            }
            if (n <= 0) {
                continue;
            }
            try {
                this.Q.write(this.Y, w, n);
            }
            catch (final IOException ex2) {
                this.k = true;
                this.B = "Twriter:" + ex2;
            }
            this.W = (this.W - -n) % 5000;
            try {
                if (this.W != this.G) {
                    continue;
                }
                this.Q.flush();
            }
            catch (final IOException ex3) {
                this.k = true;
                this.B = "Twriter:" + ex3;
            }
        }
    }
    
    static final void a(final String arg0, final int arg1, final int arg2) {
        if (arg2 != 0) {
            a((String)null, -126, -28);
        }
        d.h.a(nb.q, (byte)(-101), arg0 + o.l + " - " + arg1 + "%");
    }
    
    static final byte[] a(final URL arg0, final boolean arg1, final boolean arg2) throws IOException {
        final jb jb = new jb(pa.k, arg0, 2000000);
        if (arg1) {
            a("", 0, 0);
        }
        while (!jb.a(-2)) {
            mb.a(11200, 50L);
        }
        final tb a = jb.a((byte)(-120));
        if (a != null) {
            if (!arg2) {
                a((String)null, -15, -97);
            }
            if (arg1) {
                a("", 100, 0);
            }
            return a.d(0);
        }
        throw new IOException("Couldn't download file");
    }
    
    @Override
    final void a(final byte[] arg0, final int arg1, final int arg2, final byte arg3) throws IOException {
        if (arg3 != -67) {
            return;
        }
        if (!this.fb) {
            if (this.Y == null) {
                this.Y = new byte[5000];
            }
            synchronized (this) {
                for (int i = 0; i < arg2; ++i) {
                    this.Y[this.G] = arg0[arg1 + i];
                    this.G = (this.G + 1) % 5000;
                    if (this.G == (4900 + this.W) % 5000) {
                        throw new IOException("buffer overflow");
                    }
                }
                this.notify();
            }
        }
    }
    
    @Override
    final int b(final byte arg0) throws IOException {
        if (this.fb) {
            return 0;
        }
        return this.U.available();
    }
    
    @Override
    final void a(final boolean arg0) {
        super.a(true);
        this.fb = arg0;
        try {
            if (this.U != null) {
                this.U.close();
            }
            if (this.Q != null) {
                this.Q.close();
            }
            if (this.ab != null) {
                this.ab.close();
            }
        }
        catch (final IOException ex) {
            System.out.println("Error closing stream");
        }
        this.X = true;
        synchronized (this) {
            this.notify();
        }
        this.Y = null;
    }
    
    static final int a(final int arg0, final byte arg1, final int arg2, final int arg3) {
        if (arg1 != -66) {
            da.K = 35;
        }
        return -(arg3 / 8 * 32) - 1 + -(arg2 / 8 * 1024) - arg0 / 8;
    }
    
    @Override
    final int b(final boolean arg0) throws IOException {
        if (!this.fb == arg0) {
            this.a(this.Z, 1, 0, 123);
            return 0xFF & this.Z[0];
        }
        return 0;
    }
    
    @Override
    final void a(final byte[] arg0, final int arg1, final int arg2, final int arg3) throws IOException {
        if (this.fb) {
            return;
        }
        int read;
        for (int i = 0; i < arg1; i += read) {
            if (~(read = this.U.read(arg0, arg2 + i, -i + arg1)) >= -1) {
                throw new IOException("EOF");
            }
        }
    }
    
    da(final Socket arg0, final e arg1) throws IOException {
        super();
        this.Z = new byte[1];
        this.G = 0;
        this.W = 0;
        this.fb = false;
        this.X = true;
        this.ab = arg0;
        this.U = arg0.getInputStream();
        this.Q = arg0.getOutputStream();
        this.X = false;
        arg1.a(1, this);
    }
    
    static {
        da.M = 0;
        da.db = new fb();
        da.O = new v("WTRC", "office", "_rc", 1);
    }
}
