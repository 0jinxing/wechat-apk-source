package com.tencent.mm.plugin.appbrand.game.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.b;
import com.tencent.mm.plugin.appbrand.game.page.f;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class c extends a<b>
{
  public static final int CTRL_INDEX = 100;
  public static final String NAME = "canvasToTempFilePath";

  // ERROR //
  public static f.a a(f paramf, JSONObject paramJSONObject, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 32
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ldc 40
    //   8: invokevirtual 46	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   11: istore_3
    //   12: new 48	android/os/Bundle
    //   15: astore 4
    //   17: aload 4
    //   19: invokespecial 49	android/os/Bundle:<init>	()V
    //   22: aload 4
    //   24: ldc 40
    //   26: iload_3
    //   27: invokevirtual 53	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   30: aload 4
    //   32: ldc 55
    //   34: iload_2
    //   35: invokevirtual 59	android/os/Bundle:putBoolean	(Ljava/lang/String;Z)V
    //   38: ldc 61
    //   40: ldc 63
    //   42: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: aload 4
    //   47: ldc 40
    //   49: iconst_m1
    //   50: invokevirtual 71	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   53: istore 5
    //   55: aload 4
    //   57: ldc 55
    //   59: iconst_1
    //   60: invokevirtual 75	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   63: istore_2
    //   64: iload 5
    //   66: iconst_m1
    //   67: if_icmpne +84 -> 151
    //   70: ldc 61
    //   72: ldc 77
    //   74: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aconst_null
    //   78: astore 4
    //   80: aload 4
    //   82: ifnonnull +368 -> 450
    //   85: ldc 82
    //   87: ldc 84
    //   89: invokestatic 87	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   95: astore_0
    //   96: aload_0
    //   97: ldc 91
    //   99: iconst_0
    //   100: anewarray 93	java/lang/Object
    //   103: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: ldc 32
    //   108: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_0
    //   112: areturn
    //   113: astore_0
    //   114: ldc 82
    //   116: ldc 101
    //   118: iconst_1
    //   119: anewarray 93	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_0
    //   125: aastore
    //   126: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   132: dup
    //   133: ldc 106
    //   135: iconst_0
    //   136: anewarray 93	java/lang/Object
    //   139: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: astore_0
    //   143: ldc 32
    //   145: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -37 -> 111
    //   151: ldc 61
    //   153: ldc 108
    //   155: iconst_2
    //   156: anewarray 93	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: iload 5
    //   163: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: iload_2
    //   170: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   173: aastore
    //   174: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload_0
    //   178: getfield 127	com/tencent/mm/plugin/appbrand/game/page/f:hsM	Lcom/tencent/magicbrush/b;
    //   181: ifnonnull +83 -> 264
    //   184: ldc 61
    //   186: ldc 129
    //   188: iconst_1
    //   189: anewarray 93	java/lang/Object
    //   192: dup
    //   193: iconst_0
    //   194: iload 5
    //   196: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: aastore
    //   200: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aconst_null
    //   204: astore 4
    //   206: ldc 61
    //   208: ldc 133
    //   210: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: goto -133 -> 80
    //   216: astore_0
    //   217: ldc 82
    //   219: aload_0
    //   220: ldc 135
    //   222: iconst_0
    //   223: anewarray 93	java/lang/Object
    //   226: invokestatic 139	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: getstatic 145	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   232: ldc2_w 146
    //   235: ldc2_w 148
    //   238: lconst_1
    //   239: invokevirtual 153	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   242: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   245: dup
    //   246: ldc 155
    //   248: iconst_0
    //   249: anewarray 93	java/lang/Object
    //   252: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: astore_0
    //   256: ldc 32
    //   258: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: goto -150 -> 111
    //   264: getstatic 159	com/tencent/mm/plugin/appbrand/game/page/f:$assertionsDisabled	Z
    //   267: ifne +28 -> 295
    //   270: aload_0
    //   271: getfield 127	com/tencent/mm/plugin/appbrand/game/page/f:hsM	Lcom/tencent/magicbrush/b;
    //   274: invokevirtual 165	com/tencent/magicbrush/b:getMBRuntime	()Lcom/tencent/magicbrush/MBRuntime;
    //   277: ifnonnull +18 -> 295
    //   280: new 167	java/lang/AssertionError
    //   283: astore_0
    //   284: aload_0
    //   285: invokespecial 168	java/lang/AssertionError:<init>	()V
    //   288: ldc 32
    //   290: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: aload_0
    //   294: athrow
    //   295: aload_0
    //   296: getfield 127	com/tencent/mm/plugin/appbrand/game/page/f:hsM	Lcom/tencent/magicbrush/b;
    //   299: invokevirtual 165	com/tencent/magicbrush/b:getMBRuntime	()Lcom/tencent/magicbrush/MBRuntime;
    //   302: invokevirtual 174	com/tencent/magicbrush/MBRuntime:getCanvasHandler	()Lcom/tencent/magicbrush/handler/MBCanvasHandler;
    //   305: astore 6
    //   307: iload 5
    //   309: ifgt +9 -> 318
    //   312: aconst_null
    //   313: astore 4
    //   315: goto -109 -> 206
    //   318: aload 6
    //   320: getfield 180	com/tencent/magicbrush/handler/MBCanvasHandler:bSv	Lcom/tencent/magicbrush/MBRuntime;
    //   323: invokevirtual 184	com/tencent/magicbrush/MBRuntime:getScreenCanvasId	()I
    //   326: ifle +41 -> 367
    //   329: iload 5
    //   331: ifle +36 -> 367
    //   334: aload 6
    //   336: getfield 180	com/tencent/magicbrush/handler/MBCanvasHandler:bSv	Lcom/tencent/magicbrush/MBRuntime;
    //   339: invokevirtual 184	com/tencent/magicbrush/MBRuntime:getScreenCanvasId	()I
    //   342: iload 5
    //   344: if_icmpne +23 -> 367
    //   347: iconst_1
    //   348: istore 7
    //   350: iload 7
    //   352: ifeq +21 -> 373
    //   355: aload 6
    //   357: aconst_null
    //   358: iload_2
    //   359: invokevirtual 187	com/tencent/magicbrush/handler/MBCanvasHandler:a	(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   362: astore 4
    //   364: goto -158 -> 206
    //   367: iconst_0
    //   368: istore 7
    //   370: goto -20 -> 350
    //   373: iload_2
    //   374: ifeq +37 -> 411
    //   377: aload 6
    //   379: getfield 180	com/tencent/magicbrush/handler/MBCanvasHandler:bSv	Lcom/tencent/magicbrush/MBRuntime;
    //   382: invokevirtual 191	com/tencent/magicbrush/MBRuntime:isDestroyedUnlock	()Z
    //   385: ifeq +9 -> 394
    //   388: aconst_null
    //   389: astore 4
    //   391: goto -185 -> 206
    //   394: aload 6
    //   396: aload 6
    //   398: getfield 195	com/tencent/magicbrush/handler/MBCanvasHandler:mNativeInst	J
    //   401: iload 5
    //   403: invokevirtual 199	com/tencent/magicbrush/handler/MBCanvasHandler:nativeCaptureCanvas	(JI)Landroid/graphics/Bitmap;
    //   406: astore 4
    //   408: goto -202 -> 206
    //   411: aload 6
    //   413: getfield 180	com/tencent/magicbrush/handler/MBCanvasHandler:bSv	Lcom/tencent/magicbrush/MBRuntime;
    //   416: invokevirtual 203	com/tencent/magicbrush/MBRuntime:getJsThreadHandler	()Lcom/tencent/magicbrush/handler/MBJsThreadHandler;
    //   419: astore 8
    //   421: new 205	com/tencent/magicbrush/handler/MBCanvasHandler$3
    //   424: astore 4
    //   426: aload 4
    //   428: aload 6
    //   430: iload 5
    //   432: invokespecial 208	com/tencent/magicbrush/handler/MBCanvasHandler$3:<init>	(Lcom/tencent/magicbrush/handler/MBCanvasHandler;I)V
    //   435: aload 8
    //   437: aload 4
    //   439: invokevirtual 213	com/tencent/magicbrush/handler/MBJsThreadHandler:a	(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    //   442: checkcast 215	android/graphics/Bitmap
    //   445: astore 4
    //   447: goto -241 -> 206
    //   450: aload 4
    //   452: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   455: i2f
    //   456: fstore 9
    //   458: aload 4
    //   460: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   463: i2f
    //   464: fstore 10
    //   466: aload 4
    //   468: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   471: i2f
    //   472: fstore 11
    //   474: aload 4
    //   476: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   479: i2f
    //   480: fstore 12
    //   482: ldc 82
    //   484: ldc 223
    //   486: iconst_4
    //   487: anewarray 93	java/lang/Object
    //   490: dup
    //   491: iconst_0
    //   492: fload 9
    //   494: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   497: aastore
    //   498: dup
    //   499: iconst_1
    //   500: fload 10
    //   502: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   505: aastore
    //   506: dup
    //   507: iconst_2
    //   508: fload 11
    //   510: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   513: aastore
    //   514: dup
    //   515: iconst_3
    //   516: fload 12
    //   518: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   521: aastore
    //   522: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   525: aload_1
    //   526: ldc 230
    //   528: dconst_0
    //   529: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   532: d2f
    //   533: fstore 13
    //   535: aload_1
    //   536: ldc 236
    //   538: dconst_0
    //   539: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   542: d2f
    //   543: fstore 14
    //   545: aload_1
    //   546: ldc 238
    //   548: fload 11
    //   550: f2d
    //   551: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   554: d2f
    //   555: fstore 15
    //   557: aload_1
    //   558: ldc 240
    //   560: fload 12
    //   562: f2d
    //   563: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   566: d2f
    //   567: fstore 16
    //   569: ldc 82
    //   571: ldc 242
    //   573: iconst_4
    //   574: anewarray 93	java/lang/Object
    //   577: dup
    //   578: iconst_0
    //   579: fload 13
    //   581: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   584: aastore
    //   585: dup
    //   586: iconst_1
    //   587: fload 14
    //   589: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   592: aastore
    //   593: dup
    //   594: iconst_2
    //   595: fload 15
    //   597: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   600: aastore
    //   601: dup
    //   602: iconst_3
    //   603: fload 16
    //   605: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   608: aastore
    //   609: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   612: fload 11
    //   614: fconst_0
    //   615: fcmpl
    //   616: ifle +1129 -> 1745
    //   619: fload 12
    //   621: fconst_0
    //   622: fcmpl
    //   623: ifle +1122 -> 1745
    //   626: fload 9
    //   628: fload 11
    //   630: fcmpl
    //   631: ifne +11 -> 642
    //   634: fload 10
    //   636: fload 12
    //   638: fcmpl
    //   639: ifeq +1106 -> 1745
    //   642: fload 13
    //   644: fstore 17
    //   646: fload 13
    //   648: fconst_0
    //   649: fcmpl
    //   650: ifle +13 -> 663
    //   653: fload 13
    //   655: fload 11
    //   657: fdiv
    //   658: fload 9
    //   660: fmul
    //   661: fstore 17
    //   663: fload 14
    //   665: fstore 18
    //   667: fload 14
    //   669: fconst_0
    //   670: fcmpl
    //   671: ifle +13 -> 684
    //   674: fload 14
    //   676: fload 12
    //   678: fdiv
    //   679: fload 10
    //   681: fmul
    //   682: fstore 18
    //   684: fload 15
    //   686: fload 11
    //   688: fdiv
    //   689: fload 9
    //   691: fmul
    //   692: fstore 15
    //   694: fload 16
    //   696: fload 12
    //   698: fdiv
    //   699: fload 10
    //   701: fmul
    //   702: fstore 16
    //   704: fload 17
    //   706: fstore 13
    //   708: fload 18
    //   710: fstore 14
    //   712: fload 15
    //   714: fstore 18
    //   716: fload 16
    //   718: fstore 17
    //   720: fload 13
    //   722: fload 18
    //   724: fadd
    //   725: fload 9
    //   727: fcmpl
    //   728: ifle +1014 -> 1742
    //   731: fload 9
    //   733: fload 13
    //   735: fsub
    //   736: fstore 18
    //   738: fload 14
    //   740: fload 17
    //   742: fadd
    //   743: fload 10
    //   745: fcmpl
    //   746: ifle +993 -> 1739
    //   749: fload 10
    //   751: fload 14
    //   753: fsub
    //   754: fstore 17
    //   756: aload_1
    //   757: ldc 244
    //   759: fload 18
    //   761: f2d
    //   762: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   765: d2f
    //   766: fstore 15
    //   768: aload_1
    //   769: ldc 246
    //   771: fload 17
    //   773: f2d
    //   774: invokevirtual 234	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   777: d2f
    //   778: fstore 16
    //   780: ldc 82
    //   782: ldc 248
    //   784: bipush 8
    //   786: anewarray 93	java/lang/Object
    //   789: dup
    //   790: iconst_0
    //   791: fload 13
    //   793: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   796: aastore
    //   797: dup
    //   798: iconst_1
    //   799: fload 14
    //   801: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   804: aastore
    //   805: dup
    //   806: iconst_2
    //   807: fload 9
    //   809: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   812: aastore
    //   813: dup
    //   814: iconst_3
    //   815: fload 10
    //   817: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   820: aastore
    //   821: dup
    //   822: iconst_4
    //   823: fload 18
    //   825: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   828: aastore
    //   829: dup
    //   830: iconst_5
    //   831: fload 17
    //   833: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   836: aastore
    //   837: dup
    //   838: bipush 6
    //   840: fload 15
    //   842: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   845: aastore
    //   846: dup
    //   847: bipush 7
    //   849: fload 16
    //   851: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   854: aastore
    //   855: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   858: fload 13
    //   860: f2i
    //   861: iflt +57 -> 918
    //   864: fload 14
    //   866: f2i
    //   867: iflt +51 -> 918
    //   870: fload 18
    //   872: f2i
    //   873: ifle +45 -> 918
    //   876: fload 17
    //   878: f2i
    //   879: ifle +39 -> 918
    //   882: fload 13
    //   884: fload 18
    //   886: fadd
    //   887: f2i
    //   888: fload 9
    //   890: f2i
    //   891: if_icmpgt +27 -> 918
    //   894: fload 14
    //   896: fload 17
    //   898: fadd
    //   899: f2i
    //   900: fload 10
    //   902: f2i
    //   903: if_icmpgt +15 -> 918
    //   906: fload 15
    //   908: f2i
    //   909: ifle +9 -> 918
    //   912: fload 16
    //   914: f2i
    //   915: ifgt +75 -> 990
    //   918: ldc 82
    //   920: ldc 250
    //   922: iconst_5
    //   923: anewarray 93	java/lang/Object
    //   926: dup
    //   927: iconst_0
    //   928: fload 13
    //   930: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   933: aastore
    //   934: dup
    //   935: iconst_1
    //   936: fload 14
    //   938: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   941: aastore
    //   942: dup
    //   943: iconst_2
    //   944: fload 18
    //   946: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   949: aastore
    //   950: dup
    //   951: iconst_3
    //   952: fload 17
    //   954: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   957: aastore
    //   958: dup
    //   959: iconst_4
    //   960: iload_3
    //   961: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   964: aastore
    //   965: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   968: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   971: dup
    //   972: ldc 252
    //   974: iconst_0
    //   975: anewarray 93	java/lang/Object
    //   978: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   981: astore_0
    //   982: ldc 32
    //   984: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   987: goto -876 -> 111
    //   990: fload 18
    //   992: fload 9
    //   994: fcmpl
    //   995: ifne +11 -> 1006
    //   998: fload 17
    //   1000: fload 10
    //   1002: fcmpl
    //   1003: ifeq +733 -> 1736
    //   1006: fload 13
    //   1008: f2i
    //   1009: istore 19
    //   1011: fload 14
    //   1013: f2i
    //   1014: istore 5
    //   1016: fload 18
    //   1018: f2i
    //   1019: istore 20
    //   1021: fload 17
    //   1023: f2i
    //   1024: istore 7
    //   1026: aload 4
    //   1028: iload 19
    //   1030: iload 5
    //   1032: iload 20
    //   1034: iload 7
    //   1036: aconst_null
    //   1037: iconst_0
    //   1038: invokestatic 256	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   1041: astore 8
    //   1043: aload 4
    //   1045: invokevirtual 259	android/graphics/Bitmap:recycle	()V
    //   1048: aload 8
    //   1050: astore 4
    //   1052: aload 4
    //   1054: ifnonnull +34 -> 1088
    //   1057: ldc 82
    //   1059: ldc_w 261
    //   1062: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1065: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1068: dup
    //   1069: ldc_w 263
    //   1072: iconst_0
    //   1073: anewarray 93	java/lang/Object
    //   1076: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1079: astore_0
    //   1080: ldc 32
    //   1082: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1085: goto -974 -> 111
    //   1088: aload 4
    //   1090: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   1093: ifle +11 -> 1104
    //   1096: aload 4
    //   1098: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   1101: ifgt +34 -> 1135
    //   1104: ldc 82
    //   1106: ldc_w 265
    //   1109: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1112: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1115: dup
    //   1116: ldc_w 263
    //   1119: iconst_0
    //   1120: anewarray 93	java/lang/Object
    //   1123: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1126: astore_0
    //   1127: ldc 32
    //   1129: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1132: goto -1021 -> 111
    //   1135: fload 18
    //   1137: fload 15
    //   1139: fcmpl
    //   1140: ifne +15 -> 1155
    //   1143: aload 4
    //   1145: astore 8
    //   1147: fload 17
    //   1149: fload 16
    //   1151: fcmpl
    //   1152: ifeq +71 -> 1223
    //   1155: fload 15
    //   1157: f2i
    //   1158: istore 7
    //   1160: fload 16
    //   1162: f2i
    //   1163: istore 5
    //   1165: aload 4
    //   1167: iload 7
    //   1169: iload 5
    //   1171: iconst_0
    //   1172: invokestatic 269	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   1175: astore 8
    //   1177: aload 4
    //   1179: invokevirtual 259	android/graphics/Bitmap:recycle	()V
    //   1182: aload 8
    //   1184: ifnonnull +39 -> 1223
    //   1187: getstatic 145	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1190: ldc2_w 146
    //   1193: ldc2_w 270
    //   1196: lconst_1
    //   1197: invokevirtual 153	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   1200: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1203: astore_0
    //   1204: aload_0
    //   1205: ldc_w 273
    //   1208: iconst_0
    //   1209: anewarray 93	java/lang/Object
    //   1212: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1215: ldc 32
    //   1217: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1220: goto -1109 -> 111
    //   1223: aload_1
    //   1224: invokestatic 278	com/tencent/mm/plugin/appbrand/jsapi/b/c:x	(Lorg/json/JSONObject;)Landroid/graphics/Bitmap$CompressFormat;
    //   1227: astore 6
    //   1229: aload 6
    //   1231: getstatic 284	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   1234: if_acmpne +495 -> 1729
    //   1237: aload 8
    //   1239: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   1242: aload 8
    //   1244: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   1247: getstatic 290	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   1250: invokestatic 293	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   1253: astore 4
    //   1255: new 295	android/graphics/Canvas
    //   1258: astore 21
    //   1260: aload 21
    //   1262: aload 4
    //   1264: invokespecial 298	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   1267: aload 21
    //   1269: aload 8
    //   1271: fconst_0
    //   1272: fconst_0
    //   1273: aconst_null
    //   1274: invokevirtual 302	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //   1277: aload_0
    //   1278: invokevirtual 306	com/tencent/mm/plugin/appbrand/game/page/f:getAppId	()Ljava/lang/String;
    //   1281: ldc_w 308
    //   1284: iload_3
    //   1285: invokestatic 313	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1288: invokevirtual 317	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1291: invokestatic 323	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObjectManager:genMediaFilePath	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1294: astore 8
    //   1296: aload 4
    //   1298: aload_1
    //   1299: invokestatic 326	com/tencent/mm/plugin/appbrand/jsapi/b/c:w	(Lorg/json/JSONObject;)I
    //   1302: aload 6
    //   1304: aload 8
    //   1306: iconst_1
    //   1307: invokestatic 331	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1310: aload_0
    //   1311: invokevirtual 306	com/tencent/mm/plugin/appbrand/game/page/f:getAppId	()Ljava/lang/String;
    //   1314: astore_1
    //   1315: aload 6
    //   1317: getstatic 334	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1320: if_acmpne +313 -> 1633
    //   1323: ldc_w 336
    //   1326: astore_0
    //   1327: aload_1
    //   1328: aload 8
    //   1330: aload_0
    //   1331: iconst_1
    //   1332: invokestatic 340	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObjectManager:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject;
    //   1335: astore_1
    //   1336: aload_1
    //   1337: ifnonnull +303 -> 1640
    //   1340: ldc 82
    //   1342: ldc_w 342
    //   1345: iconst_1
    //   1346: anewarray 93	java/lang/Object
    //   1349: dup
    //   1350: iconst_0
    //   1351: iload_3
    //   1352: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1355: aastore
    //   1356: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1359: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1362: dup
    //   1363: ldc_w 344
    //   1366: iconst_0
    //   1367: anewarray 93	java/lang/Object
    //   1370: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1373: astore_0
    //   1374: ldc 32
    //   1376: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1379: goto -1268 -> 111
    //   1382: astore_0
    //   1383: ldc 82
    //   1385: ldc_w 346
    //   1388: iconst_4
    //   1389: anewarray 93	java/lang/Object
    //   1392: dup
    //   1393: iconst_0
    //   1394: aload 4
    //   1396: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   1399: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1402: aastore
    //   1403: dup
    //   1404: iconst_1
    //   1405: aload 4
    //   1407: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   1410: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1413: aastore
    //   1414: dup
    //   1415: iconst_2
    //   1416: fload 15
    //   1418: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1421: aastore
    //   1422: dup
    //   1423: iconst_3
    //   1424: fload 16
    //   1426: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1429: aastore
    //   1430: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1433: ldc 82
    //   1435: aload_0
    //   1436: ldc_w 348
    //   1439: iconst_0
    //   1440: anewarray 93	java/lang/Object
    //   1443: invokestatic 139	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1446: getstatic 145	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1449: ldc2_w 146
    //   1452: ldc2_w 270
    //   1455: lconst_1
    //   1456: invokevirtual 153	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   1459: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1462: dup
    //   1463: ldc_w 273
    //   1466: iconst_0
    //   1467: anewarray 93	java/lang/Object
    //   1470: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1473: astore_0
    //   1474: ldc 32
    //   1476: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1479: goto -1368 -> 111
    //   1482: astore_0
    //   1483: aload 4
    //   1485: astore 8
    //   1487: ldc 82
    //   1489: ldc_w 350
    //   1492: iconst_4
    //   1493: anewarray 93	java/lang/Object
    //   1496: dup
    //   1497: iconst_0
    //   1498: aload 8
    //   1500: invokevirtual 218	android/graphics/Bitmap:getWidth	()I
    //   1503: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1506: aastore
    //   1507: dup
    //   1508: iconst_1
    //   1509: aload 8
    //   1511: invokevirtual 221	android/graphics/Bitmap:getHeight	()I
    //   1514: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1517: aastore
    //   1518: dup
    //   1519: iconst_2
    //   1520: fload 15
    //   1522: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1525: aastore
    //   1526: dup
    //   1527: iconst_3
    //   1528: fload 16
    //   1530: invokestatic 228	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1533: aastore
    //   1534: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1537: ldc 82
    //   1539: aload_0
    //   1540: ldc_w 352
    //   1543: iconst_0
    //   1544: anewarray 93	java/lang/Object
    //   1547: invokestatic 139	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1550: getstatic 145	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1553: ldc2_w 146
    //   1556: ldc2_w 353
    //   1559: lconst_1
    //   1560: invokevirtual 153	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   1563: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1566: dup
    //   1567: ldc_w 356
    //   1570: iconst_0
    //   1571: anewarray 93	java/lang/Object
    //   1574: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1577: astore_0
    //   1578: ldc 32
    //   1580: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1583: goto -1472 -> 111
    //   1586: astore_0
    //   1587: ldc 82
    //   1589: ldc_w 358
    //   1592: iconst_2
    //   1593: anewarray 93	java/lang/Object
    //   1596: dup
    //   1597: iconst_0
    //   1598: iload_3
    //   1599: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1602: aastore
    //   1603: dup
    //   1604: iconst_1
    //   1605: aload_0
    //   1606: aastore
    //   1607: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1610: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1613: dup
    //   1614: ldc_w 360
    //   1617: iconst_0
    //   1618: anewarray 93	java/lang/Object
    //   1621: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1624: astore_0
    //   1625: ldc 32
    //   1627: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1630: goto -1519 -> 111
    //   1633: ldc_w 362
    //   1636: astore_0
    //   1637: goto -310 -> 1327
    //   1640: new 364	java/util/HashMap
    //   1643: astore_0
    //   1644: aload_0
    //   1645: invokespecial 365	java/util/HashMap:<init>	()V
    //   1648: aload_0
    //   1649: ldc_w 367
    //   1652: aload_1
    //   1653: getfield 372	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:czD	Ljava/lang/String;
    //   1656: invokeinterface 378 3 0
    //   1661: pop
    //   1662: ldc 82
    //   1664: ldc_w 380
    //   1667: iconst_2
    //   1668: anewarray 93	java/lang/Object
    //   1671: dup
    //   1672: iconst_0
    //   1673: aload_1
    //   1674: getfield 372	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:czD	Ljava/lang/String;
    //   1677: aastore
    //   1678: dup
    //   1679: iconst_1
    //   1680: aload_1
    //   1681: getfield 383	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:fnQ	Ljava/lang/String;
    //   1684: aastore
    //   1685: invokestatic 386	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1688: new 89	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   1691: astore_1
    //   1692: aload_1
    //   1693: ldc_w 388
    //   1696: iconst_0
    //   1697: anewarray 93	java/lang/Object
    //   1700: invokespecial 96	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1703: aload_1
    //   1704: aload_0
    //   1705: invokevirtual 391	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:y	(Ljava/util/Map;)Lcom/tencent/mm/plugin/appbrand/jsapi/file/f$a;
    //   1708: astore_0
    //   1709: ldc 32
    //   1711: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1714: goto -1603 -> 111
    //   1717: astore_0
    //   1718: goto -231 -> 1487
    //   1721: astore_0
    //   1722: aload 8
    //   1724: astore 4
    //   1726: goto -343 -> 1383
    //   1729: aload 8
    //   1731: astore 4
    //   1733: goto -456 -> 1277
    //   1736: goto -684 -> 1052
    //   1739: goto -983 -> 756
    //   1742: goto -1004 -> 738
    //   1745: fload 16
    //   1747: fstore 17
    //   1749: fload 15
    //   1751: fstore 18
    //   1753: goto -1033 -> 720
    //
    // Exception table:
    //   from	to	target	type
    //   5	12	113	org/json/JSONException
    //   5	12	216	java/lang/OutOfMemoryError
    //   12	64	216	java/lang/OutOfMemoryError
    //   70	77	216	java/lang/OutOfMemoryError
    //   85	106	216	java/lang/OutOfMemoryError
    //   114	143	216	java/lang/OutOfMemoryError
    //   151	203	216	java/lang/OutOfMemoryError
    //   206	213	216	java/lang/OutOfMemoryError
    //   264	295	216	java/lang/OutOfMemoryError
    //   295	307	216	java/lang/OutOfMemoryError
    //   318	329	216	java/lang/OutOfMemoryError
    //   334	347	216	java/lang/OutOfMemoryError
    //   355	364	216	java/lang/OutOfMemoryError
    //   377	388	216	java/lang/OutOfMemoryError
    //   394	408	216	java/lang/OutOfMemoryError
    //   411	447	216	java/lang/OutOfMemoryError
    //   450	612	216	java/lang/OutOfMemoryError
    //   756	858	216	java/lang/OutOfMemoryError
    //   918	982	216	java/lang/OutOfMemoryError
    //   1026	1048	216	java/lang/OutOfMemoryError
    //   1057	1080	216	java/lang/OutOfMemoryError
    //   1088	1104	216	java/lang/OutOfMemoryError
    //   1104	1127	216	java/lang/OutOfMemoryError
    //   1165	1182	216	java/lang/OutOfMemoryError
    //   1187	1215	216	java/lang/OutOfMemoryError
    //   1223	1277	216	java/lang/OutOfMemoryError
    //   1277	1296	216	java/lang/OutOfMemoryError
    //   1296	1310	216	java/lang/OutOfMemoryError
    //   1310	1323	216	java/lang/OutOfMemoryError
    //   1327	1336	216	java/lang/OutOfMemoryError
    //   1340	1374	216	java/lang/OutOfMemoryError
    //   1383	1474	216	java/lang/OutOfMemoryError
    //   1487	1578	216	java/lang/OutOfMemoryError
    //   1587	1625	216	java/lang/OutOfMemoryError
    //   1640	1709	216	java/lang/OutOfMemoryError
    //   1165	1182	1382	java/lang/NullPointerException
    //   1165	1182	1482	java/lang/IllegalArgumentException
    //   1296	1310	1586	java/io/IOException
    //   1187	1215	1717	java/lang/IllegalArgumentException
    //   1187	1215	1721	java/lang/NullPointerException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.c
 * JD-Core Version:    0.6.2
 */