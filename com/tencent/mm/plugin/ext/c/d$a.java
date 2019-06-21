package com.tencent.mm.plugin.ext.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

public final class d$a
  implements d.c
{
  public final d.b aG(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(20412);
    if (!e.ct(paramString))
    {
      ab.w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: handle not exist");
      paramString = null;
      AppMethodBeat.o(20412);
    }
    while (true)
    {
      return paramString;
      paramString = d.c(e.e(paramString, 0, -1), paramBoolean);
      AppMethodBeat.o(20412);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.d.a
 * JD-Core Version:    0.6.2
 */