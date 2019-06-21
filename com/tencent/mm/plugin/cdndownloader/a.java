package com.tencent.mm.plugin.cdndownloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.plugin.cdndownloader.f.c;
import java.util.HashMap;

public final class a
  implements com.tencent.mm.kernel.api.bucket.a, d, com.tencent.mm.plugin.cdndownloader.b.a
{
  private c ksY;

  public final c beQ()
  {
    return this.ksY;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(859);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("CdnDownloadInfo".hashCode()), new a.1(this));
    AppMethodBeat.o(859);
    return localHashMap;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(860);
    this.ksY = new c(paramh1);
    AppMethodBeat.o(860);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.a
 * JD-Core Version:    0.6.2
 */