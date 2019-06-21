package a.i.b.a.c.e.b;

import a.i.b.a.c.e.a.w;
import a.i.b.a.c.e.a.y;
import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.n;
import a.i.b.a.c.g.o;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import a.i.b.a.c.g.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class a$a extends i
  implements a.b
{
  public static s<a> BsC;
  private static final a Bxk;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public List<a.i.b.a.c.e.a.a> BvA;
  public List<a.c> Bxl;
  public List<a.c> Bxm;
  public o Bxn;
  public a.y Bxo;
  public a.w Bxp;

  static
  {
    AppMethodBeat.i(121131);
    BsC = new a.a.1();
    a locala = new a();
    Bxk = locala;
    locala.ecA();
    AppMethodBeat.o(121131);
  }

  private a$a()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$a(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 79
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 64	a/i/b/a/c/e/b/a$a:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 66	a/i/b/a/c/e/b/a$a:BsH	I
    //   20: aload_0
    //   21: invokespecial 57	a/i/b/a/c/e/b/a$a:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 83	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 89	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +915 -> 959
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 95	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+68->132, 0:+96->160, 10:+102->166, 18:+324->388, 26:+458->522, 34:+567->631, 42:+692->756, 50:+817->881
    //   133: istore 7
    //   135: iload_3
    //   136: istore 8
    //   138: iload_3
    //   139: istore 9
    //   141: aload_0
    //   142: aload_1
    //   143: aload 5
    //   145: aload_2
    //   146: iload 10
    //   148: invokevirtual 98	a/i/b/a/c/e/b/a$a:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   151: ifne +1001 -> 1152
    //   154: iconst_1
    //   155: istore 6
    //   157: goto -115 -> 42
    //   160: iconst_1
    //   161: istore 6
    //   163: goto -121 -> 42
    //   166: iload_3
    //   167: istore 10
    //   169: iload_3
    //   170: iconst_1
    //   171: iand
    //   172: iconst_1
    //   173: if_icmpeq +51 -> 224
    //   176: iload_3
    //   177: istore 7
    //   179: iload_3
    //   180: istore 8
    //   182: iload_3
    //   183: istore 9
    //   185: new 100	java/util/ArrayList
    //   188: astore 11
    //   190: iload_3
    //   191: istore 7
    //   193: iload_3
    //   194: istore 8
    //   196: iload_3
    //   197: istore 9
    //   199: aload 11
    //   201: invokespecial 101	java/util/ArrayList:<init>	()V
    //   204: iload_3
    //   205: istore 7
    //   207: iload_3
    //   208: istore 8
    //   210: iload_3
    //   211: istore 9
    //   213: aload_0
    //   214: aload 11
    //   216: putfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   219: iload_3
    //   220: iconst_1
    //   221: ior
    //   222: istore 10
    //   224: iload 10
    //   226: istore 7
    //   228: iload 10
    //   230: istore 8
    //   232: iload 10
    //   234: istore 9
    //   236: aload_0
    //   237: getfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   240: aload_1
    //   241: getstatic 106	a/i/b/a/c/e/b/a$c:BsC	La/i/b/a/c/g/s;
    //   244: aload_2
    //   245: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   248: invokeinterface 115 2 0
    //   253: pop
    //   254: iload 10
    //   256: istore_3
    //   257: goto -215 -> 42
    //   260: astore_1
    //   261: iload 7
    //   263: istore 8
    //   265: iload 8
    //   267: istore_3
    //   268: aload_1
    //   269: aload_0
    //   270: putfield 119	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   273: iload 8
    //   275: istore_3
    //   276: ldc 79
    //   278: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: iload 8
    //   283: istore_3
    //   284: aload_1
    //   285: athrow
    //   286: astore_1
    //   287: iload_3
    //   288: iconst_1
    //   289: iand
    //   290: iconst_1
    //   291: if_icmpne +14 -> 305
    //   294: aload_0
    //   295: aload_0
    //   296: getfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   299: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   302: putfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   305: iload_3
    //   306: iconst_2
    //   307: iand
    //   308: iconst_2
    //   309: if_icmpne +14 -> 323
    //   312: aload_0
    //   313: aload_0
    //   314: getfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   317: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   320: putfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   323: iload_3
    //   324: iconst_4
    //   325: iand
    //   326: iconst_4
    //   327: if_icmpne +16 -> 343
    //   330: aload_0
    //   331: aload_0
    //   332: getfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   335: invokeinterface 135 1 0
    //   340: putfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   343: iload_3
    //   344: bipush 32
    //   346: iand
    //   347: bipush 32
    //   349: if_icmpne +14 -> 363
    //   352: aload_0
    //   353: aload_0
    //   354: getfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   357: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   360: putfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   363: aload 5
    //   365: invokevirtual 140	a/i/b/a/c/g/f:flush	()V
    //   368: aload_0
    //   369: aload 4
    //   371: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   374: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   377: aload_0
    //   378: invokevirtual 149	a/i/b/a/c/e/b/a$a:eio	()V
    //   381: ldc 79
    //   383: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   386: aload_1
    //   387: athrow
    //   388: iload_3
    //   389: istore 10
    //   391: iload_3
    //   392: iconst_2
    //   393: iand
    //   394: iconst_2
    //   395: if_icmpeq +51 -> 446
    //   398: iload_3
    //   399: istore 7
    //   401: iload_3
    //   402: istore 8
    //   404: iload_3
    //   405: istore 9
    //   407: new 100	java/util/ArrayList
    //   410: astore 11
    //   412: iload_3
    //   413: istore 7
    //   415: iload_3
    //   416: istore 8
    //   418: iload_3
    //   419: istore 9
    //   421: aload 11
    //   423: invokespecial 101	java/util/ArrayList:<init>	()V
    //   426: iload_3
    //   427: istore 7
    //   429: iload_3
    //   430: istore 8
    //   432: iload_3
    //   433: istore 9
    //   435: aload_0
    //   436: aload 11
    //   438: putfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   441: iload_3
    //   442: iconst_2
    //   443: ior
    //   444: istore 10
    //   446: iload 10
    //   448: istore 7
    //   450: iload 10
    //   452: istore 8
    //   454: iload 10
    //   456: istore 9
    //   458: aload_0
    //   459: getfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   462: aload_1
    //   463: getstatic 106	a/i/b/a/c/e/b/a$c:BsC	La/i/b/a/c/g/s;
    //   466: aload_2
    //   467: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   470: invokeinterface 115 2 0
    //   475: pop
    //   476: iload 10
    //   478: istore_3
    //   479: goto -437 -> 42
    //   482: astore_1
    //   483: iload 8
    //   485: istore_3
    //   486: new 76	a/i/b/a/c/g/k
    //   489: astore_2
    //   490: iload 8
    //   492: istore_3
    //   493: aload_2
    //   494: aload_1
    //   495: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
    //   498: invokespecial 156	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   501: iload 8
    //   503: istore_3
    //   504: aload_2
    //   505: aload_0
    //   506: putfield 119	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   509: iload 8
    //   511: istore_3
    //   512: ldc 79
    //   514: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   517: iload 8
    //   519: istore_3
    //   520: aload_2
    //   521: athrow
    //   522: iload_3
    //   523: istore 7
    //   525: iload_3
    //   526: istore 8
    //   528: iload_3
    //   529: istore 9
    //   531: aload_1
    //   532: invokevirtual 159	a/i/b/a/c/g/e:ehY	()La/i/b/a/c/g/d;
    //   535: astore 12
    //   537: iload_3
    //   538: istore 10
    //   540: iload_3
    //   541: iconst_4
    //   542: iand
    //   543: iconst_4
    //   544: if_icmpeq +51 -> 595
    //   547: iload_3
    //   548: istore 7
    //   550: iload_3
    //   551: istore 8
    //   553: iload_3
    //   554: istore 9
    //   556: new 161	a/i/b/a/c/g/n
    //   559: astore 11
    //   561: iload_3
    //   562: istore 7
    //   564: iload_3
    //   565: istore 8
    //   567: iload_3
    //   568: istore 9
    //   570: aload 11
    //   572: invokespecial 162	a/i/b/a/c/g/n:<init>	()V
    //   575: iload_3
    //   576: istore 7
    //   578: iload_3
    //   579: istore 8
    //   581: iload_3
    //   582: istore 9
    //   584: aload_0
    //   585: aload 11
    //   587: putfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   590: iload_3
    //   591: iconst_4
    //   592: ior
    //   593: istore 10
    //   595: iload 10
    //   597: istore 7
    //   599: iload 10
    //   601: istore 8
    //   603: iload 10
    //   605: istore 9
    //   607: aload_0
    //   608: getfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   611: aload 12
    //   613: invokeinterface 165 2 0
    //   618: iload 10
    //   620: istore_3
    //   621: goto -579 -> 42
    //   624: astore_1
    //   625: iload 9
    //   627: istore_3
    //   628: goto -341 -> 287
    //   631: iload_3
    //   632: istore 7
    //   634: iload_3
    //   635: istore 8
    //   637: iload_3
    //   638: istore 9
    //   640: aload_0
    //   641: getfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   644: iconst_1
    //   645: iand
    //   646: iconst_1
    //   647: if_icmpne +499 -> 1146
    //   650: iload_3
    //   651: istore 7
    //   653: iload_3
    //   654: istore 8
    //   656: iload_3
    //   657: istore 9
    //   659: aload_0
    //   660: getfield 169	a/i/b/a/c/e/b/a$a:Bxo	La/i/b/a/c/e/a$y;
    //   663: invokevirtual 175	a/i/b/a/c/e/a$y:eeS	()La/i/b/a/c/e/a$y$a;
    //   666: astore 11
    //   668: iload_3
    //   669: istore 7
    //   671: iload_3
    //   672: istore 8
    //   674: iload_3
    //   675: istore 9
    //   677: aload_0
    //   678: aload_1
    //   679: getstatic 176	a/i/b/a/c/e/a$y:BsC	La/i/b/a/c/g/s;
    //   682: aload_2
    //   683: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   686: checkcast 171	a/i/b/a/c/e/a$y
    //   689: putfield 169	a/i/b/a/c/e/b/a$a:Bxo	La/i/b/a/c/e/a$y;
    //   692: aload 11
    //   694: ifnull +40 -> 734
    //   697: iload_3
    //   698: istore 7
    //   700: iload_3
    //   701: istore 8
    //   703: iload_3
    //   704: istore 9
    //   706: aload 11
    //   708: aload_0
    //   709: getfield 169	a/i/b/a/c/e/b/a$a:Bxo	La/i/b/a/c/e/a$y;
    //   712: invokevirtual 182	a/i/b/a/c/e/a$y$a:d	(La/i/b/a/c/e/a$y;)La/i/b/a/c/e/a$y$a;
    //   715: pop
    //   716: iload_3
    //   717: istore 7
    //   719: iload_3
    //   720: istore 8
    //   722: iload_3
    //   723: istore 9
    //   725: aload_0
    //   726: aload 11
    //   728: invokevirtual 186	a/i/b/a/c/e/a$y$a:eeU	()La/i/b/a/c/e/a$y;
    //   731: putfield 169	a/i/b/a/c/e/b/a$a:Bxo	La/i/b/a/c/e/a$y;
    //   734: iload_3
    //   735: istore 7
    //   737: iload_3
    //   738: istore 8
    //   740: iload_3
    //   741: istore 9
    //   743: aload_0
    //   744: aload_0
    //   745: getfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   748: iconst_1
    //   749: ior
    //   750: putfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   753: goto -711 -> 42
    //   756: iload_3
    //   757: istore 7
    //   759: iload_3
    //   760: istore 8
    //   762: iload_3
    //   763: istore 9
    //   765: aload_0
    //   766: getfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   769: iconst_2
    //   770: iand
    //   771: iconst_2
    //   772: if_icmpne +368 -> 1140
    //   775: iload_3
    //   776: istore 7
    //   778: iload_3
    //   779: istore 8
    //   781: iload_3
    //   782: istore 9
    //   784: aload_0
    //   785: getfield 188	a/i/b/a/c/e/b/a$a:Bxp	La/i/b/a/c/e/a$w;
    //   788: invokevirtual 194	a/i/b/a/c/e/a$w:eeG	()La/i/b/a/c/e/a$w$a;
    //   791: astore 11
    //   793: iload_3
    //   794: istore 7
    //   796: iload_3
    //   797: istore 8
    //   799: iload_3
    //   800: istore 9
    //   802: aload_0
    //   803: aload_1
    //   804: getstatic 195	a/i/b/a/c/e/a$w:BsC	La/i/b/a/c/g/s;
    //   807: aload_2
    //   808: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   811: checkcast 190	a/i/b/a/c/e/a$w
    //   814: putfield 188	a/i/b/a/c/e/b/a$a:Bxp	La/i/b/a/c/e/a$w;
    //   817: aload 11
    //   819: ifnull +40 -> 859
    //   822: iload_3
    //   823: istore 7
    //   825: iload_3
    //   826: istore 8
    //   828: iload_3
    //   829: istore 9
    //   831: aload 11
    //   833: aload_0
    //   834: getfield 188	a/i/b/a/c/e/b/a$a:Bxp	La/i/b/a/c/e/a$w;
    //   837: invokevirtual 200	a/i/b/a/c/e/a$w$a:d	(La/i/b/a/c/e/a$w;)La/i/b/a/c/e/a$w$a;
    //   840: pop
    //   841: iload_3
    //   842: istore 7
    //   844: iload_3
    //   845: istore 8
    //   847: iload_3
    //   848: istore 9
    //   850: aload_0
    //   851: aload 11
    //   853: invokevirtual 204	a/i/b/a/c/e/a$w$a:eeI	()La/i/b/a/c/e/a$w;
    //   856: putfield 188	a/i/b/a/c/e/b/a$a:Bxp	La/i/b/a/c/e/a$w;
    //   859: iload_3
    //   860: istore 7
    //   862: iload_3
    //   863: istore 8
    //   865: iload_3
    //   866: istore 9
    //   868: aload_0
    //   869: aload_0
    //   870: getfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   873: iconst_2
    //   874: ior
    //   875: putfield 167	a/i/b/a/c/e/b/a$a:BsD	I
    //   878: goto -836 -> 42
    //   881: iload_3
    //   882: bipush 32
    //   884: iand
    //   885: bipush 32
    //   887: if_icmpeq +250 -> 1137
    //   890: iload_3
    //   891: istore 7
    //   893: iload_3
    //   894: istore 8
    //   896: iload_3
    //   897: istore 9
    //   899: new 100	java/util/ArrayList
    //   902: astore 11
    //   904: iload_3
    //   905: istore 7
    //   907: iload_3
    //   908: istore 8
    //   910: iload_3
    //   911: istore 9
    //   913: aload 11
    //   915: invokespecial 101	java/util/ArrayList:<init>	()V
    //   918: iload_3
    //   919: istore 7
    //   921: iload_3
    //   922: istore 8
    //   924: iload_3
    //   925: istore 9
    //   927: aload_0
    //   928: aload 11
    //   930: putfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   933: iload_3
    //   934: bipush 32
    //   936: ior
    //   937: istore_3
    //   938: aload_0
    //   939: getfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   942: aload_1
    //   943: getstatic 207	a/i/b/a/c/e/a$a:BsC	La/i/b/a/c/g/s;
    //   946: aload_2
    //   947: invokevirtual 109	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   950: invokeinterface 115 2 0
    //   955: pop
    //   956: goto -914 -> 42
    //   959: iload_3
    //   960: iconst_1
    //   961: iand
    //   962: iconst_1
    //   963: if_icmpne +14 -> 977
    //   966: aload_0
    //   967: aload_0
    //   968: getfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   971: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   974: putfield 103	a/i/b/a/c/e/b/a$a:Bxl	Ljava/util/List;
    //   977: iload_3
    //   978: iconst_2
    //   979: iand
    //   980: iconst_2
    //   981: if_icmpne +14 -> 995
    //   984: aload_0
    //   985: aload_0
    //   986: getfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   989: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   992: putfield 127	a/i/b/a/c/e/b/a$a:Bxm	Ljava/util/List;
    //   995: iload_3
    //   996: iconst_4
    //   997: iand
    //   998: iconst_4
    //   999: if_icmpne +16 -> 1015
    //   1002: aload_0
    //   1003: aload_0
    //   1004: getfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   1007: invokeinterface 135 1 0
    //   1012: putfield 129	a/i/b/a/c/e/b/a$a:Bxn	La/i/b/a/c/g/o;
    //   1015: iload_3
    //   1016: bipush 32
    //   1018: iand
    //   1019: bipush 32
    //   1021: if_icmpne +14 -> 1035
    //   1024: aload_0
    //   1025: aload_0
    //   1026: getfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   1029: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1032: putfield 137	a/i/b/a/c/e/b/a$a:BvA	Ljava/util/List;
    //   1035: aload 5
    //   1037: invokevirtual 140	a/i/b/a/c/g/f:flush	()V
    //   1040: aload_0
    //   1041: aload 4
    //   1043: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1046: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   1049: aload_0
    //   1050: invokevirtual 149	a/i/b/a/c/e/b/a$a:eio	()V
    //   1053: ldc 79
    //   1055: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1058: return
    //   1059: astore_1
    //   1060: aload_0
    //   1061: aload 4
    //   1063: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1066: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   1069: goto -20 -> 1049
    //   1072: astore_1
    //   1073: aload_0
    //   1074: aload 4
    //   1076: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1079: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   1082: ldc 79
    //   1084: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1087: aload_1
    //   1088: athrow
    //   1089: astore_2
    //   1090: aload_0
    //   1091: aload 4
    //   1093: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1096: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   1099: goto -722 -> 377
    //   1102: astore_1
    //   1103: aload_0
    //   1104: aload 4
    //   1106: invokevirtual 146	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1109: putfield 73	a/i/b/a/c/e/b/a$a:BsB	La/i/b/a/c/g/d;
    //   1112: ldc 79
    //   1114: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1117: aload_1
    //   1118: athrow
    //   1119: astore_1
    //   1120: goto -833 -> 287
    //   1123: astore_1
    //   1124: iload_3
    //   1125: istore 8
    //   1127: goto -644 -> 483
    //   1130: astore_1
    //   1131: iload_3
    //   1132: istore 8
    //   1134: goto -869 -> 265
    //   1137: goto -199 -> 938
    //   1140: aconst_null
    //   1141: astore 11
    //   1143: goto -350 -> 793
    //   1146: aconst_null
    //   1147: astore 11
    //   1149: goto -481 -> 668
    //   1152: goto -196 -> 956
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	260	a/i/b/a/c/g/k
    //   141	154	260	a/i/b/a/c/g/k
    //   185	190	260	a/i/b/a/c/g/k
    //   199	204	260	a/i/b/a/c/g/k
    //   213	219	260	a/i/b/a/c/g/k
    //   236	254	260	a/i/b/a/c/g/k
    //   407	412	260	a/i/b/a/c/g/k
    //   421	426	260	a/i/b/a/c/g/k
    //   435	441	260	a/i/b/a/c/g/k
    //   458	476	260	a/i/b/a/c/g/k
    //   531	537	260	a/i/b/a/c/g/k
    //   556	561	260	a/i/b/a/c/g/k
    //   570	575	260	a/i/b/a/c/g/k
    //   584	590	260	a/i/b/a/c/g/k
    //   607	618	260	a/i/b/a/c/g/k
    //   640	650	260	a/i/b/a/c/g/k
    //   659	668	260	a/i/b/a/c/g/k
    //   677	692	260	a/i/b/a/c/g/k
    //   706	716	260	a/i/b/a/c/g/k
    //   725	734	260	a/i/b/a/c/g/k
    //   743	753	260	a/i/b/a/c/g/k
    //   765	775	260	a/i/b/a/c/g/k
    //   784	793	260	a/i/b/a/c/g/k
    //   802	817	260	a/i/b/a/c/g/k
    //   831	841	260	a/i/b/a/c/g/k
    //   850	859	260	a/i/b/a/c/g/k
    //   868	878	260	a/i/b/a/c/g/k
    //   899	904	260	a/i/b/a/c/g/k
    //   913	918	260	a/i/b/a/c/g/k
    //   927	933	260	a/i/b/a/c/g/k
    //   268	273	286	finally
    //   276	281	286	finally
    //   284	286	286	finally
    //   486	490	286	finally
    //   493	501	286	finally
    //   504	509	286	finally
    //   512	517	286	finally
    //   520	522	286	finally
    //   56	62	482	java/io/IOException
    //   141	154	482	java/io/IOException
    //   185	190	482	java/io/IOException
    //   199	204	482	java/io/IOException
    //   213	219	482	java/io/IOException
    //   236	254	482	java/io/IOException
    //   407	412	482	java/io/IOException
    //   421	426	482	java/io/IOException
    //   435	441	482	java/io/IOException
    //   458	476	482	java/io/IOException
    //   531	537	482	java/io/IOException
    //   556	561	482	java/io/IOException
    //   570	575	482	java/io/IOException
    //   584	590	482	java/io/IOException
    //   607	618	482	java/io/IOException
    //   640	650	482	java/io/IOException
    //   659	668	482	java/io/IOException
    //   677	692	482	java/io/IOException
    //   706	716	482	java/io/IOException
    //   725	734	482	java/io/IOException
    //   743	753	482	java/io/IOException
    //   765	775	482	java/io/IOException
    //   784	793	482	java/io/IOException
    //   802	817	482	java/io/IOException
    //   831	841	482	java/io/IOException
    //   850	859	482	java/io/IOException
    //   868	878	482	java/io/IOException
    //   899	904	482	java/io/IOException
    //   913	918	482	java/io/IOException
    //   927	933	482	java/io/IOException
    //   56	62	624	finally
    //   141	154	624	finally
    //   185	190	624	finally
    //   199	204	624	finally
    //   213	219	624	finally
    //   236	254	624	finally
    //   407	412	624	finally
    //   421	426	624	finally
    //   435	441	624	finally
    //   458	476	624	finally
    //   531	537	624	finally
    //   556	561	624	finally
    //   570	575	624	finally
    //   584	590	624	finally
    //   607	618	624	finally
    //   640	650	624	finally
    //   659	668	624	finally
    //   677	692	624	finally
    //   706	716	624	finally
    //   725	734	624	finally
    //   743	753	624	finally
    //   765	775	624	finally
    //   784	793	624	finally
    //   802	817	624	finally
    //   831	841	624	finally
    //   850	859	624	finally
    //   868	878	624	finally
    //   899	904	624	finally
    //   913	918	624	finally
    //   927	933	624	finally
    //   1035	1040	1059	java/io/IOException
    //   1035	1040	1072	finally
    //   363	368	1089	java/io/IOException
    //   363	368	1102	finally
    //   938	956	1119	finally
    //   938	956	1123	java/io/IOException
    //   938	956	1130	a/i/b/a/c/g/k
  }

  private a$a(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  public static a Q(InputStream paramInputStream)
  {
    AppMethodBeat.i(121128);
    paramInputStream = (a)BsC.R(paramInputStream);
    AppMethodBeat.o(121128);
    return paramInputStream;
  }

  private void ecA()
  {
    AppMethodBeat.i(121124);
    this.Bxl = Collections.emptyList();
    this.Bxm = Collections.emptyList();
    this.Bxn = n.BAf;
    this.Bxo = a.y.eeR();
    this.Bxp = a.w.eeF();
    this.BvA = Collections.emptyList();
    AppMethodBeat.o(121124);
  }

  public static a egp()
  {
    return Bxk;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(121126);
    vq();
    for (int j = 0; j < this.Bxl.size(); j++)
      paramf.a(1, (q)this.Bxl.get(j));
    for (j = 0; j < this.Bxm.size(); j++)
      paramf.a(2, (q)this.Bxm.get(j));
    for (j = 0; j < this.Bxn.size(); j++)
      paramf.a(3, this.Bxn.UC(j));
    if ((this.BsD & 0x1) == 1)
      paramf.a(4, this.Bxo);
    j = i;
    if ((this.BsD & 0x2) == 2)
      paramf.a(5, this.Bxp);
    for (j = i; j < this.BvA.size(); j++)
      paramf.a(6, (q)this.BvA.get(j));
    paramf.d(this.BsB);
    AppMethodBeat.o(121126);
  }

  public final s<a> ecy()
  {
    return BsC;
  }

  public final boolean egq()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean egr()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(121125);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(121125);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(121125);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.Bxl.size())
            break label96;
          if (!((a.c)this.Bxl.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(121125);
            break;
          }
        }
        label96: for (i = 0; ; i++)
        {
          if (i >= this.Bxm.size())
            break label151;
          if (!((a.c)this.Bxm.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(121125);
            break;
          }
        }
        label151: if ((egr()) && (!this.Bxp.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(121125);
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= this.BvA.size())
              break label238;
            if (!((a.i.b.a.c.e.a.a)this.BvA.get(i)).isInitialized())
            {
              this.BsG = ((byte)0);
              AppMethodBeat.o(121125);
              break;
            }
          }
          label238: this.BsG = ((byte)1);
          AppMethodBeat.o(121125);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(121127);
    int j = this.BsH;
    if (j != -1)
      AppMethodBeat.o(121127);
    while (true)
    {
      return j;
      int k = 0;
      j = 0;
      while (k < this.Bxl.size())
      {
        j += f.c(1, (q)this.Bxl.get(k));
        k++;
      }
      for (k = 0; k < this.Bxm.size(); k++)
        j += f.c(2, (q)this.Bxm.get(k));
      int m = 0;
      k = 0;
      while (m < this.Bxn.size())
      {
        k += f.c(this.Bxn.UC(m));
        m++;
      }
      k = j + k + this.Bxn.size() * 1;
      j = k;
      if ((this.BsD & 0x1) == 1)
        j = k + f.c(4, this.Bxo);
      k = j;
      if ((this.BsD & 0x2) == 2)
        k = j + f.c(5, this.Bxp);
      j = k;
      k = i;
      while (k < this.BvA.size())
      {
        m = f.c(6, (q)this.BvA.get(k));
        k++;
        j = m + j;
      }
      j = this.BsB.size() + j;
      this.BsH = j;
      AppMethodBeat.o(121127);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.a
 * JD-Core Version:    0.6.2
 */