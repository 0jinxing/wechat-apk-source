package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.m;

final class j$3
  implements View.OnClickListener
{
  j$3(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31309);
    if (((h)this.yOP.cgL.aF(h.class)).cdf() == 0)
    {
      ab.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
      AppMethodBeat.o(31309);
    }
    while (true)
    {
      return;
      m.a(this.yOP.cgL, j.c(this.yOP), j.d(this.yOP), this.yOP, j.e(this.yOP));
      AppMethodBeat.o(31309);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.3
 * JD-Core Version:    0.6.2
 */