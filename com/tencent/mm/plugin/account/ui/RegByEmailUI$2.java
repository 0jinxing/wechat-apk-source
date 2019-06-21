package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.b.a;

final class RegByEmailUI$2
  implements DialogInterface.OnClickListener
{
  RegByEmailUI$2(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125302);
    a.wA(RegByEmailUI.f(this.gFF));
    this.gFF.aqX();
    this.gFF.finish();
    AppMethodBeat.o(125302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI.2
 * JD-Core Version:    0.6.2
 */