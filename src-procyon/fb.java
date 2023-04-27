import java.awt.image.*;
import java.util.*;
import java.awt.*;

final class fb implements ImageProducer, ImageObserver
{
    static i h;
    static aa a;
    static int[] f;
    static int[] d;
    static int[] c;
    static boolean[] k;
    
    @Override
    public final synchronized void addConsumer(final ImageConsumer arg0) {
        (u.d = arg0).setDimensions(k.o, da.bb);
        arg0.setProperties(null);
        arg0.setColorModel(m.d);
        arg0.setHints(14);
    }
    
    @Override
    public final void startProduction(final ImageConsumer arg0) {
        this.addConsumer(arg0);
    }
    
    @Override
    public final void requestTopDownLeftRightResend(final ImageConsumer arg0) {
    }
    
    fb() {
        super();
    }
    
    @Override
    public final synchronized void removeConsumer(final ImageConsumer arg0) {
        if (u.d == arg0) {
            u.d = null;
        }
    }
    
    @Override
    public final synchronized boolean isConsumer(final ImageConsumer arg0) {
        return arg0 == u.d;
    }
    
    @Override
    public final boolean imageUpdate(final Image arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5) {
        return true;
    }
    
    static {
        fb.k = new boolean[] { false, false, false, false, false, false, false, false, false, false, false, false };
        fb.h = new i("RC", 1);
    }
}
