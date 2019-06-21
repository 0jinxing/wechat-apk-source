package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.i;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends a
{
  public final void b(c paramc)
  {
    AppMethodBeat.i(21904);
    if (paramc != null)
    {
      if (paramc.nwx == 0)
        paramc.nwx = ((int)System.currentTimeMillis());
      i locali = new i(paramc.cMr, paramc.nwW, paramc.nwx, paramc.nwy, paramc.nwz);
      aw.Rg().a(locali, 0);
      ab.d("MicroMsg.IPCallInviteService", "start invite, toUsername: %s, toPhoneNumber: %s, inviteid: %d", new Object[] { paramc.cMr, paramc.nwW, Integer.valueOf(paramc.nwx) });
    }
    AppMethodBeat.o(21904);
  }

  public final int[] bHC()
  {
    return new int[] { 991 };
  }

  public final int getServiceType()
  {
    return 1;
  }

  public final void onDestroy()
  {
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.d
 * JD-Core Version:    0.6.2
 */