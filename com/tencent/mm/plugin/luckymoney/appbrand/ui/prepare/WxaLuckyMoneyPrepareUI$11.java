package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.e;

final class WxaLuckyMoneyPrepareUI$11 extends s
{
  WxaLuckyMoneyPrepareUI$11(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, String paramString)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(42066);
    if (WxaLuckyMoneyPrepareUI.a(this.nTo) == null)
    {
      ab.e("MicroMsg.WxaLuckyMoneyPrepareUI", "Click PrepareBtn but, mLogic == null");
      AppMethodBeat.o(42066);
    }
    while (true)
    {
      return;
      if (WxaLuckyMoneyPrepareUI.b(this.nTo).bKW() != 0)
      {
        t.makeText(this.nTo.mController.ylL, 2131304579, 0).show();
        AppMethodBeat.o(42066);
      }
      else
      {
        int i = WxaLuckyMoneyPrepareUI.c(this.nTo).getInput();
        double d = WxaLuckyMoneyPrepareUI.b(this.nTo).getInput();
        String str1 = WxaLuckyMoneyPrepareUI.d(this.nTo).getInput();
        String str2 = str1;
        if (bo.isNullOrNil(str1))
          if (bo.isNullOrNil(this.nTs))
            break label178;
        label178: for (str2 = this.nTs; ; str2 = this.nTo.getString(2131301090))
        {
          if (WxaLuckyMoneyPrepareUI.e(this.nTo) != h.a.nRX)
            break label192;
          WxaLuckyMoneyPrepareUI.a(this.nTo).c((int)e.H(d), i, str2, WxaLuckyMoneyPrepareUI.f(this.nTo));
          AppMethodBeat.o(42066);
          break;
        }
        label192: if (WxaLuckyMoneyPrepareUI.e(this.nTo) == h.a.nRY)
          WxaLuckyMoneyPrepareUI.a(this.nTo).d((int)e.H(d), i, str2, WxaLuckyMoneyPrepareUI.f(this.nTo));
        AppMethodBeat.o(42066);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.11
 * JD-Core Version:    0.6.2
 */