/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class r {
    private static Hashtable b;
    private static int c;
    private static boolean d;
    private static String e;
    private static String a;

    public static File a(int arg0, String arg1) {
        if (arg0 != 2) {
            return null;
        }
        return r.a(c, e, arg1, 0);
    }

    public static File a(int arg0, String arg1, String arg2, int arg3) {
        if (!d) {
            throw new RuntimeException("");
        }
        File file = (File)b.get(arg2);
        if (file != null) {
            return file;
        }
        String[] stringArray = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", a, "/tmp/", ""};
        String[] stringArray2 = new String[]{".jagex_cache_" + arg0, ".file_store_" + arg0};
        for (int i2 = arg3; i2 < 2; ++i2) {
            for (int i3 = 0; stringArray2.length > i3; ++i3) {
                for (int i4 = 0; i4 < stringArray.length; ++i4) {
                    String string = stringArray[i4] + stringArray2[i3] + "/" + (arg1 != null ? arg1 + "/" : "") + arg2;
                    RandomAccessFile randomAccessFile = null;
                    try {
                        File file2 = new File(string);
                        if (i2 == 0 && !file2.exists()) continue;
                        String string2 = stringArray[i4];
                        if (i2 == 1 && string2.length() > 0 && !new File(string2).exists()) continue;
                        new File(stringArray[i4] + stringArray2[i3]).mkdir();
                        if (arg1 != null) {
                            new File(stringArray[i4] + stringArray2[i3] + "/" + arg1).mkdir();
                        }
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        int n2 = randomAccessFile.read();
                        randomAccessFile.seek(0L);
                        randomAccessFile.write(n2);
                        randomAccessFile.seek(0L);
                        randomAccessFile.close();
                        b.put(arg2, file2);
                        return file2;
                    }
                    catch (Exception exception) {
                        try {
                            if (randomAccessFile == null) continue;
                            randomAccessFile.close();
                            randomAccessFile = null;
                            continue;
                        }
                        catch (Exception exception2) {
                            // empty catch block
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    public static void a(int arg0, byte arg1, String arg2) {
        c = arg0;
        e = arg2;
        if (arg1 != 101) {
            r.a(-64, null, null, -78);
        }
        try {
            a = System.getProperty("user.home");
            if (a != null) {
                a = a + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (a == null) {
            a = "~/";
        }
        d = true;
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        d = false;
        b = new Hashtable(16);
    }
}

