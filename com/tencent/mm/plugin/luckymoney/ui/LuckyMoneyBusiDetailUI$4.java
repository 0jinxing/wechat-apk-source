package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyBusiDetailUI$4
  implements View.OnClickListener
{
  LuckyMoneyBusiDetailUI$4(LuckyMoneyBusiDetailUI paramLuckyMoneyBusiDetailUI, k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42586);
    if (!TextUtils.isEmpty(this.ocT.nUi))
    {
      ab.i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + this.ocT.nUi);
      if (this.ocT.nUi.startsWith("weixin://wxpay"))
      {
        e.QS(12);
        h.ak(this.ocR.mController.ylL, 1);
        AppMethodBeat.o(42586);
      }
    }
    while (true)
    {
      return;
      e.QS(7);
      paramView = new Intent();
      paramView.putExtra("rawUrl", this.ocT.nUi);
      d.b(this.ocR.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
      AppMethodBeat.o(42586);
      continue;
      e.QS(12);
      h.ak(this.ocR.mController.ylL, 1);
      ab.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
      AppMethodBeat.o(42586);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.4
 * JD-Core Version:    0.6.2
 */