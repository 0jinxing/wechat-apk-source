package com.tencent.mm.bq;

import android.content.Context;
import android.content.res.Resources;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.File;

public final class c
{
  private static String akA(String paramString)
  {
    AppMethodBeat.i(28269);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(28269);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll(" ", "").trim().replaceAll("kB", "").trim().replaceAll("\\t", "").trim();
      AppMethodBeat.o(28269);
    }
  }

  // ERROR //
  public static String dlN()
  {
    // Byte code:
    //   0: sipush 28270
    //   3: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 45	java/io/BufferedReader
    //   9: astore_0
    //   10: new 47	java/io/InputStreamReader
    //   13: astore_1
    //   14: new 49	java/io/FileInputStream
    //   17: astore_2
    //   18: aload_2
    //   19: ldc 51
    //   21: invokespecial 55	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: aload_2
    //   26: ldc 57
    //   28: invokespecial 60	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 63	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   36: aload_0
    //   37: astore_1
    //   38: new 65	java/lang/StringBuilder
    //   41: astore_3
    //   42: aload_0
    //   43: astore_1
    //   44: aload_3
    //   45: sipush 256
    //   48: invokespecial 67	java/lang/StringBuilder:<init>	(I)V
    //   51: aload_0
    //   52: astore_1
    //   53: aload_0
    //   54: invokevirtual 70	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   57: astore_2
    //   58: aload_2
    //   59: ifnull +61 -> 120
    //   62: aload_0
    //   63: astore_1
    //   64: aload_2
    //   65: invokestatic 18	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   68: ifne -17 -> 51
    //   71: aload_0
    //   72: astore_1
    //   73: aload_3
    //   74: aload_2
    //   75: invokestatic 72	com/tencent/mm/bq/c:akA	(Ljava/lang/String;)Ljava/lang/String;
    //   78: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: bipush 59
    //   83: invokevirtual 79	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: goto -36 -> 51
    //   90: astore_2
    //   91: aload_0
    //   92: astore_1
    //   93: ldc 81
    //   95: aload_2
    //   96: ldc 83
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: ldc 20
    //   107: astore_1
    //   108: aload_0
    //   109: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   112: sipush 28270
    //   115: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_1
    //   119: areturn
    //   120: aload_0
    //   121: astore_1
    //   122: aload_3
    //   123: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: bipush 44
    //   128: bipush 95
    //   130: invokevirtual 100	java/lang/String:replace	(CC)Ljava/lang/String;
    //   133: astore_2
    //   134: aload_2
    //   135: astore_1
    //   136: aload_0
    //   137: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   140: sipush 28270
    //   143: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: goto -28 -> 118
    //   149: astore_1
    //   150: aconst_null
    //   151: astore_2
    //   152: aload_1
    //   153: astore_0
    //   154: aload_2
    //   155: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   158: sipush 28270
    //   161: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload_0
    //   165: athrow
    //   166: astore_0
    //   167: aload_1
    //   168: astore_2
    //   169: goto -15 -> 154
    //   172: astore_2
    //   173: aconst_null
    //   174: astore_0
    //   175: goto -84 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   38	42	90	java/lang/Throwable
    //   44	51	90	java/lang/Throwable
    //   53	58	90	java/lang/Throwable
    //   64	71	90	java/lang/Throwable
    //   73	87	90	java/lang/Throwable
    //   122	134	90	java/lang/Throwable
    //   6	36	149	finally
    //   38	42	166	finally
    //   44	51	166	finally
    //   53	58	166	finally
    //   64	71	166	finally
    //   73	87	166	finally
    //   93	105	166	finally
    //   122	134	166	finally
    //   6	36	172	java/lang/Throwable
  }

  // ERROR //
  public static String dlO()
  {
    // Byte code:
    //   0: sipush 28271
    //   3: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 45	java/io/BufferedReader
    //   9: astore_0
    //   10: new 47	java/io/InputStreamReader
    //   13: astore_1
    //   14: new 49	java/io/FileInputStream
    //   17: astore_2
    //   18: aload_2
    //   19: ldc 103
    //   21: invokespecial 55	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: aload_2
    //   26: ldc 57
    //   28: invokespecial 60	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 63	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   36: aload_0
    //   37: astore_2
    //   38: new 65	java/lang/StringBuilder
    //   41: astore_3
    //   42: aload_0
    //   43: astore_2
    //   44: aload_3
    //   45: sipush 256
    //   48: invokespecial 67	java/lang/StringBuilder:<init>	(I)V
    //   51: aload_0
    //   52: astore_2
    //   53: aload_0
    //   54: invokevirtual 70	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +61 -> 120
    //   62: aload_0
    //   63: astore_2
    //   64: aload_1
    //   65: invokestatic 18	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   68: ifne -17 -> 51
    //   71: aload_0
    //   72: astore_2
    //   73: aload_3
    //   74: aload_1
    //   75: invokestatic 72	com/tencent/mm/bq/c:akA	(Ljava/lang/String;)Ljava/lang/String;
    //   78: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: bipush 59
    //   83: invokevirtual 79	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: goto -36 -> 51
    //   90: astore_1
    //   91: aload_0
    //   92: astore_2
    //   93: ldc 81
    //   95: aload_1
    //   96: ldc 83
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: ldc 20
    //   107: astore_2
    //   108: aload_0
    //   109: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   112: sipush 28271
    //   115: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_2
    //   119: areturn
    //   120: aload_0
    //   121: astore_2
    //   122: aload_3
    //   123: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: bipush 44
    //   128: bipush 95
    //   130: invokevirtual 100	java/lang/String:replace	(CC)Ljava/lang/String;
    //   133: astore_1
    //   134: aload_1
    //   135: astore_2
    //   136: aload_0
    //   137: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   140: sipush 28271
    //   143: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: goto -28 -> 118
    //   149: astore_0
    //   150: aconst_null
    //   151: astore_2
    //   152: aload_2
    //   153: invokestatic 93	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   156: sipush 28271
    //   159: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: aload_0
    //   163: athrow
    //   164: astore_0
    //   165: goto -13 -> 152
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_0
    //   171: goto -80 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   38	42	90	java/lang/Throwable
    //   44	51	90	java/lang/Throwable
    //   53	58	90	java/lang/Throwable
    //   64	71	90	java/lang/Throwable
    //   73	87	90	java/lang/Throwable
    //   122	134	90	java/lang/Throwable
    //   6	36	149	finally
    //   38	42	164	finally
    //   44	51	164	finally
    //   53	58	164	finally
    //   64	71	164	finally
    //   73	87	164	finally
    //   93	105	164	finally
    //   122	134	164	finally
    //   6	36	168	java/lang/Throwable
  }

  public static String dlP()
  {
    AppMethodBeat.i(28272);
    Object localObject1 = "";
    try
    {
      new DisplayMetrics();
      Object localObject2 = ah.getContext().getResources().getDisplayMetrics();
      int i = ((DisplayMetrics)localObject2).widthPixels;
      int j = ((DisplayMetrics)localObject2).heightPixels;
      float f1 = ((DisplayMetrics)localObject2).density;
      float f2 = ((DisplayMetrics)localObject2).xdpi;
      float f3 = ((DisplayMetrics)localObject2).ydpi;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = "" + "width:" + String.valueOf(i) + ";";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = (String)localObject3 + "height:" + String.valueOf(j) + ";";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = (String)localObject3 + "density:" + String.valueOf(f1) + ";";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = (String)localObject3 + "xd:" + String.valueOf(f2) + ";";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = (String)localObject2 + "yd:" + String.valueOf(f3) + ";";
      localObject1 = localObject2;
      localObject1 = ((String)localObject1).replace(",", "_");
      AppMethodBeat.o(28272);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bo.l(localException) });
    }
  }

  public static String dlQ()
  {
    AppMethodBeat.i(28274);
    String str1 = "";
    String str2 = str1;
    try
    {
      Object localObject = h.getExternalStorageDirectory();
      str2 = str1;
      StatFs localStatFs = new android/os/StatFs;
      str2 = str1;
      localStatFs.<init>(((File)localObject).getPath());
      str2 = str1;
      long l = localStatFs.getBlockSize();
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = "" + "AvailableSizes:" + localStatFs.getAvailableBlocks() * l + ";";
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = str1 + "FreeSizes:" + localStatFs.getFreeBlocks() * l + ";";
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = str1 + "AllSize:" + localStatFs.getBlockCount() * l + ";";
      str2 = str1;
      str2 = str2.replace(",", "_");
      AppMethodBeat.o(28274);
      return str2;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bo.l(localException) });
    }
  }

  public static String dlR()
  {
    AppMethodBeat.i(28275);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(71, null);
    AppMethodBeat.o(28275);
    return str;
  }

  public static String getRomInfo()
  {
    AppMethodBeat.i(28273);
    String str1 = "";
    String str2 = str1;
    try
    {
      Object localObject = h.getDataDirectory();
      str2 = str1;
      StatFs localStatFs = new android/os/StatFs;
      str2 = str1;
      localStatFs.<init>(((File)localObject).getPath());
      str2 = str1;
      long l = localStatFs.getBlockSize();
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = "" + "AvailableSizes:" + localStatFs.getAvailableBlocks() * l + ";";
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = str1 + "FreeSizes:" + localStatFs.getFreeBlocks() * l + ";";
      str2 = str1;
      localObject = new java/lang/StringBuilder;
      str2 = str1;
      ((StringBuilder)localObject).<init>();
      str2 = str1;
      str1 = str1 + "AllSize:" + localStatFs.getBlockCount() * l + ";";
      str2 = str1;
      str2 = str2.replace(",", "_");
      AppMethodBeat.o(28273);
      return str2;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.PostTaskHardwareInfo", "exception:%s", new Object[] { bo.l(localException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bq.c
 * JD-Core Version:    0.6.2
 */