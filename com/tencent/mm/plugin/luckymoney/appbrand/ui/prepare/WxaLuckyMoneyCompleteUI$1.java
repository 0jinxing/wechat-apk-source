package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyCompleteUI$1
  implements View.OnClickListener
{
  WxaLuckyMoneyCompleteUI$1(WxaLuckyMoneyCompleteUI paramWxaLuckyMoneyCompleteUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42049);
    this.nTb.setResult(0, null);
    this.nTb.finish();
    AppMethodBeat.o(42049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyCompleteUI.1
 * JD-Core Version:    0.6.2
 */