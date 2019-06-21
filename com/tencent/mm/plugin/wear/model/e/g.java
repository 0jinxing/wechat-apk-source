package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class g extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26399);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11005));
    localArrayList.add(Integer.valueOf(11006));
    localArrayList.add(Integer.valueOf(11007));
    AppMethodBeat.o(26399);
    return localArrayList;
  }

  // ERROR //
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 26400
    //   5: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: sipush 11005
    //   12: if_icmpne +163 -> 175
    //   15: new 47	com/tencent/mm/protocal/protobuf/cti
    //   18: dup
    //   19: invokespecial 48	com/tencent/mm/protocal/protobuf/cti:<init>	()V
    //   22: astore 4
    //   24: aload 4
    //   26: aload_2
    //   27: invokevirtual 52	com/tencent/mm/protocal/protobuf/cti:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   30: pop
    //   31: new 54	com/tencent/mm/protocal/protobuf/ctj
    //   34: dup
    //   35: invokespecial 55	com/tencent/mm/protocal/protobuf/ctj:<init>	()V
    //   38: astore_2
    //   39: aload 4
    //   41: getfield 59	com/tencent/mm/protocal/protobuf/cti:vHl	Ljava/lang/String;
    //   44: invokestatic 65	com/tencent/mm/plugin/wear/model/h:adv	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   47: astore 5
    //   49: aload 5
    //   51: ifnull +102 -> 153
    //   54: aload_2
    //   55: invokestatic 71	java/lang/System:currentTimeMillis	()J
    //   58: putfield 75	com/tencent/mm/protocal/protobuf/ctj:xqp	J
    //   61: aload 5
    //   63: invokestatic 79	com/tencent/mm/plugin/wear/model/h:ad	(Landroid/graphics/Bitmap;)[B
    //   66: astore 5
    //   68: ldc 81
    //   70: ldc 83
    //   72: iconst_1
    //   73: anewarray 85	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload 4
    //   80: getfield 59	com/tencent/mm/protocal/protobuf/cti:vHl	Ljava/lang/String;
    //   83: aastore
    //   84: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_2
    //   88: new 92	com/tencent/mm/bt/b
    //   91: dup
    //   92: aload 5
    //   94: invokespecial 95	com/tencent/mm/bt/b:<init>	([B)V
    //   97: putfield 99	com/tencent/mm/protocal/protobuf/ctj:jBi	Lcom/tencent/mm/bt/b;
    //   100: aload_2
    //   101: invokevirtual 103	com/tencent/mm/protocal/protobuf/ctj:toByteArray	()[B
    //   104: astore_2
    //   105: sipush 26400
    //   108: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_2
    //   112: areturn
    //   113: astore_2
    //   114: ldc 81
    //   116: aload_2
    //   117: ldc 105
    //   119: iconst_0
    //   120: anewarray 85	java/lang/Object
    //   123: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: goto -95 -> 31
    //   129: astore_2
    //   130: ldc 81
    //   132: aload_2
    //   133: ldc 105
    //   135: iconst_0
    //   136: anewarray 85	java/lang/Object
    //   139: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: sipush 26400
    //   145: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_3
    //   149: astore_2
    //   150: goto -39 -> 111
    //   153: ldc 81
    //   155: ldc 111
    //   157: iconst_1
    //   158: anewarray 85	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload 4
    //   165: getfield 59	com/tencent/mm/protocal/protobuf/cti:vHl	Ljava/lang/String;
    //   168: aastore
    //   169: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: goto -30 -> 142
    //   175: iload_1
    //   176: sipush 11006
    //   179: if_icmpne +314 -> 493
    //   182: new 116	java/lang/String
    //   185: astore 4
    //   187: aload 4
    //   189: aload_2
    //   190: ldc 118
    //   192: invokespecial 121	java/lang/String:<init>	([BLjava/lang/String;)V
    //   195: ldc 123
    //   197: invokestatic 129	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   200: checkcast 123	com/tencent/mm/plugin/emoji/b/d
    //   203: invokeinterface 133 1 0
    //   208: aload 4
    //   210: invokeinterface 139 2 0
    //   215: astore_2
    //   216: aload_2
    //   217: ifnull -75 -> 142
    //   220: aload_2
    //   221: invokevirtual 145	com/tencent/mm/storage/emotion/EmojiInfo:xy	()Z
    //   224: ifeq +47 -> 271
    //   227: aload_2
    //   228: invokestatic 151	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   231: invokevirtual 155	com/tencent/mm/storage/emotion/EmojiInfo:hl	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   234: invokestatic 79	com/tencent/mm/plugin/wear/model/h:ad	(Landroid/graphics/Bitmap;)[B
    //   237: astore_2
    //   238: sipush 26400
    //   241: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: goto -133 -> 111
    //   247: astore_2
    //   248: ldc 81
    //   250: aload_2
    //   251: ldc 105
    //   253: iconst_0
    //   254: anewarray 85	java/lang/Object
    //   257: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: sipush 26400
    //   263: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_3
    //   267: astore_2
    //   268: goto -157 -> 111
    //   271: aload_2
    //   272: getfield 159	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   275: getstatic 164	com/tencent/mm/storage/emotion/EmojiGroupInfo:yac	I
    //   278: if_icmpne +94 -> 372
    //   281: invokestatic 151	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   284: aload_2
    //   285: invokevirtual 168	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   288: invokestatic 172	com/tencent/mm/storage/emotion/EmojiInfo:bJ	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   291: astore 4
    //   293: aload 4
    //   295: astore_2
    //   296: aload 4
    //   298: invokestatic 178	com/tencent/mm/a/e:q	(Ljava/io/InputStream;)[B
    //   301: astore 5
    //   303: aload 5
    //   305: astore_2
    //   306: aload 4
    //   308: invokestatic 181	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   311: sipush 26400
    //   314: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: goto -206 -> 111
    //   320: astore 5
    //   322: aconst_null
    //   323: astore 4
    //   325: aload 4
    //   327: astore_2
    //   328: ldc 81
    //   330: ldc 183
    //   332: iconst_1
    //   333: anewarray 85	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload 5
    //   340: invokestatic 189	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   343: aastore
    //   344: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: aload 4
    //   349: invokestatic 181	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   352: goto -210 -> 142
    //   355: astore 4
    //   357: aconst_null
    //   358: astore_2
    //   359: aload_2
    //   360: invokestatic 181	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   363: sipush 26400
    //   366: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   369: aload 4
    //   371: athrow
    //   372: aload_2
    //   373: invokevirtual 195	com/tencent/mm/storage/emotion/EmojiInfo:dve	()Ljava/lang/String;
    //   376: invokestatic 201	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   379: ldc2_w 202
    //   382: lcmp
    //   383: ifle +81 -> 464
    //   386: ldc 81
    //   388: ldc 205
    //   390: iconst_1
    //   391: anewarray 85	java/lang/Object
    //   394: dup
    //   395: iconst_0
    //   396: aload_2
    //   397: invokevirtual 208	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   400: aastore
    //   401: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: aload_2
    //   405: invokevirtual 211	com/tencent/mm/storage/emotion/EmojiInfo:dvf	()Ljava/lang/String;
    //   408: invokestatic 215	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   411: ifeq +22 -> 433
    //   414: aload_2
    //   415: invokevirtual 211	com/tencent/mm/storage/emotion/EmojiInfo:dvf	()Ljava/lang/String;
    //   418: iconst_0
    //   419: iconst_m1
    //   420: invokestatic 218	com/tencent/mm/vfs/e:e	(Ljava/lang/String;II)[B
    //   423: astore_2
    //   424: sipush 26400
    //   427: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   430: goto -319 -> 111
    //   433: ldc 81
    //   435: ldc 220
    //   437: invokestatic 223	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   440: aload_2
    //   441: invokestatic 229	com/tencent/mm/emoji/loader/c/b:d	(Lcom/tencent/mm/storage/emotion/EmojiInfo;)Z
    //   444: pop
    //   445: aload_2
    //   446: invokevirtual 211	com/tencent/mm/storage/emotion/EmojiInfo:dvf	()Ljava/lang/String;
    //   449: iconst_0
    //   450: iconst_m1
    //   451: invokestatic 218	com/tencent/mm/vfs/e:e	(Ljava/lang/String;II)[B
    //   454: astore_2
    //   455: sipush 26400
    //   458: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   461: goto -350 -> 111
    //   464: ldc 123
    //   466: invokestatic 129	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   469: checkcast 123	com/tencent/mm/plugin/emoji/b/d
    //   472: invokeinterface 133 1 0
    //   477: aload_2
    //   478: invokeinterface 232 2 0
    //   483: astore_2
    //   484: sipush 26400
    //   487: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   490: goto -379 -> 111
    //   493: iload_1
    //   494: sipush 11007
    //   497: if_icmpne -355 -> 142
    //   500: new 234	com/tencent/mm/protocal/protobuf/cua
    //   503: dup
    //   504: invokespecial 235	com/tencent/mm/protocal/protobuf/cua:<init>	()V
    //   507: astore 4
    //   509: aload 4
    //   511: aload_2
    //   512: invokevirtual 236	com/tencent/mm/protocal/protobuf/cua:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   515: pop
    //   516: invokestatic 242	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   519: pop
    //   520: invokestatic 248	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   523: aload 4
    //   525: getfield 251	com/tencent/mm/protocal/protobuf/cua:vIs	J
    //   528: invokeinterface 257 3 0
    //   533: astore_2
    //   534: aload 4
    //   536: getfield 261	com/tencent/mm/protocal/protobuf/cua:xqC	Z
    //   539: ifne +85 -> 624
    //   542: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   545: aload_2
    //   546: getfield 272	com/tencent/mm/g/c/cy:field_imgPath	Ljava/lang/String;
    //   549: invokevirtual 278	com/tencent/mm/at/g:sj	(Ljava/lang/String;)Ljava/lang/String;
    //   552: astore_2
    //   553: aload_2
    //   554: invokestatic 281	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   557: ifne -415 -> 142
    //   560: new 283	com/tencent/mm/protocal/protobuf/cub
    //   563: dup
    //   564: invokespecial 284	com/tencent/mm/protocal/protobuf/cub:<init>	()V
    //   567: astore 4
    //   569: aload 4
    //   571: invokestatic 71	java/lang/System:currentTimeMillis	()J
    //   574: putfield 285	com/tencent/mm/protocal/protobuf/cub:xqp	J
    //   577: aload 4
    //   579: new 92	com/tencent/mm/bt/b
    //   582: dup
    //   583: aload_2
    //   584: invokestatic 291	com/tencent/mm/modelsfs/FileOp:te	(Ljava/lang/String;)[B
    //   587: invokespecial 95	com/tencent/mm/bt/b:<init>	([B)V
    //   590: putfield 292	com/tencent/mm/protocal/protobuf/cub:jBi	Lcom/tencent/mm/bt/b;
    //   593: aload 4
    //   595: invokevirtual 293	com/tencent/mm/protocal/protobuf/cub:toByteArray	()[B
    //   598: astore_2
    //   599: sipush 26400
    //   602: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   605: goto -494 -> 111
    //   608: astore_2
    //   609: ldc 81
    //   611: aload_2
    //   612: ldc 105
    //   614: iconst_0
    //   615: anewarray 85	java/lang/Object
    //   618: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   621: goto -105 -> 516
    //   624: new 283	com/tencent/mm/protocal/protobuf/cub
    //   627: dup
    //   628: invokespecial 284	com/tencent/mm/protocal/protobuf/cub:<init>	()V
    //   631: astore 6
    //   633: aload 6
    //   635: invokestatic 71	java/lang/System:currentTimeMillis	()J
    //   638: putfield 285	com/tencent/mm/protocal/protobuf/cub:xqp	J
    //   641: aload_2
    //   642: getfield 296	com/tencent/mm/g/c/cy:field_isSend	I
    //   645: iconst_1
    //   646: if_icmpne +112 -> 758
    //   649: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   652: aload_2
    //   653: getfield 299	com/tencent/mm/g/c/cy:field_msgId	J
    //   656: invokevirtual 303	com/tencent/mm/at/g:fJ	(J)Lcom/tencent/mm/at/e;
    //   659: astore 4
    //   661: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   664: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   667: aload 4
    //   669: invokevirtual 306	com/tencent/mm/at/g:d	(Lcom/tencent/mm/at/e;)Ljava/lang/String;
    //   672: ldc 105
    //   674: ldc 105
    //   676: invokevirtual 309	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   679: astore_2
    //   680: aload_2
    //   681: invokestatic 310	com/tencent/mm/modelsfs/FileOp:ct	(Ljava/lang/String;)Z
    //   684: ifeq +41 -> 725
    //   687: aload_2
    //   688: invokestatic 281	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   691: ifne -549 -> 142
    //   694: aload 6
    //   696: new 92	com/tencent/mm/bt/b
    //   699: dup
    //   700: aload_2
    //   701: invokestatic 291	com/tencent/mm/modelsfs/FileOp:te	(Ljava/lang/String;)[B
    //   704: invokespecial 95	com/tencent/mm/bt/b:<init>	([B)V
    //   707: putfield 292	com/tencent/mm/protocal/protobuf/cub:jBi	Lcom/tencent/mm/bt/b;
    //   710: aload 6
    //   712: invokevirtual 293	com/tencent/mm/protocal/protobuf/cub:toByteArray	()[B
    //   715: astore_2
    //   716: sipush 26400
    //   719: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   722: goto -611 -> 111
    //   725: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   728: aload 4
    //   730: getfield 315	com/tencent/mm/at/e:fDz	Ljava/lang/String;
    //   733: ldc 105
    //   735: ldc 105
    //   737: invokevirtual 309	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   740: astore 4
    //   742: aload 4
    //   744: astore_2
    //   745: aload 4
    //   747: invokestatic 310	com/tencent/mm/modelsfs/FileOp:ct	(Ljava/lang/String;)Z
    //   750: ifne -63 -> 687
    //   753: aconst_null
    //   754: astore_2
    //   755: goto -68 -> 687
    //   758: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   761: aload_2
    //   762: getfield 318	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   765: invokevirtual 321	com/tencent/mm/at/g:fI	(J)Lcom/tencent/mm/at/e;
    //   768: astore 5
    //   770: aload 5
    //   772: invokevirtual 324	com/tencent/mm/at/e:agP	()Z
    //   775: ifeq -22 -> 753
    //   778: aload 5
    //   780: invokevirtual 327	com/tencent/mm/at/e:agQ	()Z
    //   783: ifeq +94 -> 877
    //   786: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   789: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   792: aload 5
    //   794: invokevirtual 306	com/tencent/mm/at/g:d	(Lcom/tencent/mm/at/e;)Ljava/lang/String;
    //   797: ldc 105
    //   799: ldc 105
    //   801: invokevirtual 309	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   804: astore 4
    //   806: aload 4
    //   808: invokestatic 310	com/tencent/mm/modelsfs/FileOp:ct	(Ljava/lang/String;)Z
    //   811: ifeq +66 -> 877
    //   814: aload 4
    //   816: astore_2
    //   817: aload 4
    //   819: invokestatic 281	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   822: ifeq -135 -> 687
    //   825: invokestatic 267	com/tencent/mm/at/o:ahl	()Lcom/tencent/mm/at/g;
    //   828: aload 5
    //   830: getfield 315	com/tencent/mm/at/e:fDz	Ljava/lang/String;
    //   833: ldc 105
    //   835: ldc 105
    //   837: invokevirtual 309	com/tencent/mm/at/g:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   840: astore 5
    //   842: aload 4
    //   844: astore_2
    //   845: aload 5
    //   847: invokestatic 310	com/tencent/mm/modelsfs/FileOp:ct	(Ljava/lang/String;)Z
    //   850: ifeq -163 -> 687
    //   853: aload 5
    //   855: astore_2
    //   856: goto -169 -> 687
    //   859: astore_2
    //   860: goto -718 -> 142
    //   863: astore_2
    //   864: goto -722 -> 142
    //   867: astore 4
    //   869: goto -510 -> 359
    //   872: astore 5
    //   874: goto -549 -> 325
    //   877: aconst_null
    //   878: astore 4
    //   880: goto -66 -> 814
    //
    // Exception table:
    //   from	to	target	type
    //   24	31	113	java/io/IOException
    //   100	105	129	java/io/IOException
    //   182	195	247	java/io/UnsupportedEncodingException
    //   281	293	320	java/lang/Exception
    //   281	293	355	finally
    //   509	516	608	java/io/IOException
    //   593	599	859	java/io/IOException
    //   710	716	863	java/io/IOException
    //   296	303	867	finally
    //   328	347	867	finally
    //   296	303	872	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.g
 * JD-Core Version:    0.6.2
 */