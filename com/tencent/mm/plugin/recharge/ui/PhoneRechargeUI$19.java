package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.protocal.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

final class PhoneRechargeUI$19
  implements View.OnClickListener
{
  PhoneRechargeUI$19(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44273);
    if (PhoneRechargeUI.f(this.pHs) != null)
    {
      g.gu(6, 1);
      if ((PhoneRechargeUI.a(this.pHs, PhoneRechargeUI.f(this.pHs).tmN, PhoneRechargeUI.f(this.pHs).fjD)) || (bo.isNullOrNil(PhoneRechargeUI.f(this.pHs).url)));
    }
    while (true)
    {
      try
      {
        paramView = URLDecoder.decode(PhoneRechargeUI.f(this.pHs).url, "utf-8");
        PhoneRechargeUI.c(this.pHs, paramView);
        AppMethodBeat.o(44273);
        return;
      }
      catch (UnsupportedEncodingException paramView)
      {
        ab.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramView, "", new Object[0]);
      }
      AppMethodBeat.o(44273);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.19
 * JD-Core Version:    0.6.2
 */