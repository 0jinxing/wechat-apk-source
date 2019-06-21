package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.ui.widget.a.d;

final class j$5
  implements View.OnClickListener
{
  j$5(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31313);
    if (((h)this.yOP.cgL.aF(h.class)).cdf() == 0)
    {
      ab.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
      AppMethodBeat.o(31313);
    }
    while (true)
    {
      return;
      if (((t.mZ(j.e(this.yOP).field_username)) && (!f.kq(j.e(this.yOP).field_username))) || (t.nJ(j.e(this.yOP).field_username)))
      {
        j.a(this.yOP, true);
        k.a(this.yOP.cgL.yTx.getContext(), j.c(this.yOP), j.d(this.yOP), j.e(this.yOP).field_username, this.yOP);
        AppMethodBeat.o(31313);
      }
      else
      {
        paramView = new d(this.yOP.cgL.yTx.getContext(), 1, false);
        paramView.rBl = new j.5.1(this);
        paramView.rBm = new j.5.2(this);
        paramView.cpD();
        AppMethodBeat.o(31313);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.5
 * JD-Core Version:    0.6.2
 */