package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class WalletBalanceFetchUI$12$1
  implements n.d
{
  WalletBalanceFetchUI$12$1(WalletBalanceFetchUI.12 param12, List paramList)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45366);
    if (paramInt < this.thi.size())
    {
      WalletBalanceFetchUI.a(this.thj.the, (Bankcard)this.thi.get(paramInt));
      WalletBalanceFetchUI.c(this.thj.the);
      ab.i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", new Object[] { WalletBalanceFetchUI.b(this.thj.the).field_desc });
      localObject1 = h.pYm;
      localObject2 = WalletBalanceFetchUI.d(this.thj.the);
      if (WalletBalanceFetchUI.b(this.thj.the) != null)
      {
        paramMenuItem = WalletBalanceFetchUI.b(this.thj.the).field_bankcardType;
        if (WalletBalanceFetchUI.b(this.thj.the) == null)
          break label207;
      }
      label207: for (str = WalletBalanceFetchUI.b(this.thj.the).field_bindSerial; ; str = "")
      {
        ((h)localObject1).e(16398, new Object[] { localObject2, Integer.valueOf(2), paramMenuItem, str });
        WalletBalanceFetchUI.f(this.thj.the);
        WalletBalanceFetchUI.cMW();
        AppMethodBeat.o(45366);
        return;
        paramMenuItem = "";
        break;
      }
    }
    ab.i("MicroMsg.WalletBalanceFetchUI", "add new card");
    WalletBalanceFetchUI.e(this.thj.the);
    Object localObject2 = h.pYm;
    Object localObject1 = WalletBalanceFetchUI.d(this.thj.the);
    if (WalletBalanceFetchUI.b(this.thj.the) != null)
    {
      paramMenuItem = WalletBalanceFetchUI.b(this.thj.the).field_bankcardType;
      label274: if (WalletBalanceFetchUI.b(this.thj.the) == null)
        break label344;
    }
    label344: for (String str = WalletBalanceFetchUI.b(this.thj.the).field_bindSerial; ; str = "")
    {
      ((h)localObject2).e(16398, new Object[] { localObject1, Integer.valueOf(9), paramMenuItem, str });
      break;
      paramMenuItem = "";
      break label274;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.12.1
 * JD-Core Version:    0.6.2
 */