package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$4
  implements View.OnClickListener
{
  SightCaptureUI$4(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55183);
    if (!SightCaptureUI.w(this.oDf))
      AppMethodBeat.o(55183);
    while (true)
    {
      return;
      this.oDf.finish();
      this.oDf.overridePendingTransition(-1, 2131034259);
      AppMethodBeat.o(55183);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.4
 * JD-Core Version:    0.6.2
 */