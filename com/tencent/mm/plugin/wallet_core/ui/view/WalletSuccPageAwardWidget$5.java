package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletSuccPageAwardWidget$5
  implements WalletAwardShakeAnimView.a
{
  WalletSuccPageAwardWidget$5(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void ns(boolean paramBoolean)
  {
    AppMethodBeat.i(47945);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "onStartShakeOrClick, isShake: %s, isClickH5OrTinyApp: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(WalletSuccPageAwardWidget.e(this.tOK)) });
    if (paramBoolean)
    {
      localh = h.pYm;
      if (WalletSuccPageAwardWidget.e(this.tOK));
      for (i = 2; ; i = 1)
      {
        localh.e(15225, new Object[] { Integer.valueOf(4), Integer.valueOf(i) });
        WalletSuccPageAwardWidget.d(this.tOK).setShakeHintWording(this.tOK.getContext().getString(2131305370));
        WalletSuccPageAwardWidget.d(this.tOK).setShakeHintWordingColor(Color.parseColor("#9C9C9C"));
        WalletSuccPageAwardWidget.a(this.tOK, 2, false);
        WalletSuccPageAwardWidget.f(this.tOK);
        AppMethodBeat.o(47945);
        return;
      }
    }
    h localh = h.pYm;
    if (WalletSuccPageAwardWidget.e(this.tOK));
    for (int i = 2; ; i = 1)
    {
      localh.e(15225, new Object[] { Integer.valueOf(7), Integer.valueOf(i) });
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.5
 * JD-Core Version:    0.6.2
 */