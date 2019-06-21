package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.n;

final class j$4
  implements View.OnClickListener
{
  j$4(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31310);
    if (((com.tencent.mm.ui.chatting.c.b.h)this.yOP.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).cdf() == 0)
    {
      ab.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
      AppMethodBeat.o(31310);
    }
    while (true)
    {
      return;
      paramView = j.c(this.yOP);
      if (com.tencent.mm.ui.chatting.j.eS(paramView))
      {
        com.tencent.mm.ui.base.h.a(this.yOP.cgL.yTx.getContext(), this.yOP.cgL.yTx.getContext().getString(2131298777), "", this.yOP.cgL.yTx.getContext().getString(2131296322), new j.4.1(this));
        AppMethodBeat.o(31310);
      }
      else if (com.tencent.mm.ui.chatting.j.eT(paramView))
      {
        com.tencent.mm.ui.base.h.a(this.yOP.cgL.yTx.getContext(), this.yOP.cgL.yTx.getContext().getString(2131298778), "", this.yOP.cgL.yTx.getContext().getString(2131296322), new j.4.2(this));
        AppMethodBeat.o(31310);
      }
      else if (com.tencent.mm.ui.chatting.j.eR(paramView))
      {
        com.tencent.mm.ui.base.h.a(this.yOP.cgL.yTx.getContext(), this.yOP.cgL.yTx.getContext().getString(2131298779), "", new j.4.3(this), null);
        AppMethodBeat.o(31310);
      }
      else
      {
        if (n.a(this.yOP.cgL, paramView, j.e(this.yOP)))
          this.yOP.dDL();
        AppMethodBeat.o(31310);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.4
 * JD-Core Version:    0.6.2
 */