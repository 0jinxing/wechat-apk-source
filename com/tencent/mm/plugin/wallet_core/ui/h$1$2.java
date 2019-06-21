package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1$2 extends j
{
  h$1$2(h.1 param1, Context paramContext, Bankcard paramBankcard)
  {
    super(paramContext);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47156);
    Intent localIntent = new Intent();
    paramView = this.tgn.field_forbid_url;
    ab.i("MicroMsg.WalletBankcardBottomSheetHelper", "go to url %s", new Object[] { paramView });
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("geta8key_username", r.Yz());
    localIntent.putExtra("pay_channel", 1);
    d.b(this.tEn.val$context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(47156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.h.1.2
 * JD-Core Version:    0.6.2
 */