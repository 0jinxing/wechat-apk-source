package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.a;

final class WalletPasswordSettingUI$7
  implements c.a
{
  WalletPasswordSettingUI$7(WalletPasswordSettingUI paramWalletPasswordSettingUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46356);
    ab.i("MicroMsg.WalletPasswordSettingUI", "end readname process");
    paramBundle = new uq();
    if (paramInt == -1)
      paramBundle.cQP.scene = 17;
    while (true)
    {
      paramBundle.cQQ.cQH = new WalletPasswordSettingUI.7.1(this);
      a.xxA.m(paramBundle);
      AppMethodBeat.o(46356);
      return null;
      if (paramInt == 0)
        paramBundle.cQP.scene = 18;
      else
        paramBundle.cQP.scene = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.7
 * JD-Core Version:    0.6.2
 */