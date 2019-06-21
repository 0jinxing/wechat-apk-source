package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class WalletPayUI$5
  implements DialogInterface.OnClickListener
{
  WalletPayUI$5(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46038);
    ab.i(this.tqj.TAG, "click cancel pay");
    if ((this.tqj.pVL != null) && (this.tqj.pWy != null) && (this.tqj.pWy.tAq != null) && (this.tqj.pWy.tAq.size() > 0))
    {
      if (this.tqj.pVL.cIf != 8)
        break label155;
      h.pYm.e(15368, new Object[] { Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), ((Orders.Commodity)this.tqj.pWy.tAq.get(0)).cAa });
    }
    while (true)
    {
      this.tqj.finish();
      AppMethodBeat.o(46038);
      return;
      label155: h.pYm.e(15368, new Object[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2), ((Orders.Commodity)this.tqj.pWy.tAq.get(0)).cAa });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.5
 * JD-Core Version:    0.6.2
 */