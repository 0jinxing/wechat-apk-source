package com.tencent.mm.plugin.downloader_app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;

final class a$4
  implements DialogInterface.OnClickListener
{
  a$4(a parama, PBool paramPBool, DialogInterface.OnClickListener paramOnClickListener, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136008);
    this.kNS.value = true;
    if (this.kNR != null)
      this.kNR.onClick(paramDialogInterface, paramInt);
    this.kNS.value = true;
    com.tencent.mm.plugin.downloader_app.c.a.a(15, 1502, 1, 23, this.val$appId, "", "");
    AppMethodBeat.o(136008);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.a.4
 * JD-Core Version:    0.6.2
 */