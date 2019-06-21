package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;

public final class m$1
  implements View.OnClickListener
{
  public m$1(String paramString, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47392);
    Intent localIntent = new Intent();
    paramView = this.tHO;
    ab.i("MicroMsg.WalletIdCardTip", "go to url %s", new Object[] { paramView });
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("geta8key_username", r.Yz());
    localIntent.putExtra("pay_channel", 1);
    d.b(this.val$context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(47392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.1
 * JD-Core Version:    0.6.2
 */