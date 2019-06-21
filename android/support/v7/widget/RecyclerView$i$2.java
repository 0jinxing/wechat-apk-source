package android.support.v7.widget;

import android.view.View;

final class RecyclerView$i$2
  implements bi.b
{
  RecyclerView$i$2(RecyclerView.i parami)
  {
  }

  public final int bF(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return RecyclerView.i.by(paramView) - localLayoutParams.topMargin;
  }

  public final int bG(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bA(paramView);
    return localLayoutParams.bottomMargin + i;
  }

  public final View getChildAt(int paramInt)
  {
    return this.aoL.getChildAt(paramInt);
  }

  public final int jY()
  {
    return this.aoL.getPaddingTop();
  }

  public final int jZ()
  {
    return this.aoL.mHeight - this.aoL.getPaddingBottom();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.i.2
 * JD-Core Version:    0.6.2
 */