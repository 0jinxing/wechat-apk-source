package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class m$4$8
  implements n.d
{
  m$4$8(m.4 param4, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(30601);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(30601);
      while (true)
      {
        return;
        m.dCc().yIY = true;
        m.a(this.fwC, this.yIW.yIT, this.yIW.yII);
        AppMethodBeat.o(30601);
      }
      m.dCc().yIY = false;
      m.a(this.fwC, this.yIW.yIT, this.yIW.yII);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.4.8
 * JD-Core Version:    0.6.2
 */