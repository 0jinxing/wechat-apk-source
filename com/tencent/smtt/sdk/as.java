package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

class as
  implements FileFilter
{
  as(ar paramar)
  {
  }

  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(64399);
    boolean bool = paramFile.getName().endsWith(".dex");
    AppMethodBeat.o(64399);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.as
 * JD-Core Version:    0.6.2
 */