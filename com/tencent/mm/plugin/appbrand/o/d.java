package com.tencent.mm.plugin.appbrand.o;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.r;
import java.io.File;
import java.util.Properties;

public final class d
{
  public static final d iDE;

  static
  {
    AppMethodBeat.i(132728);
    iDE = new d();
    AppMethodBeat.o(132728);
  }

  public static Properties J(File paramFile)
  {
    AppMethodBeat.i(132727);
    paramFile = r.J(paramFile);
    AppMethodBeat.o(132727);
    return paramFile;
  }

  public static String aLD()
  {
    AppMethodBeat.i(132725);
    String str = r.aLD();
    AppMethodBeat.o(132725);
    return str;
  }

  public static int aLE()
  {
    AppMethodBeat.i(132726);
    int i = r.aLE();
    AppMethodBeat.o(132726);
    return i;
  }

  // ERROR //
  public static boolean cM(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: ldc 49
    //   6: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: invokestatic 55	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   12: invokevirtual 61	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   15: astore 4
    //   17: aload 4
    //   19: aload_1
    //   20: invokevirtual 67	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnonnull +35 -> 60
    //   28: ldc 69
    //   30: ldc 71
    //   32: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: ldc 49
    //   37: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_3
    //   41: ireturn
    //   42: astore_1
    //   43: ldc 69
    //   45: aload_1
    //   46: ldc 79
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -33 -> 24
    //   60: new 85	java/io/File
    //   63: dup
    //   64: aload_0
    //   65: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: astore 4
    //   70: aload 4
    //   72: invokevirtual 92	java/io/File:exists	()Z
    //   75: ifeq +9 -> 84
    //   78: aload 4
    //   80: invokevirtual 95	java/io/File:delete	()Z
    //   83: pop
    //   84: aload 4
    //   86: invokevirtual 99	java/io/File:getParentFile	()Ljava/io/File;
    //   89: invokevirtual 102	java/io/File:mkdirs	()Z
    //   92: pop
    //   93: new 104	java/io/FileOutputStream
    //   96: astore_0
    //   97: aload_0
    //   98: aload 4
    //   100: invokespecial 107	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   103: aload_0
    //   104: ifnull +114 -> 218
    //   107: sipush 1024
    //   110: newarray byte
    //   112: astore_2
    //   113: aload_1
    //   114: aload_2
    //   115: invokevirtual 113	java/io/InputStream:read	([B)I
    //   118: istore 5
    //   120: iload 5
    //   122: iconst_m1
    //   123: if_icmpeq +61 -> 184
    //   126: aload_0
    //   127: aload_2
    //   128: iconst_0
    //   129: iload 5
    //   131: invokevirtual 119	java/io/OutputStream:write	([BII)V
    //   134: goto -21 -> 113
    //   137: astore_2
    //   138: ldc 69
    //   140: aload_2
    //   141: ldc 79
    //   143: iconst_0
    //   144: anewarray 4	java/lang/Object
    //   147: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_1
    //   151: invokestatic 125	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   154: aload_0
    //   155: invokestatic 129	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   158: ldc 49
    //   160: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -123 -> 40
    //   166: astore_0
    //   167: ldc 69
    //   169: aload_0
    //   170: ldc 79
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_2
    //   180: astore_0
    //   181: goto -78 -> 103
    //   184: aload_1
    //   185: invokestatic 125	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   188: aload_0
    //   189: invokestatic 129	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   192: iconst_1
    //   193: istore_3
    //   194: ldc 49
    //   196: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: goto -159 -> 40
    //   202: astore_2
    //   203: aload_1
    //   204: invokestatic 125	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   207: aload_0
    //   208: invokestatic 129	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   211: ldc 49
    //   213: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: aload_2
    //   217: athrow
    //   218: aload_1
    //   219: invokestatic 125	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   222: ldc 49
    //   224: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: goto -187 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   17	24	42	java/io/IOException
    //   107	113	137	java/io/IOException
    //   113	120	137	java/io/IOException
    //   126	134	137	java/io/IOException
    //   93	103	166	java/io/FileNotFoundException
    //   107	113	202	finally
    //   113	120	202	finally
    //   126	134	202	finally
    //   138	150	202	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.d
 * JD-Core Version:    0.6.2
 */