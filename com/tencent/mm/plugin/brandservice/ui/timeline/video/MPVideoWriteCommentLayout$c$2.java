package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class MPVideoWriteCommentLayout$c$2
  implements Runnable
{
  MPVideoWriteCommentLayout$c$2(MPVideoWriteCommentLayout.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15294);
    MPVideoWriteCommentLayout.b(this.jYo.jYh).aYT();
    MPVideoWriteCommentLayout.b(this.jYo.jYh).postInvalidate();
    MPVideoWriteCommentLayout.c(this.jYo.jYh).postInvalidate();
    AppMethodBeat.o(15294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.c.2
 * JD-Core Version:    0.6.2
 */