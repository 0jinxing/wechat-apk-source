package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$2
  implements View.OnClickListener
{
  SightCaptureUI$2(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55181);
    if (SightCaptureUI.g(this.oDf) == 4)
    {
      SightCaptureUI.t(this.oDf);
      AppMethodBeat.o(55181);
    }
    while (true)
    {
      return;
      if (SightCaptureUI.g(this.oDf) == 3)
      {
        SightCaptureUI.u(this.oDf);
        SightCaptureUI.a(this.oDf, false);
      }
      AppMethodBeat.o(55181);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.2
 * JD-Core Version:    0.6.2
 */