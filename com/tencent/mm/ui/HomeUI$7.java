package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bp;

final class HomeUI$7
  implements View.OnClickListener
{
  HomeUI$7(HomeUI paramHomeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29348);
    h.pYm.X(10919, "0");
    HomeUI.n(this.yjm);
    if (HomeUI.yiE.booleanValue())
    {
      HomeUI localHomeUI = this.yjm;
      paramView = Boolean.TRUE;
      HomeUI.a(localHomeUI, paramView, paramView);
    }
    if (HomeUI.yiF.booleanValue())
      HomeUI.a(this.yjm, Boolean.TRUE, Boolean.FALSE);
    if (!bp.dnM())
    {
      long l = ah.anU();
      if (l - HomeUI.o(this.yjm) > 10000L)
      {
        HomeUI.a(this.yjm, l);
        HomeUI.p(this.yjm);
        AppMethodBeat.o(29348);
      }
    }
    while (true)
    {
      return;
      HomeUI.q(this.yjm);
      if (HomeUI.r(this.yjm) >= 5)
      {
        ab.w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
        bp.pm(true);
      }
      AppMethodBeat.o(29348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.7
 * JD-Core Version:    0.6.2
 */