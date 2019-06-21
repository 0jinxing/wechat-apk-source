package com.tencent.mm.plugin.profile.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.p;

final class n$2 extends ak
{
  n$2(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(23602);
    int i = r.YK();
    if (this.kRo)
    {
      i &= -33554433;
      aw.ZK();
      c.Ry().set(34, Integer.valueOf(i));
      paramMessage = new bko();
      paramMessage.vCi = 33554432;
      if (!this.kRo)
        break label119;
    }
    label119: for (i = 0; ; i = 1)
    {
      paramMessage.wNJ = i;
      aw.ZK();
      c.XL().c(new j.a(39, paramMessage));
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(23602);
      return;
      i |= 33554432;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.n.2
 * JD-Core Version:    0.6.2
 */