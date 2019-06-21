package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bm;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryVideoView$c
  implements Runnable
{
  StoryVideoView$c(StoryVideoView paramStoryVideoView, bm parambm, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110913);
    ab.i(StoryVideoView.a(this.sqJ), "reportStopLocalVideo");
    a locala = d.WR(StoryVideoView.k(this.sqJ));
    if (locala != null)
    {
      bm localbm = this.sqM.jdMethod_do(locala.eWK);
      j.a locala1 = j.rST;
      localbm.dm(j.a.cxT().ly(this.rVy)).dt(locala.videoBitrate).ajK();
    }
    AppMethodBeat.o(110913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.c
 * JD-Core Version:    0.6.2
 */