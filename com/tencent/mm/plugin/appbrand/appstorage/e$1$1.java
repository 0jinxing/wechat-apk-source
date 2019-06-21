package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class e$1$1
  implements FileFilter
{
  e$1$1(e.1 param1)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(129519);
    boolean bool;
    if ((!paramFile.getName().endsWith(".data")) && (!paramFile.getName().startsWith("store_")) && (!paramFile.getName().endsWith(".nomedia")))
    {
      bool = true;
      AppMethodBeat.o(129519);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129519);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.e.1.1
 * JD-Core Version:    0.6.2
 */