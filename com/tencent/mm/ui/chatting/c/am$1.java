package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;

final class am$1
  implements View.OnClickListener
{
  am$1(am paramam, Boolean paramBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31739);
    if (this.ySy.booleanValue())
    {
      am localam = this.ySz;
      paramView = Boolean.TRUE;
      am.a(localam, paramView, paramView);
      ((o)this.ySz.cgL.aF(o.class)).dDX().dkc();
      AppMethodBeat.o(31739);
    }
    while (true)
    {
      return;
      am.a(this.ySz, Boolean.TRUE, Boolean.FALSE);
      ((o)this.ySz.cgL.aF(o.class)).dDX().setMode(2);
      AppMethodBeat.o(31739);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.am.1
 * JD-Core Version:    0.6.2
 */