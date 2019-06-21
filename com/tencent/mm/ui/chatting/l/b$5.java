package com.tencent.mm.ui.chatting.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aq.b.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.f.d.b;
import java.util.List;

final class b$5
  implements b.b
{
  b$5(b paramb, long paramLong1, com.tencent.mm.plugin.messenger.foundation.a.a.b paramb1, long paramLong2, d.b paramb2)
  {
  }

  public final void b(int paramInt, List<bi> paramList)
  {
    AppMethodBeat.i(32691);
    long l1;
    if (paramInt >= 0)
    {
      l1 = this.yZZ;
      if (paramList.size() <= 0)
        break label273;
      l1 = ((bi)paramList.get(0)).field_createTime;
    }
    label273: 
    while (true)
    {
      long l2 = l1;
      if (this.zaa.M(this.yZY.emo, l1) == null)
      {
        l2 = l1;
        if (paramList.size() < 18)
          l2 = ((j)g.K(j.class)).bOr().f(this.yZY.emo, l1, 18 - paramList.size());
      }
      l1 = l2;
      if (l2 <= 0L)
        l1 = this.yZZ;
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadTop#fetch] talker:" + this.yZY.emo + " firstCreateTime:" + this.yZZ + " lastCreateTime:" + this.zab + " from:" + l1);
      this.yZY.PI = ((j)g.K(j.class)).bOr().d(this.yZY.emo, l1, this.yZY.yZR, this.yZY.yZT + 18);
      this.yYo.dY();
      AppMethodBeat.o(32691);
      while (true)
      {
        return;
        this.yZY.d(this.yYo);
        AppMethodBeat.o(32691);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.b.5
 * JD-Core Version:    0.6.2
 */