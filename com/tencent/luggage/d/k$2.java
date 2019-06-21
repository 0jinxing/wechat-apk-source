package com.tencent.luggage.d;

import com.tencent.luggage.d.a.b;
import com.tencent.luggage.d.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$2
  implements c
{
  k$2(k paramk, a parama, com.tencent.luggage.bridge.k paramk1)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(90814);
    if (paramb == b.bPW)
    {
      a locala = this.bPH;
      paramb = this.bPH;
      com.tencent.luggage.bridge.k localk = this.bPJ;
      a.a locala1 = new a.a(paramb);
      locala1.bOZ = paramb.bOY;
      locala1.bPa = localk;
      locala.a(locala1);
      AppMethodBeat.o(90814);
    }
    while (true)
    {
      return;
      this.bPJ.a("system:access_denied", null);
      AppMethodBeat.o(90814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.k.2
 * JD-Core Version:    0.6.2
 */