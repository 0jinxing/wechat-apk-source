package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class y$2
  implements b
{
  public final void e(Exception paramException)
  {
    AppMethodBeat.i(16671);
    ab.e("MiroMsg.NotificationUtil", "Load plugin failed");
    AppMethodBeat.o(16671);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.y.2
 * JD-Core Version:    0.6.2
 */