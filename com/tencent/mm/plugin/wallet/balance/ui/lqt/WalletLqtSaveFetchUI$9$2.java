package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ase;
import com.tencent.mm.protocal.protobuf.bnp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.wallet_core.ui.e;
import java.io.IOException;
import java.math.RoundingMode;

final class WalletLqtSaveFetchUI$9$2
  implements a<Void, bnp>
{
  WalletLqtSaveFetchUI$9$2(WalletLqtSaveFetchUI.9 param9, int paramInt)
  {
  }

  private Void a(bnp parambnp)
  {
    AppMethodBeat.i(45655);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "save finish: %s", new Object[] { Integer.valueOf(parambnp.wQn) });
    Intent localIntent = new Intent(this.tkT.tkP, WalletLqtSaveFetchFinishUI.class);
    localIntent.putExtra("key_amount", e.b(this.tkU, "100", RoundingMode.HALF_UP));
    localIntent.putExtra("key_mode", 1);
    localIntent.putExtra("profile_date_wording", parambnp.wQp);
    localIntent.putExtra("profile_upgrade_wording", parambnp.wQo);
    if (parambnp.wQq != null);
    try
    {
      localIntent.putExtra("key_guide_cell", parambnp.wQq.toByteArray());
      this.tkT.tkP.startActivity(localIntent);
      this.tkT.tkP.finish();
      parambnp = zXH;
      AppMethodBeat.o(45655);
      return parambnp;
    }
    catch (IOException parambnp)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", parambnp, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.9.2
 * JD-Core Version:    0.6.2
 */