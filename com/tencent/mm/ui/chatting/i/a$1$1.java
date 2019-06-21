package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.e.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32506);
    if (!bo.ek(this.elN))
    {
      Iterator localIterator = this.elN.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (e)localIterator.next();
        localObject = new a.a(this.yYT.yYS, ((e)localObject).timestamp, ((e)localObject).type, ((e)localObject).title, ((e)localObject).cvx, ((e)localObject).username, ((e)localObject).nickname, ((e)localObject).bCv, ((e)localObject).iQV, ((e)localObject).fiQ, ((e)localObject).cJM, ((e)localObject).cKK, ((e)localObject).desc, ((e)localObject).imagePath, ((e)localObject).iQW);
        this.yYT.yYS.iPr.add(localObject);
      }
    }
    this.yYT.yYS.yZa = this.yYT.yYS.iPr;
    if (this.yYT.yYS.yYY != null)
      this.yYT.yYS.yYY.p(this.yYT.kve, this.yYT.yYS.iPr.size());
    AppMethodBeat.o(32506);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a.1.1
 * JD-Core Version:    0.6.2
 */