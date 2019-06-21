package com.tencent.mm.plugin.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ax.b;
import com.tencent.mm.ax.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bn;
import java.util.HashMap;

public final class a extends q
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c
{
  private static HashMap<Integer, h.d> eaA;
  private static a oSU;
  private d oSV;
  private bn oSW;
  private com.tencent.mm.ax.c oSX;
  private com.tencent.mm.ax.e oSY;
  private final com.tencent.mm.ai.f oSZ;

  static
  {
    AppMethodBeat.i(79113);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("NEWTIPS_TABLE".hashCode()), new a.2());
    AppMethodBeat.o(79113);
  }

  private a()
  {
    super(com.tencent.mm.ax.f.class);
    AppMethodBeat.i(79106);
    this.oSV = null;
    this.oSW = null;
    this.oSX = null;
    this.oSY = new com.tencent.mm.ax.e();
    this.oSZ = new a.1(this);
    AppMethodBeat.o(79106);
  }

  public static a bVs()
  {
    try
    {
      AppMethodBeat.i(79107);
      if (oSU == null)
      {
        locala = new com/tencent/mm/plugin/r/a;
        locala.<init>();
        oSU = locala;
      }
      a locala = oSU;
      AppMethodBeat.o(79107);
      return locala;
    }
    finally
    {
    }
  }

  public static d bVt()
  {
    AppMethodBeat.i(79110);
    g.RN().QU();
    if (bVs().oSV == null)
      bVs().oSV = new d();
    d locald = bVs().oSV;
    AppMethodBeat.o(79110);
    return locald;
  }

  public static bn bVu()
  {
    AppMethodBeat.i(79111);
    g.RN().QU();
    if (bVs().oSW == null)
    {
      localObject = bVs();
      g.RQ();
      ((a)localObject).oSW = new bn(g.RP().eJN);
    }
    Object localObject = bVs().oSW;
    AppMethodBeat.o(79111);
    return localObject;
  }

  public static com.tencent.mm.ax.c bVv()
  {
    AppMethodBeat.i(79112);
    g.RN().QU();
    if (bVs().oSX == null)
      bVs().oSX = new com.tencent.mm.ax.c();
    com.tencent.mm.ax.c localc = bVs().oSX;
    AppMethodBeat.o(79112);
    return localc;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(79108);
    super.onAccountInitialized(paramc);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("newtips", this.oSY);
    g.Rg().a(597, this.oSZ);
    bVt();
    int i = b.fKD;
    paramc = b.fKK;
    d.b(i, b.fKC, "", paramc);
    ab.i("MicroMsg.NewTipsManager", "dancy register dynamic newtips, tipsId:%s, path:%s", new Object[] { Integer.valueOf(i), paramc });
    AppMethodBeat.o(79108);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(79109);
    super.onAccountRelease();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("newtips", this.oSY);
    g.Rg().b(597, this.oSZ);
    AppMethodBeat.o(79109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.r.a
 * JD-Core Version:    0.6.2
 */