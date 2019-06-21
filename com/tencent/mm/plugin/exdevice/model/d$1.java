package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c;
import com.tencent.mm.sdk.platformtools.ah;

final class d$1
  implements c.a
{
  d$1(d paramd)
  {
  }

  public final void boD()
  {
    AppMethodBeat.i(19097);
    if (d.a(this.lrk) == null)
    {
      d.a(this.lrk, new c());
      d.a(this.lrk).lwE = null;
    }
    d.a(this.lrk).dH(ah.getContext());
    AppMethodBeat.o(19097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.1
 * JD-Core Version:    0.6.2
 */