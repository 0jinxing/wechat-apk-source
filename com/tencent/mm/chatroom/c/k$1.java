package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.LinkedList;

final class k$1
  implements ap.a
{
  k$1(k paramk, LinkedList paramLinkedList, i parami)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(103931);
    int i;
    boolean bool;
    if (this.ehw.size() < 25)
    {
      i = this.ehw.size();
      ab.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img list size:%d, loopCount:%d", new Object[] { Integer.valueOf(this.ehw.size()), Integer.valueOf(i) });
      if (i != 0)
        break label90;
      k.a(this.ehy, 1);
      ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done loopCount is 0");
      AppMethodBeat.o(103931);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 25;
      break;
      label90: if (this.ehw.isEmpty())
      {
        k.a(this.ehy, 1);
        ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
        AppMethodBeat.o(103931);
        bool = false;
      }
      else
      {
        long l1 = System.currentTimeMillis();
        long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
        for (int j = 0; j < i; j++)
        {
          com.tencent.mm.ah.h localh = (com.tencent.mm.ah.h)this.ehw.poll();
          if (localh == null)
            break;
          this.ehx.b(localh);
        }
        g.RP().eJN.mB(l2);
        ab.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
        if (this.ehw.isEmpty())
        {
          k.a(this.ehy, 1);
          ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
          AppMethodBeat.o(103931);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(103931);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.k.1
 * JD-Core Version:    0.6.2
 */