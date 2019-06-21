package com.tencent.mm.plugin.freewifi.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FreeWifiCopyPwdUI$4 extends ak
{
  FreeWifiCopyPwdUI$4(FreeWifiCopyPwdUI paramFreeWifiCopyPwdUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(20939);
    paramMessage = (FreeWifiCopyPwdUI.b)paramMessage.obj;
    if (paramMessage.myJ == FreeWifiCopyPwdUI.b(this.myE))
    {
      FreeWifiCopyPwdUI.a(this.myE, paramMessage.data);
      AppMethodBeat.o(20939);
    }
    while (true)
    {
      return;
      FreeWifiCopyPwdUI.b(this.myE, paramMessage.data);
      AppMethodBeat.o(20939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI.4
 * JD-Core Version:    0.6.2
 */