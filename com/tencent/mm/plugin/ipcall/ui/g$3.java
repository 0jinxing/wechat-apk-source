package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$3
  implements View.OnClickListener
{
  g$3(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22153);
    if (paramView == g.b(this.nDb))
    {
      g.a(this.nDb, 1);
      AppMethodBeat.o(22153);
    }
    while (true)
    {
      return;
      if (paramView == g.c(this.nDb))
      {
        g.a(this.nDb, 2);
        AppMethodBeat.o(22153);
      }
      else
      {
        if (paramView == g.d(this.nDb))
          g.a(this.nDb, 3);
        AppMethodBeat.o(22153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.g.3
 * JD-Core Version:    0.6.2
 */