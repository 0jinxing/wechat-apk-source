package com.tencent.mm.plugin.gwallet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.a;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class GWalletQueryProvider$1
  implements b.a
{
  GWalletQueryProvider$1(GWalletQueryProvider paramGWalletQueryProvider)
  {
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(41669);
    ab.d("MicroMsg.GWalletQueryProvider", "Setup finished.");
    if (!paramc.isSuccess())
    {
      ab.e("MicroMsg.GWalletQueryProvider", "Problem setting up in-app billing: ".concat(String.valueOf(paramc)));
      GWalletQueryProvider.a(this.npC);
      if (GWalletQueryProvider.b(this.npC) != null)
        GWalletQueryProvider.b(this.npC).dispose();
      GWalletQueryProvider.c(this.npC);
      AppMethodBeat.o(41669);
    }
    while (true)
    {
      return;
      g.RS().a(new GWalletQueryProvider.1.1(this));
      AppMethodBeat.o(41669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletQueryProvider.1
 * JD-Core Version:    0.6.2
 */