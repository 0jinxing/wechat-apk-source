package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.sdk.platformtools.ab;

final class m$2
  implements View.OnClickListener
{
  m$2(ECardInfo paramECardInfo, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47393);
    Intent localIntent = new Intent();
    paramView = this.tHP.tyn;
    ab.i("MicroMsg.WalletIdCardTip", "go to url %s", new Object[] { paramView });
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("geta8key_username", r.Yz());
    localIntent.putExtra("pay_channel", 1);
    d.b(this.val$context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(47393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.2
 * JD-Core Version:    0.6.2
 */