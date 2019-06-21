package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.wallet.balance.a.a.l;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.g;

@a(7)
public class WalletLqtBeforeSaveUI extends WalletBaseUI
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
    AppMethodBeat.i(45514);
    super.onCreate(paramBundle);
    paramBundle = g.b(this, false, null);
    new l().acy().b(new WalletLqtBeforeSaveUI.1(this, paramBundle));
    AppMethodBeat.o(45514);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45515);
    super.onDestroy();
    AppMethodBeat.o(45515);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI
 * JD-Core Version:    0.6.2
 */