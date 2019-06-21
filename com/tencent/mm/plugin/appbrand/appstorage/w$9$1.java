package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;
import java.util.List;

final class w$9$1
  implements FileFilter
{
  w$9$1(w.9 param9, String paramString, List paramList)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105447);
    if (!paramFile.getName().endsWith(".nomedia"));
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
      {
        h localh = new h();
        localh.fileName = l.yj(paramFile.getAbsolutePath().replaceFirst(this.gYz, ""));
        this.gYC.add(localh);
      }
      AppMethodBeat.o(105447);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.9.1
 * JD-Core Version:    0.6.2
 */