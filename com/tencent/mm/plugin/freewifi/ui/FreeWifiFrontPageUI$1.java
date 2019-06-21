package com.tencent.mm.plugin.freewifi.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FreeWifiFrontPageUI$1 extends ak
{
  FreeWifiFrontPageUI$1(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(20959);
    paramMessage = (FreeWifiFrontPageUI.c)paramMessage.obj;
    switch (FreeWifiFrontPageUI.3.mzf[paramMessage.mzd.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(20959);
      while (true)
      {
        return;
        this.mze.bzK();
        AppMethodBeat.o(20959);
        continue;
        this.mze.bzL();
        AppMethodBeat.o(20959);
        continue;
        this.mze.bS(paramMessage.data);
        AppMethodBeat.o(20959);
      }
      this.mze.bT(paramMessage.data);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.1
 * JD-Core Version:    0.6.2
 */