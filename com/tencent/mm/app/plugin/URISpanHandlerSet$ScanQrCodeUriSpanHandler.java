package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;

@URISpanHandlerSet.a
class URISpanHandlerSet$ScanQrCodeUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$ScanQrCodeUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
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
    int i = 0;
    boolean bool = true;
    AppMethodBeat.i(15689);
    if (paramString.equals("weixin://scanqrcode/"))
      if (!paramBoolean)
      {
        ab.e("MicroMsg.URISpanHandlerSet", "jumpToActivity, scan qrcode permission fail");
        AppMethodBeat.o(15689);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 1);
      int j = i;
      if (paramBundle != null)
      {
        j = i;
        if (paramBundle.getInt("fromScene") == 100)
          j = 1;
      }
      if (j == 0)
        paramString.addFlags(67108864);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      if (j != 0)
      {
        d.b(URISpanHandlerSet.a(this.cgy), "scanner", ".ui.SingleTopScanUI", paramString);
        AppMethodBeat.o(15689);
        paramBoolean = bool;
      }
      else
      {
        d.b(URISpanHandlerSet.a(this.cgy), "scanner", ".ui.BaseScanUI", paramString);
        AppMethodBeat.o(15689);
        paramBoolean = bool;
        continue;
        AppMethodBeat.o(15689);
        paramBoolean = false;
      }
    }
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.ScanQrCodeUriSpanHandler
 * JD-Core Version:    0.6.2
 */