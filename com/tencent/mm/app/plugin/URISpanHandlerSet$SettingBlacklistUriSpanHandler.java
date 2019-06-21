package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.contact.SelectContactUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$SettingBlacklistUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingBlacklistUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 14 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15694);
    boolean bool;
    if (paramm.type == 14)
    {
      if (paramg != null)
        paramg.a(paramm);
      Object localObject = z.nY(URISpanHandlerSet.a(this.cgy).getString(2131300423));
      Intent localIntent = new Intent();
      localIntent.setClass(URISpanHandlerSet.a(this.cgy), SelectContactUI.class);
      localIntent.putExtra("Contact_GroupFilter_Type", ((y)localObject).getType());
      localIntent.putExtra("Contact_GroupFilter_DisplayName", ((y)localObject).Oi());
      localIntent.addFlags(67108864);
      localObject = LauncherUI.getInstance();
      if (localObject != null)
        ((LauncherUI)localObject).yjJ.getMainTabUI().aqG("tab_settings");
      URISpanHandlerSet.a(this.cgy).startActivity(localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15694);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15694);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15695);
    if (paramString.equals("weixin://setting/blacklist"))
    {
      paramv = z.nY(URISpanHandlerSet.a(this.cgy).getString(2131300423));
      paramString = new Intent();
      paramString.setClass(URISpanHandlerSet.a(this.cgy), AddressUI.class);
      paramString.putExtra("Contact_GroupFilter_Type", paramv.getType());
      paramString.putExtra("Contact_GroupFilter_DisplayName", paramv.Oi());
      paramString.addFlags(67108864);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      paramv = LauncherUI.getInstance();
      if (paramv != null)
        paramv.yjJ.getMainTabUI().aqG("tab_settings");
      URISpanHandlerSet.a(this.cgy).startActivity(paramString);
      paramBoolean = true;
      AppMethodBeat.o(15695);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15695);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15693);
    if (paramString.trim().startsWith("weixin://setting/blacklist"))
    {
      paramString = new m(paramString, 14, null);
      AppMethodBeat.o(15693);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15693);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingBlacklistUriSpanHandler
 * JD-Core Version:    0.6.2
 */