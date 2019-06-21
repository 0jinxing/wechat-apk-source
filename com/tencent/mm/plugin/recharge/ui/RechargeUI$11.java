package com.tencent.mm.plugin.recharge.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class RechargeUI$11
  implements View.OnClickListener
{
  RechargeUI$11(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44317);
    paramView = new Intent();
    paramView.putExtra("rawUrl", RechargeUI.a(this.pHV));
    d.b(this.pHV, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(44317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.11
 * JD-Core Version:    0.6.2
 */