package com.tencent.mm.plugin.offline.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.model.f;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletOfflineCoinPurseUI$7$1
  implements a.a
{
  WalletOfflineCoinPurseUI$7$1(WalletOfflineCoinPurseUI.7 param7)
  {
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(43510);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString + ";hadAgree = " + paramBoolean);
    if (paramInt1 == 2)
    {
      paramString = new f("collect");
      this.paE.pav.a(paramString, false, false);
    }
    while (true)
    {
      AppMethodBeat.o(43510);
      return true;
      if ((paramInt1 == 0) && (paramBoolean))
      {
        paramString = new f("collect");
        this.paE.pav.a(paramString, false, false);
      }
      else if (WalletOfflineCoinPurseUI.o(this.paE.pav) != null)
      {
        WalletOfflineCoinPurseUI.o(this.paE.pav).dismiss();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.7.1
 * JD-Core Version:    0.6.2
 */