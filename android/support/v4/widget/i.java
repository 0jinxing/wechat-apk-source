package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class i
{
  private static final b QN;
  public EdgeEffect QM;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (QN = new a(); ; QN = new b())
      return;
  }

  @Deprecated
  public i(Context paramContext)
  {
    this.QM = new EdgeEffect(paramContext);
  }

  public static void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    QN.a(paramEdgeEffect, paramFloat1, paramFloat2);
  }

  @Deprecated
  public final boolean F(float paramFloat)
  {
    this.QM.onPull(paramFloat);
    return true;
  }

  @Deprecated
  public final boolean aT(int paramInt)
  {
    this.QM.onAbsorb(paramInt);
    return true;
  }

  @Deprecated
  public final boolean draw(Canvas paramCanvas)
  {
    return this.QM.draw(paramCanvas);
  }

  @Deprecated
  public final boolean eL()
  {
    this.QM.onRelease();
    return this.QM.isFinished();
  }

  @Deprecated
  public final void setSize(int paramInt1, int paramInt2)
  {
    this.QM.setSize(paramInt1, paramInt2);
  }

  static final class a extends i.b
  {
    public final void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    }
  }

  static class b
  {
    public void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      paramEdgeEffect.onPull(paramFloat1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.i
 * JD-Core Version:    0.6.2
 */