package com.tencent.mm.plugin.ipcall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
  implements f
{
  private static a nuV = null;
  private boolean fpA = false;
  private long nuR = -1L;
  private long nuS = -1L;
  private long nuT = -1L;
  private long nuU = -1L;

  public static a bGG()
  {
    AppMethodBeat.i(21660);
    if (nuV == null)
      nuV = new a();
    a locala = nuV;
    AppMethodBeat.o(21660);
    return locala;
  }

  private static void bGI()
  {
    AppMethodBeat.i(21663);
    long l = System.currentTimeMillis();
    aw.ZK();
    c.Ry().set(ac.a.xLp, Long.valueOf(l));
    AppMethodBeat.o(21663);
  }

  public final void bGH()
  {
    AppMethodBeat.i(21661);
    if (!com.tencent.mm.plugin.ipcall.b.a.apV())
      ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, can't sync addr book");
    if (this.fpA)
    {
      ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, updating");
      AppMethodBeat.o(21661);
    }
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      aw.ZK();
      if (Math.abs(l - ((Long)c.Ry().get(ac.a.xLp, Long.valueOf(0L))).longValue()) >= 86400000L)
      {
        this.fpA = true;
        this.nuR = -1L;
        this.nuS = -1L;
        this.nuT = -1L;
        this.nuU = -1L;
        aw.Rg().a(32, this);
        d.post(new a.1(this), "IPCallAddressBookUpdater_updateUsername");
        AppMethodBeat.o(21661);
      }
      else
      {
        ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, not reach time limit");
        AppMethodBeat.o(21661);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(21662);
    ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.fpA) });
    if (!this.fpA)
      AppMethodBeat.o(21662);
    while (true)
    {
      return;
      aw.Rg().b(32, this);
      this.nuS = System.currentTimeMillis();
      ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend used %dms", new Object[] { Long.valueOf(this.nuS - this.nuR) });
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend failed");
        this.fpA = false;
        bGI();
        AppMethodBeat.o(21662);
      }
      else
      {
        d.post(new a.2(this), "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
        AppMethodBeat.o(21662);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a
 * JD-Core Version:    0.6.2
 */