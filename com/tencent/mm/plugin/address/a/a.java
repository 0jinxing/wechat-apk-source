package com.tencent.mm.plugin.address.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.address.model.j;
import com.tencent.mm.plugin.address.model.k;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class a
  implements at
{
  private l gIB;
  private com.tencent.mm.plugin.address.b.a.a gIC;
  private j gID;
  private k gIE;

  public a()
  {
    AppMethodBeat.i(16713);
    this.gIB = null;
    this.gIC = null;
    this.gID = new j();
    this.gIE = new k();
    AppMethodBeat.o(16713);
  }

  public static a arQ()
  {
    AppMethodBeat.i(16714);
    aw.ZE();
    a locala1 = (a)bw.oJ("plugin.address");
    a locala2 = locala1;
    if (locala1 == null)
    {
      ab.w("MicroMsg.SubCoreAddress", "not found in MMCore, new one");
      locala2 = new a();
      aw.ZE().a("plugin.address", locala2);
    }
    AppMethodBeat.o(16714);
    return locala2;
  }

  public static com.tencent.mm.plugin.address.b.a.a arR()
  {
    AppMethodBeat.i(16715);
    g.RN().QU();
    if (arQ().gIC == null)
      arQ().gIC = new com.tencent.mm.plugin.address.b.a.a();
    com.tencent.mm.plugin.address.b.a.a locala = arQ().gIC;
    AppMethodBeat.o(16715);
    return locala;
  }

  public static l arS()
  {
    AppMethodBeat.i(16716);
    g.RN().QU();
    if (arQ().gIB == null)
      arQ().gIB = new l();
    l locall = arQ().gIB;
    AppMethodBeat.o(16716);
    return locall;
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
    AppMethodBeat.i(16717);
    com.tencent.mm.sdk.b.a.xxA.c(this.gID);
    com.tencent.mm.sdk.b.a.xxA.c(this.gIE);
    l locall = arS();
    aw.ZK();
    String str = c.getAccPath();
    locall.path = (str + "addrmgr");
    AppMethodBeat.o(16717);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(16718);
    com.tencent.mm.sdk.b.a.xxA.d(this.gID);
    com.tencent.mm.sdk.b.a.xxA.d(this.gIE);
    AppMethodBeat.o(16718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.a.a
 * JD-Core Version:    0.6.2
 */