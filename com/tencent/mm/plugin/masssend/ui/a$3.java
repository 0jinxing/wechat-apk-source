package com.tencent.mm.plugin.masssend.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class a$3 extends ak
{
  a$3(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22756);
    int i = r.YK();
    if (this.kRo)
      i &= -65537;
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
        a.clearData();
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(22756);
      return;
      i |= 65536;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.a.3
 * JD-Core Version:    0.6.2
 */