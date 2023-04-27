/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

final class gb
extends m {
    static v n = new v("INTBETA", "office", "_intbeta", 6);
    private ProxySelector q = ProxySelector.getDefault();
    static int p;
    static int[] s;

    gb() {
    }

    private final Socket a(int arg0, int arg1, String arg2, String arg3) throws IOException {
        Socket socket = new Socket(arg3, arg0);
        socket.setSoTimeout(10000);
        OutputStream outputStream = socket.getOutputStream();
        if (arg2 != null) {
            outputStream.write(("CONNECT " + this.h + ":" + this.f + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            outputStream.write(("CONNECT " + this.h + ":" + this.f + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        outputStream.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string = bufferedReader.readLine();
        if (arg1 != 1514) {
            return null;
        }
        if (string != null) {
            if (string.startsWith("HTTP/1.0 200") || string.startsWith("HTTP/1.1 200")) {
                return socket;
            }
            if (string.startsWith("HTTP/1.0 407") || string.startsWith("HTTP/1.1 407")) {
                String string2 = "proxy-authenticate: ";
                string = bufferedReader.readLine();
                for (int i2 = 0; string != null && i2 < 50; ++i2) {
                    if (string.toLowerCase().startsWith(string2)) {
                        int n2 = (string = string.substring(string2.length()).trim()).indexOf(32);
                        if (n2 != -1) {
                            string = string.substring(0, n2);
                        }
                        throw new fa(string);
                    }
                    string = bufferedReader.readLine();
                }
                throw new fa("");
            }
        }
        outputStream.close();
        bufferedReader.close();
        socket.close();
        return null;
    }

    static final void a(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        int n2;
        if (arg14 <= 0) {
            return;
        }
        int n3 = 0;
        int n4 = 0;
        if (arg3 != 0) {
            arg11 = arg8 / arg3 << 7;
            arg10 = arg0 / arg3 << 7;
        }
        int n5 = 0;
        if (arg11 < 0) {
            arg11 = 0;
        } else if (arg11 > 16256) {
            arg11 = 16256;
        }
        if (arg2 != 50) {
            return;
        }
        arg0 += arg13;
        arg8 += arg1;
        if ((arg3 += arg9) != 0) {
            n4 = arg0 / arg3 << 7;
            n3 = arg8 / arg3 << 7;
        }
        if (n3 >= 0) {
            if (n3 > 16256) {
                n3 = 16256;
            }
        } else {
            n3 = 0;
        }
        int n6 = n3 + -arg11 >> 4;
        int n7 = n4 - arg10 >> 4;
        for (n2 = arg14 >> 4; n2 > 0; --n2) {
            n5 = arg4 >> 23;
            arg12[arg7++] = arg6[ib.a(16256, arg10) + ((arg11 += arg4 & 0x600000) >> 7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg11 += n6;
            arg11 = (0x600000 & (arg4 += arg5)) + (0x3FFF & arg11);
            n5 = arg4 >> 23;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10 += n7, 16256)] >>> n5;
            arg4 += arg5;
            arg12[arg7++] = arg6[ib.a(16256, arg10 += n7) + ((arg11 += n6) >> 7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg12[arg7++] = arg6[ib.a(16256, arg10 += n7) - -((arg11 += n6) >> 7)] >>> n5;
            arg11 += n6;
            arg11 = (arg4 & 0x600000) + (0x3FFF & arg11);
            n5 = arg4 >> 23;
            arg4 += arg5;
            arg12[arg7++] = arg6[ib.a(arg10 += n7, 16256) - -(arg11 >> 7)] >>> n5;
            arg12[arg7++] = arg6[ib.a(16256, arg10 += n7) - -((arg11 += n6) >> 7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(arg10 += n7, 16256)] >>> n5;
            arg11 += n6;
            arg11 = (0x3FFF & arg11) + (0x600000 & arg4);
            n5 = arg4 >> 23;
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg4 += arg5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(arg10 += n7, 16256)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg12[arg7++] = arg6[((arg11 += n6) >> 7) + ib.a(16256, arg10 += n7)] >>> n5;
            arg11 = n3;
            arg10 = n4;
            arg0 += arg13;
            arg8 += arg1;
            if ((arg3 += arg9) != 0) {
                n4 = arg0 / arg3 << 7;
                n3 = arg8 / arg3 << 7;
            }
            if (n3 >= 0) {
                if (n3 > 16256) {
                    n3 = 16256;
                }
            } else {
                n3 = 0;
            }
            n7 = -arg10 + n4 >> 4;
            n6 = -arg11 + n3 >> 4;
        }
        for (n2 = 0; n2 < (0xF & arg14); ++n2) {
            if ((n2 & 3) == 0) {
                n5 = arg4 >> 23;
                arg11 = (arg4 & 0x600000) + (0x3FFF & arg11);
                arg4 += arg5;
            }
            arg12[arg7++] = arg6[(arg11 >> 7) + ib.a(arg10, 16256)] >>> n5;
            arg10 += n7;
            arg11 += n6;
        }
    }

    static final i[] a(int arg0) {
        if (arg0 <= 37) {
            n = null;
        }
        return new i[]{eb.e, fb.h, f.b};
    }

    @Override
    final Socket a(byte arg0) throws IOException {
        List<Proxy> list;
        List<Proxy> list2;
        boolean bl = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!bl) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean bl2 = this.f == 443;
        try {
            list2 = this.q.select(new URI((bl2 ? "https" : "http") + "://" + this.h));
            list = this.q.select(new URI((!bl2 ? "https" : "http") + "://" + this.h));
        }
        catch (URISyntaxException uRISyntaxException) {
            return this.a(false);
        }
        list2.addAll(list);
        Object[] objectArray = list2.toArray();
        fa fa2 = null;
        Object[] objectArray2 = objectArray;
        if (arg0 != 50) {
            return null;
        }
        for (int i2 = 0; objectArray2.length > i2; ++i2) {
            Object object = objectArray2[i2];
            Proxy proxy = (Proxy)object;
            try {
                Socket socket = this.a(proxy, 16256);
                if (socket == null) continue;
                return socket;
            }
            catch (fa fa3) {
                fa2 = fa3;
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (fa2 != null) {
            throw fa2;
        }
        return this.a(false);
    }

    static final String a(boolean arg0, Throwable arg1) throws IOException {
        String string;
        String string2;
        Object object;
        if (arg1 instanceof la) {
            object = (la)arg1;
            arg1 = ((la)object).e;
            string2 = ((la)object).h + " | ";
        } else {
            string2 = "";
        }
        object = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer)object);
        arg1.printStackTrace(printWriter);
        printWriter.close();
        String string3 = ((StringWriter)object).toString();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string3));
        if (arg0) {
            s = null;
        }
        String string4 = bufferedReader.readLine();
        while ((string = bufferedReader.readLine()) != null) {
            int n2;
            int n3 = string.indexOf(40);
            int n4 = string.indexOf(41, n3 + 1);
            String string5 = n3 != -1 ? string.substring(0, n3) : string;
            string5 = string5.trim();
            string5 = string5.substring(1 + string5.lastIndexOf(32));
            string5 = string5.substring(string5.lastIndexOf(9) + 1);
            string2 = string2 + string5;
            if (n3 != -1 && n4 != -1 && (n2 = string.indexOf(".java:", n3)) >= 0) {
                string2 = string2 + string.substring(5 + n2, n4);
            }
            string2 = string2 + ' ';
        }
        string2 = string2 + "| " + string4;
        return string2;
    }

    private final Socket a(Proxy arg0, int arg1) throws IOException {
        if (arg0.type() == Proxy.Type.DIRECT) {
            return this.a(false);
        }
        SocketAddress socketAddress = arg0.address();
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (arg1 != 16256) {
            p = 123;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        if (arg0.type() == Proxy.Type.HTTP) {
            String string = null;
            try {
                Class<?> clazz = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method method = clazz.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                method.setAccessible(true);
                Object object = method.invoke(null, inetSocketAddress.getHostName(), new Integer(inetSocketAddress.getPort()));
                if (object != null) {
                    Method method2 = clazz.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                    method2.setAccessible(true);
                    if (((Boolean)method2.invoke(object, new Object[0])).booleanValue()) {
                        Method method3 = clazz.getDeclaredMethod("getHeaderName", new Class[0]);
                        method3.setAccessible(true);
                        Method method4 = clazz.getDeclaredMethod("getHeaderValue", URL.class, String.class);
                        method4.setAccessible(true);
                        String string2 = (String)method3.invoke(object, new Object[0]);
                        String string3 = (String)method4.invoke(object, new URL("https://" + this.h + "/"), "https");
                        string = string2 + ": " + string3;
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return this.a(inetSocketAddress.getPort(), 1514, string, inetSocketAddress.getHostName());
        }
        if (arg0.type() == Proxy.Type.SOCKS) {
            Socket socket = new Socket(arg0);
            socket.connect(new InetSocketAddress(this.h, this.f));
            return socket;
        }
        return null;
    }
}

