import java.math.*;
import java.awt.image.*;
import java.awt.*;

final class s
{
    static String[] e;
    static String[] f;
    static BigInteger c;
    static nb a;
    static int d;
    
    static final boolean a(final int arg0, final Font arg1, final int arg2, final int arg3, final e arg4, final char arg5, final FontMetrics arg6, boolean arg7) {
        final int charWidth;
        int i = charWidth = arg6.charWidth(arg5);
        if (arg7) {
            try {
                if (arg5 == 'f' || arg5 == 't' || arg5 == 'w' || arg5 == 'v' || arg5 == 'k' || arg5 == 'x' || arg5 == 'y' || arg5 == 'A' || arg5 == 'V' || arg5 == 'W') {
                    ++i;
                }
                if (arg5 == '/') {
                    arg7 = false;
                }
            }
            catch (final Exception ex) {}
        }
        final int maxAscent = arg6.getMaxAscent();
        final int j = arg6.getMaxAscent() - -arg6.getMaxDescent();
        final int height = arg6.getHeight();
        final Image image = arg4.createImage(i, j);
        if (image == null) {
            return false;
        }
        final Graphics graphics = image.getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, i, j);
        graphics.setColor(Color.white);
        graphics.setFont(arg1);
        graphics.drawString(arg5 + "", 0, maxAscent);
        if (arg7) {
            graphics.drawString(arg5 + "", 1, maxAscent);
        }
        final int[] array = new int[j * i];
        final PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, i, j, array, 0, i);
        try {
            pixelGrabber.grabPixels();
        }
        catch (final InterruptedException ex2) {
            return false;
        }
        image.flush();
        int n = 0;
        int n2 = 0;
        int n3 = i;
        int k = j;
    Label_0391:
        for (int l = 0; l < j; ++l) {
            for (int n4 = 0; i > n4; ++n4) {
                if ((0xFFFFFF & array[n4 - -(l * i)]) != 0x0) {
                    n2 = l;
                    break Label_0391;
                }
            }
        }
    Label_0456:
        for (int n5 = 0; n5 < i; ++n5) {
            for (int n6 = 0; j > n6; ++n6) {
                if ((array[n5 - -(n6 * i)] & 0xFFFFFF) != 0x0) {
                    n = n5;
                    break Label_0456;
                }
            }
        }
        int n7 = j - 1;
        if (arg3 >= -86) {
            a(-60, null, 49, -85, null, '\ufff8', null, true);
        }
    Label_0552:
        while (n7 >= 0) {
            for (int n8 = 0; n8 < i; ++n8) {
                if ((array[n8 + n7 * i] & 0xFFFFFF) != 0x0) {
                    k = 1 + n7;
                    break Label_0552;
                }
            }
            --n7;
        }
    Label_0617:
        for (int n9 = i - 1; n9 >= 0; --n9) {
            for (int n10 = 0; n10 < j; ++n10) {
                if ((0xFFFFFF & array[n9 + n10 * i]) != 0x0) {
                    n3 = n9 + 1;
                    break Label_0617;
                }
            }
        }
        qb.k[0 + 9 * arg2] = (byte)(b.c / 16384);
        qb.k[arg2 * 9 + 1] = (byte)ib.a(b.c / 128, 127);
        qb.k[2 + 9 * arg2] = (byte)ib.a(b.c, 127);
        qb.k[3 + arg2 * 9] = (byte)(-n + n3);
        qb.k[arg2 * 9 + 4] = (byte)(k + -n2);
        qb.k[9 * arg2 + 5] = (byte)n;
        qb.k[6 + arg2 * 9] = (byte)(maxAscent + -n2);
        qb.k[7 + 9 * arg2] = (byte)charWidth;
        qb.k[arg2 * 9 + 8] = (byte)height;
        for (int n11 = n2; k > n11; ++n11) {
            for (int n12 = n; n12 < n3; ++n12) {
                final int n13 = 0xFF & array[i * n11 + n12];
                if (n13 > 30 && n13 < 230) {
                    fb.k[arg0] = true;
                }
                qb.k[b.c++] = (byte)n13;
            }
        }
        return true;
    }
    
    static {
        s.e = new String[] { "Enter number of items to offer and press enter" };
        s.c = new BigInteger("10001", 16);
        s.d = 0;
        s.a = null;
    }
}
