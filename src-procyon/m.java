import java.awt.image.*;
import java.net.*;
import java.io.*;

abstract class m
{
    static byte[][] b;
    static int[] g;
    String h;
    static ob e;
    static int[] i;
    int f;
    static ColorModel d;
    static int j;
    
    static final int a(final boolean arg0, final int arg1, final byte[] arg2) {
        if (!arg0) {
            m.b = null;
        }
        return (arg2[arg1 + 3] & 0xFF) + ((arg2[arg1 + 2] << 8 & 0xFF00) + ((0xFF & arg2[arg1]) << 24)) - -((0xFF & arg2[1 + arg1]) << 16);
    }
    
    final Socket a(final boolean arg0) throws IOException {
        if (arg0) {
            m.i = null;
        }
        return new Socket(this.h, this.f);
    }
    
    static final void a(final byte[] arg0, final byte arg1, final boolean arg2) {
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
        for (int n = 0; gb.p > n; ++n) {
            ac.x[n] = o.a((byte)38);
        }
        for (int i = 0; i < gb.p; ++i) {
            ga.b[i] = o.a((byte)38);
        }
        for (int n2 = 0; gb.p > n2; ++n2) {
            lb.ac[n2] = o.a((byte)38);
        }
        for (int n3 = 0; gb.p > n3; ++n3) {
            ua.Bb[n3] = t.a(65525);
            if (mb.l < ua.Bb[n3] + 1) {
                mb.l = ua.Bb[n3] + 1;
            }
        }
        for (int j = 0; j < gb.p; ++j) {
            kb.b[j] = ub.a((byte)(-105));
        }
        for (int n4 = 0; gb.p > n4; ++n4) {
            fa.e[n4] = v.a(-30504);
        }
        for (int n5 = 0; gb.p > n5; ++n5) {
            gb.s[n5] = v.a(-30504);
        }
        for (int n6 = 0; gb.p > n6; ++n6) {
            mb.k[n6] = t.a(65525);
        }
        for (int k = 0; k < gb.p; ++k) {
            h.c[k] = ub.a((byte)(-105));
        }
        for (int n7 = 0; gb.p > n7; ++n7) {
            kb.c[n7] = v.a(-30504);
        }
        for (int n8 = 0; gb.p > n8; ++n8) {
            ka.c[n8] = v.a(-30504);
        }
        for (int l = 0; l < gb.p; ++l) {
            if (!arg2) {
                if (ka.c[l] == 1) {
                    ac.x[l] = "Members object";
                    ga.b[l] = "You need to be a member to use this object";
                    kb.b[l] = 0;
                    lb.ac[l] = "";
                    gb.s[0] = 0;
                    mb.k[l] = 0;
                    kb.c[l] = 1;
                }
            }
        }
        la.d = t.a(65525);
        fb.d = new int[la.d];
        b.h = new int[la.d];
        jb.k = new int[la.d];
        ob.h = new int[la.d];
        la.a = new int[la.d];
        m.g = new int[la.d];
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
        for (int n9 = 0; la.d > n9; ++n9) {
            e.Mb[n9] = o.a((byte)38);
        }
        for (int n10 = 0; n10 < la.d; ++n10) {
            ba.ac[n10] = o.a((byte)38);
        }
        for (int n11 = 0; la.d > n11; ++n11) {
            la.a[n11] = v.a(-30504);
        }
        for (int n12 = 0; la.d > n12; ++n12) {
            eb.b[n12] = v.a(-30504);
        }
        for (int n13 = 0; la.d > n13; ++n13) {
            fb.d[n13] = v.a(-30504);
        }
        for (int n14 = 0; n14 < la.d; ++n14) {
            jb.k[n14] = v.a(-30504);
        }
        for (int n15 = 0; la.d > n15; ++n15) {
            o.a[n15] = v.a(-30504);
        }
        for (int n16 = 0; la.d > n16; ++n16) {
            for (int n17 = 0; n17 < 12; ++n17) {
                qb.d[n16][n17] = v.a(-30504);
                if (qb.d[n16][n17] == 255) {
                    qb.d[n16][n17] = -1;
                }
            }
        }
        for (int n18 = 0; n18 < la.d; ++n18) {
            da.T[n18] = ub.a((byte)(-105));
        }
        for (int n19 = 0; n19 < la.d; ++n19) {
            m.g[n19] = ub.a((byte)(-105));
        }
        for (int n20 = 0; n20 < la.d; ++n20) {
            ua.Ab[n20] = ub.a((byte)(-105));
        }
        if (arg1 < 10) {
            return;
        }
        for (int n21 = 0; la.d > n21; ++n21) {
            v.e[n21] = ub.a((byte)(-105));
        }
        for (int n22 = 0; n22 < la.d; ++n22) {
            fb.c[n22] = t.a(65525);
        }
        for (int n23 = 0; n23 < la.d; ++n23) {
            b.h[n23] = t.a(65525);
        }
        for (int n24 = 0; n24 < la.d; ++n24) {
            ob.h[n24] = v.a(-30504);
        }
        for (int n25 = 0; n25 < la.d; ++n25) {
            na.a[n25] = v.a(-30504);
        }
        for (int n26 = 0; n26 < la.d; ++n26) {
            db.j[n26] = v.a(-30504);
        }
        for (int n27 = 0; n27 < la.d; ++n27) {
            p.e[n27] = o.a((byte)38);
        }
        jb.o = t.a(65525);
        p.c = new String[jb.o];
        mb.g = new String[jb.o];
        for (int n28 = 0; n28 < jb.o; ++n28) {
            mb.g[n28] = o.a((byte)38);
        }
        for (int n29 = 0; jb.o > n29; ++n29) {
            p.c[n29] = o.a((byte)38);
        }
        na.e = t.a(65525);
        aa.c = new int[na.e];
        cb.e = new String[na.e];
        nb.d = new int[na.e];
        n.m = new int[na.e];
        w.g = new int[na.e];
        db.l = new int[na.e];
        for (int n30 = 0; n30 < na.e; ++n30) {
            cb.e[n30] = o.a((byte)38);
        }
        for (int n31 = 0; n31 < na.e; ++n31) {
            db.l[n31] = ub.a((byte)(-105));
        }
        for (int n32 = 0; na.e > n32; ++n32) {
            n.m[n32] = v.a(-30504);
        }
        for (int n33 = 0; n33 < na.e; ++n33) {
            nb.d[n33] = v.a(-30504);
        }
        for (int n34 = 0; n34 < na.e; ++n34) {
            aa.c[n34] = v.a(-30504);
        }
        for (int n35 = 0; na.e > n35; ++n35) {
            w.g[n35] = v.a(-30504);
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
        for (int n36 = 0; ua.Db > n36; ++n36) {
            l.a[n36] = o.a((byte)38);
        }
        for (int n37 = 0; n37 < ua.Db; ++n37) {
            la.f[n37] = o.a((byte)38);
        }
        for (int n38 = 0; n38 < ua.Db; ++n38) {
            s.f[n38] = o.a((byte)38);
        }
        for (int n39 = 0; ua.Db > n39; ++n39) {
            p.a[n39] = o.a((byte)38);
        }
        for (int n40 = 0; n40 < ua.Db; ++n40) {
            fb.f[n40] = ca.a((byte)91, o.a((byte)38));
        }
        for (int n41 = 0; n41 < ua.Db; ++n41) {
            f.f[n41] = v.a(-30504);
        }
        for (int n42 = 0; ua.Db > n42; ++n42) {
            ub.g[n42] = v.a(-30504);
        }
        for (int n43 = 0; ua.Db > n43; ++n43) {
            mb.a[n43] = v.a(-30504);
        }
        for (int n44 = 0; n44 < ua.Db; ++n44) {
            h.b[n44] = v.a(-30504);
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
        for (int n45 = 0; h.a > n45; ++n45) {
            ta.r[n45] = o.a((byte)38);
        }
        for (int n46 = 0; n46 < h.a; ++n46) {
            ub.b[n46] = o.a((byte)38);
        }
        for (int n47 = 0; h.a > n47; ++n47) {
            u.b[n47] = o.a((byte)38);
        }
        for (int n48 = 0; h.a > n48; ++n48) {
            f.e[n48] = o.a((byte)38);
        }
        for (int n49 = 0; n49 < h.a; ++n49) {
            ib.d[n49] = t.a(65525);
        }
        for (int n50 = 0; h.a > n50; ++n50) {
            v.a[n50] = ub.a((byte)(-105));
        }
        for (int n51 = 0; n51 < h.a; ++n51) {
            client.Jk[n51] = ub.a((byte)(-105));
        }
        for (int n52 = 0; h.a > n52; ++n52) {
            u.a[n52] = v.a(-30504);
        }
        for (int n53 = 0; n53 < h.a; ++n53) {
            lb.Tb[n53] = v.a(-30504);
        }
        v.h = t.a(65525);
        d.g = new int[v.h];
        i.g = new int[v.h];
        for (int n54 = 0; n54 < v.h; ++n54) {
            i.g[n54] = v.a(-30504);
        }
        for (int n55 = 0; v.h > n55; ++n55) {
            d.g[n55] = v.a(-30504);
        }
        ia.h = t.a(65525);
        da.N = new int[ia.h];
        ac.l = new int[ia.h];
        qa.K = new int[ia.h];
        for (int n56 = 0; ia.h > n56; ++n56) {
            qa.K[n56] = ub.a((byte)(-105));
        }
        for (int n57 = 0; n57 < ia.h; ++n57) {
            da.N[n57] = v.a(-30504);
        }
        for (int n58 = 0; n58 < ia.h; ++n58) {
            ac.l[n58] = v.a(-30504);
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
        for (int n59 = 0; n59 < fa.b; ++n59) {
            ja.L[n59] = o.a((byte)38);
        }
        for (int n60 = 0; fa.b > n60; ++n60) {
            oa.a[n60] = o.a((byte)38);
        }
        for (int n61 = 0; fa.b > n61; ++n61) {
            pa.f[n61] = v.a(-30504);
        }
        for (int n62 = 0; n62 < fa.b; ++n62) {
            o.p[n62] = v.a(-30504);
        }
        for (int n63 = 0; fa.b > n63; ++n63) {
            qb.e[n63] = v.a(-30504);
        }
        for (int n64 = 0; n64 < fa.b; ++n64) {
            final int a = v.a(-30504);
            oa.d[n64] = new int[a];
            for (int n65 = 0; a > n65; ++n65) {
                oa.d[n64][n65] = t.a(65525);
            }
        }
        for (int n66 = 0; n66 < fa.b; ++n66) {
            final int a2 = v.a(-30504);
            da.J[n66] = new int[a2];
            for (int n67 = 0; n67 < a2; ++n67) {
                da.J[n66][n67] = v.a(-30504);
            }
        }
        t.g = t.a(65525);
        t.h = new String[t.g];
        ca.B = new int[t.g];
        fa.c = new int[t.g];
        h.e = new String[t.g];
        for (int n68 = 0; n68 < t.g; ++n68) {
            t.h[n68] = o.a((byte)38);
        }
        for (int n69 = 0; n69 < t.g; ++n69) {
            h.e[n69] = o.a((byte)38);
        }
        for (int n70 = 0; t.g > n70; ++n70) {
            ca.B[n70] = v.a(-30504);
        }
        for (int n71 = 0; t.g > n71; ++n71) {
            fa.c[n71] = v.a(-30504);
        }
        b.v = null;
        kb.d = null;
    }
    
    m() {
        super();
    }
    
    abstract Socket a(final byte p0) throws IOException;
    
    static {
        m.b = new byte[50][];
        m.i = new int[256];
        m.e = null;
    }
}
