package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyPrepareUI$5
  implements View.OnFocusChangeListener
{
  WxaLuckyMoneyPrepareUI$5(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(42057);
    this.gnV.setOnClickListener(null);
    this.nTp.setOnClickListener(null);
    this.nTo.V(WxaLuckyMoneyPrepareUI.b(this.nTo), 2);
    this.nTo.V(WxaLuckyMoneyPrepareUI.c(this.nTo), 0);
    AppMethodBeat.o(42057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.5
 * JD-Core Version:    0.6.2
 */