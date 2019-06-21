package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyDetailUI$1
  implements AbsListView.OnScrollListener
{
  private boolean nST = false;
  private boolean nSU;

  WxaLuckyMoneyDetailUI$1(WxaLuckyMoneyDetailUI paramWxaLuckyMoneyDetailUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    AppMethodBeat.i(42024);
    if ((paramInt3 == 0) || (!this.nST))
    {
      AppMethodBeat.o(42024);
      return;
    }
    if (paramInt1 > 0);
    label63: label116: label119: 
    while (true)
    {
      if (this.nSU != bool)
      {
        if (bool)
        {
          WxaLuckyMoneyDetailUI.a(this.nSV, this.nSV.getResources().getDrawable(2130839226));
          this.nSU = bool;
        }
      }
      else
      {
        AppMethodBeat.o(42024);
        break;
        paramAbsListView = paramAbsListView.getChildAt(paramInt1);
        if (paramAbsListView == null)
          break label116;
      }
      for (paramInt1 = 0 - paramAbsListView.getTop(); ; paramInt1 = 0)
      {
        if (paramInt1 > 100)
          break label119;
        bool = false;
        break;
        WxaLuckyMoneyDetailUI.b(this.nSV);
        break label63;
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(42023);
    if (paramAbsListView.getCount() == 0)
    {
      AppMethodBeat.o(42023);
      return;
    }
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(42023);
      break;
      if (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1)
        WxaLuckyMoneyDetailUI.a(this.nSV).xI(paramAbsListView.getCount());
      this.nST = false;
      AppMethodBeat.o(42023);
      break;
      this.nST = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.1
 * JD-Core Version:    0.6.2
 */