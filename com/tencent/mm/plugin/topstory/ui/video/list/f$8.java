package com.tencent.mm.plugin.topstory.ui.video.list;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$8
  implements b
{
  f$8(f paramf)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(2050);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekPre");
    f.g(this.sGV).cHd();
    AppMethodBeat.o(2050);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(2051);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekTo %d", new Object[] { Integer.valueOf(paramInt) });
    this.sGV.seekTo(paramInt);
    f.g(this.sGV).aFE();
    a.kT(22);
    AppMethodBeat.o(2051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.8
 * JD-Core Version:    0.6.2
 */