package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$7
  implements w.a
{
  w$7(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105445);
    if (paramFile.exists())
    {
      paramFile = j.gXF;
      AppMethodBeat.o(105445);
    }
    while (true)
    {
      return paramFile;
      if (((Boolean)paramArrayOfObject[0]).booleanValue())
      {
        if (!paramFile.mkdirs());
      }
      else
        while (paramFile.mkdir())
        {
          paramFile = j.gXA;
          AppMethodBeat.o(105445);
          break;
        }
      paramFile = j.gXB;
      AppMethodBeat.o(105445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.7
 * JD-Core Version:    0.6.2
 */