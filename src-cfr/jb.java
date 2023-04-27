/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

final class jb
implements Runnable {
    private c b;
    private g f;
    private DataInputStream q;
    private tb h;
    private URL g;
    private g c;
    static int[] k;
    static int p;
    private g l;
    private int a;
    static int o;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        try {
            int n2;
            while (this.h.w < this.h.F.length && (n2 = this.q.read(this.h.F, this.h.w, this.h.F.length - this.h.w)) >= 0) {
                this.h.w += n2;
            }
            if (this.h.w == this.h.F.length) {
                throw new Exception("HG1: " + this.h.F.length + " " + this.g);
            }
            jb jb2 = this;
            synchronized (jb2) {
                this.finalize();
                this.a = 3;
            }
        }
        catch (Exception exception) {
            jb jb3 = this;
            synchronized (jb3) {
                this.finalize();
                ++this.a;
            }
        }
    }

    static final void a(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, boolean arg11, int arg12, int arg13, int arg14) {
        if (arg7 <= 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        if (arg3 != 0) {
            n3 = arg13 / arg3 << 6;
            n2 = arg8 / arg3 << 6;
        }
        arg4 <<= 2;
        if (arg11) {
            o = 21;
        }
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 > 4032) {
            n2 = 4032;
        }
        for (int i2 = arg7; i2 > 0; i2 -= 16) {
            arg14 = n2;
            arg8 += arg12;
            arg9 = n3;
            arg13 += arg1;
            if ((arg3 += arg2) != 0) {
                n2 = arg8 / arg3 << 6;
                n3 = arg13 / arg3 << 6;
            }
            if (n2 >= 0) {
                if (n2 > 4032) {
                    n2 = 4032;
                }
            } else {
                n2 = 0;
            }
            int n4 = n3 - arg9 >> 4;
            int n5 = -arg14 + n2 >> 4;
            int n6 = arg5 >> 20;
            arg14 += arg5 & 0xC0000;
            arg5 += arg4;
            if (i2 >= 16) {
                arg0[arg6++] = ib.a(arg0[arg6] >> 1, 0x7F7F7F) + (arg10[ib.a(4032, arg9) + (arg14 >> 6)] >>> n6);
                arg0[arg6++] = (ib.a(arg0[arg6], 0xFEFEFF) >> 1) + (arg10[ib.a(4032, arg9 += n4) - -((arg14 += n5) >> 6)] >>> n6);
                arg0[arg6++] = (ib.a(0xFEFEFF, arg0[arg6]) >> 1) + (arg10[ib.a(arg9 += n4, 4032) + ((arg14 += n5) >> 6)] >>> n6);
                arg0[arg6++] = (ib.a(arg0[arg6], 0xFEFEFF) >> 1) + (arg10[((arg14 += n5) >> 6) + ib.a(4032, arg9 += n4)] >>> n6);
                arg14 += n5;
                arg14 = (arg5 & 0xC0000) + (0xFFF & arg14);
                n6 = arg5 >> 20;
                arg0[arg6++] = (arg10[ib.a(arg9 += n4, 4032) + (arg14 >> 6)] >>> n6) + (ib.a(arg0[arg6], 0xFEFEFE) >> 1);
                arg0[arg6++] = (arg10[((arg14 += n5) >> 6) + ib.a(4032, arg9 += n4)] >>> n6) + (ib.a(arg0[arg6], 0xFEFEFF) >> 1);
                arg0[arg6++] = (arg10[ib.a(4032, arg9 += n4) + ((arg14 += n5) >> 6)] >>> n6) - -(ib.a(arg0[arg6], 0xFEFEFF) >> 1);
                arg0[arg6++] = (arg10[ib.a(4032, arg9 += n4) + ((arg14 += n5) >> 6)] >>> n6) - -(ib.a(0xFEFEFF, arg0[arg6]) >> 1);
                arg14 += n5;
                arg14 = (0xC0000 & (arg5 += arg4)) + (0xFFF & arg14);
                n6 = arg5 >> 20;
                arg0[arg6++] = (arg10[ib.a(4032, arg9 += n4) - -(arg14 >> 6)] >>> n6) - -(ib.a(arg0[arg6], 0xFEFEFE) >> 1);
                arg0[arg6++] = (arg10[ib.a(arg9 += n4, 4032) - -((arg14 += n5) >> 6)] >>> n6) - -ib.a(arg0[arg6] >> 1, 0x7F7F7F);
                arg0[arg6++] = (arg10[ib.a(4032, arg9 += n4) + ((arg14 += n5) >> 6)] >>> n6) - -(ib.a(arg0[arg6], 0xFEFEFF) >> 1);
                arg0[arg6++] = (ib.a(0xFEFEFE, arg0[arg6]) >> 1) + (arg10[((arg14 += n5) >> 6) + ib.a(arg9 += n4, 4032)] >>> n6);
                arg14 += n5;
                arg14 = ((arg5 += arg4) & 0xC0000) + (arg14 & 0xFFF);
                n6 = arg5 >> 20;
                arg0[arg6++] = (arg10[ib.a(arg9 += n4, 4032) - -(arg14 >> 6)] >>> n6) - -(ib.a(0xFEFEFE, arg0[arg6]) >> 1);
                arg5 += arg4;
                arg0[arg6++] = (ib.a(arg0[arg6], 0xFEFEFF) >> 1) + (arg10[ib.a(arg9 += n4, 4032) - -((arg14 += n5) >> 6)] >>> n6);
                arg0[arg6++] = (arg10[ib.a(4032, arg9 += n4) - -((arg14 += n5) >> 6)] >>> n6) - -ib.a(arg0[arg6] >> 1, 0x7F7F7F);
                arg0[arg6++] = (arg10[((arg14 += n5) >> 6) + ib.a(4032, arg9 += n4)] >>> n6) + (ib.a(arg0[arg6], 0xFEFEFF) >> 1);
                continue;
            }
            for (int i3 = 0; i2 > i3; ++i3) {
                arg0[arg6++] = (arg10[(arg14 >> 6) + ib.a(arg9, 4032)] >>> n6) - -(ib.a(0xFEFEFE, arg0[arg6]) >> 1);
                arg9 += n4;
                arg14 += n5;
                if ((i3 & 3) != 3) continue;
                n6 = arg5 >> 20;
                arg14 = (arg14 & 0xFFF) - -(0xC0000 & arg5);
                arg5 += arg4;
            }
        }
    }

    final synchronized boolean a(int arg0) {
        if (this.a >= 2) {
            return true;
        }
        if (this.a == 0) {
            if (this.c == null) {
                this.c = this.b.a((byte)74, this.g);
            }
            if (this.c.b == 0) {
                return false;
            }
            if (this.c.b != 1) {
                this.c = null;
                ++this.a;
                return false;
            }
        }
        if (this.a == 1) {
            if (this.f == null) {
                this.f = this.b.a(this.g.getHost(), 443, -68);
            }
            if (this.f.b == 0) {
                return false;
            }
            if (this.f.b != 1) {
                this.f = null;
                ++this.a;
                return false;
            }
        }
        if (this.q == null) {
            try {
                if (this.a == 0) {
                    this.q = (DataInputStream)this.c.d;
                }
                if (this.a == 1) {
                    Socket socket = (Socket)this.f.d;
                    socket.setSoTimeout(10000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(17);
                    outputStream.write(h.a("JAGGRAB " + this.g.getFile() + "\n\n", (byte)-104));
                    this.q = new DataInputStream(socket.getInputStream());
                }
                this.h.w = 0;
            }
            catch (IOException iOException) {
                this.finalize();
                ++this.a;
            }
        }
        if (this.l == null) {
            this.l = this.b.a(true, this, 5);
        }
        if (this.l.b == 0) {
            return false;
        }
        if (~this.l.b != arg0) {
            this.finalize();
            ++this.a;
        }
        return false;
    }

    final tb a(byte arg0) {
        if (arg0 > -110) {
            this.run();
        }
        if (this.a == 3) {
            return this.h;
        }
        return null;
    }

    static final String a(boolean arg0, String arg1, String arg2, String arg3) {
        if (!arg0) {
            jb.a(null, 78, -46, -87, -87, -58, -96, -121, 50, -80, null, false, -54, -83, 52);
        }
        int n2 = arg3.indexOf(arg2);
        while (n2 != -1) {
            arg3 = arg3.substring(0, n2) + arg1 + arg3.substring(arg2.length() + n2);
            n2 = arg3.indexOf(arg2, n2 - -arg1.length());
        }
        return arg3;
    }

    jb(c arg0, URL arg1, int arg2) {
        this.g = arg1;
        this.b = arg0;
        this.h = new tb(arg2);
    }

    protected final void finalize() {
        if (this.c != null) {
            if (this.c.d != null) {
                try {
                    ((DataInputStream)this.c.d).close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            this.c = null;
        }
        if (this.f != null) {
            if (this.f.d != null) {
                try {
                    ((Socket)this.f.d).close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            this.f = null;
        }
        if (this.q != null) {
            try {
                this.q.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.q = null;
        }
        this.l = null;
    }

    static {
        o = 0;
    }
}

