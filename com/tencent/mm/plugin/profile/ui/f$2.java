package com.tencent.mm.plugin.profile.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class f$2 extends ak
{
  f$2(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(23510);
    int i = r.YK();
    if (this.kRo)
      i &= -8193;
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
      {
        a.getFacebookFrdStg().apM();
        aw.ZK();
        c.Ry().set(65828, "");
        aw.ZK();
        c.XR().aoX("facebookapp");
        aw.ZK();
        c.XO().Rh("facebookapp");
      }
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(23510);
      return;
      i |= 8192;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.f.2
 * JD-Core Version:    0.6.2
 */