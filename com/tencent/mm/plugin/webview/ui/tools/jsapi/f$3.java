package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

final class f$3
  implements FilenameFilter
{
  f$3(f paramf, String paramString)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(9022);
    boolean bool;
    if (!paramString.equals(this.uGc))
    {
      bool = true;
      AppMethodBeat.o(9022);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.f.3
 * JD-Core Version:    0.6.2
 */