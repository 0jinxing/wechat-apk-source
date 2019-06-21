package com.tencent.mm.plugin.mmsight.segment;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSegmentUI$d$1
  implements Runnable
{
  VideoSegmentUI$d$1(VideoSegmentUI.d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55051);
    if ((VideoSegmentUI.t(this.oAa.ozN)) || (this.oAa.ozN.isFinishing()) || (VideoSegmentUI.j(this.oAa.ozN) == null) || (VideoSegmentUI.d(this.oAa.ozN) == null))
    {
      ab.i("MicroMsg.VideoSegmentUI", "waiting end, main thread, activity not valid.");
      AppMethodBeat.o(55051);
    }
    while (true)
    {
      return;
      ((View)VideoSegmentUI.j(this.oAa.ozN)).setAlpha(0.0F);
      ((View)VideoSegmentUI.j(this.oAa.ozN)).setVisibility(0);
      ((View)VideoSegmentUI.j(this.oAa.ozN)).animate().setDuration(300L).setStartDelay(200L).alpha(1.0F);
      float f1 = VideoSegmentUI.j(this.oAa.ozN).bQa();
      float f2 = VideoSegmentUI.j(this.oAa.ozN).bQb();
      if ((f2 - f1) * VideoSegmentUI.e(this.oAa.ozN) <= VideoSegmentUI.p(this.oAa.ozN))
        this.oAa.ozN.enableOptionMenu(true);
      VideoSegmentUI.d(this.oAa.ozN).setLoop((int)(f1 * VideoSegmentUI.e(this.oAa.ozN)), (int)(f2 * VideoSegmentUI.e(this.oAa.ozN)));
      AppMethodBeat.o(55051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.d.1
 * JD-Core Version:    0.6.2
 */