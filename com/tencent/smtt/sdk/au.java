package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

class au
  implements FileFilter
{
  au(an paraman)
  {
  }

  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(64402);
    boolean bool;
    if ((!paramFile.getName().endsWith(".dex")) && (!paramFile.getName().endsWith(".jar_is_first_load_dex_flag_file")))
    {
      bool = true;
      AppMethodBeat.o(64402);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(64402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.au
 * JD-Core Version:    0.6.2
 */