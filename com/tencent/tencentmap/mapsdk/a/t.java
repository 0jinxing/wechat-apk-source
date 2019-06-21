package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class t
{
  private static String a;
  private static String b;

  public static final InputStream a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(98272);
    paramContext = a(paramContext, "tencentmap/mapsdk_vector/", paramString);
    AppMethodBeat.o(98272);
    return paramContext;
  }

  public static final InputStream a(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(98273);
    paramContext = b(paramContext, paramString1 + paramString2);
    AppMethodBeat.o(98273);
    return paramContext;
  }

  public static String a()
  {
    return a;
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(98271);
    if (!new File(paramString1, paramString2).exists())
      b(paramContext, paramString1, paramString2, paramString3);
    AppMethodBeat.o(98271);
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(98276);
    if ((paramString != null) && (paramString.trim().length() != 0))
    {
      String str = paramString;
      if (!paramString.endsWith(File.separator))
        str = paramString + File.separator;
      a = str;
    }
    AppMethodBeat.o(98276);
  }

  public static final InputStream b(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(98274);
    if (paramContext == null)
    {
      AppMethodBeat.o(98274);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getAssets();
      if (paramContext == null)
      {
        AppMethodBeat.o(98274);
        paramContext = localObject;
      }
      else
      {
        try
        {
          paramContext = paramContext.open(paramString);
          AppMethodBeat.o(98274);
        }
        catch (IOException paramContext)
        {
          AppMethodBeat.o(98274);
          paramContext = localObject;
        }
      }
    }
  }

  public static String b()
  {
    return b;
  }

  // ERROR //
  private static void b(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 92
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 27	java/lang/StringBuilder
    //   8: astore 4
    //   10: aload 4
    //   12: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   15: aload 4
    //   17: aload_0
    //   18: invokestatic 97	com/tencent/tencentmap/mapsdk/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/a/r;
    //   21: aconst_null
    //   22: invokevirtual 101	com/tencent/tencentmap/mapsdk/a/r:c	(Ljava/lang/String;)Ljava/lang/String;
    //   25: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_3
    //   29: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokestatic 105	com/tencent/tencentmap/mapsdk/a/v:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   38: astore 5
    //   40: aload 5
    //   42: astore 4
    //   44: aload 5
    //   46: ifnonnull +72 -> 118
    //   49: aload 5
    //   51: astore 6
    //   53: aload 5
    //   55: astore 7
    //   57: getstatic 43	com/tencent/tencentmap/mapsdk/a/t:a	Ljava/lang/String;
    //   60: ifnull +222 -> 282
    //   63: aload 5
    //   65: astore 6
    //   67: aload 5
    //   69: astore 7
    //   71: new 27	java/lang/StringBuilder
    //   74: astore 4
    //   76: aload 5
    //   78: astore 6
    //   80: aload 5
    //   82: astore 7
    //   84: aload 4
    //   86: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   89: aload 5
    //   91: astore 6
    //   93: aload 5
    //   95: astore 7
    //   97: aload_0
    //   98: aload 4
    //   100: getstatic 43	com/tencent/tencentmap/mapsdk/a/t:a	Ljava/lang/String;
    //   103: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: aload_3
    //   107: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 41	com/tencent/tencentmap/mapsdk/a/t:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   116: astore 4
    //   118: aload 4
    //   120: astore 7
    //   122: aload 4
    //   124: ifnonnull +65 -> 189
    //   127: aload 4
    //   129: astore 6
    //   131: aload 4
    //   133: astore 7
    //   135: new 27	java/lang/StringBuilder
    //   138: astore 5
    //   140: aload 4
    //   142: astore 6
    //   144: aload 4
    //   146: astore 7
    //   148: aload 5
    //   150: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   153: aload 4
    //   155: astore 6
    //   157: aload 4
    //   159: astore 7
    //   161: aload 5
    //   163: aload_0
    //   164: invokestatic 97	com/tencent/tencentmap/mapsdk/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/a/r;
    //   167: invokevirtual 108	com/tencent/tencentmap/mapsdk/a/r:e	()Ljava/lang/String;
    //   170: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload_3
    //   174: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   180: invokestatic 105	com/tencent/tencentmap/mapsdk/a/v:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   183: astore 4
    //   185: aload 4
    //   187: astore 7
    //   189: aload 7
    //   191: astore 4
    //   193: aload 7
    //   195: ifnonnull +14 -> 209
    //   198: aload 7
    //   200: astore 6
    //   202: aload_0
    //   203: aload_3
    //   204: invokestatic 110	com/tencent/tencentmap/mapsdk/a/t:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   207: astore 4
    //   209: aload 4
    //   211: astore 6
    //   213: aload 4
    //   215: astore 7
    //   217: new 47	java/io/File
    //   220: astore_3
    //   221: aload 4
    //   223: astore 6
    //   225: aload 4
    //   227: astore 7
    //   229: aload_3
    //   230: aload_1
    //   231: aload_2
    //   232: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: aload 4
    //   237: astore 6
    //   239: aload 4
    //   241: astore 7
    //   243: new 112	java/io/FileOutputStream
    //   246: astore_0
    //   247: aload 4
    //   249: astore 6
    //   251: aload 4
    //   253: astore 7
    //   255: aload_0
    //   256: aload_3
    //   257: invokespecial 115	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   260: aload 4
    //   262: aload_0
    //   263: invokestatic 118	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   266: pop2
    //   267: aload_0
    //   268: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   271: aload 4
    //   273: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   276: ldc 92
    //   278: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: return
    //   282: aload 5
    //   284: astore 4
    //   286: aload 5
    //   288: astore 6
    //   290: aload 5
    //   292: astore 7
    //   294: getstatic 91	com/tencent/tencentmap/mapsdk/a/t:b	Ljava/lang/String;
    //   297: ifnull -179 -> 118
    //   300: aload 5
    //   302: astore 6
    //   304: aload 5
    //   306: astore 7
    //   308: new 27	java/lang/StringBuilder
    //   311: astore 4
    //   313: aload 5
    //   315: astore 6
    //   317: aload 5
    //   319: astore 7
    //   321: aload 4
    //   323: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   326: aload 5
    //   328: astore 6
    //   330: aload 5
    //   332: astore 7
    //   334: aload 4
    //   336: getstatic 91	com/tencent/tencentmap/mapsdk/a/t:b	Ljava/lang/String;
    //   339: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: aload_3
    //   343: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: invokestatic 105	com/tencent/tencentmap/mapsdk/a/v:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   352: astore 4
    //   354: goto -236 -> 118
    //   357: astore_0
    //   358: aconst_null
    //   359: astore_0
    //   360: aconst_null
    //   361: astore 4
    //   363: aload_0
    //   364: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   367: aload 4
    //   369: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   372: ldc 92
    //   374: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: goto -96 -> 281
    //   380: astore_0
    //   381: aconst_null
    //   382: astore_1
    //   383: aconst_null
    //   384: astore 4
    //   386: aload_1
    //   387: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   390: aload 4
    //   392: invokestatic 121	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   395: ldc 92
    //   397: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: aload_0
    //   401: athrow
    //   402: astore_0
    //   403: aconst_null
    //   404: astore_1
    //   405: aload 6
    //   407: astore 4
    //   409: goto -23 -> 386
    //   412: astore_2
    //   413: aload_0
    //   414: astore_1
    //   415: aload_2
    //   416: astore_0
    //   417: goto -31 -> 386
    //   420: astore_0
    //   421: aconst_null
    //   422: astore_0
    //   423: aload 7
    //   425: astore 4
    //   427: goto -64 -> 363
    //   430: astore_1
    //   431: goto -68 -> 363
    //
    // Exception table:
    //   from	to	target	type
    //   5	40	357	java/io/IOException
    //   5	40	380	finally
    //   57	63	402	finally
    //   71	76	402	finally
    //   84	89	402	finally
    //   97	118	402	finally
    //   135	140	402	finally
    //   148	153	402	finally
    //   161	185	402	finally
    //   202	209	402	finally
    //   217	221	402	finally
    //   229	235	402	finally
    //   243	247	402	finally
    //   255	260	402	finally
    //   294	300	402	finally
    //   308	313	402	finally
    //   321	326	402	finally
    //   334	354	402	finally
    //   260	267	412	finally
    //   57	63	420	java/io/IOException
    //   71	76	420	java/io/IOException
    //   84	89	420	java/io/IOException
    //   97	118	420	java/io/IOException
    //   135	140	420	java/io/IOException
    //   148	153	420	java/io/IOException
    //   161	185	420	java/io/IOException
    //   202	209	420	java/io/IOException
    //   217	221	420	java/io/IOException
    //   229	235	420	java/io/IOException
    //   243	247	420	java/io/IOException
    //   255	260	420	java/io/IOException
    //   294	300	420	java/io/IOException
    //   308	313	420	java/io/IOException
    //   321	326	420	java/io/IOException
    //   334	354	420	java/io/IOException
    //   260	267	430	java/io/IOException
  }

  public static void b(String paramString)
  {
    AppMethodBeat.i(98277);
    if ((paramString != null) && (paramString.trim().length() != 0))
    {
      String str = paramString;
      if (!paramString.endsWith(File.separator))
        str = paramString + File.separator;
      b = str;
    }
    AppMethodBeat.o(98277);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.t
 * JD-Core Version:    0.6.2
 */