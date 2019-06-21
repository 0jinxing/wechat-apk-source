package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletOrderInfoNewUI$17
  implements Runnable
{
  WalletOrderInfoNewUI$17(WalletOrderInfoNewUI paramWalletOrderInfoNewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47443);
    int i = WalletOrderInfoNewUI.f(this.tIz).getHeight();
    int j = this.tIz.findViewById(2131825792).getHeight();
    int k;
    label60: int n;
    if (WalletOrderInfoNewUI.g(this.tIz).getVisibility() == 0)
    {
      k = 1;
      if (WalletOrderInfoNewUI.h(this.tIz).getVisibility() != 0)
        break label313;
      m = 1;
      if (WalletOrderInfoNewUI.i(this.tIz).getVisibility() != 0)
        break label319;
      n = 1;
      label76: if (m == 0)
        break label344;
    }
    label313: label319: label344: for (int m = WalletOrderInfoNewUI.h(this.tIz).getBottom(); ; m = -1)
    {
      if (k != 0)
        m = WalletOrderInfoNewUI.g(this.tIz).getBottom();
      while (true)
      {
        if (n != 0)
          m = WalletOrderInfoNewUI.i(this.tIz).getBottom();
        k = m;
        if (m <= 0)
          k = this.tIz.findViewById(2131828703).getBottom();
        if ((WalletOrderInfoNewUI.j(this.tIz).getVisibility() != 0) && (WalletOrderInfoNewUI.c(this.tIz).getVisibility() != 0));
        for (m = a.fromDPToPix(this.tIz, 70) + i; ; m = i)
        {
          i = j - k - m;
          n = a.fromDPToPix(this.tIz, 50);
          ab.i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(n) });
          ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)WalletOrderInfoNewUI.f(this.tIz).getLayoutParams();
          if (i > n);
          for (localMarginLayoutParams.topMargin = i; ; localMarginLayoutParams.topMargin = n)
          {
            WalletOrderInfoNewUI.f(this.tIz).setLayoutParams(localMarginLayoutParams);
            WalletOrderInfoNewUI.f(this.tIz).setVisibility(0);
            AppMethodBeat.o(47443);
            return;
            k = 0;
            break;
            m = 0;
            break label60;
            n = 0;
            break label76;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.17
 * JD-Core Version:    0.6.2
 */