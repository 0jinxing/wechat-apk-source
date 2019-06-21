package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1
  implements View.OnClickListener
{
  i$1(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47312);
    if ((paramView.getTag() instanceof String))
    {
      Intent localIntent = new Intent();
      paramView = (String)paramView.getTag();
      ab.i("MicroMsg.WalletChangeBankcardAdapter", "go to url %s", new Object[] { paramView });
      localIntent.putExtra("rawUrl", paramView);
      localIntent.putExtra("geta8key_username", r.Yz());
      localIntent.putExtra("pay_channel", 1);
      d.b(i.a(this.tGO), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, WalletChangeBankcardUI.toB);
    }
    AppMethodBeat.o(47312);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.i.1
 * JD-Core Version:    0.6.2
 */