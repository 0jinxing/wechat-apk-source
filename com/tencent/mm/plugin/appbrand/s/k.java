package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  public static Boolean bG(Object paramObject)
  {
    AppMethodBeat.i(87423);
    if ((paramObject instanceof Boolean))
    {
      paramObject = (Boolean)paramObject;
      AppMethodBeat.o(87423);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        if ("true".equalsIgnoreCase(paramObject))
        {
          paramObject = Boolean.TRUE;
          AppMethodBeat.o(87423);
        }
        else if ("false".equalsIgnoreCase(paramObject))
        {
          paramObject = Boolean.FALSE;
          AppMethodBeat.o(87423);
        }
      }
      else
      {
        paramObject = null;
        AppMethodBeat.o(87423);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.k
 * JD-Core Version:    0.6.2
 */