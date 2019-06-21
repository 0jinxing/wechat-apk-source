package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements j.a
{
  e$1(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47125);
    if (e.a(this.tDX) != null)
      e.a(this.tDX).onClick(paramView);
    AppMethodBeat.o(47125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.e.1
 * JD-Core Version:    0.6.2
 */