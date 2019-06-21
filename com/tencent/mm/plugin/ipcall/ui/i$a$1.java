package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$a$1
  implements View.OnClickListener
{
  i$a$1(i.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22344);
    if (i.a.a(this.nFQ) != null)
      i.a.a(this.nFQ).onClick(paramView);
    AppMethodBeat.o(22344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.i.a.1
 * JD-Core Version:    0.6.2
 */