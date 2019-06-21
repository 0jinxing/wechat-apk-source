package com.tencent.mm.plugin.sport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.sport.model.h;
import com.tencent.mm.plugin.sport.model.h.a;
import com.tencent.mm.plugin.sport.model.j;
import com.tencent.mm.plugin.sport.model.k;
import com.tencent.mm.plugin.sport.model.l;
import com.tencent.mm.plugin.sport.model.m;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public class PluginSport extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c, a
{
  public static HashMap<Integer, h.d> eaA;
  private j rOM;
  private com.tencent.mm.plugin.sport.a.b rON;
  private com.tencent.mm.plugin.sport.model.a rOO;
  private com.tencent.mm.plugin.sport.model.b rOP;
  private l rOQ;
  private m rOR;
  private h.a rOS;
  private com.tencent.mm.plugin.sport.model.g rOT;
  private BroadcastReceiver rOU;

  static
  {
    AppMethodBeat.i(93614);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("SPORTSTEP_TABLE".hashCode()), new PluginSport.2());
    AppMethodBeat.o(93614);
  }

  public PluginSport()
  {
    AppMethodBeat.i(93607);
    this.rOS = new PluginSport.1(this);
    this.rOU = new PluginSport.3(this);
    AppMethodBeat.o(93607);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(93608);
    if (this.rOM == null)
      this.rOM = k.cwx();
    if (paramg.SG())
    {
      this.rON = new b();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sport.a.b.class, new e(this.rON));
      AppMethodBeat.o(93608);
    }
    while (true)
    {
      return;
      if (paramg.lQ(":push"))
        getPushSportStepDetector();
      AppMethodBeat.o(93608);
    }
  }

  public com.tencent.mm.plugin.sport.model.a getDeviceStepManager()
  {
    return this.rOO;
  }

  public com.tencent.mm.plugin.sport.model.b getExtApiStepManager()
  {
    return this.rOP;
  }

  public com.tencent.mm.plugin.sport.model.g getPushSportStepDetector()
  {
    AppMethodBeat.i(93613);
    if ((ah.doE()) && (this.rOT == null))
      this.rOT = new com.tencent.mm.plugin.sport.model.g();
    com.tencent.mm.plugin.sport.model.g localg = this.rOT;
    AppMethodBeat.o(93613);
    return localg;
  }

  public j getSportFileStorage()
  {
    AppMethodBeat.i(93610);
    if (this.rOM == null)
      this.rOM = k.cwx();
    j localj = this.rOM;
    AppMethodBeat.o(93610);
    return localj;
  }

  public l getSportStepManager()
  {
    return this.rOQ;
  }

  public m getSportStepStorage()
  {
    return this.rOR;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(93609);
    this.rOO = new com.tencent.mm.plugin.sport.model.a();
    this.rOP = new com.tencent.mm.plugin.sport.model.b();
    this.rOR = new m();
    this.rOQ = new l();
    h.a(this.rOS);
    this.rOS.Pi();
    paramc = new IntentFilter();
    paramc.addAction("com.tencent.mm.plugin.sport.uploadstep");
    ah.getContext().registerReceiver(this.rOU, paramc);
    AppMethodBeat.o(93609);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(93611);
    ah.getContext().unregisterReceiver(this.rOU);
    h.a(null);
    Object localObject;
    if (this.rOO != null)
    {
      localObject = this.rOO;
      ((com.tencent.mm.plugin.sport.model.a)localObject).rPa.cwk();
      ((com.tencent.mm.plugin.sport.model.a)localObject).rPb.dead();
      if (((com.tencent.mm.plugin.sport.model.a)localObject).rPc != null)
        com.tencent.mm.kernel.g.Rg().c(((com.tencent.mm.plugin.sport.model.a)localObject).rPc);
      this.rOO = null;
    }
    if (this.rOP != null)
    {
      localObject = this.rOP;
      ((com.tencent.mm.plugin.sport.model.b)localObject).rPh.dead();
      ((com.tencent.mm.plugin.sport.model.b)localObject).rPb.dead();
      if (((com.tencent.mm.plugin.sport.model.b)localObject).rPc != null)
        com.tencent.mm.kernel.g.Rg().c(((com.tencent.mm.plugin.sport.model.b)localObject).rPc);
      this.rOP = null;
    }
    AppMethodBeat.o(93611);
  }

  public void parallelsDependency()
  {
    AppMethodBeat.i(93612);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class));
    AppMethodBeat.o(93612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.PluginSport
 * JD-Core Version:    0.6.2
 */