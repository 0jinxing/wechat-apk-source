package android.support.design.internal;

import android.content.Context;
import android.os.Parcelable;
import android.support.transition.ae;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.view.MenuItem;

public final class BottomNavigationPresenter
  implements o
{
  private h lo;
  public BottomNavigationMenuView lq;
  public boolean lr = false;
  public int mId;

  public final void a(Context paramContext, h paramh)
  {
    this.lq.lo = this.lo;
    this.lo = paramh;
  }

  public final void a(h paramh, boolean paramBoolean)
  {
  }

  public final void a(o.a parama)
  {
  }

  public final boolean a(u paramu)
  {
    return false;
  }

  public final boolean b(j paramj)
  {
    return false;
  }

  public final boolean bt()
  {
    return false;
  }

  public final boolean c(j paramj)
  {
    return false;
  }

  public final int getId()
  {
    return this.mId;
  }

  public final void n(boolean paramBoolean)
  {
    if (this.lr);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.lq.bs();
      }
      else
      {
        BottomNavigationMenuView localBottomNavigationMenuView = this.lq;
        int i = localBottomNavigationMenuView.lo.size();
        if (i != localBottomNavigationMenuView.lg.length)
        {
          localBottomNavigationMenuView.bs();
        }
        else
        {
          int j = localBottomNavigationMenuView.lh;
          for (int k = 0; k < i; k++)
          {
            MenuItem localMenuItem = localBottomNavigationMenuView.lo.getItem(k);
            if (localMenuItem.isChecked())
            {
              localBottomNavigationMenuView.lh = localMenuItem.getItemId();
              localBottomNavigationMenuView.li = k;
            }
          }
          if (j != localBottomNavigationMenuView.lh)
            ae.a(localBottomNavigationMenuView, localBottomNavigationMenuView.la);
          for (k = 0; k < i; k++)
          {
            localBottomNavigationMenuView.ln.lr = true;
            localBottomNavigationMenuView.lg[k].a((j)localBottomNavigationMenuView.lo.getItem(k));
            localBottomNavigationMenuView.ln.lr = false;
          }
        }
      }
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    BottomNavigationMenuView localBottomNavigationMenuView;
    int i;
    int j;
    if ((paramParcelable instanceof BottomNavigationPresenter.SavedState))
    {
      localBottomNavigationMenuView = this.lq;
      i = ((BottomNavigationPresenter.SavedState)paramParcelable).ls;
      j = localBottomNavigationMenuView.lo.size();
    }
    for (int k = 0; ; k++)
      if (k < j)
      {
        paramParcelable = localBottomNavigationMenuView.lo.getItem(k);
        if (i == paramParcelable.getItemId())
        {
          localBottomNavigationMenuView.lh = i;
          localBottomNavigationMenuView.li = k;
          paramParcelable.setChecked(true);
        }
      }
      else
      {
        return;
      }
  }

  public final Parcelable onSaveInstanceState()
  {
    BottomNavigationPresenter.SavedState localSavedState = new BottomNavigationPresenter.SavedState();
    localSavedState.ls = this.lq.getSelectedItemId();
    return localSavedState;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationPresenter
 * JD-Core Version:    0.6.2
 */