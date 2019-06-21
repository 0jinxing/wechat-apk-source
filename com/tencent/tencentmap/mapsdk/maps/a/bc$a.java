package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.net.Proxy;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public final class bc$a extends bc
{
  private Context a;

  public bc$a(Context paramContext)
  {
    this.a = paramContext;
  }

  private static ba a(String paramString1, byte[] paramArrayOfByte, String paramString2, int paramInt)
  {
    v localv = null;
    AppMethodBeat.i(98544);
    if (paramString1 == null)
    {
      ag.d("no destUrl!", new Object[0]);
      AppMethodBeat.o(98544);
      paramString1 = localv;
    }
    while (true)
    {
      return paramString1;
      if (paramArrayOfByte != null);
      try
      {
        ByteArrayEntity localByteArrayEntity = new org/apache/http/entity/ByteArrayEntity;
        localByteArrayEntity.<init>(paramArrayOfByte);
        for (paramArrayOfByte = localByteArrayEntity; ; paramArrayOfByte = new ByteArrayEntity("".getBytes()))
        {
          paramString2 = a(paramString2, paramInt);
          if (paramString2 != null)
            break label145;
          ag.d("no httpClient!", new Object[0]);
          AppMethodBeat.o(98544);
          paramString1 = localv;
          break;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        paramString1 = null;
      }
    }
    while (true)
      while (true)
      {
        ag.a(paramArrayOfByte);
        ag.d("execute error:%s", new Object[] { paramArrayOfByte.toString() });
        if (paramString1 != null)
          paramString1.abort();
        paramString1 = new Exception(paramArrayOfByte.toString());
        AppMethodBeat.o(98544);
        throw paramString1;
        label145: paramString1 = new HttpPost(paramString1);
        try
        {
          paramString1.setHeader("wup_version", "3.0");
          paramString1.setHeader("TYPE_COMPRESS", "2");
          paramString1.setHeader("encr_type", "rsapost");
          localv = v.a();
          if (localv != null)
            paramString1.setHeader("bea_key", localv.j());
          paramString1.setEntity(paramArrayOfByte);
          paramArrayOfByte = new org/apache/http/protocol/BasicHttpContext;
          paramArrayOfByte.<init>();
          paramString2 = paramString2.execute(paramString1, paramArrayOfByte);
          ag.h("execute request:\n %s", new Object[] { ((HttpRequest)paramArrayOfByte.getAttribute("http.request")).getRequestLine().toString() });
          paramArrayOfByte = new ba(paramString2, paramString1);
          AppMethodBeat.o(98544);
          paramString1 = paramArrayOfByte;
        }
        catch (Throwable paramArrayOfByte)
        {
        }
      }
  }

  private static HttpClient a(String paramString, int paramInt)
  {
    AppMethodBeat.i(98546);
    try
    {
      Object localObject = new org/apache/http/params/BasicHttpParams;
      ((BasicHttpParams)localObject).<init>();
      HttpConnectionParams.setConnectionTimeout((HttpParams)localObject, 30000);
      HttpConnectionParams.setSoTimeout((HttpParams)localObject, 20000);
      HttpConnectionParams.setSocketBufferSize((HttpParams)localObject, 2000);
      ((BasicHttpParams)localObject).setBooleanParameter("http.protocol.handle-redirects", false);
      DefaultHttpClient localDefaultHttpClient = new org/apache/http/impl/client/DefaultHttpClient;
      localDefaultHttpClient.<init>((HttpParams)localObject);
      HttpProtocolParams.setUseExpectContinue((HttpParams)localObject, false);
      localObject = new com/tencent/tencentmap/mapsdk/maps/a/bc$a$1;
      ((1)localObject).<init>();
      localDefaultHttpClient.setHttpRequestRetryHandler((HttpRequestRetryHandler)localObject);
      if ((paramString != null) && (paramString.toLowerCase(Locale.US).contains("wap")) && (paramInt != 2))
      {
        ag.a("use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
        localObject = Proxy.getDefaultHost();
        paramInt = Proxy.getDefaultPort();
        paramString = new org/apache/http/HttpHost;
        paramString.<init>((String)localObject, paramInt);
        localDefaultHttpClient.getParams().setParameter("http.route.default-proxy", paramString);
      }
      while (true)
      {
        AppMethodBeat.o(98546);
        paramString = localDefaultHttpClient;
        return paramString;
        if (paramString != null)
          ag.a("Don't use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
        localDefaultHttpClient.getParams().removeParameter("http.route.default-proxy");
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        ag.a(paramString);
        ag.d("httpclient error!", new Object[0]);
        paramString = null;
        AppMethodBeat.o(98546);
      }
    }
  }

  // ERROR //
  private byte[] a(HttpResponse paramHttpResponse, HttpPost paramHttpPost)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc 241
    //   7: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_1
    //   11: ifnonnull +13 -> 24
    //   14: ldc 241
    //   16: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload 4
    //   21: astore_1
    //   22: aload_1
    //   23: areturn
    //   24: aload_1
    //   25: invokeinterface 247 1 0
    //   30: invokeinterface 252 1 0
    //   35: istore 5
    //   37: iload 5
    //   39: sipush 200
    //   42: if_icmpeq +40 -> 82
    //   45: ldc 254
    //   47: iconst_2
    //   48: anewarray 30	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: iload 5
    //   55: invokestatic 203	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: aload_1
    //   62: invokeinterface 247 1 0
    //   67: aastore
    //   68: invokestatic 257	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: ldc 241
    //   73: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: aload 4
    //   78: astore_1
    //   79: goto -57 -> 22
    //   82: aload_1
    //   83: ldc_w 259
    //   86: invokeinterface 262 2 0
    //   91: ifeq +61 -> 152
    //   94: aload_1
    //   95: ldc_w 264
    //   98: invokeinterface 262 2 0
    //   103: ifeq +49 -> 152
    //   106: aload_1
    //   107: ldc_w 259
    //   110: invokeinterface 268 2 0
    //   115: invokeinterface 273 1 0
    //   120: astore 6
    //   122: aload_1
    //   123: ldc_w 264
    //   126: invokeinterface 268 2 0
    //   131: invokeinterface 273 1 0
    //   136: astore 7
    //   138: invokestatic 98	com/tencent/tencentmap/mapsdk/maps/a/v:a	()Lcom/tencent/tencentmap/mapsdk/maps/a/v;
    //   141: aload_0
    //   142: getfield 15	com/tencent/tencentmap/mapsdk/maps/a/bc$a:a	Landroid/content/Context;
    //   145: aload 6
    //   147: aload 7
    //   149: invokevirtual 276	com/tencent/tencentmap/mapsdk/maps/a/v:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_1
    //   153: invokeinterface 280 1 0
    //   158: astore_1
    //   159: aload_1
    //   160: ifnonnull +24 -> 184
    //   163: ldc_w 282
    //   166: iconst_0
    //   167: anewarray 30	java/lang/Object
    //   170: invokestatic 36	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: ldc 241
    //   175: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: aload 4
    //   180: astore_1
    //   181: goto -159 -> 22
    //   184: new 284	java/io/BufferedInputStream
    //   187: astore 4
    //   189: new 286	java/io/DataInputStream
    //   192: astore 7
    //   194: aload 7
    //   196: aload_1
    //   197: invokeinterface 292 1 0
    //   202: invokespecial 295	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   205: aload 4
    //   207: aload 7
    //   209: invokespecial 296	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   212: aload 4
    //   214: astore_1
    //   215: new 298	java/io/ByteArrayOutputStream
    //   218: astore 7
    //   220: aload 4
    //   222: astore_1
    //   223: aload 7
    //   225: sipush 128
    //   228: invokespecial 300	java/io/ByteArrayOutputStream:<init>	(I)V
    //   231: aload 4
    //   233: astore_1
    //   234: aload 4
    //   236: invokevirtual 303	java/io/BufferedInputStream:read	()I
    //   239: istore 5
    //   241: iload 5
    //   243: iconst_m1
    //   244: if_icmpeq +77 -> 321
    //   247: aload 4
    //   249: astore_1
    //   250: aload 7
    //   252: iload 5
    //   254: invokevirtual 306	java/io/ByteArrayOutputStream:write	(I)V
    //   257: goto -26 -> 231
    //   260: astore 7
    //   262: aload 4
    //   264: astore_1
    //   265: aload 7
    //   267: invokestatic 60	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   270: aload 4
    //   272: astore_1
    //   273: ldc_w 308
    //   276: iconst_1
    //   277: anewarray 30	java/lang/Object
    //   280: dup
    //   281: iconst_0
    //   282: aload 7
    //   284: invokevirtual 66	java/lang/Throwable:toString	()Ljava/lang/String;
    //   287: aastore
    //   288: invokestatic 36	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: aload 4
    //   293: ifnull +8 -> 301
    //   296: aload 4
    //   298: invokevirtual 311	java/io/BufferedInputStream:close	()V
    //   301: aload_3
    //   302: astore_1
    //   303: aload_2
    //   304: ifnull +9 -> 313
    //   307: aload_2
    //   308: invokevirtual 71	org/apache/http/client/methods/HttpPost:abort	()V
    //   311: aload_3
    //   312: astore_1
    //   313: ldc 241
    //   315: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: goto -296 -> 22
    //   321: aload 4
    //   323: astore_1
    //   324: aload 7
    //   326: invokevirtual 314	java/io/ByteArrayOutputStream:flush	()V
    //   329: aload 4
    //   331: astore_1
    //   332: aload 7
    //   334: invokevirtual 317	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   337: astore 7
    //   339: aload 4
    //   341: invokevirtual 311	java/io/BufferedInputStream:close	()V
    //   344: aload 7
    //   346: astore_1
    //   347: aload_2
    //   348: ifnull -35 -> 313
    //   351: aload_2
    //   352: invokevirtual 71	org/apache/http/client/methods/HttpPost:abort	()V
    //   355: aload 7
    //   357: astore_1
    //   358: goto -45 -> 313
    //   361: astore_1
    //   362: aload_1
    //   363: invokestatic 60	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   366: goto -22 -> 344
    //   369: astore_1
    //   370: aload_1
    //   371: invokestatic 60	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   374: goto -73 -> 301
    //   377: astore 4
    //   379: aconst_null
    //   380: astore_1
    //   381: aload_1
    //   382: ifnull +7 -> 389
    //   385: aload_1
    //   386: invokevirtual 311	java/io/BufferedInputStream:close	()V
    //   389: aload_2
    //   390: ifnull +7 -> 397
    //   393: aload_2
    //   394: invokevirtual 71	org/apache/http/client/methods/HttpPost:abort	()V
    //   397: ldc 241
    //   399: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   402: aload 4
    //   404: athrow
    //   405: astore_1
    //   406: aload_1
    //   407: invokestatic 60	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   410: goto -21 -> 389
    //   413: astore 4
    //   415: goto -34 -> 381
    //   418: astore 7
    //   420: aconst_null
    //   421: astore 4
    //   423: goto -161 -> 262
    //
    // Exception table:
    //   from	to	target	type
    //   215	220	260	java/lang/Throwable
    //   223	231	260	java/lang/Throwable
    //   234	241	260	java/lang/Throwable
    //   250	257	260	java/lang/Throwable
    //   324	329	260	java/lang/Throwable
    //   332	339	260	java/lang/Throwable
    //   339	344	361	java/lang/Throwable
    //   296	301	369	java/lang/Throwable
    //   184	212	377	finally
    //   385	389	405	java/lang/Throwable
    //   215	220	413	finally
    //   223	231	413	finally
    //   234	241	413	finally
    //   250	257	413	finally
    //   265	270	413	finally
    //   273	291	413	finally
    //   324	329	413	finally
    //   332	339	413	finally
    //   184	212	418	java/lang/Throwable
  }

  public final byte[] a(String paramString, byte[] paramArrayOfByte, az paramaz)
  {
    AppMethodBeat.i(98543);
    if (paramString == null)
    {
      ag.d("no destUrl!", new Object[0]);
      paramString = null;
      AppMethodBeat.o(98543);
    }
    Object localObject1;
    int i;
    String str1;
    int j;
    int k;
    label78: int m;
    HttpResponse localHttpResponse;
    int n;
    while (true)
    {
      return paramString;
      localObject1 = null;
      i = 0;
      if (paramArrayOfByte == null);
      Object localObject2;
      for (long l1 = 0L; ; l1 = paramArrayOfByte.length)
      {
        ag.h("start req: %s sz:%d", new Object[] { paramString, Long.valueOf(l1) });
        str1 = "";
        localObject2 = "";
        j = 0;
        k = 0;
        m = i + 1;
        if ((i >= 3) || (k >= 2))
          break label713;
        if (j == 0)
          break;
        paramString = new Exception("net redirect");
        AppMethodBeat.o(98543);
        throw paramString;
      }
      if (m > 1)
      {
        ag.h("try time:".concat(String.valueOf(m)), new Object[0]);
        if ((m == 2) && (paramaz.c() == 2))
          paramaz.b(false);
      }
      try
      {
        Thread.sleep(5000L);
        localObject3 = e.n(this.a);
        new Date().getTime();
      }
      catch (InterruptedException localInterruptedException)
      {
        try
        {
          Object localObject3 = a(paramString, paramArrayOfByte, (String)localObject3, m);
          localObject1 = localObject3;
          new Date().getTime();
          if (localObject1 == null)
            break label735;
          localHttpResponse = localObject1.a;
          localObject3 = localHttpResponse.getEntity();
          l1 = 0L;
          if (localObject3 != null)
          {
            long l2 = ((HttpEntity)localObject3).getContentLength();
            l1 = l2;
            if (l2 < 0L)
              l1 = 0L;
          }
          n = localHttpResponse.getStatusLine().getStatusCode();
          ag.h("response code:%d ", new Object[] { Integer.valueOf(n) });
          ag.h("contentLength:%d ", new Object[] { Long.valueOf(l1) });
          if (n != 200)
            break;
          if (localHttpResponse.containsHeader("encrypt-status"))
          {
            ag.d("svr encry failed: " + localHttpResponse.getFirstHeader("encrypt-status").getValue(), new Object[0]);
            paramString = null;
            AppMethodBeat.o(98543);
            continue;
            localInterruptedException = localInterruptedException;
            ag.a(localInterruptedException);
          }
        }
        catch (Exception localException1)
        {
          String str2 = localException1.toString();
          if (((String)localObject2).equals(str2));
          for (str1 = str1 + m + ":same "; ; str1 = str1 + m + ":" + str2 + " ")
          {
            localObject2 = str2;
            break;
          }
          paramString = a(localHttpResponse, localObject1.b);
          AppMethodBeat.o(98543);
        }
      }
    }
    if ((n == 301) || (n == 302) || (n == 303) || (n == 307))
    {
      i = 1;
      label557: if (i == 0)
        break label735;
      j = 1;
      paramString = localHttpResponse.getFirstHeader("Location");
      if (paramString != null)
        break label644;
      ag.d("redirect code:" + n + " Location is null! return", new Object[0]);
    }
    while (true)
    {
      try
      {
        while (true)
        {
          if (localObject1.b != null)
            localObject1.b.abort();
          paramString = null;
          AppMethodBeat.o(98543);
          break;
          i = 0;
          break label557;
          label644: k++;
          m = 0;
          i = 0;
          paramString = paramString.getValue();
          ag.h("redirect code:%d , to:%s", new Object[] { Integer.valueOf(n), paramString });
          try
          {
            if (localObject1.b != null)
              localObject1.b.abort();
            j = 1;
          }
          catch (Exception localException2)
          {
            i = m;
          }
        }
        break label78;
        label713: paramString = new Exception(str1);
        AppMethodBeat.o(98543);
        throw paramString;
      }
      catch (Exception paramString)
      {
        continue;
      }
      label735: i = m;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bc.a
 * JD-Core Version:    0.6.2
 */