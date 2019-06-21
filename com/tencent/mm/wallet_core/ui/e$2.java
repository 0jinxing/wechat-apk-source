package com.tencent.mm.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$2
  implements bk.a
{
  e$2(e.c[] paramArrayOfc)
  {
  }

  public final void a(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(49257);
    if ((parame == null) || (parame.adg() == null))
      AppMethodBeat.o(49257);
    while (true)
    {
      return;
      if ((this.AhG == null) || (this.AhG.length == 0))
      {
        ab.w("MicroMsg.WalletBaseUtil ", "hy: kvs is null or length is 0");
        AppMethodBeat.o(49257);
      }
      else
      {
        try
        {
          for (e.c localc : this.AhG)
            if ((localc != null) && (!bo.isNullOrNil(localc.key)))
              parame.adg().o(localc.key, e.cZ(localc.xBi));
          AppMethodBeat.o(49257);
        }
        catch (Exception parame)
        {
          ab.e("MicroMsg.WalletBaseUtil ", "hy: serialize failed: %s", new Object[] { parame.toString() });
          AppMethodBeat.o(49257);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.2
 * JD-Core Version:    0.6.2
 */