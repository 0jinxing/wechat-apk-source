package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class d extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48620);
    ab.d("MicroMsg.WXCreditManagerProcess", "start Process : WXCreditManagerProcess");
    b(paramActivity, WalletWXCreditDetailUI.class, paramBundle);
    AppMethodBeat.o(48620);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48624);
    if ((paramMMActivity instanceof WalletWXCreditDetailUI))
    {
      paramMMActivity = new d.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48624);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletCheckPwdUI))
      {
        paramMMActivity = new d.2(this, paramMMActivity, parami);
        AppMethodBeat.o(48624);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48624);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48621);
    if (paramInt == 1)
    {
      b(paramActivity, WalletWXCreditErrDetailUI.class, paramBundle);
      paramActivity.finish();
      AppMethodBeat.o(48621);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletWXCreditDetailUI))
      {
        b(paramActivity, WalletCheckPwdUI.class, paramBundle);
        AppMethodBeat.o(48621);
      }
      else if ((paramActivity instanceof WalletCheckPwdUI))
      {
        b(paramActivity, paramBundle);
        AppMethodBeat.o(48621);
      }
      else
      {
        if ((paramActivity instanceof WalletWXCreditErrDetailUI))
          b(paramActivity, WalletCheckPwdUI.class, paramBundle);
        AppMethodBeat.o(48621);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48623);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    AppMethodBeat.o(48623);
  }

  public final String bxP()
  {
    return "WXCreditManagerProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48622);
    F(paramActivity);
    AppMethodBeat.o(48622);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.d
 * JD-Core Version:    0.6.2
 */