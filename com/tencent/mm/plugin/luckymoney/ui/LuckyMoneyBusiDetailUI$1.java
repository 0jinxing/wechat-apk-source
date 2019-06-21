package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;

final class LuckyMoneyBusiDetailUI$1
  implements AbsListView.OnScrollListener
{
  private boolean nST = false;
  private boolean nSU;

  LuckyMoneyBusiDetailUI$1(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    AppMethodBeat.i(42583);
    if ((paramInt3 == 0) || (!this.nST))
    {
      AppMethodBeat.o(42583);
      return;
    }
    if (paramInt1 > 0);
    label103: 
    while (true)
    {
      if (this.nSU != bool)
      {
        if (bool)
          this.ocR.getResources().getDrawable(2130839226);
        this.nSU = bool;
      }
      AppMethodBeat.o(42583);
      break;
      paramAbsListView = paramAbsListView.getChildAt(paramInt1);
      if (paramAbsListView != null);
      for (paramInt1 = 0 - paramAbsListView.getTop(); ; paramInt1 = 0)
      {
        if (paramInt1 > 100)
          break label103;
        bool = false;
        break;
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(42582);
    if (paramAbsListView.getCount() == 0)
    {
      AppMethodBeat.o(42582);
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
      AppMethodBeat.o(42582);
      break;
      if (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1)
      {
        if (!this.ocR.ocz.bLA())
          LuckyMoneyBusiDetailUI.a(this.ocR);
        if ((LuckyMoneyBusiDetailUI.b(this.ocR)) && (!LuckyMoneyBusiDetailUI.c(this.ocR)))
          LuckyMoneyBusiDetailUI.d(this.ocR);
      }
      this.nST = false;
      AppMethodBeat.o(42582);
      break;
      this.nST = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.1
 * JD-Core Version:    0.6.2
 */