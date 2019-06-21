package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

final class ak$3
  implements Runnable
{
  ak$3(ak paramak, int paramInt1, int paramInt2, h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31712);
    this.ySf.cgL.ho(this.ySg, this.ySh);
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 222 %s %s %s", new Object[] { Integer.valueOf(this.ySf.cgL.getFirstVisiblePosition()), Integer.valueOf(this.ySf.cgL.getLastVisiblePosition()), Integer.valueOf(this.ySi.getCount()) });
    AppMethodBeat.o(31712);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ak.3
 * JD-Core Version:    0.6.2
 */