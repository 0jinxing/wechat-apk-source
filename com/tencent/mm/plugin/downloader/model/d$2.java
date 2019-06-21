package com.tencent.mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class d$2
  implements Runnable
{
  d$2(d paramd, a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2408);
    PendingIntent localPendingIntent = null;
    if (this.kMF.field_fileType == 1)
      localPendingIntent = d.a(this.kMF.field_filePath, this.kMF);
    if ((this.kMF.field_showNotification) && (bo.isNullOrNil(this.kMF.field_fileName)))
      d.b(this.kMF.field_appId, ah.getContext().getString(2131299777), "", localPendingIntent);
    while (true)
    {
      if ((this.kMF.field_autoInstall) && (this.kMF.field_fileType == 1) && (!this.kMF.field_reserveInWifi))
        d.f(this.kMF);
      d.a(this.kMX).c(this.kMF.field_downloadId, this.kMF.field_filePath, this.kML);
      AppMethodBeat.o(2408);
      return;
      if ((this.kMF.field_showNotification) && (!bo.isNullOrNil(this.kMF.field_fileName)))
        d.b(this.kMF.field_appId, this.kMF.field_fileName, ah.getContext().getString(2131299777), localPendingIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.d.2
 * JD-Core Version:    0.6.2
 */