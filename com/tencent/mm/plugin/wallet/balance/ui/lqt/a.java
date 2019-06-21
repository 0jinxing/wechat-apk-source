package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.n;

public final class a extends n
{
  private a.a thT;

  public a(a.a parama)
  {
    super(2, null);
    this.thT = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45498);
    if (this.thT != null)
      this.thT.aos();
    AppMethodBeat.o(45498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.a
 * JD-Core Version:    0.6.2
 */