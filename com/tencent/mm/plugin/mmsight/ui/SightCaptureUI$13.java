package com.tencent.mm.plugin.mmsight.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.sdk.platformtools.ab;

final class SightCaptureUI$13
  implements Runnable
{
  SightCaptureUI$13(SightCaptureUI paramSightCaptureUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55200);
    ab.i("MicroMsg.SightCaptureUI", "DEBUG showCameraInfoImpl: %s", new Object[] { this.oDj });
    k.bPR();
    if (!k.isDebug())
      AppMethodBeat.o(55200);
    while (true)
    {
      return;
      TextView localTextView = (TextView)this.oDf.findViewById(2131821713);
      localTextView.setVisibility(0);
      localTextView.setText(this.oDj);
      AppMethodBeat.o(55200);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.13
 * JD-Core Version:    0.6.2
 */