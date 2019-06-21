package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class am$1 extends am
{
  am$1(RecyclerView.i parami)
  {
    super(parami, (byte)0);
  }

  public final int bf(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return RecyclerView.i.bx(paramView) - localLayoutParams.leftMargin;
  }

  public final int bg(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bz(paramView);
    return localLayoutParams.rightMargin + i;
  }

  public final int bh(View paramView)
  {
    this.amP.f(paramView, this.oT);
    return this.oT.right;
  }

  public final int bi(View paramView)
  {
    this.amP.f(paramView, this.oT);
    return this.oT.left;
  }

  public final int bj(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bv(paramView);
    int j = localLayoutParams.leftMargin;
    return localLayoutParams.rightMargin + (i + j);
  }

  public final int bk(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bw(paramView);
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }

  public final void cc(int paramInt)
  {
    this.amP.ck(paramInt);
  }

  public final int getEnd()
  {
    return this.amP.mWidth;
  }

  public final int getEndPadding()
  {
    return this.amP.getPaddingRight();
  }

  public final int getMode()
  {
    return this.amP.aoJ;
  }

  public final int je()
  {
    return this.amP.getPaddingLeft();
  }

  public final int jf()
  {
    return this.amP.mWidth - this.amP.getPaddingRight();
  }

  public final int jg()
  {
    return this.amP.mWidth - this.amP.getPaddingLeft() - this.amP.getPaddingRight();
  }

  public final int jh()
  {
    return this.amP.aoK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.am.1
 * JD-Core Version:    0.6.2
 */