package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.vfs.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class ad
{
  public static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt)
  {
    AppMethodBeat.i(93403);
    boolean bool = a(paramString1, paramCompressFormat, paramString2, paramInt, new PInt(), new PInt());
    AppMethodBeat.o(93403);
    return bool;
  }

  private static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(93402);
    paramString1 = ar(paramString1, paramInt, 0);
    try
    {
      paramPInt1.value = paramString1.getWidth();
      paramPInt2.value = paramString1.getHeight();
      d.a(paramString1, 90, paramCompressFormat, paramString2, true);
      AppMethodBeat.o(93402);
      return bool;
    }
    catch (IOException paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.LongBitmapHandler", "create thumbnail from orig failed: ".concat(String.valueOf(paramString2)));
        AppMethodBeat.o(93402);
        bool = false;
      }
    }
  }

  public static int amy(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 1;
    AppMethodBeat.i(93400);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    Object localObject3 = localObject2;
    Object localObject4 = localObject1;
    try
    {
      InputStream localInputStream = e.openRead(paramString);
      localObject3 = localObject2;
      localObject4 = localObject1;
      paramString = MMBitmapFactory.decodeStream(localInputStream, null, localOptions);
      localObject3 = paramString;
      localObject4 = paramString;
      localInputStream.close();
      if (paramString != null)
      {
        ab.i("MicroMsg.LongBitmapHandler", "isLongPicture bitmap recycle. %s", new Object[] { paramString });
        paramString.recycle();
      }
      float f1 = localOptions.outWidth / localOptions.outHeight;
      float f2 = localOptions.outHeight / localOptions.outWidth;
      if (f1 >= 2.0F)
        AppMethodBeat.o(93400);
      while (true)
      {
        return i;
        if (f2 >= 2.0F)
        {
          i = 2;
          AppMethodBeat.o(93400);
        }
        else
        {
          i = -1;
          AppMethodBeat.o(93400);
        }
      }
    }
    catch (IOException paramString)
    {
      while (true)
        paramString = (String)localObject3;
    }
    catch (FileNotFoundException paramString)
    {
      while (true)
        paramString = (String)localObject4;
    }
  }

  // ERROR //
  public static Bitmap ar(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc 115
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 53
    //   7: ldc 117
    //   9: iconst_5
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_0
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: bipush 56
    //   21: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   24: aastore
    //   25: dup
    //   26: iconst_2
    //   27: sipush 144
    //   30: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   33: aastore
    //   34: dup
    //   35: iconst_3
    //   36: iload_1
    //   37: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: aastore
    //   41: dup
    //   42: iconst_4
    //   43: iload_2
    //   44: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   47: aastore
    //   48: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   54: astore_3
    //   55: lconst_0
    //   56: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   59: aload_0
    //   60: invokestatic 138	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   63: ifne +62 -> 125
    //   66: iload_1
    //   67: iconst_2
    //   68: if_icmpeq +8 -> 76
    //   71: iload_1
    //   72: iconst_1
    //   73: if_icmpne +52 -> 125
    //   76: aload_0
    //   77: invokestatic 142	com/tencent/mm/sdk/platformtools/d:amk	(Ljava/lang/String;)Landroid/graphics/Point;
    //   80: astore_3
    //   81: aload_3
    //   82: ifnull +17 -> 99
    //   85: aload_3
    //   86: getfield 147	android/graphics/Point:x	I
    //   89: ifle +10 -> 99
    //   92: aload_3
    //   93: getfield 150	android/graphics/Point:y	I
    //   96: ifgt +54 -> 150
    //   99: ldc 53
    //   101: ldc 152
    //   103: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   109: astore_0
    //   110: ldc2_w 156
    //   113: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   116: aconst_null
    //   117: astore_0
    //   118: ldc 115
    //   120: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: aload_0
    //   124: areturn
    //   125: ldc 53
    //   127: ldc 159
    //   129: invokestatic 155	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   132: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   135: astore_0
    //   136: lconst_1
    //   137: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   140: aconst_null
    //   141: astore_0
    //   142: ldc 115
    //   144: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: goto -24 -> 123
    //   150: aload_3
    //   151: getfield 147	android/graphics/Point:x	I
    //   154: istore 4
    //   156: aload_3
    //   157: getfield 150	android/graphics/Point:y	I
    //   160: istore 5
    //   162: iload_1
    //   163: iconst_1
    //   164: if_icmpne +300 -> 464
    //   167: iload 4
    //   169: i2d
    //   170: iload 5
    //   172: i2d
    //   173: ddiv
    //   174: ldc2_w 160
    //   177: dcmpl
    //   178: ifle +280 -> 458
    //   181: iconst_1
    //   182: istore 6
    //   184: iload 6
    //   186: ifeq +353 -> 539
    //   189: iload_1
    //   190: iconst_1
    //   191: if_icmpne +299 -> 490
    //   194: iload 5
    //   196: i2d
    //   197: ldc2_w 160
    //   200: dmul
    //   201: d2i
    //   202: istore_1
    //   203: iload 4
    //   205: i2d
    //   206: iload 5
    //   208: i2d
    //   209: ldc2_w 160
    //   212: dmul
    //   213: dsub
    //   214: ldc2_w 162
    //   217: ddiv
    //   218: d2i
    //   219: istore 7
    //   221: iload 5
    //   223: istore 4
    //   225: iload 5
    //   227: istore 8
    //   229: iload_1
    //   230: istore 9
    //   232: iconst_0
    //   233: istore 5
    //   235: iload_1
    //   236: istore 10
    //   238: iload 7
    //   240: istore_1
    //   241: ldc 53
    //   243: ldc 165
    //   245: iconst_5
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: iload 6
    //   253: invokestatic 170	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: iload 10
    //   261: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   264: aastore
    //   265: dup
    //   266: iconst_2
    //   267: iload 4
    //   269: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: aastore
    //   273: dup
    //   274: iconst_3
    //   275: iload_1
    //   276: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   279: aastore
    //   280: dup
    //   281: iconst_4
    //   282: iload 5
    //   284: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   287: aastore
    //   288: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: iconst_1
    //   292: istore 7
    //   294: fconst_1
    //   295: fstore 11
    //   297: iload 9
    //   299: sipush 144
    //   302: if_icmple +294 -> 596
    //   305: iload 8
    //   307: iload 9
    //   309: iload 8
    //   311: invokestatic 177	com/tencent/mm/sdk/platformtools/d:av	(III)I
    //   314: istore 8
    //   316: ldc 178
    //   318: iload 9
    //   320: iload 8
    //   322: idiv
    //   323: i2f
    //   324: fdiv
    //   325: fstore 11
    //   327: ldc 53
    //   329: ldc 180
    //   331: iconst_2
    //   332: anewarray 4	java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: iload 8
    //   339: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   342: aastore
    //   343: dup
    //   344: iconst_1
    //   345: fload 11
    //   347: invokestatic 185	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   350: aastore
    //   351: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: iload 8
    //   356: istore 9
    //   358: new 78	android/graphics/BitmapFactory$Options
    //   361: dup
    //   362: invokespecial 79	android/graphics/BitmapFactory$Options:<init>	()V
    //   365: astore 12
    //   367: aload 12
    //   369: iload 9
    //   371: putfield 188	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   374: iload 6
    //   376: ifeq +322 -> 698
    //   379: aload_0
    //   380: invokestatic 89	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   383: astore_3
    //   384: new 190	android/graphics/Rect
    //   387: astore_0
    //   388: aload_0
    //   389: iload_1
    //   390: iload 5
    //   392: iload_1
    //   393: iload 10
    //   395: iadd
    //   396: iload 4
    //   398: iload 5
    //   400: iadd
    //   401: invokespecial 193	android/graphics/Rect:<init>	(IIII)V
    //   404: aload_3
    //   405: aload_0
    //   406: aload 12
    //   408: invokestatic 197	com/tencent/mm/graphics/a:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   411: astore 12
    //   413: aload 12
    //   415: astore_0
    //   416: aload_3
    //   417: ifnull +10 -> 427
    //   420: aload_3
    //   421: invokevirtual 100	java/io/InputStream:close	()V
    //   424: aload 12
    //   426: astore_0
    //   427: aload_0
    //   428: ifnonnull +280 -> 708
    //   431: ldc 53
    //   433: ldc 199
    //   435: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   438: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   441: astore_0
    //   442: ldc2_w 200
    //   445: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   448: aconst_null
    //   449: astore_0
    //   450: ldc 115
    //   452: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   455: goto -332 -> 123
    //   458: iconst_0
    //   459: istore 6
    //   461: goto -277 -> 184
    //   464: iload 5
    //   466: i2d
    //   467: iload 4
    //   469: i2d
    //   470: ddiv
    //   471: ldc2_w 160
    //   474: dcmpl
    //   475: ifle +9 -> 484
    //   478: iconst_1
    //   479: istore 6
    //   481: goto -297 -> 184
    //   484: iconst_0
    //   485: istore 6
    //   487: goto -303 -> 184
    //   490: iload 4
    //   492: i2d
    //   493: ldc2_w 160
    //   496: dmul
    //   497: d2i
    //   498: istore 9
    //   500: iload 5
    //   502: i2d
    //   503: iload 4
    //   505: i2d
    //   506: ldc2_w 160
    //   509: dmul
    //   510: dsub
    //   511: ldc2_w 162
    //   514: ddiv
    //   515: d2i
    //   516: istore 5
    //   518: iconst_0
    //   519: istore_1
    //   520: iload 9
    //   522: istore 7
    //   524: iload 4
    //   526: istore 8
    //   528: iload 4
    //   530: istore 10
    //   532: iload 7
    //   534: istore 4
    //   536: goto -295 -> 241
    //   539: iload_1
    //   540: iconst_1
    //   541: if_icmpne +42 -> 583
    //   544: iload 4
    //   546: istore 9
    //   548: iload_1
    //   549: iconst_1
    //   550: if_icmpne +40 -> 590
    //   553: iload 5
    //   555: istore_1
    //   556: iconst_0
    //   557: istore 13
    //   559: iconst_0
    //   560: istore 7
    //   562: iload_1
    //   563: istore 8
    //   565: iload 4
    //   567: istore 10
    //   569: iload 13
    //   571: istore_1
    //   572: iload 5
    //   574: istore 4
    //   576: iload 7
    //   578: istore 5
    //   580: goto -339 -> 241
    //   583: iload 5
    //   585: istore 9
    //   587: goto -39 -> 548
    //   590: iload 4
    //   592: istore_1
    //   593: goto -37 -> 556
    //   596: iload 8
    //   598: bipush 56
    //   600: if_icmpge +30 -> 630
    //   603: ldc 202
    //   605: iload 8
    //   607: i2f
    //   608: fdiv
    //   609: fstore 11
    //   611: ldc 53
    //   613: ldc 204
    //   615: iconst_1
    //   616: anewarray 4	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: fload 11
    //   623: invokestatic 185	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   626: aastore
    //   627: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   630: iload 7
    //   632: istore 9
    //   634: goto -276 -> 358
    //   637: astore_3
    //   638: aconst_null
    //   639: astore_0
    //   640: ldc 53
    //   642: aload_3
    //   643: ldc 206
    //   645: iconst_0
    //   646: anewarray 4	java/lang/Object
    //   649: invokestatic 210	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   652: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   655: astore_3
    //   656: ldc2_w 211
    //   659: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   662: aload_0
    //   663: ifnull +7 -> 670
    //   666: aload_0
    //   667: invokevirtual 100	java/io/InputStream:close	()V
    //   670: aconst_null
    //   671: astore_0
    //   672: ldc 115
    //   674: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   677: goto -554 -> 123
    //   680: astore_3
    //   681: aconst_null
    //   682: astore_0
    //   683: aload_0
    //   684: ifnull +7 -> 691
    //   687: aload_0
    //   688: invokevirtual 100	java/io/InputStream:close	()V
    //   691: ldc 115
    //   693: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   696: aload_3
    //   697: athrow
    //   698: aload_0
    //   699: aload 12
    //   701: invokestatic 216	com/tencent/mm/graphics/MMBitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   704: astore_0
    //   705: goto -278 -> 427
    //   708: getstatic 128	com/tencent/mm/compatible/d/a:epB	Lcom/tencent/mm/compatible/d/a;
    //   711: astore_3
    //   712: ldc2_w 217
    //   715: invokestatic 132	com/tencent/mm/compatible/d/a:eT	(J)V
    //   718: fload 11
    //   720: fconst_1
    //   721: fcmpl
    //   722: ifne +22 -> 744
    //   725: iload_2
    //   726: ifne +18 -> 744
    //   729: ldc 53
    //   731: ldc 220
    //   733: invokestatic 222	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   736: ldc 115
    //   738: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   741: goto -618 -> 123
    //   744: new 224	android/graphics/Matrix
    //   747: dup
    //   748: invokespecial 225	android/graphics/Matrix:<init>	()V
    //   751: astore_3
    //   752: aload_3
    //   753: fload 11
    //   755: fload 11
    //   757: invokevirtual 229	android/graphics/Matrix:preScale	(FF)Z
    //   760: pop
    //   761: aload_3
    //   762: iload_2
    //   763: i2f
    //   764: invokevirtual 233	android/graphics/Matrix:postRotate	(F)Z
    //   767: pop
    //   768: aload_0
    //   769: iconst_0
    //   770: iconst_0
    //   771: aload_0
    //   772: invokevirtual 39	android/graphics/Bitmap:getWidth	()I
    //   775: aload_0
    //   776: invokevirtual 46	android/graphics/Bitmap:getHeight	()I
    //   779: aload_3
    //   780: iconst_1
    //   781: invokestatic 237	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   784: astore_3
    //   785: aload_3
    //   786: aload_0
    //   787: if_acmpeq +25 -> 812
    //   790: ldc 53
    //   792: ldc 239
    //   794: iconst_1
    //   795: anewarray 4	java/lang/Object
    //   798: dup
    //   799: iconst_0
    //   800: aload_0
    //   801: invokevirtual 243	java/lang/Object:toString	()Ljava/lang/String;
    //   804: aastore
    //   805: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   808: aload_0
    //   809: invokevirtual 108	android/graphics/Bitmap:recycle	()V
    //   812: aload_3
    //   813: ifnull +34 -> 847
    //   816: ldc 53
    //   818: ldc 245
    //   820: iconst_2
    //   821: anewarray 4	java/lang/Object
    //   824: dup
    //   825: iconst_0
    //   826: aload_3
    //   827: invokevirtual 39	android/graphics/Bitmap:getWidth	()I
    //   830: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   833: aastore
    //   834: dup
    //   835: iconst_1
    //   836: aload_3
    //   837: invokevirtual 46	android/graphics/Bitmap:getHeight	()I
    //   840: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   843: aastore
    //   844: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   847: ldc 115
    //   849: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   852: aload_3
    //   853: astore_0
    //   854: goto -731 -> 123
    //   857: astore_0
    //   858: aload 12
    //   860: astore_0
    //   861: goto -434 -> 427
    //   864: astore_0
    //   865: goto -195 -> 670
    //   868: astore_0
    //   869: goto -178 -> 691
    //   872: astore_0
    //   873: aload_3
    //   874: astore 12
    //   876: aload_0
    //   877: astore_3
    //   878: aload 12
    //   880: astore_0
    //   881: goto -198 -> 683
    //   884: astore_3
    //   885: goto -202 -> 683
    //   888: astore 12
    //   890: aload_3
    //   891: astore_0
    //   892: aload 12
    //   894: astore_3
    //   895: goto -255 -> 640
    //
    // Exception table:
    //   from	to	target	type
    //   379	384	637	java/io/FileNotFoundException
    //   379	384	680	finally
    //   420	424	857	java/io/IOException
    //   666	670	864	java/io/IOException
    //   687	691	868	java/io/IOException
    //   384	413	872	finally
    //   640	662	884	finally
    //   384	413	888	java/io/FileNotFoundException
  }

  public static boolean cI(int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramInt1 * 2.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean cJ(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2 * 2.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ad
 * JD-Core Version:    0.6.2
 */