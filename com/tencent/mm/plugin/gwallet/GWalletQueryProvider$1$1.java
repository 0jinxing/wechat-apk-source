package com.tencent.mm.plugin.gwallet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.sdk.platformtools.al.a;

final class GWalletQueryProvider$1$1
  implements al.a
{
  GWalletQueryProvider$1$1(GWalletQueryProvider.1 param1)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(41666);
    GWalletQueryProvider.d(this.npD.npC);
    AppMethodBeat.o(41666);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(41667);
    if (GWalletQueryProvider.b(this.npD.npC) != null)
      GWalletQueryProvider.b(this.npD.npC).dispose();
    GWalletQueryProvider.c(this.npD.npC);
    AppMethodBeat.o(41667);
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(41668);
    String str = super.toString() + "|onIabSetupFinished";
    AppMethodBeat.o(41668);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletQueryProvider.1.1
 * JD-Core Version:    0.6.2
 */