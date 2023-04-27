/*
 * Decompiled with CFR 0.152.
 */
final class ac {
    byte[] j;
    int L;
    int E;
    int G;
    byte[] q;
    boolean[] n;
    static String[] z = new String[200];
    int[][] J = new int[6][258];
    static String[] x;
    int[] r;
    int h;
    int F;
    byte[] i;
    byte[] d;
    byte[] s;
    int f;
    byte[] A;
    int c;
    int[] D;
    static int[] l;
    int o = 0;
    int y;
    int p;
    int[][] t;
    int[] w;
    int a = 0;
    static char[] I;
    int b;
    int[] m;
    int e;
    int H;
    boolean[] v;
    int K;
    int[][] u;
    byte g;
    byte[][] B;

    static final void a(ib arg0, byte arg1, ib arg2) {
        if (arg0.e != null) {
            arg0.a(-27331);
        }
        if (arg1 != 34) {
            x = null;
        }
        arg0.a = arg2;
        arg0.e = arg2.e;
        arg0.e.a = arg0;
        arg0.a.e = arg0;
    }

    static final char a(char arg0, int arg1) {
        block12: {
            block11: {
                block10: {
                    block9: {
                        block8: {
                            block7: {
                                block6: {
                                    block5: {
                                        block4: {
                                            block3: {
                                                block2: {
                                                    block1: {
                                                        char c2;
                                                        if (arg1 != -194) {
                                                            ac.a('\uff86', 87);
                                                        }
                                                        if ((c2 = arg0) == ' ' || c2 == '\u00a0' || c2 == '_' || c2 == '-') break block1;
                                                        if (c2 == '[' || c2 == ']' || c2 == '#') break block2;
                                                        if (c2 == '\u00e0' || c2 == '\u00e1' || c2 == '\u00e2' || c2 == '\u00e4' || c2 == '\u00e3' || c2 == '\u00c0' || c2 == '\u00c1' || c2 == '\u00c2' || c2 == '\u00c4' || c2 == '\u00c3') break block3;
                                                        if (c2 == '\u00e8' || c2 == '\u00e9' || c2 == '\u00ea' || c2 == '\u00eb' || c2 == '\u00c8' || c2 == '\u00c9' || c2 == '\u00ca' || c2 == '\u00cb') break block4;
                                                        if (c2 == '\u00ed' || c2 == '\u00ee' || c2 == '\u00ef' || c2 == '\u00cd' || c2 == '\u00ce' || c2 == '\u00cf') break block5;
                                                        if (c2 == '\u00f2' || c2 == '\u00f3' || c2 == '\u00f4' || c2 == '\u00f6' || c2 == '\u00f5' || c2 == '\u00d2' || c2 == '\u00d3' || c2 == '\u00d4' || c2 == '\u00d6' || c2 == '\u00d5') break block6;
                                                        if (c2 == '\u00f9' || c2 == '\u00fa' || c2 == '\u00fb' || c2 == '\u00fc' || c2 == '\u00d9' || c2 == '\u00da' || c2 == '\u00db' || c2 == '\u00dc') break block7;
                                                        if (c2 == '\u00e7' || c2 == '\u00c7') break block8;
                                                        if (c2 == '\u00ff' || c2 == '\u0178') break block9;
                                                        if (c2 == '\u00f1' || c2 == '\u00d1') break block10;
                                                        if (c2 == '\u00df') break block11;
                                                        break block12;
                                                    }
                                                    return '_';
                                                }
                                                return arg0;
                                            }
                                            return 'a';
                                        }
                                        return 'e';
                                    }
                                    return 'i';
                                }
                                return 'o';
                            }
                            return 'u';
                        }
                        return 'c';
                    }
                    return 'y';
                }
                return 'n';
            }
            return 'b';
        }
        return Character.toLowerCase(arg0);
    }

    ac() {
        this.j = new byte[18002];
        this.n = new boolean[256];
        this.m = new int[256];
        this.r = new int[16];
        this.s = new byte[18002];
        this.A = new byte[4096];
        this.w = new int[257];
        this.u = new int[6][258];
        this.D = new int[6];
        this.d = new byte[256];
        this.v = new boolean[16];
        this.B = new byte[6][258];
        this.t = new int[6][258];
    }

    static {
        I = new char[]{'[', ']', '#'};
    }
}

