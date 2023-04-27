/*
 * Decompiled with CFR 0.152.
 */
import java.awt.AWTEvent;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

final class qb
extends Frame {
    static int[] e;
    static byte[] k;
    private e g;
    static int[][] d;
    private int c = 0;
    private int l;
    private int j = 28;
    private int h;

    @Override
    protected final void processEvent(AWTEvent arg0) {
        if (arg0 instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent)arg0;
            arg0 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiers(), mouseEvent.getX(), mouseEvent.getY() - 24, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger());
        }
        super.processEvent(arg0);
    }

    @Override
    public final void paint(Graphics arg0) {
        this.g.paint(arg0);
    }

    @Override
    public final void resize(int arg0, int arg1) {
        super.resize(arg0, this.j + arg1);
    }

    @Override
    public final Graphics getGraphics() {
        Graphics graphics = super.getGraphics();
        if (this.c != 0) {
            graphics.translate(-5, 0);
        } else {
            graphics.translate(0, 24);
        }
        return graphics;
    }

    qb(e arg0, int arg1, int arg2, String arg3, boolean arg4, boolean arg5) {
        this.g = arg0;
        this.j = !arg5 ? 28 : 48;
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
        k = new byte[100000];
    }
}

