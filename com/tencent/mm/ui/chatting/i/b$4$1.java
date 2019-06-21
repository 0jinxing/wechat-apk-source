package com.tencent.mm.ui.chatting.i;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import java.util.ArrayList;

final class b$4$1
  implements ah
{
  b$4$1(b.4 param4)
  {
  }

  public final void a(ah.a parama)
  {
    AppMethodBeat.i(32534);
    if (parama == ah.a.yLO)
    {
      parama = new b.4.1.1(this);
      parama.cvx = this.yZe.fkD.field_msgId;
      this.yZe.yZb.iPr.remove(parama);
      this.yZe.yZb.yZa.remove(parama);
    }
    AppMethodBeat.o(32534);
  }

  public final void b(ah.a parama)
  {
    AppMethodBeat.i(32535);
    ab.i("MicroMsg.BaseHistoryListPresenter", "[requestExitSelectedMode] %s del ", new Object[] { Thread.currentThread(), parama });
    if (parama == ah.a.yLO)
      this.yZe.yZb.yYZ.aop.notifyChanged();
    AppMethodBeat.o(32535);
  }

  public final void dCI()
  {
  }

  public final boolean dCJ()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b.4.1
 * JD-Core Version:    0.6.2
 */