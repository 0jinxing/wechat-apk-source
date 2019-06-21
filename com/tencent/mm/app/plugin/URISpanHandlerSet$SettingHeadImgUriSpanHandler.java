package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$SettingHeadImgUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingHeadImgUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 6 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15697);
    boolean bool;
    if (paramm.type == 6)
    {
      if (paramg != null)
        paramg.a(paramm);
      LauncherUI localLauncherUI = LauncherUI.getInstance();
      if (localLauncherUI != null)
        localLauncherUI.yjJ.getMainTabUI().aqG("tab_settings");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15697);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15697);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    paramBoolean = true;
    AppMethodBeat.i(15698);
    if (paramString.equals("weixin://setting/setheadimage"))
    {
      paramString = new Intent();
      paramString.putExtra("Contact_User", r.Yz());
      paramString.putExtra("Contact_Nick", r.YB());
      paramString.putExtra("User_Avatar", true);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", paramString);
      AppMethodBeat.o(15698);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15698);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15696);
    if (paramString.trim().startsWith("weixin://setting/setheadimage"))
    {
      paramString = new m(paramString, 6, null);
      AppMethodBeat.o(15696);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15696);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingHeadImgUriSpanHandler
 * JD-Core Version:    0.6.2
 */