package com.tencent.mm.plugin.address.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletAddAddressUI$11
  implements MenuItem.OnMenuItemClickListener
{
  WalletAddAddressUI$11(WalletAddAddressUI paramWalletAddAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(16940);
    if (!WalletAddAddressUI.e(this.gKV))
    {
      AppMethodBeat.o(16940);
      return true;
    }
    label102: String str1;
    Object localObject;
    String str2;
    String str3;
    if (WalletAddAddressUI.f(this.gKV) != 0)
    {
      WalletAddAddressUI.a(this.gKV, a.arS().ne(WalletAddAddressUI.f(this.gKV)));
      ab.d("MicroMsg.WalletAddAddressUI", "get addr " + WalletAddAddressUI.g(this.gKV).toString());
      WalletAddAddressUI.b(WalletAddAddressUI.g(this.gKV), WalletAddAddressUI.h(this.gKV));
      str1 = WalletAddAddressUI.i(this.gKV).getText();
      localObject = WalletAddAddressUI.j(this.gKV).getText();
      paramMenuItem = WalletAddAddressUI.k(this.gKV).getText();
      str2 = WalletAddAddressUI.l(this.gKV).getText();
      str3 = WalletAddAddressUI.m(this.gKV).getText();
      localObject = ((String)localObject).split(" ");
      if (localObject.length > 0)
        WalletAddAddressUI.h(this.gKV).gJa = localObject[0];
      if (localObject.length >= 2)
        WalletAddAddressUI.h(this.gKV).gJb = localObject[1];
      if (localObject.length < 3)
        break label332;
    }
    label332: for (WalletAddAddressUI.h(this.gKV).gJc = localObject[2]; ; WalletAddAddressUI.h(this.gKV).gJc = "")
    {
      WalletAddAddressUI.h(this.gKV).gJe = paramMenuItem;
      WalletAddAddressUI.h(this.gKV).gJf = str1;
      WalletAddAddressUI.h(this.gKV).gJg = str3;
      WalletAddAddressUI.h(this.gKV).gJd = str2;
      if (!bo.isNullOrNil(WalletAddAddressUI.n(this.gKV)))
        WalletAddAddressUI.h(this.gKV).gJh = WalletAddAddressUI.n(this.gKV);
      WalletAddAddressUI.o(this.gKV);
      AppMethodBeat.o(16940);
      break;
      WalletAddAddressUI.a(this.gKV, new b());
      break label102;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletAddAddressUI.11
 * JD-Core Version:    0.6.2
 */