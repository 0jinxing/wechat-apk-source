package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

final class am$2 extends am
{
  am$2(RecyclerView.i parami)
  {
    super(parami, (byte)0);
  }

  public final int bf(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return RecyclerView.i.by(paramView) - localLayoutParams.topMargin;
  }

  public final int bg(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bA(paramView);
    return localLayoutParams.bottomMargin + i;
  }

  public final int bh(View paramView)
  {
    this.amP.f(paramView, this.oT);
    return this.oT.bottom;
  }

  public final int bi(View paramView)
  {
    this.amP.f(paramView, this.oT);
    return this.oT.top;
  }

  public final int bj(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bw(paramView);
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }

  public final int bk(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bv(paramView);
    int j = localLayoutParams.leftMargin;
    return localLayoutParams.rightMargin + (i + j);
  }

  public final void cc(int paramInt)
  {
    this.amP.cl(paramInt);
  }

  public final int getEnd()
  {
    return this.amP.mHeight;
  }

  public final int getEndPadding()
  {
    return this.amP.getPaddingBottom();
  }

  public final int getMode()
  {
    return this.amP.aoK;
  }

  public final int je()
  {
    return this.amP.getPaddingTop();
  }

  public final int jf()
  {
    return this.amP.mHeight - this.amP.getPaddingBottom();
  }

  public final int jg()
  {
    return this.amP.mHeight - this.amP.getPaddingTop() - this.amP.getPaddingBottom();
  }

  public final int jh()
  {
    return this.amP.aoJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.am.2
 * JD-Core Version:    0.6.2
 */