/*
 * Decompiled with CFR 0.152.
 */
abstract class va
extends ib {
    va j;
    bb h;
    int i;
    volatile boolean g = true;

    abstract void b(int var1);

    abstract int d();

    abstract va a();

    abstract void b(int[] var1, int var2, int var3);

    abstract va b();

    int c() {
        return 255;
    }

    final void a(int[] arg0, int arg1, int arg2) {
        if (this.g) {
            this.b(arg0, arg1, arg2);
        } else {
            this.b(arg2);
        }
    }

    va() {
    }
}

