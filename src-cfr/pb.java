/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class pb
extends sa {
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
        int n2 = 256;
        if (i) {
            n2 <<= 1;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.j[i2];
            if ((n3 + 0x800000 & 0xFF000000) != 0) {
                n3 = 0x7FFFFF ^ n3 >> 31;
            }
            this.v[i2 * 2] = (byte)(n3 >> 8);
            this.v[i2 * 2 + 1] = (byte)(n3 >> 16);
        }
        this.w.write(this.v, 0, n2 << 1);
    }

    pb() {
    }

    @Override
    final int b() {
        return this.x - (this.w.available() >> (i ? 2 : 1));
    }

    @Override
    final void b(int arg0) throws LineUnavailableException {
        try {
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, this.y, arg0 << (i ? 2 : 1));
            this.w = (SourceDataLine)AudioSystem.getLine(info);
            this.w.open();
            this.w.start();
            this.x = arg0;
        }
        catch (LineUnavailableException lineUnavailableException) {
            if (ta.a(arg0, (byte)-59) != 1) {
                this.b(aa.a(arg0, false));
                return;
            }
            this.w = null;
            throw lineUnavailableException;
        }
    }

    @Override
    final void a(Component arg0) {
        Mixer.Info[] infoArray = AudioSystem.getMixerInfo();
        if (infoArray != null) {
            Mixer.Info[] infoArray2 = infoArray;
            for (int i2 = 0; i2 < infoArray2.length; ++i2) {
                String string;
                Mixer.Info info = infoArray2[i2];
                if (info != null && (string = info.getName()) != null && string.toLowerCase().indexOf("soundmax") < 0) continue;
            }
        }
        this.y = new AudioFormat(t, 16, i ? 2 : 1, true, false);
        this.v = new byte[256 << (i ? 2 : 1)];
    }
}

