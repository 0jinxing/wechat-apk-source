package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cla;
import com.tencent.mm.protocal.protobuf.clb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class l extends m
  implements k
{
  private int coc;
  private f ehi;
  private int frO;
  private int frP;
  private String fse;
  private String fsf;
  private String fsg;
  private String imgPath;

  public l(String paramString)
  {
    AppMethodBeat.i(77941);
    this.fsg = r.Yz();
    o.acd();
    this.fse = d.D(this.fsg, true);
    String str = this.fse + ".tmp";
    if (aw(paramString, str) == 0)
    {
      this.imgPath = str;
      this.frP = 1;
      o.acd();
      this.fsf = com.tencent.mm.a.g.x(com.tencent.mm.vfs.e.e(d.C(this.fsg, true), 0, -1));
      this.frO = 0;
      this.coc = 0;
    }
    AppMethodBeat.o(77941);
  }

  // ERROR //
  private static int aw(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 101
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 107	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   9: astore_2
    //   10: aload_2
    //   11: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   14: sipush 640
    //   17: if_icmpge +59 -> 76
    //   20: aload_2
    //   21: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   24: sipush 640
    //   27: if_icmpge +49 -> 76
    //   30: aload_0
    //   31: aload_1
    //   32: invokestatic 119	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   35: pop2
    //   36: ldc 121
    //   38: ldc 123
    //   40: iconst_2
    //   41: anewarray 125	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_2
    //   47: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   50: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_2
    //   57: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   60: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: aastore
    //   64: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: iconst_0
    //   68: istore_3
    //   69: ldc 101
    //   71: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: iload_3
    //   75: ireturn
    //   76: bipush 50
    //   78: istore_3
    //   79: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   82: invokestatic 148	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   85: ifeq +418 -> 503
    //   88: ldc 150
    //   90: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   93: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   96: invokeinterface 160 1 0
    //   101: ldc 162
    //   103: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   106: bipush 50
    //   108: invokestatic 174	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   111: istore 4
    //   113: iload 4
    //   115: istore_3
    //   116: iconst_0
    //   117: istore 5
    //   119: iconst_0
    //   120: istore 6
    //   122: iload 6
    //   124: istore 4
    //   126: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   129: invokestatic 148	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   132: ifeq +482 -> 614
    //   135: iload 6
    //   137: istore 4
    //   139: ldc 150
    //   141: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   144: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   147: invokeinterface 160 1 0
    //   152: ldc 176
    //   154: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   157: astore 7
    //   159: iload 6
    //   161: istore 4
    //   163: aload 7
    //   165: ldc 178
    //   167: invokevirtual 184	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   170: istore 8
    //   172: iload 5
    //   174: istore 4
    //   176: iconst_m1
    //   177: iload 8
    //   179: if_icmpeq +544 -> 723
    //   182: iload 6
    //   184: istore 4
    //   186: aload 7
    //   188: iconst_0
    //   189: iload 8
    //   191: invokevirtual 188	java/lang/String:substring	(II)Ljava/lang/String;
    //   194: invokestatic 191	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   197: invokevirtual 195	java/lang/Integer:intValue	()I
    //   200: istore 6
    //   202: iload 6
    //   204: istore 4
    //   206: aload 7
    //   208: iload 8
    //   210: iconst_1
    //   211: iadd
    //   212: invokevirtual 198	java/lang/String:substring	(I)Ljava/lang/String;
    //   215: invokestatic 191	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   218: invokevirtual 195	java/lang/Integer:intValue	()I
    //   221: istore 5
    //   223: iload 6
    //   225: istore 4
    //   227: iload 5
    //   229: istore 6
    //   231: iload 4
    //   233: ifgt +498 -> 731
    //   236: iload 6
    //   238: ifgt +493 -> 731
    //   241: iconst_0
    //   242: istore 6
    //   244: sipush 1080
    //   247: istore 4
    //   249: aload_2
    //   250: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   253: aload_2
    //   254: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   257: if_icmple +517 -> 774
    //   260: aload_2
    //   261: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   264: istore 5
    //   266: aload_2
    //   267: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   270: aload_2
    //   271: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   274: if_icmpge +509 -> 783
    //   277: aload_2
    //   278: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   281: istore 8
    //   283: ldc 121
    //   285: ldc 200
    //   287: iconst_5
    //   288: anewarray 125	java/lang/Object
    //   291: dup
    //   292: iconst_0
    //   293: iload 6
    //   295: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: iload 4
    //   303: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   306: aastore
    //   307: dup
    //   308: iconst_2
    //   309: iload_3
    //   310: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   313: aastore
    //   314: dup
    //   315: iconst_3
    //   316: aload_2
    //   317: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   320: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   323: aastore
    //   324: dup
    //   325: iconst_4
    //   326: aload_2
    //   327: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   330: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   333: aastore
    //   334: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: iload 4
    //   339: ifle +453 -> 792
    //   342: iload 8
    //   344: iload 4
    //   346: idiv
    //   347: istore 5
    //   349: aload_2
    //   350: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   353: iload 4
    //   355: imul
    //   356: iload 8
    //   358: idiv
    //   359: istore 6
    //   361: iload 4
    //   363: aload_2
    //   364: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   367: imul
    //   368: iload 8
    //   370: idiv
    //   371: istore 4
    //   373: iload 6
    //   375: istore 9
    //   377: iload 4
    //   379: istore 8
    //   381: iload 6
    //   383: iload 4
    //   385: imul
    //   386: ldc 201
    //   388: if_icmple +36 -> 424
    //   391: ldc2_w 202
    //   394: iload 6
    //   396: iload 4
    //   398: imul
    //   399: i2d
    //   400: ddiv
    //   401: invokestatic 209	java/lang/Math:sqrt	(D)D
    //   404: dstore 10
    //   406: iload 6
    //   408: i2d
    //   409: dload 10
    //   411: ddiv
    //   412: d2i
    //   413: istore 9
    //   415: iload 4
    //   417: i2d
    //   418: dload 10
    //   420: ddiv
    //   421: d2i
    //   422: istore 8
    //   424: new 109	android/graphics/BitmapFactory$Options
    //   427: dup
    //   428: invokespecial 210	android/graphics/BitmapFactory$Options:<init>	()V
    //   431: astore 7
    //   433: aload 7
    //   435: getstatic 216	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   438: putfield 219	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   441: iload 5
    //   443: iconst_2
    //   444: if_icmplt +10 -> 454
    //   447: aload 7
    //   449: iload 5
    //   451: putfield 222	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   454: aload_0
    //   455: aload 7
    //   457: invokestatic 226	com/tencent/mm/sdk/platformtools/d:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   460: astore 12
    //   462: aload 12
    //   464: ifnonnull +374 -> 838
    //   467: ldc 121
    //   469: ldc 228
    //   471: iconst_1
    //   472: anewarray 125	java/lang/Object
    //   475: dup
    //   476: iconst_0
    //   477: aload 7
    //   479: getfield 222	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   482: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   485: aastore
    //   486: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   489: iconst_0
    //   490: invokestatic 235	com/tencent/mm/compatible/util/g:getLine	()I
    //   493: isub
    //   494: istore_3
    //   495: ldc 101
    //   497: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   500: goto -426 -> 74
    //   503: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   506: invokestatic 238	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   509: ifeq +34 -> 543
    //   512: ldc 150
    //   514: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   517: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   520: invokeinterface 160 1 0
    //   525: ldc 240
    //   527: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   530: bipush 50
    //   532: invokestatic 174	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   535: istore 4
    //   537: iload 4
    //   539: istore_3
    //   540: goto -424 -> 116
    //   543: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   546: invokestatic 243	com/tencent/mm/sdk/platformtools/at:is3G	(Landroid/content/Context;)Z
    //   549: ifeq +34 -> 583
    //   552: ldc 150
    //   554: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   557: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   560: invokeinterface 160 1 0
    //   565: ldc 245
    //   567: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   570: bipush 50
    //   572: invokestatic 174	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   575: istore 4
    //   577: iload 4
    //   579: istore_3
    //   580: goto -464 -> 116
    //   583: ldc 150
    //   585: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   588: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   591: invokeinterface 160 1 0
    //   596: ldc 247
    //   598: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   601: bipush 50
    //   603: invokestatic 174	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   606: istore 4
    //   608: iload 4
    //   610: istore_3
    //   611: goto -495 -> 116
    //   614: iload 6
    //   616: istore 4
    //   618: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   621: invokestatic 238	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   624: ifeq +30 -> 654
    //   627: iload 6
    //   629: istore 4
    //   631: ldc 150
    //   633: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   636: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   639: invokeinterface 160 1 0
    //   644: ldc 249
    //   646: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   649: astore 7
    //   651: goto -492 -> 159
    //   654: iload 6
    //   656: istore 4
    //   658: invokestatic 142	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   661: invokestatic 243	com/tencent/mm/sdk/platformtools/at:is3G	(Landroid/content/Context;)Z
    //   664: ifeq +30 -> 694
    //   667: iload 6
    //   669: istore 4
    //   671: ldc 150
    //   673: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   676: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   679: invokeinterface 160 1 0
    //   684: ldc 251
    //   686: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   689: astore 7
    //   691: goto -532 -> 159
    //   694: iload 6
    //   696: istore 4
    //   698: ldc 150
    //   700: invokestatic 156	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   703: checkcast 150	com/tencent/mm/plugin/zero/b/a
    //   706: invokeinterface 160 1 0
    //   711: ldc 253
    //   713: invokevirtual 168	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   716: astore 7
    //   718: goto -559 -> 159
    //   721: astore 7
    //   723: sipush 1080
    //   726: istore 6
    //   728: goto -497 -> 231
    //   731: iload 6
    //   733: sipush 2160
    //   736: if_icmplt +14 -> 750
    //   739: iconst_0
    //   740: istore 6
    //   742: sipush 1080
    //   745: istore 4
    //   747: goto -498 -> 249
    //   750: iload 6
    //   752: ifgt +424 -> 1176
    //   755: iload 4
    //   757: sipush 3240
    //   760: if_icmple +416 -> 1176
    //   763: sipush 1620
    //   766: istore 6
    //   768: iconst_0
    //   769: istore 4
    //   771: goto -522 -> 249
    //   774: aload_2
    //   775: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   778: istore 5
    //   780: goto -514 -> 266
    //   783: aload_2
    //   784: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   787: istore 8
    //   789: goto -506 -> 283
    //   792: iload 5
    //   794: iload 6
    //   796: idiv
    //   797: istore 8
    //   799: aload_2
    //   800: getfield 112	android/graphics/BitmapFactory$Options:outHeight	I
    //   803: iload 6
    //   805: imul
    //   806: iload 5
    //   808: idiv
    //   809: istore 4
    //   811: iload 6
    //   813: aload_2
    //   814: getfield 115	android/graphics/BitmapFactory$Options:outWidth	I
    //   817: imul
    //   818: iload 5
    //   820: idiv
    //   821: istore 5
    //   823: iload 4
    //   825: istore 6
    //   827: iload 5
    //   829: istore 4
    //   831: iload 8
    //   833: istore 5
    //   835: goto -462 -> 373
    //   838: ldc 121
    //   840: ldc 255
    //   842: iconst_2
    //   843: anewarray 125	java/lang/Object
    //   846: dup
    //   847: iconst_0
    //   848: aload 12
    //   850: invokevirtual 260	android/graphics/Bitmap:getWidth	()I
    //   853: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   856: aastore
    //   857: dup
    //   858: iconst_1
    //   859: aload 12
    //   861: invokevirtual 263	android/graphics/Bitmap:getHeight	()I
    //   864: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   867: aastore
    //   868: invokestatic 266	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   871: iload 5
    //   873: iconst_1
    //   874: if_icmple +78 -> 952
    //   877: aload 12
    //   879: iload 8
    //   881: iload 9
    //   883: iconst_1
    //   884: invokestatic 270	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   887: astore 7
    //   889: aload 12
    //   891: aload 7
    //   893: if_acmpeq +28 -> 921
    //   896: ldc 121
    //   898: ldc_w 272
    //   901: iconst_1
    //   902: anewarray 125	java/lang/Object
    //   905: dup
    //   906: iconst_0
    //   907: aload 12
    //   909: invokevirtual 273	java/lang/Object:toString	()Ljava/lang/String;
    //   912: aastore
    //   913: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   916: aload 12
    //   918: invokevirtual 276	android/graphics/Bitmap:recycle	()V
    //   921: aload 7
    //   923: astore 12
    //   925: aload 7
    //   927: ifnonnull +25 -> 952
    //   930: ldc 121
    //   932: ldc_w 278
    //   935: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   938: iconst_0
    //   939: invokestatic 235	com/tencent/mm/compatible/util/g:getLine	()I
    //   942: isub
    //   943: istore_3
    //   944: ldc 101
    //   946: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   949: goto -875 -> 74
    //   952: aconst_null
    //   953: astore_2
    //   954: aconst_null
    //   955: astore 7
    //   957: aload_1
    //   958: iconst_0
    //   959: invokestatic 285	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   962: astore 13
    //   964: aload 13
    //   966: astore 7
    //   968: aload 13
    //   970: astore_2
    //   971: aload 12
    //   973: getstatic 291	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   976: iload_3
    //   977: aload 13
    //   979: invokevirtual 295	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   982: pop
    //   983: aload 13
    //   985: ifnull +8 -> 993
    //   988: aload 13
    //   990: invokevirtual 300	java/io/OutputStream:close	()V
    //   993: ldc 121
    //   995: ldc_w 302
    //   998: iconst_3
    //   999: anewarray 125	java/lang/Object
    //   1002: dup
    //   1003: iconst_0
    //   1004: aload 12
    //   1006: invokevirtual 273	java/lang/Object:toString	()Ljava/lang/String;
    //   1009: aastore
    //   1010: dup
    //   1011: iconst_1
    //   1012: aload_0
    //   1013: invokestatic 306	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1016: invokestatic 311	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_2
    //   1022: aload_1
    //   1023: invokestatic 306	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1026: invokestatic 311	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1029: aastore
    //   1030: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1033: aload 12
    //   1035: invokevirtual 276	android/graphics/Bitmap:recycle	()V
    //   1038: iconst_0
    //   1039: istore_3
    //   1040: ldc 101
    //   1042: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1045: goto -971 -> 74
    //   1048: astore_0
    //   1049: aload 7
    //   1051: astore_2
    //   1052: ldc 121
    //   1054: ldc_w 313
    //   1057: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1060: aload 7
    //   1062: astore_2
    //   1063: ldc 121
    //   1065: ldc_w 315
    //   1068: iconst_1
    //   1069: anewarray 125	java/lang/Object
    //   1072: dup
    //   1073: iconst_0
    //   1074: aload_0
    //   1075: invokestatic 319	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1078: aastore
    //   1079: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1082: aload 7
    //   1084: astore_2
    //   1085: ldc 121
    //   1087: ldc_w 272
    //   1090: iconst_1
    //   1091: anewarray 125	java/lang/Object
    //   1094: dup
    //   1095: iconst_0
    //   1096: aload 12
    //   1098: invokevirtual 273	java/lang/Object:toString	()Ljava/lang/String;
    //   1101: aastore
    //   1102: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1105: aload 7
    //   1107: astore_2
    //   1108: aload 12
    //   1110: invokevirtual 276	android/graphics/Bitmap:recycle	()V
    //   1113: aload 7
    //   1115: astore_2
    //   1116: invokestatic 235	com/tencent/mm/compatible/util/g:getLine	()I
    //   1119: istore_3
    //   1120: iconst_0
    //   1121: iload_3
    //   1122: isub
    //   1123: istore_3
    //   1124: aload 7
    //   1126: ifnull +8 -> 1134
    //   1129: aload 7
    //   1131: invokevirtual 300	java/io/OutputStream:close	()V
    //   1134: ldc 101
    //   1136: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1139: goto -1065 -> 74
    //   1142: astore_0
    //   1143: aload_2
    //   1144: ifnull +7 -> 1151
    //   1147: aload_2
    //   1148: invokevirtual 300	java/io/OutputStream:close	()V
    //   1151: ldc 101
    //   1153: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1156: aload_0
    //   1157: athrow
    //   1158: astore 7
    //   1160: goto -167 -> 993
    //   1163: astore_0
    //   1164: goto -30 -> 1134
    //   1167: astore_1
    //   1168: goto -17 -> 1151
    //   1171: astore 7
    //   1173: goto -1057 -> 116
    //   1176: iload 4
    //   1178: istore 5
    //   1180: iload 6
    //   1182: istore 4
    //   1184: iload 5
    //   1186: istore 6
    //   1188: goto -939 -> 249
    //
    // Exception table:
    //   from	to	target	type
    //   126	135	721	java/lang/Exception
    //   139	159	721	java/lang/Exception
    //   163	172	721	java/lang/Exception
    //   186	202	721	java/lang/Exception
    //   206	223	721	java/lang/Exception
    //   618	627	721	java/lang/Exception
    //   631	651	721	java/lang/Exception
    //   658	667	721	java/lang/Exception
    //   671	691	721	java/lang/Exception
    //   698	718	721	java/lang/Exception
    //   957	964	1048	java/lang/Exception
    //   971	983	1048	java/lang/Exception
    //   957	964	1142	finally
    //   971	983	1142	finally
    //   1052	1060	1142	finally
    //   1063	1082	1142	finally
    //   1085	1105	1142	finally
    //   1108	1113	1142	finally
    //   1116	1120	1142	finally
    //   988	993	1158	java/io/IOException
    //   1129	1134	1163	java/io/IOException
    //   1147	1151	1167	java/io/IOException
    //   79	113	1171	java/lang/Exception
    //   503	537	1171	java/lang/Exception
    //   543	577	1171	java/lang/Exception
    //   583	608	1171	java/lang/Exception
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = -1;
    AppMethodBeat.i(77942);
    this.ehi = paramf;
    if ((this.imgPath == null) || (this.imgPath.length() == 0))
    {
      ab.e("MicroMsg.NetSceneUploadHDHeadImg", "imgPath is null or length = 0");
      AppMethodBeat.o(77942);
    }
    while (true)
    {
      return i;
      if (!com.tencent.mm.vfs.e.ct(this.imgPath))
      {
        ab.e("MicroMsg.NetSceneUploadHDHeadImg", "The img does not exist, imgPath = " + this.imgPath);
        AppMethodBeat.o(77942);
      }
      else
      {
        if (this.frO == 0)
          this.frO = ((int)com.tencent.mm.vfs.e.asZ(this.imgPath));
        int j = Math.min(this.frO - this.coc, 8192);
        paramf = com.tencent.mm.vfs.e.e(this.imgPath, this.coc, j);
        if (paramf == null)
        {
          ab.e("MicroMsg.NetSceneUploadHDHeadImg", "readFromFile error");
          AppMethodBeat.o(77942);
        }
        else
        {
          ab.i("MicroMsg.NetSceneUploadHDHeadImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(paramf.length), Integer.valueOf(this.frO) });
          Object localObject = new b.a();
          ((b.a)localObject).fsJ = new cla();
          ((b.a)localObject).fsK = new clb();
          ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadhdheadimg";
          ((b.a)localObject).fsI = 157;
          ((b.a)localObject).fsL = 46;
          ((b.a)localObject).fsM = 1000000046;
          localObject = ((b.a)localObject).acD();
          cla localcla = (cla)((b)localObject).fsG.fsP;
          localcla.ptw = this.frO;
          localcla.ptx = this.coc;
          localcla.wpi = this.frP;
          localcla.ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
          localcla.xiK = this.fsf;
          i = a(parame, (q)localObject, this);
          AppMethodBeat.o(77942);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77944);
    paramArrayOfByte = (clb)((b)paramq).fsH.fsP;
    ab.d("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(77944);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 4) || (paramInt2 == 5))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        ab.e("MicroMsg.NetSceneUploadHDHeadImg", "ErrType:".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(77944);
      }
      else
      {
        paramInt1 = paramq.ZS().vyl;
        if (paramInt1 == -4)
          ab.e("MicroMsg.NetSceneUploadHDHeadImg", "retcode == %d", new Object[] { Integer.valueOf(paramInt1) });
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 == 0)
            break label242;
          ab.e("MicroMsg.NetSceneUploadHDHeadImg", "handleCertainError");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(77944);
          break;
        }
        label242: this.coc = paramArrayOfByte.ptx;
        if (this.coc < this.frO)
        {
          if (a(this.ftf, this.ehi) < 0)
          {
            ab.e("MicroMsg.NetSceneUploadHDHeadImg", "doScene again failed");
            this.ehi.onSceneEnd(3, -1, "", this);
          }
          ab.d("MicroMsg.NetSceneUploadHDHeadImg", "doScene again");
          AppMethodBeat.o(77944);
        }
        else
        {
          try
          {
            com.tencent.mm.vfs.e.aQ(this.imgPath, this.fse);
            com.tencent.mm.kernel.g.RP().Ry().set(12297, paramArrayOfByte.xiL);
            o.acd().f(this.fsg, com.tencent.mm.sdk.platformtools.d.aml(this.fse));
            paramq = r.Yz();
            if (!bo.isNullOrNil(paramq))
            {
              paramArrayOfByte = new h();
              paramArrayOfByte.username = paramq;
              paramArrayOfByte.cB(true);
              paramArrayOfByte.bJt = 32;
              paramArrayOfByte.dtR = 3;
              paramArrayOfByte.bJt = 34;
              o.act().b(paramArrayOfByte);
            }
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(77944);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.NetSceneUploadHDHeadImg", "rename temp file failed :" + paramString.getMessage());
            this.ehi.onSceneEnd(3, -1, "", this);
            AppMethodBeat.o(77944);
          }
        }
      }
    }
  }

  public final int acn()
  {
    return 200;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(77943);
    if ((this.imgPath == null) || (this.imgPath.length() == 0))
    {
      paramq = m.b.ftv;
      AppMethodBeat.o(77943);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(77943);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(77945);
    super.cancel();
    AppMethodBeat.o(77945);
  }

  public final int getType()
  {
    return 157;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.l
 * JD-Core Version:    0.6.2
 */