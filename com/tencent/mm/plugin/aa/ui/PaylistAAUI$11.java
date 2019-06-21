package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class PaylistAAUI$11
  implements a.a
{
  PaylistAAUI$11(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void aos()
  {
    AppMethodBeat.i(40876);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_scene_balance_manager", 0);
    d.b(this.gpC, "wallet", ".balance.ui.WalletBalanceManagerUI", localIntent);
    h.pYm.e(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(4) });
    AppMethodBeat.o(40876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.11
 * JD-Core Version:    0.6.2
 */