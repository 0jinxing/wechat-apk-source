package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$6 extends w.b
{
  w$6(w paramw)
  {
    super(paramw, (byte)0);
  }

  public final j G(File paramFile)
  {
    AppMethodBeat.i(105444);
    if (!paramFile.exists())
    {
      paramFile = j.gXG;
      AppMethodBeat.o(105444);
    }
    while (true)
    {
      return paramFile;
      if (paramFile.isDirectory())
      {
        paramFile = j.gXA;
        AppMethodBeat.o(105444);
      }
      else
      {
        paramFile = j.gXI;
        AppMethodBeat.o(105444);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.6
 * JD-Core Version:    0.6.2
 */