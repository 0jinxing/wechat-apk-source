package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;
import java.util.HashMap;
import java.util.HashSet;

final class a$b extends com.tencent.mm.plugin.fts.a.a.a
{
  private HashSet<String> mFM;
  private HashMap<String, ad> mFN;
  private long mFO;
  private long mFP;
  private int mFQ;
  private int mFR;
  private int mFS;
  private int mFT;
  private int mFU;
  private int mFV;
  private int mFW;
  private int mFX;

  private a$b(a parama)
  {
    AppMethodBeat.i(136666);
    this.mFN = new HashMap();
    this.mFO = -1L;
    this.mFP = -1L;
    this.mFQ = 0;
    this.mFR = 0;
    this.mFS = 0;
    this.mFT = 0;
    this.mFU = 0;
    AppMethodBeat.o(136666);
  }

  public final String aAo()
  {
    AppMethodBeat.i(136668);
    String str = String.format("{build: %d newContact: %d, newChatroom: %d, remove: %d, dirty: %d, timestamp: %d, failContact: %d, failChatroom}", new Object[] { Integer.valueOf(this.mFX), Integer.valueOf(this.mFR), Integer.valueOf(this.mFQ), Integer.valueOf(this.mFS), Integer.valueOf(this.mFV), Integer.valueOf(this.mFW), Integer.valueOf(this.mFT), Integer.valueOf(this.mFU) });
    AppMethodBeat.o(136668);
    return str;
  }

  // ERROR //
  public final boolean execute()
  {
    // Byte code:
    //   0: ldc 99
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 101
    //   7: ldc 103
    //   9: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: ldc 110
    //   15: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   18: aload_0
    //   19: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   22: ifnonnull +230 -> 252
    //   25: aload_0
    //   26: new 118	java/util/HashSet
    //   29: dup
    //   30: invokespecial 119	java/util/HashSet:<init>	()V
    //   33: putfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   36: aload_0
    //   37: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   40: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   43: getstatic 129	com/tencent/mm/plugin/fts/a/c:mCk	[I
    //   46: iconst_1
    //   47: iconst_0
    //   48: iconst_1
    //   49: iconst_0
    //   50: iconst_1
    //   51: invokevirtual 134	com/tencent/mm/plugin/fts/c/a:a	([IZZZZZ)Landroid/database/Cursor;
    //   54: astore_1
    //   55: aload_1
    //   56: invokeinterface 139 1 0
    //   61: ifeq +128 -> 189
    //   64: aload_1
    //   65: iconst_1
    //   66: invokeinterface 143 2 0
    //   71: astore_2
    //   72: aload_1
    //   73: iconst_2
    //   74: invokeinterface 147 2 0
    //   79: istore_3
    //   80: aload_1
    //   81: iconst_0
    //   82: invokeinterface 151 2 0
    //   87: lstore 4
    //   89: iload_3
    //   90: iconst_1
    //   91: if_icmpne +69 -> 160
    //   94: aload_0
    //   95: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   98: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   101: aload_2
    //   102: invokevirtual 158	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   105: checkcast 160	java/util/List
    //   108: astore 6
    //   110: aload 6
    //   112: astore 7
    //   114: aload 6
    //   116: ifnonnull +28 -> 144
    //   119: new 162	java/util/ArrayList
    //   122: dup
    //   123: bipush 16
    //   125: invokespecial 164	java/util/ArrayList:<init>	(I)V
    //   128: astore 7
    //   130: aload_0
    //   131: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   134: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   137: aload_2
    //   138: aload 7
    //   140: invokevirtual 168	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   143: pop
    //   144: aload 7
    //   146: lload 4
    //   148: invokestatic 173	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   151: invokeinterface 177 2 0
    //   156: pop
    //   157: goto -102 -> 55
    //   160: aload_0
    //   161: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   164: aload_2
    //   165: invokevirtual 178	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   168: pop
    //   169: iload_3
    //   170: iconst_2
    //   171: if_icmpne -116 -> 55
    //   174: aload_0
    //   175: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   178: invokestatic 182	com/tencent/mm/plugin/fts/b/a:c	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashSet;
    //   181: aload_2
    //   182: invokevirtual 178	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   185: pop
    //   186: goto -131 -> 55
    //   189: aload_1
    //   190: invokeinterface 185 1 0
    //   195: aload_0
    //   196: aload_0
    //   197: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   200: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   203: invokevirtual 189	java/util/HashMap:size	()I
    //   206: putfield 86	com/tencent/mm/plugin/fts/b/a$b:mFV	I
    //   209: aload_0
    //   210: aload_0
    //   211: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   214: invokestatic 182	com/tencent/mm/plugin/fts/b/a:c	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashSet;
    //   217: invokevirtual 190	java/util/HashSet:size	()I
    //   220: putfield 88	com/tencent/mm/plugin/fts/b/a$b:mFW	I
    //   223: aload_0
    //   224: aload_0
    //   225: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   228: invokevirtual 190	java/util/HashSet:size	()I
    //   231: putfield 78	com/tencent/mm/plugin/fts/b/a$b:mFX	I
    //   234: aload_0
    //   235: getfield 78	com/tencent/mm/plugin/fts/b/a$b:mFX	I
    //   238: iconst_5
    //   239: if_icmpge +13 -> 252
    //   242: aload_0
    //   243: aload_0
    //   244: getfield 193	com/tencent/mm/plugin/fts/a/a/a:mDq	J
    //   247: lconst_1
    //   248: lor
    //   249: putfield 193	com/tencent/mm/plugin/fts/a/a/a:mDq	J
    //   252: aload_0
    //   253: ldc 195
    //   255: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   258: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   261: ifeq +20 -> 281
    //   264: new 202	java/lang/InterruptedException
    //   267: dup
    //   268: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   271: astore 7
    //   273: ldc 99
    //   275: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: aload 7
    //   280: athrow
    //   281: aload_0
    //   282: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   285: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   288: invokevirtual 189	java/util/HashMap:size	()I
    //   291: ifle +82 -> 373
    //   294: new 162	java/util/ArrayList
    //   297: dup
    //   298: invokespecial 204	java/util/ArrayList:<init>	()V
    //   301: astore 6
    //   303: aload_0
    //   304: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   307: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   310: invokevirtual 208	java/util/HashMap:values	()Ljava/util/Collection;
    //   313: invokeinterface 214 1 0
    //   318: astore 7
    //   320: aload 7
    //   322: invokeinterface 219 1 0
    //   327: ifeq +24 -> 351
    //   330: aload 6
    //   332: aload 7
    //   334: invokeinterface 223 1 0
    //   339: checkcast 160	java/util/List
    //   342: invokeinterface 227 2 0
    //   347: pop
    //   348: goto -28 -> 320
    //   351: aload_0
    //   352: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   355: invokestatic 154	com/tencent/mm/plugin/fts/b/a:b	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashMap;
    //   358: invokevirtual 230	java/util/HashMap:clear	()V
    //   361: aload_0
    //   362: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   365: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   368: aload 6
    //   370: invokevirtual 234	com/tencent/mm/plugin/fts/c/a:bV	(Ljava/util/List;)V
    //   373: aload_0
    //   374: ldc 236
    //   376: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   379: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   382: ifeq +20 -> 402
    //   385: new 202	java/lang/InterruptedException
    //   388: dup
    //   389: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   392: astore 7
    //   394: ldc 99
    //   396: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   399: aload 7
    //   401: athrow
    //   402: aload_0
    //   403: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   406: invokestatic 182	com/tencent/mm/plugin/fts/b/a:c	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashSet;
    //   409: invokevirtual 190	java/util/HashSet:size	()I
    //   412: ifle +80 -> 492
    //   415: aload_0
    //   416: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   419: invokestatic 182	com/tencent/mm/plugin/fts/b/a:c	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashSet;
    //   422: invokevirtual 237	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   425: astore 6
    //   427: aload 6
    //   429: invokeinterface 219 1 0
    //   434: ifeq +48 -> 482
    //   437: aload 6
    //   439: invokeinterface 223 1 0
    //   444: checkcast 90	java/lang/String
    //   447: astore 7
    //   449: aload_0
    //   450: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   453: invokestatic 241	com/tencent/mm/plugin/fts/b/a:d	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/a/j;
    //   456: aload 7
    //   458: invokeinterface 247 2 0
    //   463: lstore 4
    //   465: aload_0
    //   466: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   469: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   472: aload 7
    //   474: lload 4
    //   476: invokevirtual 251	com/tencent/mm/plugin/fts/c/a:G	(Ljava/lang/String;J)V
    //   479: goto -52 -> 427
    //   482: aload_0
    //   483: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   486: invokestatic 182	com/tencent/mm/plugin/fts/b/a:c	(Lcom/tencent/mm/plugin/fts/b/a;)Ljava/util/HashSet;
    //   489: invokevirtual 252	java/util/HashSet:clear	()V
    //   492: aload_0
    //   493: ldc 254
    //   495: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   498: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   501: ifeq +20 -> 521
    //   504: new 202	java/lang/InterruptedException
    //   507: dup
    //   508: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   511: astore 7
    //   513: ldc 99
    //   515: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   518: aload 7
    //   520: athrow
    //   521: aload_0
    //   522: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   525: invokestatic 241	com/tencent/mm/plugin/fts/b/a:d	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/a/j;
    //   528: ldc_w 256
    //   531: iconst_1
    //   532: anewarray 90	java/lang/String
    //   535: dup
    //   536: iconst_0
    //   537: aload_0
    //   538: getfield 50	com/tencent/mm/plugin/fts/b/a$b:mFO	J
    //   541: invokestatic 260	java/lang/Long:toString	(J)Ljava/lang/String;
    //   544: aastore
    //   545: invokeinterface 263 3 0
    //   550: astore 7
    //   552: bipush 50
    //   554: istore_3
    //   555: aload 7
    //   557: invokeinterface 139 1 0
    //   562: ifeq +390 -> 952
    //   565: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   568: ifeq +37 -> 605
    //   571: aload 7
    //   573: invokeinterface 185 1 0
    //   578: aload_0
    //   579: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   582: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   585: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   588: new 202	java/lang/InterruptedException
    //   591: dup
    //   592: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   595: astore 7
    //   597: ldc 99
    //   599: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   602: aload 7
    //   604: athrow
    //   605: aload 7
    //   607: iconst_0
    //   608: invokeinterface 151 2 0
    //   613: lstore 4
    //   615: aload_0
    //   616: lload 4
    //   618: putfield 50	com/tencent/mm/plugin/fts/b/a$b:mFO	J
    //   621: new 268	com/tencent/mm/storage/ad
    //   624: dup
    //   625: invokespecial 269	com/tencent/mm/storage/ad:<init>	()V
    //   628: astore 6
    //   630: aload 6
    //   632: lload 4
    //   634: putfield 272	com/tencent/mm/storage/ad:ewQ	J
    //   637: aload 6
    //   639: aload 7
    //   641: iconst_1
    //   642: invokeinterface 143 2 0
    //   647: invokevirtual 275	com/tencent/mm/storage/ad:setUsername	(Ljava/lang/String;)V
    //   650: aload 6
    //   652: aload 7
    //   654: iconst_2
    //   655: invokeinterface 143 2 0
    //   660: invokevirtual 278	com/tencent/mm/storage/ad:iy	(Ljava/lang/String;)V
    //   663: aload 6
    //   665: aload 7
    //   667: iconst_3
    //   668: invokeinterface 143 2 0
    //   673: invokevirtual 281	com/tencent/mm/storage/ad:iz	(Ljava/lang/String;)V
    //   676: aload 6
    //   678: aload 7
    //   680: iconst_4
    //   681: invokeinterface 143 2 0
    //   686: invokevirtual 284	com/tencent/mm/storage/ad:iB	(Ljava/lang/String;)V
    //   689: aload 6
    //   691: aload 7
    //   693: iconst_5
    //   694: invokeinterface 147 2 0
    //   699: invokevirtual 287	com/tencent/mm/storage/ad:hw	(I)V
    //   702: aload 6
    //   704: aload 7
    //   706: bipush 6
    //   708: invokeinterface 147 2 0
    //   713: invokevirtual 290	com/tencent/mm/storage/ad:setType	(I)V
    //   716: aload 6
    //   718: aload 7
    //   720: bipush 7
    //   722: invokeinterface 294 2 0
    //   727: invokevirtual 298	com/tencent/mm/storage/ad:H	([B)V
    //   730: aload 6
    //   732: aload 7
    //   734: bipush 8
    //   736: invokeinterface 143 2 0
    //   741: invokevirtual 301	com/tencent/mm/storage/ad:iI	(Ljava/lang/String;)V
    //   744: aload 6
    //   746: iconst_0
    //   747: invokevirtual 304	com/tencent/mm/storage/ad:hy	(I)V
    //   750: aload_0
    //   751: getfield 46	com/tencent/mm/plugin/fts/b/a$b:mFN	Ljava/util/HashMap;
    //   754: aload 6
    //   756: getfield 310	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   759: aload 6
    //   761: invokevirtual 168	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   764: pop
    //   765: aload 6
    //   767: getfield 310	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   770: invokestatic 316	com/tencent/mm/model/t:kH	(Ljava/lang/String;)Z
    //   773: ifne -218 -> 555
    //   776: aload_0
    //   777: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   780: aload 6
    //   782: invokevirtual 319	com/tencent/mm/plugin/fts/b/a:H	(Lcom/tencent/mm/storage/ad;)Z
    //   785: ifeq -230 -> 555
    //   788: aload_0
    //   789: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   792: aload 6
    //   794: getfield 310	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   797: invokevirtual 322	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   800: ifne -245 -> 555
    //   803: iload_3
    //   804: istore 8
    //   806: iload_3
    //   807: bipush 50
    //   809: if_icmplt +26 -> 835
    //   812: aload_0
    //   813: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   816: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   819: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   822: aload_0
    //   823: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   826: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   829: invokevirtual 325	com/tencent/mm/plugin/fts/c/a:beginTransaction	()V
    //   832: iconst_0
    //   833: istore 8
    //   835: iload 8
    //   837: istore_3
    //   838: aload 6
    //   840: getfield 310	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   843: ldc_w 327
    //   846: invokevirtual 330	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   849: ifne +38 -> 887
    //   852: iload 8
    //   854: istore_3
    //   855: aload 6
    //   857: getfield 333	com/tencent/mm/g/c/ap:field_verifyFlag	I
    //   860: invokestatic 336	com/tencent/mm/storage/ad:dsh	()I
    //   863: iand
    //   864: ifne +23 -> 887
    //   867: iload 8
    //   869: istore_3
    //   870: aload_0
    //   871: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   874: aload 6
    //   876: invokevirtual 340	com/tencent/mm/plugin/fts/b/a:F	(Lcom/tencent/mm/storage/ad;)V
    //   879: iload 8
    //   881: istore_3
    //   882: aload 6
    //   884: invokevirtual 343	com/tencent/mm/storage/ad:dsk	()V
    //   887: iload 8
    //   889: istore_3
    //   890: iload 8
    //   892: aload_0
    //   893: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   896: aload 6
    //   898: invokevirtual 346	com/tencent/mm/plugin/fts/b/a:J	(Lcom/tencent/mm/storage/ad;)I
    //   901: iadd
    //   902: istore 8
    //   904: iload 8
    //   906: istore_3
    //   907: aload_0
    //   908: aload_0
    //   909: getfield 56	com/tencent/mm/plugin/fts/b/a$b:mFR	I
    //   912: iconst_1
    //   913: iadd
    //   914: putfield 56	com/tencent/mm/plugin/fts/b/a$b:mFR	I
    //   917: iload 8
    //   919: istore_3
    //   920: goto -365 -> 555
    //   923: astore 6
    //   925: ldc 101
    //   927: aload 6
    //   929: ldc_w 348
    //   932: iconst_0
    //   933: anewarray 76	java/lang/Object
    //   936: invokestatic 352	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   939: aload_0
    //   940: aload_0
    //   941: getfield 60	com/tencent/mm/plugin/fts/b/a$b:mFT	I
    //   944: iconst_1
    //   945: iadd
    //   946: putfield 60	com/tencent/mm/plugin/fts/b/a$b:mFT	I
    //   949: goto -394 -> 555
    //   952: aload 7
    //   954: invokeinterface 185 1 0
    //   959: aload_0
    //   960: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   963: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   966: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   969: aload_0
    //   970: ldc_w 354
    //   973: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   976: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   979: ifeq +20 -> 999
    //   982: new 202	java/lang/InterruptedException
    //   985: dup
    //   986: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   989: astore 7
    //   991: ldc 99
    //   993: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   996: aload 7
    //   998: athrow
    //   999: aload_0
    //   1000: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1003: invokestatic 241	com/tencent/mm/plugin/fts/b/a:d	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/a/j;
    //   1006: ldc_w 356
    //   1009: iconst_1
    //   1010: anewarray 90	java/lang/String
    //   1013: dup
    //   1014: iconst_0
    //   1015: aload_0
    //   1016: getfield 52	com/tencent/mm/plugin/fts/b/a$b:mFP	J
    //   1019: invokestatic 260	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1022: aastore
    //   1023: invokeinterface 263 3 0
    //   1028: astore 6
    //   1030: bipush 50
    //   1032: istore_3
    //   1033: aload 6
    //   1035: invokeinterface 139 1 0
    //   1040: ifeq +273 -> 1313
    //   1043: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   1046: ifeq +37 -> 1083
    //   1049: aload 6
    //   1051: invokeinterface 185 1 0
    //   1056: aload_0
    //   1057: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1060: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   1063: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   1066: new 202	java/lang/InterruptedException
    //   1069: dup
    //   1070: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   1073: astore 7
    //   1075: ldc 99
    //   1077: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1080: aload 7
    //   1082: athrow
    //   1083: aload_0
    //   1084: aload 6
    //   1086: iconst_0
    //   1087: invokeinterface 151 2 0
    //   1092: putfield 52	com/tencent/mm/plugin/fts/b/a$b:mFP	J
    //   1095: aload 6
    //   1097: iconst_1
    //   1098: invokeinterface 143 2 0
    //   1103: astore_1
    //   1104: aload_0
    //   1105: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   1108: aload_1
    //   1109: invokevirtual 322	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   1112: ifne -79 -> 1033
    //   1115: aload_0
    //   1116: getfield 46	com/tencent/mm/plugin/fts/b/a$b:mFN	Ljava/util/HashMap;
    //   1119: aload_1
    //   1120: invokevirtual 158	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1123: checkcast 268	com/tencent/mm/storage/ad
    //   1126: astore_2
    //   1127: aload_2
    //   1128: ifnonnull +16 -> 1144
    //   1131: aload_0
    //   1132: aload_0
    //   1133: getfield 62	com/tencent/mm/plugin/fts/b/a$b:mFU	I
    //   1136: iconst_1
    //   1137: iadd
    //   1138: putfield 62	com/tencent/mm/plugin/fts/b/a$b:mFU	I
    //   1141: goto -108 -> 1033
    //   1144: aload 6
    //   1146: iconst_2
    //   1147: invokeinterface 143 2 0
    //   1152: astore 9
    //   1154: aload 6
    //   1156: iconst_3
    //   1157: invokeinterface 294 2 0
    //   1162: astore 7
    //   1164: getstatic 362	com/tencent/mm/plugin/fts/a/c$a:mCy	Ljava/util/regex/Pattern;
    //   1167: aload 9
    //   1169: invokevirtual 368	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   1172: astore 9
    //   1174: new 370	com/tencent/mm/plugin/fts/b/a$b$1
    //   1177: astore 10
    //   1179: aload 10
    //   1181: aload_0
    //   1182: invokespecial 373	com/tencent/mm/plugin/fts/b/a$b$1:<init>	(Lcom/tencent/mm/plugin/fts/b/a$b;)V
    //   1185: aload 9
    //   1187: aload 10
    //   1189: invokestatic 379	java/util/Arrays:sort	([Ljava/lang/Object;Ljava/util/Comparator;)V
    //   1192: aload_0
    //   1193: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1196: aload_1
    //   1197: aload 9
    //   1199: invokevirtual 383	com/tencent/mm/plugin/fts/b/a:j	(Ljava/lang/String;[Ljava/lang/String;)I
    //   1202: istore 8
    //   1204: iload_3
    //   1205: iload 8
    //   1207: iadd
    //   1208: istore_3
    //   1209: aload_0
    //   1210: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1213: aload_1
    //   1214: aload_2
    //   1215: aload 9
    //   1217: aload 7
    //   1219: aload_0
    //   1220: getfield 46	com/tencent/mm/plugin/fts/b/a$b:mFN	Ljava/util/HashMap;
    //   1223: invokevirtual 386	com/tencent/mm/plugin/fts/b/a:a	(Ljava/lang/String;Lcom/tencent/mm/storage/ad;[Ljava/lang/String;[BLjava/util/HashMap;)I
    //   1226: istore 8
    //   1228: iload_3
    //   1229: iload 8
    //   1231: iadd
    //   1232: istore_3
    //   1233: aload_0
    //   1234: aload_0
    //   1235: getfield 54	com/tencent/mm/plugin/fts/b/a$b:mFQ	I
    //   1238: iconst_1
    //   1239: iadd
    //   1240: putfield 54	com/tencent/mm/plugin/fts/b/a$b:mFQ	I
    //   1243: iload_3
    //   1244: istore 8
    //   1246: iload 8
    //   1248: istore_3
    //   1249: iload 8
    //   1251: bipush 50
    //   1253: if_icmplt -220 -> 1033
    //   1256: aload_0
    //   1257: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1260: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   1263: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   1266: aload_0
    //   1267: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1270: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   1273: invokevirtual 325	com/tencent/mm/plugin/fts/c/a:beginTransaction	()V
    //   1276: iconst_0
    //   1277: istore_3
    //   1278: goto -245 -> 1033
    //   1281: astore 7
    //   1283: ldc 101
    //   1285: aload 7
    //   1287: ldc_w 348
    //   1290: iconst_0
    //   1291: anewarray 76	java/lang/Object
    //   1294: invokestatic 352	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1297: aload_0
    //   1298: aload_0
    //   1299: getfield 62	com/tencent/mm/plugin/fts/b/a$b:mFU	I
    //   1302: iconst_1
    //   1303: iadd
    //   1304: putfield 62	com/tencent/mm/plugin/fts/b/a$b:mFU	I
    //   1307: iload_3
    //   1308: istore 8
    //   1310: goto -64 -> 1246
    //   1313: aload 6
    //   1315: invokeinterface 185 1 0
    //   1320: aload_0
    //   1321: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1324: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   1327: invokevirtual 266	com/tencent/mm/plugin/fts/c/a:commit	()V
    //   1330: aload_0
    //   1331: ldc_w 388
    //   1334: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   1337: invokestatic 200	java/lang/Thread:interrupted	()Z
    //   1340: ifeq +20 -> 1360
    //   1343: new 202	java/lang/InterruptedException
    //   1346: dup
    //   1347: invokespecial 203	java/lang/InterruptedException:<init>	()V
    //   1350: astore 7
    //   1352: ldc 99
    //   1354: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1357: aload 7
    //   1359: athrow
    //   1360: aload_0
    //   1361: aload_0
    //   1362: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   1365: invokevirtual 190	java/util/HashSet:size	()I
    //   1368: putfield 58	com/tencent/mm/plugin/fts/b/a$b:mFS	I
    //   1371: aload_0
    //   1372: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   1375: invokevirtual 237	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1378: astore 6
    //   1380: aload 6
    //   1382: invokeinterface 219 1 0
    //   1387: ifeq +53 -> 1440
    //   1390: aload 6
    //   1392: invokeinterface 223 1 0
    //   1397: checkcast 90	java/lang/String
    //   1400: astore 7
    //   1402: aload_0
    //   1403: getfield 31	com/tencent/mm/plugin/fts/b/a$b:mFK	Lcom/tencent/mm/plugin/fts/b/a;
    //   1406: invokestatic 123	com/tencent/mm/plugin/fts/b/a:a	(Lcom/tencent/mm/plugin/fts/b/a;)Lcom/tencent/mm/plugin/fts/c/a;
    //   1409: getstatic 129	com/tencent/mm/plugin/fts/a/c:mCk	[I
    //   1412: aload 7
    //   1414: invokevirtual 391	com/tencent/mm/plugin/fts/c/a:b	([ILjava/lang/String;)V
    //   1417: ldc_w 393
    //   1420: invokestatic 399	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   1423: checkcast 393	com/tencent/mm/plugin/fts/PluginFTS
    //   1426: invokevirtual 403	com/tencent/mm/plugin/fts/PluginFTS:getTopHitsLogic	()Lcom/tencent/mm/plugin/fts/b/e;
    //   1429: getstatic 129	com/tencent/mm/plugin/fts/a/c:mCk	[I
    //   1432: aload 7
    //   1434: invokevirtual 407	com/tencent/mm/plugin/fts/b/e:d	([ILjava/lang/String;)V
    //   1437: goto -57 -> 1380
    //   1440: aload_0
    //   1441: getfield 116	com/tencent/mm/plugin/fts/b/a$b:mFM	Ljava/util/HashSet;
    //   1444: invokevirtual 252	java/util/HashSet:clear	()V
    //   1447: aload_0
    //   1448: getfield 46	com/tencent/mm/plugin/fts/b/a$b:mFN	Ljava/util/HashMap;
    //   1451: invokevirtual 230	java/util/HashMap:clear	()V
    //   1454: aload_0
    //   1455: ldc_w 409
    //   1458: invokevirtual 114	com/tencent/mm/plugin/fts/b/a$b:Ng	(Ljava/lang/String;)V
    //   1461: ldc_w 393
    //   1464: invokestatic 399	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   1467: checkcast 393	com/tencent/mm/plugin/fts/PluginFTS
    //   1470: iconst_1
    //   1471: invokevirtual 413	com/tencent/mm/plugin/fts/PluginFTS:setFTSIndexReady	(Z)V
    //   1474: ldc 99
    //   1476: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1479: iconst_1
    //   1480: ireturn
    //   1481: astore 7
    //   1483: goto -200 -> 1283
    //   1486: astore 7
    //   1488: goto -205 -> 1283
    //
    // Exception table:
    //   from	to	target	type
    //   838	852	923	java/lang/Exception
    //   855	867	923	java/lang/Exception
    //   870	879	923	java/lang/Exception
    //   882	887	923	java/lang/Exception
    //   890	904	923	java/lang/Exception
    //   907	917	923	java/lang/Exception
    //   1164	1204	1281	java/lang/Exception
    //   1209	1228	1481	java/lang/Exception
    //   1233	1243	1486	java/lang/Exception
  }

  public final int getId()
  {
    return 1;
  }

  public final String getName()
  {
    return "BuildContactIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.b
 * JD-Core Version:    0.6.2
 */