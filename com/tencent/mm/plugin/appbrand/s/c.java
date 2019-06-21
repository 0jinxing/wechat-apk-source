package com.tencent.mm.plugin.appbrand.s;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.luggage.e.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.b;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.io.OutputStream;

public enum c
{
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap.CompressFormat paramCompressFormat, int paramInt5, String paramString2)
  {
    AppMethodBeat.i(73194);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    while (true)
    {
      Object localObject3;
      double d1;
      double d2;
      boolean bool;
      double d3;
      try
      {
        ab.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
        localObject2 = localObject1;
        localObject3 = new android/graphics/BitmapFactory$Options;
        localObject2 = localObject1;
        ((BitmapFactory.Options)localObject3).<init>();
        d1 = paramInt2 * 1.0D / paramInt3;
        d2 = paramInt1 * 1.0D / paramInt4;
        if ((paramInt1 == paramInt4) && (paramInt2 == paramInt3))
        {
          localObject2 = localObject1;
          localObject3 = b(paramString1, (BitmapFactory.Options)localObject3);
          localObject2 = localObject1;
          ab.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, result bm: %s", new Object[] { localObject3 });
          if (localObject3 == null)
          {
            bool = false;
            AppMethodBeat.o(73194);
            return bool;
          }
        }
        else
        {
          localObject2 = localObject1;
          ((BitmapFactory.Options)localObject3).inSampleSize = 1;
          if ((paramInt2 > paramInt3) || (paramInt1 > paramInt4))
          {
            if (d1 >= d2)
              break label298;
            d3 = d2;
            localObject2 = localObject1;
            ((BitmapFactory.Options)localObject3).inSampleSize = ((int)d3);
            localObject2 = localObject1;
            if (((BitmapFactory.Options)localObject3).inSampleSize <= 1)
            {
              localObject2 = localObject1;
              ((BitmapFactory.Options)localObject3).inSampleSize = 1;
            }
          }
          localObject2 = localObject1;
          if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject3).inSampleSize / ((BitmapFactory.Options)localObject3).inSampleSize > 2764800)
          {
            localObject2 = localObject1;
            ((BitmapFactory.Options)localObject3).inSampleSize += 1;
            continue;
          }
        }
      }
      catch (IOException paramString1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandImgUtil", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString2 });
        if (localObject2 == null);
      }
      try
      {
        ((OutputStream)localObject2).close();
        bool = false;
        AppMethodBeat.o(73194);
        continue;
        label298: d3 = d1;
        continue;
        localObject2 = localObject1;
        ab.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject3).inSampleSize) });
        localObject2 = localObject1;
        localObject3 = b(paramString1, (BitmapFactory.Options)localObject3);
        continue;
        localObject2 = localObject1;
        ab.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()) });
        if (d1 < d2)
        {
          localObject2 = localObject1;
          paramInt2 = (int)Math.ceil(paramInt4 * 1.0D * paramInt2 / paramInt1);
          paramInt1 = paramInt4;
        }
        while (true)
        {
          localObject2 = localObject1;
          paramInt4 = BackwardSupportUtil.ExifHelper.bJ(paramString1);
          if ((paramInt4 != 90) && (paramInt4 != 270))
            break label637;
          localObject2 = localObject1;
          paramString1 = d.b((Bitmap)localObject3, paramInt4);
          paramInt3 = paramInt2;
          localObject2 = localObject1;
          Bitmap localBitmap = Bitmap.createScaledBitmap(paramString1, paramInt3, paramInt1, true);
          if (localBitmap == null)
            break label631;
          localObject3 = localBitmap;
          if (paramString1 != localBitmap)
          {
            localObject2 = localObject1;
            l.Xf().v(paramString1);
            localObject3 = localBitmap;
          }
          localObject2 = localObject1;
          ab.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScalebyUpload, degree %d, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(paramInt4), Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()) });
          localObject2 = localObject1;
          paramString1 = FileOp.pH(paramString2);
          localObject2 = paramString1;
          d.a((Bitmap)localObject3, paramInt5, paramCompressFormat, paramString1, false);
          localObject2 = paramString1;
          l.Xf().v((Bitmap)localObject3);
          localObject2 = paramString1;
          paramString1.close();
          bool = true;
          AppMethodBeat.o(73194);
          break;
          d3 = paramInt3 * 1.0D * paramInt1 / paramInt2;
          localObject2 = localObject1;
          d3 = Math.ceil(d3);
          paramInt1 = (int)d3;
          paramInt2 = paramInt3;
        }
      }
      catch (IOException paramString1)
      {
        while (true)
        {
          continue;
          label631: localObject3 = paramString1;
          continue;
          label637: paramInt3 = paramInt1;
          paramString1 = (String)localObject3;
          paramInt1 = paramInt2;
        }
      }
    }
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(73192);
    BitmapFactory.Options localOptions = d.amj(paramString1);
    boolean bool;
    if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
    {
      bool = false;
      AppMethodBeat.o(73192);
    }
    while (true)
    {
      return bool;
      bool = a(paramString1, localOptions.outWidth, localOptions.outHeight, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2);
      AppMethodBeat.o(73192);
    }
  }

  private static Bitmap b(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(73193);
    long l = System.currentTimeMillis();
    try
    {
      paramString = l.Xf().a(paramString, paramOptions);
      ab.d("MicroMsg.AppBrandImgUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString });
      AppMethodBeat.o(73193);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        b.dvU();
        ab.e("MicroMsg.AppBrandImgUtil", "OutOfMemoryError e " + paramString.getMessage());
        paramString = null;
        AppMethodBeat.o(73193);
      }
    }
  }

  // ERROR //
  public static boolean cU(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 192
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: bipush 70
    //   7: istore_2
    //   8: aload_1
    //   9: invokestatic 196	com/tencent/mm/modelsfs/FileOp:td	(Ljava/lang/String;)J
    //   12: l2i
    //   13: istore_3
    //   14: aload_1
    //   15: invokestatic 131	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   18: astore 4
    //   20: aload 4
    //   22: ifnonnull +29 -> 51
    //   25: ldc 25
    //   27: ldc 198
    //   29: iconst_1
    //   30: anewarray 29	java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: aload_1
    //   36: aastore
    //   37: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: iconst_0
    //   41: istore 5
    //   43: ldc 192
    //   45: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: iload 5
    //   50: ireturn
    //   51: aload 4
    //   53: ifnull +395 -> 448
    //   56: aload 4
    //   58: getfield 202	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   61: astore 6
    //   63: ldc 25
    //   65: ldc 204
    //   67: aload 6
    //   69: invokestatic 209	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   72: invokevirtual 213	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   75: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload 6
    //   80: ifnull +368 -> 448
    //   83: aload 6
    //   85: invokevirtual 218	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   88: astore 6
    //   90: aload 6
    //   92: ldc 220
    //   94: invokevirtual 223	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   97: iflt +317 -> 414
    //   100: iconst_1
    //   101: istore 5
    //   103: aload 4
    //   105: invokestatic 228	com/tencent/luggage/e/a/a:e	(Landroid/graphics/BitmapFactory$Options;)Z
    //   108: istore 7
    //   110: iconst_m1
    //   111: istore 8
    //   113: iload 7
    //   115: ifeq +1712 -> 1827
    //   118: aload_1
    //   119: invokestatic 233	com/tencent/mm/sdk/platformtools/MMNativeJpeg:queryQuality	(Ljava/lang/String;)I
    //   122: istore 9
    //   124: iload 9
    //   126: istore 8
    //   128: iload 9
    //   130: bipush 70
    //   132: if_icmpge +1695 -> 1827
    //   135: iload 9
    //   137: istore 8
    //   139: iload 9
    //   141: bipush 25
    //   143: if_icmple +1684 -> 1827
    //   146: iload 9
    //   148: istore 8
    //   150: iload 9
    //   152: istore_2
    //   153: iconst_0
    //   154: istore 10
    //   156: iconst_0
    //   157: istore 9
    //   159: iconst_0
    //   160: istore 11
    //   162: iload 7
    //   164: ifeq +318 -> 482
    //   167: iload 10
    //   169: istore 9
    //   171: aload_1
    //   172: invokestatic 239	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   175: astore 6
    //   177: iload 11
    //   179: istore 9
    //   181: aload 6
    //   183: ifnull +48 -> 231
    //   186: iload 10
    //   188: istore 9
    //   190: aload 6
    //   192: invokevirtual 242	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   195: sipush 360
    //   198: irem
    //   199: istore 10
    //   201: iload 10
    //   203: istore 9
    //   205: ldc 25
    //   207: ldc 244
    //   209: iconst_1
    //   210: anewarray 29	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: aload 6
    //   217: invokevirtual 242	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   220: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: aastore
    //   224: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: iload 10
    //   229: istore 9
    //   231: iload 9
    //   233: istore 10
    //   235: ldc 25
    //   237: new 167	java/lang/StringBuilder
    //   240: dup
    //   241: ldc 246
    //   243: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   246: aload 4
    //   248: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   251: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   254: ldc 251
    //   256: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 4
    //   261: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   264: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   267: ldc 251
    //   269: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: iload 5
    //   274: invokevirtual 254	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   277: ldc_w 256
    //   280: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: iload 8
    //   285: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   288: ldc_w 258
    //   291: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: iload 10
    //   296: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   299: ldc_w 260
    //   302: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: iload_3
    //   306: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   309: ldc_w 262
    //   312: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   321: aload 4
    //   323: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   326: aload 4
    //   328: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   331: iconst_2
    //   332: imul
    //   333: if_icmpge +18 -> 351
    //   336: aload 4
    //   338: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   341: aload 4
    //   343: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   346: iconst_2
    //   347: imul
    //   348: if_icmplt +602 -> 950
    //   351: aload 4
    //   353: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   356: aload 4
    //   358: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   361: imul
    //   362: ldc_w 265
    //   365: if_icmpgt +585 -> 950
    //   368: iload_3
    //   369: ldc_w 266
    //   372: if_icmpge +128 -> 500
    //   375: iload 5
    //   377: ifeq +123 -> 500
    //   380: iload 10
    //   382: ifne +118 -> 500
    //   385: ldc 25
    //   387: ldc_w 268
    //   390: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   393: aload_1
    //   394: aload_0
    //   395: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   398: lconst_0
    //   399: lcmp
    //   400: iflt +89 -> 489
    //   403: iconst_1
    //   404: istore 5
    //   406: ldc 192
    //   408: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -363 -> 48
    //   414: aload 6
    //   416: ldc_w 274
    //   419: invokevirtual 223	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   422: iflt +9 -> 431
    //   425: iconst_1
    //   426: istore 5
    //   428: goto -325 -> 103
    //   431: aload 6
    //   433: ldc_w 276
    //   436: invokevirtual 223	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   439: iflt +9 -> 448
    //   442: iconst_1
    //   443: istore 5
    //   445: goto -342 -> 103
    //   448: iconst_0
    //   449: istore 5
    //   451: goto -348 -> 103
    //   454: astore 6
    //   456: ldc 25
    //   458: new 167	java/lang/StringBuilder
    //   461: dup
    //   462: ldc_w 278
    //   465: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   468: aload 6
    //   470: invokevirtual 279	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   473: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   479: invokestatic 187	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   482: iload 9
    //   484: istore 10
    //   486: goto -251 -> 235
    //   489: iconst_0
    //   490: istore 5
    //   492: ldc 192
    //   494: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: goto -449 -> 48
    //   500: new 42	android/graphics/BitmapFactory$Options
    //   503: dup
    //   504: invokespecial 45	android/graphics/BitmapFactory$Options:<init>	()V
    //   507: astore 12
    //   509: invokestatic 282	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   512: aconst_null
    //   513: astore 4
    //   515: aconst_null
    //   516: astore 6
    //   518: aload_1
    //   519: invokestatic 286	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   522: astore 13
    //   524: aload 13
    //   526: astore 14
    //   528: aload 13
    //   530: astore 6
    //   532: aload 13
    //   534: astore 4
    //   536: aload 13
    //   538: invokevirtual 292	java/io/InputStream:markSupported	()Z
    //   541: ifne +54 -> 595
    //   544: aload 13
    //   546: astore 14
    //   548: aload 13
    //   550: astore 6
    //   552: aload 13
    //   554: astore 4
    //   556: aload 13
    //   558: instanceof 294
    //   561: ifeq +34 -> 595
    //   564: aload 13
    //   566: astore 6
    //   568: aload 13
    //   570: astore 4
    //   572: new 296	com/tencent/mm/sdk/platformtools/l
    //   575: astore 14
    //   577: aload 13
    //   579: astore 6
    //   581: aload 13
    //   583: astore 4
    //   585: aload 14
    //   587: aload 13
    //   589: checkcast 294	java/io/FileInputStream
    //   592: invokespecial 299	com/tencent/mm/sdk/platformtools/l:<init>	(Ljava/io/FileInputStream;)V
    //   595: aload 14
    //   597: astore 6
    //   599: aload 14
    //   601: astore 4
    //   603: aload 14
    //   605: ldc_w 300
    //   608: invokevirtual 303	java/io/InputStream:mark	(I)V
    //   611: aload 14
    //   613: astore 6
    //   615: aload 14
    //   617: astore 4
    //   619: aload 14
    //   621: aconst_null
    //   622: aload 12
    //   624: invokestatic 309	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   627: astore 13
    //   629: aload 14
    //   631: astore 6
    //   633: aload 14
    //   635: astore 4
    //   637: aload 14
    //   639: invokevirtual 312	java/io/InputStream:reset	()V
    //   642: aload 13
    //   644: ifnonnull +24 -> 668
    //   647: aload 14
    //   649: ifnull +8 -> 657
    //   652: aload 14
    //   654: invokevirtual 313	java/io/InputStream:close	()V
    //   657: iconst_0
    //   658: istore 5
    //   660: ldc 192
    //   662: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   665: goto -617 -> 48
    //   668: iload 10
    //   670: i2f
    //   671: fstore 15
    //   673: aload 14
    //   675: astore 6
    //   677: aload 14
    //   679: astore 4
    //   681: aload 13
    //   683: fload 15
    //   685: invokestatic 100	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   688: iload_2
    //   689: getstatic 319	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   692: aload_0
    //   693: iconst_1
    //   694: invokestatic 322	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   697: iload 5
    //   699: ifeq +166 -> 865
    //   702: iload 10
    //   704: ifne +161 -> 865
    //   707: aload 14
    //   709: astore 6
    //   711: aload 14
    //   713: astore 4
    //   715: aload_0
    //   716: invokestatic 196	com/tencent/mm/modelsfs/FileOp:td	(Ljava/lang/String;)J
    //   719: lstore 16
    //   721: aload 14
    //   723: astore 6
    //   725: aload 14
    //   727: astore 4
    //   729: ldc 25
    //   731: ldc_w 324
    //   734: iconst_3
    //   735: anewarray 29	java/lang/Object
    //   738: dup
    //   739: iconst_0
    //   740: iload_3
    //   741: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   744: aastore
    //   745: dup
    //   746: iconst_1
    //   747: lload 16
    //   749: invokestatic 157	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   752: aastore
    //   753: dup
    //   754: iconst_2
    //   755: bipush 10
    //   757: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   760: aastore
    //   761: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   764: iload_3
    //   765: i2l
    //   766: lload 16
    //   768: lsub
    //   769: ldc2_w 325
    //   772: lmul
    //   773: iload_3
    //   774: bipush 10
    //   776: imul
    //   777: i2l
    //   778: lcmp
    //   779: ifge +65 -> 844
    //   782: aload 14
    //   784: astore 6
    //   786: aload 14
    //   788: astore 4
    //   790: aload_0
    //   791: invokestatic 330	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   794: pop
    //   795: aload 14
    //   797: astore 6
    //   799: aload 14
    //   801: astore 4
    //   803: aload_1
    //   804: aload_0
    //   805: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   808: lstore 16
    //   810: lload 16
    //   812: lconst_0
    //   813: lcmp
    //   814: iflt +24 -> 838
    //   817: iconst_1
    //   818: istore 5
    //   820: aload 14
    //   822: ifnull +8 -> 830
    //   825: aload 14
    //   827: invokevirtual 313	java/io/InputStream:close	()V
    //   830: ldc 192
    //   832: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   835: goto -787 -> 48
    //   838: iconst_0
    //   839: istore 5
    //   841: goto -21 -> 820
    //   844: aload 14
    //   846: ifnull +8 -> 854
    //   849: aload 14
    //   851: invokevirtual 313	java/io/InputStream:close	()V
    //   854: iconst_1
    //   855: istore 5
    //   857: ldc 192
    //   859: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   862: goto -814 -> 48
    //   865: aload 14
    //   867: ifnull +8 -> 875
    //   870: aload 14
    //   872: invokevirtual 313	java/io/InputStream:close	()V
    //   875: iconst_1
    //   876: istore 5
    //   878: ldc 192
    //   880: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   883: goto -835 -> 48
    //   886: astore_0
    //   887: aload 6
    //   889: astore 4
    //   891: ldc 25
    //   893: aload_0
    //   894: ldc_w 332
    //   897: aload_1
    //   898: invokestatic 209	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   901: invokevirtual 213	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   904: iconst_0
    //   905: anewarray 29	java/lang/Object
    //   908: invokestatic 65	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   911: aload 6
    //   913: ifnull +8 -> 921
    //   916: aload 6
    //   918: invokevirtual 313	java/io/InputStream:close	()V
    //   921: iconst_0
    //   922: istore 5
    //   924: ldc 192
    //   926: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   929: goto -881 -> 48
    //   932: astore_0
    //   933: aload 4
    //   935: ifnull +8 -> 943
    //   938: aload 4
    //   940: invokevirtual 313	java/io/InputStream:close	()V
    //   943: ldc 192
    //   945: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   948: aload_0
    //   949: athrow
    //   950: iload_3
    //   951: ldc_w 333
    //   954: if_icmpge +53 -> 1007
    //   957: iload 5
    //   959: ifeq +48 -> 1007
    //   962: iload 10
    //   964: ifne +43 -> 1007
    //   967: ldc 25
    //   969: ldc_w 335
    //   972: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   975: aload_1
    //   976: aload_0
    //   977: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   980: lconst_0
    //   981: lcmp
    //   982: iflt +14 -> 996
    //   985: iconst_1
    //   986: istore 5
    //   988: ldc 192
    //   990: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   993: goto -945 -> 48
    //   996: iconst_0
    //   997: istore 5
    //   999: ldc 192
    //   1001: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1004: goto -956 -> 48
    //   1007: aload 4
    //   1009: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1012: sipush 960
    //   1015: if_icmpgt +14 -> 1029
    //   1018: aload 4
    //   1020: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1023: sipush 640
    //   1026: if_icmple +25 -> 1051
    //   1029: aload 4
    //   1031: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1034: sipush 960
    //   1037: if_icmpgt +321 -> 1358
    //   1040: aload 4
    //   1042: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1045: sipush 640
    //   1048: if_icmpgt +310 -> 1358
    //   1051: ldc 25
    //   1053: ldc_w 337
    //   1056: iconst_3
    //   1057: anewarray 29	java/lang/Object
    //   1060: dup
    //   1061: iconst_0
    //   1062: iload_3
    //   1063: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1066: aastore
    //   1067: dup
    //   1068: iconst_1
    //   1069: aload 4
    //   1071: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1074: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1077: aastore
    //   1078: dup
    //   1079: iconst_2
    //   1080: aload 4
    //   1082: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1085: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1088: aastore
    //   1089: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1092: aload_1
    //   1093: invokestatic 196	com/tencent/mm/modelsfs/FileOp:td	(Ljava/lang/String;)J
    //   1096: ldc2_w 338
    //   1099: lcmp
    //   1100: ifge +107 -> 1207
    //   1103: iload 5
    //   1105: ifeq +51 -> 1156
    //   1108: ldc 25
    //   1110: ldc_w 341
    //   1113: iconst_1
    //   1114: anewarray 29	java/lang/Object
    //   1117: dup
    //   1118: iconst_0
    //   1119: aload_1
    //   1120: aastore
    //   1121: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1124: aload_1
    //   1125: aload_0
    //   1126: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1129: lconst_0
    //   1130: lcmp
    //   1131: iflt +14 -> 1145
    //   1134: iconst_1
    //   1135: istore 5
    //   1137: ldc 192
    //   1139: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1142: goto -1094 -> 48
    //   1145: iconst_0
    //   1146: istore 5
    //   1148: ldc 192
    //   1150: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1153: goto -1105 -> 48
    //   1156: aload 4
    //   1158: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1161: sipush 150
    //   1164: if_icmpge +43 -> 1207
    //   1167: aload 4
    //   1169: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1172: sipush 150
    //   1175: if_icmpge +32 -> 1207
    //   1178: aload_1
    //   1179: aload 4
    //   1181: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1184: aload 4
    //   1186: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1189: getstatic 344	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   1192: iload_2
    //   1193: aload_0
    //   1194: invokestatic 346	com/tencent/mm/plugin/appbrand/s/c:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1197: istore 5
    //   1199: ldc 192
    //   1201: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1204: goto -1156 -> 48
    //   1207: aload_1
    //   1208: aload 4
    //   1210: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1213: aload 4
    //   1215: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1218: getstatic 319	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1221: iload_2
    //   1222: aload_0
    //   1223: invokestatic 346	com/tencent/mm/plugin/appbrand/s/c:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1226: istore 7
    //   1228: iload 5
    //   1230: ifeq +116 -> 1346
    //   1233: iload 10
    //   1235: ifne +111 -> 1346
    //   1238: aload_0
    //   1239: invokestatic 196	com/tencent/mm/modelsfs/FileOp:td	(Ljava/lang/String;)J
    //   1242: lstore 16
    //   1244: ldc 25
    //   1246: ldc_w 324
    //   1249: iconst_3
    //   1250: anewarray 29	java/lang/Object
    //   1253: dup
    //   1254: iconst_0
    //   1255: iload_3
    //   1256: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1259: aastore
    //   1260: dup
    //   1261: iconst_1
    //   1262: lload 16
    //   1264: invokestatic 157	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1267: aastore
    //   1268: dup
    //   1269: iconst_2
    //   1270: bipush 10
    //   1272: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1275: aastore
    //   1276: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1279: iload_3
    //   1280: i2l
    //   1281: lload 16
    //   1283: lsub
    //   1284: ldc2_w 325
    //   1287: lmul
    //   1288: iload_3
    //   1289: bipush 10
    //   1291: imul
    //   1292: i2l
    //   1293: lcmp
    //   1294: ifge +40 -> 1334
    //   1297: aload_0
    //   1298: invokestatic 330	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1301: pop
    //   1302: aload_1
    //   1303: aload_0
    //   1304: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1307: lconst_0
    //   1308: lcmp
    //   1309: iflt +14 -> 1323
    //   1312: iconst_1
    //   1313: istore 5
    //   1315: ldc 192
    //   1317: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1320: goto -1272 -> 48
    //   1323: iconst_0
    //   1324: istore 5
    //   1326: ldc 192
    //   1328: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1331: goto -1283 -> 48
    //   1334: ldc 192
    //   1336: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1339: iload 7
    //   1341: istore 5
    //   1343: goto -1295 -> 48
    //   1346: ldc 192
    //   1348: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1351: iload 7
    //   1353: istore 5
    //   1355: goto -1307 -> 48
    //   1358: aload 4
    //   1360: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1363: aload 4
    //   1365: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1368: if_icmplt +351 -> 1719
    //   1371: sipush 960
    //   1374: istore 9
    //   1376: aload 4
    //   1378: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1381: aload 4
    //   1383: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1386: if_icmplt +341 -> 1727
    //   1389: sipush 640
    //   1392: istore 8
    //   1394: aload 4
    //   1396: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1399: aload 4
    //   1401: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1404: iconst_2
    //   1405: imul
    //   1406: if_icmpge +18 -> 1424
    //   1409: aload 4
    //   1411: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1414: aload 4
    //   1416: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1419: iconst_2
    //   1420: imul
    //   1421: if_icmplt +395 -> 1816
    //   1424: ldc 25
    //   1426: new 167	java/lang/StringBuilder
    //   1429: dup
    //   1430: ldc_w 348
    //   1433: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1436: aload 4
    //   1438: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1441: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1444: ldc 251
    //   1446: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1449: aload 4
    //   1451: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1454: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1457: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1460: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1463: aload 4
    //   1465: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1468: ifgt +9 -> 1477
    //   1471: aload 4
    //   1473: iconst_1
    //   1474: putfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1477: aload 4
    //   1479: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1482: ifgt +9 -> 1491
    //   1485: aload 4
    //   1487: iconst_1
    //   1488: putfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1491: aload 4
    //   1493: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1496: aload 4
    //   1498: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1501: if_icmple +234 -> 1735
    //   1504: aload 4
    //   1506: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1509: aload 4
    //   1511: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1514: idiv
    //   1515: istore 9
    //   1517: iload 9
    //   1519: istore 11
    //   1521: iload 9
    //   1523: ifne +6 -> 1529
    //   1526: iconst_1
    //   1527: istore 11
    //   1529: ldc_w 265
    //   1532: iload 11
    //   1534: idiv
    //   1535: i2d
    //   1536: invokestatic 351	java/lang/Math:sqrt	(D)D
    //   1539: d2i
    //   1540: istore 9
    //   1542: aload 4
    //   1544: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1547: aload 4
    //   1549: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1552: if_icmple +199 -> 1751
    //   1555: iload 9
    //   1557: iload 11
    //   1559: imul
    //   1560: istore 8
    //   1562: ldc 25
    //   1564: new 167	java/lang/StringBuilder
    //   1567: dup
    //   1568: ldc_w 353
    //   1571: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1574: iload 8
    //   1576: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1579: ldc 251
    //   1581: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1584: iload 9
    //   1586: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1589: ldc 251
    //   1591: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1594: iload 11
    //   1596: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1599: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1602: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1605: iload 9
    //   1607: istore 11
    //   1609: aload_1
    //   1610: iload 11
    //   1612: iload 8
    //   1614: getstatic 319	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1617: iload_2
    //   1618: aload_0
    //   1619: invokestatic 346	com/tencent/mm/plugin/appbrand/s/c:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1622: istore 7
    //   1624: iload 5
    //   1626: ifeq +154 -> 1780
    //   1629: iload 10
    //   1631: ifne +149 -> 1780
    //   1634: aload_0
    //   1635: invokestatic 196	com/tencent/mm/modelsfs/FileOp:td	(Ljava/lang/String;)J
    //   1638: lstore 16
    //   1640: ldc 25
    //   1642: ldc_w 324
    //   1645: iconst_3
    //   1646: anewarray 29	java/lang/Object
    //   1649: dup
    //   1650: iconst_0
    //   1651: iload_3
    //   1652: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1655: aastore
    //   1656: dup
    //   1657: iconst_1
    //   1658: lload 16
    //   1660: invokestatic 157	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1663: aastore
    //   1664: dup
    //   1665: iconst_2
    //   1666: bipush 10
    //   1668: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1671: aastore
    //   1672: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1675: iload_3
    //   1676: i2l
    //   1677: lload 16
    //   1679: lsub
    //   1680: ldc2_w 325
    //   1683: lmul
    //   1684: iload_3
    //   1685: bipush 10
    //   1687: imul
    //   1688: i2l
    //   1689: lcmp
    //   1690: ifge +90 -> 1780
    //   1693: aload_0
    //   1694: invokestatic 330	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1697: pop
    //   1698: aload_1
    //   1699: aload_0
    //   1700: invokestatic 272	com/tencent/mm/modelsfs/FileOp:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   1703: lconst_0
    //   1704: lcmp
    //   1705: iflt +64 -> 1769
    //   1708: iconst_1
    //   1709: istore 5
    //   1711: ldc 192
    //   1713: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1716: goto -1668 -> 48
    //   1719: sipush 640
    //   1722: istore 9
    //   1724: goto -348 -> 1376
    //   1727: sipush 960
    //   1730: istore 8
    //   1732: goto -338 -> 1394
    //   1735: aload 4
    //   1737: getfield 137	android/graphics/BitmapFactory$Options:outHeight	I
    //   1740: aload 4
    //   1742: getfield 134	android/graphics/BitmapFactory$Options:outWidth	I
    //   1745: idiv
    //   1746: istore 9
    //   1748: goto -231 -> 1517
    //   1751: iload 9
    //   1753: iload 11
    //   1755: imul
    //   1756: istore 18
    //   1758: iload 9
    //   1760: istore 8
    //   1762: iload 18
    //   1764: istore 9
    //   1766: goto -204 -> 1562
    //   1769: iconst_0
    //   1770: istore 5
    //   1772: ldc 192
    //   1774: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1777: goto -1729 -> 48
    //   1780: ldc 192
    //   1782: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1785: iload 7
    //   1787: istore 5
    //   1789: goto -1741 -> 48
    //   1792: astore_0
    //   1793: goto -1136 -> 657
    //   1796: astore_0
    //   1797: goto -967 -> 830
    //   1800: astore_0
    //   1801: goto -947 -> 854
    //   1804: astore_0
    //   1805: goto -930 -> 875
    //   1808: astore_0
    //   1809: goto -888 -> 921
    //   1812: astore_1
    //   1813: goto -870 -> 943
    //   1816: iload 8
    //   1818: istore 11
    //   1820: iload 9
    //   1822: istore 8
    //   1824: goto -215 -> 1609
    //   1827: goto -1674 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   171	177	454	java/lang/Exception
    //   190	201	454	java/lang/Exception
    //   205	227	454	java/lang/Exception
    //   518	524	886	java/io/IOException
    //   536	544	886	java/io/IOException
    //   556	564	886	java/io/IOException
    //   572	577	886	java/io/IOException
    //   585	595	886	java/io/IOException
    //   603	611	886	java/io/IOException
    //   619	629	886	java/io/IOException
    //   637	642	886	java/io/IOException
    //   681	697	886	java/io/IOException
    //   715	721	886	java/io/IOException
    //   729	764	886	java/io/IOException
    //   790	795	886	java/io/IOException
    //   803	810	886	java/io/IOException
    //   518	524	932	finally
    //   536	544	932	finally
    //   556	564	932	finally
    //   572	577	932	finally
    //   585	595	932	finally
    //   603	611	932	finally
    //   619	629	932	finally
    //   637	642	932	finally
    //   681	697	932	finally
    //   715	721	932	finally
    //   729	764	932	finally
    //   790	795	932	finally
    //   803	810	932	finally
    //   891	911	932	finally
    //   652	657	1792	java/io/IOException
    //   825	830	1796	java/io/IOException
    //   849	854	1800	java/io/IOException
    //   870	875	1804	java/io/IOException
    //   916	921	1808	java/io/IOException
    //   938	943	1812	java/io/IOException
  }

  @Deprecated
  public static boolean e(BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(73191);
    boolean bool = a.e(paramOptions);
    AppMethodBeat.o(73191);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c
 * JD-Core Version:    0.6.2
 */