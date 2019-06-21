package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  private static a tdT;
  public i sTj;

  private a()
  {
    AppMethodBeat.i(135312);
    this.sTj = new i(ah.getContext());
    AppMethodBeat.o(135312);
  }

  public static a cMm()
  {
    AppMethodBeat.i(135313);
    if (tdT == null)
      tdT = new a();
    a locala = tdT;
    AppMethodBeat.o(135313);
    return locala;
  }

  public static a cMn()
  {
    AppMethodBeat.i(135314);
    if (tdT == null)
      tdT = cMm();
    a locala = tdT;
    AppMethodBeat.o(135314);
    return locala;
  }

  public final boolean cKq()
  {
    AppMethodBeat.i(135317);
    boolean bool;
    if (this.sTj != null)
    {
      bool = this.sTj.DB();
      AppMethodBeat.o(135317);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(135317);
    }
  }

  public final void cMo()
  {
    AppMethodBeat.i(135315);
    if (this.sTj != null)
      this.sTj.ao(0, true);
    AppMethodBeat.o(135315);
  }

  public final void stopRing()
  {
    AppMethodBeat.i(135316);
    if (this.sTj != null)
      this.sTj.stop();
    AppMethodBeat.o(135316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.a
 * JD-Core Version:    0.6.2
 */