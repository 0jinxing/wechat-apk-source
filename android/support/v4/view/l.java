package android.support.v4.view;

import android.view.View;

public abstract interface l
{
  public abstract boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);

  public abstract boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2);

  public abstract void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt);

  public abstract void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt);

  public abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt);

  public abstract void onStopNestedScroll(View paramView);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.l
 * JD-Core Version:    0.6.2
 */