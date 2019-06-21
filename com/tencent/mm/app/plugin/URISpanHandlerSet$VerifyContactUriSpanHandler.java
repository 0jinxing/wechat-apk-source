package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$VerifyContactUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$VerifyContactUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 4 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15719);
    boolean bool;
    if (paramm.type == 4)
    {
      if (paramg != null)
      {
        paramg.a(paramm);
        paramg.b(paramm);
      }
      bool = true;
      AppMethodBeat.o(15719);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15719);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15718);
    if (paramString.trim().startsWith("weixin://findfriend/verifycontact"))
    {
      paramString = new m(paramString, 4, null);
      AppMethodBeat.o(15718);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15718);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.VerifyContactUriSpanHandler
 * JD-Core Version:    0.6.2
 */