package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

public final class cw extends cq
{
  private String A;
  private int B;
  private long C;
  private String D;
  private cw.a E;
  private boolean F;
  private cu G;
  long p;
  boolean q;
  int r;
  boolean s;
  private HttpURLConnection t;
  private DataOutputStream u;
  private DataInputStream v;
  private cv w;
  private String x;
  private boolean y;
  private boolean z;

  public cw(String paramString1, String paramString2, boolean paramBoolean, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString3)
  {
    AppMethodBeat.i(98675);
    this.A = "";
    this.C = 0L;
    this.E = new cw.a((byte)0);
    this.q = false;
    this.F = false;
    this.r = 0;
    this.s = false;
    this.x = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
    this.d = paramMap;
    this.e = paramArrayOfByte;
    int i;
    if (ce.g() == 2)
    {
      i = ce.a.a("direct_access_time_out", 1000, 60000, 15000);
      if (paramInt >= i)
        break label155;
    }
    while (true)
    {
      this.f = eu.a(paramInt, 200, 60000, 10000);
      this.g = paramString3;
      AppMethodBeat.o(98675);
      return;
      i = ce.a.a("direct_access_time_out", 1000, 60000, 10000);
      break;
      label155: paramInt = i;
    }
  }

  // ERROR //
  private void a(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 117
    //   4: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 119	java/io/BufferedInputStream
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: getfield 121	com/tencent/tencentmap/mapsdk/maps/a/cw:t	Ljava/net/HttpURLConnection;
    //   16: invokevirtual 127	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   19: invokespecial 130	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: new 132	java/io/ByteArrayOutputStream
    //   25: astore 4
    //   27: aload 4
    //   29: invokespecial 133	java/io/ByteArrayOutputStream:<init>	()V
    //   32: sipush 4096
    //   35: newarray byte
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: istore 7
    //   46: aload_3
    //   47: aload 5
    //   49: invokevirtual 137	java/io/BufferedInputStream:read	([B)I
    //   52: istore 8
    //   54: iload 8
    //   56: iconst_m1
    //   57: if_icmpeq +204 -> 261
    //   60: iload 6
    //   62: istore 7
    //   64: aload 4
    //   66: aload 5
    //   68: iconst_0
    //   69: iload 8
    //   71: invokevirtual 141	java/io/ByteArrayOutputStream:write	([BII)V
    //   74: iload 6
    //   76: iload 8
    //   78: iadd
    //   79: istore 8
    //   81: iload 8
    //   83: istore 6
    //   85: iload 8
    //   87: iload_1
    //   88: if_icmple -46 -> 42
    //   91: iload 8
    //   93: istore 7
    //   95: aload_0
    //   96: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   99: sipush -303
    //   102: putfield 147	com/tencent/tencentmap/mapsdk/maps/a/cv:a	I
    //   105: iload 8
    //   107: istore 7
    //   109: aload_0
    //   110: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   113: ldc 149
    //   115: putfield 150	com/tencent/tencentmap/mapsdk/maps/a/cv:b	Ljava/lang/String;
    //   118: iload_2
    //   119: istore_1
    //   120: iload 8
    //   122: istore 6
    //   124: iload_1
    //   125: ifeq +33 -> 158
    //   128: iload 6
    //   130: istore 7
    //   132: aload_0
    //   133: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   136: aload 4
    //   138: invokevirtual 154	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   141: putfield 156	com/tencent/tencentmap/mapsdk/maps/a/cv:d	[B
    //   144: iload 6
    //   146: istore 7
    //   148: aload_0
    //   149: getfield 57	com/tencent/tencentmap/mapsdk/maps/a/cw:E	Lcom/tencent/tencentmap/mapsdk/maps/a/cw$a;
    //   152: invokestatic 162	android/os/SystemClock:elapsedRealtime	()J
    //   155: putfield 164	com/tencent/tencentmap/mapsdk/maps/a/cw$a:f	J
    //   158: iload 6
    //   160: istore 7
    //   162: aload 4
    //   164: invokevirtual 167	java/io/ByteArrayOutputStream:close	()V
    //   167: iload 6
    //   169: istore 7
    //   171: ldc 117
    //   173: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: return
    //   177: astore 5
    //   179: ldc 117
    //   181: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -8 -> 176
    //   187: astore 5
    //   189: iconst_0
    //   190: istore 7
    //   192: aload_0
    //   193: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   196: sipush -306
    //   199: putfield 147	com/tencent/tencentmap/mapsdk/maps/a/cv:a	I
    //   202: aload_0
    //   203: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   206: ldc 169
    //   208: iload 7
    //   210: invokestatic 175	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   213: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   216: putfield 150	com/tencent/tencentmap/mapsdk/maps/a/cv:b	Ljava/lang/String;
    //   219: ldc 117
    //   221: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: goto -48 -> 176
    //   227: astore 5
    //   229: aload_0
    //   230: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   233: sipush -287
    //   236: putfield 147	com/tencent/tencentmap/mapsdk/maps/a/cv:a	I
    //   239: aload_0
    //   240: getfield 143	com/tencent/tencentmap/mapsdk/maps/a/cw:w	Lcom/tencent/tencentmap/mapsdk/maps/a/cv;
    //   243: ldc 181
    //   245: putfield 150	com/tencent/tencentmap/mapsdk/maps/a/cv:b	Ljava/lang/String;
    //   248: ldc 117
    //   250: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: goto -77 -> 176
    //   256: astore 5
    //   258: goto -66 -> 192
    //   261: iconst_1
    //   262: istore_1
    //   263: goto -139 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   162	167	177	java/lang/Exception
    //   7	39	187	java/lang/OutOfMemoryError
    //   7	39	227	java/lang/Exception
    //   46	54	227	java/lang/Exception
    //   64	74	227	java/lang/Exception
    //   95	105	227	java/lang/Exception
    //   109	118	227	java/lang/Exception
    //   132	144	227	java/lang/Exception
    //   148	158	227	java/lang/Exception
    //   171	176	227	java/lang/Exception
    //   46	54	256	java/lang/OutOfMemoryError
    //   64	74	256	java/lang/OutOfMemoryError
    //   95	105	256	java/lang/OutOfMemoryError
    //   109	118	256	java/lang/OutOfMemoryError
    //   132	144	256	java/lang/OutOfMemoryError
    //   148	158	256	java/lang/OutOfMemoryError
    //   162	167	256	java/lang/OutOfMemoryError
    //   171	176	256	java/lang/OutOfMemoryError
  }

  private void b()
  {
    AppMethodBeat.i(98677);
    int i = 0;
    int j = i;
    if (this.d != null)
    {
      j = i;
      if (this.d.size() > 0)
      {
        Iterator localIterator = this.d.keySet().iterator();
        j = 0;
        if (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)this.d.get(str1);
          this.t.addRequestProperty(str1, str2);
          if (!str1.toLowerCase().contains("host"))
            break label219;
          j = 1;
        }
      }
    }
    label219: 
    while (true)
    {
      break;
      if (j == 0)
        this.t.setRequestProperty("Host", this.x);
      this.t.setRequestProperty("Halley", this.g + "-" + this.r + "-" + System.currentTimeMillis());
      if (this.q)
      {
        this.t.setRequestProperty("X-Online-Host", this.x);
        this.t.setRequestProperty("x-tx-host", this.x);
      }
      AppMethodBeat.o(98677);
      return;
    }
  }

  private boolean c()
  {
    AppMethodBeat.i(98678);
    boolean bool;
    if (this.n)
    {
      this.w.a = -20;
      this.p = (SystemClock.elapsedRealtime() - this.p);
      this.E.a();
      bool = true;
      AppMethodBeat.o(98678);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(98678);
    }
  }

  private void d()
  {
    AppMethodBeat.i(98680);
    try
    {
      if (this.t != null)
        this.t.disconnect();
      if (this.u != null)
        this.u.close();
      if (this.v != null)
        this.v.close();
      AppMethodBeat.o(98680);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98680);
    }
  }

  public final cv a()
  {
    int i = 1;
    int j = 1;
    int k = 1;
    int m = 1;
    int n = 1;
    int i1 = 1;
    AppMethodBeat.i(98676);
    this.m = System.currentTimeMillis();
    this.p = SystemClock.elapsedRealtime();
    this.E.a = this.p;
    this.w = new cv(0, "", 0);
    label165: label247: Object localObject5;
    try
    {
      if (c())
      {
        localObject1 = this.w;
        d();
        this.p = (SystemClock.elapsedRealtime() - this.p);
        this.E.a();
        if ((this.w.a != 0) && (ce.h()) && (this.w.a != -20))
          if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
            break label165;
        for (j = i1; ; j = 0)
        {
          if (j != 0)
            this.D = eu.c(this.x);
          AppMethodBeat.o(98676);
          return localObject1;
        }
      }
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(this.b);
      this.y = ((URL)localObject1).getProtocol().toLowerCase().startsWith("https");
      this.z = eu.d(((URL)localObject1).getHost());
      if (this.y)
        if ((this.q) && (ce.k() != null))
        {
          localObject1 = (HttpsURLConnection)((URL)localObject1).openConnection(ce.k());
          localObject5 = localObject1;
          if (this.z)
          {
            localObject5 = new com/tencent/tencentmap/mapsdk/maps/a/cu;
            ((cu)localObject5).<init>(this.x);
            this.G = ((cu)localObject5);
            ((HttpsURLConnection)localObject1).setSSLSocketFactory(this.G);
            localObject5 = new com/tencent/tencentmap/mapsdk/maps/a/ct;
            ((ct)localObject5).<init>(this.x);
            ((HttpsURLConnection)localObject1).setHostnameVerifier((HostnameVerifier)localObject5);
            localObject5 = localObject1;
          }
          label312: this.t = ((HttpURLConnection)localObject5);
          localObject5 = this.t;
          if (!this.c)
            break label613;
          localObject1 = "GET";
          label336: ((HttpURLConnection)localObject5).setRequestMethod((String)localObject1);
          this.t.setConnectTimeout(this.f);
          this.t.setReadTimeout(this.f);
          this.t.setUseCaches(false);
          this.t.setDoInput(true);
          this.t.setInstanceFollowRedirects(false);
          b();
          if ((!this.c) && (!eu.a(this.e)))
          {
            this.t.setDoOutput(true);
            this.C = this.e.length;
          }
          this.E.b = SystemClock.elapsedRealtime();
          this.t.connect();
          this.E.c = SystemClock.elapsedRealtime();
          if (!c())
            break label626;
          localObject1 = this.w;
          d();
          this.p = (SystemClock.elapsedRealtime() - this.p);
          this.E.a();
          if ((this.w.a != 0) && (ce.h()) && (this.w.a != -20))
            if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
              break label621;
        }
      label613: label621: for (j = i; ; j = 0)
      {
        if (j != 0)
          this.D = eu.c(this.x);
        AppMethodBeat.o(98676);
        break;
        localObject1 = (HttpsURLConnection)((URL)localObject1).openConnection();
        break label247;
        if ((this.q) && (ce.k() != null))
        {
          localObject5 = (HttpURLConnection)((URL)localObject1).openConnection(ce.k());
          break label312;
        }
        localObject5 = (HttpURLConnection)((URL)localObject1).openConnection();
        break label312;
        localObject1 = "POST";
        break label336;
      }
      label626: if ((!this.c) && (!eu.a(this.e)))
      {
        localObject1 = new java/io/DataOutputStream;
        ((DataOutputStream)localObject1).<init>(this.t.getOutputStream());
        this.u = ((DataOutputStream)localObject1);
        this.u.write(this.e);
        this.u.flush();
      }
      this.E.d = SystemClock.elapsedRealtime();
      i1 = this.t.getResponseCode();
      this.E.e = SystemClock.elapsedRealtime();
      this.w.c = i1;
      this.A = this.t.getContentType();
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject1 = this.t.getHeaderFields().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject5 = (Map.Entry)((Iterator)localObject1).next();
        if (((Map.Entry)localObject5).getKey() != null)
          localHashMap.put(((Map.Entry)localObject5).getKey(), ((List)((Map.Entry)localObject5).getValue()).get(0));
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      HashMap localHashMap;
      while (true)
      {
        this.w.a = -300;
        d();
        this.p = (SystemClock.elapsedRealtime() - this.p);
        this.E.a();
        if ((this.w.a != 0) && (ce.h()) && (this.w.a != -20))
        {
          if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
            break;
          if (j != 0)
            this.D = eu.c(this.x);
        }
        localObject2 = this.w;
        AppMethodBeat.o(98676);
      }
      this.w.a(localHashMap);
      if ((this.w.c < 200) || (this.w.c >= 300))
        break label1622;
      this.B = this.t.getContentLength();
      i1 = ce.a.a("app_receive_pack_size", 524288, 10485760, 2097152);
      if (this.B < 0)
        a(i1);
      while (true)
      {
        d();
        this.p = (SystemClock.elapsedRealtime() - this.p);
        this.E.a();
        if ((this.w.a == 0) || (!ce.h()) || (this.w.a == -20))
          break;
        if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
          break label1665;
        j = k;
        if (j == 0)
          break;
        this.D = eu.c(this.x);
        break;
        if (this.B != 0)
          break label1364;
        this.w.d = new byte[0];
        this.E.f = SystemClock.elapsedRealtime();
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        label1010: this.w.a = -287;
        label1076: localObject5 = this.w;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((cv)localObject5).b = (localThrowable.getClass().getSimpleName() + "(" + localThrowable.getLocalizedMessage() + ")");
        if (((this.G == null) || (!this.G.a)) && ((!this.y) || (!this.w.b.toLowerCase().contains("cannot verify hostname"))) && ((!this.y) || (!this.w.b.toLowerCase().contains("not verified"))))
          break label1675;
        j = 1;
        label1264: if (ce.h())
          break label1680;
        this.w.a = -4;
        label1279: d();
        this.p = (SystemClock.elapsedRealtime() - this.p);
        this.E.a();
        if ((this.w.a != 0) && (ce.h()) && (this.w.a != -20))
        {
          if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
            break label1923;
          j = m;
          label1346: if (j != 0)
          {
            this.D = eu.c(this.x);
            continue;
            label1364: if (this.B <= i1)
              break;
            this.w.a = -303;
            localObject5 = this.w;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((cv)localObject5).b = this.B;
          }
        }
      }
    }
    finally
    {
      d();
      this.p = (SystemClock.elapsedRealtime() - this.p);
      this.E.a();
      if (this.w.a == 0)
        break label1503;
    }
    if ((ce.h()) && (this.w.a != -20))
      if (ce.a.a("direct_fail_to_report_dns_ip", 0, 1, 0) != 1)
        break label1928;
    label1665: label1923: label1928: for (j = n; ; j = 0)
    {
      label1503: Object localObject4;
      while (true)
      {
        if (j != 0)
          this.D = eu.c(this.x);
        AppMethodBeat.o(98676);
        throw localObject3;
        try
        {
          localObject5 = new byte[this.B];
          DataInputStream localDataInputStream = new java/io/DataInputStream;
          localDataInputStream.<init>(this.t.getInputStream());
          this.v = localDataInputStream;
          this.v.readFully((byte[])localObject5);
          this.w.d = ((byte[])localObject5);
          this.E.f = SystemClock.elapsedRealtime();
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          this.w.a = -306;
          localObject4 = this.w;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          ((cv)localObject4).b = this.B;
        }
      }
      break label1010;
      label1622: if ((this.w.c < 300) || (this.w.c >= 400))
        break label1010;
      this.h = this.w.a("location");
      break label1010;
      j = 0;
      break label1076;
      j = 0;
      break;
      label1675: j = 0;
      break label1264;
      label1680: if (this.n)
      {
        this.w.a = -20;
        break label1279;
      }
      if (j != 0)
      {
        this.w.a = -289;
        break label1279;
      }
      this.i = true;
      if ((localThrowable.getMessage() != null) && (localThrowable.getMessage().toLowerCase().contains("permission")))
      {
        this.w.a = -281;
        this.w.b = "no permission";
        break label1279;
      }
      if ((localThrowable instanceof UnknownHostException))
      {
        this.w.a = -284;
        break label1279;
      }
      if ((localThrowable instanceof ConnectException))
      {
        this.w.a = -42;
        break label1279;
      }
      if ((localThrowable instanceof SocketTimeoutException))
      {
        localObject4 = localThrowable.getLocalizedMessage();
        if ((localObject4 != null) && ((((String)localObject4).toLowerCase().contains("connect")) || (((String)localObject4).toLowerCase().contains("connection"))))
        {
          this.w.a = -10;
          break label1279;
        }
        this.w.a = -13;
        break label1279;
      }
      if ((localThrowable instanceof SocketException))
      {
        this.w.a = -41;
        break label1279;
      }
      if (!(localThrowable instanceof IOException))
        break label1279;
      this.w.a = -286;
      break label1279;
      j = 0;
      break label1346;
    }
  }

  public final void a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    AppMethodBeat.i(98681);
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramMap1);
    localHashMap.put("B59", this.p);
    if (this.y)
      localHashMap.put("B85", "1");
    int i;
    if (this.c)
    {
      localHashMap.put("B95", "1");
      if (!this.z)
        localHashMap.put("B23", "1");
      paramMap1 = new HashMap();
      paramMap1.putAll(paramMap2);
      if (this.m != 0L)
        paramMap1.put("B84", this.m);
      paramMap1.put("B87", this.A);
      paramMap1.put("B88", this.B);
      paramMap1.put("B90", this.E.g);
      paramMap1.put("B91", this.E.h);
      paramMap1.put("B92", this.E.i);
      paramMap1.put("B93", this.E.j);
      paramMap1.put("B94", this.E.k);
      if (!TextUtils.isEmpty(this.h))
        paramMap1.put("B47", this.h);
      if (!TextUtils.isEmpty(this.D))
        paramMap1.put("B41", this.D);
      if (this.w.a == 0)
        break label492;
      i = this.w.a;
      label417: if ((this.s) && (i != -4))
        break label523;
      es.b("HLHttpDirect", bt.c(), i, this.w.b, localHashMap, paramMap1, this.i);
      AppMethodBeat.o(98681);
    }
    while (true)
    {
      return;
      localHashMap.put("B96", this.C);
      break;
      label492: if (this.w.c == 200)
      {
        i = 0;
        break label417;
      }
      i = this.w.c;
      break label417;
      label523: es.a("HLHttpDirect", bt.c(), i, this.w.b, localHashMap, paramMap1, this.i);
      AppMethodBeat.o(98681);
    }
  }

  public final void a(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cw
 * JD-Core Version:    0.6.2
 */