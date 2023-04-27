final class ia
{
    static int b;
    static String[] a;
    static int[] d;
    static int h;
    static int i;
    static String[] g;
    
    static final void a(int arg0, int arg1, final int[] arg2, int arg3, int arg4, final int[] arg5, final int arg6, final byte arg7) {
        if (arg6 >= 0) {
            return;
        }
        arg1 = arg2[(0xFFB9 & arg3) >> 8];
        arg0 <<= 1;
        arg3 += arg0;
        for (int i = arg6 / 8; i < 0; ++i) {
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[(0xFFDF & arg3) >> 8];
            arg3 += arg0;
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[(arg3 & 0xFF6F) >> 8];
            arg5[arg4++] = arg1;
            arg3 += arg0;
            arg5[arg4++] = arg1;
            arg1 = arg2[(0xFF16 & arg3) >> 8];
            arg3 += arg0;
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[(arg3 & 0xFF6A) >> 8];
            arg3 += arg0;
        }
        for (int n = -(arg6 % 8), j = 0; j < n; ++j) {
            arg5[arg4++] = arg1;
            if ((j & 0x1) == 0x1) {
                arg1 = arg2[arg3 >> 8 & 0xFF];
                arg3 += arg0;
            }
        }
    }
    
    static final String a(final tb arg0, final boolean arg1) {
        if (arg1) {
            ia.a = null;
        }
        return client.a(0, arg0, 32767);
    }
    
    static final boolean a(final v arg0, final byte arg1) {
        return da.O == arg0 || ga.c == arg0 || ta.f == arg0 || arg0 == eb.d || gb.n == arg0;
    }
    
    static {
        ia.b = 0;
        ia.d = new int[256];
        ia.a = new String[100];
        ia.i = 0;
        ia.g = new String[100];
    }
}
