package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;

final class WalletOfflineCoinPurseUI$16
  implements h.c
{
  WalletOfflineCoinPurseUI$16(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(43522);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(43522);
      c localc;
      while (true)
      {
        return;
        a.eH(this.pav);
        AppMethodBeat.o(43522);
        continue;
        localc = WalletOfflineCoinPurseUI.z(this.pav);
        if (((b)g.K(b.class)).cTj())
          break;
        h.d(localc.mActivity, localc.getString(2131305443), "", localc.getString(2131305478), localc.getString(2131305440), new c.7(localc), new c.8(localc));
        AppMethodBeat.o(43522);
      }
      h.d(localc.mActivity, localc.getString(2131305441), "", localc.getString(2131305440), localc.getString(2131296868), new c.9(localc), new c.10(localc));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.16
 * JD-Core Version:    0.6.2
 */