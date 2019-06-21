package com.tencent.mm.ui.base;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$2
  implements n.d
{
  h$2(h.d paramd)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(106404);
    if (this.ytv != null)
      this.ytv.bV(paramInt, paramMenuItem.getItemId());
    AppMethodBeat.o(106404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.2
 * JD-Core Version:    0.6.2
 */