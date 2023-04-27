import java.awt.image.*;
import java.awt.*;

final class j
{
    private Robot a;
    private Component b;
    
    public final void showcursor(Component arg0, final boolean arg1) {
        if (arg1) {
            arg0 = null;
        }
        else if (arg0 == null) {
            throw new NullPointerException();
        }
        if (arg0 != this.b) {
            if (this.b != null) {
                this.b.setCursor(null);
                this.b = null;
            }
            if (arg0 != null) {
                arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
                this.b = arg0;
            }
        }
    }
    
    public final void setcustomcursor(final Component arg0, final int[] arg1, final int arg2, final int arg3, final Point arg4) {
        if (arg1 != null) {
            final BufferedImage bufferedImage = new BufferedImage(arg2, arg3, 2);
            bufferedImage.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(bufferedImage, arg4, null));
        }
        else {
            arg0.setCursor(null);
        }
    }
    
    public final void movemouse(final int arg0, final int arg1) {
        this.a.mouseMove(arg0, arg1);
    }
    
    public j() throws Exception {
        super();
        this.a = new Robot();
    }
}
