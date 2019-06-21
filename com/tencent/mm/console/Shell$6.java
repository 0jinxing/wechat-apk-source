package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$6
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16114);
    ae.git = paramIntent.getBooleanExtra("value", false);
    ab.w("MicroMsg.Shell", "kiro set Test.forceCDNTrans=%b", new Object[] { Boolean.valueOf(ae.git) });
    AppMethodBeat.o(16114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.6
 * JD-Core Version:    0.6.2
 */