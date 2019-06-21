package com.tencent.mm.plugin.qmessage.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.qmessage.a.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class b$7 extends ak
{
  b$7(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(24108);
    b.f(64, this.kRo, 5);
    b.f(8192, this.kRo, 12);
    int i = r.YK();
    if (this.kRo)
      i &= -33;
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
        g.ccc();
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(24108);
      return;
      i |= 32;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.b.7
 * JD-Core Version:    0.6.2
 */