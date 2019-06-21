package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.s;

final class LuckyMoneyDetailUI$1
  implements AbsListView.OnScrollListener
{
  private boolean nST = false;
  private boolean nSU;

  LuckyMoneyDetailUI$1(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    AppMethodBeat.i(42646);
    if ((paramInt3 == 0) || (!this.nST))
    {
      AppMethodBeat.o(42646);
      return;
    }
    if (paramInt1 > 0);
    label103: 
    while (true)
    {
      if (this.nSU != bool)
      {
        if (bool)
          this.oeA.getResources().getDrawable(2130839226);
        this.nSU = bool;
      }
      AppMethodBeat.o(42646);
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
    AppMethodBeat.i(42645);
    if (paramAbsListView.getCount() == 0)
    {
      AppMethodBeat.o(42645);
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
      AppMethodBeat.o(42645);
      break;
      if (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1)
      {
        if (!this.oeA.ocz.bLA())
          LuckyMoneyDetailUI.a(this.oeA);
        if ((LuckyMoneyDetailUI.b(this.oeA)) && (!LuckyMoneyDetailUI.c(this.oeA)))
          LuckyMoneyDetailUI.d(this.oeA);
      }
      this.nST = false;
      AppMethodBeat.o(42645);
      break;
      this.nST = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.1
 * JD-Core Version:    0.6.2
 */