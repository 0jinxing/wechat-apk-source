package com.tencent.mm.ui.chatting.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aq.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.f.d.b;
import java.util.List;

final class b$2
  implements b.b
{
  b$2(b paramb, d.b paramb1)
  {
  }

  public final void b(int paramInt, List<bi> paramList)
  {
    AppMethodBeat.i(32688);
    if ((paramInt >= 0) && (paramList.size() > 0))
    {
      long l1 = this.yZY.dHc();
      long l2 = this.yZY.dHf();
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleBottomAfterEnter] talker:" + this.yZY.emo + " from:" + l1 + " to:" + l2);
      this.yZY.PI = ((j)g.K(j.class)).bOr().d(this.yZY.emo, l1, l2, 18);
      this.yYo.dY();
      AppMethodBeat.o(32688);
    }
    while (true)
    {
      return;
      this.yZY.d(this.yYo);
      AppMethodBeat.o(32688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.b.2
 * JD-Core Version:    0.6.2
 */