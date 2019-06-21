package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

abstract interface v$b
{
  public abstract RecyclerView.v aZ(View paramView);

  public abstract void addView(View paramView, int paramInt);

  public abstract void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);

  public abstract void ba(View paramView);

  public abstract void bb(View paramView);

  public abstract void detachViewFromParent(int paramInt);

  public abstract View getChildAt(int paramInt);

  public abstract int getChildCount();

  public abstract int indexOfChild(View paramView);

  public abstract void removeAllViews();

  public abstract void removeViewAt(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.v.b
 * JD-Core Version:    0.6.2
 */