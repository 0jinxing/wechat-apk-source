package com.tencent.mm.plugin.appbrand.widget.input.a;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static final b jij;

  static
  {
    AppMethodBeat.i(123936);
    jij = new a.1();
    AppMethodBeat.o(123936);
  }

  public static b aRx()
  {
    AppMethodBeat.i(123935);
    b localb = (b)e.B(b.class);
    if (localb == null)
    {
      localb = jij;
      AppMethodBeat.o(123935);
    }
    while (true)
    {
      return localb;
      AppMethodBeat.o(123935);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.a.a
 * JD-Core Version:    0.6.2
 */