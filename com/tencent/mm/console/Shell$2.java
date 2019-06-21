package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

final class Shell$2
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16110);
    if (!ah.bqo())
      AppMethodBeat.o(16110);
    while (true)
    {
      return;
      String str = paramIntent.getStringExtra("sql");
      paramIntent = paramIntent.getStringExtra("file");
      if ((str != null) && (str.length() > 0))
      {
        g.RS().aa(new Shell.2.1(this, str));
        AppMethodBeat.o(16110);
      }
      else
      {
        if ((paramIntent != null) && (paramIntent.length() > 0))
          g.RS().aa(new Shell.2.2(this, paramIntent));
        AppMethodBeat.o(16110);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.2
 * JD-Core Version:    0.6.2
 */