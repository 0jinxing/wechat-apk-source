package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$SettingNotifyUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingNotifyUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 9 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15700);
    boolean bool;
    if (paramm.type == 9)
    {
      if (paramg != null)
        paramg.a(paramm);
      LauncherUI localLauncherUI = LauncherUI.getInstance();
      if (localLauncherUI != null)
        localLauncherUI.yjJ.getMainTabUI().aqG("tab_settings");
      d.H(URISpanHandlerSet.a(this.cgy), "setting", ".ui.setting.SettingsNotificationUI");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15700);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15700);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15701);
    if (paramString.equals("weixin://setting/notify"))
    {
      paramString = LauncherUI.getInstance();
      if (paramString != null)
        paramString.yjJ.getMainTabUI().aqG("tab_settings");
      paramString = new Intent();
      paramString.addFlags(67108864);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "setting", ".ui.setting.SettingsNotificationUI", paramString);
      paramBoolean = true;
      AppMethodBeat.o(15701);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15701);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15699);
    if (paramString.trim().startsWith("weixin://setting/notify"))
    {
      paramString = new m(paramString, 9, null);
      AppMethodBeat.o(15699);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15699);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingNotifyUriSpanHandler
 * JD-Core Version:    0.6.2
 */