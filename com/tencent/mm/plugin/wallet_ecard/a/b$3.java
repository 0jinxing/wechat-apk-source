package com.tencent.mm.plugin.wallet_ecard.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bks;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$3
  implements DialogInterface.OnClickListener
{
  b$3(bks parambks, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48050);
    c localc;
    if (this.tQe.wvn == a.tPD)
    {
      ab.i("MicroMsg.ECardUtil", "do end process");
      localc = this.tQf.dOD();
      if (localc != null)
        localc.b(this.tQf, new Bundle());
    }
    while (true)
    {
      paramDialogInterface.dismiss();
      AppMethodBeat.o(48050);
      return;
      this.tQf.finish();
      continue;
      if (this.tQe.wvn == a.tPG)
      {
        ab.i("MicroMsg.ECardUtil", "back bank list");
        localc = this.tQf.dOD();
        if (localc != null)
          localc.c(this.tQf, 100);
        else
          this.tQf.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.b.3
 * JD-Core Version:    0.6.2
 */