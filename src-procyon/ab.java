final class ab
{
    static final void a(final int[] arg0, int arg1, int arg2) {
        for (arg2 = arg1 + arg2 - 7; arg1 < arg2; arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0, arg0[arg1++] = 0) {}
        for (arg2 += 7; arg1 < arg2; arg0[arg1++] = 0) {}
    }
    
    static final void a(final byte[] arg0, int arg1, final byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                --arg4;
                for (arg1 += arg4, arg3 += arg4, arg4 = arg1 - arg4, arg4 += 7; arg1 >= arg4; arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--], arg2[arg3--] = arg0[arg1--]) {}
                for (arg4 -= 7; arg1 >= arg4; arg2[arg3--] = arg0[arg1--]) {}
                return;
            }
        }
        for (arg4 += arg1, arg4 -= 7; arg1 < arg4; arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++], arg2[arg3++] = arg0[arg1++]) {}
        for (arg4 += 7; arg1 < arg4; arg2[arg3++] = arg0[arg1++]) {}
    }
}
