package android.support.design.internal;

import android.os.Bundle;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.widget.RecyclerView.a;
import android.util.SparseArray;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

public final class c$b extends RecyclerView.a<c.j>
{
  private j lU;
  boolean lr;
  final ArrayList<c.d> mItems = new ArrayList();

  public c$b(c paramc)
  {
    bu();
  }

  private void k(int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      ((c.f)this.mItems.get(paramInt1)).lW = true;
      paramInt1++;
    }
  }

  final void bu()
  {
    if (this.lr)
      return;
    this.lr = true;
    this.mItems.clear();
    this.mItems.add(new c.c());
    int i = -1;
    int j = 0;
    boolean bool1 = false;
    int k = this.lT.lo.gB().size();
    int m = 0;
    j localj1;
    Object localObject;
    int n;
    label346: boolean bool2;
    while (true)
      if (m < k)
      {
        localj1 = (j)this.lT.lo.gB().get(m);
        if (localj1.isChecked())
          d(localj1);
        if (localj1.isCheckable())
          localj1.V(false);
        if (localj1.hasSubMenu())
        {
          localObject = localj1.getSubMenu();
          if (((SubMenu)localObject).hasVisibleItems())
          {
            if (m != 0)
              this.mItems.add(new c.e(this.lT.lS, 0));
            this.mItems.add(new c.f(localj1));
            n = 0;
            int i1 = this.mItems.size();
            int i2 = ((SubMenu)localObject).size();
            int i3 = 0;
            while (i3 < i2)
            {
              j localj2 = (j)((SubMenu)localObject).getItem(i3);
              int i4 = n;
              if (localj2.isVisible())
              {
                i4 = n;
                if (n == 0)
                {
                  i4 = n;
                  if (localj2.getIcon() != null)
                    i4 = 1;
                }
                if (localj2.isCheckable())
                  localj2.V(false);
                if (localj1.isChecked())
                  d(localj1);
                this.mItems.add(new c.f(localj2));
              }
              i3++;
              n = i4;
            }
            if (n != 0)
              k(i1, this.mItems.size());
          }
          n = i;
          i = j;
          j = n;
          m++;
          n = j;
          j = i;
          i = n;
        }
        else
        {
          n = localj1.getGroupId();
          if (n != i)
          {
            i = this.mItems.size();
            if (localj1.getIcon() != null)
            {
              bool2 = true;
              label392: bool1 = bool2;
              j = i;
              if (m != 0)
              {
                j = i + 1;
                this.mItems.add(new c.e(this.lT.lS, this.lT.lS));
                bool1 = bool2;
              }
            }
          }
        }
      }
    while (true)
    {
      localObject = new c.f(localj1);
      ((c.f)localObject).lW = bool1;
      this.mItems.add(localObject);
      i = j;
      j = n;
      break label346;
      bool2 = false;
      break label392;
      if ((!bool1) && (localj1.getIcon() != null))
      {
        bool1 = true;
        k(j, this.mItems.size());
        continue;
        this.lr = false;
        break;
      }
    }
  }

  public final Bundle bv()
  {
    Bundle localBundle = new Bundle();
    if (this.lU != null)
      localBundle.putInt("android:menu:checked", this.lU.getItemId());
    SparseArray localSparseArray = new SparseArray();
    int i = this.mItems.size();
    int j = 0;
    if (j < i)
    {
      Object localObject = (c.d)this.mItems.get(j);
      j localj;
      if ((localObject instanceof c.f))
      {
        localj = ((c.f)localObject).lV;
        if (localj == null)
          break label136;
      }
      label136: for (localObject = localj.getActionView(); ; localObject = null)
      {
        if (localObject != null)
        {
          ParcelableSparseArray localParcelableSparseArray = new ParcelableSparseArray();
          ((View)localObject).saveHierarchyState(localParcelableSparseArray);
          localSparseArray.put(localj.getItemId(), localParcelableSparseArray);
        }
        j++;
        break;
      }
    }
    localBundle.putSparseParcelableArray("android:menu:action_views", localSparseArray);
    return localBundle;
  }

  public final void d(j paramj)
  {
    if ((this.lU == paramj) || (!paramj.isCheckable()));
    while (true)
    {
      return;
      if (this.lU != null)
        this.lU.setChecked(false);
      this.lU = paramj;
      paramj.setChecked(true);
    }
  }

  public final int getItemCount()
  {
    return this.mItems.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    c.d locald = (c.d)this.mItems.get(paramInt);
    if ((locald instanceof c.e))
      paramInt = 2;
    while (true)
    {
      return paramInt;
      if ((locald instanceof c.c))
      {
        paramInt = 3;
      }
      else
      {
        if (!(locald instanceof c.f))
          break;
        if (((c.f)locald).lV.hasSubMenu())
          paramInt = 1;
        else
          paramInt = 0;
      }
    }
    throw new RuntimeException("Unknown item type.");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.internal.c.b
 * JD-Core Version:    0.6.2
 */