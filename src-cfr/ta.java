/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class ta {
    int t;
    static v f = new v("WTWIP", "office", "_wip", 3);
    int y;
    int s = -1;
    int[] m = new int[12];
    int[] F = new int[10];
    int D;
    String n;
    int p;
    int q;
    int z = 0;
    String C;
    int b;
    int x;
    int[] k = new int[10];
    int j;
    static String[] r;
    int u = 0;
    int A;
    int h = 0;
    int J = 0;
    int H;
    int e;
    int i;
    static int g;
    int o;
    String c;
    int I = 0;
    int B = 0;
    int a = 0;
    int w = 0;
    int G = 0;
    int E = 0;
    int K;
    int d = 0;

    static final void a(String arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -19675) {
            f = null;
        }
        InputStream inputStream = nb.a(true, arg0);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            dataInputStream.readFully(arg2, 0, arg3);
        }
        catch (EOFException eOFException) {
            // empty catch block
        }
        dataInputStream.close();
    }

    static final int a(int arg0, byte arg1) {
        arg0 = (0x55555555 & arg0 >>> 1) + (0x55555555 & arg0);
        arg0 = ((arg0 & 0xCCCCCCCC) >>> 2) + (0x33333333 & arg0);
        arg0 = arg0 - -(arg0 >>> 4) & 0xF0F0F0F;
        arg0 += arg0 >>> 8;
        arg0 += arg0 >>> 16;
        return 0xFF & arg0;
    }

    ta() {
    }

    static {
        g = 176;
    }
}

