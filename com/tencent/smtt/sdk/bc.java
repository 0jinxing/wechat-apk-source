package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class bc
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(64567);
    boolean bool;
    if (!paramFile.getName().endsWith(".dex"))
    {
      bool = true;
      AppMethodBeat.o(64567);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(64567);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bc
 * JD-Core Version:    0.6.2
 */