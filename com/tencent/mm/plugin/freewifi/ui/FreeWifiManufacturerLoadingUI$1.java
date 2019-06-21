package com.tencent.mm.plugin.freewifi.ui;

import android.os.Message;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FreeWifiManufacturerLoadingUI$1 extends ak
{
  int i = 0;

  FreeWifiManufacturerLoadingUI$1(FreeWifiManufacturerLoadingUI paramFreeWifiManufacturerLoadingUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(21008);
    if (paramMessage.what == 1)
    {
      if (this.i >= FreeWifiManufacturerLoadingUI.a(this.mzG).length)
        this.i = 0;
      FreeWifiManufacturerLoadingUI.b(this.mzG).setImageResource(FreeWifiManufacturerLoadingUI.a(this.mzG)[this.i]);
      this.i += 1;
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(21008);
      return;
      if (paramMessage.what == 2)
        FreeWifiManufacturerLoadingUI.b(this.mzG).setImageResource(FreeWifiManufacturerLoadingUI.a(this.mzG)[(FreeWifiManufacturerLoadingUI.a(this.mzG).length - 1)]);
      else if ((paramMessage.what == 3) && (paramMessage.obj != null) && ((paramMessage.obj instanceof String)))
        FreeWifiManufacturerLoadingUI.c(this.mzG).setText(paramMessage.obj.toString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI.1
 * JD-Core Version:    0.6.2
 */