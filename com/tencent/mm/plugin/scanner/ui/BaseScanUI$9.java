package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class BaseScanUI$9 extends ak
{
  BaseScanUI$9(BaseScanUI paramBaseScanUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(138463);
    if ((paramMessage != null) && (paramMessage.what == 1))
      if ((BaseScanUI.p(this.qbV) == null) || (BaseScanUI.q(this.qbV) == null) || ((BaseScanUI.b(this.qbV)) && (!BaseScanUI.c(this.qbV))))
        AppMethodBeat.o(138463);
    while (true)
    {
      return;
      if ((BaseScanUI.i(this.qbV) == null) || (BaseScanUI.i(this.qbV).cgQ() <= 0))
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "startAnimHandler scanMode == null");
        this.qbV.cgZ();
        AppMethodBeat.o(138463);
      }
      else
      {
        BaseScanUI.p(this.qbV).setVisibility(0);
        BaseScanUI.q(this.qbV).setRepeatCount(-1);
        BaseScanUI.q(this.qbV).setDuration(2600L);
        BaseScanUI.p(this.qbV).startAnimation(BaseScanUI.q(this.qbV));
        AppMethodBeat.o(138463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.9
 * JD-Core Version:    0.6.2
 */