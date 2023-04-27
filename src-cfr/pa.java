/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.image.IndexColorModel;

final class pa {
    static c b;
    static int[] g;
    static int[] f;
    private static byte[] e;
    static int[] a;
    static c k;
    static long h;
    static int[] j;
    static int[] d;

    static final Image a(int arg0, Component arg1, byte[] arg2) {
        k.o = arg2[12] + arg2[13] * 256;
        da.bb = arg2[14] + 256 * arg2[15];
        byte[] byArray = new byte[256];
        byte[] byArray2 = new byte[256];
        byte[] byArray3 = new byte[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            byArray[i2] = arg2[20 + i2 * 3];
            byArray2[i2] = arg2[3 * i2 + 19];
            byArray3[i2] = arg2[3 * i2 + 18];
        }
        m.d = new IndexColorModel(8, 256, byArray, byArray2, byArray3);
        byte[] byArray4 = new byte[k.o * da.bb];
        int n2 = 0;
        for (int i3 = da.bb - 1; i3 >= 0; --i3) {
            for (int i4 = 0; k.o > i4; ++i4) {
                byArray4[n2++] = arg2[k.o * i3 + 786 + i4];
            }
        }
        Image image = arg1.createImage(da.db);
        lb.a(true, byArray4);
        arg1.prepareImage(image, da.db);
        lb.a(true, byArray4);
        arg1.prepareImage(image, da.db);
        lb.a(true, byArray4);
        arg1.prepareImage(image, da.db);
        return image;
    }

    static final byte[] a(int arg0) {
        byte[] byArray = new byte[256];
        int n2 = -128;
        if (arg0 > -125) {
            pa.a(-7, null, null);
        }
        while (n2 < 127) {
            int n3 = n2;
            int n4 = (n3 ^= 0xFFFFFFFF) & 0x80;
            int n5 = n3 >> 4 & 7;
            int n6 = 0xF & n3;
            n6 |= 0x10;
            n6 = 1 + (n6 << 1);
            int n7 = n6 << n5 + 2;
            n7 -= 132;
            if (n4 != 0) {
                n7 = -n7;
            }
            byArray[ib.a((int)n2, (int)255)] = (byte)(n7 / 256);
            ++n2;
        }
        return byArray;
    }

    static {
        int n2;
        e = new byte[64];
        g = new int[100];
        a = new int[512];
        j = new int[2048];
        d = new int[256];
        for (n2 = 0; n2 < 256; ++n2) {
            pa.a[n2] = (int)(32768.0 * Math.sin(0.02454369 * (double)n2));
            pa.a[256 + n2] = (int)(32768.0 * Math.cos((double)n2 * 0.02454369));
        }
        for (n2 = 0; n2 < 1024; ++n2) {
            pa.j[n2] = (int)(Math.sin((double)n2 * 0.00613592315) * 32768.0);
            pa.j[n2 + 1024] = (int)(Math.cos((double)n2 * 0.00613592315) * 32768.0);
        }
        for (n2 = 0; n2 < 10; ++n2) {
            pa.e[n2] = (byte)(48 + n2);
        }
        for (n2 = 0; n2 < 26; ++n2) {
            pa.e[n2 + 10] = (byte)(n2 + 65);
        }
        for (n2 = 0; n2 < 26; ++n2) {
            pa.e[n2 + 36] = (byte)(97 + n2);
        }
        pa.e[63] = 36;
        pa.e[62] = -93;
        for (n2 = 0; n2 < 10; ++n2) {
            pa.d[n2 + 48] = n2;
        }
        for (n2 = 0; n2 < 26; ++n2) {
            pa.d[n2 + 65] = n2 + 10;
        }
        for (n2 = 0; n2 < 26; ++n2) {
            pa.d[n2 + 97] = 36 + n2;
        }
        pa.d[36] = 63;
        pa.d[163] = 62;
    }
}

