package com.google.android.gms.common.images.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ImageUtils
{
  public static Bitmap frameBitmapInCircle(Bitmap paramBitmap)
  {
    AppMethodBeat.i(61280);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(61280);
      return paramBitmap;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k;
    if (i >= j)
    {
      i = (j - i) / 2;
      k = 0;
    }
    while (true)
    {
      Bitmap localBitmap = Bitmap.createBitmap(j, j, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint(1);
      localPaint.setColor(-16777216);
      localCanvas.drawCircle(j / 2, j / 2, j / 2, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, i, k, localPaint);
      AppMethodBeat.o(61280);
      paramBitmap = localBitmap;
      break;
      k = (i - j) / 2;
      int m = 0;
      j = i;
      i = m;
    }
  }

  public static Drawable frameDrawableInCircle(Resources paramResources, Drawable paramDrawable)
  {
    AppMethodBeat.i(61281);
    if (paramDrawable == null)
      paramDrawable = null;
    while (true)
    {
      paramResources = new BitmapDrawable(paramResources, frameBitmapInCircle(paramDrawable));
      AppMethodBeat.o(61281);
      return paramResources;
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      }
      else
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
        paramDrawable.draw(localCanvas);
        paramDrawable = localBitmap;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.internal.ImageUtils
 * JD-Core Version:    0.6.2
 */