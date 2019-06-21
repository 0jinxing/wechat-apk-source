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
class URISpanHandlerSet$SettingBindEmailUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingBindEmailUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 7 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15692);
    boolean bool;
    if (paramm.type == 7)
    {
      if (paramg != null)
        paramg.a(paramm);
      LauncherUI localLauncherUI = LauncherUI.getInstance();
      if (localLauncherUI != null)
        localLauncherUI.yjJ.getMainTabUI().aqG("tab_settings");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15692);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15692);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15691);
    if (paramString.trim().startsWith("weixin://setting/bindemail"))
    {
      paramString = new m(paramString, 7, null);
      AppMethodBeat.o(15691);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15691);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingBindEmailUriSpanHandler
 * JD-Core Version:    0.6.2
 */