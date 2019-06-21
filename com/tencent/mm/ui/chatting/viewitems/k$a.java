package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.e;

public final class k$a extends s.e
{
  k$a(a parama)
  {
    super(parama);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(32936);
    paramView = (ay)paramView.getTag();
    aw.ZK();
    if (c.isSDCardAvailable())
    {
      parama = paramView.cKd;
      if (!t.kH(parama.field_talker))
        break label102;
    }
    label102: for (paramView = this.yJI.getTalkerUserName(); ; paramView = null)
    {
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(this.yJI.yTx.getContext(), parama, paramView);
      h.pYm.e(11592, new Object[] { Integer.valueOf(0) });
      AppMethodBeat.o(32936);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.k.a
 * JD-Core Version:    0.6.2
 */