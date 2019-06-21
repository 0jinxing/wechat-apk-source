package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c;
import com.tencent.mm.plugin.exdevice.service.e;
import com.tencent.mm.sdk.platformtools.ah;

final class d$5
  implements Runnable
{
  d$5(d paramd, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19102);
    if (d.a(this.lrk) == null)
    {
      d.a(this.lrk, new c());
      d.a(this.lrk).lwE = new d.5.1(this);
      d.a(this.lrk).dH(ah.getContext());
      AppMethodBeat.o(19102);
    }
    while (true)
    {
      return;
      e.bpo().aB(this.lro, this.lrp);
      AppMethodBeat.o(19102);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(19103);
    String str = super.toString() + "|ranging";
    AppMethodBeat.o(19103);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.5
 * JD-Core Version:    0.6.2
 */