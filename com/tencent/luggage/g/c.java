package com.tencent.luggage.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class c
{
  public static <T> List<T> C(List<T> paramList)
  {
    AppMethodBeat.i(90874);
    if (paramList == null)
    {
      paramList = Collections.emptyList();
      AppMethodBeat.o(90874);
    }
    while (true)
    {
      return paramList;
      AppMethodBeat.o(90874);
    }
  }

  public static <L extends List<T>, T> L c(L paramL, List<T> paramList)
  {
    AppMethodBeat.i(90873);
    if (paramList != null)
      paramL.addAll(paramList);
    AppMethodBeat.o(90873);
    return paramL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.c
 * JD-Core Version:    0.6.2
 */