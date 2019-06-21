package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$11
  implements View.OnClickListener
{
  QrRewardMainUI$11(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41094);
    ab.d("MicroMsg.QrRewardMainUI", "click avatar");
    this.kEC.aqX();
    QrRewardMainUI.a(this.kEC);
    AppMethodBeat.o(41094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.11
 * JD-Core Version:    0.6.2
 */