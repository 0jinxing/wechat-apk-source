package com.tencent.mm.plugin.appbrand.widget.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class a extends Drawable
{
  private Paint aFY;
  private Paint borderPaint;
  float borderRadius;
  private int borderWidth;
  private Path jjV;
  private Path jjW;
  private int jjX;
  private int jjY;
  private final RectF rect;

  public a()
  {
    AppMethodBeat.i(51244);
    this.rect = new RectF();
    this.borderRadius = 0.0F;
    this.borderWidth = 0;
    this.jjX = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 3);
    this.jjY = this.jjX;
    this.aFY = new Paint(1);
    this.aFY.setStyle(Paint.Style.FILL);
    this.borderPaint = new Paint(1);
    this.borderPaint.setStyle(Paint.Style.FILL);
    this.jjV = new Path();
    this.jjW = new Path();
    AppMethodBeat.o(51244);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(51245);
    float f1 = this.rect.width();
    float f2 = this.rect.height();
    float f3 = this.rect.left;
    float f4 = this.rect.top;
    float f5 = this.rect.right;
    float f6 = this.rect.bottom;
    f1 = Math.min(this.borderRadius, Math.min(f1, f2) * 0.5F);
    paramCanvas.drawRoundRect(new RectF(this.jjY + f3, this.jjY + f4, f5 - this.jjY, f6 - this.jjY), f1, f1, this.borderPaint);
    paramCanvas.drawPath(this.jjW, this.borderPaint);
    paramCanvas.drawRoundRect(new RectF(f3 + this.jjY + this.borderWidth, f4 + this.jjY + this.borderWidth, f5 - this.jjY - this.borderWidth, f6 - this.jjY - this.borderWidth), f1, f1, this.aFY);
    paramCanvas.drawPath(this.jjV, this.aFY);
    AppMethodBeat.o(51245);
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(51247);
    this.aFY.setAlpha(paramInt);
    this.borderPaint.setAlpha(paramInt);
    AppMethodBeat.o(51247);
  }

  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(51246);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    float f = (paramInt1 + paramInt3) / 2.0F;
    this.jjW.moveTo(f, paramInt4);
    this.jjW.lineTo(f - this.jjY, paramInt4 - this.jjY);
    this.jjW.lineTo(this.jjY + f, paramInt4 - this.jjY);
    this.jjW.close();
    this.jjV.moveTo(f, paramInt4 - this.borderWidth);
    this.jjV.lineTo(f - this.jjY, paramInt4 - this.jjY - this.borderWidth);
    this.jjV.lineTo(f + this.jjY, paramInt4 - this.jjY - this.borderWidth);
    this.jjV.close();
    AppMethodBeat.o(51246);
  }

  public final void setColor(int paramInt)
  {
    AppMethodBeat.i(51249);
    this.aFY.setColor(paramInt);
    AppMethodBeat.o(51249);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(51248);
    this.aFY.setColorFilter(paramColorFilter);
    this.borderPaint.setColorFilter(paramColorFilter);
    AppMethodBeat.o(51248);
  }

  public final void setStroke(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51250);
    this.borderWidth = paramInt1;
    this.jjY = (paramInt1 / 3 + this.jjX);
    this.borderPaint.setColor(paramInt2);
    AppMethodBeat.o(51250);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.e.a
 * JD-Core Version:    0.6.2
 */