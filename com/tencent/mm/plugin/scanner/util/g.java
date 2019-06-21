package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.licence.model.LibCardRecog;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.qbar.QbarNative;

public final class g extends b
{
  private int mCount;
  private boolean qhI;
  public boolean qhJ;
  private boolean qhK;
  public boolean[] qhL;
  private boolean qhM;
  private boolean qhN;
  private boolean qhO;
  private Bitmap qhP;
  private final Object qhQ;

  public g(b.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parama);
    AppMethodBeat.i(81416);
    this.mCount = 0;
    this.qhQ = new Object();
    this.qhL = new boolean[4];
    this.qhI = false;
    this.qhJ = paramBoolean1;
    this.qhK = paramBoolean2;
    ab.d("MicroMsg.ScanBankCardDecoder", "isPortrait:%s, needRotate:%s", new Object[] { Boolean.FALSE, Boolean.valueOf(paramBoolean1) });
    AppMethodBeat.o(81416);
  }

  // ERROR //
  public final boolean a(byte[] paramArrayOfByte, android.graphics.Point paramPoint, android.graphics.Rect paramRect)
  {
    // Byte code:
    //   0: ldc 77
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 40	com/tencent/mm/plugin/scanner/util/g:qhQ	Ljava/lang/Object;
    //   9: astore 4
    //   11: aload 4
    //   13: monitorenter
    //   14: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   17: lstore 5
    //   19: ldc 50
    //   21: ldc 85
    //   23: iconst_2
    //   24: anewarray 35	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_2
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: iconst_1
    //   39: aload_0
    //   40: getfield 87	com/tencent/mm/plugin/scanner/util/g:qhM	Z
    //   43: if_icmpne +24 -> 67
    //   46: ldc 50
    //   48: ldc 89
    //   50: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: iconst_0
    //   54: istore 7
    //   56: aload 4
    //   58: monitorexit
    //   59: ldc 77
    //   61: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: iload 7
    //   66: ireturn
    //   67: aload_2
    //   68: getfield 97	android/graphics/Point:x	I
    //   71: i2f
    //   72: aload_3
    //   73: invokevirtual 103	android/graphics/Rect:width	()I
    //   76: i2f
    //   77: fdiv
    //   78: aload_2
    //   79: getfield 106	android/graphics/Point:y	I
    //   82: i2f
    //   83: aload_3
    //   84: invokevirtual 109	android/graphics/Rect:height	()I
    //   87: i2f
    //   88: fdiv
    //   89: invokestatic 115	java/lang/Math:min	(FF)F
    //   92: ldc 116
    //   94: invokestatic 115	java/lang/Math:min	(FF)F
    //   97: fstore 8
    //   99: aload_3
    //   100: invokevirtual 103	android/graphics/Rect:width	()I
    //   103: i2f
    //   104: fconst_1
    //   105: fload 8
    //   107: fconst_1
    //   108: fsub
    //   109: ldc 117
    //   111: fmul
    //   112: fadd
    //   113: fmul
    //   114: f2i
    //   115: iconst_4
    //   116: idiv
    //   117: iconst_4
    //   118: imul
    //   119: istore 9
    //   121: aload_3
    //   122: invokevirtual 109	android/graphics/Rect:height	()I
    //   125: i2f
    //   126: fload 8
    //   128: fmul
    //   129: f2i
    //   130: iconst_4
    //   131: idiv
    //   132: iconst_4
    //   133: imul
    //   134: istore 10
    //   136: ldc 50
    //   138: ldc 119
    //   140: iconst_3
    //   141: anewarray 35	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: fload 8
    //   148: invokestatic 124	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   151: aastore
    //   152: dup
    //   153: iconst_1
    //   154: iload 9
    //   156: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: aastore
    //   160: dup
    //   161: iconst_2
    //   162: iload 10
    //   164: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: aastore
    //   168: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aload_0
    //   172: getfield 131	com/tencent/mm/plugin/scanner/util/g:qhN	Z
    //   175: ifne +93 -> 268
    //   178: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   181: lstore 11
    //   183: iload 9
    //   185: iload 10
    //   187: bipush 8
    //   189: aload_0
    //   190: getfield 44	com/tencent/mm/plugin/scanner/util/g:qhI	Z
    //   193: invokestatic 137	com/tencent/qbar/QbarNative:focusedEngineForBankcardInit	(IIIZ)I
    //   196: istore 13
    //   198: new 139	java/lang/StringBuilder
    //   201: astore 14
    //   203: aload 14
    //   205: ldc 141
    //   207: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: ldc 50
    //   212: aload 14
    //   214: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   217: lload 11
    //   219: lsub
    //   220: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   223: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: iload 13
    //   231: ifeq +32 -> 263
    //   234: ldc 50
    //   236: ldc 154
    //   238: iload 13
    //   240: invokestatic 159	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   243: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   246: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   249: iconst_0
    //   250: istore 7
    //   252: aload 4
    //   254: monitorexit
    //   255: ldc 77
    //   257: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: goto -196 -> 64
    //   263: aload_0
    //   264: iconst_1
    //   265: putfield 131	com/tencent/mm/plugin/scanner/util/g:qhN	Z
    //   268: aload_0
    //   269: getfield 168	com/tencent/mm/plugin/scanner/util/g:qhO	Z
    //   272: ifne +91 -> 363
    //   275: iconst_1
    //   276: aload_0
    //   277: getfield 131	com/tencent/mm/plugin/scanner/util/g:qhN	Z
    //   280: if_icmpne +83 -> 363
    //   283: ldc 50
    //   285: ldc 170
    //   287: iconst_5
    //   288: anewarray 35	java/lang/Object
    //   291: dup
    //   292: iconst_0
    //   293: iload 9
    //   295: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: iload 10
    //   303: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   306: aastore
    //   307: dup
    //   308: iconst_2
    //   309: aload_3
    //   310: invokevirtual 103	android/graphics/Rect:width	()I
    //   313: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   316: aastore
    //   317: dup
    //   318: iconst_3
    //   319: aload_3
    //   320: invokevirtual 109	android/graphics/Rect:height	()I
    //   323: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   326: aastore
    //   327: dup
    //   328: iconst_4
    //   329: aload_0
    //   330: getfield 44	com/tencent/mm/plugin/scanner/util/g:qhI	Z
    //   333: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   336: aastore
    //   337: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: iload 9
    //   342: iload 10
    //   344: aload_0
    //   345: getfield 44	com/tencent/mm/plugin/scanner/util/g:qhI	Z
    //   348: invokestatic 176	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardInit	(IIZ)I
    //   351: ifne +486 -> 837
    //   354: iconst_1
    //   355: istore 7
    //   357: aload_0
    //   358: iload 7
    //   360: putfield 168	com/tencent/mm/plugin/scanner/util/g:qhO	Z
    //   363: aload_3
    //   364: getfield 179	android/graphics/Rect:left	I
    //   367: iload 9
    //   369: aload_3
    //   370: invokevirtual 103	android/graphics/Rect:width	()I
    //   373: isub
    //   374: iconst_2
    //   375: idiv
    //   376: isub
    //   377: istore 15
    //   379: aload_3
    //   380: getfield 182	android/graphics/Rect:top	I
    //   383: iload 10
    //   385: aload_3
    //   386: invokevirtual 109	android/graphics/Rect:height	()I
    //   389: isub
    //   390: iconst_2
    //   391: idiv
    //   392: isub
    //   393: istore 16
    //   395: ldc 50
    //   397: ldc 184
    //   399: iconst_3
    //   400: anewarray 35	java/lang/Object
    //   403: dup
    //   404: iconst_0
    //   405: iload 15
    //   407: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   410: aastore
    //   411: dup
    //   412: iconst_1
    //   413: iload 16
    //   415: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   418: aastore
    //   419: dup
    //   420: iconst_2
    //   421: aload_1
    //   422: arraylength
    //   423: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   426: aastore
    //   427: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: invokestatic 190	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   433: ldc 192
    //   435: invokevirtual 197	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   438: astore_3
    //   439: aload_3
    //   440: ifnull +205 -> 645
    //   443: aload_3
    //   444: ldc 199
    //   446: invokevirtual 203	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   449: ifeq +196 -> 645
    //   452: aload_0
    //   453: aload_0
    //   454: getfield 33	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   457: iconst_1
    //   458: iadd
    //   459: putfield 33	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   462: aload_2
    //   463: getfield 97	android/graphics/Point:x	I
    //   466: istore 17
    //   468: aload_2
    //   469: getfield 106	android/graphics/Point:y	I
    //   472: istore 18
    //   474: aload_0
    //   475: getfield 33	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   478: istore 13
    //   480: new 205	android/graphics/YuvImage
    //   483: astore 14
    //   485: aload 14
    //   487: aload_1
    //   488: bipush 17
    //   490: iload 17
    //   492: iload 18
    //   494: aconst_null
    //   495: invokespecial 208	android/graphics/YuvImage:<init>	([BIII[I)V
    //   498: ldc 50
    //   500: ldc 210
    //   502: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   505: new 212	java/io/ByteArrayOutputStream
    //   508: astore 19
    //   510: aload 19
    //   512: invokespecial 213	java/io/ByteArrayOutputStream:<init>	()V
    //   515: new 99	android/graphics/Rect
    //   518: astore_3
    //   519: aload_3
    //   520: iconst_0
    //   521: iconst_0
    //   522: iload 17
    //   524: iload 18
    //   526: invokespecial 216	android/graphics/Rect:<init>	(IIII)V
    //   529: aload 14
    //   531: aload_3
    //   532: bipush 100
    //   534: aload 19
    //   536: invokevirtual 220	android/graphics/YuvImage:compressToJpeg	(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z
    //   539: pop
    //   540: aload 19
    //   542: invokevirtual 224	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   545: astore 20
    //   547: aconst_null
    //   548: astore_3
    //   549: new 139	java/lang/StringBuilder
    //   552: astore 14
    //   554: aload 14
    //   556: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   559: aload 14
    //   561: invokestatic 231	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   564: invokevirtual 236	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   567: invokevirtual 239	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: ldc 241
    //   572: invokevirtual 239	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: iload 13
    //   577: invokestatic 159	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   580: invokevirtual 239	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: ldc 243
    //   585: invokevirtual 239	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   591: astore 21
    //   593: new 245	java/io/FileOutputStream
    //   596: astore 14
    //   598: new 233	java/io/File
    //   601: astore 22
    //   603: aload 22
    //   605: aload 21
    //   607: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   610: aload 14
    //   612: aload 22
    //   614: invokespecial 249	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   617: aload 14
    //   619: astore_3
    //   620: aload 14
    //   622: aload 20
    //   624: invokevirtual 253	java/io/FileOutputStream:write	([B)V
    //   627: aload 14
    //   629: astore_3
    //   630: aload 14
    //   632: invokevirtual 256	java/io/FileOutputStream:flush	()V
    //   635: aload 14
    //   637: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   640: aload 19
    //   642: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   645: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   648: lstore 11
    //   650: new 262	com/tencent/mm/plugin/licence/model/BankCardInfo
    //   653: astore_3
    //   654: aload_3
    //   655: aload_2
    //   656: getfield 97	android/graphics/Point:x	I
    //   659: aload_2
    //   660: getfield 106	android/graphics/Point:y	I
    //   663: invokespecial 265	com/tencent/mm/plugin/licence/model/BankCardInfo:<init>	(II)V
    //   666: aload_1
    //   667: aload_2
    //   668: getfield 106	android/graphics/Point:y	I
    //   671: aload_2
    //   672: getfield 97	android/graphics/Point:x	I
    //   675: iload 15
    //   677: iload 16
    //   679: iload 10
    //   681: iload 9
    //   683: aload_3
    //   684: aload_0
    //   685: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   688: invokestatic 269	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardProcess	([BIIIIIILcom/tencent/mm/plugin/licence/model/BankCardInfo;[Z)I
    //   691: istore 10
    //   693: new 139	java/lang/StringBuilder
    //   696: astore_1
    //   697: aload_1
    //   698: ldc_w 271
    //   701: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   704: ldc 50
    //   706: aload_1
    //   707: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   710: lload 11
    //   712: lsub
    //   713: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   716: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   719: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   722: aload_0
    //   723: getfield 46	com/tencent/mm/plugin/scanner/util/g:qhJ	Z
    //   726: ifne +59 -> 785
    //   729: aload_0
    //   730: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   733: iconst_0
    //   734: baload
    //   735: istore 7
    //   737: aload_0
    //   738: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   741: iconst_0
    //   742: aload_0
    //   743: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   746: iconst_2
    //   747: baload
    //   748: bastore
    //   749: aload_0
    //   750: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   753: iconst_2
    //   754: iload 7
    //   756: bastore
    //   757: aload_0
    //   758: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   761: iconst_1
    //   762: baload
    //   763: istore 7
    //   765: aload_0
    //   766: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   769: iconst_1
    //   770: aload_0
    //   771: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   774: iconst_3
    //   775: baload
    //   776: bastore
    //   777: aload_0
    //   778: getfield 42	com/tencent/mm/plugin/scanner/util/g:qhL	[Z
    //   781: iconst_3
    //   782: iload 7
    //   784: bastore
    //   785: ldc 50
    //   787: ldc_w 273
    //   790: iload 10
    //   792: invokestatic 159	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   795: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   798: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   801: iload 10
    //   803: iconst_1
    //   804: if_icmpeq +236 -> 1040
    //   807: ldc 50
    //   809: ldc_w 275
    //   812: iload 10
    //   814: invokestatic 159	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   817: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   820: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   823: iconst_0
    //   824: istore 7
    //   826: aload 4
    //   828: monitorexit
    //   829: ldc 77
    //   831: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   834: goto -770 -> 64
    //   837: iconst_0
    //   838: istore 7
    //   840: goto -483 -> 357
    //   843: astore_3
    //   844: ldc 50
    //   846: aload_3
    //   847: ldc_w 277
    //   850: iconst_0
    //   851: anewarray 35	java/lang/Object
    //   854: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   857: goto -217 -> 640
    //   860: astore_1
    //   861: aload 4
    //   863: monitorexit
    //   864: ldc 77
    //   866: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   869: aload_1
    //   870: athrow
    //   871: astore_3
    //   872: ldc 50
    //   874: aload_3
    //   875: ldc_w 277
    //   878: iconst_0
    //   879: anewarray 35	java/lang/Object
    //   882: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   885: goto -240 -> 645
    //   888: astore 20
    //   890: aconst_null
    //   891: astore 14
    //   893: aload 14
    //   895: astore_3
    //   896: ldc 50
    //   898: ldc_w 283
    //   901: iconst_1
    //   902: anewarray 35	java/lang/Object
    //   905: dup
    //   906: iconst_0
    //   907: aload 20
    //   909: invokevirtual 286	java/io/IOException:getMessage	()Ljava/lang/String;
    //   912: aastore
    //   913: invokestatic 288	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   916: aload 14
    //   918: astore_3
    //   919: ldc 50
    //   921: aload 20
    //   923: ldc_w 277
    //   926: iconst_0
    //   927: anewarray 35	java/lang/Object
    //   930: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   933: aload 14
    //   935: ifnull +8 -> 943
    //   938: aload 14
    //   940: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   943: aload 19
    //   945: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   948: goto -303 -> 645
    //   951: astore_3
    //   952: ldc 50
    //   954: aload_3
    //   955: ldc_w 277
    //   958: iconst_0
    //   959: anewarray 35	java/lang/Object
    //   962: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   965: goto -320 -> 645
    //   968: astore_3
    //   969: ldc 50
    //   971: aload_3
    //   972: ldc_w 277
    //   975: iconst_0
    //   976: anewarray 35	java/lang/Object
    //   979: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   982: goto -39 -> 943
    //   985: astore_1
    //   986: aload_3
    //   987: ifnull +7 -> 994
    //   990: aload_3
    //   991: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   994: aload 19
    //   996: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   999: ldc 77
    //   1001: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1004: aload_1
    //   1005: athrow
    //   1006: astore_2
    //   1007: ldc 50
    //   1009: aload_2
    //   1010: ldc_w 277
    //   1013: iconst_0
    //   1014: anewarray 35	java/lang/Object
    //   1017: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1020: goto -26 -> 994
    //   1023: astore_2
    //   1024: ldc 50
    //   1026: aload_2
    //   1027: ldc_w 277
    //   1030: iconst_0
    //   1031: anewarray 35	java/lang/Object
    //   1034: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1037: goto -38 -> 999
    //   1040: new 290	android/graphics/BitmapFactory$Options
    //   1043: astore_1
    //   1044: aload_1
    //   1045: invokespecial 291	android/graphics/BitmapFactory$Options:<init>	()V
    //   1048: aload_1
    //   1049: iconst_1
    //   1050: putfield 294	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   1053: aload_0
    //   1054: aload_3
    //   1055: getfield 298	com/tencent/mm/plugin/licence/model/BankCardInfo:bitmapData	[B
    //   1058: iconst_0
    //   1059: aload_3
    //   1060: getfield 301	com/tencent/mm/plugin/licence/model/BankCardInfo:bitmapLen	I
    //   1063: aload_1
    //   1064: invokestatic 307	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   1067: getstatic 313	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   1070: iconst_1
    //   1071: invokevirtual 319	android/graphics/Bitmap:copy	(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    //   1074: putfield 321	com/tencent/mm/plugin/scanner/util/g:qhP	Landroid/graphics/Bitmap;
    //   1077: aload_0
    //   1078: getfield 321	com/tencent/mm/plugin/scanner/util/g:qhP	Landroid/graphics/Bitmap;
    //   1081: ifnonnull +17 -> 1098
    //   1084: iconst_0
    //   1085: istore 7
    //   1087: aload 4
    //   1089: monitorexit
    //   1090: ldc 77
    //   1092: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1095: goto -1031 -> 64
    //   1098: aload_3
    //   1099: invokevirtual 325	com/tencent/mm/plugin/licence/model/BankCardInfo:getRectX	()[I
    //   1102: astore_2
    //   1103: aload_3
    //   1104: invokevirtual 328	com/tencent/mm/plugin/licence/model/BankCardInfo:getRectY	()[I
    //   1107: astore_1
    //   1108: aload_2
    //   1109: aload_3
    //   1110: invokevirtual 331	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNumLen	()I
    //   1113: iconst_1
    //   1114: isub
    //   1115: iaload
    //   1116: aload_2
    //   1117: iconst_0
    //   1118: iaload
    //   1119: isub
    //   1120: aload_2
    //   1121: iconst_1
    //   1122: iaload
    //   1123: aload_2
    //   1124: iconst_0
    //   1125: iaload
    //   1126: isub
    //   1127: iadd
    //   1128: istore 9
    //   1130: iload 9
    //   1132: i2f
    //   1133: ldc_w 332
    //   1136: fmul
    //   1137: f2i
    //   1138: istore 16
    //   1140: aload_2
    //   1141: iconst_0
    //   1142: iaload
    //   1143: i2f
    //   1144: iload 9
    //   1146: i2f
    //   1147: ldc_w 333
    //   1150: fmul
    //   1151: fsub
    //   1152: f2i
    //   1153: istore 10
    //   1155: iload 10
    //   1157: ifle +187 -> 1344
    //   1160: iload 9
    //   1162: iconst_2
    //   1163: imul
    //   1164: i2f
    //   1165: ldc_w 333
    //   1168: fmul
    //   1169: f2i
    //   1170: iload 9
    //   1172: iadd
    //   1173: istore 17
    //   1175: aload_1
    //   1176: iconst_0
    //   1177: iaload
    //   1178: i2f
    //   1179: aload_2
    //   1180: iconst_1
    //   1181: iaload
    //   1182: aload_2
    //   1183: iconst_0
    //   1184: iaload
    //   1185: isub
    //   1186: i2f
    //   1187: ldc_w 334
    //   1190: fmul
    //   1191: fconst_2
    //   1192: fdiv
    //   1193: fadd
    //   1194: iload 16
    //   1196: iconst_2
    //   1197: idiv
    //   1198: i2f
    //   1199: fsub
    //   1200: f2i
    //   1201: istore 9
    //   1203: iload 9
    //   1205: ifle +145 -> 1350
    //   1208: iload 17
    //   1210: istore 13
    //   1212: iload 10
    //   1214: iload 17
    //   1216: iadd
    //   1217: aload_3
    //   1218: getfield 336	com/tencent/mm/plugin/licence/model/BankCardInfo:width	I
    //   1221: if_icmple +12 -> 1233
    //   1224: aload_3
    //   1225: getfield 336	com/tencent/mm/plugin/licence/model/BankCardInfo:width	I
    //   1228: iload 10
    //   1230: isub
    //   1231: istore 13
    //   1233: iload 16
    //   1235: istore 17
    //   1237: iload 9
    //   1239: iload 16
    //   1241: iadd
    //   1242: aload_3
    //   1243: getfield 338	com/tencent/mm/plugin/licence/model/BankCardInfo:height	I
    //   1246: if_icmple +12 -> 1258
    //   1249: aload_3
    //   1250: getfield 338	com/tencent/mm/plugin/licence/model/BankCardInfo:height	I
    //   1253: iload 9
    //   1255: isub
    //   1256: istore 17
    //   1258: aload_0
    //   1259: aload_0
    //   1260: getfield 321	com/tencent/mm/plugin/scanner/util/g:qhP	Landroid/graphics/Bitmap;
    //   1263: iload 10
    //   1265: iload 9
    //   1267: iload 13
    //   1269: iload 17
    //   1271: invokestatic 342	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   1274: putfield 321	com/tencent/mm/plugin/scanner/util/g:qhP	Landroid/graphics/Bitmap;
    //   1277: iconst_3
    //   1278: putstatic 345	com/tencent/mm/plugin/scanner/util/g:qhm	I
    //   1281: aload_0
    //   1282: getfield 48	com/tencent/mm/plugin/scanner/util/g:qhK	Z
    //   1285: ifeq +71 -> 1356
    //   1288: aload_0
    //   1289: aload_3
    //   1290: invokevirtual 348	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNum	()Ljava/lang/String;
    //   1293: putfield 352	com/tencent/mm/plugin/scanner/util/g:qhl	Ljava/lang/String;
    //   1296: aload_0
    //   1297: iconst_1
    //   1298: putfield 87	com/tencent/mm/plugin/scanner/util/g:qhM	Z
    //   1301: new 139	java/lang/StringBuilder
    //   1304: astore_1
    //   1305: aload_1
    //   1306: ldc_w 354
    //   1309: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1312: ldc 50
    //   1314: aload_1
    //   1315: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   1318: lload 5
    //   1320: lsub
    //   1321: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1324: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1327: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1330: iconst_1
    //   1331: istore 7
    //   1333: aload 4
    //   1335: monitorexit
    //   1336: ldc 77
    //   1338: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1341: goto -1277 -> 64
    //   1344: iconst_0
    //   1345: istore 10
    //   1347: goto -187 -> 1160
    //   1350: iconst_0
    //   1351: istore 9
    //   1353: goto -145 -> 1208
    //   1356: aload_0
    //   1357: aload_3
    //   1358: invokevirtual 348	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNum	()Ljava/lang/String;
    //   1361: aload_3
    //   1362: invokevirtual 331	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNumLen	()I
    //   1365: aload_2
    //   1366: invokestatic 358	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardSegmentNumber	(Ljava/lang/String;I[I)Ljava/lang/String;
    //   1369: putfield 352	com/tencent/mm/plugin/scanner/util/g:qhl	Ljava/lang/String;
    //   1372: goto -76 -> 1296
    //   1375: astore_1
    //   1376: goto -390 -> 986
    //   1379: astore 20
    //   1381: goto -488 -> 893
    //
    // Exception table:
    //   from	to	target	type
    //   635	640	843	java/io/IOException
    //   14	53	860	finally
    //   56	59	860	finally
    //   67	229	860	finally
    //   234	249	860	finally
    //   252	255	860	finally
    //   263	268	860	finally
    //   268	354	860	finally
    //   357	363	860	finally
    //   363	439	860	finally
    //   443	547	860	finally
    //   635	640	860	finally
    //   640	645	860	finally
    //   645	785	860	finally
    //   785	801	860	finally
    //   807	823	860	finally
    //   826	829	860	finally
    //   844	857	860	finally
    //   861	864	860	finally
    //   872	885	860	finally
    //   938	943	860	finally
    //   943	948	860	finally
    //   952	965	860	finally
    //   969	982	860	finally
    //   990	994	860	finally
    //   994	999	860	finally
    //   999	1006	860	finally
    //   1007	1020	860	finally
    //   1024	1037	860	finally
    //   1040	1084	860	finally
    //   1087	1090	860	finally
    //   1098	1130	860	finally
    //   1175	1203	860	finally
    //   1212	1233	860	finally
    //   1237	1258	860	finally
    //   1258	1296	860	finally
    //   1296	1330	860	finally
    //   1333	1336	860	finally
    //   1356	1372	860	finally
    //   640	645	871	java/io/IOException
    //   549	617	888	java/io/IOException
    //   943	948	951	java/io/IOException
    //   938	943	968	java/io/IOException
    //   549	617	985	finally
    //   990	994	1006	java/io/IOException
    //   994	999	1023	java/io/IOException
    //   620	627	1375	finally
    //   630	635	1375	finally
    //   896	916	1375	finally
    //   919	933	1375	finally
    //   620	627	1379	java/io/IOException
    //   630	635	1379	java/io/IOException
  }

  public final void chP()
  {
    AppMethodBeat.i(81419);
    sI();
    AppMethodBeat.o(81419);
  }

  public final Bitmap chW()
  {
    synchronized (this.qhQ)
    {
      Bitmap localBitmap = this.qhP;
      return localBitmap;
    }
  }

  public final void sI()
  {
    AppMethodBeat.i(81418);
    synchronized (this.qhQ)
    {
      if (true == this.qhN)
      {
        QbarNative.focusedEngineRelease();
        this.qhN = false;
      }
      if (true == this.qhO)
      {
        LibCardRecog.recognizeBankCardRelease();
        this.qhO = false;
      }
      this.qhP = null;
      AppMethodBeat.o(81418);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.g
 * JD-Core Version:    0.6.2
 */