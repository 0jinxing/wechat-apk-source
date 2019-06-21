package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.cc;
import com.tencent.mm.model.cc.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.multitalk.a.c;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public class p
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private cc.a mBB;
  private p.a oHA;
  private h oHB;
  private com.tencent.mm.plugin.multitalk.a.a oHC;
  private c oHD;
  private g oHE;
  private d oHw;
  private f oHx;
  private m oHy;
  private i oHz;

  static
  {
    AppMethodBeat.i(54102);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("MULTITALKINFO_TABLE".hashCode()), new p.1());
    eaA.put(Integer.valueOf("MULTITALKMEMBER_TABLE".hashCode()), new p.2());
    AppMethodBeat.o(54102);
  }

  public p()
  {
    AppMethodBeat.i(54090);
    this.mBB = new p.3(this);
    AppMethodBeat.o(54090);
  }

  private static p bSa()
  {
    AppMethodBeat.i(54091);
    p localp = (p)q.Y(p.class);
    AppMethodBeat.o(54091);
    return localp;
  }

  public static com.tencent.mm.plugin.multitalk.a.a bSb()
  {
    AppMethodBeat.i(54092);
    com.tencent.mm.kernel.g.RN();
    if (com.tencent.mm.kernel.a.QF() == 0)
    {
      localObject = new b();
      AppMethodBeat.o(54092);
      throw ((Throwable)localObject);
    }
    if (bSa().oHC == null)
      bSa().oHC = new com.tencent.mm.plugin.multitalk.a.a(com.tencent.mm.kernel.g.RP().eJN);
    Object localObject = bSa().oHC;
    AppMethodBeat.o(54092);
    return localObject;
  }

  public static c bSc()
  {
    AppMethodBeat.i(54093);
    com.tencent.mm.kernel.g.RN();
    if (com.tencent.mm.kernel.a.QF() == 0)
    {
      localObject = new b();
      AppMethodBeat.o(54093);
      throw ((Throwable)localObject);
    }
    if (bSa().oHD == null)
      bSa().oHD = new c(com.tencent.mm.kernel.g.RP().eJN);
    Object localObject = bSa().oHD;
    AppMethodBeat.o(54093);
    return localObject;
  }

  public static i bSd()
  {
    AppMethodBeat.i(54094);
    com.tencent.mm.kernel.g.RN().QU();
    if (bSa().oHz == null)
      bSa().oHz = new i();
    i locali = bSa().oHz;
    AppMethodBeat.o(54094);
    return locali;
  }

  public static d bSe()
  {
    AppMethodBeat.i(54095);
    com.tencent.mm.kernel.g.RN().QU();
    if (bSa().oHw == null)
      bSa().oHw = new d();
    d locald = bSa().oHw;
    AppMethodBeat.o(54095);
    return locald;
  }

  public static f bSf()
  {
    AppMethodBeat.i(54096);
    com.tencent.mm.kernel.g.RN().QU();
    if (bSa().oHx == null)
      bSa().oHx = new f();
    f localf = bSa().oHx;
    AppMethodBeat.o(54096);
    return localf;
  }

  public static m bSg()
  {
    AppMethodBeat.i(54097);
    com.tencent.mm.kernel.g.RN().QU();
    if (bSa().oHy == null)
      bSa().oHy = new m();
    m localm = bSa().oHy;
    AppMethodBeat.o(54097);
    return localm;
  }

  public static h bSh()
  {
    AppMethodBeat.i(54100);
    if (bSa().oHB == null)
      bSa().oHB = new h();
    h localh = bSa().oHB;
    AppMethodBeat.o(54100);
    return localh;
  }

  public static g bSi()
  {
    AppMethodBeat.i(54101);
    if (bSa().oHE == null)
      bSa().oHE = new g();
    g localg = bSa().oHE;
    AppMethodBeat.o(54101);
    return localg;
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
    AppMethodBeat.i(54098);
    this.oHw = new d();
    this.oHA = new p.a(this);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("multivoip", this.oHA, true);
    com.tencent.mm.kernel.g.RR().a(this.mBB);
    com.tencent.mm.kernel.g.a(a.class, bSh());
    bSh().bRT();
    AppMethodBeat.o(54098);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(54099);
    Object localObject;
    if (this.oHw != null)
    {
      localObject = this.oHw;
      com.tencent.mm.kernel.g.Rg().b(1918, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1919, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1927, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1928, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1929, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1931, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1932, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1933, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1935, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1937, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1938, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(1939, (com.tencent.mm.ai.f)localObject);
      this.oHw = null;
    }
    if (this.oHx != null)
    {
      localObject = this.oHx;
      ah.getContext().unregisterReceiver(((f)localObject).oGz);
      com.tencent.mm.sdk.b.a.xxA.d(((f)localObject).oGA);
      ((f)localObject).h(false, false, false);
      this.oHx = null;
    }
    if (this.oHy != null)
    {
      this.oHy.bRZ();
      this.oHy = null;
    }
    if (this.oHz != null)
    {
      this.oHz.reset();
      this.oHz = null;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("multivoip", this.oHA, true);
    com.tencent.mm.kernel.g.RR().b(this.mBB);
    com.tencent.mm.kernel.g.L(a.class);
    AppMethodBeat.o(54099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.p
 * JD-Core Version:    0.6.2
 */