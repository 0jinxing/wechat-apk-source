package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;

final class m$3
  implements Runnable
{
  m$3(m paramm, boolean paramBoolean, ProgressDialog paramProgressDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23594);
    boolean bool = this.kRo;
    String str;
    int i;
    if (bool)
    {
      str = "3";
      bv.s(6, str);
      i = r.YK();
      if (!bool)
        break label145;
      i &= -129;
    }
    while (true)
    {
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      aw.ZK();
      c.XL().c(new k("", "", "", "", "", "", "", "", i, "", ""));
      if (!this.kRo)
      {
        bf.oD("qqsync");
        aw.ZK();
        c.XR().aoX("qqsync");
      }
      al.d(new m.3.1(this));
      AppMethodBeat.o(23594);
      return;
      str = "4";
      break;
      label145: i |= 128;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.m.3
 * JD-Core Version:    0.6.2
 */