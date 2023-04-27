/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.math.BigInteger;

final class s {
    static String[] e = new String[]{"Enter number of items to offer and press enter"};
    static String[] f;
    static BigInteger c;
    static nb a;
    static int d;

    static final boolean a(int arg0, Font arg1, int arg2, int arg3, e arg4, char arg5, FontMetrics arg6, boolean arg7) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = n5 = arg6.charWidth(arg5);
        if (arg7) {
            try {
                if (arg5 == 'f' || arg5 == 't' || arg5 == 'w' || arg5 == 'v' || arg5 == 'k' || arg5 == 'x' || arg5 == 'y' || arg5 == 'A' || arg5 == 'V' || arg5 == 'W') {
                    ++n5;
                }
                if (arg5 == '/') {
                    arg7 = false;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        int n7 = arg6.getMaxAscent();
        int n8 = arg6.getMaxAscent() - -arg6.getMaxDescent();
        int n9 = arg6.getHeight();
        Image image = arg4.createImage(n5, n8);
        if (image == null) {
            return false;
        }
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, n5, n8);
        graphics.setColor(Color.white);
        graphics.setFont(arg1);
        graphics.drawString(arg5 + "", 0, n7);
        if (arg7) {
            graphics.drawString(arg5 + "", 1, n7);
        }
        int[] nArray = new int[n8 * n5];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n5, n8, nArray, 0, n5);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            return false;
        }
        image.flush();
        image = null;
        int n10 = 0;
        int n11 = 0;
        int n12 = n5;
        int n13 = n8;
        block4: for (n4 = 0; n4 < n8; ++n4) {
            for (n3 = 0; n5 > n3; ++n3) {
                n2 = nArray[n3 - -(n4 * n5)];
                if ((0xFFFFFF & n2) == 0) continue;
                n11 = n4;
                break block4;
            }
        }
        block6: for (n4 = 0; n4 < n5; ++n4) {
            for (n3 = 0; n8 > n3; ++n3) {
                n2 = nArray[n4 - -(n3 * n5)];
                if ((n2 & 0xFFFFFF) == 0) continue;
                n10 = n4;
                break block6;
            }
        }
        n4 = n8 - 1;
        if (arg3 >= -86) {
            s.a(-60, null, 49, -85, null, '\ufff8', null, true);
        }
        block8: while (n4 >= 0) {
            for (n3 = 0; n3 < n5; ++n3) {
                n2 = nArray[n3 + n4 * n5];
                if ((n2 & 0xFFFFFF) == 0) continue;
                n13 = 1 + n4;
                break block8;
            }
            --n4;
        }
        block10: for (n4 = n5 - 1; n4 >= 0; --n4) {
            for (n3 = 0; n3 < n8; ++n3) {
                n2 = nArray[n4 + n3 * n5];
                if ((0xFFFFFF & n2) == 0) continue;
                n12 = n4 + 1;
                break block10;
            }
        }
        qb.k[0 + 9 * arg2] = (byte)(b.c / 16384);
        qb.k[arg2 * 9 + 1] = (byte)ib.a(b.c / 128, 127);
        qb.k[2 + 9 * arg2] = (byte)ib.a(b.c, 127);
        qb.k[3 + arg2 * 9] = (byte)(-n10 + n12);
        qb.k[arg2 * 9 + 4] = (byte)(n13 + -n11);
        qb.k[9 * arg2 + 5] = (byte)n10;
        qb.k[6 + arg2 * 9] = (byte)(n7 + -n11);
        qb.k[7 + 9 * arg2] = (byte)n6;
        qb.k[arg2 * 9 + 8] = (byte)n9;
        for (n4 = n11; n13 > n4; ++n4) {
            for (n3 = n10; n3 < n12; ++n3) {
                n2 = 0xFF & nArray[n5 * n4 + n3];
                if (n2 > 30 && n2 < 230) {
                    fb.k[arg0] = true;
                }
                qb.k[b.c++] = (byte)n2;
            }
        }
        return true;
    }

    static {
        c = new BigInteger("10001", 16);
        d = 0;
        a = null;
    }
}

