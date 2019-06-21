package com.tencent.mm.plugin.appbrand.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;
import junit.framework.Assert;

public final class b
  implements b.f
{
  private int mHeight;
  private int mWidth;

  public b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132736);
    if (paramInt1 == 0)
    {
      bool2 = true;
      Assert.assertFalse(bool2);
      if (paramInt2 != 0)
        break label57;
    }
    label57: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertFalse(bool2);
      this.mWidth = paramInt1;
      this.mHeight = paramInt2;
      AppMethodBeat.o(132736);
      return;
      bool2 = false;
      break;
    }
  }

  public final String wP()
  {
    AppMethodBeat.i(132738);
    String str = String.format("Transformation_w%s_h%s", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
    AppMethodBeat.o(132738);
    return str;
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(132737);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(132737);
      return paramBitmap;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f = this.mHeight / this.mWidth;
    Bitmap localBitmap = d.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Rect localRect1 = new Rect();
    localRect1.left = 0;
    localRect1.top = 0;
    if (f <= j / i)
      localRect1.right = i;
    for (localRect1.bottom = ((int)(i * f)); ; localRect1.bottom = j)
    {
      Rect localRect2 = new Rect();
      localRect2.left = 0;
      localRect2.top = 0;
      localRect2.right = this.mWidth;
      localRect2.bottom = this.mHeight;
      localCanvas.drawBitmap(paramBitmap, localRect1, localRect2, null);
      AppMethodBeat.o(132737);
      paramBitmap = localBitmap;
      break;
      localRect1.right = ((int)(j / f));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.b
 * JD-Core Version:    0.6.2
 */