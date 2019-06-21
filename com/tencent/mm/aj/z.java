package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.t;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class z
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private static long fwQ;
  private com.tencent.mm.model.e flI;
  private e fwR;
  private m.a fwS;
  private k fwT;
  private i fwU;
  private h fwV;
  private d fwW;
  private com.tencent.mm.aj.a.b fwX;
  private com.tencent.mm.aj.a.k fwY;
  private com.tencent.mm.aj.a.g fwZ;
  private com.tencent.mm.aj.a.i fxa;
  private com.tencent.mm.aj.a.h fxb;
  private c fxc;
  private r fxd;
  private t fxe;
  private a fxf;
  private bz.a fxg;
  private be.a fxh;
  private e.a fxi;

  static
  {
    AppMethodBeat.i(11488);
    fwQ = 0L;
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("BIZINFO_TABLE".hashCode()), new z.1());
    eaA.put(Integer.valueOf("BIZKF_TABLE".hashCode()), new z.3());
    eaA.put(Integer.valueOf("BIZCHAT_TABLE".hashCode()), new z.4());
    eaA.put(Integer.valueOf("BIZCHATUSER_TABLE".hashCode()), new z.5());
    eaA.put(Integer.valueOf("BIZCONVERSATION_TABLE".hashCode()), new z.6());
    eaA.put(Integer.valueOf("BIZCHAMYUSERINFO_TABLE".hashCode()), new z.7());
    eaA.put(Integer.valueOf("BIZENTERPRISE_TABLE".hashCode()), new z.8());
    AppMethodBeat.o(11488);
  }

  public z()
  {
    AppMethodBeat.i(11467);
    this.fwS = null;
    this.fwT = null;
    this.fwV = null;
    this.fwW = null;
    this.fwX = null;
    this.fwY = null;
    this.fwZ = null;
    this.fxa = null;
    this.fxb = null;
    this.fxc = null;
    this.fxd = null;
    this.fxe = null;
    this.flI = new com.tencent.mm.model.e();
    this.fxg = new z.9(this);
    this.fxh = new z.10(this);
    this.fxi = new z.2(this);
    AppMethodBeat.o(11467);
  }

  private static z aeP()
  {
    try
    {
      AppMethodBeat.i(11468);
      z localz = (z)q.Y(z.class);
      AppMethodBeat.o(11468);
      return localz;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static i aeQ()
  {
    AppMethodBeat.i(11469);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwU == null)
      aeP().fwU = new i(com.tencent.mm.kernel.g.RP().eJN);
    i locali = aeP().fwU;
    AppMethodBeat.o(11469);
    return locali;
  }

  public static e aeR()
  {
    AppMethodBeat.i(11470);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwR == null)
      aeP().fwR = new e(com.tencent.mm.kernel.g.RP().eJN);
    e locale = aeP().fwR;
    AppMethodBeat.o(11470);
    return locale;
  }

  public static h aeS()
  {
    AppMethodBeat.i(11471);
    com.tencent.mm.kernel.g.RN().QU();
    h localh;
    if (aeP().fwV == null)
    {
      aeP().fwV = new h();
      localh = aeP().fwV;
      com.tencent.mm.kernel.g.RO().eJo.a(675, localh);
      com.tencent.mm.kernel.g.RO().eJo.a(672, localh);
      com.tencent.mm.kernel.g.RO().eJo.a(674, localh);
    }
    synchronized (localh.cli)
    {
      localh.fwn.clear();
      ??? = aeP().fwV;
      AppMethodBeat.o(11471);
      return ???;
    }
  }

  public static d aeT()
  {
    AppMethodBeat.i(11472);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwW == null)
      aeP().fwW = new d(com.tencent.mm.kernel.g.RP().eJN);
    d locald = aeP().fwW;
    AppMethodBeat.o(11472);
    return locald;
  }

  public static com.tencent.mm.aj.a.b aeU()
  {
    AppMethodBeat.i(11473);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwX == null)
      aeP().fwX = new com.tencent.mm.aj.a.b(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.aj.a.b localb = aeP().fwX;
    AppMethodBeat.o(11473);
    return localb;
  }

  public static com.tencent.mm.aj.a.k aeV()
  {
    AppMethodBeat.i(11474);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwY == null)
      aeP().fwY = new com.tencent.mm.aj.a.k(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.aj.a.k localk = aeP().fwY;
    AppMethodBeat.o(11474);
    return localk;
  }

  public static com.tencent.mm.aj.a.g aeW()
  {
    AppMethodBeat.i(11475);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwZ == null)
      aeP().fwZ = new com.tencent.mm.aj.a.g(com.tencent.mm.kernel.g.RP().eJN);
    com.tencent.mm.aj.a.g localg = aeP().fwZ;
    AppMethodBeat.o(11475);
    return localg;
  }

  public static r aeX()
  {
    AppMethodBeat.i(11476);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fxd == null)
      aeP().fxd = new r(com.tencent.mm.kernel.g.RP().eJN);
    r localr = aeP().fxd;
    AppMethodBeat.o(11476);
    return localr;
  }

  public static t aeY()
  {
    AppMethodBeat.i(11477);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fxe == null)
      aeP().fxe = new t(com.tencent.mm.kernel.g.RP().eJN);
    t localt = aeP().fxe;
    AppMethodBeat.o(11477);
    return localt;
  }

  public static com.tencent.mm.aj.a.h aeZ()
  {
    AppMethodBeat.i(11478);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fxb == null)
      aeP().fxb = new com.tencent.mm.aj.a.h();
    com.tencent.mm.aj.a.h localh = aeP().fxb;
    AppMethodBeat.o(11478);
    return localh;
  }

  public static c afa()
  {
    AppMethodBeat.i(11479);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fxc == null)
      aeP().fxc = new c(com.tencent.mm.kernel.g.RP().eJN);
    c localc = aeP().fxc;
    AppMethodBeat.o(11479);
    return localc;
  }

  public static m.a afb()
  {
    AppMethodBeat.i(11480);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwS == null)
      aeP().fwS = new m.a();
    m.a locala = aeP().fwS;
    AppMethodBeat.o(11480);
    return locala;
  }

  public static k afc()
  {
    AppMethodBeat.i(11481);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fwT == null)
      aeP().fwT = new k();
    k localk = aeP().fwT;
    AppMethodBeat.o(11481);
    return localk;
  }

  public static a afd()
  {
    AppMethodBeat.i(11482);
    if (aeP().fxf == null)
      aeP().fxf = new a();
    a locala = aeP().fxf;
    AppMethodBeat.o(11482);
    return locala;
  }

  public static com.tencent.mm.aj.a.i afe()
  {
    AppMethodBeat.i(11483);
    com.tencent.mm.kernel.g.RN().QU();
    if (aeP().fxa == null)
      aeP().fxa = new com.tencent.mm.aj.a.i();
    com.tencent.mm.aj.a.i locali = aeP().fxa;
    AppMethodBeat.o(11483);
    return locali;
  }

  public static long aff()
  {
    AppMethodBeat.i(11484);
    if (fwQ == 0L)
    {
      Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJR, null);
      if ((localObject != null) && ((localObject instanceof Long)))
      {
        fwQ = ((Long)localObject).longValue();
        ab.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime : %d.(get from ConfigStorage)", new Object[] { Long.valueOf(fwQ) });
      }
    }
    if (fwQ == 0L)
    {
      fwQ = System.currentTimeMillis();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJR, Long.valueOf(fwQ));
      ab.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime is 0, so get current time : %d.", new Object[] { Long.valueOf(fwQ) });
    }
    long l = fwQ;
    AppMethodBeat.o(11484);
    return l;
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
    AppMethodBeat.i(11485);
    e.d.a(Integer.valueOf(55), this.flI);
    e.d.a(Integer.valueOf(57), this.flI);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().c(this.fxh);
    aeR().a(this.fxi, null);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("mmbizattrappsvr_BizAttrSync", this.fxg, true);
    AppMethodBeat.o(11485);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(11486);
    e.d.b(Integer.valueOf(55), this.flI);
    e.d.b(Integer.valueOf(57), this.flI);
    h localh;
    if (aeP().fwV != null)
    {
      localh = aeP().fwV;
      com.tencent.mm.kernel.g.RO().eJo.b(675, localh);
      com.tencent.mm.kernel.g.RO().eJo.b(672, localh);
      com.tencent.mm.kernel.g.RO().eJo.b(674, localh);
    }
    synchronized (localh.cli)
    {
      localh.fwn.clear();
      localh.fwm.clear();
      if (com.tencent.mm.kernel.g.RN().QY())
      {
        ((j)com.tencent.mm.kernel.g.K(j.class)).XR().d(this.fxh);
        aeR().a(this.fxi);
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("mmbizattrappsvr_BizAttrSync", this.fxg, true);
      AppMethodBeat.o(11486);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.z
 * JD-Core Version:    0.6.2
 */