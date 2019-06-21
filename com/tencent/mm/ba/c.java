package com.tencent.mm.ba;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class c
  implements f
{
  private static c fLX;
  private int fLW = 3;
  private boolean fpA = false;

  public static c aiq()
  {
    AppMethodBeat.i(78436);
    if (fLX == null)
      fLX = new c();
    c localc = fLX;
    AppMethodBeat.o(78436);
    return localc;
  }

  private void release()
  {
    AppMethodBeat.i(78438);
    this.fpA = false;
    g.RO().eJo.b(159, this);
    AppMethodBeat.o(78438);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78439);
    if (paramm.getType() == 159)
    {
      ab.i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label76;
      g.RP().Ry().set(81938, Long.valueOf(bo.anT()));
    }
    while (true)
    {
      release();
      AppMethodBeat.o(78439);
      return;
      label76: paramInt1 = this.fLW - 1;
      this.fLW = paramInt1;
      if (paramInt1 < 0)
      {
        g.RP().Ry().set(81938, Long.valueOf((bo.anU() - 86400000L + 3600000L) / 1000L));
        this.fLW = 3;
      }
    }
  }

  public final void update()
  {
    AppMethodBeat.i(78437);
    ab.i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.fpA);
    ab.i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + g.RP().isSDCardAvailable());
    if ((!this.fpA) && (g.RP().isSDCardAvailable()))
    {
      release();
      this.fpA = true;
      g.RO().eJo.a(159, this);
      k localk = new k(7);
      g.RO().eJo.a(localk, 0);
    }
    AppMethodBeat.o(78437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.c
 * JD-Core Version:    0.6.2
 */