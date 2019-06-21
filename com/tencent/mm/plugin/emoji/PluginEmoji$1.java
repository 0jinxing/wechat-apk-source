package com.tencent.mm.plugin.emoji;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.b.a;
import com.tencent.mm.ui.e.b.b;
import java.io.IOException;

final class PluginEmoji$1
  implements b
{
  PluginEmoji$1(PluginEmoji paramPluginEmoji)
  {
  }

  public final a dG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62318);
    try
    {
      paramString1 = c.bFN().eD(paramString1, paramString2);
      AppMethodBeat.o(62318);
      return paramString1;
    }
    catch (IOException paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.PluginEmoji", paramString1, "", new Object[0]);
        paramString1 = null;
        AppMethodBeat.o(62318);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.PluginEmoji.1
 * JD-Core Version:    0.6.2
 */