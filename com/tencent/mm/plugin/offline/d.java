package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class d extends b
{
  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(43300);
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d.1(this, paramMMActivity, parami);
      AppMethodBeat.o(43300);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new d.2(this, paramMMActivity, parami);
        AppMethodBeat.o(43300);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(43300);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43298);
    a.xxA.m(new lf());
    c(paramActivity, WalletOfflineEntranceUI.class);
    if (paramActivity != null)
      paramActivity.finish();
    AppMethodBeat.o(43298);
  }

  public final String bxP()
  {
    return "OfflineBindCardRegProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43299);
    super.c(paramActivity, paramInt);
    AppMethodBeat.o(43299);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43301);
    boolean bool = super.c(paramActivity, paramBundle);
    AppMethodBeat.o(43301);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.d
 * JD-Core Version:    0.6.2
 */