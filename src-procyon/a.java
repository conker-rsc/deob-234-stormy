import java.applet.*;
import netscape.javascript.*;

final class a
{
    static final Object a(final String arg0, final byte arg1, final Applet arg2) throws Throwable {
        return JSObject.getWindow(arg2).call(arg0, (Object[])null);
    }
}
