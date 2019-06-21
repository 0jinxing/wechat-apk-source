package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class f extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48647);
    ab.d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
    if (paramBundle.getBoolean("key_is_show_detail", true))
      a(paramActivity, "wallet", ".bind.ui.WalletBankcardDetailUI", paramBundle);
    while (true)
    {
      AppMethodBeat.o(48647);
      return this;
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48651);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new f.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48651);
    }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(48651);
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48648);
    if (paramActivity.getClass().getSimpleName().equalsIgnoreCase("WalletBankcardDetailUI"))
    {
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      AppMethodBeat.o(48648);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletCheckPwdUI))
        b(paramActivity, paramBundle);
      AppMethodBeat.o(48648);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48650);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    AppMethodBeat.o(48650);
  }

  public final String bxP()
  {
    return "WXCreditUnbindProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48649);
    F(paramActivity);
    AppMethodBeat.o(48649);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.f
 * JD-Core Version:    0.6.2
 */