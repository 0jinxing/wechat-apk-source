package com.tencent.mm.plugin.appbrand.widget.h;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a;

public final class b extends a
{
  public b(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    AppMethodBeat.i(134411);
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.draw(paramCanvas, paramCharSequence, paramInt1, paramInt2, paramFloat, paramInt3, paramInt4, paramInt5, paramPaint);
    AppMethodBeat.o(134411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.h.b
 * JD-Core Version:    0.6.2
 */