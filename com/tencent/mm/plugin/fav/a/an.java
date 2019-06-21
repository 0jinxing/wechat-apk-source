package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Set;

public final class an
{
  private static String eSk = "";
  public static Set<String> mgy;
  public static int mgz = 1;

  // ERROR //
  public static int afW()
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 33	java/io/FileInputStream
    //   8: astore_0
    //   9: new 35	java/io/File
    //   12: astore_1
    //   13: aload_1
    //   14: invokestatic 39	com/tencent/mm/plugin/fav/a/an:bvj	()Ljava/lang/String;
    //   17: ldc 41
    //   19: invokespecial 45	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: aload_0
    //   28: astore_1
    //   29: new 50	java/io/InputStreamReader
    //   32: astore_2
    //   33: aload_0
    //   34: astore_1
    //   35: aload_2
    //   36: aload_0
    //   37: invokespecial 53	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   40: aload_0
    //   41: astore_1
    //   42: new 55	java/io/BufferedReader
    //   45: astore_3
    //   46: aload_0
    //   47: astore_1
    //   48: aload_3
    //   49: aload_2
    //   50: invokespecial 58	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: ldc 15
    //   55: astore_2
    //   56: aload_0
    //   57: astore_1
    //   58: aload_3
    //   59: invokevirtual 61	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   62: astore 4
    //   64: aload 4
    //   66: ifnull +37 -> 103
    //   69: aload_0
    //   70: astore_1
    //   71: new 63	java/lang/StringBuilder
    //   74: astore 5
    //   76: aload_0
    //   77: astore_1
    //   78: aload 5
    //   80: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   83: aload_0
    //   84: astore_1
    //   85: aload 5
    //   87: aload_2
    //   88: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: aload 4
    //   93: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: astore_2
    //   100: goto -44 -> 56
    //   103: aload_0
    //   104: astore_1
    //   105: new 74	org/json/JSONObject
    //   108: astore_3
    //   109: aload_0
    //   110: astore_1
    //   111: aload_3
    //   112: aload_2
    //   113: invokespecial 77	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   116: aload_0
    //   117: astore_1
    //   118: aload_3
    //   119: ldc 79
    //   121: invokevirtual 83	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   124: istore 6
    //   126: aload_0
    //   127: astore_1
    //   128: ldc 85
    //   130: ldc 87
    //   132: iconst_2
    //   133: anewarray 4	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload_2
    //   139: aastore
    //   140: dup
    //   141: iconst_1
    //   142: iload 6
    //   144: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: aastore
    //   148: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   155: ldc 25
    //   157: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: iload 6
    //   162: ireturn
    //   163: astore_2
    //   164: aconst_null
    //   165: astore_0
    //   166: aload_0
    //   167: astore_1
    //   168: ldc 85
    //   170: aload_2
    //   171: aload_2
    //   172: invokevirtual 111	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   175: iconst_0
    //   176: anewarray 4	java/lang/Object
    //   179: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: aload_0
    //   183: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   186: ldc 25
    //   188: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: iconst_1
    //   192: istore 6
    //   194: goto -34 -> 160
    //   197: astore_0
    //   198: aconst_null
    //   199: astore_1
    //   200: aload_1
    //   201: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   204: ldc 25
    //   206: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: aload_0
    //   210: athrow
    //   211: astore_0
    //   212: goto -12 -> 200
    //   215: astore_2
    //   216: goto -50 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   5	27	163	java/lang/Exception
    //   5	27	197	finally
    //   29	33	211	finally
    //   35	40	211	finally
    //   42	46	211	finally
    //   48	53	211	finally
    //   58	64	211	finally
    //   71	76	211	finally
    //   78	83	211	finally
    //   85	100	211	finally
    //   105	109	211	finally
    //   111	116	211	finally
    //   118	126	211	finally
    //   128	151	211	finally
    //   168	182	211	finally
    //   29	33	215	java/lang/Exception
    //   35	40	215	java/lang/Exception
    //   42	46	215	java/lang/Exception
    //   48	53	215	java/lang/Exception
    //   58	64	215	java/lang/Exception
    //   71	76	215	java/lang/Exception
    //   78	83	215	java/lang/Exception
    //   85	100	215	java/lang/Exception
    //   105	109	215	java/lang/Exception
    //   111	116	215	java/lang/Exception
    //   118	126	215	java/lang/Exception
    //   128	151	215	java/lang/Exception
  }

  // ERROR //
  public static int afX()
  {
    // Byte code:
    //   0: ldc 117
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   8: invokevirtual 129	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 131
    //   15: invokevirtual 137	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore_1
    //   19: new 50	java/io/InputStreamReader
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokespecial 53	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   28: new 55	java/io/BufferedReader
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokespecial 58	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: ldc 15
    //   39: astore_3
    //   40: aload_0
    //   41: astore 4
    //   43: aload_2
    //   44: astore 5
    //   46: aload_1
    //   47: astore 6
    //   49: aload_0
    //   50: invokevirtual 61	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   53: astore 7
    //   55: aload 7
    //   57: ifnull +58 -> 115
    //   60: aload_0
    //   61: astore 4
    //   63: aload_2
    //   64: astore 5
    //   66: aload_1
    //   67: astore 6
    //   69: new 63	java/lang/StringBuilder
    //   72: astore 8
    //   74: aload_0
    //   75: astore 4
    //   77: aload_2
    //   78: astore 5
    //   80: aload_1
    //   81: astore 6
    //   83: aload 8
    //   85: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   88: aload_0
    //   89: astore 4
    //   91: aload_2
    //   92: astore 5
    //   94: aload_1
    //   95: astore 6
    //   97: aload 8
    //   99: aload_3
    //   100: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload 7
    //   105: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore_3
    //   112: goto -72 -> 40
    //   115: aload_0
    //   116: astore 4
    //   118: aload_2
    //   119: astore 5
    //   121: aload_1
    //   122: astore 6
    //   124: new 74	org/json/JSONObject
    //   127: astore 7
    //   129: aload_0
    //   130: astore 4
    //   132: aload_2
    //   133: astore 5
    //   135: aload_1
    //   136: astore 6
    //   138: aload 7
    //   140: aload_3
    //   141: invokespecial 77	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   144: aload_0
    //   145: astore 4
    //   147: aload_2
    //   148: astore 5
    //   150: aload_1
    //   151: astore 6
    //   153: aload 7
    //   155: ldc 79
    //   157: invokevirtual 83	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   160: istore 9
    //   162: aload_0
    //   163: astore 4
    //   165: aload_2
    //   166: astore 5
    //   168: aload_1
    //   169: astore 6
    //   171: ldc 85
    //   173: ldc 87
    //   175: iconst_2
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_3
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: iload 9
    //   187: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_1
    //   195: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   198: aload_2
    //   199: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   202: aload_0
    //   203: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   206: ldc 117
    //   208: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: iload 9
    //   213: ireturn
    //   214: astore_3
    //   215: aconst_null
    //   216: astore_0
    //   217: aconst_null
    //   218: astore_2
    //   219: aconst_null
    //   220: astore_1
    //   221: aload_0
    //   222: astore 4
    //   224: aload_2
    //   225: astore 5
    //   227: aload_1
    //   228: astore 6
    //   230: ldc 85
    //   232: aload_3
    //   233: aload_3
    //   234: invokevirtual 111	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   237: iconst_0
    //   238: anewarray 4	java/lang/Object
    //   241: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload_1
    //   245: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   248: aload_2
    //   249: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   252: aload_0
    //   253: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   256: ldc 117
    //   258: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: iconst_1
    //   262: istore 9
    //   264: goto -53 -> 211
    //   267: astore_0
    //   268: aconst_null
    //   269: astore_3
    //   270: aconst_null
    //   271: astore_2
    //   272: aconst_null
    //   273: astore_1
    //   274: aload_1
    //   275: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   278: aload_2
    //   279: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   282: aload_3
    //   283: invokestatic 105	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   286: ldc 117
    //   288: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_0
    //   292: athrow
    //   293: astore_0
    //   294: aconst_null
    //   295: astore_3
    //   296: aconst_null
    //   297: astore_2
    //   298: goto -24 -> 274
    //   301: astore_0
    //   302: aconst_null
    //   303: astore_3
    //   304: goto -30 -> 274
    //   307: astore_0
    //   308: aload 4
    //   310: astore_3
    //   311: aload 5
    //   313: astore_2
    //   314: aload 6
    //   316: astore_1
    //   317: goto -43 -> 274
    //   320: astore_3
    //   321: aconst_null
    //   322: astore_0
    //   323: aconst_null
    //   324: astore_2
    //   325: goto -104 -> 221
    //   328: astore_3
    //   329: aconst_null
    //   330: astore_0
    //   331: goto -110 -> 221
    //   334: astore_3
    //   335: goto -114 -> 221
    //
    // Exception table:
    //   from	to	target	type
    //   12	19	214	java/lang/Exception
    //   12	19	267	finally
    //   19	28	293	finally
    //   28	37	301	finally
    //   49	55	307	finally
    //   69	74	307	finally
    //   83	88	307	finally
    //   97	112	307	finally
    //   124	129	307	finally
    //   138	144	307	finally
    //   153	162	307	finally
    //   171	194	307	finally
    //   230	244	307	finally
    //   19	28	320	java/lang/Exception
    //   28	37	328	java/lang/Exception
    //   49	55	334	java/lang/Exception
    //   69	74	334	java/lang/Exception
    //   83	88	334	java/lang/Exception
    //   97	112	334	java/lang/Exception
    //   124	129	334	java/lang/Exception
    //   138	144	334	java/lang/Exception
    //   153	162	334	java/lang/Exception
    //   171	194	334	java/lang/Exception
  }

  public static String bvi()
  {
    AppMethodBeat.i(51354);
    if (bd.dpp() > 1048576L);
    for (Object localObject = new File(hg(false), "wenote/res"); ; localObject = new File(com.tencent.mm.compatible.util.e.eSn, "wenote/res"))
    {
      localObject = ((File)localObject).getAbsolutePath();
      AppMethodBeat.o(51354);
      return localObject;
    }
  }

  public static String bvj()
  {
    AppMethodBeat.i(51355);
    Object localObject = new File(hg(false), "wenote/res");
    if (new File((File)localObject, "WNNote.zip").exists())
    {
      localObject = ((File)localObject).getAbsolutePath();
      AppMethodBeat.o(51355);
    }
    while (true)
    {
      return localObject;
      localObject = new File(com.tencent.mm.compatible.util.e.eSn, "wenote/res");
      if (new File((File)localObject, "WNNote.zip").exists())
      {
        localObject = ((File)localObject).getAbsolutePath();
        AppMethodBeat.o(51355);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(51355);
      }
    }
  }

  public static String bvk()
  {
    AppMethodBeat.i(51356);
    Object localObject = new File(hg(true), "wenote/loc/data");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath();
    AppMethodBeat.o(51356);
    return localObject;
  }

  public static String bvl()
  {
    AppMethodBeat.i(51357);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = new File(hg(false), "wenote/html/upload");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath() + "/wenoteupload.htm";
    AppMethodBeat.o(51357);
    return localObject;
  }

  public static String bvm()
  {
    AppMethodBeat.i(51358);
    Object localObject = new File(hg(true), "wenote/image/localpath");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath();
    AppMethodBeat.o(51358);
    return localObject;
  }

  public static String bvn()
  {
    AppMethodBeat.i(51359);
    Object localObject = new File(hg(true), "wenote/voice/data");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath();
    AppMethodBeat.o(51359);
    return localObject;
  }

  private static String hg(boolean paramBoolean)
  {
    AppMethodBeat.i(51353);
    String str;
    if (paramBoolean)
    {
      str = g.RP().eJM;
      AppMethodBeat.o(51353);
    }
    while (true)
    {
      return str;
      if (bo.isNullOrNil(eSk))
        eSk = com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data");
      str = eSk;
      AppMethodBeat.o(51353);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.an
 * JD-Core Version:    0.6.2
 */