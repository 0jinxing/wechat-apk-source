package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class l$11
  implements View.OnClickListener
{
  l$11(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125143);
    this.gDD.gDo.gCr[1] = 1;
    this.gDD.gDo.flQ = 6;
    g.Rg().a(145, this.gDD);
    l.a(this.gDD);
    AppMethodBeat.o(125143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.11
 * JD-Core Version:    0.6.2
 */