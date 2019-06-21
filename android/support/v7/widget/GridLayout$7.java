package android.support.v7.widget;

import android.view.View;

final class GridLayout$7 extends GridLayout.a
{
  final String in()
  {
    return "BASELINE";
  }

  public final GridLayout.e io()
  {
    return new GridLayout.7.1(this);
  }

  public final int k(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView.getVisibility() == 8)
      paramInt1 = 0;
    while (true)
    {
      return paramInt1;
      paramInt2 = paramView.getBaseline();
      paramInt1 = paramInt2;
      if (paramInt2 == -1)
        paramInt1 = -2147483648;
    }
  }

  final int w(View paramView, int paramInt)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.7
 * JD-Core Version:    0.6.2
 */