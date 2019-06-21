package com.tencent.mm.plugin.hp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.v;
import com.tencent.mm.app.v.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.az;
import com.tencent.mm.g.a.bi;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

public class d
  implements at
{
  private final c<az> kXG;
  private boolean ntC;
  private final h ntD;
  private final c<cq> ntE;
  private final f ntF;
  private final c<bi> ntG;

  public d()
  {
    AppMethodBeat.i(90590);
    this.ntC = true;
    this.ntD = new h();
    this.kXG = new d.1(this);
    this.ntE = new d.2(this);
    this.ntF = new f();
    this.ntG = new d.3(this);
    AppMethodBeat.o(90590);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(90591);
    b.a(new g(), new String[] { "//tinker" });
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("prconfignotify", this.ntD, true);
    com.tencent.mm.sdk.b.a.xxA.c(this.kXG);
    this.ntE.dnU();
    com.tencent.mm.sdk.b.a.xxA.c(this.ntF);
    com.tencent.mm.sdk.b.a.xxA.c(this.ntG);
    ab.d("Tinker.SubCoreHotpatch", "onAccountPostReset");
    com.tencent.mm.plugin.hp.tinker.g.el(ah.getContext());
    try
    {
      long l1 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSD, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if (l2 - l1 >= 3600000L)
      {
        int i = Calendar.getInstance().get(11);
        ab.i("Tinker.SubCoreHotpatch", "try to fetch patch update hour %d ", new Object[] { Integer.valueOf(i) });
        if (i == 0)
        {
          Random localRandom = new java/util/Random;
          localRandom.<init>();
          i = localRandom.nextInt(60);
          l2 = l2 - com.tencent.mm.plugin.hp.tinker.g.em(ah.getContext()) * 3600000L + i * 60000L;
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSD, Long.valueOf(l2));
          ab.i("Tinker.SubCoreHotpatch", "try to fetch patch update after %d minute currentTime %s lastUpdate %s", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l1) });
        }
        while (true)
        {
          f.iT(l2);
          v.a.cfp.BG();
          AppMethodBeat.o(90591);
          return;
          com.tinkerboots.sdk.a.dWj().rF(true);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSD, Long.valueOf(l2));
          ab.i("Tinker.SubCoreHotpatch", "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(l1) });
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("Tinker.SubCoreHotpatch", localException, "", new Object[0]);
        continue;
        com.tinkerboots.sdk.a.dWj().rF(false);
        ab.i("Tinker.SubCoreHotpatch", "try to fetch patch update false when onAccountPostReset.");
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(90592);
    b.N(new String[] { "//tinker" });
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("prconfignotify", this.ntD, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.kXG);
    this.ntE.dead();
    com.tencent.mm.sdk.b.a.xxA.d(this.ntF);
    com.tencent.mm.sdk.b.a.xxA.d(this.ntG);
    ab.d("Tinker.SubCoreHotpatch", "onAccountRelease");
    AppMethodBeat.o(90592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.d
 * JD-Core Version:    0.6.2
 */