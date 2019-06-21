package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CaptureDecoration$a
  implements Runnable
{
  CaptureDecoration$a(CaptureDecoration paramCaptureDecoration)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2988);
    CaptureDecoration.a(this.lmI).setImageDrawable(null);
    CaptureDecoration.b(this.lmI).setVisibility(8);
    AppMethodBeat.o(2988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration.a
 * JD-Core Version:    0.6.2
 */