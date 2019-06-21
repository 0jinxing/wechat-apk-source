package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.s.e;

public class c$d extends s.e
{
  private c zbA;

  public c$d(a parama, c paramc)
  {
    super(parama);
    this.zbA = paramc;
  }

  public void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(32799);
    paramView.getTag();
    this.zbA.b(paramView, parama, parambi);
    AppMethodBeat.o(32799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.d
 * JD-Core Version:    0.6.2
 */