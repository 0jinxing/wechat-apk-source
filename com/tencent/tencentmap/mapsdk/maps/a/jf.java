package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bf;

public class jf extends hf
{
  private Context a;
  private bf b;
  private byte[] c;
  private String d;
  private String e;
  private f f;

  public jf(iz paramiz)
  {
    AppMethodBeat.i(100030);
    this.b = new bf();
    this.c = null;
    this.d = "UNKNOW";
    this.e = "";
    this.a = paramiz.i();
    this.d = this.a.getClass().getSimpleName();
    this.a = this.a.getApplicationContext();
    this.f = paramiz.b();
    AppMethodBeat.o(100030);
  }

  // ERROR //
  public byte[] a(String paramString)
  {
    // Byte code:
    //   0: ldc 81
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 49	com/tencent/tencentmap/mapsdk/maps/a/jf:a	Landroid/content/Context;
    //   9: ifnull +17 -> 26
    //   12: aload_1
    //   13: ifnull +13 -> 26
    //   16: aload_1
    //   17: invokevirtual 86	java/lang/String:trim	()Ljava/lang/String;
    //   20: invokevirtual 90	java/lang/String:length	()I
    //   23: ifne +12 -> 35
    //   26: ldc 81
    //   28: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: aconst_null
    //   32: astore_1
    //   33: aload_1
    //   34: areturn
    //   35: aload_0
    //   36: getfield 71	com/tencent/tencentmap/mapsdk/maps/a/jf:f	Lcom/tencent/map/lib/f;
    //   39: ifnull +52 -> 91
    //   42: aload_0
    //   43: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/jf:e	Ljava/lang/String;
    //   46: invokestatic 96	com/tencent/map/lib/util/StringUtil:isEmpty	(Ljava/lang/String;)Z
    //   49: ifeq +42 -> 91
    //   52: aload_0
    //   53: getfield 71	com/tencent/tencentmap/mapsdk/maps/a/jf:f	Lcom/tencent/map/lib/f;
    //   56: invokevirtual 101	com/tencent/map/lib/f:G	()Ljava/lang/String;
    //   59: invokestatic 96	com/tencent/map/lib/util/StringUtil:isEmpty	(Ljava/lang/String;)Z
    //   62: ifne +29 -> 91
    //   65: aload_0
    //   66: new 103	java/lang/StringBuilder
    //   69: dup
    //   70: ldc 105
    //   72: invokespecial 108	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload_0
    //   76: getfield 71	com/tencent/tencentmap/mapsdk/maps/a/jf:f	Lcom/tencent/map/lib/f;
    //   79: invokevirtual 101	com/tencent/map/lib/f:G	()Ljava/lang/String;
    //   82: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: putfield 42	com/tencent/tencentmap/mapsdk/maps/a/jf:e	Ljava/lang/String;
    //   91: aload_0
    //   92: getfield 32	com/tencent/tencentmap/mapsdk/maps/a/jf:b	Lcom/tencent/tencentmap/mapsdk/a/bf;
    //   95: aload_1
    //   96: invokevirtual 117	com/tencent/tencentmap/mapsdk/a/bf:a	(Ljava/lang/String;)Z
    //   99: ifne +13 -> 112
    //   102: ldc 81
    //   104: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aconst_null
    //   108: astore_1
    //   109: goto -76 -> 33
    //   112: aload_1
    //   113: astore_2
    //   114: aload_1
    //   115: ifnull +28 -> 143
    //   118: aload_1
    //   119: ldc 119
    //   121: ldc 121
    //   123: invokevirtual 125	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   126: ldc 127
    //   128: invokestatic 131	com/tencent/tencentmap/mapsdk/maps/a/hs:b	()Ljava/lang/String;
    //   131: invokevirtual 125	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   134: ldc 133
    //   136: invokestatic 131	com/tencent/tencentmap/mapsdk/maps/a/hs:b	()Ljava/lang/String;
    //   139: invokevirtual 125	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   142: astore_2
    //   143: aload_2
    //   144: invokestatic 136	com/tencent/tencentmap/mapsdk/maps/a/hs:a	(Ljava/lang/String;)Ljava/lang/String;
    //   147: astore_3
    //   148: aload_3
    //   149: ldc 138
    //   151: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   154: ifeq +112 -> 266
    //   157: aload_3
    //   158: ldc 144
    //   160: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   163: ifeq +103 -> 266
    //   166: aload_3
    //   167: ldc 146
    //   169: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   172: ifeq +94 -> 266
    //   175: iconst_1
    //   176: istore 4
    //   178: iload 4
    //   180: ifne +233 -> 413
    //   183: aload_3
    //   184: ldc 148
    //   186: invokevirtual 151	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   189: ifne +435 -> 624
    //   192: aload_3
    //   193: ldc 153
    //   195: invokevirtual 156	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   198: ifne +426 -> 624
    //   201: aload_3
    //   202: ldc 158
    //   204: invokevirtual 156	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   207: ifne +417 -> 624
    //   210: new 103	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 159	java/lang/StringBuilder:<init>	()V
    //   217: aload_3
    //   218: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_0
    //   222: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/jf:e	Ljava/lang/String;
    //   225: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_0
    //   229: getfield 38	com/tencent/tencentmap/mapsdk/maps/a/jf:d	Ljava/lang/String;
    //   232: invokestatic 163	com/tencent/tencentmap/mapsdk/maps/a/ic:c	(Ljava/lang/String;)Ljava/lang/String;
    //   235: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: astore_1
    //   242: invokestatic 168	com/tencent/tencentmap/mapsdk/a/ds:a	()Lcom/tencent/tencentmap/mapsdk/a/ds;
    //   245: aload_1
    //   246: ldc 170
    //   248: invokevirtual 173	com/tencent/tencentmap/mapsdk/a/ds:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/a/dt;
    //   251: astore_1
    //   252: aload_1
    //   253: ifnonnull +30 -> 283
    //   256: ldc 81
    //   258: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: aconst_null
    //   262: astore_1
    //   263: goto -230 -> 33
    //   266: iconst_0
    //   267: istore 4
    //   269: goto -91 -> 178
    //   272: astore_1
    //   273: ldc 81
    //   275: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: aconst_null
    //   279: astore_1
    //   280: goto -247 -> 33
    //   283: aload_3
    //   284: ldc 175
    //   286: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   289: ifne +11 -> 300
    //   292: aload_0
    //   293: getfield 32	com/tencent/tencentmap/mapsdk/maps/a/jf:b	Lcom/tencent/tencentmap/mapsdk/a/bf;
    //   296: aload_3
    //   297: invokevirtual 177	com/tencent/tencentmap/mapsdk/a/bf:b	(Ljava/lang/String;)V
    //   300: aload_3
    //   301: ldc 158
    //   303: invokevirtual 156	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   306: ifeq +94 -> 400
    //   309: aload_1
    //   310: getfield 181	com/tencent/tencentmap/mapsdk/a/dt:a	[B
    //   313: ifnull +87 -> 400
    //   316: aload_1
    //   317: getfield 181	com/tencent/tencentmap/mapsdk/a/dt:a	[B
    //   320: arraylength
    //   321: ifne +79 -> 400
    //   324: aload_0
    //   325: getfield 34	com/tencent/tencentmap/mapsdk/maps/a/jf:c	[B
    //   328: ifnonnull +64 -> 392
    //   331: sipush 256
    //   334: sipush 256
    //   337: getstatic 187	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   340: invokestatic 193	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   343: astore_2
    //   344: new 195	android/graphics/Canvas
    //   347: dup
    //   348: aload_2
    //   349: invokespecial 198	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   352: iconst_0
    //   353: sipush 255
    //   356: sipush 255
    //   359: sipush 255
    //   362: invokevirtual 202	android/graphics/Canvas:drawARGB	(IIII)V
    //   365: new 204	java/io/ByteArrayOutputStream
    //   368: dup
    //   369: invokespecial 205	java/io/ByteArrayOutputStream:<init>	()V
    //   372: astore_3
    //   373: aload_2
    //   374: getstatic 211	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   377: bipush 100
    //   379: aload_3
    //   380: invokevirtual 215	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   383: pop
    //   384: aload_0
    //   385: aload_3
    //   386: invokevirtual 219	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   389: putfield 34	com/tencent/tencentmap/mapsdk/maps/a/jf:c	[B
    //   392: aload_1
    //   393: aload_0
    //   394: getfield 34	com/tencent/tencentmap/mapsdk/maps/a/jf:c	[B
    //   397: putfield 181	com/tencent/tencentmap/mapsdk/a/dt:a	[B
    //   400: aload_1
    //   401: getfield 181	com/tencent/tencentmap/mapsdk/a/dt:a	[B
    //   404: astore_1
    //   405: ldc 81
    //   407: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   410: goto -377 -> 33
    //   413: new 221	java/net/URL
    //   416: astore_1
    //   417: aload_1
    //   418: aload_3
    //   419: invokespecial 222	java/net/URL:<init>	(Ljava/lang/String;)V
    //   422: aload_1
    //   423: invokevirtual 226	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   426: checkcast 228	java/net/HttpURLConnection
    //   429: astore_1
    //   430: aload_1
    //   431: ldc 230
    //   433: ldc 170
    //   435: invokevirtual 234	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   438: aload_1
    //   439: sipush 10000
    //   442: invokevirtual 237	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   445: aload_1
    //   446: invokevirtual 240	java/net/HttpURLConnection:getResponseCode	()I
    //   449: sipush 200
    //   452: if_icmpne +58 -> 510
    //   455: aload_1
    //   456: invokevirtual 244	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   459: astore_2
    //   460: aload_2
    //   461: invokestatic 249	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/InputStream;)[B
    //   464: astore 5
    //   466: aload_3
    //   467: ldc 175
    //   469: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   472: ifne +11 -> 483
    //   475: aload_0
    //   476: getfield 32	com/tencent/tencentmap/mapsdk/maps/a/jf:b	Lcom/tencent/tencentmap/mapsdk/a/bf;
    //   479: aload_3
    //   480: invokevirtual 177	com/tencent/tencentmap/mapsdk/a/bf:b	(Ljava/lang/String;)V
    //   483: aload_1
    //   484: ifnull +7 -> 491
    //   487: aload_1
    //   488: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   491: aload_2
    //   492: ifnull +7 -> 499
    //   495: aload_2
    //   496: invokestatic 255	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   499: ldc 81
    //   501: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   504: aload 5
    //   506: astore_1
    //   507: goto -474 -> 33
    //   510: aload_1
    //   511: ifnull +7 -> 518
    //   514: aload_1
    //   515: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   518: ldc 81
    //   520: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: aconst_null
    //   524: astore_1
    //   525: goto -492 -> 33
    //   528: astore_1
    //   529: aconst_null
    //   530: astore_1
    //   531: aconst_null
    //   532: astore_2
    //   533: aload_2
    //   534: ifnull +7 -> 541
    //   537: aload_2
    //   538: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   541: aload_1
    //   542: ifnull -24 -> 518
    //   545: aload_1
    //   546: invokestatic 255	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   549: goto -31 -> 518
    //   552: astore_1
    //   553: aconst_null
    //   554: astore_2
    //   555: aconst_null
    //   556: astore_3
    //   557: aload_3
    //   558: ifnull +7 -> 565
    //   561: aload_3
    //   562: invokevirtual 252	java/net/HttpURLConnection:disconnect	()V
    //   565: aload_2
    //   566: ifnull +7 -> 573
    //   569: aload_2
    //   570: invokestatic 255	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   573: ldc 81
    //   575: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   578: aload_1
    //   579: athrow
    //   580: astore_2
    //   581: aconst_null
    //   582: astore 5
    //   584: aload_1
    //   585: astore_3
    //   586: aload_2
    //   587: astore_1
    //   588: aload 5
    //   590: astore_2
    //   591: goto -34 -> 557
    //   594: astore 5
    //   596: aload_1
    //   597: astore_3
    //   598: aload 5
    //   600: astore_1
    //   601: goto -44 -> 557
    //   604: astore_2
    //   605: aconst_null
    //   606: astore_3
    //   607: aload_1
    //   608: astore_2
    //   609: aload_3
    //   610: astore_1
    //   611: goto -78 -> 533
    //   614: astore_3
    //   615: aload_2
    //   616: astore_3
    //   617: aload_1
    //   618: astore_2
    //   619: aload_3
    //   620: astore_1
    //   621: goto -88 -> 533
    //   624: aload_3
    //   625: astore_1
    //   626: goto -384 -> 242
    //
    // Exception table:
    //   from	to	target	type
    //   242	252	272	java/lang/Exception
    //   413	430	528	java/lang/Throwable
    //   413	430	552	finally
    //   430	460	580	finally
    //   460	483	594	finally
    //   430	460	604	java/lang/Throwable
    //   460	483	614	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jf
 * JD-Core Version:    0.6.2
 */