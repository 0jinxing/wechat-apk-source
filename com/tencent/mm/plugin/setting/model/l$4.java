package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class l$4
  implements com.tencent.mm.plugin.fts.a.l
{
  final int limit;

  l$4(l paraml, int paramInt, List paramList, LinkedList paramLinkedList, long paramLong)
  {
    AppMethodBeat.i(126870);
    this.limit = this.qkc;
    AppMethodBeat.o(126870);
  }

  public final void b(j arg1)
  {
    AppMethodBeat.i(126871);
    ??? = ???.mEy;
    Object localObject1;
    if ((??? != null) && (???.size() > 0))
    {
      ??? = (com.tencent.mm.plugin.fts.a.a.l)???.get(0);
      if ((???.userData != null) && ((???.userData instanceof HashMap)))
        localObject1 = (HashMap)???.userData;
    }
    label295: label426: 
    while (true)
    {
      String str;
      synchronized (this.qjY.mLock)
      {
        Iterator localIterator = this.ibp.iterator();
        if (!localIterator.hasNext())
          break label206;
        str = (String)localIterator.next();
        if (!((HashMap)localObject1).containsKey(str))
          this.qjY.qjT.add(str);
      }
      Object localObject3 = ((List)((HashMap)localObject1).get(str)).iterator();
      do
        if (!((Iterator)localObject3).hasNext())
          break;
      while (((com.tencent.mm.plugin.fts.a.a.l)((Iterator)localObject3).next()).mEB >= 100L);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label426;
        this.qjY.qjT.add(str);
        break;
        label206: if (this.limit >= this.qkd.size())
        {
          ab.i("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] finish all load! userNames.size:%s cost:%sms", new Object[] { Integer.valueOf(this.qkd.size()), Long.valueOf(System.currentTimeMillis() - this.ecn) });
          this.qjY.qjQ.countDown();
          AppMethodBeat.o(126871);
        }
        while (true)
        {
          return;
          localObject1 = "[getSameChatInfoTask] is null?%s is instanceof List";
          localObject3 = new Object[2];
          boolean bool;
          if (???.userData == null)
          {
            bool = true;
            localObject3[0] = Boolean.valueOf(bool);
            bool = ???.userData instanceof HashMap;
            i = 1;
            ??? = (j)localObject3;
          }
          while (true)
          {
            ???[i] = Boolean.valueOf(bool);
            ab.e("MicroMsg.UnfamiliarContactEngine", (String)localObject1, (Object[])localObject3);
            break;
            bool = false;
            break label295;
            str = "[getSameChatInfoTask] list is null? %s ";
            ??? = new Object[1];
            if (this.ibp == null)
            {
              bool = true;
              i = 0;
              localObject1 = ???;
              localObject3 = ???;
              ??? = (j)localObject1;
              localObject1 = str;
            }
            else
            {
              bool = false;
              i = 0;
              localObject1 = ???;
              localObject3 = ???;
              ??? = (j)localObject1;
              localObject1 = str;
            }
          }
          this.qjY.g(this.qkd, this.limit);
          AppMethodBeat.o(126871);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.l.4
 * JD-Core Version:    0.6.2
 */