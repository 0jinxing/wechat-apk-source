package com.tencent.mm.plugin.hp.d;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static boolean OH(String paramString)
  {
    AppMethodBeat.i(90683);
    if ((!bo.isNullOrNil(paramString)) && (paramString.length() == 10));
    while (true)
    {
      try
      {
        int i = Integer.decode(paramString).intValue();
        if (((i & 0xFF) >= 0) && ((i & 0xFF) <= 31))
        {
          bool = true;
          AppMethodBeat.o(90683);
          return bool;
        }
        AppMethodBeat.o(90683);
        bool = false;
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("Tinker.TinkerUtils", paramString, "checkAplhVersion failed.", new Object[0]);
      }
      AppMethodBeat.o(90683);
      boolean bool = false;
    }
  }

  public static String OI(String paramString)
  {
    AppMethodBeat.i(90684);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = new String(Base64.decode(paramString, 0));
      AppMethodBeat.o(90684);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(90684);
    }
  }

  // ERROR //
  public static java.util.Properties S(java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 70
    //   4: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokevirtual 76	java/io/File:isFile	()Z
    //   11: ifeq +12 -> 23
    //   14: aload_0
    //   15: invokevirtual 79	java/io/File:length	()J
    //   18: lconst_0
    //   19: lcmp
    //   20: ifne +12 -> 32
    //   23: ldc 70
    //   25: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aload_1
    //   29: astore_0
    //   30: aload_0
    //   31: areturn
    //   32: new 81	java/util/zip/ZipFile
    //   35: astore_2
    //   36: aload_2
    //   37: aload_0
    //   38: invokespecial 84	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   41: aload_2
    //   42: ldc 86
    //   44: invokevirtual 90	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   47: astore_0
    //   48: aload_0
    //   49: ifnonnull +17 -> 66
    //   52: aload_2
    //   53: invokestatic 96	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   56: ldc 70
    //   58: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aload_1
    //   62: astore_0
    //   63: goto -33 -> 30
    //   66: aload_2
    //   67: aload_0
    //   68: invokevirtual 100	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   71: astore_0
    //   72: new 102	java/util/Properties
    //   75: astore_3
    //   76: aload_3
    //   77: invokespecial 105	java/util/Properties:<init>	()V
    //   80: aload_3
    //   81: aload_0
    //   82: invokevirtual 109	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   85: aload_0
    //   86: invokestatic 113	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   89: aload_2
    //   90: invokestatic 96	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   93: ldc 70
    //   95: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: aload_3
    //   99: astore_0
    //   100: goto -70 -> 30
    //   103: astore_3
    //   104: aconst_null
    //   105: astore_0
    //   106: aload_0
    //   107: invokestatic 113	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   110: ldc 70
    //   112: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: aload_3
    //   116: athrow
    //   117: astore_3
    //   118: aload_2
    //   119: astore_0
    //   120: new 115	java/lang/StringBuilder
    //   123: astore_2
    //   124: aload_2
    //   125: ldc 117
    //   127: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload_2
    //   131: aload_3
    //   132: invokevirtual 124	java/io/IOException:getMessage	()Ljava/lang/String;
    //   135: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload_0
    //   140: invokestatic 96	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   143: ldc 70
    //   145: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_1
    //   149: astore_0
    //   150: goto -120 -> 30
    //   153: astore_0
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_2
    //   157: invokestatic 96	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   160: ldc 70
    //   162: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: aload_0
    //   166: athrow
    //   167: astore_0
    //   168: goto -12 -> 156
    //   171: astore_3
    //   172: aload_0
    //   173: astore_2
    //   174: aload_3
    //   175: astore_0
    //   176: goto -20 -> 156
    //   179: astore_3
    //   180: aconst_null
    //   181: astore_0
    //   182: goto -62 -> 120
    //   185: astore_3
    //   186: goto -80 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   66	72	103	finally
    //   41	48	117	java/io/IOException
    //   85	89	117	java/io/IOException
    //   106	117	117	java/io/IOException
    //   32	41	153	finally
    //   41	48	167	finally
    //   85	89	167	finally
    //   106	117	167	finally
    //   120	139	171	finally
    //   32	41	179	java/io/IOException
    //   72	85	185	finally
  }

  // ERROR //
  @java.lang.Deprecated
  public static boolean bGz()
  {
    // Byte code:
    //   0: ldc 131
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 137	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   8: astore_0
    //   9: new 139	android/os/StatFs
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokevirtual 142	java/io/File:getPath	()Ljava/lang/String;
    //   18: invokespecial 143	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 146	android/os/StatFs:getAvailableBlocks	()I
    //   25: i2l
    //   26: lstore_2
    //   27: aload_1
    //   28: invokevirtual 149	android/os/StatFs:getBlockSize	()I
    //   31: istore 4
    //   33: lload_2
    //   34: iload 4
    //   36: i2l
    //   37: lmul
    //   38: lstore_2
    //   39: aload_1
    //   40: invokevirtual 152	android/os/StatFs:getBlockCount	()I
    //   43: i2l
    //   44: lstore 5
    //   46: aload_1
    //   47: invokevirtual 149	android/os/StatFs:getBlockSize	()I
    //   50: istore 4
    //   52: iload 4
    //   54: i2l
    //   55: lload 5
    //   57: lmul
    //   58: lstore 5
    //   60: lload 5
    //   62: lconst_0
    //   63: lcmp
    //   64: ifeq +31 -> 95
    //   67: lload_2
    //   68: ldc2_w 153
    //   71: lcmp
    //   72: ifle +23 -> 95
    //   75: iconst_1
    //   76: istore 7
    //   78: ldc 131
    //   80: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: iload 7
    //   85: ireturn
    //   86: astore_1
    //   87: lconst_0
    //   88: lstore_2
    //   89: lconst_0
    //   90: lstore 5
    //   92: goto -32 -> 60
    //   95: iconst_0
    //   96: istore 7
    //   98: ldc 131
    //   100: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -20 -> 83
    //   106: astore_1
    //   107: goto -18 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   5	33	86	java/lang/Exception
    //   39	52	106	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.d.c
 * JD-Core Version:    0.6.2
 */