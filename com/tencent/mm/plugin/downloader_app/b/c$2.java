package com.tencent.mm.plugin.downloader_app.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;

final class c$2
  implements DialogInterface.OnClickListener
{
  c$2(a parama, a.b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136086);
    d.IF(this.kMF.field_appId);
    c.a(this.kMF, false, this.kOH);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(136086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c.2
 * JD-Core Version:    0.6.2
 */