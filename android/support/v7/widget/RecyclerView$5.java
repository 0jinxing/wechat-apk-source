package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

final class RecyclerView$5
  implements v.b
{
  RecyclerView$5(RecyclerView paramRecyclerView)
  {
  }

  public final RecyclerView.v aZ(View paramView)
  {
    return RecyclerView.bn(paramView);
  }

  public final void addView(View paramView, int paramInt)
  {
    this.aoo.addView(paramView, paramInt);
    RecyclerView localRecyclerView = this.aoo;
    paramView = RecyclerView.bn(paramView);
    if ((localRecyclerView.Yq != null) && (paramView != null))
      localRecyclerView.Yq.k(paramView);
    if (localRecyclerView.anz != null)
      for (paramInt = localRecyclerView.anz.size() - 1; paramInt >= 0; paramInt--)
        localRecyclerView.anz.get(paramInt);
  }

  public final void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    if (localv != null)
    {
      if ((!localv.ks()) && (!localv.kh()))
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + localv + this.aoo.ji());
      localv.kp();
    }
    RecyclerView.a(this.aoo, paramView, paramInt, paramLayoutParams);
  }

  public final void ba(View paramView)
  {
    paramView = RecyclerView.bn(paramView);
    if (paramView != null)
      RecyclerView.v.a(paramView, this.aoo);
  }

  public final void bb(View paramView)
  {
    paramView = RecyclerView.bn(paramView);
    if (paramView != null)
      RecyclerView.v.b(paramView, this.aoo);
  }

  public final void detachViewFromParent(int paramInt)
  {
    Object localObject = getChildAt(paramInt);
    if (localObject != null)
    {
      localObject = RecyclerView.bn((View)localObject);
      if (localObject != null)
      {
        if ((((RecyclerView.v)localObject).ks()) && (!((RecyclerView.v)localObject).kh()))
          throw new IllegalArgumentException("called detach on an already detached child " + localObject + this.aoo.ji());
        ((RecyclerView.v)localObject).addFlags(256);
      }
    }
    RecyclerView.b(this.aoo, paramInt);
  }

  public final View getChildAt(int paramInt)
  {
    return this.aoo.getChildAt(paramInt);
  }

  public final int getChildCount()
  {
    return this.aoo.getChildCount();
  }

  public final int indexOfChild(View paramView)
  {
    return this.aoo.indexOfChild(paramView);
  }

  public final void removeAllViews()
  {
    int i = this.aoo.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      this.aoo.bs(localView);
      localView.clearAnimation();
    }
    this.aoo.removeAllViews();
  }

  public final void removeViewAt(int paramInt)
  {
    View localView = this.aoo.getChildAt(paramInt);
    if (localView != null)
    {
      this.aoo.bs(localView);
      localView.clearAnimation();
    }
    this.aoo.removeViewAt(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.5
 * JD-Core Version:    0.6.2
 */