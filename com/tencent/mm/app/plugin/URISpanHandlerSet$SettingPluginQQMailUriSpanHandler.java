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
class URISpanHandlerSet$SettingPluginQQMailUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SettingPluginQQMailUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 10 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15706);
    boolean bool;
    if (paramm.type == 10)
    {
      if (paramg != null)
        paramg.a(paramm);
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", "qqmail");
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15706);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15706);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15707);
    if (paramString.equals("weixin://setting/plugin/qqmail"))
    {
      paramString = new Intent();
      paramString.putExtra("Contact_User", "qqmail");
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", paramString);
      paramBoolean = true;
      AppMethodBeat.o(15707);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15707);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15705);
    if (paramString.trim().startsWith("weixin://setting/plugin/qqmail"))
    {
      paramString = new m(paramString, 10, null);
      AppMethodBeat.o(15705);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15705);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SettingPluginQQMailUriSpanHandler
 * JD-Core Version:    0.6.2
 */