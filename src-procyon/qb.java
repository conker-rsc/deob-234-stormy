import java.awt.event.*;
import java.awt.*;

final class qb extends Frame
{
    static int[] e;
    static byte[] k;
    private e g;
    static int[][] d;
    private int c;
    private int l;
    private int j;
    private int h;
    
    @Override
    protected final void processEvent(AWTEvent arg0) {
        if (arg0 instanceof MouseEvent) {
            final MouseEvent mouseEvent = (MouseEvent)arg0;
            arg0 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiers(), mouseEvent.getX(), mouseEvent.getY() - 24, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger());
        }
        super.processEvent(arg0);
    }
    
    @Override
    public final void paint(final Graphics arg0) {
        this.g.paint(arg0);
    }
    
    @Override
    public final void resize(final int arg0, final int arg1) {
        super.resize(arg0, this.j + arg1);
    }
    
    @Override
    public final Graphics getGraphics() {
        final Graphics graphics = super.getGraphics();
        if (this.c != 0) {
            graphics.translate(-5, 0);
        }
        else {
            graphics.translate(0, 24);
        }
        return graphics;
    }
    
    qb(final e arg0, final int arg1, final int arg2, final String arg3, final boolean arg4, final boolean arg5) {
        super();
        this.j = 28;
        this.c = 0;
        this.g = arg0;
        if (!arg5) {
            this.j = 28;
        }
        else {
            this.j = 48;
        }
        this.l = arg1;
        this.h = arg2;
        this.setTitle(arg3);
        this.setResizable(arg4);
        this.show();
        this.toFront();
        this.resize(this.l, this.h);
        this.getGraphics();
    }
    
    static {
        qb.k = new byte[100000];
    }
}
