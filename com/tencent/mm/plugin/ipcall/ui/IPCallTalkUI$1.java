package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallTalkUI$1
  implements Runnable
{
  IPCallTalkUI$1(IPCallTalkUI paramIPCallTalkUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22360);
    Intent localIntent = new Intent();
    this.nFY.setResult(-1, localIntent);
    this.nFY.finish();
    AppMethodBeat.o(22360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.1
 * JD-Core Version:    0.6.2
 */