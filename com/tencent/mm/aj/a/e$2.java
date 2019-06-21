package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.bo;

final class e$2
  implements Runnable
{
  e$2(String paramString1, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11531);
    c localc = z.aeT().rq(this.fxG);
    if (localc == null)
      AppMethodBeat.o(11531);
    while (true)
    {
      return;
      if (localc.field_chatVersion < bo.getInt(this.fxH, 2147483647))
      {
        localc.field_needToUpdate = true;
        z.aeT().b(localc);
      }
      if (localc.isGroup())
      {
        z.aeZ().aD(localc.field_bizChatServId, this.fxD);
        AppMethodBeat.o(11531);
      }
      else
      {
        z.aeZ().aF(localc.field_bizChatServId, this.fxD);
        AppMethodBeat.o(11531);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.e.2
 * JD-Core Version:    0.6.2
 */