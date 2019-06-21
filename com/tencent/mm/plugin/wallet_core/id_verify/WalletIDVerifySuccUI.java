package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletIDVerifySuccUI extends WalletBaseUI
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
    AppMethodBeat.i(46612);
    super.onCreate(paramBundle);
    AppMethodBeat.o(46612);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletIDVerifySuccUI
 * JD-Core Version:    0.6.2
 */