package com.tencent.mm.ui.chatting.viewitems;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.textview.a.f;

final class c$c$a
  implements n.d
{
  public bi csG;

  c$c$a(c.c paramc)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(32794);
    if (this.csG == null)
    {
      ab.e("MicroMsg.ChattingItem", "context item select failed, null msg");
      AppMethodBeat.o(32794);
    }
    while (true)
    {
      return;
      this.zbF.zbu.a(paramMenuItem, c.c.b(this.zbF), this.csG);
      ((v)c.c.b(this.zbF).aF(v.class)).a(paramMenuItem, this.zbF.zbu);
      if (c.c.c(this.zbF) != null)
        c.c.c(this.zbF).dismiss();
      AppMethodBeat.o(32794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.c.a
 * JD-Core Version:    0.6.2
 */