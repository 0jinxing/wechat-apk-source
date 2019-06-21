package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.b.a;
import com.tencent.mm.ui.widget.textview.a.f;

final class c$e extends a.f
{
  c.c zbh;

  c$e(c.c paramc)
  {
    this.zbh = paramc;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(32801);
    c.c localc = this.zbh;
    if ((localc.yMt != null) && (localc.yMt.dBX()))
      localc.yMt = null;
    AppMethodBeat.o(32801);
  }

  public final void eQ(View paramView)
  {
    AppMethodBeat.i(32800);
    this.zbh.s(paramView, 0, 0);
    AppMethodBeat.o(32800);
  }

  public final void eR(View paramView)
  {
    AppMethodBeat.i(32802);
    this.zbh.onLongClick(paramView);
    AppMethodBeat.o(32802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.e
 * JD-Core Version:    0.6.2
 */