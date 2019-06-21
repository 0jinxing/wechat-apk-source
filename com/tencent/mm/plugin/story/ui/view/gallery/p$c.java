package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$initCreateVideoView$1", "Lcom/tencent/mm/pluginsdk/ui/IMMVideoView$IReport;", "idkeyStat", "", "ID", "", "key", "value", "isImportant", "", "kvStat", "logID", "", "val", "", "plugin-story_release"})
public final class p$c
  implements h.c
{
  public final void gp(long paramLong)
  {
    AppMethodBeat.i(110976);
    StoryVideoView localStoryVideoView = this.srl.sqW;
    if (localStoryVideoView != null)
    {
      if (!localStoryVideoView.sqC)
      {
        h.pYm.a(this.srl.srg, paramLong, 1L, false);
        if ((paramLong >= 141L) && (paramLong <= 145L))
          ab.i(this.srl.TAG, "initCreateVideoView test key " + paramLong + " value 1 currVideoItem:" + this.srl.srb + ' ' + bo.dpG());
      }
      AppMethodBeat.o(110976);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110976);
    }
  }

  public final void wB(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.p.c
 * JD-Core Version:    0.6.2
 */