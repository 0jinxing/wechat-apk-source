package com.tencent.mm.openim.room.a;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

public final class a$2
  implements ap.a
{
  public a$2(LinkedList paramLinkedList, c paramc, bd parambd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78968);
    int i;
    boolean bool;
    if (this.ehz.size() < 25)
    {
      i = this.ehz.size();
      ab.d("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg list size:%d, loopCount:%d", new Object[] { Integer.valueOf(this.ehz.size()), Integer.valueOf(i) });
      if (i != 0)
        break label97;
      if (this.gfO != null)
        this.gfO.mH(2);
      ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done loopCount is 0");
      AppMethodBeat.o(78968);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 25;
      break;
      label97: long l1 = System.currentTimeMillis();
      long l2 = g.RP().eJN.iV(Thread.currentThread().getId());
      for (int j = 0; j < i; j++)
      {
        Pair localPair = (Pair)this.ehz.poll();
        this.ehA.b((String)localPair.first, (ad)localPair.second);
      }
      g.RP().eJN.mB(l2);
      ab.d("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
      if (this.ehz.isEmpty())
      {
        if (this.gfO != null)
          this.gfO.mH(2);
        ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done updateList is empty");
        AppMethodBeat.o(78968);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(78968);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.a.2
 * JD-Core Version:    0.6.2
 */