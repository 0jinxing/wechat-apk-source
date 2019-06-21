package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI$onStart$1", "Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;", "onAnimationEnd", "", "onAnimationStart", "plugin-brandservice_release"})
public final class BizVideoDetailUI$x
  implements e.b
{
  public final void onAnimationEnd()
  {
    AppMethodBeat.i(15168);
    if (this.jWD.jWA)
    {
      this.jWD.jWA = false;
      this.jWD.aYG();
    }
    AppMethodBeat.o(15168);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI.x
 * JD-Core Version:    0.6.2
 */