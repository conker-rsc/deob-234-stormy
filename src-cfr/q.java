/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ms.awt.WComponentPeer
 *  com.ms.dll.Callback
 *  com.ms.dll.Root
 *  com.ms.win32.User32
 */
import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;

final class q
extends Callback {
    private volatile int d;
    private volatile int c;
    private int e;
    private boolean a;
    private volatile boolean b = true;

    final void a(int arg0, int arg1, int arg2) {
        if (arg0 != 23529) {
            this.callback(-56, 122, 69, -57);
        }
        User32.SetCursorPos((int)arg2, (int)arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final void a(int arg0, Component arg1, boolean arg2) {
        WComponentPeer wComponentPeer = (WComponentPeer)arg1.getPeer();
        int n2 = wComponentPeer.getTopHwnd();
        if (n2 == this.d && !this.b != arg2) {
            return;
        }
        if (arg0 != -4) {
            this.d = -1;
        }
        if (!this.a) {
            this.e = User32.LoadCursor((int)0, (int)32512);
            Root.alloc((Object)((Object)this));
            this.a = true;
        }
        if (n2 != this.d) {
            q q2;
            if (this.d != 0) {
                this.b = true;
                User32.SendMessage((int)n2, (int)101024, (int)0, (int)0);
                q2 = this;
                synchronized (q2) {
                    User32.SetWindowLong((int)this.d, (int)-4, (int)this.c);
                }
            }
            q2 = this;
            synchronized (q2) {
                this.d = n2;
                this.c = User32.SetWindowLong((int)this.d, (int)-4, (Object)((Object)this));
            }
        }
        this.b = arg2;
        User32.SendMessage((int)n2, (int)101024, (int)0, (int)0);
    }

    q() {
    }

    final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
        int n2;
        if (this.d != arg0) {
            int n3 = User32.GetWindowLong((int)arg0, (int)-4);
            return User32.CallWindowProc((int)n3, (int)arg0, (int)arg1, (int)arg2, (int)arg3);
        }
        if (arg1 == 32 && (n2 = 0xFFFF & arg3) == 1) {
            User32.SetCursor((int)(this.b ? this.e : 0));
            return 0;
        }
        if (arg1 == 101024) {
            User32.SetCursor((int)(this.b ? this.e : 0));
            return 0;
        }
        if (arg1 == 1) {
            this.d = 0;
            this.b = true;
        }
        return User32.CallWindowProc((int)this.c, (int)arg0, (int)arg1, (int)arg2, (int)arg3);
    }
}

