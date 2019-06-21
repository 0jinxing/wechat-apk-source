package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.plugin.wear.model.f.d;
import com.tencent.mm.sdk.platformtools.ab;

final class WearMessageLogic$a extends d
{
  public int ctE;
  public int tXY;
  public int tXZ;
  public byte[] tYa;

  private WearMessageLogic$a(WearMessageLogic paramWearMessageLogic)
  {
  }

  public final void execute()
  {
    AppMethodBeat.i(26321);
    ab.i("MicroMsg.Wear.WearMessageLogic", "handle message %s", new Object[] { toString() });
    com.tencent.mm.plugin.wear.model.e.a locala = a.cUn().tXr.HL(this.tXZ);
    if (locala != null)
      locala.d(this.tXY, this.ctE, this.tXZ, this.tYa);
    AppMethodBeat.o(26321);
  }

  public final String getName()
  {
    return "HttpMessageTask";
  }

  public final String toString()
  {
    AppMethodBeat.i(26322);
    String str = String.format("connectType=%d funId=%d sessionId=%d", new Object[] { Integer.valueOf(this.tXY), Integer.valueOf(this.tXZ), Integer.valueOf(this.ctE) });
    AppMethodBeat.o(26322);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.WearMessageLogic.a
 * JD-Core Version:    0.6.2
 */