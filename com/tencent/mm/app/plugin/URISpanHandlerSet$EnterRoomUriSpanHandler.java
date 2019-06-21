package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.ChattingUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$EnterRoomUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$EnterRoomUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[0];
  }

  final boolean a(m paramm, g paramg)
  {
    return false;
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    paramBoolean = true;
    AppMethodBeat.i(15654);
    if (paramString.startsWith("weixin://jump/mainframe/"))
    {
      int i = paramString.trim().lastIndexOf("/");
      if ((i >= 0) && (i < paramString.trim().length() - 1))
      {
        paramString = paramString.trim().substring(i + 1);
        if (t.kH(paramString))
        {
          aw.ZK();
          paramv = c.XM().aoO(paramString);
          if ((paramv == null) || ((int)paramv.ewQ == 0))
          {
            paramv = new ad();
            paramv.setUsername(paramString);
            aw.ZK();
            c.XM().Z(paramv);
          }
        }
        paramString = new Intent(URISpanHandlerSet.a(this.cgy), ChattingUI.class).putExtra("Chat_User", paramString).putExtra("Chat_Mode", 1);
        if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
          paramString.addFlags(268435456);
        URISpanHandlerSet.a(this.cgy).startActivity(paramString);
        AppMethodBeat.o(15654);
      }
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15654);
    }
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.EnterRoomUriSpanHandler
 * JD-Core Version:    0.6.2
 */