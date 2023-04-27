/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

final class da
extends b
implements Runnable {
    static int[][] J;
    private byte[] Z = new byte[1];
    static fb db;
    private int W = 0;
    private boolean fb = false;
    private int G = 0;
    static int[] T;
    private OutputStream Q;
    static Applet gb;
    private InputStream U;
    static int M;
    private Socket ab;
    private boolean X = true;
    static v O;
    private byte[] Y;
    static int[] N;
    static int bb;
    static int K;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        while (!this.X) {
            int n2;
            int n3;
            da da2 = this;
            synchronized (da2) {
                if (this.G == this.W) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
                if (this.X) {
                    return;
                }
                n3 = this.W > this.G ? 5000 - this.W : this.G + -this.W;
                n2 = this.W;
            }
            if (n3 <= 0) continue;
            try {
                this.Q.write(this.Y, n2, n3);
            }
            catch (IOException iOException) {
                this.k = true;
                this.B = "Twriter:" + iOException;
            }
            this.W = (this.W - -n3) % 5000;
            try {
                if (this.W != this.G) continue;
                this.Q.flush();
            }
            catch (IOException iOException) {
                this.k = true;
                this.B = "Twriter:" + iOException;
            }
        }
    }

    static final void a(String arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            da.a((String)null, -126, -28);
        }
        d.h.a(nb.q, (byte)-101, arg0 + o.l + " - " + arg1 + "%");
    }

    static final byte[] a(URL arg0, boolean arg1, boolean arg2) throws IOException {
        jb jb2 = new jb(pa.k, arg0, 2000000);
        if (arg1) {
            da.a("", 0, 0);
        }
        while (!jb2.a(-2)) {
            mb.a(11200, 50L);
        }
        tb tb2 = jb2.a((byte)-120);
        if (tb2 == null) {
            throw new IOException("Couldn't download file");
        }
        if (!arg2) {
            da.a((String)null, -15, -97);
        }
        if (arg1) {
            da.a("", 100, 0);
        }
        return tb2.d(0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    final void a(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -67) {
            return;
        }
        if (!(!this.fb)) {
            return;
        }
        if (this.Y == null) {
            this.Y = new byte[5000];
        }
        da da2 = this;
        synchronized (da2) {
            for (int i2 = 0; i2 < arg2; ++i2) {
                this.Y[this.G] = arg0[arg1 + i2];
                this.G = (this.G + 1) % 5000;
                if (this.G != (4900 + this.W) % 5000) continue;
                throw new IOException("buffer overflow");
            }
            this.notify();
        }
    }

    @Override
    final int b(byte arg0) throws IOException {
        if (this.fb) {
            return 0;
        }
        return this.U.available();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    final void a(boolean arg0) {
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
        catch (IOException iOException) {
            System.out.println("Error closing stream");
        }
        this.X = true;
        da da2 = this;
        synchronized (da2) {
            this.notify();
        }
        this.Y = null;
    }

    static final int a(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -66) {
            K = 35;
        }
        return -(arg3 / 8 * 32) - 1 + -(arg2 / 8 * 1024) - arg0 / 8;
    }

    @Override
    final int b(boolean arg0) throws IOException {
        if (!this.fb != arg0) {
            return 0;
        }
        this.a(this.Z, 1, 0, 123);
        return 0xFF & this.Z[0];
    }

    @Override
    final void a(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.fb) {
            return;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < arg1; i2 += n2) {
            n2 = this.U.read(arg0, arg2 + i2, -i2 + arg1);
            if (~n2 < -1) continue;
            throw new IOException("EOF");
        }
    }

    da(Socket arg0, e arg1) throws IOException {
        this.ab = arg0;
        this.U = arg0.getInputStream();
        this.Q = arg0.getOutputStream();
        this.X = false;
        arg1.a(1, this);
    }

    static {
        M = 0;
        db = new fb();
        O = new v("WTRC", "office", "_rc", 1);
    }
}

