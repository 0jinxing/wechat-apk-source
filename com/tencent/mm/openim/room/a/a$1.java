package com.tencent.mm.openim.room.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.LinkedList;

public final class a$1
  implements ap.a
{
  public a$1(LinkedList paramLinkedList, c paramc, i parami)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78967);
    int i;
    boolean bool;
    if (this.ehw.size() < 25)
    {
      i = this.ehw.size();
      ab.d("OpenIMChatRoomContactLogic", "updateMemberDetail update img list size:%d, loopCount:%d", new Object[] { Integer.valueOf(this.ehw.size()), Integer.valueOf(i) });
      if (i != 0)
        break label97;
      if (this.gfO != null)
        this.gfO.mH(1);
      ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done loopCount is 0");
      AppMethodBeat.o(78967);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 25;
      break;
      label97: if (this.ehw.isEmpty())
      {
        if (this.gfO != null)
          this.gfO.mH(1);
        ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
        AppMethodBeat.o(78967);
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
        ab.d("OpenIMChatRoomContactLogic", "updateMemberDetail update img loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
        if (this.ehw.isEmpty())
        {
          if (this.gfO != null)
            this.gfO.mH(1);
          ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
          AppMethodBeat.o(78967);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(78967);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.a.1
 * JD-Core Version:    0.6.2
 */