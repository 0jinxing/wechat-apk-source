package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class FileExplorerUI$a$1
  implements FileFilter
{
  FileExplorerUI$a$1(FileExplorerUI.a parama)
  {
  }

  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(105844);
    boolean bool;
    if (paramFile.isHidden())
    {
      bool = false;
      AppMethodBeat.o(105844);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(105844);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI.a.1
 * JD-Core Version:    0.6.2
 */