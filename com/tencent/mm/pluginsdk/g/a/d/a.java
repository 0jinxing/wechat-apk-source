package com.tencent.mm.pluginsdk.g.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public final class a
{
  // ERROR //
  public static boolean D(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 11
    //   4: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 23	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   11: ifeq +10 -> 21
    //   14: ldc 11
    //   16: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iload_2
    //   20: ireturn
    //   21: new 28	java/io/File
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 32	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: astore_3
    //   30: aload_3
    //   31: invokevirtual 36	java/io/File:delete	()Z
    //   34: pop
    //   35: aload_3
    //   36: invokevirtual 40	java/io/File:getParentFile	()Ljava/io/File;
    //   39: invokevirtual 43	java/io/File:mkdirs	()Z
    //   42: pop
    //   43: aconst_null
    //   44: astore 4
    //   46: aconst_null
    //   47: astore 5
    //   49: aload 4
    //   51: astore 6
    //   53: new 45	java/io/FileOutputStream
    //   56: astore_0
    //   57: aload 4
    //   59: astore 6
    //   61: aload_0
    //   62: aload_3
    //   63: invokespecial 48	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   66: aload_0
    //   67: astore 6
    //   69: aload_0
    //   70: aload_1
    //   71: invokevirtual 52	java/io/FileOutputStream:write	([B)V
    //   74: aload_0
    //   75: invokevirtual 56	java/io/FileOutputStream:flush	()V
    //   78: aload_0
    //   79: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   82: iconst_1
    //   83: istore_2
    //   84: ldc 11
    //   86: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: goto -70 -> 19
    //   92: astore_0
    //   93: ldc 61
    //   95: aload_0
    //   96: ldc 63
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: goto -23 -> 82
    //   108: astore_1
    //   109: aconst_null
    //   110: astore_0
    //   111: aload_0
    //   112: astore 6
    //   114: ldc 61
    //   116: aload_1
    //   117: ldc 63
    //   119: iconst_0
    //   120: anewarray 4	java/lang/Object
    //   123: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: aload_0
    //   127: ifnull +11 -> 138
    //   130: aload_0
    //   131: invokevirtual 56	java/io/FileOutputStream:flush	()V
    //   134: aload_0
    //   135: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   138: ldc 11
    //   140: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -124 -> 19
    //   146: astore_0
    //   147: ldc 61
    //   149: aload_0
    //   150: ldc 63
    //   152: iconst_0
    //   153: anewarray 4	java/lang/Object
    //   156: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: goto -21 -> 138
    //   162: astore_1
    //   163: aload 5
    //   165: astore_0
    //   166: aload_0
    //   167: astore 6
    //   169: ldc 61
    //   171: aload_1
    //   172: ldc 63
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: ifnull -44 -> 138
    //   185: aload_0
    //   186: invokevirtual 56	java/io/FileOutputStream:flush	()V
    //   189: aload_0
    //   190: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   193: goto -55 -> 138
    //   196: astore_0
    //   197: ldc 61
    //   199: aload_0
    //   200: ldc 63
    //   202: iconst_0
    //   203: anewarray 4	java/lang/Object
    //   206: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: goto -71 -> 138
    //   212: astore_0
    //   213: aload 6
    //   215: ifnull +13 -> 228
    //   218: aload 6
    //   220: invokevirtual 56	java/io/FileOutputStream:flush	()V
    //   223: aload 6
    //   225: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   228: ldc 11
    //   230: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: aload_0
    //   234: athrow
    //   235: astore_1
    //   236: ldc 61
    //   238: aload_1
    //   239: ldc 63
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: goto -20 -> 228
    //   251: astore_0
    //   252: goto -39 -> 213
    //   255: astore_1
    //   256: goto -90 -> 166
    //   259: astore_1
    //   260: goto -149 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   74	82	92	java/io/IOException
    //   53	57	108	java/io/FileNotFoundException
    //   61	66	108	java/io/FileNotFoundException
    //   130	138	146	java/io/IOException
    //   53	57	162	java/io/IOException
    //   61	66	162	java/io/IOException
    //   185	193	196	java/io/IOException
    //   53	57	212	finally
    //   61	66	212	finally
    //   169	181	212	finally
    //   218	228	235	java/io/IOException
    //   69	74	251	finally
    //   114	126	251	finally
    //   69	74	255	java/io/IOException
    //   69	74	259	java/io/FileNotFoundException
  }

  // ERROR //
  public static byte[] aji(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 73
    //   4: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 75	java/io/FileInputStream
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 76	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   16: new 78	java/io/ByteArrayOutputStream
    //   19: astore_3
    //   20: aload_3
    //   21: invokespecial 80	java/io/ByteArrayOutputStream:<init>	()V
    //   24: aload_3
    //   25: astore 4
    //   27: aload_2
    //   28: astore_0
    //   29: sipush 4096
    //   32: newarray byte
    //   34: astore 5
    //   36: aload_3
    //   37: astore 4
    //   39: aload_2
    //   40: astore_0
    //   41: aload_2
    //   42: aload 5
    //   44: invokevirtual 84	java/io/FileInputStream:read	([B)I
    //   47: istore 6
    //   49: iload 6
    //   51: iconst_m1
    //   52: if_icmpeq +57 -> 109
    //   55: aload_3
    //   56: astore 4
    //   58: aload_2
    //   59: astore_0
    //   60: aload_3
    //   61: aload 5
    //   63: iconst_0
    //   64: iload 6
    //   66: invokevirtual 87	java/io/ByteArrayOutputStream:write	([BII)V
    //   69: goto -33 -> 36
    //   72: astore 5
    //   74: aload_3
    //   75: astore 4
    //   77: aload_2
    //   78: astore_0
    //   79: ldc 61
    //   81: aload 5
    //   83: ldc 63
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_2
    //   93: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   96: aload_3
    //   97: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   100: ldc 73
    //   102: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: aload_1
    //   106: astore_0
    //   107: aload_0
    //   108: areturn
    //   109: aload_3
    //   110: astore 4
    //   112: aload_2
    //   113: astore_0
    //   114: aload_3
    //   115: invokevirtual 92	java/io/ByteArrayOutputStream:flush	()V
    //   118: aload_3
    //   119: astore 4
    //   121: aload_2
    //   122: astore_0
    //   123: aload_3
    //   124: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   127: astore 5
    //   129: aload 5
    //   131: astore_0
    //   132: aload_2
    //   133: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   136: aload_3
    //   137: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   140: ldc 73
    //   142: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -38 -> 107
    //   148: astore 5
    //   150: aconst_null
    //   151: astore_3
    //   152: aconst_null
    //   153: astore_2
    //   154: aload_3
    //   155: astore 4
    //   157: aload_2
    //   158: astore_0
    //   159: ldc 61
    //   161: aload 5
    //   163: ldc 63
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_2
    //   173: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   176: aload_3
    //   177: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   180: goto -80 -> 100
    //   183: astore_3
    //   184: aconst_null
    //   185: astore 4
    //   187: aconst_null
    //   188: astore_0
    //   189: aload_0
    //   190: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   193: aload 4
    //   195: invokestatic 91	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   198: ldc 73
    //   200: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: aload_3
    //   204: athrow
    //   205: astore_3
    //   206: aconst_null
    //   207: astore 4
    //   209: aload_2
    //   210: astore_0
    //   211: goto -22 -> 189
    //   214: astore_3
    //   215: goto -26 -> 189
    //   218: astore 5
    //   220: aconst_null
    //   221: astore_3
    //   222: goto -68 -> 154
    //   225: astore 5
    //   227: goto -73 -> 154
    //   230: astore 5
    //   232: aconst_null
    //   233: astore_3
    //   234: aconst_null
    //   235: astore_2
    //   236: goto -162 -> 74
    //   239: astore 5
    //   241: aconst_null
    //   242: astore_3
    //   243: goto -169 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   29	36	72	java/io/FileNotFoundException
    //   41	49	72	java/io/FileNotFoundException
    //   60	69	72	java/io/FileNotFoundException
    //   114	118	72	java/io/FileNotFoundException
    //   123	129	72	java/io/FileNotFoundException
    //   7	16	148	java/io/IOException
    //   7	16	183	finally
    //   16	24	205	finally
    //   29	36	214	finally
    //   41	49	214	finally
    //   60	69	214	finally
    //   79	92	214	finally
    //   114	118	214	finally
    //   123	129	214	finally
    //   159	172	214	finally
    //   16	24	218	java/io/IOException
    //   29	36	225	java/io/IOException
    //   41	49	225	java/io/IOException
    //   60	69	225	java/io/IOException
    //   114	118	225	java/io/IOException
    //   123	129	225	java/io/IOException
    //   7	16	230	java/io/FileNotFoundException
    //   16	24	239	java/io/FileNotFoundException
  }

  public static boolean ajj(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79645);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(79645);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if ((!paramString.exists()) || (paramString.delete()))
      {
        bool = true;
        AppMethodBeat.o(79645);
      }
      else
      {
        AppMethodBeat.o(79645);
      }
    }
  }

  public static boolean ct(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79646);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(79646);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isFile()))
      {
        bool = true;
        AppMethodBeat.o(79646);
      }
      else
      {
        AppMethodBeat.o(79646);
      }
    }
  }

  public static void e(Closeable paramCloseable)
  {
    AppMethodBeat.i(79644);
    if (paramCloseable == null)
      AppMethodBeat.o(79644);
    while (true)
    {
      return;
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(79644);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", localIOException, "", new Object[0]);
        ab.e("MicroMsg.ResDownloaderFileUtils", String.format("%s close failed (%s)", new Object[] { paramCloseable.getClass().getSimpleName(), localIOException.getMessage() }));
        AppMethodBeat.o(79644);
      }
    }
  }

  public static long ek(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(79641);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(79641);
    while (true)
    {
      return l;
      paramString = new File(paramString);
      if (paramString.isFile())
      {
        l = paramString.length();
        AppMethodBeat.o(79641);
      }
      else
      {
        AppMethodBeat.o(79641);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.d.a
 * JD-Core Version:    0.6.2
 */