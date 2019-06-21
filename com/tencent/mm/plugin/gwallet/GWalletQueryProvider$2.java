package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gwallet.a.b.c;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class GWalletQueryProvider$2
  implements b.c
{
  GWalletQueryProvider$2(GWalletQueryProvider paramGWalletQueryProvider)
  {
  }

  public final void a(c paramc, Intent paramIntent)
  {
    AppMethodBeat.i(41670);
    ab.d("MicroMsg.GWalletQueryProvider", "query detail done! Result ".concat(String.valueOf(paramc)));
    GWalletQueryProvider.e(this.npC);
    GWalletQueryProvider.a(this.npC, paramIntent.getStringArrayListExtra("RESPONSE_QUERY_DETAIL_INFO"));
    GWalletQueryProvider.a(this.npC, paramIntent.getIntExtra("RESPONSE_CODE", 0));
    AppMethodBeat.o(41670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletQueryProvider.2
 * JD-Core Version:    0.6.2
 */