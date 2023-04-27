/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Image;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class fb
implements ImageProducer,
ImageObserver {
    static i h;
    static aa a;
    static int[] f;
    static int[] d;
    static int[] c;
    static boolean[] k;

    @Override
    public final synchronized void addConsumer(ImageConsumer arg0) {
        u.d = arg0;
        arg0.setDimensions(k.o, da.bb);
        arg0.setProperties(null);
        arg0.setColorModel(m.d);
        arg0.setHints(14);
    }

    @Override
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @Override
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    fb() {
    }

    @Override
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        block0: {
            if (u.d != arg0) break block0;
            u.d = null;
        }
    }

    @Override
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return arg0 == u.d;
    }

    @Override
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    static {
        k = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
        h = new i("RC", 1);
    }
}

