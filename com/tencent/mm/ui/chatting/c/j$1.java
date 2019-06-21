package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.tools.o;

final class j$1
  implements View.OnClickListener
{
  j$1(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31306);
    h localh = (h)this.yOP.cgL.aF(h.class);
    if (localh.nf(((Long)paramView.getTag()).longValue()))
    {
      int i = localh.cdf();
      ((z)this.yOP.cgL.aF(z.class)).dEP();
      j.a(this.yOP).dJS();
      j.b(this.yOP).setVisibility(0);
      j.b(this.yOP).On(i);
    }
    AppMethodBeat.o(31306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.1
 * JD-Core Version:    0.6.2
 */