package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class m extends a
{
  private final ListView QU;

  public m(ListView paramListView)
  {
    super(paramListView);
    this.QU = paramListView;
  }

  public final void aN(int paramInt)
  {
    ListView localListView = this.QU;
    if (Build.VERSION.SDK_INT >= 19)
      localListView.scrollListBy(paramInt);
    while (true)
    {
      return;
      int i = localListView.getFirstVisiblePosition();
      if (i != -1)
      {
        View localView = localListView.getChildAt(0);
        if (localView != null)
          localListView.setSelectionFromTop(i, localView.getTop() - paramInt);
      }
    }
  }

  public final boolean aO(int paramInt)
  {
    boolean bool1 = false;
    ListView localListView = this.QU;
    int i = localListView.getCount();
    boolean bool2;
    if (i == 0)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      int j = localListView.getChildCount();
      int k = localListView.getFirstVisiblePosition();
      if (paramInt > 0)
      {
        if (k + j >= i)
        {
          bool2 = bool1;
          if (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight())
            continue;
        }
      }
      else
      {
        do
        {
          bool2 = true;
          break;
          bool2 = bool1;
          if (paramInt >= 0)
            break;
        }
        while ((k > 0) || (localListView.getChildAt(0).getTop() < 0));
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.m
 * JD-Core Version:    0.6.2
 */