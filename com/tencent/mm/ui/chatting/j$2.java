package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.i;
import com.tencent.mm.at.m.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class j$2
  implements m.a
{
  j$2(long paramLong1, long paramLong2)
  {
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(30533);
    ab.i("MicroMsg.ChattingEditModeLogic", "cdntra  NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      i.lC((int)this.fFE);
      i.lB((int)this.fFE);
      AppMethodBeat.o(30533);
    }
    while (true)
    {
      return;
      bi localbi = ((j)g.K(j.class)).bOr().jf(this.yIA);
      localbi.setStatus(2);
      localbi.eI(paramLong);
      ((j)g.K(j.class)).bOr().a(this.yIA, localbi);
      i.lB((int)this.fFE);
      AppMethodBeat.o(30533);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.2
 * JD-Core Version:    0.6.2
 */