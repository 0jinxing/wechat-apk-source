package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

final class CardView$1
  implements t
{
  private Drawable agV;

  CardView$1(CardView paramCardView)
  {
  }

  public final void S(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.agW.agQ)
      CardView.a(this.agW, paramInt1);
    if (paramInt2 > this.agW.agR)
      CardView.b(this.agW, paramInt2);
  }

  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.agW.agT.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView localCardView = this.agW;
    CardView.a(localCardView, localCardView.agS.left + paramInt1, this.agW.agS.top + paramInt2, this.agW.agS.right + paramInt3, this.agW.agS.bottom + paramInt4);
  }

  public final boolean getPreventCornerOverlap()
  {
    return this.agW.getPreventCornerOverlap();
  }

  public final boolean getUseCompatPadding()
  {
    return this.agW.getUseCompatPadding();
  }

  public final Drawable hR()
  {
    return this.agV;
  }

  public final View hS()
  {
    return this.agW;
  }

  public final void l(Drawable paramDrawable)
  {
    this.agV = paramDrawable;
    this.agW.setBackgroundDrawable(paramDrawable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.CardView.1
 * JD-Core Version:    0.6.2
 */