package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.d.a.a;
import com.tencent.mm.aj.a.d.a.b;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;

final class BizChatroomInfoUI$3
  implements d.a
{
  BizChatroomInfoUI$3(BizChatroomInfoUI paramBizChatroomInfoUI)
  {
  }

  public final void a(d.a.b paramb)
  {
    AppMethodBeat.i(30199);
    if ((paramb != null) && (paramb.fxB != null) && (paramb.fxq == BizChatroomInfoUI.g(this.yFp)) && (paramb.fxA != d.a.a.fxx))
    {
      ab.i("MicroMsg.BizChatroomInfoUI", "bizChatExtension bizChat change");
      paramb = z.aeT().aK(BizChatroomInfoUI.g(this.yFp));
      BizChatroomInfoUI.a(this.yFp, paramb);
      BizChatroomInfoUI.h(this.yFp);
    }
    AppMethodBeat.o(30199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatroomInfoUI.3
 * JD-Core Version:    0.6.2
 */