package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$8
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16116);
    ae.giy = paramIntent.getIntExtra("value", 0);
    ab.w("MicroMsg.Shell", "dkdnstd set Test.netDnsSimulateFault=%s", new Object[] { Integer.toBinaryString(ae.giy) });
    AppMethodBeat.o(16116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.8
 * JD-Core Version:    0.6.2
 */