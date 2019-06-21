package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.protocal.protobuf.ctg;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class h$1
  implements f
{
  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(93677);
    if ((paramm instanceof e))
    {
      g.Rg().b(1947, h.cwv());
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((e)paramm).rPu;
        ab.i("MicroMsg.Sport.SportConfigLogic", "onSceneEnd config=%s", new Object[] { paramString.vFt });
        h.ZS(paramString.vFt);
        paramString = h.cwt().toString();
        k.ZT(paramString);
        ((PluginSport)g.M(PluginSport.class)).getDeviceStepManager().ZR(paramString);
        if (h.cww() != null)
          h.cww().Pi();
      }
    }
    AppMethodBeat.o(93677);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.h.1
 * JD-Core Version:    0.6.2
 */