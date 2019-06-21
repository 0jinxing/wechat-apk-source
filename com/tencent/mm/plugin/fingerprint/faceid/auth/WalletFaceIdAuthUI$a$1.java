package com.tencent.mm.plugin.fingerprint.faceid.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletFaceIdAuthUI$a$1
  implements a
{
  WalletFaceIdAuthUI$a$1(WalletFaceIdAuthUI.a parama)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41368);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
    this.mqY.mrc.bgk();
    if (paramInt == 0)
    {
      this.mqY.bwX();
      AppMethodBeat.o(41368);
    }
    while (true)
    {
      return;
      this.mqY.mrc.Ml(this.mqY.mrc.getString(2131297634));
      AppMethodBeat.o(41368);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.a.1
 * JD-Core Version:    0.6.2
 */