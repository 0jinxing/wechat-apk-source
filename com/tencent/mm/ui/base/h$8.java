package com.tencent.mm.ui.base;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$8
  implements n.d
{
  h$8(h.c paramc)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(106410);
    if (this.ytx != null)
      this.ytx.iE(paramMenuItem.getItemId());
    AppMethodBeat.o(106410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.8
 * JD-Core Version:    0.6.2
 */