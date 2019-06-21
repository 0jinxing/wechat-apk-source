package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$1
  implements ap.a
{
  d$1(d paramd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(111712);
    if (d.a(this.neC) != null)
      d.a(this.neC).cancel();
    AppMethodBeat.o(111712);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.d.1
 * JD-Core Version:    0.6.2
 */