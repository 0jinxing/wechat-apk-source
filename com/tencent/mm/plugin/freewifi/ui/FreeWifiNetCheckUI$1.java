package com.tencent.mm.plugin.freewifi.ui;

import android.os.Message;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FreeWifiNetCheckUI$1 extends ak
{
  int i = 0;

  FreeWifiNetCheckUI$1(FreeWifiNetCheckUI paramFreeWifiNetCheckUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(21034);
    if (paramMessage.what == 1)
    {
      if (this.i >= FreeWifiNetCheckUI.a(this.mzM).length)
        this.i = 0;
      this.mzM.mzx.setImageResource(FreeWifiNetCheckUI.a(this.mzM)[this.i]);
      this.i += 1;
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(21034);
      return;
      if (paramMessage.what == 2)
        this.mzM.mzx.setImageResource(FreeWifiNetCheckUI.a(this.mzM)[(FreeWifiNetCheckUI.a(this.mzM).length - 1)]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.1
 * JD-Core Version:    0.6.2
 */