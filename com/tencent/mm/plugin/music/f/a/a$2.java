package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;

final class a$2
  implements ISoLibraryLoader
{
  public final String findLibPath(String paramString)
  {
    AppMethodBeat.i(137640);
    if (a.bUG() != null)
    {
      paramString = a.bUG().findLibPath(paramString);
      AppMethodBeat.o(137640);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(137640);
    }
  }

  public final boolean load(String paramString)
  {
    AppMethodBeat.i(137639);
    boolean bool;
    if (a.bUG() != null)
    {
      bool = a.bUG().load(paramString);
      AppMethodBeat.o(137639);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.a.2
 * JD-Core Version:    0.6.2
 */