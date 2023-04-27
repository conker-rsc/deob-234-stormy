abstract class va extends ib
{
    va j;
    bb h;
    int i;
    volatile boolean g;
    
    abstract void b(final int p0);
    
    abstract int d();
    
    abstract va a();
    
    abstract void b(final int[] p0, final int p1, final int p2);
    
    abstract va b();
    
    int c() {
        return 255;
    }
    
    final void a(final int[] arg0, final int arg1, final int arg2) {
        if (this.g) {
            this.b(arg0, arg1, arg2);
        }
        else {
            this.b(arg2);
        }
    }
    
    va() {
        super();
        this.g = true;
    }
}
