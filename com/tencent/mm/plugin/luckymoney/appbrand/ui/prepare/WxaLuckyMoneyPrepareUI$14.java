package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.g;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.wallet_core.ui.e;

final class WxaLuckyMoneyPrepareUI$14
  implements j.a
{
  WxaLuckyMoneyPrepareUI$14(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, SpannableString paramSpannableString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42069);
    int i = WxaLuckyMoneyPrepareUI.c(this.nTo).getInput();
    double d = WxaLuckyMoneyPrepareUI.b(this.nTo).getInput();
    WxaLuckyMoneyPrepareUI.a(this.nTo, h.a.nRY);
    WxaLuckyMoneyPrepareUI.b(this.nTo).setType(WxaLuckyMoneyPrepareUI.e(this.nTo));
    WxaLuckyMoneyPrepareUI.b(this.nTo).setShowGroupIcon(false);
    WxaLuckyMoneyPrepareUI.b(this.nTo).setTitle(this.nTo.getString(2131301212));
    if ((d > 0.0D) && (i > 0))
      WxaLuckyMoneyPrepareUI.b(this.nTo).setAmount(e.F(d / i));
    WxaLuckyMoneyPrepareUI.b(this.nTo).setMaxAmount(g.nRN.nRP);
    WxaLuckyMoneyPrepareUI.g(this.nTo).setText(this.nTt);
    AppMethodBeat.o(42069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.14
 * JD-Core Version:    0.6.2
 */