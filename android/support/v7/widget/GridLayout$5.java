package android.support.v7.widget;

import android.support.v4.view.s;
import android.view.View;

final class GridLayout$5 extends GridLayout.a
{
  GridLayout$5(GridLayout.a parama1, GridLayout.a parama2)
  {
  }

  final String in()
  {
    return "SWITCHING[L:" + this.ajI.in() + ", R:" + this.ajJ.in() + "]";
  }

  public final int k(View paramView, int paramInt1, int paramInt2)
  {
    int i = 1;
    if (s.T(paramView) == 1)
      if (i != 0)
        break label37;
    label37: for (GridLayout.a locala = this.ajI; ; locala = this.ajJ)
    {
      return locala.k(paramView, paramInt1, paramInt2);
      i = 0;
      break;
    }
  }

  final int w(View paramView, int paramInt)
  {
    int i = 1;
    if (s.T(paramView) == 1)
      if (i != 0)
        break label33;
    label33: for (GridLayout.a locala = this.ajI; ; locala = this.ajJ)
    {
      return locala.w(paramView, paramInt);
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.5
 * JD-Core Version:    0.6.2
 */