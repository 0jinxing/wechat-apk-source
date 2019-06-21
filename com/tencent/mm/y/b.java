package com.tencent.mm.y;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ch.a;

public final class b
  implements Cloneable
{
  private static Paint eHe;
  public int mColor;
  private float mScale;
  private float uW;
  private Path vr;

  static
  {
    AppMethodBeat.i(116272);
    Paint localPaint = new Paint();
    eHe = localPaint;
    localPaint.setAntiAlias(true);
    eHe.setStyle(Paint.Style.STROKE);
    eHe.setStrokeCap(Paint.Cap.ROUND);
    AppMethodBeat.o(116272);
  }

  public b(Path paramPath, float paramFloat, int paramInt)
  {
    AppMethodBeat.i(116270);
    this.mScale = 1.0F;
    this.uW = a.bu(5.0F);
    this.vr = paramPath;
    this.mScale = paramFloat;
    this.mColor = paramInt;
    AppMethodBeat.o(116270);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116271);
    eHe.setColor(this.mColor);
    eHe.setStrokeWidth(this.uW * this.mScale);
    if (!this.vr.isEmpty())
      paramCanvas.drawPath(this.vr, eHe);
    AppMethodBeat.o(116271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.b
 * JD-Core Version:    0.6.2
 */