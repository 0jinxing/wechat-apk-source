package com.tencent.mm.plugin.downloader_app.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;

final class a$3
  implements DialogInterface.OnClickListener
{
  a$3(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136318);
    ((d)g.K(d.class)).a(this.kRn.context, null, null);
    AppMethodBeat.o(136318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.e.a.3
 * JD-Core Version:    0.6.2
 */