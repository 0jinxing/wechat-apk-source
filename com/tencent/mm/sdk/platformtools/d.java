package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.b;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.vfs.e;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static DisplayMetrics ghw = null;

  private static BitmapFactory.Options H(InputStream paramInputStream)
  {
    AppMethodBeat.i(93317);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    if (paramInputStream == null)
    {
      ab.e("MicroMsg.BitmapUtil", "getImageOptions decode stream is null!!");
      AppMethodBeat.o(93317);
    }
    while (true)
    {
      return localOptions;
      try
      {
        Bitmap localBitmap = MMBitmapFactory.decodeStream(paramInputStream, null, localOptions);
        if (localBitmap != null)
        {
          ab.i("MicroMsg.BitmapUtil", "getImageOptions bitmap recycle. %s", new Object[] { localBitmap });
          localBitmap.recycle();
        }
        try
        {
          paramInputStream.close();
          AppMethodBeat.o(93317);
        }
        catch (IOException paramInputStream)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        while (true)
        {
          localOutOfMemoryError = localOutOfMemoryError;
          ab.printErrStackTrace("MicroMsg.BitmapUtil", localOutOfMemoryError, "Decode bitmap failed.", new Object[0]);
          try
          {
            paramInputStream.close();
          }
          catch (IOException paramInputStream)
          {
            ab.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
          }
        }
      }
      finally
      {
      }
    }
    try
    {
      paramInputStream.close();
      AppMethodBeat.o(93317);
      throw localObject;
    }
    catch (IOException paramInputStream)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "hy: stream close failed ", new Object[0]);
    }
  }

  public static Bitmap LV(int paramInt)
  {
    AppMethodBeat.i(93334);
    Bitmap localBitmap = a(paramInt, null, null, null, false, 0.0F, 0, 0);
    AppMethodBeat.o(93334);
    return localBitmap;
  }

  public static int a(boolean paramBoolean, String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, b paramb)
  {
    int i = 1;
    AppMethodBeat.i(93329);
    Bitmap localBitmap = d(paramString1, paramInt1, paramInt2, false);
    if (localBitmap == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(93329);
    }
    while (true)
    {
      return paramInt1;
      paramString1 = b(localBitmap, Exif.fromFile(paramString1).getOrientationInDegree());
      if (paramb != null)
        paramb.getFile();
      if (paramBoolean);
      try
      {
        paramInt1 = q.b(paramString1, paramInt3, paramString2);
        ab.i("MicroMsg.BitmapUtil", "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), paramString2 });
        AppMethodBeat.o(93329);
        continue;
        a(paramString1, paramInt3, paramCompressFormat, paramString2, true);
        AppMethodBeat.o(93329);
        paramInt1 = i;
      }
      catch (IOException paramString1)
      {
        ab.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: ".concat(String.valueOf(paramString2)));
        paramInt1 = -2;
        AppMethodBeat.o(93329);
      }
    }
  }

  private static Bitmap a(int paramInt1, String paramString, byte[] paramArrayOfByte, Uri paramUri, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93350);
    paramString = b(paramInt1, paramString, paramArrayOfByte, paramUri, paramBoolean, paramFloat, paramInt2, paramInt3);
    AppMethodBeat.o(93350);
    return paramString;
  }

  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(93357);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(93357);
    }
    while (true)
    {
      return paramBitmap;
      if ((paramFloat1 <= 0.999D) || (paramFloat1 >= 1.001D) || (paramFloat2 <= 0.999D) || (paramFloat2 >= 1.001D))
        break;
      AppMethodBeat.o(93357);
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    if ((paramFloat1 < 0.999D) || (paramFloat1 > 1.001D) || (paramFloat2 < 0.999D) || (paramFloat2 > 1.001D))
      ((Matrix)localObject).postScale(paramFloat1, paramFloat2);
    localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    am((Bitmap)localObject);
    StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
    if (localObject == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.BitmapUtil", bool + "  degree:0.0");
      if (paramBitmap != localObject)
      {
        ab.i("MicroMsg.BitmapUtil", "rotateAndScale bitmap recycle asdfasdjfjasdfjsadfjdsa. %s", new Object[] { paramBitmap });
        paramBitmap.recycle();
      }
      paramBitmap = c.ag((Bitmap)localObject);
      AppMethodBeat.o(93357);
      break;
    }
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = null;
    AppMethodBeat.i(93378);
    if ((paramBitmap == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      AppMethodBeat.o(93378);
      paramBitmap = localBitmap;
    }
    while (true)
    {
      return paramBitmap;
      long l = System.currentTimeMillis();
      localBitmap = c.ag(createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false));
      Canvas localCanvas = new Canvas(localBitmap);
      ab.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localCanvas.drawBitmap(paramBitmap, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
      ab.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
      paramBitmap = d(localBitmap, paramInt1);
      AppMethodBeat.o(93378);
    }
  }

  // ERROR //
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc 246
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnonnull +21 -> 27
    //   9: ldc 36
    //   11: ldc 248
    //   13: invokestatic 44	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aconst_null
    //   17: astore 5
    //   19: ldc 246
    //   21: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: aload 5
    //   26: areturn
    //   27: iload_1
    //   28: ifle +7 -> 35
    //   31: iload_2
    //   32: ifgt +53 -> 85
    //   35: new 171	java/lang/StringBuilder
    //   38: astore 5
    //   40: aload 5
    //   42: ldc 250
    //   44: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: ldc 36
    //   49: aload 5
    //   51: iload_1
    //   52: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: ldc 255
    //   57: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: iload_2
    //   61: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   64: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokestatic 44	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aload_0
    //   71: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   74: aconst_null
    //   75: astore 5
    //   77: ldc 246
    //   79: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: goto -58 -> 24
    //   85: new 29	android/graphics/BitmapFactory$Options
    //   88: astore 5
    //   90: aload 5
    //   92: invokespecial 30	android/graphics/BitmapFactory$Options:<init>	()V
    //   95: aload 5
    //   97: aload_0
    //   98: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   101: putfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   104: aload 5
    //   106: aload_0
    //   107: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   110: putfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   113: new 171	java/lang/StringBuilder
    //   116: astore 6
    //   118: aload 6
    //   120: ldc_w 264
    //   123: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: ldc 36
    //   128: aload 6
    //   130: iload_2
    //   131: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   134: ldc_w 266
    //   137: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: iload_1
    //   141: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: ldc_w 268
    //   147: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: iload_3
    //   151: invokevirtual 180	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   154: ldc_w 270
    //   157: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: iload 4
    //   162: invokevirtual 180	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   165: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload 5
    //   173: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   176: i2d
    //   177: dconst_1
    //   178: dmul
    //   179: iload_1
    //   180: i2d
    //   181: ddiv
    //   182: dstore 7
    //   184: aload 5
    //   186: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   189: i2d
    //   190: dconst_1
    //   191: dmul
    //   192: iload_2
    //   193: i2d
    //   194: ddiv
    //   195: dstore 9
    //   197: new 171	java/lang/StringBuilder
    //   200: astore 6
    //   202: aload 6
    //   204: ldc_w 274
    //   207: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: ldc 36
    //   212: aload 6
    //   214: dload 9
    //   216: invokevirtual 277	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   219: ldc_w 279
    //   222: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: dload 7
    //   227: invokevirtual 277	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   230: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: iload_3
    //   237: ifeq +109 -> 346
    //   240: dload 7
    //   242: dload 9
    //   244: dcmpl
    //   245: ifle +94 -> 339
    //   248: dload 9
    //   250: dstore 11
    //   252: aload 5
    //   254: dload 11
    //   256: d2i
    //   257: putfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   260: aload 5
    //   262: getfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   265: iconst_1
    //   266: if_icmpgt +9 -> 275
    //   269: aload 5
    //   271: iconst_1
    //   272: putfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   275: aload 5
    //   277: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   280: aload 5
    //   282: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   285: imul
    //   286: aload 5
    //   288: getfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   291: idiv
    //   292: aload 5
    //   294: getfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   297: idiv
    //   298: ldc_w 283
    //   301: if_icmple +67 -> 368
    //   304: aload 5
    //   306: aload 5
    //   308: getfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   311: iconst_1
    //   312: iadd
    //   313: putfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   316: goto -41 -> 275
    //   319: astore 6
    //   321: aload_0
    //   322: astore 5
    //   324: aload 6
    //   326: astore_0
    //   327: aload 5
    //   329: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   332: ldc 246
    //   334: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   337: aload_0
    //   338: athrow
    //   339: dload 7
    //   341: dstore 11
    //   343: goto -91 -> 252
    //   346: dload 7
    //   348: dload 9
    //   350: dcmpg
    //   351: ifge +10 -> 361
    //   354: dload 9
    //   356: dstore 11
    //   358: goto -106 -> 252
    //   361: dload 7
    //   363: dstore 11
    //   365: goto -113 -> 252
    //   368: iload_3
    //   369: ifeq +367 -> 736
    //   372: dload 7
    //   374: dload 9
    //   376: dcmpl
    //   377: ifle +325 -> 702
    //   380: iload_2
    //   381: i2d
    //   382: dstore 11
    //   384: dload 11
    //   386: dconst_1
    //   387: dmul
    //   388: aload 5
    //   390: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   393: i2d
    //   394: dmul
    //   395: aload 5
    //   397: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   400: i2d
    //   401: ddiv
    //   402: invokestatic 289	java/lang/Math:ceil	(D)D
    //   405: d2i
    //   406: istore 13
    //   408: iload_2
    //   409: istore 14
    //   411: aload 5
    //   413: iconst_0
    //   414: putfield 34	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   417: new 171	java/lang/StringBuilder
    //   420: astore 6
    //   422: aload 6
    //   424: ldc_w 291
    //   427: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   430: ldc 36
    //   432: aload 6
    //   434: iload 14
    //   436: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   439: ldc_w 266
    //   442: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: iload 13
    //   447: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   450: ldc_w 293
    //   453: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: aload 5
    //   458: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   461: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   464: ldc_w 266
    //   467: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: aload 5
    //   472: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   475: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   478: ldc_w 295
    //   481: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: aload 5
    //   486: getfield 282	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   489: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   492: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   495: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   498: aload_0
    //   499: iload 14
    //   501: iload 13
    //   503: iconst_1
    //   504: invokestatic 299	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   507: astore 6
    //   509: aload 6
    //   511: ifnull +409 -> 920
    //   514: aload 6
    //   516: astore 5
    //   518: iload 4
    //   520: ifeq +37 -> 557
    //   523: aload 6
    //   525: astore 5
    //   527: aload_0
    //   528: aload 6
    //   530: if_acmpeq +27 -> 557
    //   533: ldc 36
    //   535: ldc_w 301
    //   538: iconst_1
    //   539: anewarray 4	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload_0
    //   545: aastore
    //   546: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   549: aload_0
    //   550: invokevirtual 63	android/graphics/Bitmap:recycle	()V
    //   553: aload 6
    //   555: astore 5
    //   557: iload_3
    //   558: ifeq +356 -> 914
    //   561: iload_2
    //   562: istore 14
    //   564: aload 5
    //   566: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   569: iload_2
    //   570: if_icmpge +40 -> 610
    //   573: ldc 36
    //   575: ldc_w 303
    //   578: iconst_2
    //   579: anewarray 4	java/lang/Object
    //   582: dup
    //   583: iconst_0
    //   584: aload 5
    //   586: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   589: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   592: aastore
    //   593: dup
    //   594: iconst_1
    //   595: iload_2
    //   596: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   599: aastore
    //   600: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: aload 5
    //   605: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   608: istore 14
    //   610: iload_1
    //   611: istore_2
    //   612: aload 5
    //   614: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   617: iload_1
    //   618: if_icmpge +39 -> 657
    //   621: ldc 36
    //   623: ldc_w 307
    //   626: iconst_2
    //   627: anewarray 4	java/lang/Object
    //   630: dup
    //   631: iconst_0
    //   632: aload 5
    //   634: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   637: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   640: aastore
    //   641: dup
    //   642: iconst_1
    //   643: iload_1
    //   644: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   647: aastore
    //   648: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   651: aload 5
    //   653: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   656: istore_2
    //   657: aload 5
    //   659: aload 5
    //   661: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   664: iload 14
    //   666: isub
    //   667: iconst_1
    //   668: ishr
    //   669: aload 5
    //   671: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   674: iload_2
    //   675: isub
    //   676: iconst_1
    //   677: ishr
    //   678: iload 14
    //   680: iload_2
    //   681: invokestatic 310	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   684: astore_0
    //   685: aload_0
    //   686: ifnonnull +122 -> 808
    //   689: aload 5
    //   691: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   694: ldc 246
    //   696: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   699: goto -675 -> 24
    //   702: iload_1
    //   703: i2d
    //   704: dstore 11
    //   706: dload 11
    //   708: dconst_1
    //   709: dmul
    //   710: aload 5
    //   712: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   715: i2d
    //   716: dmul
    //   717: aload 5
    //   719: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   722: i2d
    //   723: ddiv
    //   724: invokestatic 289	java/lang/Math:ceil	(D)D
    //   727: d2i
    //   728: istore 14
    //   730: iload_1
    //   731: istore 13
    //   733: goto -322 -> 411
    //   736: dload 7
    //   738: dload 9
    //   740: dcmpg
    //   741: ifge +33 -> 774
    //   744: iload_2
    //   745: i2d
    //   746: dconst_1
    //   747: dmul
    //   748: aload 5
    //   750: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   753: i2d
    //   754: dmul
    //   755: aload 5
    //   757: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   760: i2d
    //   761: ddiv
    //   762: invokestatic 289	java/lang/Math:ceil	(D)D
    //   765: d2i
    //   766: istore 13
    //   768: iload_2
    //   769: istore 14
    //   771: goto -360 -> 411
    //   774: iload_1
    //   775: i2d
    //   776: dconst_1
    //   777: dmul
    //   778: aload 5
    //   780: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   783: i2d
    //   784: dmul
    //   785: aload 5
    //   787: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   790: i2d
    //   791: ddiv
    //   792: invokestatic 289	java/lang/Math:ceil	(D)D
    //   795: dstore 11
    //   797: dload 11
    //   799: d2i
    //   800: istore 14
    //   802: iload_1
    //   803: istore 13
    //   805: goto -394 -> 411
    //   808: iload 4
    //   810: ifeq +31 -> 841
    //   813: aload 5
    //   815: aload_0
    //   816: if_acmpeq +25 -> 841
    //   819: ldc 36
    //   821: ldc_w 312
    //   824: iconst_1
    //   825: anewarray 4	java/lang/Object
    //   828: dup
    //   829: iconst_0
    //   830: aload 5
    //   832: aastore
    //   833: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   836: aload 5
    //   838: invokevirtual 63	android/graphics/Bitmap:recycle	()V
    //   841: new 171	java/lang/StringBuilder
    //   844: astore 5
    //   846: aload 5
    //   848: ldc_w 314
    //   851: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   854: ldc 36
    //   856: aload 5
    //   858: aload_0
    //   859: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   862: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   865: ldc_w 266
    //   868: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: aload_0
    //   872: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   875: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   878: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   881: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   884: aload_0
    //   885: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   888: ldc 246
    //   890: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   893: aload_0
    //   894: astore 5
    //   896: goto -872 -> 24
    //   899: astore_0
    //   900: goto -573 -> 327
    //   903: astore 6
    //   905: aload_0
    //   906: astore 5
    //   908: aload 6
    //   910: astore_0
    //   911: goto -584 -> 327
    //   914: aload 5
    //   916: astore_0
    //   917: goto -33 -> 884
    //   920: aload_0
    //   921: astore 5
    //   923: goto -366 -> 557
    //
    // Exception table:
    //   from	to	target	type
    //   35	70	319	finally
    //   85	236	319	finally
    //   252	275	319	finally
    //   275	316	319	finally
    //   384	408	319	finally
    //   411	509	319	finally
    //   533	553	319	finally
    //   706	730	319	finally
    //   744	768	319	finally
    //   774	797	319	finally
    //   564	610	899	finally
    //   612	657	899	finally
    //   657	685	899	finally
    //   819	841	899	finally
    //   841	884	903	finally
  }

  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    AppMethodBeat.i(93365);
    paramBitmap = a(paramBitmap, paramBoolean, paramFloat, false);
    AppMethodBeat.o(93365);
    return paramBitmap;
  }

  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    Canvas localCanvas = null;
    AppMethodBeat.i(93364);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.e("MicroMsg.BitmapUtil", "getRoundedCornerBitmap in bitmap is null");
      AppMethodBeat.o(93364);
      paramBitmap = localCanvas;
    }
    while (true)
    {
      return paramBitmap;
      am(paramBitmap);
      Bitmap localBitmap = createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888, paramBoolean2);
      if (localBitmap == null)
      {
        AppMethodBeat.o(93364);
        paramBitmap = localCanvas;
      }
      else
      {
        localCanvas = new Canvas(localBitmap);
        Paint localPaint = new Paint();
        Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
        RectF localRectF = new RectF(localRect);
        localPaint.setAntiAlias(true);
        localPaint.setDither(true);
        localPaint.setFilterBitmap(true);
        localCanvas.drawARGB(0, 0, 0, 0);
        localPaint.setColor(-4144960);
        localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
        localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
        if (paramBoolean1)
        {
          ab.i("MicroMsg.BitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", new Object[] { paramBitmap });
          paramBitmap.recycle();
        }
        am(localBitmap);
        paramBitmap = c.ag(localBitmap);
        AppMethodBeat.o(93364);
      }
    }
  }

  // ERROR //
  private static Bitmap a(BitmapFactory.Options paramOptions, byte[] paramArrayOfByte, String paramString, Uri paramUri, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: ldc_w 371
    //   12: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   15: aload 7
    //   17: astore 9
    //   19: aload_1
    //   20: invokestatic 377	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   23: ifeq +42 -> 65
    //   26: aload 7
    //   28: astore 9
    //   30: aload_2
    //   31: invokestatic 381	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   34: istore 10
    //   36: iload 10
    //   38: ifeq +27 -> 65
    //   41: aload_3
    //   42: ifnonnull +23 -> 65
    //   45: iload 5
    //   47: ifgt +18 -> 65
    //   50: aconst_null
    //   51: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   54: ldc_w 371
    //   57: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: aload 8
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: aload 7
    //   67: astore 9
    //   69: aload_1
    //   70: invokestatic 377	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   73: ifne +6 -> 79
    //   76: iconst_1
    //   77: istore 6
    //   79: iload 6
    //   81: ifeq +34 -> 115
    //   84: aload 7
    //   86: astore 9
    //   88: aload_1
    //   89: iconst_0
    //   90: aload_1
    //   91: arraylength
    //   92: aload_0
    //   93: invokestatic 385	com/tencent/mm/graphics/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   96: astore_2
    //   97: aload_2
    //   98: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   101: aload_2
    //   102: invokestatic 199	com/tencent/mm/sdk/platformtools/c:ag	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   105: astore_0
    //   106: ldc_w 371
    //   109: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: goto -49 -> 63
    //   115: iload 5
    //   117: ifle +23 -> 140
    //   120: aload 7
    //   122: astore 9
    //   124: invokestatic 391	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   127: invokevirtual 397	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   130: iload 5
    //   132: aload_0
    //   133: invokestatic 403	com/tencent/mm/compatible/g/a:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   136: astore_2
    //   137: goto -40 -> 97
    //   140: iload 4
    //   142: ifeq +72 -> 214
    //   145: aload_2
    //   146: invokestatic 381	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   149: istore 4
    //   151: iload 4
    //   153: ifeq +19 -> 172
    //   156: aconst_null
    //   157: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   160: ldc_w 371
    //   163: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload 8
    //   168: astore_0
    //   169: goto -106 -> 63
    //   172: invokestatic 391	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   175: invokevirtual 407	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   178: aload_2
    //   179: invokevirtual 413	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   182: astore_1
    //   183: aload_1
    //   184: aconst_null
    //   185: aload_0
    //   186: invokestatic 53	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   189: astore_0
    //   190: aload_0
    //   191: astore_2
    //   192: aload_1
    //   193: ifnull -96 -> 97
    //   196: aload_0
    //   197: astore 9
    //   199: aload_1
    //   200: invokevirtual 68	java/io/InputStream:close	()V
    //   203: aload_0
    //   204: astore_2
    //   205: goto -108 -> 97
    //   208: astore_1
    //   209: aload_0
    //   210: astore_2
    //   211: goto -114 -> 97
    //   214: aload_3
    //   215: ifnull +17 -> 232
    //   218: invokestatic 391	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   221: invokevirtual 417	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   224: aload_3
    //   225: invokevirtual 423	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   228: astore_1
    //   229: goto -46 -> 183
    //   232: aload_2
    //   233: invokestatic 428	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   236: astore_1
    //   237: goto -54 -> 183
    //   240: astore_0
    //   241: aconst_null
    //   242: astore_1
    //   243: aload_1
    //   244: ifnull +11 -> 255
    //   247: aload 7
    //   249: astore 9
    //   251: aload_1
    //   252: invokevirtual 68	java/io/InputStream:close	()V
    //   255: aload 7
    //   257: astore 9
    //   259: ldc_w 371
    //   262: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: aload 7
    //   267: astore 9
    //   269: aload_0
    //   270: athrow
    //   271: astore_0
    //   272: aload 9
    //   274: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   277: ldc_w 371
    //   280: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aload_0
    //   284: athrow
    //   285: astore_1
    //   286: goto -31 -> 255
    //   289: astore_0
    //   290: goto -47 -> 243
    //
    // Exception table:
    //   from	to	target	type
    //   199	203	208	java/io/IOException
    //   145	151	240	finally
    //   172	183	240	finally
    //   218	229	240	finally
    //   232	237	240	finally
    //   19	26	271	finally
    //   30	36	271	finally
    //   69	76	271	finally
    //   88	97	271	finally
    //   124	137	271	finally
    //   199	203	271	finally
    //   251	255	271	finally
    //   259	265	271	finally
    //   269	271	271	finally
    //   251	255	285	java/io/IOException
    //   183	190	289	finally
  }

  public static Bitmap a(InputStream paramInputStream, float paramFloat)
  {
    AppMethodBeat.i(93347);
    paramInputStream = a(paramInputStream, paramFloat, 0, 0);
    AppMethodBeat.o(93347);
    return paramInputStream;
  }

  public static Bitmap a(InputStream paramInputStream, float paramFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93346);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    if (paramFloat != 0.0F)
      localOptions.inDensity = ((int)(160.0F * paramFloat));
    Object localObject;
    int i;
    int j;
    int k;
    if (paramInt1 == 0)
    {
      localObject = paramInputStream;
      if (paramInt2 == 0);
    }
    else
    {
      i = paramInt1;
      if (paramInt1 == 0)
        i = 2147483647;
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
        paramInt1 = 2147483647;
      if (!(paramInputStream instanceof FileInputStream))
        break label220;
      localObject = new l((FileInputStream)paramInputStream);
      ((InputStream)localObject).mark(25165824);
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
      j = localOptions.outWidth;
      k = localOptions.outHeight;
      if (((i <= paramInt1) || (j >= k)) && ((i >= paramInt1) || (j <= k)))
        break label298;
      paramInt2 = j;
    }
    while (true)
    {
      while (true)
      {
        if ((k > i) || (paramInt2 > paramInt1))
          localOptions.inSampleSize = ((int)Math.max(k / i, paramInt2 / paramInt1));
        localOptions.inJustDecodeBounds = false;
        try
        {
          ((InputStream)localObject).reset();
          localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        catch (IOException paramInputStream)
        {
          try
          {
            paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
            AppMethodBeat.o(93346);
            return paramInputStream;
            label220: localObject = paramInputStream;
            if (paramInputStream.markSupported())
              break;
            localObject = new BufferedInputStream(paramInputStream, 65536);
            break;
            paramInputStream = paramInputStream;
            ab.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "Failed seeking InputStream.", new Object[0]);
          }
          catch (OutOfMemoryError paramInputStream)
          {
            while (true)
            {
              localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
              try
              {
                paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
              }
              catch (OutOfMemoryError paramInputStream)
              {
                ab.e("MicroMsg.BitmapUtil", "decodeStream OutOfMemoryError return null");
                paramInputStream = null;
              }
            }
          }
        }
      }
      label298: paramInt2 = k;
      k = j;
    }
  }

  @TargetApi(11)
  private static Bitmap a(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(138277);
    if ((paramInt3 <= 0) || (paramInt4 <= 0))
    {
      ab.e("MicroMsg.BitmapUtil", "extractThumbNail height:" + paramInt4 + " width:" + paramInt3);
      paramInputStream = null;
      AppMethodBeat.o(138277);
    }
    while (true)
    {
      return paramInputStream;
      if ((paramInt1 > 0) && (paramInt2 > 0))
        break;
      ab.e("MicroMsg.BitmapUtil", "decode[%s] error, outHeight[%d] outWidth[%d]", new Object[] { paramInputStream, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramInputStream = null;
      AppMethodBeat.o(138277);
    }
    Object localObject2;
    double d1;
    double d2;
    double d3;
    while (true)
    {
      try
      {
        localObject1 = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)localObject1).<init>();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("extractThumbNail: round=");
        ab.i("MicroMsg.BitmapUtil", paramInt3 + "x" + paramInt4 + ", crop=" + paramBoolean);
        d1 = paramInt2 * 1.0D / paramInt4;
        d2 = paramInt1 * 1.0D / paramInt3;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("extractThumbNail: extract beX = ");
        ab.d("MicroMsg.BitmapUtil", d2 + ", beY = " + d1);
        if (!paramBoolean)
          break label342;
        if (d1 <= d2)
          break label335;
        d3 = d2;
        ((BitmapFactory.Options)localObject1).inSampleSize = ((int)d3);
        if (((BitmapFactory.Options)localObject1).inSampleSize <= 1)
          ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject1).inSampleSize / ((BitmapFactory.Options)localObject1).inSampleSize <= 2764800)
          break label364;
        ((BitmapFactory.Options)localObject1).inSampleSize += 1;
        continue;
      }
      catch (OutOfMemoryError paramInputStream)
      {
        ab.e("MicroMsg.BitmapUtil", "decode bitmap failed: " + paramInputStream.getMessage());
        paramInputStream = null;
        AppMethodBeat.o(138277);
      }
      break;
      label335: d3 = d1;
      continue;
      label342: if (d1 < d2)
        d3 = d2;
      else
        d3 = d1;
    }
    label364: int i;
    int j;
    if (paramBoolean)
      if (d1 > d2)
      {
        d3 = paramInt3 * 1.0D * paramInt2 / paramInt1;
        i = (int)Math.ceil(d3);
        j = paramInt3;
        label400: if (i <= 0)
          break label610;
        label405: if (j <= 0)
          break label616;
      }
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 11)
        ((BitmapFactory.Options)localObject1).inMutable = true;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("bitmap required size=");
      ab.i("MicroMsg.BitmapUtil", j + "x" + i + ", orig=" + paramInt1 + "x" + paramInt2 + ", sample=" + ((BitmapFactory.Options)localObject1).inSampleSize);
      paramInputStream = MMBitmapFactory.decodeStream(paramInputStream, null, (BitmapFactory.Options)localObject1);
      if (paramInputStream != null)
        break label622;
      ab.e("MicroMsg.BitmapUtil", "bitmap decode failed");
      paramInputStream = null;
      AppMethodBeat.o(138277);
      break;
      d3 = paramInt4 * 1.0D * paramInt1 / paramInt2;
      j = (int)Math.ceil(d3);
      i = paramInt4;
      break label400;
      if (d1 < d2)
      {
        i = (int)Math.ceil(paramInt3 * 1.0D * paramInt2 / paramInt1);
        j = paramInt3;
        break label400;
      }
      j = (int)Math.ceil(paramInt4 * 1.0D * paramInt1 / paramInt2);
      i = paramInt4;
      break label400;
      label610: i = 1;
      break label405;
      label616: j = 1;
    }
    label622: Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("bitmap decoded size=");
    ab.d("MicroMsg.BitmapUtil", paramInputStream.getWidth() + "x" + paramInputStream.getHeight());
    localObject1 = Bitmap.createScaledBitmap(paramInputStream, j, i, true);
    if ((paramInputStream != localObject1) && (localObject1 != null))
    {
      ab.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfad. %s", new Object[] { paramInputStream });
      paramInputStream.recycle();
      paramInputStream = (InputStream)localObject1;
    }
    while (true)
    {
      localObject1 = paramInputStream;
      if (paramBoolean)
      {
        paramInt2 = paramInt3;
        if (paramInputStream.getWidth() < paramInt3)
        {
          ab.e("MicroMsg.BitmapUtil", "bmw < width %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInt3) });
          paramInt2 = paramInputStream.getWidth();
        }
        paramInt3 = paramInt4;
        if (paramInputStream.getHeight() < paramInt4)
        {
          ab.e("MicroMsg.BitmapUtil", "bmh < height %d %d", new Object[] { Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt4) });
          paramInt3 = paramInputStream.getHeight();
        }
        i = paramInputStream.getWidth() - paramInt2 >> 1;
        int k = paramInputStream.getHeight() - paramInt3 >> 1;
        if (i >= 0)
        {
          j = k;
          paramInt4 = i;
          if (k >= 0);
        }
        else
        {
          ab.e("MicroMsg.BitmapUtil", "fix crop image error %d %d %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramInt1 = i;
          if (i < 0)
            paramInt1 = 0;
          j = k;
          paramInt4 = paramInt1;
          if (k < 0)
          {
            j = 0;
            paramInt4 = paramInt1;
          }
        }
        localObject2 = Bitmap.createBitmap(paramInputStream, paramInt4, j, paramInt2, paramInt3);
        if (localObject2 == null)
        {
          AppMethodBeat.o(138277);
          break;
        }
        localObject1 = paramInputStream;
        if (localObject2 != paramInputStream)
        {
          ab.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfaasdfad. %s", new Object[] { paramInputStream });
          paramInputStream.recycle();
          localObject1 = localObject2;
        }
        paramInputStream = new java/lang/StringBuilder;
        paramInputStream.<init>("bitmap croped size=");
        ab.d("MicroMsg.BitmapUtil", ((Bitmap)localObject1).getWidth() + "x" + ((Bitmap)localObject1).getHeight());
      }
      am((Bitmap)localObject1);
      paramInputStream = c.ag((Bitmap)localObject1);
      AppMethodBeat.o(138277);
      break;
    }
  }

  public static Bitmap a(String paramString, int paramInt1, int paramInt2, float paramFloat)
  {
    AppMethodBeat.i(93339);
    paramString = a(0, paramString, null, null, false, paramFloat, paramInt1, paramInt2);
    AppMethodBeat.o(93339);
    return paramString;
  }

  public static Bitmap a(int[] paramArrayOfInt, int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(93379);
    paramConfig = createBitmap(paramInt1, paramInt2, paramConfig, false);
    if (paramConfig != null)
    {
      if ((paramInt1 == paramConfig.getWidth()) && (paramInt2 == paramConfig.getHeight()))
        paramConfig.setPixels(paramArrayOfInt, 0, paramInt1, 0, 0, paramInt1, paramInt2);
    }
    else
    {
      am(paramConfig);
      paramArrayOfInt = c.ag(paramConfig);
      AppMethodBeat.o(93379);
    }
    while (true)
    {
      return paramArrayOfInt;
      paramArrayOfInt = null;
      AppMethodBeat.o(93379);
    }
  }

  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, OutputStream paramOutputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(93361);
    a(paramBitmap, paramCompressFormat, paramInt, paramOutputStream);
    if (paramBoolean)
    {
      ab.i("MicroMsg.BitmapUtil", "saveBitmapToStream bitmap recycle. %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    AppMethodBeat.o(93361);
  }

  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93362);
    if (bo.isNullOrNil(paramString))
    {
      paramBitmap = new IOException("saveBitmapToImage pathName null or nil");
      AppMethodBeat.o(93362);
      throw paramBitmap;
    }
    ab.d("MicroMsg.BitmapUtil", "saving to ".concat(String.valueOf(paramString)));
    Object localObject1 = null;
    Object localObject2 = null;
    e.tf(e.atb(paramString));
    while (true)
    {
      try
      {
        OutputStream localOutputStream = e.L(paramString, false);
        localObject2 = localOutputStream;
        localObject1 = localOutputStream;
        a(paramBitmap, paramInt, paramCompressFormat, localOutputStream, paramBoolean);
        if (paramBoolean)
        {
          ab.i("MicroMsg.BitmapUtil", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
        }
        if (localOutputStream != null)
          try
          {
            localOutputStream.close();
            AppMethodBeat.o(93362);
            return;
          }
          catch (IOException paramBitmap)
          {
            AppMethodBeat.o(93362);
            continue;
          }
      }
      catch (Exception paramCompressFormat)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("MicroMsg.BitmapUtil", paramCompressFormat, "saveBitmapToImage failed: %s", new Object[] { paramString });
        localObject1 = localObject2;
        paramString = new java/io/IOException;
        localObject1 = localObject2;
        paramString.<init>(paramCompressFormat);
        localObject1 = localObject2;
        AppMethodBeat.o(93362);
        localObject1 = localObject2;
        throw paramString;
      }
      finally
      {
        if (paramBoolean)
        {
          ab.i("MicroMsg.BitmapUtil", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
        }
        if (localObject1 == null);
      }
      try
      {
        localObject1.close();
        label235: AppMethodBeat.o(93362);
        throw paramCompressFormat;
        AppMethodBeat.o(93362);
      }
      catch (IOException paramBitmap)
      {
        break label235;
      }
    }
  }

  public static void a(Canvas paramCanvas, View paramView)
  {
    AppMethodBeat.i(93373);
    paramView.draw(paramCanvas);
    paramView = v(paramView, (int)paramView.getX(), (int)paramView.getY());
    if (paramView.size() > 0)
    {
      Iterator localIterator = paramView.iterator();
      while (localIterator.hasNext())
      {
        paramView = (v)localIterator.next();
        if ((paramView != null) && (paramView.xyt != null))
        {
          Object localObject = paramView.xyt;
          localObject = ((TextureView)localObject).getBitmap(((TextureView)localObject).getWidth(), ((TextureView)localObject).getHeight());
          if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
            ab.e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
          else
            paramCanvas.drawBitmap((Bitmap)localObject, paramView.left, paramView.top, null);
        }
      }
    }
    AppMethodBeat.o(93373);
  }

  public static boolean a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat, int paramInt, OutputStream paramOutputStream)
  {
    boolean bool = false;
    AppMethodBeat.i(93385);
    if (paramBitmap == null)
    {
      ab.e("MicroMsg.BitmapUtil", "bitmap error %s", new Object[] { paramBitmap });
      AppMethodBeat.o(93385);
    }
    while (true)
    {
      return bool;
      bool = paramBitmap.compress(paramCompressFormat, paramInt, paramOutputStream);
      if (!bool)
        ab.e("MicroMsg.BitmapUtil", "compress error %s", new Object[] { bo.dpG().toString() });
      AppMethodBeat.o(93385);
    }
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(93321);
    boolean bool = b(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2);
    AppMethodBeat.o(93321);
    return bool;
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3)
  {
    AppMethodBeat.i(93320);
    boolean bool = b(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2 + paramString3);
    AppMethodBeat.o(93320);
    return bool;
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(93326);
    paramBoolean = a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramBoolean, paramPInt1, paramPInt2, false);
    AppMethodBeat.o(93326);
    return paramBoolean;
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean1, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean2)
  {
    boolean bool = false;
    AppMethodBeat.i(93328);
    Bitmap localBitmap1 = d(paramString1, paramInt1, paramInt2, paramBoolean2);
    if (localBitmap1 == null)
    {
      AppMethodBeat.o(93328);
      paramBoolean1 = bool;
    }
    while (true)
    {
      return paramBoolean1;
      Bitmap localBitmap2 = localBitmap1;
      if (paramBoolean1)
        localBitmap2 = b(localBitmap1, Exif.fromFile(paramString1).getOrientationInDegree());
      try
      {
        paramPInt1.value = localBitmap2.getWidth();
        paramPInt2.value = localBitmap2.getHeight();
        a(localBitmap2, paramInt3, paramCompressFormat, paramString2, true);
        AppMethodBeat.o(93328);
        paramBoolean1 = true;
      }
      catch (IOException paramString1)
      {
        ab.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: ".concat(String.valueOf(paramString2)));
        AppMethodBeat.o(93328);
        paramBoolean1 = bool;
      }
    }
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(93327);
    boolean bool = a(paramString1, paramInt1, paramInt2, paramCompressFormat, 80, paramString2, true, paramPInt1, paramPInt2, true);
    AppMethodBeat.o(93327);
    return bool;
  }

  public static boolean a(String paramString1, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(93359);
    paramString1 = a(paramString1, 0, 0, 0.0F);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.BitmapUtil", "rotate: create bitmap fialed");
      AppMethodBeat.o(93359);
    }
    while (true)
    {
      return bool;
      float f1 = paramString1.getWidth();
      float f2 = paramString1.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).setRotate(paramInt1, f1 / 2.0F, f2 / 2.0F);
      localObject = Bitmap.createBitmap(paramString1, 0, 0, (int)f1, (int)f2, (Matrix)localObject, true);
      if (paramString1 != localObject)
      {
        ab.i("MicroMsg.BitmapUtil", "rotate bitmap recycle adjfjads fadsj fsadjf dsa. %s", new Object[] { paramString1.toString() });
        paramString1.recycle();
      }
      try
      {
        a((Bitmap)localObject, paramInt2, paramCompressFormat, paramString2, true);
        AppMethodBeat.o(93359);
        bool = true;
      }
      catch (IOException paramString1)
      {
        ab.printErrStackTrace("MicroMsg.BitmapUtil", paramString1, "create thumbnail from orig failed: ".concat(String.valueOf(paramString2)), new Object[0]);
        AppMethodBeat.o(93359);
      }
    }
  }

  public static boolean a(String paramString1, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString2, String paramString3)
  {
    AppMethodBeat.i(93360);
    boolean bool = a(paramString1, paramInt, paramCompressFormat, 90, paramString2 + paramString3);
    AppMethodBeat.o(93360);
    return bool;
  }

  public static Bitmap ah(Bitmap paramBitmap)
  {
    float f1 = 2.5F;
    AppMethodBeat.i(93332);
    int i = 120;
    float f2;
    int j;
    if (paramBitmap.getHeight() >= paramBitmap.getWidth())
    {
      f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      if (f2 <= 2.0F)
      {
        j = (int)(paramBitmap.getWidth() * 120.0D / paramBitmap.getHeight());
        ab.d("MicroMsg.BitmapUtil", "bitmap decoded size=" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
        Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, j, i, true);
        Bitmap localBitmap2 = paramBitmap;
        if (localBitmap1 != null)
        {
          localBitmap2 = paramBitmap;
          if (paramBitmap != localBitmap1)
          {
            ab.i("MicroMsg.BitmapUtil", "extractThumeNail bitmap recycle. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
            localBitmap2 = localBitmap1;
          }
        }
        AppMethodBeat.o(93332);
        return localBitmap2;
      }
      if (f2 <= 2.5D)
        break label325;
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
    }
    while (true)
    {
      i = (int)(f1 * 56.0F);
      j = 56;
      break;
      f2 = paramBitmap.getWidth() / paramBitmap.getHeight();
      if (f2 <= 2.0F)
      {
        i = (int)(paramBitmap.getHeight() * 120.0D / paramBitmap.getWidth());
        j = 120;
        break;
      }
      if (f2 > 2.5D)
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
      while (true)
      {
        j = (int)(f1 * 56.0F);
        i = 56;
        break;
        f1 = f2;
      }
      label325: f1 = f2;
    }
  }

  public static byte[] ai(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93367);
    paramBitmap = c(paramBitmap, 100);
    AppMethodBeat.o(93367);
    return paramBitmap;
  }

  public static byte[] aj(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93369);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      paramBitmap = new byte[0];
      AppMethodBeat.o(93369);
    }
    while (true)
    {
      return paramBitmap;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      a(paramBitmap, Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      paramBitmap = localByteArrayOutputStream.toByteArray();
      try
      {
        localByteArrayOutputStream.close();
        AppMethodBeat.o(93369);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
      }
    }
  }

  public static Bitmap ak(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93382);
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.setSaturation(0.0F);
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    am(localBitmap);
    paramBitmap = c.ag(localBitmap);
    AppMethodBeat.o(93382);
    return paramBitmap;
  }

  public static Bitmap al(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93383);
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.set(new float[] { 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F });
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    am(localBitmap);
    paramBitmap = c.ag(localBitmap);
    AppMethodBeat.o(93383);
    return paramBitmap;
  }

  private static void am(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93386);
    if (paramBitmap != null)
      paramBitmap.setDensity(ah.getContext().getResources().getDisplayMetrics().densityDpi);
    while (true)
    {
      try
      {
        paramBitmap = Bitmap.class.getDeclaredMethod("setDefaultDensity", new Class[] { Integer.TYPE });
        paramBitmap.setAccessible(true);
        paramBitmap.invoke(null, new Object[] { Integer.valueOf(ah.getContext().getResources().getDisplayMetrics().densityDpi) });
        AppMethodBeat.o(93386);
        return;
      }
      catch (Exception paramBitmap)
      {
        ab.e("MicroMsg.BitmapUtil", "Exception:%s", new Object[] { paramBitmap });
      }
      AppMethodBeat.o(93386);
    }
  }

  public static BitmapFactory.Options amj(String paramString)
  {
    AppMethodBeat.i(93318);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.BitmapUtil", "getImageOptions invalid path");
      paramString = null;
      AppMethodBeat.o(93318);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = e.openRead(paramString);
        paramString = H(paramString);
        AppMethodBeat.o(93318);
      }
      catch (FileNotFoundException paramString)
      {
        ab.printErrStackTrace("MicroMsg.BitmapUtil", paramString, "Decode bitmap failed.", new Object[0]);
        paramString = new BitmapFactory.Options();
        AppMethodBeat.o(93318);
      }
    }
  }

  public static Point amk(String paramString)
  {
    AppMethodBeat.i(93323);
    paramString = amj(paramString);
    if (paramString != null)
    {
      paramString = new Point(paramString.outWidth, paramString.outHeight);
      AppMethodBeat.o(93323);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(93323);
    }
  }

  public static Bitmap aml(String paramString)
  {
    AppMethodBeat.i(93333);
    paramString = a(paramString, 0, 0, 0.0F);
    AppMethodBeat.o(93333);
    return paramString;
  }

  public static DisplayMetrics anS()
  {
    AppMethodBeat.i(93349);
    if (ghw == null)
      ghw = ah.getContext().getResources().getDisplayMetrics();
    DisplayMetrics localDisplayMetrics = ghw;
    AppMethodBeat.o(93349);
    return localDisplayMetrics;
  }

  public static Bitmap ao(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93330);
    Bitmap localBitmap = d(paramString, paramInt1, paramInt2, false);
    if (localBitmap == null)
    {
      paramString = null;
      AppMethodBeat.o(93330);
    }
    while (true)
    {
      return paramString;
      paramInt1 = Exif.fromFile(paramString).getOrientationInDegree();
      ab.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(paramInt1) });
      paramString = b(localBitmap, paramInt1);
      AppMethodBeat.o(93330);
    }
  }

  public static Bitmap ap(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93338);
    paramString = a(paramString, paramInt1, paramInt2, 0.0F);
    AppMethodBeat.o(93338);
    return paramString;
  }

  public static Bitmap aq(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93356);
    paramString = a(0, paramString, null, null, true, 0.0F, paramInt1, paramInt2);
    AppMethodBeat.o(93356);
    return paramString;
  }

  public static Bitmap au(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93319);
    try
    {
      Bitmap localBitmap = createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>(localBitmap);
      localCanvas.drawColor(paramInt1);
      localBitmap = c.ag(localBitmap);
      AppMethodBeat.o(93319);
      return localBitmap;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(93319);
      }
    }
  }

  public static int av(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93322);
    int i = 1;
    if ((paramInt1 > 144) || (paramInt2 > paramInt3))
    {
      if (paramInt2 > paramInt1);
      for (int j = Math.round(paramInt1 / 144.0F + 0.5F); ; j = Math.round(paramInt2 / paramInt3 + 0.5F))
      {
        float f1 = paramInt2 * paramInt1;
        float f2 = paramInt3 * 144 * 2;
        while (true)
        {
          i = j;
          if (f1 / (j * j) <= f2)
            break;
          j++;
        }
      }
    }
    AppMethodBeat.o(93322);
    return i;
  }

  public static Bitmap aw(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93336);
    Bitmap localBitmap = a(paramInt1, null, null, null, false, 0.0F, paramInt2, paramInt3);
    AppMethodBeat.o(93336);
    return localBitmap;
  }

  private static Bitmap b(int paramInt1, String paramString, byte[] paramArrayOfByte, Uri paramUri, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93351);
    int i = 0;
    int j = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0));
    for (int k = 1; (paramInt2 < 0) || (paramInt3 < 0); k = 0)
    {
      paramString = null;
      AppMethodBeat.o(93351);
      return paramString;
    }
    int m = i;
    while (true)
    {
      int i1;
      try
      {
        BitmapFactory.Options localOptions1 = new android/graphics/BitmapFactory$Options;
        m = i;
        localOptions1.<init>();
        if (paramFloat != 0.0F)
        {
          m = i;
          localOptions1.inDensity = ((int)(160.0F * paramFloat));
        }
        Object localObject = localOptions1;
        m = j;
        if (k == 0)
        {
          m = i;
          localOptions1.inJustDecodeBounds = true;
          m = i;
          a(localOptions1, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1);
          m = i;
          int n = localOptions1.outWidth;
          m = i;
          i1 = localOptions1.outHeight;
          m = i;
          localOptions1 = new android/graphics/BitmapFactory$Options;
          m = i;
          localOptions1.<init>();
          m = i;
          localOptions1.inPreferredConfig = Bitmap.Config.ARGB_8888;
          if (((paramInt2 <= paramInt3) || (n >= i1)) && ((paramInt2 >= paramInt3) || (n <= i1)))
            break label438;
          i2 = n;
          n = i1;
          if (n <= paramInt2)
          {
            localObject = localOptions1;
            m = j;
            if (i2 <= paramInt3);
          }
          else
          {
            m = i;
            localOptions1.inSampleSize = ((int)Math.max(n / paramInt2, i2 / paramInt3));
            m = i;
            paramInt2 = localOptions1.inSampleSize;
            m = paramInt2;
            localObject = localOptions1;
          }
        }
        localObject = a((BitmapFactory.Options)localObject, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1);
        paramString = (String)localObject;
        am(paramString);
        paramString = c.ag(paramString);
        AppMethodBeat.o(93351);
        break;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.BitmapUtil", localThrowable, "", new Object[0]);
        BitmapFactory.Options localOptions2 = new android/graphics/BitmapFactory$Options;
        localOptions2.<init>();
        if (paramFloat != 0.0F)
          localOptions2.inDensity = ((int)(160.0F * paramFloat));
        localOptions2.inPreferredConfig = Bitmap.Config.RGB_565;
        if ((k == 0) && (m != 0))
          localOptions2.inSampleSize = m;
        try
        {
          paramString = a(localOptions2, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1);
        }
        catch (Throwable paramString)
        {
          ab.printErrStackTrace("MicroMsg.BitmapUtil", paramString, "", new Object[0]);
          paramString = null;
        }
        continue;
      }
      finally
      {
        am(null);
        AppMethodBeat.o(93351);
      }
      label438: int i2 = i1;
    }
  }

  // ERROR //
  public static Bitmap b(Bitmap paramBitmap, float paramFloat)
  {
    // Byte code:
    //   0: ldc_w 821
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: fload_1
    //   7: ldc_w 822
    //   10: frem
    //   11: fconst_0
    //   12: fcmpl
    //   13: ifne +11 -> 24
    //   16: ldc_w 821
    //   19: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload_0
    //   23: areturn
    //   24: new 153	android/graphics/Matrix
    //   27: dup
    //   28: invokespecial 154	android/graphics/Matrix:<init>	()V
    //   31: astore_2
    //   32: aload_2
    //   33: invokevirtual 157	android/graphics/Matrix:reset	()V
    //   36: aload_2
    //   37: fload_1
    //   38: aload_0
    //   39: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   42: iconst_2
    //   43: idiv
    //   44: i2f
    //   45: aload_0
    //   46: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   49: iconst_2
    //   50: idiv
    //   51: i2f
    //   52: invokevirtual 658	android/graphics/Matrix:setRotate	(FFF)V
    //   55: aload_0
    //   56: iconst_0
    //   57: iconst_0
    //   58: aload_0
    //   59: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   62: aload_0
    //   63: invokevirtual 128	android/graphics/Bitmap:getHeight	()I
    //   66: aload_2
    //   67: iconst_1
    //   68: invokestatic 165	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   71: astore_3
    //   72: aload_3
    //   73: invokestatic 169	com/tencent/mm/sdk/platformtools/d:am	(Landroid/graphics/Bitmap;)V
    //   76: new 171	java/lang/StringBuilder
    //   79: dup
    //   80: ldc 173
    //   82: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: astore_2
    //   86: aload_3
    //   87: ifnonnull +98 -> 185
    //   90: iconst_1
    //   91: istore 4
    //   93: ldc 36
    //   95: aload_2
    //   96: iload 4
    //   98: invokevirtual 180	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   101: ldc_w 824
    //   104: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: fload_1
    //   108: invokevirtual 827	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   111: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload_0
    //   118: aload_3
    //   119: if_acmpeq +23 -> 142
    //   122: ldc 36
    //   124: ldc_w 829
    //   127: iconst_1
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_0
    //   134: aastore
    //   135: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_0
    //   139: invokevirtual 63	android/graphics/Bitmap:recycle	()V
    //   142: aload_3
    //   143: invokestatic 199	com/tencent/mm/sdk/platformtools/c:ag	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   146: astore_0
    //   147: ldc_w 821
    //   150: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -131 -> 22
    //   156: astore_2
    //   157: ldc 36
    //   159: ldc_w 831
    //   162: iconst_1
    //   163: anewarray 4	java/lang/Object
    //   166: dup
    //   167: iconst_0
    //   168: aload_2
    //   169: invokestatic 835	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   172: aastore
    //   173: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: ldc_w 821
    //   179: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -160 -> 22
    //   185: iconst_0
    //   186: istore 4
    //   188: goto -95 -> 93
    //   191: astore_0
    //   192: aload_0
    //   193: astore_2
    //   194: aload_3
    //   195: astore_0
    //   196: goto -39 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   55	72	156	java/lang/Throwable
    //   72	76	191	java/lang/Throwable
  }

  public static Bitmap b(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(93363);
    if (paramBitmap == null)
    {
      AppMethodBeat.o(93363);
      paramBitmap = null;
    }
    while (true)
    {
      return paramBitmap;
      am(paramBitmap);
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      float f1 = Math.max(paramInt1 / i, paramInt2 / j);
      float f2 = i * f1;
      f1 = j * f1;
      float f3 = (paramInt1 - f2) / 2.0F;
      float f4 = (paramInt2 - f1) / 2.0F;
      RectF localRectF = new RectF(f3, f4, f2 + f3, f1 + f4);
      Bitmap.Config localConfig = paramBitmap.getConfig();
      Object localObject = localConfig;
      if (localConfig == null)
      {
        ab.w("MicroMsg.BitmapUtil", "get center crop bitmap, config is null");
        localObject = Bitmap.Config.ARGB_8888;
      }
      try
      {
        localObject = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
        new Canvas((Bitmap)localObject).drawBitmap(paramBitmap, null, localRectF, null);
        if (paramBoolean)
        {
          ab.i("MicroMsg.BitmapUtil", "getCenterCropBitmap bitmap recycle %s", new Object[] { paramBitmap });
          paramBitmap.recycle();
        }
        am((Bitmap)localObject);
        paramBitmap = c.ag((Bitmap)localObject);
        AppMethodBeat.o(93363);
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
        }
        catch (Throwable localThrowable2)
        {
          ab.e("MicroMsg.BitmapUtil", "BitmapUtil decode getCenterCropBitmap fail");
          AppMethodBeat.o(93363);
        }
      }
    }
  }

  private static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(93324);
    boolean bool = a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, false, new PInt(), new PInt());
    AppMethodBeat.o(93324);
    return bool;
  }

  public static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(93331);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.BitmapUtil", "file path is null.");
      AppMethodBeat.o(93331);
    }
    while (true)
    {
      return bool;
      if (!e.ct(paramString1))
      {
        ab.w("MicroMsg.BitmapUtil", "file did not exists.");
        AppMethodBeat.o(93331);
      }
      else
      {
        int i = Exif.fromFile(paramString1).getOrientationInDegree();
        ab.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(i) });
        if ((i == 90) || (i == 270));
        for (paramString1 = b(d(paramString1, paramInt2, paramInt1, true), i); ; paramString1 = b(d(paramString1, paramInt1, paramInt2, true), i))
        {
          if (paramString1 != null)
            break label145;
          AppMethodBeat.o(93331);
          break;
        }
        try
        {
          label145: paramPInt1.value = paramString1.getWidth();
          paramPInt2.value = paramString1.getHeight();
          a(paramString1, 80, paramCompressFormat, paramString2, true);
          AppMethodBeat.o(93331);
          bool = true;
        }
        catch (IOException paramString1)
        {
          ab.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: ".concat(String.valueOf(paramString2)));
          AppMethodBeat.o(93331);
        }
      }
    }
  }

  public static Bitmap bQ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93344);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, 0, 0);
    AppMethodBeat.o(93344);
    return paramArrayOfByte;
  }

  public static String bR(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93384);
    int i = 0;
    int j;
    if (i < paramArrayOfByte.length - 1)
    {
      if ((paramArrayOfByte[i] & 0xFF) != 255)
        break label161;
      j = paramArrayOfByte[(i + 1)];
      if (((j & 0xFF) < 192) || ((j & 0xFF) > 207))
        break label161;
      ab.d("MicroMsg.BitmapUtil", "match 0xff-" + Integer.toHexString(j & 0xFF) + "  at:" + i);
      if (i + 1 + 17 >= paramArrayOfByte.length)
        ab.d("MicroMsg.BitmapUtil", "not engouht len at ".concat(String.valueOf(i)));
    }
    else
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(93384);
    }
    while (true)
    {
      label130: return paramArrayOfByte;
      j = i + 2;
      if (paramArrayOfByte[(j + 7)] != 3)
        ab.d("MicroMsg.BitmapUtil", "num != 3 at ".concat(String.valueOf(i)));
      label161: int k;
      int m;
      label225: int i1;
      do
      {
        int n;
        int i2;
        do
        {
          do
          {
            while (true)
            {
              i++;
              break;
              k = paramArrayOfByte[(j + 8)];
              m = paramArrayOfByte[(j + 11)];
              n = paramArrayOfByte[(j + 14)];
              if ((k == 1) || (m == 2) || (n == 3))
                break label225;
              ab.d("MicroMsg.BitmapUtil", "Y/Cb/Cr Tag is not right at ".concat(String.valueOf(i)));
            }
            k = paramArrayOfByte[(j + 9)];
            i1 = paramArrayOfByte[(j + 12)];
            m = paramArrayOfByte[(j + 15)];
          }
          while ((k == 0) || (i1 == 0) || (m == 0));
          if ((k == i1) && (k == m))
          {
            paramArrayOfByte = "YUV444";
            AppMethodBeat.o(93384);
            break label130;
          }
          j = (k & 0xFF) >> 4 & 0xF;
          k &= 15;
          n = (i1 & 0xFF) >> 4 & 0xF;
          i1 &= 15;
          i2 = (m & 0xFF) >> 4 & 0xF;
          m &= 15;
        }
        while ((n == 0) || (i2 == 0) || (i1 == 0) || (m == 0) || (j / n != 2) || (j / i2 != 2));
        if ((k / i1 == 2) && (k / m == 2))
        {
          paramArrayOfByte = "YUV420";
          AppMethodBeat.o(93384);
          break label130;
        }
      }
      while ((k != i1) || (k != m));
      paramArrayOfByte = "YUV422";
      AppMethodBeat.o(93384);
    }
  }

  public static Bitmap c(Bitmap paramBitmap, float paramFloat)
  {
    AppMethodBeat.i(93381);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawARGB(0, 0, 0, 0);
    Paint localPaint = new Paint();
    localPaint.setAlpha((int)(255.0F * paramFloat));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    am(localBitmap);
    paramBitmap = c.ag(localBitmap);
    AppMethodBeat.o(93381);
    return paramBitmap;
  }

  public static void c(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(93370);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    try
    {
      paramString = MMBitmapFactory.decodeStream(e.openRead(paramString), null, localOptions);
      if (paramString != null)
      {
        ab.i("MicroMsg.BitmapUtil", "getRent bitmap recycle %s", new Object[] { paramString });
        paramString.recycle();
      }
      paramPInt1.value = localOptions.outWidth;
      paramPInt2.value = localOptions.outHeight;
      AppMethodBeat.o(93370);
      return;
    }
    catch (FileNotFoundException paramString)
    {
      while (true)
        paramString = localObject;
    }
  }

  public static boolean c(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(93325);
    boolean bool = a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, true, new PInt(), new PInt());
    AppMethodBeat.o(93325);
    return bool;
  }

  public static byte[] c(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(93368);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      paramBitmap = new byte[0];
      AppMethodBeat.o(93368);
    }
    while (true)
    {
      return paramBitmap;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      a(paramBitmap, Bitmap.CompressFormat.JPEG, paramInt, localByteArrayOutputStream);
      paramBitmap = localByteArrayOutputStream.toByteArray();
      try
      {
        localByteArrayOutputStream.close();
        AppMethodBeat.o(93368);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
      }
    }
  }

  public static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(138535);
    paramConfig = createBitmap(paramInt1, paramInt2, paramConfig, false);
    AppMethodBeat.o(138535);
    return paramConfig;
  }

  private static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(93341);
    try
    {
      paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      am(paramConfig);
      paramConfig = c.ag(paramConfig);
      AppMethodBeat.o(93341);
      return paramConfig;
    }
    catch (Throwable paramConfig)
    {
      while (true)
        if (paramBoolean)
        {
          AppMethodBeat.o(93341);
          paramConfig = localObject1;
        }
        else
        {
          try
          {
            paramConfig = anS();
            int i = paramInt1;
            int j = paramInt2;
            if (paramInt1 > paramConfig.widthPixels)
            {
              i = paramInt1;
              j = paramInt2;
              if (paramInt2 > paramConfig.heightPixels)
              {
                i = paramConfig.widthPixels;
                j = paramConfig.heightPixels;
              }
            }
            paramConfig = Bitmap.createBitmap(i, j, Bitmap.Config.RGB_565);
          }
          catch (Throwable paramConfig)
          {
            paramConfig = localObject2;
          }
        }
    }
  }

  public static Bitmap d(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(93375);
    ab.d("MicroMsg.BitmapUtil", "begin createChattingImage");
    long l1 = System.currentTimeMillis();
    if (paramBitmap == null)
    {
      ab.w("MicroMsg.BitmapUtil", "sourceBitmap is null .");
      paramBitmap = null;
      AppMethodBeat.o(93375);
    }
    while (true)
    {
      return paramBitmap;
      am(paramBitmap);
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      if ((i <= 0) || (j <= 0))
      {
        ab.w("MicroMsg.BitmapUtil", "sourceBitmap width or height is 0.");
        paramBitmap = null;
        AppMethodBeat.o(93375);
      }
      else
      {
        long l2 = System.currentTimeMillis();
        Bitmap localBitmap;
        Object localObject1;
        Object localObject2;
        try
        {
          localBitmap = createBitmap(i, j, Bitmap.Config.ARGB_8888, false);
          localObject1 = (NinePatchDrawable)ah.getContext().getResources().getDrawable(paramInt);
          ((NinePatchDrawable)localObject1).setBounds(0, 0, i, j);
          localObject2 = new android/graphics/Canvas;
          ((Canvas)localObject2).<init>(localBitmap);
          ((NinePatchDrawable)localObject1).draw((Canvas)localObject2);
          ab.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l2));
          if (localBitmap != null)
            break label218;
          ab.e("MicroMsg.BitmapUtil", "[createChattingImage] maskBitmap is null.");
          paramBitmap = null;
          AppMethodBeat.o(93375);
        }
        catch (Exception paramBitmap)
        {
          ab.e("MicroMsg.BitmapUtil", "[createChattingImage] create nine pathc bitmap faild.");
          paramBitmap = null;
          AppMethodBeat.o(93375);
        }
        continue;
        label218: paramInt = localBitmap.getWidth();
        int k = localBitmap.getHeight();
        if ((paramInt <= 0) || (k <= 0))
        {
          ab.w("MicroMsg.BitmapUtil", "maskBitmap width or height is 0.");
          paramBitmap = null;
          AppMethodBeat.o(93375);
        }
        else if ((k != j) || (paramInt != i))
        {
          ab.e("MicroMsg.BitmapUtil", "maskHeiht maskWidth != height width.");
          paramBitmap = null;
          AppMethodBeat.o(93375);
        }
        else
        {
          localObject1 = new int[i * j];
          localObject2 = new int[paramInt * k];
          paramBitmap.getPixels((int[])localObject1, 0, i, 0, 0, i, j);
          localBitmap.getPixels((int[])localObject2, 0, i, 0, 0, i, j);
          l2 = System.currentTimeMillis();
          paramInt = 0;
          try
          {
            if (paramInt < localObject2.length)
            {
              if (localObject2[paramInt] != -16777216)
              {
                if (localObject2[paramInt] != 0)
                  break label381;
                localObject1[paramInt] = 0;
              }
              while (true)
              {
                paramInt++;
                break;
                label381: if (localObject2[paramInt] != -1)
                  localObject1[paramInt] &= localObject2[paramInt];
              }
            }
          }
          catch (Exception paramBitmap)
          {
            ab.e("MicroMsg.BitmapUtil", paramBitmap.toString());
            ab.d("MicroMsg.BitmapUtil", "meger pixels  " + (System.currentTimeMillis() - l2));
            l2 = System.currentTimeMillis();
            localBitmap.setPixels((int[])localObject1, 0, i, 0, 0, i, j);
            ab.d("MicroMsg.BitmapUtil", "setPixels " + (System.currentTimeMillis() - l2));
            ab.d("MicroMsg.BitmapUtil", "createTime" + (System.currentTimeMillis() - l1));
            am(localBitmap);
            paramBitmap = c.ag(localBitmap);
            AppMethodBeat.o(93375);
          }
        }
      }
    }
  }

  // ERROR //
  public static Bitmap d(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 959
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 381	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifeq +21 -> 31
    //   13: ldc 36
    //   15: ldc_w 961
    //   18: invokestatic 44	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc_w 959
    //   24: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aconst_null
    //   28: astore_0
    //   29: aload_0
    //   30: areturn
    //   31: aload_0
    //   32: invokestatic 779	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   35: astore 4
    //   37: aload_0
    //   38: invokestatic 428	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   41: astore_0
    //   42: aload_0
    //   43: aload 4
    //   45: getfield 262	android/graphics/BitmapFactory$Options:outWidth	I
    //   48: aload 4
    //   50: getfield 259	android/graphics/BitmapFactory$Options:outHeight	I
    //   53: iload_2
    //   54: iload_1
    //   55: iload_3
    //   56: invokestatic 963	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;IIIIZ)Landroid/graphics/Bitmap;
    //   59: astore 4
    //   61: aload_0
    //   62: ifnull +7 -> 69
    //   65: aload_0
    //   66: invokevirtual 68	java/io/InputStream:close	()V
    //   69: ldc_w 959
    //   72: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: aload 4
    //   77: astore_0
    //   78: goto -49 -> 29
    //   81: astore 4
    //   83: aconst_null
    //   84: astore_0
    //   85: ldc 36
    //   87: aload 4
    //   89: ldc_w 965
    //   92: iconst_0
    //   93: anewarray 4	java/lang/Object
    //   96: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_0
    //   100: ifnull +7 -> 107
    //   103: aload_0
    //   104: invokevirtual 68	java/io/InputStream:close	()V
    //   107: ldc_w 959
    //   110: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aconst_null
    //   114: astore_0
    //   115: goto -86 -> 29
    //   118: astore 4
    //   120: aconst_null
    //   121: astore_0
    //   122: aload_0
    //   123: ifnull +7 -> 130
    //   126: aload_0
    //   127: invokevirtual 68	java/io/InputStream:close	()V
    //   130: ldc_w 959
    //   133: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload 4
    //   138: athrow
    //   139: astore_0
    //   140: goto -71 -> 69
    //   143: astore_0
    //   144: goto -37 -> 107
    //   147: astore_0
    //   148: goto -18 -> 130
    //   151: astore 4
    //   153: goto -31 -> 122
    //   156: astore 4
    //   158: goto -36 -> 122
    //   161: astore 4
    //   163: goto -78 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   31	42	81	java/io/FileNotFoundException
    //   31	42	118	finally
    //   65	69	139	java/io/IOException
    //   103	107	143	java/io/IOException
    //   126	130	147	java/io/IOException
    //   42	61	151	finally
    //   85	99	156	finally
    //   42	61	161	java/io/FileNotFoundException
  }

  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(93343);
    if (bo.cb(paramArrayOfByte))
    {
      ab.w("MicroMsg.BitmapUtil", "error input: data is null");
      AppMethodBeat.o(93343);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      if ((paramInt1 < 0) || (paramInt2 < 0))
      {
        ab.w("MicroMsg.BitmapUtil", "error input: targetWidth %d, targetHeight %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(93343);
        paramArrayOfByte = localObject;
      }
      else
      {
        paramArrayOfByte = a(0, null, paramArrayOfByte, null, false, 0.0F, paramInt1, paramInt2);
        AppMethodBeat.o(93343);
      }
    }
  }

  // ERROR //
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 975
    //   5: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: astore_3
    //   10: aload_1
    //   11: ifnonnull +11 -> 22
    //   14: new 29	android/graphics/BitmapFactory$Options
    //   17: dup
    //   18: invokespecial 30	android/graphics/BitmapFactory$Options:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: invokestatic 428	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   26: astore 4
    //   28: aload 4
    //   30: astore_1
    //   31: aload 4
    //   33: aconst_null
    //   34: aload_3
    //   35: invokestatic 53	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   38: astore_3
    //   39: aload_3
    //   40: astore_0
    //   41: aload 4
    //   43: ifnull +8 -> 51
    //   46: aload 4
    //   48: invokevirtual 68	java/io/InputStream:close	()V
    //   51: ldc_w 975
    //   54: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: aload_0
    //   58: areturn
    //   59: astore_3
    //   60: aconst_null
    //   61: astore 4
    //   63: aload 4
    //   65: astore_1
    //   66: ldc 36
    //   68: ldc_w 977
    //   71: iconst_2
    //   72: anewarray 4	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_0
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload_3
    //   82: invokevirtual 978	java/io/IOException:getMessage	()Ljava/lang/String;
    //   85: aastore
    //   86: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: aload 4
    //   91: ifnull +8 -> 99
    //   94: aload 4
    //   96: invokevirtual 68	java/io/InputStream:close	()V
    //   99: ldc_w 975
    //   102: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: aload_2
    //   106: astore_0
    //   107: goto -50 -> 57
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: ifnull +7 -> 121
    //   117: aload_1
    //   118: invokevirtual 68	java/io/InputStream:close	()V
    //   121: ldc_w 975
    //   124: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_0
    //   128: athrow
    //   129: astore_1
    //   130: goto -79 -> 51
    //   133: astore_0
    //   134: goto -35 -> 99
    //   137: astore_1
    //   138: goto -17 -> 121
    //   141: astore_0
    //   142: goto -29 -> 113
    //   145: astore_3
    //   146: goto -83 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	59	java/io/IOException
    //   22	28	110	finally
    //   46	51	129	java/io/IOException
    //   94	99	133	java/io/IOException
    //   117	121	137	java/io/IOException
    //   31	39	141	finally
    //   66	89	141	finally
    //   31	39	145	java/io/IOException
  }

  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    AppMethodBeat.i(93348);
    paramInputStream = a(paramInputStream, 0.0F, 0, 0);
    AppMethodBeat.o(93348);
    return paramInputStream;
  }

  public static void dnX()
  {
  }

  public static Bitmap e(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(93380);
    if (paramBitmap == null)
    {
      ab.w("MicroMsg.BitmapUtil", "fastblur: but sentBitmap is null");
      paramBitmap = null;
      AppMethodBeat.o(93380);
    }
    while (true)
    {
      return paramBitmap;
      Bitmap localBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
      if (paramInt <= 0)
      {
        paramBitmap = null;
        AppMethodBeat.o(93380);
      }
      else
      {
        int i = localBitmap.getWidth();
        int j = localBitmap.getHeight();
        int[] arrayOfInt1 = new int[i * j];
        ab.e("pix", i + " " + j + " " + arrayOfInt1.length);
        localBitmap.getPixels(arrayOfInt1, 0, i, 0, 0, i, j);
        int k = i - 1;
        int m = j - 1;
        int n = i * j;
        int i1 = paramInt + paramInt + 1;
        int[] arrayOfInt2 = new int[n];
        int[] arrayOfInt3 = new int[n];
        paramBitmap = new int[n];
        int[] arrayOfInt4 = new int[Math.max(i, j)];
        int i2 = i1 + 1 >> 1;
        int i3 = i2 * i2;
        int[] arrayOfInt5 = new int[i3 * 256];
        for (i2 = 0; i2 < i3 * 256; i2++)
          arrayOfInt5[i2] = (i2 / i3);
        int[][] arrayOfInt = new int[i1][3];
        int i4 = paramInt + 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] arrayOfInt6;
        int i17;
        int i18;
        int i19;
        while (i5 < j)
        {
          i8 = -paramInt;
          i9 = 0;
          i10 = 0;
          i11 = 0;
          i12 = 0;
          i13 = 0;
          i14 = 0;
          i2 = 0;
          i3 = 0;
          i15 = 0;
          if (i8 <= paramInt)
          {
            i16 = arrayOfInt1[(Math.min(k, Math.max(i8, 0)) + i7)];
            arrayOfInt6 = arrayOfInt[(i8 + paramInt)];
            arrayOfInt6[0] = ((0xFF0000 & i16) >> 16);
            arrayOfInt6[1] = ((0xFF00 & i16) >> 8);
            arrayOfInt6[2] = (i16 & 0xFF);
            i16 = i4 - Math.abs(i8);
            i15 += arrayOfInt6[0] * i16;
            i2 += arrayOfInt6[1] * i16;
            i3 += i16 * arrayOfInt6[2];
            if (i8 > 0)
            {
              i9 += arrayOfInt6[0];
              i10 += arrayOfInt6[1];
              i11 += arrayOfInt6[2];
            }
            while (true)
            {
              i8++;
              break;
              i12 += arrayOfInt6[0];
              i13 += arrayOfInt6[1];
              i14 += arrayOfInt6[2];
            }
          }
          i17 = 0;
          i16 = i9;
          i8 = i10;
          i9 = i11;
          i18 = i12;
          i19 = i13;
          i11 = paramInt;
          i12 = i15;
          i15 = i3;
          i10 = i2;
          i13 = i14;
          i2 = i19;
          i3 = i18;
          i14 = i17;
          while (i14 < i)
          {
            arrayOfInt2[i7] = arrayOfInt5[i12];
            arrayOfInt3[i7] = arrayOfInt5[i10];
            paramBitmap[i7] = arrayOfInt5[i15];
            arrayOfInt6 = arrayOfInt[((i11 - paramInt + i1) % i1)];
            i19 = arrayOfInt6[0];
            i18 = arrayOfInt6[1];
            int i20 = arrayOfInt6[2];
            if (i5 == 0)
              arrayOfInt4[i14] = Math.min(i14 + paramInt + 1, k);
            i17 = arrayOfInt1[(arrayOfInt4[i14] + i6)];
            arrayOfInt6[0] = ((0xFF0000 & i17) >> 16);
            arrayOfInt6[1] = ((0xFF00 & i17) >> 8);
            arrayOfInt6[2] = (i17 & 0xFF);
            i16 += arrayOfInt6[0];
            i8 += arrayOfInt6[1];
            i9 = arrayOfInt6[2] + i9;
            i12 = i12 - i3 + i16;
            i10 = i10 - i2 + i8;
            i15 = i15 - i13 + i9;
            i11 = (i11 + 1) % i1;
            arrayOfInt6 = arrayOfInt[(i11 % i1)];
            int i21 = arrayOfInt6[0];
            i17 = arrayOfInt6[1];
            i13 = i13 - i20 + arrayOfInt6[2];
            int i22 = arrayOfInt6[0];
            int i23 = arrayOfInt6[1];
            i20 = arrayOfInt6[2];
            i7++;
            i14++;
            i16 -= i22;
            i8 -= i23;
            i9 -= i20;
            i3 = i3 - i19 + i21;
            i2 = i2 - i18 + i17;
          }
          i5++;
          i6 += i;
        }
        for (i2 = 0; i2 < i; i2++)
        {
          i7 = -paramInt * i;
          i5 = -paramInt;
          i6 = 0;
          i14 = 0;
          i3 = 0;
          i15 = 0;
          i11 = 0;
          i13 = 0;
          i10 = 0;
          i12 = 0;
          i9 = 0;
          if (i5 <= paramInt)
          {
            i16 = Math.max(0, i7) + i2;
            arrayOfInt6 = arrayOfInt[(i5 + paramInt)];
            arrayOfInt6[0] = arrayOfInt2[i16];
            arrayOfInt6[1] = arrayOfInt3[i16];
            arrayOfInt6[2] = paramBitmap[i16];
            i8 = i4 - Math.abs(i5);
            i9 += arrayOfInt2[i16] * i8;
            i10 += arrayOfInt3[i16] * i8;
            i8 = i12 + paramBitmap[i16] * i8;
            if (i5 > 0)
            {
              i6 += arrayOfInt6[0];
              i14 += arrayOfInt6[1];
              i3 += arrayOfInt6[2];
            }
            while (true)
            {
              i12 = i7;
              if (i5 < m)
                i12 = i7 + i;
              i5++;
              i7 = i12;
              i12 = i8;
              break;
              i15 += arrayOfInt6[0];
              i11 += arrayOfInt6[1];
              i13 += arrayOfInt6[2];
            }
          }
          i16 = 0;
          i8 = i6;
          i6 = i2;
          i5 = paramInt;
          i7 = i9;
          i9 = i6;
          i6 = i16;
          while (i6 < j)
          {
            arrayOfInt1[i9] = (0xFF000000 & arrayOfInt1[i9] | arrayOfInt5[i7] << 16 | arrayOfInt5[i10] << 8 | arrayOfInt5[i12]);
            arrayOfInt6 = arrayOfInt[((i5 - paramInt + i1) % i1)];
            i19 = arrayOfInt6[0];
            i18 = arrayOfInt6[1];
            i16 = arrayOfInt6[2];
            if (i2 == 0)
              arrayOfInt4[i6] = (Math.min(i6 + i4, m) * i);
            i17 = arrayOfInt4[i6] + i2;
            arrayOfInt6[0] = arrayOfInt2[i17];
            arrayOfInt6[1] = arrayOfInt3[i17];
            arrayOfInt6[2] = paramBitmap[i17];
            i8 += arrayOfInt6[0];
            i14 += arrayOfInt6[1];
            i3 += arrayOfInt6[2];
            i7 = i7 - i15 + i8;
            i10 = i10 - i11 + i14;
            i12 = i12 - i13 + i3;
            i5 = (i5 + 1) % i1;
            arrayOfInt6 = arrayOfInt[i5];
            i15 = i15 - i19 + arrayOfInt6[0];
            i11 = i11 - i18 + arrayOfInt6[1];
            i13 = i13 - i16 + arrayOfInt6[2];
            i8 -= arrayOfInt6[0];
            i16 = arrayOfInt6[1];
            i3 -= arrayOfInt6[2];
            i9 += i;
            i6++;
            i14 -= i16;
          }
        }
        ab.e("pix", i + " " + j + " " + n);
        localBitmap.setPixels(arrayOfInt1, 0, i, 0, 0, i, j);
        am(localBitmap);
        paramBitmap = c.ag(localBitmap);
        AppMethodBeat.o(93380);
      }
    }
  }

  public static Bitmap eA(View paramView)
  {
    AppMethodBeat.i(93371);
    if (paramView == null)
    {
      paramView = null;
      AppMethodBeat.o(93371);
    }
    while (true)
    {
      return paramView;
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Drawable localDrawable = paramView.getBackground();
      if (localDrawable != null)
        localDrawable.draw(localCanvas);
      paramView.draw(localCanvas);
      am(localBitmap);
      paramView = c.ag(localBitmap);
      AppMethodBeat.o(93371);
    }
  }

  public static Bitmap eB(View paramView)
  {
    AppMethodBeat.i(93372);
    if (paramView == null)
    {
      paramView = null;
      AppMethodBeat.o(93372);
    }
    while (true)
    {
      return paramView;
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Drawable localDrawable = paramView.getBackground();
      if (localDrawable != null)
        localDrawable.draw(localCanvas);
      a(localCanvas, paramView);
      am(localBitmap);
      paramView = c.ag(localBitmap);
      AppMethodBeat.o(93372);
    }
  }

  public static Bitmap gU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93376);
    Object localObject;
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      ab.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      localObject = null;
      AppMethodBeat.o(93376);
    }
    while (true)
    {
      return localObject;
      long l = System.currentTimeMillis();
      Bitmap localBitmap = c.ag(createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888, false));
      am(localBitmap);
      localObject = (NinePatchDrawable)ah.getContext().getResources().getDrawable(2130839180);
      ((NinePatchDrawable)localObject).setBounds(0, 0, paramInt1, paramInt2);
      ((NinePatchDrawable)localObject).draw(new Canvas(localBitmap));
      ab.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
      localObject = d(localBitmap, 2130839489);
      AppMethodBeat.o(93376);
    }
  }

  public static Bitmap j(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93337);
    paramString = a(paramString, 0, 0, paramFloat);
    AppMethodBeat.o(93337);
    return paramString;
  }

  public static Bitmap o(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(93335);
    Bitmap localBitmap = a(paramInt, null, null, null, false, paramFloat, 0, 0);
    AppMethodBeat.o(93335);
    return localBitmap;
  }

  public static Bitmap o(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(93377);
    if ((paramString == null) || (paramString.equals("")) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      ab.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      paramString = null;
      AppMethodBeat.o(93377);
    }
    while (true)
    {
      return paramString;
      Bitmap localBitmap = c.f(decodeByteArray(e.e(paramString, 0, -1), 0, 0), paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        paramString = null;
        AppMethodBeat.o(93377);
      }
      else
      {
        long l = System.currentTimeMillis();
        paramString = c.ag(createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false));
        am(paramString);
        Canvas localCanvas = new Canvas(paramString);
        ab.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(localBitmap.getWidth()), Integer.valueOf(localBitmap.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        localCanvas.drawBitmap(localBitmap, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
        ab.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
        paramString = d(paramString, paramInt1);
        AppMethodBeat.o(93377);
      }
    }
  }

  public static Bitmap u(Uri paramUri)
  {
    AppMethodBeat.i(93340);
    paramUri = a(0, null, null, paramUri, false, 0.0F, 0, 0);
    AppMethodBeat.o(93340);
    return paramUri;
  }

  public static Bitmap v(Drawable paramDrawable)
  {
    AppMethodBeat.i(93366);
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      AppMethodBeat.o(93366);
    }
    while (true)
    {
      return paramDrawable;
      Bitmap localBitmap = createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888, false);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      am(localBitmap);
      paramDrawable = c.ag(localBitmap);
      AppMethodBeat.o(93366);
    }
  }

  private static List<v> v(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93374);
    ArrayList localArrayList = new ArrayList();
    if ((paramView instanceof TextureView))
    {
      v localv = new v();
      localv.xyt = ((TextureView)paramView);
      localv.left = paramInt1;
      localv.top = paramInt2;
      localArrayList.add(localv);
    }
    while (true)
    {
      AppMethodBeat.o(93374);
      return localArrayList;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++)
          localArrayList.addAll(v(paramView.getChildAt(i), (int)(paramView.getX() + paramInt1), (int)(paramView.getY() + paramInt2)));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.d
 * JD-Core Version:    0.6.2
 */