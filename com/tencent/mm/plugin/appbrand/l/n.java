package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class n
  implements X509TrustManager
{
  private LinkedList<X509TrustManager> ipi;
  private LinkedList<X509TrustManager> ipj;
  private KeyStore ipk;
  private int ipl;
  private List<String> ipm;
  private KeyStore ipn;
  private X509Certificate[] ipo;

  public n()
  {
    AppMethodBeat.i(108252);
    this.ipm = null;
    this.ipn = null;
    this.ipi = new LinkedList();
    this.ipj = new LinkedList();
    try
    {
      this.ipk = KeyStore.getInstance(KeyStore.getDefaultType());
      this.ipk.load(null, null);
      AppMethodBeat.o(108252);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", localException, "Exception: Local KeyStore init failed", new Object[0]);
        AppMethodBeat.o(108252);
      }
    }
  }

  public n(int paramInt)
  {
    AppMethodBeat.i(108253);
    this.ipm = null;
    this.ipn = null;
    this.ipi = new LinkedList();
    this.ipj = new LinkedList();
    this.ipl = paramInt;
    try
    {
      this.ipk = KeyStore.getInstance(KeyStore.getDefaultType());
      this.ipk.load(null, null);
      AppMethodBeat.o(108253);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", localException, "Exception: Local KeyStore init failed", new Object[0]);
        AppMethodBeat.o(108253);
      }
    }
  }

  private void aIK()
  {
    AppMethodBeat.i(108258);
    try
    {
      Object localObject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      ((TrustManagerFactory)localObject).init(null);
      localObject = ((TrustManagerFactory)localObject).getTrustManagers();
      for (int i = 0; (localObject != null) && (i < localObject.length); i++)
        this.ipi.add((X509TrustManager)localObject[i]);
      AppMethodBeat.o(108258);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", localException, "Exception: init SystemTrustManager", new Object[0]);
        AppMethodBeat.o(108258);
      }
    }
  }

  private void aIL()
  {
    AppMethodBeat.i(108259);
    if (this.ipk == null)
      AppMethodBeat.o(108259);
    while (true)
    {
      return;
      try
      {
        Object localObject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        ((TrustManagerFactory)localObject).init(this.ipk);
        localObject = ((TrustManagerFactory)localObject).getTrustManagers();
        for (int i = 0; (localObject != null) && (i < localObject.length); i++)
          this.ipj.add((X509TrustManager)localObject[i]);
        AppMethodBeat.o(108259);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandX509TrustManager", localException, "Exception: init LocalTrustManager", new Object[0]);
        AppMethodBeat.o(108259);
      }
    }
  }

  private void aIM()
  {
    AppMethodBeat.i(108260);
    ArrayList localArrayList = new ArrayList();
    long l1 = System.currentTimeMillis();
    Iterator localIterator = this.ipi.iterator();
    X509Certificate[] arrayOfX509Certificate;
    while (localIterator.hasNext())
    {
      arrayOfX509Certificate = ((X509TrustManager)localIterator.next()).getAcceptedIssuers();
      if (arrayOfX509Certificate != null)
        localArrayList.addAll(Arrays.asList(arrayOfX509Certificate));
    }
    long l2 = System.currentTimeMillis();
    localIterator = this.ipj.iterator();
    while (localIterator.hasNext())
    {
      arrayOfX509Certificate = ((X509TrustManager)localIterator.next()).getAcceptedIssuers();
      if (arrayOfX509Certificate != null)
        localArrayList.addAll(Arrays.asList(arrayOfX509Certificate));
    }
    long l3 = System.currentTimeMillis();
    this.ipo = new X509Certificate[localArrayList.size()];
    this.ipo = ((X509Certificate[])localArrayList.toArray(this.ipo));
    ab.i("MicroMsg.AppBrandX509TrustManager", "initAcceptedIssuers: %d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(System.currentTimeMillis() - l3) });
    AppMethodBeat.o(108260);
  }

  // ERROR //
  public final void B(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 171
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 56	com/tencent/mm/plugin/appbrand/l/n:ipk	Ljava/security/KeyStore;
    //   9: ifnonnull +16 -> 25
    //   12: ldc 65
    //   14: ldc 173
    //   16: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 171
    //   21: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: return
    //   25: ldc 179
    //   27: invokestatic 184	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   30: astore_2
    //   31: aload_2
    //   32: aload_1
    //   33: invokevirtual 188	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   36: astore_2
    //   37: aload_1
    //   38: invokevirtual 193	java/io/InputStream:close	()V
    //   41: aload_0
    //   42: getfield 56	com/tencent/mm/plugin/appbrand/l/n:ipk	Ljava/security/KeyStore;
    //   45: astore_1
    //   46: new 195	java/lang/StringBuilder
    //   49: astore_3
    //   50: aload_3
    //   51: invokespecial 196	java/lang/StringBuilder:<init>	()V
    //   54: aload_1
    //   55: aload_3
    //   56: aload_2
    //   57: checkcast 150	java/security/cert/X509Certificate
    //   60: invokevirtual 200	java/security/cert/X509Certificate:getSubjectDN	()Ljava/security/Principal;
    //   63: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: aload_2
    //   70: invokevirtual 211	java/security/KeyStore:setCertificateEntry	(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    //   73: ldc 171
    //   75: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: goto -54 -> 24
    //   81: astore_2
    //   82: aload_1
    //   83: invokevirtual 193	java/io/InputStream:close	()V
    //   86: ldc 171
    //   88: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: aload_2
    //   92: athrow
    //   93: astore_1
    //   94: ldc 65
    //   96: aload_1
    //   97: ldc 213
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: ldc 171
    //   108: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: goto -87 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   31	37	81	finally
    //   25	31	93	java/lang/Exception
    //   37	73	93	java/lang/Exception
    //   82	93	93	java/lang/Exception
  }

  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    AppMethodBeat.i(108256);
    paramArrayOfX509Certificate = new CertificateException("Client Certification not supported");
    AppMethodBeat.o(108256);
    throw paramArrayOfX509Certificate;
  }

  // ERROR //
  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    // Byte code:
    //   0: ldc 231
    //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 233
    //   7: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   10: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   13: ldc2_w 240
    //   16: lconst_0
    //   17: lconst_1
    //   18: invokeinterface 245 7 0
    //   23: ldc 65
    //   25: new 195	java/lang/StringBuilder
    //   28: dup
    //   29: ldc 247
    //   31: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_0
    //   35: getfield 42	com/tencent/mm/plugin/appbrand/l/n:ipi	Ljava/util/LinkedList;
    //   38: invokevirtual 249	java/util/LinkedList:size	()I
    //   41: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   44: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_0
    //   51: getfield 42	com/tencent/mm/plugin/appbrand/l/n:ipi	Ljava/util/LinkedList;
    //   54: invokevirtual 120	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   57: astore_3
    //   58: iconst_0
    //   59: istore 4
    //   61: aload_3
    //   62: invokeinterface 126 1 0
    //   67: ifeq +83 -> 150
    //   70: aload_3
    //   71: invokeinterface 130 1 0
    //   76: checkcast 6	javax/net/ssl/X509TrustManager
    //   79: astore 5
    //   81: new 195	java/lang/StringBuilder
    //   84: astore 6
    //   86: aload 6
    //   88: ldc_w 256
    //   91: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: ldc 65
    //   96: aload 6
    //   98: aload 5
    //   100: invokevirtual 257	java/lang/Object:toString	()Ljava/lang/String;
    //   103: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload 5
    //   114: aload_1
    //   115: aload_2
    //   116: invokeinterface 262 3 0
    //   121: ldc 65
    //   123: new 195	java/lang/StringBuilder
    //   126: dup
    //   127: ldc_w 264
    //   130: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: aload 5
    //   135: invokevirtual 257	java/lang/Object:toString	()Ljava/lang/String;
    //   138: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: iconst_1
    //   148: istore 4
    //   150: iload 4
    //   152: ifeq +54 -> 206
    //   155: ldc 65
    //   157: ldc_w 266
    //   160: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: ldc 233
    //   165: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   168: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   171: ldc2_w 240
    //   174: lconst_1
    //   175: lconst_1
    //   176: invokeinterface 245 7 0
    //   181: ldc 231
    //   183: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: return
    //   187: astore 6
    //   189: ldc 65
    //   191: aload 6
    //   193: ldc_w 268
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: goto -145 -> 58
    //   206: ldc 65
    //   208: ldc_w 270
    //   211: iconst_1
    //   212: anewarray 4	java/lang/Object
    //   215: dup
    //   216: iconst_0
    //   217: aload_0
    //   218: getfield 44	com/tencent/mm/plugin/appbrand/l/n:ipj	Ljava/util/LinkedList;
    //   221: invokevirtual 249	java/util/LinkedList:size	()I
    //   224: invokestatic 275	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   227: aastore
    //   228: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: aload_0
    //   232: getfield 44	com/tencent/mm/plugin/appbrand/l/n:ipj	Ljava/util/LinkedList;
    //   235: invokevirtual 120	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   238: astore_3
    //   239: iconst_0
    //   240: istore 4
    //   242: aload_3
    //   243: invokeinterface 126 1 0
    //   248: ifeq +52 -> 300
    //   251: aload_3
    //   252: invokeinterface 130 1 0
    //   257: checkcast 6	javax/net/ssl/X509TrustManager
    //   260: astore 6
    //   262: aload 6
    //   264: aload_1
    //   265: aload_2
    //   266: invokeinterface 262 3 0
    //   271: ldc 65
    //   273: new 195	java/lang/StringBuilder
    //   276: dup
    //   277: ldc_w 277
    //   280: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   283: aload 6
    //   285: invokevirtual 257	java/lang/Object:toString	()Ljava/lang/String;
    //   288: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: iconst_1
    //   298: istore 4
    //   300: iload 4
    //   302: ifeq +58 -> 360
    //   305: ldc 65
    //   307: ldc_w 279
    //   310: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: ldc 233
    //   315: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   318: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   321: ldc2_w 240
    //   324: ldc2_w 280
    //   327: lconst_1
    //   328: invokeinterface 245 7 0
    //   333: ldc 231
    //   335: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   338: goto -152 -> 186
    //   341: astore 6
    //   343: ldc 65
    //   345: aload 6
    //   347: ldc_w 283
    //   350: iconst_0
    //   351: anewarray 4	java/lang/Object
    //   354: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   357: goto -118 -> 239
    //   360: aload_0
    //   361: getfield 77	com/tencent/mm/plugin/appbrand/l/n:ipl	I
    //   364: iconst_1
    //   365: if_icmpeq +11 -> 376
    //   368: aload_0
    //   369: getfield 77	com/tencent/mm/plugin/appbrand/l/n:ipl	I
    //   372: iconst_2
    //   373: if_icmpne +967 -> 1340
    //   376: ldc 65
    //   378: ldc_w 285
    //   381: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   384: iconst_0
    //   385: istore 7
    //   387: iconst_0
    //   388: istore 8
    //   390: iconst_0
    //   391: istore 9
    //   393: iconst_0
    //   394: istore 10
    //   396: iconst_0
    //   397: istore 11
    //   399: iload 10
    //   401: istore 4
    //   403: aload_0
    //   404: getfield 37	com/tencent/mm/plugin/appbrand/l/n:ipn	Ljava/security/KeyStore;
    //   407: ifnonnull +30 -> 437
    //   410: iload 10
    //   412: istore 4
    //   414: aload_0
    //   415: ldc_w 287
    //   418: invokestatic 54	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   421: putfield 37	com/tencent/mm/plugin/appbrand/l/n:ipn	Ljava/security/KeyStore;
    //   424: iload 10
    //   426: istore 4
    //   428: aload_0
    //   429: getfield 37	com/tencent/mm/plugin/appbrand/l/n:ipn	Ljava/security/KeyStore;
    //   432: aconst_null
    //   433: aconst_null
    //   434: invokevirtual 60	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   437: iload 10
    //   439: istore 4
    //   441: aload_0
    //   442: getfield 35	com/tencent/mm/plugin/appbrand/l/n:ipm	Ljava/util/List;
    //   445: ifnonnull +186 -> 631
    //   448: iload 10
    //   450: istore 4
    //   452: new 109	java/util/ArrayList
    //   455: astore_2
    //   456: iload 10
    //   458: istore 4
    //   460: aload_2
    //   461: invokespecial 110	java/util/ArrayList:<init>	()V
    //   464: iload 10
    //   466: istore 4
    //   468: aload_0
    //   469: aload_2
    //   470: putfield 35	com/tencent/mm/plugin/appbrand/l/n:ipm	Ljava/util/List;
    //   473: iload 10
    //   475: istore 4
    //   477: aload_0
    //   478: getfield 37	com/tencent/mm/plugin/appbrand/l/n:ipn	Ljava/security/KeyStore;
    //   481: invokevirtual 291	java/security/KeyStore:aliases	()Ljava/util/Enumeration;
    //   484: astore_2
    //   485: iload 10
    //   487: istore 4
    //   489: aload_2
    //   490: invokeinterface 296 1 0
    //   495: ifeq +136 -> 631
    //   498: iload 10
    //   500: istore 4
    //   502: aload_2
    //   503: invokeinterface 299 1 0
    //   508: checkcast 301	java/lang/String
    //   511: astore_3
    //   512: aload_3
    //   513: ifnull -28 -> 485
    //   516: iload 10
    //   518: istore 4
    //   520: aload_3
    //   521: ldc_w 303
    //   524: invokevirtual 307	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   527: ifeq -42 -> 485
    //   530: iload 10
    //   532: istore 4
    //   534: aload_0
    //   535: getfield 35	com/tencent/mm/plugin/appbrand/l/n:ipm	Ljava/util/List;
    //   538: aload_3
    //   539: invokeinterface 310 2 0
    //   544: pop
    //   545: goto -60 -> 485
    //   548: astore_1
    //   549: iload 11
    //   551: istore 4
    //   553: ldc 65
    //   555: aload_1
    //   556: ldc_w 312
    //   559: iconst_0
    //   560: anewarray 4	java/lang/Object
    //   563: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   566: iload 11
    //   568: istore 4
    //   570: ldc 233
    //   572: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   575: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   578: ldc2_w 240
    //   581: ldc2_w 313
    //   584: lconst_1
    //   585: invokeinterface 245 7 0
    //   590: iload 11
    //   592: ifeq +286 -> 878
    //   595: ldc 65
    //   597: ldc_w 316
    //   600: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   603: ldc 233
    //   605: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   608: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   611: ldc2_w 240
    //   614: ldc2_w 317
    //   617: lconst_1
    //   618: invokeinterface 245 7 0
    //   623: ldc 231
    //   625: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   628: goto -442 -> 186
    //   631: iload 10
    //   633: istore 4
    //   635: aload_0
    //   636: getfield 35	com/tencent/mm/plugin/appbrand/l/n:ipm	Ljava/util/List;
    //   639: invokeinterface 319 1 0
    //   644: ifle +108 -> 752
    //   647: iload 10
    //   649: istore 4
    //   651: aload_0
    //   652: getfield 35	com/tencent/mm/plugin/appbrand/l/n:ipm	Ljava/util/List;
    //   655: invokeinterface 320 1 0
    //   660: astore_2
    //   661: iconst_0
    //   662: istore 4
    //   664: iload 4
    //   666: istore 11
    //   668: aload_2
    //   669: invokeinterface 126 1 0
    //   674: ifeq +117 -> 791
    //   677: aload_2
    //   678: invokeinterface 130 1 0
    //   683: checkcast 301	java/lang/String
    //   686: astore_3
    //   687: aload_0
    //   688: getfield 37	com/tencent/mm/plugin/appbrand/l/n:ipn	Ljava/security/KeyStore;
    //   691: aload_3
    //   692: invokevirtual 324	java/security/KeyStore:getCertificate	(Ljava/lang/String;)Ljava/security/cert/Certificate;
    //   695: checkcast 150	java/security/cert/X509Certificate
    //   698: astore_3
    //   699: iconst_0
    //   700: istore 11
    //   702: aload_1
    //   703: arraylength
    //   704: istore 7
    //   706: iload 11
    //   708: iload 7
    //   710: if_icmpge -46 -> 664
    //   713: aload_1
    //   714: iload 11
    //   716: aaload
    //   717: aload_3
    //   718: invokevirtual 328	java/security/cert/X509Certificate:getPublicKey	()Ljava/security/PublicKey;
    //   721: invokevirtual 332	java/security/cert/X509Certificate:verify	(Ljava/security/PublicKey;)V
    //   724: iconst_1
    //   725: istore 4
    //   727: goto -63 -> 664
    //   730: astore 6
    //   732: ldc 65
    //   734: aload 6
    //   736: ldc_w 334
    //   739: iconst_0
    //   740: anewarray 4	java/lang/Object
    //   743: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   746: iinc 11 1
    //   749: goto -47 -> 702
    //   752: iload 10
    //   754: istore 4
    //   756: ldc 65
    //   758: ldc_w 336
    //   761: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   764: iload 10
    //   766: istore 4
    //   768: ldc 233
    //   770: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   773: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   776: ldc2_w 240
    //   779: ldc2_w 337
    //   782: lconst_1
    //   783: invokeinterface 245 7 0
    //   788: iconst_0
    //   789: istore 11
    //   791: iload 11
    //   793: ifeq +39 -> 832
    //   796: ldc 65
    //   798: ldc_w 316
    //   801: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   804: ldc 233
    //   806: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   809: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   812: ldc2_w 240
    //   815: ldc2_w 317
    //   818: lconst_1
    //   819: invokeinterface 245 7 0
    //   824: ldc 231
    //   826: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   829: goto -643 -> 186
    //   832: ldc 65
    //   834: ldc_w 340
    //   837: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   840: ldc 233
    //   842: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   845: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   848: ldc2_w 240
    //   851: ldc2_w 341
    //   854: lconst_1
    //   855: invokeinterface 245 7 0
    //   860: new 218	java/security/cert/CertificateException
    //   863: dup
    //   864: ldc_w 344
    //   867: invokespecial 223	java/security/cert/CertificateException:<init>	(Ljava/lang/String;)V
    //   870: astore_1
    //   871: ldc 231
    //   873: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   876: aload_1
    //   877: athrow
    //   878: ldc 65
    //   880: ldc_w 340
    //   883: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   886: ldc 233
    //   888: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   891: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   894: ldc2_w 240
    //   897: ldc2_w 341
    //   900: lconst_1
    //   901: invokeinterface 245 7 0
    //   906: goto -46 -> 860
    //   909: astore_1
    //   910: iload 7
    //   912: istore 11
    //   914: iload 11
    //   916: istore 4
    //   918: ldc 65
    //   920: aload_1
    //   921: ldc_w 346
    //   924: iconst_0
    //   925: anewarray 4	java/lang/Object
    //   928: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   931: iload 11
    //   933: istore 4
    //   935: ldc 233
    //   937: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   940: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   943: ldc2_w 240
    //   946: ldc2_w 347
    //   949: lconst_1
    //   950: invokeinterface 245 7 0
    //   955: iload 11
    //   957: ifeq +39 -> 996
    //   960: ldc 65
    //   962: ldc_w 316
    //   965: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   968: ldc 233
    //   970: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   973: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   976: ldc2_w 240
    //   979: ldc2_w 317
    //   982: lconst_1
    //   983: invokeinterface 245 7 0
    //   988: ldc 231
    //   990: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   993: goto -807 -> 186
    //   996: ldc 65
    //   998: ldc_w 340
    //   1001: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1004: ldc 233
    //   1006: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1009: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1012: ldc2_w 240
    //   1015: ldc2_w 341
    //   1018: lconst_1
    //   1019: invokeinterface 245 7 0
    //   1024: goto -164 -> 860
    //   1027: astore_1
    //   1028: iload 8
    //   1030: istore 11
    //   1032: iload 11
    //   1034: istore 4
    //   1036: ldc 65
    //   1038: aload_1
    //   1039: ldc_w 350
    //   1042: iconst_0
    //   1043: anewarray 4	java/lang/Object
    //   1046: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1049: iload 11
    //   1051: istore 4
    //   1053: ldc 233
    //   1055: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1058: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1061: ldc2_w 240
    //   1064: ldc2_w 351
    //   1067: lconst_1
    //   1068: invokeinterface 245 7 0
    //   1073: iload 11
    //   1075: ifeq +39 -> 1114
    //   1078: ldc 65
    //   1080: ldc_w 316
    //   1083: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1086: ldc 233
    //   1088: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1091: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1094: ldc2_w 240
    //   1097: ldc2_w 317
    //   1100: lconst_1
    //   1101: invokeinterface 245 7 0
    //   1106: ldc 231
    //   1108: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1111: goto -925 -> 186
    //   1114: ldc 65
    //   1116: ldc_w 340
    //   1119: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1122: ldc 233
    //   1124: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1127: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1130: ldc2_w 240
    //   1133: ldc2_w 341
    //   1136: lconst_1
    //   1137: invokeinterface 245 7 0
    //   1142: goto -282 -> 860
    //   1145: astore_1
    //   1146: iload 9
    //   1148: istore 11
    //   1150: iload 11
    //   1152: istore 4
    //   1154: ldc 65
    //   1156: aload_1
    //   1157: ldc_w 354
    //   1160: iconst_0
    //   1161: anewarray 4	java/lang/Object
    //   1164: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1167: iload 11
    //   1169: istore 4
    //   1171: ldc 233
    //   1173: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1176: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1179: ldc2_w 240
    //   1182: ldc2_w 355
    //   1185: lconst_1
    //   1186: invokeinterface 245 7 0
    //   1191: iload 11
    //   1193: ifeq +39 -> 1232
    //   1196: ldc 65
    //   1198: ldc_w 316
    //   1201: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1204: ldc 233
    //   1206: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1209: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1212: ldc2_w 240
    //   1215: ldc2_w 317
    //   1218: lconst_1
    //   1219: invokeinterface 245 7 0
    //   1224: ldc 231
    //   1226: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1229: goto -1043 -> 186
    //   1232: ldc 65
    //   1234: ldc_w 340
    //   1237: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1240: ldc 233
    //   1242: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1245: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1248: ldc2_w 240
    //   1251: ldc2_w 341
    //   1254: lconst_1
    //   1255: invokeinterface 245 7 0
    //   1260: goto -400 -> 860
    //   1263: astore_1
    //   1264: iload 4
    //   1266: ifeq +39 -> 1305
    //   1269: ldc 65
    //   1271: ldc_w 316
    //   1274: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1277: ldc 233
    //   1279: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1282: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1285: ldc2_w 240
    //   1288: ldc2_w 317
    //   1291: lconst_1
    //   1292: invokeinterface 245 7 0
    //   1297: ldc 231
    //   1299: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1302: goto -1116 -> 186
    //   1305: ldc 65
    //   1307: ldc_w 340
    //   1310: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1313: ldc 233
    //   1315: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1318: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1321: ldc2_w 240
    //   1324: ldc2_w 341
    //   1327: lconst_1
    //   1328: invokeinterface 245 7 0
    //   1333: ldc 231
    //   1335: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1338: aload_1
    //   1339: athrow
    //   1340: ldc 233
    //   1342: invokestatic 239	com/tencent/luggage/a/e:C	(Ljava/lang/Class;)Lcom/tencent/luggage/a/d;
    //   1345: checkcast 233	com/tencent/mm/plugin/appbrand/n/a
    //   1348: ldc2_w 240
    //   1351: ldc2_w 357
    //   1354: lconst_1
    //   1355: invokeinterface 245 7 0
    //   1360: goto -500 -> 860
    //   1363: astore_1
    //   1364: goto -100 -> 1264
    //   1367: astore_1
    //   1368: iload 4
    //   1370: istore 11
    //   1372: goto -222 -> 1150
    //   1375: astore_1
    //   1376: iload 4
    //   1378: istore 11
    //   1380: goto -348 -> 1032
    //   1383: astore_1
    //   1384: iload 4
    //   1386: istore 11
    //   1388: goto -474 -> 914
    //   1391: astore_1
    //   1392: iload 4
    //   1394: istore 11
    //   1396: goto -847 -> 549
    //
    // Exception table:
    //   from	to	target	type
    //   81	121	187	java/security/cert/CertificateException
    //   262	271	341	java/security/cert/CertificateException
    //   403	410	548	java/security/KeyStoreException
    //   414	424	548	java/security/KeyStoreException
    //   428	437	548	java/security/KeyStoreException
    //   441	448	548	java/security/KeyStoreException
    //   452	456	548	java/security/KeyStoreException
    //   460	464	548	java/security/KeyStoreException
    //   468	473	548	java/security/KeyStoreException
    //   477	485	548	java/security/KeyStoreException
    //   489	498	548	java/security/KeyStoreException
    //   502	512	548	java/security/KeyStoreException
    //   520	530	548	java/security/KeyStoreException
    //   534	545	548	java/security/KeyStoreException
    //   635	647	548	java/security/KeyStoreException
    //   651	661	548	java/security/KeyStoreException
    //   756	764	548	java/security/KeyStoreException
    //   768	788	548	java/security/KeyStoreException
    //   713	724	730	java/lang/Exception
    //   403	410	909	java/security/NoSuchAlgorithmException
    //   414	424	909	java/security/NoSuchAlgorithmException
    //   428	437	909	java/security/NoSuchAlgorithmException
    //   441	448	909	java/security/NoSuchAlgorithmException
    //   452	456	909	java/security/NoSuchAlgorithmException
    //   460	464	909	java/security/NoSuchAlgorithmException
    //   468	473	909	java/security/NoSuchAlgorithmException
    //   477	485	909	java/security/NoSuchAlgorithmException
    //   489	498	909	java/security/NoSuchAlgorithmException
    //   502	512	909	java/security/NoSuchAlgorithmException
    //   520	530	909	java/security/NoSuchAlgorithmException
    //   534	545	909	java/security/NoSuchAlgorithmException
    //   635	647	909	java/security/NoSuchAlgorithmException
    //   651	661	909	java/security/NoSuchAlgorithmException
    //   756	764	909	java/security/NoSuchAlgorithmException
    //   768	788	909	java/security/NoSuchAlgorithmException
    //   403	410	1027	java/io/IOException
    //   414	424	1027	java/io/IOException
    //   428	437	1027	java/io/IOException
    //   441	448	1027	java/io/IOException
    //   452	456	1027	java/io/IOException
    //   460	464	1027	java/io/IOException
    //   468	473	1027	java/io/IOException
    //   477	485	1027	java/io/IOException
    //   489	498	1027	java/io/IOException
    //   502	512	1027	java/io/IOException
    //   520	530	1027	java/io/IOException
    //   534	545	1027	java/io/IOException
    //   635	647	1027	java/io/IOException
    //   651	661	1027	java/io/IOException
    //   756	764	1027	java/io/IOException
    //   768	788	1027	java/io/IOException
    //   403	410	1145	java/lang/Exception
    //   414	424	1145	java/lang/Exception
    //   428	437	1145	java/lang/Exception
    //   441	448	1145	java/lang/Exception
    //   452	456	1145	java/lang/Exception
    //   460	464	1145	java/lang/Exception
    //   468	473	1145	java/lang/Exception
    //   477	485	1145	java/lang/Exception
    //   489	498	1145	java/lang/Exception
    //   502	512	1145	java/lang/Exception
    //   520	530	1145	java/lang/Exception
    //   534	545	1145	java/lang/Exception
    //   635	647	1145	java/lang/Exception
    //   651	661	1145	java/lang/Exception
    //   756	764	1145	java/lang/Exception
    //   768	788	1145	java/lang/Exception
    //   403	410	1263	finally
    //   414	424	1263	finally
    //   428	437	1263	finally
    //   441	448	1263	finally
    //   452	456	1263	finally
    //   460	464	1263	finally
    //   468	473	1263	finally
    //   477	485	1263	finally
    //   489	498	1263	finally
    //   502	512	1263	finally
    //   520	530	1263	finally
    //   534	545	1263	finally
    //   553	566	1263	finally
    //   570	590	1263	finally
    //   635	647	1263	finally
    //   651	661	1263	finally
    //   756	764	1263	finally
    //   768	788	1263	finally
    //   918	931	1263	finally
    //   935	955	1263	finally
    //   1036	1049	1263	finally
    //   1053	1073	1263	finally
    //   1154	1167	1263	finally
    //   1171	1191	1263	finally
    //   668	699	1363	finally
    //   702	706	1363	finally
    //   713	724	1363	finally
    //   732	746	1363	finally
    //   668	699	1367	java/lang/Exception
    //   702	706	1367	java/lang/Exception
    //   732	746	1367	java/lang/Exception
    //   668	699	1375	java/io/IOException
    //   702	706	1375	java/io/IOException
    //   713	724	1375	java/io/IOException
    //   732	746	1375	java/io/IOException
    //   668	699	1383	java/security/NoSuchAlgorithmException
    //   702	706	1383	java/security/NoSuchAlgorithmException
    //   713	724	1383	java/security/NoSuchAlgorithmException
    //   732	746	1383	java/security/NoSuchAlgorithmException
    //   668	699	1391	java/security/KeyStoreException
    //   702	706	1391	java/security/KeyStoreException
    //   713	724	1391	java/security/KeyStoreException
    //   732	746	1391	java/security/KeyStoreException
  }

  public final X509Certificate[] getAcceptedIssuers()
  {
    return this.ipo;
  }

  public final void init()
  {
    AppMethodBeat.i(108255);
    aIK();
    aIL();
    aIM();
    AppMethodBeat.o(108255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.n
 * JD-Core Version:    0.6.2
 */