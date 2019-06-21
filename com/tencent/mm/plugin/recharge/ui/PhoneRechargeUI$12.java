package com.tencent.mm.plugin.recharge.ui;

import android.content.res.Resources;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class PhoneRechargeUI$12
  implements MallFormView.a
{
  PhoneRechargeUI$12(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(44265);
    String str;
    if (paramBoolean)
    {
      this.pHs.aqX();
      str = b.ws(PhoneRechargeUI.a(this.pHs).getText());
      if (str == null)
      {
        ab.e("MicroMsg.PhoneRechargeUI", "null phone, return");
        AppMethodBeat.o(44265);
      }
    }
    while (true)
    {
      return;
      d.g(new PhoneRechargeUI.12.1(this, str), "search_matched_mobile");
      if (!PhoneRechargeUI.c(this.pHs))
      {
        ab.d("MicroMsg.PhoneRechargeUI", "clear focus");
        PhoneRechargeUI.a(this.pHs, true);
        AppMethodBeat.o(44265);
      }
      else
      {
        PhoneRechargeUI.a(this.pHs, false);
        AppMethodBeat.o(44265);
        continue;
        PhoneRechargeUI.a(this.pHs).getTipsTv().setText("");
        PhoneRechargeUI.a(this.pHs).getTipsTv().setTextColor(this.pHs.getResources().getColor(2131690316));
        PhoneRechargeUI.d(this.pHs);
        PhoneRechargeUI.e(this.pHs);
        if (bo.isNullOrNil(PhoneRechargeUI.a(this.pHs).getText()))
          ((AutoCompleteTextView)PhoneRechargeUI.a(this.pHs).getContentEditText()).showDropDown();
        AppMethodBeat.o(44265);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.12
 * JD-Core Version:    0.6.2
 */