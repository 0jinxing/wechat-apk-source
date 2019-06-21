package com.tencent.mm.plugin.appbrand.game.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a extends Drawable
{
  Paint aFY;
  RectF rect;

  private a$a(a parama)
  {
    AppMethodBeat.i(130150);
    this.aFY = new Paint(1);
    this.rect = new RectF();
    this.aFY.setColor(-12748166);
    this.aFY.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(130150);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(130151);
    float f1 = paramCanvas.getHeight() / 2.0F;
    RectF localRectF1 = this.rect;
    this.rect.top = 0.0F;
    localRectF1.left = 0.0F;
    RectF localRectF2 = this.rect;
    localRectF1 = this.rect;
    float f2 = f1 * 2.0F;
    localRectF1.bottom = f2;
    localRectF2.right = f2;
    paramCanvas.drawArc(this.rect, 90.0F, 180.0F, false, this.aFY);
    this.rect.left = (paramCanvas.getWidth() - f1 * 2.0F);
    this.rect.top = 0.0F;
    this.rect.right = paramCanvas.getWidth();
    this.rect.bottom = paramCanvas.getHeight();
    paramCanvas.drawArc(this.rect, -90.0F, 180.0F, false, this.aFY);
    paramCanvas.drawRect(f1 - 1.0F, 0.0F, this.hrz.getWidth() - f1 + 1.0F, this.hrz.getHeight(), this.aFY);
    AppMethodBeat.o(130151);
  }

  public final int getOpacity()
  {
    return -1;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.a.a
 * JD-Core Version:    0.6.2
 */