package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class e extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48639);
    if (!r.cPI().cQl())
    {
      if (!r.cPI().cQg())
        break label38;
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    }
    while (true)
    {
      AppMethodBeat.o(48639);
      return this;
      label38: b(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48643);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new e.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48643);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletCheckIdentityUI))
      {
        paramMMActivity = new e.2(this, paramMMActivity, parami);
        AppMethodBeat.o(48643);
      }
      else if ((paramMMActivity instanceof WalletVerifyCodeUI))
      {
        paramMMActivity = new e.3(this, paramMMActivity, parami);
        AppMethodBeat.o(48643);
      }
      else if ((paramMMActivity instanceof WalletBindDepositUI))
      {
        paramMMActivity = new e.4(this, paramMMActivity, parami);
        AppMethodBeat.o(48643);
      }
      else if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new e.5(this, paramMMActivity, parami);
        AppMethodBeat.o(48643);
      }
      else if ((paramMMActivity instanceof WalletWXCreditOpenResultUI))
      {
        paramMMActivity = new e.6(this, paramMMActivity, parami);
        AppMethodBeat.o(48643);
      }
      else
      {
        paramMMActivity = null;
        AppMethodBeat.o(48643);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48640);
    if ((paramActivity instanceof WalletWXCreditOpenUI))
    {
      b(paramActivity, WalletCheckIdentityUI.class, paramBundle);
      AppMethodBeat.o(48640);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletCheckPwdUI))
      {
        F(paramActivity);
        b(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
        AppMethodBeat.o(48640);
      }
      else if ((paramActivity instanceof WalletWXCreditOpenUI))
      {
        b(paramActivity, WalletCheckIdentityUI.class, paramBundle);
        AppMethodBeat.o(48640);
      }
      else if ((paramActivity instanceof WalletCheckIdentityUI))
      {
        if (paramBundle.getBoolean("key_need_bind_deposit", true))
        {
          b(paramActivity, WalletBindDepositUI.class, paramBundle);
          AppMethodBeat.o(48640);
        }
        else
        {
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(48640);
        }
      }
      else if ((paramActivity instanceof WalletBindDepositUI))
      {
        b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        AppMethodBeat.o(48640);
      }
      else if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        if (r.cPI().cQg())
        {
          b(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
          AppMethodBeat.o(48640);
        }
        else
        {
          b(paramActivity, WalletSetPasswordUI.class, paramBundle);
          AppMethodBeat.o(48640);
        }
      }
      else if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(48640);
      }
      else if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        b(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
        AppMethodBeat.o(48640);
      }
      else
      {
        if ((paramActivity instanceof WalletWXCreditOpenResultUI))
          b(paramActivity, paramBundle);
        AppMethodBeat.o(48640);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48642);
    d(paramActivity, "wallet", ".bind.ui.WalletBankcardManageUI");
    AppMethodBeat.o(48642);
  }

  public final String bxP()
  {
    return "WXCreditOpenProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48641);
    F(paramActivity);
    AppMethodBeat.o(48641);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.e
 * JD-Core Version:    0.6.2
 */