package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.b.b;

public class c extends b
{
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45502);
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      a(paramActivity, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", -1, new Intent(), true);
      AppMethodBeat.o(45502);
    }
    while (true)
    {
      return;
      paramActivity.finish();
      AppMethodBeat.o(45502);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.c
 * JD-Core Version:    0.6.2
 */