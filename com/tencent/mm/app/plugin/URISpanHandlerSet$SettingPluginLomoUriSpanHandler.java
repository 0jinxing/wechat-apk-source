package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$SettingPluginLomoUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingPluginLomoUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 12 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15703);
    boolean bool;
    if (paramm.type == 12)
    {
      if (paramg != null)
        paramg.a(paramm);
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", "weibo");
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15703);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15703);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15704);
    if (paramString.equals("weixin://setting/plugin/lomo"))
    {
      paramString = new Intent();
      paramString.putExtra("Contact_User", "weibo");
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", paramString);
      paramBoolean = true;
      AppMethodBeat.o(15704);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15704);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15702);
    if (paramString.trim().startsWith("weixin://setting/plugin/lomo"))
    {
      paramString = new m(paramString, 12, null);
      AppMethodBeat.o(15702);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15702);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingPluginLomoUriSpanHandler
 * JD-Core Version:    0.6.2
 */