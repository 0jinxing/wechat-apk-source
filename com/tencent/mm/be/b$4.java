package com.tencent.mm.be;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$4
  implements ap.a
{
  b$4(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78531);
    ab.i("MicroMsg.SenseWhereHelper", "time up, stop sense where sdk.");
    b.aiL();
    this.fNG.aiF();
    AppMethodBeat.o(78531);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.b.4
 * JD-Core Version:    0.6.2
 */