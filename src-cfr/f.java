/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class f {
    static int[] f;
    static String[] e;
    static String[] c;
    static i b;

    static final boolean a(char arg0, int arg1) {
        char c2;
        int n2;
        if (Character.isISOControl(arg0)) {
            return false;
        }
        if (v.a(arg0, 115)) {
            return true;
        }
        char[] cArray = ga.a;
        for (n2 = arg1; n2 < cArray.length; ++n2) {
            c2 = cArray[n2];
            if (arg0 != c2) continue;
            return true;
        }
        cArray = ac.I;
        for (n2 = 0; cArray.length > n2; ++n2) {
            c2 = cArray[n2];
            if (c2 != arg0) continue;
            return true;
        }
        return false;
    }

    static final void a(int arg0, tb arg1) {
        byte[] byArray = new byte[24];
        if (b.q != null) {
            try {
                int n2;
                b.q.a(0L, arg0 - 22592);
                b.q.a((byte)-123, byArray);
                for (n2 = 0; n2 < 24 && byArray[n2] == 0; ++n2) {
                }
                if (n2 >= 24) {
                    throw new IOException();
                }
            }
            catch (Exception exception) {
                for (int i2 = 0; i2 < 24; ++i2) {
                    byArray[i2] = -1;
                }
            }
        }
        if (arg0 != 22607) {
            return;
        }
        arg1.a(0, -126, 24, byArray);
    }

    static {
        c = new String[]{"Please enter the number of items to deposit", "and press enter"};
        b = new i("WIP", 2);
    }
}

