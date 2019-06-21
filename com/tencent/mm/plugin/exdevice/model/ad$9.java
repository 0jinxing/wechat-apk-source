package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class ad$9
  implements n.b
{
  ad$9(ad paramad)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(19384);
    try
    {
      if (!aw.RK())
      {
        ab.w("MicroMsg.exdevice.SubCoreExDevice", "onNotifyChange,acc has not ready");
        AppMethodBeat.o(19384);
      }
      while (true)
      {
        return;
        if ((paramObject instanceof String))
        {
          al localal = aw.RS();
          paramn = new com/tencent/mm/plugin/exdevice/model/ad$9$1;
          paramn.<init>(this, paramObject);
          localal.m(paramn, 2000L);
        }
        AppMethodBeat.o(19384);
      }
    }
    catch (Exception paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.SubCoreExDevice", "ap : onNotifyChange exception %s", new Object[] { paramn.getMessage() });
        AppMethodBeat.o(19384);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ad.9
 * JD-Core Version:    0.6.2
 */