package com.tencent.mm.plugin.shake.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class a$2 extends ak
{
  a$2(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(24690);
    int i = r.YK();
    if (this.kRo);
    for (int j = i & 0xFFFFFEFF; ; j = i | 0x100)
    {
      ab.i("MicroMsg.ContactWidgetShake", "setInstall pluginFlag install:%b  pluginFlag : %d -> %d", new Object[] { Boolean.valueOf(this.kRo), Integer.valueOf(i), Integer.valueOf(j) });
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(j));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", j, "", ""));
      if (!this.kRo)
        m.cjV();
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(24690);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.a.2
 * JD-Core Version:    0.6.2
 */