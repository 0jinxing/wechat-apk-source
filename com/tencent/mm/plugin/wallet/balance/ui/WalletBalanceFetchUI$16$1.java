package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBalanceFetchUI$16$1 extends j
{
  WalletBalanceFetchUI$16$1(WalletBalanceFetchUI.16 param16, Context paramContext, Bankcard paramBankcard)
  {
    super(paramContext);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45371);
    paramView = new Intent();
    String str = this.tgn.field_forbid_url;
    ab.i("MicroMsg.WalletBalanceFetchUI", "go to url %s", new Object[] { str });
    paramView.putExtra("rawUrl", str);
    paramView.putExtra("geta8key_username", r.Yz());
    paramView.putExtra("pay_channel", 1);
    d.b(this.thl.val$context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(45371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.16.1
 * JD-Core Version:    0.6.2
 */