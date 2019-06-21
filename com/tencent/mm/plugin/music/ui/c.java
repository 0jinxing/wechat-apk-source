package com.tencent.mm.plugin.music.ui;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class c extends Drawable
{
  private Paint aFY;
  private RectF kPM;
  private Drawable oPm;
  float oPn;
  private int oPo;

  public c(Drawable paramDrawable)
  {
    AppMethodBeat.i(105133);
    this.oPo = a.am(ah.getContext(), 2131427593);
    this.oPm = paramDrawable;
    this.aFY = new Paint(1);
    this.aFY.setColor(ah.getResources().getColor(2131690198));
    AppMethodBeat.o(105133);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105134);
    Drawable localDrawable = this.oPm;
    Rect localRect = localDrawable.getBounds();
    int i = localRect.right;
    int j = localRect.left;
    int k = localRect.bottom;
    int m = localRect.top;
    float f1 = i - j;
    float f2 = k - m;
    m = paramCanvas.save();
    paramCanvas.rotate(this.oPn, f1 * 0.5F + localRect.left, localRect.top + f2 * 0.5F);
    paramCanvas.drawOval(this.kPM, this.aFY);
    localDrawable.draw(paramCanvas);
    paramCanvas.restoreToCount(m);
    AppMethodBeat.o(105134);
  }

  public final int getIntrinsicHeight()
  {
    return this.oPo;
  }

  public final int getIntrinsicWidth()
  {
    return this.oPo;
  }

  public final int getOpacity()
  {
    AppMethodBeat.i(105138);
    int i;
    if (this.oPm != null)
    {
      i = this.oPm.getOpacity();
      AppMethodBeat.o(105138);
    }
    while (true)
    {
      return i;
      i = -2;
      AppMethodBeat.o(105138);
    }
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(105136);
    if (this.oPm != null)
      this.oPm.setAlpha(paramInt);
    this.aFY.setAlpha(paramInt);
    AppMethodBeat.o(105136);
  }

  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105135);
    if (this.oPm != null)
      this.oPm.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.kPM = new RectF(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(105135);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(105137);
    this.aFY.setColorFilter(paramColorFilter);
    AppMethodBeat.o(105137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.c
 * JD-Core Version:    0.6.2
 */