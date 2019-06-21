package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$4
  implements View.OnClickListener
{
  p$4(p paramp)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47557);
    if (this.tKg.tJX == 0)
      p.a(this.tKg);
    while (true)
    {
      if (this.tKg.tJX == 1)
      {
        p.cRQ();
        if (p.c(this.tKg))
          p.d(this.tKg);
      }
      AppMethodBeat.o(47557);
      return;
      if (this.tKg.tJX == 1)
        p.b(this.tKg);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p.4
 * JD-Core Version:    0.6.2
 */