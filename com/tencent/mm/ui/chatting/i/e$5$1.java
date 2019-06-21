package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.e.a.b;
import java.util.ArrayList;
import java.util.List;

final class e$5$1
  implements ah
{
  e$5$1(e.5 param5)
  {
  }

  public final void a(ah.a parama)
  {
    AppMethodBeat.i(32562);
    if (parama == ah.a.yLO)
      e.a(this.yZr.yZo).removeAll(this.yZr.ibp);
    AppMethodBeat.o(32562);
  }

  public final void b(ah.a parama)
  {
    AppMethodBeat.i(32563);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[requestExitSelectedMode] %s del size:%s job:%s", new Object[] { Thread.currentThread(), Integer.valueOf(this.yZr.ibp.size()), parama });
    if (parama == ah.a.yLO)
      e.c(this.yZr.yZo).bwr();
    AppMethodBeat.o(32563);
  }

  public final void dCI()
  {
  }

  public final boolean dCJ()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.5.1
 * JD-Core Version:    0.6.2
 */