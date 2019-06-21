package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$1 extends w.b
{
  w$1(w paramw)
  {
    super(paramw, (byte)0);
  }

  public final j G(File paramFile)
  {
    AppMethodBeat.i(105439);
    if (paramFile.exists())
    {
      paramFile = j.gXA;
      AppMethodBeat.o(105439);
    }
    while (true)
    {
      return paramFile;
      paramFile = j.gXG;
      AppMethodBeat.o(105439);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.1
 * JD-Core Version:    0.6.2
 */