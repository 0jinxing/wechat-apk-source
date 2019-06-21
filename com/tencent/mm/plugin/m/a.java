package com.tencent.mm.plugin.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.bh;
import java.util.HashMap;

public final class a
  implements com.tencent.mm.kernel.api.bucket.a, d, com.tencent.mm.plugin.m.a.a
{
  private bh opq;

  public final bh XT()
  {
    AppMethodBeat.i(79102);
    g.RQ();
    g.RN().QU();
    bh localbh = this.opq;
    AppMethodBeat.o(79102);
    return localbh;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(79104);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("MediaCheckDumplicationStorage".hashCode()), new a.1(this));
    AppMethodBeat.o(79104);
    return localHashMap;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(79103);
    this.opq = new bh(paramh1);
    AppMethodBeat.o(79103);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.m.a
 * JD-Core Version:    0.6.2
 */