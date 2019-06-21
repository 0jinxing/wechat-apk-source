package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$b extends Drawable
{
  boolean ozq = false;
  private Drawable ozr;
  private Drawable ozs;

  public n$b(n paramn, Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this.ozr = paramDrawable1;
    this.ozs = paramDrawable2;
    this.ozq = false;
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(55013);
    if (this.ozq);
    for (Drawable localDrawable = this.ozr; ; localDrawable = this.ozs)
    {
      if (!getBounds().equals(localDrawable.getBounds()))
        localDrawable.setBounds(getBounds());
      localDrawable.draw(paramCanvas);
      AppMethodBeat.o(55013);
      return;
    }
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(55014);
    this.ozr.setAlpha(paramInt);
    this.ozs.setAlpha(paramInt);
    AppMethodBeat.o(55014);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(55015);
    this.ozr.setColorFilter(paramColorFilter);
    this.ozs.setColorFilter(paramColorFilter);
    AppMethodBeat.o(55015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.n.b
 * JD-Core Version:    0.6.2
 */