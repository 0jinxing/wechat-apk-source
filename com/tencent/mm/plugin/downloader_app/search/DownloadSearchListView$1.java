package com.tencent.mm.plugin.downloader_app.search;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.b.a.b;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

final class DownloadSearchListView$1
  implements a.b
{
  DownloadSearchListView$1(DownloadSearchListView paramDownloadSearchListView)
  {
  }

  public final void E(int paramInt, long paramLong)
  {
    AppMethodBeat.i(136173);
    if (paramInt == 9)
    {
      Object localObject = c.hv(paramLong);
      if (localObject != null)
      {
        a locala = DownloadSearchListView.a(this.kPC);
        localObject = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId;
        if ((!bo.ek(locala.iPr)) && (!bo.isNullOrNil((String)localObject)))
        {
          Iterator localIterator = locala.iPr.iterator();
          while (localIterator.hasNext())
          {
            b localb = (b)localIterator.next();
            if ((localb.appId != null) && (localb.appId.equals(localObject)))
              localb.state = 2;
          }
          locala.aop.notifyChanged();
        }
      }
    }
    AppMethodBeat.o(136173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView.1
 * JD-Core Version:    0.6.2
 */