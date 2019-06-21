package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class MPVideoWriteCommentLayout$c$1
  implements Runnable
{
  MPVideoWriteCommentLayout$c$1(MPVideoWriteCommentLayout.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15293);
    MPVideoWriteCommentLayout.b(this.jYo.jYh).aYS();
    MPVideoWriteCommentLayout.b(this.jYo.jYh).postInvalidate();
    MPVideoWriteCommentLayout.c(this.jYo.jYh).postInvalidate();
    AppMethodBeat.o(15293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.c.1
 * JD-Core Version:    0.6.2
 */