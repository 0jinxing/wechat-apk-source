package com.tencent.luggage.d;

import com.tencent.luggage.bridge.f;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.d.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$3
  implements com.tencent.luggage.d.a.c
{
  k$3(k paramk, c paramc)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(90815);
    if (this.bPK == null)
    {
      com.tencent.luggage.g.d.e("Luggage.LuggageWebCore", "Null Event, Ignore");
      AppMethodBeat.o(90815);
    }
    while (true)
    {
      return;
      if (paramb == b.bPW)
      {
        paramb = this.bPI.bOA;
        com.tencent.luggage.bridge.d locald = new com.tencent.luggage.bridge.d(this.bPK.name(), this.bPK.wQ());
        paramb.bOH.a(locald);
      }
      AppMethodBeat.o(90815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.k.3
 * JD-Core Version:    0.6.2
 */