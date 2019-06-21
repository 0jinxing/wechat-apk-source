package com.tencent.mm.plugin.downloader_app.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.c.a;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136087);
    if (this.kOI != null)
      a.a(10, a.tQ(this.kOI.type), this.kOI.position, 4, this.kOI.appId, "", "");
    paramDialogInterface.dismiss();
    AppMethodBeat.o(136087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c.3
 * JD-Core Version:    0.6.2
 */