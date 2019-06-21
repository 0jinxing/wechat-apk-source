package com.tencent.mm.plugin.downloader_app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.api.bucket.a;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.plugin.downloader_app.a.e;
import java.util.HashMap;

public final class c
  implements a, d, e
{
  private com.tencent.mm.plugin.downloader_app.d.c kNX;

  public final com.tencent.mm.plugin.downloader_app.d.c biA()
  {
    return this.kNX;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(136025);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("DOWNLOADTASKITEM_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return com.tencent.mm.plugin.downloader_app.d.c.fnj;
      }
    });
    AppMethodBeat.o(136025);
    return localHashMap;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(136026);
    this.kNX = new com.tencent.mm.plugin.downloader_app.d.c(paramh1);
    AppMethodBeat.o(136026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.c
 * JD-Core Version:    0.6.2
 */