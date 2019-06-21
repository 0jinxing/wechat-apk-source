package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class PlatformDetector$Vendor
{
  private static final String LINUX_ID_PREFIX = "ID=";
  private static final String[] LINUX_OS_RELEASE_FILES = { "/etc/os-release", "/usr/lib/os-release" };
  private static final String REDHAT_RELEASE_FILE = "/etc/redhat-release";

  private static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(75017);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(75017);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
        AppMethodBeat.o(75017);
    }
  }

  private static String getLinuxOsReleaseId()
  {
    AppMethodBeat.i(75014);
    Object localObject = LINUX_OS_RELEASE_FILES;
    int i = localObject.length;
    int j = 0;
    if (j < i)
    {
      File localFile = new File(localObject[j]);
      if (localFile.exists())
      {
        localObject = parseLinuxOsReleaseFile(localFile);
        AppMethodBeat.o(75014);
      }
    }
    while (true)
    {
      return localObject;
      j++;
      break;
      localObject = new File("/etc/redhat-release");
      if (!((File)localObject).exists())
        break label85;
      localObject = parseLinuxRedhatReleaseFile((File)localObject);
      AppMethodBeat.o(75014);
    }
    label85: localObject = new UnsatisfiedLinkError("Unsupported linux vendor: " + getName());
    AppMethodBeat.o(75014);
    throw ((Throwable)localObject);
  }

  public static String getName()
  {
    AppMethodBeat.i(75013);
    if (PlatformDetector.OS.isWindows())
    {
      localObject = "microsoft";
      AppMethodBeat.o(75013);
    }
    while (true)
    {
      return localObject;
      if (PlatformDetector.OS.isMac())
      {
        localObject = "apple";
        AppMethodBeat.o(75013);
      }
      else if (PlatformDetector.OS.isLinux())
      {
        localObject = getLinuxOsReleaseId();
        AppMethodBeat.o(75013);
      }
      else
      {
        if (!PlatformDetector.OS.isAndroid())
          break;
        localObject = "google";
        AppMethodBeat.o(75013);
      }
    }
    Object localObject = new UnsatisfiedLinkError("Unsupported vendor: " + getName());
    AppMethodBeat.o(75013);
    throw ((Throwable)localObject);
  }

  // ERROR //
  private static String parseLinuxOsReleaseFile(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 112
    //   6: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 114	java/io/BufferedReader
    //   12: astore_3
    //   13: new 116	java/io/InputStreamReader
    //   16: astore 4
    //   18: new 118	java/io/FileInputStream
    //   21: astore 5
    //   23: aload 5
    //   25: aload_0
    //   26: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: aload 4
    //   31: aload 5
    //   33: ldc 123
    //   35: invokespecial 126	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   38: aload_3
    //   39: aload 4
    //   41: invokespecial 129	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   44: aload_3
    //   45: invokevirtual 132	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore 4
    //   50: aload_2
    //   51: astore_0
    //   52: aload 4
    //   54: ifnull +23 -> 77
    //   57: aload 4
    //   59: ldc 11
    //   61: invokevirtual 136	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   64: ifeq -20 -> 44
    //   67: aload 4
    //   69: iconst_3
    //   70: invokevirtual 140	java/lang/String:substring	(I)Ljava/lang/String;
    //   73: invokestatic 144	com/eclipsesource/v8/PlatformDetector:access$300	(Ljava/lang/String;)Ljava/lang/String;
    //   76: astore_0
    //   77: aload_3
    //   78: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   81: ldc 112
    //   83: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: aload_0
    //   87: areturn
    //   88: astore_0
    //   89: aconst_null
    //   90: astore_3
    //   91: aload_3
    //   92: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   95: ldc 112
    //   97: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: astore_0
    //   102: goto -16 -> 86
    //   105: astore_3
    //   106: aconst_null
    //   107: astore_0
    //   108: aload_0
    //   109: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   112: ldc 112
    //   114: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: aload_3
    //   118: athrow
    //   119: astore_1
    //   120: aload_3
    //   121: astore_0
    //   122: aload_1
    //   123: astore_3
    //   124: goto -16 -> 108
    //   127: astore_0
    //   128: goto -37 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   9	44	88	java/io/IOException
    //   9	44	105	finally
    //   44	50	119	finally
    //   57	77	119	finally
    //   44	50	127	java/io/IOException
    //   57	77	127	java/io/IOException
  }

  // ERROR //
  private static String parseLinuxRedhatReleaseFile(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 147
    //   4: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 114	java/io/BufferedReader
    //   10: astore_2
    //   11: new 116	java/io/InputStreamReader
    //   14: astore_3
    //   15: new 118	java/io/FileInputStream
    //   18: astore 4
    //   20: aload 4
    //   22: aload_0
    //   23: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: aload_3
    //   27: aload 4
    //   29: ldc 123
    //   31: invokespecial 126	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 129	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   39: aload_2
    //   40: invokevirtual 132	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   43: astore_0
    //   44: aload_0
    //   45: ifnull +78 -> 123
    //   48: aload_0
    //   49: getstatic 153	java/util/Locale:US	Ljava/util/Locale;
    //   52: invokevirtual 157	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   55: astore_0
    //   56: aload_0
    //   57: ldc 159
    //   59: invokevirtual 163	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   62: ifeq +17 -> 79
    //   65: ldc 159
    //   67: astore_0
    //   68: aload_2
    //   69: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   72: ldc 147
    //   74: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: aload_0
    //   78: areturn
    //   79: aload_0
    //   80: ldc 165
    //   82: invokevirtual 163	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   85: ifeq +9 -> 94
    //   88: ldc 165
    //   90: astore_0
    //   91: goto -23 -> 68
    //   94: aload_0
    //   95: ldc 167
    //   97: invokevirtual 163	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   100: ifeq +9 -> 109
    //   103: ldc 169
    //   105: astore_0
    //   106: goto -38 -> 68
    //   109: aload_2
    //   110: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   113: ldc 147
    //   115: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_1
    //   119: astore_0
    //   120: goto -43 -> 77
    //   123: aload_2
    //   124: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   127: ldc 147
    //   129: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_1
    //   133: astore_0
    //   134: goto -57 -> 77
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_2
    //   141: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   144: goto -17 -> 127
    //   147: astore_0
    //   148: aconst_null
    //   149: astore_2
    //   150: aload_2
    //   151: invokestatic 146	com/eclipsesource/v8/PlatformDetector$Vendor:closeQuietly	(Ljava/io/Closeable;)V
    //   154: ldc 147
    //   156: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_0
    //   160: athrow
    //   161: astore_0
    //   162: goto -12 -> 150
    //   165: astore_0
    //   166: goto -26 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   7	39	137	java/io/IOException
    //   7	39	147	finally
    //   39	44	161	finally
    //   48	65	161	finally
    //   79	88	161	finally
    //   94	103	161	finally
    //   39	44	165	java/io/IOException
    //   48	65	165	java/io/IOException
    //   79	88	165	java/io/IOException
    //   94	103	165	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.PlatformDetector.Vendor
 * JD-Core Version:    0.6.2
 */