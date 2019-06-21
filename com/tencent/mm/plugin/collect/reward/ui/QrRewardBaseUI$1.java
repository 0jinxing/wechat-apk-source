package com.tencent.mm.plugin.collect.reward.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QrRewardBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  QrRewardBaseUI$1(QrRewardBaseUI paramQrRewardBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41062);
    this.kDH.aqX();
    this.kDH.aoB();
    this.kDH.finish();
    AppMethodBeat.o(41062);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI.1
 * JD-Core Version:    0.6.2
 */