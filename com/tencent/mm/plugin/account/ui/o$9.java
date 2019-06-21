package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.j;
import com.tencent.mm.plugin.account.model.j.a;

final class o$9
  implements DialogInterface.OnClickListener
{
  o$9(o paramo)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125258);
    this.gEM.gEE.finish();
    j.a(j.a.gyX);
    AppMethodBeat.o(125258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.o.9
 * JD-Core Version:    0.6.2
 */