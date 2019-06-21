package com.tencent.mm.plugin.shake;

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
    AppMethodBeat.i(24407);
    paramContext = new com.tencent.mm.plugin.shake.ui.a(paramContext);
    AppMethodBeat.o(24407);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.Plugin.1
 * JD-Core Version:    0.6.2
 */