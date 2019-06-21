package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class k$2
  implements ao.b.a
{
  k$2(k paramk)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23567);
    ab.i("MicroMsg.ContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramString, this.pno.ejD, Boolean.valueOf(paramBoolean) });
    this.pno.pnn.dead();
    AppMethodBeat.o(23567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.2
 * JD-Core Version:    0.6.2
 */