package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class l$1 extends n.a
{
  l$1(l paraml)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(1742);
    paramInt = this.sEP.sEO;
    this.sEP.sEO = l.cGO();
    if (this.sEP.sEO != paramInt)
    {
      ab.i("MicroMsg.TopStory.TopStoryNetworkMgr", "network change current:%d change:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.sEP.sEO) });
      al.d(new l.1.1(this, paramInt));
    }
    AppMethodBeat.o(1742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.l.1
 * JD-Core Version:    0.6.2
 */