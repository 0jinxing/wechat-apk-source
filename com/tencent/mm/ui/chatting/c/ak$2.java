package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

final class ak$2
  implements Runnable
{
  ak$2(ak paramak, int paramInt1, int paramInt2, h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31711);
    this.ySf.cgL.ho(this.ySg, this.ySh);
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 111 %s %s %s", new Object[] { Integer.valueOf(this.ySf.cgL.getFirstVisiblePosition()), Integer.valueOf(this.ySf.cgL.getLastVisiblePosition()), Integer.valueOf(this.ySi.getCount()) });
    AppMethodBeat.o(31711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ak.2
 * JD-Core Version:    0.6.2
 */