import java.nio.charset.*;
import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.reflect.*;

final class gb extends m
{
    static v n;
    private ProxySelector q;
    static int p;
    static int[] s;
    
    gb() {
        super();
        this.q = ProxySelector.getDefault();
    }
    
    private final Socket a(final int arg0, final int arg1, final String arg2, final String arg3) throws IOException {
        final Socket socket = new Socket(arg3, arg0);
        socket.setSoTimeout(10000);
        final OutputStream outputStream = socket.getOutputStream();
        if (arg2 != null) {
            outputStream.write(("CONNECT " + this.h + ":" + this.f + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        else {
            outputStream.write(("CONNECT " + this.h + ":" + this.f + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        outputStream.flush();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        final String line = bufferedReader.readLine();
        if (arg1 != 1514) {
            return null;
        }
        if (line != null) {
            if (line.startsWith("HTTP/1.0 200") || line.startsWith("HTTP/1.1 200")) {
                return socket;
            }
            if (line.startsWith("HTTP/1.0 407") || line.startsWith("HTTP/1.1 407")) {
                int n = 0;
                final String s = "proxy-authenticate: ";
                for (String s2 = bufferedReader.readLine(); s2 != null && n < 50; ++n, s2 = bufferedReader.readLine()) {
                    if (s2.toLowerCase().startsWith(s)) {
                        String arg4 = s2.substring(s.length()).trim();
                        final int index = arg4.indexOf(32);
                        if (index != -1) {
                            arg4 = arg4.substring(0, index);
                        }
                        throw new fa(arg4);
                    }
                }
                throw new fa("");
            }
        }
        outputStream.close();
        bufferedReader.close();
        socket.close();
        return null;
    }
    
    static final void a(int arg0, final int arg1, final byte arg2, int arg3, int arg4, final int arg5, final int[] arg6, int arg7, int arg8, final int arg9, int arg10, int arg11, final int[] arg12, final int arg13, final int arg14) {
        if (arg14 <= 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        if (arg3 != 0) {
            arg11 = arg8 / arg3 << 7;
            arg10 = arg0 / arg3 << 7;
        }
        int n3 = 0;
        if (arg11 < 0) {
            arg11 = 0;
        }
        else if (arg11 > 16256) {
            arg11 = 16256;
        }
        if (arg2 != 50) {
            return;
        }
        arg3 += arg9;
        arg0 += arg13;
        arg8 += arg1;
        if (arg3 != 0) {
            n2 = arg0 / arg3 << 7;
            n = arg8 / arg3 << 7;
        }
        if (n >= 0) {
            if (n > 16256) {
                n = 16256;
            }
        }
        else {
            n = 0;
        }
        int n4 = n + -arg11 >> 4;
        int n5 = n2 - arg10 >> 4;
        for (int i = arg14 >> 4; i > 0; --i) {
            arg11 += (arg4 & 0x600000);
            final int n6 = arg4 >> 23;
            arg12[arg7++] = arg6[ib.a(16256, arg10) + (arg11 >> 7)] >>> n6;
            arg4 += arg5;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n6;
            arg10 += n5;
            arg11 += n4;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n6;
            arg10 += n5;
            arg11 += n4;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n6;
            arg10 += n5;
            arg11 += n4;
            arg11 = (0x600000 & arg4) + (0x3FFF & arg11);
            final int n7 = arg4 >> 23;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10, 16256)] >>> n7;
            arg4 += arg5;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[ib.a(16256, arg10) + (arg11 >> 7)] >>> n7;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n7;
            arg10 += n5;
            arg11 += n4;
            arg12[arg7++] = arg6[ib.a(16256, arg10) - -(arg11 >> 7)] >>> n7;
            arg10 += n5;
            arg11 += n4;
            arg11 = (arg4 & 0x600000) + (0x3FFF & arg11);
            final int n8 = arg4 >> 23;
            arg4 += arg5;
            arg12[arg7++] = arg6[ib.a(arg10, 16256) - -(arg11 >> 7)] >>> n8;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[ib.a(16256, arg10) - -(arg11 >> 7)] >>> n8;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n8;
            arg10 += n5;
            arg11 += n4;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10, 16256)] >>> n8;
            arg11 += n4;
            arg10 += n5;
            arg11 = (0x3FFF & arg11) + (0x600000 & arg4);
            n3 = arg4 >> 23;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n3;
            arg4 += arg5;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10, 16256)] >>> n3;
            arg11 += n4;
            arg10 += n5;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n3;
            arg10 += n5;
            arg11 += n4;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10)] >>> n3;
            arg11 = n;
            arg10 = n2;
            arg0 += arg13;
            arg3 += arg9;
            arg8 += arg1;
            if (arg3 != 0) {
                n2 = arg0 / arg3 << 7;
                n = arg8 / arg3 << 7;
            }
            if (n >= 0) {
                if (n > 16256) {
                    n = 16256;
                }
            }
            else {
                n = 0;
            }
            n5 = -arg10 + n2 >> 4;
            n4 = -arg11 + n >> 4;
        }
        for (int j = 0; j < (0xF & arg14); ++j) {
            if ((j & 0x3) == 0x0) {
                n3 = arg4 >> 23;
                arg11 = (arg4 & 0x600000) + (0x3FFF & arg11);
                arg4 += arg5;
            }
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10, 16256)] >>> n3;
            arg10 += n5;
            arg11 += n4;
        }
    }
    
    static final i[] a(final int arg0) {
        if (arg0 <= 37) {
            gb.n = null;
        }
        return new i[] { eb.e, fb.h, f.b };
    }
    
    @Override
    final Socket a(final byte arg0) throws IOException {
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        final boolean b = this.f == 443;
        List<Proxy> select;
        List<Proxy> select2;
        try {
            select = this.q.select(new URI((b ? "https" : "http") + "://" + this.h));
            select2 = this.q.select(new URI((b ? "http" : "https") + "://" + this.h));
        }
        catch (final URISyntaxException ex) {
            return this.a(false);
        }
        select.addAll(select2);
        final Object[] array = select.toArray();
        fa fa = null;
        final Object[] array2 = array;
        if (arg0 != 50) {
            return null;
        }
        for (int n = 0; array2.length > n; ++n) {
            final Proxy arg = (Proxy)array2[n];
            try {
                final Socket a = this.a(arg, 16256);
                if (a != null) {
                    return a;
                }
            }
            catch (final fa fa2) {
                fa = fa2;
            }
            catch (final IOException ex2) {}
        }
        if (fa == null) {
            return this.a(false);
        }
        throw fa;
    }
    
    static final String a(final boolean arg0, Throwable arg1) throws IOException {
        String s;
        if (arg1 instanceof la) {
            final la la = (la)arg1;
            arg1 = la.e;
            s = la.h + " | ";
        }
        else {
            s = "";
        }
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        arg1.printStackTrace(printWriter);
        printWriter.close();
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        if (arg0) {
            gb.s = null;
        }
        final String line = bufferedReader.readLine();
        while (true) {
            final String line2 = bufferedReader.readLine();
            if (line2 == null) {
                break;
            }
            final int index = line2.indexOf(40);
            final int index2 = line2.indexOf(41, index + 1);
            String substring;
            if (index != -1) {
                substring = line2.substring(0, index);
            }
            else {
                substring = line2;
            }
            final String trim = substring.trim();
            final String substring2 = trim.substring(1 + trim.lastIndexOf(32));
            String s2 = s + substring2.substring(substring2.lastIndexOf(9) + 1);
            if (index != -1) {
                if (index2 != -1) {
                    final int index3 = line2.indexOf(".java:", index);
                    if (index3 >= 0) {
                        s2 += line2.substring(5 + index3, index2);
                    }
                }
            }
            s = s2 + ' ';
        }
        return s + "| " + line;
    }
    
    private final Socket a(final Proxy arg0, final int arg1) throws IOException {
        if (arg0.type() == Proxy.Type.DIRECT) {
            return this.a(false);
        }
        final SocketAddress address = arg0.address();
        if (!(address instanceof InetSocketAddress)) {
            return null;
        }
        if (arg1 != 16256) {
            gb.p = 123;
        }
        final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
        if (arg0.type() == Proxy.Type.HTTP) {
            String string = null;
            try {
                final Class<?> forName = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                final Method declaredMethod = forName.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                declaredMethod.setAccessible(true);
                final Object invoke = declaredMethod.invoke(null, inetSocketAddress.getHostName(), new Integer(inetSocketAddress.getPort()));
                if (invoke != null) {
                    final Method declaredMethod2 = forName.getDeclaredMethod("supportsPreemptiveAuthorization", (Class[])new Class[0]);
                    declaredMethod2.setAccessible(true);
                    if (declaredMethod2.invoke(invoke, new Object[0])) {
                        final Method declaredMethod3 = forName.getDeclaredMethod("getHeaderName", (Class[])new Class[0]);
                        declaredMethod3.setAccessible(true);
                        final Method declaredMethod4 = forName.getDeclaredMethod("getHeaderValue", URL.class, String.class);
                        declaredMethod4.setAccessible(true);
                        string = (String)declaredMethod3.invoke(invoke, new Object[0]) + ": " + (String)declaredMethod4.invoke(invoke, new URL("https://" + this.h + "/"), "https");
                    }
                }
            }
            catch (final Exception ex) {}
            return this.a(inetSocketAddress.getPort(), 1514, string, inetSocketAddress.getHostName());
        }
        if (arg0.type() != Proxy.Type.SOCKS) {
            return null;
        }
        final Socket socket = new Socket(arg0);
        socket.connect(new InetSocketAddress(this.h, this.f));
        return socket;
    }
    
    static {
        gb.n = new v("INTBETA", "office", "_intbeta", 6);
    }
}
