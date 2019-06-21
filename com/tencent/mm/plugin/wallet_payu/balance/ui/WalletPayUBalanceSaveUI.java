package com.tencent.mm.plugin.wallet_payu.balance.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI;
import com.tencent.mm.plugin.wallet_payu.balance.a.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletPayUBalanceSaveUI extends WalletBalanceSaveUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48332);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof a)))
      h.a(this, ((a)paramm).czZ, "", 11, 1);
    AppMethodBeat.o(48332);
    return false;
  }

  public final void cNd()
  {
    AppMethodBeat.i(48331);
    a(new a(this.pQV, "ZAR"), true, true);
    AppMethodBeat.o(48331);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48330);
    super.onCreate(paramBundle);
    this.tgF.setVisibility(8);
    AppMethodBeat.o(48330);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceSaveUI
 * JD-Core Version:    0.6.2
 */