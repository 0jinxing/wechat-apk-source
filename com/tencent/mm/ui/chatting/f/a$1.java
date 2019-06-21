package com.tencent.mm.ui.chatting.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.l.e;
import java.util.List;

final class a$1
  implements d.b
{
  a$1(a parama, e parame, d.d paramd, d.a parama1, d.b paramb)
  {
  }

  public final void dY()
  {
    AppMethodBeat.i(32476);
    this.yYl.fk(this.yYm.yYB);
    this.yYl.close();
    this.yYm.enb = this.yYl.dCP();
    this.yYm.yYC = this.yYm.yYB.size();
    ab.i("MicroMsg.ChattingLoader.ChattingDataCallback", "action：" + this.yYn + " addCount:" + this.yYm.yYC + " totalCount:" + this.yYm.enb);
    this.yYo.dY();
    AppMethodBeat.o(32476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.a.1
 * JD-Core Version:    0.6.2
 */