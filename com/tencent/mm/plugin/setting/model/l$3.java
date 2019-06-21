package com.tencent.mm.plugin.setting.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class l$3
  implements com.tencent.mm.plugin.fts.a.l
{
  l$3(l paraml, HashSet paramHashSet, long paramLong1, long paramLong2)
  {
  }

  public final void b(com.tencent.mm.plugin.fts.a.a.j paramj)
  {
    AppMethodBeat.i(126869);
    paramj = paramj.mEy;
    Object localObject;
    if (paramj != null)
    {
      localObject = paramj.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramj = (com.tencent.mm.plugin.fts.a.a.l)((Iterator)localObject).next();
        this.qka.remove(paramj.mDx);
        this.qjY.qjS.add(paramj.mDx);
      }
    }
    Iterator localIterator = this.qka.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int i = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().r(str, this.qkb, System.currentTimeMillis());
      if (i > 0)
      {
        ab.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] talker:%s voipCount:%s", new Object[] { str, Integer.valueOf(i) });
      }
      else
      {
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(str, this.qkb, System.currentTimeMillis(), true);
        if (((Cursor)localObject).getCount() > 0)
        {
          paramj = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(str, this.qkb, System.currentTimeMillis(), false);
          if (paramj.getCount() <= 0)
            this.qjY.qjS.add(str);
          paramj.close();
        }
        while (true)
        {
          ((Cursor)localObject).close();
          break;
          this.qjY.qjS.add(str);
        }
      }
    }
    ab.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] query:%s cost:%sms", new Object[] { Long.valueOf(this.qkb), Long.valueOf(System.currentTimeMillis() - this.ecn) });
    this.qjY.qjQ.countDown();
    AppMethodBeat.o(126869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.l.3
 * JD-Core Version:    0.6.2
 */