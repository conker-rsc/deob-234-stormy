/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ms.directX.DSBufferDesc
 *  com.ms.directX.DSCursors
 *  com.ms.directX.DirectSound
 *  com.ms.directX.WaveFormatEx
 */
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.WaveFormatEx;

final class rb
implements ma {
    private DSBufferDesc[] b = new DSBufferDesc[2];
    private DSCursors[] a = new DSCursors[2];

    public rb() throws Exception {
        int n2;
        new DirectSound();
        new WaveFormatEx();
        for (n2 = 0; n2 < 2; ++n2) {
            this.b[n2] = new DSBufferDesc();
        }
        for (n2 = 0; n2 < 2; ++n2) {
            this.a[n2] = new DSCursors();
        }
    }
}

