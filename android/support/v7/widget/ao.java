package android.support.v7.widget;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public final class ao extends a
{
  final RecyclerView aiB;
  final a aqa;

  public ao(RecyclerView paramRecyclerView)
  {
    this.aiB = paramRecyclerView;
    this.aqa = new ao.a(this);
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!this.aiB.jO()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null)
        paramView.getLayoutManager().onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramb.setClassName(RecyclerView.class.getName());
    int i;
    int j;
    if ((!this.aiB.jO()) && (this.aiB.getLayoutManager() != null))
    {
      paramView = this.aiB.getLayoutManager();
      RecyclerView.o localo = paramView.aiB.anc;
      RecyclerView.s locals = paramView.aiB.anY;
      if ((paramView.aiB.canScrollVertically(-1)) || (paramView.aiB.canScrollHorizontally(-1)))
      {
        paramb.addAction(8192);
        paramb.setScrollable(true);
      }
      if ((paramView.aiB.canScrollVertically(1)) || (paramView.aiB.canScrollHorizontally(1)))
      {
        paramb.addAction(4096);
        paramb.setScrollable(true);
      }
      i = paramView.a(localo, locals);
      j = paramView.b(localo, locals);
      if (Build.VERSION.SDK_INT < 21)
        break label197;
      paramView = new b.b(AccessibilityNodeInfo.CollectionInfo.obtain(i, j, false, 0));
    }
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 19)
        paramb.NG.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)((b.b)paramView).On);
      return;
      label197: if (Build.VERSION.SDK_INT >= 19)
        paramView = new b.b(AccessibilityNodeInfo.CollectionInfo.obtain(i, j, false));
      else
        paramView = new b.b(null);
    }
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = false;
    boolean bool2;
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      bool2 = true;
    int i;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (!this.aiB.jO())
      {
        bool2 = bool1;
        if (this.aiB.getLayoutManager() != null)
        {
          paramView = this.aiB.getLayoutManager();
          bool2 = bool1;
          if (paramView.aiB != null)
            switch (paramInt)
            {
            default:
              i = 0;
              paramInt = 0;
              if (paramInt == 0)
              {
                bool2 = bool1;
                if (i == 0);
              }
              else
              {
                paramView.aiB.scrollBy(i, paramInt);
                bool2 = true;
              }
              break;
            case 8192:
            case 4096:
            }
        }
      }
    }
    if (paramView.aiB.canScrollVertically(-1));
    for (paramInt = -(paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom()); ; paramInt = 0)
    {
      i = paramInt;
      if (paramView.aiB.canScrollHorizontally(-1))
      {
        i = -(paramView.mWidth - paramView.getPaddingLeft() - paramView.getPaddingRight());
        break;
        if (!paramView.aiB.canScrollVertically(1))
          break label259;
      }
      label259: for (paramInt = paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom(); ; paramInt = 0)
      {
        i = paramInt;
        if (paramView.aiB.canScrollHorizontally(1))
        {
          i = paramView.mWidth - paramView.getPaddingLeft() - paramView.getPaddingRight();
          break;
        }
        int j = 0;
        paramInt = i;
        i = j;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ao
 * JD-Core Version:    0.6.2
 */