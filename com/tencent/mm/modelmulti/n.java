package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aq.c;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.be;
import java.util.HashMap;

public class n
  implements at
{
  public static HashMap<Integer, h.d> eaA;
  private c fJe;

  static
  {
    AppMethodBeat.i(16510);
    eaA = new HashMap();
    AppMethodBeat.o(16510);
  }

  public static com.tencent.mm.plugin.messenger.foundation.a.a.n ahV()
  {
    AppMethodBeat.i(16506);
    g.RQ();
    g.RN().QU();
    com.tencent.mm.plugin.messenger.foundation.a.a.n localn = ((j)g.K(j.class)).ahV();
    AppMethodBeat.o(16506);
    return localn;
  }

  public static o ahW()
  {
    AppMethodBeat.i(16507);
    o localo = ((com.tencent.mm.plugin.zero.b.b)g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW();
    AppMethodBeat.o(16507);
    return localo;
  }

  public static n ahX()
  {
    AppMethodBeat.i(16508);
    aw.ZE();
    n localn1 = (n)bw.oJ(n.class.getName());
    n localn2 = localn1;
    if (localn1 == null)
    {
      localn2 = new n();
      aw.ZE().a(n.class.getName(), localn2);
    }
    AppMethodBeat.o(16508);
    return localn2;
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
    AppMethodBeat.i(16505);
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.xxA;
    c localc = new c();
    this.fJe = localc;
    locala.c(localc);
    AppMethodBeat.o(16505);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(16509);
    if (this.fJe != null)
    {
      c localc = this.fJe;
      com.tencent.mm.sdk.b.a.xxA.d(localc.fCr);
      com.tencent.mm.aq.b.agG().fCk = null;
      ((j)g.K(j.class)).XR().b(localc);
      ahX();
      ahV().d(localc);
      com.tencent.mm.sdk.b.a.xxA.d(this.fJe);
    }
    AppMethodBeat.o(16509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.n
 * JD-Core Version:    0.6.2
 */