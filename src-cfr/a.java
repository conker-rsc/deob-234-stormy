/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  netscape.javascript.JSObject
 */
import java.applet.Applet;
import netscape.javascript.JSObject;

final class a {
    static final Object a(String arg0, byte arg1, Applet arg2) throws Throwable {
        return JSObject.getWindow((Applet)arg2).call(arg0, null);
    }
}

