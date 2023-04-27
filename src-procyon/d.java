import java.io.*;

final class d
{
    static int l;
    static int[] g;
    private RandomAccessFile j;
    private long c;
    static e h;
    private long b;
    static String[] m;
    
    private final void a(final int arg0) throws IOException {
        if (this.j != null) {
            this.j.close();
            this.j = null;
        }
        if (arg0 != 25291) {
            a(62, (byte)14, null);
        }
    }
    
    final long a(final byte arg0) throws IOException {
        if (arg0 != 47) {
            this.c = -52L;
        }
        return this.j.length();
    }
    
    @Override
    protected final void finalize() throws Throwable {
        if (this.j != null) {
            System.out.println("");
            this.a(25291);
        }
    }
    
    static int a(final int arg0, final int arg1) {
        return arg0 | arg1;
    }
    
    final void b(final byte[] arg0, final int arg1, final int arg2, final int arg3) throws IOException {
        if (~this.b > ~(this.c + arg1)) {
            this.j.seek(this.b);
            this.j.write(1);
            throw new EOFException();
        }
        this.j.write(arg0, arg3, arg1);
        this.c += arg1;
        if (arg2 != 1) {
            a(63, (byte)(-101), null);
        }
    }
    
    static final int a(final int arg0, final byte arg1, final byte[] arg2) {
        if (arg1 < 4) {
            d.h = null;
        }
        return (arg2[1 + arg0] & 0xFF) + ((0xFF & arg2[arg0]) << 8);
    }
    
    final void a(final int arg0, final long arg1) throws IOException {
        if (arg0 != 0) {
            return;
        }
        this.j.seek(arg1);
        this.c = arg1;
    }
    
    final int a(final byte[] arg0, final int arg1, final int arg2, final int arg3) throws IOException {
        final int read = this.j.read(arg0, arg2, arg1);
        if (~read < arg3) {
            this.c += read;
        }
        return read;
    }
    
    d(final File arg0, final String arg1, long arg2) throws IOException {
        super();
        if (0x0L == ~arg2) {
            arg2 = Long.MAX_VALUE;
        }
        if (~arg2 > ~arg0.length()) {
            arg0.delete();
        }
        this.j = new RandomAccessFile(arg0, arg1);
        this.b = arg2;
        this.c = 0L;
        final int read = this.j.read();
        if (read != -1 && !arg1.equals("r")) {
            this.j.seek(0L);
            this.j.write(read);
        }
        this.j.seek(0L);
    }
    
    static {
        d.l = 0;
        d.m = new String[] { "Please enter the number of items to withdraw", "and press enter" };
    }
}
