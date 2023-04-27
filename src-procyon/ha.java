import java.awt.*;

final class ha
{
    private DisplayMode a;
    private GraphicsDevice b;
    
    public final void exit() {
        try {
            if (this.a != null) {
                this.b.setDisplayMode(this.a);
                if (!this.b.getDisplayMode().equals(this.a)) {
                    throw new RuntimeException("");
                }
                this.a = null;
            }
            this.a(null, (byte)109);
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
    }
    
    private final void a(final Frame arg0, final byte arg1) {
        try {
            this.b.setFullScreenWindow(arg0);
        }
        finally {}
    }
    
    public final int[] listmodes() {
        final DisplayMode[] displayModes = this.b.getDisplayModes();
        final int[] array = new int[displayModes.length << 2];
        for (int n = 0; displayModes.length > n; ++n) {
            array[n << 2] = displayModes[n].getWidth();
            array[(n << 2) + 1] = displayModes[n].getHeight();
            array[(n << 2) + 2] = displayModes[n].getBitDepth();
            array[(n << 2) + 3] = displayModes[n].getRefreshRate();
        }
        return array;
    }
    
    public ha() throws Exception {
        super();
        final GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.b = localGraphicsEnvironment.getDefaultScreenDevice();
        if (!this.b.isFullScreenSupported()) {
            final GraphicsDevice[] screenDevices = localGraphicsEnvironment.getScreenDevices();
            for (int n = 0; screenDevices.length > n; ++n) {
                final GraphicsDevice b = screenDevices[n];
                if (b != null && b.isFullScreenSupported()) {
                    this.b = b;
                    return;
                }
            }
            throw new Exception();
        }
    }
    
    public final void enter(final Frame arg0, final int arg1, final int arg2, final int arg3, int arg4) {
        this.a = this.b.getDisplayMode();
        if (this.a != null) {
            arg0.setUndecorated(true);
            arg0.enableInputMethods(false);
            this.a(arg0, (byte)(-93));
            if (arg4 == 0) {
                final int refreshRate = this.a.getRefreshRate();
                final DisplayMode[] displayModes = this.b.getDisplayModes();
                int n = 0;
                for (int i = 0; i < displayModes.length; ++i) {
                    if (arg1 == displayModes[i].getWidth() && arg2 == displayModes[i].getHeight() && displayModes[i].getBitDepth() == arg3) {
                        final int refreshRate2 = displayModes[i].getRefreshRate();
                        if (n == 0 || Math.abs(-refreshRate + refreshRate2) < Math.abs(-refreshRate + arg4)) {
                            arg4 = refreshRate2;
                            n = 1;
                        }
                    }
                }
                if (n == 0) {
                    arg4 = refreshRate;
                }
            }
            this.b.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
            return;
        }
        throw new NullPointerException();
    }
}
