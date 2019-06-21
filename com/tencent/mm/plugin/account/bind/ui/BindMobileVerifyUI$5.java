package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class BindMobileVerifyUI$5 extends TimerTask
{
  BindMobileVerifyUI$5(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13533);
    if (BindMobileVerifyUI.c(this.gst) != null)
      BindMobileVerifyUI.d(this.gst);
    AppMethodBeat.o(13533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.5
 * JD-Core Version:    0.6.2
 */