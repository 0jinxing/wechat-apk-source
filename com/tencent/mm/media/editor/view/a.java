package com.tencent.mm.media.editor.view;

import a.f.b.j;
import a.l;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/view/ActiveFrameDrawable;", "Landroid/graphics/drawable/Drawable;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "basicScale", "", "framePadding", "frameRect", "frameStroke", "paint", "Landroid/graphics/Paint;", "getResources", "()Landroid/content/res/Resources;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "plugin-mediaeditor_release"})
public final class a extends Drawable
{
  private final Resources aEH;
  private final Paint aFY;
  private float eVd;
  private final float eVe;
  private final float eVf;
  private final float eVg;

  public a(Resources paramResources)
  {
    AppMethodBeat.i(12925);
    this.aEH = paramResources;
    this.eVd = 2.0F;
    this.aFY = new Paint();
    this.aFY.setColor(-1);
    this.aFY.setAntiAlias(true);
    this.aFY.setStrokeWidth(this.aEH.getDimension(2131428322));
    this.aFY.setStyle(Paint.Style.FILL);
    this.eVf = this.aEH.getDimension(2131428322);
    this.eVg = this.aEH.getDimension(2131428320);
    this.eVe = this.aEH.getDimension(2131428321);
    AppMethodBeat.o(12925);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(12924);
    j.p(paramCanvas, "canvas");
    float f1 = getBounds().left - this.eVg / this.eVd;
    float f2 = getBounds().top - this.eVg / this.eVd;
    float f3 = getBounds().right + this.eVg / this.eVd;
    float f4 = getBounds().bottom + this.eVg / this.eVd;
    float f5 = this.eVe / 2.0F / this.eVd;
    this.aFY.setStrokeWidth(this.eVf / this.eVd);
    this.aFY.setAntiAlias(true);
    paramCanvas.drawRect(f1 - f5, f2 - f5, f1 + f5, f2 + f5, this.aFY);
    paramCanvas.drawRect(f3 - f5, f2 - f5, f3 + f5, f2 + f5, this.aFY);
    paramCanvas.drawRect(f3 - f5, f4 - f5, f3 + f5, f4 + f5, this.aFY);
    paramCanvas.drawRect(f1 - f5, f4 - f5, f1 + f5, f4 + f5, this.aFY);
    Paint localPaint = this.aFY;
    paramCanvas.drawLines(new float[] { f1, f2, f3, f2, f3, f2, f3, f4, f3, f4, f1, f4, f1, f4, f1, f2 }, localPaint);
    AppMethodBeat.o(12924);
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.view.a
 * JD-Core Version:    0.6.2
 */