package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.z;

final class g$1
  implements ap.a
{
  g$1(boolean paramBoolean, com.tencent.mm.ui.base.p paramp)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(23520);
    int i = r.YK();
    if (this.kRo)
      i &= -32769;
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
        g.clearData();
      if (this.ooo != null)
        this.ooo.a(null, null);
      if (this.oop != null)
        this.oop.dismiss();
      AppMethodBeat.o(23520);
      return true;
      i |= 32768;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.g.1
 * JD-Core Version:    0.6.2
 */