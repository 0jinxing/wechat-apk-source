package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class o
{
  private static void a(ZipOutputStream paramZipOutputStream, File paramFile, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(85415);
    Object localObject1;
    Object localObject2;
    if (paramFile.isDirectory())
    {
      localObject1 = paramFile.listFiles();
      int j = localObject1.length;
      if (i < j)
      {
        localObject2 = localObject1[i];
        if (localObject2 != null)
        {
          if (!((File)localObject2).isDirectory())
            break label99;
          a(paramZipOutputStream, (File)localObject2, paramFile.getName() + File.separator + ((File)localObject2).getName() + File.separator);
        }
        while (true)
        {
          i++;
          break;
          label99: a(paramZipOutputStream, (File)localObject2, paramString);
        }
      }
      AppMethodBeat.o(85415);
    }
    while (true)
    {
      return;
      localObject1 = new byte[2048];
      localObject2 = new BufferedInputStream(new FileInputStream(paramFile));
      paramZipOutputStream.putNextEntry(new ZipEntry(paramString + paramFile.getName()));
      while (true)
      {
        i = ((InputStream)localObject2).read((byte[])localObject1);
        if (i == -1)
          break;
        paramZipOutputStream.write((byte[])localObject1, 0, i);
      }
      ((InputStream)localObject2).close();
      AppMethodBeat.o(85415);
    }
  }

  // ERROR //
  public static boolean a(File[] paramArrayOfFile, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: ldc 90
    //   6: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 66	java/util/zip/ZipOutputStream
    //   12: astore 4
    //   14: new 92	java/io/BufferedOutputStream
    //   17: astore 5
    //   19: new 94	java/io/FileOutputStream
    //   22: astore 6
    //   24: aload 6
    //   26: aload_1
    //   27: invokespecial 95	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   30: aload 5
    //   32: aload 6
    //   34: invokespecial 98	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   37: aload 4
    //   39: aload 5
    //   41: invokespecial 99	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   44: iconst_0
    //   45: istore 7
    //   47: iload 7
    //   49: ifgt +119 -> 168
    //   52: aload_0
    //   53: iconst_0
    //   54: aaload
    //   55: astore 5
    //   57: aload 5
    //   59: ifnull +62 -> 121
    //   62: iload_3
    //   63: istore_2
    //   64: aload 5
    //   66: invokevirtual 102	java/io/File:exists	()Z
    //   69: ifeq +52 -> 121
    //   72: iload_3
    //   73: istore_2
    //   74: aload 5
    //   76: invokevirtual 19	java/io/File:isDirectory	()Z
    //   79: ifeq +48 -> 127
    //   82: iload_3
    //   83: istore_2
    //   84: new 25	java/lang/StringBuilder
    //   87: astore_1
    //   88: iload_3
    //   89: istore_2
    //   90: aload_1
    //   91: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   94: iload_3
    //   95: istore_2
    //   96: aload 4
    //   98: aload 5
    //   100: aload_1
    //   101: aload 5
    //   103: invokevirtual 33	java/io/File:getName	()Ljava/lang/String;
    //   106: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: getstatic 41	java/io/File:separator	Ljava/lang/String;
    //   112: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 46	com/tencent/xweb/xwalk/o:a	(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V
    //   121: iinc 7 1
    //   124: goto -77 -> 47
    //   127: iload_3
    //   128: istore_2
    //   129: aload 4
    //   131: aload 5
    //   133: ldc 104
    //   135: invokestatic 46	com/tencent/xweb/xwalk/o:a	(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V
    //   138: goto -17 -> 121
    //   141: astore_0
    //   142: iload_2
    //   143: istore_3
    //   144: aload 4
    //   146: ifnull +15 -> 161
    //   149: aload 4
    //   151: invokevirtual 107	java/util/zip/ZipOutputStream:closeEntry	()V
    //   154: aload 4
    //   156: invokevirtual 108	java/util/zip/ZipOutputStream:close	()V
    //   159: iload_2
    //   160: istore_3
    //   161: ldc 90
    //   163: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: iload_3
    //   167: ireturn
    //   168: iconst_1
    //   169: istore_3
    //   170: iconst_1
    //   171: istore_2
    //   172: aload 4
    //   174: invokevirtual 111	java/util/zip/ZipOutputStream:flush	()V
    //   177: aload 4
    //   179: invokevirtual 107	java/util/zip/ZipOutputStream:closeEntry	()V
    //   182: aload 4
    //   184: invokevirtual 108	java/util/zip/ZipOutputStream:close	()V
    //   187: goto -26 -> 161
    //   190: astore_0
    //   191: goto -30 -> 161
    //   194: astore_0
    //   195: aconst_null
    //   196: astore 4
    //   198: aload 4
    //   200: ifnull +13 -> 213
    //   203: aload 4
    //   205: invokevirtual 107	java/util/zip/ZipOutputStream:closeEntry	()V
    //   208: aload 4
    //   210: invokevirtual 108	java/util/zip/ZipOutputStream:close	()V
    //   213: ldc 90
    //   215: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: aload_0
    //   219: athrow
    //   220: astore_1
    //   221: goto -8 -> 213
    //   224: astore_0
    //   225: goto -27 -> 198
    //   228: astore_0
    //   229: iload_2
    //   230: istore_3
    //   231: goto -70 -> 161
    //   234: astore_0
    //   235: aconst_null
    //   236: astore 4
    //   238: goto -96 -> 142
    //
    // Exception table:
    //   from	to	target	type
    //   64	72	141	java/lang/Exception
    //   74	82	141	java/lang/Exception
    //   84	88	141	java/lang/Exception
    //   90	94	141	java/lang/Exception
    //   96	121	141	java/lang/Exception
    //   129	138	141	java/lang/Exception
    //   172	177	141	java/lang/Exception
    //   177	187	190	java/io/IOException
    //   9	44	194	finally
    //   203	213	220	java/io/IOException
    //   64	72	224	finally
    //   74	82	224	finally
    //   84	88	224	finally
    //   90	94	224	finally
    //   96	121	224	finally
    //   129	138	224	finally
    //   172	177	224	finally
    //   149	159	228	java/io/IOException
    //   9	44	234	java/lang/Exception
  }

  // ERROR //
  public static boolean iK(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: ldc 114
    //   6: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 15	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore 4
    //   19: aload 4
    //   21: invokevirtual 102	java/io/File:exists	()Z
    //   24: ifne +9 -> 33
    //   27: aload 4
    //   29: invokevirtual 118	java/io/File:mkdirs	()Z
    //   32: pop
    //   33: aload_0
    //   34: ldc 120
    //   36: invokevirtual 126	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   39: ifeq +171 -> 210
    //   42: aload_0
    //   43: astore 5
    //   45: new 128	java/util/zip/ZipInputStream
    //   48: astore 4
    //   50: new 51	java/io/BufferedInputStream
    //   53: astore 6
    //   55: new 53	java/io/FileInputStream
    //   58: astore_0
    //   59: aload_0
    //   60: aload_1
    //   61: invokespecial 129	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   64: aload 6
    //   66: aload_0
    //   67: invokespecial 59	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   70: aload 4
    //   72: aload 6
    //   74: invokespecial 130	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   77: sipush 2048
    //   80: newarray byte
    //   82: astore 6
    //   84: aload_2
    //   85: astore_0
    //   86: aload 4
    //   88: invokevirtual 134	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   91: astore_2
    //   92: aload_2
    //   93: ifnull +228 -> 321
    //   96: aload_2
    //   97: invokevirtual 135	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   100: astore_1
    //   101: aload_1
    //   102: ldc 137
    //   104: invokevirtual 141	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   107: ifne -21 -> 86
    //   110: aload_1
    //   111: ldc 143
    //   113: invokevirtual 141	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   116: ifne -30 -> 86
    //   119: aload_1
    //   120: aload 5
    //   122: invokestatic 147	com/tencent/xweb/xwalk/o:iL	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: aload_2
    //   126: invokevirtual 148	java/util/zip/ZipEntry:isDirectory	()Z
    //   129: ifeq +105 -> 234
    //   132: new 15	java/io/File
    //   135: astore_2
    //   136: new 25	java/lang/StringBuilder
    //   139: astore 7
    //   141: aload 7
    //   143: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   146: aload_2
    //   147: aload 7
    //   149: aload 5
    //   151: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_1
    //   155: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;)V
    //   164: aload_2
    //   165: invokevirtual 118	java/io/File:mkdirs	()Z
    //   168: pop
    //   169: goto -83 -> 86
    //   172: astore_1
    //   173: aload 4
    //   175: ifnull +13 -> 188
    //   178: aload 4
    //   180: invokevirtual 149	java/util/zip/ZipInputStream:closeEntry	()V
    //   183: aload 4
    //   185: invokevirtual 150	java/util/zip/ZipInputStream:close	()V
    //   188: iload_3
    //   189: istore 8
    //   191: aload_0
    //   192: ifnull +10 -> 202
    //   195: aload_0
    //   196: invokevirtual 151	java/io/BufferedOutputStream:close	()V
    //   199: iload_3
    //   200: istore 8
    //   202: ldc 114
    //   204: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: iload 8
    //   209: ireturn
    //   210: new 25	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   217: aload_0
    //   218: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: bipush 47
    //   223: invokevirtual 154	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   226: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: astore 5
    //   231: goto -186 -> 45
    //   234: new 94	java/io/FileOutputStream
    //   237: astore_2
    //   238: new 25	java/lang/StringBuilder
    //   241: astore 7
    //   243: aload 7
    //   245: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   248: aload_2
    //   249: aload 7
    //   251: aload 5
    //   253: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload_1
    //   257: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   263: invokespecial 95	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   266: new 92	java/io/BufferedOutputStream
    //   269: dup
    //   270: aload_2
    //   271: invokespecial 98	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   274: astore_1
    //   275: aload 4
    //   277: aload 6
    //   279: invokevirtual 155	java/util/zip/ZipInputStream:read	([B)I
    //   282: istore 9
    //   284: iload 9
    //   286: iconst_m1
    //   287: if_icmpeq +21 -> 308
    //   290: aload_1
    //   291: aload 6
    //   293: iconst_0
    //   294: iload 9
    //   296: invokevirtual 156	java/io/BufferedOutputStream:write	([BII)V
    //   299: goto -24 -> 275
    //   302: astore_0
    //   303: aload_1
    //   304: astore_0
    //   305: goto -132 -> 173
    //   308: aload_1
    //   309: invokevirtual 157	java/io/BufferedOutputStream:flush	()V
    //   312: aload_1
    //   313: invokevirtual 151	java/io/BufferedOutputStream:close	()V
    //   316: aload_1
    //   317: astore_0
    //   318: goto -232 -> 86
    //   321: iconst_1
    //   322: istore_3
    //   323: aload 4
    //   325: invokevirtual 149	java/util/zip/ZipInputStream:closeEntry	()V
    //   328: aload 4
    //   330: invokevirtual 150	java/util/zip/ZipInputStream:close	()V
    //   333: iload_3
    //   334: istore 8
    //   336: aload_0
    //   337: ifnull -135 -> 202
    //   340: aload_0
    //   341: invokevirtual 151	java/io/BufferedOutputStream:close	()V
    //   344: iload_3
    //   345: istore 8
    //   347: goto -145 -> 202
    //   350: astore_0
    //   351: iload_3
    //   352: istore 8
    //   354: goto -152 -> 202
    //   357: astore_0
    //   358: aconst_null
    //   359: astore 4
    //   361: aconst_null
    //   362: astore_1
    //   363: aload 4
    //   365: ifnull +13 -> 378
    //   368: aload 4
    //   370: invokevirtual 149	java/util/zip/ZipInputStream:closeEntry	()V
    //   373: aload 4
    //   375: invokevirtual 150	java/util/zip/ZipInputStream:close	()V
    //   378: aload_1
    //   379: ifnull +7 -> 386
    //   382: aload_1
    //   383: invokevirtual 151	java/io/BufferedOutputStream:close	()V
    //   386: ldc 114
    //   388: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: aload_0
    //   392: athrow
    //   393: astore_1
    //   394: goto -8 -> 386
    //   397: astore_0
    //   398: aconst_null
    //   399: astore_1
    //   400: goto -37 -> 363
    //   403: astore_0
    //   404: goto -41 -> 363
    //   407: astore 5
    //   409: aload_0
    //   410: astore_1
    //   411: aload 5
    //   413: astore_0
    //   414: goto -51 -> 363
    //   417: astore_0
    //   418: iload_3
    //   419: istore 8
    //   421: goto -219 -> 202
    //   424: astore_0
    //   425: aconst_null
    //   426: astore 4
    //   428: aconst_null
    //   429: astore_0
    //   430: goto -257 -> 173
    //   433: astore_0
    //   434: aconst_null
    //   435: astore_0
    //   436: goto -263 -> 173
    //
    // Exception table:
    //   from	to	target	type
    //   86	92	172	java/io/IOException
    //   96	169	172	java/io/IOException
    //   234	275	172	java/io/IOException
    //   275	284	302	java/io/IOException
    //   290	299	302	java/io/IOException
    //   308	316	302	java/io/IOException
    //   323	333	350	java/io/IOException
    //   340	344	350	java/io/IOException
    //   45	77	357	finally
    //   368	378	393	java/io/IOException
    //   382	386	393	java/io/IOException
    //   77	84	397	finally
    //   275	284	403	finally
    //   290	299	403	finally
    //   308	316	403	finally
    //   86	92	407	finally
    //   96	169	407	finally
    //   234	275	407	finally
    //   178	188	417	java/io/IOException
    //   195	199	417	java/io/IOException
    //   45	77	424	java/io/IOException
    //   77	84	433	java/io/IOException
  }

  private static void iL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(85417);
    paramString1 = paramString1.split("/");
    if (paramString1.length <= 1)
      AppMethodBeat.o(85417);
    while (true)
    {
      return;
      for (int i = 0; i < paramString1.length - 1; i++)
      {
        paramString2 = paramString2 + paramString1[i] + "/";
        File localFile = new File(paramString2);
        if (!localFile.exists())
          localFile.mkdirs();
      }
      AppMethodBeat.o(85417);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.o
 * JD-Core Version:    0.6.2
 */