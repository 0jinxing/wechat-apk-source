package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLqtPlanHomeUI$2
  implements AdapterView.OnItemClickListener
{
  WalletLqtPlanHomeUI$2(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(45605);
    ab.i("MicroMsg.WalletLqtPlanHomeUI", "pos: %s", new Object[] { Integer.valueOf(paramInt) });
    paramAdapterView.getAdapter().getItem(paramInt);
    AppMethodBeat.o(45605);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.2
 * JD-Core Version:    0.6.2
 */