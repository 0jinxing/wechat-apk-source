package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;

final class c$12
  implements DialogInterface.OnClickListener
{
  c$12(c paramc, d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23467);
    this.cgD.field_hadAlert = 1;
    this.pmK.a(this.cgD, false);
    AppMethodBeat.o(23467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.12
 * JD-Core Version:    0.6.2
 */