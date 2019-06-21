package com.tencent.tinker.lib.c;

public class b
{
  public static int RZ(int paramInt)
  {
    if (paramInt == 3)
      paramInt = -3;
    while (true)
    {
      return paramInt;
      if (paramInt == 5)
        paramInt = -4;
      else if (paramInt == 6)
        paramInt = -8;
      else
        paramInt = 0;
    }
  }

  // ERROR //
  public static boolean a(java.util.zip.ZipFile paramZipFile, java.util.zip.ZipEntry paramZipEntry, java.io.File paramFile, java.lang.String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 6
    //   6: iload 6
    //   8: iconst_2
    //   9: if_icmpge +239 -> 248
    //   12: iload 5
    //   14: ifne +234 -> 248
    //   17: ldc 11
    //   19: new 13	java/lang/StringBuilder
    //   22: dup
    //   23: ldc 15
    //   25: invokespecial 19	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_2
    //   29: invokevirtual 25	java/io/File:getPath	()Ljava/lang/String;
    //   32: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: iconst_0
    //   39: anewarray 4	java/lang/Object
    //   42: invokestatic 38	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: new 40	java/io/BufferedInputStream
    //   48: astore 7
    //   50: aload 7
    //   52: aload_0
    //   53: aload_1
    //   54: invokevirtual 46	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   57: invokespecial 49	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   60: new 51	java/io/BufferedOutputStream
    //   63: astore 8
    //   65: new 53	java/io/FileOutputStream
    //   68: astore 9
    //   70: aload 9
    //   72: aload_2
    //   73: invokespecial 56	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   76: aload 8
    //   78: aload 9
    //   80: invokespecial 59	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   83: sipush 16384
    //   86: newarray byte
    //   88: astore 9
    //   90: aload 7
    //   92: aload 9
    //   94: invokevirtual 65	java/io/InputStream:read	([B)I
    //   97: istore 10
    //   99: iload 10
    //   101: ifle +33 -> 134
    //   104: aload 8
    //   106: aload 9
    //   108: iconst_0
    //   109: iload 10
    //   111: invokevirtual 71	java/io/OutputStream:write	([BII)V
    //   114: goto -24 -> 90
    //   117: astore_0
    //   118: aload 8
    //   120: astore_1
    //   121: aload 7
    //   123: astore_2
    //   124: aload_1
    //   125: invokestatic 77	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   128: aload_2
    //   129: invokestatic 77	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   132: aload_0
    //   133: athrow
    //   134: aload 8
    //   136: invokestatic 77	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   139: aload 7
    //   141: invokestatic 77	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   144: aload_3
    //   145: ifnull +97 -> 242
    //   148: iload 4
    //   150: ifeq +82 -> 232
    //   153: aload_2
    //   154: aload_3
    //   155: invokestatic 83	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   158: istore 5
    //   160: ldc 11
    //   162: ldc 85
    //   164: iconst_1
    //   165: anewarray 4	java/lang/Object
    //   168: dup
    //   169: iconst_0
    //   170: iload 5
    //   172: invokestatic 91	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   175: aastore
    //   176: invokestatic 38	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: iload 5
    //   181: ifne +45 -> 226
    //   184: aload_2
    //   185: invokevirtual 95	java/io/File:delete	()Z
    //   188: ifeq +10 -> 198
    //   191: aload_2
    //   192: invokevirtual 98	java/io/File:exists	()Z
    //   195: ifeq +31 -> 226
    //   198: ldc 11
    //   200: new 13	java/lang/StringBuilder
    //   203: dup
    //   204: ldc 100
    //   206: invokespecial 19	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: aload_2
    //   210: invokevirtual 25	java/io/File:getPath	()Ljava/lang/String;
    //   213: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: iconst_0
    //   220: anewarray 4	java/lang/Object
    //   223: invokestatic 103	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: iinc 6 1
    //   229: goto -223 -> 6
    //   232: aload_2
    //   233: aload_3
    //   234: invokestatic 106	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:g	(Ljava/io/File;Ljava/lang/String;)Z
    //   237: istore 5
    //   239: goto -79 -> 160
    //   242: iconst_1
    //   243: istore 5
    //   245: goto -85 -> 160
    //   248: iload 5
    //   250: ireturn
    //   251: astore_0
    //   252: aconst_null
    //   253: astore_1
    //   254: aconst_null
    //   255: astore_2
    //   256: goto -132 -> 124
    //   259: astore_0
    //   260: aconst_null
    //   261: astore_1
    //   262: aload 7
    //   264: astore_2
    //   265: goto -141 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   83	90	117	finally
    //   90	99	117	finally
    //   104	114	117	finally
    //   45	60	251	finally
    //   60	83	259	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.b
 * JD-Core Version:    0.6.2
 */