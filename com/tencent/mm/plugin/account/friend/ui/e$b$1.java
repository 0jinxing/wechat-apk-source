package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$b$1
  implements View.OnClickListener
{
  e$b$1(e.b paramb, e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108593);
    if (e.b(this.gxN.gxJ) != null)
      e.b(this.gxN.gxJ).d(this.gxN.gtF, this.gxN.gxL, this.gxN.status);
    AppMethodBeat.o(108593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e.b.1
 * JD-Core Version:    0.6.2
 */