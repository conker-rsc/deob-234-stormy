import java.io.*;

final class ta
{
    int t;
    static v f;
    int y;
    int s;
    int[] m;
    int[] F;
    int D;
    String n;
    int p;
    int q;
    int z;
    String C;
    int b;
    int x;
    int[] k;
    int j;
    static String[] r;
    int u;
    int A;
    int h;
    int J;
    int H;
    int e;
    int i;
    static int g;
    int o;
    String c;
    int I;
    int B;
    int a;
    int w;
    int G;
    int E;
    int K;
    int d;
    
    static final void a(final String arg0, final int arg1, final byte[] arg2, final int arg3) throws IOException {
        if (arg1 != -19675) {
            ta.f = null;
        }
        final DataInputStream dataInputStream = new DataInputStream(nb.a(true, arg0));
        try {
            dataInputStream.readFully(arg2, 0, arg3);
        }
        catch (final EOFException ex) {}
        dataInputStream.close();
    }
    
    static final int a(int arg0, final byte arg1) {
        arg0 = (0x55555555 & arg0 >>> 1) + (0x55555555 & arg0);
        arg0 = ((arg0 & 0xCCCCCCCC) >>> 2) + (0x33333333 & arg0);
        arg0 = (arg0 - -(arg0 >>> 4) & 0xF0F0F0F);
        arg0 += arg0 >>> 8;
        arg0 += arg0 >>> 16;
        return 0xFF & arg0;
    }
    
    ta() {
        super();
        this.m = new int[12];
        this.F = new int[10];
        this.k = new int[10];
        this.s = -1;
        this.J = 0;
        this.z = 0;
        this.u = 0;
        this.h = 0;
        this.a = 0;
        this.w = 0;
        this.I = 0;
        this.B = 0;
        this.E = 0;
        this.G = 0;
        this.d = 0;
    }
    
    static {
        ta.f = new v("WTWIP", "office", "_wip", 3);
        ta.g = 176;
    }
}
