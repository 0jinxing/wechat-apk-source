package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletPayUBalanceManagerUI extends WalletBalanceManagerUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48326);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof a)))
      cu();
    AppMethodBeat.o(48326);
    return false;
  }

  public final void cMZ()
  {
    AppMethodBeat.i(48325);
    s.cNC();
    if (s.cND().thy == null);
    for (boolean bool = true; ; bool = false)
    {
      a(new a(), bool, false);
      AppMethodBeat.o(48325);
      return;
    }
  }

  public final void cNa()
  {
    AppMethodBeat.i(48327);
    aA(WalletPayUBalanceSaveUI.class);
    AppMethodBeat.o(48327);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48324);
    super.onCreate(paramBundle);
    AppMethodBeat.o(48324);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceManagerUI
 * JD-Core Version:    0.6.2
 */