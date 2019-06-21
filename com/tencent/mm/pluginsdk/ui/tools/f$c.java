package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class f$c extends Drawable
{
  static final Paint vuN;
  final Rect Hx;
  WeakReference<Bitmap> vuO;
  private boolean vuP;
  private boolean vuQ;

  static
  {
    AppMethodBeat.i(79939);
    vuN = new Paint(6);
    AppMethodBeat.o(79939);
  }

  public f$c()
  {
    AppMethodBeat.i(79935);
    this.Hx = new Rect();
    this.vuO = new WeakReference(null);
    this.vuP = false;
    this.vuQ = false;
    AppMethodBeat.o(79935);
  }

  public static void b(ImageView paramImageView, Bitmap paramBitmap)
  {
    boolean bool1 = true;
    AppMethodBeat.i(79936);
    c localc;
    if ((paramImageView.getDrawable() instanceof c))
    {
      localc = (c)paramImageView.getDrawable();
      localc.vuO = new WeakReference(paramBitmap);
      if (paramImageView.getScaleType() != ImageView.ScaleType.FIT_XY)
        break label101;
      bool2 = true;
      label50: localc.vuP = bool2;
      if (paramImageView.getScaleType() != ImageView.ScaleType.CENTER_CROP)
        break label107;
    }
    label101: label107: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localc.vuQ = bool2;
      paramImageView.setImageDrawable(localc);
      paramImageView.postInvalidate();
      AppMethodBeat.o(79936);
      return;
      localc = new c();
      break;
      bool2 = false;
      break label50;
    }
  }

  public static void k(ImageView paramImageView)
  {
    AppMethodBeat.i(79937);
    b(paramImageView, null);
    AppMethodBeat.o(79937);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(79938);
    Bitmap localBitmap = (Bitmap)this.vuO.get();
    int i;
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      i = 0;
      if (i == 0)
        break label65;
      AppMethodBeat.o(79938);
    }
    while (true)
    {
      return;
      copyBounds(this.Hx);
      paramCanvas.drawBitmap(localBitmap, null, this.Hx, vuN);
      i = 1;
      break;
      label65: AppMethodBeat.o(79938);
    }
  }

  public final int getOpacity()
  {
    return 0;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.c
 * JD-Core Version:    0.6.2
 */