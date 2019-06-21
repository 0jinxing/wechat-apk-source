package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c
  implements f
{
  public static String TAG = "MicroMsg.LocationAddr";
  private static c fBv;
  private boolean fBA;
  private c.c fBw;
  private CopyOnWriteArrayList<c.c> fBx;
  private HashMap<String, CopyOnWriteArrayList<WeakReference<c.a>>> fBy;
  private az fBz;

  private c()
  {
    AppMethodBeat.i(78110);
    this.fBw = null;
    this.fBx = new CopyOnWriteArrayList();
    this.fBy = new HashMap();
    this.fBz = new az(1, "addr_worker");
    this.fBA = true;
    AppMethodBeat.o(78110);
  }

  private void a(Addr paramAddr)
  {
    AppMethodBeat.i(78119);
    if (this.fBw == null)
      AppMethodBeat.o(78119);
    while (true)
    {
      return;
      Addr localAddr = paramAddr;
      if (paramAddr == null)
        localAddr = new Addr();
      if (this.fBw.tag == null);
      for (paramAddr = new Object(); ; paramAddr = this.fBw.tag)
      {
        localAddr.tag = paramAddr;
        localAddr.fBr = ((float)this.fBw.lat);
        localAddr.fBs = ((float)this.fBw.lng);
        paramAddr = (CopyOnWriteArrayList)this.fBy.get(this.fBw.toString());
        if (paramAddr == null)
          break;
        Iterator localIterator = paramAddr.iterator();
        while (localIterator.hasNext())
        {
          paramAddr = (WeakReference)localIterator.next();
          if ((paramAddr != null) && (paramAddr.get() != null))
            ((c.a)paramAddr.get()).b(localAddr);
        }
      }
      this.fBy.remove(this.fBw.toString());
      ab.d(TAG, "postexecute2 listeners %d", new Object[] { Integer.valueOf(this.fBy.size()) });
      this.fBw = null;
      agx();
      if ((this.fBw == null) && (this.fBx.size() > 0))
        g.Rg().b(655, this);
      AppMethodBeat.o(78119);
    }
  }

  private static boolean a(CopyOnWriteArrayList<WeakReference<c.a>> paramCopyOnWriteArrayList, c.a parama)
  {
    AppMethodBeat.i(78113);
    Iterator localIterator = paramCopyOnWriteArrayList.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      paramCopyOnWriteArrayList = (WeakReference)localIterator.next();
      if ((paramCopyOnWriteArrayList != null) && (paramCopyOnWriteArrayList.get() != null) && (((c.a)paramCopyOnWriteArrayList.get()).equals(parama)))
      {
        bool = true;
        AppMethodBeat.o(78113);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78113);
    }
  }

  public static c agw()
  {
    AppMethodBeat.i(78111);
    if (fBv == null)
      fBv = new c();
    c localc = fBv;
    AppMethodBeat.o(78111);
    return localc;
  }

  private void agx()
  {
    AppMethodBeat.i(78117);
    if ((this.fBw == null) && (this.fBx != null) && (this.fBx.size() > 0))
    {
      this.fBw = ((c.c)this.fBx.remove(0));
      agy();
    }
    AppMethodBeat.o(78117);
  }

  private void agy()
  {
    AppMethodBeat.i(78118);
    if (bo.gT(ah.getContext()))
    {
      this.fBz.e(new c.b(this));
      AppMethodBeat.o(78118);
    }
    while (true)
    {
      return;
      g.Rg().a(655, this);
      g.Rg().a(new e(this.fBw.lat, this.fBw.lng), 0);
      AppMethodBeat.o(78118);
    }
  }

  // ERROR //
  private static Addr b(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 223
    //   2: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 228	com/tencent/mm/sdk/platformtools/aa:dor	()Ljava/lang/String;
    //   8: astore 5
    //   10: new 77	com/tencent/mm/modelgeo/Addr
    //   13: dup
    //   14: invokespecial 78	com/tencent/mm/modelgeo/Addr:<init>	()V
    //   17: astore 6
    //   19: iload 4
    //   21: ifeq +377 -> 398
    //   24: ldc 230
    //   26: iconst_3
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: dload_0
    //   33: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: dload_2
    //   40: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   43: aastore
    //   44: dup
    //   45: iconst_2
    //   46: aload 5
    //   48: aastore
    //   49: invokestatic 241	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   52: astore 7
    //   54: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   57: ldc 243
    //   59: aload 7
    //   61: invokestatic 246	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: invokevirtual 250	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   67: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aconst_null
    //   71: astore 8
    //   73: aconst_null
    //   74: astore 9
    //   76: aconst_null
    //   77: astore 10
    //   79: aload 7
    //   81: aconst_null
    //   82: invokestatic 258	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   85: astore 7
    //   87: aload 7
    //   89: astore 10
    //   91: aload 7
    //   93: astore 8
    //   95: aload 7
    //   97: astore 9
    //   99: aload 7
    //   101: sipush 10000
    //   104: invokevirtual 263	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   107: aload 7
    //   109: astore 10
    //   111: aload 7
    //   113: astore 8
    //   115: aload 7
    //   117: astore 9
    //   119: aload 7
    //   121: ldc_w 265
    //   124: invokevirtual 269	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   127: aload 7
    //   129: astore 10
    //   131: aload 7
    //   133: astore 8
    //   135: aload 7
    //   137: astore 9
    //   139: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   142: astore 11
    //   144: aload 7
    //   146: astore 10
    //   148: aload 7
    //   150: astore 8
    //   152: aload 7
    //   154: astore 9
    //   156: new 271	java/lang/StringBuilder
    //   159: astore 12
    //   161: aload 7
    //   163: astore 10
    //   165: aload 7
    //   167: astore 8
    //   169: aload 7
    //   171: astore 9
    //   173: aload 12
    //   175: ldc_w 273
    //   178: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   181: aload 7
    //   183: astore 10
    //   185: aload 7
    //   187: astore 8
    //   189: aload 7
    //   191: astore 9
    //   193: aload 11
    //   195: aload 12
    //   197: aload 7
    //   199: invokevirtual 278	com/tencent/mm/network/u:getResponseCode	()I
    //   202: invokevirtual 282	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   205: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   211: aload 7
    //   213: astore 10
    //   215: aload 7
    //   217: astore 8
    //   219: aload 7
    //   221: astore 9
    //   223: new 285	java/io/InputStreamReader
    //   226: astore 12
    //   228: aload 7
    //   230: astore 10
    //   232: aload 7
    //   234: astore 8
    //   236: aload 7
    //   238: astore 9
    //   240: aload 12
    //   242: aload 7
    //   244: invokevirtual 289	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   247: invokespecial 292	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   250: aload 7
    //   252: astore 10
    //   254: new 294	java/io/BufferedReader
    //   257: astore 8
    //   259: aload 7
    //   261: astore 10
    //   263: aload 8
    //   265: aload 12
    //   267: invokespecial 297	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   270: aload 7
    //   272: astore 10
    //   274: new 299	java/lang/StringBuffer
    //   277: astore 9
    //   279: aload 7
    //   281: astore 10
    //   283: aload 9
    //   285: invokespecial 300	java/lang/StringBuffer:<init>	()V
    //   288: aload 7
    //   290: astore 10
    //   292: aload 8
    //   294: invokevirtual 303	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   297: astore 11
    //   299: aload 11
    //   301: ifnull +131 -> 432
    //   304: aload 7
    //   306: astore 10
    //   308: aload 9
    //   310: aload 11
    //   312: invokevirtual 306	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   315: pop
    //   316: goto -28 -> 288
    //   319: astore 8
    //   321: aload 7
    //   323: astore 10
    //   325: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   328: ldc_w 308
    //   331: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: aload 7
    //   336: astore 10
    //   338: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   341: ldc_w 310
    //   344: iconst_1
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload 8
    //   352: invokestatic 314	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   355: aastore
    //   356: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   359: aload 12
    //   361: astore 10
    //   363: aload 7
    //   365: ifnull +15 -> 380
    //   368: aload 7
    //   370: getfield 320	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   373: invokevirtual 325	java/net/HttpURLConnection:disconnect	()V
    //   376: aload 12
    //   378: astore 10
    //   380: aload 10
    //   382: ifnull +8 -> 390
    //   385: aload 10
    //   387: invokevirtual 328	java/io/InputStreamReader:close	()V
    //   390: ldc 223
    //   392: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   395: aload 6
    //   397: areturn
    //   398: ldc 230
    //   400: iconst_3
    //   401: anewarray 4	java/lang/Object
    //   404: dup
    //   405: iconst_0
    //   406: dload_0
    //   407: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   410: aastore
    //   411: dup
    //   412: iconst_1
    //   413: dload_2
    //   414: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   417: aastore
    //   418: dup
    //   419: iconst_2
    //   420: ldc_w 330
    //   423: aastore
    //   424: invokestatic 241	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   427: astore 7
    //   429: goto -375 -> 54
    //   432: aload 7
    //   434: astore 10
    //   436: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   439: astore 11
    //   441: aload 7
    //   443: astore 10
    //   445: new 271	java/lang/StringBuilder
    //   448: astore 8
    //   450: aload 7
    //   452: astore 10
    //   454: aload 8
    //   456: ldc_w 332
    //   459: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   462: aload 7
    //   464: astore 10
    //   466: aload 11
    //   468: aload 8
    //   470: aload 9
    //   472: invokevirtual 333	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   475: invokevirtual 336	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   481: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: aload 7
    //   486: astore 10
    //   488: new 338	org/json/JSONObject
    //   491: astore 8
    //   493: aload 7
    //   495: astore 10
    //   497: aload 8
    //   499: aload 9
    //   501: invokevirtual 333	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   504: invokespecial 339	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   507: aload 7
    //   509: astore 10
    //   511: aload 8
    //   513: ldc_w 341
    //   516: invokevirtual 345	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   519: astore 8
    //   521: aload 7
    //   523: astore 10
    //   525: aload 8
    //   527: iconst_0
    //   528: invokevirtual 351	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   531: astore 9
    //   533: aload 7
    //   535: astore 10
    //   537: aload 6
    //   539: aload 9
    //   541: ldc_w 353
    //   544: invokevirtual 356	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   547: putfield 359	com/tencent/mm/modelgeo/Addr:fBg	Ljava/lang/String;
    //   550: aload 7
    //   552: astore 10
    //   554: aload 8
    //   556: iconst_0
    //   557: invokevirtual 351	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   560: ldc_w 361
    //   563: invokevirtual 345	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   566: astore 11
    //   568: iconst_0
    //   569: istore 13
    //   571: aload 7
    //   573: astore 10
    //   575: iload 13
    //   577: aload 11
    //   579: invokevirtual 364	org/json/JSONArray:length	()I
    //   582: if_icmpge +282 -> 864
    //   585: aload 7
    //   587: astore 10
    //   589: aload 11
    //   591: iload 13
    //   593: invokevirtual 351	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   596: astore 14
    //   598: aload 7
    //   600: astore 10
    //   602: aload 14
    //   604: ldc_w 366
    //   607: invokevirtual 356	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   610: astore 8
    //   612: aload 7
    //   614: astore 10
    //   616: aload 14
    //   618: ldc_w 368
    //   621: invokevirtual 345	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   624: iconst_0
    //   625: invokevirtual 371	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   628: astore 14
    //   630: aload 7
    //   632: astore 10
    //   634: aload 14
    //   636: ldc_w 373
    //   639: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   642: ifeq +20 -> 662
    //   645: aload 7
    //   647: astore 10
    //   649: aload 6
    //   651: aload 8
    //   653: putfield 377	com/tencent/mm/modelgeo/Addr:fBh	Ljava/lang/String;
    //   656: iinc 13 1
    //   659: goto -88 -> 571
    //   662: aload 7
    //   664: astore 10
    //   666: aload 14
    //   668: ldc_w 379
    //   671: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   674: ifeq +22 -> 696
    //   677: aload 7
    //   679: astore 10
    //   681: aload 6
    //   683: aload 8
    //   685: putfield 382	com/tencent/mm/modelgeo/Addr:fBi	Ljava/lang/String;
    //   688: goto -32 -> 656
    //   691: astore 10
    //   693: goto -37 -> 656
    //   696: aload 7
    //   698: astore 10
    //   700: aload 14
    //   702: ldc_w 384
    //   705: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   708: ifeq +40 -> 748
    //   711: aload 7
    //   713: astore 10
    //   715: aload 6
    //   717: aload 8
    //   719: putfield 387	com/tencent/mm/modelgeo/Addr:fBk	Ljava/lang/String;
    //   722: goto -66 -> 656
    //   725: astore 7
    //   727: aload 10
    //   729: ifnull +11 -> 740
    //   732: aload 10
    //   734: getfield 320	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   737: invokevirtual 325	java/net/HttpURLConnection:disconnect	()V
    //   740: ldc 223
    //   742: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   745: aload 7
    //   747: athrow
    //   748: aload 7
    //   750: astore 10
    //   752: aload 14
    //   754: ldc_w 389
    //   757: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   760: ifeq +17 -> 777
    //   763: aload 7
    //   765: astore 10
    //   767: aload 6
    //   769: aload 8
    //   771: putfield 392	com/tencent/mm/modelgeo/Addr:fBl	Ljava/lang/String;
    //   774: goto -118 -> 656
    //   777: aload 7
    //   779: astore 10
    //   781: aload 14
    //   783: ldc_w 394
    //   786: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   789: ifeq +17 -> 806
    //   792: aload 7
    //   794: astore 10
    //   796: aload 6
    //   798: aload 8
    //   800: putfield 397	com/tencent/mm/modelgeo/Addr:fBm	Ljava/lang/String;
    //   803: goto -147 -> 656
    //   806: aload 7
    //   808: astore 10
    //   810: aload 14
    //   812: ldc_w 399
    //   815: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   818: ifeq +17 -> 835
    //   821: aload 7
    //   823: astore 10
    //   825: aload 6
    //   827: aload 8
    //   829: putfield 402	com/tencent/mm/modelgeo/Addr:fBn	Ljava/lang/String;
    //   832: goto -176 -> 656
    //   835: aload 7
    //   837: astore 10
    //   839: aload 14
    //   841: ldc_w 404
    //   844: invokevirtual 374	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   847: ifeq -191 -> 656
    //   850: aload 7
    //   852: astore 10
    //   854: aload 6
    //   856: aload 8
    //   858: putfield 406	com/tencent/mm/modelgeo/Addr:country	Ljava/lang/String;
    //   861: goto -205 -> 656
    //   864: aload 7
    //   866: astore 10
    //   868: aload 6
    //   870: getfield 359	com/tencent/mm/modelgeo/Addr:fBg	Ljava/lang/String;
    //   873: ldc_w 408
    //   876: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   879: astore 8
    //   881: aload 7
    //   883: astore 10
    //   885: aload 11
    //   887: invokevirtual 415	org/json/JSONArray:toString	()Ljava/lang/String;
    //   890: ldc_w 408
    //   893: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   896: astore 11
    //   898: aload 7
    //   900: astore 10
    //   902: aload 9
    //   904: ldc_w 417
    //   907: invokevirtual 420	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   910: invokevirtual 421	org/json/JSONObject:toString	()Ljava/lang/String;
    //   913: ldc_w 408
    //   916: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   919: astore 15
    //   921: aload 7
    //   923: astore 10
    //   925: aload 9
    //   927: ldc_w 423
    //   930: invokevirtual 356	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   933: ldc_w 408
    //   936: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   939: astore 14
    //   941: aload 7
    //   943: astore 10
    //   945: aload 9
    //   947: ldc_w 368
    //   950: invokevirtual 345	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   953: invokevirtual 415	org/json/JSONArray:toString	()Ljava/lang/String;
    //   956: ldc_w 408
    //   959: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   962: astore 9
    //   964: aload 7
    //   966: astore 10
    //   968: ldc_w 425
    //   971: iconst_2
    //   972: anewarray 4	java/lang/Object
    //   975: dup
    //   976: iconst_0
    //   977: dload_0
    //   978: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   981: aastore
    //   982: dup
    //   983: iconst_1
    //   984: dload_2
    //   985: invokestatic 235	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   988: aastore
    //   989: invokestatic 241	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   992: ldc_w 408
    //   995: invokestatic 414	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   998: astore 16
    //   1000: aload 7
    //   1002: astore 10
    //   1004: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   1007: ldc_w 427
    //   1010: bipush 7
    //   1012: anewarray 4	java/lang/Object
    //   1015: dup
    //   1016: iconst_0
    //   1017: aload 8
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: aload 11
    //   1024: aastore
    //   1025: dup
    //   1026: iconst_2
    //   1027: aload 15
    //   1029: aastore
    //   1030: dup
    //   1031: iconst_3
    //   1032: aload 14
    //   1034: aastore
    //   1035: dup
    //   1036: iconst_4
    //   1037: aload 9
    //   1039: aastore
    //   1040: dup
    //   1041: iconst_5
    //   1042: aload 16
    //   1044: aastore
    //   1045: dup
    //   1046: bipush 6
    //   1048: aload 5
    //   1050: aastore
    //   1051: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1054: aload 7
    //   1056: astore 10
    //   1058: getstatic 433	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1061: sipush 12886
    //   1064: bipush 7
    //   1066: anewarray 4	java/lang/Object
    //   1069: dup
    //   1070: iconst_0
    //   1071: aload 11
    //   1073: aastore
    //   1074: dup
    //   1075: iconst_1
    //   1076: aload 8
    //   1078: aastore
    //   1079: dup
    //   1080: iconst_2
    //   1081: aload 15
    //   1083: aastore
    //   1084: dup
    //   1085: iconst_3
    //   1086: aload 14
    //   1088: aastore
    //   1089: dup
    //   1090: iconst_4
    //   1091: aload 9
    //   1093: aastore
    //   1094: dup
    //   1095: iconst_5
    //   1096: aload 16
    //   1098: aastore
    //   1099: dup
    //   1100: bipush 6
    //   1102: aload 5
    //   1104: aastore
    //   1105: invokevirtual 436	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1108: aload 7
    //   1110: getfield 320	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1113: invokevirtual 325	java/net/HttpURLConnection:disconnect	()V
    //   1116: aload 12
    //   1118: astore 10
    //   1120: goto -740 -> 380
    //   1123: astore 9
    //   1125: aconst_null
    //   1126: astore 12
    //   1128: aload 8
    //   1130: astore 7
    //   1132: aload 7
    //   1134: astore 10
    //   1136: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   1139: ldc_w 438
    //   1142: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1145: aload 7
    //   1147: astore 10
    //   1149: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   1152: ldc_w 310
    //   1155: iconst_1
    //   1156: anewarray 4	java/lang/Object
    //   1159: dup
    //   1160: iconst_0
    //   1161: aload 9
    //   1163: invokestatic 314	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1166: aastore
    //   1167: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1170: aload 12
    //   1172: astore 10
    //   1174: aload 7
    //   1176: ifnull -796 -> 380
    //   1179: aload 7
    //   1181: getfield 320	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1184: invokevirtual 325	java/net/HttpURLConnection:disconnect	()V
    //   1187: aload 12
    //   1189: astore 10
    //   1191: goto -811 -> 380
    //   1194: astore 7
    //   1196: getstatic 34	com/tencent/mm/modelgeo/c:TAG	Ljava/lang/String;
    //   1199: ldc_w 310
    //   1202: iconst_1
    //   1203: anewarray 4	java/lang/Object
    //   1206: dup
    //   1207: iconst_0
    //   1208: aload 7
    //   1210: invokestatic 314	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1213: aastore
    //   1214: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1217: goto -827 -> 390
    //   1220: astore 9
    //   1222: goto -90 -> 1132
    //   1225: astore 8
    //   1227: aconst_null
    //   1228: astore 12
    //   1230: aload 9
    //   1232: astore 7
    //   1234: goto -913 -> 321
    //
    // Exception table:
    //   from	to	target	type
    //   254	259	319	java/io/IOException
    //   263	270	319	java/io/IOException
    //   274	279	319	java/io/IOException
    //   283	288	319	java/io/IOException
    //   292	299	319	java/io/IOException
    //   308	316	319	java/io/IOException
    //   436	441	319	java/io/IOException
    //   445	450	319	java/io/IOException
    //   454	462	319	java/io/IOException
    //   466	484	319	java/io/IOException
    //   488	493	319	java/io/IOException
    //   497	507	319	java/io/IOException
    //   511	521	319	java/io/IOException
    //   525	533	319	java/io/IOException
    //   537	550	319	java/io/IOException
    //   554	568	319	java/io/IOException
    //   575	585	319	java/io/IOException
    //   589	598	319	java/io/IOException
    //   602	612	319	java/io/IOException
    //   616	630	319	java/io/IOException
    //   634	645	319	java/io/IOException
    //   649	656	319	java/io/IOException
    //   666	677	319	java/io/IOException
    //   681	688	319	java/io/IOException
    //   700	711	319	java/io/IOException
    //   715	722	319	java/io/IOException
    //   752	763	319	java/io/IOException
    //   767	774	319	java/io/IOException
    //   781	792	319	java/io/IOException
    //   796	803	319	java/io/IOException
    //   810	821	319	java/io/IOException
    //   825	832	319	java/io/IOException
    //   839	850	319	java/io/IOException
    //   854	861	319	java/io/IOException
    //   868	881	319	java/io/IOException
    //   885	898	319	java/io/IOException
    //   902	921	319	java/io/IOException
    //   925	941	319	java/io/IOException
    //   945	964	319	java/io/IOException
    //   968	1000	319	java/io/IOException
    //   1004	1054	319	java/io/IOException
    //   1058	1108	319	java/io/IOException
    //   602	612	691	java/lang/Exception
    //   616	630	691	java/lang/Exception
    //   634	645	691	java/lang/Exception
    //   649	656	691	java/lang/Exception
    //   666	677	691	java/lang/Exception
    //   681	688	691	java/lang/Exception
    //   700	711	691	java/lang/Exception
    //   715	722	691	java/lang/Exception
    //   752	763	691	java/lang/Exception
    //   767	774	691	java/lang/Exception
    //   781	792	691	java/lang/Exception
    //   796	803	691	java/lang/Exception
    //   810	821	691	java/lang/Exception
    //   825	832	691	java/lang/Exception
    //   839	850	691	java/lang/Exception
    //   854	861	691	java/lang/Exception
    //   79	87	725	finally
    //   99	107	725	finally
    //   119	127	725	finally
    //   139	144	725	finally
    //   156	161	725	finally
    //   173	181	725	finally
    //   193	211	725	finally
    //   223	228	725	finally
    //   240	250	725	finally
    //   254	259	725	finally
    //   263	270	725	finally
    //   274	279	725	finally
    //   283	288	725	finally
    //   292	299	725	finally
    //   308	316	725	finally
    //   325	334	725	finally
    //   338	359	725	finally
    //   436	441	725	finally
    //   445	450	725	finally
    //   454	462	725	finally
    //   466	484	725	finally
    //   488	493	725	finally
    //   497	507	725	finally
    //   511	521	725	finally
    //   525	533	725	finally
    //   537	550	725	finally
    //   554	568	725	finally
    //   575	585	725	finally
    //   589	598	725	finally
    //   602	612	725	finally
    //   616	630	725	finally
    //   634	645	725	finally
    //   649	656	725	finally
    //   666	677	725	finally
    //   681	688	725	finally
    //   700	711	725	finally
    //   715	722	725	finally
    //   752	763	725	finally
    //   767	774	725	finally
    //   781	792	725	finally
    //   796	803	725	finally
    //   810	821	725	finally
    //   825	832	725	finally
    //   839	850	725	finally
    //   854	861	725	finally
    //   868	881	725	finally
    //   885	898	725	finally
    //   902	921	725	finally
    //   925	941	725	finally
    //   945	964	725	finally
    //   968	1000	725	finally
    //   1004	1054	725	finally
    //   1058	1108	725	finally
    //   1136	1145	725	finally
    //   1149	1170	725	finally
    //   79	87	1123	java/lang/Exception
    //   99	107	1123	java/lang/Exception
    //   119	127	1123	java/lang/Exception
    //   139	144	1123	java/lang/Exception
    //   156	161	1123	java/lang/Exception
    //   173	181	1123	java/lang/Exception
    //   193	211	1123	java/lang/Exception
    //   223	228	1123	java/lang/Exception
    //   240	250	1123	java/lang/Exception
    //   385	390	1194	java/io/IOException
    //   254	259	1220	java/lang/Exception
    //   263	270	1220	java/lang/Exception
    //   274	279	1220	java/lang/Exception
    //   283	288	1220	java/lang/Exception
    //   292	299	1220	java/lang/Exception
    //   308	316	1220	java/lang/Exception
    //   436	441	1220	java/lang/Exception
    //   445	450	1220	java/lang/Exception
    //   454	462	1220	java/lang/Exception
    //   466	484	1220	java/lang/Exception
    //   488	493	1220	java/lang/Exception
    //   497	507	1220	java/lang/Exception
    //   511	521	1220	java/lang/Exception
    //   525	533	1220	java/lang/Exception
    //   537	550	1220	java/lang/Exception
    //   554	568	1220	java/lang/Exception
    //   575	585	1220	java/lang/Exception
    //   589	598	1220	java/lang/Exception
    //   868	881	1220	java/lang/Exception
    //   885	898	1220	java/lang/Exception
    //   902	921	1220	java/lang/Exception
    //   925	941	1220	java/lang/Exception
    //   945	964	1220	java/lang/Exception
    //   968	1000	1220	java/lang/Exception
    //   1004	1054	1220	java/lang/Exception
    //   1058	1108	1220	java/lang/Exception
    //   79	87	1225	java/io/IOException
    //   99	107	1225	java/io/IOException
    //   119	127	1225	java/io/IOException
    //   139	144	1225	java/io/IOException
    //   156	161	1225	java/io/IOException
    //   173	181	1225	java/io/IOException
    //   193	211	1225	java/io/IOException
    //   223	228	1225	java/io/IOException
    //   240	250	1225	java/io/IOException
  }

  private static boolean b(CopyOnWriteArrayList<WeakReference<c.a>> paramCopyOnWriteArrayList, c.a parama)
  {
    AppMethodBeat.i(78114);
    boolean bool;
    if (paramCopyOnWriteArrayList == null)
    {
      AppMethodBeat.o(78114);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = paramCopyOnWriteArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          if ((localWeakReference != null) && (localWeakReference.get() != null) && (((c.a)localWeakReference.get()).equals(parama)))
          {
            paramCopyOnWriteArrayList.remove(localWeakReference);
            bool = true;
            AppMethodBeat.o(78114);
            break;
          }
        }
      AppMethodBeat.o(78114);
      bool = false;
    }
  }

  public final boolean a(double paramDouble1, double paramDouble2, c.a parama)
  {
    AppMethodBeat.i(78116);
    boolean bool = a(paramDouble1, paramDouble2, parama, null);
    AppMethodBeat.o(78116);
    return bool;
  }

  public final boolean a(double paramDouble1, double paramDouble2, c.a parama, Object paramObject)
  {
    AppMethodBeat.i(78115);
    if (paramObject != null)
    {
      localObject1 = this.fBx.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c.c)((Iterator)localObject1).next();
        if ((localObject2 != null) && (((c.c)localObject2).tag != null) && (((c.c)localObject2).tag.equals(paramObject)))
          this.fBx.remove(localObject2);
      }
    }
    Object localObject1 = new c.c(this, paramDouble1, paramDouble2, paramObject);
    Object localObject2 = (CopyOnWriteArrayList)this.fBy.get(((c.c)localObject1).toString());
    paramObject = localObject2;
    if (localObject2 == null)
      paramObject = new CopyOnWriteArrayList();
    if (!a(paramObject, parama))
      paramObject.add(new WeakReference(parama));
    this.fBy.put(((c.c)localObject1).toString(), paramObject);
    parama = this.fBx.iterator();
    boolean bool;
    while (parama.hasNext())
      if (((c.c)parama.next()).equals(localObject1))
      {
        agx();
        bool = false;
        AppMethodBeat.o(78115);
      }
    while (true)
    {
      return bool;
      if ((this.fBw != null) && (((c.c)localObject1).equals(this.fBw)))
      {
        bool = false;
        AppMethodBeat.o(78115);
      }
      else
      {
        this.fBx.add(localObject1);
        ab.i(TAG, "push task size %d listeners %d", new Object[] { Integer.valueOf(this.fBx.size()), Integer.valueOf(this.fBy.size()) });
        while (this.fBx.size() > 30)
        {
          ab.i(TAG, "force remove task");
          parama = (c.c)this.fBx.remove(0);
          if (parama != null)
            this.fBy.remove(parama.toString());
        }
        agx();
        bool = true;
        AppMethodBeat.o(78115);
      }
    }
  }

  public final boolean a(c.a parama)
  {
    AppMethodBeat.i(78112);
    Object localObject1 = new LinkedList();
    Object localObject2 = new LinkedList();
    Iterator localIterator = this.fBy.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject3 = (CopyOnWriteArrayList)this.fBy.get(str);
      b((CopyOnWriteArrayList)localObject3, parama);
      this.fBy.put(str, localObject3);
      if ((localObject3 == null) || (((CopyOnWriteArrayList)localObject3).size() == 0))
        ((LinkedList)localObject2).add(str);
    }
    Object localObject3 = ((LinkedList)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      parama = (String)((Iterator)localObject3).next();
      this.fBy.remove(parama);
    }
    parama = this.fBx.iterator();
    while (parama.hasNext())
    {
      localObject2 = (c.c)parama.next();
      localObject3 = (CopyOnWriteArrayList)this.fBy.get(((c.c)localObject2).toString());
      if ((localObject3 == null) || (((CopyOnWriteArrayList)localObject3).size() == 0))
      {
        ((LinkedList)localObject1).add(localObject2);
        this.fBy.remove(((c.c)localObject2).toString());
      }
    }
    parama = ((LinkedList)localObject1).iterator();
    while (parama.hasNext())
    {
      localObject1 = (c.c)parama.next();
      this.fBx.remove(localObject1);
    }
    ab.i(TAG, "remove taskLists %d listeners size %d", new Object[] { Integer.valueOf(this.fBx.size()), Integer.valueOf(this.fBy.size()) });
    AppMethodBeat.o(78112);
    return true;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78121);
    if (paramm.getType() == 655)
    {
      paramString = ((e)paramm).agD();
      if ((paramString == null) || (paramString.fBg == null) || (paramString.fBg.equals("")))
      {
        this.fBz.e(new c.b(this));
        AppMethodBeat.o(78121);
      }
    }
    while (true)
    {
      return;
      a(paramString);
      AppMethodBeat.o(78121);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.c
 * JD-Core Version:    0.6.2
 */