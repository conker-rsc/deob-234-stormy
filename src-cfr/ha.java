/*
 * Decompiled with CFR 0.152.
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

final class ha {
    private DisplayMode a;
    private GraphicsDevice b;

    public final void exit() {
        if (this.a != null) {
            this.b.setDisplayMode(this.a);
            if (!this.b.getDisplayMode().equals(this.a)) {
                throw new RuntimeException("");
            }
            this.a = null;
        }
        this.a(null, (byte)109);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Frame arg0, byte arg1) {
        this.b.setFullScreenWindow(arg0);
    }

    public final int[] listmodes() {
        DisplayMode[] displayModeArray = this.b.getDisplayModes();
        int[] nArray = new int[displayModeArray.length << 2];
        for (int i2 = 0; displayModeArray.length > i2; ++i2) {
            nArray[i2 << 2] = displayModeArray[i2].getWidth();
            nArray[(i2 << 2) + 1] = displayModeArray[i2].getHeight();
            nArray[(i2 << 2) + 2] = displayModeArray[i2].getBitDepth();
            nArray[(i2 << 2) + 3] = displayModeArray[i2].getRefreshRate();
        }
        return nArray;
    }

    public ha() throws Exception {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.b = graphicsEnvironment.getDefaultScreenDevice();
        if (!this.b.isFullScreenSupported()) {
            GraphicsDevice[] graphicsDeviceArray;
            GraphicsDevice[] graphicsDeviceArray2 = graphicsDeviceArray = graphicsEnvironment.getScreenDevices();
            for (int i2 = 0; graphicsDeviceArray2.length > i2; ++i2) {
                GraphicsDevice graphicsDevice = graphicsDeviceArray2[i2];
                if (graphicsDevice == null || !graphicsDevice.isFullScreenSupported()) continue;
                this.b = graphicsDevice;
                return;
            }
            throw new Exception();
        }
    }

    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.a = this.b.getDisplayMode();
        if (this.a == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.a(arg0, (byte)-93);
        if (arg4 == 0) {
            int n2 = this.a.getRefreshRate();
            DisplayMode[] displayModeArray = this.b.getDisplayModes();
            boolean bl = false;
            for (int i2 = 0; i2 < displayModeArray.length; ++i2) {
                if (arg1 != displayModeArray[i2].getWidth() || arg2 != displayModeArray[i2].getHeight() || displayModeArray[i2].getBitDepth() != arg3) continue;
                int n3 = displayModeArray[i2].getRefreshRate();
                if (bl && Math.abs(-n2 + n3) >= Math.abs(-n2 + arg4)) continue;
                arg4 = n3;
                bl = true;
            }
            if (!bl) {
                arg4 = n2;
            }
        }
        this.b.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }
}

