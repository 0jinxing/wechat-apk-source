package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;

@URISpanHandlerSet.a
class URISpanHandlerSet$AppBrandLinkSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$AppBrandLinkSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 45 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15635);
    boolean bool;
    if (paramm.type == 45)
      if (paramg != null)
      {
        ab.i("MicroMsg.URISpanHandlerSet", "AppBrandLinkSpanHandler click appbrandlink");
        paramg.b(paramm);
        bool = true;
        AppMethodBeat.o(15635);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.URISpanHandlerSet", "clickCallback is null, return");
      bool = false;
      AppMethodBeat.o(15635);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.AppBrandLinkSpanHandler
 * JD-Core Version:    0.6.2
 */