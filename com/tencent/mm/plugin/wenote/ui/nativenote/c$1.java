package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27116);
    int i = c.a(this.uUc);
    if (i == 1)
    {
      this.uUb.g(false, 0L);
      this.uUb.af(3, 100L);
      AppMethodBeat.o(27116);
    }
    while (true)
    {
      return;
      if (i == 3)
      {
        this.uUb.g(true, 50L);
        this.uUb.af(1, 0L);
        AppMethodBeat.o(27116);
      }
      else
      {
        if (i == 2)
          this.uUb.af(3, 0L);
        AppMethodBeat.o(27116);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.1
 * JD-Core Version:    0.6.2
 */