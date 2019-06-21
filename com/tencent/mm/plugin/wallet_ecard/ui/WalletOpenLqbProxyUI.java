package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletOpenLqbProxyUI extends WalletBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48160);
    super.onCreate(paramBundle);
    AM(4);
    paramBundle = dOD();
    if (paramBundle != null)
    {
      int i = this.mBundle.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.tPH, 0);
      String str = this.mBundle.getString(com.tencent.mm.plugin.wallet_ecard.a.a.tPN);
      ab.i("MicroMsg.WalletOpenLqbProxyUI", "WalletOpenLqbProxyUI onCreate, openScene: %s, extraData: %s", new Object[] { Integer.valueOf(i), str });
      if (i == 3)
      {
        dOE().p(new Object[] { Integer.valueOf(i), str });
        AppMethodBeat.o(48160);
      }
    }
    while (true)
    {
      return;
      paramBundle.b(this, this.mBundle);
      finish();
      AppMethodBeat.o(48160);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI
 * JD-Core Version:    0.6.2
 */