package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class k$3
  implements ao.b.a
{
  k$3(k paramk)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23568);
    ab.i("MicroMsg.ContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramString, this.pno.ejD, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      aw.ZK();
      paramString = c.XM().aoO(paramString).Oi();
      this.pno.fE(this.pno.ctQ, paramString);
    }
    AppMethodBeat.o(23568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.3
 * JD-Core Version:    0.6.2
 */