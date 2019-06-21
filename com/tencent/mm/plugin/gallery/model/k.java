package com.tencent.mm.plugin.gallery.model;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

public final class k
{
  private static int fgJ;
  private static final int mOo;
  private static final int mOp;

  static
  {
    int i = 960;
    AppMethodBeat.i(21317);
    fgJ = 0;
    int[] arrayOfInt = new int[2];
    Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
    arrayOfInt[0] = localDisplay.getWidth();
    arrayOfInt[1] = localDisplay.getHeight();
    if (arrayOfInt[0] > 960);
    for (int j = arrayOfInt[0]; ; j = 960)
    {
      mOo = j;
      j = i;
      if (arrayOfInt[1] > 960)
        j = arrayOfInt[1];
      mOp = j;
      AppMethodBeat.o(21317);
      return;
    }
  }

  public static Bitmap NC(String paramString)
  {
    int i = 1;
    Object localObject1 = null;
    AppMethodBeat.i(21315);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.MediaManager", "filepath is null or nil");
      AppMethodBeat.o(21315);
      paramString = localObject1;
      return paramString;
    }
    while (true)
    {
      try
      {
        if (!com.tencent.mm.a.e.ct(paramString))
        {
          ab.e("MicroMsg.MediaManager", "getSuitableBmp fail, file does not exist, filePath = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(21315);
          paramString = localObject1;
          break;
        }
        int j = mOo;
        k = mOp;
        Object localObject2 = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)localObject2).<init>();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        Bitmap localBitmap = MMBitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject2);
        if (localBitmap != null)
        {
          ab.i("MicroMsg.MediaManager", "bitmap recycle %s", new Object[] { localBitmap.toString() });
          localBitmap.recycle();
        }
        if ((((BitmapFactory.Options)localObject2).outWidth <= 0) || (((BitmapFactory.Options)localObject2).outHeight <= 0))
        {
          ab.d("MicroMsg.MediaManager", "get bitmap fail, file is not a image file = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(21315);
          paramString = localObject1;
          break;
        }
        if ((ad.cJ(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) && (((BitmapFactory.Options)localObject2).outWidth > 480))
        {
          m = 1;
          if ((!ad.cI(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight)) || (((BitmapFactory.Options)localObject2).outHeight <= 480))
            continue;
          if (m == 0)
          {
            m = j;
            if (i == 0);
          }
          else
          {
            k = ((BitmapFactory.Options)localObject2).outHeight;
            m = ((BitmapFactory.Options)localObject2).outWidth;
          }
          j = BackwardSupportUtil.ExifHelper.bJ(paramString);
          if ((j != 90) && (j != 270))
            break label420;
          localObject2 = d.d(paramString, m, k, false);
          if (localObject2 != null)
            continue;
          ab.e("MicroMsg.MediaManager", "getSuitableBmp fail, temBmp is null, filePath = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(21315);
          paramString = localObject1;
          break;
        }
        m = 0;
        continue;
        i = 0;
        continue;
        float f = j;
        paramString = d.b((Bitmap)localObject2, f);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("bmp height = ");
        ab.i("MicroMsg.MediaManager", paramString.getHeight() + ",bmp width = " + paramString.getWidth());
        AppMethodBeat.o(21315);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.MediaManager", "decode bitmap err: " + paramString.getMessage());
        AppMethodBeat.o(21315);
        paramString = localObject1;
      }
      break;
      label420: i = k;
      int k = m;
      int m = i;
    }
  }

  public static Bitmap a(long paramLong, int paramInt, String paramString1, String paramString2)
  {
    Bitmap localBitmap1 = null;
    Bitmap localBitmap2 = null;
    AppMethodBeat.i(21311);
    if (e.bBZ() == null)
    {
      AppMethodBeat.o(21311);
      return localBitmap2;
    }
    switch (paramInt)
    {
    default:
      localBitmap2 = localBitmap1;
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(21311);
      break;
      localBitmap1 = g(paramString1, paramString2, paramLong);
      localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
      {
        ab.e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s], [%s]", new Object[] { paramString1, paramString2 });
        localBitmap2 = localBitmap1;
        continue;
        localBitmap1 = n(paramLong, paramString2);
        localBitmap2 = localBitmap1;
        if (localBitmap1 == null)
          localBitmap2 = g(paramString1, paramString2, paramLong);
      }
    }
  }

  private static int bCs()
  {
    AppMethodBeat.i(21312);
    int i;
    if (fgJ > 0)
    {
      i = fgJ;
      AppMethodBeat.o(21312);
    }
    while (true)
    {
      return i;
      i = BackwardSupportUtil.b.b(ah.getContext(), 150.0F);
      fgJ = i;
      AppMethodBeat.o(21312);
    }
  }

  private static Bitmap ew(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(21313);
    ab.d("MicroMsg.MediaManager", "current thread %s", new Object[] { Thread.currentThread().getName() });
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.MediaManager", "filePath is null or nill");
      paramString1 = null;
      AppMethodBeat.o(21313);
      return paramString1;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = d.d(paramString1, bCs(), bCs(), false);
    int j;
    label77: int k;
    if (localBitmap == null)
    {
      j = 0;
      if (localBitmap != null)
        break label262;
      k = 0;
      label85: ab.v("MicroMsg.MediaManager", "getImageThumb[%s]FromThumbFilePath, bmp size[%d, %d]: total time:[%dms]", new Object[] { paramString1, Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(System.currentTimeMillis() - l) });
      if (localBitmap != null)
        break label308;
      ab.w("MicroMsg.MediaManager", "get bitmap from thumb failed, try to get thumb from orig image:[%s]", new Object[] { paramString2 });
      if (bo.isNullOrNil(paramString2))
        break label292;
      l = System.currentTimeMillis();
      localBitmap = d.d(paramString2, bCs(), bCs(), false);
      if (localBitmap != null)
        break label272;
      j = 0;
      label179: if (localBitmap != null)
        break label282;
      k = i;
      label187: ab.v("MicroMsg.MediaManager", "getImageThumb[%s]FromOrigFilePath[%s], bmp size[%d, %d]:total time:[%dms]", new Object[] { paramString1, paramString2, Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(System.currentTimeMillis() - l) });
    }
    label262: label272: label282: label292: label308: for (paramString1 = localBitmap; ; paramString1 = localBitmap)
    {
      paramString1 = o(paramString2, paramString1);
      AppMethodBeat.o(21313);
      break;
      j = localBitmap.getWidth();
      break label77;
      k = localBitmap.getHeight();
      break label85;
      j = localBitmap.getWidth();
      break label179;
      k = localBitmap.getHeight();
      break label187;
      ab.e("MicroMsg.MediaManager", "get bit from orig image faield:[%s]", new Object[] { paramString2 });
    }
  }

  private static Bitmap g(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(138610);
    Bitmap localBitmap1 = ew(paramString1, paramString2);
    Bitmap localBitmap2 = localBitmap1;
    long l;
    if (localBitmap1 == null)
    {
      l = SystemClock.uptimeMillis();
      localBitmap2 = h(paramString1, paramString2, paramLong);
      if (localBitmap2 != null)
        break label84;
    }
    label84: for (boolean bool = true; ; bool = false)
    {
      ab.w("MicroMsg.MediaManager", "null == bitmap by getImageThumbFromFile! use media system decode bitmap is null?%s cost:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.uptimeMillis() - l) });
      AppMethodBeat.o(138610);
      return localBitmap2;
    }
  }

  private static Bitmap h(String paramString1, String paramString2, long paramLong)
  {
    Bitmap localBitmap1 = null;
    Bitmap localBitmap2 = null;
    AppMethodBeat.i(138611);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.MediaManager", "filePath is null or nill");
      AppMethodBeat.o(138611);
      paramString1 = localBitmap2;
    }
    while (true)
    {
      return paramString1;
      localBitmap2 = localBitmap1;
      try
      {
        long l = System.currentTimeMillis();
        localBitmap2 = localBitmap1;
        localBitmap1 = MediaStore.Images.Thumbnails.getThumbnail(ah.getContext().getContentResolver(), paramLong, 1, null);
        int i;
        if (localBitmap1 == null)
        {
          i = 0;
          label72: if (localBitmap1 != null)
            break label168;
        }
        for (int j = 0; ; j = localBitmap1.getHeight())
        {
          localBitmap2 = localBitmap1;
          ab.v("MicroMsg.MediaManager", "getImageThumb[%s]FromContentResolver type[%s], bmp size[%d, %d]: total time:[%dms]", new Object[] { paramString1, "MINI_KIND", Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l) });
          localBitmap2 = localBitmap1;
          paramString1 = o(paramString2, localBitmap2);
          AppMethodBeat.o(138611);
          break;
          localBitmap2 = localBitmap1;
          i = localBitmap1.getWidth();
          break label72;
          label168: localBitmap2 = localBitmap1;
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s]", new Object[] { paramString1.toString() });
          ab.printErrStackTrace("MicroMsg.MediaManager", paramString1, "", new Object[0]);
        }
      }
    }
  }

  @TargetApi(8)
  private static Bitmap n(long paramLong, String paramString)
  {
    AppMethodBeat.i(21316);
    try
    {
      Bitmap localBitmap1 = MediaStore.Video.Thumbnails.getThumbnail(ah.getContext().getContentResolver(), paramLong, 1, null);
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
      {
        ab.e("MicroMsg.MediaManager", "get vedio thumb failed : [%d], call media scanner : [%s]", new Object[] { Long.valueOf(paramLong), paramString });
        if (Build.VERSION.SDK_INT >= 8)
          localBitmap1 = ThumbnailUtils.createVideoThumbnail(paramString, 1);
        localBitmap2 = localBitmap1;
        if (localBitmap1 == null)
        {
          localBitmap2 = localBitmap1;
          if (!bo.isNullOrNil(paramString))
          {
            ab.e("MicroMsg.MediaManager", "get vedio thumb failed : [%d], call media scanner : [%s]", new Object[] { Long.valueOf(paramLong), paramString });
            ah.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://".concat(String.valueOf(paramString)))));
            localBitmap2 = localBitmap1;
          }
        }
      }
      AppMethodBeat.o(21316);
      return localBitmap2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaManager", "exception: %s", new Object[] { bo.l(localException) });
        Object localObject = null;
      }
    }
  }

  private static Bitmap o(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(21314);
    if (paramBitmap != null)
    {
      long l = System.currentTimeMillis();
      int i = BackwardSupportUtil.ExifHelper.bJ(paramString);
      paramString = d.b(paramBitmap, i);
      ab.d("MicroMsg.MediaManager", "do rotate finish, width[%d] height[%d] rotate[%d] use[%dms]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      if (paramString != null)
        AppMethodBeat.o(21314);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(21314);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.k
 * JD-Core Version:    0.6.2
 */