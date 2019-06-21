package com.tencent.mm.plugin.game.luggage;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements com.tencent.luggage.webview.a.c
{
  private com.tencent.mm.plugin.game.luggage.d.d mTG;

  public a(com.tencent.mm.plugin.game.luggage.d.d paramd)
  {
    this.mTG = paramd;
  }

  public final WebResourceResponse bG(String paramString)
  {
    AppMethodBeat.i(135806);
    if (Build.VERSION.SDK_INT < 21)
    {
      paramString = null;
      AppMethodBeat.o(135806);
    }
    while (true)
    {
      return paramString;
      boolean bool = false;
      if (this.mTG.getWePkgPlugin() != null)
        bool = this.mTG.getWePkgPlugin().uVv;
      paramString = com.tencent.mm.plugin.webview.ui.tools.game.d.nX(bool);
      AppMethodBeat.o(135806);
    }
  }

  public final String yk()
  {
    return "weixin://game.js";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.a
 * JD-Core Version:    0.6.2
 */