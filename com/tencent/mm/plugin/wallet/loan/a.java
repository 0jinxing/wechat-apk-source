package com.tencent.mm.plugin.wallet.loan;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.wallet_core.c;

public class a extends b
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45833);
    if (r.cPI().cQg())
      b(paramActivity, WalletLoanCheckPwdUI.class, paramBundle);
    while (true)
    {
      AppMethodBeat.o(45833);
      return this;
      super.a(paramActivity, paramBundle);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(45835);
    if (paramBundle.getBoolean("intent_bind_end", false))
      i = -1;
    a(paramActivity, WalletLoanRepaymentUI.class, i, null, true);
    AppMethodBeat.o(45835);
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(45834);
    b(paramActivity, this.mqu);
    AppMethodBeat.o(45834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.loan.a
 * JD-Core Version:    0.6.2
 */