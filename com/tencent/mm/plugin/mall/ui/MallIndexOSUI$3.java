package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MallIndexOSUI$3
  implements AbsListView.OnScrollListener
{
  boolean cLR;
  int color;
  final int maxHeight;
  final int minHeight;
  int onb;

  MallIndexOSUI$3(MallIndexOSUI paramMallIndexOSUI)
  {
    AppMethodBeat.i(43182);
    this.minHeight = a.fromDPToPix(this.omZ.mController.ylL, 50);
    this.maxHeight = a.fromDPToPix(this.omZ.mController.ylL, 200);
    this.cLR = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_redesign", h.Mu()).getBoolean("dark_actionbar", false);
    if (this.cLR);
    for (int i = 2131689913; ; i = 2131690310)
    {
      this.onb = i;
      this.color = this.omZ.mController.ylL.getResources().getColor(this.onb);
      AppMethodBeat.o(43182);
      return;
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = 0;
    AppMethodBeat.i(43183);
    if (paramAbsListView.getChildCount() == 0)
    {
      AppMethodBeat.o(43183);
      return;
    }
    if (paramInt1 == 0)
    {
      paramInt1 = Math.abs(paramAbsListView.getChildAt(0).getTop());
      if (paramInt1 <= this.minHeight)
      {
        paramInt1 = paramInt2;
        label46: if (MallIndexOSUI.e(this.omZ) != paramInt1)
        {
          if (paramInt1 > 0)
            break label140;
          this.omZ.xE(this.omZ.mController.ylL.getResources().getColor(2131690597));
        }
      }
    }
    while (true)
    {
      MallIndexOSUI.a(this.omZ, paramInt1);
      AppMethodBeat.o(43183);
      break;
      if (paramInt1 < this.maxHeight)
      {
        paramInt1 = (paramInt1 - this.minHeight) * 100 / (this.maxHeight - this.minHeight);
        break label46;
      }
      paramInt1 = 100;
      break label46;
      label140: this.omZ.xE(com.tencent.mm.ui.ah.dJ(this.color, paramInt1));
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexOSUI.3
 * JD-Core Version:    0.6.2
 */