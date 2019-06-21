package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.s.e;
import com.tencent.mm.ui.widget.MMTextView;

final class al$e extends s.e
{
  public al$e(com.tencent.mm.ui.chatting.d.a parama)
  {
    super(parama);
  }

  public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33320);
    parama = (ay)paramView.getTag();
    if (parambi.dtr())
    {
      if (this.yJI != null)
      {
        h.pYm.X(10221, "1");
        paramView = new Intent();
        paramView.addFlags(67108864);
        d.b(this.yJI.yTx.getContext(), "shake", ".ui.ShakeReportUI", paramView);
      }
      AppMethodBeat.o(33320);
    }
    while (true)
    {
      return;
      if ((parambi.isText()) && ((paramView instanceof MMTextView)))
      {
        paramView = (MMTextView)paramView;
        com.tencent.mm.ui.chatting.k.a.a.dHa();
        com.tencent.mm.ui.chatting.k.a.a.a(paramView.getText(), parama.cKd);
      }
      AppMethodBeat.o(33320);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.e
 * JD-Core Version:    0.6.2
 */