package com.tencent.mm.plugin.emoji.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.sdk.b.c;

public final class b extends c<bf>
{
  public b()
  {
    AppMethodBeat.i(52812);
    this.xxI = bf.class.getName().hashCode();
    AppMethodBeat.o(52812);
  }

  // ERROR //
  private static boolean a(bf parambf)
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: instanceof 18
    //   9: ifeq +507 -> 516
    //   12: aload_0
    //   13: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   16: getfield 52	com/tencent/mm/g/a/bf$a:cut	I
    //   19: bipush 33
    //   21: if_icmpne +639 -> 660
    //   24: new 54	com/tencent/mm/vfs/b
    //   27: dup
    //   28: aload_0
    //   29: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   32: getfield 58	com/tencent/mm/g/a/bf$a:filePath	Ljava/lang/String;
    //   35: invokespecial 61	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   38: astore_1
    //   39: aload_1
    //   40: invokevirtual 65	com/tencent/mm/vfs/b:exists	()Z
    //   43: ifeq +607 -> 650
    //   46: ldc 67
    //   48: ldc 69
    //   50: iconst_1
    //   51: anewarray 71	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_1
    //   57: invokevirtual 75	com/tencent/mm/vfs/b:dME	()Lcom/tencent/mm/vfs/b;
    //   60: aastore
    //   61: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: new 54	com/tencent/mm/vfs/b
    //   67: dup
    //   68: invokestatic 85	com/tencent/mm/ao/a:afU	()Ljava/lang/String;
    //   71: ldc 87
    //   73: invokespecial 90	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: astore_2
    //   77: new 54	com/tencent/mm/vfs/b
    //   80: dup
    //   81: aload_2
    //   82: ldc 92
    //   84: invokespecial 95	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   87: astore_3
    //   88: aload_2
    //   89: invokevirtual 98	com/tencent/mm/vfs/b:mkdirs	()Z
    //   92: pop
    //   93: aload_1
    //   94: invokevirtual 102	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   97: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   100: aload_3
    //   101: invokevirtual 102	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   104: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   107: invokestatic 114	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   110: pop2
    //   111: aload_3
    //   112: invokevirtual 102	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   115: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   118: aload_2
    //   119: invokevirtual 102	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   122: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   125: invokestatic 118	com/tencent/mm/vfs/e:iu	(Ljava/lang/String;Ljava/lang/String;)I
    //   128: istore 4
    //   130: iconst_1
    //   131: istore 5
    //   133: iconst_1
    //   134: istore 6
    //   136: iconst_1
    //   137: istore 7
    //   139: iload 4
    //   141: iflt +312 -> 453
    //   144: aconst_null
    //   145: astore 8
    //   147: aconst_null
    //   148: astore_0
    //   149: aload_0
    //   150: astore 9
    //   152: aload 8
    //   154: astore 10
    //   156: new 54	com/tencent/mm/vfs/b
    //   159: astore 11
    //   161: aload_0
    //   162: astore 9
    //   164: aload 8
    //   166: astore 10
    //   168: aload 11
    //   170: aload_2
    //   171: ldc 120
    //   173: invokespecial 95	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   176: aload_0
    //   177: astore 9
    //   179: aload 8
    //   181: astore 10
    //   183: aload 11
    //   185: invokestatic 124	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   188: astore_0
    //   189: aload_0
    //   190: astore 9
    //   192: aload_0
    //   193: astore 10
    //   195: new 126	java/io/InputStreamReader
    //   198: astore 8
    //   200: aload_0
    //   201: astore 9
    //   203: aload_0
    //   204: astore 10
    //   206: aload 8
    //   208: aload_0
    //   209: invokespecial 129	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   212: new 131	java/io/BufferedReader
    //   215: astore 9
    //   217: aload 9
    //   219: aload 8
    //   221: invokespecial 134	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   224: ldc 136
    //   226: astore 12
    //   228: aload 9
    //   230: astore 13
    //   232: aload 8
    //   234: astore 11
    //   236: aload_0
    //   237: astore 10
    //   239: iload 6
    //   241: istore 7
    //   243: aload 9
    //   245: invokevirtual 139	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   248: astore 14
    //   250: aload 14
    //   252: ifnull +78 -> 330
    //   255: aload 9
    //   257: astore 13
    //   259: aload 8
    //   261: astore 11
    //   263: aload_0
    //   264: astore 10
    //   266: iload 6
    //   268: istore 7
    //   270: new 141	java/lang/StringBuilder
    //   273: astore 15
    //   275: aload 9
    //   277: astore 13
    //   279: aload 8
    //   281: astore 11
    //   283: aload_0
    //   284: astore 10
    //   286: iload 6
    //   288: istore 7
    //   290: aload 15
    //   292: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   295: aload 9
    //   297: astore 13
    //   299: aload 8
    //   301: astore 11
    //   303: aload_0
    //   304: astore 10
    //   306: iload 6
    //   308: istore 7
    //   310: aload 15
    //   312: aload 12
    //   314: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: aload 14
    //   319: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: astore 12
    //   327: goto -99 -> 228
    //   330: aload 9
    //   332: astore 13
    //   334: aload 8
    //   336: astore 11
    //   338: aload_0
    //   339: astore 10
    //   341: iload 6
    //   343: istore 7
    //   345: new 151	org/json/JSONObject
    //   348: astore 15
    //   350: aload 9
    //   352: astore 13
    //   354: aload 8
    //   356: astore 11
    //   358: aload_0
    //   359: astore 10
    //   361: iload 6
    //   363: istore 7
    //   365: aload 15
    //   367: aload 12
    //   369: invokespecial 152	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   372: aload 9
    //   374: astore 13
    //   376: aload 8
    //   378: astore 11
    //   380: aload_0
    //   381: astore 10
    //   383: iload 6
    //   385: istore 7
    //   387: aload 15
    //   389: ldc 154
    //   391: invokevirtual 158	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   394: istore 6
    //   396: aload 9
    //   398: astore 13
    //   400: aload 8
    //   402: astore 11
    //   404: aload_0
    //   405: astore 10
    //   407: iload 6
    //   409: istore 7
    //   411: ldc 67
    //   413: ldc 160
    //   415: iconst_2
    //   416: anewarray 71	java/lang/Object
    //   419: dup
    //   420: iconst_0
    //   421: aload 12
    //   423: aastore
    //   424: dup
    //   425: iconst_1
    //   426: iload 6
    //   428: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   431: aastore
    //   432: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: aload_0
    //   436: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   439: aload 8
    //   441: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   444: aload 9
    //   446: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   449: iload 6
    //   451: istore 7
    //   453: aload_2
    //   454: getfield 179	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   457: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   460: iconst_1
    //   461: invokestatic 183	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   464: pop
    //   465: aload_3
    //   466: getfield 179	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   469: invokestatic 108	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   472: invokestatic 187	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   475: pop
    //   476: getstatic 190	com/tencent/mm/ao/a:fAH	I
    //   479: iload 7
    //   481: if_icmpge +138 -> 619
    //   484: ldc 67
    //   486: ldc 192
    //   488: iconst_2
    //   489: anewarray 71	java/lang/Object
    //   492: dup
    //   493: iconst_0
    //   494: getstatic 190	com/tencent/mm/ao/a:fAH	I
    //   497: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   500: aastore
    //   501: dup
    //   502: iconst_1
    //   503: iload 7
    //   505: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   508: aastore
    //   509: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   512: aload_1
    //   513: invokestatic 195	com/tencent/mm/ao/a:d	(Lcom/tencent/mm/vfs/b;)V
    //   516: ldc 43
    //   518: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   521: iconst_0
    //   522: ireturn
    //   523: astore 12
    //   525: aconst_null
    //   526: astore 10
    //   528: aconst_null
    //   529: astore 8
    //   531: aload 9
    //   533: astore_0
    //   534: aload 10
    //   536: astore 9
    //   538: iload 5
    //   540: istore 7
    //   542: aload 9
    //   544: astore 13
    //   546: aload 8
    //   548: astore 11
    //   550: aload_0
    //   551: astore 10
    //   553: ldc 67
    //   555: aload 12
    //   557: aload 12
    //   559: invokevirtual 198	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   562: iconst_0
    //   563: anewarray 71	java/lang/Object
    //   566: invokestatic 202	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: aload_0
    //   570: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   573: aload 8
    //   575: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   578: aload 9
    //   580: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   583: goto -130 -> 453
    //   586: astore 9
    //   588: aconst_null
    //   589: astore 13
    //   591: aconst_null
    //   592: astore 8
    //   594: aload 10
    //   596: astore_0
    //   597: aload_0
    //   598: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   601: aload 8
    //   603: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   606: aload 13
    //   608: invokestatic 175	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   611: ldc 43
    //   613: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   616: aload 9
    //   618: athrow
    //   619: ldc 67
    //   621: ldc 204
    //   623: iconst_2
    //   624: anewarray 71	java/lang/Object
    //   627: dup
    //   628: iconst_0
    //   629: getstatic 190	com/tencent/mm/ao/a:fAH	I
    //   632: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   635: aastore
    //   636: dup
    //   637: iconst_1
    //   638: iload 7
    //   640: invokestatic 166	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   643: aastore
    //   644: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   647: goto -131 -> 516
    //   650: ldc 67
    //   652: ldc 206
    //   654: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   657: goto -141 -> 516
    //   660: aload_0
    //   661: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   664: getfield 52	com/tencent/mm/g/a/bf$a:cut	I
    //   667: bipush 37
    //   669: if_icmpne -153 -> 516
    //   672: aload_0
    //   673: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   676: getfield 212	com/tencent/mm/g/a/bf$a:cuu	I
    //   679: iconst_1
    //   680: if_icmpne +15 -> 695
    //   683: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:bkb	()Lcom/tencent/mm/plugin/emoji/e/j;
    //   686: pop
    //   687: aload_0
    //   688: iconst_0
    //   689: invokestatic 221	com/tencent/mm/plugin/emoji/e/j:a	(Lcom/tencent/mm/g/a/bf;Z)V
    //   692: goto -176 -> 516
    //   695: aload_0
    //   696: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   699: getfield 212	com/tencent/mm/g/a/bf$a:cuu	I
    //   702: iconst_2
    //   703: if_icmpne +15 -> 718
    //   706: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:bkb	()Lcom/tencent/mm/plugin/emoji/e/j;
    //   709: pop
    //   710: aload_0
    //   711: iconst_0
    //   712: invokestatic 223	com/tencent/mm/plugin/emoji/e/j:b	(Lcom/tencent/mm/g/a/bf;Z)V
    //   715: goto -199 -> 516
    //   718: aload_0
    //   719: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   722: getfield 212	com/tencent/mm/g/a/bf$a:cuu	I
    //   725: iconst_3
    //   726: if_icmpne +99 -> 825
    //   729: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:bkb	()Lcom/tencent/mm/plugin/emoji/e/j;
    //   732: pop
    //   733: aload_0
    //   734: getstatic 229	com/tencent/mm/plugin/emoji/e/j$a:kUy	Lcom/tencent/mm/plugin/emoji/e/j$a;
    //   737: invokestatic 232	com/tencent/mm/plugin/emoji/e/j:a	(Lcom/tencent/mm/g/a/bf;Lcom/tencent/mm/plugin/emoji/e/j$a;)Z
    //   740: ifeq +74 -> 814
    //   743: aload_0
    //   744: getstatic 229	com/tencent/mm/plugin/emoji/e/j$a:kUy	Lcom/tencent/mm/plugin/emoji/e/j$a;
    //   747: getstatic 235	com/tencent/mm/plugin/emoji/e/j:kUc	Ljava/lang/String;
    //   750: invokestatic 238	com/tencent/mm/plugin/emoji/e/j:a	(Lcom/tencent/mm/g/a/bf;Lcom/tencent/mm/plugin/emoji/e/j$a;Ljava/lang/String;)Z
    //   753: ifeq +51 -> 804
    //   756: new 54	com/tencent/mm/vfs/b
    //   759: dup
    //   760: new 54	com/tencent/mm/vfs/b
    //   763: dup
    //   764: invokestatic 241	com/tencent/mm/plugin/emoji/e/j:getDataEmojiPath	()Ljava/lang/String;
    //   767: getstatic 235	com/tencent/mm/plugin/emoji/e/j:kUc	Ljava/lang/String;
    //   770: invokespecial 90	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   773: getstatic 244	com/tencent/mm/plugin/emoji/e/j:kUn	Ljava/lang/String;
    //   776: invokespecial 95	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   779: astore_0
    //   780: aload_0
    //   781: invokevirtual 65	com/tencent/mm/vfs/b:exists	()Z
    //   784: ifeq +10 -> 794
    //   787: aload_0
    //   788: invokestatic 247	com/tencent/mm/plugin/emoji/e/j:h	(Lcom/tencent/mm/vfs/b;)V
    //   791: goto -275 -> 516
    //   794: ldc 249
    //   796: ldc 251
    //   798: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   801: goto -285 -> 516
    //   804: ldc 249
    //   806: ldc 255
    //   808: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   811: goto -295 -> 516
    //   814: ldc 249
    //   816: ldc_w 257
    //   819: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   822: goto -306 -> 516
    //   825: aload_0
    //   826: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   829: getfield 212	com/tencent/mm/g/a/bf$a:cuu	I
    //   832: iconst_5
    //   833: if_icmpne +90 -> 923
    //   836: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:bkb	()Lcom/tencent/mm/plugin/emoji/e/j;
    //   839: pop
    //   840: aload_0
    //   841: getstatic 260	com/tencent/mm/plugin/emoji/e/j$a:kUA	Lcom/tencent/mm/plugin/emoji/e/j$a;
    //   844: invokestatic 232	com/tencent/mm/plugin/emoji/e/j:a	(Lcom/tencent/mm/g/a/bf;Lcom/tencent/mm/plugin/emoji/e/j$a;)Z
    //   847: ifeq -331 -> 516
    //   850: aload_0
    //   851: getstatic 260	com/tencent/mm/plugin/emoji/e/j$a:kUA	Lcom/tencent/mm/plugin/emoji/e/j$a;
    //   854: getstatic 263	com/tencent/mm/plugin/emoji/e/j:kUd	Ljava/lang/String;
    //   857: invokestatic 238	com/tencent/mm/plugin/emoji/e/j:a	(Lcom/tencent/mm/g/a/bf;Lcom/tencent/mm/plugin/emoji/e/j$a;Ljava/lang/String;)Z
    //   860: ifeq +52 -> 912
    //   863: new 54	com/tencent/mm/vfs/b
    //   866: dup
    //   867: new 54	com/tencent/mm/vfs/b
    //   870: dup
    //   871: invokestatic 241	com/tencent/mm/plugin/emoji/e/j:getDataEmojiPath	()Ljava/lang/String;
    //   874: getstatic 263	com/tencent/mm/plugin/emoji/e/j:kUd	Ljava/lang/String;
    //   877: invokespecial 90	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   880: getstatic 266	com/tencent/mm/plugin/emoji/e/j:kUo	Ljava/lang/String;
    //   883: invokespecial 95	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   886: astore_0
    //   887: aload_0
    //   888: invokevirtual 65	com/tencent/mm/vfs/b:exists	()Z
    //   891: ifeq +10 -> 901
    //   894: aload_0
    //   895: invokestatic 268	com/tencent/mm/plugin/emoji/e/j:i	(Lcom/tencent/mm/vfs/b;)V
    //   898: goto -382 -> 516
    //   901: ldc 249
    //   903: ldc_w 270
    //   906: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   909: goto -393 -> 516
    //   912: ldc 249
    //   914: ldc_w 270
    //   917: invokestatic 253	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   920: goto -404 -> 516
    //   923: aload_0
    //   924: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   927: getfield 212	com/tencent/mm/g/a/bf$a:cuu	I
    //   930: iconst_4
    //   931: if_icmpne -415 -> 516
    //   934: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:bkb	()Lcom/tencent/mm/plugin/emoji/e/j;
    //   937: pop
    //   938: ldc 249
    //   940: ldc_w 272
    //   943: invokestatic 274	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   946: aload_0
    //   947: invokestatic 276	com/tencent/mm/plugin/emoji/e/j:b	(Lcom/tencent/mm/g/a/bf;)Z
    //   950: ifeq -434 -> 516
    //   953: invokestatic 282	com/tencent/mm/cb/b:dqD	()Lcom/tencent/mm/cb/b;
    //   956: pop
    //   957: aload_0
    //   958: getfield 47	com/tencent/mm/g/a/bf:cus	Lcom/tencent/mm/g/a/bf$a;
    //   961: getfield 58	com/tencent/mm/g/a/bf$a:filePath	Ljava/lang/String;
    //   964: astore_0
    //   965: invokestatic 285	com/tencent/mm/cb/b:dqE	()V
    //   968: aload_0
    //   969: getstatic 288	com/tencent/mm/cb/b:xFA	Ljava/lang/String;
    //   972: invokestatic 114	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   975: pop2
    //   976: invokestatic 282	com/tencent/mm/cb/b:dqD	()Lcom/tencent/mm/cb/b;
    //   979: invokevirtual 291	com/tencent/mm/cb/b:init	()V
    //   982: goto -466 -> 516
    //   985: astore 9
    //   987: aconst_null
    //   988: astore 13
    //   990: goto -393 -> 597
    //   993: astore 9
    //   995: aload 11
    //   997: astore 8
    //   999: aload 10
    //   1001: astore_0
    //   1002: goto -405 -> 597
    //   1005: astore 12
    //   1007: aconst_null
    //   1008: astore 9
    //   1010: iload 5
    //   1012: istore 7
    //   1014: goto -472 -> 542
    //   1017: astore 12
    //   1019: goto -477 -> 542
    //
    // Exception table:
    //   from	to	target	type
    //   156	161	523	java/lang/Exception
    //   168	176	523	java/lang/Exception
    //   183	189	523	java/lang/Exception
    //   195	200	523	java/lang/Exception
    //   206	212	523	java/lang/Exception
    //   156	161	586	finally
    //   168	176	586	finally
    //   183	189	586	finally
    //   195	200	586	finally
    //   206	212	586	finally
    //   212	224	985	finally
    //   243	250	993	finally
    //   270	275	993	finally
    //   290	295	993	finally
    //   310	327	993	finally
    //   345	350	993	finally
    //   365	372	993	finally
    //   387	396	993	finally
    //   411	435	993	finally
    //   553	569	993	finally
    //   212	224	1005	java/lang/Exception
    //   243	250	1017	java/lang/Exception
    //   270	275	1017	java/lang/Exception
    //   290	295	1017	java/lang/Exception
    //   310	327	1017	java/lang/Exception
    //   345	350	1017	java/lang/Exception
    //   365	372	1017	java/lang/Exception
    //   387	396	1017	java/lang/Exception
    //   411	435	1017	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.c.b
 * JD-Core Version:    0.6.2
 */