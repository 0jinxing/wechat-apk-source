package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class b extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48604);
    ab.d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditChangeAmountProcess");
    b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(48604);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48608);
    if ((paramMMActivity instanceof WalletWXCreditChangeAmountUI))
    {
      paramMMActivity = new b.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48608);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletCheckPwdUI))
      {
        paramMMActivity = new b.2(this, paramMMActivity, parami);
        AppMethodBeat.o(48608);
      }
      else
      {
        paramMMActivity = null;
        AppMethodBeat.o(48608);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48605);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      b(paramActivity, WalletWXCreditChangeAmountUI.class, paramBundle);
      AppMethodBeat.o(48605);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletWXCreditChangeAmountUI))
      {
        b(paramActivity, WalletWXCreditChangeAmountResultUI.class, paramBundle);
        AppMethodBeat.o(48605);
      }
      else
      {
        if ((paramActivity instanceof WalletWXCreditChangeAmountResultUI))
          b(paramActivity, paramBundle);
        AppMethodBeat.o(48605);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48607);
    d(paramActivity, "wallet", ".bind.ui.WalletBankcardManageUI");
    AppMethodBeat.o(48607);
  }

  public final String bxP()
  {
    return "WXCreditChangeAmountProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48606);
    F(paramActivity);
    AppMethodBeat.o(48606);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.b
 * JD-Core Version:    0.6.2
 */