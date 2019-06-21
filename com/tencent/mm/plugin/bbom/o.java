package com.tencent.mm.plugin.bbom;

import com.tencent.mm.plugin.zero.a.c;

public final class o
  implements c
{
  // ERROR //
  public final void a(com.tencent.mm.booter.NotifyReceiver.NotifyService paramNotifyService, int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    // Byte code:
    //   0: sipush 18274
    //   3: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_2
    //   7: lookupswitch	default:+73->80, 10:+80->87, 102:+586->593, 120:+183->190, 174:+537->544, 192:+602->609, 241:+697->704, 318:+825->832, 268369923:+635->642
    //   81: dstore_0
    //   82: fadd
    //   83: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: return
    //   87: ldc 28
    //   89: ldc 30
    //   91: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: new 38	com/tencent/mm/protocal/p$b
    //   97: dup
    //   98: invokespecial 39	com/tencent/mm/protocal/p$b:<init>	()V
    //   101: astore_1
    //   102: aload_1
    //   103: invokestatic 45	com/tencent/mm/compatible/e/q:LM	()Ljava/lang/String;
    //   106: putfield 49	com/tencent/mm/protocal/p$b:deviceID	Ljava/lang/String;
    //   109: new 51	com/tencent/mm/ai/v
    //   112: dup
    //   113: aload_1
    //   114: bipush 10
    //   116: invokespecial 54	com/tencent/mm/ai/v:<init>	(Lcom/tencent/mm/protocal/l$e;I)V
    //   119: astore 4
    //   121: aload 4
    //   123: bipush 10
    //   125: aload_3
    //   126: aconst_null
    //   127: lconst_0
    //   128: invokevirtual 57	com/tencent/mm/ai/v:a	(I[B[BJ)Z
    //   131: ifeq +28 -> 159
    //   134: invokestatic 63	com/tencent/mm/model/aw:Rg	()Lcom/tencent/mm/ai/p;
    //   137: astore_3
    //   138: new 65	com/tencent/mm/modelsimple/f
    //   141: astore 4
    //   143: aload 4
    //   145: aload_1
    //   146: invokespecial 68	com/tencent/mm/modelsimple/f:<init>	(Lcom/tencent/mm/protocal/l$e;)V
    //   149: aload_3
    //   150: iconst_0
    //   151: iconst_0
    //   152: ldc 70
    //   154: aload 4
    //   156: invokevirtual 76	com/tencent/mm/ai/p:onSceneEnd	(IILjava/lang/String;Lcom/tencent/mm/ai/m;)V
    //   159: sipush 18274
    //   162: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -79 -> 86
    //   168: astore_1
    //   169: ldc 28
    //   171: aload_1
    //   172: ldc 70
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: sipush 18274
    //   184: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -101 -> 86
    //   190: ldc 82
    //   192: invokestatic 88	com/tencent/mm/booter/NotifyReceiver$NotifyService:jG	(Ljava/lang/String;)V
    //   195: new 90	com/tencent/mm/g/a/sz
    //   198: dup
    //   199: invokespecial 91	com/tencent/mm/g/a/sz:<init>	()V
    //   202: astore_1
    //   203: aload_1
    //   204: getfield 95	com/tencent/mm/g/a/sz:cPf	Lcom/tencent/mm/g/a/sz$a;
    //   207: iconst_1
    //   208: putfield 101	com/tencent/mm/g/a/sz$a:cPh	Z
    //   211: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   214: aload_1
    //   215: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   218: pop
    //   219: aload_1
    //   220: getfield 115	com/tencent/mm/g/a/sz:cPg	Lcom/tencent/mm/g/a/sz$b;
    //   223: getfield 120	com/tencent/mm/g/a/sz$b:cPj	Ljava/lang/String;
    //   226: astore_1
    //   227: aload_1
    //   228: invokestatic 126	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   231: ifne +41 -> 272
    //   234: ldc 28
    //   236: ldc 128
    //   238: aload_1
    //   239: invokestatic 134	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   242: invokevirtual 138	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   245: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: new 90	com/tencent/mm/g/a/sz
    //   251: dup
    //   252: invokespecial 91	com/tencent/mm/g/a/sz:<init>	()V
    //   255: astore_1
    //   256: aload_1
    //   257: getfield 95	com/tencent/mm/g/a/sz:cPf	Lcom/tencent/mm/g/a/sz$a;
    //   260: iconst_1
    //   261: putfield 144	com/tencent/mm/g/a/sz$a:cPi	Z
    //   264: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   267: aload_1
    //   268: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   271: pop
    //   272: aload_3
    //   273: ifnull -193 -> 80
    //   276: aload_3
    //   277: arraylength
    //   278: ifle -198 -> 80
    //   281: aload_3
    //   282: iconst_0
    //   283: baload
    //   284: iconst_1
    //   285: if_icmpne +51 -> 336
    //   288: ldc 28
    //   290: ldc 146
    //   292: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: new 148	com/tencent/mm/g/a/ui
    //   298: dup
    //   299: invokespecial 149	com/tencent/mm/g/a/ui:<init>	()V
    //   302: astore_1
    //   303: aload_1
    //   304: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   307: iconst_3
    //   308: putfield 159	com/tencent/mm/g/a/ui$a:cAd	I
    //   311: aload_1
    //   312: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   315: aload_3
    //   316: putfield 163	com/tencent/mm/g/a/ui$a:cQr	[B
    //   319: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   322: aload_1
    //   323: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   326: pop
    //   327: sipush 18274
    //   330: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: goto -247 -> 86
    //   336: aload_3
    //   337: iconst_0
    //   338: baload
    //   339: bipush 101
    //   341: if_icmpne +43 -> 384
    //   344: ldc 28
    //   346: ldc 165
    //   348: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   351: new 167	com/tencent/mm/g/a/is
    //   354: dup
    //   355: invokespecial 168	com/tencent/mm/g/a/is:<init>	()V
    //   358: astore_1
    //   359: aload_1
    //   360: getfield 172	com/tencent/mm/g/a/is:cDS	Lcom/tencent/mm/g/a/is$a;
    //   363: aload_3
    //   364: putfield 177	com/tencent/mm/g/a/is$a:cDT	[B
    //   367: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   370: aload_1
    //   371: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   374: pop
    //   375: sipush 18274
    //   378: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: goto -295 -> 86
    //   384: aload_3
    //   385: iconst_0
    //   386: baload
    //   387: iconst_3
    //   388: if_icmpne +52 -> 440
    //   391: ldc 28
    //   393: ldc 179
    //   395: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: new 148	com/tencent/mm/g/a/ui
    //   401: dup
    //   402: invokespecial 149	com/tencent/mm/g/a/ui:<init>	()V
    //   405: astore_1
    //   406: aload_1
    //   407: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   410: bipush 9
    //   412: putfield 159	com/tencent/mm/g/a/ui$a:cAd	I
    //   415: aload_1
    //   416: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   419: aload_3
    //   420: putfield 163	com/tencent/mm/g/a/ui$a:cQr	[B
    //   423: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   426: aload_1
    //   427: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   430: pop
    //   431: sipush 18274
    //   434: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   437: goto -351 -> 86
    //   440: aload_3
    //   441: iconst_0
    //   442: baload
    //   443: iconst_2
    //   444: if_icmpne +52 -> 496
    //   447: ldc 28
    //   449: ldc 181
    //   451: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   454: new 148	com/tencent/mm/g/a/ui
    //   457: dup
    //   458: invokespecial 149	com/tencent/mm/g/a/ui:<init>	()V
    //   461: astore_1
    //   462: aload_1
    //   463: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   466: bipush 10
    //   468: putfield 159	com/tencent/mm/g/a/ui$a:cAd	I
    //   471: aload_1
    //   472: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   475: aload_3
    //   476: putfield 163	com/tencent/mm/g/a/ui$a:cQr	[B
    //   479: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   482: aload_1
    //   483: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   486: pop
    //   487: sipush 18274
    //   490: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   493: goto -407 -> 86
    //   496: aload_3
    //   497: iconst_0
    //   498: baload
    //   499: bipush 102
    //   501: if_icmpne -421 -> 80
    //   504: ldc 28
    //   506: ldc 181
    //   508: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   511: new 183	com/tencent/mm/g/a/ug
    //   514: dup
    //   515: invokespecial 184	com/tencent/mm/g/a/ug:<init>	()V
    //   518: astore_1
    //   519: aload_1
    //   520: getfield 188	com/tencent/mm/g/a/ug:cQq	Lcom/tencent/mm/g/a/ug$a;
    //   523: aload_3
    //   524: putfield 191	com/tencent/mm/g/a/ug$a:cQr	[B
    //   527: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   530: aload_1
    //   531: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   534: pop
    //   535: sipush 18274
    //   538: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   541: goto -455 -> 86
    //   544: ldc 28
    //   546: ldc 193
    //   548: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   551: new 148	com/tencent/mm/g/a/ui
    //   554: dup
    //   555: invokespecial 149	com/tencent/mm/g/a/ui:<init>	()V
    //   558: astore_1
    //   559: aload_1
    //   560: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   563: bipush 6
    //   565: putfield 159	com/tencent/mm/g/a/ui$a:cAd	I
    //   568: aload_1
    //   569: getfield 153	com/tencent/mm/g/a/ui:cQx	Lcom/tencent/mm/g/a/ui$a;
    //   572: aload_3
    //   573: putfield 163	com/tencent/mm/g/a/ui$a:cQr	[B
    //   576: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   579: aload_1
    //   580: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   583: pop
    //   584: sipush 18274
    //   587: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   590: goto -504 -> 86
    //   593: ldc 28
    //   595: ldc 197
    //   597: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   600: sipush 18274
    //   603: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   606: goto -520 -> 86
    //   609: new 199	com/tencent/mm/g/a/gg
    //   612: dup
    //   613: invokespecial 200	com/tencent/mm/g/a/gg:<init>	()V
    //   616: astore_1
    //   617: aload_1
    //   618: getfield 204	com/tencent/mm/g/a/gg:cAF	Lcom/tencent/mm/g/a/gg$a;
    //   621: aload_3
    //   622: putfield 209	com/tencent/mm/g/a/gg$a:cAG	[B
    //   625: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   628: aload_1
    //   629: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   632: pop
    //   633: sipush 18274
    //   636: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   639: goto -553 -> 86
    //   642: ldc 82
    //   644: invokestatic 88	com/tencent/mm/booter/NotifyReceiver$NotifyService:jG	(Ljava/lang/String;)V
    //   647: aload_3
    //   648: invokestatic 213	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   651: ifne -571 -> 80
    //   654: new 130	java/lang/String
    //   657: dup
    //   658: aload_3
    //   659: invokespecial 216	java/lang/String:<init>	([B)V
    //   662: astore_1
    //   663: new 218	com/tencent/mm/g/a/ak
    //   666: dup
    //   667: invokespecial 219	com/tencent/mm/g/a/ak:<init>	()V
    //   670: astore_3
    //   671: aload_3
    //   672: getfield 223	com/tencent/mm/g/a/ak:cto	Lcom/tencent/mm/g/a/ak$a;
    //   675: iconst_4
    //   676: putfield 228	com/tencent/mm/g/a/ak$a:type	I
    //   679: aload_3
    //   680: getfield 223	com/tencent/mm/g/a/ak:cto	Lcom/tencent/mm/g/a/ak$a;
    //   683: aload_1
    //   684: putfield 231	com/tencent/mm/g/a/ak$a:ctq	Ljava/lang/String;
    //   687: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   690: aload_3
    //   691: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   694: pop
    //   695: sipush 18274
    //   698: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   701: goto -615 -> 86
    //   704: ldc 28
    //   706: ldc 233
    //   708: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   711: aload_3
    //   712: arraylength
    //   713: bipush 8
    //   715: if_icmplt +108 -> 823
    //   718: iconst_4
    //   719: newarray byte
    //   721: astore_1
    //   722: iconst_4
    //   723: newarray byte
    //   725: astore 4
    //   727: aload_3
    //   728: iconst_0
    //   729: aload_1
    //   730: iconst_0
    //   731: iconst_4
    //   732: invokestatic 239	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   735: aload_3
    //   736: iconst_4
    //   737: aload 4
    //   739: iconst_0
    //   740: iconst_4
    //   741: invokestatic 239	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   744: new 241	com/tencent/mm/g/a/ku
    //   747: dup
    //   748: invokespecial 242	com/tencent/mm/g/a/ku:<init>	()V
    //   751: astore_3
    //   752: aload_3
    //   753: getfield 246	com/tencent/mm/g/a/ku:cGJ	Lcom/tencent/mm/g/a/ku$a;
    //   756: aload_1
    //   757: iconst_0
    //   758: invokestatic 252	com/tencent/mm/a/o:t	([BI)I
    //   761: putfield 257	com/tencent/mm/g/a/ku$a:cGK	I
    //   764: aload_3
    //   765: getfield 246	com/tencent/mm/g/a/ku:cGJ	Lcom/tencent/mm/g/a/ku$a;
    //   768: aload 4
    //   770: iconst_0
    //   771: invokestatic 252	com/tencent/mm/a/o:t	([BI)I
    //   774: putfield 260	com/tencent/mm/g/a/ku$a:cGL	I
    //   777: ldc 28
    //   779: ldc_w 262
    //   782: iconst_2
    //   783: anewarray 4	java/lang/Object
    //   786: dup
    //   787: iconst_0
    //   788: aload_3
    //   789: getfield 246	com/tencent/mm/g/a/ku:cGJ	Lcom/tencent/mm/g/a/ku$a;
    //   792: getfield 257	com/tencent/mm/g/a/ku$a:cGK	I
    //   795: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   798: aastore
    //   799: dup
    //   800: iconst_1
    //   801: aload_3
    //   802: getfield 246	com/tencent/mm/g/a/ku:cGJ	Lcom/tencent/mm/g/a/ku$a;
    //   805: getfield 260	com/tencent/mm/g/a/ku$a:cGL	I
    //   808: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   811: aastore
    //   812: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   815: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   818: aload_3
    //   819: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   822: pop
    //   823: sipush 18274
    //   826: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   829: goto -743 -> 86
    //   832: aload_3
    //   833: ifnonnull +264 -> 1097
    //   836: iconst_m1
    //   837: istore_2
    //   838: ldc 28
    //   840: ldc_w 272
    //   843: iconst_1
    //   844: anewarray 4	java/lang/Object
    //   847: dup
    //   848: iconst_0
    //   849: iload_2
    //   850: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   853: aastore
    //   854: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   857: aconst_null
    //   858: astore 7
    //   860: aconst_null
    //   861: astore_1
    //   862: getstatic 278	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   865: ldc2_w 279
    //   868: ldc2_w 281
    //   871: lconst_1
    //   872: iconst_0
    //   873: invokevirtual 285	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   876: aload_3
    //   877: ifnull +163 -> 1040
    //   880: new 287	com/tencent/mm/protocal/protobuf/bvy
    //   883: dup
    //   884: invokespecial 288	com/tencent/mm/protocal/protobuf/bvy:<init>	()V
    //   887: astore_1
    //   888: aload_1
    //   889: aload_3
    //   890: invokevirtual 292	com/tencent/mm/protocal/protobuf/bvy:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   893: pop
    //   894: ldc 28
    //   896: ldc_w 294
    //   899: bipush 6
    //   901: anewarray 4	java/lang/Object
    //   904: dup
    //   905: iconst_0
    //   906: aload_1
    //   907: getfield 297	com/tencent/mm/protocal/protobuf/bvy:wWH	I
    //   910: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   913: aastore
    //   914: dup
    //   915: iconst_1
    //   916: aload_1
    //   917: getfield 300	com/tencent/mm/protocal/protobuf/bvy:wWI	I
    //   920: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   923: aastore
    //   924: dup
    //   925: iconst_2
    //   926: aload_1
    //   927: getfield 303	com/tencent/mm/protocal/protobuf/bvy:wWJ	I
    //   930: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   933: aastore
    //   934: dup
    //   935: iconst_3
    //   936: aload_1
    //   937: getfield 306	com/tencent/mm/protocal/protobuf/bvy:wWK	I
    //   940: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   943: aastore
    //   944: dup
    //   945: iconst_4
    //   946: aload_1
    //   947: getfield 309	com/tencent/mm/protocal/protobuf/bvy:wWL	I
    //   950: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   953: aastore
    //   954: dup
    //   955: iconst_5
    //   956: aload_1
    //   957: getfield 312	com/tencent/mm/protocal/protobuf/bvy:wWM	I
    //   960: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   963: aastore
    //   964: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   967: aload_1
    //   968: getfield 297	com/tencent/mm/protocal/protobuf/bvy:wWH	I
    //   971: bipush 13
    //   973: if_icmpne +143 -> 1116
    //   976: invokestatic 318	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   979: pop
    //   980: invokestatic 322	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   983: iconst_3
    //   984: invokevirtual 328	com/tencent/mm/kernel/b:jQ	(I)[B
    //   987: astore_3
    //   988: aload_3
    //   989: aload_1
    //   990: getfield 332	com/tencent/mm/protocal/protobuf/bvy:wdt	Lcom/tencent/mm/bt/b;
    //   993: getfield 337	com/tencent/mm/bt/b:wR	[B
    //   996: invokestatic 343	com/tencent/mm/jni/utils/UtilsJni:AesGcmDecryptWithUncompress	([B[B)[B
    //   999: astore_1
    //   1000: aload_3
    //   1001: ifnonnull +102 -> 1103
    //   1004: iconst_m1
    //   1005: istore_2
    //   1006: aload_1
    //   1007: ifnonnull +102 -> 1109
    //   1010: iconst_m1
    //   1011: istore 8
    //   1013: ldc 28
    //   1015: ldc_w 345
    //   1018: iconst_2
    //   1019: anewarray 4	java/lang/Object
    //   1022: dup
    //   1023: iconst_0
    //   1024: iload_2
    //   1025: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1028: aastore
    //   1029: dup
    //   1030: iconst_1
    //   1031: iload 8
    //   1033: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1036: aastore
    //   1037: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1040: aload_1
    //   1041: ifnull +165 -> 1206
    //   1044: ldc 28
    //   1046: ldc_w 347
    //   1049: iconst_1
    //   1050: anewarray 4	java/lang/Object
    //   1053: dup
    //   1054: iconst_0
    //   1055: aload_1
    //   1056: arraylength
    //   1057: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1060: aastore
    //   1061: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1064: new 349	com/tencent/mm/g/a/qu
    //   1067: dup
    //   1068: invokespecial 350	com/tencent/mm/g/a/qu:<init>	()V
    //   1071: astore_3
    //   1072: aload_3
    //   1073: getfield 354	com/tencent/mm/g/a/qu:cMZ	Lcom/tencent/mm/g/a/qu$a;
    //   1076: aload_1
    //   1077: putfield 359	com/tencent/mm/g/a/qu$a:data	[B
    //   1080: getstatic 107	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   1083: aload_3
    //   1084: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   1087: pop
    //   1088: sipush 18274
    //   1091: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1094: goto -1008 -> 86
    //   1097: aload_3
    //   1098: arraylength
    //   1099: istore_2
    //   1100: goto -262 -> 838
    //   1103: aload_3
    //   1104: arraylength
    //   1105: istore_2
    //   1106: goto -100 -> 1006
    //   1109: aload_1
    //   1110: arraylength
    //   1111: istore 8
    //   1113: goto -100 -> 1013
    //   1116: aload 4
    //   1118: aload_1
    //   1119: getfield 297	com/tencent/mm/protocal/protobuf/bvy:wWH	I
    //   1122: aload_1
    //   1123: getfield 300	com/tencent/mm/protocal/protobuf/bvy:wWI	I
    //   1126: aload_1
    //   1127: getfield 303	com/tencent/mm/protocal/protobuf/bvy:wWJ	I
    //   1130: aload_1
    //   1131: getfield 306	com/tencent/mm/protocal/protobuf/bvy:wWK	I
    //   1134: aload_1
    //   1135: getfield 309	com/tencent/mm/protocal/protobuf/bvy:wWL	I
    //   1138: aload_1
    //   1139: getfield 312	com/tencent/mm/protocal/protobuf/bvy:wWM	I
    //   1142: aload_1
    //   1143: getfield 362	com/tencent/mm/protocal/protobuf/bvy:wWN	I
    //   1146: aload_1
    //   1147: getfield 332	com/tencent/mm/protocal/protobuf/bvy:wdt	Lcom/tencent/mm/bt/b;
    //   1150: getfield 337	com/tencent/mm/bt/b:wR	[B
    //   1153: invokestatic 368	com/tencent/mm/protocal/MMProtocalJni:decodeSecureNotifyData	([BIIIIIII[B)[B
    //   1156: astore_1
    //   1157: goto -117 -> 1040
    //   1160: astore_3
    //   1161: aload 7
    //   1163: astore_1
    //   1164: ldc 28
    //   1166: new 370	java/lang/StringBuilder
    //   1169: dup
    //   1170: ldc_w 372
    //   1173: invokespecial 374	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1176: aload_3
    //   1177: invokevirtual 377	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1180: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1183: invokevirtual 384	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1186: invokestatic 387	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1189: getstatic 278	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   1192: ldc2_w 279
    //   1195: ldc2_w 388
    //   1198: lconst_1
    //   1199: iconst_0
    //   1200: invokevirtual 285	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   1203: goto -163 -> 1040
    //   1206: ldc 28
    //   1208: ldc_w 391
    //   1211: invokestatic 387	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1214: getstatic 278	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   1217: ldc2_w 279
    //   1220: ldc2_w 392
    //   1223: lconst_1
    //   1224: iconst_0
    //   1225: invokevirtual 285	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   1228: goto -1148 -> 80
    //   1231: astore_3
    //   1232: goto -68 -> 1164
    //
    // Exception table:
    //   from	to	target	type
    //   121	159	168	android/os/RemoteException
    //   888	1000	1160	java/lang/Exception
    //   1116	1157	1160	java/lang/Exception
    //   1013	1040	1231	java/lang/Exception
    //   1103	1106	1231	java/lang/Exception
    //   1109	1113	1231	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.o
 * JD-Core Version:    0.6.2
 */