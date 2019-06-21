package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.storage.bi;

final class ap$1
  implements az.a
{
  ap$1(ap paramap, long paramLong)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(31824);
    aw.ZK();
    bi localbi = c.XO().jf(this.kMG);
    localbi.dtN();
    b.fRa.a(localbi, true);
    aw.ZK();
    c.XO().a(this.kMG, localbi);
    AppMethodBeat.o(31824);
    return false;
  }

  public final boolean acg()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ap.1
 * JD-Core Version:    0.6.2
 */