package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;
import java.util.Map;

public class r
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  c fMA;
  private n fMu;
  private b fMv;
  private o fMw;
  private p fMx;
  private q fMy;
  private l fMz;

  static
  {
    AppMethodBeat.i(78519);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("PACKAGE_INFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return n.fnj;
      }
    });
    eaA.put(Integer.valueOf("CHATTINGBGINFO_TABLE".hashCode()), new r.2());
    AppMethodBeat.o(78519);
  }

  public r()
  {
    AppMethodBeat.i(78511);
    this.fMw = new o();
    this.fMx = new p();
    this.fMy = new q();
    this.fMz = null;
    this.fMA = new r.3(this);
    AppMethodBeat.o(78511);
  }

  private static r aiw()
  {
    AppMethodBeat.i(78512);
    r localr = (r)com.tencent.mm.model.q.Y(r.class);
    AppMethodBeat.o(78512);
    return localr;
  }

  public static n aix()
  {
    AppMethodBeat.i(78513);
    g.RN().QU();
    if (aiw().fMu == null)
      aiw().fMu = new n(g.RP().eJN);
    n localn = aiw().fMu;
    AppMethodBeat.o(78513);
    return localn;
  }

  public static b aiy()
  {
    AppMethodBeat.i(78514);
    g.RN().QU();
    if (aiw().fMv == null)
      aiw().fMv = new b(g.RP().eJN);
    b localb = aiw().fMv;
    AppMethodBeat.o(78514);
    return localb;
  }

  // ERROR //
  private boolean sV(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 157
    //   4: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 159	com/tencent/mm/vfs/b
    //   10: dup
    //   11: aload_1
    //   12: invokespecial 162	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual 166	com/tencent/mm/vfs/b:exists	()Z
    //   20: ifne +28 -> 48
    //   23: ldc 168
    //   25: ldc 170
    //   27: aload_1
    //   28: invokestatic 173	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: invokevirtual 177	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   34: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: ldc 157
    //   39: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: iconst_0
    //   43: istore 4
    //   45: iload 4
    //   47: ireturn
    //   48: new 36	java/util/HashMap
    //   51: dup
    //   52: invokespecial 39	java/util/HashMap:<init>	()V
    //   55: astore 5
    //   57: aload_3
    //   58: invokestatic 189	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   61: astore_1
    //   62: new 191	java/io/InputStreamReader
    //   65: astore 6
    //   67: aload 6
    //   69: aload_1
    //   70: ldc 193
    //   72: invokespecial 196	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   75: new 198	java/io/BufferedReader
    //   78: astore 7
    //   80: aload 7
    //   82: aload 6
    //   84: invokespecial 201	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   87: aload 7
    //   89: invokevirtual 205	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   92: astore 8
    //   94: aload 8
    //   96: ifnull +399 -> 495
    //   99: aload 8
    //   101: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   104: ldc 210
    //   106: invokevirtual 214	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   109: astore 9
    //   111: aload 9
    //   113: arraylength
    //   114: iconst_2
    //   115: if_icmplt +23 -> 138
    //   118: aload 9
    //   120: iconst_0
    //   121: aaload
    //   122: invokestatic 219	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   125: ifne +13 -> 138
    //   128: aload 9
    //   130: iconst_1
    //   131: aaload
    //   132: invokestatic 219	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   135: ifeq +109 -> 244
    //   138: ldc 168
    //   140: ldc 221
    //   142: aload 8
    //   144: invokestatic 173	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   147: invokevirtual 177	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   150: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: goto -66 -> 87
    //   156: astore_2
    //   157: ldc 168
    //   159: aload_2
    //   160: ldc 223
    //   162: iconst_0
    //   163: anewarray 4	java/lang/Object
    //   166: invokestatic 227	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 232	java/io/InputStream:close	()V
    //   177: aload 5
    //   179: invokeinterface 238 1 0
    //   184: invokeinterface 244 1 0
    //   189: astore_2
    //   190: aload_2
    //   191: invokeinterface 249 1 0
    //   196: ifeq +37 -> 233
    //   199: aload_2
    //   200: invokeinterface 253 1 0
    //   205: checkcast 255	java/io/BufferedWriter
    //   208: astore_1
    //   209: aload_1
    //   210: ifnull -20 -> 190
    //   213: aload_1
    //   214: invokevirtual 256	java/io/BufferedWriter:close	()V
    //   217: goto -27 -> 190
    //   220: astore_1
    //   221: ldc 168
    //   223: aload_1
    //   224: ldc 223
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 227	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: ldc 157
    //   235: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: iconst_0
    //   239: istore 4
    //   241: goto -196 -> 45
    //   244: aload 5
    //   246: aload 9
    //   248: iconst_0
    //   249: aaload
    //   250: invokeinterface 260 2 0
    //   255: checkcast 255	java/io/BufferedWriter
    //   258: astore 10
    //   260: aload 10
    //   262: astore 8
    //   264: aload 10
    //   266: ifnonnull +95 -> 361
    //   269: invokestatic 266	com/tencent/mm/storage/RegionCodeDecoder:duj	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   272: pop
    //   273: aload 9
    //   275: iconst_0
    //   276: aaload
    //   277: invokestatic 269	com/tencent/mm/storage/RegionCodeDecoder:apP	(Ljava/lang/String;)Ljava/lang/String;
    //   280: astore 8
    //   282: aload 8
    //   284: astore_2
    //   285: aload 8
    //   287: invokestatic 219	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   290: ifne -203 -> 87
    //   293: new 159	com/tencent/mm/vfs/b
    //   296: astore 11
    //   298: aload 11
    //   300: aload 8
    //   302: invokespecial 162	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   305: aload 11
    //   307: invokevirtual 166	com/tencent/mm/vfs/b:exists	()Z
    //   310: ifne +9 -> 319
    //   313: aload 11
    //   315: invokevirtual 272	com/tencent/mm/vfs/b:createNewFile	()Z
    //   318: pop
    //   319: new 255	java/io/BufferedWriter
    //   322: astore 10
    //   324: new 274	com/tencent/mm/vfs/h
    //   327: astore_2
    //   328: aload_2
    //   329: aload 11
    //   331: invokespecial 277	com/tencent/mm/vfs/h:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   334: aload 10
    //   336: aload_2
    //   337: invokespecial 280	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   340: aload 5
    //   342: aload 9
    //   344: iconst_0
    //   345: aaload
    //   346: aload 10
    //   348: invokeinterface 281 3 0
    //   353: pop
    //   354: aload 8
    //   356: astore_2
    //   357: aload 10
    //   359: astore 8
    //   361: new 283	java/lang/StringBuffer
    //   364: astore 10
    //   366: aload 10
    //   368: invokespecial 284	java/lang/StringBuffer:<init>	()V
    //   371: aload 10
    //   373: aload 9
    //   375: iconst_1
    //   376: aaload
    //   377: invokevirtual 288	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   380: pop
    //   381: aload 10
    //   383: bipush 124
    //   385: invokevirtual 291	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   388: pop
    //   389: aload 10
    //   391: aload 9
    //   393: iconst_2
    //   394: aaload
    //   395: invokevirtual 288	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   398: pop
    //   399: aload 10
    //   401: bipush 10
    //   403: invokevirtual 291	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   406: pop
    //   407: aload 8
    //   409: aload 10
    //   411: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   414: invokevirtual 297	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   417: goto -330 -> 87
    //   420: astore_2
    //   421: aload_1
    //   422: ifnull +7 -> 429
    //   425: aload_1
    //   426: invokevirtual 232	java/io/InputStream:close	()V
    //   429: aload 5
    //   431: invokeinterface 238 1 0
    //   436: invokeinterface 244 1 0
    //   441: astore_1
    //   442: aload_1
    //   443: invokeinterface 249 1 0
    //   448: ifeq +40 -> 488
    //   451: aload_1
    //   452: invokeinterface 253 1 0
    //   457: checkcast 255	java/io/BufferedWriter
    //   460: astore 8
    //   462: aload 8
    //   464: ifnull -22 -> 442
    //   467: aload 8
    //   469: invokevirtual 256	java/io/BufferedWriter:close	()V
    //   472: goto -30 -> 442
    //   475: astore_1
    //   476: ldc 168
    //   478: aload_1
    //   479: ldc 223
    //   481: iconst_0
    //   482: anewarray 4	java/lang/Object
    //   485: invokestatic 227	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: ldc 157
    //   490: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   493: aload_2
    //   494: athrow
    //   495: aload 5
    //   497: invokeinterface 238 1 0
    //   502: invokeinterface 244 1 0
    //   507: astore 8
    //   509: aload 8
    //   511: invokeinterface 249 1 0
    //   516: ifeq +28 -> 544
    //   519: aload 8
    //   521: invokeinterface 253 1 0
    //   526: checkcast 255	java/io/BufferedWriter
    //   529: astore 10
    //   531: aload 10
    //   533: ifnull -24 -> 509
    //   536: aload 10
    //   538: invokevirtual 300	java/io/BufferedWriter:flush	()V
    //   541: goto -32 -> 509
    //   544: aload_2
    //   545: invokestatic 219	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   548: ifne +84 -> 632
    //   551: new 159	com/tencent/mm/vfs/b
    //   554: astore 8
    //   556: aload 8
    //   558: aload_2
    //   559: invokespecial 162	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   562: aload 8
    //   564: invokevirtual 304	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   567: astore_2
    //   568: new 306	com/tencent/mm/ba/r$4
    //   571: astore 8
    //   573: aload 8
    //   575: aload_0
    //   576: invokespecial 307	com/tencent/mm/ba/r$4:<init>	(Lcom/tencent/mm/ba/r;)V
    //   579: aload_2
    //   580: aload 8
    //   582: invokevirtual 310	com/tencent/mm/vfs/b:a	(Lcom/tencent/mm/vfs/c;)[Lcom/tencent/mm/vfs/b;
    //   585: astore_2
    //   586: aload_2
    //   587: arraylength
    //   588: istore 12
    //   590: iconst_0
    //   591: istore 13
    //   593: iload 13
    //   595: iload 12
    //   597: if_icmpge +29 -> 626
    //   600: aload_2
    //   601: iload 13
    //   603: aaload
    //   604: astore 8
    //   606: invokestatic 266	com/tencent/mm/storage/RegionCodeDecoder:duj	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   609: pop
    //   610: aload 8
    //   612: aload 8
    //   614: invokevirtual 304	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   617: invokestatic 313	com/tencent/mm/storage/RegionCodeDecoder:a	(Lcom/tencent/mm/vfs/b;Lcom/tencent/mm/vfs/b;)V
    //   620: iinc 13 1
    //   623: goto -30 -> 593
    //   626: invokestatic 266	com/tencent/mm/storage/RegionCodeDecoder:duj	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   629: invokevirtual 316	com/tencent/mm/storage/RegionCodeDecoder:drS	()V
    //   632: aload 7
    //   634: invokevirtual 317	java/io/BufferedReader:close	()V
    //   637: aload 6
    //   639: invokevirtual 318	java/io/InputStreamReader:close	()V
    //   642: aload_3
    //   643: invokevirtual 321	com/tencent/mm/vfs/b:delete	()Z
    //   646: pop
    //   647: aload_1
    //   648: ifnull +7 -> 655
    //   651: aload_1
    //   652: invokevirtual 232	java/io/InputStream:close	()V
    //   655: aload 5
    //   657: invokeinterface 238 1 0
    //   662: invokeinterface 244 1 0
    //   667: astore_1
    //   668: aload_1
    //   669: invokeinterface 249 1 0
    //   674: ifeq +37 -> 711
    //   677: aload_1
    //   678: invokeinterface 253 1 0
    //   683: checkcast 255	java/io/BufferedWriter
    //   686: astore_2
    //   687: aload_2
    //   688: ifnull -20 -> 668
    //   691: aload_2
    //   692: invokevirtual 256	java/io/BufferedWriter:close	()V
    //   695: goto -27 -> 668
    //   698: astore_1
    //   699: ldc 168
    //   701: aload_1
    //   702: ldc 223
    //   704: iconst_0
    //   705: anewarray 4	java/lang/Object
    //   708: invokestatic 227	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   711: ldc 157
    //   713: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   716: iconst_1
    //   717: istore 4
    //   719: goto -674 -> 45
    //   722: astore_2
    //   723: aconst_null
    //   724: astore_1
    //   725: goto -304 -> 421
    //   728: astore_2
    //   729: goto -308 -> 421
    //   732: astore_2
    //   733: aconst_null
    //   734: astore_1
    //   735: goto -578 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   62	87	156	java/lang/Exception
    //   87	94	156	java/lang/Exception
    //   99	138	156	java/lang/Exception
    //   138	153	156	java/lang/Exception
    //   244	260	156	java/lang/Exception
    //   269	282	156	java/lang/Exception
    //   285	319	156	java/lang/Exception
    //   319	354	156	java/lang/Exception
    //   361	417	156	java/lang/Exception
    //   495	509	156	java/lang/Exception
    //   509	531	156	java/lang/Exception
    //   536	541	156	java/lang/Exception
    //   544	590	156	java/lang/Exception
    //   606	620	156	java/lang/Exception
    //   626	632	156	java/lang/Exception
    //   632	647	156	java/lang/Exception
    //   173	177	220	java/io/IOException
    //   177	190	220	java/io/IOException
    //   190	209	220	java/io/IOException
    //   213	217	220	java/io/IOException
    //   62	87	420	finally
    //   87	94	420	finally
    //   99	138	420	finally
    //   138	153	420	finally
    //   244	260	420	finally
    //   269	282	420	finally
    //   285	319	420	finally
    //   319	354	420	finally
    //   361	417	420	finally
    //   495	509	420	finally
    //   509	531	420	finally
    //   536	541	420	finally
    //   544	590	420	finally
    //   606	620	420	finally
    //   626	632	420	finally
    //   632	647	420	finally
    //   425	429	475	java/io/IOException
    //   429	442	475	java/io/IOException
    //   442	462	475	java/io/IOException
    //   467	472	475	java/io/IOException
    //   651	655	698	java/io/IOException
    //   655	668	698	java/io/IOException
    //   668	687	698	java/io/IOException
    //   691	695	698	java/io/IOException
    //   57	62	722	finally
    //   157	169	728	finally
    //   57	62	732	java/lang/Exception
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(78516);
    com.tencent.mm.sdk.b.a.xxA.c(this.fMw);
    com.tencent.mm.sdk.b.a.xxA.c(this.fMx);
    com.tencent.mm.sdk.b.a.xxA.c(this.fMy);
    com.tencent.mm.sdk.b.a.xxA.c(this.fMA);
    if (this.fMz != null)
      this.fMz.fMp.clear();
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.fMz.fMq);
      com.tencent.mm.sdk.b.a.xxA.c(this.fMz.fMr);
      AppMethodBeat.o(78516);
      return;
      this.fMz = new l();
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(78515);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMw);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMx);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMy);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMz.fMq);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMz.fMr);
    com.tencent.mm.sdk.b.a.xxA.d(this.fMA);
    AppMethodBeat.o(78515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.r
 * JD-Core Version:    0.6.2
 */