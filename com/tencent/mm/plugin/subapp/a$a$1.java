package com.tencent.mm.plugin.subapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$a$1
  implements ap.a
{
  a$a$1(a.a parama, int paramInt)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25158);
    if (this.srZ.srP)
      AppMethodBeat.o(25158);
    while (true)
    {
      return false;
      ab.d("MicroMsg.SubCoreSubapp", "timmer get, delay:%d", new Object[] { Integer.valueOf(this.srY) });
      this.srZ.a(a.a.a.ssd);
      AppMethodBeat.o(25158);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a.a.1
 * JD-Core Version:    0.6.2
 */