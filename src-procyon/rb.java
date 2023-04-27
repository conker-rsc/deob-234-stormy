import com.ms.directX.*;

final class rb implements ma
{
    private DSBufferDesc[] b;
    private DSCursors[] a;
    
    public rb() throws Exception {
        super();
        this.b = new DSBufferDesc[2];
        this.a = new DSCursors[2];
        new DirectSound();
        new WaveFormatEx();
        for (int i = 0; i < 2; ++i) {
            this.b[i] = new DSBufferDesc();
        }
        for (int j = 0; j < 2; ++j) {
            this.a[j] = new DSCursors();
        }
    }
}
