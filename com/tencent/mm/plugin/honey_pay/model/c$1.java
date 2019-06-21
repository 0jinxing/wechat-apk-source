package com.tencent.mm.plugin.honey_pay.model;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.wallet_core.c.a;

final class c$1
  implements c.a
{
  c$1(boolean paramBoolean)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(41752);
    if (this.nqN)
      h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    while (true)
    {
      paramBundle = new Intent();
      AppMethodBeat.o(41752);
      return paramBundle;
      h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.c.1
 * JD-Core Version:    0.6.2
 */