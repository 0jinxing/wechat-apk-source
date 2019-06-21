package com.tencent.mm.plugin.downloader_app.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;

final class a$4
  implements DialogInterface.OnClickListener
{
  a$4(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(136319);
    g.K(d.class);
    this.kRn.s(this.kRn.context, false);
    AppMethodBeat.o(136319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.e.a.4
 * JD-Core Version:    0.6.2
 */