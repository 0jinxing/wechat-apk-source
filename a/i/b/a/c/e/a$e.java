package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.f;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.c.a;
import a.i.b.a.c.g.q;
import a.i.b.a.c.g.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$e extends i.c<e>
  implements a.f
{
  public static s<e> BsC;
  private static final e BtN;
  private final d BsB;
  private int BsD;
  private byte BsG = (byte)-1;
  private int BsH = -1;
  public int BsW;
  public List<Integer> BtD;
  public List<a.ai> BtO;

  static
  {
    AppMethodBeat.i(120512);
    BsC = new a.e.1();
    e locale = new e();
    BtN = locale;
    locale.ecA();
    AppMethodBeat.o(120512);
  }

  private a$e()
  {
    this.BsB = d.Bzq;
  }

  // ERROR //
  private a$e(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 58	a/i/b/a/c/g/i$c:<init>	()V
    //   4: ldc 75
    //   6: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_m1
    //   11: i2b
    //   12: putfield 60	a/i/b/a/c/e/a$e:BsG	B
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 62	a/i/b/a/c/e/a$e:BsH	I
    //   20: aload_0
    //   21: invokespecial 53	a/i/b/a/c/e/a$e:ecA	()V
    //   24: iconst_0
    //   25: istore_3
    //   26: invokestatic 79	a/i/b/a/c/g/d:ehS	()La/i/b/a/c/g/d$b;
    //   29: astore 4
    //   31: aload 4
    //   33: iconst_1
    //   34: invokestatic 84	a/i/b/a/c/g/f:e	(Ljava/io/OutputStream;I)La/i/b/a/c/g/f;
    //   37: astore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: ifne +636 -> 680
    //   47: iload_3
    //   48: istore 7
    //   50: iload_3
    //   51: istore 8
    //   53: iload_3
    //   54: istore 9
    //   56: aload_1
    //   57: invokevirtual 90	a/i/b/a/c/g/e:vc	()I
    //   60: istore 10
    //   62: iload 10
    //   64: lookupswitch	default:+52->116, 0:+80->144, 8:+86->150, 18:+221->285, 248:+305->369, 250:+388->452
    //   117: istore 7
    //   119: iload_3
    //   120: istore 8
    //   122: iload_3
    //   123: istore 9
    //   125: aload_0
    //   126: aload_1
    //   127: aload 5
    //   129: aload_2
    //   130: iload 10
    //   132: invokevirtual 93	a/i/b/a/c/e/a$e:a	(La/i/b/a/c/g/e;La/i/b/a/c/g/f;La/i/b/a/c/g/g;I)Z
    //   135: ifne -93 -> 42
    //   138: iconst_1
    //   139: istore 6
    //   141: goto -99 -> 42
    //   144: iconst_1
    //   145: istore 6
    //   147: goto -105 -> 42
    //   150: iload_3
    //   151: istore 7
    //   153: iload_3
    //   154: istore 8
    //   156: iload_3
    //   157: istore 9
    //   159: aload_0
    //   160: aload_0
    //   161: getfield 95	a/i/b/a/c/e/a$e:BsD	I
    //   164: iconst_1
    //   165: ior
    //   166: putfield 95	a/i/b/a/c/e/a$e:BsD	I
    //   169: iload_3
    //   170: istore 7
    //   172: iload_3
    //   173: istore 8
    //   175: iload_3
    //   176: istore 9
    //   178: aload_0
    //   179: aload_1
    //   180: invokevirtual 98	a/i/b/a/c/g/e:vd	()I
    //   183: putfield 100	a/i/b/a/c/e/a$e:BsW	I
    //   186: goto -144 -> 42
    //   189: astore_1
    //   190: iload 7
    //   192: istore 8
    //   194: iload 8
    //   196: istore 10
    //   198: aload_1
    //   199: aload_0
    //   200: putfield 104	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   203: iload 8
    //   205: istore 10
    //   207: ldc 75
    //   209: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: iload 8
    //   214: istore 10
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: iload 10
    //   221: iconst_2
    //   222: iand
    //   223: iconst_2
    //   224: if_icmpne +14 -> 238
    //   227: aload_0
    //   228: aload_0
    //   229: getfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   232: invokestatic 112	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   235: putfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   238: iload 10
    //   240: iconst_4
    //   241: iand
    //   242: iconst_4
    //   243: if_icmpne +14 -> 257
    //   246: aload_0
    //   247: aload_0
    //   248: getfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   251: invokestatic 112	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   254: putfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   257: aload 5
    //   259: invokevirtual 117	a/i/b/a/c/g/f:flush	()V
    //   262: aload_0
    //   263: aload 4
    //   265: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   268: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   271: aload_0
    //   272: getfield 127	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   275: invokevirtual 132	a/i/b/a/c/g/h:eii	()V
    //   278: ldc 75
    //   280: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aload_1
    //   284: athrow
    //   285: iload_3
    //   286: iconst_2
    //   287: iand
    //   288: iconst_2
    //   289: if_icmpeq +525 -> 814
    //   292: iload_3
    //   293: istore 7
    //   295: iload_3
    //   296: istore 8
    //   298: iload_3
    //   299: istore 9
    //   301: new 134	java/util/ArrayList
    //   304: astore 11
    //   306: iload_3
    //   307: istore 7
    //   309: iload_3
    //   310: istore 8
    //   312: iload_3
    //   313: istore 9
    //   315: aload 11
    //   317: invokespecial 135	java/util/ArrayList:<init>	()V
    //   320: iload_3
    //   321: istore 7
    //   323: iload_3
    //   324: istore 8
    //   326: iload_3
    //   327: istore 9
    //   329: aload_0
    //   330: aload 11
    //   332: putfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   335: iload_3
    //   336: iconst_2
    //   337: ior
    //   338: istore_3
    //   339: iload_3
    //   340: istore 10
    //   342: iload_3
    //   343: istore 7
    //   345: iload_3
    //   346: istore 8
    //   348: aload_0
    //   349: getfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   352: aload_1
    //   353: getstatic 138	a/i/b/a/c/e/a$ai:BsC	La/i/b/a/c/g/s;
    //   356: aload_2
    //   357: invokevirtual 141	a/i/b/a/c/g/e:a	(La/i/b/a/c/g/s;La/i/b/a/c/g/g;)La/i/b/a/c/g/q;
    //   360: invokeinterface 147 2 0
    //   365: pop
    //   366: goto -324 -> 42
    //   369: iload_3
    //   370: iconst_4
    //   371: iand
    //   372: iconst_4
    //   373: if_icmpeq +438 -> 811
    //   376: iload_3
    //   377: istore 7
    //   379: iload_3
    //   380: istore 8
    //   382: iload_3
    //   383: istore 9
    //   385: new 134	java/util/ArrayList
    //   388: astore 11
    //   390: iload_3
    //   391: istore 7
    //   393: iload_3
    //   394: istore 8
    //   396: iload_3
    //   397: istore 9
    //   399: aload 11
    //   401: invokespecial 135	java/util/ArrayList:<init>	()V
    //   404: iload_3
    //   405: istore 7
    //   407: iload_3
    //   408: istore 8
    //   410: iload_3
    //   411: istore 9
    //   413: aload_0
    //   414: aload 11
    //   416: putfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   419: iload_3
    //   420: iconst_4
    //   421: ior
    //   422: istore_3
    //   423: iload_3
    //   424: istore 10
    //   426: iload_3
    //   427: istore 7
    //   429: iload_3
    //   430: istore 8
    //   432: aload_0
    //   433: getfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   436: aload_1
    //   437: invokevirtual 98	a/i/b/a/c/g/e:vd	()I
    //   440: invokestatic 153	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   443: invokeinterface 147 2 0
    //   448: pop
    //   449: goto -407 -> 42
    //   452: iload_3
    //   453: istore 7
    //   455: iload_3
    //   456: istore 8
    //   458: iload_3
    //   459: istore 9
    //   461: aload_1
    //   462: aload_1
    //   463: invokevirtual 98	a/i/b/a/c/g/e:vd	()I
    //   466: invokevirtual 157	a/i/b/a/c/g/e:fo	(I)I
    //   469: istore 12
    //   471: iload_3
    //   472: istore 10
    //   474: iload_3
    //   475: iconst_4
    //   476: iand
    //   477: iconst_4
    //   478: if_icmpeq +70 -> 548
    //   481: iload_3
    //   482: istore 7
    //   484: iload_3
    //   485: istore 10
    //   487: iload_3
    //   488: istore 8
    //   490: iload_3
    //   491: istore 9
    //   493: aload_1
    //   494: invokevirtual 160	a/i/b/a/c/g/e:vg	()I
    //   497: ifle +51 -> 548
    //   500: iload_3
    //   501: istore 7
    //   503: iload_3
    //   504: istore 8
    //   506: iload_3
    //   507: istore 9
    //   509: new 134	java/util/ArrayList
    //   512: astore 11
    //   514: iload_3
    //   515: istore 7
    //   517: iload_3
    //   518: istore 8
    //   520: iload_3
    //   521: istore 9
    //   523: aload 11
    //   525: invokespecial 135	java/util/ArrayList:<init>	()V
    //   528: iload_3
    //   529: istore 7
    //   531: iload_3
    //   532: istore 8
    //   534: iload_3
    //   535: istore 9
    //   537: aload_0
    //   538: aload 11
    //   540: putfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   543: iload_3
    //   544: iconst_4
    //   545: ior
    //   546: istore 10
    //   548: iload 10
    //   550: istore 7
    //   552: iload 10
    //   554: istore 8
    //   556: iload 10
    //   558: istore 9
    //   560: aload_1
    //   561: invokevirtual 160	a/i/b/a/c/g/e:vg	()I
    //   564: ifle +84 -> 648
    //   567: iload 10
    //   569: istore 7
    //   571: iload 10
    //   573: istore 8
    //   575: iload 10
    //   577: istore 9
    //   579: aload_0
    //   580: getfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   583: aload_1
    //   584: invokevirtual 98	a/i/b/a/c/g/e:vd	()I
    //   587: invokestatic 153	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   590: invokeinterface 147 2 0
    //   595: pop
    //   596: goto -48 -> 548
    //   599: astore_1
    //   600: iload 8
    //   602: istore 7
    //   604: iload 7
    //   606: istore 10
    //   608: new 72	a/i/b/a/c/g/k
    //   611: astore_2
    //   612: iload 7
    //   614: istore 10
    //   616: aload_2
    //   617: aload_1
    //   618: invokevirtual 164	java/io/IOException:getMessage	()Ljava/lang/String;
    //   621: invokespecial 167	a/i/b/a/c/g/k:<init>	(Ljava/lang/String;)V
    //   624: iload 7
    //   626: istore 10
    //   628: aload_2
    //   629: aload_0
    //   630: putfield 104	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   633: iload 7
    //   635: istore 10
    //   637: ldc 75
    //   639: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   642: iload 7
    //   644: istore 10
    //   646: aload_2
    //   647: athrow
    //   648: iload 10
    //   650: istore 7
    //   652: iload 10
    //   654: istore 8
    //   656: iload 10
    //   658: istore 9
    //   660: aload_1
    //   661: iload 12
    //   663: invokevirtual 170	a/i/b/a/c/g/e:fp	(I)V
    //   666: iload 10
    //   668: istore_3
    //   669: goto -627 -> 42
    //   672: astore_1
    //   673: iload 9
    //   675: istore 10
    //   677: goto -458 -> 219
    //   680: iload_3
    //   681: iconst_2
    //   682: iand
    //   683: iconst_2
    //   684: if_icmpne +14 -> 698
    //   687: aload_0
    //   688: aload_0
    //   689: getfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   692: invokestatic 112	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   695: putfield 106	a/i/b/a/c/e/a$e:BtO	Ljava/util/List;
    //   698: iload_3
    //   699: iconst_4
    //   700: iand
    //   701: iconst_4
    //   702: if_icmpne +14 -> 716
    //   705: aload_0
    //   706: aload_0
    //   707: getfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   710: invokestatic 112	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   713: putfield 114	a/i/b/a/c/e/a$e:BtD	Ljava/util/List;
    //   716: aload 5
    //   718: invokevirtual 117	a/i/b/a/c/g/f:flush	()V
    //   721: aload_0
    //   722: aload 4
    //   724: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   727: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   730: aload_0
    //   731: getfield 127	a/i/b/a/c/g/i$c:BzI	La/i/b/a/c/g/h;
    //   734: invokevirtual 132	a/i/b/a/c/g/h:eii	()V
    //   737: ldc 75
    //   739: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   742: return
    //   743: astore_1
    //   744: aload_0
    //   745: aload 4
    //   747: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   750: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   753: goto -23 -> 730
    //   756: astore_1
    //   757: aload_0
    //   758: aload 4
    //   760: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   763: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   766: ldc 75
    //   768: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   771: aload_1
    //   772: athrow
    //   773: astore_2
    //   774: aload_0
    //   775: aload 4
    //   777: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   780: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   783: goto -512 -> 271
    //   786: astore_1
    //   787: aload_0
    //   788: aload 4
    //   790: invokevirtual 123	a/i/b/a/c/g/d$b:ehW	()La/i/b/a/c/g/d;
    //   793: putfield 69	a/i/b/a/c/e/a$e:BsB	La/i/b/a/c/g/d;
    //   796: ldc 75
    //   798: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   801: aload_1
    //   802: athrow
    //   803: astore_1
    //   804: goto -200 -> 604
    //   807: astore_1
    //   808: goto -614 -> 194
    //   811: goto -388 -> 423
    //   814: goto -475 -> 339
    //
    // Exception table:
    //   from	to	target	type
    //   56	62	189	a/i/b/a/c/g/k
    //   125	138	189	a/i/b/a/c/g/k
    //   159	169	189	a/i/b/a/c/g/k
    //   178	186	189	a/i/b/a/c/g/k
    //   301	306	189	a/i/b/a/c/g/k
    //   315	320	189	a/i/b/a/c/g/k
    //   329	335	189	a/i/b/a/c/g/k
    //   385	390	189	a/i/b/a/c/g/k
    //   399	404	189	a/i/b/a/c/g/k
    //   413	419	189	a/i/b/a/c/g/k
    //   461	471	189	a/i/b/a/c/g/k
    //   493	500	189	a/i/b/a/c/g/k
    //   509	514	189	a/i/b/a/c/g/k
    //   523	528	189	a/i/b/a/c/g/k
    //   537	543	189	a/i/b/a/c/g/k
    //   560	567	189	a/i/b/a/c/g/k
    //   579	596	189	a/i/b/a/c/g/k
    //   660	666	189	a/i/b/a/c/g/k
    //   198	203	218	finally
    //   207	212	218	finally
    //   216	218	218	finally
    //   348	366	218	finally
    //   432	449	218	finally
    //   608	612	218	finally
    //   616	624	218	finally
    //   628	633	218	finally
    //   637	642	218	finally
    //   646	648	218	finally
    //   56	62	599	java/io/IOException
    //   125	138	599	java/io/IOException
    //   159	169	599	java/io/IOException
    //   178	186	599	java/io/IOException
    //   301	306	599	java/io/IOException
    //   315	320	599	java/io/IOException
    //   329	335	599	java/io/IOException
    //   385	390	599	java/io/IOException
    //   399	404	599	java/io/IOException
    //   413	419	599	java/io/IOException
    //   461	471	599	java/io/IOException
    //   493	500	599	java/io/IOException
    //   509	514	599	java/io/IOException
    //   523	528	599	java/io/IOException
    //   537	543	599	java/io/IOException
    //   560	567	599	java/io/IOException
    //   579	596	599	java/io/IOException
    //   660	666	599	java/io/IOException
    //   56	62	672	finally
    //   125	138	672	finally
    //   159	169	672	finally
    //   178	186	672	finally
    //   301	306	672	finally
    //   315	320	672	finally
    //   329	335	672	finally
    //   385	390	672	finally
    //   399	404	672	finally
    //   413	419	672	finally
    //   461	471	672	finally
    //   493	500	672	finally
    //   509	514	672	finally
    //   523	528	672	finally
    //   537	543	672	finally
    //   560	567	672	finally
    //   579	596	672	finally
    //   660	666	672	finally
    //   716	721	743	java/io/IOException
    //   716	721	756	finally
    //   257	262	773	java/io/IOException
    //   257	262	786	finally
    //   348	366	803	java/io/IOException
    //   432	449	803	java/io/IOException
    //   348	366	807	a/i/b/a/c/g/k
    //   432	449	807	a/i/b/a/c/g/k
  }

  private a$e(i.b<e, ?> paramb)
  {
    super(paramb);
    this.BsB = paramb.BsB;
  }

  private void ecA()
  {
    AppMethodBeat.i(120506);
    this.BsW = 6;
    this.BtO = Collections.emptyList();
    this.BtD = Collections.emptyList();
    AppMethodBeat.o(120506);
  }

  public static e edC()
  {
    return BtN;
  }

  public final void a(f paramf)
  {
    int i = 0;
    AppMethodBeat.i(120508);
    vq();
    i.c.a locala = eip();
    if ((this.BsD & 0x1) == 1)
      paramf.bq(1, this.BsW);
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= this.BtO.size())
        break;
      paramf.a(2, (q)this.BtO.get(j));
    }
    while (k < this.BtD.size())
    {
      paramf.bq(31, ((Integer)this.BtD.get(k)).intValue());
      k++;
    }
    locala.b(19000, paramf);
    paramf.d(this.BsB);
    AppMethodBeat.o(120508);
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

  public final s<e> ecy()
  {
    return BsC;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120507);
    int i = this.BsG;
    if (i == 1)
    {
      AppMethodBeat.o(120507);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        AppMethodBeat.o(120507);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= this.BtO.size())
            break label92;
          if (!((a.ai)this.BtO.get(i)).isInitialized())
          {
            this.BsG = ((byte)0);
            AppMethodBeat.o(120507);
            break;
          }
        }
        label92: if (!this.BzI.isInitialized())
        {
          this.BsG = ((byte)0);
          AppMethodBeat.o(120507);
        }
        else
        {
          this.BsG = ((byte)1);
          AppMethodBeat.o(120507);
          bool = true;
        }
      }
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(120509);
    int i = this.BsH;
    if (i != -1)
    {
      AppMethodBeat.o(120509);
      return i;
    }
    if ((this.BsD & 0x1) == 1);
    for (i = f.bs(1, this.BsW) + 0; ; i = 0)
    {
      for (int j = 0; j < this.BtO.size(); j++)
        i += f.c(2, (q)this.BtO.get(j));
      int k = 0;
      int m;
      for (j = 0; k < this.BtD.size(); j = m + j)
      {
        m = f.ft(((Integer)this.BtD.get(k)).intValue());
        k++;
      }
      i = i + j + this.BtD.size() * 2 + this.BzI.vq() + this.BsB.size();
      this.BsH = i;
      AppMethodBeat.o(120509);
      break;
    }
  }

  public static final class a extends i.b<a.e, a>
    implements a.f
  {
    private int BsD;
    private int BsW;
    private List<Integer> BtD;
    private List<a.ai> BtO;

    private a()
    {
      AppMethodBeat.i(120486);
      this.BsW = 6;
      this.BtO = Collections.emptyList();
      this.BtD = Collections.emptyList();
      AppMethodBeat.o(120486);
    }

    private a Tc(int paramInt)
    {
      this.BsD |= 1;
      this.BsW = paramInt;
      return this;
    }

    private a edD()
    {
      AppMethodBeat.i(120487);
      a locala = new a().d(edE());
      AppMethodBeat.o(120487);
      return locala;
    }

    private a.e edE()
    {
      int i = 1;
      AppMethodBeat.i(120488);
      a.e locale = new a.e(this, (byte)0);
      if ((this.BsD & 0x1) == 1);
      while (true)
      {
        a.e.a(locale, this.BsW);
        if ((this.BsD & 0x2) == 2)
        {
          this.BtO = Collections.unmodifiableList(this.BtO);
          this.BsD &= -3;
        }
        a.e.a(locale, this.BtO);
        if ((this.BsD & 0x4) == 4)
        {
          this.BtD = Collections.unmodifiableList(this.BtD);
          this.BsD &= -5;
        }
        a.e.b(locale, this.BtD);
        a.e.b(locale, i);
        AppMethodBeat.o(120488);
        return locale;
        i = 0;
      }
    }

    private void edF()
    {
      AppMethodBeat.i(120492);
      if ((this.BsD & 0x2) != 2)
      {
        this.BtO = new ArrayList(this.BtO);
        this.BsD |= 2;
      }
      AppMethodBeat.o(120492);
    }

    private void edz()
    {
      AppMethodBeat.i(120493);
      if ((this.BsD & 0x4) != 4)
      {
        this.BtD = new ArrayList(this.BtD);
        this.BsD |= 4;
      }
      AppMethodBeat.o(120493);
    }

    // ERROR //
    private a h(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
    {
      // Byte code:
      //   0: ldc 99
      //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_3
      //   7: getstatic 103	a/i/b/a/c/e/a$e:BsC	La/i/b/a/c/g/s;
      //   10: aload_1
      //   11: aload_2
      //   12: invokeinterface 108 3 0
      //   17: checkcast 9	a/i/b/a/c/e/a$e
      //   20: astore_1
      //   21: aload_0
      //   22: aload_1
      //   23: invokevirtual 64	a/i/b/a/c/e/a$e$a:d	(La/i/b/a/c/e/a$e;)La/i/b/a/c/e/a$e$a;
      //   26: pop
      //   27: ldc 99
      //   29: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   32: aload_0
      //   33: areturn
      //   34: astore_1
      //   35: aload_1
      //   36: getfield 112	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
      //   39: checkcast 9	a/i/b/a/c/e/a$e
      //   42: astore_2
      //   43: ldc 99
      //   45: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   48: aload_1
      //   49: athrow
      //   50: astore_1
      //   51: aload_2
      //   52: ifnull +9 -> 61
      //   55: aload_0
      //   56: aload_2
      //   57: invokevirtual 64	a/i/b/a/c/e/a$e$a:d	(La/i/b/a/c/e/a$e;)La/i/b/a/c/e/a$e$a;
      //   60: pop
      //   61: ldc 99
      //   63: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   66: aload_1
      //   67: athrow
      //   68: astore_1
      //   69: aload_3
      //   70: astore_2
      //   71: goto -20 -> 51
      //
      // Exception table:
      //   from	to	target	type
      //   7	21	34	a/i/b/a/c/g/k
      //   43	50	50	finally
      //   7	21	68	finally
      //   35	43	68	finally
    }

    public final a d(a.e parame)
    {
      AppMethodBeat.i(120489);
      if (parame == a.e.edC())
      {
        AppMethodBeat.o(120489);
        return this;
      }
      if (parame.ecY())
        Tc(parame.BsW);
      if (!a.e.a(parame).isEmpty())
      {
        if (this.BtO.isEmpty())
        {
          this.BtO = a.e.a(parame);
          this.BsD &= -3;
        }
      }
      else
        label78: if (!a.e.b(parame).isEmpty())
        {
          if (!this.BtD.isEmpty())
            break label170;
          this.BtD = a.e.b(parame);
          this.BsD &= -5;
        }
      while (true)
      {
        a(parame);
        this.BsB = this.BsB.a(a.e.c(parame));
        AppMethodBeat.o(120489);
        break;
        edF();
        this.BtO.addAll(a.e.a(parame));
        break label78;
        label170: edz();
        this.BtD.addAll(a.e.b(parame));
      }
    }

    public final boolean isInitialized()
    {
      boolean bool = false;
      AppMethodBeat.i(120490);
      int i = 0;
      if (i < this.BtO.size())
        if (!((a.ai)this.BtO.get(i)).isInitialized())
          AppMethodBeat.o(120490);
      while (true)
      {
        return bool;
        i++;
        break;
        if (!this.BzI.isInitialized())
        {
          AppMethodBeat.o(120490);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(120490);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.e
 * JD-Core Version:    0.6.2
 */