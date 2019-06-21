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
class URISpanHandlerSet$SettingPrivacyUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingPrivacyUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 15 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15711);
    boolean bool;
    if (paramm.type == 15)
    {
      if (paramg != null)
        paramg.a(paramm);
      LauncherUI localLauncherUI = LauncherUI.getInstance();
      if (localLauncherUI != null)
        localLauncherUI.yjJ.getMainTabUI().aqG("tab_settings");
      d.H(URISpanHandlerSet.a(this.cgy), "setting", ".ui.setting.SettingsPrivacyUI");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15711);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15711);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15712);
    if (paramString.equals("weixin://setting/privacy"))
    {
      paramString = LauncherUI.getInstance();
      if (paramString != null)
        paramString.yjJ.getMainTabUI().aqG("tab_settings");
      paramString = new Intent();
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "setting", ".ui.setting.SettingsPrivacyUI", paramString);
      paramBoolean = true;
      AppMethodBeat.o(15712);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15712);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15710);
    if (paramString.trim().startsWith("weixin://setting/privacy"))
    {
      paramString = new m(paramString, 15, null);
      AppMethodBeat.o(15710);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15710);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingPrivacyUriSpanHandler
 * JD-Core Version:    0.6.2
 */