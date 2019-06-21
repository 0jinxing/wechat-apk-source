package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class NewFileExplorerUI$a$1
  implements FileFilter
{
  NewFileExplorerUI$a$1(NewFileExplorerUI.a parama)
  {
  }

  public final boolean accept(File paramFile)
  {
    boolean bool = false;
    AppMethodBeat.i(28182);
    if (paramFile.isHidden())
      AppMethodBeat.o(28182);
    while (true)
    {
      return bool;
      if ((NewFileExplorerUI.a.d(this.vve)) && (paramFile.isDirectory()))
      {
        AppMethodBeat.o(28182);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(28182);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.a.1
 * JD-Core Version:    0.6.2
 */