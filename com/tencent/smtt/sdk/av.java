package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

class av
  implements FileFilter
{
  av(an paraman)
  {
  }

  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(64403);
    boolean bool = paramFile.getName().endsWith(".jar");
    AppMethodBeat.o(64403);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.av
 * JD-Core Version:    0.6.2
 */