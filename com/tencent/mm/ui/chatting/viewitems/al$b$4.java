package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.textview.a;
import com.tencent.mm.ui.widget.textview.a.f;

final class al$b$4 extends a.f
{
  al$b$4(al.b paramb, al.f paramf)
  {
  }

  public final void dismiss()
  {
    AppMethodBeat.i(33307);
    this.zgL.zgV.dLM();
    this.zgL.zgV.zWC = true;
    this.zgL.zgV.zWD = true;
    this.zgL.zgV.dLL();
    AppMethodBeat.o(33307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.b.4
 * JD-Core Version:    0.6.2
 */