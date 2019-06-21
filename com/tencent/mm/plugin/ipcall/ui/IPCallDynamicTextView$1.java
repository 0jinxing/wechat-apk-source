package com.tencent.mm.plugin.ipcall.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class IPCallDynamicTextView$1 extends ak
{
  IPCallDynamicTextView$1(IPCallDynamicTextView paramIPCallDynamicTextView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22142);
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(22142);
      while (true)
      {
        return;
        if (((IPCallDynamicTextView.a(this.nCD) <= 0.0D) || (IPCallDynamicTextView.b(this.nCD) >= IPCallDynamicTextView.c(this.nCD))) && ((IPCallDynamicTextView.a(this.nCD) >= 0.0D) || (IPCallDynamicTextView.b(this.nCD) <= IPCallDynamicTextView.c(this.nCD))))
          break;
        IPCallDynamicTextView.a(this.nCD, true);
        IPCallDynamicTextView.a(this.nCD, IPCallDynamicTextView.b(this.nCD));
        IPCallDynamicTextView.b(this.nCD, IPCallDynamicTextView.b(this.nCD) + IPCallDynamicTextView.a(this.nCD));
        IPCallDynamicTextView.e(this.nCD).sendEmptyMessageDelayed(1, IPCallDynamicTextView.d(this.nCD));
        AppMethodBeat.o(22142);
      }
      IPCallDynamicTextView.a(this.nCD, false);
      IPCallDynamicTextView.a(this.nCD, IPCallDynamicTextView.c(this.nCD));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView.1
 * JD-Core Version:    0.6.2
 */