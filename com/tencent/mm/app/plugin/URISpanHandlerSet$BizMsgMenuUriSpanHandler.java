package com.tencent.mm.app.plugin;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

@URISpanHandlerSet.a
class URISpanHandlerSet$BizMsgMenuUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$BizMsgMenuUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 43 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15640);
    boolean bool;
    if (43 == paramm.type)
      if (bo.isNullOrNil(paramm.username))
      {
        ab.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
        AppMethodBeat.o(15640);
        bool = true;
      }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler, url:%s", new Object[] { paramm.url });
      Object localObject = Uri.parse(paramm.url.trim());
      paramg = ((Uri)localObject).getQueryParameter("msgmenuid");
      localObject = ((Uri)localObject).getQueryParameter("msgmenucontent");
      com.tencent.mm.plugin.report.service.h.pYm.e(14522, new Object[] { bo.nullAsNil(paramg), paramm.username });
      if ((bo.isNullOrNil(paramg)) || (bo.isNullOrNil((String)localObject)))
      {
        ab.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler id or msgContent is null.");
        AppMethodBeat.o(15640);
        bool = true;
      }
      else
      {
        try
        {
          String str = URLDecoder.decode((String)localObject, "UTF-8");
          localObject = new java/util/HashMap;
          ((HashMap)localObject).<init>();
          ((HashMap)localObject).put("bizmsgmenuid", paramg);
          paramg = new com/tencent/mm/modelmulti/h;
          paramg.<init>(paramm.username, str, t.nK(paramm.username), 291, localObject);
          aw.Rg().a(paramg, 0);
          AppMethodBeat.o(15640);
          bool = true;
        }
        catch (UnsupportedEncodingException paramm)
        {
          while (true)
            ab.w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler exp, msg = %s", new Object[] { paramm.getMessage() });
        }
        AppMethodBeat.o(15640);
        bool = false;
      }
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15639);
    if (paramString.trim().startsWith("weixin://bizmsgmenu"))
    {
      paramString = new m(paramString, 43, null);
      AppMethodBeat.o(15639);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15639);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.BizMsgMenuUriSpanHandler
 * JD-Core Version:    0.6.2
 */