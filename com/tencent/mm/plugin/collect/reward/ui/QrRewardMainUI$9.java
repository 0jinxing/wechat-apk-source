package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$9
  implements View.OnClickListener
{
  QrRewardMainUI$9(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41092);
    ab.d("MicroMsg.QrRewardMainUI", "open click");
    QrRewardMainUI.a(this.kEC, true);
    h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    AppMethodBeat.o(41092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.9
 * JD-Core Version:    0.6.2
 */