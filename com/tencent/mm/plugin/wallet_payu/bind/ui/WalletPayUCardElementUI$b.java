package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery;
import com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery.PayUBankcardElement;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.HashMap;
import java.util.HashSet;

public final class WalletPayUCardElementUI$b
{
  boolean tSY;
  boolean tSZ;
  boolean tTa;

  protected WalletPayUCardElementUI$b(WalletPayUCardElementUI paramWalletPayUCardElementUI)
  {
  }

  protected final void cTc()
  {
    AppMethodBeat.i(48364);
    this.tSY = WalletPayUCardElementUI.c(this.tSX).asa();
    this.tSZ = WalletPayUCardElementUI.b(this.tSX).asa();
    this.tTa = WalletPayUCardElementUI.a(this.tSX).asa();
    int i;
    if ((WalletPayUCardElementUI.e(this.tSX)) && (!this.tTa))
    {
      WalletPayUCardElementUI.f(this.tSX).setVisibility(0);
      WalletPayUCardElementUI.f(this.tSX).setText(2131304650);
      if (!WalletPayUCardElementUI.g(this.tSX))
        break label508;
      if (this.tSY)
        break label207;
      WalletPayUCardElementUI.h(this.tSX).setVisibility(0);
      WalletPayUCardElementUI.h(this.tSX).setTextColor(this.tSX.getResources().getColor(2131690384));
      WalletPayUCardElementUI.h(this.tSX).setText(2131304636);
      i = 0;
    }
    while (true)
    {
      label151: if ((this.tSY) && (this.tSZ) && (this.tTa) && (i == 0))
      {
        WalletPayUCardElementUI.j(this.tSX).setEnabled(true);
        AppMethodBeat.o(48364);
      }
      while (true)
      {
        return;
        WalletPayUCardElementUI.f(this.tSX).setVisibility(4);
        break;
        label207: if ((WalletPayUCardElementUI.d(this.tSX).containsKey(WalletPayUCardElementUI.c(this.tSX).getText())) && (!WalletPayUCardElementUI.i(this.tSX).contains(WalletPayUCardElementUI.c(this.tSX).getText())))
        {
          NetScenePayUElementQuery.PayUBankcardElement localPayUBankcardElement = (NetScenePayUElementQuery.PayUBankcardElement)WalletPayUCardElementUI.d(this.tSX).get(WalletPayUCardElementUI.c(this.tSX).getText());
          WalletPayUCardElementUI.h(this.tSX).setVisibility(0);
          if (!bo.isNullOrNil(localPayUBankcardElement.tSG))
          {
            WalletPayUCardElementUI.h(this.tSX).setTextColor(this.tSX.getResources().getColor(2131690164));
            WalletPayUCardElementUI.h(this.tSX).setText(localPayUBankcardElement.tSH);
            i = 0;
            break label151;
          }
          WalletPayUCardElementUI.h(this.tSX).setTextColor(this.tSX.getResources().getColor(2131690384));
          WalletPayUCardElementUI.h(this.tSX).setText(localPayUBankcardElement.tSH);
          this.tSY = false;
          i = 0;
          break label151;
        }
        this.tSX.a(new NetScenePayUElementQuery(WalletPayUCardElementUI.c(this.tSX).getText()), false, false);
        WalletPayUCardElementUI.i(this.tSX).add(WalletPayUCardElementUI.c(this.tSX).getText());
        WalletPayUCardElementUI.h(this.tSX).setVisibility(0);
        WalletPayUCardElementUI.h(this.tSX).setTextColor(this.tSX.getResources().getColor(2131690164));
        WalletPayUCardElementUI.h(this.tSX).setText(this.tSX.getString(2131304615));
        i = 1;
        break label151;
        WalletPayUCardElementUI.j(this.tSX).setEnabled(false);
        AppMethodBeat.o(48364);
      }
      label508: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.b
 * JD-Core Version:    0.6.2
 */