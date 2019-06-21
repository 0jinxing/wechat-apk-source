package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends b
{
  private final Bitmap bitmap;
  private final float oaw;
  private final float oax;

  public a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(42459);
    this.bitmap = paramBitmap;
    this.oaw = (paramBitmap.getWidth() / 2.0F);
    this.oax = (paramBitmap.getHeight() / 2.0F);
    AppMethodBeat.o(42459);
  }

  protected final void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(42462);
    paramMatrix.preTranslate(paramFloat1, paramFloat2);
    paramMatrix.preRotate(paramFloat3, this.oaw, this.oax);
    paramCanvas.drawBitmap(this.bitmap, paramMatrix, paramPaint);
    AppMethodBeat.o(42462);
  }

  public final int getHeight()
  {
    AppMethodBeat.i(42461);
    int i = this.bitmap.getHeight();
    AppMethodBeat.o(42461);
    return i;
  }

  public final int getWidth()
  {
    AppMethodBeat.i(42460);
    int i = this.bitmap.getWidth();
    AppMethodBeat.o(42460);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.a.a
 * JD-Core Version:    0.6.2
 */