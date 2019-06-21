package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

class at
  implements FileFilter
{
  at(ar paramar)
  {
  }

  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(64400);
    boolean bool = paramFile.getName().endsWith("tbs.conf");
    AppMethodBeat.o(64400);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.at
 * JD-Core Version:    0.6.2
 */