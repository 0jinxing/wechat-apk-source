package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$10
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16118);
    ae.giD = paramIntent.getStringExtra("acc");
    ae.giE = paramIntent.getStringExtra("pass");
    ab.w("MicroMsg.Shell", "dkwt shell [%s %s]", new Object[] { ae.giD, ae.giE });
    AppMethodBeat.o(16118);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.10
 * JD-Core Version:    0.6.2
 */