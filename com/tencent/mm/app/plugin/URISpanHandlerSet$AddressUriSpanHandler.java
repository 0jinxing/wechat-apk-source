package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

@URISpanHandlerSet.a
class URISpanHandlerSet$AddressUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$AddressUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 44 };
  }

  final boolean a(m paramm, g paramg)
  {
    boolean bool = true;
    AppMethodBeat.i(15632);
    if (paramm.type == 44)
    {
      paramg = Uri.parse("geo:0,0?q=" + Uri.encode(paramm.url));
      paramm = new Intent("android.intent.action.VIEW");
      paramm.setData(paramg);
      paramm.addFlags(268435456);
      if (paramm.resolveActivity(ah.getContext().getPackageManager()) != null)
      {
        ah.getContext().startActivity(paramm);
        h.pYm.e(12809, new Object[] { Integer.valueOf(9), "" });
        h.pYm.e(12809, new Object[] { Integer.valueOf(8), "" });
        AppMethodBeat.o(15632);
      }
    }
    while (true)
    {
      return bool;
      ab.w("MicroMsg.URISpanHandlerSet", "Cannot find map app");
      break;
      AppMethodBeat.o(15632);
      bool = false;
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.AddressUriSpanHandler
 * JD-Core Version:    0.6.2
 */