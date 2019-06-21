package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.roomsdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.u;

final class e$6
  implements Runnable
{
  e$6(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31249);
    if (this.yOy.cgL == null)
    {
      ab.e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomMemberDetail] mChattingContext is null!");
      AppMethodBeat.o(31249);
    }
    while (true)
    {
      return;
      aw.ZK();
      Object localObject = c.XV().oa(this.yOy.cgL.getTalkerUserName());
      if ((localObject != null) && (((u)localObject).drU()))
      {
        ab.d("MicroMsg.ChattingUI.ChatroomComponent", "cpan[doScene NetSceneGetChatroomMemberDetail]");
        localObject = b.alY(this.yOy.cgL.getTalkerUserName()).D(this.yOy.cgL.getTalkerUserName(), ((u)localObject).drT());
        ((com.tencent.mm.roomsdk.a.c.a)localObject).b(new e.6.1(this));
        ((com.tencent.mm.roomsdk.a.c.a)localObject).dmX();
      }
      AppMethodBeat.o(31249);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.e.6
 * JD-Core Version:    0.6.2
 */