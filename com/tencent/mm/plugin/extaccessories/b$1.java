package com.tencent.mm.plugin.extaccessories;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20463);
    if (!aw.RK())
      AppMethodBeat.o(20463);
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.lRF.eJM))
      {
        AppMethodBeat.o(20463);
      }
      else
      {
        long l = System.currentTimeMillis();
        bo.o(this.lRF.eJM + "image/spen/", "spen_", 259200000L);
        ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "deleteOutOfDateFile cost %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(20463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extaccessories.b.1
 * JD-Core Version:    0.6.2
 */