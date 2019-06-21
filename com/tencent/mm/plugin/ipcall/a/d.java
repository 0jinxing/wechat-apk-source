package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.j;
import com.tencent.mm.ba.k;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class d
  implements f
{
  private static d nvs = null;
  private boolean fpA;
  com.tencent.mm.sdk.b.c nvt;
  private int retryCount;

  private d()
  {
    AppMethodBeat.i(21728);
    this.retryCount = 0;
    this.fpA = false;
    this.nvt = new d.1(this);
    AppMethodBeat.o(21728);
  }

  public static d bHg()
  {
    AppMethodBeat.i(21729);
    if (nvs == null)
      nvs = new d();
    d locald = nvs;
    AppMethodBeat.o(21729);
    return locald;
  }

  private static void bHh()
  {
    AppMethodBeat.i(21731);
    Object localObject = r.aix().lU(26);
    if ((localObject != null) && (localObject.length > 0));
    for (boolean bool = true; ; bool = false)
    {
      localObject = new k(bool);
      aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      AppMethodBeat.o(21731);
      return;
    }
  }

  private void bHi()
  {
    AppMethodBeat.i(21733);
    this.fpA = false;
    this.retryCount = 0;
    long l = System.currentTimeMillis();
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xLm, Long.valueOf(l));
    AppMethodBeat.o(21733);
  }

  public final void ii(boolean paramBoolean)
  {
    AppMethodBeat.i(21730);
    if (!aw.RK())
    {
      ab.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
      AppMethodBeat.o(21730);
    }
    while (true)
    {
      return;
      if (this.fpA)
      {
        ab.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
        AppMethodBeat.o(21730);
      }
      else
      {
        ab.d("MicroMsg.IPCallCoutryConfigUpdater", "tryupdate, isForce: %b", new Object[] { Boolean.valueOf(paramBoolean) });
        if (!paramBoolean)
        {
          aw.ZK();
          long l1 = ((Long)com.tencent.mm.model.c.Ry().get(ac.a.xLm, Long.valueOf(0L))).longValue();
          long l2 = System.currentTimeMillis();
          if ((l1 != 0L) && (Math.abs(l2 - l1) < 86400000L))
          {
            ab.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
            AppMethodBeat.o(21730);
          }
        }
        else
        {
          ab.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
          this.fpA = true;
          aw.Rg().a(159, this);
          aw.Rg().a(160, this);
          bHh();
          AppMethodBeat.o(21730);
        }
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21732);
    ab.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.fpA) });
    if (!this.fpA)
    {
      AppMethodBeat.o(21732);
      return;
    }
    if ((paramInt1 != 0) && (paramInt2 != 0));
    for (boolean bool = false; ; bool = true)
    {
      ab.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, isSuccess: %b", new Object[] { Boolean.valueOf(bool) });
      if (paramm.getType() == 159)
      {
        if (bool)
        {
          ab.d("MicroMsg.IPCallCoutryConfigUpdater", "get package list success, start download");
          paramString = r.aix().lU(26);
          if ((paramString == null) || (paramString.length == 0))
          {
            ab.d("MicroMsg.IPCallCoutryConfigUpdater", "do not exist package info");
            bHi();
            AppMethodBeat.o(21732);
            break;
          }
          ab.d("MicroMsg.IPCallCoutryConfigUpdater", "infos.length: %d", new Object[] { Integer.valueOf(paramString.length) });
          paramString = paramString[0];
          ab.d("MicroMsg.IPCallCoutryConfigUpdater", "stored info type: %d, id: %d, version: %d, status: %d, name: %s", new Object[] { Integer.valueOf(paramString.cBc), Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), paramString.ais() });
          if (paramString.status == 3)
          {
            ab.d("MicroMsg.IPCallCoutryConfigUpdater", "downloading this package, ignore");
            AppMethodBeat.o(21732);
            break;
          }
          if (paramString.status != 5)
          {
            ab.d("MicroMsg.IPCallCoutryConfigUpdater", "already download this package");
            c.bHc().ih(true);
            bHi();
            AppMethodBeat.o(21732);
            break;
          }
          paramString = new j(paramString.id, 26);
          aw.Rg().a(paramString, 0);
          AppMethodBeat.o(21732);
          break;
        }
        if (this.retryCount < 3)
        {
          this.retryCount += 1;
          bHh();
          ab.d("MicroMsg.IPCallCoutryConfigUpdater", "retry get package list, retryCount: %d", new Object[] { Integer.valueOf(this.retryCount) });
          AppMethodBeat.o(21732);
          break;
        }
        ab.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
        AppMethodBeat.o(21732);
        break;
      }
      if ((paramm.getType() == 160) && (bool))
      {
        ab.d("MicroMsg.IPCallCoutryConfigUpdater", "download package success");
        c.bHc().ih(true);
        bHi();
      }
      AppMethodBeat.o(21732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d
 * JD-Core Version:    0.6.2
 */