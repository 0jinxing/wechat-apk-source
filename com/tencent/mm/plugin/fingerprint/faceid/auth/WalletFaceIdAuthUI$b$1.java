package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletFaceIdAuthUI$b$1
  implements a
{
  WalletFaceIdAuthUI$b$1(WalletFaceIdAuthUI.b paramb)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41377);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
    this.mqZ.mrc.bgk();
    if (paramInt == 0)
    {
      this.mqZ.mrc.mqV.setEnabled(true);
      AppMethodBeat.o(41377);
    }
    while (true)
    {
      return;
      this.mqZ.mrc.Ml(this.mqZ.mrc.getString(2131297634));
      AppMethodBeat.o(41377);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.b.1
 * JD-Core Version:    0.6.2
 */