package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.protocal.protobuf.csl;
import com.tencent.mm.protocal.protobuf.csm;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

final class MallIndexOSUI$5
  implements MenuItem.OnMenuItemClickListener
{
  MallIndexOSUI$5(MallIndexOSUI paramMallIndexOSUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(43186);
    final csl localcsl = MallIndexOSUI.f(this.omZ).tCH;
    final boolean bool = MallIndexOSUI.f(this.omZ).tCI;
    if (bool)
    {
      paramMenuItem = new String[localcsl.wmz.size() + 1];
      paramMenuItem[localcsl.wmz.size()] = this.omZ.getString(2131304853);
    }
    while (true)
    {
      for (int i = 0; i < localcsl.wmz.size(); i++)
        paramMenuItem[i] = aa.a(((csm)localcsl.wmz.get(i)).xpD);
      paramMenuItem = new String[localcsl.wmz.size()];
    }
    h.a(this.omZ.mController.ylL, null, paramMenuItem, null, false, new h.c()
    {
      public final void iE(int paramAnonymousInt)
      {
        AppMethodBeat.i(43185);
        if (paramAnonymousInt < localcsl.wmz.size())
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", aa.a(((csm)localcsl.wmz.get(paramAnonymousInt)).xpN));
          d.b(MallIndexOSUI.5.this.omZ, "webview", ".ui.tools.WebViewUI", localIntent);
          AppMethodBeat.o(43185);
        }
        while (true)
        {
          return;
          if (bool)
            d.c(MallIndexOSUI.5.this.omZ, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
          AppMethodBeat.o(43185);
        }
      }
    });
    AppMethodBeat.o(43186);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexOSUI.5
 * JD-Core Version:    0.6.2
 */