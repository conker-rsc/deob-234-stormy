/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.ColorModel;
import java.io.IOException;
import java.net.Socket;

abstract class m {
    static byte[][] b = new byte[50][];
    static int[] g;
    String h;
    static ob e;
    static int[] i;
    int f;
    static ColorModel d;
    static int j;

    static final int a(boolean arg0, int arg1, byte[] arg2) {
        if (!arg0) {
            b = null;
        }
        return (arg2[arg1 + 3] & 0xFF) + ((arg2[arg1 + 2] << 8 & 0xFF00) + ((0xFF & arg2[arg1]) << 24)) - -((0xFF & arg2[1 + arg1]) << 16);
    }

    final Socket a(boolean arg0) throws IOException {
        if (arg0) {
            i = null;
        }
        return new Socket(this.h, this.f);
    }

    static final void a(byte[] arg0, byte arg1, boolean arg2) {
        int n2;
        int n3;
        int n4;
        kb.d = na.a("string.dat", 0, arg0, -124);
        jb.p = 0;
        b.v = na.a("integer.dat", 0, arg0, -125);
        ka.b = 0;
        gb.p = t.a(65525);
        fa.e = new int[gb.p];
        ac.x = new String[gb.p];
        ka.c = new int[gb.p];
        h.c = new int[gb.p];
        lb.ac = new String[gb.p];
        ua.Bb = new int[gb.p];
        kb.b = new int[gb.p];
        mb.k = new int[gb.p];
        kb.c = new int[gb.p];
        ga.b = new String[gb.p];
        gb.s = new int[gb.p];
        for (n4 = 0; gb.p > n4; ++n4) {
            ac.x[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < gb.p; ++n4) {
            ga.b[n4] = o.a((byte)38);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            lb.ac[n4] = o.a((byte)38);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            ua.Bb[n4] = t.a(65525);
            if (mb.l >= ua.Bb[n4] + 1) continue;
            mb.l = ua.Bb[n4] + 1;
        }
        for (n4 = 0; n4 < gb.p; ++n4) {
            kb.b[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            fa.e[n4] = v.a(-30504);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            gb.s[n4] = v.a(-30504);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            mb.k[n4] = t.a(65525);
        }
        for (n4 = 0; n4 < gb.p; ++n4) {
            h.c[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            kb.c[n4] = v.a(-30504);
        }
        for (n4 = 0; gb.p > n4; ++n4) {
            ka.c[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < gb.p; ++n4) {
            if (arg2 || ka.c[n4] != 1) continue;
            ac.x[n4] = "Members object";
            ga.b[n4] = "You need to be a member to use this object";
            kb.b[n4] = 0;
            lb.ac[n4] = "";
            gb.s[0] = 0;
            mb.k[n4] = 0;
            kb.c[n4] = 1;
        }
        la.d = t.a(65525);
        fb.d = new int[la.d];
        b.h = new int[la.d];
        jb.k = new int[la.d];
        ob.h = new int[la.d];
        la.a = new int[la.d];
        g = new int[la.d];
        v.e = new int[la.d];
        o.a = new int[la.d];
        ba.ac = new String[la.d];
        fb.c = new int[la.d];
        p.e = new String[la.d];
        da.T = new int[la.d];
        e.Mb = new String[la.d];
        na.a = new int[la.d];
        db.j = new int[la.d];
        qb.d = new int[la.d][12];
        eb.b = new int[la.d];
        ua.Ab = new int[la.d];
        for (n4 = 0; la.d > n4; ++n4) {
            e.Mb[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            ba.ac[n4] = o.a((byte)38);
        }
        for (n4 = 0; la.d > n4; ++n4) {
            la.a[n4] = v.a(-30504);
        }
        for (n4 = 0; la.d > n4; ++n4) {
            eb.b[n4] = v.a(-30504);
        }
        for (n4 = 0; la.d > n4; ++n4) {
            fb.d[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            jb.k[n4] = v.a(-30504);
        }
        for (n4 = 0; la.d > n4; ++n4) {
            o.a[n4] = v.a(-30504);
        }
        for (n4 = 0; la.d > n4; ++n4) {
            for (n3 = 0; n3 < 12; ++n3) {
                qb.d[n4][n3] = v.a(-30504);
                if (qb.d[n4][n3] != 255) continue;
                qb.d[n4][n3] = -1;
            }
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            da.T[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            m.g[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            ua.Ab[n4] = ub.a((byte)-105);
        }
        if (arg1 < 10) {
            return;
        }
        for (n4 = 0; la.d > n4; ++n4) {
            v.e[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            fb.c[n4] = t.a(65525);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            b.h[n4] = t.a(65525);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            ob.h[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            na.a[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            db.j[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < la.d; ++n4) {
            p.e[n4] = o.a((byte)38);
        }
        jb.o = t.a(65525);
        p.c = new String[jb.o];
        mb.g = new String[jb.o];
        for (n4 = 0; n4 < jb.o; ++n4) {
            mb.g[n4] = o.a((byte)38);
        }
        for (n4 = 0; jb.o > n4; ++n4) {
            p.c[n4] = o.a((byte)38);
        }
        na.e = t.a(65525);
        aa.c = new int[na.e];
        cb.e = new String[na.e];
        nb.d = new int[na.e];
        n.m = new int[na.e];
        w.g = new int[na.e];
        db.l = new int[na.e];
        for (n4 = 0; n4 < na.e; ++n4) {
            cb.e[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < na.e; ++n4) {
            db.l[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; na.e > n4; ++n4) {
            n.m[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < na.e; ++n4) {
            nb.d[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < na.e; ++n4) {
            aa.c[n4] = v.a(-30504);
        }
        for (n4 = 0; na.e > n4; ++n4) {
            w.g[n4] = v.a(-30504);
        }
        ua.Db = t.a(65525);
        mb.a = new int[ua.Db];
        ub.g = new int[ua.Db];
        la.f = new String[ua.Db];
        l.a = new String[ua.Db];
        f.f = new int[ua.Db];
        p.a = new String[ua.Db];
        s.f = new String[ua.Db];
        fb.f = new int[ua.Db];
        h.b = new int[ua.Db];
        for (n4 = 0; ua.Db > n4; ++n4) {
            l.a[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < ua.Db; ++n4) {
            la.f[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < ua.Db; ++n4) {
            s.f[n4] = o.a((byte)38);
        }
        for (n4 = 0; ua.Db > n4; ++n4) {
            p.a[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < ua.Db; ++n4) {
            fb.f[n4] = ca.a((byte)91, o.a((byte)38));
        }
        for (n4 = 0; n4 < ua.Db; ++n4) {
            f.f[n4] = v.a(-30504);
        }
        for (n4 = 0; ua.Db > n4; ++n4) {
            ub.g[n4] = v.a(-30504);
        }
        for (n4 = 0; ua.Db > n4; ++n4) {
            mb.a[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < ua.Db; ++n4) {
            h.b[n4] = v.a(-30504);
        }
        h.a = t.a(65525);
        u.b = new String[h.a];
        u.a = new int[h.a];
        v.a = new int[h.a];
        f.e = new String[h.a];
        client.Jk = new int[h.a];
        lb.Tb = new int[h.a];
        ub.b = new String[h.a];
        ta.r = new String[h.a];
        ib.d = new int[h.a];
        for (n4 = 0; h.a > n4; ++n4) {
            ta.r[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < h.a; ++n4) {
            ub.b[n4] = o.a((byte)38);
        }
        for (n4 = 0; h.a > n4; ++n4) {
            u.b[n4] = o.a((byte)38);
        }
        for (n4 = 0; h.a > n4; ++n4) {
            f.e[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < h.a; ++n4) {
            ib.d[n4] = t.a(65525);
        }
        for (n4 = 0; h.a > n4; ++n4) {
            v.a[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; n4 < h.a; ++n4) {
            client.Jk[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; h.a > n4; ++n4) {
            u.a[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < h.a; ++n4) {
            lb.Tb[n4] = v.a(-30504);
        }
        v.h = t.a(65525);
        d.g = new int[v.h];
        i.g = new int[v.h];
        for (n4 = 0; n4 < v.h; ++n4) {
            i.g[n4] = v.a(-30504);
        }
        for (n4 = 0; v.h > n4; ++n4) {
            d.g[n4] = v.a(-30504);
        }
        ia.h = t.a(65525);
        da.N = new int[ia.h];
        ac.l = new int[ia.h];
        qa.K = new int[ia.h];
        for (n4 = 0; ia.h > n4; ++n4) {
            qa.K[n4] = ub.a((byte)-105);
        }
        for (n4 = 0; n4 < ia.h; ++n4) {
            da.N[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < ia.h; ++n4) {
            ac.l[n4] = v.a(-30504);
        }
        n.c = t.a(65525);
        fa.b = t.a(65525);
        oa.d = new int[fa.b][];
        qb.e = new int[fa.b];
        da.J = new int[fa.b][];
        ja.L = new String[fa.b];
        oa.a = new String[fa.b];
        pa.f = new int[fa.b];
        o.p = new int[fa.b];
        for (n4 = 0; n4 < fa.b; ++n4) {
            ja.L[n4] = o.a((byte)38);
        }
        for (n4 = 0; fa.b > n4; ++n4) {
            oa.a[n4] = o.a((byte)38);
        }
        for (n4 = 0; fa.b > n4; ++n4) {
            pa.f[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < fa.b; ++n4) {
            o.p[n4] = v.a(-30504);
        }
        for (n4 = 0; fa.b > n4; ++n4) {
            qb.e[n4] = v.a(-30504);
        }
        for (n4 = 0; n4 < fa.b; ++n4) {
            n3 = v.a(-30504);
            oa.d[n4] = new int[n3];
            for (n2 = 0; n3 > n2; ++n2) {
                oa.d[n4][n2] = t.a(65525);
            }
        }
        for (n4 = 0; n4 < fa.b; ++n4) {
            n3 = v.a(-30504);
            da.J[n4] = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                da.J[n4][n2] = v.a(-30504);
            }
        }
        t.g = t.a(65525);
        t.h = new String[t.g];
        ca.B = new int[t.g];
        fa.c = new int[t.g];
        h.e = new String[t.g];
        for (n4 = 0; n4 < t.g; ++n4) {
            t.h[n4] = o.a((byte)38);
        }
        for (n4 = 0; n4 < t.g; ++n4) {
            h.e[n4] = o.a((byte)38);
        }
        for (n4 = 0; t.g > n4; ++n4) {
            ca.B[n4] = v.a(-30504);
        }
        for (n4 = 0; t.g > n4; ++n4) {
            fa.c[n4] = v.a(-30504);
        }
        b.v = null;
        kb.d = null;
    }

    m() {
    }

    abstract Socket a(byte var1) throws IOException;

    static {
        i = new int[256];
        e = null;
    }
}

