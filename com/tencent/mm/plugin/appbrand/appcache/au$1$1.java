package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class au$1$1
  implements FileFilter
{
  au$1$1(au.1 param1)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(129425);
    boolean bool = paramFile.isFile();
    AppMethodBeat.o(129425);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.au.1.1
 * JD-Core Version:    0.6.2
 */