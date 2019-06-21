package com.tencent.mm.plugin.webview.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public final class d
{
  public static int upM = 30000;
  public static int upN = 30000;

  // ERROR //
  public static d.a a(String paramString1, java.util.Map<String, String> paramMap, String paramString2)
  {
    // Byte code:
    //   0: sipush 7042
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 32	java/net/URL
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokespecial 36	java/net/URL:<init>	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: invokevirtual 40	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 42	java/net/HttpURLConnection
    //   22: astore_3
    //   23: aload_3
    //   24: getstatic 13	com/tencent/mm/plugin/webview/preload/d:upM	I
    //   27: invokevirtual 45	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   30: aload_3
    //   31: getstatic 15	com/tencent/mm/plugin/webview/preload/d:upN	I
    //   34: invokevirtual 48	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   37: aload_3
    //   38: ldc 50
    //   40: invokevirtual 53	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   43: aload_3
    //   44: iconst_1
    //   45: invokevirtual 57	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   48: aload_3
    //   49: iconst_1
    //   50: invokevirtual 60	java/net/HttpURLConnection:setDoInput	(Z)V
    //   53: aload_3
    //   54: iconst_0
    //   55: invokevirtual 63	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   58: aload_1
    //   59: ifnull +90 -> 149
    //   62: aload_1
    //   63: invokeinterface 69 1 0
    //   68: ifle +81 -> 149
    //   71: aload_1
    //   72: invokeinterface 73 1 0
    //   77: invokeinterface 79 1 0
    //   82: astore_0
    //   83: aload_0
    //   84: invokeinterface 85 1 0
    //   89: ifeq +60 -> 149
    //   92: aload_0
    //   93: invokeinterface 89 1 0
    //   98: checkcast 91	java/lang/String
    //   101: astore 4
    //   103: aload_3
    //   104: aload 4
    //   106: aload_1
    //   107: aload 4
    //   109: invokeinterface 95 2 0
    //   114: checkcast 91	java/lang/String
    //   117: invokevirtual 99	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: goto -37 -> 83
    //   123: astore_0
    //   124: ldc 101
    //   126: ldc 103
    //   128: iconst_1
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_0
    //   135: aastore
    //   136: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: sipush 7042
    //   142: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: aconst_null
    //   146: astore_0
    //   147: aload_0
    //   148: areturn
    //   149: aload_2
    //   150: invokevirtual 116	java/lang/String:getBytes	()[B
    //   153: astore_1
    //   154: aload_3
    //   155: invokevirtual 119	java/net/HttpURLConnection:connect	()V
    //   158: new 121	java/io/DataOutputStream
    //   161: astore_0
    //   162: aload_0
    //   163: aload_3
    //   164: invokevirtual 125	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   167: invokespecial 128	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   170: aload_0
    //   171: aload_1
    //   172: invokevirtual 132	java/io/DataOutputStream:write	([B)V
    //   175: aload_0
    //   176: invokevirtual 135	java/io/DataOutputStream:flush	()V
    //   179: new 6	com/tencent/mm/plugin/webview/preload/d$a
    //   182: astore_1
    //   183: aload_1
    //   184: invokespecial 137	com/tencent/mm/plugin/webview/preload/d$a:<init>	()V
    //   187: aload_1
    //   188: aload_3
    //   189: invokevirtual 140	java/net/HttpURLConnection:getResponseCode	()I
    //   192: putfield 143	com/tencent/mm/plugin/webview/preload/d$a:statusCode	I
    //   195: aload_1
    //   196: getfield 143	com/tencent/mm/plugin/webview/preload/d$a:statusCode	I
    //   199: sipush 200
    //   202: if_icmpne +31 -> 233
    //   205: aload_3
    //   206: invokevirtual 147	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   209: astore_0
    //   210: aload_3
    //   211: invokevirtual 151	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   214: astore_2
    //   215: aload_2
    //   216: aload_0
    //   217: invokestatic 155	com/tencent/mm/plugin/webview/preload/d:f	(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   220: astore_0
    //   221: aload_1
    //   222: aload_0
    //   223: invokestatic 159	com/tencent/mm/plugin/webview/preload/d:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   226: putfield 163	com/tencent/mm/plugin/webview/preload/d$a:data	Ljava/lang/String;
    //   229: aload_0
    //   230: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   233: iconst_0
    //   234: istore 5
    //   236: aload_3
    //   237: iload 5
    //   239: invokevirtual 171	java/net/HttpURLConnection:getHeaderFieldKey	(I)Ljava/lang/String;
    //   242: astore_2
    //   243: aload_3
    //   244: iload 5
    //   246: invokevirtual 174	java/net/HttpURLConnection:getHeaderField	(I)Ljava/lang/String;
    //   249: astore_0
    //   250: aload_2
    //   251: ifnonnull +7 -> 258
    //   254: aload_0
    //   255: ifnull +73 -> 328
    //   258: aload_1
    //   259: getfield 178	com/tencent/mm/plugin/webview/preload/d$a:ipC	Ljava/util/Map;
    //   262: aload_2
    //   263: aload_0
    //   264: invokeinterface 182 3 0
    //   269: pop
    //   270: iinc 5 1
    //   273: goto -37 -> 236
    //   276: astore_0
    //   277: aconst_null
    //   278: astore_0
    //   279: aload_0
    //   280: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   283: sipush 7042
    //   286: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aconst_null
    //   290: astore_0
    //   291: goto -144 -> 147
    //   294: astore_1
    //   295: aconst_null
    //   296: astore_0
    //   297: aload_0
    //   298: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   301: sipush 7042
    //   304: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: aload_1
    //   308: athrow
    //   309: astore_0
    //   310: ldc 101
    //   312: ldc 103
    //   314: iconst_1
    //   315: anewarray 4	java/lang/Object
    //   318: dup
    //   319: iconst_0
    //   320: aload_0
    //   321: aastore
    //   322: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: goto -186 -> 139
    //   328: sipush 7042
    //   331: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: aload_1
    //   335: astore_0
    //   336: goto -189 -> 147
    //   339: astore_0
    //   340: ldc 101
    //   342: ldc 103
    //   344: iconst_1
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload_0
    //   351: aastore
    //   352: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: goto -216 -> 139
    //   358: astore_1
    //   359: goto -62 -> 297
    //   362: astore_1
    //   363: goto -84 -> 279
    //
    // Exception table:
    //   from	to	target	type
    //   6	58	123	java/net/MalformedURLException
    //   62	83	123	java/net/MalformedURLException
    //   83	120	123	java/net/MalformedURLException
    //   149	215	123	java/net/MalformedURLException
    //   229	233	123	java/net/MalformedURLException
    //   236	250	123	java/net/MalformedURLException
    //   258	270	123	java/net/MalformedURLException
    //   279	283	123	java/net/MalformedURLException
    //   297	309	123	java/net/MalformedURLException
    //   215	221	276	java/io/IOException
    //   215	221	294	finally
    //   6	58	309	java/io/IOException
    //   62	83	309	java/io/IOException
    //   83	120	309	java/io/IOException
    //   149	215	309	java/io/IOException
    //   229	233	309	java/io/IOException
    //   236	250	309	java/io/IOException
    //   258	270	309	java/io/IOException
    //   279	283	309	java/io/IOException
    //   297	309	309	java/io/IOException
    //   6	58	339	java/lang/Exception
    //   62	83	339	java/lang/Exception
    //   83	120	339	java/lang/Exception
    //   149	215	339	java/lang/Exception
    //   229	233	339	java/lang/Exception
    //   236	250	339	java/lang/Exception
    //   258	270	339	java/lang/Exception
    //   279	283	339	java/lang/Exception
    //   297	309	339	java/lang/Exception
    //   221	229	358	finally
    //   221	229	362	java/io/IOException
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(7046);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(7046);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
      {
        ab.c("MicroMsg.RequestUtil", "", new Object[] { paramCloseable });
        AppMethodBeat.o(7046);
      }
    }
    catch (Exception paramCloseable)
    {
      while (true)
      {
        ab.c("MicroMsg.RequestUtil", "", new Object[] { paramCloseable });
        AppMethodBeat.o(7046);
      }
    }
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    Object localObject1 = null;
    AppMethodBeat.i(7045);
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream);
    paramInputStream = new BufferedReader(localInputStreamReader, 512);
    StringBuilder localStringBuilder1 = new StringBuilder();
    try
    {
      while (true)
      {
        String str = paramInputStream.readLine();
        if (str == null)
          break;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localStringBuilder1.append(str + "\n");
      }
    }
    catch (IOException localIOException)
    {
      ab.c("MicroMsg.RequestUtil", "", new Object[] { localIOException });
      closeQuietly(localInputStreamReader);
      closeQuietly(paramInputStream);
      AppMethodBeat.o(7045);
      paramInputStream = localObject1;
      while (true)
      {
        return paramInputStream;
        closeQuietly(localInputStreamReader);
        closeQuietly(paramInputStream);
        paramInputStream = localIOException.toString();
        AppMethodBeat.o(7045);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.c("MicroMsg.RequestUtil", "", new Object[] { localException });
        closeQuietly(localInputStreamReader);
        closeQuietly(paramInputStream);
        AppMethodBeat.o(7045);
        paramInputStream = localObject1;
      }
    }
    finally
    {
      closeQuietly(localInputStreamReader);
      closeQuietly(paramInputStream);
      AppMethodBeat.o(7045);
    }
  }

  private static InputStream f(String paramString, InputStream paramInputStream)
  {
    AppMethodBeat.i(7044);
    if ((paramString == null) || ("identity".equalsIgnoreCase(paramString)))
      AppMethodBeat.o(7044);
    while (true)
    {
      return paramInputStream;
      if ("gzip".equalsIgnoreCase(paramString))
      {
        paramInputStream = new GZIPInputStream(paramInputStream);
        AppMethodBeat.o(7044);
      }
      else
      {
        if (!"deflate".equalsIgnoreCase(paramString))
          break;
        paramInputStream = new InflaterInputStream(paramInputStream, new Inflater(false), 512);
        AppMethodBeat.o(7044);
      }
    }
    paramString = new RuntimeException("unsupported content-encoding: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(7044);
    throw paramString;
  }

  // ERROR //
  public static d.a w(String paramString, java.util.Map<String, String> paramMap)
  {
    // Byte code:
    //   0: sipush 7043
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 32	java/net/URL
    //   9: astore_2
    //   10: aload_2
    //   11: aload_0
    //   12: invokespecial 36	java/net/URL:<init>	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: invokevirtual 40	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 42	java/net/HttpURLConnection
    //   22: astore_2
    //   23: aload_2
    //   24: ifnonnull +13 -> 37
    //   27: sipush 7043
    //   30: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aconst_null
    //   34: astore_0
    //   35: aload_0
    //   36: areturn
    //   37: aload_2
    //   38: getstatic 13	com/tencent/mm/plugin/webview/preload/d:upM	I
    //   41: invokevirtual 45	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   44: aload_2
    //   45: getstatic 15	com/tencent/mm/plugin/webview/preload/d:upN	I
    //   48: invokevirtual 48	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   51: aload_2
    //   52: ldc 253
    //   54: invokevirtual 53	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 63	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   62: aload_1
    //   63: ifnull +88 -> 151
    //   66: aload_1
    //   67: invokeinterface 69 1 0
    //   72: ifle +79 -> 151
    //   75: aload_1
    //   76: invokeinterface 73 1 0
    //   81: invokeinterface 79 1 0
    //   86: astore_0
    //   87: aload_0
    //   88: invokeinterface 85 1 0
    //   93: ifeq +58 -> 151
    //   96: aload_0
    //   97: invokeinterface 89 1 0
    //   102: checkcast 91	java/lang/String
    //   105: astore_3
    //   106: aload_2
    //   107: aload_3
    //   108: aload_1
    //   109: aload_3
    //   110: invokeinterface 95 2 0
    //   115: checkcast 91	java/lang/String
    //   118: invokevirtual 99	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: goto -34 -> 87
    //   124: astore_0
    //   125: ldc 101
    //   127: ldc 103
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_0
    //   136: aastore
    //   137: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: sipush 7043
    //   143: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aconst_null
    //   147: astore_0
    //   148: goto -113 -> 35
    //   151: new 6	com/tencent/mm/plugin/webview/preload/d$a
    //   154: astore_1
    //   155: aload_1
    //   156: invokespecial 137	com/tencent/mm/plugin/webview/preload/d$a:<init>	()V
    //   159: aload_1
    //   160: aload_2
    //   161: invokevirtual 140	java/net/HttpURLConnection:getResponseCode	()I
    //   164: putfield 143	com/tencent/mm/plugin/webview/preload/d$a:statusCode	I
    //   167: aload_1
    //   168: getfield 143	com/tencent/mm/plugin/webview/preload/d$a:statusCode	I
    //   171: sipush 200
    //   174: if_icmpne +31 -> 205
    //   177: aload_2
    //   178: invokevirtual 147	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   181: astore_3
    //   182: aload_2
    //   183: invokevirtual 151	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   186: astore_0
    //   187: aload_0
    //   188: aload_3
    //   189: invokestatic 155	com/tencent/mm/plugin/webview/preload/d:f	(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   192: astore_0
    //   193: aload_1
    //   194: aload_0
    //   195: invokestatic 159	com/tencent/mm/plugin/webview/preload/d:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   198: putfield 163	com/tencent/mm/plugin/webview/preload/d$a:data	Ljava/lang/String;
    //   201: aload_0
    //   202: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   205: iconst_0
    //   206: istore 4
    //   208: aload_2
    //   209: iload 4
    //   211: invokevirtual 171	java/net/HttpURLConnection:getHeaderFieldKey	(I)Ljava/lang/String;
    //   214: astore_0
    //   215: aload_2
    //   216: iload 4
    //   218: invokevirtual 174	java/net/HttpURLConnection:getHeaderField	(I)Ljava/lang/String;
    //   221: astore_3
    //   222: aload_0
    //   223: ifnonnull +7 -> 230
    //   226: aload_3
    //   227: ifnull +75 -> 302
    //   230: aload_1
    //   231: getfield 178	com/tencent/mm/plugin/webview/preload/d$a:ipC	Ljava/util/Map;
    //   234: aload_0
    //   235: aload_3
    //   236: invokeinterface 182 3 0
    //   241: pop
    //   242: iinc 4 1
    //   245: goto -37 -> 208
    //   248: astore_0
    //   249: aconst_null
    //   250: astore_0
    //   251: aload_0
    //   252: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   255: sipush 7043
    //   258: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: aconst_null
    //   262: astore_0
    //   263: goto -228 -> 35
    //   266: astore_0
    //   267: aconst_null
    //   268: astore_2
    //   269: aload_0
    //   270: astore_1
    //   271: aload_2
    //   272: invokestatic 167	com/tencent/mm/plugin/webview/preload/d:closeQuietly	(Ljava/io/Closeable;)V
    //   275: sipush 7043
    //   278: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: aload_1
    //   282: athrow
    //   283: astore_0
    //   284: ldc 101
    //   286: ldc 103
    //   288: iconst_1
    //   289: anewarray 4	java/lang/Object
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: aastore
    //   296: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   299: goto -159 -> 140
    //   302: sipush 7043
    //   305: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   308: aload_1
    //   309: astore_0
    //   310: goto -275 -> 35
    //   313: astore_0
    //   314: ldc 101
    //   316: ldc 103
    //   318: iconst_1
    //   319: anewarray 4	java/lang/Object
    //   322: dup
    //   323: iconst_0
    //   324: aload_0
    //   325: aastore
    //   326: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: goto -189 -> 140
    //   332: astore_1
    //   333: aload_0
    //   334: astore_2
    //   335: goto -64 -> 271
    //   338: astore_1
    //   339: goto -88 -> 251
    //
    // Exception table:
    //   from	to	target	type
    //   6	23	124	java/net/MalformedURLException
    //   37	62	124	java/net/MalformedURLException
    //   66	87	124	java/net/MalformedURLException
    //   87	121	124	java/net/MalformedURLException
    //   151	187	124	java/net/MalformedURLException
    //   201	205	124	java/net/MalformedURLException
    //   208	222	124	java/net/MalformedURLException
    //   230	242	124	java/net/MalformedURLException
    //   251	255	124	java/net/MalformedURLException
    //   271	283	124	java/net/MalformedURLException
    //   187	193	248	java/io/IOException
    //   187	193	266	finally
    //   6	23	283	java/io/IOException
    //   37	62	283	java/io/IOException
    //   66	87	283	java/io/IOException
    //   87	121	283	java/io/IOException
    //   151	187	283	java/io/IOException
    //   201	205	283	java/io/IOException
    //   208	222	283	java/io/IOException
    //   230	242	283	java/io/IOException
    //   251	255	283	java/io/IOException
    //   271	283	283	java/io/IOException
    //   6	23	313	java/lang/Exception
    //   37	62	313	java/lang/Exception
    //   66	87	313	java/lang/Exception
    //   87	121	313	java/lang/Exception
    //   151	187	313	java/lang/Exception
    //   201	205	313	java/lang/Exception
    //   208	222	313	java/lang/Exception
    //   230	242	313	java/lang/Exception
    //   251	255	313	java/lang/Exception
    //   271	283	313	java/lang/Exception
    //   193	201	332	finally
    //   193	201	338	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.d
 * JD-Core Version:    0.6.2
 */