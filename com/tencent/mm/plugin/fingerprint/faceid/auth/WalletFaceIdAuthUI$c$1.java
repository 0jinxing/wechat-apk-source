package com.tencent.mm.plugin.fingerprint.faceid.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletFaceIdAuthUI$c$1
  implements a
{
  WalletFaceIdAuthUI$c$1(WalletFaceIdAuthUI.c paramc)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41384);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay success");
      this.mrd.mrc.a(new y(null, 19), false, false);
      paramString = h.pYm;
      if (this.mrd.bwU() == 1)
      {
        paramInt = 1;
        paramString.e(15817, new Object[] { Integer.valueOf(paramInt) });
        h.pYm.k(916L, 1L, 1L);
        AppMethodBeat.o(41384);
      }
    }
    while (true)
    {
      return;
      paramInt = 2;
      break;
      this.mrd.mrc.bgk();
      ab.e("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay failed");
      this.mrd.mrc.Ml(this.mrd.mrc.getString(2131299559));
      h.pYm.k(916L, 2L, 1L);
      AppMethodBeat.o(41384);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.c.1
 * JD-Core Version:    0.6.2
 */