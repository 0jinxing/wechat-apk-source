package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class i$2$1
  implements u.a
{
  i$2$1(i.2 param2)
  {
  }

  public final void BX(String paramString)
  {
    AppMethodBeat.i(7627);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.WebViewLongClickHelper", "share image to friend fail, imgPath is null");
      AppMethodBeat.o(7627);
    }
    while (true)
    {
      return;
      i.a(this.uty.utx, paramString);
      AppMethodBeat.o(7627);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i.2.1
 * JD-Core Version:    0.6.2
 */