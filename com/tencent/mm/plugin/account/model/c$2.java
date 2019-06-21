package com.tencent.mm.plugin.account.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class c$2
  implements Runnable
{
  c$2(c paramc, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124672);
    if (this.gyI.tipDialog != null)
      this.gyI.tipDialog.setMessage(this.gyI.context.getString(2131296966) + this.gyJ + "%");
    AppMethodBeat.o(124672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.c.2
 * JD-Core Version:    0.6.2
 */