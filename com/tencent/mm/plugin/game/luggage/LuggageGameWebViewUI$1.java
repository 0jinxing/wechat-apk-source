package com.tencent.mm.plugin.game.luggage;

import android.os.Bundle;
import com.tencent.luggage.d.j;
import com.tencent.luggage.d.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.game.luggage.d.a;
import com.tencent.mm.plugin.webview.luggage.s;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuggageGameWebViewUI$1
  implements j
{
  LuggageGameWebViewUI$1(LuggageGameWebViewUI paramLuggageGameWebViewUI)
  {
  }

  public final com.tencent.luggage.d.e j(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(135809);
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.LuggageGameWebViewUI", "getPage, __Time__，time = %d", new Object[] { Long.valueOf(l) });
    paramBundle.putInt("minimize_secene", 3);
    boolean bool1 = paramBundle.getBoolean("from_bag", false);
    boolean bool2 = paramBundle.getBoolean("float_layer_page", false);
    GameWebPerformanceInfo localGameWebPerformanceInfo;
    if ((LuggageGameWebViewUI.a(this.mTM)) || (bool2) || (bool1) || (LuggageGameWebViewUI.NM(paramString)))
    {
      localGameWebPerformanceInfo = GameWebPerformanceInfo.kU(paramString);
      if (bo.isNullOrNil(localGameWebPerformanceInfo.url))
      {
        ab.i("MicroMsg.LuggageGameWebViewUI", "new page, url: %s", new Object[] { paramString });
        localGameWebPerformanceInfo.url = paramString;
        localGameWebPerformanceInfo.eBZ = l;
        localGameWebPerformanceInfo.eBU = l;
        localGameWebPerformanceInfo.startTime = l;
        localGameWebPerformanceInfo.eBK = 1;
      }
      localGameWebPerformanceInfo.eCb = l;
      if (!bool2)
        LuggageGameWebViewUI.b(this.mTM);
      if (!bool1)
        break label229;
      paramString = new com.tencent.mm.plugin.game.luggage.d.e(LuggageGameWebViewUI.c(this.mTM).bPq, m.a(this.mTM.mController.ylL, Integer.valueOf(s.ujF)), paramBundle);
      AppMethodBeat.o(135809);
    }
    while (true)
    {
      return paramString;
      g.agg(paramString);
      g.az(paramString, l);
      localGameWebPerformanceInfo = GameWebPerformanceInfo.kV(paramString);
      break;
      label229: if (bool2)
      {
        paramString = new a(LuggageGameWebViewUI.c(this.mTM).bPq, paramBundle);
        AppMethodBeat.o(135809);
      }
      else
      {
        paramString = d.aq(this.mTM.mController.ylL, paramString);
        if (paramString != null)
        {
          paramString = new com.tencent.mm.plugin.game.luggage.d.f(LuggageGameWebViewUI.c(this.mTM).bPq, paramString, paramBundle);
          AppMethodBeat.o(135809);
        }
        else
        {
          paramString = new com.tencent.mm.plugin.game.luggage.d.e(LuggageGameWebViewUI.c(this.mTM).bPq, null, paramBundle);
          AppMethodBeat.o(135809);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.1
 * JD-Core Version:    0.6.2
 */