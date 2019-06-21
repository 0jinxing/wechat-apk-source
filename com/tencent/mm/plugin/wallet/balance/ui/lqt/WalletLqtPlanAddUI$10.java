package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.a;

final class WalletLqtPlanAddUI$10
  implements c.a
{
  WalletLqtPlanAddUI$10(WalletLqtPlanAddUI paramWalletLqtPlanAddUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45568);
    ab.i("MicroMsg.WalletLqtPlanAddUI", "bind card finish: %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == -1)
    {
      paramBundle = (BindCardOrder)paramBundle.getParcelable("key_bindcard_value_result");
      if (paramBundle != null)
      {
        ab.i("MicroMsg.WalletLqtPlanAddUI", "bind card serial: %s", new Object[] { paramBundle.txK });
        paramBundle = WalletLqtPlanAddUI.a(this.tjp, paramBundle.txK);
        if (paramBundle != null)
        {
          WalletLqtPlanAddUI.j(this.tjp).vEQ = paramBundle.field_bindSerial;
          WalletLqtPlanAddUI.j(this.tjp).pbn = paramBundle.field_bankcardType;
          WalletLqtPlanAddUI.j(this.tjp).nuL = paramBundle.field_bankName;
          WalletLqtPlanAddUI.j(this.tjp).pck = paramBundle.field_bankcardTail;
          WalletLqtPlanAddUI.k(this.tjp);
        }
      }
      WalletLqtPlanAddUI.p(this.tjp);
    }
    AppMethodBeat.o(45568);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.10
 * JD-Core Version:    0.6.2
 */