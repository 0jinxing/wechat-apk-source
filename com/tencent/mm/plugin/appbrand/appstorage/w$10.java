package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$10
  implements w.a
{
  w$10(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105449);
    paramArrayOfObject = (com.tencent.mm.plugin.appbrand.r.j)paramArrayOfObject[0];
    if (!paramFile.exists())
    {
      paramFile = j.gXG;
      AppMethodBeat.o(105449);
    }
    while (true)
    {
      return paramFile;
      if (!paramFile.isFile())
      {
        paramFile = j.gXE;
        AppMethodBeat.o(105449);
      }
      else if (l.F(paramFile))
      {
        paramFile = j.gXK;
        AppMethodBeat.o(105449);
      }
      else
      {
        if (paramArrayOfObject != null)
          paramArrayOfObject.value = l.D(paramFile);
        paramFile = j.gXA;
        AppMethodBeat.o(105449);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.10
 * JD-Core Version:    0.6.2
 */