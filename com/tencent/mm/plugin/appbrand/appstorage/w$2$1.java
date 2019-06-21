package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;
import java.util.List;

final class w$2$1
  implements FileFilter
{
  w$2$1(w.2 param2, String paramString, List paramList)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105440);
    if (!paramFile.getName().endsWith(".nomedia"));
    for (boolean bool = true; ; bool = false)
    {
      if ((bool) && (!paramFile.isDirectory()))
      {
        u localu = new u(l.yj(paramFile.getAbsolutePath().replaceFirst(this.gYz, "")));
        FileStat.stat(paramFile.getAbsolutePath(), localu);
        this.gYA.add(localu);
      }
      AppMethodBeat.o(105440);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w.2.1
 * JD-Core Version:    0.6.2
 */