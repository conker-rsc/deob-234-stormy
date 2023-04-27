/*
 * Decompiled with CFR 0.152.
 */
final class eb
implements Runnable {
    volatile boolean a = false;
    volatile sa[] f = new sa[2];
    c g;
    volatile boolean i = false;
    static i e = new i("LIVE", 0);
    static v d = new v("WTI", "office", "_wti", 5);
    static int[] b;
    private static char[] c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        this.i = true;
        try {
            while (!this.a) {
                for (int i2 = 0; i2 < 2; ++i2) {
                    sa sa2 = this.f[i2];
                    if (sa2 == null) continue;
                    sa2.a();
                }
                mb.a(11200, 10L);
                ba.a(null, 1, this.g);
            }
        }
        catch (Exception exception) {
            mb.a(0x1FFFFF, exception, null);
        }
        finally {
            this.i = false;
        }
    }

    eb() {
    }

    static {
        c = new char[256];
        for (int i2 = 0; i2 < 256; ++i2) {
            eb.c[i2] = (char)i2;
        }
        eb.c[45] = 45;
        eb.c[59] = 59;
        eb.c[42] = 42;
        eb.c[124] = 124;
        eb.c[43] = 43;
        eb.c[33] = 33;
        eb.c[34] = 34;
        eb.c[47] = 47;
        eb.c[46] = 46;
        eb.c[61] = 61;
        eb.c[92] = 92;
        eb.c[44] = 44;
    }
}

