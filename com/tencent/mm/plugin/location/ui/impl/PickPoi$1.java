package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class PickPoi$1
  implements c.a
{
  PickPoi$1(PickPoi paramPickPoi)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(113648);
    ab.d("MicroMsg.PickPoi", "onGetAddrss  %s", new Object[] { paramAddr.toString() });
    if (PickPoi.a(this.nQj) == null)
    {
      ab.i("MicroMsg.PickPoi", "error, empty poi!");
      AppMethodBeat.o(113648);
    }
    while (true)
    {
      return;
      f localf = PickPoi.a(this.nQj);
      localf.nQz = paramAddr;
      localf.nQp = paramAddr.fBg;
      localf.bDG = paramAddr.fBr;
      localf.bDH = paramAddr.fBs;
      localf.nQt = paramAddr.fBh;
      localf.nQu = paramAddr.fBi;
      localf.nQw = paramAddr.fBm;
      localf.nQy = paramAddr.fBo;
      localf.nQB = paramAddr.fBq;
      ab.d("poidata", "roughAddr %s", new Object[] { paramAddr.toString() });
      if (PickPoi.b(this.nQj) != null)
        PickPoi.b(this.nQj).notifyDataSetChanged();
      AppMethodBeat.o(113648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.PickPoi.1
 * JD-Core Version:    0.6.2
 */