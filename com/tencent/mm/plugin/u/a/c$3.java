package com.tencent.mm.plugin.u.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(c.a parama, Intent paramIntent)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80759);
    d.b(this.pAB.getContext(), "freewifi", ".ui.FreeWifiEntryUI", this.evM);
    this.pAB.jZ(false);
    AppMethodBeat.o(80759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.3
 * JD-Core Version:    0.6.2
 */