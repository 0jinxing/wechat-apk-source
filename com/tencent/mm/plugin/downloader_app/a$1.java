package com.tencent.mm.plugin.downloader_app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;

final class a$1
  implements DialogInterface.OnClickListener
{
  a$1(a parama, DialogInterface.OnClickListener paramOnClickListener, PBool paramPBool, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136005);
    if (this.kNR != null)
      this.kNR.onClick(paramDialogInterface, paramInt);
    this.kNS.value = true;
    com.tencent.mm.plugin.downloader_app.c.a.a(15, 1501, 1, 23, this.val$appId, "", "");
    AppMethodBeat.o(136005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.a.1
 * JD-Core Version:    0.6.2
 */