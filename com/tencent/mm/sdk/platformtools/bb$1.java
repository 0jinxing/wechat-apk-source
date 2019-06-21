package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class bb$1
  implements ap.a
{
  bb$1(bb parambb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(52240);
    long l = System.currentTimeMillis();
    this.xBh.pl(false);
    ab.i("MicroMsg.RWCache", "summer timer onTimerExpired e appendAll takes: " + (System.currentTimeMillis() - l) + " ms");
    AppMethodBeat.o(52240);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bb.1
 * JD-Core Version:    0.6.2
 */