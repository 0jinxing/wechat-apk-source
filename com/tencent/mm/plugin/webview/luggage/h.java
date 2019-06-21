package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class h
{
  private static Set<n> uiT;

  static
  {
    AppMethodBeat.i(6156);
    uiT = new HashSet();
    AppMethodBeat.o(6156);
  }

  public static void b(n paramn)
  {
    AppMethodBeat.i(6154);
    uiT.add(paramn);
    AppMethodBeat.o(6154);
  }

  public static void c(n paramn)
  {
    AppMethodBeat.i(6155);
    uiT.remove(paramn);
    AppMethodBeat.o(6155);
  }

  public static Set<n> cXb()
  {
    return uiT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.h
 * JD-Core Version:    0.6.2
 */