package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$27
  implements View.OnClickListener
{
  SightCaptureUI$27(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55227);
    if (SightCaptureUI.j(this.oDf) != null)
      SightCaptureUI.d(this.oDf);
    AppMethodBeat.o(55227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.27
 * JD-Core Version:    0.6.2
 */