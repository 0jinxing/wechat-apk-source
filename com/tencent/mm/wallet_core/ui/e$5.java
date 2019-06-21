package com.tencent.mm.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class e$5
  implements bk.a
{
  e$5(String[] paramArrayOfString, e.a parama)
  {
  }

  public final void a(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(49260);
    if ((parame == null) || (parame.adg() == null))
      AppMethodBeat.o(49260);
    while (true)
    {
      return;
      if ((this.AhI == null) || (this.AhI.length == 0))
      {
        ab.w("MicroMsg.WalletBaseUtil ", "hy: keys is null");
        AppMethodBeat.o(49260);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        int i = 0;
        try
        {
          if (i >= this.AhI.length)
            break label183;
          String str = this.AhI[i];
          if (!bo.isNullOrNil(str))
          {
            byte[] arrayOfByte = parame.adg().qr(str);
            if (arrayOfByte != null)
              localHashMap.put(str, e.cg(arrayOfByte));
          }
          while (true)
          {
            i++;
            break;
            ab.e("MicroMsg.WalletBaseUtil ", "hy: key is null");
          }
        }
        catch (Exception parame)
        {
          ab.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", new Object[] { parame.toString() });
          if (this.AhJ != null)
            this.AhJ.ak(null);
          AppMethodBeat.o(49260);
        }
        continue;
        label183: if (this.AhJ != null)
          this.AhJ.ak(localHashMap);
        AppMethodBeat.o(49260);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.5
 * JD-Core Version:    0.6.2
 */