package com.tencent.smtt.sdk;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class ap
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    boolean bool = false;
    AppMethodBeat.i(64397);
    paramFile = paramFile.getName();
    if (paramFile == null)
      AppMethodBeat.o(64397);
    while (true)
    {
      return bool;
      if (paramFile.endsWith(".jar_is_first_load_dex_flag_file"))
      {
        AppMethodBeat.o(64397);
      }
      else if ((Build.VERSION.SDK_INT >= 21) && (paramFile.endsWith(".dex")))
      {
        AppMethodBeat.o(64397);
      }
      else if ((Build.VERSION.SDK_INT >= 26) && (paramFile.endsWith(".prof")))
      {
        AppMethodBeat.o(64397);
      }
      else if ((Build.VERSION.SDK_INT >= 26) && (paramFile.equals("oat")))
      {
        AppMethodBeat.o(64397);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(64397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ap
 * JD-Core Version:    0.6.2
 */