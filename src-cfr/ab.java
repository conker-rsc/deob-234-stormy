/*
 * Decompiled with CFR 0.152.
 */
final class ab {
    static final void a(int[] arg0, int arg1, int arg2) {
        arg2 = arg1 + arg2 - 7;
        while (arg1 < arg2) {
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
        }
        arg2 += 7;
        while (arg1 < arg2) {
            arg0[arg1++] = 0;
        }
    }

    static final void a(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                arg1 += --arg4;
                arg3 += arg4;
                arg4 = arg1 - arg4;
                arg4 += 7;
                while (arg1 >= arg4) {
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                    arg2[arg3--] = arg0[arg1--];
                }
                arg4 -= 7;
                while (arg1 >= arg4) {
                    arg2[arg3--] = arg0[arg1--];
                }
                return;
            }
        }
        arg4 += arg1;
        arg4 -= 7;
        while (arg1 < arg4) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        arg4 += 7;
        while (arg1 < arg4) {
            arg2[arg3++] = arg0[arg1++];
        }
    }
}

