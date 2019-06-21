package com.tencent.mm.plugin.wallet.bind;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45718);
    ab.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true))
      d(paramActivity, paramBundle);
    while (true)
    {
      AppMethodBeat.o(45718);
      return this;
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
  }

  public g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(45723);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new a.1(this, paramMMActivity, parami);
      AppMethodBeat.o(45723);
    }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(45723);
    }
  }

  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45720);
    if ((paramActivity instanceof WalletBankcardDetailUI))
    {
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      AppMethodBeat.o(45720);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletCheckPwdUI))
        b(paramActivity, paramBundle);
      AppMethodBeat.o(45720);
    }
  }

  public void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45722);
    if (this.mqu.getInt("scene", -1) == 1)
    {
      a(paramActivity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", paramBundle.getInt("key_process_result_code", 0), false);
      AppMethodBeat.o(45722);
    }
    while (true)
    {
      return;
      if (this.mqu.getInt("scene", -1) == 2)
      {
        d(paramActivity, "wallet", ".balance.ui.WalletBalanceManagerUI");
        AppMethodBeat.o(45722);
      }
      else
      {
        d(paramActivity, "mall", ".ui.MallIndexUI");
        AppMethodBeat.o(45722);
      }
    }
  }

  public final String bxP()
  {
    return "UnbindProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(45721);
    F(paramActivity);
    AppMethodBeat.o(45721);
  }

  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletCheckPwdUI));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void d(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45719);
    b(paramActivity, WalletBankcardDetailUI.class, paramBundle);
    AppMethodBeat.o(45719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a
 * JD-Core Version:    0.6.2
 */