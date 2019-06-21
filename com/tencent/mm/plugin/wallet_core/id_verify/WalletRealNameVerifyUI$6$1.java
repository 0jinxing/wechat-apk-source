package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;

final class WalletRealNameVerifyUI$6$1
  implements h.d
{
  WalletRealNameVerifyUI$6$1(WalletRealNameVerifyUI.6 param6)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46625);
    Intent localIntent = new Intent();
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      localIntent.putExtra("showShare", false);
      d.b(this.tvz.tvy.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(46625);
      return;
      localIntent.putExtra("rawUrl", this.tvz.tvy.getString(2131304510, new Object[] { aa.dor() }));
      continue;
      if (WalletRealNameVerifyUI.e(this.tvz.tvy) != null)
        localIntent.putExtra("rawUrl", this.tvz.tvy.getString(2131304508, new Object[] { aa.dor(), WalletRealNameVerifyUI.e(this.tvz.tvy).pbn }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.6.1
 * JD-Core Version:    0.6.2
 */