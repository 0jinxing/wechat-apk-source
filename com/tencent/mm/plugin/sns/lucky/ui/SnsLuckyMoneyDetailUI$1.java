package com.tencent.mm.plugin.sns.lucky.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLuckyMoneyDetailUI$1
  implements AbsListView.OnScrollListener
{
  private boolean nST = false;
  private boolean nSU;

  SnsLuckyMoneyDetailUI$1(SnsLuckyMoneyDetailUI paramSnsLuckyMoneyDetailUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    AppMethodBeat.i(45183);
    if ((paramInt3 == 0) || (!this.nST))
    {
      AppMethodBeat.o(45183);
      return;
    }
    if (paramInt1 > 0);
    label60: label109: label112: 
    while (true)
    {
      if (this.nSU != bool)
      {
        if (bool)
        {
          this.qHf.getResources().getDrawable(2131690485);
          SnsLuckyMoneyDetailUI.cmy();
          this.nSU = bool;
        }
      }
      else
      {
        AppMethodBeat.o(45183);
        break;
        paramAbsListView = paramAbsListView.getChildAt(paramInt1);
        if (paramAbsListView == null)
          break label109;
      }
      for (paramInt1 = 0 - paramAbsListView.getTop(); ; paramInt1 = 0)
      {
        if (paramInt1 > 100)
          break label112;
        bool = false;
        break;
        SnsLuckyMoneyDetailUI.cmz();
        break label60;
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(45182);
    if (paramAbsListView.getCount() == 0)
    {
      AppMethodBeat.o(45182);
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
      AppMethodBeat.o(45182);
      break;
      this.nST = false;
      AppMethodBeat.o(45182);
      break;
      this.nST = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI.1
 * JD-Core Version:    0.6.2
 */