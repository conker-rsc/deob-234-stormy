/*
 * Decompiled with CFR 0.152.
 */
final class ia {
    static int b = 0;
    static String[] a;
    static int[] d;
    static int h;
    static int i;
    static String[] g;

    static final void a(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7) {
        int n2;
        int n3;
        if (arg6 >= 0) {
            return;
        }
        arg1 = arg2[(0xFFB9 & arg3) >> 8];
        arg3 += (arg0 <<= 1);
        for (n3 = n2 = arg6 / 8; n3 < 0; ++n3) {
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[(0xFFDF & arg3) >> 8];
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[((arg3 += arg0) & 0xFF6F) >> 8];
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[(0xFF16 & (arg3 += arg0)) >> 8];
            arg5[arg4++] = arg1;
            arg5[arg4++] = arg1;
            arg1 = arg2[((arg3 += arg0) & 0xFF6A) >> 8];
            arg3 += arg0;
        }
        n2 = -(arg6 % 8);
        for (n3 = 0; n3 < n2; ++n3) {
            arg5[arg4++] = arg1;
            if ((n3 & 1) != 1) continue;
            arg1 = arg2[arg3 >> 8 & 0xFF];
            arg3 += arg0;
        }
    }

    static final String a(tb arg0, boolean arg1) {
        if (arg1) {
            a = null;
        }
        return client.a(0, arg0, Short.MAX_VALUE);
    }

    static final boolean a(v arg0, byte arg1) {
        return da.O == arg0 || ga.c == arg0 || ta.f == arg0 || arg0 == eb.d || gb.n == arg0;
    }

    static {
        d = new int[256];
        a = new String[100];
        i = 0;
        g = new String[100];
    }
}

