package com.tencent.mm.plugin.game.commlib;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class b
  implements f
{
  private static b mTt;
  private boolean fpA = false;

  public static b bDn()
  {
    AppMethodBeat.i(59399);
    if (mTt == null);
    try
    {
      if (mTt == null)
      {
        localb = new com/tencent/mm/plugin/game/commlib/b;
        localb.<init>();
        mTt = localb;
      }
      b localb = mTt;
      AppMethodBeat.o(59399);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(59399);
    }
  }

  private void release()
  {
    AppMethodBeat.i(59401);
    this.fpA = false;
    g.Rg().b(1311, this);
    AppMethodBeat.o(59401);
  }

  public final void hI(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(59400);
      if (paramBoolean)
      {
        i = 1;
        if (i == 0)
          if (com.tencent.mm.vfs.e.ct(a.mTr))
            break label147;
      }
      label147: for (int i = 1; ; i = 0)
      {
        if (i != 0)
          if (!this.fpA)
          {
            ab.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", new Object[] { Boolean.valueOf(paramBoolean) });
            release();
            this.fpA = true;
            g.Rg().a(1311, this);
            c localc = new com/tencent/mm/plugin/game/commlib/c;
            localc.<init>();
            g.Rg().a(localc, 0);
          }
        AppMethodBeat.o(59400);
        return;
        long l = bo.fp(bo.c((Long)g.RP().Ry().get(ac.a.xJa, Long.valueOf(0L))));
        if (l > 86400L)
        {
          i = 1;
          break;
        }
        i = 0;
        break;
      }
    }
    finally
    {
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(59402);
    if (paramm.getType() == 1311)
    {
      ab.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (g.RN().QY())
        break label67;
      ab.w("MicroMsg.GameConfigUpdater", "account not init.");
    }
    while (true)
    {
      release();
      AppMethodBeat.o(59402);
      return;
      label67: g.RP().Ry().set(ac.a.xJa, Long.valueOf(bo.anT()));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.b
 * JD-Core Version:    0.6.2
 */