package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_index.c.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletIapUI$3
  implements d
{
  WalletIapUI$3(WalletIapUI paramWalletIapUI)
  {
  }

  public final void a(b paramb, com.tencent.mm.plugin.wallet_index.b.a.c paramc)
  {
    AppMethodBeat.i(48274);
    ab.d("MicroMsg.WalletIapUI", "Consume finished: " + paramb + ", purchase: " + paramc);
    if (paramb.cSV())
    {
      WalletIapUI.a(this.tSk, 1002);
      ab.d("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Fail ! ");
    }
    while (true)
    {
      paramc = new Intent();
      paramc.putExtra("key_err_code", paramb.nqa);
      paramc.putExtra("key_err_msg", paramb.nqb);
      paramc.putStringArrayListExtra("key_response_product_ids", WalletIapUI.d(this.tSk).tRz);
      paramc.putStringArrayListExtra("key_response_series_ids", WalletIapUI.d(this.tSk).tRA);
      paramc.putExtra("key_launch_ts", a.tRs);
      this.tSk.setResult(-1, paramc);
      this.tSk.finish();
      AppMethodBeat.o(48274);
      return;
      WalletIapUI.a(this.tSk, 1000);
      ab.d("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Success ! ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.3
 * JD-Core Version:    0.6.2
 */