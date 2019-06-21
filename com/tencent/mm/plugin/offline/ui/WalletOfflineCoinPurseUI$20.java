package com.tencent.mm.plugin.offline.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import java.util.ArrayList;

final class WalletOfflineCoinPurseUI$20
  implements AdapterView.OnItemClickListener
{
  WalletOfflineCoinPurseUI$20(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, int paramInt)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(43526);
    this.pav.dismissDialog(this.paM);
    WalletOfflineCoinPurseUI.AA(paramInt);
    if (this.paM == 1)
    {
      paramAdapterView = (String)WalletOfflineCoinPurseUI.F(this.pav).get(paramInt);
      if ((!TextUtils.isEmpty(paramAdapterView)) && (!paramAdapterView.equals(WalletOfflineCoinPurseUI.G(this.pav))))
      {
        WalletOfflineCoinPurseUI.a(this.pav, paramAdapterView);
        a.Ue(WalletOfflineCoinPurseUI.G(this.pav));
        k.bXg();
        k.bXi().oWS = WalletOfflineCoinPurseUI.G(this.pav);
        this.pav.bXM();
        WalletOfflineCoinPurseUI.C(this.pav);
        WalletOfflineCoinPurseUI.D(this.pav);
      }
    }
    AppMethodBeat.o(43526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.20
 * JD-Core Version:    0.6.2
 */