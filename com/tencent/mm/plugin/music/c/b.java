package com.tencent.mm.plugin.music.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements Runnable
{
  public int clN;
  public boolean isStop;
  public boolean mgU;
  public String mimeType;
  private String oLs;
  public com.tencent.mm.aw.e oLt;
  public a oLu;
  public float oLv;
  private long oLw;
  public int oLx;
  public b.b oLy;

  public b(com.tencent.mm.aw.e parame, a parama)
  {
    AppMethodBeat.i(137466);
    this.oLs = null;
    this.oLw = 307200L;
    this.isStop = true;
    this.mimeType = "";
    this.oLx = -1;
    this.clN = 0;
    this.oLt = parame;
    this.oLu = parama;
    int j;
    int k;
    if ((parama.oLn == 0L) && (parama.oLo == 0L) && (parama.endFlag == 0))
    {
      j = 1;
      if ((parama.oLp != 0L) || (parama.oLr != 0L) || (parama.oLq != 0))
        break label157;
      k = 1;
      label110: if ((j == 0) || (k == 0))
        break label163;
      j = i;
      label123: if (j == 0)
        break label169;
      ab.e("MicroMsg.Music.MusicDownloadTask", "downloadInfo is invalid");
    }
    while (true)
    {
      this.mgU = at.isWifi(ah.getContext());
      AppMethodBeat.o(137466);
      return;
      j = 0;
      break;
      label157: k = 0;
      break label110;
      label163: j = 0;
      break label123;
      label169: ab.i("MicroMsg.Music.MusicDownloadTask", "downloadInfo is valid");
    }
  }

  private void P(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(137473);
    if (this.mgU)
    {
      this.oLu.oLp = paramLong1;
      this.oLu.oLq = 0;
      this.oLu.oLr = paramLong2;
      com.tencent.mm.plugin.music.cache.e.a(this.oLt.fJU, this.oLu);
    }
    while (true)
    {
      al.d(new b.a(this, 3));
      AppMethodBeat.o(137473);
      return;
      this.oLu.oLn = paramLong1;
      this.oLu.endFlag = 0;
      this.oLu.oLo = paramLong2;
      com.tencent.mm.plugin.music.cache.e.a(this.oLt.fJU, this.oLu);
    }
  }

  private static long[] Tg(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(137474);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(137474);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = paramString.replace("bytes", "").trim().split("-");
        long l1 = Long.valueOf(paramString[0]).longValue();
        paramString = paramString[1].split("/");
        long l2 = Long.valueOf(paramString[0]).longValue();
        long l3 = Long.valueOf(paramString[1]).longValue();
        AppMethodBeat.o(137474);
        paramString = new long[] { l1, l2, l3 };
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(137474);
        paramString = localObject;
      }
    }
  }

  private void jn(long paramLong)
  {
    AppMethodBeat.i(137472);
    if (this.mgU)
    {
      this.oLu.oLp = paramLong;
      this.oLu.oLq = 1;
      this.oLu.oLr = paramLong;
      com.tencent.mm.plugin.music.cache.e.a(this.oLt.fJU, this.oLu);
    }
    while (true)
    {
      al.d(new b.a(this, 2));
      AppMethodBeat.o(137472);
      return;
      this.oLu.oLn = paramLong;
      this.oLu.endFlag = 1;
      this.oLu.oLo = paramLong;
      com.tencent.mm.plugin.music.cache.e.a(this.oLt.fJU, this.oLu);
    }
  }

  private HttpURLConnection s(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(137469);
    Object localObject1;
    int i;
    if (!TextUtils.isEmpty(this.oLs))
    {
      ab.i("MicroMsg.Music.MusicDownloadTask", "use previous temp redirect URL to download , avoid to request source url and than redirect to 302 resp code");
      paramString = this.oLs;
      localObject1 = null;
      i = 0;
    }
    while (true)
    {
      if (localObject1 != null)
        ((HttpURLConnection)localObject1).disconnect();
      ab.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect, downloadUrl:%s", new Object[] { paramString });
      Object localObject2 = k.bUf().oLX;
      localObject1 = new URL(paramString);
      if (localObject2 != null)
        localObject1 = ((com.tencent.mm.plugin.music.e.a)localObject2).Ti(paramString);
      localObject1 = (HttpURLConnection)((URL)localObject1).openConnection();
      ((HttpURLConnection)localObject1).setRequestMethod("GET");
      ((HttpURLConnection)localObject1).setConnectTimeout(25000);
      ((HttpURLConnection)localObject1).setInstanceFollowRedirects(false);
      localObject2 = paramMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramString = (Map.Entry)((Iterator)localObject2).next();
        ((HttpURLConnection)localObject1).setRequestProperty((String)paramString.getKey(), (String)paramString.getValue());
      }
      int j = ((HttpURLConnection)localObject1).getResponseCode();
      ab.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect response:%d, redirectCount:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if ((j == 300) || (j == 301) || (j == 302) || (j == 303) || (j == 307))
      {
        zB(j);
        paramString = ((HttpURLConnection)localObject1).getRequestMethod();
        if ((j == 307) && (!paramString.equals("GET")) && (!paramString.equals("HEAD")))
          AppMethodBeat.o(137469);
      }
      while (true)
      {
        return localObject1;
        localObject2 = ((HttpURLConnection)localObject1).getHeaderField("Location");
        if (localObject2 == null)
        {
          ab.e("MicroMsg.Music.MusicDownloadTask", "Invalid redirect,  response:%d", new Object[] { Integer.valueOf(j) });
          AppMethodBeat.o(137469);
        }
        else
        {
          paramString = new URL(((HttpURLConnection)localObject1).getURL(), (String)localObject2);
          ab.i("MicroMsg.Music.MusicDownloadTask", "location:%s", new Object[] { localObject2 });
          ab.i("MicroMsg.Music.MusicDownloadTask", "tempUrl:%s", new Object[] { paramString.toString() });
          if ((!paramString.getProtocol().equals("https")) && (!paramString.getProtocol().equals("http")))
          {
            ab.e("MicroMsg.Music.MusicDownloadTask", "Unsupported protocol redirect,  response:%d", new Object[] { Integer.valueOf(j) });
            AppMethodBeat.o(137469);
          }
          else
          {
            i++;
            if (i > 5)
            {
              ab.e("MicroMsg.Music.MusicDownloadTask", "Too many redirects: ".concat(String.valueOf(i)));
              AppMethodBeat.o(137469);
            }
            else
            {
              paramString = paramString.toString();
              this.oLs = paramString;
              break;
              if ((j != 200) && (j != 206))
                this.oLs = null;
              AppMethodBeat.o(137469);
            }
          }
        }
      }
      localObject1 = null;
      i = 0;
    }
  }

  private static void zB(int paramInt)
  {
    AppMethodBeat.i(137470);
    com.tencent.mm.plugin.music.e.d locald = (com.tencent.mm.plugin.music.e.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.d.class);
    if (locald != null)
      locald.zG(paramInt);
    AppMethodBeat.o(137470);
  }

  private void zC(int paramInt)
  {
    AppMethodBeat.i(137471);
    this.oLs = null;
    al.d(new b.a(this, paramInt));
    AppMethodBeat.o(137471);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc_w 361
    //   3: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   10: ifeq +10 -> 20
    //   13: ldc_w 361
    //   16: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aconst_null
    //   21: astore_1
    //   22: aconst_null
    //   23: astore_2
    //   24: invokestatic 97	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   27: invokestatic 364	com/tencent/mm/sdk/platformtools/at:isNetworkConnected	(Landroid/content/Context;)Z
    //   30: istore_3
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 55	com/tencent/mm/plugin/music/c/b:oLx	I
    //   41: invokestatic 207	com/tencent/mm/plugin/music/e/k:bUf	()Lcom/tencent/mm/plugin/music/e/k;
    //   44: getfield 211	com/tencent/mm/plugin/music/e/k:oLX	Lcom/tencent/mm/plugin/music/e/a;
    //   47: astore 4
    //   49: iload_3
    //   50: ifeq +511 -> 561
    //   53: aload_0
    //   54: getfield 105	com/tencent/mm/plugin/music/c/b:mgU	Z
    //   57: ifeq +366 -> 423
    //   60: aload_0
    //   61: getfield 59	com/tencent/mm/plugin/music/c/b:oLt	Lcom/tencent/mm/aw/e;
    //   64: getfield 367	com/tencent/mm/aw/e:playUrl	Ljava/lang/String;
    //   67: invokestatic 372	com/tencent/mm/plugin/music/cache/g:SX	(Ljava/lang/String;)Z
    //   70: istore_3
    //   71: aload_2
    //   72: astore_1
    //   73: aload 4
    //   75: ifnull +18 -> 93
    //   78: aload 4
    //   80: aload_0
    //   81: getfield 59	com/tencent/mm/plugin/music/c/b:oLt	Lcom/tencent/mm/aw/e;
    //   84: getfield 367	com/tencent/mm/aw/e:playUrl	Ljava/lang/String;
    //   87: invokeinterface 375 2 0
    //   92: astore_1
    //   93: ldc 83
    //   95: ldc_w 377
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_1
    //   105: aastore
    //   106: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   113: getfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   116: lstore 5
    //   118: aload_0
    //   119: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   122: getfield 78	com/tencent/mm/plugin/music/c/a:oLr	J
    //   125: lstore 7
    //   127: lload 7
    //   129: lconst_0
    //   130: lcmp
    //   131: ifeq +13 -> 144
    //   134: aload_0
    //   135: lload 7
    //   137: ldc2_w 378
    //   140: ldiv
    //   141: putfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   144: lload 5
    //   146: aload_0
    //   147: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   150: lcmp
    //   151: ifge +242 -> 393
    //   154: aload_0
    //   155: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   158: lstore 9
    //   160: aload_0
    //   161: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   164: getfield 81	com/tencent/mm/plugin/music/c/a:oLq	I
    //   167: iconst_1
    //   168: if_icmpne +247 -> 415
    //   171: iconst_1
    //   172: istore 11
    //   174: aload_1
    //   175: astore_2
    //   176: aload_0
    //   177: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   180: ldc2_w 380
    //   183: lcmp
    //   184: ifge +18 -> 202
    //   187: aload_0
    //   188: ldc2_w 380
    //   191: putfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   194: ldc 83
    //   196: ldc_w 383
    //   199: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: new 385	java/io/File
    //   205: dup
    //   206: aload_0
    //   207: getfield 59	com/tencent/mm/plugin/music/c/b:oLt	Lcom/tencent/mm/aw/e;
    //   210: getfield 121	com/tencent/mm/aw/e:fJU	Ljava/lang/String;
    //   213: aload_0
    //   214: getfield 105	com/tencent/mm/plugin/music/c/b:mgU	Z
    //   217: invokestatic 391	com/tencent/mm/plugin/music/h/b:aW	(Ljava/lang/String;Z)Ljava/lang/String;
    //   220: invokespecial 392	java/io/File:<init>	(Ljava/lang/String;)V
    //   223: astore 12
    //   225: lload 9
    //   227: lstore 13
    //   229: lload 5
    //   231: lstore 9
    //   233: aload 12
    //   235: invokevirtual 395	java/io/File:exists	()Z
    //   238: ifne +58 -> 296
    //   241: ldc 83
    //   243: ldc_w 397
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload 12
    //   254: invokevirtual 400	java/io/File:createNewFile	()Z
    //   257: invokestatic 405	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   260: aastore
    //   261: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: lconst_0
    //   265: lstore 9
    //   267: aload_0
    //   268: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   271: lstore 13
    //   273: iconst_0
    //   274: istore 11
    //   276: ldc 83
    //   278: ldc_w 407
    //   281: iconst_1
    //   282: anewarray 4	java/lang/Object
    //   285: dup
    //   286: iconst_0
    //   287: lload 13
    //   289: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   292: aastore
    //   293: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: ldc 83
    //   298: ldc_w 412
    //   301: iconst_3
    //   302: anewarray 4	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: lload 9
    //   309: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   312: aastore
    //   313: dup
    //   314: iconst_1
    //   315: aload 12
    //   317: invokevirtual 415	java/io/File:length	()J
    //   320: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   323: aastore
    //   324: dup
    //   325: iconst_2
    //   326: lload 13
    //   328: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   331: aastore
    //   332: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   335: lload 9
    //   337: aload_0
    //   338: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   341: lcmp
    //   342: iflt +12 -> 354
    //   345: aload_0
    //   346: getfield 417	com/tencent/mm/plugin/music/c/b:oLv	F
    //   349: fconst_0
    //   350: fcmpl
    //   351: ifeq +8 -> 359
    //   354: iload 11
    //   356: ifeq +483 -> 839
    //   359: ldc 83
    //   361: ldc_w 419
    //   364: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   367: aload_0
    //   368: iconst_1
    //   369: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   372: new 8	com/tencent/mm/plugin/music/c/b$a
    //   375: dup
    //   376: aload_0
    //   377: iconst_1
    //   378: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   381: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   384: ldc_w 361
    //   387: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   390: goto -371 -> 19
    //   393: lload 5
    //   395: l2f
    //   396: ldc_w 420
    //   399: aload_0
    //   400: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   403: getfield 78	com/tencent/mm/plugin/music/c/a:oLr	J
    //   406: l2f
    //   407: fmul
    //   408: fadd
    //   409: f2l
    //   410: lstore 9
    //   412: goto -252 -> 160
    //   415: iconst_0
    //   416: istore 11
    //   418: aload_1
    //   419: astore_2
    //   420: goto -244 -> 176
    //   423: aload 4
    //   425: ifnull +18 -> 443
    //   428: aload 4
    //   430: aload_0
    //   431: getfield 59	com/tencent/mm/plugin/music/c/b:oLt	Lcom/tencent/mm/aw/e;
    //   434: getfield 367	com/tencent/mm/aw/e:playUrl	Ljava/lang/String;
    //   437: invokeinterface 375 2 0
    //   442: astore_1
    //   443: ldc 83
    //   445: ldc_w 377
    //   448: iconst_1
    //   449: anewarray 4	java/lang/Object
    //   452: dup
    //   453: iconst_0
    //   454: aload_1
    //   455: aastore
    //   456: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   459: iconst_0
    //   460: istore_3
    //   461: aload_0
    //   462: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   465: getfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   468: lstore 5
    //   470: aload_0
    //   471: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   474: getfield 69	com/tencent/mm/plugin/music/c/a:oLo	J
    //   477: lstore 7
    //   479: lload 7
    //   481: lconst_0
    //   482: lcmp
    //   483: ifeq +13 -> 496
    //   486: aload_0
    //   487: lload 7
    //   489: ldc2_w 378
    //   492: ldiv
    //   493: putfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   496: lload 5
    //   498: aload_0
    //   499: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   502: lcmp
    //   503: ifge +28 -> 531
    //   506: aload_0
    //   507: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   510: lstore 9
    //   512: aload_0
    //   513: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   516: getfield 72	com/tencent/mm/plugin/music/c/a:endFlag	I
    //   519: iconst_1
    //   520: if_icmpne +33 -> 553
    //   523: iconst_1
    //   524: istore 11
    //   526: aload_1
    //   527: astore_2
    //   528: goto -352 -> 176
    //   531: lload 5
    //   533: l2f
    //   534: ldc_w 420
    //   537: aload_0
    //   538: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   541: getfield 69	com/tencent/mm/plugin/music/c/a:oLo	J
    //   544: l2f
    //   545: fmul
    //   546: fadd
    //   547: f2l
    //   548: lstore 9
    //   550: goto -38 -> 512
    //   553: iconst_0
    //   554: istore 11
    //   556: aload_1
    //   557: astore_2
    //   558: goto -382 -> 176
    //   561: aload_0
    //   562: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   565: getfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   568: lconst_0
    //   569: lcmp
    //   570: ifeq +104 -> 674
    //   573: aload_0
    //   574: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   577: getfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   580: aload_0
    //   581: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   584: lcmp
    //   585: ifge +21 -> 606
    //   588: aload_0
    //   589: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   592: getfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   595: aload_0
    //   596: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   599: getfield 78	com/tencent/mm/plugin/music/c/a:oLr	J
    //   602: lcmp
    //   603: ifne +71 -> 674
    //   606: aload_0
    //   607: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   610: getfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   613: l2f
    //   614: aload_0
    //   615: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   618: getfield 78	com/tencent/mm/plugin/music/c/a:oLr	J
    //   621: l2f
    //   622: fdiv
    //   623: aload_0
    //   624: getfield 417	com/tencent/mm/plugin/music/c/b:oLv	F
    //   627: fsub
    //   628: ldc_w 420
    //   631: fcmpl
    //   632: iflt +42 -> 674
    //   635: ldc 83
    //   637: ldc_w 419
    //   640: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   643: aload_0
    //   644: iconst_1
    //   645: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   648: aload_0
    //   649: iconst_1
    //   650: putfield 105	com/tencent/mm/plugin/music/c/b:mgU	Z
    //   653: new 8	com/tencent/mm/plugin/music/c/b$a
    //   656: dup
    //   657: aload_0
    //   658: iconst_1
    //   659: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   662: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   665: ldc_w 361
    //   668: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   671: goto -652 -> 19
    //   674: aload_0
    //   675: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   678: getfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   681: lconst_0
    //   682: lcmp
    //   683: ifeq +104 -> 787
    //   686: aload_0
    //   687: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   690: getfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   693: aload_0
    //   694: getfield 47	com/tencent/mm/plugin/music/c/b:oLw	J
    //   697: lcmp
    //   698: ifge +21 -> 719
    //   701: aload_0
    //   702: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   705: getfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   708: aload_0
    //   709: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   712: getfield 69	com/tencent/mm/plugin/music/c/a:oLo	J
    //   715: lcmp
    //   716: ifne +71 -> 787
    //   719: aload_0
    //   720: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   723: getfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   726: l2f
    //   727: aload_0
    //   728: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   731: getfield 69	com/tencent/mm/plugin/music/c/a:oLo	J
    //   734: l2f
    //   735: fdiv
    //   736: aload_0
    //   737: getfield 417	com/tencent/mm/plugin/music/c/b:oLv	F
    //   740: fsub
    //   741: ldc_w 420
    //   744: fcmpl
    //   745: iflt +42 -> 787
    //   748: ldc 83
    //   750: ldc_w 419
    //   753: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   756: aload_0
    //   757: iconst_1
    //   758: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   761: aload_0
    //   762: iconst_0
    //   763: putfield 105	com/tencent/mm/plugin/music/c/b:mgU	Z
    //   766: new 8	com/tencent/mm/plugin/music/c/b$a
    //   769: dup
    //   770: aload_0
    //   771: iconst_1
    //   772: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   775: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   778: ldc_w 361
    //   781: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   784: goto -765 -> 19
    //   787: ldc 83
    //   789: ldc_w 422
    //   792: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   795: aload_0
    //   796: iconst_1
    //   797: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   800: aload_0
    //   801: iconst_4
    //   802: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   805: ldc_w 361
    //   808: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   811: goto -792 -> 19
    //   814: astore_1
    //   815: ldc 83
    //   817: aload_1
    //   818: ldc_w 426
    //   821: iconst_1
    //   822: anewarray 4	java/lang/Object
    //   825: dup
    //   826: iconst_0
    //   827: aload 12
    //   829: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   832: aastore
    //   833: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   836: goto -572 -> 264
    //   839: aload_2
    //   840: invokestatic 147	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   843: ifeq +38 -> 881
    //   846: ldc 83
    //   848: ldc_w 435
    //   851: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   854: aload_0
    //   855: iconst_1
    //   856: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   859: new 8	com/tencent/mm/plugin/music/c/b$a
    //   862: dup
    //   863: aload_0
    //   864: bipush 254
    //   866: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   869: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   872: ldc_w 361
    //   875: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   878: goto -859 -> 19
    //   881: aconst_null
    //   882: astore 15
    //   884: aconst_null
    //   885: astore 16
    //   887: aconst_null
    //   888: astore 17
    //   890: aconst_null
    //   891: astore 4
    //   893: aconst_null
    //   894: astore 18
    //   896: aconst_null
    //   897: astore 19
    //   899: aconst_null
    //   900: astore 20
    //   902: aload 12
    //   904: invokevirtual 395	java/io/File:exists	()Z
    //   907: ifne +268 -> 1175
    //   910: aload_0
    //   911: iconst_1
    //   912: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   915: ldc 83
    //   917: ldc_w 437
    //   920: iconst_1
    //   921: anewarray 4	java/lang/Object
    //   924: dup
    //   925: iconst_0
    //   926: aload 12
    //   928: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   931: aastore
    //   932: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   935: aload_0
    //   936: bipush 19
    //   938: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   941: lload 7
    //   943: lconst_0
    //   944: lcmp
    //   945: ifne +92 -> 1037
    //   948: lload 9
    //   950: lconst_0
    //   951: lcmp
    //   952: ifle +85 -> 1037
    //   955: ldc 83
    //   957: ldc_w 439
    //   960: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   963: new 441	java/lang/NullPointerException
    //   966: dup
    //   967: invokespecial 442	java/lang/NullPointerException:<init>	()V
    //   970: athrow
    //   971: aload_0
    //   972: lload 9
    //   974: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   977: lload 9
    //   979: ldc2_w 380
    //   982: lcmp
    //   983: ifge +15 -> 998
    //   986: new 8	com/tencent/mm/plugin/music/c/b$a
    //   989: dup
    //   990: aload_0
    //   991: iconst_1
    //   992: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   995: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   998: aload_0
    //   999: iconst_1
    //   1000: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   1003: ldc 83
    //   1005: ldc_w 446
    //   1008: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1011: ldc_w 361
    //   1014: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1017: goto -998 -> 19
    //   1020: astore_1
    //   1021: ldc 83
    //   1023: aload_1
    //   1024: ldc_w 448
    //   1027: iconst_0
    //   1028: anewarray 4	java/lang/Object
    //   1031: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1034: goto -63 -> 971
    //   1037: lload 7
    //   1039: lconst_0
    //   1040: lcmp
    //   1041: ifeq +50 -> 1091
    //   1044: lload 9
    //   1046: lload 7
    //   1048: lcmp
    //   1049: ifeq +42 -> 1091
    //   1052: ldc 83
    //   1054: ldc_w 450
    //   1057: iconst_2
    //   1058: anewarray 4	java/lang/Object
    //   1061: dup
    //   1062: iconst_0
    //   1063: lload 7
    //   1065: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1068: aastore
    //   1069: dup
    //   1070: iconst_1
    //   1071: lload 9
    //   1073: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1076: aastore
    //   1077: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1080: aload_0
    //   1081: lload 9
    //   1083: lload 7
    //   1085: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   1088: goto -90 -> 998
    //   1091: lload 7
    //   1093: lconst_0
    //   1094: lcmp
    //   1095: ifeq +69 -> 1164
    //   1098: lload 9
    //   1100: lload 7
    //   1102: lcmp
    //   1103: ifne +61 -> 1164
    //   1106: ldc 83
    //   1108: ldc_w 454
    //   1111: iconst_2
    //   1112: anewarray 4	java/lang/Object
    //   1115: dup
    //   1116: iconst_0
    //   1117: lload 7
    //   1119: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1122: aastore
    //   1123: dup
    //   1124: iconst_1
    //   1125: lload 9
    //   1127: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1130: aastore
    //   1131: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1134: aload_0
    //   1135: lload 7
    //   1137: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   1140: lload 9
    //   1142: ldc2_w 380
    //   1145: lcmp
    //   1146: ifge -148 -> 998
    //   1149: new 8	com/tencent/mm/plugin/music/c/b$a
    //   1152: dup
    //   1153: aload_0
    //   1154: iconst_1
    //   1155: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   1158: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   1161: goto -163 -> 998
    //   1164: ldc 83
    //   1166: ldc_w 456
    //   1169: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1172: goto -174 -> 998
    //   1175: new 458	java/io/RandomAccessFile
    //   1178: dup
    //   1179: aload 12
    //   1181: ldc_w 460
    //   1184: invokespecial 463	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1187: astore_1
    //   1188: ldc 83
    //   1190: ldc_w 465
    //   1193: iconst_1
    //   1194: anewarray 4	java/lang/Object
    //   1197: dup
    //   1198: iconst_0
    //   1199: aload_2
    //   1200: aastore
    //   1201: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1204: new 467	java/util/HashMap
    //   1207: astore 21
    //   1209: aload 21
    //   1211: bipush 10
    //   1213: invokespecial 469	java/util/HashMap:<init>	(I)V
    //   1216: aload 21
    //   1218: ldc_w 471
    //   1221: ldc_w 473
    //   1224: invokeinterface 477 3 0
    //   1229: pop
    //   1230: lload 13
    //   1232: lload 9
    //   1234: lcmp
    //   1235: ifle +75 -> 1310
    //   1238: ldc 83
    //   1240: ldc_w 479
    //   1243: iconst_2
    //   1244: anewarray 4	java/lang/Object
    //   1247: dup
    //   1248: iconst_0
    //   1249: lload 9
    //   1251: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1254: aastore
    //   1255: dup
    //   1256: iconst_1
    //   1257: lload 13
    //   1259: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1262: aastore
    //   1263: invokestatic 481	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1266: new 483	java/lang/StringBuilder
    //   1269: astore 20
    //   1271: aload 20
    //   1273: ldc_w 485
    //   1276: invokespecial 486	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1279: aload 21
    //   1281: ldc_w 488
    //   1284: aload 20
    //   1286: lload 9
    //   1288: invokevirtual 492	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1291: ldc 161
    //   1293: invokevirtual 495	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1296: lload 13
    //   1298: invokevirtual 492	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1301: invokevirtual 496	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1304: invokeinterface 477 3 0
    //   1309: pop
    //   1310: iload_3
    //   1311: ifne +10 -> 1321
    //   1314: aload_2
    //   1315: invokestatic 501	com/tencent/mm/plugin/music/h/e:Tw	(Ljava/lang/String;)Z
    //   1318: ifeq +39 -> 1357
    //   1321: ldc 83
    //   1323: ldc_w 503
    //   1326: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1329: aload 21
    //   1331: ldc_w 505
    //   1334: ldc_w 507
    //   1337: invokeinterface 477 3 0
    //   1342: pop
    //   1343: aload 21
    //   1345: ldc_w 509
    //   1348: ldc_w 511
    //   1351: invokeinterface 477 3 0
    //   1356: pop
    //   1357: new 483	java/lang/StringBuilder
    //   1360: astore 20
    //   1362: aload 20
    //   1364: invokespecial 512	java/lang/StringBuilder:<init>	()V
    //   1367: aload 21
    //   1369: ldc_w 514
    //   1372: aload 20
    //   1374: ldc_w 516
    //   1377: invokestatic 521	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   1380: invokevirtual 495	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1383: ldc_w 523
    //   1386: invokevirtual 495	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1389: invokestatic 97	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1392: invokestatic 527	com/tencent/mm/plugin/music/h/e:eE	(Landroid/content/Context;)Ljava/lang/String;
    //   1395: invokevirtual 495	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1398: invokevirtual 496	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1401: invokeinterface 477 3 0
    //   1406: pop
    //   1407: aload_0
    //   1408: aload_2
    //   1409: aload 21
    //   1411: invokespecial 529	com/tencent/mm/plugin/music/c/b:s	(Ljava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    //   1414: astore_2
    //   1415: lload 7
    //   1417: lstore 22
    //   1419: lload 9
    //   1421: lstore 24
    //   1423: aload_2
    //   1424: astore 20
    //   1426: lload 7
    //   1428: lstore 13
    //   1430: lload 9
    //   1432: lstore 5
    //   1434: aload_1
    //   1435: astore 21
    //   1437: aload 18
    //   1439: astore 4
    //   1441: lload 7
    //   1443: lstore 26
    //   1445: lload 9
    //   1447: lstore 28
    //   1449: lload 7
    //   1451: lstore 30
    //   1453: lload 9
    //   1455: lstore 32
    //   1457: lload 7
    //   1459: lstore 34
    //   1461: lload 9
    //   1463: lstore 36
    //   1465: lload 7
    //   1467: lstore 38
    //   1469: lload 9
    //   1471: lstore 40
    //   1473: aload_2
    //   1474: invokevirtual 275	java/net/HttpURLConnection:getResponseCode	()I
    //   1477: istore 11
    //   1479: iload 11
    //   1481: sipush 200
    //   1484: if_icmpeq +542 -> 2026
    //   1487: iload 11
    //   1489: sipush 206
    //   1492: if_icmpeq +534 -> 2026
    //   1495: lload 7
    //   1497: lstore 22
    //   1499: lload 9
    //   1501: lstore 24
    //   1503: aload_2
    //   1504: astore 20
    //   1506: lload 7
    //   1508: lstore 13
    //   1510: lload 9
    //   1512: lstore 5
    //   1514: aload_1
    //   1515: astore 21
    //   1517: aload 18
    //   1519: astore 4
    //   1521: lload 7
    //   1523: lstore 26
    //   1525: lload 9
    //   1527: lstore 28
    //   1529: lload 7
    //   1531: lstore 30
    //   1533: lload 9
    //   1535: lstore 32
    //   1537: lload 7
    //   1539: lstore 34
    //   1541: lload 9
    //   1543: lstore 36
    //   1545: lload 7
    //   1547: lstore 38
    //   1549: lload 9
    //   1551: lstore 40
    //   1553: iload 11
    //   1555: invokestatic 285	com/tencent/mm/plugin/music/c/b:zB	(I)V
    //   1558: lload 7
    //   1560: lstore 22
    //   1562: lload 9
    //   1564: lstore 24
    //   1566: aload_2
    //   1567: astore 20
    //   1569: lload 7
    //   1571: lstore 13
    //   1573: lload 9
    //   1575: lstore 5
    //   1577: aload_1
    //   1578: astore 21
    //   1580: aload 18
    //   1582: astore 4
    //   1584: lload 7
    //   1586: lstore 26
    //   1588: lload 9
    //   1590: lstore 28
    //   1592: lload 7
    //   1594: lstore 30
    //   1596: lload 9
    //   1598: lstore 32
    //   1600: lload 7
    //   1602: lstore 34
    //   1604: lload 9
    //   1606: lstore 36
    //   1608: lload 7
    //   1610: lstore 38
    //   1612: lload 9
    //   1614: lstore 40
    //   1616: ldc 83
    //   1618: ldc_w 531
    //   1621: iconst_1
    //   1622: anewarray 4	java/lang/Object
    //   1625: dup
    //   1626: iconst_0
    //   1627: iload 11
    //   1629: invokestatic 282	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1632: aastore
    //   1633: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1636: lload 7
    //   1638: lstore 22
    //   1640: lload 9
    //   1642: lstore 24
    //   1644: aload_2
    //   1645: astore 20
    //   1647: lload 7
    //   1649: lstore 13
    //   1651: lload 9
    //   1653: lstore 5
    //   1655: aload_1
    //   1656: astore 21
    //   1658: aload 18
    //   1660: astore 4
    //   1662: lload 7
    //   1664: lstore 26
    //   1666: lload 9
    //   1668: lstore 28
    //   1670: lload 7
    //   1672: lstore 30
    //   1674: lload 9
    //   1676: lstore 32
    //   1678: lload 7
    //   1680: lstore 34
    //   1682: lload 9
    //   1684: lstore 36
    //   1686: lload 7
    //   1688: lstore 38
    //   1690: lload 9
    //   1692: lstore 40
    //   1694: aload_0
    //   1695: iload 11
    //   1697: putfield 55	com/tencent/mm/plugin/music/c/b:oLx	I
    //   1700: lload 7
    //   1702: lstore 22
    //   1704: lload 9
    //   1706: lstore 24
    //   1708: aload_2
    //   1709: astore 20
    //   1711: lload 7
    //   1713: lstore 13
    //   1715: lload 9
    //   1717: lstore 5
    //   1719: aload_1
    //   1720: astore 21
    //   1722: aload 18
    //   1724: astore 4
    //   1726: lload 7
    //   1728: lstore 26
    //   1730: lload 9
    //   1732: lstore 28
    //   1734: lload 7
    //   1736: lstore 30
    //   1738: lload 9
    //   1740: lstore 32
    //   1742: lload 7
    //   1744: lstore 34
    //   1746: lload 9
    //   1748: lstore 36
    //   1750: lload 7
    //   1752: lstore 38
    //   1754: lload 9
    //   1756: lstore 40
    //   1758: aload_0
    //   1759: iconst_m1
    //   1760: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   1763: lload 7
    //   1765: lconst_0
    //   1766: lcmp
    //   1767: ifne +104 -> 1871
    //   1770: lload 9
    //   1772: lconst_0
    //   1773: lcmp
    //   1774: ifle +97 -> 1871
    //   1777: ldc 83
    //   1779: ldc_w 439
    //   1782: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1785: aload_1
    //   1786: lload 9
    //   1788: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   1791: aload_0
    //   1792: lload 9
    //   1794: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   1797: lload 9
    //   1799: ldc2_w 380
    //   1802: lcmp
    //   1803: ifge +15 -> 1818
    //   1806: new 8	com/tencent/mm/plugin/music/c/b$a
    //   1809: dup
    //   1810: aload_0
    //   1811: iconst_1
    //   1812: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   1815: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   1818: aload_1
    //   1819: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   1822: aload_2
    //   1823: ifnull +7 -> 1830
    //   1826: aload_2
    //   1827: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   1830: aload_0
    //   1831: iconst_1
    //   1832: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   1835: ldc 83
    //   1837: ldc_w 446
    //   1840: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1843: ldc_w 361
    //   1846: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1849: goto -1830 -> 19
    //   1852: astore 4
    //   1854: ldc 83
    //   1856: aload 4
    //   1858: ldc_w 448
    //   1861: iconst_0
    //   1862: anewarray 4	java/lang/Object
    //   1865: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1868: goto -77 -> 1791
    //   1871: lload 7
    //   1873: lconst_0
    //   1874: lcmp
    //   1875: ifeq +50 -> 1925
    //   1878: lload 9
    //   1880: lload 7
    //   1882: lcmp
    //   1883: ifeq +42 -> 1925
    //   1886: ldc 83
    //   1888: ldc_w 450
    //   1891: iconst_2
    //   1892: anewarray 4	java/lang/Object
    //   1895: dup
    //   1896: iconst_0
    //   1897: lload 7
    //   1899: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1902: aastore
    //   1903: dup
    //   1904: iconst_1
    //   1905: lload 9
    //   1907: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1910: aastore
    //   1911: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1914: aload_0
    //   1915: lload 9
    //   1917: lload 7
    //   1919: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   1922: goto -104 -> 1818
    //   1925: lload 7
    //   1927: lconst_0
    //   1928: lcmp
    //   1929: ifeq +69 -> 1998
    //   1932: lload 9
    //   1934: lload 7
    //   1936: lcmp
    //   1937: ifne +61 -> 1998
    //   1940: ldc 83
    //   1942: ldc_w 454
    //   1945: iconst_2
    //   1946: anewarray 4	java/lang/Object
    //   1949: dup
    //   1950: iconst_0
    //   1951: lload 7
    //   1953: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1956: aastore
    //   1957: dup
    //   1958: iconst_1
    //   1959: lload 9
    //   1961: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1964: aastore
    //   1965: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1968: aload_0
    //   1969: lload 7
    //   1971: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   1974: lload 9
    //   1976: ldc2_w 380
    //   1979: lcmp
    //   1980: ifge -162 -> 1818
    //   1983: new 8	com/tencent/mm/plugin/music/c/b$a
    //   1986: dup
    //   1987: aload_0
    //   1988: iconst_1
    //   1989: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   1992: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   1995: goto -177 -> 1818
    //   1998: ldc 83
    //   2000: ldc_w 456
    //   2003: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2006: goto -188 -> 1818
    //   2009: astore_1
    //   2010: ldc 83
    //   2012: aload_1
    //   2013: ldc_w 448
    //   2016: iconst_0
    //   2017: anewarray 4	java/lang/Object
    //   2020: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2023: goto -201 -> 1822
    //   2026: lload 7
    //   2028: lstore 22
    //   2030: lload 9
    //   2032: lstore 24
    //   2034: aload_2
    //   2035: astore 20
    //   2037: lload 7
    //   2039: lstore 13
    //   2041: lload 9
    //   2043: lstore 5
    //   2045: aload_1
    //   2046: astore 21
    //   2048: aload 18
    //   2050: astore 4
    //   2052: lload 7
    //   2054: lstore 26
    //   2056: lload 9
    //   2058: lstore 28
    //   2060: lload 7
    //   2062: lstore 30
    //   2064: lload 9
    //   2066: lstore 32
    //   2068: lload 7
    //   2070: lstore 34
    //   2072: lload 9
    //   2074: lstore 36
    //   2076: lload 7
    //   2078: lstore 38
    //   2080: lload 9
    //   2082: lstore 40
    //   2084: ldc 83
    //   2086: ldc_w 539
    //   2089: iconst_1
    //   2090: anewarray 4	java/lang/Object
    //   2093: dup
    //   2094: iconst_0
    //   2095: iload 11
    //   2097: invokestatic 282	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2100: aastore
    //   2101: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2104: lload 7
    //   2106: lstore 22
    //   2108: lload 9
    //   2110: lstore 24
    //   2112: aload_2
    //   2113: astore 20
    //   2115: lload 7
    //   2117: lstore 13
    //   2119: lload 9
    //   2121: lstore 5
    //   2123: aload_1
    //   2124: astore 21
    //   2126: aload 18
    //   2128: astore 4
    //   2130: lload 7
    //   2132: lstore 26
    //   2134: lload 9
    //   2136: lstore 28
    //   2138: lload 7
    //   2140: lstore 30
    //   2142: lload 9
    //   2144: lstore 32
    //   2146: lload 7
    //   2148: lstore 34
    //   2150: lload 9
    //   2152: lstore 36
    //   2154: lload 7
    //   2156: lstore 38
    //   2158: lload 9
    //   2160: lstore 40
    //   2162: new 483	java/lang/StringBuilder
    //   2165: astore 42
    //   2167: lload 7
    //   2169: lstore 22
    //   2171: lload 9
    //   2173: lstore 24
    //   2175: aload_2
    //   2176: astore 20
    //   2178: lload 7
    //   2180: lstore 13
    //   2182: lload 9
    //   2184: lstore 5
    //   2186: aload_1
    //   2187: astore 21
    //   2189: aload 18
    //   2191: astore 4
    //   2193: lload 7
    //   2195: lstore 26
    //   2197: lload 9
    //   2199: lstore 28
    //   2201: lload 7
    //   2203: lstore 30
    //   2205: lload 9
    //   2207: lstore 32
    //   2209: lload 7
    //   2211: lstore 34
    //   2213: lload 9
    //   2215: lstore 36
    //   2217: lload 7
    //   2219: lstore 38
    //   2221: lload 9
    //   2223: lstore 40
    //   2225: aload 42
    //   2227: ldc_w 541
    //   2230: invokespecial 486	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2233: lload 7
    //   2235: lstore 22
    //   2237: lload 9
    //   2239: lstore 24
    //   2241: aload_2
    //   2242: astore 20
    //   2244: lload 7
    //   2246: lstore 13
    //   2248: lload 9
    //   2250: lstore 5
    //   2252: aload_1
    //   2253: astore 21
    //   2255: aload 18
    //   2257: astore 4
    //   2259: lload 7
    //   2261: lstore 26
    //   2263: lload 9
    //   2265: lstore 28
    //   2267: lload 7
    //   2269: lstore 30
    //   2271: lload 9
    //   2273: lstore 32
    //   2275: lload 7
    //   2277: lstore 34
    //   2279: lload 9
    //   2281: lstore 36
    //   2283: lload 7
    //   2285: lstore 38
    //   2287: lload 9
    //   2289: lstore 40
    //   2291: ldc 83
    //   2293: aload 42
    //   2295: aload_2
    //   2296: ldc_w 514
    //   2299: invokevirtual 544	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   2302: invokevirtual 495	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2305: invokevirtual 496	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2308: invokestatic 546	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2311: lload 7
    //   2313: lstore 22
    //   2315: lload 9
    //   2317: lstore 24
    //   2319: aload_2
    //   2320: astore 20
    //   2322: lload 7
    //   2324: lstore 13
    //   2326: lload 9
    //   2328: lstore 5
    //   2330: aload_1
    //   2331: astore 21
    //   2333: aload 18
    //   2335: astore 4
    //   2337: lload 7
    //   2339: lstore 26
    //   2341: lload 9
    //   2343: lstore 28
    //   2345: lload 7
    //   2347: lstore 30
    //   2349: lload 9
    //   2351: lstore 32
    //   2353: lload 7
    //   2355: lstore 34
    //   2357: lload 9
    //   2359: lstore 36
    //   2361: lload 7
    //   2363: lstore 38
    //   2365: lload 9
    //   2367: lstore 40
    //   2369: aload_2
    //   2370: invokevirtual 549	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   2373: astore 42
    //   2375: lload 7
    //   2377: lstore 22
    //   2379: lload 9
    //   2381: lstore 24
    //   2383: aload_2
    //   2384: astore 20
    //   2386: lload 7
    //   2388: lstore 13
    //   2390: lload 9
    //   2392: lstore 5
    //   2394: aload_1
    //   2395: astore 21
    //   2397: aload 18
    //   2399: astore 4
    //   2401: lload 7
    //   2403: lstore 26
    //   2405: lload 9
    //   2407: lstore 28
    //   2409: lload 7
    //   2411: lstore 30
    //   2413: lload 9
    //   2415: lstore 32
    //   2417: lload 7
    //   2419: lstore 34
    //   2421: lload 9
    //   2423: lstore 36
    //   2425: lload 7
    //   2427: lstore 38
    //   2429: lload 9
    //   2431: lstore 40
    //   2433: ldc 83
    //   2435: ldc_w 551
    //   2438: iconst_1
    //   2439: anewarray 4	java/lang/Object
    //   2442: dup
    //   2443: iconst_0
    //   2444: aload 42
    //   2446: aastore
    //   2447: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2450: lload 7
    //   2452: lstore 22
    //   2454: lload 9
    //   2456: lstore 24
    //   2458: aload_2
    //   2459: astore 20
    //   2461: lload 7
    //   2463: lstore 13
    //   2465: lload 9
    //   2467: lstore 5
    //   2469: aload_1
    //   2470: astore 21
    //   2472: aload 18
    //   2474: astore 4
    //   2476: lload 7
    //   2478: lstore 26
    //   2480: lload 9
    //   2482: lstore 28
    //   2484: lload 7
    //   2486: lstore 30
    //   2488: lload 9
    //   2490: lstore 32
    //   2492: lload 7
    //   2494: lstore 34
    //   2496: lload 9
    //   2498: lstore 36
    //   2500: lload 7
    //   2502: lstore 38
    //   2504: lload 9
    //   2506: lstore 40
    //   2508: aload_0
    //   2509: aload 42
    //   2511: putfield 53	com/tencent/mm/plugin/music/c/b:mimeType	Ljava/lang/String;
    //   2514: lload 7
    //   2516: lstore 22
    //   2518: lload 9
    //   2520: lstore 24
    //   2522: aload_2
    //   2523: astore 20
    //   2525: lload 7
    //   2527: lstore 13
    //   2529: lload 9
    //   2531: lstore 5
    //   2533: aload_1
    //   2534: astore 21
    //   2536: aload 18
    //   2538: astore 4
    //   2540: lload 7
    //   2542: lstore 26
    //   2544: lload 9
    //   2546: lstore 28
    //   2548: lload 7
    //   2550: lstore 30
    //   2552: lload 9
    //   2554: lstore 32
    //   2556: lload 7
    //   2558: lstore 34
    //   2560: lload 9
    //   2562: lstore 36
    //   2564: lload 7
    //   2566: lstore 38
    //   2568: lload 9
    //   2570: lstore 40
    //   2572: aload_0
    //   2573: getfield 53	com/tencent/mm/plugin/music/c/b:mimeType	Ljava/lang/String;
    //   2576: invokestatic 189	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2579: ifne +414 -> 2993
    //   2582: lload 7
    //   2584: lstore 22
    //   2586: lload 9
    //   2588: lstore 24
    //   2590: aload_2
    //   2591: astore 20
    //   2593: lload 7
    //   2595: lstore 13
    //   2597: lload 9
    //   2599: lstore 5
    //   2601: aload_1
    //   2602: astore 21
    //   2604: aload 18
    //   2606: astore 4
    //   2608: lload 7
    //   2610: lstore 26
    //   2612: lload 9
    //   2614: lstore 28
    //   2616: lload 7
    //   2618: lstore 30
    //   2620: lload 9
    //   2622: lstore 32
    //   2624: lload 7
    //   2626: lstore 34
    //   2628: lload 9
    //   2630: lstore 36
    //   2632: lload 7
    //   2634: lstore 38
    //   2636: lload 9
    //   2638: lstore 40
    //   2640: aload_0
    //   2641: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   2644: getfield 552	com/tencent/mm/plugin/music/c/a:mimeType	Ljava/lang/String;
    //   2647: invokestatic 189	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2650: ifeq +343 -> 2993
    //   2653: lload 7
    //   2655: lstore 22
    //   2657: lload 9
    //   2659: lstore 24
    //   2661: aload_2
    //   2662: astore 20
    //   2664: lload 7
    //   2666: lstore 13
    //   2668: lload 9
    //   2670: lstore 5
    //   2672: aload_1
    //   2673: astore 21
    //   2675: aload 18
    //   2677: astore 4
    //   2679: lload 7
    //   2681: lstore 26
    //   2683: lload 9
    //   2685: lstore 28
    //   2687: lload 7
    //   2689: lstore 30
    //   2691: lload 9
    //   2693: lstore 32
    //   2695: lload 7
    //   2697: lstore 34
    //   2699: lload 9
    //   2701: lstore 36
    //   2703: lload 7
    //   2705: lstore 38
    //   2707: lload 9
    //   2709: lstore 40
    //   2711: aload_0
    //   2712: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   2715: aload_0
    //   2716: getfield 53	com/tencent/mm/plugin/music/c/b:mimeType	Ljava/lang/String;
    //   2719: putfield 552	com/tencent/mm/plugin/music/c/a:mimeType	Ljava/lang/String;
    //   2722: lload 7
    //   2724: lstore 22
    //   2726: lload 9
    //   2728: lstore 24
    //   2730: aload_2
    //   2731: astore 20
    //   2733: lload 7
    //   2735: lstore 13
    //   2737: lload 9
    //   2739: lstore 5
    //   2741: aload_1
    //   2742: astore 21
    //   2744: aload 18
    //   2746: astore 4
    //   2748: lload 7
    //   2750: lstore 26
    //   2752: lload 9
    //   2754: lstore 28
    //   2756: lload 7
    //   2758: lstore 30
    //   2760: lload 9
    //   2762: lstore 32
    //   2764: lload 7
    //   2766: lstore 34
    //   2768: lload 9
    //   2770: lstore 36
    //   2772: lload 7
    //   2774: lstore 38
    //   2776: lload 9
    //   2778: lstore 40
    //   2780: aload_0
    //   2781: getfield 59	com/tencent/mm/plugin/music/c/b:oLt	Lcom/tencent/mm/aw/e;
    //   2784: getfield 121	com/tencent/mm/aw/e:fJU	Ljava/lang/String;
    //   2787: astore 42
    //   2789: lload 7
    //   2791: lstore 22
    //   2793: lload 9
    //   2795: lstore 24
    //   2797: aload_2
    //   2798: astore 20
    //   2800: lload 7
    //   2802: lstore 13
    //   2804: lload 9
    //   2806: lstore 5
    //   2808: aload_1
    //   2809: astore 21
    //   2811: aload 18
    //   2813: astore 4
    //   2815: lload 7
    //   2817: lstore 26
    //   2819: lload 9
    //   2821: lstore 28
    //   2823: lload 7
    //   2825: lstore 30
    //   2827: lload 9
    //   2829: lstore 32
    //   2831: lload 7
    //   2833: lstore 34
    //   2835: lload 9
    //   2837: lstore 36
    //   2839: lload 7
    //   2841: lstore 38
    //   2843: lload 9
    //   2845: lstore 40
    //   2847: aload_0
    //   2848: getfield 53	com/tencent/mm/plugin/music/c/b:mimeType	Ljava/lang/String;
    //   2851: astore 43
    //   2853: lload 7
    //   2855: lstore 22
    //   2857: lload 9
    //   2859: lstore 24
    //   2861: aload_2
    //   2862: astore 20
    //   2864: lload 7
    //   2866: lstore 13
    //   2868: lload 9
    //   2870: lstore 5
    //   2872: aload_1
    //   2873: astore 21
    //   2875: aload 18
    //   2877: astore 4
    //   2879: lload 7
    //   2881: lstore 26
    //   2883: lload 9
    //   2885: lstore 28
    //   2887: lload 7
    //   2889: lstore 30
    //   2891: lload 9
    //   2893: lstore 32
    //   2895: lload 7
    //   2897: lstore 34
    //   2899: lload 9
    //   2901: lstore 36
    //   2903: lload 7
    //   2905: lstore 38
    //   2907: lload 9
    //   2909: lstore 40
    //   2911: invokestatic 555	com/tencent/mm/plugin/music/cache/e:bTG	()Z
    //   2914: ifeq +1302 -> 4216
    //   2917: lload 7
    //   2919: lstore 22
    //   2921: lload 9
    //   2923: lstore 24
    //   2925: aload_2
    //   2926: astore 20
    //   2928: lload 7
    //   2930: lstore 13
    //   2932: lload 9
    //   2934: lstore 5
    //   2936: aload_1
    //   2937: astore 21
    //   2939: aload 18
    //   2941: astore 4
    //   2943: lload 7
    //   2945: lstore 26
    //   2947: lload 9
    //   2949: lstore 28
    //   2951: lload 7
    //   2953: lstore 30
    //   2955: lload 9
    //   2957: lstore 32
    //   2959: lload 7
    //   2961: lstore 34
    //   2963: lload 9
    //   2965: lstore 36
    //   2967: lload 7
    //   2969: lstore 38
    //   2971: lload 9
    //   2973: lstore 40
    //   2975: ldc_w 557
    //   2978: invokestatic 346	com/tencent/mm/plugin/music/f/c/b:ar	(Ljava/lang/Class;)Lcom/tencent/mm/plugin/music/f/c/a;
    //   2981: checkcast 557	com/tencent/mm/plugin/music/cache/c
    //   2984: aload 42
    //   2986: aload 43
    //   2988: invokeinterface 560 3 0
    //   2993: lload 7
    //   2995: lstore 22
    //   2997: lload 9
    //   2999: lstore 24
    //   3001: aload_2
    //   3002: astore 20
    //   3004: lload 7
    //   3006: lstore 13
    //   3008: lload 9
    //   3010: lstore 5
    //   3012: aload_1
    //   3013: astore 21
    //   3015: aload 18
    //   3017: astore 4
    //   3019: lload 7
    //   3021: lstore 26
    //   3023: lload 9
    //   3025: lstore 28
    //   3027: lload 7
    //   3029: lstore 30
    //   3031: lload 9
    //   3033: lstore 32
    //   3035: lload 7
    //   3037: lstore 34
    //   3039: lload 9
    //   3041: lstore 36
    //   3043: lload 7
    //   3045: lstore 38
    //   3047: lload 9
    //   3049: lstore 40
    //   3051: aload_2
    //   3052: ldc_w 562
    //   3055: invokevirtual 300	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   3058: astore 43
    //   3060: lload 7
    //   3062: lstore 22
    //   3064: lload 9
    //   3066: lstore 24
    //   3068: aload_2
    //   3069: astore 20
    //   3071: lload 7
    //   3073: lstore 13
    //   3075: lload 9
    //   3077: lstore 5
    //   3079: aload_1
    //   3080: astore 21
    //   3082: aload 18
    //   3084: astore 4
    //   3086: lload 7
    //   3088: lstore 26
    //   3090: lload 9
    //   3092: lstore 28
    //   3094: lload 7
    //   3096: lstore 30
    //   3098: lload 9
    //   3100: lstore 32
    //   3102: lload 7
    //   3104: lstore 34
    //   3106: lload 9
    //   3108: lstore 36
    //   3110: lload 7
    //   3112: lstore 38
    //   3114: lload 9
    //   3116: lstore 40
    //   3118: aload 43
    //   3120: invokestatic 564	com/tencent/mm/plugin/music/c/b:Tg	(Ljava/lang/String;)[J
    //   3123: astore 42
    //   3125: lload 7
    //   3127: lstore 22
    //   3129: lload 9
    //   3131: lstore 24
    //   3133: aload_2
    //   3134: astore 20
    //   3136: lload 7
    //   3138: lstore 13
    //   3140: lload 9
    //   3142: lstore 5
    //   3144: aload_1
    //   3145: astore 21
    //   3147: aload 18
    //   3149: astore 4
    //   3151: lload 7
    //   3153: lstore 26
    //   3155: lload 9
    //   3157: lstore 28
    //   3159: lload 7
    //   3161: lstore 30
    //   3163: lload 9
    //   3165: lstore 32
    //   3167: lload 7
    //   3169: lstore 34
    //   3171: lload 9
    //   3173: lstore 36
    //   3175: lload 7
    //   3177: lstore 38
    //   3179: lload 9
    //   3181: lstore 40
    //   3183: aload_2
    //   3184: ldc_w 566
    //   3187: invokevirtual 300	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   3190: lconst_0
    //   3191: invokestatic 570	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   3194: lstore 44
    //   3196: lload 7
    //   3198: lstore 22
    //   3200: lload 9
    //   3202: lstore 24
    //   3204: aload_2
    //   3205: astore 20
    //   3207: lload 7
    //   3209: lstore 13
    //   3211: lload 9
    //   3213: lstore 5
    //   3215: aload_1
    //   3216: astore 21
    //   3218: aload 18
    //   3220: astore 4
    //   3222: lload 7
    //   3224: lstore 26
    //   3226: lload 9
    //   3228: lstore 28
    //   3230: lload 7
    //   3232: lstore 30
    //   3234: lload 9
    //   3236: lstore 32
    //   3238: lload 7
    //   3240: lstore 34
    //   3242: lload 9
    //   3244: lstore 36
    //   3246: lload 7
    //   3248: lstore 38
    //   3250: lload 9
    //   3252: lstore 40
    //   3254: ldc 83
    //   3256: ldc_w 572
    //   3259: iconst_2
    //   3260: anewarray 4	java/lang/Object
    //   3263: dup
    //   3264: iconst_0
    //   3265: aload 43
    //   3267: aastore
    //   3268: dup
    //   3269: iconst_1
    //   3270: lload 44
    //   3272: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3275: aastore
    //   3276: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3279: aload 42
    //   3281: ifnonnull +1021 -> 4302
    //   3284: lload 7
    //   3286: lstore 22
    //   3288: lload 9
    //   3290: lstore 24
    //   3292: aload_2
    //   3293: astore 20
    //   3295: lload 7
    //   3297: lstore 13
    //   3299: lload 9
    //   3301: lstore 5
    //   3303: aload_1
    //   3304: astore 21
    //   3306: aload 18
    //   3308: astore 4
    //   3310: lload 7
    //   3312: lstore 26
    //   3314: lload 9
    //   3316: lstore 28
    //   3318: lload 7
    //   3320: lstore 30
    //   3322: lload 9
    //   3324: lstore 32
    //   3326: lload 7
    //   3328: lstore 34
    //   3330: lload 9
    //   3332: lstore 36
    //   3334: lload 7
    //   3336: lstore 38
    //   3338: lload 9
    //   3340: lstore 40
    //   3342: ldc 83
    //   3344: ldc_w 574
    //   3347: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3350: lload 9
    //   3352: lstore 7
    //   3354: lload 9
    //   3356: lconst_0
    //   3357: lcmp
    //   3358: ifeq +6 -> 3364
    //   3361: lconst_0
    //   3362: lstore 7
    //   3364: lload 44
    //   3366: lstore 5
    //   3368: lload 7
    //   3370: lstore 9
    //   3372: lload 5
    //   3374: lstore 7
    //   3376: ldc2_w 575
    //   3379: lstore 44
    //   3381: lload 7
    //   3383: lconst_0
    //   3384: lcmp
    //   3385: ifeq +7 -> 3392
    //   3388: lload 7
    //   3390: lstore 44
    //   3392: lload 7
    //   3394: lstore 22
    //   3396: lload 9
    //   3398: lstore 24
    //   3400: aload_2
    //   3401: astore 20
    //   3403: lload 7
    //   3405: lstore 13
    //   3407: lload 9
    //   3409: lstore 5
    //   3411: aload_1
    //   3412: astore 21
    //   3414: aload 18
    //   3416: astore 4
    //   3418: lload 7
    //   3420: lstore 26
    //   3422: lload 9
    //   3424: lstore 28
    //   3426: lload 7
    //   3428: lstore 30
    //   3430: lload 9
    //   3432: lstore 32
    //   3434: lload 7
    //   3436: lstore 34
    //   3438: lload 9
    //   3440: lstore 36
    //   3442: lload 7
    //   3444: lstore 38
    //   3446: lload 9
    //   3448: lstore 40
    //   3450: ldc 83
    //   3452: ldc_w 578
    //   3455: iconst_2
    //   3456: anewarray 4	java/lang/Object
    //   3459: dup
    //   3460: iconst_0
    //   3461: lload 44
    //   3463: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3466: aastore
    //   3467: dup
    //   3468: iconst_1
    //   3469: lload 9
    //   3471: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3474: aastore
    //   3475: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3478: lload 7
    //   3480: lstore 22
    //   3482: lload 9
    //   3484: lstore 24
    //   3486: aload_2
    //   3487: astore 20
    //   3489: lload 7
    //   3491: lstore 13
    //   3493: lload 9
    //   3495: lstore 5
    //   3497: aload_1
    //   3498: astore 21
    //   3500: aload 18
    //   3502: astore 4
    //   3504: lload 7
    //   3506: lstore 26
    //   3508: lload 9
    //   3510: lstore 28
    //   3512: lload 7
    //   3514: lstore 30
    //   3516: lload 9
    //   3518: lstore 32
    //   3520: lload 7
    //   3522: lstore 34
    //   3524: lload 9
    //   3526: lstore 36
    //   3528: lload 7
    //   3530: lstore 38
    //   3532: lload 9
    //   3534: lstore 40
    //   3536: aload_1
    //   3537: lload 44
    //   3539: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   3542: lload 7
    //   3544: lstore 22
    //   3546: lload 9
    //   3548: lstore 24
    //   3550: aload_2
    //   3551: astore 20
    //   3553: lload 7
    //   3555: lstore 13
    //   3557: lload 9
    //   3559: lstore 5
    //   3561: aload_1
    //   3562: astore 21
    //   3564: aload 18
    //   3566: astore 4
    //   3568: lload 7
    //   3570: lstore 26
    //   3572: lload 9
    //   3574: lstore 28
    //   3576: lload 7
    //   3578: lstore 30
    //   3580: lload 9
    //   3582: lstore 32
    //   3584: lload 7
    //   3586: lstore 34
    //   3588: lload 9
    //   3590: lstore 36
    //   3592: lload 7
    //   3594: lstore 38
    //   3596: lload 9
    //   3598: lstore 40
    //   3600: aload_1
    //   3601: lload 9
    //   3603: invokevirtual 581	java/io/RandomAccessFile:seek	(J)V
    //   3606: lload 7
    //   3608: lstore 22
    //   3610: lload 9
    //   3612: lstore 24
    //   3614: aload_2
    //   3615: astore 20
    //   3617: lload 7
    //   3619: lstore 13
    //   3621: lload 9
    //   3623: lstore 5
    //   3625: aload_1
    //   3626: astore 21
    //   3628: aload 18
    //   3630: astore 4
    //   3632: lload 7
    //   3634: lstore 26
    //   3636: lload 9
    //   3638: lstore 28
    //   3640: lload 7
    //   3642: lstore 30
    //   3644: lload 9
    //   3646: lstore 32
    //   3648: lload 7
    //   3650: lstore 34
    //   3652: lload 9
    //   3654: lstore 36
    //   3656: lload 7
    //   3658: lstore 38
    //   3660: lload 9
    //   3662: lstore 40
    //   3664: aload_2
    //   3665: invokevirtual 585	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   3668: astore 18
    //   3670: aload 18
    //   3672: astore 4
    //   3674: lload 9
    //   3676: lstore 32
    //   3678: lload 9
    //   3680: lstore 24
    //   3682: lload 9
    //   3684: lstore 36
    //   3686: lload 9
    //   3688: lstore 28
    //   3690: lload 9
    //   3692: lstore 40
    //   3694: lload 9
    //   3696: lstore 13
    //   3698: sipush 4096
    //   3701: newarray byte
    //   3703: astore 20
    //   3705: lload 9
    //   3707: lstore 32
    //   3709: lload 9
    //   3711: lstore 24
    //   3713: lload 9
    //   3715: lstore 36
    //   3717: lload 9
    //   3719: lstore 28
    //   3721: lload 9
    //   3723: lstore 40
    //   3725: lload 9
    //   3727: lstore 13
    //   3729: aload_0
    //   3730: getfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   3733: ifne +1328 -> 5061
    //   3736: lload 9
    //   3738: lstore 32
    //   3740: lload 9
    //   3742: lstore 24
    //   3744: lload 9
    //   3746: lstore 36
    //   3748: lload 9
    //   3750: lstore 28
    //   3752: lload 9
    //   3754: lstore 40
    //   3756: lload 9
    //   3758: lstore 13
    //   3760: aload 4
    //   3762: aload 20
    //   3764: invokevirtual 591	java/io/InputStream:read	([B)I
    //   3767: istore 11
    //   3769: iload 11
    //   3771: ifle +1220 -> 4991
    //   3774: lload 9
    //   3776: lstore 32
    //   3778: lload 9
    //   3780: lstore 24
    //   3782: lload 9
    //   3784: lstore 36
    //   3786: lload 9
    //   3788: lstore 28
    //   3790: lload 9
    //   3792: lstore 40
    //   3794: lload 9
    //   3796: lstore 13
    //   3798: aload_1
    //   3799: aload 20
    //   3801: iconst_0
    //   3802: iload 11
    //   3804: invokevirtual 595	java/io/RandomAccessFile:write	([BII)V
    //   3807: lload 9
    //   3809: iload 11
    //   3811: i2l
    //   3812: ladd
    //   3813: lstore 5
    //   3815: lload 5
    //   3817: lstore 32
    //   3819: lload 5
    //   3821: lstore 24
    //   3823: lload 5
    //   3825: lstore 36
    //   3827: lload 5
    //   3829: lstore 28
    //   3831: lload 5
    //   3833: lstore 40
    //   3835: lload 5
    //   3837: lstore 13
    //   3839: ldc 83
    //   3841: ldc_w 597
    //   3844: iconst_2
    //   3845: anewarray 4	java/lang/Object
    //   3848: dup
    //   3849: iconst_0
    //   3850: lload 5
    //   3852: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3855: aastore
    //   3856: dup
    //   3857: iconst_1
    //   3858: lload 44
    //   3860: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3863: aastore
    //   3864: invokestatic 600	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3867: lload 5
    //   3869: lstore 32
    //   3871: lload 5
    //   3873: lstore 24
    //   3875: lload 5
    //   3877: lstore 36
    //   3879: lload 5
    //   3881: lstore 28
    //   3883: lload 5
    //   3885: lstore 40
    //   3887: lload 5
    //   3889: lstore 13
    //   3891: aload_0
    //   3892: getfield 105	com/tencent/mm/plugin/music/c/b:mgU	Z
    //   3895: ifeq +826 -> 4721
    //   3898: lload 5
    //   3900: lstore 32
    //   3902: lload 5
    //   3904: lstore 24
    //   3906: lload 5
    //   3908: lstore 36
    //   3910: lload 5
    //   3912: lstore 28
    //   3914: lload 5
    //   3916: lstore 40
    //   3918: lload 5
    //   3920: lstore 13
    //   3922: aload_0
    //   3923: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   3926: lload 5
    //   3928: putfield 75	com/tencent/mm/plugin/music/c/a:oLp	J
    //   3931: lload 5
    //   3933: lstore 32
    //   3935: lload 5
    //   3937: lstore 24
    //   3939: lload 5
    //   3941: lstore 36
    //   3943: lload 5
    //   3945: lstore 28
    //   3947: lload 5
    //   3949: lstore 40
    //   3951: lload 5
    //   3953: lstore 13
    //   3955: aload_0
    //   3956: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   3959: lload 44
    //   3961: putfield 78	com/tencent/mm/plugin/music/c/a:oLr	J
    //   3964: lload 5
    //   3966: lstore 9
    //   3968: lload 5
    //   3970: ldc2_w 380
    //   3973: lcmp
    //   3974: iflt -269 -> 3705
    //   3977: lload 5
    //   3979: lstore 32
    //   3981: lload 5
    //   3983: lstore 24
    //   3985: lload 5
    //   3987: lstore 36
    //   3989: lload 5
    //   3991: lstore 28
    //   3993: lload 5
    //   3995: lstore 40
    //   3997: lload 5
    //   3999: lstore 13
    //   4001: new 8	com/tencent/mm/plugin/music/c/b$a
    //   4004: astore 21
    //   4006: lload 5
    //   4008: lstore 32
    //   4010: lload 5
    //   4012: lstore 24
    //   4014: lload 5
    //   4016: lstore 36
    //   4018: lload 5
    //   4020: lstore 28
    //   4022: lload 5
    //   4024: lstore 40
    //   4026: lload 5
    //   4028: lstore 13
    //   4030: aload 21
    //   4032: aload_0
    //   4033: iconst_1
    //   4034: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   4037: lload 5
    //   4039: lstore 32
    //   4041: lload 5
    //   4043: lstore 24
    //   4045: lload 5
    //   4047: lstore 36
    //   4049: lload 5
    //   4051: lstore 28
    //   4053: lload 5
    //   4055: lstore 40
    //   4057: lload 5
    //   4059: lstore 13
    //   4061: aload 21
    //   4063: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   4066: lload 5
    //   4068: lstore 9
    //   4070: goto -365 -> 3705
    //   4073: astore 21
    //   4075: lload 32
    //   4077: lstore 9
    //   4079: ldc 83
    //   4081: aload 21
    //   4083: ldc_w 602
    //   4086: iconst_1
    //   4087: anewarray 4	java/lang/Object
    //   4090: dup
    //   4091: iconst_0
    //   4092: aload 12
    //   4094: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   4097: aastore
    //   4098: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4101: aload_0
    //   4102: sipush 750
    //   4105: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   4108: aload_0
    //   4109: iconst_5
    //   4110: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   4113: lload 7
    //   4115: lconst_0
    //   4116: lcmp
    //   4117: ifne +1255 -> 5372
    //   4120: lload 9
    //   4122: lconst_0
    //   4123: lcmp
    //   4124: ifle +1248 -> 5372
    //   4127: ldc 83
    //   4129: ldc_w 439
    //   4132: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4135: aload_1
    //   4136: lload 9
    //   4138: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   4141: aload_0
    //   4142: lload 9
    //   4144: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   4147: lload 9
    //   4149: ldc2_w 380
    //   4152: lcmp
    //   4153: ifge +15 -> 4168
    //   4156: new 8	com/tencent/mm/plugin/music/c/b$a
    //   4159: dup
    //   4160: aload_0
    //   4161: iconst_1
    //   4162: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   4165: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   4168: aload 4
    //   4170: ifnull +8 -> 4178
    //   4173: aload 4
    //   4175: invokevirtual 603	java/io/InputStream:close	()V
    //   4178: aload_1
    //   4179: ifnull +7 -> 4186
    //   4182: aload_1
    //   4183: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   4186: aload_2
    //   4187: ifnull +7 -> 4194
    //   4190: aload_2
    //   4191: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   4194: aload_0
    //   4195: iconst_1
    //   4196: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   4199: ldc 83
    //   4201: ldc_w 446
    //   4204: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4207: ldc_w 361
    //   4210: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4213: goto -4194 -> 19
    //   4216: lload 7
    //   4218: lstore 22
    //   4220: lload 9
    //   4222: lstore 24
    //   4224: aload_2
    //   4225: astore 20
    //   4227: lload 7
    //   4229: lstore 13
    //   4231: lload 9
    //   4233: lstore 5
    //   4235: aload_1
    //   4236: astore 21
    //   4238: aload 18
    //   4240: astore 4
    //   4242: lload 7
    //   4244: lstore 26
    //   4246: lload 9
    //   4248: lstore 28
    //   4250: lload 7
    //   4252: lstore 30
    //   4254: lload 9
    //   4256: lstore 32
    //   4258: lload 7
    //   4260: lstore 34
    //   4262: lload 9
    //   4264: lstore 36
    //   4266: lload 7
    //   4268: lstore 38
    //   4270: lload 9
    //   4272: lstore 40
    //   4274: ldc_w 605
    //   4277: ldc_w 607
    //   4280: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4283: goto -1290 -> 2993
    //   4286: astore 21
    //   4288: aconst_null
    //   4289: astore 4
    //   4291: lload 22
    //   4293: lstore 7
    //   4295: lload 24
    //   4297: lstore 9
    //   4299: goto -220 -> 4079
    //   4302: lload 9
    //   4304: lconst_0
    //   4305: lcmp
    //   4306: ifle +406 -> 4712
    //   4309: lload 9
    //   4311: aload 42
    //   4313: iconst_0
    //   4314: laload
    //   4315: lcmp
    //   4316: ifeq +396 -> 4712
    //   4319: lload 7
    //   4321: lstore 22
    //   4323: lload 9
    //   4325: lstore 24
    //   4327: aload_2
    //   4328: astore 20
    //   4330: lload 7
    //   4332: lstore 13
    //   4334: lload 9
    //   4336: lstore 5
    //   4338: aload_1
    //   4339: astore 21
    //   4341: aload 18
    //   4343: astore 4
    //   4345: lload 7
    //   4347: lstore 26
    //   4349: lload 9
    //   4351: lstore 28
    //   4353: lload 7
    //   4355: lstore 30
    //   4357: lload 9
    //   4359: lstore 32
    //   4361: lload 7
    //   4363: lstore 34
    //   4365: lload 9
    //   4367: lstore 36
    //   4369: lload 7
    //   4371: lstore 38
    //   4373: lload 9
    //   4375: lstore 40
    //   4377: ldc 83
    //   4379: ldc_w 609
    //   4382: invokestatic 91	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4385: lload 7
    //   4387: lstore 22
    //   4389: lload 9
    //   4391: lstore 24
    //   4393: aload_2
    //   4394: astore 20
    //   4396: lload 7
    //   4398: lstore 13
    //   4400: lload 9
    //   4402: lstore 5
    //   4404: aload_1
    //   4405: astore 21
    //   4407: aload 18
    //   4409: astore 4
    //   4411: lload 7
    //   4413: lstore 26
    //   4415: lload 9
    //   4417: lstore 28
    //   4419: lload 7
    //   4421: lstore 30
    //   4423: lload 9
    //   4425: lstore 32
    //   4427: lload 7
    //   4429: lstore 34
    //   4431: lload 9
    //   4433: lstore 36
    //   4435: lload 7
    //   4437: lstore 38
    //   4439: lload 9
    //   4441: lstore 40
    //   4443: aload_0
    //   4444: bipush 6
    //   4446: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   4449: lload 7
    //   4451: lconst_0
    //   4452: lcmp
    //   4453: ifne +104 -> 4557
    //   4456: lload 9
    //   4458: lconst_0
    //   4459: lcmp
    //   4460: ifle +97 -> 4557
    //   4463: ldc 83
    //   4465: ldc_w 439
    //   4468: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4471: aload_1
    //   4472: lload 9
    //   4474: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   4477: aload_0
    //   4478: lload 9
    //   4480: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   4483: lload 9
    //   4485: ldc2_w 380
    //   4488: lcmp
    //   4489: ifge +15 -> 4504
    //   4492: new 8	com/tencent/mm/plugin/music/c/b$a
    //   4495: dup
    //   4496: aload_0
    //   4497: iconst_1
    //   4498: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   4501: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   4504: aload_1
    //   4505: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   4508: aload_2
    //   4509: ifnull +7 -> 4516
    //   4512: aload_2
    //   4513: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   4516: aload_0
    //   4517: iconst_1
    //   4518: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   4521: ldc 83
    //   4523: ldc_w 446
    //   4526: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4529: ldc_w 361
    //   4532: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4535: goto -4516 -> 19
    //   4538: astore 4
    //   4540: ldc 83
    //   4542: aload 4
    //   4544: ldc_w 448
    //   4547: iconst_0
    //   4548: anewarray 4	java/lang/Object
    //   4551: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4554: goto -77 -> 4477
    //   4557: lload 7
    //   4559: lconst_0
    //   4560: lcmp
    //   4561: ifeq +50 -> 4611
    //   4564: lload 9
    //   4566: lload 7
    //   4568: lcmp
    //   4569: ifeq +42 -> 4611
    //   4572: ldc 83
    //   4574: ldc_w 450
    //   4577: iconst_2
    //   4578: anewarray 4	java/lang/Object
    //   4581: dup
    //   4582: iconst_0
    //   4583: lload 7
    //   4585: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4588: aastore
    //   4589: dup
    //   4590: iconst_1
    //   4591: lload 9
    //   4593: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4596: aastore
    //   4597: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4600: aload_0
    //   4601: lload 9
    //   4603: lload 7
    //   4605: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   4608: goto -104 -> 4504
    //   4611: lload 7
    //   4613: lconst_0
    //   4614: lcmp
    //   4615: ifeq +69 -> 4684
    //   4618: lload 9
    //   4620: lload 7
    //   4622: lcmp
    //   4623: ifne +61 -> 4684
    //   4626: ldc 83
    //   4628: ldc_w 454
    //   4631: iconst_2
    //   4632: anewarray 4	java/lang/Object
    //   4635: dup
    //   4636: iconst_0
    //   4637: lload 7
    //   4639: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4642: aastore
    //   4643: dup
    //   4644: iconst_1
    //   4645: lload 9
    //   4647: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4650: aastore
    //   4651: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4654: aload_0
    //   4655: lload 7
    //   4657: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   4660: lload 9
    //   4662: ldc2_w 380
    //   4665: lcmp
    //   4666: ifge -162 -> 4504
    //   4669: new 8	com/tencent/mm/plugin/music/c/b$a
    //   4672: dup
    //   4673: aload_0
    //   4674: iconst_1
    //   4675: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   4678: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   4681: goto -177 -> 4504
    //   4684: ldc 83
    //   4686: ldc_w 456
    //   4689: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4692: goto -188 -> 4504
    //   4695: astore_1
    //   4696: ldc 83
    //   4698: aload_1
    //   4699: ldc_w 448
    //   4702: iconst_0
    //   4703: anewarray 4	java/lang/Object
    //   4706: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4709: goto -201 -> 4508
    //   4712: aload 42
    //   4714: iconst_2
    //   4715: laload
    //   4716: lstore 7
    //   4718: goto -1342 -> 3376
    //   4721: lload 5
    //   4723: lstore 32
    //   4725: lload 5
    //   4727: lstore 24
    //   4729: lload 5
    //   4731: lstore 36
    //   4733: lload 5
    //   4735: lstore 28
    //   4737: lload 5
    //   4739: lstore 40
    //   4741: lload 5
    //   4743: lstore 13
    //   4745: aload_0
    //   4746: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   4749: lload 5
    //   4751: putfield 66	com/tencent/mm/plugin/music/c/a:oLn	J
    //   4754: lload 5
    //   4756: lstore 32
    //   4758: lload 5
    //   4760: lstore 24
    //   4762: lload 5
    //   4764: lstore 36
    //   4766: lload 5
    //   4768: lstore 28
    //   4770: lload 5
    //   4772: lstore 40
    //   4774: lload 5
    //   4776: lstore 13
    //   4778: aload_0
    //   4779: getfield 61	com/tencent/mm/plugin/music/c/b:oLu	Lcom/tencent/mm/plugin/music/c/a;
    //   4782: lload 44
    //   4784: putfield 69	com/tencent/mm/plugin/music/c/a:oLo	J
    //   4787: goto -823 -> 3964
    //   4790: astore 18
    //   4792: aload 4
    //   4794: astore 16
    //   4796: lload 24
    //   4798: lstore 9
    //   4800: aload_2
    //   4801: astore 20
    //   4803: lload 7
    //   4805: lstore 13
    //   4807: lload 9
    //   4809: lstore 5
    //   4811: aload_1
    //   4812: astore 21
    //   4814: aload 16
    //   4816: astore 4
    //   4818: ldc 83
    //   4820: aload 18
    //   4822: ldc_w 602
    //   4825: iconst_1
    //   4826: anewarray 4	java/lang/Object
    //   4829: dup
    //   4830: iconst_0
    //   4831: aload 12
    //   4833: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   4836: aastore
    //   4837: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4840: aload_2
    //   4841: astore 20
    //   4843: lload 7
    //   4845: lstore 13
    //   4847: lload 9
    //   4849: lstore 5
    //   4851: aload_1
    //   4852: astore 21
    //   4854: aload 16
    //   4856: astore 4
    //   4858: aload_0
    //   4859: sipush 751
    //   4862: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   4865: aload_2
    //   4866: astore 20
    //   4868: lload 7
    //   4870: lstore 13
    //   4872: lload 9
    //   4874: lstore 5
    //   4876: aload_1
    //   4877: astore 21
    //   4879: aload 16
    //   4881: astore 4
    //   4883: aload_0
    //   4884: iconst_5
    //   4885: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   4888: lload 7
    //   4890: lconst_0
    //   4891: lcmp
    //   4892: ifne +673 -> 5565
    //   4895: lload 9
    //   4897: lconst_0
    //   4898: lcmp
    //   4899: ifle +666 -> 5565
    //   4902: ldc 83
    //   4904: ldc_w 439
    //   4907: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4910: aload_1
    //   4911: lload 9
    //   4913: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   4916: aload_0
    //   4917: lload 9
    //   4919: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   4922: lload 9
    //   4924: ldc2_w 380
    //   4927: lcmp
    //   4928: ifge +15 -> 4943
    //   4931: new 8	com/tencent/mm/plugin/music/c/b$a
    //   4934: dup
    //   4935: aload_0
    //   4936: iconst_1
    //   4937: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   4940: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   4943: aload 16
    //   4945: ifnull +8 -> 4953
    //   4948: aload 16
    //   4950: invokevirtual 603	java/io/InputStream:close	()V
    //   4953: aload_1
    //   4954: ifnull +7 -> 4961
    //   4957: aload_1
    //   4958: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   4961: aload_2
    //   4962: ifnull +7 -> 4969
    //   4965: aload_2
    //   4966: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   4969: aload_0
    //   4970: iconst_1
    //   4971: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   4974: ldc 83
    //   4976: ldc_w 446
    //   4979: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4982: ldc_w 361
    //   4985: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4988: goto -4969 -> 19
    //   4991: lload 9
    //   4993: lstore 32
    //   4995: lload 9
    //   4997: lstore 24
    //   4999: lload 9
    //   5001: lstore 36
    //   5003: lload 9
    //   5005: lstore 28
    //   5007: lload 9
    //   5009: lstore 40
    //   5011: lload 9
    //   5013: lstore 13
    //   5015: ldc 83
    //   5017: ldc_w 611
    //   5020: iconst_4
    //   5021: anewarray 4	java/lang/Object
    //   5024: dup
    //   5025: iconst_0
    //   5026: iload 11
    //   5028: invokestatic 282	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   5031: aastore
    //   5032: dup
    //   5033: iconst_1
    //   5034: aload_0
    //   5035: getfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   5038: invokestatic 405	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   5041: aastore
    //   5042: dup
    //   5043: iconst_2
    //   5044: lload 9
    //   5046: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5049: aastore
    //   5050: dup
    //   5051: iconst_3
    //   5052: lload 44
    //   5054: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5057: aastore
    //   5058: invokestatic 304	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5061: lload 7
    //   5063: lconst_0
    //   5064: lcmp
    //   5065: ifne +114 -> 5179
    //   5068: lload 9
    //   5070: lconst_0
    //   5071: lcmp
    //   5072: ifle +107 -> 5179
    //   5075: ldc 83
    //   5077: ldc_w 439
    //   5080: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5083: aload_1
    //   5084: lload 9
    //   5086: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   5089: aload_0
    //   5090: lload 9
    //   5092: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   5095: lload 9
    //   5097: ldc2_w 380
    //   5100: lcmp
    //   5101: ifge +15 -> 5116
    //   5104: new 8	com/tencent/mm/plugin/music/c/b$a
    //   5107: dup
    //   5108: aload_0
    //   5109: iconst_1
    //   5110: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   5113: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   5116: aload 4
    //   5118: ifnull +8 -> 5126
    //   5121: aload 4
    //   5123: invokevirtual 603	java/io/InputStream:close	()V
    //   5126: aload_1
    //   5127: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   5130: aload_2
    //   5131: ifnull +7 -> 5138
    //   5134: aload_2
    //   5135: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   5138: aload_0
    //   5139: iconst_1
    //   5140: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   5143: ldc 83
    //   5145: ldc_w 446
    //   5148: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5151: ldc_w 361
    //   5154: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   5157: goto -5138 -> 19
    //   5160: astore 21
    //   5162: ldc 83
    //   5164: aload 21
    //   5166: ldc_w 448
    //   5169: iconst_0
    //   5170: anewarray 4	java/lang/Object
    //   5173: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5176: goto -87 -> 5089
    //   5179: lload 7
    //   5181: lconst_0
    //   5182: lcmp
    //   5183: ifeq +50 -> 5233
    //   5186: lload 9
    //   5188: lload 7
    //   5190: lcmp
    //   5191: ifeq +42 -> 5233
    //   5194: ldc 83
    //   5196: ldc_w 450
    //   5199: iconst_2
    //   5200: anewarray 4	java/lang/Object
    //   5203: dup
    //   5204: iconst_0
    //   5205: lload 7
    //   5207: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5210: aastore
    //   5211: dup
    //   5212: iconst_1
    //   5213: lload 9
    //   5215: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5218: aastore
    //   5219: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5222: aload_0
    //   5223: lload 9
    //   5225: lload 7
    //   5227: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   5230: goto -114 -> 5116
    //   5233: lload 7
    //   5235: lconst_0
    //   5236: lcmp
    //   5237: ifeq +69 -> 5306
    //   5240: lload 9
    //   5242: lload 7
    //   5244: lcmp
    //   5245: ifne +61 -> 5306
    //   5248: ldc 83
    //   5250: ldc_w 454
    //   5253: iconst_2
    //   5254: anewarray 4	java/lang/Object
    //   5257: dup
    //   5258: iconst_0
    //   5259: lload 7
    //   5261: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5264: aastore
    //   5265: dup
    //   5266: iconst_1
    //   5267: lload 9
    //   5269: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5272: aastore
    //   5273: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5276: aload_0
    //   5277: lload 7
    //   5279: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   5282: lload 9
    //   5284: ldc2_w 380
    //   5287: lcmp
    //   5288: ifge -172 -> 5116
    //   5291: new 8	com/tencent/mm/plugin/music/c/b$a
    //   5294: dup
    //   5295: aload_0
    //   5296: iconst_1
    //   5297: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   5300: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   5303: goto -187 -> 5116
    //   5306: ldc 83
    //   5308: ldc_w 456
    //   5311: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5314: goto -198 -> 5116
    //   5317: astore 4
    //   5319: ldc 83
    //   5321: aload 4
    //   5323: ldc_w 613
    //   5326: iconst_0
    //   5327: anewarray 4	java/lang/Object
    //   5330: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5333: goto -207 -> 5126
    //   5336: astore_1
    //   5337: ldc 83
    //   5339: aload_1
    //   5340: ldc_w 448
    //   5343: iconst_0
    //   5344: anewarray 4	java/lang/Object
    //   5347: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5350: goto -220 -> 5130
    //   5353: astore 21
    //   5355: ldc 83
    //   5357: aload 21
    //   5359: ldc_w 448
    //   5362: iconst_0
    //   5363: anewarray 4	java/lang/Object
    //   5366: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5369: goto -1228 -> 4141
    //   5372: lload 7
    //   5374: lconst_0
    //   5375: lcmp
    //   5376: ifeq +50 -> 5426
    //   5379: lload 9
    //   5381: lload 7
    //   5383: lcmp
    //   5384: ifeq +42 -> 5426
    //   5387: ldc 83
    //   5389: ldc_w 450
    //   5392: iconst_2
    //   5393: anewarray 4	java/lang/Object
    //   5396: dup
    //   5397: iconst_0
    //   5398: lload 7
    //   5400: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5403: aastore
    //   5404: dup
    //   5405: iconst_1
    //   5406: lload 9
    //   5408: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5411: aastore
    //   5412: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5415: aload_0
    //   5416: lload 9
    //   5418: lload 7
    //   5420: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   5423: goto -1255 -> 4168
    //   5426: lload 7
    //   5428: lconst_0
    //   5429: lcmp
    //   5430: ifeq +69 -> 5499
    //   5433: lload 9
    //   5435: lload 7
    //   5437: lcmp
    //   5438: ifne +61 -> 5499
    //   5441: ldc 83
    //   5443: ldc_w 454
    //   5446: iconst_2
    //   5447: anewarray 4	java/lang/Object
    //   5450: dup
    //   5451: iconst_0
    //   5452: lload 7
    //   5454: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5457: aastore
    //   5458: dup
    //   5459: iconst_1
    //   5460: lload 9
    //   5462: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5465: aastore
    //   5466: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5469: aload_0
    //   5470: lload 7
    //   5472: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   5475: lload 9
    //   5477: ldc2_w 380
    //   5480: lcmp
    //   5481: ifge -1313 -> 4168
    //   5484: new 8	com/tencent/mm/plugin/music/c/b$a
    //   5487: dup
    //   5488: aload_0
    //   5489: iconst_1
    //   5490: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   5493: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   5496: goto -1328 -> 4168
    //   5499: ldc 83
    //   5501: ldc_w 456
    //   5504: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5507: goto -1339 -> 4168
    //   5510: astore 4
    //   5512: ldc 83
    //   5514: aload 4
    //   5516: ldc_w 613
    //   5519: iconst_0
    //   5520: anewarray 4	java/lang/Object
    //   5523: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5526: goto -1348 -> 4178
    //   5529: astore_1
    //   5530: ldc 83
    //   5532: aload_1
    //   5533: ldc_w 448
    //   5536: iconst_0
    //   5537: anewarray 4	java/lang/Object
    //   5540: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5543: goto -1357 -> 4186
    //   5546: astore 4
    //   5548: ldc 83
    //   5550: aload 4
    //   5552: ldc_w 448
    //   5555: iconst_0
    //   5556: anewarray 4	java/lang/Object
    //   5559: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5562: goto -646 -> 4916
    //   5565: lload 7
    //   5567: lconst_0
    //   5568: lcmp
    //   5569: ifeq +50 -> 5619
    //   5572: lload 9
    //   5574: lload 7
    //   5576: lcmp
    //   5577: ifeq +42 -> 5619
    //   5580: ldc 83
    //   5582: ldc_w 450
    //   5585: iconst_2
    //   5586: anewarray 4	java/lang/Object
    //   5589: dup
    //   5590: iconst_0
    //   5591: lload 7
    //   5593: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5596: aastore
    //   5597: dup
    //   5598: iconst_1
    //   5599: lload 9
    //   5601: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5604: aastore
    //   5605: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5608: aload_0
    //   5609: lload 9
    //   5611: lload 7
    //   5613: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   5616: goto -673 -> 4943
    //   5619: lload 7
    //   5621: lconst_0
    //   5622: lcmp
    //   5623: ifeq +69 -> 5692
    //   5626: lload 9
    //   5628: lload 7
    //   5630: lcmp
    //   5631: ifne +61 -> 5692
    //   5634: ldc 83
    //   5636: ldc_w 454
    //   5639: iconst_2
    //   5640: anewarray 4	java/lang/Object
    //   5643: dup
    //   5644: iconst_0
    //   5645: lload 7
    //   5647: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5650: aastore
    //   5651: dup
    //   5652: iconst_1
    //   5653: lload 9
    //   5655: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5658: aastore
    //   5659: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5662: aload_0
    //   5663: lload 7
    //   5665: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   5668: lload 9
    //   5670: ldc2_w 380
    //   5673: lcmp
    //   5674: ifge -731 -> 4943
    //   5677: new 8	com/tencent/mm/plugin/music/c/b$a
    //   5680: dup
    //   5681: aload_0
    //   5682: iconst_1
    //   5683: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   5686: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   5689: goto -746 -> 4943
    //   5692: ldc 83
    //   5694: ldc_w 456
    //   5697: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5700: goto -757 -> 4943
    //   5703: astore 4
    //   5705: ldc 83
    //   5707: aload 4
    //   5709: ldc_w 613
    //   5712: iconst_0
    //   5713: anewarray 4	java/lang/Object
    //   5716: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5719: goto -766 -> 4953
    //   5722: astore_1
    //   5723: ldc 83
    //   5725: aload_1
    //   5726: ldc_w 448
    //   5729: iconst_0
    //   5730: anewarray 4	java/lang/Object
    //   5733: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5736: goto -775 -> 4961
    //   5739: astore 18
    //   5741: aconst_null
    //   5742: astore_1
    //   5743: aconst_null
    //   5744: astore_2
    //   5745: aload 15
    //   5747: astore 16
    //   5749: aload_2
    //   5750: astore 20
    //   5752: lload 7
    //   5754: lstore 13
    //   5756: lload 9
    //   5758: lstore 5
    //   5760: aload_1
    //   5761: astore 21
    //   5763: aload 16
    //   5765: astore 4
    //   5767: ldc 83
    //   5769: aload 18
    //   5771: ldc_w 602
    //   5774: iconst_1
    //   5775: anewarray 4	java/lang/Object
    //   5778: dup
    //   5779: iconst_0
    //   5780: aload 12
    //   5782: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   5785: aastore
    //   5786: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5789: aload_2
    //   5790: astore 20
    //   5792: lload 7
    //   5794: lstore 13
    //   5796: lload 9
    //   5798: lstore 5
    //   5800: aload_1
    //   5801: astore 21
    //   5803: aload 16
    //   5805: astore 4
    //   5807: aload_0
    //   5808: sipush 752
    //   5811: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   5814: aload_2
    //   5815: astore 20
    //   5817: lload 7
    //   5819: lstore 13
    //   5821: lload 9
    //   5823: lstore 5
    //   5825: aload_1
    //   5826: astore 21
    //   5828: aload 16
    //   5830: astore 4
    //   5832: aload_0
    //   5833: iconst_5
    //   5834: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   5837: lload 7
    //   5839: lconst_0
    //   5840: lcmp
    //   5841: ifne +118 -> 5959
    //   5844: lload 9
    //   5846: lconst_0
    //   5847: lcmp
    //   5848: ifle +111 -> 5959
    //   5851: ldc 83
    //   5853: ldc_w 439
    //   5856: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5859: aload_1
    //   5860: lload 9
    //   5862: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   5865: aload_0
    //   5866: lload 9
    //   5868: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   5871: lload 9
    //   5873: ldc2_w 380
    //   5876: lcmp
    //   5877: ifge +15 -> 5892
    //   5880: new 8	com/tencent/mm/plugin/music/c/b$a
    //   5883: dup
    //   5884: aload_0
    //   5885: iconst_1
    //   5886: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   5889: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   5892: aload 16
    //   5894: ifnull +8 -> 5902
    //   5897: aload 16
    //   5899: invokevirtual 603	java/io/InputStream:close	()V
    //   5902: aload_1
    //   5903: ifnull +7 -> 5910
    //   5906: aload_1
    //   5907: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   5910: aload_2
    //   5911: ifnull +7 -> 5918
    //   5914: aload_2
    //   5915: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   5918: aload_0
    //   5919: iconst_1
    //   5920: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   5923: ldc 83
    //   5925: ldc_w 446
    //   5928: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5931: ldc_w 361
    //   5934: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   5937: goto -5918 -> 19
    //   5940: astore 4
    //   5942: ldc 83
    //   5944: aload 4
    //   5946: ldc_w 448
    //   5949: iconst_0
    //   5950: anewarray 4	java/lang/Object
    //   5953: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5956: goto -91 -> 5865
    //   5959: lload 7
    //   5961: lconst_0
    //   5962: lcmp
    //   5963: ifeq +50 -> 6013
    //   5966: lload 9
    //   5968: lload 7
    //   5970: lcmp
    //   5971: ifeq +42 -> 6013
    //   5974: ldc 83
    //   5976: ldc_w 450
    //   5979: iconst_2
    //   5980: anewarray 4	java/lang/Object
    //   5983: dup
    //   5984: iconst_0
    //   5985: lload 7
    //   5987: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5990: aastore
    //   5991: dup
    //   5992: iconst_1
    //   5993: lload 9
    //   5995: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5998: aastore
    //   5999: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6002: aload_0
    //   6003: lload 9
    //   6005: lload 7
    //   6007: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   6010: goto -118 -> 5892
    //   6013: lload 7
    //   6015: lconst_0
    //   6016: lcmp
    //   6017: ifeq +69 -> 6086
    //   6020: lload 9
    //   6022: lload 7
    //   6024: lcmp
    //   6025: ifne +61 -> 6086
    //   6028: ldc 83
    //   6030: ldc_w 454
    //   6033: iconst_2
    //   6034: anewarray 4	java/lang/Object
    //   6037: dup
    //   6038: iconst_0
    //   6039: lload 7
    //   6041: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6044: aastore
    //   6045: dup
    //   6046: iconst_1
    //   6047: lload 9
    //   6049: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6052: aastore
    //   6053: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6056: aload_0
    //   6057: lload 7
    //   6059: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6062: lload 9
    //   6064: ldc2_w 380
    //   6067: lcmp
    //   6068: ifge -176 -> 5892
    //   6071: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6074: dup
    //   6075: aload_0
    //   6076: iconst_1
    //   6077: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6080: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6083: goto -191 -> 5892
    //   6086: ldc 83
    //   6088: ldc_w 456
    //   6091: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6094: goto -202 -> 5892
    //   6097: astore 4
    //   6099: ldc 83
    //   6101: aload 4
    //   6103: ldc_w 613
    //   6106: iconst_0
    //   6107: anewarray 4	java/lang/Object
    //   6110: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6113: goto -211 -> 5902
    //   6116: astore_1
    //   6117: ldc 83
    //   6119: aload_1
    //   6120: ldc_w 448
    //   6123: iconst_0
    //   6124: anewarray 4	java/lang/Object
    //   6127: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6130: goto -220 -> 5910
    //   6133: astore 18
    //   6135: aconst_null
    //   6136: astore_1
    //   6137: aconst_null
    //   6138: astore_2
    //   6139: aload_2
    //   6140: astore 20
    //   6142: lload 7
    //   6144: lstore 13
    //   6146: lload 9
    //   6148: lstore 5
    //   6150: aload_1
    //   6151: astore 21
    //   6153: aload 16
    //   6155: astore 4
    //   6157: ldc 83
    //   6159: aload 18
    //   6161: ldc_w 602
    //   6164: iconst_1
    //   6165: anewarray 4	java/lang/Object
    //   6168: dup
    //   6169: iconst_0
    //   6170: aload 12
    //   6172: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   6175: aastore
    //   6176: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6179: aload_2
    //   6180: astore 20
    //   6182: lload 7
    //   6184: lstore 13
    //   6186: lload 9
    //   6188: lstore 5
    //   6190: aload_1
    //   6191: astore 21
    //   6193: aload 16
    //   6195: astore 4
    //   6197: aload_0
    //   6198: sipush 753
    //   6201: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   6204: aload_2
    //   6205: astore 20
    //   6207: lload 7
    //   6209: lstore 13
    //   6211: lload 9
    //   6213: lstore 5
    //   6215: aload_1
    //   6216: astore 21
    //   6218: aload 16
    //   6220: astore 4
    //   6222: aload_0
    //   6223: iconst_5
    //   6224: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   6227: lload 7
    //   6229: lconst_0
    //   6230: lcmp
    //   6231: ifne +118 -> 6349
    //   6234: lload 9
    //   6236: lconst_0
    //   6237: lcmp
    //   6238: ifle +111 -> 6349
    //   6241: ldc 83
    //   6243: ldc_w 439
    //   6246: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6249: aload_1
    //   6250: lload 9
    //   6252: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   6255: aload_0
    //   6256: lload 9
    //   6258: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6261: lload 9
    //   6263: ldc2_w 380
    //   6266: lcmp
    //   6267: ifge +15 -> 6282
    //   6270: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6273: dup
    //   6274: aload_0
    //   6275: iconst_1
    //   6276: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6279: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6282: aload 16
    //   6284: ifnull +8 -> 6292
    //   6287: aload 16
    //   6289: invokevirtual 603	java/io/InputStream:close	()V
    //   6292: aload_1
    //   6293: ifnull +7 -> 6300
    //   6296: aload_1
    //   6297: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   6300: aload_2
    //   6301: ifnull +7 -> 6308
    //   6304: aload_2
    //   6305: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   6308: aload_0
    //   6309: iconst_1
    //   6310: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   6313: ldc 83
    //   6315: ldc_w 446
    //   6318: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6321: ldc_w 361
    //   6324: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   6327: goto -6308 -> 19
    //   6330: astore 4
    //   6332: ldc 83
    //   6334: aload 4
    //   6336: ldc_w 448
    //   6339: iconst_0
    //   6340: anewarray 4	java/lang/Object
    //   6343: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6346: goto -91 -> 6255
    //   6349: lload 7
    //   6351: lconst_0
    //   6352: lcmp
    //   6353: ifeq +50 -> 6403
    //   6356: lload 9
    //   6358: lload 7
    //   6360: lcmp
    //   6361: ifeq +42 -> 6403
    //   6364: ldc 83
    //   6366: ldc_w 450
    //   6369: iconst_2
    //   6370: anewarray 4	java/lang/Object
    //   6373: dup
    //   6374: iconst_0
    //   6375: lload 7
    //   6377: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6380: aastore
    //   6381: dup
    //   6382: iconst_1
    //   6383: lload 9
    //   6385: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6388: aastore
    //   6389: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6392: aload_0
    //   6393: lload 9
    //   6395: lload 7
    //   6397: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   6400: goto -118 -> 6282
    //   6403: lload 7
    //   6405: lconst_0
    //   6406: lcmp
    //   6407: ifeq +69 -> 6476
    //   6410: lload 9
    //   6412: lload 7
    //   6414: lcmp
    //   6415: ifne +61 -> 6476
    //   6418: ldc 83
    //   6420: ldc_w 454
    //   6423: iconst_2
    //   6424: anewarray 4	java/lang/Object
    //   6427: dup
    //   6428: iconst_0
    //   6429: lload 7
    //   6431: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6434: aastore
    //   6435: dup
    //   6436: iconst_1
    //   6437: lload 9
    //   6439: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6442: aastore
    //   6443: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6446: aload_0
    //   6447: lload 7
    //   6449: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6452: lload 9
    //   6454: ldc2_w 380
    //   6457: lcmp
    //   6458: ifge -176 -> 6282
    //   6461: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6464: dup
    //   6465: aload_0
    //   6466: iconst_1
    //   6467: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6470: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6473: goto -191 -> 6282
    //   6476: ldc 83
    //   6478: ldc_w 456
    //   6481: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6484: goto -202 -> 6282
    //   6487: astore 4
    //   6489: ldc 83
    //   6491: aload 4
    //   6493: ldc_w 613
    //   6496: iconst_0
    //   6497: anewarray 4	java/lang/Object
    //   6500: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6503: goto -211 -> 6292
    //   6506: astore_1
    //   6507: ldc 83
    //   6509: aload_1
    //   6510: ldc_w 448
    //   6513: iconst_0
    //   6514: anewarray 4	java/lang/Object
    //   6517: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6520: goto -220 -> 6300
    //   6523: astore 18
    //   6525: aconst_null
    //   6526: astore_1
    //   6527: aconst_null
    //   6528: astore_2
    //   6529: aload 17
    //   6531: astore 16
    //   6533: aload_2
    //   6534: astore 20
    //   6536: lload 7
    //   6538: lstore 13
    //   6540: lload 9
    //   6542: lstore 5
    //   6544: aload_1
    //   6545: astore 21
    //   6547: aload 16
    //   6549: astore 4
    //   6551: ldc 83
    //   6553: aload 18
    //   6555: ldc_w 602
    //   6558: iconst_1
    //   6559: anewarray 4	java/lang/Object
    //   6562: dup
    //   6563: iconst_0
    //   6564: aload 12
    //   6566: invokevirtual 429	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   6569: aastore
    //   6570: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6573: aload_2
    //   6574: astore 20
    //   6576: lload 7
    //   6578: lstore 13
    //   6580: lload 9
    //   6582: lstore 5
    //   6584: aload_1
    //   6585: astore 21
    //   6587: aload 16
    //   6589: astore 4
    //   6591: aload_0
    //   6592: sipush 754
    //   6595: putfield 57	com/tencent/mm/plugin/music/c/b:clN	I
    //   6598: aload_2
    //   6599: astore 20
    //   6601: lload 7
    //   6603: lstore 13
    //   6605: lload 9
    //   6607: lstore 5
    //   6609: aload_1
    //   6610: astore 21
    //   6612: aload 16
    //   6614: astore 4
    //   6616: aload_0
    //   6617: iconst_5
    //   6618: invokespecial 424	com/tencent/mm/plugin/music/c/b:zC	(I)V
    //   6621: lload 7
    //   6623: lconst_0
    //   6624: lcmp
    //   6625: ifne +118 -> 6743
    //   6628: lload 9
    //   6630: lconst_0
    //   6631: lcmp
    //   6632: ifle +111 -> 6743
    //   6635: ldc 83
    //   6637: ldc_w 439
    //   6640: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6643: aload_1
    //   6644: lload 9
    //   6646: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   6649: aload_0
    //   6650: lload 9
    //   6652: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6655: lload 9
    //   6657: ldc2_w 380
    //   6660: lcmp
    //   6661: ifge +15 -> 6676
    //   6664: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6667: dup
    //   6668: aload_0
    //   6669: iconst_1
    //   6670: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6673: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6676: aload 16
    //   6678: ifnull +8 -> 6686
    //   6681: aload 16
    //   6683: invokevirtual 603	java/io/InputStream:close	()V
    //   6686: aload_1
    //   6687: ifnull +7 -> 6694
    //   6690: aload_1
    //   6691: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   6694: aload_2
    //   6695: ifnull +7 -> 6702
    //   6698: aload_2
    //   6699: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   6702: aload_0
    //   6703: iconst_1
    //   6704: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   6707: ldc 83
    //   6709: ldc_w 446
    //   6712: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6715: ldc_w 361
    //   6718: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   6721: goto -6702 -> 19
    //   6724: astore 4
    //   6726: ldc 83
    //   6728: aload 4
    //   6730: ldc_w 448
    //   6733: iconst_0
    //   6734: anewarray 4	java/lang/Object
    //   6737: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6740: goto -91 -> 6649
    //   6743: lload 7
    //   6745: lconst_0
    //   6746: lcmp
    //   6747: ifeq +50 -> 6797
    //   6750: lload 9
    //   6752: lload 7
    //   6754: lcmp
    //   6755: ifeq +42 -> 6797
    //   6758: ldc 83
    //   6760: ldc_w 450
    //   6763: iconst_2
    //   6764: anewarray 4	java/lang/Object
    //   6767: dup
    //   6768: iconst_0
    //   6769: lload 7
    //   6771: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6774: aastore
    //   6775: dup
    //   6776: iconst_1
    //   6777: lload 9
    //   6779: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6782: aastore
    //   6783: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6786: aload_0
    //   6787: lload 9
    //   6789: lload 7
    //   6791: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   6794: goto -118 -> 6676
    //   6797: lload 7
    //   6799: lconst_0
    //   6800: lcmp
    //   6801: ifeq +69 -> 6870
    //   6804: lload 9
    //   6806: lload 7
    //   6808: lcmp
    //   6809: ifne +61 -> 6870
    //   6812: ldc 83
    //   6814: ldc_w 454
    //   6817: iconst_2
    //   6818: anewarray 4	java/lang/Object
    //   6821: dup
    //   6822: iconst_0
    //   6823: lload 7
    //   6825: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6828: aastore
    //   6829: dup
    //   6830: iconst_1
    //   6831: lload 9
    //   6833: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6836: aastore
    //   6837: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6840: aload_0
    //   6841: lload 7
    //   6843: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6846: lload 9
    //   6848: ldc2_w 380
    //   6851: lcmp
    //   6852: ifge -176 -> 6676
    //   6855: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6858: dup
    //   6859: aload_0
    //   6860: iconst_1
    //   6861: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6864: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6867: goto -191 -> 6676
    //   6870: ldc 83
    //   6872: ldc_w 456
    //   6875: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6878: goto -202 -> 6676
    //   6881: astore 4
    //   6883: ldc 83
    //   6885: aload 4
    //   6887: ldc_w 613
    //   6890: iconst_0
    //   6891: anewarray 4	java/lang/Object
    //   6894: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6897: goto -211 -> 6686
    //   6900: astore_1
    //   6901: ldc 83
    //   6903: aload_1
    //   6904: ldc_w 448
    //   6907: iconst_0
    //   6908: anewarray 4	java/lang/Object
    //   6911: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6914: goto -220 -> 6694
    //   6917: astore 18
    //   6919: aconst_null
    //   6920: astore_1
    //   6921: aconst_null
    //   6922: astore_2
    //   6923: lload 7
    //   6925: lconst_0
    //   6926: lcmp
    //   6927: ifne +118 -> 7045
    //   6930: lload 9
    //   6932: lconst_0
    //   6933: lcmp
    //   6934: ifle +111 -> 7045
    //   6937: ldc 83
    //   6939: ldc_w 439
    //   6942: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6945: aload_1
    //   6946: lload 9
    //   6948: invokevirtual 534	java/io/RandomAccessFile:setLength	(J)V
    //   6951: aload_0
    //   6952: lload 9
    //   6954: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   6957: lload 9
    //   6959: ldc2_w 380
    //   6962: lcmp
    //   6963: ifge +15 -> 6978
    //   6966: new 8	com/tencent/mm/plugin/music/c/b$a
    //   6969: dup
    //   6970: aload_0
    //   6971: iconst_1
    //   6972: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   6975: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   6978: aload 4
    //   6980: ifnull +8 -> 6988
    //   6983: aload 4
    //   6985: invokevirtual 603	java/io/InputStream:close	()V
    //   6988: aload_1
    //   6989: ifnull +7 -> 6996
    //   6992: aload_1
    //   6993: invokevirtual 537	java/io/RandomAccessFile:close	()V
    //   6996: aload_2
    //   6997: ifnull +7 -> 7004
    //   7000: aload_2
    //   7001: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   7004: aload_0
    //   7005: iconst_1
    //   7006: putfield 49	com/tencent/mm/plugin/music/c/b:isStop	Z
    //   7009: ldc 83
    //   7011: ldc_w 446
    //   7014: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   7017: ldc_w 361
    //   7020: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   7023: aload 18
    //   7025: athrow
    //   7026: astore 21
    //   7028: ldc 83
    //   7030: aload 21
    //   7032: ldc_w 448
    //   7035: iconst_0
    //   7036: anewarray 4	java/lang/Object
    //   7039: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7042: goto -91 -> 6951
    //   7045: lload 7
    //   7047: lconst_0
    //   7048: lcmp
    //   7049: ifeq +50 -> 7099
    //   7052: lload 9
    //   7054: lload 7
    //   7056: lcmp
    //   7057: ifeq +42 -> 7099
    //   7060: ldc 83
    //   7062: ldc_w 450
    //   7065: iconst_2
    //   7066: anewarray 4	java/lang/Object
    //   7069: dup
    //   7070: iconst_0
    //   7071: lload 7
    //   7073: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   7076: aastore
    //   7077: dup
    //   7078: iconst_1
    //   7079: lload 9
    //   7081: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   7084: aastore
    //   7085: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7088: aload_0
    //   7089: lload 9
    //   7091: lload 7
    //   7093: invokespecial 452	com/tencent/mm/plugin/music/c/b:P	(JJ)V
    //   7096: goto -118 -> 6978
    //   7099: lload 7
    //   7101: lconst_0
    //   7102: lcmp
    //   7103: ifeq +69 -> 7172
    //   7106: lload 9
    //   7108: lload 7
    //   7110: lcmp
    //   7111: ifne +61 -> 7172
    //   7114: ldc 83
    //   7116: ldc_w 454
    //   7119: iconst_2
    //   7120: anewarray 4	java/lang/Object
    //   7123: dup
    //   7124: iconst_0
    //   7125: lload 7
    //   7127: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   7130: aastore
    //   7131: dup
    //   7132: iconst_1
    //   7133: lload 9
    //   7135: invokestatic 410	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   7138: aastore
    //   7139: invokestatic 201	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7142: aload_0
    //   7143: lload 7
    //   7145: invokespecial 444	com/tencent/mm/plugin/music/c/b:jn	(J)V
    //   7148: lload 9
    //   7150: ldc2_w 380
    //   7153: lcmp
    //   7154: ifge -176 -> 6978
    //   7157: new 8	com/tencent/mm/plugin/music/c/b$a
    //   7160: dup
    //   7161: aload_0
    //   7162: iconst_1
    //   7163: invokespecial 130	com/tencent/mm/plugin/music/c/b$a:<init>	(Lcom/tencent/mm/plugin/music/c/b;I)V
    //   7166: invokestatic 136	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   7169: goto -191 -> 6978
    //   7172: ldc 83
    //   7174: ldc_w 456
    //   7177: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   7180: goto -202 -> 6978
    //   7183: astore 4
    //   7185: ldc 83
    //   7187: aload 4
    //   7189: ldc_w 613
    //   7192: iconst_0
    //   7193: anewarray 4	java/lang/Object
    //   7196: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7199: goto -211 -> 6988
    //   7202: astore_1
    //   7203: ldc 83
    //   7205: aload_1
    //   7206: ldc_w 448
    //   7209: iconst_0
    //   7210: anewarray 4	java/lang/Object
    //   7213: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7216: goto -220 -> 6996
    //   7219: astore 18
    //   7221: aconst_null
    //   7222: astore_2
    //   7223: goto -300 -> 6923
    //   7226: astore 18
    //   7228: aload 20
    //   7230: astore_2
    //   7231: lload 13
    //   7233: lstore 7
    //   7235: lload 5
    //   7237: lstore 9
    //   7239: aload 21
    //   7241: astore_1
    //   7242: goto -319 -> 6923
    //   7245: astore 18
    //   7247: lload 36
    //   7249: lstore 9
    //   7251: goto -328 -> 6923
    //   7254: astore 18
    //   7256: goto -333 -> 6923
    //   7259: astore 18
    //   7261: aconst_null
    //   7262: astore_2
    //   7263: aload 17
    //   7265: astore 16
    //   7267: goto -734 -> 6533
    //   7270: astore 18
    //   7272: lload 26
    //   7274: lstore 7
    //   7276: lload 28
    //   7278: lstore 9
    //   7280: aload 17
    //   7282: astore 16
    //   7284: goto -751 -> 6533
    //   7287: astore 18
    //   7289: lload 28
    //   7291: lstore 9
    //   7293: aload 4
    //   7295: astore 16
    //   7297: goto -764 -> 6533
    //   7300: astore 18
    //   7302: aconst_null
    //   7303: astore_2
    //   7304: goto -1165 -> 6139
    //   7307: astore 18
    //   7309: lload 30
    //   7311: lstore 7
    //   7313: lload 32
    //   7315: lstore 9
    //   7317: goto -1178 -> 6139
    //   7320: astore 18
    //   7322: lload 40
    //   7324: lstore 9
    //   7326: aload 4
    //   7328: astore 16
    //   7330: goto -1191 -> 6139
    //   7333: astore 18
    //   7335: aconst_null
    //   7336: astore_2
    //   7337: aload 15
    //   7339: astore 16
    //   7341: goto -1592 -> 5749
    //   7344: astore 18
    //   7346: lload 34
    //   7348: lstore 7
    //   7350: lload 36
    //   7352: lstore 9
    //   7354: aload 15
    //   7356: astore 16
    //   7358: goto -1609 -> 5749
    //   7361: astore 18
    //   7363: lload 13
    //   7365: lstore 9
    //   7367: aload 4
    //   7369: astore 16
    //   7371: goto -1622 -> 5749
    //   7374: astore 18
    //   7376: aconst_null
    //   7377: astore_1
    //   7378: aconst_null
    //   7379: astore_2
    //   7380: aload 19
    //   7382: astore 16
    //   7384: goto -2584 -> 4800
    //   7387: astore 18
    //   7389: aconst_null
    //   7390: astore_2
    //   7391: aload 19
    //   7393: astore 16
    //   7395: goto -2595 -> 4800
    //   7398: astore 18
    //   7400: lload 38
    //   7402: lstore 7
    //   7404: lload 40
    //   7406: lstore 9
    //   7408: aload 19
    //   7410: astore 16
    //   7412: goto -2612 -> 4800
    //   7415: astore 21
    //   7417: aconst_null
    //   7418: astore 4
    //   7420: aconst_null
    //   7421: astore_2
    //   7422: aload 20
    //   7424: astore_1
    //   7425: goto -3346 -> 4079
    //   7428: astore 21
    //   7430: aconst_null
    //   7431: astore 4
    //   7433: aconst_null
    //   7434: astore_2
    //   7435: goto -3356 -> 4079
    //
    // Exception table:
    //   from	to	target	type
    //   241	264	814	java/io/IOException
    //   963	971	1020	java/io/IOException
    //   1785	1791	1852	java/io/IOException
    //   1818	1822	2009	java/io/IOException
    //   3698	3705	4073	java/net/ProtocolException
    //   3729	3736	4073	java/net/ProtocolException
    //   3760	3769	4073	java/net/ProtocolException
    //   3798	3807	4073	java/net/ProtocolException
    //   3839	3867	4073	java/net/ProtocolException
    //   3891	3898	4073	java/net/ProtocolException
    //   3922	3931	4073	java/net/ProtocolException
    //   3955	3964	4073	java/net/ProtocolException
    //   4001	4006	4073	java/net/ProtocolException
    //   4030	4037	4073	java/net/ProtocolException
    //   4061	4066	4073	java/net/ProtocolException
    //   4745	4754	4073	java/net/ProtocolException
    //   4778	4787	4073	java/net/ProtocolException
    //   5015	5061	4073	java/net/ProtocolException
    //   1473	1479	4286	java/net/ProtocolException
    //   1553	1558	4286	java/net/ProtocolException
    //   1616	1636	4286	java/net/ProtocolException
    //   1694	1700	4286	java/net/ProtocolException
    //   1758	1763	4286	java/net/ProtocolException
    //   2084	2104	4286	java/net/ProtocolException
    //   2162	2167	4286	java/net/ProtocolException
    //   2225	2233	4286	java/net/ProtocolException
    //   2291	2311	4286	java/net/ProtocolException
    //   2369	2375	4286	java/net/ProtocolException
    //   2433	2450	4286	java/net/ProtocolException
    //   2508	2514	4286	java/net/ProtocolException
    //   2572	2582	4286	java/net/ProtocolException
    //   2640	2653	4286	java/net/ProtocolException
    //   2711	2722	4286	java/net/ProtocolException
    //   2780	2789	4286	java/net/ProtocolException
    //   2847	2853	4286	java/net/ProtocolException
    //   2911	2917	4286	java/net/ProtocolException
    //   2975	2993	4286	java/net/ProtocolException
    //   3051	3060	4286	java/net/ProtocolException
    //   3118	3125	4286	java/net/ProtocolException
    //   3183	3196	4286	java/net/ProtocolException
    //   3254	3279	4286	java/net/ProtocolException
    //   3342	3350	4286	java/net/ProtocolException
    //   3450	3478	4286	java/net/ProtocolException
    //   3536	3542	4286	java/net/ProtocolException
    //   3600	3606	4286	java/net/ProtocolException
    //   3664	3670	4286	java/net/ProtocolException
    //   4274	4283	4286	java/net/ProtocolException
    //   4377	4385	4286	java/net/ProtocolException
    //   4443	4449	4286	java/net/ProtocolException
    //   4471	4477	4538	java/io/IOException
    //   4504	4508	4695	java/io/IOException
    //   3698	3705	4790	java/net/NoRouteToHostException
    //   3729	3736	4790	java/net/NoRouteToHostException
    //   3760	3769	4790	java/net/NoRouteToHostException
    //   3798	3807	4790	java/net/NoRouteToHostException
    //   3839	3867	4790	java/net/NoRouteToHostException
    //   3891	3898	4790	java/net/NoRouteToHostException
    //   3922	3931	4790	java/net/NoRouteToHostException
    //   3955	3964	4790	java/net/NoRouteToHostException
    //   4001	4006	4790	java/net/NoRouteToHostException
    //   4030	4037	4790	java/net/NoRouteToHostException
    //   4061	4066	4790	java/net/NoRouteToHostException
    //   4745	4754	4790	java/net/NoRouteToHostException
    //   4778	4787	4790	java/net/NoRouteToHostException
    //   5015	5061	4790	java/net/NoRouteToHostException
    //   5083	5089	5160	java/io/IOException
    //   5121	5126	5317	java/io/IOException
    //   5126	5130	5336	java/io/IOException
    //   4135	4141	5353	java/io/IOException
    //   4173	4178	5510	java/io/IOException
    //   4182	4186	5529	java/io/IOException
    //   4910	4916	5546	java/io/IOException
    //   4948	4953	5703	java/io/IOException
    //   4957	4961	5722	java/io/IOException
    //   902	941	5739	java/net/UnknownServiceException
    //   1175	1188	5739	java/net/UnknownServiceException
    //   5859	5865	5940	java/io/IOException
    //   5897	5902	6097	java/io/IOException
    //   5906	5910	6116	java/io/IOException
    //   902	941	6133	java/io/IOException
    //   1175	1188	6133	java/io/IOException
    //   6249	6255	6330	java/io/IOException
    //   6287	6292	6487	java/io/IOException
    //   6296	6300	6506	java/io/IOException
    //   902	941	6523	java/lang/Exception
    //   1175	1188	6523	java/lang/Exception
    //   6643	6649	6724	java/io/IOException
    //   6681	6686	6881	java/io/IOException
    //   6690	6694	6900	java/io/IOException
    //   902	941	6917	finally
    //   1175	1188	6917	finally
    //   6945	6951	7026	java/io/IOException
    //   6983	6988	7183	java/io/IOException
    //   6992	6996	7202	java/io/IOException
    //   1188	1230	7219	finally
    //   1238	1310	7219	finally
    //   1314	1321	7219	finally
    //   1321	1357	7219	finally
    //   1357	1415	7219	finally
    //   1473	1479	7226	finally
    //   1553	1558	7226	finally
    //   1616	1636	7226	finally
    //   1694	1700	7226	finally
    //   1758	1763	7226	finally
    //   2084	2104	7226	finally
    //   2162	2167	7226	finally
    //   2225	2233	7226	finally
    //   2291	2311	7226	finally
    //   2369	2375	7226	finally
    //   2433	2450	7226	finally
    //   2508	2514	7226	finally
    //   2572	2582	7226	finally
    //   2640	2653	7226	finally
    //   2711	2722	7226	finally
    //   2780	2789	7226	finally
    //   2847	2853	7226	finally
    //   2911	2917	7226	finally
    //   2975	2993	7226	finally
    //   3051	3060	7226	finally
    //   3118	3125	7226	finally
    //   3183	3196	7226	finally
    //   3254	3279	7226	finally
    //   3342	3350	7226	finally
    //   3450	3478	7226	finally
    //   3536	3542	7226	finally
    //   3600	3606	7226	finally
    //   3664	3670	7226	finally
    //   4274	4283	7226	finally
    //   4377	4385	7226	finally
    //   4443	4449	7226	finally
    //   4818	4840	7226	finally
    //   4858	4865	7226	finally
    //   4883	4888	7226	finally
    //   5767	5789	7226	finally
    //   5807	5814	7226	finally
    //   5832	5837	7226	finally
    //   6157	6179	7226	finally
    //   6197	6204	7226	finally
    //   6222	6227	7226	finally
    //   6551	6573	7226	finally
    //   6591	6598	7226	finally
    //   6616	6621	7226	finally
    //   3698	3705	7245	finally
    //   3729	3736	7245	finally
    //   3760	3769	7245	finally
    //   3798	3807	7245	finally
    //   3839	3867	7245	finally
    //   3891	3898	7245	finally
    //   3922	3931	7245	finally
    //   3955	3964	7245	finally
    //   4001	4006	7245	finally
    //   4030	4037	7245	finally
    //   4061	4066	7245	finally
    //   4745	4754	7245	finally
    //   4778	4787	7245	finally
    //   5015	5061	7245	finally
    //   4079	4113	7254	finally
    //   1188	1230	7259	java/lang/Exception
    //   1238	1310	7259	java/lang/Exception
    //   1314	1321	7259	java/lang/Exception
    //   1321	1357	7259	java/lang/Exception
    //   1357	1415	7259	java/lang/Exception
    //   1473	1479	7270	java/lang/Exception
    //   1553	1558	7270	java/lang/Exception
    //   1616	1636	7270	java/lang/Exception
    //   1694	1700	7270	java/lang/Exception
    //   1758	1763	7270	java/lang/Exception
    //   2084	2104	7270	java/lang/Exception
    //   2162	2167	7270	java/lang/Exception
    //   2225	2233	7270	java/lang/Exception
    //   2291	2311	7270	java/lang/Exception
    //   2369	2375	7270	java/lang/Exception
    //   2433	2450	7270	java/lang/Exception
    //   2508	2514	7270	java/lang/Exception
    //   2572	2582	7270	java/lang/Exception
    //   2640	2653	7270	java/lang/Exception
    //   2711	2722	7270	java/lang/Exception
    //   2780	2789	7270	java/lang/Exception
    //   2847	2853	7270	java/lang/Exception
    //   2911	2917	7270	java/lang/Exception
    //   2975	2993	7270	java/lang/Exception
    //   3051	3060	7270	java/lang/Exception
    //   3118	3125	7270	java/lang/Exception
    //   3183	3196	7270	java/lang/Exception
    //   3254	3279	7270	java/lang/Exception
    //   3342	3350	7270	java/lang/Exception
    //   3450	3478	7270	java/lang/Exception
    //   3536	3542	7270	java/lang/Exception
    //   3600	3606	7270	java/lang/Exception
    //   3664	3670	7270	java/lang/Exception
    //   4274	4283	7270	java/lang/Exception
    //   4377	4385	7270	java/lang/Exception
    //   4443	4449	7270	java/lang/Exception
    //   3698	3705	7287	java/lang/Exception
    //   3729	3736	7287	java/lang/Exception
    //   3760	3769	7287	java/lang/Exception
    //   3798	3807	7287	java/lang/Exception
    //   3839	3867	7287	java/lang/Exception
    //   3891	3898	7287	java/lang/Exception
    //   3922	3931	7287	java/lang/Exception
    //   3955	3964	7287	java/lang/Exception
    //   4001	4006	7287	java/lang/Exception
    //   4030	4037	7287	java/lang/Exception
    //   4061	4066	7287	java/lang/Exception
    //   4745	4754	7287	java/lang/Exception
    //   4778	4787	7287	java/lang/Exception
    //   5015	5061	7287	java/lang/Exception
    //   1188	1230	7300	java/io/IOException
    //   1238	1310	7300	java/io/IOException
    //   1314	1321	7300	java/io/IOException
    //   1321	1357	7300	java/io/IOException
    //   1357	1415	7300	java/io/IOException
    //   1473	1479	7307	java/io/IOException
    //   1553	1558	7307	java/io/IOException
    //   1616	1636	7307	java/io/IOException
    //   1694	1700	7307	java/io/IOException
    //   1758	1763	7307	java/io/IOException
    //   2084	2104	7307	java/io/IOException
    //   2162	2167	7307	java/io/IOException
    //   2225	2233	7307	java/io/IOException
    //   2291	2311	7307	java/io/IOException
    //   2369	2375	7307	java/io/IOException
    //   2433	2450	7307	java/io/IOException
    //   2508	2514	7307	java/io/IOException
    //   2572	2582	7307	java/io/IOException
    //   2640	2653	7307	java/io/IOException
    //   2711	2722	7307	java/io/IOException
    //   2780	2789	7307	java/io/IOException
    //   2847	2853	7307	java/io/IOException
    //   2911	2917	7307	java/io/IOException
    //   2975	2993	7307	java/io/IOException
    //   3051	3060	7307	java/io/IOException
    //   3118	3125	7307	java/io/IOException
    //   3183	3196	7307	java/io/IOException
    //   3254	3279	7307	java/io/IOException
    //   3342	3350	7307	java/io/IOException
    //   3450	3478	7307	java/io/IOException
    //   3536	3542	7307	java/io/IOException
    //   3600	3606	7307	java/io/IOException
    //   3664	3670	7307	java/io/IOException
    //   4274	4283	7307	java/io/IOException
    //   4377	4385	7307	java/io/IOException
    //   4443	4449	7307	java/io/IOException
    //   3698	3705	7320	java/io/IOException
    //   3729	3736	7320	java/io/IOException
    //   3760	3769	7320	java/io/IOException
    //   3798	3807	7320	java/io/IOException
    //   3839	3867	7320	java/io/IOException
    //   3891	3898	7320	java/io/IOException
    //   3922	3931	7320	java/io/IOException
    //   3955	3964	7320	java/io/IOException
    //   4001	4006	7320	java/io/IOException
    //   4030	4037	7320	java/io/IOException
    //   4061	4066	7320	java/io/IOException
    //   4745	4754	7320	java/io/IOException
    //   4778	4787	7320	java/io/IOException
    //   5015	5061	7320	java/io/IOException
    //   1188	1230	7333	java/net/UnknownServiceException
    //   1238	1310	7333	java/net/UnknownServiceException
    //   1314	1321	7333	java/net/UnknownServiceException
    //   1321	1357	7333	java/net/UnknownServiceException
    //   1357	1415	7333	java/net/UnknownServiceException
    //   1473	1479	7344	java/net/UnknownServiceException
    //   1553	1558	7344	java/net/UnknownServiceException
    //   1616	1636	7344	java/net/UnknownServiceException
    //   1694	1700	7344	java/net/UnknownServiceException
    //   1758	1763	7344	java/net/UnknownServiceException
    //   2084	2104	7344	java/net/UnknownServiceException
    //   2162	2167	7344	java/net/UnknownServiceException
    //   2225	2233	7344	java/net/UnknownServiceException
    //   2291	2311	7344	java/net/UnknownServiceException
    //   2369	2375	7344	java/net/UnknownServiceException
    //   2433	2450	7344	java/net/UnknownServiceException
    //   2508	2514	7344	java/net/UnknownServiceException
    //   2572	2582	7344	java/net/UnknownServiceException
    //   2640	2653	7344	java/net/UnknownServiceException
    //   2711	2722	7344	java/net/UnknownServiceException
    //   2780	2789	7344	java/net/UnknownServiceException
    //   2847	2853	7344	java/net/UnknownServiceException
    //   2911	2917	7344	java/net/UnknownServiceException
    //   2975	2993	7344	java/net/UnknownServiceException
    //   3051	3060	7344	java/net/UnknownServiceException
    //   3118	3125	7344	java/net/UnknownServiceException
    //   3183	3196	7344	java/net/UnknownServiceException
    //   3254	3279	7344	java/net/UnknownServiceException
    //   3342	3350	7344	java/net/UnknownServiceException
    //   3450	3478	7344	java/net/UnknownServiceException
    //   3536	3542	7344	java/net/UnknownServiceException
    //   3600	3606	7344	java/net/UnknownServiceException
    //   3664	3670	7344	java/net/UnknownServiceException
    //   4274	4283	7344	java/net/UnknownServiceException
    //   4377	4385	7344	java/net/UnknownServiceException
    //   4443	4449	7344	java/net/UnknownServiceException
    //   3698	3705	7361	java/net/UnknownServiceException
    //   3729	3736	7361	java/net/UnknownServiceException
    //   3760	3769	7361	java/net/UnknownServiceException
    //   3798	3807	7361	java/net/UnknownServiceException
    //   3839	3867	7361	java/net/UnknownServiceException
    //   3891	3898	7361	java/net/UnknownServiceException
    //   3922	3931	7361	java/net/UnknownServiceException
    //   3955	3964	7361	java/net/UnknownServiceException
    //   4001	4006	7361	java/net/UnknownServiceException
    //   4030	4037	7361	java/net/UnknownServiceException
    //   4061	4066	7361	java/net/UnknownServiceException
    //   4745	4754	7361	java/net/UnknownServiceException
    //   4778	4787	7361	java/net/UnknownServiceException
    //   5015	5061	7361	java/net/UnknownServiceException
    //   902	941	7374	java/net/NoRouteToHostException
    //   1175	1188	7374	java/net/NoRouteToHostException
    //   1188	1230	7387	java/net/NoRouteToHostException
    //   1238	1310	7387	java/net/NoRouteToHostException
    //   1314	1321	7387	java/net/NoRouteToHostException
    //   1321	1357	7387	java/net/NoRouteToHostException
    //   1357	1415	7387	java/net/NoRouteToHostException
    //   1473	1479	7398	java/net/NoRouteToHostException
    //   1553	1558	7398	java/net/NoRouteToHostException
    //   1616	1636	7398	java/net/NoRouteToHostException
    //   1694	1700	7398	java/net/NoRouteToHostException
    //   1758	1763	7398	java/net/NoRouteToHostException
    //   2084	2104	7398	java/net/NoRouteToHostException
    //   2162	2167	7398	java/net/NoRouteToHostException
    //   2225	2233	7398	java/net/NoRouteToHostException
    //   2291	2311	7398	java/net/NoRouteToHostException
    //   2369	2375	7398	java/net/NoRouteToHostException
    //   2433	2450	7398	java/net/NoRouteToHostException
    //   2508	2514	7398	java/net/NoRouteToHostException
    //   2572	2582	7398	java/net/NoRouteToHostException
    //   2640	2653	7398	java/net/NoRouteToHostException
    //   2711	2722	7398	java/net/NoRouteToHostException
    //   2780	2789	7398	java/net/NoRouteToHostException
    //   2847	2853	7398	java/net/NoRouteToHostException
    //   2911	2917	7398	java/net/NoRouteToHostException
    //   2975	2993	7398	java/net/NoRouteToHostException
    //   3051	3060	7398	java/net/NoRouteToHostException
    //   3118	3125	7398	java/net/NoRouteToHostException
    //   3183	3196	7398	java/net/NoRouteToHostException
    //   3254	3279	7398	java/net/NoRouteToHostException
    //   3342	3350	7398	java/net/NoRouteToHostException
    //   3450	3478	7398	java/net/NoRouteToHostException
    //   3536	3542	7398	java/net/NoRouteToHostException
    //   3600	3606	7398	java/net/NoRouteToHostException
    //   3664	3670	7398	java/net/NoRouteToHostException
    //   4274	4283	7398	java/net/NoRouteToHostException
    //   4377	4385	7398	java/net/NoRouteToHostException
    //   4443	4449	7398	java/net/NoRouteToHostException
    //   902	941	7415	java/net/ProtocolException
    //   1175	1188	7415	java/net/ProtocolException
    //   1188	1230	7428	java/net/ProtocolException
    //   1238	1310	7428	java/net/ProtocolException
    //   1314	1321	7428	java/net/ProtocolException
    //   1321	1357	7428	java/net/ProtocolException
    //   1357	1415	7428	java/net/ProtocolException
  }

  public final void start()
  {
    AppMethodBeat.i(137467);
    if (!this.isStop)
      AppMethodBeat.o(137467);
    while (true)
    {
      return;
      this.isStop = false;
      com.tencent.mm.sdk.g.d.post(this, "music_download_thread");
      AppMethodBeat.o(137467);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.c.b
 * JD-Core Version:    0.6.2
 */