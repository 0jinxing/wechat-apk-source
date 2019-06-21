package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.by;
import com.tencent.mm.sdk.platformtools.al;

final class c$1
  implements b
{
  c$1(c paramc, by paramby, ProgressDialog paramProgressDialog, Context paramContext)
  {
  }

  public final void tL(int paramInt)
  {
    AppMethodBeat.i(18928);
    this.kHO.aax();
    al.d(new c.1.1(this, paramInt));
    AppMethodBeat.o(18928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.1
 * JD-Core Version:    0.6.2
 */