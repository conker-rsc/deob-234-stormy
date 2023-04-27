/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class d {
    static int l = 0;
    static int[] g;
    private RandomAccessFile j;
    private long c;
    static e h;
    private long b;
    static String[] m;

    private final void a(int arg0) throws IOException {
        block1: {
            if (this.j != null) {
                this.j.close();
                this.j = null;
            }
            if (arg0 == 25291) break block1;
            d.a(62, (byte)14, null);
        }
    }

    final long a(byte arg0) throws IOException {
        if (arg0 != 47) {
            this.c = -52L;
        }
        return this.j.length();
    }

    protected final void finalize() throws Throwable {
        block0: {
            if (this.j == null) break block0;
            System.out.println("");
            this.a(25291);
        }
    }

    static int a(int arg0, int arg1) {
        return arg0 | arg1;
    }

    final void b(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        block1: {
            if ((this.b ^ 0xFFFFFFFFFFFFFFFFL) > (this.c + (long)arg1 ^ 0xFFFFFFFFFFFFFFFFL)) {
                this.j.seek(this.b);
                this.j.write(1);
                throw new EOFException();
            }
            this.j.write(arg0, arg3, arg1);
            this.c += (long)arg1;
            if (arg2 == 1) break block1;
            d.a(63, (byte)-101, null);
        }
    }

    static final int a(int arg0, byte arg1, byte[] arg2) {
        if (arg1 < 4) {
            h = null;
        }
        return (arg2[1 + arg0] & 0xFF) + ((0xFF & arg2[arg0]) << 8);
    }

    final void a(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            return;
        }
        this.j.seek(arg1);
        this.c = arg1;
    }

    final int a(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int n2 = this.j.read(arg0, arg2, arg1);
        if (~n2 < arg3) {
            this.c += (long)n2;
        }
        return n2;
    }

    d(File arg0, String arg1, long arg2) throws IOException {
        if (0L == (arg2 ^ 0xFFFFFFFFFFFFFFFFL)) {
            arg2 = Long.MAX_VALUE;
        }
        if ((arg2 ^ 0xFFFFFFFFFFFFFFFFL) > (arg0.length() ^ 0xFFFFFFFFFFFFFFFFL)) {
            arg0.delete();
        }
        this.j = new RandomAccessFile(arg0, arg1);
        this.b = arg2;
        this.c = 0L;
        int n2 = this.j.read();
        if (n2 != -1 && !arg1.equals("r")) {
            this.j.seek(0L);
            this.j.write(n2);
        }
        this.j.seek(0L);
    }

    static {
        m = new String[]{"Please enter the number of items to withdraw", "and press enter"};
    }
}

