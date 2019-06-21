package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gwallet.a.b.a;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class GWalletUI$1
  implements b.a
{
  GWalletUI$1(GWalletUI paramGWalletUI)
  {
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(41674);
    ab.d("MicroMsg.GWalletUI", "Setup finished.");
    if (!paramc.isSuccess())
    {
      ab.e("MicroMsg.GWalletUI", "Problem setting up in-app billing: ".concat(String.valueOf(paramc)));
      Intent localIntent = new Intent();
      localIntent.putExtra("RESPONSE_CODE", paramc.bFQ());
      GWalletUI.a(this.npE, -1, localIntent);
      AppMethodBeat.o(41674);
    }
    while (true)
    {
      return;
      if ("com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(this.npE.getIntent().getAction()))
      {
        GWalletUI.a(this.npE);
        AppMethodBeat.o(41674);
      }
      else
      {
        this.npE.hW(this.npE.getIntent().getBooleanExtra("is_direct", true));
        AppMethodBeat.o(41674);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletUI.1
 * JD-Core Version:    0.6.2
 */