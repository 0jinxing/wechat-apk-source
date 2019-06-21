package com.tencent.mm.model.c;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.storage.d;
import java.util.HashMap;

public class c
  implements at
{

  @SuppressLint({"UseSparseArrays"})
  private static HashMap<Integer, h.d> eaA;
  private d foE;
  private com.tencent.mm.storage.b foF;
  private bz.a foG;
  private com.tencent.mm.sdk.b.c foH;
  private k.a foI;
  private com.tencent.mm.vending.b.b foJ;
  private final com.tencent.mm.plugin.auth.a.a foK;

  static
  {
    AppMethodBeat.i(118187);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("NEW_ABTEST_TABLE".hashCode()), new c.5());
    eaA.put(Integer.valueOf("NEW_ABTEST_INFO_TABLE".hashCode()), new c.6());
    AppMethodBeat.o(118187);
  }

  public c()
  {
    AppMethodBeat.i(118180);
    this.foG = new c.1(this);
    this.foH = new c.2(this);
    this.foI = new c.3(this);
    this.foJ = null;
    this.foK = new c.4(this);
    AppMethodBeat.o(118180);
  }

  private static c abh()
  {
    try
    {
      AppMethodBeat.i(118181);
      c localc = (c)q.Y(c.class);
      AppMethodBeat.o(118181);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static d abi()
  {
    AppMethodBeat.i(118182);
    g.RN().QU();
    if (abh().foE == null)
      abh().foE = new d(g.RP().eJN);
    d locald = abh().foE;
    AppMethodBeat.o(118182);
    return locald;
  }

  public static com.tencent.mm.storage.b abj()
  {
    AppMethodBeat.i(118183);
    g.RN().QU();
    if (abh().foF == null)
      abh().foF = new com.tencent.mm.storage.b(g.RP().eJN);
    com.tencent.mm.storage.b localb = abh().foF;
    AppMethodBeat.o(118183);
    return localb;
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
    AppMethodBeat.i(118184);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("newabtest", this.foG, true);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("newabtestinfo", this.foG, true);
    com.tencent.mm.sdk.b.a.xxA.c(this.foH);
    abi().c(this.foI);
    this.foJ = ((com.tencent.mm.plugin.auth.a.b)g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(this.foK);
    AppMethodBeat.o(118184);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(118185);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("newabtest", this.foG, true);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("newabtestinfo", this.foG, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.foH);
    abi().d(this.foI);
    if (this.foJ != null)
    {
      this.foJ.dead();
      this.foJ = null;
    }
    AppMethodBeat.o(118185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.c
 * JD-Core Version:    0.6.2
 */