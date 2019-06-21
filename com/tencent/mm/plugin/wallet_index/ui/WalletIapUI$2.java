package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.z;

final class WalletIapUI$2
  implements d
{
  WalletIapUI$2(WalletIapUI paramWalletIapUI)
  {
  }

  public final void a(com.tencent.mm.plugin.wallet_index.c.b paramb, com.tencent.mm.plugin.wallet_index.b.a.c paramc)
  {
    AppMethodBeat.i(48273);
    ab.i("MicroMsg.WalletIapUI", "Pay Purchase finished: " + paramb + ", purchase: " + paramc);
    if ((WalletIapUI.b(this.tSk) instanceof a))
    {
      if (paramc != null)
        z.d(paramc.tQS, paramc.kWz, paramc.tQY, paramb.nqa, paramb.nqb);
    }
    else
    {
      if (!paramb.cSV())
        break label261;
      ab.i("MicroMsg.WalletIapUI", "back to preview UI, reason: purchase finish , errCode: " + paramb.nqa + " , errMsg: " + paramb.nqb);
      if (paramb.nqa != 1)
        break label247;
      WalletIapUI.a(this.tSk, 1001);
      label137: paramc = new Intent();
      paramc.putExtra("key_err_code", paramb.nqa);
      paramc.putExtra("key_err_msg", paramb.nqb);
      paramc.putExtra("key_launch_ts", a.tRs);
      paramc.putExtra("key_gw_error_code", paramb.tQZ);
      this.tSk.setResult(-1, paramc);
      this.tSk.finish();
      AppMethodBeat.o(48273);
    }
    while (true)
    {
      return;
      a locala = (a)WalletIapUI.b(this.tSk);
      z.d(locala.tRw, locala.kWz, locala.tQY, paramb.nqa, paramb.nqb);
      break;
      label247: WalletIapUI.a(this.tSk, 1002);
      break label137;
      label261: if (!paramb.cSU())
      {
        if (paramc != null)
        {
          ab.i("MicroMsg.WalletIapUI", "verify purchase! productId:" + paramc.kWz + ",billNo:" + paramc.tQV);
          g.RQ();
          g.RO().eJo.a(WalletIapUI.d(this.tSk).a(paramc, false), 0);
          WalletIapUI.b(this.tSk, 2);
          WalletIapUI.e(this.tSk);
          AppMethodBeat.o(48273);
        }
        else
        {
          WalletIapUI.a(this.tSk, 1002);
          paramc = new Intent();
          paramb = com.tencent.mm.plugin.wallet_index.c.b.bu(6, "");
          paramc.putExtra("key_err_code", paramb.nqa);
          paramc.putExtra("key_err_msg", paramb.nqb);
          paramc.putExtra("key_launch_ts", a.tRs);
          paramc.putExtra("key_gw_error_code", paramb.tQZ);
          this.tSk.setResult(-1, paramc);
          this.tSk.finish();
          AppMethodBeat.o(48273);
        }
      }
      else
      {
        WalletIapUI.b(this.tSk, 3);
        ab.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
        WalletIapUI.b(this.tSk).b(this.tSk, false);
        AppMethodBeat.o(48273);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.2
 * JD-Core Version:    0.6.2
 */