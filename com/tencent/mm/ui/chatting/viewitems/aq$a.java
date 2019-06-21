package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.e;

final class aq$a extends s.e
{
  public aq$a(aq paramaq, a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(33402);
    paramView = (ay)paramView.getTag();
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      t.hO(this.yJI.yTx.getContext());
      AppMethodBeat.o(33402);
    }
    while (true)
    {
      return;
      ((aj)this.yJI.aF(aj.class)).dFm().a(paramView.position, paramView.cKd);
      AppMethodBeat.o(33402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aq.a
 * JD-Core Version:    0.6.2
 */