final class n
{
    int e;
    static int[] a;
    int k;
    static nb h;
    static String[] f;
    int d;
    int l;
    static int[] j;
    static int g;
    static int[] m;
    static int c;
    static int b;
    
    static final void a(final byte arg0, final String arg1) {
        if (arg0 != -93) {
            n.f = null;
        }
        System.out.println("Error: " + jb.a(true, "\n", "%0a", arg1));
    }
    
    n() {
        super();
    }
    
    static {
        n.h = null;
        n.f = new String[] { "Enter number of items to remove and press enter" };
        final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        n.a = new int[256];
        for (int i = 0; i < 256; ++i) {
            int index = s.indexOf(i);
            if (index == -1) {
                index = 74;
            }
            n.a[i] = 9 * index;
        }
        n.g = 0;
        n.j = new int[100];
        n.c = 0;
        n.b = 0;
    }
}
