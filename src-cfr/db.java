/*
 * Decompiled with CFR 0.152.
 */
final class db {
    static int[] j;
    static int d;
    static int[] l;
    static byte[] i;
    static i f;
    ib k;
    static int g;
    private ib b;

    final void a(ib arg0, boolean arg1) {
        block1: {
            if (arg0.e != null) {
                arg0.a(-27331);
            }
            arg0.e = this.k;
            arg0.a = this.k.a;
            arg0.e.a = arg0;
            arg0.a.e = arg0;
            if (!arg1) break block1;
            this.b((byte)78);
        }
    }

    final ib a(byte arg0) {
        ib ib2 = this.k.a;
        if (this.k == ib2) {
            this.b = null;
            return null;
        }
        this.b = ib2.a;
        return ib2;
    }

    final ib b(byte arg0) {
        ib ib2 = this.b;
        if (this.k == ib2) {
            this.b = null;
            return null;
        }
        this.b = ib2.a;
        return ib2;
    }

    public db() {
        this.k.e = this.k = new ib();
        this.k.a = this.k;
    }

    static final boolean a(int arg0, char arg1) {
        if (arg0 != 32) {
            return false;
        }
        return arg1 == '\u00a0' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    static {
        g = 0;
    }
}

