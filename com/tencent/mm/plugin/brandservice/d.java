package com.tencent.mm.plugin.brandservice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class d
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private d.a jKr;
  private com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.b jKs;

  static
  {
    AppMethodBeat.i(13821);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("BIZAPPMSGREPORTCCONTEXT_TABLE".hashCode()), new d.1());
    AppMethodBeat.o(13821);
  }

  private static d aVS()
  {
    AppMethodBeat.i(13817);
    d locald = (d)q.Y(d.class);
    AppMethodBeat.o(13817);
    return locald;
  }

  public static com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.b aVT()
  {
    AppMethodBeat.i(13820);
    g.RN().QU();
    if (aVS().jKs == null)
      aVS().jKs = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.b(g.RP().eJN);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.b localb = aVS().jKs;
    AppMethodBeat.o(13820);
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
    AppMethodBeat.i(13818);
    ab.d("MicroMsg.BrandService.SubCoreBrandService", "on sub core brand service reset");
    if (this.jKr == null)
      this.jKr = new d.a();
    com.tencent.mm.sdk.b.a.xxA.c(this.jKr);
    Object localObject = new com.tencent.mm.plugin.brandservice.ui.a.d();
    ((n)g.M(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.brandservice.ui.a.b();
    ((n)g.M(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    AppMethodBeat.o(13818);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(13819);
    if (this.jKr != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.jKr);
    ((n)g.M(n.class)).unregisterFTSUILogic(96);
    ((n)g.M(n.class)).unregisterFTSUILogic(4208);
    AppMethodBeat.o(13819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.d
 * JD-Core Version:    0.6.2
 */