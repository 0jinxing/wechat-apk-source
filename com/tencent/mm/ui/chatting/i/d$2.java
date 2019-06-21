package com.tencent.mm.ui.chatting.i;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.tools.j;

final class d$2
  implements c.e
{
  d$2(d paramd)
  {
  }

  public final void a(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32541);
    ab.i("MicroMsg.FileHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramInt) });
    d.a(this.yZh, paramb);
    AppMethodBeat.o(32541);
  }

  public final void b(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32542);
    ab.i("MicroMsg.FileHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramInt) });
    new j(paramView.getContext()).b(paramView, new d.2.1(this, paramb), new d.2.2(this, paramb));
    AppMethodBeat.o(32542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.d.2
 * JD-Core Version:    0.6.2
 */