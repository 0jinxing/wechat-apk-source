package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;

final class m$b
  implements Runnable
{
  private String mPq;

  m$b(m paramm, String paramString)
  {
    this.mPq = paramString;
  }

  public final void run()
  {
    AppMethodBeat.i(1748);
    long l = System.currentTimeMillis();
    e.cu(this.mPq);
    ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoFolderTask %s %d", new Object[] { this.mPq, Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(1748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.m.b
 * JD-Core Version:    0.6.2
 */