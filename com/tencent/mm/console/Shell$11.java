package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$11
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16119);
    ae.gjf = paramIntent.getIntExtra("flag", 0);
    ab.w("MicroMsg.Shell", "dkwt shell [%d]", new Object[] { Integer.valueOf(ae.gjf) });
    AppMethodBeat.o(16119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.11
 * JD-Core Version:    0.6.2
 */