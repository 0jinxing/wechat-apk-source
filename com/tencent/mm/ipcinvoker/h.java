package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class h
{
  private static volatile h eGe;
  Map<String, BaseIPCService> eGf;

  private h()
  {
    AppMethodBeat.i(114042);
    this.eGf = new HashMap();
    AppMethodBeat.o(114042);
  }

  public static h PO()
  {
    AppMethodBeat.i(114043);
    if (eGe == null);
    try
    {
      if (eGe == null)
      {
        localh = new com/tencent/mm/ipcinvoker/h;
        localh.<init>();
        eGe = localh;
      }
      h localh = eGe;
      AppMethodBeat.o(114043);
      return localh;
    }
    finally
    {
      AppMethodBeat.o(114043);
    }
  }

  public final BaseIPCService lj(String paramString)
  {
    AppMethodBeat.i(114044);
    paramString = (BaseIPCService)this.eGf.get(paramString);
    AppMethodBeat.o(114044);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.h
 * JD-Core Version:    0.6.2
 */