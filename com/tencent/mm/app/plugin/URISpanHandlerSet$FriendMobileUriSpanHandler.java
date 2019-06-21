package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$FriendMobileUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$FriendMobileUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 20 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15663);
    boolean bool;
    if (paramm.type == 20)
    {
      if (paramg != null)
        paramg.a(paramm);
      Intent localIntent = new Intent(URISpanHandlerSet.a(this.cgy), MobileFriendUI.class);
      URISpanHandlerSet.a(this.cgy).startActivity(localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15663);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15663);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15664);
    if (paramString.equals("weixin://findfriend/mobile"))
    {
      paramString = new Intent(URISpanHandlerSet.a(this.cgy), MobileFriendUI.class);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      URISpanHandlerSet.a(this.cgy).startActivity(paramString);
      paramBoolean = true;
      AppMethodBeat.o(15664);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15664);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15662);
    if (paramString.trim().startsWith("weixin://findfriend/mobile"))
    {
      paramString = new m(paramString, 20, null);
      AppMethodBeat.o(15662);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15662);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.FriendMobileUriSpanHandler
 * JD-Core Version:    0.6.2
 */