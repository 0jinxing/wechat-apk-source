package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public long eRt = 0L;
  private long jsG = -1L;
  boolean jsH = false;

  public final void begin()
  {
    AppMethodBeat.i(17760);
    ab.d("MicroMsg.Recoverfaster", "begin");
    if (b.aUY().aUZ().eJN != null)
    {
      this.jsG = b.aUY().aUZ().eJN.iV(Thread.currentThread().getId());
      this.jsH = true;
    }
    this.eRt = bo.anU();
    AppMethodBeat.o(17760);
  }

  public final void end()
  {
    AppMethodBeat.i(17761);
    if ((this.jsH) && (b.aUY().aUZ().eJN != null))
    {
      b.aUY().aUZ().eJN.mB(this.jsG);
      this.jsH = false;
    }
    AppMethodBeat.o(17761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c
 * JD-Core Version:    0.6.2
 */