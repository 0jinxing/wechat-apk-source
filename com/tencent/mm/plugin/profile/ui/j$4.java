package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
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

final class j$4 extends ak
{
  j$4(boolean paramBoolean, Context paramContext)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(23551);
    if (this.kRo)
      j.jQ(true);
    int i = r.YK();
    if (this.kRo)
      i &= -17;
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
        j.eI(this.val$context);
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(23551);
      return;
      i |= 16;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.j.4
 * JD-Core Version:    0.6.2
 */