package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.protocal.protobuf.aym;
import com.tencent.mm.protocal.protobuf.ayo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import java.util.Iterator;
import java.util.LinkedList;

final class ag$1
  implements al.a
{
  ag$1(ag paramag, ayo paramayo)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(108469);
    if ((this.gwn != null) && (this.gwn.wCr.size() > 0))
    {
      Iterator localIterator = this.gwn.wCr.iterator();
      while (localIterator.hasNext())
      {
        aym localaym = (aym)localIterator.next();
        if (localaym.jBT == 1)
        {
          h localh = new h();
          localh.username = localaym.jBB;
          localh.frW = localaym.vXm;
          localh.frV = localaym.vXn;
          localh.bJt = -1;
          ab.d("MicroMsg.NetSceneListMFriend", "getmlist  %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.ack(), localh.acl() });
          localh.dtR = 3;
          localh.cB(true);
          o.act().b(localh);
        }
      }
    }
    AppMethodBeat.o(108469);
    return true;
  }

  public final boolean acg()
  {
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(108470);
    String str = super.toString() + "|onGYNetEnd";
    AppMethodBeat.o(108470);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ag.1
 * JD-Core Version:    0.6.2
 */