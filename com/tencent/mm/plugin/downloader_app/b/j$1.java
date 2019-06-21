package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class j$1
  implements d.d
{
  public final void E(int paramInt, long paramLong)
  {
    AppMethodBeat.i(136147);
    a locala = c.hv(paramLong);
    if (locala == null)
      AppMethodBeat.o(136147);
    while (true)
    {
      return;
      ab.i("MicroMsg.TaskManager", "onDownloadStatusChange, event = %d, appId = %s", new Object[] { Integer.valueOf(paramInt), locala.field_appId });
      if (!j.contains(locala.field_appId))
      {
        AppMethodBeat.o(136147);
      }
      else if (paramInt == 9)
      {
        j.jJ(locala.field_appId);
        AppMethodBeat.o(136147);
      }
      else if ((paramInt == 1) || (paramInt == 7))
      {
        f localf = g.bT(locala.field_appId, true);
        if ((localf != null) && (p.u(ah.getContext(), localf.field_packageName)))
        {
          ab.i("MicroMsg.TaskManager", "onDownloadStatusChange, hasInstall");
          AppMethodBeat.o(136147);
        }
        else
        {
          j.sS(locala.field_appId);
        }
      }
      else
      {
        AppMethodBeat.o(136147);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.j.1
 * JD-Core Version:    0.6.2
 */