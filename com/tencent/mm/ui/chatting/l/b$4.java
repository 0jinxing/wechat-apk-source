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

final class b$4
  implements b.b
{
  b$4(b paramb, d.b paramb1)
  {
  }

  public final void b(int paramInt, List<bi> paramList)
  {
    AppMethodBeat.i(32690);
    if ((paramInt >= 0) && (paramList.size() > 0))
    {
      long l1 = this.yZY.yZQ;
      bi localbi = (bi)paramList.get(paramList.size() - 1);
      long l2 = this.yZY.ns(localbi.field_createTime);
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] talker:" + this.yZY.emo + " from:" + l1 + " to:" + l2 + " size:" + paramList.size());
      this.yZY.PI = ((j)g.K(j.class)).bOr().d(this.yZY.emo, l1, l2, 2147483647);
      this.yYo.dY();
      AppMethodBeat.o(32690);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] null == seqBlock ret:".concat(String.valueOf(paramInt)));
      this.yZY.d(this.yYo);
      AppMethodBeat.o(32690);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.b.4
 * JD-Core Version:    0.6.2
 */