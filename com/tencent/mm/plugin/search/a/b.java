package com.tencent.mm.plugin.search.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.search.b.a.a.a;
import java.util.HashMap;

public final class b
  implements at
{
  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(24403);
    Object localObject = new a();
    ((n)g.M(n.class)).registerItemClickHandler(3, (com.tencent.mm.plugin.fts.a.d.a.b)localObject);
    localObject = new com.tencent.mm.plugin.search.b.a.a.b();
    ((n)g.M(n.class)).registerItemClickHandler(6, (com.tencent.mm.plugin.fts.a.d.a.b)localObject);
    AppMethodBeat.o(24403);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(24404);
    ((n)g.M(n.class)).unregisterItemClickHandler(3);
    ((n)g.M(n.class)).unregisterItemClickHandler(6);
    AppMethodBeat.o(24404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.search.a.b
 * JD-Core Version:    0.6.2
 */