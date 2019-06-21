package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.b.a;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

@URISpanHandlerSet.a
class URISpanHandlerSet$UnKnowToUrlSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$UnKnowToUrlSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 2147483646 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15717);
    if (paramm.type == 2147483646)
      if ((paramm.data instanceof Bundle))
      {
        paramm = ((Bundle)paramm.data).getString("rawUrl");
        if (bo.isNullOrNil(paramm))
        {
          ab.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL url == null");
          AppMethodBeat.o(15717);
        }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      a.b(ah.getContext(), paramm, 0, true);
      break;
      ab.i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL hrefInfo.getData() no instanceof Bundle");
      break;
      AppMethodBeat.o(15717);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.UnKnowToUrlSpanHandler
 * JD-Core Version:    0.6.2
 */