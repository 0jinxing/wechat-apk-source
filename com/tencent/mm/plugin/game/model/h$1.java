package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class h$1
  implements Runnable
{
  h$1(LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111245);
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = this.mVS.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Iterator localIterator = g.s(((h)((Iterator)localObject1).next()).optJSONArray("items")).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (c)localIterator.next();
        if (!bo.isNullOrNil(((c)localObject2).field_appId))
          localLinkedList.add(((c)localObject2).field_appId);
      }
    }
    Object localObject2 = com.tencent.mm.plugin.game.f.c.bFF().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (f)((Iterator)localObject2).next();
      if (!localLinkedList.contains(((f)localObject1).field_appId))
      {
        a.bYJ().b((f)localObject1, new String[0]);
        ab.i("MicroMsg.GameDataSearchGameList", "delete appid : " + ((f)localObject1).field_appId);
      }
    }
    AppMethodBeat.o(111245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.h.1
 * JD-Core Version:    0.6.2
 */