package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b;

final class SightCaptureUI$3
  implements View.OnClickListener
{
  SightCaptureUI$3(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55182);
    if (SightCaptureUI.v(this.oDf) != null)
      SightCaptureUI.v(this.oDf).Mm();
    SightCaptureUI.s(this.oDf);
    SightCaptureUI.a(this.oDf, true);
    AppMethodBeat.o(55182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.3
 * JD-Core Version:    0.6.2
 */