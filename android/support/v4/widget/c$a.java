package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class c$a extends OvalShape
{
  private RadialGradient OY;
  private Paint OZ = new Paint();

  c$a(c paramc, int paramInt)
  {
    paramc.OX = paramInt;
    aP((int)rect().width());
  }

  private void aP(int paramInt)
  {
    float f1 = paramInt / 2;
    float f2 = paramInt / 2;
    float f3 = this.Pa.OX;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    this.OY = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, localTileMode);
    this.OZ.setShader(this.OY);
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.Pa.getWidth();
    int j = this.Pa.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, i / 2, this.OZ);
    paramCanvas.drawCircle(i / 2, j / 2, i / 2 - this.Pa.OX, paramPaint);
  }

  protected final void onResize(float paramFloat1, float paramFloat2)
  {
    super.onResize(paramFloat1, paramFloat2);
    aP((int)paramFloat1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c.a
 * JD-Core Version:    0.6.2
 */