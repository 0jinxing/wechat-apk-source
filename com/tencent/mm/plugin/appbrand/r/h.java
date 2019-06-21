package com.tencent.mm.plugin.appbrand.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class h
{
  private static final Set<Object> hvE;

  static
  {
    AppMethodBeat.i(91164);
    hvE = new HashSet();
    AppMethodBeat.o(91164);
  }

  public static void at(Object paramObject)
  {
    AppMethodBeat.i(91163);
    hvE.remove(paramObject);
    AppMethodBeat.o(91163);
  }

  public static <T> T bB(T paramT)
  {
    AppMethodBeat.i(91162);
    if (paramT != null)
      hvE.add(paramT);
    AppMethodBeat.o(91162);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.h
 * JD-Core Version:    0.6.2
 */