package com.tencent.mm.ui.chatting.i;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.tools.j;

final class h$2
  implements c.e
{
  h$2(h paramh)
  {
  }

  public final void a(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32644);
    ab.i("MicroMsg.UrlHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramInt) });
    if (paramb == null)
    {
      ab.e("MicroMsg.UrlHistoryListPresenter", "[onItemClick] null == baseItem, position:%s", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(32644);
    }
    while (true)
    {
      return;
      paramb = (h.a)paramb;
      if (paramb.getType() == 5)
      {
        h.a(this.yZB, paramView, paramb);
        AppMethodBeat.o(32644);
      }
      else if (paramb.getType() == 7)
      {
        h.a(this.yZB, paramb);
        AppMethodBeat.o(32644);
      }
      else if (paramb.getType() == 15)
      {
        h.b(this.yZB, paramb);
        AppMethodBeat.o(32644);
      }
      else if (paramb.getType() == 26)
      {
        h.c(this.yZB, paramb);
        AppMethodBeat.o(32644);
      }
      else if (paramb.getType() == 27)
      {
        h.d(this.yZB, paramb);
        AppMethodBeat.o(32644);
      }
      else
      {
        ab.e("MicroMsg.UrlHistoryListPresenter", "[onItemClick] type:%s", new Object[] { Integer.valueOf(paramb.getType()) });
        AppMethodBeat.o(32644);
      }
    }
  }

  public final void b(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32645);
    ab.i("MicroMsg.UrlHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramInt) });
    new j(paramView.getContext()).b(paramView, new h.2.1(this), new h.2.2(this, paramb, paramInt));
    AppMethodBeat.o(32645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.h.2
 * JD-Core Version:    0.6.2
 */