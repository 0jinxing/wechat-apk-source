package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bko;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;

final class b$3 extends ak
{
  b$3(boolean paramBoolean, Context paramContext)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76788);
    if (this.kRo)
      b.kc(true);
    int i = r.YK();
    if (this.kRo)
    {
      i &= -524289;
      com.tencent.mm.kernel.g.RP().Ry().set(34, Integer.valueOf(i));
      paramMessage = new bko();
      paramMessage.vCi = 524288;
      if (!this.kRo)
        break label173;
    }
    label173: for (i = 0; ; i = 1)
    {
      paramMessage.wNJ = i;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(39, paramMessage));
      if (!this.kRo)
      {
        com.tencent.mm.plugin.readerapp.c.g.a(new b.3.1(this, h.b(this.val$context, this.val$context.getString(2131302140), false, null)));
        b.kc(false);
      }
      if (this.ooo != null)
        this.ooo.a(null, null);
      AppMethodBeat.o(76788);
      return;
      i |= 524288;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.b.3
 * JD-Core Version:    0.6.2
 */