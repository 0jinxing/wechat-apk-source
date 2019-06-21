package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.a.g.a;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Pattern;

final class c$6
  implements g.a
{
  c$6(c paramc)
  {
  }

  public final String[] Nh(String paramString)
  {
    AppMethodBeat.i(136745);
    paramString = c.a.mCE.split(paramString, 2);
    AppMethodBeat.o(136745);
    return paramString;
  }

  public final String[] split(String paramString)
  {
    AppMethodBeat.i(136744);
    if (((PluginFTS)g.M(PluginFTS.class)).getFTSIndexDB().mBc)
    {
      paramString = bo.ej(c.Nm(paramString));
      AppMethodBeat.o(136744);
    }
    while (true)
    {
      return paramString;
      paramString = c.a.mCE.split(paramString);
      AppMethodBeat.o(136744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.6
 * JD-Core Version:    0.6.2
 */