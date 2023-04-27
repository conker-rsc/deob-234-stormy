/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.event.ActionEvent;

final class ba
extends ua {
    client dc;
    static int[] cc = new int[2048];
    static String[] Yb = new String[100];
    static String[] ac;

    static final String e(int arg0, int arg1) {
        return (arg1 >> 24 & 0xFF) + "." + (0xFF & arg1 >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    ba(int arg0, int arg1, int arg2, Component arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    @Override
    final void a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        block8: {
            if (arg1 < 50000) {
                if (arg1 < 40000) {
                    if (arg1 >= 20000) {
                        this.dc.a(arg4, arg7, 105, arg2, arg0, arg1 - 20000, arg5, arg3);
                    } else if (arg1 < 5000) {
                        super.f(arg3, arg4, arg2, arg5, 5924, arg1);
                    } else {
                        this.dc.b(arg7, arg5, arg6 ^ 9, arg0, arg3, arg4, arg2, arg1 - 5000);
                    }
                } else {
                    this.dc.b(arg2, arg7, arg3, arg1 - 40000, arg5, -122, arg4);
                }
            } else {
                this.dc.a(arg7, arg3, arg4, arg2, arg1 - 50000, arg5, 2);
            }
            if (arg6 == 29) break block8;
            ac = null;
        }
    }

    static final void a(Object arg0, int arg1, c arg2) {
        if (arg2.n == null) {
            return;
        }
        for (int i2 = 0; i2 < 50 && arg2.n.peekEvent() != null; ++i2) {
            mb.a(11200, 1L);
        }
        if (arg1 != 1) {
            return;
        }
        try {
            if (arg0 != null) {
                arg2.n.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
        catch (Exception exception) {}
    }
}

