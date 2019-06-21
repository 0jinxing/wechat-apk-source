package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;

@URISpanHandlerSet.a(Cn=URISpanHandlerSet.PRIORITY.HIGH)
class URISpanHandlerSet$LuckyMoneyUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$LuckyMoneyUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 33 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15677);
    boolean bool;
    if (paramm.type == 33)
      if (paramg == null)
      {
        ab.i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
        AppMethodBeat.o(15677);
        bool = false;
      }
    while (true)
    {
      return bool;
      Intent localIntent = new Intent();
      localIntent.putExtra("key_native_url", paramm.url);
      localIntent.putExtra("key_username", (String)paramg.a(paramm));
      localIntent.putExtra("key_lucky_money_can_received", true);
      d.b(URISpanHandlerSet.a(this.cgy), "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", localIntent);
      h.pYm.e(12097, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
      h.pYm.e(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
      AppMethodBeat.o(15677);
      bool = true;
      continue;
      AppMethodBeat.o(15677);
      bool = false;
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15676);
    if (paramString.trim().toLowerCase().startsWith("weixin://weixinhongbao/"))
    {
      paramString = new m(paramString, 33, null);
      AppMethodBeat.o(15676);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15676);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.LuckyMoneyUriSpanHandler
 * JD-Core Version:    0.6.2
 */