package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/ui/view/CaptureView$hideGuideView$1$1"})
final class CaptureView$e
  implements Runnable
{
  CaptureView$e(g paramg, CaptureView paramCaptureView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110305);
    this.sij.removeView((View)this.sik);
    CaptureView.g(this.sij);
    AppMethodBeat.o(110305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView.e
 * JD-Core Version:    0.6.2
 */