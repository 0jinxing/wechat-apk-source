package com.tencent.mm.plugin.offline.ui;

import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

final class WalletOfflineCoinPurseUI$31
  implements n.d
{
  WalletOfflineCoinPurseUI$31(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, d paramd, List paramList)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(43541);
    if (this.gCw != null)
    {
      this.gCw.cpE();
      paramMenuItem = (Bankcard)this.nrU.get(paramInt);
      h.pYm.e(14515, new Object[] { Integer.valueOf(3) });
      if ((!bo.isNullOrNil(paramMenuItem.field_forbid_title)) || (!bo.isNullOrNil(paramMenuItem.field_forbidWord)) || (!paramMenuItem.field_support_micropay))
        h.pYm.e(14515, new Object[] { Integer.valueOf(4) });
      paramMenuItem = paramMenuItem.field_bindSerial;
      if ((!TextUtils.isEmpty(paramMenuItem)) && (!paramMenuItem.equals(WalletOfflineCoinPurseUI.G(this.pav))))
      {
        WalletOfflineCoinPurseUI.a(this.pav, paramMenuItem);
        a.Ue(WalletOfflineCoinPurseUI.G(this.pav));
        k.bXg();
        k.bXi().oWS = WalletOfflineCoinPurseUI.G(this.pav);
        this.pav.bXM();
        WalletOfflineCoinPurseUI.C(this.pav);
        WalletOfflineCoinPurseUI.D(this.pav);
      }
    }
    AppMethodBeat.o(43541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.31
 * JD-Core Version:    0.6.2
 */