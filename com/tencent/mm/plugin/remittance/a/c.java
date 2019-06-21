package com.tencent.mm.plugin.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ix;
import com.tencent.mm.g.a.nm;
import com.tencent.mm.g.a.vb;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.remittance.b.b;
import com.tencent.mm.plugin.remittance.model.aa;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.ui.widget.a.e.c;
import java.util.HashMap;
import java.util.HashSet;

public class c
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private k.a foI;
  private bz.a luy;
  private aa pLl;
  public b pLm;
  private com.tencent.mm.plugin.remittance.b.d pLn;
  private com.tencent.mm.sdk.b.c<nm> pLo;
  private com.tencent.mm.sdk.b.c<vb> pLp;
  private com.tencent.mm.sdk.b.c<ix> pLq;

  static
  {
    AppMethodBeat.i(44442);
    com.tencent.mm.wallet_core.a.g("RemittanceProcess", a.class);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("DelayTransferRecord".hashCode()), new c.1());
    eaA.put(Integer.valueOf("RemittanceRecord".hashCode()), new c.2());
    AppMethodBeat.o(44442);
  }

  public c()
  {
    AppMethodBeat.i(44434);
    this.pLl = null;
    this.pLm = null;
    this.pLn = null;
    this.foI = new c.3(this);
    this.luy = new c.4(this);
    this.pLo = new c.5(this);
    this.pLp = new c.6(this);
    this.pLq = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(44434);
  }

  public static c ceW()
  {
    AppMethodBeat.i(44435);
    c localc = (c)q.Y(c.class);
    AppMethodBeat.o(44435);
    return localc;
  }

  public static b ceX()
  {
    AppMethodBeat.i(44436);
    if (ceW().pLm == null)
    {
      localObject = ceW();
      g.RQ();
      ((c)localObject).pLm = new b(g.RP().eJN);
    }
    Object localObject = ceW().pLm;
    AppMethodBeat.o(44436);
    return localObject;
  }

  public static com.tencent.mm.plugin.remittance.b.d ceY()
  {
    AppMethodBeat.i(44437);
    if (ceW().pLn == null)
    {
      localObject = ceW();
      g.RQ();
      ((c)localObject).pLn = new com.tencent.mm.plugin.remittance.b.d(g.RP().eJN);
    }
    Object localObject = ceW().pLn;
    AppMethodBeat.o(44437);
    return localObject;
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
    AppMethodBeat.i(44438);
    aa localaa;
    if (this.pLl != null)
      localaa = this.pLl;
    synchronized (localaa.lock)
    {
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      localaa.pQC = localHashSet;
      localaa.pQD.clear();
      com.tencent.mm.model.c.c.abi().c(this.foI);
      ((p)g.M(p.class)).getSysCmdMsgExtension().a("paymsg", this.luy, true);
      com.tencent.mm.sdk.b.a.xxA.b(this.pLo);
      com.tencent.mm.sdk.b.a.xxA.b(this.pLp);
      com.tencent.mm.sdk.b.a.xxA.b(this.pLq);
      AppMethodBeat.o(44438);
      return;
    }
  }

  public final aa ceZ()
  {
    AppMethodBeat.i(44440);
    if (this.pLl == null)
      this.pLl = new aa();
    aa localaa = this.pLl;
    AppMethodBeat.o(44440);
    return localaa;
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(44439);
    com.tencent.mm.model.c.c.abi().d(this.foI);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("paymsg", this.luy, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.pLo);
    com.tencent.mm.sdk.b.a.xxA.d(this.pLp);
    com.tencent.mm.sdk.b.a.xxA.d(this.pLq);
    AppMethodBeat.o(44439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.a.c
 * JD-Core Version:    0.6.2
 */