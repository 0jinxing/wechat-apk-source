package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.plugin.downloader.f.a;

final class j$1
  implements Runnable
{
  j$1(j paramj, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2465);
    a locala = c.hv(this.kMG);
    if (locala == null)
      AppMethodBeat.o(2465);
    while (true)
    {
      return;
      f.afx().rO(locala.field_downloadUrl);
      if (locala.field_status != 5)
      {
        locala.field_status = 5;
        c.e(locala);
        this.kNA.kMT.hr(this.kMG);
      }
      AppMethodBeat.o(2465);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.j.1
 * JD-Core Version:    0.6.2
 */