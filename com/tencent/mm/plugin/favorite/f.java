package com.tencent.mm.plugin.favorite;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.b.a;
import java.util.HashMap;

public final class f
  implements at
{
  private com.tencent.mm.sdk.b.c mqs;

  public f()
  {
    AppMethodBeat.i(20537);
    this.mqs = new f.1(this);
    AppMethodBeat.o(20537);
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
    AppMethodBeat.i(20538);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Fav.SubCoreFav", "onAccountPostReset updated:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    a.xxA.b(this.mqs);
    g.a(y.class, new c());
    g.a(com.tencent.mm.plugin.fav.a.ab.class, new e());
    AppMethodBeat.o(20538);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(20539);
    a.xxA.d(this.mqs);
    ((n)g.M(n.class)).unregisterFTSUILogic(128);
    ((n)g.M(n.class)).unregisterFTSUILogic(4192);
    AppMethodBeat.o(20539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.f
 * JD-Core Version:    0.6.2
 */