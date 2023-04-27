import java.awt.*;
import javax.sound.sampled.*;

final class pb extends sa
{
    private int x;
    private byte[] v;
    private AudioFormat y;
    private SourceDataLine w;
    
    @Override
    final void e() {
        if (this.w != null) {
            this.w.close();
            this.w = null;
        }
    }
    
    @Override
    final void c() {
        int n = 256;
        if (pb.i) {
            n <<= 1;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = this.j[i];
            if ((n2 + 8388608 & 0xFF000000) != 0x0) {
                n2 = (0x7FFFFF ^ n2 >> 31);
            }
            this.v[i * 2] = (byte)(n2 >> 8);
            this.v[i * 2 + 1] = (byte)(n2 >> 16);
        }
        this.w.write(this.v, 0, n << 1);
    }
    
    pb() {
        super();
    }
    
    @Override
    final int b() {
        return this.x - (this.w.available() >> (pb.i ? 2 : 1));
    }
    
    @Override
    final void b(final int arg0) throws LineUnavailableException {
        try {
            (this.w = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, this.y, arg0 << (pb.i ? 2 : 1)))).open();
            this.w.start();
            this.x = arg0;
        }
        catch (final LineUnavailableException ex) {
            if (ta.a(arg0, (byte)(-59)) != 1) {
                this.b(aa.a(arg0, false));
                return;
            }
            this.w = null;
            throw ex;
        }
    }
    
    @Override
    final void a(final Component arg0) {
        final Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
        if (mixerInfo != null) {
            final Mixer.Info[] array = mixerInfo;
            for (int i = 0; i < array.length; ++i) {
                final Mixer.Info info = array[i];
                if (info != null) {
                    final String name = info.getName();
                    if (name == null || name.toLowerCase().indexOf("soundmax") >= 0) {}
                }
            }
        }
        this.y = new AudioFormat((float)pb.t, 16, pb.i ? 2 : 1, true, false);
        this.v = new byte[256 << (pb.i ? 2 : 1)];
    }
}
