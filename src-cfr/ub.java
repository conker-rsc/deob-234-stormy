/*
 * Decompiled with CFR 0.152.
 */
final class ub {
    static String[] c = new String[5000];
    static String[] b;
    static int e;
    static int[] g;
    static String[] a;

    static final void a(int[] arg0, byte arg1, int arg2, int arg3, Object[] arg4) {
        if (arg1 > -82) {
            return;
        }
        if (arg2 < arg3) {
            int n2 = (arg3 + arg2) / 2;
            int n3 = arg2;
            int n4 = arg0[n2];
            arg0[n2] = arg0[arg3];
            arg0[arg3] = n4;
            Object object = arg4[n2];
            arg4[n2] = arg4[arg3];
            arg4[arg3] = object;
            int n5 = n4 == Integer.MAX_VALUE ? 0 : 1;
            for (int i2 = arg2; i2 < arg3; ++i2) {
                if ((i2 & n5) + n4 <= arg0[i2]) continue;
                int n6 = arg0[i2];
                arg0[i2] = arg0[n3];
                arg0[n3] = n6;
                Object object2 = arg4[i2];
                arg4[i2] = arg4[n3];
                arg4[n3++] = object2;
            }
            arg0[arg3] = arg0[n3];
            arg0[n3] = n4;
            arg4[arg3] = arg4[n3];
            arg4[n3] = object;
            ub.a(arg0, (byte)-124, arg2, n3 - 1, arg4);
            ub.a(arg0, (byte)-123, 1 + n3, arg3, arg4);
        }
        ++e;
    }

    static final v a(int arg0, byte arg1) {
        if (arg1 != 24) {
            c = null;
        }
        v[] vArray = i.a(arg1 - 735);
        for (int i2 = 0; vArray.length > i2; ++i2) {
            v v2 = vArray[i2];
            if (arg0 != v2.i) continue;
            return v2;
        }
        return null;
    }

    static final int a(byte arg0) {
        int n2 = m.a(true, ka.b, b.v);
        if (n2 > 99999999) {
            n2 = -n2 + 99999999;
        }
        if (arg0 != -105) {
            g = null;
        }
        ka.b += 4;
        return n2;
    }

    static {
        a = new String[100];
    }
}

