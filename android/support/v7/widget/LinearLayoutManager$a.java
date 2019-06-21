package android.support.v7.widget;

import android.view.View;

final class LinearLayoutManager$a
{
  am alA;
  int alN;
  boolean alO;
  boolean alP;
  int mPosition;

  LinearLayoutManager$a()
  {
    reset();
  }

  final void iU()
  {
    if (this.alO);
    for (int i = this.alA.jf(); ; i = this.alA.je())
    {
      this.alN = i;
      return;
    }
  }

  final void reset()
  {
    this.mPosition = -1;
    this.alN = -2147483648;
    this.alO = false;
    this.alP = false;
  }

  public final String toString()
  {
    return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.alN + ", mLayoutFromEnd=" + this.alO + ", mValid=" + this.alP + '}';
  }

  public final void x(View paramView, int paramInt)
  {
    int i = this.alA.jd();
    if (i >= 0)
      y(paramView, paramInt);
    while (true)
    {
      return;
      this.mPosition = paramInt;
      int j;
      int k;
      if (this.alO)
      {
        paramInt = this.alA.jf() - i - this.alA.bg(paramView);
        this.alN = (this.alA.jf() - paramInt);
        if (paramInt > 0)
        {
          j = this.alA.bj(paramView);
          k = this.alN;
          i = this.alA.je();
          i = k - j - (i + Math.min(this.alA.bf(paramView) - i, 0));
          if (i < 0)
          {
            j = this.alN;
            this.alN = (Math.min(paramInt, -i) + j);
          }
        }
      }
      else
      {
        k = this.alA.bf(paramView);
        paramInt = k - this.alA.je();
        this.alN = k;
        if (paramInt > 0)
        {
          j = this.alA.bj(paramView);
          int m = this.alA.jf();
          int n = this.alA.bg(paramView);
          i = this.alA.jf() - Math.min(0, m - i - n) - (k + j);
          if (i < 0)
            this.alN -= Math.min(paramInt, -i);
        }
      }
    }
  }

  public final void y(View paramView, int paramInt)
  {
    if (this.alO);
    for (this.alN = (this.alA.bg(paramView) + this.alA.jd()); ; this.alN = this.alA.bf(paramView))
    {
      this.mPosition = paramInt;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager.a
 * JD-Core Version:    0.6.2
 */