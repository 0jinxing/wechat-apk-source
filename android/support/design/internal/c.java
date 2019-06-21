package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class c
  implements o
{
  public ColorStateList lE;
  public NavigationMenuView lJ;
  public LinearLayout lK;
  private o.a lL;
  public c.b lM;
  int lN;
  boolean lO;
  public ColorStateList lP;
  public Drawable lQ;
  public int lR;
  int lS;
  h lo;
  public int mId;
  public LayoutInflater mLayoutInflater;
  final View.OnClickListener mOnClickListener = new c.1(this);

  public final void a(Context paramContext, h paramh)
  {
    this.mLayoutInflater = LayoutInflater.from(paramContext);
    this.lo = paramh;
    this.lS = paramContext.getResources().getDimensionPixelOffset(2131428292);
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    if (this.lL != null)
      this.lL.a(paramh, paramBoolean);
  }

  public final void a(o.a parama)
  {
    this.lL = parama;
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
    if (this.lM != null)
    {
      c.b localb = this.lM;
      localb.bu();
      localb.aop.notifyChanged();
    }
  }

  public final void o(boolean paramBoolean)
  {
    if (this.lM != null)
      this.lM.lr = paramBoolean;
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    int i = 0;
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      Object localObject1 = paramParcelable.getSparseParcelableArray("android:menu:list");
      if (localObject1 != null)
        this.lJ.restoreHierarchyState((SparseArray)localObject1);
      Object localObject2 = paramParcelable.getBundle("android:menu:adapter");
      if (localObject2 != null)
      {
        localObject1 = this.lM;
        int j = ((Bundle)localObject2).getInt("android:menu:checked", 0);
        int k;
        if (j != 0)
        {
          ((c.b)localObject1).lr = true;
          k = ((c.b)localObject1).mItems.size();
        }
        for (int m = 0; ; m++)
        {
          Object localObject3;
          if (m < k)
          {
            localObject3 = (c.d)((c.b)localObject1).mItems.get(m);
            if ((localObject3 instanceof c.f))
            {
              localObject3 = ((c.f)localObject3).lV;
              if ((localObject3 != null) && (((j)localObject3).getItemId() == j))
                ((c.b)localObject1).d((j)localObject3);
            }
          }
          else
          {
            ((c.b)localObject1).lr = false;
            ((c.b)localObject1).bu();
            localObject2 = ((Bundle)localObject2).getSparseParcelableArray("android:menu:action_views");
            if (localObject2 == null)
              break;
            k = ((c.b)localObject1).mItems.size();
            for (m = i; m < k; m++)
            {
              localObject3 = (c.d)((c.b)localObject1).mItems.get(m);
              if ((localObject3 instanceof c.f))
              {
                Object localObject4 = ((c.f)localObject3).lV;
                if (localObject4 != null)
                {
                  localObject3 = ((j)localObject4).getActionView();
                  if (localObject3 != null)
                  {
                    localObject4 = (ParcelableSparseArray)((SparseArray)localObject2).get(((j)localObject4).getItemId());
                    if (localObject4 != null)
                      ((View)localObject3).restoreHierarchyState((SparseArray)localObject4);
                  }
                }
              }
            }
          }
        }
      }
      paramParcelable = paramParcelable.getSparseParcelableArray("android:menu:header");
      if (paramParcelable != null)
        this.lK.restoreHierarchyState(paramParcelable);
    }
  }

  public final Parcelable onSaveInstanceState()
  {
    Bundle localBundle;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localBundle = new Bundle();
      if (this.lJ != null)
      {
        localObject = new SparseArray();
        this.lJ.saveHierarchyState((SparseArray)localObject);
        localBundle.putSparseParcelableArray("android:menu:list", (SparseArray)localObject);
      }
      if (this.lM != null)
        localBundle.putBundle("android:menu:adapter", this.lM.bv());
      localObject = localBundle;
      if (this.lK != null)
      {
        localObject = new SparseArray();
        this.lK.saveHierarchyState((SparseArray)localObject);
        localBundle.putSparseParcelableArray("android:menu:header", (SparseArray)localObject);
      }
    }
    for (Object localObject = localBundle; ; localObject = null)
      return localObject;
  }

  public final void setItemBackground(Drawable paramDrawable)
  {
    this.lQ = paramDrawable;
    n(false);
  }

  public final void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.lE = paramColorStateList;
    n(false);
  }

  public final void setItemTextAppearance(int paramInt)
  {
    this.lN = paramInt;
    this.lO = true;
    n(false);
  }

  public final void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.lP = paramColorStateList;
    n(false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.internal.c
 * JD-Core Version:    0.6.2
 */