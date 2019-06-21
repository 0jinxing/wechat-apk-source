package com.tencent.mm.plugin.cdndownloader.d;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.Iterator;
import java.util.Set;

final class a$3
  implements ap.a
{
  a$3(a parama)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(894);
    ab.d("MicroMsg.CDNDownloadClient", "checkProcessTimer");
    if (a.c(this.ktp).size() == 0)
      AppMethodBeat.o(894);
    while (true)
    {
      return bool;
      if (a.h(this.ktp) != null);
      try
      {
        ab.d("MicroMsg.CDNDownloadClient", "checkActive");
        a.h(this.ktp).beT();
        AppMethodBeat.o(894);
        bool = true;
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.CDNDownloadClient", "check process active false");
        h.pYm.a(710L, 3L, 1L, false);
        Iterator localIterator;
        if (a.i(this.ktp))
        {
          a.a(this.ktp, System.currentTimeMillis());
          localIterator = a.c(this.ktp).iterator();
          while (localIterator.hasNext())
            ((CDNTaskInfo)localIterator.next()).ktw = true;
          a.j(this.ktp);
          AppMethodBeat.o(894);
          bool = true;
        }
        else
        {
          ab.i("MicroMsg.CDNDownloadClient", "dead twice in 1 min, something wrong must be happened");
          h.pYm.a(710L, 4L, 1L, false);
          localIterator = a.c(this.ktp).iterator();
          while (localIterator.hasNext())
          {
            CDNTaskInfo localCDNTaskInfo = (CDNTaskInfo)localIterator.next();
            a.k(this.ktp).f(localCDNTaskInfo.downloadUrl, 4, com.tencent.mm.plugin.downloader.a.a.kJS, null);
          }
          a.l(this.ktp);
          AppMethodBeat.o(894);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a.3
 * JD-Core Version:    0.6.2
 */