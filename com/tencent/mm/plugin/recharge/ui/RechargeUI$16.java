package com.tencent.mm.plugin.recharge.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.sdk.platformtools.bo;

final class RechargeUI$16
  implements View.OnClickListener
{
  RechargeUI$16(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44322);
    if (!bo.isNullOrNil(RechargeUI.h(this.pHV).tDn.tDw))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", RechargeUI.h(this.pHV).tDn.tDw);
      paramView.putExtra("geta8key_username", r.Yz());
      d.b(this.pHV, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(44322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.16
 * JD-Core Version:    0.6.2
 */