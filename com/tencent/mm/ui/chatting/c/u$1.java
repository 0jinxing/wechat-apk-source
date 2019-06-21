package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.x;
import com.tencent.mm.ui.chatting.c.b.p;
import com.tencent.mm.ui.chatting.d.a;

final class u$1
  implements View.OnClickListener
{
  u$1(u paramu, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31540);
    u.a(this.yQN, 2);
    paramView = x.ecN;
    if (paramView.ecR != null)
      paramView.ecR.edj = 2;
    if (((p)this.yQN.cgL.aF(p.class)).dEi())
    {
      ((p)this.yQN.cgL.aF(p.class)).dEj();
      AppMethodBeat.o(31540);
    }
    while (true)
    {
      return;
      u.b(this.yQN, this.gvp);
      AppMethodBeat.o(31540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.u.1
 * JD-Core Version:    0.6.2
 */