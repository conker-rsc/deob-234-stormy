import com.ms.win32.*;
import java.awt.*;
import com.ms.awt.*;
import com.ms.dll.*;

final class q extends Callback
{
    private volatile int d;
    private volatile int c;
    private int e;
    private boolean a;
    private volatile boolean b;
    
    final void a(final int arg0, final int arg1, final int arg2) {
        if (arg0 != 23529) {
            this.callback(-56, 122, 69, -57);
        }
        User32.SetCursorPos(arg2, arg1);
    }
    
    final void a(final int arg0, final Component arg1, final boolean arg2) {
        final int topHwnd = ((WComponentPeer)arg1.getPeer()).getTopHwnd();
        if (topHwnd == this.d && !this.b != arg2) {
            return;
        }
        if (arg0 != -4) {
            this.d = -1;
        }
        if (!this.a) {
            this.e = User32.LoadCursor(0, 32512);
            Root.alloc((Object)this);
            this.a = true;
        }
        if (topHwnd != this.d) {
            if (this.d != 0) {
                this.b = true;
                User32.SendMessage(topHwnd, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this.d, -4, this.c);
                }
            }
            synchronized (this) {
                this.d = topHwnd;
                this.c = User32.SetWindowLong(this.d, -4, (Object)this);
            }
        }
        this.b = arg2;
        User32.SendMessage(topHwnd, 101024, 0, 0);
    }
    
    q() {
        super();
        this.b = true;
    }
    
    final synchronized int callback(final int arg0, final int arg1, final int arg2, final int arg3) {
        if (this.d != arg0) {
            return User32.CallWindowProc(User32.GetWindowLong(arg0, -4), arg0, arg1, arg2, arg3);
        }
        if (arg1 == 32 && (0xFFFF & arg3) == 0x1) {
            User32.SetCursor(this.b ? this.e : 0);
            return 0;
        }
        if (arg1 != 101024) {
            if (arg1 == 1) {
                this.d = 0;
                this.b = true;
            }
            return User32.CallWindowProc(this.c, arg0, arg1, arg2, arg3);
        }
        User32.SetCursor(this.b ? this.e : 0);
        return 0;
    }
}
