package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$12 extends w.b
{
  w$12(w paramw)
  {
    super(paramw, (byte)0);
  }

  public final j G(File paramFile)
  {
    AppMethodBeat.i(105451);
    if (paramFile.isDirectory())
    {
      paramFile = j.gXJ;
      AppMethodBeat.o(105451);
    }
    while (true)
    {
      return paramFile;
      if (!paramFile.exists())
      {
        paramFile = j.gXG;
        AppMethodBeat.o(105451);
      }
      else
      {
        int i = FileUnlink.unlink(paramFile.getPath());
        if (i != 0)
          d.e("MicroMsg.LuggageNonFlattenedFileSystem", "unlink err %d, %s", new Object[] { Integer.valueOf(i), paramFile.getPath() });
        if (i == 0)
        {
          paramFile = j.gXA;
          AppMethodBeat.o(105451);
        }
        else
        {
          paramFile = j.gXB;
          AppMethodBeat.o(105451);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.12
 * JD-Core Version:    0.6.2
 */