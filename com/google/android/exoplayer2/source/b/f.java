package com.google.android.exoplayer2.source.b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.google.android.exoplayer2.metadata.id3.a;
import com.google.android.exoplayer2.source.a.d;
import com.google.android.exoplayer2.source.b.a.a.a;
import com.google.android.exoplayer2.source.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class f extends d
{
  private static final AtomicInteger biJ;
  private final s aYf;
  private final boolean aZs;
  private volatile boolean bhf;
  private e bhj;
  public final int biK;
  public final a.a biL;
  private final com.google.android.exoplayer2.h.f biM;
  private final i biN;
  private final boolean biO;
  private final String biP;
  private final e biQ;
  private final boolean biR;
  private final boolean biS;
  private final boolean biT;
  private final a biU;
  private final l biV;
  private int biW;
  private int biX;
  private boolean biY;
  private j biZ;
  private final List<Format> bit;
  volatile boolean bja;
  public final int uid;

  static
  {
    AppMethodBeat.i(125909);
    biJ = new AtomicInteger();
    AppMethodBeat.o(125909);
  }

  public f(com.google.android.exoplayer2.h.f paramf, i parami1, i parami2, a.a parama, List<Format> paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, int paramInt2, int paramInt3, boolean paramBoolean, s params, f paramf1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
  }

  public final void a(j paramj)
  {
    int i = 0;
    this.biZ = paramj;
    int j = this.uid;
    boolean bool = this.biR;
    paramj.bjt = j;
    k[] arrayOfk = paramj.bgO;
    int k = arrayOfk.length;
    for (int m = 0; m < k; m++)
      arrayOfk[m].bhG.bhE = j;
    if (bool)
    {
      paramj = paramj.bgO;
      j = paramj.length;
      for (m = i; m < j; m++)
        paramj[m].bhP = true;
    }
  }

  public final void se()
  {
    this.bhf = true;
  }

  public final boolean sf()
  {
    return this.bhf;
  }

  // ERROR //
  public final void sg()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc 188
    //   6: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: getfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   13: ifnonnull +94 -> 107
    //   16: aload_0
    //   17: getfield 122	com/google/android/exoplayer2/source/b/f:biT	Z
    //   20: ifne +87 -> 107
    //   23: ldc 190
    //   25: aload_0
    //   26: getfield 79	com/google/android/exoplayer2/source/b/f:biL	Lcom/google/android/exoplayer2/source/b/a/a$a;
    //   29: getfield 69	com/google/android/exoplayer2/source/b/a/a$a:aOv	Lcom/google/android/exoplayer2/Format;
    //   32: getfield 195	com/google/android/exoplayer2/Format:aOd	Ljava/lang/String;
    //   35: invokevirtual 199	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: ifne +27 -> 65
    //   41: aload_0
    //   42: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   45: ldc 201
    //   47: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   50: ifne +15 -> 65
    //   53: aload_0
    //   54: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   57: ldc 203
    //   59: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   62: ifeq +503 -> 565
    //   65: new 205	com/google/android/exoplayer2/source/b/l
    //   68: dup
    //   69: aload_0
    //   70: getfield 208	com/google/android/exoplayer2/source/b/f:bic	Lcom/google/android/exoplayer2/Format;
    //   73: getfield 211	com/google/android/exoplayer2/Format:aOt	Ljava/lang/String;
    //   76: aload_0
    //   77: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   80: invokespecial 214	com/google/android/exoplayer2/source/b/l:<init>	(Ljava/lang/String;Lcom/google/android/exoplayer2/i/s;)V
    //   83: astore_3
    //   84: iconst_1
    //   85: istore 4
    //   87: iload 4
    //   89: ifeq +13 -> 102
    //   92: aload_3
    //   93: aload_0
    //   94: getfield 158	com/google/android/exoplayer2/source/b/f:biZ	Lcom/google/android/exoplayer2/source/b/j;
    //   97: invokeinterface 219 2 0
    //   102: aload_0
    //   103: aload_3
    //   104: putfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   107: aload_0
    //   108: getfield 130	com/google/android/exoplayer2/source/b/f:biQ	Lcom/google/android/exoplayer2/c/e;
    //   111: aload_0
    //   112: getfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   115: if_acmpeq +17 -> 132
    //   118: aload_0
    //   119: getfield 221	com/google/android/exoplayer2/source/b/f:biY	Z
    //   122: ifne +10 -> 132
    //   125: aload_0
    //   126: getfield 77	com/google/android/exoplayer2/source/b/f:biN	Lcom/google/android/exoplayer2/h/i;
    //   129: ifnonnull +754 -> 883
    //   132: aload_0
    //   133: getfield 184	com/google/android/exoplayer2/source/b/f:bhf	Z
    //   136: ifne +1124 -> 1260
    //   139: aload_0
    //   140: getfield 92	com/google/android/exoplayer2/source/b/f:aZs	Z
    //   143: ifeq +897 -> 1040
    //   146: aload_0
    //   147: getfield 224	com/google/android/exoplayer2/source/b/f:bib	Lcom/google/android/exoplayer2/h/i;
    //   150: astore_3
    //   151: aload_0
    //   152: getfield 226	com/google/android/exoplayer2/source/b/f:biX	I
    //   155: ifeq +879 -> 1034
    //   158: iconst_1
    //   159: istore 4
    //   161: aload_0
    //   162: getfield 83	com/google/android/exoplayer2/source/b/f:biO	Z
    //   165: ifne +894 -> 1059
    //   168: aload_0
    //   169: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   172: invokevirtual 231	com/google/android/exoplayer2/i/s:tR	()V
    //   175: new 233	com/google/android/exoplayer2/c/b
    //   178: astore 5
    //   180: aload 5
    //   182: aload_0
    //   183: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   186: aload_3
    //   187: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   190: aload_0
    //   191: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   194: aload_3
    //   195: invokeinterface 242 2 0
    //   200: invokespecial 245	com/google/android/exoplayer2/c/b:<init>	(Lcom/google/android/exoplayer2/h/f;JJ)V
    //   203: aload_0
    //   204: getfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   207: ifnonnull +307 -> 514
    //   210: aload 5
    //   212: invokeinterface 250 1 0
    //   217: aload 5
    //   219: aload_0
    //   220: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   223: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   226: iconst_0
    //   227: bipush 10
    //   229: iconst_1
    //   230: invokeinterface 258 5 0
    //   235: ifeq +858 -> 1093
    //   238: aload_0
    //   239: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   242: bipush 10
    //   244: invokevirtual 261	com/google/android/exoplayer2/i/l:reset	(I)V
    //   247: aload_0
    //   248: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   251: invokevirtual 264	com/google/android/exoplayer2/i/l:tD	()I
    //   254: getstatic 267	com/google/android/exoplayer2/metadata/id3/a:bbg	I
    //   257: if_icmpne +836 -> 1093
    //   260: aload_0
    //   261: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   264: iconst_3
    //   265: invokevirtual 270	com/google/android/exoplayer2/i/l:eM	(I)V
    //   268: aload_0
    //   269: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   272: invokevirtual 273	com/google/android/exoplayer2/i/l:tH	()I
    //   275: istore 6
    //   277: iload 6
    //   279: bipush 10
    //   281: iadd
    //   282: istore 7
    //   284: iload 7
    //   286: aload_0
    //   287: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   290: invokevirtual 276	com/google/android/exoplayer2/i/l:capacity	()I
    //   293: if_icmple +35 -> 328
    //   296: aload_0
    //   297: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   300: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   303: astore_3
    //   304: aload_0
    //   305: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   308: iload 7
    //   310: invokevirtual 261	com/google/android/exoplayer2/i/l:reset	(I)V
    //   313: aload_3
    //   314: iconst_0
    //   315: aload_0
    //   316: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   319: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   322: iconst_0
    //   323: bipush 10
    //   325: invokestatic 282	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   328: aload 5
    //   330: aload_0
    //   331: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   334: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   337: bipush 10
    //   339: iload 6
    //   341: iconst_1
    //   342: invokeinterface 258 5 0
    //   347: ifeq +746 -> 1093
    //   350: aload_0
    //   351: getfield 124	com/google/android/exoplayer2/source/b/f:biU	Lcom/google/android/exoplayer2/metadata/id3/a;
    //   354: aload_0
    //   355: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   358: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   361: iload 6
    //   363: invokevirtual 286	com/google/android/exoplayer2/metadata/id3/a:d	([BI)Lcom/google/android/exoplayer2/metadata/Metadata;
    //   366: astore_3
    //   367: aload_3
    //   368: ifnull +725 -> 1093
    //   371: aload_3
    //   372: getfield 292	com/google/android/exoplayer2/metadata/Metadata:beW	[Lcom/google/android/exoplayer2/metadata/Metadata$Entry;
    //   375: arraylength
    //   376: istore 7
    //   378: iconst_0
    //   379: istore 6
    //   381: iload 6
    //   383: iload 7
    //   385: if_icmpge +708 -> 1093
    //   388: aload_3
    //   389: getfield 292	com/google/android/exoplayer2/metadata/Metadata:beW	[Lcom/google/android/exoplayer2/metadata/Metadata$Entry;
    //   392: iload 6
    //   394: aaload
    //   395: astore_1
    //   396: aload_1
    //   397: instanceof 294
    //   400: ifeq +687 -> 1087
    //   403: aload_1
    //   404: checkcast 294	com/google/android/exoplayer2/metadata/id3/PrivFrame
    //   407: astore_1
    //   408: ldc_w 296
    //   411: aload_1
    //   412: getfield 299	com/google/android/exoplayer2/metadata/id3/PrivFrame:bfz	Ljava/lang/String;
    //   415: invokevirtual 199	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   418: ifeq +669 -> 1087
    //   421: aload_1
    //   422: getfield 302	com/google/android/exoplayer2/metadata/id3/PrivFrame:bfA	[B
    //   425: iconst_0
    //   426: aload_0
    //   427: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   430: getfield 254	com/google/android/exoplayer2/i/l:data	[B
    //   433: iconst_0
    //   434: bipush 8
    //   436: invokestatic 282	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   439: aload_0
    //   440: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   443: bipush 8
    //   445: invokevirtual 261	com/google/android/exoplayer2/i/l:reset	(I)V
    //   448: aload_0
    //   449: getfield 126	com/google/android/exoplayer2/source/b/f:biV	Lcom/google/android/exoplayer2/i/l;
    //   452: invokevirtual 306	com/google/android/exoplayer2/i/l:readLong	()J
    //   455: lstore 8
    //   457: lload 8
    //   459: ldc2_w 307
    //   462: lcmp
    //   463: ifeq +638 -> 1101
    //   466: aload_0
    //   467: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   470: lload 8
    //   472: invokevirtual 312	com/google/android/exoplayer2/i/s:ao	(J)J
    //   475: lstore 8
    //   477: aload_0
    //   478: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   481: ldc 108
    //   483: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   486: ifeq +624 -> 1110
    //   489: new 314	com/google/android/exoplayer2/c/f/c
    //   492: astore_3
    //   493: aload_3
    //   494: lload 8
    //   496: invokespecial 317	com/google/android/exoplayer2/c/f/c:<init>	(J)V
    //   499: aload_3
    //   500: aload_0
    //   501: getfield 158	com/google/android/exoplayer2/source/b/f:biZ	Lcom/google/android/exoplayer2/source/b/j;
    //   504: invokeinterface 219 2 0
    //   509: aload_0
    //   510: aload_3
    //   511: putfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   514: iload_2
    //   515: istore 6
    //   517: iload 4
    //   519: ifeq +17 -> 536
    //   522: aload 5
    //   524: aload_0
    //   525: getfield 226	com/google/android/exoplayer2/source/b/f:biX	I
    //   528: invokeinterface 320 2 0
    //   533: iload_2
    //   534: istore 6
    //   536: iload 6
    //   538: ifne +690 -> 1228
    //   541: aload_0
    //   542: getfield 184	com/google/android/exoplayer2/source/b/f:bhf	Z
    //   545: ifne +683 -> 1228
    //   548: aload_0
    //   549: getfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   552: aload 5
    //   554: aconst_null
    //   555: invokeinterface 323 3 0
    //   560: istore 6
    //   562: goto -26 -> 536
    //   565: aload_0
    //   566: getfield 134	com/google/android/exoplayer2/source/b/f:biS	Z
    //   569: ifne +14 -> 583
    //   572: aload_0
    //   573: getfield 130	com/google/android/exoplayer2/source/b/f:biQ	Lcom/google/android/exoplayer2/c/e;
    //   576: astore_3
    //   577: iconst_0
    //   578: istore 4
    //   580: goto -493 -> 87
    //   583: aload_0
    //   584: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   587: ldc_w 325
    //   590: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   593: ifne +25 -> 618
    //   596: aload_0
    //   597: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   600: ldc_w 327
    //   603: aload_0
    //   604: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   607: invokevirtual 330	java/lang/String:length	()I
    //   610: iconst_4
    //   611: isub
    //   612: invokevirtual 334	java/lang/String:startsWith	(Ljava/lang/String;I)Z
    //   615: ifeq +22 -> 637
    //   618: new 336	com/google/android/exoplayer2/c/d/e
    //   621: dup
    //   622: iconst_0
    //   623: aload_0
    //   624: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   627: invokespecial 339	com/google/android/exoplayer2/c/d/e:<init>	(ILcom/google/android/exoplayer2/i/s;)V
    //   630: astore_3
    //   631: iconst_1
    //   632: istore 4
    //   634: goto -547 -> 87
    //   637: bipush 16
    //   639: istore 4
    //   641: aload_0
    //   642: getfield 81	com/google/android/exoplayer2/source/b/f:bit	Ljava/util/List;
    //   645: astore_3
    //   646: aload_3
    //   647: ifnull +211 -> 858
    //   650: bipush 48
    //   652: istore 4
    //   654: aload_0
    //   655: getfield 208	com/google/android/exoplayer2/source/b/f:bic	Lcom/google/android/exoplayer2/Format;
    //   658: getfield 342	com/google/android/exoplayer2/Format:aOa	Ljava/lang/String;
    //   661: astore 10
    //   663: iload 4
    //   665: istore 7
    //   667: aload 10
    //   669: invokestatic 348	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   672: ifne +157 -> 829
    //   675: aload 10
    //   677: ifnull +194 -> 871
    //   680: aload 10
    //   682: ldc_w 350
    //   685: invokevirtual 354	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   688: astore 11
    //   690: aload 11
    //   692: arraylength
    //   693: istore 7
    //   695: iconst_0
    //   696: istore 6
    //   698: iload 6
    //   700: iload 7
    //   702: if_icmpge +169 -> 871
    //   705: aload 11
    //   707: iload 6
    //   709: aaload
    //   710: invokestatic 360	com/google/android/exoplayer2/i/i:aK	(Ljava/lang/String;)Ljava/lang/String;
    //   713: astore 5
    //   715: aload 5
    //   717: ifnull +148 -> 865
    //   720: aload 5
    //   722: invokestatic 363	com/google/android/exoplayer2/i/i:aH	(Ljava/lang/String;)Z
    //   725: ifeq +140 -> 865
    //   728: iload 4
    //   730: istore 6
    //   732: ldc_w 365
    //   735: aload 5
    //   737: invokevirtual 199	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   740: ifne +9 -> 749
    //   743: iload 4
    //   745: iconst_2
    //   746: ior
    //   747: istore 6
    //   749: aload_1
    //   750: astore 5
    //   752: aload 10
    //   754: ifnull +54 -> 808
    //   757: aload 10
    //   759: ldc_w 350
    //   762: invokevirtual 354	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   765: astore 10
    //   767: aload 10
    //   769: arraylength
    //   770: istore 7
    //   772: iconst_0
    //   773: istore 4
    //   775: aload_1
    //   776: astore 5
    //   778: iload 4
    //   780: iload 7
    //   782: if_icmpge +26 -> 808
    //   785: aload 10
    //   787: iload 4
    //   789: aaload
    //   790: invokestatic 360	com/google/android/exoplayer2/i/i:aK	(Ljava/lang/String;)Ljava/lang/String;
    //   793: astore 5
    //   795: aload 5
    //   797: ifnull +80 -> 877
    //   800: aload 5
    //   802: invokestatic 368	com/google/android/exoplayer2/i/i:aI	(Ljava/lang/String;)Z
    //   805: ifeq +72 -> 877
    //   808: iload 6
    //   810: istore 7
    //   812: ldc_w 370
    //   815: aload 5
    //   817: invokevirtual 199	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   820: ifne +9 -> 829
    //   823: iload 6
    //   825: iconst_4
    //   826: ior
    //   827: istore 7
    //   829: new 372	com/google/android/exoplayer2/c/f/u
    //   832: dup
    //   833: iconst_2
    //   834: aload_0
    //   835: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   838: new 374	com/google/android/exoplayer2/c/f/e
    //   841: dup
    //   842: iload 7
    //   844: aload_3
    //   845: invokespecial 377	com/google/android/exoplayer2/c/f/e:<init>	(ILjava/util/List;)V
    //   848: invokespecial 380	com/google/android/exoplayer2/c/f/u:<init>	(ILcom/google/android/exoplayer2/i/s;Lcom/google/android/exoplayer2/c/f/v$c;)V
    //   851: astore_3
    //   852: iconst_1
    //   853: istore 4
    //   855: goto -768 -> 87
    //   858: invokestatic 386	java/util/Collections:emptyList	()Ljava/util/List;
    //   861: astore_3
    //   862: goto -208 -> 654
    //   865: iinc 6 1
    //   868: goto -170 -> 698
    //   871: aconst_null
    //   872: astore 5
    //   874: goto -146 -> 728
    //   877: iinc 4 1
    //   880: goto -105 -> 775
    //   883: aload_0
    //   884: getfield 77	com/google/android/exoplayer2/source/b/f:biN	Lcom/google/android/exoplayer2/h/i;
    //   887: aload_0
    //   888: getfield 388	com/google/android/exoplayer2/source/b/f:biW	I
    //   891: i2l
    //   892: invokevirtual 392	com/google/android/exoplayer2/h/i:am	(J)Lcom/google/android/exoplayer2/h/i;
    //   895: astore 5
    //   897: new 233	com/google/android/exoplayer2/c/b
    //   900: astore_3
    //   901: aload_3
    //   902: aload_0
    //   903: getfield 136	com/google/android/exoplayer2/source/b/f:biM	Lcom/google/android/exoplayer2/h/f;
    //   906: aload 5
    //   908: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   911: aload_0
    //   912: getfield 136	com/google/android/exoplayer2/source/b/f:biM	Lcom/google/android/exoplayer2/h/f;
    //   915: aload 5
    //   917: invokeinterface 242 2 0
    //   922: invokespecial 245	com/google/android/exoplayer2/c/b:<init>	(Lcom/google/android/exoplayer2/h/f;JJ)V
    //   925: iconst_0
    //   926: istore 4
    //   928: iload 4
    //   930: ifne +26 -> 956
    //   933: aload_0
    //   934: getfield 184	com/google/android/exoplayer2/source/b/f:bhf	Z
    //   937: ifne +19 -> 956
    //   940: aload_0
    //   941: getfield 128	com/google/android/exoplayer2/source/b/f:bhj	Lcom/google/android/exoplayer2/c/e;
    //   944: aload_3
    //   945: aconst_null
    //   946: invokeinterface 323 3 0
    //   951: istore 4
    //   953: goto -25 -> 928
    //   956: aload_0
    //   957: aload_3
    //   958: invokeinterface 395 1 0
    //   963: aload_0
    //   964: getfield 77	com/google/android/exoplayer2/source/b/f:biN	Lcom/google/android/exoplayer2/h/i;
    //   967: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   970: lsub
    //   971: l2i
    //   972: putfield 388	com/google/android/exoplayer2/source/b/f:biW	I
    //   975: aload_0
    //   976: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   979: invokestatic 400	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   982: aload_0
    //   983: iconst_1
    //   984: putfield 221	com/google/android/exoplayer2/source/b/f:biY	Z
    //   987: goto -855 -> 132
    //   990: astore 5
    //   992: aload_0
    //   993: aload_3
    //   994: invokeinterface 395 1 0
    //   999: aload_0
    //   1000: getfield 77	com/google/android/exoplayer2/source/b/f:biN	Lcom/google/android/exoplayer2/h/i;
    //   1003: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   1006: lsub
    //   1007: l2i
    //   1008: putfield 388	com/google/android/exoplayer2/source/b/f:biW	I
    //   1011: ldc 188
    //   1013: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1016: aload 5
    //   1018: athrow
    //   1019: astore_3
    //   1020: aload_0
    //   1021: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   1024: invokestatic 400	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   1027: ldc 188
    //   1029: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1032: aload_3
    //   1033: athrow
    //   1034: iconst_0
    //   1035: istore 4
    //   1037: goto -876 -> 161
    //   1040: aload_0
    //   1041: getfield 224	com/google/android/exoplayer2/source/b/f:bib	Lcom/google/android/exoplayer2/h/i;
    //   1044: aload_0
    //   1045: getfield 226	com/google/android/exoplayer2/source/b/f:biX	I
    //   1048: i2l
    //   1049: invokevirtual 392	com/google/android/exoplayer2/h/i:am	(J)Lcom/google/android/exoplayer2/h/i;
    //   1052: astore_3
    //   1053: iconst_0
    //   1054: istore 4
    //   1056: goto -895 -> 161
    //   1059: aload_0
    //   1060: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   1063: getfield 403	com/google/android/exoplayer2/i/s:bbh	J
    //   1066: ldc2_w 404
    //   1069: lcmp
    //   1070: ifne -895 -> 175
    //   1073: aload_0
    //   1074: getfield 85	com/google/android/exoplayer2/source/b/f:aYf	Lcom/google/android/exoplayer2/i/s;
    //   1077: aload_0
    //   1078: getfield 408	com/google/android/exoplayer2/source/b/f:bif	J
    //   1081: invokevirtual 411	com/google/android/exoplayer2/i/s:an	(J)V
    //   1084: goto -909 -> 175
    //   1087: iinc 6 1
    //   1090: goto -709 -> 381
    //   1093: ldc2_w 307
    //   1096: lstore 8
    //   1098: goto -641 -> 457
    //   1101: aload_0
    //   1102: getfield 408	com/google/android/exoplayer2/source/b/f:bif	J
    //   1105: lstore 8
    //   1107: goto -630 -> 477
    //   1110: aload_0
    //   1111: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   1114: ldc 116
    //   1116: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1119: ifne +15 -> 1134
    //   1122: aload_0
    //   1123: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   1126: ldc 118
    //   1128: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1131: ifeq +31 -> 1162
    //   1134: new 413	com/google/android/exoplayer2/c/f/a
    //   1137: dup
    //   1138: lload 8
    //   1140: invokespecial 414	com/google/android/exoplayer2/c/f/a:<init>	(J)V
    //   1143: astore_3
    //   1144: goto -645 -> 499
    //   1147: astore_3
    //   1148: aload_0
    //   1149: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   1152: invokestatic 400	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   1155: ldc 188
    //   1157: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1160: aload_3
    //   1161: athrow
    //   1162: aload_0
    //   1163: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   1166: ldc 120
    //   1168: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1171: ifeq +17 -> 1188
    //   1174: new 416	com/google/android/exoplayer2/c/c/b
    //   1177: dup
    //   1178: iconst_0
    //   1179: lload 8
    //   1181: invokespecial 419	com/google/android/exoplayer2/c/c/b:<init>	(IJ)V
    //   1184: astore_3
    //   1185: goto -686 -> 499
    //   1188: new 421	java/lang/IllegalArgumentException
    //   1191: astore 5
    //   1193: new 423	java/lang/StringBuilder
    //   1196: astore_3
    //   1197: aload_3
    //   1198: ldc_w 425
    //   1201: invokespecial 428	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1204: aload 5
    //   1206: aload_3
    //   1207: aload_0
    //   1208: getfield 106	com/google/android/exoplayer2/source/b/f:biP	Ljava/lang/String;
    //   1211: invokevirtual 432	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1214: invokevirtual 435	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1217: invokespecial 436	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   1220: ldc 188
    //   1222: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1225: aload 5
    //   1227: athrow
    //   1228: aload_0
    //   1229: aload 5
    //   1231: invokeinterface 395 1 0
    //   1236: aload_0
    //   1237: getfield 224	com/google/android/exoplayer2/source/b/f:bib	Lcom/google/android/exoplayer2/h/i;
    //   1240: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   1243: lsub
    //   1244: l2i
    //   1245: putfield 226	com/google/android/exoplayer2/source/b/f:biX	I
    //   1248: aload_0
    //   1249: getfield 88	com/google/android/exoplayer2/source/b/f:aSF	Lcom/google/android/exoplayer2/h/f;
    //   1252: invokestatic 400	com/google/android/exoplayer2/i/v:a	(Lcom/google/android/exoplayer2/h/f;)V
    //   1255: aload_0
    //   1256: iconst_1
    //   1257: putfield 438	com/google/android/exoplayer2/source/b/f:bja	Z
    //   1260: ldc 188
    //   1262: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1265: return
    //   1266: astore_3
    //   1267: aload_0
    //   1268: aload 5
    //   1270: invokeinterface 395 1 0
    //   1275: aload_0
    //   1276: getfield 224	com/google/android/exoplayer2/source/b/f:bib	Lcom/google/android/exoplayer2/h/i;
    //   1279: getfield 237	com/google/android/exoplayer2/h/i:bpQ	J
    //   1282: lsub
    //   1283: l2i
    //   1284: putfield 226	com/google/android/exoplayer2/source/b/f:biX	I
    //   1287: ldc 188
    //   1289: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1292: aload_3
    //   1293: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   933	953	990	finally
    //   897	925	1019	finally
    //   956	975	1019	finally
    //   992	1019	1019	finally
    //   175	277	1147	finally
    //   284	328	1147	finally
    //   328	367	1147	finally
    //   371	378	1147	finally
    //   388	457	1147	finally
    //   466	477	1147	finally
    //   477	499	1147	finally
    //   499	514	1147	finally
    //   522	533	1147	finally
    //   1101	1107	1147	finally
    //   1110	1134	1147	finally
    //   1134	1144	1147	finally
    //   1162	1185	1147	finally
    //   1188	1228	1147	finally
    //   1228	1248	1147	finally
    //   1267	1294	1147	finally
    //   541	562	1266	finally
  }

  public final long ss()
  {
    return this.biX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.f
 * JD-Core Version:    0.6.2
 */