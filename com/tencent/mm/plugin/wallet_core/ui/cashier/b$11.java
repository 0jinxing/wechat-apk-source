package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$11
  implements View.OnClickListener
{
  b$11(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47776);
    if (!b.f(this.tMC).isShown())
      b.f(this.tMC).setVisibility(0);
    AppMethodBeat.o(47776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.11
 * JD-Core Version:    0.6.2
 */