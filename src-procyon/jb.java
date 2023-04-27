import java.net.*;
import java.io.*;

final class jb implements Runnable
{
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
    
    @Override
    public final void run() {
        try {
            while (this.h.w < this.h.F.length) {
                final int read = this.q.read(this.h.F, this.h.w, this.h.F.length - this.h.w);
                if (read < 0) {
                    break;
                }
                final tb h = this.h;
                h.w += read;
            }
            if (this.h.w == this.h.F.length) {
                throw new Exception("HG1: " + this.h.F.length + " " + this.g);
            }
            synchronized (this) {
                this.finalize();
                this.a = 3;
            }
        }
        catch (final Exception ex) {
            synchronized (this) {
                this.finalize();
                ++this.a;
            }
        }
    }
    
    static final void a(final int[] arg0, final int arg1, final int arg2, int arg3, int arg4, int arg5, int arg6, final int arg7, int arg8, int arg9, final int[] arg10, final boolean arg11, final int arg12, int arg13, int arg14) {
        if (arg7 > 0) {
            int n = 0;
            int n2 = 0;
            if (arg3 != 0) {
                n2 = arg13 / arg3 << 6;
                n = arg8 / arg3 << 6;
            }
            arg4 <<= 2;
            if (arg11) {
                jb.o = 21;
            }
            if (n < 0) {
                n = 0;
            }
            else if (n > 4032) {
                n = 4032;
            }
            for (int i = arg7; i > 0; i -= 16) {
                arg3 += arg2;
                arg14 = n;
                arg8 += arg12;
                arg9 = n2;
                arg13 += arg1;
                if (arg3 != 0) {
                    n = arg8 / arg3 << 6;
                    n2 = arg13 / arg3 << 6;
                }
                if (n >= 0) {
                    if (n > 4032) {
                        n = 4032;
                    }
                }
                else {
                    n = 0;
                }
                final int n3 = n2 - arg9 >> 4;
                final int n4 = -arg14 + n >> 4;
                int n5 = arg5 >> 20;
                arg14 += (arg5 & 0xC0000);
                arg5 += arg4;
                if (i >= 16) {
                    arg0[arg6++] = ib.a(arg0[arg6] >> 1, 8355711) + (arg10[ib.a(4032, arg9) + (arg14 >> 6)] >>> n5);
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (ib.a(arg0[arg6], 16711423) >> 1) + (arg10[ib.a(4032, arg9) - -(arg14 >> 6)] >>> n5);
                    arg9 += n3;
                    arg14 += n4;
                    arg0[arg6++] = (ib.a(16711423, arg0[arg6]) >> 1) + (arg10[ib.a(arg9, 4032) + (arg14 >> 6)] >>> n5);
                    arg9 += n3;
                    arg14 += n4;
                    arg0[arg6++] = (ib.a(arg0[arg6], 16711423) >> 1) + (arg10[(arg14 >> 6) + ib.a(4032, arg9)] >>> n5);
                    arg14 += n4;
                    arg9 += n3;
                    arg14 = (arg5 & 0xC0000) + (0xFFF & arg14);
                    final int n6 = arg5 >> 20;
                    arg0[arg6++] = (arg10[ib.a(arg9, 4032) + (arg14 >> 6)] >>> n6) + (ib.a(arg0[arg6], 16711422) >> 1);
                    arg5 += arg4;
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (arg10[(arg14 >> 6) + ib.a(4032, arg9)] >>> n6) + (ib.a(arg0[arg6], 16711423) >> 1);
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (arg10[ib.a(4032, arg9) + (arg14 >> 6)] >>> n6) - -(ib.a(arg0[arg6], 16711423) >> 1);
                    arg9 += n3;
                    arg14 += n4;
                    arg0[arg6++] = (arg10[ib.a(4032, arg9) + (arg14 >> 6)] >>> n6) - -(ib.a(16711423, arg0[arg6]) >> 1);
                    arg14 += n4;
                    arg9 += n3;
                    arg14 = (0xC0000 & arg5) + (0xFFF & arg14);
                    final int n7 = arg5 >> 20;
                    arg0[arg6++] = (arg10[ib.a(4032, arg9) - -(arg14 >> 6)] >>> n7) - -(ib.a(arg0[arg6], 16711422) >> 1);
                    arg5 += arg4;
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (arg10[ib.a(arg9, 4032) - -(arg14 >> 6)] >>> n7) - -ib.a(arg0[arg6] >> 1, 8355711);
                    arg9 += n3;
                    arg14 += n4;
                    arg0[arg6++] = (arg10[ib.a(4032, arg9) + (arg14 >> 6)] >>> n7) - -(ib.a(arg0[arg6], 16711423) >> 1);
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (ib.a(16711422, arg0[arg6]) >> 1) + (arg10[(arg14 >> 6) + ib.a(arg9, 4032)] >>> n7);
                    arg14 += n4;
                    arg9 += n3;
                    arg14 = (arg5 & 0xC0000) + (arg14 & 0xFFF);
                    final int n8 = arg5 >> 20;
                    arg0[arg6++] = (arg10[ib.a(arg9, 4032) - -(arg14 >> 6)] >>> n8) - -(ib.a(16711422, arg0[arg6]) >> 1);
                    arg5 += arg4;
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (ib.a(arg0[arg6], 16711423) >> 1) + (arg10[ib.a(arg9, 4032) - -(arg14 >> 6)] >>> n8);
                    arg14 += n4;
                    arg9 += n3;
                    arg0[arg6++] = (arg10[ib.a(4032, arg9) - -(arg14 >> 6)] >>> n8) - -ib.a(arg0[arg6] >> 1, 8355711);
                    arg9 += n3;
                    arg14 += n4;
                    arg0[arg6++] = (arg10[(arg14 >> 6) + ib.a(4032, arg9)] >>> n8) + (ib.a(arg0[arg6], 16711423) >> 1);
                }
                else {
                    for (int n9 = 0; i > n9; ++n9) {
                        arg0[arg6++] = (arg10[(arg14 >> 6) + ib.a(arg9, 4032)] >>> n5) - -(ib.a(16711422, arg0[arg6]) >> 1);
                        arg9 += n3;
                        arg14 += n4;
                        if ((n9 & 0x3) == 0x3) {
                            n5 = arg5 >> 20;
                            arg14 = (arg14 & 0xFFF) - -(0xC0000 & arg5);
                            arg5 += arg4;
                        }
                    }
                }
            }
        }
    }
    
    final synchronized boolean a(final int arg0) {
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
                    final Socket socket = (Socket)this.f.d;
                    socket.setSoTimeout(10000);
                    final OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(17);
                    outputStream.write(h.a("JAGGRAB " + this.g.getFile() + "\n\n", (byte)(-104)));
                    this.q = new DataInputStream(socket.getInputStream());
                }
                this.h.w = 0;
            }
            catch (final IOException ex) {
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
    
    final tb a(final byte arg0) {
        if (arg0 > -110) {
            this.run();
        }
        if (this.a == 3) {
            return this.h;
        }
        return null;
    }
    
    static final String a(final boolean arg0, final String arg1, final String arg2, String arg3) {
        if (!arg0) {
            a(null, 78, -46, -87, -87, -58, -96, -121, 50, -80, null, false, -54, -83, 52);
        }
        for (int i = arg3.indexOf(arg2); i != -1; i = arg3.indexOf(arg2, i - -arg1.length())) {
            arg3 = arg3.substring(0, i) + arg1 + arg3.substring(arg2.length() + i);
        }
        return arg3;
    }
    
    jb(final c arg0, final URL arg1, final int arg2) {
        super();
        this.g = arg1;
        this.b = arg0;
        this.h = new tb(arg2);
    }
    
    @Override
    protected final void finalize() {
        if (this.c != null) {
            if (this.c.d != null) {
                try {
                    ((DataInputStream)this.c.d).close();
                }
                catch (final Exception ex) {}
            }
            this.c = null;
        }
        if (this.f != null) {
            if (this.f.d != null) {
                try {
                    ((Socket)this.f.d).close();
                }
                catch (final Exception ex2) {}
            }
            this.f = null;
        }
        if (this.q != null) {
            try {
                this.q.close();
            }
            catch (final Exception ex3) {}
            this.q = null;
        }
        this.l = null;
    }
    
    static {
        jb.o = 0;
    }
}
