package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.i;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a$i extends i
  implements a.j
{
  public static s<i> BsC;
  private static final i BtR;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  a.i.b BtS;
  private List<a.m> BtT;
  a.m BtU;
  a.i.c BtV;

  static
  {
    AppMethodBeat.i(120576);
    BsC = new a.i.1();
    i locali = new i();
    BtR = locali;
    locali.ecA();
    AppMethodBeat.o(120576);
  }

  private a$i()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$i(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	a/i/b/a/c/g/i:<init>	()V
    //   4: ldc 79
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 64	a/i/b/a/c/e/a$i:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 66	a/i/b/a/c/e/a$i:BsH	I
    //   20: aload_0
    //   21: invokespecial 57	a/i/b/a/c/e/a$i:ecA	()V
    //   24: invokestatic 83	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_1
    //   30: invokestatic 89	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   33: astore 4
    //   35: iconst_0
    //   36: istore 5
    //   38: iconst_0
    //   39: istore 6
    //   41: iload 5
    //   43: ifne +726 -> 769
    //   46: iload 6
    //   48: istore 7
    //   50: iload 6
    //   52: istore 8
    //   54: iload 6
    //   56: istore 9
    //   58: aload_1
    //   59: invokevirtual 95	a/i/b/a/c/g/e:vc	()I
    //   62: istore 10
    //   64: iload 10
    //   66: lookupswitch	default:+50->116, 0:+81->147, 8:+87->153, 18:+327->393, 26:+434->500, 32:+577->643
    //   117: iconst_3
    //   118: istore 7
    //   120: iload 6
    //   122: istore 8
    //   124: iload 6
    //   126: istore 9
    //   128: aload_0
    //   129: aload_1
    //   130: aload 4
    //   132: aload_2
    //   133: iload 10
    //   135: invokevirtual 99	a/i/b/a/c/e/a$i:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   138: ifne -97 -> 41
    //   141: iconst_1
    //   142: istore 5
    //   144: goto -103 -> 41
    //   147: iconst_1
    //   148: istore 5
    //   150: goto -109 -> 41
    //   153: iload 6
    //   155: istore 7
    //   157: iload 6
    //   159: istore 8
    //   161: iload 6
    //   163: istore 9
    //   165: aload_1
    //   166: invokevirtual 102	a/i/b/a/c/g/e:vd	()I
    //   169: istore 11
    //   171: iload 6
    //   173: istore 7
    //   175: iload 6
    //   177: istore 8
    //   179: iload 6
    //   181: istore 9
    //   183: iload 11
    //   185: invokestatic 106	a/i/b/a/c/e/a$i$b:Td	(I)La/i/b/a/c/e/a$i$b;
    //   188: astore 12
    //   190: aload 12
    //   192: ifnonnull +113 -> 305
    //   195: iload 6
    //   197: istore 7
    //   199: iload 6
    //   201: istore 8
    //   203: iload 6
    //   205: istore 9
    //   207: aload 4
    //   209: iload 10
    //   211: invokevirtual 109	a/i/b/a/c/g/f:fw	(I)V
    //   214: iload 6
    //   216: istore 7
    //   218: iload 6
    //   220: istore 8
    //   222: iload 6
    //   224: istore 9
    //   226: aload 4
    //   228: iload 11
    //   230: invokevirtual 109	a/i/b/a/c/g/f:fw	(I)V
    //   233: goto -192 -> 41
    //   236: astore_1
    //   237: iload 7
    //   239: istore 8
    //   241: aload_1
    //   242: aload_0
    //   243: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   246: iload 7
    //   248: istore 8
    //   250: ldc 79
    //   252: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: iload 7
    //   257: istore 8
    //   259: aload_1
    //   260: athrow
    //   261: astore_1
    //   262: iload 8
    //   264: iconst_2
    //   265: iand
    //   266: iconst_2
    //   267: if_icmpne +14 -> 281
    //   270: aload_0
    //   271: aload_0
    //   272: getfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   275: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   278: putfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   281: aload 4
    //   283: invokevirtual 124	a/i/b/a/c/g/f:flush	()V
    //   286: aload_0
    //   287: aload_3
    //   288: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   291: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   294: aload_0
    //   295: invokevirtual 133	a/i/b/a/c/e/a$i:eio	()V
    //   298: ldc 79
    //   300: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload_1
    //   304: athrow
    //   305: iload 6
    //   307: istore 7
    //   309: iload 6
    //   311: istore 8
    //   313: iload 6
    //   315: istore 9
    //   317: aload_0
    //   318: aload_0
    //   319: getfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   322: iconst_1
    //   323: ior
    //   324: putfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   327: iload 6
    //   329: istore 7
    //   331: iload 6
    //   333: istore 8
    //   335: iload 6
    //   337: istore 9
    //   339: aload_0
    //   340: aload 12
    //   342: putfield 137	a/i/b/a/c/e/a$i:BtS	La/i/b/a/c/e/a$i$b;
    //   345: goto -304 -> 41
    //   348: astore_2
    //   349: iload 9
    //   351: istore 8
    //   353: new 76	a/i/b/a/c/g/k
    //   356: astore_1
    //   357: iload 9
    //   359: istore 8
    //   361: aload_1
    //   362: aload_2
    //   363: invokevirtual 141	java/io/IOException:getMessage	()Ljava/lang/String;
    //   366: invokespecial 144	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   369: iload 9
    //   371: istore 8
    //   373: aload_1
    //   374: aload_0
    //   375: putfield 113	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   378: iload 9
    //   380: istore 8
    //   382: ldc 79
    //   384: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   387: iload 9
    //   389: istore 8
    //   391: aload_1
    //   392: athrow
    //   393: iload 6
    //   395: istore 10
    //   397: iload 6
    //   399: iconst_2
    //   400: iand
    //   401: iconst_2
    //   402: if_icmpeq +61 -> 463
    //   405: iload 6
    //   407: istore 7
    //   409: iload 6
    //   411: istore 8
    //   413: iload 6
    //   415: istore 9
    //   417: new 146	java/util/ArrayList
    //   420: astore 12
    //   422: iload 6
    //   424: istore 7
    //   426: iload 6
    //   428: istore 8
    //   430: iload 6
    //   432: istore 9
    //   434: aload 12
    //   436: invokespecial 147	java/util/ArrayList:<init>	()V
    //   439: iload 6
    //   441: istore 7
    //   443: iload 6
    //   445: istore 8
    //   447: iload 6
    //   449: istore 9
    //   451: aload_0
    //   452: aload 12
    //   454: putfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   457: iload 6
    //   459: iconst_2
    //   460: ior
    //   461: istore 10
    //   463: iload 10
    //   465: istore 7
    //   467: iload 10
    //   469: istore 8
    //   471: iload 10
    //   473: istore 9
    //   475: aload_0
    //   476: getfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   479: aload_1
    //   480: getstatic 150	a/i/b/a/c/e/a$m:BsC	La/i/b/a/c/g/s;
    //   483: aload_2
    //   484: invokevirtual 153	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   487: invokeinterface 159 2 0
    //   492: pop
    //   493: iload 10
    //   495: istore 6
    //   497: goto -456 -> 41
    //   500: iload 6
    //   502: istore 7
    //   504: iload 6
    //   506: istore 8
    //   508: iload 6
    //   510: istore 9
    //   512: aload_0
    //   513: getfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   516: iconst_2
    //   517: iand
    //   518: iconst_2
    //   519: if_icmpne +348 -> 867
    //   522: iload 6
    //   524: istore 7
    //   526: iload 6
    //   528: istore 8
    //   530: iload 6
    //   532: istore 9
    //   534: aload_0
    //   535: getfield 161	a/i/b/a/c/e/a$i:BtU	La/i/b/a/c/e/a$m;
    //   538: invokestatic 165	a/i/b/a/c/e/a$m:b	(La/i/b/a/c/e/a$m;)La/i/b/a/c/e/a$m$a;
    //   541: astore 12
    //   543: iload 6
    //   545: istore 7
    //   547: iload 6
    //   549: istore 8
    //   551: iload 6
    //   553: istore 9
    //   555: aload_0
    //   556: aload_1
    //   557: getstatic 150	a/i/b/a/c/e/a$m:BsC	La/i/b/a/c/g/s;
    //   560: aload_2
    //   561: invokevirtual 153	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   564: checkcast 149	a/i/b/a/c/e/a$m
    //   567: putfield 161	a/i/b/a/c/e/a$i:BtU	La/i/b/a/c/e/a$m;
    //   570: aload 12
    //   572: ifnull +46 -> 618
    //   575: iload 6
    //   577: istore 7
    //   579: iload 6
    //   581: istore 8
    //   583: iload 6
    //   585: istore 9
    //   587: aload 12
    //   589: aload_0
    //   590: getfield 161	a/i/b/a/c/e/a$i:BtU	La/i/b/a/c/e/a$m;
    //   593: invokevirtual 170	a/i/b/a/c/e/a$m$a:f	(La/i/b/a/c/e/a$m;)La/i/b/a/c/e/a$m$a;
    //   596: pop
    //   597: iload 6
    //   599: istore 7
    //   601: iload 6
    //   603: istore 8
    //   605: iload 6
    //   607: istore 9
    //   609: aload_0
    //   610: aload 12
    //   612: invokevirtual 174	a/i/b/a/c/e/a$m$a:eeg	()La/i/b/a/c/e/a$m;
    //   615: putfield 161	a/i/b/a/c/e/a$i:BtU	La/i/b/a/c/e/a$m;
    //   618: iload 6
    //   620: istore 7
    //   622: iload 6
    //   624: istore 8
    //   626: iload 6
    //   628: istore 9
    //   630: aload_0
    //   631: aload_0
    //   632: getfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   635: iconst_2
    //   636: ior
    //   637: putfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   640: goto -599 -> 41
    //   643: iload 6
    //   645: istore 7
    //   647: iload 6
    //   649: istore 8
    //   651: iload 6
    //   653: istore 9
    //   655: aload_1
    //   656: invokevirtual 102	a/i/b/a/c/g/e:vd	()I
    //   659: istore 11
    //   661: iload 6
    //   663: istore 7
    //   665: iload 6
    //   667: istore 8
    //   669: iload 6
    //   671: istore 9
    //   673: iload 11
    //   675: invokestatic 178	a/i/b/a/c/e/a$i$c:Te	(I)La/i/b/a/c/e/a$i$c;
    //   678: astore 12
    //   680: aload 12
    //   682: ifnonnull +44 -> 726
    //   685: iload 6
    //   687: istore 7
    //   689: iload 6
    //   691: istore 8
    //   693: iload 6
    //   695: istore 9
    //   697: aload 4
    //   699: iload 10
    //   701: invokevirtual 109	a/i/b/a/c/g/f:fw	(I)V
    //   704: iload 6
    //   706: istore 7
    //   708: iload 6
    //   710: istore 8
    //   712: iload 6
    //   714: istore 9
    //   716: aload 4
    //   718: iload 11
    //   720: invokevirtual 109	a/i/b/a/c/g/f:fw	(I)V
    //   723: goto -682 -> 41
    //   726: iload 6
    //   728: istore 7
    //   730: iload 6
    //   732: istore 8
    //   734: iload 6
    //   736: istore 9
    //   738: aload_0
    //   739: aload_0
    //   740: getfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   743: iconst_4
    //   744: ior
    //   745: putfield 135	a/i/b/a/c/e/a$i:BsD	I
    //   748: iload 6
    //   750: istore 7
    //   752: iload 6
    //   754: istore 8
    //   756: iload 6
    //   758: istore 9
    //   760: aload_0
    //   761: aload 12
    //   763: putfield 180	a/i/b/a/c/e/a$i:BtV	La/i/b/a/c/e/a$i$c;
    //   766: goto -725 -> 41
    //   769: iload 6
    //   771: iconst_2
    //   772: iand
    //   773: iconst_2
    //   774: if_icmpne +14 -> 788
    //   777: aload_0
    //   778: aload_0
    //   779: getfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   782: invokestatic 121	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   785: putfield 115	a/i/b/a/c/e/a$i:BtT	Ljava/util/List;
    //   788: aload 4
    //   790: invokevirtual 124	a/i/b/a/c/g/f:flush	()V
    //   793: aload_0
    //   794: aload_3
    //   795: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   798: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   801: aload_0
    //   802: invokevirtual 133	a/i/b/a/c/e/a$i:eio	()V
    //   805: ldc 79
    //   807: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   810: return
    //   811: astore_1
    //   812: aload_0
    //   813: aload_3
    //   814: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   817: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   820: goto -19 -> 801
    //   823: astore_1
    //   824: aload_0
    //   825: aload_3
    //   826: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   829: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   832: ldc 79
    //   834: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   837: aload_1
    //   838: athrow
    //   839: astore_2
    //   840: aload_0
    //   841: aload_3
    //   842: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   845: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   848: goto -554 -> 294
    //   851: astore_1
    //   852: aload_0
    //   853: aload_3
    //   854: invokevirtual 130	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   857: putfield 73	a/i/b/a/c/e/a$i:BsB	La/i/b/a/c/g/d;
    //   860: ldc 79
    //   862: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   865: aload_1
    //   866: athrow
    //   867: aconst_null
    //   868: astore 12
    //   870: goto -327 -> 543
    //
    // Exception table:
    //   from	to	target	type
    //   58	64	236	a/i/b/a/c/g/k
    //   128	141	236	a/i/b/a/c/g/k
    //   165	171	236	a/i/b/a/c/g/k
    //   183	190	236	a/i/b/a/c/g/k
    //   207	214	236	a/i/b/a/c/g/k
    //   226	233	236	a/i/b/a/c/g/k
    //   317	327	236	a/i/b/a/c/g/k
    //   339	345	236	a/i/b/a/c/g/k
    //   417	422	236	a/i/b/a/c/g/k
    //   434	439	236	a/i/b/a/c/g/k
    //   451	457	236	a/i/b/a/c/g/k
    //   475	493	236	a/i/b/a/c/g/k
    //   512	522	236	a/i/b/a/c/g/k
    //   534	543	236	a/i/b/a/c/g/k
    //   555	570	236	a/i/b/a/c/g/k
    //   587	597	236	a/i/b/a/c/g/k
    //   609	618	236	a/i/b/a/c/g/k
    //   630	640	236	a/i/b/a/c/g/k
    //   655	661	236	a/i/b/a/c/g/k
    //   673	680	236	a/i/b/a/c/g/k
    //   697	704	236	a/i/b/a/c/g/k
    //   716	723	236	a/i/b/a/c/g/k
    //   738	748	236	a/i/b/a/c/g/k
    //   760	766	236	a/i/b/a/c/g/k
    //   58	64	261	finally
    //   128	141	261	finally
    //   165	171	261	finally
    //   183	190	261	finally
    //   207	214	261	finally
    //   226	233	261	finally
    //   241	246	261	finally
    //   250	255	261	finally
    //   259	261	261	finally
    //   317	327	261	finally
    //   339	345	261	finally
    //   353	357	261	finally
    //   361	369	261	finally
    //   373	378	261	finally
    //   382	387	261	finally
    //   391	393	261	finally
    //   417	422	261	finally
    //   434	439	261	finally
    //   451	457	261	finally
    //   475	493	261	finally
    //   512	522	261	finally
    //   534	543	261	finally
    //   555	570	261	finally
    //   587	597	261	finally
    //   609	618	261	finally
    //   630	640	261	finally
    //   655	661	261	finally
    //   673	680	261	finally
    //   697	704	261	finally
    //   716	723	261	finally
    //   738	748	261	finally
    //   760	766	261	finally
    //   58	64	348	java/io/IOException
    //   128	141	348	java/io/IOException
    //   165	171	348	java/io/IOException
    //   183	190	348	java/io/IOException
    //   207	214	348	java/io/IOException
    //   226	233	348	java/io/IOException
    //   317	327	348	java/io/IOException
    //   339	345	348	java/io/IOException
    //   417	422	348	java/io/IOException
    //   434	439	348	java/io/IOException
    //   451	457	348	java/io/IOException
    //   475	493	348	java/io/IOException
    //   512	522	348	java/io/IOException
    //   534	543	348	java/io/IOException
    //   555	570	348	java/io/IOException
    //   587	597	348	java/io/IOException
    //   609	618	348	java/io/IOException
    //   630	640	348	java/io/IOException
    //   655	661	348	java/io/IOException
    //   673	680	348	java/io/IOException
    //   697	704	348	java/io/IOException
    //   716	723	348	java/io/IOException
    //   738	748	348	java/io/IOException
    //   760	766	348	java/io/IOException
    //   788	793	811	java/io/IOException
    //   788	793	823	finally
    //   281	286	839	java/io/IOException
    //   281	286	851	finally
  }

  private a$i(i.a parama)
  {
    super((byte)0);
    this.BsB = parama.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120570);
    this.BtS = a.i.b.BtW;
    this.BtT = Collections.emptyList();
    this.BtU = a.m.eea();
    this.BtV = a.i.c.Bua;
    AppMethodBeat.o(120570);
  }

  public static i edN()
  {
    return BtR;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(120572);
    vq();
    if ((this.BsD & 0x1) == 1)
      paramf.io(1, this.BtS.value);
    for (int i = 0; i < this.BtT.size(); i++)
      paramf.a(2, (q)this.BtT.get(i));
    if ((this.BsD & 0x2) == 2)
      paramf.a(3, this.BtU);
    if ((this.BsD & 0x4) == 4)
      paramf.io(4, this.BtV.value);
    paramf.d(this.BsB);
    AppMethodBeat.o(120572);
  }

  public final s<i> ecy()
  {
    return BsC;
  }

  public final boolean edO()
  {
    boolean bool = true;
    if ((this.BsD & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean edP()
  {
    if ((this.BsD & 0x2) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean edQ()
  {
    if ((this.BsD & 0x4) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120571);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120571);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120571);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BtT.size())
            break label96;
          if (!((a.m)this.BtT.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120571);
            break;
          }
        }
        label96: if ((edP()) && (!this.BtU.isInitialized()))
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120571);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120571);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    int i = 0;
    AppMethodBeat.i(120573);
    int j = this.BsH;
    if (j != -1)
    {
      AppMethodBeat.o(120573);
      return j;
    }
    if ((this.BsD & 0x1) == 1)
      j = f.ip(1, this.BtS.value) + 0;
    while (true)
      if (i < this.BtT.size())
      {
        int k = f.c(2, (q)this.BtT.get(i));
        i++;
        j = k + j;
      }
      else
      {
        i = j;
        if ((this.BsD & 0x2) == 2)
          i = j + f.c(3, this.BtU);
        j = i;
        if ((this.BsD & 0x4) == 4)
          j = i + f.ip(4, this.BtV.value);
        j = this.BsB.size() + j;
        this.BsH = j;
        AppMethodBeat.o(120573);
        break;
        j = 0;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.i
 * JD-Core Version:    0.6.2
 */