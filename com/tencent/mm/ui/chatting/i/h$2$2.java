package com.tencent.mm.ui.chatting.i;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.a.c.b;

final class h$2$2
  implements n.d
{
  h$2$2(h.2 param2, c.b paramb, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(32643);
    if (this.yYV == null)
    {
      ab.e("MicroMsg.UrlHistoryListPresenter", "item is null! position:%s", new Object[] { Integer.valueOf(this.sN) });
      AppMethodBeat.o(32643);
    }
    while (true)
    {
      return;
      aw.ZK();
      paramMenuItem = c.XO().jf(this.yYV.cvx);
      this.yZD.yZB.d(paramInt, paramMenuItem);
      AppMethodBeat.o(32643);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.h.2.2
 * JD-Core Version:    0.6.2
 */