package com.google.android.exoplayer2.h;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.d.b;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class n
  implements r
{
  private static final Pattern bqr;
  private static final AtomicReference<byte[]> bqs;
  private InputStream azC;
  private i bib;
  private final u<? super n> bpJ;
  private long bqA;
  private long bqB;
  private long bqC;
  private final boolean bqt;
  private final int bqu;
  private final int bqv;
  private final com.google.android.exoplayer2.i.n<String> bqw;
  private final r.f bqx;
  private final r.f bqy;
  private long bqz;
  private HttpURLConnection connection;
  private boolean opened;
  private final String userAgent;

  static
  {
    AppMethodBeat.i(95833);
    bqr = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    bqs = new AtomicReference();
    AppMethodBeat.o(95833);
  }

  public n(String paramString, u<? super n> paramu, int paramInt1, int paramInt2, boolean paramBoolean, r.f paramf)
  {
    AppMethodBeat.i(95825);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new IllegalArgumentException();
      AppMethodBeat.o(95825);
      throw paramString;
    }
    this.userAgent = paramString;
    this.bqw = null;
    this.bpJ = paramu;
    this.bqy = new r.f();
    this.bqu = paramInt1;
    this.bqv = paramInt2;
    this.bqt = paramBoolean;
    this.bqx = paramf;
    AppMethodBeat.o(95825);
  }

  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(95831);
    long l1 = -1L;
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    long l2 = l1;
    if (!TextUtils.isEmpty(str));
    try
    {
      l2 = Long.parseLong(str);
      paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Range");
      l1 = l2;
      if (!TextUtils.isEmpty(paramHttpURLConnection))
      {
        localMatcher = bqr.matcher(paramHttpURLConnection);
        l1 = l2;
        if (!localMatcher.find());
      }
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      try
      {
        Matcher localMatcher;
        l1 = Long.parseLong(localMatcher.group(2));
        long l3 = Long.parseLong(localMatcher.group(1));
        l3 = l1 - l3 + 1L;
        if (l2 < 0L)
          l1 = l3;
        while (true)
        {
          AppMethodBeat.o(95831);
          return l1;
          localNumberFormatException2 = localNumberFormatException2;
          b.e("DefaultHttpDataSource", "Unexpected Content-Length [" + str + "]", new Object[0]);
          l2 = l1;
          break;
          l1 = l2;
          if (l2 != l3)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Inconsistent headers [");
            b.w("DefaultHttpDataSource", str + "] [" + paramHttpURLConnection + "]", new Object[0]);
            l1 = Math.max(l2, l3);
          }
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        while (true)
        {
          b.e("DefaultHttpDataSource", "Unexpected Content-Range [" + paramHttpURLConnection + "]", new Object[0]);
          l1 = l2;
        }
      }
    }
  }

  private HttpURLConnection a(URL paramURL, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95830);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(this.bqu);
    localHttpURLConnection.setReadTimeout(this.bqv);
    if (this.bqx != null)
    {
      localObject = this.bqx.tv().entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramURL = (Map.Entry)((Iterator)localObject).next();
        localHttpURLConnection.setRequestProperty((String)paramURL.getKey(), (String)paramURL.getValue());
      }
    }
    Object localObject = this.bqy.tv().entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramURL = (Map.Entry)((Iterator)localObject).next();
      localHttpURLConnection.setRequestProperty((String)paramURL.getKey(), (String)paramURL.getValue());
    }
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      localObject = "bytes=" + paramLong1 + "-";
      paramURL = (URL)localObject;
      if (paramLong2 != -1L)
        paramURL = (String)localObject + (paramLong1 + paramLong2 - 1L);
      localHttpURLConnection.setRequestProperty("Range", paramURL);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", this.userAgent);
    if (!paramBoolean1)
      localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfByte != null)
    {
      paramBoolean1 = true;
      localHttpURLConnection.setDoOutput(paramBoolean1);
      if (paramArrayOfByte == null)
        break label358;
      localHttpURLConnection.setRequestMethod("POST");
      if (paramArrayOfByte.length == 0)
        break label358;
      localHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
      localHttpURLConnection.connect();
      paramURL = localHttpURLConnection.getOutputStream();
      paramURL.write(paramArrayOfByte);
      paramURL.close();
    }
    while (true)
    {
      AppMethodBeat.o(95830);
      return localHttpURLConnection;
      paramBoolean1 = false;
      break;
      label358: localHttpURLConnection.connect();
    }
  }

  private void tu()
  {
    AppMethodBeat.i(95832);
    if (this.connection != null);
    try
    {
      this.connection.disconnect();
      this.connection = null;
      AppMethodBeat.o(95832);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.e("DefaultHttpDataSource", "Unexpected error while disconnecting", new Object[] { localException });
    }
  }

  // ERROR //
  public final long a(i parami)
  {
    // Byte code:
    //   0: ldc_w 294
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: putfield 296	com/google/android/exoplayer2/h/n:bib	Lcom/google/android/exoplayer2/h/i;
    //   11: aload_0
    //   12: lconst_0
    //   13: putfield 298	com/google/android/exoplayer2/h/n:bqC	J
    //   16: aload_0
    //   17: lconst_0
    //   18: putfield 300	com/google/android/exoplayer2/h/n:bqB	J
    //   21: new 183	java/net/URL
    //   24: astore_2
    //   25: aload_2
    //   26: aload_1
    //   27: getfield 306	com/google/android/exoplayer2/h/i:uri	Landroid/net/Uri;
    //   30: invokevirtual 309	android/net/Uri:toString	()Ljava/lang/String;
    //   33: invokespecial 310	java/net/URL:<init>	(Ljava/lang/String;)V
    //   36: aload_1
    //   37: getfield 314	com/google/android/exoplayer2/h/i:bpP	[B
    //   40: astore_3
    //   41: aload_1
    //   42: getfield 317	com/google/android/exoplayer2/h/i:position	J
    //   45: lstore 4
    //   47: aload_1
    //   48: getfield 320	com/google/android/exoplayer2/h/i:bgY	J
    //   51: lstore 6
    //   53: aload_1
    //   54: invokevirtual 323	com/google/android/exoplayer2/h/i:to	()Z
    //   57: istore 8
    //   59: aload_0
    //   60: getfield 98	com/google/android/exoplayer2/h/n:bqt	Z
    //   63: ifne +121 -> 184
    //   66: aload_0
    //   67: aload_2
    //   68: aload_3
    //   69: lload 4
    //   71: lload 6
    //   73: iload 8
    //   75: iconst_1
    //   76: invokespecial 325	com/google/android/exoplayer2/h/n:a	(Ljava/net/URL;[BJJZZ)Ljava/net/HttpURLConnection;
    //   79: astore 9
    //   81: aload_0
    //   82: aload 9
    //   84: putfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   87: aload_0
    //   88: getfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   91: invokevirtual 329	java/net/HttpURLConnection:getResponseCode	()I
    //   94: istore 10
    //   96: ldc 141
    //   98: ldc_w 331
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: iload 10
    //   109: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: invokestatic 339	com/google/android/exoplayer2/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: iload 10
    //   118: sipush 200
    //   121: if_icmplt +11 -> 132
    //   124: iload 10
    //   126: sipush 299
    //   129: if_icmple +384 -> 513
    //   132: aload_0
    //   133: getfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   136: invokevirtual 342	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   139: astore_2
    //   140: aload_0
    //   141: invokespecial 344	com/google/android/exoplayer2/h/n:tu	()V
    //   144: new 346	com/google/android/exoplayer2/h/r$e
    //   147: dup
    //   148: iload 10
    //   150: aload_2
    //   151: aload_1
    //   152: invokespecial 349	com/google/android/exoplayer2/h/r$e:<init>	(ILjava/util/Map;Lcom/google/android/exoplayer2/h/i;)V
    //   155: astore_1
    //   156: iload 10
    //   158: sipush 416
    //   161: if_icmpne +15 -> 176
    //   164: aload_1
    //   165: new 351	com/google/android/exoplayer2/h/g
    //   168: dup
    //   169: invokespecial 352	com/google/android/exoplayer2/h/g:<init>	()V
    //   172: invokevirtual 356	com/google/android/exoplayer2/h/r$e:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   175: pop
    //   176: ldc_w 294
    //   179: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: aload_1
    //   183: athrow
    //   184: iconst_0
    //   185: istore 10
    //   187: iload 10
    //   189: iconst_1
    //   190: iadd
    //   191: istore 11
    //   193: iload 10
    //   195: bipush 20
    //   197: if_icmpgt +243 -> 440
    //   200: aload_0
    //   201: aload_2
    //   202: aload_3
    //   203: lload 4
    //   205: lload 6
    //   207: iload 8
    //   209: iconst_0
    //   210: invokespecial 325	com/google/android/exoplayer2/h/n:a	(Ljava/net/URL;[BJJZZ)Ljava/net/HttpURLConnection;
    //   213: astore 12
    //   215: aload 12
    //   217: invokevirtual 329	java/net/HttpURLConnection:getResponseCode	()I
    //   220: istore 10
    //   222: iload 10
    //   224: sipush 300
    //   227: if_icmpeq +55 -> 282
    //   230: iload 10
    //   232: sipush 301
    //   235: if_icmpeq +47 -> 282
    //   238: iload 10
    //   240: sipush 302
    //   243: if_icmpeq +39 -> 282
    //   246: iload 10
    //   248: sipush 303
    //   251: if_icmpeq +31 -> 282
    //   254: aload 12
    //   256: astore 9
    //   258: aload_3
    //   259: ifnonnull -178 -> 81
    //   262: iload 10
    //   264: sipush 307
    //   267: if_icmpeq +15 -> 282
    //   270: aload 12
    //   272: astore 9
    //   274: iload 10
    //   276: sipush 308
    //   279: if_icmpne -198 -> 81
    //   282: aconst_null
    //   283: astore_3
    //   284: aload 12
    //   286: ldc_w 358
    //   289: invokevirtual 117	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   292: astore 13
    //   294: aload 12
    //   296: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   299: aload 13
    //   301: ifnonnull +64 -> 365
    //   304: new 360	java/net/ProtocolException
    //   307: astore_2
    //   308: aload_2
    //   309: ldc_w 362
    //   312: invokespecial 363	java/net/ProtocolException:<init>	(Ljava/lang/String;)V
    //   315: ldc_w 294
    //   318: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: aload_2
    //   322: athrow
    //   323: astore_2
    //   324: new 365	com/google/android/exoplayer2/h/r$c
    //   327: dup
    //   328: new 143	java/lang/StringBuilder
    //   331: dup
    //   332: ldc_w 367
    //   335: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   338: aload_1
    //   339: getfield 306	com/google/android/exoplayer2/h/i:uri	Landroid/net/Uri;
    //   342: invokevirtual 309	android/net/Uri:toString	()Ljava/lang/String;
    //   345: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: aload_2
    //   352: aload_1
    //   353: invokespecial 370	com/google/android/exoplayer2/h/r$c:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/h/i;)V
    //   356: astore_1
    //   357: ldc_w 294
    //   360: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aload_1
    //   364: athrow
    //   365: new 183	java/net/URL
    //   368: astore 9
    //   370: aload 9
    //   372: aload_2
    //   373: aload 13
    //   375: invokespecial 373	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   378: aload 9
    //   380: invokevirtual 376	java/net/URL:getProtocol	()Ljava/lang/String;
    //   383: astore_2
    //   384: ldc_w 378
    //   387: aload_2
    //   388: invokevirtual 382	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   391: ifne +39 -> 430
    //   394: ldc_w 384
    //   397: aload_2
    //   398: invokevirtual 382	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   401: ifne +29 -> 430
    //   404: new 360	java/net/ProtocolException
    //   407: astore_3
    //   408: aload_3
    //   409: ldc_w 386
    //   412: aload_2
    //   413: invokestatic 389	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   416: invokevirtual 392	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   419: invokespecial 363	java/net/ProtocolException:<init>	(Ljava/lang/String;)V
    //   422: ldc_w 294
    //   425: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   428: aload_3
    //   429: athrow
    //   430: iload 11
    //   432: istore 10
    //   434: aload 9
    //   436: astore_2
    //   437: goto -250 -> 187
    //   440: new 394	java/net/NoRouteToHostException
    //   443: astore_2
    //   444: aload_2
    //   445: ldc_w 396
    //   448: iload 11
    //   450: invokestatic 398	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   453: invokevirtual 392	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   456: invokespecial 399	java/net/NoRouteToHostException:<init>	(Ljava/lang/String;)V
    //   459: ldc_w 294
    //   462: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: aload_2
    //   466: athrow
    //   467: astore_2
    //   468: aload_0
    //   469: invokespecial 344	com/google/android/exoplayer2/h/n:tu	()V
    //   472: new 365	com/google/android/exoplayer2/h/r$c
    //   475: dup
    //   476: new 143	java/lang/StringBuilder
    //   479: dup
    //   480: ldc_w 367
    //   483: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   486: aload_1
    //   487: getfield 306	com/google/android/exoplayer2/h/i:uri	Landroid/net/Uri;
    //   490: invokevirtual 309	android/net/Uri:toString	()Ljava/lang/String;
    //   493: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   499: aload_2
    //   500: aload_1
    //   501: invokespecial 370	com/google/android/exoplayer2/h/r$c:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/h/i;)V
    //   504: astore_1
    //   505: ldc_w 294
    //   508: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   511: aload_1
    //   512: athrow
    //   513: aload_0
    //   514: getfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   517: invokevirtual 402	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   520: astore_2
    //   521: aload_0
    //   522: getfield 85	com/google/android/exoplayer2/h/n:bqw	Lcom/google/android/exoplayer2/i/n;
    //   525: ifnull +38 -> 563
    //   528: aload_0
    //   529: getfield 85	com/google/android/exoplayer2/h/n:bqw	Lcom/google/android/exoplayer2/i/n;
    //   532: aload_2
    //   533: invokeinterface 407 2 0
    //   538: ifne +25 -> 563
    //   541: aload_0
    //   542: invokespecial 344	com/google/android/exoplayer2/h/n:tu	()V
    //   545: new 409	com/google/android/exoplayer2/h/r$d
    //   548: dup
    //   549: aload_2
    //   550: aload_1
    //   551: invokespecial 412	com/google/android/exoplayer2/h/r$d:<init>	(Ljava/lang/String;Lcom/google/android/exoplayer2/h/i;)V
    //   554: astore_1
    //   555: ldc_w 294
    //   558: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   561: aload_1
    //   562: athrow
    //   563: iload 10
    //   565: sipush 200
    //   568: if_icmpne +97 -> 665
    //   571: aload_1
    //   572: getfield 317	com/google/android/exoplayer2/h/i:position	J
    //   575: lconst_0
    //   576: lcmp
    //   577: ifeq +88 -> 665
    //   580: aload_1
    //   581: getfield 317	com/google/android/exoplayer2/h/i:position	J
    //   584: lstore 6
    //   586: aload_0
    //   587: lload 6
    //   589: putfield 414	com/google/android/exoplayer2/h/n:bqz	J
    //   592: aload_1
    //   593: invokevirtual 323	com/google/android/exoplayer2/h/i:to	()Z
    //   596: ifne +119 -> 715
    //   599: aload_1
    //   600: getfield 320	com/google/android/exoplayer2/h/i:bgY	J
    //   603: ldc2_w 108
    //   606: lcmp
    //   607: ifeq +64 -> 671
    //   610: aload_0
    //   611: aload_1
    //   612: getfield 320	com/google/android/exoplayer2/h/i:bgY	J
    //   615: putfield 416	com/google/android/exoplayer2/h/n:bqA	J
    //   618: aload_0
    //   619: aload_0
    //   620: getfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   623: invokevirtual 420	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   626: putfield 422	com/google/android/exoplayer2/h/n:azC	Ljava/io/InputStream;
    //   629: aload_0
    //   630: iconst_1
    //   631: putfield 424	com/google/android/exoplayer2/h/n:opened	Z
    //   634: aload_0
    //   635: getfield 87	com/google/android/exoplayer2/h/n:bpJ	Lcom/google/android/exoplayer2/h/u;
    //   638: ifnull +12 -> 650
    //   641: aload_0
    //   642: getfield 87	com/google/android/exoplayer2/h/n:bpJ	Lcom/google/android/exoplayer2/h/u;
    //   645: invokeinterface 429 1 0
    //   650: aload_0
    //   651: getfield 416	com/google/android/exoplayer2/h/n:bqA	J
    //   654: lstore 6
    //   656: ldc_w 294
    //   659: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   662: lload 6
    //   664: lreturn
    //   665: lconst_0
    //   666: lstore 6
    //   668: goto -82 -> 586
    //   671: aload_0
    //   672: getfield 285	com/google/android/exoplayer2/h/n:connection	Ljava/net/HttpURLConnection;
    //   675: invokestatic 431	com/google/android/exoplayer2/h/n:a	(Ljava/net/HttpURLConnection;)J
    //   678: lstore 6
    //   680: lload 6
    //   682: ldc2_w 108
    //   685: lcmp
    //   686: ifeq +21 -> 707
    //   689: lload 6
    //   691: aload_0
    //   692: getfield 414	com/google/android/exoplayer2/h/n:bqz	J
    //   695: lsub
    //   696: lstore 6
    //   698: aload_0
    //   699: lload 6
    //   701: putfield 416	com/google/android/exoplayer2/h/n:bqA	J
    //   704: goto -86 -> 618
    //   707: ldc2_w 108
    //   710: lstore 6
    //   712: goto -14 -> 698
    //   715: aload_0
    //   716: aload_1
    //   717: getfield 320	com/google/android/exoplayer2/h/i:bgY	J
    //   720: putfield 416	com/google/android/exoplayer2/h/n:bqA	J
    //   723: goto -105 -> 618
    //   726: astore_2
    //   727: aload_0
    //   728: invokespecial 344	com/google/android/exoplayer2/h/n:tu	()V
    //   731: new 365	com/google/android/exoplayer2/h/r$c
    //   734: dup
    //   735: aload_2
    //   736: aload_1
    //   737: iconst_1
    //   738: invokespecial 434	com/google/android/exoplayer2/h/r$c:<init>	(Ljava/io/IOException;Lcom/google/android/exoplayer2/h/i;I)V
    //   741: astore_1
    //   742: ldc_w 294
    //   745: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   748: aload_1
    //   749: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   21	81	323	java/io/IOException
    //   81	87	323	java/io/IOException
    //   200	222	323	java/io/IOException
    //   284	299	323	java/io/IOException
    //   304	323	323	java/io/IOException
    //   365	430	323	java/io/IOException
    //   440	467	323	java/io/IOException
    //   87	116	467	java/io/IOException
    //   618	629	726	java/io/IOException
  }

  public final void close()
  {
    AppMethodBeat.i(95829);
    while (true)
    {
      try
      {
        Object localObject1;
        long l1;
        int i;
        if (this.azC != null)
        {
          localObject1 = this.connection;
          if (this.bqA != -1L)
            continue;
          l1 = this.bqA;
          if (v.SDK_INT != 19)
          {
            i = v.SDK_INT;
            if (i != 20)
              continue;
          }
        }
        try
        {
          localObject1 = ((HttpURLConnection)localObject1).getInputStream();
          if (l1 == -1L)
          {
            i = ((InputStream)localObject1).read();
            if (i != -1)
              continue;
          }
        }
        catch (Exception localException)
        {
          try
          {
            this.azC.close();
            return;
            long l2 = this.bqA;
            l1 = this.bqC;
            l1 = l2 - l1;
            continue;
            if (l1 <= 2048L)
              continue;
            localObject3 = localObject1.getClass().getName();
            if ((!((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) && (!((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")))
              continue;
            localObject3 = localObject1.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method)localObject3).setAccessible(true);
            ((Method)localObject3).invoke(localObject1, new Object[0]);
            continue;
            localException = localException;
            continue;
          }
          catch (IOException localIOException)
          {
            Object localObject3 = new com/google/android/exoplayer2/h/r$c;
            ((r.c)localObject3).<init>(localIOException, this.bib, 3);
            AppMethodBeat.o(95829);
            throw ((Throwable)localObject3);
          }
        }
      }
      finally
      {
        this.azC = null;
        tu();
        if (this.opened)
        {
          this.opened = false;
          if (this.bpJ != null)
            this.bpJ.tr();
        }
        AppMethodBeat.o(95829);
      }
      AppMethodBeat.o(95829);
    }
  }

  public final Uri getUri()
  {
    AppMethodBeat.i(95826);
    Uri localUri;
    if (this.connection == null)
    {
      localUri = null;
      AppMethodBeat.o(95826);
    }
    while (true)
    {
      return localUri;
      localUri = Uri.parse(this.connection.getURL().toString());
      AppMethodBeat.o(95826);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95828);
    byte[] arrayOfByte2;
    int i;
    while (true)
    {
      try
      {
        if (this.bqB == this.bqz)
          break label199;
        byte[] arrayOfByte1 = (byte[])bqs.getAndSet(null);
        arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null)
          arrayOfByte2 = new byte[4096];
        if (this.bqB == this.bqz)
          break;
        i = (int)Math.min(this.bqz - this.bqB, arrayOfByte2.length);
        i = this.azC.read(arrayOfByte2, 0, i);
        if (Thread.interrupted())
        {
          paramArrayOfByte = new java/io/InterruptedIOException;
          paramArrayOfByte.<init>();
          AppMethodBeat.o(95828);
          throw paramArrayOfByte;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        paramArrayOfByte = new r.c(paramArrayOfByte, this.bib, 2);
        AppMethodBeat.o(95828);
        throw paramArrayOfByte;
      }
      if (i == -1)
      {
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        AppMethodBeat.o(95828);
        throw paramArrayOfByte;
      }
      this.bqB += i;
      if (this.bpJ != null)
        this.bpJ.eK(i);
    }
    bqs.set(arrayOfByte2);
    label199: if (paramInt2 == 0)
    {
      AppMethodBeat.o(95828);
      paramInt1 = 0;
    }
    while (true)
    {
      return paramInt1;
      i = paramInt2;
      if (this.bqA != -1L)
      {
        long l = this.bqA - this.bqC;
        if (l == 0L)
        {
          AppMethodBeat.o(95828);
          paramInt1 = -1;
        }
        else
        {
          i = (int)Math.min(paramInt2, l);
        }
      }
      else
      {
        paramInt1 = this.azC.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 == -1)
        {
          if (this.bqA != -1L)
          {
            paramArrayOfByte = new java/io/EOFException;
            paramArrayOfByte.<init>();
            AppMethodBeat.o(95828);
            throw paramArrayOfByte;
          }
          AppMethodBeat.o(95828);
          paramInt1 = -1;
        }
        else
        {
          this.bqC += paramInt1;
          if (this.bpJ != null)
            this.bpJ.eK(paramInt1);
          AppMethodBeat.o(95828);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.n
 * JD-Core Version:    0.6.2
 */