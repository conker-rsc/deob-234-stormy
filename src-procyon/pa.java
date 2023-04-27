import java.awt.*;
import java.awt.image.*;

final class pa
{
    static c b;
    static int[] g;
    static int[] f;
    private static byte[] e;
    static int[] a;
    static c k;
    static long h;
    static int[] j;
    static int[] d;
    
    static final Image a(final int arg0, final Component arg1, final byte[] arg2) {
        k.o = arg2[12] + arg2[13] * 256;
        da.bb = arg2[14] + 256 * arg2[15];
        final byte[] array = new byte[256];
        final byte[] array2 = new byte[256];
        final byte[] array3 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            array[i] = arg2[20 + i * 3];
            array2[i] = arg2[3 * i + 19];
            array3[i] = arg2[3 * i + 18];
        }
        m.d = new IndexColorModel(8, 256, array, array2, array3);
        final byte[] arg3 = new byte[k.o * da.bb];
        int n = 0;
        for (int j = da.bb - 1; j >= 0; --j) {
            for (int n2 = 0; k.o > n2; ++n2) {
                arg3[n++] = arg2[k.o * j + 786 + n2];
            }
        }
        final Image image = arg1.createImage(da.db);
        lb.a(true, arg3);
        arg1.prepareImage(image, da.db);
        lb.a(true, arg3);
        arg1.prepareImage(image, da.db);
        lb.a(true, arg3);
        arg1.prepareImage(image, da.db);
        return image;
    }
    
    static final byte[] a(final int arg0) {
        final byte[] array = new byte[256];
        int i = -128;
        if (arg0 > -125) {
            a(-7, null, null);
        }
        while (i < 127) {
            final int n = ~(byte)i;
            final int n2 = n & 0x80;
            int n3 = (1 + (((0xF & n) | 0x10) << 1) << (n >> 4 & 0x7) + 2) - 132;
            if (n2 != 0) {
                n3 = -n3;
            }
            array[ib.a(i, 255)] = (byte)(n3 / 256);
            ++i;
        }
        return array;
    }
    
    static {
        pa.e = new byte[64];
        pa.g = new int[100];
        pa.a = new int[512];
        pa.j = new int[2048];
        pa.d = new int[256];
        for (int i = 0; i < 256; ++i) {
            pa.a[i] = (int)(32768.0 * Math.sin(0.02454369 * i));
            pa.a[256 + i] = (int)(32768.0 * Math.cos(i * 0.02454369));
        }
        for (int j = 0; j < 1024; ++j) {
            pa.j[j] = (int)(Math.sin(j * 0.00613592315) * 32768.0);
            pa.j[j + 1024] = (int)(Math.cos(j * 0.00613592315) * 32768.0);
        }
        for (int k = 0; k < 10; ++k) {
            pa.e[k] = (byte)(48 + k);
        }
        for (int l = 0; l < 26; ++l) {
            pa.e[l + 10] = (byte)(l + 65);
        }
        for (int n = 0; n < 26; ++n) {
            pa.e[n + 36] = (byte)(97 + n);
        }
        pa.e[63] = 36;
        pa.e[62] = -93;
        for (int n2 = 0; n2 < 10; ++n2) {
            pa.d[n2 + 48] = n2;
        }
        for (int n3 = 0; n3 < 26; ++n3) {
            pa.d[n3 + 65] = n3 + 10;
        }
        for (int n4 = 0; n4 < 26; ++n4) {
            pa.d[n4 + 97] = 36 + n4;
        }
        pa.d[36] = 63;
        pa.d[163] = 62;
    }
}
