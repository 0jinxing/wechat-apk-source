package android.support.v7.widget;

import android.view.View;

final class RecyclerView$i$1
  implements bi.b
{
  RecyclerView$i$1(RecyclerView.i parami)
  {
  }

  public final int bF(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return RecyclerView.i.bx(paramView) - localLayoutParams.leftMargin;
  }

  public final int bG(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bz(paramView);
    return localLayoutParams.rightMargin + i;
  }

  public final View getChildAt(int paramInt)
  {
    return this.aoL.getChildAt(paramInt);
  }

  public final int jY()
  {
    return this.aoL.getPaddingLeft();
  }

  public final int jZ()
  {
    return this.aoL.mWidth - this.aoL.getPaddingRight();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.i.1
 * JD-Core Version:    0.6.2
 */