package com.tencent.mm.plugin.appbrand.game.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static final String fqf;

  static
  {
    AppMethodBeat.i(130286);
    fqf = b.aBv();
    AppMethodBeat.o(130286);
  }

  public static a aBu()
  {
    return a.b.htj;
  }

  // ERROR //
  public static void bW(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 49	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   12: aload_0
    //   13: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 56
    //   18: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: ldc 61
    //   27: ldc 63
    //   29: iconst_1
    //   30: anewarray 4	java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: aload_2
    //   36: aastore
    //   37: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: new 70	java/net/URL
    //   43: astore_3
    //   44: aload_3
    //   45: aload_1
    //   46: invokespecial 73	java/net/URL:<init>	(Ljava/lang/String;)V
    //   49: new 75	java/io/BufferedInputStream
    //   52: astore 4
    //   54: aload 4
    //   56: aload_3
    //   57: invokevirtual 79	java/net/URL:openStream	()Ljava/io/InputStream;
    //   60: invokespecial 82	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   63: aload 4
    //   65: ifnull +349 -> 414
    //   68: new 84	java/io/FileOutputStream
    //   71: astore_3
    //   72: aload_3
    //   73: aload_2
    //   74: invokespecial 85	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   77: aload_3
    //   78: astore_1
    //   79: sipush 1024
    //   82: newarray byte
    //   84: astore 5
    //   86: aload_3
    //   87: astore_1
    //   88: aload 4
    //   90: aload 5
    //   92: invokevirtual 91	java/io/InputStream:read	([B)I
    //   95: istore 6
    //   97: iload 6
    //   99: iconst_m1
    //   100: if_icmpeq +107 -> 207
    //   103: aload_3
    //   104: astore_1
    //   105: aload_3
    //   106: aload 5
    //   108: iconst_0
    //   109: iload 6
    //   111: invokevirtual 95	java/io/FileOutputStream:write	([BII)V
    //   114: goto -28 -> 86
    //   117: astore 5
    //   119: aload_3
    //   120: astore_1
    //   121: ldc 61
    //   123: aload 5
    //   125: ldc 97
    //   127: iconst_0
    //   128: anewarray 4	java/lang/Object
    //   131: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aload_3
    //   135: ifnull +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 104	java/io/FileOutputStream:close	()V
    //   142: aload 4
    //   144: ifnull +8 -> 152
    //   147: aload 4
    //   149: invokevirtual 105	java/io/InputStream:close	()V
    //   152: new 107	java/io/File
    //   155: dup
    //   156: aload_2
    //   157: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   160: new 107	java/io/File
    //   163: dup
    //   164: aload_0
    //   165: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   168: invokevirtual 112	java/io/File:renameTo	(Ljava/io/File;)Z
    //   171: pop
    //   172: ldc 47
    //   174: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: return
    //   178: astore_3
    //   179: ldc 61
    //   181: ldc 114
    //   183: iconst_2
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload_1
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: aload_3
    //   194: invokevirtual 115	java/lang/Exception:toString	()Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aconst_null
    //   202: astore 4
    //   204: goto -141 -> 63
    //   207: aload_3
    //   208: astore_1
    //   209: aload_3
    //   210: invokevirtual 121	java/io/FileOutputStream:flush	()V
    //   213: aload_3
    //   214: ifnull +7 -> 221
    //   217: aload_3
    //   218: invokevirtual 104	java/io/FileOutputStream:close	()V
    //   221: aload 4
    //   223: ifnull +8 -> 231
    //   226: aload 4
    //   228: invokevirtual 105	java/io/InputStream:close	()V
    //   231: new 107	java/io/File
    //   234: dup
    //   235: aload_2
    //   236: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   239: new 107	java/io/File
    //   242: dup
    //   243: aload_0
    //   244: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   247: invokevirtual 112	java/io/File:renameTo	(Ljava/io/File;)Z
    //   250: pop
    //   251: ldc 47
    //   253: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: goto -79 -> 177
    //   259: astore_1
    //   260: ldc 61
    //   262: aload_1
    //   263: ldc 97
    //   265: iconst_0
    //   266: anewarray 4	java/lang/Object
    //   269: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: goto -51 -> 221
    //   275: astore_1
    //   276: ldc 61
    //   278: aload_1
    //   279: ldc 97
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -57 -> 231
    //   291: astore_1
    //   292: ldc 61
    //   294: aload_1
    //   295: ldc 97
    //   297: iconst_0
    //   298: anewarray 4	java/lang/Object
    //   301: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -162 -> 142
    //   307: astore_1
    //   308: ldc 61
    //   310: aload_1
    //   311: ldc 97
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   320: goto -168 -> 152
    //   323: astore_3
    //   324: aconst_null
    //   325: astore_1
    //   326: aload_1
    //   327: ifnull +7 -> 334
    //   330: aload_1
    //   331: invokevirtual 104	java/io/FileOutputStream:close	()V
    //   334: aload 4
    //   336: ifnull +8 -> 344
    //   339: aload 4
    //   341: invokevirtual 105	java/io/InputStream:close	()V
    //   344: new 107	java/io/File
    //   347: dup
    //   348: aload_2
    //   349: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   352: new 107	java/io/File
    //   355: dup
    //   356: aload_0
    //   357: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   360: invokevirtual 112	java/io/File:renameTo	(Ljava/io/File;)Z
    //   363: pop
    //   364: ldc 47
    //   366: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   369: aload_3
    //   370: athrow
    //   371: astore_1
    //   372: ldc 61
    //   374: aload_1
    //   375: ldc 97
    //   377: iconst_0
    //   378: anewarray 4	java/lang/Object
    //   381: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   384: goto -50 -> 334
    //   387: astore_1
    //   388: ldc 61
    //   390: aload_1
    //   391: ldc 97
    //   393: iconst_0
    //   394: anewarray 4	java/lang/Object
    //   397: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: goto -56 -> 344
    //   403: astore_3
    //   404: goto -78 -> 326
    //   407: astore 5
    //   409: aconst_null
    //   410: astore_3
    //   411: goto -292 -> 119
    //   414: aconst_null
    //   415: astore_3
    //   416: goto -203 -> 213
    //
    // Exception table:
    //   from	to	target	type
    //   79	86	117	java/io/IOException
    //   88	97	117	java/io/IOException
    //   105	114	117	java/io/IOException
    //   209	213	117	java/io/IOException
    //   40	63	178	java/lang/Exception
    //   217	221	259	java/io/IOException
    //   226	231	275	java/io/IOException
    //   138	142	291	java/io/IOException
    //   147	152	307	java/io/IOException
    //   68	77	323	finally
    //   330	334	371	java/io/IOException
    //   339	344	387	java/io/IOException
    //   79	86	403	finally
    //   88	97	403	finally
    //   105	114	403	finally
    //   121	134	403	finally
    //   209	213	403	finally
    //   68	77	407	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.a
 * JD-Core Version:    0.6.2
 */