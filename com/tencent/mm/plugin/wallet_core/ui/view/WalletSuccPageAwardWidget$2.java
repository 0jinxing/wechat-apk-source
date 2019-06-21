package com.tencent.mm.plugin.wallet_core.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import d.a.a.c;

final class WalletSuccPageAwardWidget$2
  implements WalletScratchShakeView.a
{
  WalletSuccPageAwardWidget$2(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void cSD()
  {
    AppMethodBeat.i(47942);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
    if (WalletSuccPageAwardWidget.j(this.tOK).BTC != 0)
      WalletSuccPageAwardWidget.cSO();
    AppMethodBeat.o(47942);
  }

  public final void nt(boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(47941);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "onStartScratchOrShake, isScratch: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject = this.tOK;
    int j;
    if (paramBoolean)
    {
      j = 1;
      WalletSuccPageAwardWidget.a((WalletSuccPageAwardWidget)localObject, j, false);
      if (!paramBoolean)
        break label112;
      localObject = h.pYm;
      if (!WalletSuccPageAwardWidget.e(this.tOK))
        break label107;
    }
    while (true)
    {
      ((h)localObject).e(15225, new Object[] { Integer.valueOf(5), Integer.valueOf(i) });
      WalletSuccPageAwardWidget.f(this.tOK);
      AppMethodBeat.o(47941);
      return;
      j = 2;
      break;
      label107: i = 1;
    }
    label112: localObject = h.pYm;
    if (WalletSuccPageAwardWidget.e(this.tOK));
    while (true)
    {
      ((h)localObject).e(15225, new Object[] { Integer.valueOf(4), Integer.valueOf(i) });
      break;
      i = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.2
 * JD-Core Version:    0.6.2
 */