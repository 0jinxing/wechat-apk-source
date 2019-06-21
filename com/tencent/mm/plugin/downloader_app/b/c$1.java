package com.tencent.mm.plugin.downloader_app.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;

final class c$1
  implements DialogInterface.OnClickListener
{
  c$1(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136085);
    paramDialogInterface = c.In(this.kOG.appId);
    if (paramDialogInterface != null)
    {
      paramDialogInterface.field_status = 4;
      c.e(paramDialogInterface);
    }
    while (true)
    {
      d.hD(paramDialogInterface.field_downloadId);
      if (this.kOH != null)
        this.kOH.a(a.a.kOa, paramDialogInterface.field_downloadId);
      AppMethodBeat.o(136085);
      return;
      paramDialogInterface = new com.tencent.mm.plugin.downloader.f.a();
      paramDialogInterface.field_downloadId = System.currentTimeMillis();
      paramDialogInterface.field_appId = this.kOG.appId;
      paramDialogInterface.field_downloadUrl = this.kOG.downloadUrl;
      paramDialogInterface.field_status = 4;
      c.d(paramDialogInterface);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c.1
 * JD-Core Version:    0.6.2
 */