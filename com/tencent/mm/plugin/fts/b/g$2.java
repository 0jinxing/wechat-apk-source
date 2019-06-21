package com.tencent.mm.plugin.fts.b;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class g$2
  implements f
{
  g$2(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(136794);
    g.c localc;
    if ((paramm instanceof g.c))
    {
      localc = (g.c)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.FTS.FTSSearchTestLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        List localList = localc.vbm;
        if (paramInt2 == -44)
        {
          paramm = new LinkedList();
          paramm.add(Integer.valueOf(1));
          HashMap localHashMap = new HashMap();
          localHashMap.put(localList.get(0), Integer.valueOf(0));
          paramm = new g.c(this.mGX, localList, paramm, "你好，我是珍惜", localc.mGZ, localHashMap, localc.mGZ);
          com.tencent.mm.kernel.g.Rg().a(paramm, 0);
        }
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
          Toast.makeText(ah.getContext(), paramString, 1).show();
        AppMethodBeat.o(136794);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FTS.FTSSearchTestLogic", "bind contact %s success", new Object[] { localc.vbm.toString() });
      AppMethodBeat.o(136794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g.2
 * JD-Core Version:    0.6.2
 */