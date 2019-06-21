package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.d;
import android.support.v4.view.p;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AdLandingViewPager$c extends a
{
  AdLandingViewPager$c(AdLandingViewPager paramAdLandingViewPager)
  {
  }

  private boolean er()
  {
    boolean bool = true;
    AppMethodBeat.i(37509);
    if ((AdLandingViewPager.b(this.rcP) != null) && (AdLandingViewPager.b(this.rcP).getCount() > 1))
      AppMethodBeat.o(37509);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37509);
    }
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(37506);
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(AdLandingViewPager.class.getName());
    paramView = d.eu();
    paramView.setScrollable(er());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (AdLandingViewPager.b(this.rcP) != null))
    {
      paramView.setItemCount(AdLandingViewPager.b(this.rcP).getCount());
      paramView.setFromIndex(AdLandingViewPager.c(this.rcP));
      paramView.setToIndex(AdLandingViewPager.c(this.rcP));
    }
    AppMethodBeat.o(37506);
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    AppMethodBeat.i(37507);
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramb.setClassName(AdLandingViewPager.class.getName());
    paramb.setScrollable(er());
    if (this.rcP.canScrollHorizontally(1))
      paramb.addAction(4096);
    if (this.rcP.canScrollHorizontally(-1))
      paramb.addAction(8192);
    AppMethodBeat.o(37507);
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(37508);
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      AppMethodBeat.o(37508);
    while (true)
    {
      return bool;
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(37508);
        bool = false;
        break;
      case 4096:
        if (this.rcP.canScrollHorizontally(1))
        {
          this.rcP.setCurrentItem(AdLandingViewPager.c(this.rcP) + 1);
          AppMethodBeat.o(37508);
        }
        else
        {
          AppMethodBeat.o(37508);
          bool = false;
        }
        break;
      case 8192:
        if (this.rcP.canScrollHorizontally(-1))
        {
          this.rcP.setCurrentItem(AdLandingViewPager.c(this.rcP) - 1);
          AppMethodBeat.o(37508);
        }
        else
        {
          AppMethodBeat.o(37508);
          bool = false;
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.c
 * JD-Core Version:    0.6.2
 */