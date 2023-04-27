import java.net.*;
import java.io.*;

class ib
{
    ib a;
    static URL c;
    static int[] d;
    ib e;
    
    static int a(final int arg0, final int arg1) {
        return arg0 & arg1;
    }
    
    final void a(final int arg0) {
        if (arg0 != -27331) {
            return;
        }
        if (this.e == null) {
            return;
        }
        this.e.a = this.a;
        this.a.e = this.e;
        this.a = null;
        this.e = null;
    }
    
    protected ib() {
        super();
    }
    
    static final byte[] a(final int arg0, final String arg1, final int arg2, final int arg3) throws IOException {
        if (la.g[arg3] != null) {
            return la.g[arg3];
        }
        if (arg0 > -73) {
            return null;
        }
        nb.q = arg2;
        o.l = arg1;
        if (m.e != null) {
            final byte[] a = m.e.a(9395, arg3);
            if (a != null) {
                if (mb.a(a, a.length, 0) == tb.l[arg3]) {
                    return la.g[arg3] = k.a(128, true, a);
                }
            }
        }
        final URL arg4 = new URL(ib.c, "content" + arg3 + "_" + Long.toHexString(tb.l[arg3]));
        byte[] a2 = null;
        for (int i = 0; i < 3; ++i) {
            try {
                a2 = da.a(arg4, true, true);
                if (mb.a(a2, a2.length, 0) == tb.l[arg3]) {
                    if (m.e != null) {
                        m.e.a(arg3, a2.length, -97, a2);
                    }
                    return la.g[arg3] = k.a(128, true, a2);
                }
            }
            catch (final IOException ex) {
                if (i == 2) {
                    throw ex;
                }
            }
        }
        if (a2 != null) {
            final StringBuilder sb = new StringBuilder("Couldn't download file #" + arg3 + ": crc=" + tb.l[arg3]);
            sb.append(" len=" + a2.length);
            for (int n = 0; a2.length > n && n < 5; ++n) {
                sb.append(" " + a2[n]);
            }
            throw new IOException(sb.toString());
        }
        throw new IOException("Couldn't download file #" + arg3 + ": crc=" + tb.l[arg3]);
    }
}
