package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.protocal.protobuf.hb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.d.g;

final class WalletECardBindCardListUI$2
  implements c.a
{
  WalletECardBindCardListUI$2(WalletECardBindCardListUI paramWalletECardBindCardListUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48116);
    ab.i("MicroMsg.WalletECardBindCardListUI", "bind card end, resultCode: %s, feedbackData: %s", new Object[] { Integer.valueOf(paramInt), paramBundle });
    if (paramInt == -1)
    {
      BindCardOrder localBindCardOrder = (BindCardOrder)paramBundle.getParcelable("key_bindcard_value_result");
      if (localBindCardOrder != null)
      {
        hb localhb = new hb();
        localhb.pbn = paramBundle.getString("key_bind_card_type");
        localhb.vJH = localBindCardOrder.txK;
        localhb.tuk = paramBundle.getString("key_mobile");
        if ((!bo.isNullOrNil(localhb.vJH)) && (!bo.isNullOrNil(localhb.pbn)) && (!bo.isNullOrNil(localhb.tuk)))
        {
          this.tQC.dOE().p(new Object[] { localhb });
          AppMethodBeat.o(48116);
        }
      }
    }
    while (true)
    {
      return null;
      WalletECardBindCardListUI.c(this.tQC);
      WalletECardBindCardListUI.d(this.tQC);
      AppMethodBeat.o(48116);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.2
 * JD-Core Version:    0.6.2
 */