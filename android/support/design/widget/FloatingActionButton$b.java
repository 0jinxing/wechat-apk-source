package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

final class FloatingActionButton$b
  implements k
{
  FloatingActionButton$b(FloatingActionButton paramFloatingActionButton)
  {
  }

  public final boolean cd()
  {
    return this.qn.qh;
  }

  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.qn.qi.set(paramInt1, paramInt2, paramInt3, paramInt4);
    FloatingActionButton localFloatingActionButton = this.qn;
    localFloatingActionButton.setPadding(localFloatingActionButton.qf + paramInt1, this.qn.qf + paramInt2, this.qn.qf + paramInt3, this.qn.qf + paramInt4);
  }

  public final float getRadius()
  {
    return this.qn.getSizeDimension() / 2.0F;
  }

  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    FloatingActionButton.a(this.qn, paramDrawable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.FloatingActionButton.b
 * JD-Core Version:    0.6.2
 */