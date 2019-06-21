package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$6
  implements b
{
  e$6(e parame)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(1890);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekPre");
    e.e(this.sFU).cHd();
    AppMethodBeat.o(1890);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(1891);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekTo %d", new Object[] { Integer.valueOf(paramInt) });
    this.sFU.seekTo(paramInt);
    e.e(this.sFU).aFE();
    a.kT(22);
    AppMethodBeat.o(1891);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.6
 * JD-Core Version:    0.6.2
 */