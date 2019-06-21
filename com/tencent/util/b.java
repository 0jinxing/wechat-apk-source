package com.tencent.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static final String[] AHV = { "orientation" };
  private static final float[] AHW = new float[32];
  private static final float[] Bn;
  private static final String[] azD = { "_data" };

  static
  {
    Bn = new float[16];
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, Matrix paramMatrix)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(86573);
    Canvas localCanvas = new Canvas();
    if (paramMatrix.isIdentity())
    {
      localObject1 = Bitmap.createBitmap(paramInt1, paramInt2, paramBitmap.getConfig());
      ((Bitmap)localObject1).setDensity(paramBitmap.getDensity());
      localCanvas.setBitmap((Bitmap)localObject1);
      localCanvas.drawBitmap(paramBitmap, new Rect(0, 0, paramInt1 + 0, paramInt2 + 0), new RectF(0.0F, 0.0F, paramInt1, paramInt2), (Paint)localObject2);
      AppMethodBeat.o(86573);
      paramBitmap = (Bitmap)localObject1;
    }
    while (true)
      while (true)
      {
        return paramBitmap;
        localObject2 = new RectF(0.0F, 0.0F, paramInt1, paramInt2);
        paramMatrix.mapRect((RectF)localObject2);
        try
        {
          Bitmap localBitmap = Bitmap.createBitmap(Math.round(((RectF)localObject2).width()), Math.round(((RectF)localObject2).height()), paramBitmap.getConfig());
          localCanvas.translate(-((RectF)localObject2).left, -((RectF)localObject2).top);
          localCanvas.concat(paramMatrix);
          Paint localPaint = new Paint(2);
          localObject2 = localPaint;
          localObject1 = localBitmap;
          if (paramMatrix.rectStaysRect())
            break;
          localPaint.setAntiAlias(true);
          localObject2 = localPaint;
          localObject1 = localBitmap;
        }
        catch (OutOfMemoryError paramBitmap)
        {
          AppMethodBeat.o(86573);
          paramBitmap = (Bitmap)localObject1;
        }
      }
  }

  public static Bitmap g(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(86574);
    long l = System.currentTimeMillis();
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    int m = 0;
    try
    {
      localObject = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      m = 1;
      if (m != 0);
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      while (true)
      {
        Bitmap localBitmap1;
        try
        {
          Bitmap localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
          Object localObject = localBitmap2;
          m = i;
          if ((m != 0) && (localObject != null))
            break label96;
          AppMethodBeat.o(86574);
          localObject = null;
          return localObject;
          localOutOfMemoryError1 = localOutOfMemoryError1;
          localBitmap1 = null;
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
        }
        continue;
        label96: Canvas localCanvas = new Canvas(localBitmap1);
        localCanvas.translate((paramInt1 - j) / 2, (paramInt2 - k) / 2);
        localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, new Paint(2));
        i.k("BitmapUtils", "crop bitmap - " + (System.currentTimeMillis() - l));
        AppMethodBeat.o(86574);
      }
    }
  }

  public static boolean recycle(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86575);
    boolean bool;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.recycle();
      bool = true;
      AppMethodBeat.o(86575);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86575);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.util.b
 * JD-Core Version:    0.6.2
 */