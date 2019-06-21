package com.tencent.mm.plugin.nearby;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.b.b;

final class Plugin$1
  implements b
{
  Plugin$1(Plugin paramPlugin)
  {
  }

  public final com.tencent.mm.pluginsdk.b.a ac(Context paramContext, String paramString)
  {
    AppMethodBeat.i(55348);
    paramContext = new com.tencent.mm.plugin.nearby.ui.a(paramContext);
    AppMethodBeat.o(55348);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.Plugin.1
 * JD-Core Version:    0.6.2
 */