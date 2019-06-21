package com.tencent.mm.plugin.wallet.pay.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.plugin.wallet_core.ui.q.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletChangeBankcardUI$5
  implements q.c
{
  WalletChangeBankcardUI$5(WalletChangeBankcardUI paramWalletChangeBankcardUI)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(45962);
    if (WalletChangeBankcardUI.b(this.toL))
    {
      ab.w("MicroMsg.WalletChangeBankcardUI", "has receive cancel");
      h.pYm.k(965L, 3L, 1L);
      AppMethodBeat.o(45962);
    }
    while (true)
    {
      return;
      this.toL.toH = paramFavorPayInfo;
      this.toL.mBundle.putParcelable("key_favor_pay_info", this.toL.toH);
      if ((this.toL.toH != null) && (paramBoolean))
      {
        if (this.toL.toH != null)
        {
          this.toL.mW(true);
          this.toL.toF.f(this.toL.tgB, false);
        }
        if (this.toL.toD != null)
          this.toL.toD.dismiss();
        this.toL.cu();
        this.toL.AM(0);
        AppMethodBeat.o(45962);
      }
      else
      {
        this.toL.gHr = paramString;
        this.toL.aqX();
        this.toL.acs(paramString);
        this.toL.toJ = null;
        AppMethodBeat.o(45962);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.5
 * JD-Core Version:    0.6.2
 */