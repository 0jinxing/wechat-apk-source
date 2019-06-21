package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vi;
import com.tencent.mm.g.a.vi.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.b.k.f;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.service.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class af$1 extends com.tencent.mm.sdk.b.c<vi>
{
  af$1(af paramaf)
  {
    AppMethodBeat.i(19407);
    this.xxI = vi.class.getName().hashCode();
    AppMethodBeat.o(19407);
  }

  private boolean a(vi paramvi)
  {
    boolean bool = true;
    AppMethodBeat.i(19408);
    if ((paramvi instanceof vi))
      switch (paramvi.cSq.cuy)
      {
      case 2:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      default:
      case 1:
      case 3:
      case 4:
      case 7:
      case 11:
      }
    while (true)
    {
      AppMethodBeat.o(19408);
      return false;
      ab.i("MicroMsg.WearHardDeviceLogic", "receive register deviceId=%s", new Object[] { paramvi.cSq.ceI });
      i.lto.a(ah.getContext(), new af.1.1(this, paramvi));
      continue;
      b localb = ad.boW().Kv(paramvi.cSq.ceI);
      paramvi = paramvi.cSq;
      if (localb != null);
      while (true)
      {
        paramvi.cxT = bool;
        break;
        bool = false;
      }
      ab.i("MicroMsg.WearHardDeviceLogic", "receive send deviceId=%s", new Object[] { paramvi.cSq.ceI });
      aw.Rg().a(538, this.luC);
      paramvi = new w(0L, paramvi.cSq.cws, paramvi.cSq.ceI, k.f.boz(), bo.anU(), paramvi.cSq.data, 1);
      aw.Rg().a(paramvi, 0);
      continue;
      aw.Rg().a(541, this.luC);
      paramvi = new r("AndroidWear", paramvi.cSq.cws, paramvi.cSq.ceI, 1, new byte[0]);
      aw.Rg().a(paramvi, 0);
      continue;
      if (!bo.bI(ah.getContext(), ah.getPackageName() + ":exdevice"))
        d.dI(ah.getContext());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.af.1
 * JD-Core Version:    0.6.2
 */