package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class i$1 extends ak
{
  i$1(i parami)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(81154);
    if ((paramMessage != null) && (paramMessage.what == 1) && (this.qex.iqU != null))
      this.qex.iqU.setVisibility(0);
    AppMethodBeat.o(81154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.i.1
 * JD-Core Version:    0.6.2
 */