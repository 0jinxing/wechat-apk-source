package com.tencent.mm.plugin.offline.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.model.f;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletOfflineCoinPurseUI$10$1
  implements a.a
{
  WalletOfflineCoinPurseUI$10$1(WalletOfflineCoinPurseUI.10 param10)
  {
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(43514);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString + ";hadAgree = " + paramBoolean);
    if (paramInt1 == 2)
    {
      paramString = new f("reward");
      this.paI.pav.a(paramString, false, false);
    }
    while (true)
    {
      AppMethodBeat.o(43514);
      return true;
      if ((paramInt1 == 0) && (paramBoolean))
      {
        paramString = new f("reward");
        this.paI.pav.a(paramString, false, false);
      }
      else if (WalletOfflineCoinPurseUI.o(this.paI.pav) != null)
      {
        WalletOfflineCoinPurseUI.o(this.paI.pav).dismiss();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.10.1
 * JD-Core Version:    0.6.2
 */