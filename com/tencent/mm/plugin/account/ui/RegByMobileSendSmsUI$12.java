package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;

final class RegByMobileSendSmsUI$12
  implements DialogInterface.OnClickListener
{
  RegByMobileSendSmsUI$12(RegByMobileSendSmsUI paramRegByMobileSendSmsUI, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125409);
    g.Rg().a(701, this.gGq);
    g.Rg().a(252, this.gGq);
    RegByMobileSendSmsUI.a(this.gGq, this.gGs.getUsername(), this.gGs.agf());
    RegByMobileSendSmsUI.f(this.gGq).daR = RegByMobileSendSmsUI.e(this.gGq);
    RegByMobileSendSmsUI.f(this.gGq).cVS = 8L;
    RegByMobileSendSmsUI.f(this.gGq).ajK();
    AppMethodBeat.o(125409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.12
 * JD-Core Version:    0.6.2
 */