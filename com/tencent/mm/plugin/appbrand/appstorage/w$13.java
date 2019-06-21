package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$13
  implements w.a
{
  w$13(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105452);
    if (!paramFile.exists())
    {
      paramFile = j.gXG;
      AppMethodBeat.o(105452);
    }
    while (true)
    {
      return paramFile;
      int i = FileStat.stat(paramFile.getPath(), (k)paramArrayOfObject[0]);
      if (i != 0)
        d.e("MicroMsg.LuggageNonFlattenedFileSystem", "stat err %d, %s", new Object[] { Integer.valueOf(i), paramFile.getPath() });
      if (i == 0)
      {
        paramFile = j.gXA;
        AppMethodBeat.o(105452);
      }
      else
      {
        paramFile = j.gXB;
        AppMethodBeat.o(105452);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.13
 * JD-Core Version:    0.6.2
 */