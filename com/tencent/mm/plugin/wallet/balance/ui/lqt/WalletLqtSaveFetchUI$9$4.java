package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.wallet_core.ui.e;
import java.math.RoundingMode;

final class WalletLqtSaveFetchUI$9$4
  implements a<Void, bqq>
{
  WalletLqtSaveFetchUI$9$4(WalletLqtSaveFetchUI.9 param9, int paramInt)
  {
  }

  private Void a(bqq parambqq)
  {
    AppMethodBeat.i(45658);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "redeem succ: %s, is_realtime_arrivial: %s, is_redeem_into_pocket: %s", new Object[] { parambqq, Boolean.valueOf(parambqq.wSW), Boolean.valueOf(parambqq.wSX) });
    if ((parambqq.wSW) && (parambqq.wSX))
    {
      parambqq = new Intent(this.tkT.tkP, WalletLqtSaveFetchFinishUI.class);
      parambqq.putExtra("key_amount", e.b(this.tkU, "100", RoundingMode.HALF_UP));
      parambqq.putExtra("key_mode", 2);
      this.tkT.tkP.startActivity(parambqq);
    }
    while (true)
    {
      this.tkT.tkP.finish();
      parambqq = zXH;
      AppMethodBeat.o(45658);
      return parambqq;
      Intent localIntent = new Intent(this.tkT.tkP, WalletLqtSaveFetchFinishProgressUI.class);
      try
      {
        localIntent.putExtra("key_redeem_res", parambqq.toByteArray());
        this.tkT.tkP.startActivity(localIntent);
      }
      catch (Exception parambqq)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", parambqq, "pass redeemFundRes error: %s", new Object[] { parambqq.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.9.4
 * JD-Core Version:    0.6.2
 */