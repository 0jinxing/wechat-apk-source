package com.tencent.mm.plugin.downloader_app.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;

final class a$2
  implements DialogInterface.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136317);
    g.K(d.class);
    this.kRn.s(this.kRn.context, false);
    AppMethodBeat.o(136317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.e.a.2
 * JD-Core Version:    0.6.2
 */