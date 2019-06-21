package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$4$1
  implements u.a
{
  g$4$1(g.4 param4)
  {
  }

  public final void BX(String paramString)
  {
    AppMethodBeat.i(6124);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.GameWebViewMenuListHelper", "share image to friend fail, imgPath is null");
      AppMethodBeat.o(6124);
    }
    while (true)
    {
      return;
      g.a(this.uiM.uiJ, paramString);
      AppMethodBeat.o(6124);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.4.1
 * JD-Core Version:    0.6.2
 */