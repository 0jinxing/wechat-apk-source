package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$1
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16107);
    int i = paramIntent.getIntExtra("type", 2147483647);
    int j = paramIntent.getIntExtra("error", 0);
    if ((i == 2147483647) || (j == 0))
      AppMethodBeat.o(16107);
    while (true)
    {
      return;
      ab.w("MicroMsg.Shell", "kiro set Test.pushNextErrorRet(type=%d, err=%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      ae.cH(i, j);
      AppMethodBeat.o(16107);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.1
 * JD-Core Version:    0.6.2
 */