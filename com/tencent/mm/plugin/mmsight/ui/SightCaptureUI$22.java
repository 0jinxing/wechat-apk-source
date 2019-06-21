package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$22
  implements View.OnClickListener
{
  SightCaptureUI$22(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55219);
    if (SightCaptureUI.g(this.oDf) == 3)
    {
      SightCaptureUI.h(this.oDf);
      AppMethodBeat.o(55219);
    }
    while (true)
    {
      return;
      if (SightCaptureUI.g(this.oDf) == 4)
        SightCaptureUI.i(this.oDf);
      AppMethodBeat.o(55219);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.22
 * JD-Core Version:    0.6.2
 */