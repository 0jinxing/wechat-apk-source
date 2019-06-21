package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$9
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16117);
    ae.giC = paramIntent.getStringExtra("errmsg");
    ab.w("MicroMsg.Shell", "tiger set tigerIDCErrMsg =%s", new Object[] { ae.giC });
    AppMethodBeat.o(16117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.9
 * JD-Core Version:    0.6.2
 */