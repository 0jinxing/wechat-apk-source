package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class w$8
  implements w.a
{
  w$8(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105446);
    if ((paramFile.isFile()) || (!paramFile.exists()))
    {
      paramFile = j.gXG;
      AppMethodBeat.o(105446);
    }
    while (true)
    {
      return paramFile;
      if (paramFile.equals(this.gYy.awW()))
      {
        paramFile = j.gXE;
        AppMethodBeat.o(105446);
      }
      else if (((Boolean)paramArrayOfObject[0]).booleanValue())
      {
        d.d("MicroMsg.LuggageNonFlattenedFileSystem", "rmdir recursive");
        try
        {
          l.E(paramFile);
          paramFile = j.gXA;
          AppMethodBeat.o(105446);
        }
        catch (Exception paramFile)
        {
          d.e("MicroMsg.LuggageNonFlattenedFileSystem", "rmdir recursive exp = %s", new Object[] { paramFile });
          paramFile = j.gXB;
          AppMethodBeat.o(105446);
        }
      }
      else
      {
        paramArrayOfObject = paramFile.listFiles();
        if (paramArrayOfObject.length > 0)
        {
          if (paramArrayOfObject.length != 1)
            break label187;
          if (paramArrayOfObject[0].getName().equals(".nomedia"))
            paramArrayOfObject[0].delete();
        }
        else
        {
          if (!paramFile.delete())
            break label199;
          paramFile = j.gXA;
          AppMethodBeat.o(105446);
          continue;
        }
        paramFile = j.gXH;
        AppMethodBeat.o(105446);
        continue;
        label187: paramFile = j.gXH;
        AppMethodBeat.o(105446);
        continue;
        label199: paramFile = j.gXB;
        AppMethodBeat.o(105446);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.8
 * JD-Core Version:    0.6.2
 */