package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.cvg;
import com.tencent.mm.protocal.protobuf.cvh;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ac$1
  implements f
{
  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124152);
    ab.i("MicroMsg.WebSearch.WebSearchConfigLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof u))
    {
      g.Rg().b(1948, ac.cwv());
      paramString = new vl();
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label162;
      Object localObject = (u)paramm;
      paramm = ((u)localObject).tZS;
      localObject = ((u)localObject).tZR;
      ab.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfig onSceneEnd %s", new Object[] { paramm.vOy });
      if (ac.gU(((cvg)localObject).luQ, paramm.vOy) != ac.a.uat)
        break label151;
      paramString.cSv.result = 0;
    }
    while (true)
    {
      a.xxA.m(paramString);
      AppMethodBeat.o(124152);
      return;
      label151: paramString.cSv.result = -1;
      continue;
      label162: paramString.cSv.result = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ac.1
 * JD-Core Version:    0.6.2
 */