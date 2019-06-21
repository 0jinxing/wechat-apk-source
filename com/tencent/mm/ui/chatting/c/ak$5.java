package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.ab;

final class ak$5
  implements Runnable
{
  ak$5(ak paramak, com.tencent.mm.storage.ak paramak1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31714);
    ab.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify updateGoBackToHistoryMessage up UnDeliver:%d, UnRead:%d", new Object[] { Integer.valueOf(this.ySk.field_UnDeliverCount), Integer.valueOf(this.ySk.field_unReadCount) });
    AppMethodBeat.o(31714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ak.5
 * JD-Core Version:    0.6.2
 */