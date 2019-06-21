package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CaptureDecoration$b
  implements Runnable
{
  CaptureDecoration$b(CaptureDecoration paramCaptureDecoration)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2989);
    CaptureDecoration localCaptureDecoration = this.lmI;
    localCaptureDecoration.lmB.animate().cancel();
    localCaptureDecoration.lmB.animate().alpha(0.0F).withEndAction((Runnable)new CaptureDecoration.a(localCaptureDecoration));
    AppMethodBeat.o(2989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration.b
 * JD-Core Version:    0.6.2
 */