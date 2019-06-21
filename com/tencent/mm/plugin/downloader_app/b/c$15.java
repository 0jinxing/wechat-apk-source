package com.tencent.mm.plugin.downloader_app.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;

final class c$15
  implements DialogInterface.OnClickListener
{
  c$15(a parama, a.b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136096);
    this.kMF.field_status = 4;
    c.e(this.kMF);
    d.hD(this.kMF.field_downloadId);
    if (this.kOH != null)
      this.kOH.a(a.a.kOa, this.kMF.field_downloadId);
    if (this.kOH != null)
      this.kOH.a(a.a.kOa, this.kMF.field_downloadId);
    AppMethodBeat.o(136096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c.15
 * JD-Core Version:    0.6.2
 */