package com.tencent.mm.plugin.offline.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;

final class a$4
  implements bk.a
{
  public final void a(e parame)
  {
    AppMethodBeat.i(43649);
    if ((parame == null) || (parame.adg() == null))
    {
      ab.e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
      AppMethodBeat.o(43649);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = parame.adg().qr("offline_token");
      if (arrayOfByte != null)
        a.access$002(new String(arrayOfByte));
      arrayOfByte = parame.adg().qr("offline_token_V2");
      if (arrayOfByte != null)
        a.paZ = new String(arrayOfByte);
      parame = parame.adg().qr("offline_key_list");
      if (parame != null)
        a.pbc = new String(parame);
      AppMethodBeat.o(43649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.c.a.4
 * JD-Core Version:    0.6.2
 */