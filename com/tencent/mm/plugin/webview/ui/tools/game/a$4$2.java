package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4$2
  implements Runnable
{
  a$4$2(a.4 param4, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8651);
    int i = this.uDl.uDk.uDb.cWF();
    this.val$result.putInt("height", i);
    AppMethodBeat.o(8651);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.4.2
 * JD-Core Version:    0.6.2
 */