package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class b$2
  implements Runnable
{
  public b$2(b paramb, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18009);
    ab.i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb closeTempDB ok");
    ab.dot();
    aw.RS().a(new b.2.1(this));
    AppMethodBeat.o(18009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.b.2
 * JD-Core Version:    0.6.2
 */