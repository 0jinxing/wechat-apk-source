package com.tencent.mm.app.plugin;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.b.a;

@URISpanHandlerSet.a
class URISpanHandlerSet$VoipCallAgainUrilSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$VoipCallAgainUrilSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 38 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15721);
    boolean bool;
    if (paramm.type == 38)
    {
      paramg = Uri.parse(paramm.url);
      paramm = paramg.getQueryParameter("username");
      String str = paramg.getQueryParameter("isvideocall");
      paramg = new ui();
      paramg.cQx.cAd = 5;
      paramg.cQx.talker = paramm;
      paramg.cQx.context = URISpanHandlerSet.a(this.cgy);
      if ((paramm != null) && (!paramm.equals("")))
        if ((str != null) && (str.equals("true")))
        {
          paramg.cQx.cQs = 2;
          a.xxA.m(paramg);
          bool = true;
          AppMethodBeat.o(15721);
        }
    }
    while (true)
    {
      return bool;
      paramg.cQx.cQs = 4;
      break;
      bool = false;
      AppMethodBeat.o(15721);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15720);
    if (paramString.trim().startsWith("weixin://voip/callagain/"))
    {
      paramString = new m(paramString, 38, null);
      AppMethodBeat.o(15720);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15720);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.VoipCallAgainUrilSpanHandler
 * JD-Core Version:    0.6.2
 */