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
class URISpanHandlerSet$FriendShareUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$FriendShareUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 18 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15669);
    boolean bool;
    if (paramm.type == 18)
    {
      if (paramg != null)
        paramg.a(paramm);
      d.H(URISpanHandlerSet.a(this.cgy), "setting", ".ui.qrcode.ShareMicroMsgChoiceUI");
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15669);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15669);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15670);
    if (paramString.equals("weixin://findfriend/share"))
    {
      paramString = new Intent();
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "setting", ".ui.qrcode.ShareMicroMsgChoiceUI", paramString);
      paramBoolean = true;
      AppMethodBeat.o(15670);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15670);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15668);
    if (paramString.trim().startsWith("weixin://findfriend/share"))
    {
      paramString = new m(paramString, 18, null);
      AppMethodBeat.o(15668);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15668);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.FriendShareUriSpanHandler
 * JD-Core Version:    0.6.2
 */