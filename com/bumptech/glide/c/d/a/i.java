package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Lock;

final class i
{
  private static final e aFu;

  static
  {
    AppMethodBeat.i(92234);
    aFu = new i.1();
    AppMethodBeat.o(92234);
  }

  static u<Bitmap> a(e parame, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92232);
    Drawable localDrawable = paramDrawable.getCurrent();
    paramDrawable = null;
    if ((localDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)localDrawable).getBitmap();
      paramInt1 = 0;
    }
    while (true)
    {
      if (paramInt1 != 0);
      while (true)
      {
        parame = d.a(paramDrawable, parame);
        AppMethodBeat.o(92232);
        return parame;
        if ((localDrawable instanceof Animatable))
          break label78;
        paramDrawable = b(parame, localDrawable, paramInt1, paramInt2);
        paramInt1 = 1;
        break;
        parame = aFu;
      }
      label78: paramInt1 = 0;
    }
  }

  private static Bitmap b(e parame, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    Lock localLock = null;
    AppMethodBeat.i(92233);
    if ((paramInt1 == -2147483648) && (paramDrawable.getIntrinsicWidth() <= 0))
    {
      if (Log.isLoggable("DrawableToBitmap", 5))
        new StringBuilder("Unable to draw ").append(paramDrawable).append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
      AppMethodBeat.o(92233);
      parame = localLock;
    }
    while (true)
    {
      return parame;
      if ((paramInt2 == -2147483648) && (paramDrawable.getIntrinsicHeight() <= 0))
      {
        if (Log.isLoggable("DrawableToBitmap", 5))
          new StringBuilder("Unable to draw ").append(paramDrawable).append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
        AppMethodBeat.o(92233);
        parame = localLock;
        continue;
      }
      if (paramDrawable.getIntrinsicWidth() > 0)
        paramInt1 = paramDrawable.getIntrinsicWidth();
      if (paramDrawable.getIntrinsicHeight() > 0)
        paramInt2 = paramDrawable.getIntrinsicHeight();
      localLock = p.nx();
      localLock.lock();
      parame = parame.c(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      try
      {
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>(parame);
        paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
        paramDrawable.draw(localCanvas);
        localCanvas.setBitmap(null);
        localLock.unlock();
        AppMethodBeat.o(92233);
      }
      finally
      {
        localLock.unlock();
        AppMethodBeat.o(92233);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.i
 * JD-Core Version:    0.6.2
 */