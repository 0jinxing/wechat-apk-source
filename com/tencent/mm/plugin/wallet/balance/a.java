package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;

public class a extends b
{
  public static int teT = 1;
  public static int teU = 2;

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45196);
    x.QN(14);
    paramActivity = super.a(paramActivity, paramBundle);
    AppMethodBeat.o(45196);
    return paramActivity;
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45198);
    x.dNV();
    Intent localIntent;
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      if (paramBundle.getInt("from_bind_ui", teU) == teT)
      {
        localIntent.putExtra("from_bind_ui", teT);
        a(paramActivity, "wallet", ".balance.ui.WalletBalanceManagerUI", -1, localIntent, true);
        AppMethodBeat.o(45198);
      }
    }
    while (true)
    {
      return;
      localIntent.putExtra("from_bind_ui", teU);
      a(paramActivity, "wallet", ".balance.ui.ltWalletLqtSaveFetchUI", -1, localIntent, true);
      AppMethodBeat.o(45198);
      continue;
      paramActivity.finish();
      AppMethodBeat.o(45198);
    }
  }

  public final String bxP()
  {
    return "BalanceFetchCardProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(45197);
    x.dNV();
    if (paramActivity != null)
      paramActivity.finish();
    AppMethodBeat.o(45197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a
 * JD-Core Version:    0.6.2
 */