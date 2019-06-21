package com.tencent.mm.plugin.collect.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.collect.model.o;
import com.tencent.mm.plugin.collect.model.u;
import com.tencent.mm.plugin.collect.model.voice.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bci;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a
  implements at
{
  public boolean kBA;
  private c<k> kBB;
  private bz.a kBx;
  private com.tencent.mm.plugin.collect.model.g kBy;
  private u kBz;

  public a()
  {
    AppMethodBeat.i(40910);
    this.kBx = new a.1(this);
    this.kBy = new com.tencent.mm.plugin.collect.model.g();
    this.kBz = new u();
    this.kBA = false;
    this.kBB = new a.3(this);
    AppMethodBeat.o(40910);
  }

  private void HZ(String paramString)
  {
    AppMethodBeat.i(40918);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(304, new a.2(this));
    paramString = new o(bo.bc(paramString, ""));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(40918);
  }

  public static a bgv()
  {
    AppMethodBeat.i(40911);
    a locala = (a)q.Y(a.class);
    AppMethodBeat.o(40911);
    return locala;
  }

  public static com.tencent.mm.plugin.collect.model.d bgw()
  {
    AppMethodBeat.i(40914);
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.plugin.collect.model.d locald = com.tencent.mm.plugin.collect.model.d.kBH;
    AppMethodBeat.o(40914);
    return locald;
  }

  public static boolean bgx()
  {
    AppMethodBeat.i(40915);
    Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQe, "");
    long l = r.YE();
    boolean bool;
    if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals("in.caf")))
    {
      ab.i("MicroMsg.SubCoreCollect", "old version switch is open, sync to new version");
      com.tencent.mm.kernel.g.RP().Ry().set(147457, Long.valueOf(l | 0x8000));
      localObject = new bci();
      ((bci)localObject).pXD = 1;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(209, (com.tencent.mm.bt.a)localObject));
      AppMethodBeat.o(40915);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((l & 0x8000) != 0L)
      {
        AppMethodBeat.o(40915);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(40915);
      }
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bgy()
  {
    AppMethodBeat.i(40916);
    HZ("cash.caf");
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xQe, "cash.caf");
    AppMethodBeat.o(40916);
  }

  public final void bgz()
  {
    AppMethodBeat.i(40917);
    HZ("in.caf");
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xQe, "in.caf");
    AppMethodBeat.o(40917);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(40912);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("paymsg", this.kBx, true);
    this.kBB.dnU();
    com.tencent.mm.plugin.collect.model.g localg = this.kBy;
    localg.dnU();
    localg.kBO = new ConcurrentLinkedQueue();
    com.tencent.mm.plugin.collect.model.voice.a locala = com.tencent.mm.plugin.collect.model.voice.a.bgJ();
    locala.kCX = localg;
    locala.kCY = new a.b(locala, locala.kCX);
    com.tencent.mm.kernel.g.RP().Ry().a(locala);
    com.tencent.mm.plugin.collect.model.voice.a.bgJ().bgK();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1384, localg);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1317, localg);
    this.kBz.dnU();
    AppMethodBeat.o(40912);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(40913);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("paymsg", this.kBx, true);
    Object localObject = this.kBy;
    ((com.tencent.mm.plugin.collect.model.g)localObject).dead();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1384, (f)localObject);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1317, (f)localObject);
    com.tencent.mm.plugin.collect.model.g.bgB();
    localObject = com.tencent.mm.plugin.collect.model.voice.a.bgJ();
    ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy()");
    if (((com.tencent.mm.plugin.collect.model.voice.a)localObject).kCW != null)
      ((com.tencent.mm.plugin.collect.model.voice.a)localObject).kCW.kDp.destroy();
    if (((com.tencent.mm.plugin.collect.model.voice.a)localObject).kDb != null)
      ((com.tencent.mm.plugin.collect.model.voice.a)localObject).kDb.dead();
    if (((com.tencent.mm.plugin.collect.model.voice.a)localObject).kDc != null)
      ((com.tencent.mm.plugin.collect.model.voice.a)localObject).kDc.dead();
    com.tencent.mm.kernel.g.RP().Ry().b((n.b)localObject);
    com.tencent.mm.plugin.collect.model.voice.a.kCR = false;
    this.kBz.dead();
    this.kBB.dead();
    AppMethodBeat.o(40913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.a.a
 * JD-Core Version:    0.6.2
 */