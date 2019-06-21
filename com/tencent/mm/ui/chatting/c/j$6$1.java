package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.snackbar.a.c;

final class j$6$1
  implements a.c
{
  j$6$1(j.6 param6)
  {
  }

  public final void cLd()
  {
    AppMethodBeat.i(31316);
    ((o)this.yOU.yOP.cgL.aF(o.class)).dEf();
    AppMethodBeat.o(31316);
  }

  public final void onHide()
  {
    AppMethodBeat.i(31315);
    this.yOU.yOP.dDL();
    AppMethodBeat.o(31315);
  }

  public final void onShow()
  {
    AppMethodBeat.i(31314);
    this.yOU.yOP.dDL();
    j.b(this.yOU.yOP).setVisibility(4);
    AppMethodBeat.o(31314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.6.1
 * JD-Core Version:    0.6.2
 */