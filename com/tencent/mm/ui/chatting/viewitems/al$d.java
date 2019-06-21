package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.textview.a;
import com.tencent.mm.ui.widget.textview.a.e;
import com.tencent.mm.ui.widget.textview.a.f;

final class al$d
  implements a.e
{
  private a yMs;

  al$d(a parama)
  {
    this.yMs = parama;
  }

  public final void dHp()
  {
    AppMethodBeat.i(33319);
    ab.d("OnTouchOutside", "touchOutside");
    this.yMs.dLM();
    this.yMs.zWD = true;
    this.yMs.dLP();
    this.yMs.zWC = true;
    this.yMs.dLQ();
    a locala = this.yMs;
    if (locala.zWn != null)
      locala.zWn.dismiss();
    AppMethodBeat.o(33319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.d
 * JD-Core Version:    0.6.2
 */