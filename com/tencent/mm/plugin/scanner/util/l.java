package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l
{
  private static l qis;
  byte[] qit = null;
  private byte[] qiu = null;

  public static l cij()
  {
    AppMethodBeat.i(81461);
    if (qis == null)
      qis = new l();
    l locall = qis;
    AppMethodBeat.o(81461);
    return locall;
  }

  public final void cik()
  {
    if (this.qit != null)
      this.qit = null;
    if (this.qiu != null)
      this.qiu = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.l
 * JD-Core Version:    0.6.2
 */