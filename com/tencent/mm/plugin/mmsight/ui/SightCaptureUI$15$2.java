package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$15$2
  implements Runnable
{
  SightCaptureUI$15$2(SightCaptureUI.15 param15)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55203);
    Toast.makeText(this.oDl.oDf, 2131301447, 1).show();
    this.oDl.oDf.Ne(8);
    SightCaptureUI.H(this.oDl.oDf).setVisibility(0);
    SightCaptureUI.R(this.oDl.oDf).setVisibility(0);
    SightCaptureUI.S(this.oDl.oDf).setVisibility(0);
    AppMethodBeat.o(55203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.15.2
 * JD-Core Version:    0.6.2
 */