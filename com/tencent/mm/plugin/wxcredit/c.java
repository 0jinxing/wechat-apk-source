package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.e;

public class c extends com.tencent.mm.wallet_core.c
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48611);
    ab.d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditCheckPwdProcess");
    b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(48611);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48615);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new c.1(this, paramMMActivity, parami);
      AppMethodBeat.o(48615);
    }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(48615);
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48612);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      e.n(paramActivity, paramBundle.getString("key_url"), false);
      AppMethodBeat.o(48612);
    }
    while (true)
    {
      return;
      b(paramActivity, paramBundle);
      AppMethodBeat.o(48612);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48614);
    d(paramActivity, "mall", ".ui.MallIndexUI");
    AppMethodBeat.o(48614);
  }

  public final String bxP()
  {
    return "WXCreditCheckPwdProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48613);
    F(paramActivity);
    AppMethodBeat.o(48613);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.c
 * JD-Core Version:    0.6.2
 */