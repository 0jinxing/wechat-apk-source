package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.model.c;
import com.tencent.mm.plugin.wallet_payu.bind.model.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUBankcardManageUI extends WalletBankcardManageUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48357);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      cNw();
      bool = true;
      AppMethodBeat.o(48357);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48357);
    }
  }

  public final com.tencent.mm.plugin.wallet.bind.ui.a cNu()
  {
    AppMethodBeat.i(48358);
    a locala = new a(this, this.tlM);
    AppMethodBeat.o(48358);
    return locala;
  }

  public final void cNv()
  {
    AppMethodBeat.i(48356);
    com.tencent.mm.wallet_core.a.a(this, c.class, null);
    AppMethodBeat.o(48356);
  }

  public final void d(Bankcard paramBankcard)
  {
    AppMethodBeat.i(48359);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, d.class, localBundle);
    AppMethodBeat.o(48359);
  }

  public final void mV(boolean paramBoolean)
  {
    AppMethodBeat.i(48355);
    if (paramBoolean)
    {
      a(new com.tencent.mm.plugin.wallet_core.c.b.a(), false, false);
      AppMethodBeat.o(48355);
    }
    while (true)
    {
      return;
      a(new com.tencent.mm.plugin.wallet_core.c.b.a(), true, false);
      AppMethodBeat.o(48355);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48354);
    super.onCreate(paramBundle);
    AppMethodBeat.o(48354);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI
 * JD-Core Version:    0.6.2
 */