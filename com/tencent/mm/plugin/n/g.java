package com.tencent.mm.plugin.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
{
  public long aOw = 0L;
  public long cTh = 0L;
  private boolean eif;
  public boolean llI = true;
  public boolean llJ = false;
  public long orA = 0L;
  public long orB = 0L;
  public long orC = 10L;
  public boolean orD = true;
  public boolean orE = false;
  boolean orF = false;
  boolean orG = false;
  public long orx = 0L;
  public long ory = -1L;
  public long orz = 0L;

  public g(boolean paramBoolean)
  {
    this.eif = paramBoolean;
  }

  public final void RH(String paramString)
  {
    AppMethodBeat.i(117872);
    if (!this.orD)
      AppMethodBeat.o(117872);
    while (true)
    {
      return;
      h.pYm.a(354L, 152L, 1L, false);
      h.pYm.e(13836, new Object[] { Integer.valueOf(500), Long.valueOf(bo.anT()), paramString });
      AppMethodBeat.o(117872);
    }
  }

  public final void RI(String paramString)
  {
    AppMethodBeat.i(117873);
    if (!this.orD)
      AppMethodBeat.o(117873);
    while (true)
    {
      return;
      h.pYm.a(354L, 153L, 1L, false);
      h.pYm.e(13836, new Object[] { Integer.valueOf(501), Long.valueOf(bo.anT()), paramString });
      AppMethodBeat.o(117873);
    }
  }

  public final String aZm()
  {
    AppMethodBeat.i(117871);
    String str = hashCode();
    AppMethodBeat.o(117871);
    return str;
  }

  public final void bOW()
  {
    AppMethodBeat.i(117874);
    if (!this.orD)
      AppMethodBeat.o(117874);
    while (true)
    {
      return;
      h.pYm.a(354L, 155L, 1L, false);
      h.pYm.e(13836, new Object[] { Integer.valueOf(503), Long.valueOf(bo.anT()), "" });
      AppMethodBeat.o(117874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.g
 * JD-Core Version:    0.6.2
 */