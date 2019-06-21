package com.tencent.mm.plugin.account.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class MobileVerifyUI$1 extends TimerTask
{
  MobileVerifyUI$1(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125269);
    this.gFn.gEX.post(new MobileVerifyUI.1.1(this));
    AppMethodBeat.o(125269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.1
 * JD-Core Version:    0.6.2
 */