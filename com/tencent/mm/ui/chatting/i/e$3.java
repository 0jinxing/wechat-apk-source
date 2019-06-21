package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.l.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.gallery.c;

final class e$3
  implements l.a
{
  e$3(e parame, bi parambi)
  {
  }

  public final void gK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32560);
    if (paramInt1 == paramInt2)
    {
      ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[onSceneProgressEnd] MsgId:%s", new Object[] { Long.valueOf(this.fkD.field_msgId) });
      e.h(this.yZo);
      if (!c.b(e.b(this.yZo), this.fkD, false))
        e.a(this.yZo, true);
      if (e.g(this.yZo))
        if (!e.f(this.yZo))
        {
          e.d(this.yZo).post(new e.3.1(this));
          AppMethodBeat.o(32560);
        }
    }
    while (true)
    {
      return;
      e.d(this.yZo).post(new e.3.2(this));
      AppMethodBeat.o(32560);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.3
 * JD-Core Version:    0.6.2
 */