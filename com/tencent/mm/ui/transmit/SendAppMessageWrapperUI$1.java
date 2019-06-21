package com.tencent.mm.ui.transmit;

import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SendAppMessageWrapperUI$1
  implements ap.a
{
  SendAppMessageWrapperUI$1(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(35213);
    if ((this.zKA.getWindow() == null) || (this.zKA.getWindow().getDecorView() == null) || (this.zKA.getWindow().getDecorView().getWindowToken() == null))
      if (SendAppMessageWrapperUI.a(this.zKA) < 10)
      {
        SendAppMessageWrapperUI.b(this.zKA);
        bool = true;
        AppMethodBeat.o(35213);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(35213);
      continue;
      SendAppMessageWrapperUI.c(this.zKA);
      AppMethodBeat.o(35213);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.1
 * JD-Core Version:    0.6.2
 */