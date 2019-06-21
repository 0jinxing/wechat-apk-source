package com.tencent.mm.plugin.downloader_app.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.a.a.b;

final class c$12
  implements DialogInterface.OnClickListener
{
  c$12(a parama, a.b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136094);
    d.IF(this.kOG.appId);
    this.kOG.kNt = false;
    c.a(this.kOG, this.kOH);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(136094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c.12
 * JD-Core Version:    0.6.2
 */