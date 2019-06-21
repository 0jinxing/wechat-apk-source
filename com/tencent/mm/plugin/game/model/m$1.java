package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.protocal.protobuf.bvb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

final class m$1
  implements Runnable
{
  m$1(m paramm, com.tencent.mm.ai.m paramm1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111281);
    m.a(this.mWe, m.a(this.mWe) + m.access$100());
    Object localObject = (bvb)((au)this.crb).lty.fsH.fsP;
    if (localObject == null)
    {
      ab.e("MicroMsg.NetSceneSearchGameList", "resp == null");
      localObject = null;
      localObject = new h((String)localObject);
      ((h)localObject).bEf();
      m.aWj().add(localObject);
      int i = ((g)localObject).mVR.optInt("remainingCount");
      ab.i("MicroMsg.GameListUpdater", "remainingCount: %d", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
        break label149;
      com.tencent.mm.kernel.g.Rg().a(new au(m.a(this.mWe), m.access$100()), 0);
      AppMethodBeat.o(111281);
    }
    while (true)
    {
      return;
      localObject = ((bvb)localObject).wkG;
      break;
      label149: m.b(this.mWe);
      e.bDZ();
      localObject = m.aWj();
      if (!bo.ek((List)localObject))
        com.tencent.mm.kernel.g.RS().aa(new h.1((LinkedList)localObject));
      AppMethodBeat.o(111281);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.m.1
 * JD-Core Version:    0.6.2
 */