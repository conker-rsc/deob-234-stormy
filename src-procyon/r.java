import java.util.*;
import java.io.*;

public class r
{
    private static Hashtable b;
    private static int c;
    private static boolean d;
    private static String e;
    private static String a;
    
    public static File a(final int arg0, final String arg1) {
        if (arg0 != 2) {
            return null;
        }
        return a(r.c, r.e, arg1, 0);
    }
    
    public static File a(final int arg0, final String arg1, final String arg2, final int arg3) {
        try {
            if (!r.d) {
                throw new RuntimeException("");
            }
            final File file = r.b.get(arg2);
            if (file != null) {
                return file;
            }
            final String[] array = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", r.a, "/tmp/", "" };
            final String[] array2 = { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
            for (int i = arg3; i < 2; ++i) {
                for (int n = 0; array2.length > n; ++n) {
                    for (int j = 0; j < array.length; ++j) {
                        final String string = array[j] + array2[n] + "/" + ((arg1 != null) ? (arg1 + "/") : "") + arg2;
                        RandomAccessFile randomAccessFile = null;
                        try {
                            final File file2 = new File(string);
                            if (i != 0 || file2.exists()) {
                                final String s = array[j];
                                if (i != 1 || s.length() <= 0 || new File(s).exists()) {
                                    new File(array[j] + array2[n]).mkdir();
                                    if (arg1 != null) {
                                        new File(array[j] + array2[n] + "/" + arg1).mkdir();
                                    }
                                    randomAccessFile = new RandomAccessFile(file2, "rw");
                                    final int read = randomAccessFile.read();
                                    randomAccessFile.seek(0L);
                                    randomAccessFile.write(read);
                                    randomAccessFile.seek(0L);
                                    randomAccessFile.close();
                                    r.b.put(arg2, file2);
                                    return file2;
                                }
                            }
                        }
                        catch (final Exception ex) {
                            try {
                                if (randomAccessFile == null) {
                                    continue;
                                }
                                randomAccessFile.close();
                            }
                            catch (final Exception ex2) {}
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        catch (final RuntimeException ex3) {
            throw ex3;
        }
    }
    
    public static void a(final int arg0, final byte arg1, final String arg2) {
        r.c = arg0;
        r.e = arg2;
        if (arg1 != 101) {
            a(-64, null, null, -78);
        }
        try {
            r.a = System.getProperty("user.home");
            if (r.a != null) {
                r.a += "/";
            }
        }
        catch (final Exception ex) {}
        if (r.a == null) {
            r.a = "~/";
        }
        r.d = true;
    }
    
    private r() throws Throwable {
        super();
        throw new Error();
    }
    
    static {
        r.d = false;
        r.b = new Hashtable(16);
    }
}
