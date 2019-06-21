package com.tencent.mm.plugin.recharge.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

final class PhoneRechargeUI$3
  implements MenuItem.OnMenuItemClickListener
{
  PhoneRechargeUI$3(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44254);
    if (!PhoneRechargeUI.a(this.pHs, PhoneRechargeUI.i(this.pHs).tmN, PhoneRechargeUI.i(this.pHs).fjD));
    try
    {
      paramMenuItem = URLDecoder.decode(PhoneRechargeUI.i(this.pHs).url, "utf-8");
      PhoneRechargeUI.c(this.pHs, paramMenuItem);
      AppMethodBeat.o(44254);
      return false;
    }
    catch (UnsupportedEncodingException paramMenuItem)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramMenuItem, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.3
 * JD-Core Version:    0.6.2
 */