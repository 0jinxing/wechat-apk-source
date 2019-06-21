package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

class aw
  implements FileFilter
{
  aw(an paraman)
  {
  }

  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(64404);
    boolean bool = paramFile.getName().endsWith(".jar");
    AppMethodBeat.o(64404);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aw
 * JD-Core Version:    0.6.2
 */