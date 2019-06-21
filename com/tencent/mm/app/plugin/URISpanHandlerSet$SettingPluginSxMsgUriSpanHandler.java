package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$SettingPluginSxMsgUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingPluginSxMsgUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 11 };
  }

  final boolean a(m paramm, g paramg)
  {
    return false;
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15709);
    if (paramString.trim().startsWith("weixin://setting/plugin/sxmsg"))
    {
      paramString = new m(paramString, 11, null);
      AppMethodBeat.o(15709);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15709);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingPluginSxMsgUriSpanHandler
 * JD-Core Version:    0.6.2
 */