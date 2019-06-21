package com.tencent.mm.plugin.collect.reward.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class QrRewardMainUI$5
  implements n.d
{
  QrRewardMainUI$5(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41087);
    switch (paramMenuItem.getItemId())
    {
    default:
      ab.i("MicroMsg.QrRewardMainUI", "unknown menu: %s", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
      QrRewardMainUI.c(this.kEC, true);
      AppMethodBeat.o(41087);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      QrRewardMainUI.a(this.kEC, "");
      QrRewardMainUI.o(this.kEC);
      QrRewardMainUI.c(this.kEC, true);
      h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(3) });
      AppMethodBeat.o(41087);
      continue;
      QrRewardMainUI.c(this.kEC, false);
      QrRewardMainUI.p(this.kEC);
      h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(4) });
      AppMethodBeat.o(41087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.5
 * JD-Core Version:    0.6.2
 */