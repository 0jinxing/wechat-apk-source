package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.ci.c;
import com.tencent.mm.ci.h;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.at;
import com.tencent.mm.network.e;
import com.tencent.mm.network.n;
import com.tencent.mm.network.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class q
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private l fUk;
  private h<m> fUl;
  private x fUm;
  private h<g> fUn;
  private n fyJ;

  static
  {
    AppMethodBeat.i(78801);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("NETSTAT_TABLE".hashCode()), new q.4());
    AppMethodBeat.o(78801);
  }

  public q()
  {
    AppMethodBeat.i(78793);
    this.fUk = new l();
    this.fUl = new h(new c()
    {
    });
    this.fUm = new x();
    this.fUn = new h(new q.2(this));
    this.fyJ = new q.3(this);
    AppMethodBeat.o(78793);
  }

  public static g akq()
  {
    AppMethodBeat.i(78794);
    com.tencent.mm.kernel.g.RN().QU();
    g localg = (g)akr().fUn.get();
    AppMethodBeat.o(78794);
    return localg;
  }

  private static q akr()
  {
    AppMethodBeat.i(78795);
    q localq = (q)com.tencent.mm.model.q.Y(q.class);
    AppMethodBeat.o(78795);
    return localq;
  }

  public static m aks()
  {
    AppMethodBeat.i(78796);
    com.tencent.mm.kernel.g.RN().QU();
    m localm = (m)akr().fUl.get();
    AppMethodBeat.o(78796);
    return localm;
  }

  public static void e(e parame)
  {
    AppMethodBeat.i(78797);
    if (parame == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SubCoreStat", "dknetstat setNetworkMoniter  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      if (parame != null)
        parame.a(akr().fUk);
      AppMethodBeat.o(78797);
      return;
    }
  }

  public static void f(e parame)
  {
    AppMethodBeat.i(78798);
    if (parame == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SubCoreStat", "setKVReportMonitor  isnull:%b  ,  %s ", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      if (parame != null)
        parame.a(akr().fUm);
      AppMethodBeat.o(78798);
      return;
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(78800);
    e.d.a(Integer.valueOf(9998), this.fUk);
    com.tencent.mm.kernel.g.RO().a(this.fyJ);
    com.tencent.mm.model.ao.a.flv = new q.5(this);
    AppMethodBeat.o(78800);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(78799);
    com.tencent.mm.kernel.g.RO().b(this.fyJ);
    e.d.b(Integer.valueOf(9998), this.fUk);
    this.fUk = new l();
    com.tencent.mm.model.ao.a.flv = null;
    AppMethodBeat.o(78799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.q
 * JD-Core Version:    0.6.2
 */