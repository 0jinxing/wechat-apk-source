package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18927);
    if (this.kHR.kHP != null)
      this.kHR.kHP.dismiss();
    int i;
    switch (this.fLS)
    {
    case -1:
    default:
      i = 2131302211;
    case 0:
    case -2:
    case -3:
    }
    while (true)
    {
      h.g(this.kHR.val$context, i, 2131297061);
      AppMethodBeat.o(18927);
      return;
      i = 2131302215;
      continue;
      i = 2131302214;
      continue;
      i = 2131302213;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.1.1
 * JD-Core Version:    0.6.2
 */