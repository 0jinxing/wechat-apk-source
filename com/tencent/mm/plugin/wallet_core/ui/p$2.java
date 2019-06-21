package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$2
  implements View.OnClickListener
{
  p$2(p paramp)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47555);
    if (!this.tKg.nTi.isShown())
      this.tKg.nTi.setVisibility(0);
    AppMethodBeat.o(47555);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p.2
 * JD-Core Version:    0.6.2
 */