package com.tencent.mm.app.plugin;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet.a;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@URISpanHandlerSet.a
class URISpanHandlerSet$PayTransferUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$PayTransferUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
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
    AppMethodBeat.i(15681);
    if (paramString.startsWith("wxpay://"))
    {
      if (paramv == null)
        break label255;
      paramBundle = paramv.dgT().toString();
      paramv = paramv.dgU();
      if (!(paramv instanceof a))
        break label250;
      paramv = (a)paramv;
    }
    while (true)
    {
      if (bo.isNullOrNil(paramBundle))
      {
        ab.e("MicroMsg.URISpanHandlerSet", "SERVICE_JUMP_TO_PAY fail, null username");
        AppMethodBeat.o(15681);
        paramBoolean = false;
        return paramBoolean;
      }
      String str = paramString.substring(8);
      paramString = str;
      if (str.indexOf("&") > 0)
        paramString = str.split("&")[0];
      int i = paramString.indexOf("=");
      if (i >= 0);
      for (paramString = paramString.substring(i + 1); ; paramString = "")
      {
        if (bo.getInt(paramString, 0) == 1)
        {
          if ((r.YN()) || (r.YO()))
            h.a(URISpanHandlerSet.a(this.cgy), 5, paramBundle, 11, paramv);
          while (true)
          {
            AppMethodBeat.o(15681);
            paramBoolean = true;
            break;
            h.a(URISpanHandlerSet.a(this.cgy), 2, paramBundle, 11, paramv);
          }
        }
        Toast.makeText(URISpanHandlerSet.a(this.cgy), URISpanHandlerSet.a(this.cgy).getString(2131302968), 0).show();
        AppMethodBeat.o(15681);
        paramBoolean = false;
        break;
        AppMethodBeat.o(15681);
        paramBoolean = false;
        break;
      }
      label250: paramv = null;
      continue;
      label255: paramv = null;
      paramBundle = null;
    }
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.PayTransferUriSpanHandler
 * JD-Core Version:    0.6.2
 */