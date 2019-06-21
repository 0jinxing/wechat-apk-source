package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.sdk.platformtools.ab;

final class m$6
  implements View.OnClickListener
{
  m$6(ECardInfo paramECardInfo, Context paramContext, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47397);
    paramView = new Intent();
    String str = this.tHP.tyr;
    ab.i("MicroMsg.WalletIdCardTip", "go to url %s", new Object[] { str });
    paramView.putExtra("rawUrl", str);
    paramView.putExtra("geta8key_username", r.Yz());
    paramView.putExtra("pay_channel", 1);
    d.b(this.val$context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    if (this.fwD == 0)
    {
      h.pYm.e(16500, new Object[] { Integer.valueOf(4) });
      AppMethodBeat.o(47397);
    }
    while (true)
    {
      return;
      h.pYm.e(16500, new Object[] { Integer.valueOf(6) });
      AppMethodBeat.o(47397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.6
 * JD-Core Version:    0.6.2
 */