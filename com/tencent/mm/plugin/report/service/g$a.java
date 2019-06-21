package com.tencent.mm.plugin.report.service;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

public final class g$a
{
  public static a pYl;
  public volatile boolean hasInit;
  public long[] pYh;
  public int pYi;
  public String pYj;
  public long pYk;

  // ERROR //
  private static String Lz()
  {
    // Byte code:
    //   0: ldc 31
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 39
    //   7: astore_0
    //   8: new 41	java/io/FileReader
    //   11: astore_1
    //   12: aload_1
    //   13: ldc 43
    //   15: invokespecial 46	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   18: new 48	java/io/BufferedReader
    //   21: astore_2
    //   22: aload_2
    //   23: aload_1
    //   24: invokespecial 51	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: aload_2
    //   28: astore_3
    //   29: aload_1
    //   30: astore 4
    //   32: aload_0
    //   33: astore 5
    //   35: aload_0
    //   36: astore 6
    //   38: aload_2
    //   39: invokevirtual 54	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: invokevirtual 59	java/lang/String:trim	()Ljava/lang/String;
    //   45: astore_0
    //   46: aload_2
    //   47: astore_3
    //   48: aload_1
    //   49: astore 4
    //   51: aload_0
    //   52: astore 5
    //   54: aload_0
    //   55: astore 6
    //   57: aload_2
    //   58: invokevirtual 62	java/io/BufferedReader:close	()V
    //   61: aload_1
    //   62: invokevirtual 63	java/io/FileReader:close	()V
    //   65: aload_2
    //   66: invokevirtual 62	java/io/BufferedReader:close	()V
    //   69: aload_0
    //   70: astore_1
    //   71: ldc 31
    //   73: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: aload_1
    //   77: areturn
    //   78: astore_1
    //   79: ldc 68
    //   81: aload_1
    //   82: ldc 70
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: goto -26 -> 65
    //   94: astore_1
    //   95: ldc 68
    //   97: aload_1
    //   98: ldc 70
    //   100: iconst_0
    //   101: anewarray 4	java/lang/Object
    //   104: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   107: aload_0
    //   108: astore_1
    //   109: goto -38 -> 71
    //   112: astore 5
    //   114: aconst_null
    //   115: astore_2
    //   116: aconst_null
    //   117: astore_1
    //   118: aload_2
    //   119: astore_3
    //   120: aload_1
    //   121: astore 4
    //   123: ldc 68
    //   125: aload 5
    //   127: ldc 70
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 63	java/io/FileReader:close	()V
    //   144: aload_0
    //   145: astore_1
    //   146: aload_2
    //   147: ifnull -76 -> 71
    //   150: aload_2
    //   151: invokevirtual 62	java/io/BufferedReader:close	()V
    //   154: aload_0
    //   155: astore_1
    //   156: goto -85 -> 71
    //   159: astore_1
    //   160: ldc 68
    //   162: aload_1
    //   163: ldc 70
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_0
    //   173: astore_1
    //   174: goto -103 -> 71
    //   177: astore_1
    //   178: ldc 68
    //   180: aload_1
    //   181: ldc 70
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -46 -> 144
    //   193: astore 5
    //   195: aconst_null
    //   196: astore_2
    //   197: aconst_null
    //   198: astore_1
    //   199: aload_2
    //   200: astore_3
    //   201: aload_1
    //   202: astore 4
    //   204: ldc 68
    //   206: aload 5
    //   208: ldc 70
    //   210: iconst_0
    //   211: anewarray 4	java/lang/Object
    //   214: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: aload_1
    //   218: ifnull +7 -> 225
    //   221: aload_1
    //   222: invokevirtual 63	java/io/FileReader:close	()V
    //   225: aload_0
    //   226: astore_1
    //   227: aload_2
    //   228: ifnull -157 -> 71
    //   231: aload_2
    //   232: invokevirtual 62	java/io/BufferedReader:close	()V
    //   235: aload_0
    //   236: astore_1
    //   237: goto -166 -> 71
    //   240: astore_1
    //   241: ldc 68
    //   243: aload_1
    //   244: ldc 70
    //   246: iconst_0
    //   247: anewarray 4	java/lang/Object
    //   250: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: aload_0
    //   254: astore_1
    //   255: goto -184 -> 71
    //   258: astore_1
    //   259: ldc 68
    //   261: aload_1
    //   262: ldc 70
    //   264: iconst_0
    //   265: anewarray 4	java/lang/Object
    //   268: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: goto -46 -> 225
    //   274: astore_0
    //   275: aconst_null
    //   276: astore_3
    //   277: aconst_null
    //   278: astore_1
    //   279: aload_1
    //   280: ifnull +7 -> 287
    //   283: aload_1
    //   284: invokevirtual 63	java/io/FileReader:close	()V
    //   287: aload_3
    //   288: ifnull +7 -> 295
    //   291: aload_3
    //   292: invokevirtual 62	java/io/BufferedReader:close	()V
    //   295: ldc 31
    //   297: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: aload_0
    //   301: athrow
    //   302: astore_1
    //   303: ldc 68
    //   305: aload_1
    //   306: ldc 70
    //   308: iconst_0
    //   309: anewarray 4	java/lang/Object
    //   312: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: goto -28 -> 287
    //   318: astore_1
    //   319: ldc 68
    //   321: aload_1
    //   322: ldc 70
    //   324: iconst_0
    //   325: anewarray 4	java/lang/Object
    //   328: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: goto -36 -> 295
    //   334: astore_0
    //   335: aconst_null
    //   336: astore_3
    //   337: goto -58 -> 279
    //   340: astore_0
    //   341: aload 4
    //   343: astore_1
    //   344: goto -65 -> 279
    //   347: astore 5
    //   349: aconst_null
    //   350: astore_2
    //   351: goto -152 -> 199
    //   354: astore 4
    //   356: aload 5
    //   358: astore_0
    //   359: aload 4
    //   361: astore 5
    //   363: goto -164 -> 199
    //   366: astore 5
    //   368: aconst_null
    //   369: astore_2
    //   370: goto -252 -> 118
    //   373: astore 5
    //   375: aload 6
    //   377: astore_0
    //   378: goto -260 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   61	65	78	java/io/IOException
    //   65	69	94	java/io/IOException
    //   8	18	112	java/io/FileNotFoundException
    //   150	154	159	java/io/IOException
    //   140	144	177	java/io/IOException
    //   8	18	193	java/io/IOException
    //   231	235	240	java/io/IOException
    //   221	225	258	java/io/IOException
    //   8	18	274	finally
    //   283	287	302	java/io/IOException
    //   291	295	318	java/io/IOException
    //   18	27	334	finally
    //   38	46	340	finally
    //   57	61	340	finally
    //   123	136	340	finally
    //   204	217	340	finally
    //   18	27	347	java/io/IOException
    //   38	46	354	java/io/IOException
    //   57	61	354	java/io/IOException
    //   18	27	366	java/io/FileNotFoundException
    //   38	46	373	java/io/FileNotFoundException
    //   57	61	373	java/io/FileNotFoundException
  }

  public static a cgs()
  {
    try
    {
      AppMethodBeat.i(72741);
      if (pYl == null)
      {
        localObject1 = new com/tencent/mm/plugin/report/service/g$a;
        ((a)localObject1).<init>();
        pYl = (a)localObject1;
        ((a)localObject1).pYi = getNumCores();
        pYl.pYj = Lz();
        Object localObject3 = pYl;
        Object localObject4 = (ActivityManager)ah.getContext().getSystemService("activity");
        localObject1 = new android/app/ActivityManager$MemoryInfo;
        ((ActivityManager.MemoryInfo)localObject1).<init>();
        ((ActivityManager)localObject4).getMemoryInfo((ActivityManager.MemoryInfo)localObject1);
        ((a)localObject3).pYk = (((ActivityManager.MemoryInfo)localObject1).availMem >> 10);
        localObject1 = pYl;
        localObject3 = h.getDataDirectory();
        localObject4 = new android/os/StatFs;
        ((StatFs)localObject4).<init>(((File)localObject3).getPath());
        long l1 = ((StatFs)localObject4).getBlockSize();
        long l2 = ((StatFs)localObject4).getBlockCount();
        localObject4 = h.getDataDirectory();
        localObject3 = new android/os/StatFs;
        ((StatFs)localObject3).<init>(((File)localObject4).getPath());
        long l3 = ((StatFs)localObject3).getBlockSize();
        ((a)localObject1).pYh = new long[] { l2 * l1, ((StatFs)localObject3).getAvailableBlocks() * l3 };
        pYl.hasInit = true;
      }
      Object localObject1 = pYl;
      AppMethodBeat.o(72741);
      return localObject1;
    }
    finally
    {
    }
  }

  private static int getNumCores()
  {
    AppMethodBeat.i(72743);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>("/sys/devices/system/cpu/");
      g.a.a locala = new com/tencent/mm/plugin/report/service/g$a$a;
      locala.<init>();
      i = localFile.listFiles(locala).length;
      AppMethodBeat.o(72743);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ReportLogInfo", localException, "", new Object[0]);
        int i = 1;
        AppMethodBeat.o(72743);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.g.a
 * JD-Core Version:    0.6.2
 */