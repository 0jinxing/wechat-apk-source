package com.tencent.mm.app.plugin;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.LauncherUI;

@URISpanHandlerSet.a
class URISpanHandlerSet$JumpActivityUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$JumpActivityUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
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
    AppMethodBeat.i(15675);
    if (paramString.toLowerCase().startsWith("weixin://jump/"))
    {
      paramString = paramString.split("/");
      paramString = paramString[(paramString.length - 1)];
      if ("mainframe".equalsIgnoreCase(paramString))
      {
        paramString = new Intent(URISpanHandlerSet.a(this.cgy), LauncherUI.class);
        if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
          paramString.addFlags(268435456);
        paramString.addFlags(67108864);
        URISpanHandlerSet.a(this.cgy).startActivity(paramString);
        AppMethodBeat.o(15675);
        paramBoolean = true;
      }
    }
    while (true)
    {
      return paramBoolean;
      if ("shake".equalsIgnoreCase(paramString))
      {
        h.pYm.X(10221, "1");
        paramString = new Intent();
        paramString.addFlags(67108864);
        if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
          paramString.addFlags(268435456);
        d.b(URISpanHandlerSet.a(this.cgy), "shake", ".ui.ShakeReportUI", paramString);
        if ((URISpanHandlerSet.a(this.cgy) == null) || (!(URISpanHandlerSet.a(this.cgy) instanceof Activity)))
          break;
        ((Activity)URISpanHandlerSet.a(this.cgy)).finish();
        break;
      }
      if (!"scanqrcode".equalsIgnoreCase(paramString))
        break;
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 1);
      paramString.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
      paramString.setFlags(65536);
      paramString.addFlags(67108864);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.b(URISpanHandlerSet.a(this.cgy), "scanner", ".ui.BaseScanUI", paramString);
      break;
      paramBoolean = false;
      AppMethodBeat.o(15675);
    }
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.JumpActivityUriSpanHandler
 * JD-Core Version:    0.6.2
 */