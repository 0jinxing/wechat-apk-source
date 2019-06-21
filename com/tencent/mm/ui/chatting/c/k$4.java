package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.x;
import com.tencent.mm.booter.x.a;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.y;

final class k$4
  implements Runnable
{
  k$4(k paramk, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31347);
    if (this.yPl == 2);
    for (int i = n.mA(this.yPk.cgL.getTalkerUserName()); ; i = 0)
    {
      aw.ZK();
      Object localObject = c.XR().aoZ(this.yPk.cgL.getTalkerUserName());
      if (localObject == null);
      for (int j = 0; ; j = ((at)localObject).field_unReadCount)
      {
        localObject = x.ecN;
        String str = this.yPk.cgL.getTalkerUserName();
        int k = this.yPl;
        int m = this.yPm;
        if (((x)localObject).ecX == null)
          ((x)localObject).ecX = r.Yz();
        if (!((x)localObject).ecX.equals(str))
        {
          if (((x)localObject).ecR != null)
          {
            ab.i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", new Object[] { ((x)localObject).ecR.ede });
            ((x)localObject).jL(((x)localObject).ecR.ede);
          }
          if (((x)localObject).ecO.Ml(6) == 0)
            ((x)localObject).ecO.setLong(4, ah.anT());
          com.tencent.mm.sdk.b.a.xxA.b(((x)localObject).ecP);
          com.tencent.mm.sdk.b.a.xxA.b(((x)localObject).ecQ);
          ((x)localObject).ecR = new x.a((x)localObject);
          ((x)localObject).ecR.edj = ((x)localObject).ecS;
          ((x)localObject).ecS = 0;
          ((x)localObject).ecR.ede = str;
          ((x)localObject).ecV = ah.yz();
          ((x)localObject).ecR.type = k;
          ((x)localObject).ecR.edf = m;
          ((x)localObject).ecR.csm = j;
          ((x)localObject).ecR.edg = i;
          ((x)localObject).ecR.edh = ah.anT();
          ab.i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", new Object[] { str, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i) });
        }
        AppMethodBeat.o(31347);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.k.4
 * JD-Core Version:    0.6.2
 */