package com.tencent.mm.ui.mogic;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.d;
import android.support.v4.view.p;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxViewPager$c extends a
{
  WxViewPager$c(WxViewPager paramWxViewPager)
  {
  }

  private boolean er()
  {
    boolean bool = true;
    AppMethodBeat.i(107458);
    if ((WxViewPager.access$200(this.zzG) != null) && (WxViewPager.access$200(this.zzG).getCount() > 1))
      AppMethodBeat.o(107458);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107458);
    }
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(107455);
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(WxViewPager.class.getName());
    paramView = d.eu();
    paramView.setScrollable(er());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (WxViewPager.access$200(this.zzG) != null))
    {
      paramView.setItemCount(WxViewPager.access$200(this.zzG).getCount());
      paramView.setFromIndex(WxViewPager.access$300(this.zzG));
      paramView.setToIndex(WxViewPager.access$300(this.zzG));
    }
    AppMethodBeat.o(107455);
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    AppMethodBeat.i(107456);
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramb.setClassName(WxViewPager.class.getName());
    paramb.setScrollable(er());
    if (this.zzG.canScrollHorizontally(1))
      paramb.addAction(4096);
    if (this.zzG.canScrollHorizontally(-1))
      paramb.addAction(8192);
    AppMethodBeat.o(107456);
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(107457);
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      AppMethodBeat.o(107457);
    while (true)
    {
      return bool;
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(107457);
        bool = false;
        break;
      case 4096:
        if (this.zzG.canScrollHorizontally(1))
        {
          this.zzG.setCurrentItem(WxViewPager.access$300(this.zzG) + 1);
          AppMethodBeat.o(107457);
        }
        else
        {
          AppMethodBeat.o(107457);
          bool = false;
        }
        break;
      case 8192:
        if (this.zzG.canScrollHorizontally(-1))
        {
          this.zzG.setCurrentItem(WxViewPager.access$300(this.zzG) - 1);
          AppMethodBeat.o(107457);
        }
        else
        {
          AppMethodBeat.o(107457);
          bool = false;
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.mogic.WxViewPager.c
 * JD-Core Version:    0.6.2
 */