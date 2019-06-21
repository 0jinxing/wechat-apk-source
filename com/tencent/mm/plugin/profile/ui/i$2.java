package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class i$2
  implements ap.a
{
  i$2(ProgressDialog paramProgressDialog, boolean paramBoolean)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(23538);
    if (this.kHP != null)
      this.kHP.dismiss();
    int i = r.YK();
    bko localbko;
    if (this.kRo)
    {
      i &= -16777217;
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      localbko = new bko();
      localbko.vCi = 16777216;
      if (!this.kRo)
        break label176;
    }
    label176: for (i = 0; ; i = 1)
    {
      localbko.wNJ = i;
      aw.ZK();
      c.XL().c(new j.a(39, localbko));
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(23538);
      return false;
      i |= 16777216;
      aw.ZK();
      c.Ry().set(286722, "");
      aw.ZK();
      c.Ry().set(286721, "");
      aw.ZK();
      c.Ry().set(286723, "");
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.i.2
 * JD-Core Version:    0.6.2
 */