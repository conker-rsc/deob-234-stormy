/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.URL;

class ib {
    ib a;
    static URL c;
    static int[] d;
    ib e;

    static int a(int arg0, int arg1) {
        return arg0 & arg1;
    }

    final void a(int arg0) {
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
    }

    static final byte[] a(int arg0, String arg1, int arg2, int arg3) throws IOException {
        Object object;
        if (la.g[arg3] != null) {
            return la.g[arg3];
        }
        if (arg0 > -73) {
            return null;
        }
        nb.q = arg2;
        o.l = arg1;
        if (m.e != null && (object = m.e.a(9395, arg3)) != null && mb.a(object, ((byte[])object).length, 0) == tb.l[arg3]) {
            la.g[arg3] = k.a(128, true, object);
            return la.g[arg3];
        }
        object = new URL(c, "content" + arg3 + "_" + Long.toHexString(tb.l[arg3]));
        byte[] byArray = null;
        for (int i2 = 0; i2 < 3; ++i2) {
            try {
                byArray = da.a((URL)object, true, true);
                if (mb.a(byArray, byArray.length, 0) != tb.l[arg3]) continue;
                if (m.e != null) {
                    m.e.a(arg3, byArray.length, -97, byArray);
                }
                la.g[arg3] = k.a(128, true, byArray);
                return la.g[arg3];
            }
            catch (IOException iOException) {
                if (i2 != 2) continue;
                throw iOException;
            }
        }
        if (byArray != null) {
            StringBuilder stringBuilder = new StringBuilder("Couldn't download file #" + arg3 + ": crc=" + tb.l[arg3]);
            stringBuilder.append(" len=" + byArray.length);
            for (int i3 = 0; byArray.length > i3 && i3 < 5; ++i3) {
                stringBuilder.append(" " + byArray[i3]);
            }
            throw new IOException(stringBuilder.toString());
        }
        throw new IOException("Couldn't download file #" + arg3 + ": crc=" + tb.l[arg3]);
    }
}

