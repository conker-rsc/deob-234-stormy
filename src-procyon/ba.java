import java.awt.event.*;
import java.awt.*;

final class ba extends ua
{
    client dc;
    static int[] cc;
    static String[] Yb;
    static String[] ac;
    
    static final String e(final int arg0, final int arg1) {
        return (arg1 >> 24 & 0xFF) + "." + (0xFF & arg1 >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }
    
    ba(final int arg0, final int arg1, final int arg2, final Component arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
    @Override
    final void a(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final byte arg6, final int arg7) {
        if (arg1 < 50000) {
            if (arg1 < 40000) {
                if (arg1 >= 20000) {
                    this.dc.a(arg4, arg7, 105, arg2, arg0, arg1 - 20000, arg5, arg3);
                }
                else if (arg1 < 5000) {
                    super.f(arg3, arg4, arg2, arg5, 5924, arg1);
                }
                else {
                    this.dc.b(arg7, arg5, arg6 ^ 0x9, arg0, arg3, arg4, arg2, arg1 - 5000);
                }
            }
            else {
                this.dc.b(arg2, arg7, arg3, arg1 - 40000, arg5, -122, arg4);
            }
        }
        else {
            this.dc.a(arg7, arg3, arg4, arg2, arg1 - 50000, arg5, 2);
        }
        if (arg6 != 29) {
            ba.ac = null;
        }
    }
    
    static final void a(final Object arg0, final int arg1, final c arg2) {
        if (arg2.n == null) {
            return;
        }
        for (int n = 0; n < 50 && arg2.n.peekEvent() != null; ++n) {
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
        catch (final Exception ex) {}
    }
    
    static {
        ba.cc = new int[2048];
        ba.Yb = new String[100];
    }
}
