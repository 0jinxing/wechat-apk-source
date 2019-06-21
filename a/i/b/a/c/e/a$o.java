package a.i.b.a.c.e;

import a.i.b.a.c.g.b;
import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.g;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.c.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class a$o extends i.c<o>
  implements a.p
{
  public static s<o> BsC;
  private static final o Bur;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public a.ag BtC;
  public List<Integer> BtD;
  public List<a.ai> BtO;
  public List<a.ae> Btp;
  public int Buf;
  public int Bus;
  public a.aa But;
  public int Buu;
  public a.aa Buv;
  public int Buw;
  a.g Bux;

  static
  {
    AppMethodBeat.i(120668);
    BsC = new b()
    {
    };
    o localo = new o();
    Bur = localo;
    localo.ecA();
    AppMethodBeat.o(120668);
  }

  private a$o()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$o(a.i.b.a.c.g.e parame, g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 69	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 86
    //   6: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 71	a/i/b/a/c/e/a$o:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 73	a/i/b/a/c/e/a$o:BsH	I
    //   20: aload_0
    //   21: invokespecial 65	a/i/b/a/c/e/a$o:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 90	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 96	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +1532 -> 1576
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 102	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+124->188, 0:+152->216, 8:+158->222, 16:+318->382, 26:+402->466, 34:+530->594, 42:+627->691, 50:+755->819, 56:+855->919, 64:+895->959, 72:+935->999, 242:+974->1038, 248:+1105->1169, 250:+1204->1268, 258:+1381->1445
    //   189: istore 7
    //   191: iload_3
    //   192: istore 8
    //   194: iload_3
    //   195: istore 9
    //   197: aload_0
    //   198: aload_1
    //   199: aload 5
    //   201: aload_2
    //   202: iload 10
    //   204: invokevirtual 106	a/i/b/a/c/e/a$o:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   207: ifne -165 -> 42
    //   210: iconst_1
    //   211: istore 6
    //   213: goto -171 -> 42
    //   216: iconst_1
    //   217: istore 6
    //   219: goto -177 -> 42
    //   222: iload_3
    //   223: istore 7
    //   225: iload_3
    //   226: istore 8
    //   228: iload_3
    //   229: istore 9
    //   231: aload_0
    //   232: aload_0
    //   233: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   236: iconst_2
    //   237: ior
    //   238: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   241: iload_3
    //   242: istore 7
    //   244: iload_3
    //   245: istore 8
    //   247: iload_3
    //   248: istore 9
    //   250: aload_0
    //   251: aload_1
    //   252: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   255: putfield 113	a/i/b/a/c/e/a$o:Bus	I
    //   258: goto -216 -> 42
    //   261: astore_1
    //   262: iload 7
    //   264: istore 8
    //   266: aload_1
    //   267: aload_0
    //   268: putfield 117	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   271: iload 7
    //   273: istore 8
    //   275: ldc 86
    //   277: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   280: iload 7
    //   282: istore 8
    //   284: aload_1
    //   285: athrow
    //   286: astore_1
    //   287: iload 8
    //   289: bipush 32
    //   291: iand
    //   292: bipush 32
    //   294: if_icmpne +14 -> 308
    //   297: aload_0
    //   298: aload_0
    //   299: getfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   302: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   305: putfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   308: iload 8
    //   310: sipush 256
    //   313: iand
    //   314: sipush 256
    //   317: if_icmpne +14 -> 331
    //   320: aload_0
    //   321: aload_0
    //   322: getfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   325: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   328: putfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   331: iload 8
    //   333: sipush 1024
    //   336: iand
    //   337: sipush 1024
    //   340: if_icmpne +14 -> 354
    //   343: aload_0
    //   344: aload_0
    //   345: getfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   348: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   351: putfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   354: aload 5
    //   356: invokevirtual 132	a/i/b/a/c/g/f:flush	()V
    //   359: aload_0
    //   360: aload 4
    //   362: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   365: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   368: aload_0
    //   369: getfield 142	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   372: invokevirtual 147	a/i/b/a/c/g/h:eii	()V
    //   375: ldc 86
    //   377: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   380: aload_1
    //   381: athrow
    //   382: iload_3
    //   383: istore 7
    //   385: iload_3
    //   386: istore 8
    //   388: iload_3
    //   389: istore 9
    //   391: aload_0
    //   392: aload_0
    //   393: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   396: iconst_4
    //   397: ior
    //   398: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   401: iload_3
    //   402: istore 7
    //   404: iload_3
    //   405: istore 8
    //   407: iload_3
    //   408: istore 9
    //   410: aload_0
    //   411: aload_1
    //   412: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   415: putfield 149	a/i/b/a/c/e/a$o:Buf	I
    //   418: goto -376 -> 42
    //   421: astore_2
    //   422: iload 9
    //   424: istore 8
    //   426: new 83	a/i/b/a/c/g/k
    //   429: astore_1
    //   430: iload 9
    //   432: istore 8
    //   434: aload_1
    //   435: aload_2
    //   436: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
    //   439: invokespecial 156	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   442: iload 9
    //   444: istore 8
    //   446: aload_1
    //   447: aload_0
    //   448: putfield 117	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   451: iload 9
    //   453: istore 8
    //   455: ldc 86
    //   457: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   460: iload 9
    //   462: istore 8
    //   464: aload_1
    //   465: athrow
    //   466: iload_3
    //   467: istore 7
    //   469: iload_3
    //   470: istore 8
    //   472: iload_3
    //   473: istore 9
    //   475: aload_0
    //   476: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   479: bipush 8
    //   481: iand
    //   482: bipush 8
    //   484: if_icmpne +1261 -> 1745
    //   487: iload_3
    //   488: istore 7
    //   490: iload_3
    //   491: istore 8
    //   493: iload_3
    //   494: istore 9
    //   496: aload_0
    //   497: getfield 158	a/i/b/a/c/e/a$o:But	La/i/b/a/c/e/a$aa;
    //   500: invokestatic 164	a/i/b/a/c/e/a$aa:f	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   503: astore 11
    //   505: iload_3
    //   506: istore 7
    //   508: iload_3
    //   509: istore 8
    //   511: iload_3
    //   512: istore 9
    //   514: aload_0
    //   515: aload_1
    //   516: getstatic 165	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   519: aload_2
    //   520: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   523: checkcast 160	a/i/b/a/c/e/a$aa
    //   526: putfield 158	a/i/b/a/c/e/a$o:But	La/i/b/a/c/e/a$aa;
    //   529: aload 11
    //   531: ifnull +40 -> 571
    //   534: iload_3
    //   535: istore 7
    //   537: iload_3
    //   538: istore 8
    //   540: iload_3
    //   541: istore 9
    //   543: aload 11
    //   545: aload_0
    //   546: getfield 158	a/i/b/a/c/e/a$o:But	La/i/b/a/c/e/a$aa;
    //   549: invokevirtual 173	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   552: pop
    //   553: iload_3
    //   554: istore 7
    //   556: iload_3
    //   557: istore 8
    //   559: iload_3
    //   560: istore 9
    //   562: aload_0
    //   563: aload 11
    //   565: invokevirtual 177	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   568: putfield 158	a/i/b/a/c/e/a$o:But	La/i/b/a/c/e/a$aa;
    //   571: iload_3
    //   572: istore 7
    //   574: iload_3
    //   575: istore 8
    //   577: iload_3
    //   578: istore 9
    //   580: aload_0
    //   581: aload_0
    //   582: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   585: bipush 8
    //   587: ior
    //   588: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   591: goto -549 -> 42
    //   594: iload_3
    //   595: istore 10
    //   597: iload_3
    //   598: bipush 32
    //   600: iand
    //   601: bipush 32
    //   603: if_icmpeq +52 -> 655
    //   606: iload_3
    //   607: istore 7
    //   609: iload_3
    //   610: istore 8
    //   612: iload_3
    //   613: istore 9
    //   615: new 179	java/util/ArrayList
    //   618: astore 11
    //   620: iload_3
    //   621: istore 7
    //   623: iload_3
    //   624: istore 8
    //   626: iload_3
    //   627: istore 9
    //   629: aload 11
    //   631: invokespecial 180	java/util/ArrayList:<init>	()V
    //   634: iload_3
    //   635: istore 7
    //   637: iload_3
    //   638: istore 8
    //   640: iload_3
    //   641: istore 9
    //   643: aload_0
    //   644: aload 11
    //   646: putfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   649: iload_3
    //   650: bipush 32
    //   652: ior
    //   653: istore 10
    //   655: iload 10
    //   657: istore 7
    //   659: iload 10
    //   661: istore 8
    //   663: iload 10
    //   665: istore 9
    //   667: aload_0
    //   668: getfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   671: aload_1
    //   672: getstatic 183	a/i/b/a/c/e/a$ae:BsC	La/i/b/a/c/g/s;
    //   675: aload_2
    //   676: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   679: invokeinterface 189 2 0
    //   684: pop
    //   685: iload 10
    //   687: istore_3
    //   688: goto -646 -> 42
    //   691: iload_3
    //   692: istore 7
    //   694: iload_3
    //   695: istore 8
    //   697: iload_3
    //   698: istore 9
    //   700: aload_0
    //   701: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   704: bipush 32
    //   706: iand
    //   707: bipush 32
    //   709: if_icmpne +1030 -> 1739
    //   712: iload_3
    //   713: istore 7
    //   715: iload_3
    //   716: istore 8
    //   718: iload_3
    //   719: istore 9
    //   721: aload_0
    //   722: getfield 191	a/i/b/a/c/e/a$o:Buv	La/i/b/a/c/e/a$aa;
    //   725: invokestatic 164	a/i/b/a/c/e/a$aa:f	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   728: astore 11
    //   730: iload_3
    //   731: istore 7
    //   733: iload_3
    //   734: istore 8
    //   736: iload_3
    //   737: istore 9
    //   739: aload_0
    //   740: aload_1
    //   741: getstatic 165	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   744: aload_2
    //   745: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   748: checkcast 160	a/i/b/a/c/e/a$aa
    //   751: putfield 191	a/i/b/a/c/e/a$o:Buv	La/i/b/a/c/e/a$aa;
    //   754: aload 11
    //   756: ifnull +40 -> 796
    //   759: iload_3
    //   760: istore 7
    //   762: iload_3
    //   763: istore 8
    //   765: iload_3
    //   766: istore 9
    //   768: aload 11
    //   770: aload_0
    //   771: getfield 191	a/i/b/a/c/e/a$o:Buv	La/i/b/a/c/e/a$aa;
    //   774: invokevirtual 173	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   777: pop
    //   778: iload_3
    //   779: istore 7
    //   781: iload_3
    //   782: istore 8
    //   784: iload_3
    //   785: istore 9
    //   787: aload_0
    //   788: aload 11
    //   790: invokevirtual 177	a/i/b/a/c/e/a$aa$c:eft	()La/i/b/a/c/e/a$aa;
    //   793: putfield 191	a/i/b/a/c/e/a$o:Buv	La/i/b/a/c/e/a$aa;
    //   796: iload_3
    //   797: istore 7
    //   799: iload_3
    //   800: istore 8
    //   802: iload_3
    //   803: istore 9
    //   805: aload_0
    //   806: aload_0
    //   807: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   810: bipush 32
    //   812: ior
    //   813: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   816: goto -774 -> 42
    //   819: iload_3
    //   820: istore 10
    //   822: iload_3
    //   823: sipush 256
    //   826: iand
    //   827: sipush 256
    //   830: if_icmpeq +53 -> 883
    //   833: iload_3
    //   834: istore 7
    //   836: iload_3
    //   837: istore 8
    //   839: iload_3
    //   840: istore 9
    //   842: new 179	java/util/ArrayList
    //   845: astore 11
    //   847: iload_3
    //   848: istore 7
    //   850: iload_3
    //   851: istore 8
    //   853: iload_3
    //   854: istore 9
    //   856: aload 11
    //   858: invokespecial 180	java/util/ArrayList:<init>	()V
    //   861: iload_3
    //   862: istore 7
    //   864: iload_3
    //   865: istore 8
    //   867: iload_3
    //   868: istore 9
    //   870: aload_0
    //   871: aload 11
    //   873: putfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   876: iload_3
    //   877: sipush 256
    //   880: ior
    //   881: istore 10
    //   883: iload 10
    //   885: istore 7
    //   887: iload 10
    //   889: istore 8
    //   891: iload 10
    //   893: istore 9
    //   895: aload_0
    //   896: getfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   899: aload_1
    //   900: getstatic 194	a/i/b/a/c/e/a$ai:BsC	La/i/b/a/c/g/s;
    //   903: aload_2
    //   904: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   907: invokeinterface 189 2 0
    //   912: pop
    //   913: iload 10
    //   915: istore_3
    //   916: goto -874 -> 42
    //   919: iload_3
    //   920: istore 7
    //   922: iload_3
    //   923: istore 8
    //   925: iload_3
    //   926: istore 9
    //   928: aload_0
    //   929: aload_0
    //   930: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   933: bipush 16
    //   935: ior
    //   936: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   939: iload_3
    //   940: istore 7
    //   942: iload_3
    //   943: istore 8
    //   945: iload_3
    //   946: istore 9
    //   948: aload_0
    //   949: aload_1
    //   950: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   953: putfield 196	a/i/b/a/c/e/a$o:Buu	I
    //   956: goto -914 -> 42
    //   959: iload_3
    //   960: istore 7
    //   962: iload_3
    //   963: istore 8
    //   965: iload_3
    //   966: istore 9
    //   968: aload_0
    //   969: aload_0
    //   970: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   973: bipush 64
    //   975: ior
    //   976: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   979: iload_3
    //   980: istore 7
    //   982: iload_3
    //   983: istore 8
    //   985: iload_3
    //   986: istore 9
    //   988: aload_0
    //   989: aload_1
    //   990: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   993: putfield 198	a/i/b/a/c/e/a$o:Buw	I
    //   996: goto -954 -> 42
    //   999: iload_3
    //   1000: istore 7
    //   1002: iload_3
    //   1003: istore 8
    //   1005: iload_3
    //   1006: istore 9
    //   1008: aload_0
    //   1009: aload_0
    //   1010: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1013: iconst_1
    //   1014: ior
    //   1015: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1018: iload_3
    //   1019: istore 7
    //   1021: iload_3
    //   1022: istore 8
    //   1024: iload_3
    //   1025: istore 9
    //   1027: aload_0
    //   1028: aload_1
    //   1029: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   1032: putfield 200	a/i/b/a/c/e/a$o:BsW	I
    //   1035: goto -993 -> 42
    //   1038: iload_3
    //   1039: istore 7
    //   1041: iload_3
    //   1042: istore 8
    //   1044: iload_3
    //   1045: istore 9
    //   1047: aload_0
    //   1048: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1051: sipush 128
    //   1054: iand
    //   1055: sipush 128
    //   1058: if_icmpne +675 -> 1733
    //   1061: iload_3
    //   1062: istore 7
    //   1064: iload_3
    //   1065: istore 8
    //   1067: iload_3
    //   1068: istore 9
    //   1070: aload_0
    //   1071: getfield 202	a/i/b/a/c/e/a$o:BtC	La/i/b/a/c/e/a$ag;
    //   1074: invokestatic 208	a/i/b/a/c/e/a$ag:d	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   1077: astore 11
    //   1079: iload_3
    //   1080: istore 7
    //   1082: iload_3
    //   1083: istore 8
    //   1085: iload_3
    //   1086: istore 9
    //   1088: aload_0
    //   1089: aload_1
    //   1090: getstatic 209	a/i/b/a/c/e/a$ag:BsC	La/i/b/a/c/g/s;
    //   1093: aload_2
    //   1094: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   1097: checkcast 204	a/i/b/a/c/e/a$ag
    //   1100: putfield 202	a/i/b/a/c/e/a$o:BtC	La/i/b/a/c/e/a$ag;
    //   1103: aload 11
    //   1105: ifnull +40 -> 1145
    //   1108: iload_3
    //   1109: istore 7
    //   1111: iload_3
    //   1112: istore 8
    //   1114: iload_3
    //   1115: istore 9
    //   1117: aload 11
    //   1119: aload_0
    //   1120: getfield 202	a/i/b/a/c/e/a$o:BtC	La/i/b/a/c/e/a$ag;
    //   1123: invokevirtual 214	a/i/b/a/c/e/a$ag$a:g	(La/i/b/a/c/e/a$ag;)La/i/b/a/c/e/a$ag$a;
    //   1126: pop
    //   1127: iload_3
    //   1128: istore 7
    //   1130: iload_3
    //   1131: istore 8
    //   1133: iload_3
    //   1134: istore 9
    //   1136: aload_0
    //   1137: aload 11
    //   1139: invokevirtual 218	a/i/b/a/c/e/a$ag$a:efP	()La/i/b/a/c/e/a$ag;
    //   1142: putfield 202	a/i/b/a/c/e/a$o:BtC	La/i/b/a/c/e/a$ag;
    //   1145: iload_3
    //   1146: istore 7
    //   1148: iload_3
    //   1149: istore 8
    //   1151: iload_3
    //   1152: istore 9
    //   1154: aload_0
    //   1155: aload_0
    //   1156: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1159: sipush 128
    //   1162: ior
    //   1163: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1166: goto -1124 -> 42
    //   1169: iload_3
    //   1170: istore 10
    //   1172: iload_3
    //   1173: sipush 1024
    //   1176: iand
    //   1177: sipush 1024
    //   1180: if_icmpeq +53 -> 1233
    //   1183: iload_3
    //   1184: istore 7
    //   1186: iload_3
    //   1187: istore 8
    //   1189: iload_3
    //   1190: istore 9
    //   1192: new 179	java/util/ArrayList
    //   1195: astore 11
    //   1197: iload_3
    //   1198: istore 7
    //   1200: iload_3
    //   1201: istore 8
    //   1203: iload_3
    //   1204: istore 9
    //   1206: aload 11
    //   1208: invokespecial 180	java/util/ArrayList:<init>	()V
    //   1211: iload_3
    //   1212: istore 7
    //   1214: iload_3
    //   1215: istore 8
    //   1217: iload_3
    //   1218: istore 9
    //   1220: aload_0
    //   1221: aload 11
    //   1223: putfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1226: iload_3
    //   1227: sipush 1024
    //   1230: ior
    //   1231: istore 10
    //   1233: iload 10
    //   1235: istore 7
    //   1237: iload 10
    //   1239: istore 8
    //   1241: iload 10
    //   1243: istore 9
    //   1245: aload_0
    //   1246: getfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1249: aload_1
    //   1250: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   1253: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1256: invokeinterface 189 2 0
    //   1261: pop
    //   1262: iload 10
    //   1264: istore_3
    //   1265: goto -1223 -> 42
    //   1268: iload_3
    //   1269: istore 7
    //   1271: iload_3
    //   1272: istore 8
    //   1274: iload_3
    //   1275: istore 9
    //   1277: aload_1
    //   1278: aload_1
    //   1279: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   1282: invokevirtual 228	a/i/b/a/c/g/e:fo	(I)I
    //   1285: istore 12
    //   1287: iload_3
    //   1288: istore 10
    //   1290: iload_3
    //   1291: sipush 1024
    //   1294: iand
    //   1295: sipush 1024
    //   1298: if_icmpeq +72 -> 1370
    //   1301: iload_3
    //   1302: istore 7
    //   1304: iload_3
    //   1305: istore 8
    //   1307: iload_3
    //   1308: istore 9
    //   1310: iload_3
    //   1311: istore 10
    //   1313: aload_1
    //   1314: invokevirtual 231	a/i/b/a/c/g/e:vg	()I
    //   1317: ifle +53 -> 1370
    //   1320: iload_3
    //   1321: istore 7
    //   1323: iload_3
    //   1324: istore 8
    //   1326: iload_3
    //   1327: istore 9
    //   1329: new 179	java/util/ArrayList
    //   1332: astore 11
    //   1334: iload_3
    //   1335: istore 7
    //   1337: iload_3
    //   1338: istore 8
    //   1340: iload_3
    //   1341: istore 9
    //   1343: aload 11
    //   1345: invokespecial 180	java/util/ArrayList:<init>	()V
    //   1348: iload_3
    //   1349: istore 7
    //   1351: iload_3
    //   1352: istore 8
    //   1354: iload_3
    //   1355: istore 9
    //   1357: aload_0
    //   1358: aload 11
    //   1360: putfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1363: iload_3
    //   1364: sipush 1024
    //   1367: ior
    //   1368: istore 10
    //   1370: iload 10
    //   1372: istore 7
    //   1374: iload 10
    //   1376: istore 8
    //   1378: iload 10
    //   1380: istore 9
    //   1382: aload_1
    //   1383: invokevirtual 231	a/i/b/a/c/g/e:vg	()I
    //   1386: ifle +35 -> 1421
    //   1389: iload 10
    //   1391: istore 7
    //   1393: iload 10
    //   1395: istore 8
    //   1397: iload 10
    //   1399: istore 9
    //   1401: aload_0
    //   1402: getfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1405: aload_1
    //   1406: invokevirtual 111	a/i/b/a/c/g/e:vd	()I
    //   1409: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1412: invokeinterface 189 2 0
    //   1417: pop
    //   1418: goto -48 -> 1370
    //   1421: iload 10
    //   1423: istore 7
    //   1425: iload 10
    //   1427: istore 8
    //   1429: iload 10
    //   1431: istore 9
    //   1433: aload_1
    //   1434: iload 12
    //   1436: invokevirtual 234	a/i/b/a/c/g/e:fp	(I)V
    //   1439: iload 10
    //   1441: istore_3
    //   1442: goto -1400 -> 42
    //   1445: iload_3
    //   1446: istore 7
    //   1448: iload_3
    //   1449: istore 8
    //   1451: iload_3
    //   1452: istore 9
    //   1454: aload_0
    //   1455: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1458: sipush 256
    //   1461: iand
    //   1462: sipush 256
    //   1465: if_icmpne +262 -> 1727
    //   1468: iload_3
    //   1469: istore 7
    //   1471: iload_3
    //   1472: istore 8
    //   1474: iload_3
    //   1475: istore 9
    //   1477: aload_0
    //   1478: getfield 236	a/i/b/a/c/e/a$o:Bux	La/i/b/a/c/e/a$g;
    //   1481: invokevirtual 242	a/i/b/a/c/e/a$g:edI	()La/i/b/a/c/e/a$g$a;
    //   1484: astore 11
    //   1486: iload_3
    //   1487: istore 7
    //   1489: iload_3
    //   1490: istore 8
    //   1492: iload_3
    //   1493: istore 9
    //   1495: aload_0
    //   1496: aload_1
    //   1497: getstatic 243	a/i/b/a/c/e/a$g:BsC	La/i/b/a/c/g/s;
    //   1500: aload_2
    //   1501: invokevirtual 168	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   1504: checkcast 238	a/i/b/a/c/e/a$g
    //   1507: putfield 236	a/i/b/a/c/e/a$o:Bux	La/i/b/a/c/e/a$g;
    //   1510: aload 11
    //   1512: ifnull +40 -> 1552
    //   1515: iload_3
    //   1516: istore 7
    //   1518: iload_3
    //   1519: istore 8
    //   1521: iload_3
    //   1522: istore 9
    //   1524: aload 11
    //   1526: aload_0
    //   1527: getfield 236	a/i/b/a/c/e/a$o:Bux	La/i/b/a/c/e/a$g;
    //   1530: invokevirtual 248	a/i/b/a/c/e/a$g$a:d	(La/i/b/a/c/e/a$g;)La/i/b/a/c/e/a$g$a;
    //   1533: pop
    //   1534: iload_3
    //   1535: istore 7
    //   1537: iload_3
    //   1538: istore 8
    //   1540: iload_3
    //   1541: istore 9
    //   1543: aload_0
    //   1544: aload 11
    //   1546: invokevirtual 252	a/i/b/a/c/e/a$g$a:edK	()La/i/b/a/c/e/a$g;
    //   1549: putfield 236	a/i/b/a/c/e/a$o:Bux	La/i/b/a/c/e/a$g;
    //   1552: iload_3
    //   1553: istore 7
    //   1555: iload_3
    //   1556: istore 8
    //   1558: iload_3
    //   1559: istore 9
    //   1561: aload_0
    //   1562: aload_0
    //   1563: getfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1566: sipush 256
    //   1569: ior
    //   1570: putfield 108	a/i/b/a/c/e/a$o:BsD	I
    //   1573: goto -1531 -> 42
    //   1576: iload_3
    //   1577: bipush 32
    //   1579: iand
    //   1580: bipush 32
    //   1582: if_icmpne +14 -> 1596
    //   1585: aload_0
    //   1586: aload_0
    //   1587: getfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   1590: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1593: putfield 119	a/i/b/a/c/e/a$o:Btp	Ljava/util/List;
    //   1596: iload_3
    //   1597: sipush 256
    //   1600: iand
    //   1601: sipush 256
    //   1604: if_icmpne +14 -> 1618
    //   1607: aload_0
    //   1608: aload_0
    //   1609: getfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   1612: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1615: putfield 127	a/i/b/a/c/e/a$o:BtO	Ljava/util/List;
    //   1618: iload_3
    //   1619: sipush 1024
    //   1622: iand
    //   1623: sipush 1024
    //   1626: if_icmpne +14 -> 1640
    //   1629: aload_0
    //   1630: aload_0
    //   1631: getfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1634: invokestatic 125	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1637: putfield 129	a/i/b/a/c/e/a$o:BtD	Ljava/util/List;
    //   1640: aload 5
    //   1642: invokevirtual 132	a/i/b/a/c/g/f:flush	()V
    //   1645: aload_0
    //   1646: aload 4
    //   1648: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1651: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   1654: aload_0
    //   1655: getfield 142	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   1658: invokevirtual 147	a/i/b/a/c/g/h:eii	()V
    //   1661: ldc 86
    //   1663: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1666: return
    //   1667: astore_1
    //   1668: aload_0
    //   1669: aload 4
    //   1671: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1674: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   1677: goto -23 -> 1654
    //   1680: astore_1
    //   1681: aload_0
    //   1682: aload 4
    //   1684: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1687: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   1690: ldc 86
    //   1692: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1695: aload_1
    //   1696: athrow
    //   1697: astore_2
    //   1698: aload_0
    //   1699: aload 4
    //   1701: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1704: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   1707: goto -1339 -> 368
    //   1710: astore_1
    //   1711: aload_0
    //   1712: aload 4
    //   1714: invokevirtual 138	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   1717: putfield 80	a/i/b/a/c/e/a$o:BsB	La/i/b/a/c/g/d;
    //   1720: ldc 86
    //   1722: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1725: aload_1
    //   1726: athrow
    //   1727: aconst_null
    //   1728: astore 11
    //   1730: goto -244 -> 1486
    //   1733: aconst_null
    //   1734: astore 11
    //   1736: goto -657 -> 1079
    //   1739: aconst_null
    //   1740: astore 11
    //   1742: goto -1012 -> 730
    //   1745: aconst_null
    //   1746: astore 11
    //   1748: goto -1243 -> 505
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	261	a/i/b/a/c/g/k
    //   197	210	261	a/i/b/a/c/g/k
    //   231	241	261	a/i/b/a/c/g/k
    //   250	258	261	a/i/b/a/c/g/k
    //   391	401	261	a/i/b/a/c/g/k
    //   410	418	261	a/i/b/a/c/g/k
    //   475	487	261	a/i/b/a/c/g/k
    //   496	505	261	a/i/b/a/c/g/k
    //   514	529	261	a/i/b/a/c/g/k
    //   543	553	261	a/i/b/a/c/g/k
    //   562	571	261	a/i/b/a/c/g/k
    //   580	591	261	a/i/b/a/c/g/k
    //   615	620	261	a/i/b/a/c/g/k
    //   629	634	261	a/i/b/a/c/g/k
    //   643	649	261	a/i/b/a/c/g/k
    //   667	685	261	a/i/b/a/c/g/k
    //   700	712	261	a/i/b/a/c/g/k
    //   721	730	261	a/i/b/a/c/g/k
    //   739	754	261	a/i/b/a/c/g/k
    //   768	778	261	a/i/b/a/c/g/k
    //   787	796	261	a/i/b/a/c/g/k
    //   805	816	261	a/i/b/a/c/g/k
    //   842	847	261	a/i/b/a/c/g/k
    //   856	861	261	a/i/b/a/c/g/k
    //   870	876	261	a/i/b/a/c/g/k
    //   895	913	261	a/i/b/a/c/g/k
    //   928	939	261	a/i/b/a/c/g/k
    //   948	956	261	a/i/b/a/c/g/k
    //   968	979	261	a/i/b/a/c/g/k
    //   988	996	261	a/i/b/a/c/g/k
    //   1008	1018	261	a/i/b/a/c/g/k
    //   1027	1035	261	a/i/b/a/c/g/k
    //   1047	1061	261	a/i/b/a/c/g/k
    //   1070	1079	261	a/i/b/a/c/g/k
    //   1088	1103	261	a/i/b/a/c/g/k
    //   1117	1127	261	a/i/b/a/c/g/k
    //   1136	1145	261	a/i/b/a/c/g/k
    //   1154	1166	261	a/i/b/a/c/g/k
    //   1192	1197	261	a/i/b/a/c/g/k
    //   1206	1211	261	a/i/b/a/c/g/k
    //   1220	1226	261	a/i/b/a/c/g/k
    //   1245	1262	261	a/i/b/a/c/g/k
    //   1277	1287	261	a/i/b/a/c/g/k
    //   1313	1320	261	a/i/b/a/c/g/k
    //   1329	1334	261	a/i/b/a/c/g/k
    //   1343	1348	261	a/i/b/a/c/g/k
    //   1357	1363	261	a/i/b/a/c/g/k
    //   1382	1389	261	a/i/b/a/c/g/k
    //   1401	1418	261	a/i/b/a/c/g/k
    //   1433	1439	261	a/i/b/a/c/g/k
    //   1454	1468	261	a/i/b/a/c/g/k
    //   1477	1486	261	a/i/b/a/c/g/k
    //   1495	1510	261	a/i/b/a/c/g/k
    //   1524	1534	261	a/i/b/a/c/g/k
    //   1543	1552	261	a/i/b/a/c/g/k
    //   1561	1573	261	a/i/b/a/c/g/k
    //   56	62	286	finally
    //   197	210	286	finally
    //   231	241	286	finally
    //   250	258	286	finally
    //   266	271	286	finally
    //   275	280	286	finally
    //   284	286	286	finally
    //   391	401	286	finally
    //   410	418	286	finally
    //   426	430	286	finally
    //   434	442	286	finally
    //   446	451	286	finally
    //   455	460	286	finally
    //   464	466	286	finally
    //   475	487	286	finally
    //   496	505	286	finally
    //   514	529	286	finally
    //   543	553	286	finally
    //   562	571	286	finally
    //   580	591	286	finally
    //   615	620	286	finally
    //   629	634	286	finally
    //   643	649	286	finally
    //   667	685	286	finally
    //   700	712	286	finally
    //   721	730	286	finally
    //   739	754	286	finally
    //   768	778	286	finally
    //   787	796	286	finally
    //   805	816	286	finally
    //   842	847	286	finally
    //   856	861	286	finally
    //   870	876	286	finally
    //   895	913	286	finally
    //   928	939	286	finally
    //   948	956	286	finally
    //   968	979	286	finally
    //   988	996	286	finally
    //   1008	1018	286	finally
    //   1027	1035	286	finally
    //   1047	1061	286	finally
    //   1070	1079	286	finally
    //   1088	1103	286	finally
    //   1117	1127	286	finally
    //   1136	1145	286	finally
    //   1154	1166	286	finally
    //   1192	1197	286	finally
    //   1206	1211	286	finally
    //   1220	1226	286	finally
    //   1245	1262	286	finally
    //   1277	1287	286	finally
    //   1313	1320	286	finally
    //   1329	1334	286	finally
    //   1343	1348	286	finally
    //   1357	1363	286	finally
    //   1382	1389	286	finally
    //   1401	1418	286	finally
    //   1433	1439	286	finally
    //   1454	1468	286	finally
    //   1477	1486	286	finally
    //   1495	1510	286	finally
    //   1524	1534	286	finally
    //   1543	1552	286	finally
    //   1561	1573	286	finally
    //   56	62	421	java/io/IOException
    //   197	210	421	java/io/IOException
    //   231	241	421	java/io/IOException
    //   250	258	421	java/io/IOException
    //   391	401	421	java/io/IOException
    //   410	418	421	java/io/IOException
    //   475	487	421	java/io/IOException
    //   496	505	421	java/io/IOException
    //   514	529	421	java/io/IOException
    //   543	553	421	java/io/IOException
    //   562	571	421	java/io/IOException
    //   580	591	421	java/io/IOException
    //   615	620	421	java/io/IOException
    //   629	634	421	java/io/IOException
    //   643	649	421	java/io/IOException
    //   667	685	421	java/io/IOException
    //   700	712	421	java/io/IOException
    //   721	730	421	java/io/IOException
    //   739	754	421	java/io/IOException
    //   768	778	421	java/io/IOException
    //   787	796	421	java/io/IOException
    //   805	816	421	java/io/IOException
    //   842	847	421	java/io/IOException
    //   856	861	421	java/io/IOException
    //   870	876	421	java/io/IOException
    //   895	913	421	java/io/IOException
    //   928	939	421	java/io/IOException
    //   948	956	421	java/io/IOException
    //   968	979	421	java/io/IOException
    //   988	996	421	java/io/IOException
    //   1008	1018	421	java/io/IOException
    //   1027	1035	421	java/io/IOException
    //   1047	1061	421	java/io/IOException
    //   1070	1079	421	java/io/IOException
    //   1088	1103	421	java/io/IOException
    //   1117	1127	421	java/io/IOException
    //   1136	1145	421	java/io/IOException
    //   1154	1166	421	java/io/IOException
    //   1192	1197	421	java/io/IOException
    //   1206	1211	421	java/io/IOException
    //   1220	1226	421	java/io/IOException
    //   1245	1262	421	java/io/IOException
    //   1277	1287	421	java/io/IOException
    //   1313	1320	421	java/io/IOException
    //   1329	1334	421	java/io/IOException
    //   1343	1348	421	java/io/IOException
    //   1357	1363	421	java/io/IOException
    //   1382	1389	421	java/io/IOException
    //   1401	1418	421	java/io/IOException
    //   1433	1439	421	java/io/IOException
    //   1454	1468	421	java/io/IOException
    //   1477	1486	421	java/io/IOException
    //   1495	1510	421	java/io/IOException
    //   1524	1534	421	java/io/IOException
    //   1543	1552	421	java/io/IOException
    //   1561	1573	421	java/io/IOException
    //   1640	1645	1667	java/io/IOException
    //   1640	1645	1680	finally
    //   354	359	1697	java/io/IOException
    //   354	359	1710	finally
  }

  private a$o(i.b<o, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  public static o b(InputStream paramInputStream, g paramg)
  {
    AppMethodBeat.i(120665);
    paramInputStream = (o)BsC.j(paramInputStream, paramg);
    AppMethodBeat.o(120665);
    return paramInputStream;
  }

  private void ecA()
  {
    AppMethodBeat.i(120661);
    this.BsW = 6;
    this.Bus = 6;
    this.Buf = 0;
    this.But = a.aa.eeX();
    this.Buu = 0;
    this.Btp = Collections.emptyList();
    this.Buv = a.aa.eeX();
    this.Buw = 0;
    this.BtO = Collections.emptyList();
    this.BtC = a.ag.efM();
    this.BtD = Collections.emptyList();
    this.Bux = a.g.edH();
    AppMethodBeat.o(120661);
  }

  public static o eek()
  {
    return Bur;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120663);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x2) == 2)
      paramf.bq(1, this.Bus);
    if ((this.BsD & 0x4) == 4)
      paramf.bq(2, this.Buf);
    if ((this.BsD & 0x8) == 8)
      paramf.a(3, this.But);
    for (int j = 0; j < this.Btp.size(); j++)
      paramf.a(4, (q)this.Btp.get(j));
    if ((this.BsD & 0x20) == 32)
      paramf.a(5, this.Buv);
    for (j = 0; j < this.BtO.size(); j++)
      paramf.a(6, (q)this.BtO.get(j));
    if ((this.BsD & 0x10) == 16)
      paramf.bq(7, this.Buu);
    if ((this.BsD & 0x40) == 64)
      paramf.bq(8, this.Buw);
    if ((this.BsD & 0x1) == 1)
      paramf.bq(9, this.BsW);
    j = i;
    if ((this.BsD & 0x80) == 128)
      paramf.a(30, this.BtC);
    for (j = i; j < this.BtD.size(); j++)
      paramf.bq(31, ((Integer)this.BtD.get(j)).intValue());
    if ((this.BsD & 0x100) == 256)
      paramf.a(32, this.Bux);
    locala.b(19000, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120663);
  }

  public final boolean ecY()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final s<o> ecy()
  {
    return BsC;
  }

  public final boolean edW()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean edl()
  {
    if ((this.BsD & 0x80) == 128);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eel()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eem()
  {
    if ((this.BsD & 0x8) == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean een()
  {
    if ((this.BsD & 0x10) == 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeo()
  {
    if ((this.BsD & 0x20) == 32);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eep()
  {
    if ((this.BsD & 0x40) == 64);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean eeq()
  {
    if ((this.BsD & 0x100) == 256);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120662);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120662);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120662);
      }
      else if (!edW())
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120662);
      }
      else if ((eem()) && (!this.But.isInitialized()))
      {
        this.BsG = ((byte)0);
        AppMethodBeat.o(120662);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.Btp.size())
            break label150;
          if (!((a.ae)this.Btp.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120662);
            break;
          }
        }
        label150: if ((eeo()) && (!this.Buv.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120662);
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= this.BtO.size())
              break label237;
            if (!((a.ai)this.BtO.get(i)).isInitialized())
            {
              this.BsG = ((byte)0);
              AppMethodBeat.o(120662);
              break;
            }
          }
          label237: if ((edl()) && (!this.BtC.isInitialized()))
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120662);
          }
          else if ((eeq()) && (!this.Bux.isInitialized()))
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120662);
          }
          else if (!this.BzI.isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120662);
          }
          else
          {
            this.BsG = ((byte)1);
            AppMethodBeat.o(120662);
            bool = true;
          }
        }
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120664);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(120664);
      return i;
    }
    if ((this.BsD & 0x2) == 2);
    for (int j = f.bs(1, this.Bus) + 0; ; j = 0)
    {
      i = j;
      if ((this.BsD & 0x4) == 4)
        i = j + f.bs(2, this.Buf);
      j = i;
      if ((this.BsD & 0x8) == 8)
        j = i + f.c(3, this.But);
      int k = 0;
      i = j;
      for (j = k; j < this.Btp.size(); j++)
        i += f.c(4, (q)this.Btp.get(j));
      j = i;
      if ((this.BsD & 0x20) == 32)
        j = i + f.c(5, this.Buv);
      k = 0;
      i = j;
      for (j = k; j < this.BtO.size(); j++)
        i += f.c(6, (q)this.BtO.get(j));
      j = i;
      if ((this.BsD & 0x10) == 16)
        j = i + f.bs(7, this.Buu);
      k = j;
      if ((this.BsD & 0x40) == 64)
        k = j + f.bs(8, this.Buw);
      i = k;
      if ((this.BsD & 0x1) == 1)
        i = k + f.bs(9, this.BsW);
      j = i;
      if ((this.BsD & 0x80) == 128)
        j = i + f.c(30, this.BtC);
      k = 0;
      int m;
      for (i = 0; k < this.BtD.size(); i = m + i)
      {
        m = f.ft(((Integer)this.BtD.get(k)).intValue());
        k++;
      }
      j = j + i + this.BtD.size() * 2;
      i = j;
      if ((this.BsD & 0x100) == 256)
        i = j + f.c(32, this.Bux);
      i = i + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120664);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.o
 * JD-Core Version:    0.6.2
 */