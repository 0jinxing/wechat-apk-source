package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class WalletPayUVerifyCodeUI extends WalletBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 0;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48403);
    super.onCreate(paramBundle);
    AppMethodBeat.o(48403);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48405);
    super.onDestroy();
    AppMethodBeat.o(48405);
  }

  public void onResume()
  {
    AppMethodBeat.i(48404);
    super.onResume();
    AppMethodBeat.o(48404);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI
 * JD-Core Version:    0.6.2
 */