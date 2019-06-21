package com.tencent.mm.plugin.wallet.loan;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.ui.base.a;

@a(3)
public class WalletLoanCheckPwdUI extends WalletCheckPwdUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45838);
    boolean bool;
    if (((paramm instanceof s)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      bool = false;
      AppMethodBeat.o(45838);
    }
    while (true)
    {
      return bool;
      bool = super.c(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(45838);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45837);
    super.onCreate(paramBundle);
    if (dOD() != null)
      setBackBtn(new WalletLoanCheckPwdUI.1(this));
    AppMethodBeat.o(45837);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI
 * JD-Core Version:    0.6.2
 */