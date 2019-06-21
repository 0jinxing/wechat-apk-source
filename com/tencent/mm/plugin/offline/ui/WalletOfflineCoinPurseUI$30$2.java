package com.tencent.mm.plugin.offline.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletOfflineCoinPurseUI$30$2 extends j
{
  WalletOfflineCoinPurseUI$30$2(WalletOfflineCoinPurseUI.30 param30, Context paramContext, Bankcard paramBankcard)
  {
    super(paramContext);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43539);
    paramView = new Intent();
    String str = this.paS.field_forbid_url;
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", new Object[] { str });
    paramView.putExtra("rawUrl", str);
    paramView.putExtra("geta8key_username", r.Yz());
    paramView.putExtra("pay_channel", 1);
    d.b(this.paP.pav.mController.ylL, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(43539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.30.2
 * JD-Core Version:    0.6.2
 */