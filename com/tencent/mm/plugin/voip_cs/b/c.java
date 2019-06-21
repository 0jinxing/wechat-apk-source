package com.tencent.mm.plugin.voip_cs.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class c
  implements at
{
  private static c tcF = null;
  private com.tencent.mm.plugin.voip_cs.b.b.a tcG;
  private e tcH;
  private d tcI;
  private com.tencent.mm.plugin.voip_cs.a.a tcJ;
  private com.tencent.mm.sdk.b.c tcK;

  public c()
  {
    AppMethodBeat.i(135290);
    this.tcG = new com.tencent.mm.plugin.voip_cs.b.b.a();
    this.tcH = new e();
    this.tcI = new d();
    this.tcJ = new com.tencent.mm.plugin.voip_cs.a.a();
    this.tcK = new c.1(this);
    AppMethodBeat.o(135290);
  }

  private static c cMd()
  {
    AppMethodBeat.i(135291);
    c localc = (c)q.Y(c.class);
    AppMethodBeat.o(135291);
    return localc;
  }

  public static com.tencent.mm.plugin.voip_cs.b.b.a cMe()
  {
    AppMethodBeat.i(135292);
    com.tencent.mm.plugin.voip_cs.b.b.a locala = cMd().tcG;
    AppMethodBeat.o(135292);
    return locala;
  }

  public static e cMf()
  {
    AppMethodBeat.i(135293);
    g.RN().QU();
    if (cMd().tcH == null)
      cMd().tcH = new e();
    e locale = cMd().tcH;
    AppMethodBeat.o(135293);
    return locale;
  }

  public static d cMg()
  {
    AppMethodBeat.i(135294);
    d locald = cMd().tcI;
    AppMethodBeat.o(135294);
    return locald;
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
    AppMethodBeat.i(135295);
    ab.d("MicroMsg.SubCoreVoipCS", "now account reset!");
    com.tencent.mm.sdk.b.a.xxA.c(this.tcJ);
    com.tencent.mm.sdk.b.a.xxA.c(this.tcK);
    AppMethodBeat.o(135295);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(135296);
    com.tencent.mm.sdk.b.a.xxA.d(this.tcJ);
    com.tencent.mm.sdk.b.a.xxA.d(this.tcK);
    AppMethodBeat.o(135296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c
 * JD-Core Version:    0.6.2
 */