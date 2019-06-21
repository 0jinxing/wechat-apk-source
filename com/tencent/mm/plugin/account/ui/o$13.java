package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.modelfriend.a;

final class o$13
  implements DialogInterface.OnClickListener
{
  o$13(o paramo, m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125261);
    com.tencent.mm.kernel.g.Rg().a(701, this.gEM);
    com.tencent.mm.kernel.g.Rg().a(252, this.gEM);
    this.gEM.gDu = new g(new o.13.1(this), ((a)this.crb).getUsername(), ((a)this.crb).agf(), this.gEM.gEE.cFl);
    this.gEM.gDu.a(this.gEM.gEE);
    this.gEM.gBm.daR = this.gEM.gEE.gEu;
    this.gEM.gBm.cVS = 8L;
    this.gEM.gBm.ajK();
    AppMethodBeat.o(125261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.o.13
 * JD-Core Version:    0.6.2
 */