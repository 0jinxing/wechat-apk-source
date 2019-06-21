package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;

public final class l
{
  public static long C(File paramFile)
  {
    long l = 0L;
    AppMethodBeat.i(105366);
    paramFile = paramFile.listFiles();
    if (paramFile == null)
      AppMethodBeat.o(105366);
    while (true)
    {
      return l;
      int i = paramFile.length;
      int j = 0;
      if (j < i)
      {
        File localFile = paramFile[j];
        if (localFile.isFile());
        for (l += localFile.length(); ; l += C(localFile))
        {
          j++;
          break;
        }
      }
      AppMethodBeat.o(105366);
    }
  }

  // ERROR //
  static java.nio.ByteBuffer D(File paramFile)
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnull +17 -> 23
    //   9: aload_0
    //   10: invokevirtual 43	java/io/File:exists	()Z
    //   13: ifeq +10 -> 23
    //   16: aload_0
    //   17: invokevirtual 26	java/io/File:isFile	()Z
    //   20: ifne +15 -> 35
    //   23: iconst_0
    //   24: invokestatic 49	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   27: astore_0
    //   28: ldc 40
    //   30: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_0
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 30	java/io/File:length	()J
    //   39: l2i
    //   40: istore_1
    //   41: iload_1
    //   42: ifge +16 -> 58
    //   45: iconst_0
    //   46: invokestatic 49	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   49: astore_0
    //   50: ldc 40
    //   52: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: goto -22 -> 33
    //   58: iload_1
    //   59: invokestatic 49	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   62: astore_2
    //   63: new 51	java/io/FileInputStream
    //   66: astore_3
    //   67: aload_3
    //   68: aload_0
    //   69: invokespecial 55	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: aload_3
    //   73: astore 4
    //   75: sipush 4096
    //   78: newarray byte
    //   80: astore 5
    //   82: aload_3
    //   83: astore 4
    //   85: aload_3
    //   86: aload 5
    //   88: iconst_0
    //   89: sipush 4096
    //   92: invokevirtual 59	java/io/FileInputStream:read	([BII)I
    //   95: istore_1
    //   96: iload_1
    //   97: iconst_m1
    //   98: if_icmpeq +58 -> 156
    //   101: aload_3
    //   102: astore 4
    //   104: aload_2
    //   105: aload 5
    //   107: iconst_0
    //   108: iload_1
    //   109: invokevirtual 63	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   112: pop
    //   113: goto -31 -> 82
    //   116: astore_0
    //   117: aload_3
    //   118: astore 4
    //   120: ldc 65
    //   122: aload_0
    //   123: ldc 67
    //   125: iconst_0
    //   126: anewarray 4	java/lang/Object
    //   129: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload_3
    //   133: astore 4
    //   135: aload_2
    //   136: invokestatic 79	com/tencent/luggage/g/a:j	(Ljava/nio/ByteBuffer;)V
    //   139: aload_3
    //   140: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   143: iconst_0
    //   144: invokestatic 49	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   147: astore_0
    //   148: ldc 40
    //   150: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -120 -> 33
    //   156: aload_3
    //   157: astore 4
    //   159: aload_2
    //   160: invokevirtual 89	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   163: pop
    //   164: aload_3
    //   165: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   168: ldc 40
    //   170: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_2
    //   174: astore_0
    //   175: goto -142 -> 33
    //   178: astore 4
    //   180: aconst_null
    //   181: astore_3
    //   182: aload_3
    //   183: astore 4
    //   185: ldc 65
    //   187: ldc 91
    //   189: iconst_2
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_0
    //   196: invokevirtual 30	java/io/File:length	()J
    //   199: invokestatic 97	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: aload_2
    //   206: invokevirtual 101	java/nio/ByteBuffer:capacity	()I
    //   209: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   212: aastore
    //   213: invokestatic 110	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload_3
    //   217: astore 4
    //   219: aload_2
    //   220: invokestatic 79	com/tencent/luggage/g/a:j	(Ljava/nio/ByteBuffer;)V
    //   223: aload_3
    //   224: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   227: goto -84 -> 143
    //   230: astore_0
    //   231: aconst_null
    //   232: astore 4
    //   234: aload 4
    //   236: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   239: ldc 40
    //   241: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_0
    //   245: athrow
    //   246: astore_0
    //   247: goto -13 -> 234
    //   250: astore 4
    //   252: goto -70 -> 182
    //   255: astore_0
    //   256: aconst_null
    //   257: astore_3
    //   258: goto -141 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   75	82	116	java/io/IOException
    //   85	96	116	java/io/IOException
    //   104	113	116	java/io/IOException
    //   159	164	116	java/io/IOException
    //   63	72	178	java/nio/BufferOverflowException
    //   63	72	230	finally
    //   75	82	246	finally
    //   85	96	246	finally
    //   104	113	246	finally
    //   120	132	246	finally
    //   135	139	246	finally
    //   159	164	246	finally
    //   185	216	246	finally
    //   219	223	246	finally
    //   75	82	250	java/nio/BufferOverflowException
    //   85	96	250	java/nio/BufferOverflowException
    //   104	113	250	java/nio/BufferOverflowException
    //   159	164	250	java/nio/BufferOverflowException
    //   63	72	255	java/io/IOException
  }

  static void E(File paramFile)
  {
    AppMethodBeat.i(105370);
    if ((paramFile == null) || (!paramFile.isDirectory()))
      AppMethodBeat.o(105370);
    while (true)
    {
      return;
      if (paramFile.exists())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null)
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            File localFile = arrayOfFile[j];
            if (localFile.isDirectory())
              E(localFile);
            localFile.delete();
          }
        }
        paramFile.delete();
      }
      AppMethodBeat.o(105370);
    }
  }

  public static boolean F(File paramFile)
  {
    boolean bool = false;
    AppMethodBeat.i(105371);
    if (paramFile == null)
    {
      paramFile = new NullPointerException("file should not be NULL");
      AppMethodBeat.o(105371);
      throw paramFile;
    }
    if (!paramFile.exists())
      AppMethodBeat.o(105371);
    while (true)
    {
      return bool;
      try
      {
        k localk = new com/tencent/mm/plugin/appbrand/appstorage/k;
        localk.<init>();
        if (FileStat.stat(paramFile.getAbsolutePath(), localk) == 0)
        {
          ab.i("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "constainsSymLink, path %s, stat.st_mode %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(localk.st_mode) });
          if ((localk.st_mode & 0xF000) == 40960)
          {
            AppMethodBeat.o(105371);
            bool = true;
            continue;
          }
          AppMethodBeat.o(105371);
        }
      }
      catch (Exception paramFile)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", paramFile, "", new Object[0]);
        AppMethodBeat.o(105371);
      }
    }
  }

  // ERROR //
  public static int a(java.util.zip.ZipInputStream paramZipInputStream, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 166
    //   4: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: sipush 16384
    //   10: newarray byte
    //   12: astore_3
    //   13: aload_0
    //   14: invokevirtual 172	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   17: astore 4
    //   19: aload 4
    //   21: ifnull +337 -> 358
    //   24: aload 4
    //   26: invokevirtual 177	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   29: astore 5
    //   31: aload 5
    //   33: ldc 179
    //   35: invokevirtual 185	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   38: ifne -25 -> 13
    //   41: aload 5
    //   43: ldc 187
    //   45: invokevirtual 185	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   48: ifne -35 -> 13
    //   51: aload 4
    //   53: invokevirtual 188	java/util/zip/ZipEntry:isDirectory	()Z
    //   56: ifeq +93 -> 149
    //   59: aload 5
    //   61: iconst_0
    //   62: aload 5
    //   64: invokevirtual 190	java/lang/String:length	()I
    //   67: iconst_1
    //   68: isub
    //   69: invokevirtual 194	java/lang/String:substring	(II)Ljava/lang/String;
    //   72: astore 4
    //   74: new 15	java/io/File
    //   77: astore 5
    //   79: new 196	java/lang/StringBuilder
    //   82: astore 6
    //   84: aload 6
    //   86: invokespecial 197	java/lang/StringBuilder:<init>	()V
    //   89: aload 5
    //   91: aload 6
    //   93: aload_1
    //   94: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: getstatic 205	java/io/File:separator	Ljava/lang/String;
    //   100: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload 4
    //   105: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokespecial 209	java/io/File:<init>	(Ljava/lang/String;)V
    //   114: aload 5
    //   116: invokevirtual 212	java/io/File:mkdirs	()Z
    //   119: pop
    //   120: goto -107 -> 13
    //   123: astore_1
    //   124: ldc 65
    //   126: aload_1
    //   127: ldc 214
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_0
    //   137: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   140: ldc 166
    //   142: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: iconst_m1
    //   146: istore_2
    //   147: iload_2
    //   148: ireturn
    //   149: new 15	java/io/File
    //   152: astore 4
    //   154: new 196	java/lang/StringBuilder
    //   157: astore 6
    //   159: aload 6
    //   161: invokespecial 197	java/lang/StringBuilder:<init>	()V
    //   164: aload 4
    //   166: aload 6
    //   168: aload_1
    //   169: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: getstatic 205	java/io/File:separator	Ljava/lang/String;
    //   175: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: aload 5
    //   180: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokespecial 209	java/io/File:<init>	(Ljava/lang/String;)V
    //   189: aload 4
    //   191: invokevirtual 218	java/io/File:getParentFile	()Ljava/io/File;
    //   194: invokevirtual 212	java/io/File:mkdirs	()Z
    //   197: pop
    //   198: aload 4
    //   200: invokevirtual 221	java/io/File:createNewFile	()Z
    //   203: pop
    //   204: new 223	java/io/FileOutputStream
    //   207: astore 5
    //   209: aload 5
    //   211: aload 4
    //   213: invokespecial 224	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   216: aload 5
    //   218: astore 4
    //   220: aload_0
    //   221: aload_3
    //   222: invokevirtual 227	java/util/zip/ZipInputStream:read	([B)I
    //   225: istore 7
    //   227: iload 7
    //   229: iconst_m1
    //   230: if_icmpeq +92 -> 322
    //   233: aload 5
    //   235: astore 4
    //   237: aload 5
    //   239: aload_3
    //   240: iconst_0
    //   241: iload 7
    //   243: invokevirtual 231	java/io/FileOutputStream:write	([BII)V
    //   246: aload 5
    //   248: astore 4
    //   250: aload 5
    //   252: invokevirtual 234	java/io/FileOutputStream:flush	()V
    //   255: goto -39 -> 216
    //   258: astore 4
    //   260: aload 5
    //   262: astore_1
    //   263: aload 4
    //   265: astore 5
    //   267: aload_1
    //   268: astore 4
    //   270: ldc 166
    //   272: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: aload_1
    //   276: astore 4
    //   278: aload 5
    //   280: athrow
    //   281: astore_1
    //   282: aload 4
    //   284: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   287: ldc 166
    //   289: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_1
    //   293: athrow
    //   294: astore_1
    //   295: ldc 65
    //   297: aload_1
    //   298: ldc 214
    //   300: iconst_0
    //   301: anewarray 4	java/lang/Object
    //   304: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   307: aload_0
    //   308: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   311: bipush 254
    //   313: istore_2
    //   314: ldc 166
    //   316: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   319: goto -172 -> 147
    //   322: aload 5
    //   324: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   327: goto -314 -> 13
    //   330: astore_1
    //   331: ldc 65
    //   333: aload_1
    //   334: ldc 214
    //   336: iconst_0
    //   337: anewarray 4	java/lang/Object
    //   340: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: aload_0
    //   344: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   347: bipush 253
    //   349: istore_2
    //   350: ldc 166
    //   352: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: goto -208 -> 147
    //   358: aload_0
    //   359: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   362: ldc 166
    //   364: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   367: goto -220 -> 147
    //   370: astore_1
    //   371: aload_0
    //   372: invokestatic 85	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   375: ldc 166
    //   377: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   380: aload_1
    //   381: athrow
    //   382: astore_1
    //   383: aconst_null
    //   384: astore 4
    //   386: goto -104 -> 282
    //   389: astore 5
    //   391: aconst_null
    //   392: astore_1
    //   393: goto -126 -> 267
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	123	java/io/FileNotFoundException
    //   13	19	123	java/io/FileNotFoundException
    //   24	120	123	java/io/FileNotFoundException
    //   149	204	123	java/io/FileNotFoundException
    //   282	294	123	java/io/FileNotFoundException
    //   322	327	123	java/io/FileNotFoundException
    //   220	227	258	java/lang/Exception
    //   237	246	258	java/lang/Exception
    //   250	255	258	java/lang/Exception
    //   220	227	281	finally
    //   237	246	281	finally
    //   250	255	281	finally
    //   270	275	281	finally
    //   278	281	281	finally
    //   7	13	294	java/io/IOException
    //   13	19	294	java/io/IOException
    //   24	120	294	java/io/IOException
    //   149	204	294	java/io/IOException
    //   282	294	294	java/io/IOException
    //   322	327	294	java/io/IOException
    //   7	13	330	java/lang/OutOfMemoryError
    //   13	19	330	java/lang/OutOfMemoryError
    //   24	120	330	java/lang/OutOfMemoryError
    //   149	204	330	java/lang/OutOfMemoryError
    //   282	294	330	java/lang/OutOfMemoryError
    //   322	327	330	java/lang/OutOfMemoryError
    //   7	13	370	finally
    //   13	19	370	finally
    //   24	120	370	finally
    //   124	136	370	finally
    //   149	204	370	finally
    //   282	294	370	finally
    //   295	307	370	finally
    //   322	327	370	finally
    //   331	343	370	finally
    //   204	216	382	finally
    //   204	216	389	java/lang/Exception
  }

  static void a(File paramFile, FileFilter paramFileFilter)
  {
    AppMethodBeat.i(105369);
    paramFile = paramFile.listFiles(paramFileFilter);
    if (paramFile != null)
    {
      int i = paramFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile = paramFile[j];
        if (localFile.isDirectory())
          a(localFile, paramFileFilter);
      }
    }
    AppMethodBeat.o(105369);
  }

  public static String yj(String paramString)
  {
    AppMethodBeat.i(105372);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(105372);
    while (true)
    {
      return paramString;
      for (int i = 0; (i < paramString.length()) && ('/' == paramString.charAt(i)); i++);
      paramString = paramString.substring(i);
      AppMethodBeat.o(105372);
    }
  }

  public static String yk(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(105373);
    ab.d("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "eliminateDuplicateSlashForPkgFile, original file name = [%s]", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(105373);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.trim();
      if (!paramString.startsWith("/"))
      {
        paramString = "/".concat(String.valueOf(paramString));
        AppMethodBeat.o(105373);
      }
      else
      {
        while ((i < paramString.length()) && ('/' == paramString.charAt(i)))
          i++;
        paramString = "/" + paramString.substring(i);
        AppMethodBeat.o(105373);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.l
 * JD-Core Version:    0.6.2
 */