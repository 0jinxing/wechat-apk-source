package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

final class w$2
  implements w.a
{
  w$2(w paramw)
  {
  }

  public final j a(File paramFile, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105441);
    if (!paramFile.isDirectory())
    {
      paramFile = j.gXO;
      AppMethodBeat.o(105441);
    }
    while (true)
    {
      return paramFile;
      paramArrayOfObject = (List)paramArrayOfObject[0];
      l.a(paramFile, new w.2.1(this, Pattern.quote(paramFile.getAbsolutePath()), paramArrayOfObject));
      paramFile = j.gXA;
      AppMethodBeat.o(105441);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.2
 * JD-Core Version:    0.6.2
 */