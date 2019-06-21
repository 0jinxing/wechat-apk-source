package com.tencent.mm.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ag
{
  public static Bitmap d(Bitmap paramBitmap, float paramFloat)
  {
    Canvas localCanvas = null;
    AppMethodBeat.i(112468);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ai.e("WeUIBitmapUtil", "getRoundedCornerBitmap in bitmap is null", new Object[0]);
      AppMethodBeat.o(112468);
      paramBitmap = localCanvas;
    }
    while (true)
    {
      return paramBitmap;
      Bitmap localBitmap = k(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
      if (localBitmap == null)
      {
        AppMethodBeat.o(112468);
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
        ai.i("WeUIBitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", new Object[] { paramBitmap });
        paramBitmap.recycle();
        AppMethodBeat.o(112468);
        paramBitmap = localBitmap;
      }
    }
  }

  private static Bitmap k(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(112469);
    Object localObject = null;
    try
    {
      paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      AppMethodBeat.o(112469);
      return paramConfig;
    }
    catch (Throwable paramConfig)
    {
      while (true)
        paramConfig = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ag
 * JD-Core Version:    0.6.2
 */