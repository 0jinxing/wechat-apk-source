package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

public class n
{
  public static String a(String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte, n.a parama, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(65255);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(65255);
      paramString = localObject2;
      return paramString;
    }
    paramMap = a(paramString, paramMap);
    paramString = localObject1;
    if (paramMap != null)
    {
      if (!paramBoolean)
        break label63;
      a(paramMap, paramArrayOfByte);
    }
    while (true)
    {
      paramString = a(paramMap, parama, false);
      AppMethodBeat.o(65255);
      break;
      label63: b(paramMap, paramArrayOfByte);
    }
  }

  public static String a(String paramString, byte[] paramArrayOfByte, n.a parama, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(65254);
    if (paramBoolean);
    try
    {
      localObject3 = p.a().c();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = paramString + (String)localObject3;
      if (!paramBoolean);
    }
    catch (Exception paramString)
    {
      try
      {
        Object localObject3;
        paramString = p.a().a(paramArrayOfByte);
        paramArrayOfByte = paramString;
        label63: if (paramArrayOfByte == null)
        {
          AppMethodBeat.o(65254);
          paramString = localObject2;
        }
        while (true)
        {
          return paramString;
          localObject3 = o.a().b();
          break;
          paramString = paramString;
          AppMethodBeat.o(65254);
          paramString = localObject2;
          continue;
          paramString = o.a().a(paramArrayOfByte);
          paramArrayOfByte = paramString;
          break label63;
          paramString = new HashMap();
          paramString.put("Content-Type", "application/x-www-form-urlencoded");
          paramString.put("Content-Length", String.valueOf(paramArrayOfByte.length));
          localObject3 = a((String)localObject3, paramString);
          paramString = localObject1;
          if (localObject3 != null)
          {
            b((HttpURLConnection)localObject3, paramArrayOfByte);
            paramString = a((HttpURLConnection)localObject3, parama, paramBoolean);
          }
          AppMethodBeat.o(65254);
        }
      }
      catch (Exception paramString)
      {
        break label63;
      }
    }
  }

  // ERROR //
  private static String a(HttpURLConnection paramHttpURLConnection, n.a parama, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 94
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
    //   9: istore_3
    //   10: aload_1
    //   11: ifnull +10 -> 21
    //   14: aload_1
    //   15: iload_3
    //   16: invokeinterface 102 2 0
    //   21: iload_3
    //   22: sipush 200
    //   25: if_icmpne +234 -> 259
    //   28: aload_0
    //   29: invokevirtual 106	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   32: astore_1
    //   33: aload_0
    //   34: invokevirtual 109	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   37: astore_0
    //   38: aload_0
    //   39: ifnull +78 -> 117
    //   42: aload_0
    //   43: ldc 111
    //   45: invokevirtual 115	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   48: ifeq +69 -> 117
    //   51: new 117	java/util/zip/GZIPInputStream
    //   54: astore_0
    //   55: aload_0
    //   56: aload_1
    //   57: invokespecial 120	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   60: new 122	java/io/ByteArrayOutputStream
    //   63: astore 4
    //   65: aload 4
    //   67: invokespecial 123	java/io/ByteArrayOutputStream:<init>	()V
    //   70: sipush 128
    //   73: newarray byte
    //   75: astore_1
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual 129	java/io/InputStream:read	([B)I
    //   81: istore_3
    //   82: iload_3
    //   83: iconst_m1
    //   84: if_icmpeq +82 -> 166
    //   87: aload 4
    //   89: aload_1
    //   90: iconst_0
    //   91: iload_3
    //   92: invokevirtual 133	java/io/ByteArrayOutputStream:write	([BII)V
    //   95: goto -19 -> 76
    //   98: astore_1
    //   99: aload_0
    //   100: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   103: aload 4
    //   105: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   108: aconst_null
    //   109: astore_1
    //   110: ldc 94
    //   112: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: aload_1
    //   116: areturn
    //   117: aload_0
    //   118: ifnull +43 -> 161
    //   121: aload_0
    //   122: ldc 138
    //   124: invokevirtual 115	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   127: ifeq +34 -> 161
    //   130: new 140	java/util/zip/Inflater
    //   133: astore_0
    //   134: aload_0
    //   135: iconst_1
    //   136: invokespecial 143	java/util/zip/Inflater:<init>	(Z)V
    //   139: new 145	java/util/zip/InflaterInputStream
    //   142: dup
    //   143: aload_1
    //   144: aload_0
    //   145: invokespecial 148	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   148: astore_0
    //   149: goto -89 -> 60
    //   152: astore_0
    //   153: aconst_null
    //   154: astore 4
    //   156: aconst_null
    //   157: astore_0
    //   158: goto -59 -> 99
    //   161: aload_1
    //   162: astore_0
    //   163: goto -103 -> 60
    //   166: iload_2
    //   167: ifeq +30 -> 197
    //   170: new 87	java/lang/String
    //   173: dup
    //   174: aload 4
    //   176: invokevirtual 152	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   179: ldc 154
    //   181: invokespecial 157	java/lang/String:<init>	([BLjava/lang/String;)V
    //   184: astore_1
    //   185: aload_0
    //   186: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   189: aload 4
    //   191: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   194: goto -84 -> 110
    //   197: new 87	java/lang/String
    //   200: dup
    //   201: invokestatic 67	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   204: aload 4
    //   206: invokevirtual 152	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   209: invokevirtual 159	com/tencent/smtt/utils/o:c	([B)[B
    //   212: invokespecial 162	java/lang/String:<init>	([B)V
    //   215: astore_1
    //   216: goto -31 -> 185
    //   219: astore_1
    //   220: aload_0
    //   221: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   224: aload 4
    //   226: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   229: ldc 94
    //   231: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: aload_1
    //   235: athrow
    //   236: astore_1
    //   237: aconst_null
    //   238: astore 4
    //   240: aconst_null
    //   241: astore_0
    //   242: goto -22 -> 220
    //   245: astore_1
    //   246: aconst_null
    //   247: astore 4
    //   249: goto -29 -> 220
    //   252: astore_1
    //   253: aconst_null
    //   254: astore 4
    //   256: goto -157 -> 99
    //   259: aconst_null
    //   260: astore 4
    //   262: aconst_null
    //   263: astore_0
    //   264: aconst_null
    //   265: astore_1
    //   266: goto -81 -> 185
    //
    // Exception table:
    //   from	to	target	type
    //   70	76	98	java/lang/Throwable
    //   76	82	98	java/lang/Throwable
    //   87	95	98	java/lang/Throwable
    //   170	185	98	java/lang/Throwable
    //   197	216	98	java/lang/Throwable
    //   5	10	152	java/lang/Throwable
    //   14	21	152	java/lang/Throwable
    //   28	38	152	java/lang/Throwable
    //   42	60	152	java/lang/Throwable
    //   121	149	152	java/lang/Throwable
    //   70	76	219	finally
    //   76	82	219	finally
    //   87	95	219	finally
    //   170	185	219	finally
    //   197	216	219	finally
    //   5	10	236	finally
    //   14	21	236	finally
    //   28	38	236	finally
    //   42	60	236	finally
    //   121	149	236	finally
    //   60	70	245	finally
    //   60	70	252	java/lang/Throwable
  }

  // ERROR //
  private static HttpURLConnection a(String paramString, Map<String, String> paramMap)
  {
    // Byte code:
    //   0: ldc 163
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 165	java/net/URL
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: invokespecial 168	java/net/URL:<init>	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: invokevirtual 172	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: checkcast 96	java/net/HttpURLConnection
    //   21: astore_0
    //   22: aload_0
    //   23: ldc 174
    //   25: invokevirtual 177	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: iconst_1
    //   30: invokevirtual 180	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   33: aload_0
    //   34: iconst_1
    //   35: invokevirtual 183	java/net/HttpURLConnection:setDoInput	(Z)V
    //   38: aload_0
    //   39: iconst_0
    //   40: invokevirtual 186	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   43: aload_0
    //   44: sipush 20000
    //   47: invokevirtual 189	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   50: getstatic 195	android/os/Build$VERSION:SDK_INT	I
    //   53: bipush 13
    //   55: if_icmple +77 -> 132
    //   58: aload_0
    //   59: ldc 197
    //   61: ldc 199
    //   63: invokevirtual 203	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_1
    //   67: invokeinterface 207 1 0
    //   72: invokeinterface 213 1 0
    //   77: astore_2
    //   78: aload_2
    //   79: invokeinterface 219 1 0
    //   84: ifeq +59 -> 143
    //   87: aload_2
    //   88: invokeinterface 223 1 0
    //   93: checkcast 225	java/util/Map$Entry
    //   96: astore_1
    //   97: aload_0
    //   98: aload_1
    //   99: invokeinterface 228 1 0
    //   104: checkcast 87	java/lang/String
    //   107: aload_1
    //   108: invokeinterface 231 1 0
    //   113: checkcast 87	java/lang/String
    //   116: invokevirtual 203	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: goto -41 -> 78
    //   122: astore_0
    //   123: aconst_null
    //   124: astore_0
    //   125: ldc 163
    //   127: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_0
    //   131: areturn
    //   132: aload_0
    //   133: ldc 233
    //   135: ldc 235
    //   137: invokevirtual 203	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: goto -74 -> 66
    //   143: ldc 163
    //   145: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -18 -> 130
    //   151: astore_1
    //   152: goto -27 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   5	22	122	java/lang/Exception
    //   22	28	151	java/lang/Exception
  }

  private static void a(Closeable paramCloseable)
  {
    AppMethodBeat.i(65260);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(65260);
        return;
      }
      catch (Exception paramCloseable)
      {
      }
      AppMethodBeat.o(65260);
    }
  }

  // ERROR //
  private static void a(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 242
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 246	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   9: astore_2
    //   10: new 248	java/util/zip/GZIPOutputStream
    //   13: astore_0
    //   14: new 250	java/io/BufferedOutputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_2
    //   20: ldc 251
    //   22: invokespecial 254	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   25: aload_0
    //   26: aload_3
    //   27: invokespecial 257	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual 261	java/io/OutputStream:write	([B)V
    //   35: aload_0
    //   36: invokevirtual 264	java/io/OutputStream:flush	()V
    //   39: aconst_null
    //   40: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   43: aload_0
    //   44: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   47: ldc 242
    //   49: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: return
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_0
    //   56: aconst_null
    //   57: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   60: aload_0
    //   61: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   64: ldc 242
    //   66: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: goto -17 -> 52
    //   72: astore_0
    //   73: aconst_null
    //   74: astore_1
    //   75: aconst_null
    //   76: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   79: aload_1
    //   80: invokestatic 136	com/tencent/smtt/utils/n:a	(Ljava/io/Closeable;)V
    //   83: ldc 242
    //   85: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aload_0
    //   89: athrow
    //   90: astore_3
    //   91: aload_0
    //   92: astore_1
    //   93: aload_3
    //   94: astore_0
    //   95: goto -20 -> 75
    //   98: astore_1
    //   99: goto -43 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   5	30	53	java/lang/Exception
    //   5	30	72	finally
    //   30	39	90	finally
    //   30	39	98	java/lang/Exception
  }

  private static void b(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65258);
    HttpURLConnection localHttpURLConnection1 = null;
    HttpURLConnection localHttpURLConnection2 = null;
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getOutputStream();
      localHttpURLConnection2 = paramHttpURLConnection;
      localHttpURLConnection1 = paramHttpURLConnection;
      paramHttpURLConnection.write(paramArrayOfByte);
      localHttpURLConnection2 = paramHttpURLConnection;
      localHttpURLConnection1 = paramHttpURLConnection;
      paramHttpURLConnection.flush();
      return;
    }
    catch (Exception paramHttpURLConnection)
    {
      while (true)
      {
        a(localHttpURLConnection2);
        AppMethodBeat.o(65258);
      }
    }
    finally
    {
      a(localHttpURLConnection1);
      AppMethodBeat.o(65258);
    }
    throw paramHttpURLConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.n
 * JD-Core Version:    0.6.2
 */