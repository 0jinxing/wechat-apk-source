package com.tencent.mm.app.plugin;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.a;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.b.a;

@URISpanHandlerSet.a
class URISpanHandlerSet$PayUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$PayUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 28 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15682);
    boolean bool;
    if (paramm.type == 28)
    {
      if (paramg != null)
        paramg.a(paramm);
      he localhe = new he();
      localhe.cBW.actionCode = 11;
      localhe.cBW.result = paramm.url;
      localhe.cBW.context = URISpanHandlerSet.a(this.cgy);
      localhe.cBW.cBY = new Bundle();
      localhe.cBW.cBY.putInt("pay_channel", 6);
      a.xxA.a(localhe, Looper.myLooper());
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15682);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.PayUriSpanHandler
 * JD-Core Version:    0.6.2
 */