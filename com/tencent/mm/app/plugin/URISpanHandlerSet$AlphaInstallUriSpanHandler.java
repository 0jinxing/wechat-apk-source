package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

@URISpanHandlerSet.a
class URISpanHandlerSet$AlphaInstallUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$AlphaInstallUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 32 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15634);
    boolean bool;
    if (paramm.type == 32)
    {
      paramm = paramm.url.replace("weixin://alphainstall?", "");
      paramg = Uri.parse(paramm).getQueryParameter("md5");
      paramg = com.tencent.mm.compatible.util.e.eSn + paramg + ".apk";
      if (com.tencent.mm.vfs.e.ct(paramg))
      {
        bo.k(paramg, ah.getContext());
        bool = true;
        AppMethodBeat.o(15634);
      }
    }
    while (true)
    {
      return bool;
      paramg = new Intent();
      paramg.putExtra("rawUrl", paramm.toString());
      d.b(URISpanHandlerSet.a(this.cgy), "webview", ".ui.tools.WebViewUI", paramg);
      break;
      bool = false;
      AppMethodBeat.o(15634);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15633);
    if (paramString.trim().toLowerCase().startsWith("weixin://alphainstall?"))
    {
      paramString = new m(paramString, 32, null);
      AppMethodBeat.o(15633);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15633);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.AlphaInstallUriSpanHandler
 * JD-Core Version:    0.6.2
 */