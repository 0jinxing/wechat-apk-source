package com.tencent.mm.plugin.readerapp;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class Plugin$1
  implements com.tencent.mm.pluginsdk.b.b
{
  Plugin$1(Plugin paramPlugin)
  {
  }

  public final a ac(Context paramContext, String paramString)
  {
    AppMethodBeat.i(76736);
    ab.i("MicroMsg.ReaderApp.Plugin", "create contact widget type[%s]", new Object[] { paramString });
    if ("widget_type_news".equals(paramString))
    {
      paramContext = new com.tencent.mm.plugin.readerapp.ui.b(paramContext);
      AppMethodBeat.o(76736);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(76736);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.Plugin.1
 * JD-Core Version:    0.6.2
 */