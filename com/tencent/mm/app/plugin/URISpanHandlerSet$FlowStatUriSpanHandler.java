package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$FlowStatUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$FlowStatUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 16 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15660);
    boolean bool;
    if (paramm.type == 16)
    {
      if (paramg != null)
        paramg.a(paramm);
      LauncherUI localLauncherUI = LauncherUI.getInstance();
      if (localLauncherUI != null)
        localLauncherUI.yjJ.getMainTabUI().aqG("tab_settings");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15660);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15660);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15661);
    if (paramString.equals("weixin://flowstat"))
    {
      paramString = LauncherUI.getInstance();
      if (paramString != null)
        paramString.yjJ.getMainTabUI().aqG("tab_settings");
      paramBoolean = true;
      AppMethodBeat.o(15661);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15661);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15659);
    if (paramString.trim().startsWith("weixin://flowstat"))
    {
      paramString = new m(paramString, 16, null);
      AppMethodBeat.o(15659);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15659);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.FlowStatUriSpanHandler
 * JD-Core Version:    0.6.2
 */