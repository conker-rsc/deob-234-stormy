/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class j {
    private Robot a = new Robot();
    private Component b;

    public final void showcursor(Component arg0, boolean arg1) {
        block5: {
            if (arg1) {
                arg0 = null;
            } else if (arg0 == null) {
                throw new NullPointerException();
            }
            if (arg0 == this.b) {
                return;
            }
            if (this.b != null) {
                this.b.setCursor(null);
                this.b = null;
            }
            if (arg0 == null) break block5;
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this.b = arg0;
        }
    }

    public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
        if (arg1 != null) {
            BufferedImage bufferedImage = new BufferedImage(arg2, arg3, 2);
            bufferedImage.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(bufferedImage, arg4, null));
        } else {
            arg0.setCursor(null);
        }
    }

    public final void movemouse(int arg0, int arg1) {
        this.a.mouseMove(arg0, arg1);
    }
}

