package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

final class NewFileExplorerUI$a$5
  implements FilenameFilter
{
  NewFileExplorerUI$a$5(NewFileExplorerUI.a parama)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(28185);
    boolean bool;
    if (!paramString.startsWith("."))
    {
      bool = true;
      AppMethodBeat.o(28185);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28185);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.a.5
 * JD-Core Version:    0.6.2
 */