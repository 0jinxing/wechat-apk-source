package com.tencent.mm.plugin.story.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.CaptureView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryCaptureUI$f$a
  implements Runnable
{
  StoryCaptureUI$f$a(StoryCaptureUI.f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138849);
    CaptureView localCaptureView = StoryCaptureUI.c(this.seJ.seH);
    if (localCaptureView != null)
    {
      localCaptureView.setVisibility(8);
      AppMethodBeat.o(138849);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138849);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCaptureUI.f.a
 * JD-Core Version:    0.6.2
 */