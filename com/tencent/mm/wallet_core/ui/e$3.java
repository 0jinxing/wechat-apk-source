package com.tencent.mm.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$3
  implements bk.a
{
  e$3(String paramString, e.b paramb)
  {
  }

  public final void a(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(49258);
    if ((parame == null) || (parame.adg() == null))
      AppMethodBeat.o(49258);
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.val$key))
      {
        ab.w("MicroMsg.WalletBaseUtil ", "hy: key is null");
        AppMethodBeat.o(49258);
      }
      else
      {
        try
        {
          parame = parame.adg().qr(this.val$key);
          if (this.AhH == null)
            break label151;
          if (parame == null)
            break label141;
          this.AhH.bZ(e.cg(parame));
          AppMethodBeat.o(49258);
        }
        catch (Exception parame)
        {
          ab.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", new Object[] { parame.toString() });
          if (this.AhH != null)
            this.AhH.bZ(null);
          AppMethodBeat.o(49258);
        }
        continue;
        label141: this.AhH.bZ(null);
        label151: AppMethodBeat.o(49258);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.3
 * JD-Core Version:    0.6.2
 */